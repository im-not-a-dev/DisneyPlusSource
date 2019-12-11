package com.facebook.stetho.server;

import android.content.Context;
import android.net.Credentials;
import android.net.LocalSocket;
import com.facebook.stetho.common.LogUtil;
import java.io.IOException;

public abstract class SecureSocketHandler implements SocketHandler {
    private final Context mContext;

    public SecureSocketHandler(Context context) {
        this.mContext = context;
    }

    private static void enforcePermission(Context context, LocalSocket localSocket) throws IOException, PeerAuthorizationException {
        Credentials peerCredentials = localSocket.getPeerCredentials();
        int uid = peerCredentials.getUid();
        int pid = peerCredentials.getPid();
        if (LogUtil.isLoggable(2)) {
            LogUtil.m24852v("Got request from uid=%d, pid=%d", Integer.valueOf(uid), Integer.valueOf(pid));
        }
        String str = "android.permission.DUMP";
        if (context.checkPermission(str, pid, uid) != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Peer pid=");
            sb.append(pid);
            sb.append(", uid=");
            sb.append(uid);
            sb.append(" does not have ");
            sb.append(str);
            throw new PeerAuthorizationException(sb.toString());
        }
    }

    public final void onAccepted(LocalSocket localSocket) throws IOException {
        try {
            enforcePermission(this.mContext, localSocket);
            onSecured(localSocket);
        } catch (PeerAuthorizationException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unauthorized request: ");
            sb.append(e.getMessage());
            LogUtil.m24843e(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public abstract void onSecured(LocalSocket localSocket) throws IOException;
}
