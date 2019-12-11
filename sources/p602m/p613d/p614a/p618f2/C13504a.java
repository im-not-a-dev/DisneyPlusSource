package p602m.p613d.p614a.p618f2;

import java.math.BigInteger;
import java.util.Hashtable;
import p602m.p613d.p614a.C13626o;
import p602m.p613d.p614a.p626n2.C13619e;
import p602m.p613d.p614a.p626n2.C13620f;
import p602m.p613d.p614a.p626n2.C13621g;
import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p653e.p654a.C13806d.C13811e;
import p602m.p613d.p683g.C14090j;
import p602m.p613d.p683g.p684k.C14097f;

/* renamed from: m.d.a.f2.a */
/* compiled from: GMNamedCurves */
public class C13504a {

    /* renamed from: a */
    static C13620f f30074a = new C13505a();

    /* renamed from: b */
    static C13620f f30075b = new C13506b();

    /* renamed from: c */
    static final Hashtable f30076c = new Hashtable();

    /* renamed from: d */
    static final Hashtable f30077d = new Hashtable();

    /* renamed from: e */
    static final Hashtable f30078e = new Hashtable();

    /* renamed from: m.d.a.f2.a$a */
    /* compiled from: GMNamedCurves */
    static class C13505a extends C13620f {
        C13505a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C13619e mo34787a() {
            BigInteger a = C13504a.m41595b("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF");
            BigInteger a2 = C13504a.m41595b("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC");
            BigInteger a3 = C13504a.m41595b("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93");
            BigInteger a4 = C13504a.m41595b("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123");
            BigInteger valueOf = BigInteger.valueOf(1);
            C13811e eVar = new C13811e(a, a2, a3, a4, valueOf);
            C13504a.m41596b((C13806d) eVar);
            C13619e eVar2 = new C13619e((C13806d) eVar, new C13621g((C13806d) eVar, C14097f.m44507a("0432C4AE2C1F1981195F9904466A39C9948FE30BBFF2660BE1715A4589334C74C7BC3736A2F4F6779C59BDCEE36B692153D0A9877CC62A474002DF32E52139F0A0")), a4, valueOf, (byte[]) null);
            return eVar2;
        }
    }

    /* renamed from: m.d.a.f2.a$b */
    /* compiled from: GMNamedCurves */
    static class C13506b extends C13620f {
        C13506b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C13619e mo34787a() {
            BigInteger a = C13504a.m41595b("BDB6F4FE3E8B1D9E0DA8C0D46F4C318CEFE4AFE3B6B8551F");
            BigInteger a2 = C13504a.m41595b("BB8E5E8FBC115E139FE6A814FE48AAA6F0ADA1AA5DF91985");
            BigInteger a3 = C13504a.m41595b("1854BEBDC31B21B7AEFC80AB0ECD10D5B1B3308E6DBF11C1");
            BigInteger a4 = C13504a.m41595b("BDB6F4FE3E8B1D9E0DA8C0D40FC962195DFAE76F56564677");
            BigInteger valueOf = BigInteger.valueOf(1);
            C13811e eVar = new C13811e(a, a2, a3, a4, valueOf);
            C13504a.m41596b((C13806d) eVar);
            C13619e eVar2 = new C13619e((C13806d) eVar, new C13621g((C13806d) eVar, C14097f.m44507a("044AD5F7048DE709AD51236DE65E4D4B482C836DC6E410664002BB3A02D4AAADACAE24817A4CA3A1B014B5270432DB27D2")), a4, valueOf, (byte[]) null);
            return eVar2;
        }
    }

    static {
        m41593a("wapip192v1", C13507b.f30082d, f30075b);
        m41593a("sm2p256v1", C13507b.f30080b, f30074a);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static BigInteger m41595b(String str) {
        return new BigInteger(1, C14097f.m44507a(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C13806d m41596b(C13806d dVar) {
        return dVar;
    }

    /* renamed from: c */
    public static C13619e m41597c(String str) {
        C13626o d = m41598d(str);
        if (d == null) {
            return null;
        }
        return m41591a(d);
    }

    /* renamed from: d */
    public static C13626o m41598d(String str) {
        return (C13626o) f30076c.get(C14090j.m44486a(str));
    }

    /* renamed from: b */
    public static String m41594b(C13626o oVar) {
        return (String) f30078e.get(oVar);
    }

    /* renamed from: a */
    static void m41593a(String str, C13626o oVar, C13620f fVar) {
        f30076c.put(C14090j.m44486a(str), oVar);
        f30078e.put(oVar, str);
        f30077d.put(oVar, fVar);
    }

    /* renamed from: a */
    public static C13619e m41591a(C13626o oVar) {
        C13620f fVar = (C13620f) f30077d.get(oVar);
        if (fVar == null) {
            return null;
        }
        return fVar.mo34840b();
    }
}
