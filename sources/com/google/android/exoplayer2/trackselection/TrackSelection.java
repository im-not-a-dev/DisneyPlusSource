package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.C9199j0;
import com.google.android.exoplayer2.source.p379m0.C9224l;
import com.google.android.exoplayer2.source.p379m0.C9225m;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.trackselection.j */
/* compiled from: TrackSelection */
public interface TrackSelection {

    /* renamed from: com.google.android.exoplayer2.trackselection.j$a */
    /* compiled from: TrackSelection */
    public static final class C9312a {

        /* renamed from: a */
        public final C9199j0 f21295a;

        /* renamed from: b */
        public final int[] f21296b;

        /* renamed from: c */
        public final int f21297c;

        /* renamed from: d */
        public final Object f21298d;

        public C9312a(C9199j0 j0Var, int... iArr) {
            this(j0Var, iArr, 0, null);
        }

        public C9312a(C9199j0 j0Var, int[] iArr, int i, Object obj) {
            this.f21295a = j0Var;
            this.f21296b = iArr;
            this.f21297c = i;
            this.f21298d = obj;
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.j$b */
    /* compiled from: TrackSelection */
    public interface C9313b {
        /* renamed from: a */
        TrackSelection[] mo24064a(C9312a[] aVarArr, BandwidthMeter bandwidthMeter);
    }

    /* renamed from: a */
    int mo24051a(long j, List<? extends C9224l> list);

    /* renamed from: a */
    int mo24065a(Format format);

    /* renamed from: a */
    Format mo24066a(int i);

    /* renamed from: a */
    C9199j0 mo24067a();

    /* renamed from: a */
    void mo24052a(float f);

    @Deprecated
    /* renamed from: a */
    void mo24068a(long j, long j2, long j3);

    /* renamed from: a */
    void mo23813a(long j, long j2, long j3, List<? extends C9224l> list, C9225m[] mVarArr);

    /* renamed from: a */
    boolean mo24069a(int i, long j);

    /* renamed from: b */
    int mo23814b();

    /* renamed from: b */
    int mo24070b(int i);

    /* renamed from: c */
    int mo24072c(int i);

    /* renamed from: c */
    void mo24058c();

    /* renamed from: d */
    int mo24073d();

    /* renamed from: e */
    void mo24074e();

    /* renamed from: f */
    Format mo24076f();

    /* renamed from: g */
    int mo23815g();

    /* renamed from: h */
    Object mo23816h();

    /* renamed from: i */
    void mo24078i();

    int length();
}
