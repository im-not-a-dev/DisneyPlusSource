package com.bamtech.player.exo.p043k;

import com.bamtech.player.exo.p046n.C1744b;
import com.google.android.exoplayer2.Format;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import net.danlew.android.joda.DateUtils;
import p163g.p174d.p178b.C5326w;
import p163g.p174d.p178b.p193j0.C5285a;
import p163g.p174d.p178b.p193j0.C5288c;
import p163g.p174d.p178b.p193j0.C5288c.C5289a;
import p163g.p174d.p178b.p193j0.C5290d;
import p163g.p174d.p178b.p193j0.C5293f;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002J\f\u0010\r\u001a\u00020\u000e*\u00020\nH\u0002J\f\u0010\u000f\u001a\u00020\f*\u00020\nH\u0002R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtech/player/exo/features/TrackFactory;", "", "player", "Lcom/bamtech/player/VideoPlayer;", "(Lcom/bamtech/player/VideoPlayer;)V", "getPlayer", "()Lcom/bamtech/player/VideoPlayer;", "fromFormat", "Lcom/bamtech/player/tracks/Track;", "format", "Lcom/google/android/exoplayer2/Format;", "getTrackTypeWithoutMimeType", "", "isDescriptive", "", "trackType", "Companion", "bamplayer-exoplayer_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.player.exo.k.a */
/* compiled from: TrackFactory.kt */
public final class C1726a {

    /* renamed from: a */
    private final C5326w f6004a;

    /* renamed from: com.bamtech.player.exo.k.a$a */
    /* compiled from: TrackFactory.kt */
    public static final class C1727a {
        private C1727a() {
        }

        public /* synthetic */ C1727a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C1727a(null);
    }

    public C1726a(C5326w wVar) {
        this.f6004a = wVar;
    }

    /* renamed from: b */
    private final int m7989b(Format format) {
        return (format.f18355g0 <= 0 || format.f18356h0 <= 0) ? 2 : 0;
    }

    /* renamed from: c */
    private final boolean m7990c(Format format) {
        int i = format.f18344W;
        return ((i & 1024) == 0 && (i & DateUtils.FORMAT_NO_NOON) == 0) ? false : true;
    }

    /* renamed from: d */
    private final int m7991d(Format format) {
        String str = format.f18349b0;
        if (str == null) {
            return m7989b(format);
        }
        if (str != null) {
            String str2 = "sampleMimeType!!";
            C12880j.m40222a((Object) str, str2);
            if (C12833x.m40154a((CharSequence) str, (CharSequence) "audio", false, 2, (Object) null)) {
                return 1;
            }
            String str3 = format.f18349b0;
            if (str3 != null) {
                C12880j.m40222a((Object) str3, str2);
                if (C12833x.m40154a((CharSequence) str3, (CharSequence) "video", false, 2, (Object) null)) {
                    return 0;
                }
                C5289a aVar = C5288c.f12654h;
                String str4 = format.f18349b0;
                if (str4 != null) {
                    C12880j.m40222a((Object) str4, str2);
                    if (aVar.mo16866b(str4)) {
                        return 3;
                    }
                    return 2;
                }
                C12880j.m40220a();
                throw null;
            }
            C12880j.m40220a();
            throw null;
        }
        C12880j.m40220a();
        throw null;
    }

    /* renamed from: a */
    public final C5290d mo7711a(Format format) {
        int d = m7991d(format);
        String str = format.f18342U;
        if (str == null) {
            str = format.f18368t0;
        }
        if (str == null) {
            str = format.f18350c;
        }
        if (str == null) {
            str = "";
        }
        String str2 = str;
        if (d == 0) {
            C5293f fVar = new C5293f(format, format.f18349b0, this.f6004a, str2, format.f18355g0, format.f18356h0, format.f18357i0, format.f18345X);
            return fVar;
        } else if (d == 1) {
            C5285a aVar = new C5285a(format, format.f18349b0, this.f6004a, str2, format.f18350c, format.f18368t0, m7990c(format));
            return aVar;
        } else if (d != 3) {
            return new C5290d(format, format.f18349b0, str2, this.f6004a);
        } else {
            C5288c cVar = new C5288c(format, format.f18349b0, this.f6004a, str2, format.f18368t0, C1744b.m8094d(format), m7990c(format));
            return cVar;
        }
    }

    public /* synthetic */ C1726a(C5326w wVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            wVar = null;
        }
        this(wVar);
    }
}
