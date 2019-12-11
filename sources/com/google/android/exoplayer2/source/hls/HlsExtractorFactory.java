package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.p366s0.C8912g;
import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p393v0.C9545h0;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface HlsExtractorFactory {

    /* renamed from: a */
    public static final HlsExtractorFactory f20530a = new C9155f();

    /* renamed from: com.google.android.exoplayer2.source.hls.HlsExtractorFactory$a */
    public static final class C9148a {

        /* renamed from: a */
        public final C8912g f20531a;

        /* renamed from: b */
        public final boolean f20532b;

        /* renamed from: c */
        public final boolean f20533c;

        public C9148a(C8912g gVar, boolean z, boolean z2) {
            this.f20531a = gVar;
            this.f20532b = z;
            this.f20533c = z2;
        }
    }

    /* renamed from: a */
    C9148a mo23782a(C8912g gVar, Uri uri, Format format, List<Format> list, DrmInitData drmInitData, C9545h0 h0Var, Map<String, List<String>> map, C8913h hVar) throws InterruptedException, IOException;
}
