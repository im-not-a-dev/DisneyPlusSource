package com.facebook.stetho.inspector.protocol.module;

import android.content.Context;
import com.facebook.stetho.common.ProcessUtil;
import com.facebook.stetho.inspector.domstorage.SharedPreferencesHelper;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import com.facebook.stetho.inspector.protocol.module.Console.ConsoleMessage;
import com.facebook.stetho.inspector.protocol.module.Console.MessageAddedRequest;
import com.facebook.stetho.inspector.protocol.module.Console.MessageLevel;
import com.facebook.stetho.inspector.protocol.module.Console.MessageSource;
import com.facebook.stetho.inspector.screencast.ScreencastDispatcher;
import com.facebook.stetho.json.ObjectMapper;
import com.facebook.stetho.json.annotation.JsonProperty;
import com.facebook.stetho.json.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public class Page implements ChromeDevtoolsDomain {
    private final Context mContext;
    private final ObjectMapper mObjectMapper = new ObjectMapper();
    private ScreencastDispatcher mScreencastDispatcher;

    private static class ExecutionContextCreatedParams {
        @JsonProperty(required = true)
        public ExecutionContextDescription context;

        private ExecutionContextCreatedParams() {
        }
    }

    private static class ExecutionContextDescription {
        @JsonProperty(required = true)
        public String frameId;
        @JsonProperty(required = true)

        /* renamed from: id */
        public int f18338id;

        private ExecutionContextDescription() {
        }
    }

    private static class Frame {
        @JsonProperty(required = true)

        /* renamed from: id */
        public String f18339id;
        @JsonProperty(required = true)
        public String loaderId;
        @JsonProperty(required = true)
        public String mimeType;
        @JsonProperty
        public String name;
        @JsonProperty
        public String parentId;
        @JsonProperty(required = true)
        public String securityOrigin;
        @JsonProperty(required = true)
        public String url;

        private Frame() {
        }
    }

    private static class FrameResourceTree {
        @JsonProperty
        public List<FrameResourceTree> childFrames;
        @JsonProperty(required = true)
        public Frame frame;
        @JsonProperty(required = true)
        public List<Resource> resources;

        private FrameResourceTree() {
        }
    }

    private static class GetResourceTreeParams implements JsonRpcResult {
        @JsonProperty(required = true)
        public FrameResourceTree frameTree;

        private GetResourceTreeParams() {
        }
    }

    private static class Resource {
        private Resource() {
        }
    }

    public enum ResourceType {
        DOCUMENT("Document"),
        STYLESHEET("Stylesheet"),
        IMAGE("Image"),
        FONT("Font"),
        SCRIPT("Script"),
        XHR(r7),
        WEBSOCKET("WebSocket"),
        OTHER("Other");
        
        private final String mProtocolValue;

        private ResourceType(String str) {
            this.mProtocolValue = str;
        }

        @JsonValue
        public String getProtocolValue() {
            return this.mProtocolValue;
        }
    }

    public static class ScreencastFrameEvent {
        @JsonProperty(required = true)
        public String data;
        @JsonProperty(required = true)
        public ScreencastFrameEventMetadata metadata;
    }

    public static class ScreencastFrameEventMetadata {
        @JsonProperty(required = true)
        public int deviceHeight;
        @JsonProperty(required = true)
        public int deviceWidth;
        @JsonProperty(required = true)
        public int offsetTop;
        @JsonProperty(required = true)
        public int pageScaleFactor;
        @JsonProperty(required = true)
        public int scrollOffsetX;
        @JsonProperty(required = true)
        public int scrollOffsetY;
    }

    public static class StartScreencastRequest {
        @JsonProperty
        public String format;
        @JsonProperty
        public int maxHeight;
        @JsonProperty
        public int maxWidth;
        @JsonProperty
        public int quality;
    }

    public Page(Context context) {
        this.mContext = context;
    }

    private static FrameResourceTree createSimpleFrameResourceTree(String str, String str2, String str3, String str4) {
        Frame frame = new Frame();
        frame.f18339id = str;
        frame.parentId = str2;
        frame.loaderId = "1";
        frame.name = str3;
        frame.url = "";
        frame.securityOrigin = str4;
        frame.mimeType = "text/plain";
        FrameResourceTree frameResourceTree = new FrameResourceTree();
        frameResourceTree.frame = frame;
        frameResourceTree.resources = Collections.emptyList();
        frameResourceTree.childFrames = null;
        return frameResourceTree;
    }

    private void notifyExecutionContexts(JsonRpcPeer jsonRpcPeer) {
        ExecutionContextDescription executionContextDescription = new ExecutionContextDescription();
        executionContextDescription.frameId = "1";
        executionContextDescription.f18338id = 1;
        ExecutionContextCreatedParams executionContextCreatedParams = new ExecutionContextCreatedParams();
        executionContextCreatedParams.context = executionContextDescription;
        jsonRpcPeer.invokeMethod("Runtime.executionContextCreated", executionContextCreatedParams, null);
    }

    private void sendWelcomeMessage(JsonRpcPeer jsonRpcPeer) {
        ConsoleMessage consoleMessage = new ConsoleMessage();
        consoleMessage.source = MessageSource.JAVASCRIPT;
        consoleMessage.level = MessageLevel.LOG;
        StringBuilder sb = new StringBuilder();
        sb.append("_____/\\\\\\\\\\\\\\\\\\\\\\_______________________________________________/\\\\\\_______________________\n ___/\\\\\\/////////\\\\\\____________________________________________\\/\\\\\\_______________________\n  __\\//\\\\\\______\\///______/\\\\\\_________________________/\\\\\\______\\/\\\\\\_______________________\n   ___\\////\\\\\\__________/\\\\\\\\\\\\\\\\\\\\\\_____/\\\\\\\\\\\\\\\\___/\\\\\\\\\\\\\\\\\\\\\\_\\/\\\\\\_____________/\\\\\\\\\\____\n    ______\\////\\\\\\______\\////\\\\\\////____/\\\\\\/////\\\\\\_\\////\\\\\\////__\\/\\\\\\\\\\\\\\\\\\\\____/\\\\\\///\\\\\\__\n     _________\\////\\\\\\______\\/\\\\\\_______/\\\\\\\\\\\\\\\\\\\\\\_____\\/\\\\\\______\\/\\\\\\/////\\\\\\__/\\\\\\__\\//\\\\\\_\n      __/\\\\\\______\\//\\\\\\_____\\/\\\\\\_/\\\\__\\//\\\\///////______\\/\\\\\\_/\\\\__\\/\\\\\\___\\/\\\\\\_\\//\\\\\\__/\\\\\\__\n       _\\///\\\\\\\\\\\\\\\\\\\\\\/______\\//\\\\\\\\\\____\\//\\\\\\\\\\\\\\\\\\\\____\\//\\\\\\\\\\___\\/\\\\\\___\\/\\\\\\__\\///\\\\\\\\\\/___\n        ___\\///////////_________\\/////______\\//////////______\\/////____\\///____\\///_____\\/////_____\n         Welcome to Stetho\n          Attached to ");
        sb.append(ProcessUtil.getProcessName());
        sb.append("\n");
        consoleMessage.text = sb.toString();
        MessageAddedRequest messageAddedRequest = new MessageAddedRequest();
        messageAddedRequest.message = consoleMessage;
        jsonRpcPeer.invokeMethod("Console.messageAdded", messageAddedRequest, null);
    }

    @ChromeDevtoolsMethod
    public JsonRpcResult canScreencast(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
        return new SimpleBooleanResult(true);
    }

    @ChromeDevtoolsMethod
    public void clearDeviceOrientationOverride(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public void clearGeolocationOverride(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public void disable(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public void enable(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
        notifyExecutionContexts(jsonRpcPeer);
        sendWelcomeMessage(jsonRpcPeer);
    }

    @ChromeDevtoolsMethod
    public JsonRpcResult getResourceTree(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
        Iterator it = SharedPreferencesHelper.getSharedPreferenceTags(this.mContext).iterator();
        String str = "1";
        FrameResourceTree createSimpleFrameResourceTree = createSimpleFrameResourceTree(str, null, "Stetho", it.hasNext() ? (String) it.next() : "");
        if (createSimpleFrameResourceTree.childFrames == null) {
            createSimpleFrameResourceTree.childFrames = new ArrayList();
        }
        int i = 1;
        while (it.hasNext()) {
            StringBuilder sb = new StringBuilder();
            sb.append("1.");
            int i2 = i + 1;
            sb.append(i);
            String sb2 = sb.toString();
            String str2 = (String) it.next();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Child #");
            sb3.append(sb2);
            createSimpleFrameResourceTree.childFrames.add(createSimpleFrameResourceTree(sb2, str, sb3.toString(), str2));
            i = i2;
        }
        GetResourceTreeParams getResourceTreeParams = new GetResourceTreeParams();
        getResourceTreeParams.frameTree = createSimpleFrameResourceTree;
        return getResourceTreeParams;
    }

    @ChromeDevtoolsMethod
    public JsonRpcResult hasTouchInputs(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
        return new SimpleBooleanResult(false);
    }

    @ChromeDevtoolsMethod
    public void screencastFrameAck(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public void setDeviceMetricsOverride(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public void setEmulatedMedia(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public void setShowViewportSizeOnResize(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public void setTouchEmulationEnabled(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public void startScreencast(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
        StartScreencastRequest startScreencastRequest = (StartScreencastRequest) this.mObjectMapper.convertValue(jSONObject, StartScreencastRequest.class);
        if (this.mScreencastDispatcher == null) {
            this.mScreencastDispatcher = new ScreencastDispatcher();
            this.mScreencastDispatcher.startScreencast(jsonRpcPeer, startScreencastRequest);
        }
    }

    @ChromeDevtoolsMethod
    public void stopScreencast(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
        ScreencastDispatcher screencastDispatcher = this.mScreencastDispatcher;
        if (screencastDispatcher != null) {
            screencastDispatcher.stopScreencast();
            this.mScreencastDispatcher = null;
        }
    }
}
