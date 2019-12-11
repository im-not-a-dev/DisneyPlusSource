package p096e.p154p;

import android.view.View;
import android.view.WindowId;

/* renamed from: e.p.k0 */
/* compiled from: WindowIdApi18 */
class C4306k0 implements C4308l0 {

    /* renamed from: a */
    private final WindowId f10706a;

    C4306k0(View view) {
        this.f10706a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4306k0) && ((C4306k0) obj).f10706a.equals(this.f10706a);
    }

    public int hashCode() {
        return this.f10706a.hashCode();
    }
}
