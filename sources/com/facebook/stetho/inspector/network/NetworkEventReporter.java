package com.facebook.stetho.inspector.network;

import java.io.IOException;
import java.io.InputStream;

public interface NetworkEventReporter {

    public interface InspectorHeaders {
        String firstHeaderValue(String str);

        int headerCount();

        String headerName(int i);

        String headerValue(int i);
    }

    public interface InspectorRequest extends InspectorRequestCommon {
        byte[] body() throws IOException;

        Integer friendlyNameExtra();

        String method();

        String url();
    }

    public interface InspectorRequestCommon extends InspectorHeaders {
        String friendlyName();

        /* renamed from: id */
        String mo22403id();
    }

    public interface InspectorResponse extends InspectorResponseCommon {
        int connectionId();

        boolean connectionReused();

        boolean fromDiskCache();

        String url();
    }

    public interface InspectorResponseCommon extends InspectorHeaders {
        String reasonPhrase();

        String requestId();

        int statusCode();
    }

    public interface InspectorWebSocketFrame {
        public static final int OPCODE_BINARY = 2;
        public static final int OPCODE_CONNECTION_CLOSE = 8;
        public static final int OPCODE_CONTINUATION = 0;
        public static final int OPCODE_PING = 9;
        public static final int OPCODE_PONG = 10;
        public static final int OPCODE_TEXT = 1;

        boolean mask();

        int opcode();

        String payloadData();

        String requestId();
    }

    public interface InspectorWebSocketRequest extends InspectorRequestCommon {
    }

    public interface InspectorWebSocketResponse extends InspectorResponseCommon {
        InspectorHeaders requestHeaders();
    }

    void dataReceived(String str, int i, int i2);

    void dataSent(String str, int i, int i2);

    void httpExchangeFailed(String str, String str2);

    InputStream interpretResponseStream(String str, String str2, String str3, InputStream inputStream, ResponseHandler responseHandler);

    boolean isEnabled();

    String nextRequestId();

    void requestWillBeSent(InspectorRequest inspectorRequest);

    void responseHeadersReceived(InspectorResponse inspectorResponse);

    void responseReadFailed(String str, String str2);

    void responseReadFinished(String str);

    void webSocketClosed(String str);

    void webSocketCreated(String str, String str2);

    void webSocketFrameError(String str, String str2);

    void webSocketFrameReceived(InspectorWebSocketFrame inspectorWebSocketFrame);

    void webSocketFrameSent(InspectorWebSocketFrame inspectorWebSocketFrame);

    void webSocketHandshakeResponseReceived(InspectorWebSocketResponse inspectorWebSocketResponse);

    void webSocketWillSendHandshakeRequest(InspectorWebSocketRequest inspectorWebSocketRequest);
}
