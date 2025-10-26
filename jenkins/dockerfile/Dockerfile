# ==========================================================
# 🧩 Base image: Maven + JDK 21 + Playwright + Allure CLI
# Author: Mirosław Dyduch (github.com/dydko1)
# ==========================================================

FROM maven:3.9.9-eclipse-temurin-21

LABEL maintainer="Miroslaw Dyduch <miroslaw.dyduch@gmail.com>"
LABEL description="Maven + Playwright + Allure CLI image for Jenkins pipelines"

# ----------------------------------------------------------
# 🧰 Update system & install dependencies required by Playwright browsers
# ----------------------------------------------------------
USER root

RUN apt-get update && \
    apt-get install -y --no-install-recommends \
        wget unzip git curl ca-certificates \
        libglib2.0-0 libnss3 libnspr4 libdbus-1-3 libatk1.0-0 \
        libatk-bridge2.0-0 libcups2 libdrm2 libxcb1 libxkbcommon0 \
        libatspi2.0-0 libx11-6 libxcomposite1 libxdamage1 libxext6 \
        libxfixes3 libxrandr2 libgbm1 libpango-1.0-0 libcairo2 \
        libasound2t64 libxshmfence1 libx11-xcb1 libxcursor1 libxi6 \
        libgtk-3-0 libgdk-pixbuf2.0-0 libxrender1 libdbus-glib-1-2 && \
    apt-get clean && rm -rf /var/lib/apt/lists/*

# ----------------------------------------------------------
# 🧩 Create Jenkins-compatible user and Maven cache directory
# ----------------------------------------------------------
RUN mkdir -p /home/jenkins/.m2 && \
    chown -R 121:125 /home/jenkins
ENV MAVEN_CONFIG=/home/jenkins/.m2

# ----------------------------------------------------------
# 🎭 Install Playwright browsers
# ----------------------------------------------------------
RUN mvn exec:java \
    -D exec.mainClass=com.microsoft.playwright.CLI \
    -D exec.args="install-deps" -B && \
    mvn exec:java \
    -D exec.mainClass=com.microsoft.playwright.CLI \
    -D exec.args="install" -B || true

# ----------------------------------------------------------
# 📊 Install Allure CLI
# ----------------------------------------------------------
RUN wget -qO- https://github.com/allure-framework/allure2/releases/download/2.35.1/allure-2.35.1.tgz | \
    tar -xz -C /opt/ && \
    ln -s /opt/allure-2.35.1/bin/allure /usr/local/bin/allure && \
    allure --version

# ----------------------------------------------------------
# ⚙️ Switch to Jenkins user (non-root)
# ----------------------------------------------------------
USER 121:125
WORKDIR /home/jenkins

# ----------------------------------------------------------
# ✅ Default command
# ----------------------------------------------------------
CMD ["mvn", "--version"]
