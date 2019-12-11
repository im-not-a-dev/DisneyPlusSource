package p602m.p613d.p649d.p651b;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p602m.p613d.p639c.p640a.p644b.C13778b;
import p602m.p613d.p639c.p640a.p644b.C13779c;
import p602m.p613d.p649d.p652c.C13799e;

/* renamed from: m.d.d.b.b */
/* compiled from: BouncyCastleProviderConfiguration */
class C13794b implements C13778b {

    /* renamed from: a */
    private ThreadLocal f30612a = new ThreadLocal();

    /* renamed from: b */
    private volatile C13799e f30613b;

    /* renamed from: c */
    private volatile Set f30614c;

    /* renamed from: d */
    private volatile Map f30615d;

    static {
        String str = "SC";
        new C13779c(str, "threadLocalEcImplicitlyCa");
        new C13779c(str, "ecImplicitlyCa");
        new C13779c(str, "threadLocalDhDefaultParams");
        new C13779c(str, "DhDefaultParams");
        new C13779c(str, "acceptableEcCurves");
        new C13779c(str, "additionalEcParameters");
    }

    C13794b() {
        new ThreadLocal();
        this.f30614c = new HashSet();
        this.f30615d = new HashMap();
    }

    /* renamed from: a */
    public Map mo35027a() {
        return Collections.unmodifiableMap(this.f30615d);
    }

    /* renamed from: b */
    public C13799e mo35028b() {
        C13799e eVar = (C13799e) this.f30612a.get();
        if (eVar != null) {
            return eVar;
        }
        return this.f30613b;
    }

    /* renamed from: c */
    public Set mo35029c() {
        return Collections.unmodifiableSet(this.f30614c);
    }
}
