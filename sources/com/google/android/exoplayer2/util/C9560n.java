package com.google.android.exoplayer2.util;

/* renamed from: com.google.android.exoplayer2.v0.n */
/* compiled from: FlacStreamMetadata */
public final class C9560n {

    /* renamed from: a */
    public final int f22297a;

    /* renamed from: b */
    public final int f22298b;

    /* renamed from: c */
    public final int f22299c;

    /* renamed from: d */
    public final long f22300d;

    public C9560n(byte[] bArr, int i) {
        C9571v vVar = new C9571v(bArr);
        vVar.mo24667b(i * 8);
        vVar.mo24660a(16);
        vVar.mo24660a(16);
        vVar.mo24660a(24);
        vVar.mo24660a(24);
        this.f22297a = vVar.mo24660a(20);
        this.f22298b = vVar.mo24660a(3) + 1;
        this.f22299c = vVar.mo24660a(5) + 1;
        this.f22300d = ((((long) vVar.mo24660a(4)) & 15) << 32) | (((long) vVar.mo24660a(32)) & 4294967295L);
    }

    /* renamed from: a */
    public int mo24653a() {
        return this.f22299c * this.f22297a;
    }

    /* renamed from: b */
    public long mo24654b() {
        return (this.f22300d * 1000000) / ((long) this.f22297a);
    }
}
