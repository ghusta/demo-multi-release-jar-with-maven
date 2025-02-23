package org.example.threads;

import java.util.concurrent.ThreadFactory;

public class VirtualThreadDelegate {

    private final Thread.Builder threadBuilder = Thread.ofVirtual();

    public VirtualThreadDelegate() {
        System.out.println("Using version for Java 21");
    }

    public ThreadFactory virtualThreadFactory() {
        return this.threadBuilder.factory();
    }

    public ThreadFactory virtualThreadFactory(String threadNamePrefix) {
        return this.threadBuilder.name(threadNamePrefix, 0L).factory();
    }

    public Thread newVirtualThread(String name, Runnable task) {
        return this.threadBuilder.name(name).unstarted(task);
    }

}
