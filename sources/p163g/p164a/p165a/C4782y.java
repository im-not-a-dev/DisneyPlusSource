package p163g.p164a.p165a;

import java.util.Iterator;

/* renamed from: g.a.a.y */
/* compiled from: MessageMatcherEquals */
class C4782y extends C4770v {
    C4782y() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo15963a(Object obj) {
        Iterator it = this.f11866b.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            boolean z = next instanceof String;
            if (!z || !(obj instanceof String)) {
                boolean z2 = next instanceof Number;
                if (!z2 || !(obj instanceof Number)) {
                    if (!z2 || !(obj instanceof String)) {
                        if (z && (obj instanceof Number) && next.toString().compareToIgnoreCase(obj.toString()) == 0) {
                            return true;
                        }
                    } else if (mo16153b(obj) != null && ((Number) next).doubleValue() == mo16153b(obj).doubleValue()) {
                        return true;
                    }
                } else if (((Number) next).doubleValue() == ((Number) obj).doubleValue()) {
                    return true;
                }
            } else if (next.toString().compareToIgnoreCase(obj.toString()) == 0) {
                return true;
            }
        }
        return false;
    }
}
