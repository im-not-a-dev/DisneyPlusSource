package androidx.lifecycle;

import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.r */
/* compiled from: MethodCallsLogger */
public class C0729r {

    /* renamed from: a */
    private Map<String, Integer> f3014a = new HashMap();

    /* renamed from: a */
    public boolean mo4148a(String str, int i) {
        Integer num = (Integer) this.f3014a.get(str);
        boolean z = false;
        int intValue = num != null ? num.intValue() : 0;
        if ((intValue & i) != 0) {
            z = true;
        }
        this.f3014a.put(str, Integer.valueOf(i | intValue));
        return !z;
    }
}
