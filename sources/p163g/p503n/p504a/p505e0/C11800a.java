package p163g.p503n.p504a.p505e0;

import p520io.reactivex.functions.C11949e;
import p520io.reactivex.p530x.C12003b;

/* renamed from: g.n.a.e0.a */
/* compiled from: AutoDisposeAndroidPlugins */
public final class C11800a {

    /* renamed from: a */
    private static volatile C11949e f27441a;

    /* renamed from: a */
    public static boolean m37946a(C11949e eVar) {
        if (eVar != null) {
            C11949e eVar2 = f27441a;
            if (eVar2 != null) {
                return eVar2.mo29931a();
            }
            try {
                return eVar.mo29931a();
            } catch (Exception e) {
                C12003b.m38613a(e);
                throw null;
            }
        } else {
            throw new NullPointerException("defaultChecker == null");
        }
    }
}
