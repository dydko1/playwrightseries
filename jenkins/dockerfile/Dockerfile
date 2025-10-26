# --- Bazowy obraz z Maven + JDK 21 (temurin to OpenJDK od Eclipse)
FROM maven:3.9.9-eclipse-temurin-21

LABEL maintainer="Miroslaw Dyduch <miroslaw.dyduch@gmail.com>"
LABEL description="Custom Maven + Playwright Docker image for Jenkins CI/CD"

# --- Instalacja zależności Playwrighta (Linux dependencies)
USER root
RUN apt-get update && \
    apt-get install -y --no-install-recommends \
    libglib2.0-0 libnss3 libnspr4 libdbus-1-3 libatk1.0-0 \
    libatk-bridge2.0-0 libcups2 libdrm2 libxcb1 libxkbcommon0 \
    libatspi2.0-0 libx11-6 libxcomposite1 libxdamage1 libxext6 \
    libxfixes3 libxrandr2 libgbm1 libpango-1.0-0 libcairo2 \
    libasound2t64 libxshmfence1 libx11-xcb1 libxcursor1 libxi6 \
    libgtk-3-0 libgdk-pixbuf2.0-0 libxrender1 libdbus-glib-1-2 \
    fonts-liberation libjpeg-turbo8 libxss1 libx11-data && \
    rm -rf /var/lib/apt/lists/*

# --- Ustawienia środowiska Javy i Maven cache dla użytkownika Jenkins
ENV JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
ENV PATH=$JAVA_HOME/bin:$PATH
ENV MAVEN_CONFIG=/home/jenkins/.m2

# --- Utwórz użytkownika Jenkins i katalogi robocze
RUN mkdir -p /home/jenkins/.m2 && \
    groupadd -g 125 jenkins && \
    useradd -m -u 121 -g 125 -s /bin/bash jenkins && \
    chown -R jenkins:jenkins /home/jenkins

USER jenkins
WORKDIR /home/jenkins

# --- Instalacja przeglądarek Playwrighta
RUN mvn -q exec:java \
    -Dexec.mainClass=com.microsoft.playwright.CLI \
    -Dexec.args="install --with-deps"

# --- Informacja dla logów CI
RUN java -version && mvn -v

# --- Punkt startowy dla kontenera
CMD ["bash"]
