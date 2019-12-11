package android.support.p001v4.media;

import android.os.Bundle;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.util.Log;
import p092d.p093a.p094a.p095a.C3854b;

/* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
class MediaBrowserCompat$CustomActionResultReceiver extends C3854b {

    /* renamed from: V */
    private final String f1V;

    /* renamed from: W */
    private final Bundle f2W;

    /* renamed from: X */
    private final C0010a f3X;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13a(int i, Bundle bundle) {
        if (this.f3X != null) {
            MediaSessionCompat.m97a(bundle);
            if (i == -1) {
                this.f3X.mo67a(this.f1V, this.f2W, bundle);
            } else if (i == 0) {
                this.f3X.mo69c(this.f1V, this.f2W, bundle);
            } else if (i != 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown result code: ");
                sb.append(i);
                sb.append(" (extras=");
                sb.append(this.f2W);
                sb.append(", resultData=");
                sb.append(bundle);
                sb.append(")");
                Log.w("MediaBrowserCompat", sb.toString());
            } else {
                this.f3X.mo68b(this.f1V, this.f2W, bundle);
            }
        }
    }
}
