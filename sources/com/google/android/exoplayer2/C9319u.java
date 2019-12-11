package com.google.android.exoplayer2;

import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.upstream.C9491f;
import com.google.android.exoplayer2.upstream.C9509o;
import net.danlew.android.joda.DateUtils;

/* renamed from: com.google.android.exoplayer2.u */
/* compiled from: DefaultLoadControl */
public class C9319u implements LoadControl {

    /* renamed from: a */
    private final C9509o f21314a;

    /* renamed from: b */
    private final long f21315b;

    /* renamed from: c */
    private final long f21316c;

    /* renamed from: d */
    private final long f21317d;

    /* renamed from: e */
    private final long f21318e;

    /* renamed from: f */
    private final long f21319f;

    /* renamed from: g */
    private final int f21320g;

    /* renamed from: h */
    private final boolean f21321h;

    /* renamed from: i */
    private final long f21322i;

    /* renamed from: j */
    private final boolean f21323j;

    /* renamed from: k */
    private int f21324k;

    /* renamed from: l */
    private boolean f21325l;

    /* renamed from: m */
    private boolean f21326m;

    /* renamed from: com.google.android.exoplayer2.u$a */
    /* compiled from: DefaultLoadControl */
    public static final class C9320a {

        /* renamed from: a */
        private C9509o f21327a;

        /* renamed from: b */
        private int f21328b = 15000;

        /* renamed from: c */
        private int f21329c = 50000;

        /* renamed from: d */
        private int f21330d = 50000;

        /* renamed from: e */
        private int f21331e = 2500;

        /* renamed from: f */
        private int f21332f = 5000;

        /* renamed from: g */
        private int f21333g = -1;

        /* renamed from: h */
        private boolean f21334h = true;

        /* renamed from: i */
        private int f21335i = 0;

        /* renamed from: j */
        private boolean f21336j = false;

        /* renamed from: k */
        private boolean f21337k;

        /* renamed from: a */
        public C9320a mo24138a(int i) {
            C9537e.m29301b(!this.f21337k);
            this.f21333g = i;
            return this;
        }

        /* renamed from: a */
        public C9319u mo24139a() {
            C9537e.m29301b(!this.f21337k);
            this.f21337k = true;
            if (this.f21327a == null) {
                this.f21327a = new C9509o(true, DateUtils.FORMAT_ABBREV_MONTH);
            }
            C9319u uVar = new C9319u(this.f21327a, this.f21328b, this.f21329c, this.f21330d, this.f21331e, this.f21332f, this.f21333g, this.f21334h, this.f21335i, this.f21336j);
            return uVar;
        }
    }

    public C9319u() {
        this(new C9509o(true, DateUtils.FORMAT_ABBREV_MONTH));
    }

    /* renamed from: a */
    public void mo7721a() {
        m28330a(false);
    }

    /* renamed from: b */
    public boolean mo7726b() {
        return this.f21323j;
    }

    /* renamed from: c */
    public long mo7727c() {
        return this.f21322i;
    }

    /* renamed from: d */
    public void mo7728d() {
        m28330a(true);
    }

    /* renamed from: e */
    public C9491f mo7729e() {
        return this.f21314a;
    }

    /* renamed from: f */
    public void mo7730f() {
        m28330a(true);
    }

    @Deprecated
    public C9319u(C9509o oVar) {
        this(oVar, 15000, 50000, 50000, 2500, 5000, -1, true, 0, false);
    }

    /* renamed from: b */
    private static boolean m28331b(C8733l0[] l0VarArr, TrackSelectionArray trackSelectionArray) {
        for (int i = 0; i < l0VarArr.length; i++) {
            if (l0VarArr[i].mo22847f() == 2 && trackSelectionArray.mo24040a(i) != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo7723a(C8733l0[] l0VarArr, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        this.f21326m = m28331b(l0VarArr, trackSelectionArray);
        int i = this.f21320g;
        if (i == -1) {
            i = mo24137a(l0VarArr, trackSelectionArray);
        }
        this.f21324k = i;
        this.f21314a.mo24575a(this.f21324k);
    }

    protected C9319u(C9509o oVar, int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7, boolean z2) {
        int i8 = i;
        int i9 = i2;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        int i13 = i7;
        String str = "0";
        String str2 = "bufferForPlaybackMs";
        m28329a(i11, 0, str2, str);
        String str3 = "bufferForPlaybackAfterRebufferMs";
        m28329a(i12, 0, str3, str);
        String str4 = "minBufferAudioMs";
        m28329a(i, i11, str4, str2);
        String str5 = "minBufferVideoMs";
        m28329a(i9, i11, str5, str2);
        m28329a(i, i12, str4, str3);
        m28329a(i9, i12, str5, str3);
        String str6 = "maxBufferMs";
        m28329a(i10, i, str6, str4);
        m28329a(i10, i9, str6, str5);
        m28329a(i13, 0, "backBufferDurationMs", str);
        this.f21314a = oVar;
        this.f21315b = C8883r.m25967a((long) i8);
        this.f21316c = C8883r.m25967a((long) i9);
        this.f21317d = C8883r.m25967a((long) i10);
        this.f21318e = C8883r.m25967a((long) i11);
        this.f21319f = C8883r.m25967a((long) i12);
        this.f21320g = i6;
        this.f21321h = z;
        this.f21322i = C8883r.m25967a((long) i13);
        this.f21323j = z2;
    }

    /* renamed from: a */
    public boolean mo7724a(long j, float f) {
        boolean z = true;
        boolean z2 = this.f21314a.mo24576d() >= this.f21324k;
        long j2 = this.f21326m ? this.f21316c : this.f21315b;
        if (f > 1.0f) {
            j2 = Math.min(C9554k0.m29387a(j2, f), this.f21317d);
        }
        if (j < j2) {
            if (!this.f21321h && z2) {
                z = false;
            }
            this.f21325l = z;
        } else if (j >= this.f21317d || z2) {
            this.f21325l = false;
        }
        return this.f21325l;
    }

    /* renamed from: a */
    public boolean mo7725a(long j, float f, boolean z) {
        long b = C9554k0.m29430b(j, f);
        long j2 = z ? this.f21319f : this.f21318e;
        return j2 <= 0 || b >= j2 || (!this.f21321h && this.f21314a.mo24576d() >= this.f21324k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo24137a(C8733l0[] l0VarArr, TrackSelectionArray trackSelectionArray) {
        int i = 0;
        for (int i2 = 0; i2 < l0VarArr.length; i2++) {
            if (trackSelectionArray.mo24040a(i2) != null) {
                i += m28328a(l0VarArr[i2].mo22847f());
            }
        }
        return i;
    }

    /* renamed from: a */
    private void m28330a(boolean z) {
        this.f21324k = 0;
        this.f21325l = false;
        if (z) {
            this.f21314a.mo24577e();
        }
    }

    /* renamed from: a */
    private static int m28328a(int i) {
        switch (i) {
            case 0:
                return 36438016;
            case 1:
                return 3538944;
            case 2:
                return 32768000;
            case 3:
            case 4:
            case 5:
                return DateUtils.FORMAT_NUMERIC_DATE;
            case 6:
                return 0;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    private static void m28329a(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        C9537e.m29300a(z, (Object) sb.toString());
    }
}
