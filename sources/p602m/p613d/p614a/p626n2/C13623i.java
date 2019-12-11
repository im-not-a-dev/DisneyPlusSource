package p602m.p613d.p614a.p626n2;

import java.math.BigInteger;
import p602m.p613d.p614a.C13501f;
import p602m.p613d.p614a.C13503f1;
import p602m.p613d.p614a.C13508g;
import p602m.p613d.p614a.C13565l;
import p602m.p613d.p614a.C13589n;
import p602m.p613d.p614a.C13626o;
import p602m.p613d.p614a.C13643t;
import p602m.p613d.p614a.C13646u;

/* renamed from: m.d.a.n2.i */
/* compiled from: X9FieldID */
public class C13623i extends C13589n implements C13625k {

    /* renamed from: U */
    private C13643t f30290U;

    /* renamed from: c */
    private C13626o f30291c;

    public C13623i(BigInteger bigInteger) {
        this.f30291c = C13625k.f30314h;
        this.f30290U = new C13565l(bigInteger);
    }

    /* renamed from: a */
    public static C13623i m41830a(Object obj) {
        if (obj instanceof C13623i) {
            return (C13623i) obj;
        }
        if (obj != null) {
            return new C13623i(C13646u.m41915a(obj));
        }
        return null;
    }

    /* renamed from: e */
    public C13626o mo34843e() {
        return this.f30291c;
    }

    /* renamed from: f */
    public C13643t mo34844f() {
        return this.f30290U;
    }

    public C13623i(int i, int i2) {
        this(i, i2, 0, 0);
    }

    /* renamed from: a */
    public C13643t mo34785a() {
        C13508g gVar = new C13508g();
        gVar.mo34796a((C13501f) this.f30291c);
        gVar.mo34796a((C13501f) this.f30290U);
        return new C13503f1(gVar);
    }

    public C13623i(int i, int i2, int i3, int i4) {
        this.f30291c = C13625k.f30315i;
        C13508g gVar = new C13508g();
        gVar.mo34796a((C13501f) new C13565l((long) i));
        String str = "inconsistent k values";
        if (i3 == 0) {
            if (i4 == 0) {
                gVar.mo34796a((C13501f) C13625k.f30316j);
                gVar.mo34796a((C13501f) new C13565l((long) i2));
            } else {
                throw new IllegalArgumentException(str);
            }
        } else if (i3 <= i2 || i4 <= i3) {
            throw new IllegalArgumentException(str);
        } else {
            gVar.mo34796a((C13501f) C13625k.f30317k);
            C13508g gVar2 = new C13508g();
            gVar2.mo34796a((C13501f) new C13565l((long) i2));
            gVar2.mo34796a((C13501f) new C13565l((long) i3));
            gVar2.mo34796a((C13501f) new C13565l((long) i4));
            gVar.mo34796a((C13501f) new C13503f1(gVar2));
        }
        this.f30290U = new C13503f1(gVar);
    }

    private C13623i(C13646u uVar) {
        this.f30291c = C13626o.m41837a((Object) uVar.mo34870a(0));
        this.f30290U = uVar.mo34870a(1).mo34785a();
    }
}
