package com.google.android.exoplayer2.p366s0.p374y;

import com.google.android.exoplayer2.p366s0.C8912g;
import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.C8919n;
import com.google.android.exoplayer2.p366s0.C8920o.C8922b;
import com.google.android.exoplayer2.p366s0.p374y.C9029h0.C9033d;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.io.IOException;
import net.danlew.android.joda.DateUtils;

/* renamed from: com.google.android.exoplayer2.s0.y.h */
/* compiled from: Ac4Extractor */
public final class C9028h implements C8912g {

    /* renamed from: e */
    private static final int f19863e = C9554k0.m29428b("ID3");

    /* renamed from: a */
    private final long f19864a;

    /* renamed from: b */
    private final C9034i f19865b;

    /* renamed from: c */
    private final C9572w f19866c;

    /* renamed from: d */
    private boolean f19867d;

    static {
        C9013b bVar = C9013b.f19791a;
    }

    public C9028h() {
        this(0);
    }

    /* renamed from: b */
    static /* synthetic */ C8912g[] m26694b() {
        return new C8912g[]{new C9028h()};
    }

    /* renamed from: a */
    public void mo23307a() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0041, code lost:
        if ((r4 - r3) < 8192) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        r9.mo23297c();
        r4 = r4 + 1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo23310a(com.google.android.exoplayer2.p366s0.C8913h r9) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            com.google.android.exoplayer2.v0.w r0 = new com.google.android.exoplayer2.v0.w
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.f22333a
            r9.mo23294b(r4, r2, r1)
            r0.mo24693e(r2)
            int r4 = r0.mo24714y()
            int r5 = f19863e
            if (r4 == r5) goto L_0x005e
            r9.mo23297c()
            r9.mo23288a(r3)
            r4 = r3
        L_0x0020:
            r1 = 0
        L_0x0021:
            byte[] r5 = r0.f22333a
            r6 = 7
            r9.mo23294b(r5, r2, r6)
            r0.mo24693e(r2)
            int r5 = r0.mo24676B()
            r6 = 44096(0xac40, float:6.1792E-41)
            if (r5 == r6) goto L_0x0048
            r6 = 44097(0xac41, float:6.1793E-41)
            if (r5 == r6) goto L_0x0048
            r9.mo23297c()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L_0x0044
            return r2
        L_0x0044:
            r9.mo23288a(r4)
            goto L_0x0020
        L_0x0048:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L_0x004e
            return r6
        L_0x004e:
            byte[] r6 = r0.f22333a
            int r5 = com.google.android.exoplayer2.p361p0.C8828h.m25607a(r6, r5)
            r6 = -1
            if (r5 != r6) goto L_0x0058
            return r2
        L_0x0058:
            int r5 = r5 + -7
            r9.mo23288a(r5)
            goto L_0x0021
        L_0x005e:
            r4 = 3
            r0.mo24695f(r4)
            int r4 = r0.mo24710u()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r9.mo23288a(r4)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p366s0.p374y.C9028h.mo23310a(com.google.android.exoplayer2.s0.h):boolean");
    }

    public C9028h(long j) {
        this.f19864a = j;
        this.f19865b = new C9034i();
        this.f19866c = new C9572w((int) DateUtils.FORMAT_ABBREV_TIME);
    }

    /* renamed from: a */
    public void mo23309a(C8914i iVar) {
        this.f19865b.mo23436a(iVar, new C9033d(0, 1));
        iVar.mo23312a();
        iVar.mo23313a(new C8922b(-9223372036854775807L));
    }

    /* renamed from: a */
    public void mo23308a(long j, long j2) {
        this.f19867d = false;
        this.f19865b.mo23434a();
    }

    /* renamed from: a */
    public int mo23306a(C8913h hVar, C8919n nVar) throws IOException, InterruptedException {
        int read = hVar.read(this.f19866c.f22333a, 0, DateUtils.FORMAT_ABBREV_TIME);
        if (read == -1) {
            return -1;
        }
        this.f19866c.mo24693e(0);
        this.f19866c.mo24691d(read);
        if (!this.f19867d) {
            this.f19865b.mo23435a(this.f19864a, 4);
            this.f19867d = true;
        }
        this.f19865b.mo23437a(this.f19866c);
        return 0;
    }
}
