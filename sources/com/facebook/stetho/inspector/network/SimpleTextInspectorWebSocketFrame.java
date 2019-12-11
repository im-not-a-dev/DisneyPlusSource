package com.facebook.stetho.inspector.network;

import com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorWebSocketFrame;

public class SimpleTextInspectorWebSocketFrame implements InspectorWebSocketFrame {
    private final String mPayload;
    private final String mRequestId;

    public SimpleTextInspectorWebSocketFrame(String str, String str2) {
        this.mRequestId = str;
        this.mPayload = str2;
    }

    public boolean mask() {
        return false;
    }

    public int opcode() {
        return 1;
    }

    public String payloadData() {
        return this.mPayload;
    }

    public String requestId() {
        return this.mRequestId;
    }
}
