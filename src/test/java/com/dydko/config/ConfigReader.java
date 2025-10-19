package com.dydko.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private static final Properties props = new Properties();

    static {
        try (InputStream input = ConfigReader.class
                .getClassLoader()
                .getResourceAsStream("config.properties")) {
            if (input != null) {
                props.load(input);
            } else {
                System.err.println("⚠️ config.properties not found in classpath");
            }
        } catch (IOException e) {
            throw new RuntimeException("Error loading config.properties", e);
        }
    }

    public static String get(String key) {
        return System.getProperty(key, props.getProperty(key));
    }

    public static boolean getBoolean(String key) {
        return Boolean.parseBoolean(get(key));
    }

    public static int getInt(String key) {
        return Integer.parseInt(get(key));
    }
}
