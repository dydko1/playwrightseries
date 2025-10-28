# ================================
#  BASE IMAGE: Maven + Java 21
# ================================
FROM maven:3.9.9-eclipse-temurin-21

# ================================
#  Ustawienia środowiska
# ================================
ENV DEBIAN_FRONTEND=noninteractive
ENV JAVA_HOME=/opt/java/openjdk
ENV PATH=$PATH:$JAVA_HOME/bin

# ================================
#  Utwórz użytkownika Jenkins i katalogi
# ================================
RUN groupadd -g 125 jenkins && \
    useradd -m -u 121 -g 125 -s /bin/bash jenkins && \
    mkdir -p /home/jenkins/.m2 && \
    chown -R jenkins:jenkins /home/jenkins

# Maven cache
ENV MAVEN_CONFIG=/home/jenkins/.m2

# ================================
#  Instalacja Playwright i zależności
# ================================
RUN apt-get update && \
    apt-get install -y --no-install-recommends \
    wget gnupg ca-certificates unzip curl \
    libglib2.0-0 libnss3 libnspr4 libdbus-1-3 libatk1.0-0 \
    libatk-bridge2.0-0 libcups2 libdrm2 libxkbcommon0 \
    libatspi2.0-0 libx11-6 libxcomposite1 libxdamage1 \
    libxext6 libxfixes3 libxrandr2 libgbm1 libpango-1.0-0 \
    libcairo2 libasound2t64 libxshmfence1 libx11-xcb1 \
    libxi6 libxcursor1 libxss1 libgtk-3-0 libxrender1 \
    libgdk-pixbuf2.0-0 libdbus-glib-1-2 && \
    # instalacja Node.js i Playwright
    curl -fsSL https://deb.nodesource.com/setup_20.x | bash - && \
    apt-get install -y nodejs && \
    npm install -g playwright && \
    npx playwright install --with-deps && \
    rm -rf /var/lib/apt/lists/*

# ================================
#  Ustaw użytkownika
# ================================
USER jenkins
WORKDIR /home/jenkins/app

# ================================
#  Domyślny punkt wejścia
# ================================
CMD ["bash"]
