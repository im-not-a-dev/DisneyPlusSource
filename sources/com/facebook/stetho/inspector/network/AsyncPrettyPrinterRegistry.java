package com.facebook.stetho.inspector.network;

import java.util.HashMap;
import java.util.Map;

public class AsyncPrettyPrinterRegistry {
    private final Map<String, AsyncPrettyPrinterFactory> mRegistry = new HashMap();

    public synchronized AsyncPrettyPrinterFactory lookup(String str) {
        return (AsyncPrettyPrinterFactory) this.mRegistry.get(str);
    }

    public synchronized void register(String str, AsyncPrettyPrinterFactory asyncPrettyPrinterFactory) {
        this.mRegistry.put(str, asyncPrettyPrinterFactory);
    }

    public synchronized boolean unregister(String str) {
        return this.mRegistry.remove(str) != null;
    }
}
