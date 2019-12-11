package com.google.android.exoplayer2.p366s0.p375z;

import com.google.android.exoplayer2.p366s0.C8920o;
import com.google.android.exoplayer2.p366s0.C8920o.C8921a;
import com.google.android.exoplayer2.p366s0.C8923p;
import com.google.android.exoplayer2.p393v0.Util;

/* renamed from: com.google.android.exoplayer2.s0.z.c */
/* compiled from: WavHeader */
final class C9064c implements C8920o {

    /* renamed from: a */
    private final int f20137a;

    /* renamed from: b */
    private final int f20138b;

    /* renamed from: c */
    private final int f20139c;

    /* renamed from: d */
    private final int f20140d;

    /* renamed from: e */
    private final int f20141e;

    /* renamed from: f */
    private final int f20142f;

    /* renamed from: g */
    private int f20143g = -1;

    /* renamed from: h */
    private long f20144h = -1;

    public C9064c(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f20137a = i;
        this.f20138b = i2;
        this.f20139c = i3;
        this.f20140d = i4;
        this.f20141e = i5;
        this.f20142f = i6;
    }

    /* renamed from: a */
    public void mo23478a(int i, long j) {
        this.f20143g = i;
        this.f20144h = j;
    }

    /* renamed from: b */
    public long mo23479b() {
        return this.f20144h;
    }

    /* renamed from: c */
    public boolean mo23279c() {
        return true;
    }

    /* renamed from: d */
    public long mo23280d() {
        return (((this.f20144h - ((long) this.f20143g)) / ((long) this.f20140d)) * 1000000) / ((long) this.f20138b);
    }

    /* renamed from: e */
    public int mo23480e() {
        return this.f20140d;
    }

    /* renamed from: f */
    public int mo23481f() {
        return this.f20143g;
    }

    /* renamed from: g */
    public int mo23482g() {
        return this.f20142f;
    }

    /* renamed from: h */
    public int mo23483h() {
        return this.f20137a;
    }

    /* renamed from: i */
    public int mo23484i() {
        return this.f20138b;
    }

    /* renamed from: j */
    public boolean mo23485j() {
        return this.f20143g != -1;
    }

    /* renamed from: b */
    public C8921a mo23277b(long j) {
        long j2 = this.f20144h - ((long) this.f20143g);
        long j3 = (((long) this.f20139c) * j) / 1000000;
        int i = this.f20140d;
        long b = Util.m29431b((j3 / ((long) i)) * ((long) i), 0, j2 - ((long) i));
        long j4 = ((long) this.f20143g) + b;
        long a = mo23477a(j4);
        C8923p pVar = new C8923p(a, j4);
        if (a < j) {
            int i2 = this.f20140d;
            if (b != j2 - ((long) i2)) {
                long j5 = j4 + ((long) i2);
                return new C8921a(pVar, new C8923p(mo23477a(j5), j5));
            }
        }
        return new C8921a(pVar);
    }

    /* renamed from: a */
    public long mo23477a(long j) {
        return (Math.max(0, j - ((long) this.f20143g)) * 1000000) / ((long) this.f20139c);
    }

    /* renamed from: a */
    public int mo23476a() {
        return this.f20138b * this.f20141e * this.f20137a;
    }
}
