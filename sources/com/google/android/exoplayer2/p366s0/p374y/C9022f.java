package com.google.android.exoplayer2.p366s0.p374y;

import com.google.android.exoplayer2.p366s0.C8912g;
import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.C8919n;
import com.google.android.exoplayer2.p366s0.C8920o.C8922b;
import com.google.android.exoplayer2.p366s0.p374y.C9029h0.C9033d;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.s0.y.f */
/* compiled from: Ac3Extractor */
public final class C9022f implements C8912g {

    /* renamed from: e */
    private static final int f19809e = Util.m29428b("ID3");

    /* renamed from: a */
    private final long f19810a;

    /* renamed from: b */
    private final C9024g f19811b;

    /* renamed from: c */
    private final C9572w f19812c;

    /* renamed from: d */
    private boolean f19813d;

    static {
        C9011a aVar = C9011a.f19790a;
    }

    public C9022f() {
        this(0);
    }

    /* renamed from: b */
    static /* synthetic */ C8912g[] m26636b() {
        return new C8912g[]{new C9022f()};
    }

    /* renamed from: a */
    public void mo23307a() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0032, code lost:
        r8.mo23297c();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003b, code lost:
        if ((r4 - r3) < 8192) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo23310a(com.google.android.exoplayer2.p366s0.C8913h r8) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r7 = this;
            com.google.android.exoplayer2.v0.w r0 = new com.google.android.exoplayer2.v0.w
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.f22333a
            r8.mo23294b(r4, r2, r1)
            r0.mo24693e(r2)
            int r4 = r0.mo24714y()
            int r5 = f19809e
            if (r4 == r5) goto L_0x0058
            r8.mo23297c()
            r8.mo23288a(r3)
            r4 = r3
        L_0x0020:
            r1 = 0
        L_0x0021:
            byte[] r5 = r0.f22333a
            r6 = 6
            r8.mo23294b(r5, r2, r6)
            r0.mo24693e(r2)
            int r5 = r0.mo24676B()
            r6 = 2935(0xb77, float:4.113E-42)
            if (r5 == r6) goto L_0x0042
            r8.mo23297c()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L_0x003e
            return r2
        L_0x003e:
            r8.mo23288a(r4)
            goto L_0x0020
        L_0x0042:
            r5 = 1
            int r1 = r1 + r5
            r6 = 4
            if (r1 < r6) goto L_0x0048
            return r5
        L_0x0048:
            byte[] r5 = r0.f22333a
            int r5 = com.google.android.exoplayer2.p361p0.C8825g.m25599a(r5)
            r6 = -1
            if (r5 != r6) goto L_0x0052
            return r2
        L_0x0052:
            int r5 = r5 + -6
            r8.mo23288a(r5)
            goto L_0x0021
        L_0x0058:
            r4 = 3
            r0.mo24695f(r4)
            int r4 = r0.mo24710u()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r8.mo23288a(r4)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p366s0.p374y.C9022f.mo23310a(com.google.android.exoplayer2.s0.h):boolean");
    }

    public C9022f(long j) {
        this.f19810a = j;
        this.f19811b = new C9024g();
        this.f19812c = new C9572w(2786);
    }

    /* renamed from: a */
    public void mo23309a(C8914i iVar) {
        this.f19811b.mo23436a(iVar, new C9033d(0, 1));
        iVar.mo23312a();
        iVar.mo23313a(new C8922b(-9223372036854775807L));
    }

    /* renamed from: a */
    public void mo23308a(long j, long j2) {
        this.f19813d = false;
        this.f19811b.mo23434a();
    }

    /* renamed from: a */
    public int mo23306a(C8913h hVar, C8919n nVar) throws IOException, InterruptedException {
        int read = hVar.read(this.f19812c.f22333a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.f19812c.mo24693e(0);
        this.f19812c.mo24691d(read);
        if (!this.f19813d) {
            this.f19811b.mo23435a(this.f19810a, 4);
            this.f19813d = true;
        }
        this.f19811b.mo23437a(this.f19812c);
        return 0;
    }
}
