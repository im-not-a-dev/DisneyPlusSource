package com.google.android.exoplayer2.trackselection;

import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.source.C9199j0;
import com.google.android.exoplayer2.source.p379m0.C9224l;
import com.google.android.exoplayer2.source.p379m0.C9225m;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.trackselection.c */
/* compiled from: BaseTrackSelection */
public abstract class C9292c implements C9311j {

    /* renamed from: a */
    protected final C9199j0 f21202a;

    /* renamed from: b */
    protected final int f21203b;

    /* renamed from: c */
    protected final int[] f21204c;

    /* renamed from: d */
    private final Format[] f21205d;

    /* renamed from: e */
    private final long[] f21206e;

    /* renamed from: f */
    private int f21207f;

    /* renamed from: com.google.android.exoplayer2.trackselection.c$b */
    /* compiled from: BaseTrackSelection */
    private static final class C9294b implements Comparator<Format> {
        private C9294b() {
        }

        /* renamed from: a */
        public int compare(Format format, Format format2) {
            return format2.f18345X - format.f18345X;
        }
    }

    public C9292c(C9199j0 j0Var, int... iArr) {
        int i = 0;
        C9537e.m29301b(iArr.length > 0);
        C9537e.m29296a(j0Var);
        this.f21202a = j0Var;
        this.f21203b = iArr.length;
        this.f21205d = new Format[this.f21203b];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f21205d[i2] = j0Var.mo23902a(iArr[i2]);
        }
        Arrays.sort(this.f21205d, new C9294b());
        this.f21204c = new int[this.f21203b];
        while (true) {
            int i3 = this.f21203b;
            if (i < i3) {
                this.f21204c[i] = j0Var.mo23901a(this.f21205d[i]);
                i++;
            } else {
                this.f21206e = new long[i3];
                return;
            }
        }
    }

    /* renamed from: a */
    public final C9199j0 mo24067a() {
        return this.f21202a;
    }

    /* renamed from: a */
    public void mo24052a(float f) {
    }

    @Deprecated
    /* renamed from: a */
    public /* synthetic */ void mo24068a(long j, long j2, long j3) {
        C9310i.m28300a(this, j, j2, j3);
    }

    /* renamed from: a */
    public /* synthetic */ void mo23813a(long j, long j2, long j3, List<? extends C9224l> list, C9225m[] mVarArr) {
        C9310i.m28301a(this, j, j2, j3, list, mVarArr);
    }

    /* renamed from: b */
    public final int mo24070b(int i) {
        return this.f21204c[i];
    }

    /* renamed from: c */
    public final int mo24072c(int i) {
        for (int i2 = 0; i2 < this.f21203b; i2++) {
            if (this.f21204c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public void mo24058c() {
    }

    /* renamed from: d */
    public final int mo24073d() {
        return this.f21204c[mo23814b()];
    }

    /* renamed from: e */
    public void mo24074e() {
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9292c cVar = (C9292c) obj;
        if (this.f21202a != cVar.f21202a || !Arrays.equals(this.f21204c, cVar.f21204c)) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public final Format mo24076f() {
        return this.f21205d[mo23814b()];
    }

    public int hashCode() {
        if (this.f21207f == 0) {
            this.f21207f = (System.identityHashCode(this.f21202a) * 31) + Arrays.hashCode(this.f21204c);
        }
        return this.f21207f;
    }

    /* renamed from: i */
    public /* synthetic */ void mo24078i() {
        C9310i.m28299a(this);
    }

    public final int length() {
        return this.f21204c.length;
    }

    /* renamed from: a */
    public final Format mo24066a(int i) {
        return this.f21205d[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo24071b(int i, long j) {
        return this.f21206e[i] > j;
    }

    /* renamed from: a */
    public final int mo24065a(Format format) {
        for (int i = 0; i < this.f21203b; i++) {
            if (this.f21205d[i] == format) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public int mo24051a(long j, List<? extends C9224l> list) {
        return list.size();
    }

    /* renamed from: a */
    public final boolean mo24069a(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean b = mo24071b(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.f21203b && !b) {
            b = i2 != i && !mo24071b(i2, elapsedRealtime);
            i2++;
        }
        if (!b) {
            return false;
        }
        long[] jArr = this.f21206e;
        jArr[i] = Math.max(jArr[i], C9554k0.m29389a(elapsedRealtime, j, Long.MAX_VALUE));
        return true;
    }
}
