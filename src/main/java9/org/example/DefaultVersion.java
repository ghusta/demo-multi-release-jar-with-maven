package org.example;

public class DefaultVersion {

    public String version() {
        // As of Java 9
        return Runtime.version().toString();
    }

}
