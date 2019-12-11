package android.support.p001v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p001v4.media.session.MediaSessionCompat;
import java.util.ArrayList;
import p092d.p093a.p094a.p095a.C3854b;

/* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
class MediaBrowserCompat$SearchResultReceiver extends C3854b {

    /* renamed from: V */
    private final String f8V;

    /* renamed from: W */
    private final Bundle f9W;

    /* renamed from: X */
    private final C0012c f10X;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13a(int i, Bundle bundle) {
        MediaSessionCompat.m97a(bundle);
        if (i == 0 && bundle != null) {
            String str = "search_results";
            if (bundle.containsKey(str)) {
                Parcelable[] parcelableArray = bundle.getParcelableArray(str);
                ArrayList arrayList = null;
                if (parcelableArray != null) {
                    arrayList = new ArrayList();
                    for (Parcelable parcelable : parcelableArray) {
                        arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
                    }
                }
                this.f10X.mo73a(this.f8V, this.f9W, arrayList);
                return;
            }
        }
        this.f10X.mo72a(this.f8V, this.f9W);
    }
}
