package p551j.p552a.p564n;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: j.a.n.b */
/* compiled from: FrameCache */
public final class C12658b {

    /* renamed from: a */
    private static Set<String> f29346a = new HashSet();

    /* renamed from: b */
    private static ThreadLocal<WeakHashMap<Throwable, C12656a[]>> f29347b = new C12659a();

    /* renamed from: j.a.n.b$a */
    /* compiled from: FrameCache */
    static class C12659a extends ThreadLocal<WeakHashMap<Throwable, C12656a[]>> {
        C12659a() {
        }

        /* access modifiers changed from: protected */
        public WeakHashMap<Throwable, C12656a[]> initialValue() {
            return new WeakHashMap<>();
        }
    }

    /* renamed from: a */
    public static C12656a[] m39697a(Throwable th) {
        return (C12656a[]) ((Map) f29347b.get()).get(th);
    }

    /* renamed from: a */
    public static void m39696a(String str) {
        f29346a.add(str);
    }
}
