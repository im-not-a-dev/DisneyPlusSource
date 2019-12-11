package p163g.p164a.p165a;

import java.util.Iterator;
import java.util.regex.Pattern;

/* renamed from: g.a.a.h0 */
/* compiled from: MessageMatcherStartsWith */
final class C4686h0 extends C4770v {
    C4686h0() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo15963a(Object obj) {
        boolean z = obj instanceof Number;
        if (!(obj instanceof String) && !z) {
            return false;
        }
        String obj2 = obj.toString();
        Iterator it = this.f11866b.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof String) {
                StringBuilder sb = new StringBuilder();
                sb.append("(?i)");
                sb.append(Pattern.quote(next.toString()));
                sb.append(".*");
                if (obj2.matches(sb.toString())) {
                    return true;
                }
            }
        }
        return false;
    }
}
