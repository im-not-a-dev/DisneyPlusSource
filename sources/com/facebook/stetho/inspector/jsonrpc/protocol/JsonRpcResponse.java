package com.facebook.stetho.inspector.jsonrpc.protocol;

import android.annotation.SuppressLint;
import com.facebook.stetho.json.annotation.JsonProperty;
import org.json.JSONObject;

@SuppressLint({"UsingDefaultJsonDeserializer", "EmptyJsonPropertyUse"})
public class JsonRpcResponse {
    @JsonProperty
    public JSONObject error;
    @JsonProperty(required = true)

    /* renamed from: id */
    public long f18332id;
    @JsonProperty
    public JSONObject result;
}
