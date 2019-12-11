package com.google.android.exoplayer2.p366s0.p371v;

import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.util.C9572w;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.s0.v.o */
/* compiled from: TrackFragment */
final class C8985o {

    /* renamed from: a */
    public C8968e f19678a;

    /* renamed from: b */
    public long f19679b;

    /* renamed from: c */
    public long f19680c;

    /* renamed from: d */
    public long f19681d;

    /* renamed from: e */
    public int f19682e;

    /* renamed from: f */
    public int f19683f;

    /* renamed from: g */
    public long[] f19684g;

    /* renamed from: h */
    public int[] f19685h;

    /* renamed from: i */
    public int[] f19686i;

    /* renamed from: j */
    public int[] f19687j;

    /* renamed from: k */
    public long[] f19688k;

    /* renamed from: l */
    public boolean[] f19689l;

    /* renamed from: m */
    public boolean f19690m;

    /* renamed from: n */
    public boolean[] f19691n;

    /* renamed from: o */
    public C8984n f19692o;

    /* renamed from: p */
    public int f19693p;

    /* renamed from: q */
    public C9572w f19694q;

    /* renamed from: r */
    public boolean f19695r;

    /* renamed from: s */
    public long f19696s;

    C8985o() {
    }

    /* renamed from: a */
    public void mo23387a() {
        this.f19682e = 0;
        this.f19696s = 0;
        this.f19690m = false;
        this.f19695r = false;
        this.f19692o = null;
    }

    /* renamed from: b */
    public void mo23391b(int i) {
        C9572w wVar = this.f19694q;
        if (wVar == null || wVar.mo24690d() < i) {
            this.f19694q = new C9572w(i);
        }
        this.f19693p = i;
        this.f19690m = true;
        this.f19695r = true;
    }

    /* renamed from: c */
    public boolean mo23392c(int i) {
        return this.f19690m && this.f19691n[i];
    }

    /* renamed from: a */
    public void mo23388a(int i, int i2) {
        this.f19682e = i;
        this.f19683f = i2;
        int[] iArr = this.f19685h;
        if (iArr == null || iArr.length < i) {
            this.f19684g = new long[i];
            this.f19685h = new int[i];
        }
        int[] iArr2 = this.f19686i;
        if (iArr2 == null || iArr2.length < i2) {
            int i3 = (i2 * 125) / 100;
            this.f19686i = new int[i3];
            this.f19687j = new int[i3];
            this.f19688k = new long[i3];
            this.f19689l = new boolean[i3];
            this.f19691n = new boolean[i3];
        }
    }

    /* renamed from: a */
    public void mo23389a(C8913h hVar) throws IOException, InterruptedException {
        hVar.mo23289a(this.f19694q.f22333a, 0, this.f19693p);
        this.f19694q.mo24693e(0);
        this.f19695r = false;
    }

    /* renamed from: a */
    public void mo23390a(C9572w wVar) {
        wVar.mo24685a(this.f19694q.f22333a, 0, this.f19693p);
        this.f19694q.mo24693e(0);
        this.f19695r = false;
    }

    /* renamed from: a */
    public long mo23386a(int i) {
        return this.f19688k[i] + ((long) this.f19687j[i]);
    }
}
