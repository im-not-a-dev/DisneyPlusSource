package com.facebook.stetho.inspector.network;

import com.facebook.stetho.common.Utf8Charset;
import com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorWebSocketFrame;
import java.io.UnsupportedEncodingException;

public class SimpleBinaryInspectorWebSocketFrame implements InspectorWebSocketFrame {
    private final byte[] mPayload;
    private final String mRequestId;

    public SimpleBinaryInspectorWebSocketFrame(String str, byte[] bArr) {
        this.mRequestId = str;
        this.mPayload = bArr;
    }

    public boolean mask() {
        return false;
    }

    public int opcode() {
        return 2;
    }

    public String payloadData() {
        try {
            return new String(this.mPayload, Utf8Charset.NAME);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public String requestId() {
        return this.mRequestId;
    }
}
