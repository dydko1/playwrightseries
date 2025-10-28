FROM maven:3.9.9-eclipse-temurin-21

ENV JAVA_HOME=/opt/java/openjdk
ENV PATH="$JAVA_HOME/bin:$PATH"
ENV MAVEN_CONFIG=/home/jenkins/.m2
# (opcjonalnie) gdzie mają leżeć przeglądarki Playwright
ENV PLAYWRIGHT_BROWSERS_PATH=/ms-playwright

# Użytkownik i katalogi
RUN useradd -m -u 121 jenkins && \
    mkdir -p /home/jenkins/.m2 /ms-playwright && \
    chown -R jenkins:jenkins /home/jenkins /ms-playwright

# Systemowe zależności + Node.js 20 LTS (żeby mieć npm/npx)
RUN apt-get update && apt-get install -y --no-install-recommends \
    curl ca-certificates gnupg unzip wget \
    libglib2.0-0 libnss3 libnspr4 libdbus-1-3 libatk1.0-0 \
    libatk-bridge2.0-0 libcups2 libdrm2 libxkbcommon0 \
    libx11-6 libxcomposite1 libxdamage1 libxext6 libxfixes3 \
    libxrandr2 libgbm1 libpango-1.0-0 libcairo2 \
    libxshmfence1 libx11-xcb1 libxrender1 libasound2t64 \
    libgtk-3-0 libgdk-pixbuf2.0-0 \
 && curl -fsSL https://deb.nodesource.com/setup_20.x | bash - \
 && apt-get install -y --no-install-recommends nodejs \
 && rm -rf /var/lib/apt/lists/*

# Instalacja przeglądarek Playwright
RUN npx --yes playwright install --with-deps

USER jenkins
WORKDIR /home/jenkins/app
