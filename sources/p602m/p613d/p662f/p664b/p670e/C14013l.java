package p602m.p613d.p662f.p664b.p670e;

import p602m.p613d.p627b.C13708l;

/* renamed from: m.d.f.b.e.l */
/* compiled from: WOTSPlusParameters */
final class C14013l {

    /* renamed from: a */
    private final C14026t f30984a;

    /* renamed from: b */
    private final C13708l f30985b;

    /* renamed from: c */
    private final int f30986c;

    /* renamed from: d */
    private final int f30987d;

    /* renamed from: e */
    private final int f30988e;

    /* renamed from: f */
    private final int f30989f;

    /* renamed from: g */
    private final int f30990g;

    protected C14013l(C13708l lVar) {
        if (lVar != null) {
            this.f30985b = lVar;
            this.f30986c = C14035y.m44316a(lVar);
            this.f30987d = 16;
            this.f30989f = (int) Math.ceil(((double) (this.f30986c * 8)) / ((double) C14035y.m44313a(this.f30987d)));
            this.f30990g = ((int) Math.floor((double) (C14035y.m44313a(this.f30989f * (this.f30987d - 1)) / C14035y.m44313a(this.f30987d)))) + 1;
            this.f30988e = this.f30989f + this.f30990g;
            this.f30984a = C14012k.m44218b(lVar.mo34971a(), this.f30986c, this.f30987d, this.f30988e);
            if (this.f30984a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("cannot find OID for digest algorithm: ");
                sb.append(lVar.mo34971a());
                throw new IllegalArgumentException(sb.toString());
            }
            return;
        }
        throw new NullPointerException("digest == null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C13708l mo35420a() {
        return this.f30985b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo35421b() {
        return this.f30986c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo35422c() {
        return this.f30988e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo35423d() {
        return this.f30987d;
    }
}
