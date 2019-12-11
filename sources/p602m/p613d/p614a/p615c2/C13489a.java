package p602m.p613d.p614a.p615c2;

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

/* renamed from: m.d.a.c2.a */
/* compiled from: ANSSINamedCurves */
public class C13489a {

    /* renamed from: a */
    static C13620f f30027a = new C13490a();

    /* renamed from: b */
    static final Hashtable f30028b = new Hashtable();

    /* renamed from: c */
    static final Hashtable f30029c = new Hashtable();

    /* renamed from: d */
    static final Hashtable f30030d = new Hashtable();

    /* renamed from: m.d.a.c2.a$a */
    /* compiled from: ANSSINamedCurves */
    static class C13490a extends C13620f {
        C13490a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C13619e mo34787a() {
            BigInteger a = C13489a.m41561b("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C03");
            BigInteger a2 = C13489a.m41561b("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C00");
            BigInteger a3 = C13489a.m41561b("EE353FCA5428A9300D4ABA754A44C00FDFEC0C9AE4B1A1803075ED967B7BB73F");
            BigInteger a4 = C13489a.m41561b("F1FD178C0B3AD58F10126DE8CE42435B53DC67E140D2BF941FFDD459C6D655E1");
            BigInteger valueOf = BigInteger.valueOf(1);
            C13811e eVar = new C13811e(a, a2, a3, a4, valueOf);
            C13489a.m41562b((C13806d) eVar);
            C13619e eVar2 = new C13619e((C13806d) eVar, new C13621g((C13806d) eVar, C14097f.m44507a("04B6B3D4C356C139EB31183D4749D423958C27D2DCAF98B70164C97A2DD98F5CFF6142E0F7C8B204911F9271F0F3ECEF8C2701C307E8E4C9E183115A1554062CFB")), a4, valueOf, (byte[]) null);
            return eVar2;
        }
    }

    static {
        m41559a("FRP256v1", C13491b.f30031a, f30027a);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static BigInteger m41561b(String str) {
        return new BigInteger(1, C14097f.m44507a(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C13806d m41562b(C13806d dVar) {
        return dVar;
    }

    /* renamed from: c */
    public static C13619e m41563c(String str) {
        C13626o d = m41564d(str);
        if (d == null) {
            return null;
        }
        return m41557a(d);
    }

    /* renamed from: d */
    public static C13626o m41564d(String str) {
        return (C13626o) f30028b.get(C14090j.m44486a(str));
    }

    /* renamed from: b */
    public static String m41560b(C13626o oVar) {
        return (String) f30030d.get(oVar);
    }

    /* renamed from: a */
    static void m41559a(String str, C13626o oVar, C13620f fVar) {
        f30028b.put(C14090j.m44486a(str), oVar);
        f30030d.put(oVar, str);
        f30029c.put(oVar, fVar);
    }

    /* renamed from: a */
    public static C13619e m41557a(C13626o oVar) {
        C13620f fVar = (C13620f) f30029c.get(oVar);
        if (fVar == null) {
            return null;
        }
        return fVar.mo34840b();
    }
}
