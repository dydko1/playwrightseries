# ===== Base image with Java 21 and Maven =====
FROM maven:3.9.9-eclipse-temurin-21

# ===== System dependencies for Playwright browsers =====
RUN apt-get update && apt-get install -y --no-install-recommends \
    libglib2.0-0 libnss3 libnspr4 libdbus-1-3 libatk1.0-0 \
    libatk-bridge2.0-0 libcups2 libdrm2 libxcb1 libxkbcommon0 \
    libatspi2.0-0 libx11-6 libxcomposite1 libxdamage1 libxext6 \
    libxfixes3 libxrandr2 libgbm1 libpango-1.0-0 libcairo2 \
    libasound2t64 libxshmfence1 libx11-xcb1 libxcursor1 libxi6 \
    libgtk-3-0 libgdk-pixbuf2.0-0 libxrender1 libdbus-glib-1-2 \
    libatomic1 libxslt1.1 libwoff1 libevent-2.1-7t64 curl npm && \
    rm -rf /var/lib/apt/lists/*

# ===== Install Playwright CLI + dependencies =====
RUN npm install -g playwright && \
    playwright install --with-deps

# ===== Maven local repo for Jenkins user =====
RUN mkdir -p /home/jenkins/.m2 && chown -R 121:125 /home/jenkins
ENV MAVEN_CONFIG=/home/jenkins/.m2

# ===== Set working directory =====
WORKDIR /home/jenkins

# ===== Verify installation =====
RUN java -version && mvn -v && node -v && playwright --version
