package com.google.android.exoplayer2.p366s0.p368s;

import com.google.android.exoplayer2.p366s0.C8912g;
import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.C8919n;
import com.google.android.exoplayer2.p366s0.C8920o.C8922b;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.C9572w;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.s0.s.c */
/* compiled from: FlvExtractor */
public final class C8930c implements C8912g {

    /* renamed from: q */
    private static final int f19201q = Util.m29428b("FLV");

    /* renamed from: a */
    private final C9572w f19202a = new C9572w(4);

    /* renamed from: b */
    private final C9572w f19203b = new C9572w(9);

    /* renamed from: c */
    private final C9572w f19204c = new C9572w(11);

    /* renamed from: d */
    private final C9572w f19205d = new C9572w();

    /* renamed from: e */
    private final C8931d f19206e = new C8931d();

    /* renamed from: f */
    private C8914i f19207f;

    /* renamed from: g */
    private int f19208g = 1;

    /* renamed from: h */
    private boolean f19209h;

    /* renamed from: i */
    private long f19210i;

    /* renamed from: j */
    private int f19211j;

    /* renamed from: k */
    private int f19212k;

    /* renamed from: l */
    private int f19213l;

    /* renamed from: m */
    private long f19214m;

    /* renamed from: n */
    private boolean f19215n;

    /* renamed from: o */
    private C8929b f19216o;

    /* renamed from: p */
    private C8934f f19217p;

    static {
        C8928a aVar = C8928a.f19196a;
    }

    /* renamed from: b */
    private C9572w m26206b(C8913h hVar) throws IOException, InterruptedException {
        if (this.f19213l > this.f19205d.mo24686b()) {
            C9572w wVar = this.f19205d;
            wVar.mo24684a(new byte[Math.max(wVar.mo24686b() * 2, this.f19213l)], 0);
        } else {
            this.f19205d.mo24693e(0);
        }
        this.f19205d.mo24691d(this.f19213l);
        hVar.mo23289a(this.f19205d.f22333a, 0, this.f19213l);
        return this.f19205d;
    }

    /* renamed from: c */
    private boolean m26209c(C8913h hVar) throws IOException, InterruptedException {
        boolean z = false;
        if (!hVar.mo23291a(this.f19203b.f22333a, 0, 9, true)) {
            return false;
        }
        this.f19203b.mo24693e(0);
        this.f19203b.mo24695f(4);
        int v = this.f19203b.mo24711v();
        boolean z2 = (v & 4) != 0;
        if ((v & 1) != 0) {
            z = true;
        }
        if (z2 && this.f19216o == null) {
            this.f19216o = new C8929b(this.f19207f.mo23311a(8, 1));
        }
        if (z && this.f19217p == null) {
            this.f19217p = new C8934f(this.f19207f.mo23311a(9, 2));
        }
        this.f19207f.mo23312a();
        this.f19211j = (this.f19203b.mo24698i() - 9) + 4;
        this.f19208g = 2;
        return true;
    }

    /* renamed from: d */
    static /* synthetic */ C8912g[] m26211d() {
        return new C8912g[]{new C8930c()};
    }

    /* renamed from: e */
    private boolean m26212e(C8913h hVar) throws IOException, InterruptedException {
        if (!hVar.mo23291a(this.f19204c.f22333a, 0, 11, true)) {
            return false;
        }
        this.f19204c.mo24693e(0);
        this.f19212k = this.f19204c.mo24711v();
        this.f19213l = this.f19204c.mo24714y();
        this.f19214m = (long) this.f19204c.mo24714y();
        this.f19214m = (((long) (this.f19204c.mo24711v() << 24)) | this.f19214m) * 1000;
        this.f19204c.mo24695f(3);
        this.f19208g = 4;
        return true;
    }

    /* renamed from: f */
    private void m26213f(C8913h hVar) throws IOException, InterruptedException {
        hVar.mo23298c(this.f19211j);
        this.f19211j = 0;
        this.f19208g = 3;
    }

    /* renamed from: a */
    public void mo23307a() {
    }

    /* renamed from: a */
    public boolean mo23310a(C8913h hVar) throws IOException, InterruptedException {
        boolean z = false;
        hVar.mo23294b(this.f19202a.f22333a, 0, 3);
        this.f19202a.mo24693e(0);
        if (this.f19202a.mo24714y() != f19201q) {
            return false;
        }
        hVar.mo23294b(this.f19202a.f22333a, 0, 2);
        this.f19202a.mo24693e(0);
        if ((this.f19202a.mo24676B() & 250) != 0) {
            return false;
        }
        hVar.mo23294b(this.f19202a.f22333a, 0, 4);
        this.f19202a.mo24693e(0);
        int i = this.f19202a.mo24698i();
        hVar.mo23297c();
        hVar.mo23288a(i);
        hVar.mo23294b(this.f19202a.f22333a, 0, 4);
        this.f19202a.mo24693e(0);
        if (this.f19202a.mo24698i() == 0) {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0083  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m26210d(com.google.android.exoplayer2.p366s0.C8913h r9) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            long r0 = r8.m26208c()
            int r2 = r8.f19212k
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r6 = 1
            r7 = 8
            if (r2 != r7) goto L_0x0024
            com.google.android.exoplayer2.s0.s.b r2 = r8.f19216o
            if (r2 == 0) goto L_0x0024
            r8.m26207b()
            com.google.android.exoplayer2.s0.s.b r2 = r8.f19216o
            com.google.android.exoplayer2.v0.w r9 = r8.m26206b(r9)
            boolean r5 = r2.mo23329a(r9, r0)
        L_0x0022:
            r9 = 1
            goto L_0x006d
        L_0x0024:
            int r2 = r8.f19212k
            r7 = 9
            if (r2 != r7) goto L_0x003c
            com.google.android.exoplayer2.s0.s.f r2 = r8.f19217p
            if (r2 == 0) goto L_0x003c
            r8.m26207b()
            com.google.android.exoplayer2.s0.s.f r2 = r8.f19217p
            com.google.android.exoplayer2.v0.w r9 = r8.m26206b(r9)
            boolean r5 = r2.mo23329a(r9, r0)
            goto L_0x0022
        L_0x003c:
            int r2 = r8.f19212k
            r7 = 18
            if (r2 != r7) goto L_0x0067
            boolean r2 = r8.f19215n
            if (r2 != 0) goto L_0x0067
            com.google.android.exoplayer2.s0.s.d r2 = r8.f19206e
            com.google.android.exoplayer2.v0.w r9 = r8.m26206b(r9)
            boolean r5 = r2.mo23329a(r9, r0)
            com.google.android.exoplayer2.s0.s.d r9 = r8.f19206e
            long r0 = r9.mo23328a()
            int r9 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r9 == 0) goto L_0x0022
            com.google.android.exoplayer2.s0.i r9 = r8.f19207f
            com.google.android.exoplayer2.s0.o$b r2 = new com.google.android.exoplayer2.s0.o$b
            r2.<init>(r0)
            r9.mo23313a(r2)
            r8.f19215n = r6
            goto L_0x0022
        L_0x0067:
            int r0 = r8.f19213l
            r9.mo23298c(r0)
            r9 = 0
        L_0x006d:
            boolean r0 = r8.f19209h
            if (r0 != 0) goto L_0x0087
            if (r5 == 0) goto L_0x0087
            r8.f19209h = r6
            com.google.android.exoplayer2.s0.s.d r0 = r8.f19206e
            long r0 = r0.mo23328a()
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0083
            long r0 = r8.f19214m
            long r0 = -r0
            goto L_0x0085
        L_0x0083:
            r0 = 0
        L_0x0085:
            r8.f19210i = r0
        L_0x0087:
            r0 = 4
            r8.f19211j = r0
            r0 = 2
            r8.f19208g = r0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p366s0.p368s.C8930c.m26210d(com.google.android.exoplayer2.s0.h):boolean");
    }

    /* renamed from: b */
    private void m26207b() {
        if (!this.f19215n) {
            this.f19207f.mo23313a(new C8922b(-9223372036854775807L));
            this.f19215n = true;
        }
    }

    /* renamed from: c */
    private long m26208c() {
        if (this.f19209h) {
            return this.f19210i + this.f19214m;
        }
        if (this.f19206e.mo23328a() == -9223372036854775807L) {
            return 0;
        }
        return this.f19214m;
    }

    /* renamed from: a */
    public void mo23309a(C8914i iVar) {
        this.f19207f = iVar;
    }

    /* renamed from: a */
    public void mo23308a(long j, long j2) {
        this.f19208g = 1;
        this.f19209h = false;
        this.f19211j = 0;
    }

    /* renamed from: a */
    public int mo23306a(C8913h hVar, C8919n nVar) throws IOException, InterruptedException {
        while (true) {
            int i = this.f19208g;
            if (i != 1) {
                if (i == 2) {
                    m26213f(hVar);
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    } else if (m26210d(hVar)) {
                        return 0;
                    }
                } else if (!m26212e(hVar)) {
                    return -1;
                }
            } else if (!m26209c(hVar)) {
                return -1;
            }
        }
    }
}
