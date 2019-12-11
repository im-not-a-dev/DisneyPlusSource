package android.support.p001v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p001v4.media.session.MediaSessionCompat;
import p092d.p093a.p094a.p095a.C3854b;

/* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
class MediaBrowserCompat$ItemReceiver extends C3854b {

    /* renamed from: V */
    private final String f4V;

    /* renamed from: W */
    private final C0011b f5W;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13a(int i, Bundle bundle) {
        MediaSessionCompat.m97a(bundle);
        if (i == 0 && bundle != null) {
            String str = "media_item";
            if (bundle.containsKey(str)) {
                Parcelable parcelable = bundle.getParcelable(str);
                if (parcelable == null || (parcelable instanceof MediaBrowserCompat$MediaItem)) {
                    this.f5W.mo70a((MediaBrowserCompat$MediaItem) parcelable);
                } else {
                    this.f5W.mo71a(this.f4V);
                }
                return;
            }
        }
        this.f5W.mo71a(this.f4V);
    }
}
