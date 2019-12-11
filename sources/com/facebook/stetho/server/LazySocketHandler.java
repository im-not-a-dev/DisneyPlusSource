package com.facebook.stetho.server;

import android.net.LocalSocket;
import java.io.IOException;

public class LazySocketHandler implements SocketHandler {
    private SocketHandler mSocketHandler;
    private final SocketHandlerFactory mSocketHandlerFactory;

    public LazySocketHandler(SocketHandlerFactory socketHandlerFactory) {
        this.mSocketHandlerFactory = socketHandlerFactory;
    }

    private synchronized SocketHandler getSocketHandler() {
        if (this.mSocketHandler == null) {
            this.mSocketHandler = this.mSocketHandlerFactory.create();
        }
        return this.mSocketHandler;
    }

    public void onAccepted(LocalSocket localSocket) throws IOException {
        getSocketHandler().onAccepted(localSocket);
    }
}
