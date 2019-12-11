package com.facebook.stetho.server;

import com.facebook.stetho.common.LogUtil;
import java.io.IOException;

public class ServerManager {
    private static final String THREAD_PREFIX = "StethoListener";
    private final LocalSocketServer mServer;
    private volatile boolean mStarted;

    public ServerManager(LocalSocketServer localSocketServer) {
        this.mServer = localSocketServer;
    }

    private void startServer(final LocalSocketServer localSocketServer) {
        StringBuilder sb = new StringBuilder();
        sb.append("StethoListener-");
        sb.append(localSocketServer.getName());
        new Thread(sb.toString()) {
            public void run() {
                try {
                    localSocketServer.run();
                } catch (IOException e) {
                    LogUtil.m24846e(e, "Could not start Stetho server: %s", localSocketServer.getName());
                }
            }
        }.start();
    }

    public void start() {
        if (!this.mStarted) {
            this.mStarted = true;
            startServer(this.mServer);
            return;
        }
        throw new IllegalStateException("Already started");
    }
}
