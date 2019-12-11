package com.facebook.stetho.inspector.network;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

final class AsyncPrettyPrinterExecutorHolder {
    private static ExecutorService sExecutorService;

    private AsyncPrettyPrinterExecutorHolder() {
    }

    public static void ensureInitialized() {
        if (sExecutorService == null) {
            sExecutorService = Executors.newCachedThreadPool();
        }
    }

    public static ExecutorService getExecutorService() {
        return sExecutorService;
    }

    public static void shutdown() {
        sExecutorService.shutdown();
        sExecutorService = null;
    }
}
