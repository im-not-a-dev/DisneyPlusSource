package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.Collections;
import java.util.List;

public final class HlsMediaPlaylist extends HlsPlaylist {

    /* renamed from: d */
    public final int f20690d;

    /* renamed from: e */
    public final long f20691e;

    /* renamed from: f */
    public final long f20692f;

    /* renamed from: g */
    public final boolean f20693g;

    /* renamed from: h */
    public final int f20694h;

    /* renamed from: i */
    public final long f20695i;

    /* renamed from: j */
    public final int f20696j;

    /* renamed from: k */
    public final long f20697k;

    /* renamed from: l */
    public final boolean f20698l;

    /* renamed from: m */
    public final boolean f20699m;

    /* renamed from: n */
    public final DrmInitData f20700n;

    /* renamed from: o */
    public final List<C9176a> f20701o;

    /* renamed from: p */
    public final long f20702p;

    /* renamed from: com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$a */
    public static final class C9176a implements Comparable<Long> {

        /* renamed from: U */
        public final C9176a f20703U;

        /* renamed from: V */
        public final long f20704V;

        /* renamed from: W */
        public final int f20705W;

        /* renamed from: X */
        public final long f20706X;

        /* renamed from: Y */
        public final DrmInitData f20707Y;

        /* renamed from: Z */
        public final String f20708Z;

        /* renamed from: a0 */
        public final String f20709a0;

        /* renamed from: b0 */
        public final long f20710b0;

        /* renamed from: c */
        public final String f20711c;

        /* renamed from: c0 */
        public final long f20712c0;

        /* renamed from: d0 */
        public final boolean f20713d0;

        public C9176a(String str, long j, long j2, String str2, String str3) {
            String str4 = "";
            this(str, null, str4, 0, -1, -9223372036854775807L, null, str2, str3, j, j2, false);
        }

        /* renamed from: a */
        public int compareTo(Long l) {
            if (this.f20706X > l.longValue()) {
                return 1;
            }
            return this.f20706X < l.longValue() ? -1 : 0;
        }

        public C9176a(String str, C9176a aVar, String str2, long j, int i, long j2, DrmInitData drmInitData, String str3, String str4, long j3, long j4, boolean z) {
            this.f20711c = str;
            this.f20703U = aVar;
            this.f20704V = j;
            this.f20705W = i;
            this.f20706X = j2;
            this.f20707Y = drmInitData;
            this.f20708Z = str3;
            this.f20709a0 = str4;
            this.f20710b0 = j3;
            this.f20712c0 = j4;
            this.f20713d0 = z;
        }
    }

    public HlsMediaPlaylist(int i, String str, List<String> list, long j, long j2, boolean z, int i2, long j3, int i3, long j4, boolean z2, boolean z3, boolean z4, DrmInitData drmInitData, List<C9176a> list2) {
        String str2 = str;
        List<String> list3 = list;
        super(str, list, z2);
        this.f20690d = i;
        this.f20692f = j2;
        this.f20693g = z;
        this.f20694h = i2;
        this.f20695i = j3;
        this.f20696j = i3;
        this.f20697k = j4;
        this.f20698l = z3;
        this.f20699m = z4;
        this.f20700n = drmInitData;
        this.f20701o = Collections.unmodifiableList(list2);
        if (!list2.isEmpty()) {
            C9176a aVar = (C9176a) list2.get(list2.size() - 1);
            this.f20702p = aVar.f20706X + aVar.f20704V;
        } else {
            this.f20702p = 0;
        }
        long j5 = j == -9223372036854775807L ? -9223372036854775807L : j >= 0 ? j : this.f20702p + j;
        this.f20691e = j5;
    }

    /* renamed from: a */
    public HlsMediaPlaylist m27587a(List<StreamKey> list) {
        return this;
    }

    /* renamed from: b */
    public long mo23865b() {
        return this.f20692f + this.f20702p;
    }

    /* renamed from: a */
    public boolean mo23864a(HlsMediaPlaylist hlsMediaPlaylist) {
        boolean z = true;
        if (hlsMediaPlaylist != null) {
            long j = this.f20695i;
            long j2 = hlsMediaPlaylist.f20695i;
            if (j <= j2) {
                if (j < j2) {
                    return false;
                }
                int size = this.f20701o.size();
                int size2 = hlsMediaPlaylist.f20701o.size();
                if (size <= size2 && (size != size2 || !this.f20698l || hlsMediaPlaylist.f20698l)) {
                    z = false;
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public HlsMediaPlaylist mo23863a(long j, int i) {
        HlsMediaPlaylist hlsMediaPlaylist = new HlsMediaPlaylist(this.f20690d, this.f20714a, this.f20715b, this.f20691e, j, true, i, this.f20695i, this.f20696j, this.f20697k, this.f20716c, this.f20698l, this.f20699m, this.f20700n, this.f20701o);
        return hlsMediaPlaylist;
    }

    /* renamed from: a */
    public HlsMediaPlaylist mo23862a() {
        if (this.f20698l) {
            return this;
        }
        HlsMediaPlaylist hlsMediaPlaylist = r2;
        HlsMediaPlaylist hlsMediaPlaylist2 = new HlsMediaPlaylist(this.f20690d, this.f20714a, this.f20715b, this.f20691e, this.f20692f, this.f20693g, this.f20694h, this.f20695i, this.f20696j, this.f20697k, this.f20716c, true, this.f20699m, this.f20700n, this.f20701o);
        return hlsMediaPlaylist;
    }
}
