FROM maven:3.9.9-eclipse-temurin-21

# Ustaw zmienne środowiskowe
ENV JAVA_HOME=/opt/java/openjdk
ENV PATH="$JAVA_HOME/bin:$PATH"
ENV MAVEN_CONFIG=/home/jenkins/.m2

# Tworzenie użytkownika i katalogów
RUN useradd -m -u 121 jenkins && \
    mkdir -p /home/jenkins/.m2 && \
    chown -R jenkins:jenkins /home/jenkins

# Instalacja bibliotek Playwright
RUN apt-get update && \
    apt-get install -y --no-install-recommends \
    wget gnupg ca-certificates unzip \
    libglib2.0-0 libnss3 libnspr4 libdbus-1-3 libatk1.0-0 \
    libatk-bridge2.0-0 libcups2 libdrm2 libxkbcommon0 \
    libx11-6 libxcomposite1 libxdamage1 libxext6 libxfixes3 \
    libxrandr2 libgbm1 libpango-1.0-0 libcairo2 \
    libxshmfence1 libx11-xcb1 libxrender1 libasound2t64 \
    libxrandr2 libgtk-3-0 libgdk-pixbuf2.0-0 && \
    rm -rf /var/lib/apt/lists/*

# Instalacja Playwright (dla przeglądarek)
RUN npx --yes playwright install --with-deps

USER jenkins
WORKDIR /home/jenkins/app
