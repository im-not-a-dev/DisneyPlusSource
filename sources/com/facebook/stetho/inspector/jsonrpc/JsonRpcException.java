package com.facebook.stetho.inspector.jsonrpc;

import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError;

public class JsonRpcException extends Exception {
    private final JsonRpcError mErrorMessage;

    public JsonRpcException(JsonRpcError jsonRpcError) {
        StringBuilder sb = new StringBuilder();
        sb.append(jsonRpcError.code);
        sb.append(": ");
        sb.append(jsonRpcError.message);
        super(sb.toString());
        this.mErrorMessage = (JsonRpcError) Util.throwIfNull(jsonRpcError);
    }

    public JsonRpcError getErrorMessage() {
        return this.mErrorMessage;
    }
}
