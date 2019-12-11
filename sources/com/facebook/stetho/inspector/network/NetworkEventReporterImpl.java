package com.facebook.stetho.inspector.network;

import android.os.SystemClock;
import com.facebook.stetho.common.Utf8Charset;
import com.facebook.stetho.inspector.console.CLog;
import com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorHeaders;
import com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorRequest;
import com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorResponse;
import com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorWebSocketFrame;
import com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorWebSocketRequest;
import com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorWebSocketResponse;
import com.facebook.stetho.inspector.protocol.module.Console.CallFrame;
import com.facebook.stetho.inspector.protocol.module.Console.MessageLevel;
import com.facebook.stetho.inspector.protocol.module.Console.MessageSource;
import com.facebook.stetho.inspector.protocol.module.Network.DataReceivedParams;
import com.facebook.stetho.inspector.protocol.module.Network.Initiator;
import com.facebook.stetho.inspector.protocol.module.Network.InitiatorType;
import com.facebook.stetho.inspector.protocol.module.Network.LoadingFailedParams;
import com.facebook.stetho.inspector.protocol.module.Network.LoadingFinishedParams;
import com.facebook.stetho.inspector.protocol.module.Network.Request;
import com.facebook.stetho.inspector.protocol.module.Network.RequestWillBeSentParams;
import com.facebook.stetho.inspector.protocol.module.Network.Response;
import com.facebook.stetho.inspector.protocol.module.Network.ResponseReceivedParams;
import com.facebook.stetho.inspector.protocol.module.Network.WebSocketClosedParams;
import com.facebook.stetho.inspector.protocol.module.Network.WebSocketCreatedParams;
import com.facebook.stetho.inspector.protocol.module.Network.WebSocketFrame;
import com.facebook.stetho.inspector.protocol.module.Network.WebSocketFrameErrorParams;
import com.facebook.stetho.inspector.protocol.module.Network.WebSocketFrameReceivedParams;
import com.facebook.stetho.inspector.protocol.module.Network.WebSocketFrameSentParams;
import com.facebook.stetho.inspector.protocol.module.Network.WebSocketHandshakeResponseReceivedParams;
import com.facebook.stetho.inspector.protocol.module.Network.WebSocketRequest;
import com.facebook.stetho.inspector.protocol.module.Network.WebSocketResponse;
import com.facebook.stetho.inspector.protocol.module.Network.WebSocketWillSendHandshakeRequestParams;
import com.facebook.stetho.inspector.protocol.module.Page.ResourceType;
import com.facebook.stetho.server.http.HttpHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

public class NetworkEventReporterImpl implements NetworkEventReporter {
    private static NetworkEventReporter sInstance;
    private final AtomicInteger mNextRequestId = new AtomicInteger(0);
    private ResourceTypeHelper mResourceTypeHelper;

    private NetworkEventReporterImpl() {
    }

    private static WebSocketFrame convertFrame(InspectorWebSocketFrame inspectorWebSocketFrame) {
        WebSocketFrame webSocketFrame = new WebSocketFrame();
        webSocketFrame.opcode = inspectorWebSocketFrame.opcode();
        webSocketFrame.mask = inspectorWebSocketFrame.mask();
        webSocketFrame.payloadData = inspectorWebSocketFrame.payloadData();
        return webSocketFrame;
    }

    static AsyncPrettyPrinter createPrettyPrinterForResponse(InspectorResponse inspectorResponse, AsyncPrettyPrinterRegistry asyncPrettyPrinterRegistry) {
        if (asyncPrettyPrinterRegistry != null) {
            int headerCount = inspectorResponse.headerCount();
            for (int i = 0; i < headerCount; i++) {
                AsyncPrettyPrinterFactory lookup = asyncPrettyPrinterRegistry.lookup(inspectorResponse.headerName(i));
                if (lookup != null) {
                    return lookup.getInstance(inspectorResponse.headerName(i), inspectorResponse.headerValue(i));
                }
            }
        }
        return null;
    }

    private static ResourceType determineResourceType(AsyncPrettyPrinter asyncPrettyPrinter, String str, ResourceTypeHelper resourceTypeHelper) {
        if (asyncPrettyPrinter != null) {
            return asyncPrettyPrinter.getPrettifiedType().getResourceType();
        }
        return str != null ? resourceTypeHelper.determineResourceType(str) : ResourceType.OTHER;
    }

    private static JSONObject formatHeadersAsJSON(InspectorHeaders inspectorHeaders) {
        JSONObject jSONObject = new JSONObject();
        int i = 0;
        while (i < inspectorHeaders.headerCount()) {
            String headerName = inspectorHeaders.headerName(i);
            String headerValue = inspectorHeaders.headerValue(i);
            try {
                if (jSONObject.has(headerName)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(jSONObject.getString(headerName));
                    sb.append("\n");
                    sb.append(headerValue);
                    jSONObject.put(headerName, sb.toString());
                } else {
                    jSONObject.put(headerName, headerValue);
                }
                i++;
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
        return jSONObject;
    }

    public static synchronized NetworkEventReporter get() {
        NetworkEventReporter networkEventReporter;
        synchronized (NetworkEventReporterImpl.class) {
            if (sInstance == null) {
                sInstance = new NetworkEventReporterImpl();
            }
            networkEventReporter = sInstance;
        }
        return networkEventReporter;
    }

    private String getContentType(InspectorHeaders inspectorHeaders) {
        return inspectorHeaders.firstHeaderValue(HttpHeaders.CONTENT_TYPE);
    }

    private NetworkPeerManager getPeerManagerIfEnabled() {
        NetworkPeerManager instanceOrNull = NetworkPeerManager.getInstanceOrNull();
        if (instanceOrNull == null || !instanceOrNull.hasRegisteredPeers()) {
            return null;
        }
        return instanceOrNull;
    }

    private ResourceTypeHelper getResourceTypeHelper() {
        if (this.mResourceTypeHelper == null) {
            this.mResourceTypeHelper = new ResourceTypeHelper();
        }
        return this.mResourceTypeHelper;
    }

    private static AsyncPrettyPrinter initAsyncPrettyPrinterForResponse(InspectorResponse inspectorResponse, NetworkPeerManager networkPeerManager) {
        AsyncPrettyPrinter createPrettyPrinterForResponse = createPrettyPrinterForResponse(inspectorResponse, networkPeerManager.getAsyncPrettyPrinterRegistry());
        if (createPrettyPrinterForResponse != null) {
            networkPeerManager.getResponseBodyFileManager().associateAsyncPrettyPrinterWithId(inspectorResponse.requestId(), createPrettyPrinterForResponse);
        }
        return createPrettyPrinterForResponse;
    }

    private void loadingFailed(String str, String str2) {
        NetworkPeerManager peerManagerIfEnabled = getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            LoadingFailedParams loadingFailedParams = new LoadingFailedParams();
            loadingFailedParams.requestId = str;
            loadingFailedParams.timestamp = ((double) stethoNow()) / 1000.0d;
            loadingFailedParams.errorText = str2;
            loadingFailedParams.type = ResourceType.OTHER;
            peerManagerIfEnabled.sendNotificationToPeers("Network.loadingFailed", loadingFailedParams);
        }
    }

    private void loadingFinished(String str) {
        NetworkPeerManager peerManagerIfEnabled = getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            LoadingFinishedParams loadingFinishedParams = new LoadingFinishedParams();
            loadingFinishedParams.requestId = str;
            loadingFinishedParams.timestamp = ((double) stethoNow()) / 1000.0d;
            peerManagerIfEnabled.sendNotificationToPeers("Network.loadingFinished", loadingFinishedParams);
        }
    }

    private static String readBodyAsString(NetworkPeerManager networkPeerManager, InspectorRequest inspectorRequest) {
        try {
            byte[] body = inspectorRequest.body();
            if (body != null) {
                return new String(body, Utf8Charset.INSTANCE);
            }
        } catch (IOException | OutOfMemoryError e) {
            MessageLevel messageLevel = MessageLevel.WARNING;
            MessageSource messageSource = MessageSource.NETWORK;
            StringBuilder sb = new StringBuilder();
            sb.append("Could not reproduce POST body: ");
            sb.append(e);
            CLog.writeToConsole(networkPeerManager, messageLevel, messageSource, sb.toString());
        }
        return null;
    }

    private static long stethoNow() {
        return SystemClock.elapsedRealtime();
    }

    public void dataReceived(String str, int i, int i2) {
        NetworkPeerManager peerManagerIfEnabled = getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            DataReceivedParams dataReceivedParams = new DataReceivedParams();
            dataReceivedParams.requestId = str;
            dataReceivedParams.timestamp = ((double) stethoNow()) / 1000.0d;
            dataReceivedParams.dataLength = i;
            dataReceivedParams.encodedDataLength = i2;
            peerManagerIfEnabled.sendNotificationToPeers("Network.dataReceived", dataReceivedParams);
        }
    }

    public void dataSent(String str, int i, int i2) {
        dataReceived(str, i, i2);
    }

    public void httpExchangeFailed(String str, String str2) {
        loadingFailed(str, str2);
    }

    public InputStream interpretResponseStream(String str, String str2, String str3, InputStream inputStream, ResponseHandler responseHandler) {
        NetworkPeerManager peerManagerIfEnabled = getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            ResourceType resourceType = null;
            if (inputStream == null) {
                responseHandler.onEOF();
                return null;
            }
            if (str2 != null) {
                resourceType = getResourceTypeHelper().determineResourceType(str2);
            }
            boolean z = false;
            if (resourceType != null && resourceType == ResourceType.IMAGE) {
                z = true;
            }
            try {
                return DecompressionHelper.teeInputWithDecompression(peerManagerIfEnabled, str, inputStream, peerManagerIfEnabled.getResponseBodyFileManager().openResponseBodyFile(str, z), str3, responseHandler);
            } catch (IOException unused) {
                MessageLevel messageLevel = MessageLevel.ERROR;
                MessageSource messageSource = MessageSource.NETWORK;
                StringBuilder sb = new StringBuilder();
                sb.append("Error writing response body data for request #");
                sb.append(str);
                CLog.writeToConsole(peerManagerIfEnabled, messageLevel, messageSource, sb.toString());
            }
        }
        return inputStream;
    }

    public boolean isEnabled() {
        return getPeerManagerIfEnabled() != null;
    }

    public String nextRequestId() {
        return String.valueOf(this.mNextRequestId.getAndIncrement());
    }

    public void requestWillBeSent(InspectorRequest inspectorRequest) {
        NetworkPeerManager peerManagerIfEnabled = getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            Request request = new Request();
            request.url = inspectorRequest.url();
            request.method = inspectorRequest.method();
            request.headers = formatHeadersAsJSON(inspectorRequest);
            request.postData = readBodyAsString(peerManagerIfEnabled, inspectorRequest);
            String friendlyName = inspectorRequest.friendlyName();
            Integer friendlyNameExtra = inspectorRequest.friendlyNameExtra();
            Initiator initiator = new Initiator();
            initiator.type = InitiatorType.SCRIPT;
            initiator.stackTrace = new ArrayList();
            initiator.stackTrace.add(new CallFrame(friendlyName, friendlyName, friendlyNameExtra != null ? friendlyNameExtra.intValue() : 0, 0));
            RequestWillBeSentParams requestWillBeSentParams = new RequestWillBeSentParams();
            requestWillBeSentParams.requestId = inspectorRequest.mo22403id();
            String str = "1";
            requestWillBeSentParams.frameId = str;
            requestWillBeSentParams.loaderId = str;
            requestWillBeSentParams.documentURL = inspectorRequest.url();
            requestWillBeSentParams.request = request;
            requestWillBeSentParams.timestamp = ((double) stethoNow()) / 1000.0d;
            requestWillBeSentParams.initiator = initiator;
            requestWillBeSentParams.redirectResponse = null;
            requestWillBeSentParams.type = ResourceType.OTHER;
            peerManagerIfEnabled.sendNotificationToPeers("Network.requestWillBeSent", requestWillBeSentParams);
        }
    }

    public void responseHeadersReceived(InspectorResponse inspectorResponse) {
        NetworkPeerManager peerManagerIfEnabled = getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            Response response = new Response();
            response.url = inspectorResponse.url();
            response.status = inspectorResponse.statusCode();
            response.statusText = inspectorResponse.reasonPhrase();
            response.headers = formatHeadersAsJSON(inspectorResponse);
            String contentType = getContentType(inspectorResponse);
            response.mimeType = contentType != null ? getResourceTypeHelper().stripContentExtras(contentType) : "application/octet-stream";
            response.connectionReused = inspectorResponse.connectionReused();
            response.connectionId = inspectorResponse.connectionId();
            response.fromDiskCache = Boolean.valueOf(inspectorResponse.fromDiskCache());
            ResponseReceivedParams responseReceivedParams = new ResponseReceivedParams();
            responseReceivedParams.requestId = inspectorResponse.requestId();
            String str = "1";
            responseReceivedParams.frameId = str;
            responseReceivedParams.loaderId = str;
            responseReceivedParams.timestamp = ((double) stethoNow()) / 1000.0d;
            responseReceivedParams.response = response;
            responseReceivedParams.type = determineResourceType(initAsyncPrettyPrinterForResponse(inspectorResponse, peerManagerIfEnabled), contentType, getResourceTypeHelper());
            peerManagerIfEnabled.sendNotificationToPeers("Network.responseReceived", responseReceivedParams);
        }
    }

    public void responseReadFailed(String str, String str2) {
        loadingFailed(str, str2);
    }

    public void responseReadFinished(String str) {
        loadingFinished(str);
    }

    public void webSocketClosed(String str) {
        NetworkPeerManager peerManagerIfEnabled = getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            WebSocketClosedParams webSocketClosedParams = new WebSocketClosedParams();
            webSocketClosedParams.requestId = str;
            webSocketClosedParams.timestamp = ((double) stethoNow()) / 1000.0d;
            peerManagerIfEnabled.sendNotificationToPeers("Network.webSocketClosed", webSocketClosedParams);
        }
    }

    public void webSocketCreated(String str, String str2) {
        NetworkPeerManager peerManagerIfEnabled = getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            WebSocketCreatedParams webSocketCreatedParams = new WebSocketCreatedParams();
            webSocketCreatedParams.requestId = str;
            webSocketCreatedParams.url = str2;
            peerManagerIfEnabled.sendNotificationToPeers("Network.webSocketCreated", webSocketCreatedParams);
        }
    }

    public void webSocketFrameError(String str, String str2) {
        NetworkPeerManager peerManagerIfEnabled = getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            WebSocketFrameErrorParams webSocketFrameErrorParams = new WebSocketFrameErrorParams();
            webSocketFrameErrorParams.requestId = str;
            webSocketFrameErrorParams.timestamp = ((double) stethoNow()) / 1000.0d;
            webSocketFrameErrorParams.errorMessage = str2;
            peerManagerIfEnabled.sendNotificationToPeers("Network.webSocketFrameError", webSocketFrameErrorParams);
        }
    }

    public void webSocketFrameReceived(InspectorWebSocketFrame inspectorWebSocketFrame) {
        NetworkPeerManager peerManagerIfEnabled = getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            WebSocketFrameReceivedParams webSocketFrameReceivedParams = new WebSocketFrameReceivedParams();
            webSocketFrameReceivedParams.requestId = inspectorWebSocketFrame.requestId();
            webSocketFrameReceivedParams.timestamp = ((double) stethoNow()) / 1000.0d;
            webSocketFrameReceivedParams.response = convertFrame(inspectorWebSocketFrame);
            peerManagerIfEnabled.sendNotificationToPeers("Network.webSocketFrameReceived", webSocketFrameReceivedParams);
        }
    }

    public void webSocketFrameSent(InspectorWebSocketFrame inspectorWebSocketFrame) {
        NetworkPeerManager peerManagerIfEnabled = getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            WebSocketFrameSentParams webSocketFrameSentParams = new WebSocketFrameSentParams();
            webSocketFrameSentParams.requestId = inspectorWebSocketFrame.requestId();
            webSocketFrameSentParams.timestamp = ((double) stethoNow()) / 1000.0d;
            webSocketFrameSentParams.response = convertFrame(inspectorWebSocketFrame);
            peerManagerIfEnabled.sendNotificationToPeers("Network.webSocketFrameSent", webSocketFrameSentParams);
        }
    }

    public void webSocketHandshakeResponseReceived(InspectorWebSocketResponse inspectorWebSocketResponse) {
        if (getPeerManagerIfEnabled() != null) {
            WebSocketHandshakeResponseReceivedParams webSocketHandshakeResponseReceivedParams = new WebSocketHandshakeResponseReceivedParams();
            webSocketHandshakeResponseReceivedParams.requestId = inspectorWebSocketResponse.requestId();
            webSocketHandshakeResponseReceivedParams.timestamp = ((double) stethoNow()) / 1000.0d;
            WebSocketResponse webSocketResponse = new WebSocketResponse();
            webSocketResponse.headers = formatHeadersAsJSON(inspectorWebSocketResponse);
            webSocketResponse.headersText = null;
            if (inspectorWebSocketResponse.requestHeaders() != null) {
                webSocketResponse.requestHeaders = formatHeadersAsJSON(inspectorWebSocketResponse.requestHeaders());
                webSocketResponse.requestHeadersText = null;
            }
            webSocketResponse.status = inspectorWebSocketResponse.statusCode();
            webSocketResponse.statusText = inspectorWebSocketResponse.reasonPhrase();
            webSocketHandshakeResponseReceivedParams.response = webSocketResponse;
        }
    }

    public void webSocketWillSendHandshakeRequest(InspectorWebSocketRequest inspectorWebSocketRequest) {
        NetworkPeerManager peerManagerIfEnabled = getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            WebSocketWillSendHandshakeRequestParams webSocketWillSendHandshakeRequestParams = new WebSocketWillSendHandshakeRequestParams();
            webSocketWillSendHandshakeRequestParams.requestId = inspectorWebSocketRequest.mo22403id();
            webSocketWillSendHandshakeRequestParams.timestamp = ((double) stethoNow()) / 1000.0d;
            webSocketWillSendHandshakeRequestParams.wallTime = ((double) System.currentTimeMillis()) / 1000.0d;
            WebSocketRequest webSocketRequest = new WebSocketRequest();
            webSocketRequest.headers = formatHeadersAsJSON(inspectorWebSocketRequest);
            webSocketWillSendHandshakeRequestParams.request = webSocketRequest;
            peerManagerIfEnabled.sendNotificationToPeers("Network.webSocketWillSendHandshakeRequest", webSocketWillSendHandshakeRequestParams);
        }
    }
}
