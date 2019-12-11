package com.bamtechmedia.dominguez.collections;

import com.bamtechmedia.dominguez.collections.p080o0.C3444j;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J,\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0005H&J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH&JB\u0010\u0011\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018H&¨\u0006\u001a"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/CollectionAnalytics;", "", "trackBackgroundPlaybackExit", "", "mediaTitle", "", "videoUri", "playbackIntent", "trackBackgroundPlaybackStart", "playbackStartupTime", "", "trackRowSwipe", "config", "Lcom/bamtechmedia/dominguez/collections/config/ContainerConfig;", "previousFirstItemPos", "", "newFirstItemPos", "trackTileClick", "adapterPosition", "asset", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "optionalExtraMap", "", "startPlayback", "", "Companion", "collectionsApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.f */
/* compiled from: CollectionAnalytics.kt */
public interface C3320f {

    /* renamed from: a */
    public static final C3321a f8371a = C3321a.f8373b;

    /* renamed from: com.bamtechmedia.dominguez.collections.f$a */
    /* compiled from: CollectionAnalytics.kt */
    public static final class C3321a {

        /* renamed from: a */
        private static final AtomicBoolean f8372a = new AtomicBoolean();

        /* renamed from: b */
        static final /* synthetic */ C3321a f8373b = new C3321a();

        private C3321a() {
        }

        /* renamed from: a */
        public final AtomicBoolean mo12375a() {
            return f8372a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.f$b */
    /* compiled from: CollectionAnalytics.kt */
    public static final class C3322b {
        /* renamed from: a */
        public static /* synthetic */ void m11431a(C3320f fVar, C3444j jVar, int i, C3626b bVar, Map map, boolean z, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 8) != 0) {
                    map = C13173j0.m40350a();
                }
                fVar.mo12372a(jVar, i, bVar, map, (i2 & 16) != 0 ? false : z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackTileClick");
        }
    }

    /* renamed from: a */
    void mo12371a(C3444j jVar, int i, int i2);

    /* renamed from: a */
    void mo12372a(C3444j jVar, int i, C3626b bVar, Map<String, String> map, boolean z);

    /* renamed from: a */
    void mo12373a(String str, String str2, long j, String str3);

    /* renamed from: a */
    void mo12374a(String str, String str2, String str3);
}
