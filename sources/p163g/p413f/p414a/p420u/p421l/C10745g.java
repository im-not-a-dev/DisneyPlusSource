package p163g.p413f.p414a.p420u.p421l;

import p163g.p413f.p414a.p424w.C10775k;

@Deprecated
/* renamed from: g.f.a.u.l.g */
/* compiled from: SimpleTarget */
public abstract class C10745g<Z> extends C10737a<Z> {

    /* renamed from: U */
    private final int f25441U;

    /* renamed from: V */
    private final int f25442V;

    public C10745g() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: a */
    public void mo27735a(C10746h hVar) {
    }

    /* renamed from: b */
    public final void mo27739b(C10746h hVar) {
        if (C10775k.m34033b(this.f25441U, this.f25442V)) {
            hVar.mo27751a(this.f25441U, this.f25442V);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        sb.append(this.f25441U);
        sb.append(" and height: ");
        sb.append(this.f25442V);
        sb.append(", either provide dimensions in the constructor or call override()");
        throw new IllegalArgumentException(sb.toString());
    }

    public C10745g(int i, int i2) {
        this.f25441U = i;
        this.f25442V = i2;
    }
}
