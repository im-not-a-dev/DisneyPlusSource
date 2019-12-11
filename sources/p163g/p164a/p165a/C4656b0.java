package p163g.p164a.p165a;

import java.util.Iterator;

/* renamed from: g.a.a.b0 */
/* compiled from: MessageMatcherGreaterThanOrEqual */
final class C4656b0 extends C4770v {
    C4656b0() {
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
            if ((next instanceof Number) && b.doubleValue() >= ((Number) next).doubleValue()) {
                return true;
            }
        }
        return false;
    }
}
