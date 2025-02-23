package org.example;

public class DefaultVersion {

    public String version() {
        // Before Java 9
        return System.getProperty("java.version");
    }

}
