package p163g.p164a.p165a;

import java.util.Iterator;
import java.util.regex.Pattern;

/* renamed from: g.a.a.w */
/* compiled from: MessageMatcherContains */
class C4776w extends C4770v {
    C4776w() {
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
            if ((next instanceof String) && Pattern.compile(Pattern.quote(next.toString()), 2).matcher(obj2).find()) {
                return true;
            }
        }
        return false;
    }
}
