package androidx.media;

import android.media.session.MediaSessionManager.RemoteUserInfo;

/* renamed from: androidx.media.d */
/* compiled from: MediaSessionManagerImplApi28 */
final class C0755d extends C0756e {
    C0755d(String str, int i, int i2) {
        super(str, i, i2);
        new RemoteUserInfo(str, i, i2);
    }

    C0755d(RemoteUserInfo remoteUserInfo) {
        super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
    }
}
