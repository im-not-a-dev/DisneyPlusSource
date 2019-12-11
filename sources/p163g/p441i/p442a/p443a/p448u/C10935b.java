package p163g.p441i.p442a.p443a.p448u;

import java.lang.ref.SoftReference;
import p163g.p441i.p442a.p443a.p445r.C10919d;

/* renamed from: g.i.a.a.u.b */
/* compiled from: BufferRecyclers */
public class C10935b {

    /* renamed from: a */
    private static final C10940g f25982a = ("true".equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers")) ? C10940g.m34632a() : null);

    /* renamed from: b */
    protected static final ThreadLocal<SoftReference<C10934a>> f25983b = new ThreadLocal<>();

    /* renamed from: c */
    protected static final ThreadLocal<SoftReference<C10919d>> f25984c = new ThreadLocal<>();

    /* renamed from: a */
    public static C10934a m34621a() {
        C10934a aVar;
        SoftReference softReference;
        SoftReference softReference2 = (SoftReference) f25983b.get();
        if (softReference2 == null) {
            aVar = null;
        } else {
            aVar = (C10934a) softReference2.get();
        }
        if (aVar == null) {
            aVar = new C10934a();
            C10940g gVar = f25982a;
            if (gVar != null) {
                softReference = gVar.mo28190a(aVar);
            } else {
                softReference = new SoftReference(aVar);
            }
            f25983b.set(softReference);
        }
        return aVar;
    }

    /* renamed from: b */
    public static C10919d m34623b() {
        C10919d dVar;
        SoftReference softReference = (SoftReference) f25984c.get();
        if (softReference == null) {
            dVar = null;
        } else {
            dVar = (C10919d) softReference.get();
        }
        if (dVar != null) {
            return dVar;
        }
        C10919d dVar2 = new C10919d();
        f25984c.set(new SoftReference(dVar2));
        return dVar2;
    }

    /* renamed from: a */
    public static byte[] m34622a(String str) {
        return m34623b().mo28117a(str);
    }
}
