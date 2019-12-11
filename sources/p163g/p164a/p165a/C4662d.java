package p163g.p164a.p165a;

import java.util.HashMap;
import java.util.Map;

/* renamed from: g.a.a.d */
/* compiled from: Analytics */
public final class C4662d {

    /* renamed from: g.a.a.d$a */
    /* compiled from: Analytics */
    static class C4663a implements Runnable {

        /* renamed from: U */
        final /* synthetic */ Map f11644U;

        /* renamed from: c */
        final /* synthetic */ String f11645c;

        C4663a(String str, Map map) {
            this.f11645c = str;
            this.f11644U = map;
        }

        public void run() {
            C4685h.m16317a(this.f11645c, this.f11644U);
        }
    }

    /* renamed from: g.a.a.d$b */
    /* compiled from: Analytics */
    static class C4664b implements Runnable {

        /* renamed from: U */
        final /* synthetic */ Map f11646U;

        /* renamed from: c */
        final /* synthetic */ String f11647c;

        C4664b(String str, Map map) {
            this.f11647c = str;
            this.f11646U = map;
        }

        public void run() {
            C4667e.m16247a(this.f11647c, this.f11646U);
        }
    }

    /* renamed from: a */
    public static void m16243a(String str, Map<String, Object> map) {
        C4783y0.m16642d().execute(new C4664b(str, map != null ? new HashMap(map) : null));
    }

    /* renamed from: b */
    public static void m16244b(String str, Map<String, Object> map) {
        C4783y0.m16642d().execute(new C4663a(str, map != null ? new HashMap(map) : null));
    }
}
