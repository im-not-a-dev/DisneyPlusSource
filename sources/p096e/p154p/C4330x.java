package p096e.p154p;

import android.os.Build.VERSION;
import android.view.ViewGroup;

/* renamed from: e.p.x */
/* compiled from: ViewGroupUtils */
class C4330x {
    /* renamed from: a */
    static C4329w m14900a(ViewGroup viewGroup) {
        if (VERSION.SDK_INT >= 18) {
            return new C4328v(viewGroup);
        }
        return C4327u.m14891a(viewGroup);
    }

    /* renamed from: a */
    static void m14901a(ViewGroup viewGroup, boolean z) {
        if (VERSION.SDK_INT >= 18) {
            C4333z.m14905a(viewGroup, z);
        } else {
            C4331y.m14903a(viewGroup, z);
        }
    }
}
