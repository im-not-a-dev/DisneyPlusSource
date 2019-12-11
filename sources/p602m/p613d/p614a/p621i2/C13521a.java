package p602m.p613d.p614a.p621i2;

import java.io.IOException;
import java.util.Enumeration;
import p602m.p613d.p614a.C13479a0;
import p602m.p613d.p614a.C13484b1;
import p602m.p613d.p614a.C13501f;
import p602m.p613d.p614a.C13503f1;
import p602m.p613d.p614a.C13508g;
import p602m.p613d.p614a.C13528k1;
import p602m.p613d.p614a.C13565l;
import p602m.p613d.p614a.C13589n;
import p602m.p613d.p614a.C13630p;
import p602m.p613d.p614a.C13643t;
import p602m.p613d.p614a.C13646u;
import p602m.p613d.p614a.C13652w;
import p602m.p613d.p614a.p625m2.C13587a;

/* renamed from: m.d.a.i2.a */
/* compiled from: PrivateKeyInfo */
public class C13521a extends C13589n {

    /* renamed from: U */
    private C13587a f30108U;

    /* renamed from: V */
    private C13652w f30109V;

    /* renamed from: c */
    private C13630p f30110c;

    public C13521a(C13587a aVar, C13501f fVar) throws IOException {
        this(aVar, fVar, null);
    }

    /* renamed from: a */
    public static C13521a m41635a(Object obj) {
        if (obj instanceof C13521a) {
            return (C13521a) obj;
        }
        if (obj != null) {
            return new C13521a(C13646u.m41915a(obj));
        }
        return null;
    }

    /* renamed from: e */
    public C13587a mo34802e() {
        return this.f30108U;
    }

    /* renamed from: f */
    public C13501f mo34803f() throws IOException {
        return C13643t.m41897a(this.f30110c.mo34797i());
    }

    public C13521a(C13587a aVar, C13501f fVar, C13652w wVar) throws IOException {
        this.f30110c = new C13484b1(fVar.mo34785a().mo34827a("DER"));
        this.f30108U = aVar;
        this.f30109V = wVar;
    }

    /* renamed from: a */
    public C13643t mo34785a() {
        C13508g gVar = new C13508g();
        gVar.mo34796a((C13501f) new C13565l(0));
        gVar.mo34796a((C13501f) this.f30108U);
        gVar.mo34796a((C13501f) this.f30110c);
        C13652w wVar = this.f30109V;
        if (wVar != null) {
            gVar.mo34796a((C13501f) new C13528k1(false, 0, wVar));
        }
        return new C13503f1(gVar);
    }

    public C13521a(C13646u uVar) {
        Enumeration i = uVar.mo34871i();
        if (((C13565l) i.nextElement()).mo34814i().intValue() == 0) {
            this.f30108U = C13587a.m41760a(i.nextElement());
            this.f30110c = C13630p.m41856a(i.nextElement());
            if (i.hasMoreElements()) {
                this.f30109V = C13652w.m41932a((C13479a0) i.nextElement(), false);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("wrong version for private key info");
    }
}
