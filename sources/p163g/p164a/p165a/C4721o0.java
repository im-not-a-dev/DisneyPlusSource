package p163g.p164a.p165a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: g.a.a.o0 */
/* compiled from: Messages */
final class C4721o0 {

    /* renamed from: a */
    protected static final Integer f11736a = Integer.valueOf(750183);

    /* renamed from: b */
    private static C4759s f11737b = null;

    /* renamed from: c */
    private static final Object f11738c = new Object();

    /* renamed from: d */
    private static int f11739d = -1;

    /* renamed from: e */
    private static int f11740e = -1;

    /* renamed from: f */
    private static C4746q f11741f = null;

    /* renamed from: g */
    private static final Object f11742g = new Object();

    /* renamed from: g.a.a.o0$a */
    /* compiled from: Messages */
    static class C4722a implements Runnable {
        C4722a() {
        }

        public void run() {
            while (!C4768u0.m16554a()) {
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    C4783y0.m16640c("Data Callback - Data Callback Queue Is Interrupted(%s)", e.getMessage());
                }
            }
        }
    }

    /* renamed from: g.a.a.o0$b */
    /* compiled from: Messages */
    static class C4723b implements Runnable {

        /* renamed from: U */
        final /* synthetic */ Map f11743U;

        /* renamed from: c */
        final /* synthetic */ Map f11744c;

        C4723b(Map map, Map map2) {
            this.f11744c = map;
            this.f11743U = map2;
        }

        public void run() {
            ArrayList j = C4728p0.m16448H().mo16091j();
            if (j != null && j.size() > 0) {
                HashMap hashMap = new HashMap(C4727p.m16441e());
                HashMap a = C4721o0.m16408a(this.f11744c);
                HashMap a2 = C4721o0.m16408a(this.f11743U);
                Iterator it = j.iterator();
                while (it.hasNext()) {
                    C4746q qVar = (C4746q) it.next();
                    if (qVar.mo16127a(a2, a, hashMap)) {
                        qVar.mo16033h();
                    }
                }
            }
        }
    }

    /* renamed from: g.a.a.o0$c */
    /* compiled from: Messages */
    static class C4724c implements Runnable {

        /* renamed from: U */
        final /* synthetic */ Map f11745U;

        /* renamed from: V */
        final /* synthetic */ Map f11746V;

        /* renamed from: c */
        final /* synthetic */ Map f11747c;

        C4724c(Map map, Map map2, Map map3) {
            this.f11747c = map;
            this.f11745U = map2;
            this.f11746V = map3;
        }

        public void run() {
            ArrayList n = !C4783y0.m16611I() ? C4728p0.m16448H().mo16095n() : null;
            if (n != null && n.size() > 0) {
                Map map = this.f11747c;
                if (map != null) {
                    String str = "pev2";
                    if (map.containsKey(str) && this.f11747c.get(str).toString().equals("ADBINTERNAL:In-App Message")) {
                        return;
                    }
                }
                HashMap a = C4721o0.m16408a(this.f11745U);
                HashMap a2 = C4721o0.m16408a(this.f11747c);
                Iterator it = n.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C4746q qVar = (C4746q) it.next();
                    if (qVar.mo16127a(a2, a, this.f11746V)) {
                        qVar.mo16033h();
                        break;
                    }
                }
            }
        }
    }

    /* renamed from: g.a.a.o0$d */
    /* compiled from: Messages */
    static class C4725d implements Runnable {
        C4725d() {
        }

        public void run() {
            ArrayList n = C4728p0.m16448H().mo16095n();
            if (n != null && n.size() > 0) {
                Iterator it = n.iterator();
                while (it.hasNext()) {
                    ((C4746q) it.next()).f11820f = false;
                }
            }
        }
    }

    /* renamed from: g.a.a.o0$e */
    /* compiled from: Messages */
    protected enum C4726e {
        MESSAGE_SHOW_RULE_UNKNOWN(0),
        MESSAGE_SHOW_RULE_ALWAYS(1),
        MESSAGE_SHOW_RULE_ONCE(2),
        MESSAGE_SHOW_RULE_UNTIL_CLICK(3);
        

        /* renamed from: c */
        private final int f11753c;

        private C4726e(int i) {
            this.f11753c = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo16069a() {
            return this.f11753c;
        }
    }

    /* renamed from: a */
    protected static HashMap<String, Object> m16408a(Map<String, Object> map) {
        if (map == null || map.size() <= 0) {
            return null;
        }
        HashMap<String, Object> hashMap = new HashMap<>(map.size());
        for (Entry entry : map.entrySet()) {
            hashMap.put(((String) entry.getKey()).toLowerCase(), entry.getValue());
        }
        return hashMap;
    }

    /* renamed from: b */
    protected static C4759s m16414b() {
        C4759s sVar;
        synchronized (f11738c) {
            sVar = f11737b;
        }
        return sVar;
    }

    /* renamed from: c */
    protected static C4746q m16415c() {
        C4746q qVar;
        synchronized (f11742g) {
            qVar = f11741f;
        }
        return qVar;
    }

    /* renamed from: d */
    protected static int m16416d() {
        return f11740e;
    }

    /* renamed from: e */
    protected static int m16417e() {
        return f11739d;
    }

    /* renamed from: f */
    protected static void m16418f() {
        C4783y0.m16662v().execute(new C4725d());
    }

    /* renamed from: a */
    protected static void m16409a() {
        C4783y0.m16606D().execute(new C4722a());
    }

    /* renamed from: a */
    protected static void m16412a(Map<String, Object> map, Map<String, Object> map2) {
        C4783y0.m16606D().execute(new C4723b(map2, map));
    }

    /* renamed from: a */
    protected static void m16413a(Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3) {
        C4783y0.m16662v().execute(new C4724c(map, map2, map3));
    }

    /* renamed from: a */
    protected static C4759s m16407a(String str) {
        ArrayList n = !C4783y0.m16611I() ? C4728p0.m16448H().mo16095n() : null;
        if (n == null || n.size() <= 0) {
            return null;
        }
        Iterator it = n.iterator();
        while (it.hasNext()) {
            C4746q qVar = (C4746q) it.next();
            String str2 = qVar.f11815a;
            if (str2 != null && str2.equals(str) && (qVar instanceof C4759s)) {
                return (C4759s) qVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    protected static void m16411a(C4759s sVar) {
        synchronized (f11738c) {
            f11737b = sVar;
        }
    }

    /* renamed from: a */
    protected static void m16410a(C4746q qVar) {
        synchronized (f11742g) {
            f11741f = qVar;
        }
    }
}
