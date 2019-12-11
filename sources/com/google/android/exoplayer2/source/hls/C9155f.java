package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.p366s0.C8912g;
import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p366s0.p370u.C8952e;
import com.google.android.exoplayer2.p366s0.p371v.C8972g;
import com.google.android.exoplayer2.p366s0.p374y.C9022f;
import com.google.android.exoplayer2.p366s0.p374y.C9025g0;
import com.google.android.exoplayer2.p366s0.p374y.C9028h;
import com.google.android.exoplayer2.p366s0.p374y.C9036j;
import com.google.android.exoplayer2.p366s0.p374y.C9039l;
import com.google.android.exoplayer2.util.C9545h0;
import com.google.android.exoplayer2.util.C9566t;
import com.google.android.exoplayer2.source.hls.HlsExtractorFactory.C9148a;
import java.io.EOFException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.source.hls.f */
/* compiled from: DefaultHlsExtractorFactory */
public final class C9155f implements HlsExtractorFactory {

    /* renamed from: b */
    private final int f20563b;

    /* renamed from: c */
    private final boolean f20564c;

    public C9155f() {
        this(0, true);
    }

    /* renamed from: b */
    private static boolean m27456b(C8912g gVar) {
        return (gVar instanceof C9025g0) || (gVar instanceof C8972g);
    }

    /* renamed from: a */
    public C9148a mo23782a(C8912g gVar, Uri uri, Format format, List<Format> list, DrmInitData drmInitData, C9545h0 h0Var, Map<String, List<String>> map, C8913h hVar) throws InterruptedException, IOException {
        if (gVar != null) {
            if (m27456b(gVar)) {
                return m27453a(gVar);
            }
            if (m27454a(gVar, format, h0Var) == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected previousExtractor type: ");
                sb.append(gVar.getClass().getSimpleName());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        C8912g a = m27450a(uri, format, list, drmInitData, h0Var);
        hVar.mo23297c();
        if (m27455a(a, hVar)) {
            return m27453a(a);
        }
        if (!(a instanceof C9194q)) {
            C9194q qVar = new C9194q(format.f18368t0, h0Var);
            if (m27455a(qVar, hVar)) {
                return m27453a(qVar);
            }
        }
        if (!(a instanceof C9036j)) {
            C9036j jVar = new C9036j();
            if (m27455a(jVar, hVar)) {
                return m27453a(jVar);
            }
        }
        if (!(a instanceof C9022f)) {
            C9022f fVar = new C9022f();
            if (m27455a(fVar, hVar)) {
                return m27453a(fVar);
            }
        }
        if (!(a instanceof C9028h)) {
            C9028h hVar2 = new C9028h();
            if (m27455a(hVar2, hVar)) {
                return m27453a(hVar2);
            }
        }
        if (!(a instanceof C8952e)) {
            C8952e eVar = new C8952e(0, 0);
            if (m27455a(eVar, hVar)) {
                return m27453a(eVar);
            }
        }
        if (!(a instanceof C8972g)) {
            C8972g a2 = m27451a(h0Var, drmInitData, list);
            if (m27455a(a2, hVar)) {
                return m27453a(a2);
            }
        }
        if (!(a instanceof C9025g0)) {
            C9025g0 a3 = m27452a(this.f20563b, this.f20564c, format, list, h0Var);
            if (m27455a(a3, hVar)) {
                return m27453a(a3);
            }
        }
        return m27453a(a);
    }

    public C9155f(int i, boolean z) {
        this.f20563b = i;
        this.f20564c = z;
    }

    /* renamed from: a */
    private C8912g m27450a(Uri uri, Format format, List<Format> list, DrmInitData drmInitData, C9545h0 h0Var) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        if ("text/vtt".equals(format.f18349b0) || lastPathSegment.endsWith(".webvtt") || lastPathSegment.endsWith(".vtt")) {
            return new C9194q(format.f18368t0, h0Var);
        }
        if (lastPathSegment.endsWith(".aac")) {
            return new C9036j();
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return new C9022f();
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return new C9028h();
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return new C8952e(0, 0);
        }
        String str = ".mp4";
        if (!lastPathSegment.endsWith(str)) {
            if (!lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(str, lastPathSegment.length() - 5)) {
                if (!lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                    return m27452a(this.f20563b, this.f20564c, format, list, h0Var);
                }
            }
        }
        return m27451a(h0Var, drmInitData, list);
    }

    /* renamed from: a */
    private static C9025g0 m27452a(int i, boolean z, Format format, List<Format> list, C9545h0 h0Var) {
        int i2 = i | 16;
        if (list != null) {
            i2 |= 32;
        } else if (z) {
            list = Collections.singletonList(Format.m24868a(null, "application/cea-608", 0, null));
        } else {
            list = Collections.emptyList();
        }
        String str = format.f18346Y;
        if (!TextUtils.isEmpty(str)) {
            if (!"audio/mp4a-latm".equals(C9566t.m29508a(str))) {
                i2 |= 2;
            }
            if (!"video/avc".equals(C9566t.m29516i(str))) {
                i2 |= 4;
            }
        }
        return new C9025g0(2, h0Var, new C9039l(i2, list));
    }

    /* renamed from: a */
    private static C8972g m27451a(C9545h0 h0Var, DrmInitData drmInitData, List<Format> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        C8972g gVar = new C8972g(0, h0Var, null, drmInitData, list);
        return gVar;
    }

    /* renamed from: a */
    private static C9148a m27454a(C8912g gVar, Format format, C9545h0 h0Var) {
        if (gVar instanceof C9194q) {
            return m27453a(new C9194q(format.f18368t0, h0Var));
        }
        if (gVar instanceof C9036j) {
            return m27453a(new C9036j());
        }
        if (gVar instanceof C9022f) {
            return m27453a(new C9022f());
        }
        if (gVar instanceof C9028h) {
            return m27453a(new C9028h());
        }
        if (gVar instanceof C8952e) {
            return m27453a(new C8952e());
        }
        return null;
    }

    /* renamed from: a */
    private static C9148a m27453a(C8912g gVar) {
        return new C9148a(gVar, (gVar instanceof C9036j) || (gVar instanceof C9022f) || (gVar instanceof C9028h) || (gVar instanceof C8952e), m27456b(gVar));
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private static boolean m27455a(C8912g gVar, C8913h hVar) throws InterruptedException, IOException {
        try {
            boolean a = gVar.mo23310a(hVar);
            hVar.mo23297c();
            return a;
        } catch (EOFException unused) {
            hVar.mo23297c();
            return false;
        } catch (Throwable th) {
            hVar.mo23297c();
            throw th;
        }
    }
}
