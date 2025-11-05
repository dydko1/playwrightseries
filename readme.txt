mvn clean test -Dheadless=true nie ma przegladarki
mvn clean test -Dheadless=false jest przegladarka

to jest OK
mvn clean test -Dheadless=false -DrecordVideo=false

nie ma rownolglosci to potem nie problem

allure serve target/allure-results

chatgpt "Jenkins Playwright K8s problem rozwiazany"

Windows host
└── VirtualBox (Ubuntu 25)
    ├── Docker + Jenkins
    ├── MicroK8s (local cluster)
    ├── Image: dydko/maven-playwright:full
    └── Mounted volume:
        /var/snap/microk8s/common/playwrightseries
🧰 Kluczowe pliki
🐳 DockerfileFull
Zawiera kompletny build środowiska:

Java 21, Maven 3.9.9

Node 20 + Playwright 1.56 z przeglądarkami (Chromium, Firefox, WebKit)

Allure + FFmpeg + utils

Domyślny użytkownik jenkins

⚙️ JenkinsfileAgentDockerFull
Pipeline:

Klonuje repozytorium z GitHub.

Uruchamia testy Playwrighta (mvn clean test -DrecordVideo=true).

Archiwizuje raporty i artefakty (video, HTML Allure).

Przechowuje wyniki w Jenkinsie.

☸️ playwright-pod.yaml
Manifest K8s uruchamiający testy:

yaml
Skopiuj kod
apiVersion: v1
kind: Pod
metadata:
  name: playwright-test
spec:
  containers:
    - name: playwright
      image: dydko/maven-playwright:full
      command: ["/bin/bash", "-c"]
      args:
        - |
          echo "🚀 Running tests..."
          git clone -b feature/k8pocplaywright https://github.com/dydko1/playwrightseries.git /home/jenkins/app
          cd /home/jenkins/app
          mvn clean test -Dheadless=true -DrecordVideo=true
          echo "✅ Done! Pod stays alive for inspection."
          sleep 3600
      volumeMounts:
        - name: project
          mountPath: /home/jenkins/app
  volumes:
    - name: project
      hostPath:
        path: /var/snap/microk8s/common/playwrightseries
        type: DirectoryOrCreate
  restartPolicy: Never
▶️ Uruchomienie testów
1️⃣ Uruchom MicroK8s
bash
Skopiuj kod
sudo microk8s start
2️⃣ Załaduj pod
bash
Skopiuj kod
microk8s kubectl apply -f playwright-pod.yaml
microk8s kubectl get pods
3️⃣ Wejdź do kontenera
bash
Skopiuj kod
microk8s kubectl exec -it playwright-test -- bash
4️⃣ Uruchom testy ręcznie (jeśli potrzeba)
bash
Skopiuj kod
cd /home/jenkins/app
mvn clean test
📊 Raporty i wideo
Po zakończeniu testów:

bash
Skopiuj kod
cd target/
allure serve allure-results
Raport otworzy się na http://127.0.0.1:port/.

Filmy Playwrighta znajdują się w target/videos.

💡 Uwagi
Mount point /var/snap/microk8s/common/playwrightseries zapewnia współdzielenie danych z hostem.

Jenkins może działać niezależnie – build i raporty są kompatybilne.

Możesz rozwinąć konfigurację o Helm Chart lub PersistentVolumeClaim.