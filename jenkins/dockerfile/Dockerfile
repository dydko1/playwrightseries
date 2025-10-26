# --- Base image with Maven and Java 21 ---
FROM maven:3.9.9-eclipse-temurin-21

LABEL maintainer="Miroslaw Dyduch <miroslaw.dyduch@gmail.com>"
LABEL description="Maven + Node.js + Playwright + Allure-ready Jenkins agent"

# --- Install dependencies ---
RUN apt-get update && apt-get install -y --no-install-recommends \
        curl gnupg ca-certificates apt-transport-https software-properties-common \
        libglib2.0-0 libnss3 libnspr4 libdbus-1-3 \
        libatk1.0-0 libatk-bridge2.0-0 libcups2 \
        libdrm2 libxcb1 libxkbcommon0 libatspi2.0-0 \
        libx11-6 libxcomposite1 libxdamage1 libxext6 \
        libxfixes3 libxrandr2 libgbm1 libpango-1.0-0 \
        libcairo2 libasound2t64 libxshmfence1 \
        libx11-xcb1 libxcursor1 libxi6 libgtk-3-0 \
        libgdk-pixbuf2.0-0 libxrender1 libdbus-glib-1-2 \
        fonts-liberation libxss1 wget xdg-utils && \
    rm -rf /var/lib/apt/lists/*

# --- Install Node.js 20 LTS + npm ---
RUN curl -fsSL https://deb.nodesource.com/setup_20.x | bash - && \
    apt-get install -y nodejs && \
    npm install -g npm@latest

# --- Install Playwright CLI and browsers ---
RUN npm install -g playwright && \
    playwright install --with-deps

# --- Set working directory ---
WORKDIR /app

CMD ["bash"]
