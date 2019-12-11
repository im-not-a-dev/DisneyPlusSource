package com.facebook.stetho.inspector.helper;

import com.facebook.stetho.common.LogRedirector;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.jsonrpc.DisconnectReceiver;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.jsonrpc.PendingRequestCallback;
import java.nio.channels.NotYetConnectedException;
import java.util.HashMap;
import java.util.Map;

public class ChromePeerManager {
    private static final String TAG = "ChromePeerManager";
    private PeerRegistrationListener mListener;
    private final Map<JsonRpcPeer, DisconnectReceiver> mReceivingPeers = new HashMap();
    private JsonRpcPeer[] mReceivingPeersSnapshot;

    private class UnregisterOnDisconnect implements DisconnectReceiver {
        private final JsonRpcPeer mPeer;

        public UnregisterOnDisconnect(JsonRpcPeer jsonRpcPeer) {
            this.mPeer = jsonRpcPeer;
        }

        public void onDisconnect() {
            ChromePeerManager.this.removePeer(this.mPeer);
        }
    }

    private synchronized JsonRpcPeer[] getReceivingPeersSnapshot() {
        if (this.mReceivingPeersSnapshot == null) {
            this.mReceivingPeersSnapshot = (JsonRpcPeer[]) this.mReceivingPeers.keySet().toArray(new JsonRpcPeer[this.mReceivingPeers.size()]);
        }
        return this.mReceivingPeersSnapshot;
    }

    private void sendMessageToPeers(String str, Object obj, PendingRequestCallback pendingRequestCallback) {
        for (JsonRpcPeer invokeMethod : getReceivingPeersSnapshot()) {
            try {
                invokeMethod.invokeMethod(str, obj, pendingRequestCallback);
            } catch (NotYetConnectedException e) {
                LogRedirector.m24832e(TAG, "Error delivering data to Chrome", e);
            }
        }
    }

    public synchronized boolean addPeer(JsonRpcPeer jsonRpcPeer) {
        if (this.mReceivingPeers.containsKey(jsonRpcPeer)) {
            return false;
        }
        UnregisterOnDisconnect unregisterOnDisconnect = new UnregisterOnDisconnect(jsonRpcPeer);
        jsonRpcPeer.registerDisconnectReceiver(unregisterOnDisconnect);
        this.mReceivingPeers.put(jsonRpcPeer, unregisterOnDisconnect);
        this.mReceivingPeersSnapshot = null;
        if (this.mListener != null) {
            this.mListener.onPeerRegistered(jsonRpcPeer);
        }
        return true;
    }

    public synchronized boolean hasRegisteredPeers() {
        return !this.mReceivingPeers.isEmpty();
    }

    public void invokeMethodOnPeers(String str, Object obj, PendingRequestCallback pendingRequestCallback) {
        Util.throwIfNull(pendingRequestCallback);
        sendMessageToPeers(str, obj, pendingRequestCallback);
    }

    public synchronized void removePeer(JsonRpcPeer jsonRpcPeer) {
        if (this.mReceivingPeers.remove(jsonRpcPeer) != null) {
            this.mReceivingPeersSnapshot = null;
            if (this.mListener != null) {
                this.mListener.onPeerUnregistered(jsonRpcPeer);
            }
        }
    }

    public void sendNotificationToPeers(String str, Object obj) {
        sendMessageToPeers(str, obj, null);
    }

    public synchronized void setListener(PeerRegistrationListener peerRegistrationListener) {
        this.mListener = peerRegistrationListener;
    }
}
