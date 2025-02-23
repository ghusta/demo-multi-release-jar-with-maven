package org.example;

import org.example.threads.VirtualThreadDelegate;

public class App {

    public static void main(String[] args) {
        System.out.println("Running on " + new DefaultVersion().version());

        VirtualThreadDelegate virtualThreadDelegate = new VirtualThreadDelegate();
        virtualThreadDelegate.newVirtualThread("x", () -> System.out.println("DONE")).start();
    }

}