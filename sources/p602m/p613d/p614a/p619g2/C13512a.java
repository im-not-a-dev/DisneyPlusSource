package p602m.p613d.p614a.p619g2;

import java.util.Hashtable;
import p602m.p613d.p614a.C13626o;
import p602m.p613d.p614a.p623k2.C13530b;
import p602m.p613d.p614a.p623k2.C13564c;
import p602m.p613d.p614a.p626n2.C13619e;
import p602m.p613d.p683g.C14090j;

/* renamed from: m.d.a.g2.a */
/* compiled from: NISTNamedCurves */
public class C13512a {

    /* renamed from: a */
    static final Hashtable f30089a = new Hashtable();

    /* renamed from: b */
    static final Hashtable f30090b = new Hashtable();

    static {
        m41617a("B-571", C13564c.f30167F);
        m41617a("B-409", C13564c.f30165D);
        m41617a("B-283", C13564c.f30184n);
        m41617a("B-233", C13564c.f30190t);
        m41617a("B-163", C13564c.f30182l);
        m41617a("K-571", C13564c.f30166E);
        m41617a("K-409", C13564c.f30164C);
        m41617a("K-283", C13564c.f30183m);
        m41617a("K-233", C13564c.f30189s);
        m41617a("K-163", C13564c.f30172b);
        m41617a("P-521", C13564c.f30163B);
        m41617a("P-384", C13564c.f30162A);
        m41617a("P-256", C13564c.f30169H);
        m41617a("P-224", C13564c.f30196z);
        m41617a("P-192", C13564c.f30168G);
    }

    /* renamed from: a */
    static void m41617a(String str, C13626o oVar) {
        f30089a.put(str, oVar);
        f30090b.put(oVar, str);
    }

    /* renamed from: b */
    public static C13626o m41619b(String str) {
        return (C13626o) f30089a.get(C14090j.m44488b(str));
    }

    /* renamed from: b */
    public static String m41618b(C13626o oVar) {
        return (String) f30090b.get(oVar);
    }

    /* renamed from: a */
    public static C13619e m41615a(String str) {
        C13626o oVar = (C13626o) f30089a.get(C14090j.m44488b(str));
        if (oVar != null) {
            return m41616a(oVar);
        }
        return null;
    }

    /* renamed from: a */
    public static C13619e m41616a(C13626o oVar) {
        return C13530b.m41672a(oVar);
    }
}
