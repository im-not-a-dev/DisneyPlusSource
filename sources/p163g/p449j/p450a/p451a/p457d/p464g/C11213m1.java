package p163g.p449j.p450a.p451a.p457d.p464g;

import android.os.Binder;

/* renamed from: g.j.a.a.d.g.m1 */
public final /* synthetic */ class C11213m1 {
    /* renamed from: a */
    public static <V> V m35728a(C11195l1<V> l1Var) {
        long clearCallingIdentity;
        try {
            return l1Var.mo28546a();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V a = l1Var.mo28546a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
