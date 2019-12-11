package com.google.android.exoplayer2.p366s0.p374y;

import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.p366s0.C8908c;
import com.google.android.exoplayer2.p366s0.C8912g;
import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.C8919n;
import com.google.android.exoplayer2.p366s0.C8920o;
import com.google.android.exoplayer2.p366s0.C8920o.C8922b;
import com.google.android.exoplayer2.p366s0.p374y.C9029h0.C9033d;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.p393v0.C9571v;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.io.IOException;
import net.danlew.android.joda.DateUtils;

/* renamed from: com.google.android.exoplayer2.s0.y.j */
/* compiled from: AdtsExtractor */
public final class C9036j implements C8912g {

    /* renamed from: n */
    private static final int f19892n = C9554k0.m29428b("ID3");

    /* renamed from: a */
    private final int f19893a;

    /* renamed from: b */
    private final C9038k f19894b;

    /* renamed from: c */
    private final C9572w f19895c;

    /* renamed from: d */
    private final C9572w f19896d;

    /* renamed from: e */
    private final C9571v f19897e;

    /* renamed from: f */
    private final long f19898f;

    /* renamed from: g */
    private C8914i f19899g;

    /* renamed from: h */
    private long f19900h;

    /* renamed from: i */
    private long f19901i;

    /* renamed from: j */
    private int f19902j;

    /* renamed from: k */
    private boolean f19903k;

    /* renamed from: l */
    private boolean f19904l;

    /* renamed from: m */
    private boolean f19905m;

    static {
        C9015c cVar = C9015c.f19798a;
    }

    public C9036j() {
        this(0);
    }

    /* renamed from: b */
    static /* synthetic */ C8912g[] m26724b() {
        return new C8912g[]{new C9036j()};
    }

    /* renamed from: c */
    private int m26725c(C8913h hVar) throws IOException, InterruptedException {
        int i = 0;
        while (true) {
            hVar.mo23294b(this.f19896d.f22333a, 0, 10);
            this.f19896d.mo24693e(0);
            if (this.f19896d.mo24714y() != f19892n) {
                break;
            }
            this.f19896d.mo24695f(3);
            int u = this.f19896d.mo24710u();
            i += u + 10;
            hVar.mo23288a(u);
        }
        hVar.mo23297c();
        hVar.mo23288a(i);
        if (this.f19901i == -1) {
            this.f19901i = (long) i;
        }
        return i;
    }

    /* renamed from: a */
    public void mo23307a() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0021, code lost:
        r9.mo23297c();
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if ((r3 - r0) < 8192) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo23310a(com.google.android.exoplayer2.p366s0.C8913h r9) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            int r0 = r8.m26725c(r9)
            r1 = 0
            r3 = r0
        L_0x0006:
            r2 = 0
            r4 = 0
        L_0x0008:
            com.google.android.exoplayer2.v0.w r5 = r8.f19896d
            byte[] r5 = r5.f22333a
            r6 = 2
            r9.mo23294b(r5, r1, r6)
            com.google.android.exoplayer2.v0.w r5 = r8.f19896d
            r5.mo24693e(r1)
            com.google.android.exoplayer2.v0.w r5 = r8.f19896d
            int r5 = r5.mo24676B()
            boolean r5 = com.google.android.exoplayer2.p366s0.p374y.C9038k.m26735a(r5)
            if (r5 != 0) goto L_0x0031
            r9.mo23297c()
            int r3 = r3 + 1
            int r2 = r3 - r0
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r2 < r4) goto L_0x002d
            return r1
        L_0x002d:
            r9.mo23288a(r3)
            goto L_0x0006
        L_0x0031:
            r5 = 1
            int r2 = r2 + r5
            r6 = 4
            if (r2 < r6) goto L_0x003b
            r7 = 188(0xbc, float:2.63E-43)
            if (r4 <= r7) goto L_0x003b
            return r5
        L_0x003b:
            com.google.android.exoplayer2.v0.w r5 = r8.f19896d
            byte[] r5 = r5.f22333a
            r9.mo23294b(r5, r1, r6)
            com.google.android.exoplayer2.v0.v r5 = r8.f19897e
            r6 = 14
            r5.mo24667b(r6)
            com.google.android.exoplayer2.v0.v r5 = r8.f19897e
            r6 = 13
            int r5 = r5.mo24660a(r6)
            r6 = 6
            if (r5 > r6) goto L_0x0055
            return r1
        L_0x0055:
            int r6 = r5 + -6
            r9.mo23288a(r6)
            int r4 = r4 + r5
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p366s0.p374y.C9036j.mo23310a(com.google.android.exoplayer2.s0.h):boolean");
    }

    public C9036j(long j) {
        this(j, 0);
    }

    /* renamed from: b */
    private void m26723b(C8913h hVar) throws IOException, InterruptedException {
        if (!this.f19903k) {
            this.f19902j = -1;
            hVar.mo23297c();
            long j = 0;
            if (hVar.getPosition() == 0) {
                m26725c(hVar);
            }
            int i = 0;
            while (true) {
                if (!hVar.mo23296b(this.f19896d.f22333a, 0, 2, true)) {
                    break;
                }
                this.f19896d.mo24693e(0);
                if (!C9038k.m26735a(this.f19896d.mo24676B())) {
                    i = 0;
                    break;
                } else if (!hVar.mo23296b(this.f19896d.f22333a, 0, 4, true)) {
                    break;
                } else {
                    this.f19897e.mo24667b(14);
                    int a = this.f19897e.mo24660a(13);
                    if (a > 6) {
                        j += (long) a;
                        i++;
                        if (i != 1000) {
                            if (!hVar.mo23290a(a - 6, true)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        this.f19903k = true;
                        throw new C8723g0("Malformed ADTS stream");
                    }
                }
            }
            hVar.mo23297c();
            if (i > 0) {
                this.f19902j = (int) (j / ((long) i));
            } else {
                this.f19902j = -1;
            }
            this.f19903k = true;
        }
    }

    public C9036j(long j, int i) {
        this.f19898f = j;
        this.f19900h = j;
        this.f19893a = i;
        this.f19894b = new C9038k(true);
        this.f19895c = new C9572w((int) DateUtils.FORMAT_NO_MIDNIGHT);
        this.f19902j = -1;
        this.f19901i = -1;
        this.f19896d = new C9572w(10);
        this.f19897e = new C9571v(this.f19896d.f22333a);
    }

    /* renamed from: a */
    public void mo23309a(C8914i iVar) {
        this.f19899g = iVar;
        this.f19894b.mo23436a(iVar, new C9033d(0, 1));
        iVar.mo23312a();
    }

    /* renamed from: a */
    public void mo23308a(long j, long j2) {
        this.f19904l = false;
        this.f19894b.mo23434a();
        this.f19900h = this.f19898f + j2;
    }

    /* renamed from: a */
    public int mo23306a(C8913h hVar, C8919n nVar) throws IOException, InterruptedException {
        long a = hVar.mo23287a();
        boolean z = ((this.f19893a & 1) == 0 || a == -1) ? false : true;
        if (z) {
            m26723b(hVar);
        }
        int read = hVar.read(this.f19895c.f22333a, 0, DateUtils.FORMAT_NO_MIDNIGHT);
        boolean z2 = read == -1;
        m26722a(a, z, z2);
        if (z2) {
            return -1;
        }
        this.f19895c.mo24693e(0);
        this.f19895c.mo24691d(read);
        if (!this.f19904l) {
            this.f19894b.mo23435a(this.f19900h, 4);
            this.f19904l = true;
        }
        this.f19894b.mo23437a(this.f19895c);
        return 0;
    }

    /* renamed from: a */
    private void m26722a(long j, boolean z, boolean z2) {
        if (!this.f19905m) {
            boolean z3 = z && this.f19902j > 0;
            if (!z3 || this.f19894b.mo23446c() != -9223372036854775807L || z2) {
                C8914i iVar = this.f19899g;
                C9537e.m29296a(iVar);
                C8914i iVar2 = iVar;
                if (!z3 || this.f19894b.mo23446c() == -9223372036854775807L) {
                    iVar2.mo23313a(new C8922b(-9223372036854775807L));
                } else {
                    iVar2.mo23313a(m26721a(j));
                }
                this.f19905m = true;
            }
        }
    }

    /* renamed from: a */
    private C8920o m26721a(long j) {
        long j2 = j;
        C8908c cVar = new C8908c(j2, this.f19901i, m26720a(this.f19902j, this.f19894b.mo23446c()), this.f19902j);
        return cVar;
    }

    /* renamed from: a */
    private static int m26720a(int i, long j) {
        return (int) ((((long) (i * 8)) * 1000000) / j);
    }
}
