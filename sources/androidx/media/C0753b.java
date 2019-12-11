package androidx.media;

import android.media.session.MediaSessionManager.RemoteUserInfo;
import android.os.Build.VERSION;

/* renamed from: androidx.media.b */
/* compiled from: MediaSessionManager */
public final class C0753b {

    /* renamed from: a */
    C0754c f3053a;

    public C0753b(String str, int i, int i2) {
        if (VERSION.SDK_INT >= 28) {
            this.f3053a = new C0755d(str, i, i2);
        } else {
            this.f3053a = new C0756e(str, i, i2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0753b)) {
            return false;
        }
        return this.f3053a.equals(((C0753b) obj).f3053a);
    }

    public int hashCode() {
        return this.f3053a.hashCode();
    }

    public C0753b(RemoteUserInfo remoteUserInfo) {
        this.f3053a = new C0755d(remoteUserInfo);
    }
}
