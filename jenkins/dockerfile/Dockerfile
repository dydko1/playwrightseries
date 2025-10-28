# ==========================
# Base image: Maven + Java 21 + Playwright
# ==========================
FROM maven:3.9.9-eclipse-temurin-21

# Ustaw użytkownika roboczego (unikamy roota)
RUN useradd -m -u 121 jenkins

# Ustaw katalog roboczy
WORKDIR /home/jenkins/app

# Skopiuj Playwright dependencies
RUN apt-get update && \
    apt-get install -y --no-install-recommends \
    wget gnupg ca-certificates unzip \
    libglib2.0-0 libnss3 libnspr4 libdbus-1-3 \
    libatk1.0-0 libatk-bridge2.0-0 libcups2 \
    libdrm2 libxcb1 libxkbcommon0 libatspi2.0-0 \
    libx11-6 libxcomposite1 libxdamage1 libxext6 \
    libxfixes3 libxrandr2 libgbm1 libpango-1.0-0 \
    libcairo2 libasound2 libxshmfence1 libx11-xcb1 \
    libxcursor1 libxi6 libgtk-3-0 libgdk-pixbuf2.0-0 \
    libxrender1 libdbus-glib-1-2 && \
    rm -rf /var/lib/apt/lists/*

# Instalacja Playwright (dla wszystkich przeglądarek)
RUN npx playwright install --with-deps

# Konfiguracja Maven cache i uprawnień
RUN mkdir -p /home/jenkins/.m2 && chown -R jenkins:jenkins /home/jenkins
ENV MAVEN_CONFIG=/home/jenkins/.m2

# Konfiguracja Javy (naprawa JAVA_HOME)
ENV JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
ENV PATH=$JAVA_HOME/bin:$PATH

# Przełącz użytkownika
USER jenkins

# Domyślny punkt wejścia
CMD ["bash"]
