package com.google.android.exoplayer2.p366s0.p374y;

import android.util.SparseArray;
import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.p366s0.C8899a.C8902c;
import com.google.android.exoplayer2.p366s0.C8912g;
import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.C8919n;
import com.google.android.exoplayer2.p366s0.C8920o.C8922b;
import com.google.android.exoplayer2.p366s0.p374y.C9029h0.C9033d;
import com.google.android.exoplayer2.util.C9545h0;
import com.google.android.exoplayer2.util.C9571v;
import com.google.android.exoplayer2.util.C9572w;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.s0.y.z */
/* compiled from: PsExtractor */
public final class C9060z implements C8912g {

    /* renamed from: a */
    private final C9545h0 f20112a;

    /* renamed from: b */
    private final SparseArray<C9061a> f20113b;

    /* renamed from: c */
    private final C9572w f20114c;

    /* renamed from: d */
    private final C9059y f20115d;

    /* renamed from: e */
    private boolean f20116e;

    /* renamed from: f */
    private boolean f20117f;

    /* renamed from: g */
    private boolean f20118g;

    /* renamed from: h */
    private long f20119h;

    /* renamed from: i */
    private C9056x f20120i;

    /* renamed from: j */
    private C8914i f20121j;

    /* renamed from: k */
    private boolean f20122k;

    /* renamed from: com.google.android.exoplayer2.s0.y.z$a */
    /* compiled from: PsExtractor */
    private static final class C9061a {

        /* renamed from: a */
        private final C9042o f20123a;

        /* renamed from: b */
        private final C9545h0 f20124b;

        /* renamed from: c */
        private final C9571v f20125c = new C9571v(new byte[64]);

        /* renamed from: d */
        private boolean f20126d;

        /* renamed from: e */
        private boolean f20127e;

        /* renamed from: f */
        private boolean f20128f;

        /* renamed from: g */
        private int f20129g;

        /* renamed from: h */
        private long f20130h;

        public C9061a(C9042o oVar, C9545h0 h0Var) {
            this.f20123a = oVar;
            this.f20124b = h0Var;
        }

        /* renamed from: b */
        private void m26891b() {
            this.f20125c.mo24670c(8);
            this.f20126d = this.f20125c.mo24673e();
            this.f20127e = this.f20125c.mo24673e();
            this.f20125c.mo24670c(6);
            this.f20129g = this.f20125c.mo24660a(8);
        }

        /* renamed from: c */
        private void m26892c() {
            this.f20130h = 0;
            if (this.f20126d) {
                this.f20125c.mo24670c(4);
                long a = ((long) this.f20125c.mo24660a(3)) << 30;
                this.f20125c.mo24670c(1);
                long a2 = a | ((long) (this.f20125c.mo24660a(15) << 15));
                this.f20125c.mo24670c(1);
                long a3 = a2 | ((long) this.f20125c.mo24660a(15));
                this.f20125c.mo24670c(1);
                if (!this.f20128f && this.f20127e) {
                    this.f20125c.mo24670c(4);
                    long a4 = ((long) this.f20125c.mo24660a(3)) << 30;
                    this.f20125c.mo24670c(1);
                    long a5 = a4 | ((long) (this.f20125c.mo24660a(15) << 15));
                    this.f20125c.mo24670c(1);
                    long a6 = a5 | ((long) this.f20125c.mo24660a(15));
                    this.f20125c.mo24670c(1);
                    this.f20124b.mo24632b(a6);
                    this.f20128f = true;
                }
                this.f20130h = this.f20124b.mo24632b(a3);
            }
        }

        /* renamed from: a */
        public void mo23474a() {
            this.f20128f = false;
            this.f20123a.mo23434a();
        }

        /* renamed from: a */
        public void mo23475a(C9572w wVar) throws C8723g0 {
            wVar.mo24685a(this.f20125c.f22329a, 0, 3);
            this.f20125c.mo24667b(0);
            m26891b();
            wVar.mo24685a(this.f20125c.f22329a, 0, this.f20129g);
            this.f20125c.mo24667b(0);
            m26892c();
            this.f20123a.mo23435a(this.f20130h, 4);
            this.f20123a.mo23437a(wVar);
            this.f20123a.mo23438b();
        }
    }

    static {
        C9017d dVar = C9017d.f19801a;
    }

    public C9060z() {
        this(new C9545h0(0));
    }

    /* renamed from: b */
    static /* synthetic */ C8912g[] m26885b() {
        return new C8912g[]{new C9060z()};
    }

    /* renamed from: a */
    public void mo23307a() {
    }

    /* renamed from: a */
    public boolean mo23310a(C8913h hVar) throws IOException, InterruptedException {
        byte[] bArr = new byte[14];
        boolean z = false;
        hVar.mo23294b(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        hVar.mo23288a(bArr[13] & 7);
        hVar.mo23294b(bArr, 0, 3);
        if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            z = true;
        }
        return z;
    }

    public C9060z(C9545h0 h0Var) {
        this.f20112a = h0Var;
        this.f20114c = new C9572w(4096);
        this.f20113b = new SparseArray<>();
        this.f20115d = new C9059y();
    }

    /* renamed from: a */
    public void mo23309a(C8914i iVar) {
        this.f20121j = iVar;
    }

    /* renamed from: a */
    public void mo23308a(long j, long j2) {
        if ((this.f20112a.mo24633c() == -9223372036854775807L) || !(this.f20112a.mo24629a() == 0 || this.f20112a.mo24629a() == j2)) {
            this.f20112a.mo24635d();
            this.f20112a.mo24634c(j2);
        }
        C9056x xVar = this.f20120i;
        if (xVar != null) {
            xVar.mo23274b(j2);
        }
        for (int i = 0; i < this.f20113b.size(); i++) {
            ((C9061a) this.f20113b.valueAt(i)).mo23474a();
        }
    }

    /* renamed from: a */
    public int mo23306a(C8913h hVar, C8919n nVar) throws IOException, InterruptedException {
        long a = hVar.mo23287a();
        int i = (a > -1 ? 1 : (a == -1 ? 0 : -1));
        if ((i != 0) && !this.f20115d.mo23473c()) {
            return this.f20115d.mo23470a(hVar, nVar);
        }
        m26884a(a);
        C9056x xVar = this.f20120i;
        C9042o oVar = null;
        if (xVar != null && xVar.mo23276b()) {
            return this.f20120i.mo23269a(hVar, nVar, (C8902c) null);
        }
        hVar.mo23297c();
        long b = i != 0 ? a - hVar.mo23293b() : -1;
        if ((b != -1 && b < 4) || !hVar.mo23296b(this.f20114c.f22333a, 0, 4, true)) {
            return -1;
        }
        this.f20114c.mo24693e(0);
        int i2 = this.f20114c.mo24698i();
        if (i2 == 441) {
            return -1;
        }
        if (i2 == 442) {
            hVar.mo23294b(this.f20114c.f22333a, 0, 10);
            this.f20114c.mo24693e(9);
            hVar.mo23298c((this.f20114c.mo24711v() & 7) + 14);
            return 0;
        } else if (i2 == 443) {
            hVar.mo23294b(this.f20114c.f22333a, 0, 2);
            this.f20114c.mo24693e(0);
            hVar.mo23298c(this.f20114c.mo24676B() + 6);
            return 0;
        } else if (((i2 & -256) >> 8) != 1) {
            hVar.mo23298c(1);
            return 0;
        } else {
            int i3 = i2 & 255;
            C9061a aVar = (C9061a) this.f20113b.get(i3);
            if (!this.f20116e) {
                if (aVar == null) {
                    if (i3 == 189) {
                        oVar = new C9024g();
                        this.f20117f = true;
                        this.f20119h = hVar.getPosition();
                    } else if ((i3 & 224) == 192) {
                        oVar = new C9053u();
                        this.f20117f = true;
                        this.f20119h = hVar.getPosition();
                    } else if ((i3 & 240) == 224) {
                        oVar = new C9043p();
                        this.f20118g = true;
                        this.f20119h = hVar.getPosition();
                    }
                    if (oVar != null) {
                        oVar.mo23436a(this.f20121j, new C9033d(i3, 256));
                        aVar = new C9061a(oVar, this.f20112a);
                        this.f20113b.put(i3, aVar);
                    }
                }
                if (hVar.getPosition() > ((!this.f20117f || !this.f20118g) ? 1048576 : this.f20119h + 8192)) {
                    this.f20116e = true;
                    this.f20121j.mo23312a();
                }
            }
            hVar.mo23294b(this.f20114c.f22333a, 0, 2);
            this.f20114c.mo24693e(0);
            int B = this.f20114c.mo24676B() + 6;
            if (aVar == null) {
                hVar.mo23298c(B);
            } else {
                this.f20114c.mo24689c(B);
                hVar.mo23289a(this.f20114c.f22333a, 0, B);
                this.f20114c.mo24693e(6);
                aVar.mo23475a(this.f20114c);
                C9572w wVar = this.f20114c;
                wVar.mo24691d(wVar.mo24686b());
            }
            return 0;
        }
    }

    /* renamed from: a */
    private void m26884a(long j) {
        if (!this.f20122k) {
            this.f20122k = true;
            if (this.f20115d.mo23471a() != -9223372036854775807L) {
                C9056x xVar = new C9056x(this.f20115d.mo23472b(), this.f20115d.mo23471a(), j);
                this.f20120i = xVar;
                this.f20121j.mo23313a(this.f20120i.mo23271a());
                return;
            }
            this.f20121j.mo23313a(new C8922b(this.f20115d.mo23471a()));
        }
    }
}
