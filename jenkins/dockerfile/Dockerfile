FROM maven:3.9.9-eclipse-temurin-21

LABEL maintainer="Mirosław Dyduch"

# Instalacja brakujących bibliotek Playwright jako root
USER root
RUN apt-get update && apt-get install -y --no-install-recommends \
    libglib2.0-0 libnss3 libnspr4 libdbus-1-3 libatk1.0-0 \
    libatk-bridge2.0-0 libcups2 libdrm2 libxcb1 libxkbcommon0 \
    libatspi2.0-0 libx11-6 libxcomposite1 libxdamage1 libxext6 \
    libxfixes3 libxrandr2 libgbm1 libpango-1.0-0 libcairo2 \
    libasound2t64 libxshmfence1 libx11-xcb1 libxcursor1 libxi6 \
    libgtk-3-0 libgdk-pixbuf2.0-0 libxrender1 libdbus-glib-1-2 \
    libgstreamer1.0-0 libgstreamer-plugins-base1.0-0 libgstreamer-gl1.0-0 \
    libgstreamer-plugins-bad1.0-0 gstreamer1.0-libav \
    libwebpdemux2 libharfbuzz-icu0 libenchant-2-2 libsecret-1-0 \
    libhyphen0 libmanette-0.2-0 libflite1 libgles2 && \
    rm -rf /var/lib/apt/lists/*

# Wracamy do nie-rootowego użytkownika (z bezpieczeństwem)
USER 1000:1000
WORKDIR /workspace

ENTRYPOINT ["bash"]
