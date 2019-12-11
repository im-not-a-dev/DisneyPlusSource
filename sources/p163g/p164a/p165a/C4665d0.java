package p163g.p164a.p165a;

import java.util.Iterator;

/* renamed from: g.a.a.d0 */
/* compiled from: MessageMatcherLessThanOrEqual */
final class C4665d0 extends C4770v {
    C4665d0() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo15963a(Object obj) {
        Double b = mo16153b(obj);
        if (b == null) {
            return false;
        }
        Iterator it = this.f11866b.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if ((next instanceof Number) && b.doubleValue() <= ((Number) next).doubleValue()) {
                return true;
            }
        }
        return false;
    }
}
