package com.bamnet.iap.p035c.p037d;

/* renamed from: com.bamnet.iap.c.d.c */
/* compiled from: IabException */
public class C1661c extends Exception {

    /* renamed from: c */
    C1671e f5797c;

    public C1661c(C1671e eVar) {
        this(eVar, (Exception) null);
    }

    /* renamed from: a */
    public C1671e mo7298a() {
        return this.f5797c;
    }

    public C1661c(int i, String str) {
        this(new C1671e(i, str));
    }

    public C1661c(C1671e eVar, Exception exc) {
        super(eVar.mo7322a(), exc);
        this.f5797c = eVar;
    }

    public C1661c(int i, String str, Exception exc) {
        this(new C1671e(i, str), exc);
    }
}
