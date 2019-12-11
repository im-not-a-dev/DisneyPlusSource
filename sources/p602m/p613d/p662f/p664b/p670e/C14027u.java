package p602m.p613d.p662f.p664b.p670e;

import p602m.p613d.p627b.C13708l;

/* renamed from: m.d.f.b.e.u */
/* compiled from: XMSSParameters */
public final class C14027u {

    /* renamed from: a */
    private final C14011j f31028a;

    /* renamed from: b */
    private final int f31029b;

    /* renamed from: c */
    private final int f31030c;

    public C14027u(int i, C13708l lVar) {
        if (i < 2) {
            throw new IllegalArgumentException("height must be >= 2");
        } else if (lVar != null) {
            this.f31028a = new C14011j(new C14013l(lVar));
            this.f31029b = i;
            this.f31030c = m44277g();
            C14000e.m44168b(mo35457a().mo34971a(), mo35458b(), mo35462f(), this.f31028a.mo35417b().mo35422c(), i);
        } else {
            throw new NullPointerException("digest == null");
        }
    }

    /* renamed from: g */
    private int m44277g() {
        int i = 2;
        while (true) {
            int i2 = this.f31029b;
            if (i > i2) {
                throw new IllegalStateException("should never happen...");
            } else if ((i2 - i) % 2 == 0) {
                return i;
            } else {
                i++;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C13708l mo35457a() {
        return this.f31028a.mo35417b().mo35420a();
    }

    /* renamed from: b */
    public int mo35458b() {
        return this.f31028a.mo35417b().mo35421b();
    }

    /* renamed from: c */
    public int mo35459c() {
        return this.f31029b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo35460d() {
        return this.f31030c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C14011j mo35461e() {
        return this.f31028a;
    }

    /* renamed from: f */
    public int mo35462f() {
        return this.f31028a.mo35417b().mo35423d();
    }
}
