package com.google.android.exoplayer2.p366s0.p372w;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.C8919n;
import com.google.android.exoplayer2.p366s0.C8920o;
import com.google.android.exoplayer2.p366s0.C8920o.C8922b;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.s0.w.i */
/* compiled from: StreamReader */
abstract class C8998i {

    /* renamed from: a */
    private final C8994e f19746a = new C8994e();

    /* renamed from: b */
    private C8924q f19747b;

    /* renamed from: c */
    private C8914i f19748c;

    /* renamed from: d */
    private C8996g f19749d;

    /* renamed from: e */
    private long f19750e;

    /* renamed from: f */
    private long f19751f;

    /* renamed from: g */
    private long f19752g;

    /* renamed from: h */
    private int f19753h;

    /* renamed from: i */
    private int f19754i;

    /* renamed from: j */
    private C9000b f19755j;

    /* renamed from: k */
    private long f19756k;

    /* renamed from: l */
    private boolean f19757l;

    /* renamed from: m */
    private boolean f19758m;

    /* renamed from: com.google.android.exoplayer2.s0.w.i$b */
    /* compiled from: StreamReader */
    static class C9000b {

        /* renamed from: a */
        Format f19759a;

        /* renamed from: b */
        C8996g f19760b;

        C9000b() {
        }
    }

    /* renamed from: com.google.android.exoplayer2.s0.w.i$c */
    /* compiled from: StreamReader */
    private static final class C9001c implements C8996g {
        private C9001c() {
        }

        /* renamed from: a */
        public long mo23395a(C8913h hVar) {
            return -1;
        }

        /* renamed from: a */
        public C8920o mo23396a() {
            return new C8922b(-9223372036854775807L);
        }

        /* renamed from: c */
        public void mo23398c(long j) {
        }
    }

    /* renamed from: b */
    private int m26573b(C8913h hVar, C8919n nVar) throws IOException, InterruptedException {
        C8913h hVar2 = hVar;
        long a = this.f19749d.mo23395a(hVar2);
        if (a >= 0) {
            nVar.f19163a = a;
            return 1;
        }
        if (a < -1) {
            mo23417c(-(a + 2));
        }
        if (!this.f19757l) {
            this.f19748c.mo23313a(this.f19749d.mo23396a());
            this.f19757l = true;
        }
        if (this.f19756k > 0 || this.f19746a.mo23406a(hVar2)) {
            this.f19756k = 0;
            C9572w b = this.f19746a.mo23407b();
            long a2 = mo23400a(b);
            if (a2 >= 0) {
                long j = this.f19752g;
                if (j + a2 >= this.f19750e) {
                    long a3 = mo23413a(j);
                    this.f19747b.mo23305a(b, b.mo24690d());
                    this.f19747b.mo23303a(a3, 1, b.mo24690d(), 0, null);
                    this.f19750e = -1;
                }
            }
            this.f19752g += a2;
            return 0;
        }
        this.f19753h = 3;
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract long mo23400a(C9572w wVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23415a(C8914i iVar, C8924q qVar) {
        this.f19748c = iVar;
        this.f19747b = qVar;
        mo23401a(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo23402a(C9572w wVar, long j, C9000b bVar) throws IOException, InterruptedException;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo23417c(long j) {
        this.f19752g = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23401a(boolean z) {
        if (z) {
            this.f19755j = new C9000b();
            this.f19751f = 0;
            this.f19753h = 0;
        } else {
            this.f19753h = 1;
        }
        this.f19750e = -1;
        this.f19752g = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo23414a(long j, long j2) {
        this.f19746a.mo23408c();
        if (j == 0) {
            mo23401a(!this.f19757l);
        } else if (this.f19753h != 0) {
            this.f19750e = mo23416b(j2);
            this.f19749d.mo23398c(this.f19750e);
            this.f19753h = 2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo23412a(C8913h hVar, C8919n nVar) throws IOException, InterruptedException {
        int i = this.f19753h;
        if (i == 0) {
            return m26572a(hVar);
        }
        if (i == 1) {
            hVar.mo23298c((int) this.f19751f);
            this.f19753h = 2;
            return 0;
        } else if (i == 2) {
            return m26573b(hVar, nVar);
        } else {
            throw new IllegalStateException();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo23416b(long j) {
        return (((long) this.f19754i) * j) / 1000000;
    }

    /* renamed from: a */
    private int m26572a(C8913h hVar) throws IOException, InterruptedException {
        boolean z = true;
        while (z) {
            if (!this.f19746a.mo23406a(hVar)) {
                this.f19753h = 3;
                return -1;
            }
            this.f19756k = hVar.getPosition() - this.f19751f;
            z = mo23402a(this.f19746a.mo23407b(), this.f19751f, this.f19755j);
            if (z) {
                this.f19751f = hVar.getPosition();
            }
        }
        C8913h hVar2 = hVar;
        Format format = this.f19755j.f19759a;
        this.f19754i = format.f18364p0;
        if (!this.f19758m) {
            this.f19747b.mo23304a(format);
            this.f19758m = true;
        }
        C8996g gVar = this.f19755j.f19760b;
        if (gVar != null) {
            this.f19749d = gVar;
        } else if (hVar.mo23287a() == -1) {
            this.f19749d = new C9001c();
        } else {
            C8995f a = this.f19746a.mo23405a();
            C8988b bVar = new C8988b(this, this.f19751f, hVar.mo23287a(), (long) (a.f19739e + a.f19740f), a.f19737c, (a.f19736b & 4) != 0);
            this.f19749d = bVar;
        }
        this.f19755j = null;
        this.f19753h = 2;
        this.f19746a.mo23409d();
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo23413a(long j) {
        return (j * 1000000) / ((long) this.f19754i);
    }
}
