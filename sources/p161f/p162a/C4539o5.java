package p161f.p162a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Looper;
import com.appboy.p024n.C1489b;
import com.appboy.p025o.p026k.C1510e;
import com.appboy.p027p.C1518c;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.o5 */
public class C4539o5 implements C4491k5 {

    /* renamed from: m */
    private static final String f11271m = C1557c.m7461a(C4539o5.class);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f11272a;

    /* renamed from: b */
    private final C4595u0 f11273b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C4410c f11274c;

    /* renamed from: d */
    private final long f11275d;

    /* renamed from: e */
    private final SharedPreferences f11276e;

    /* renamed from: f */
    private final C4483j5 f11277f;

    /* renamed from: g */
    private final C4513m5 f11278g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final AtomicInteger f11279h;

    /* renamed from: i */
    private final Queue<C4641z4> f11280i;

    /* renamed from: j */
    private Map<String, C4631y3> f11281j;

    /* renamed from: k */
    private volatile long f11282k = 0;

    /* renamed from: l */
    private final Object f11283l = new Object();

    /* renamed from: f.a.o5$a */
    class C4540a implements Runnable {

        /* renamed from: U */
        final /* synthetic */ C4641z4 f11284U;

        /* renamed from: V */
        final /* synthetic */ long f11285V;

        /* renamed from: c */
        final /* synthetic */ C4631y3 f11287c;

        C4540a(C4631y3 y3Var, C4641z4 z4Var, long j) {
            this.f11287c = y3Var;
            this.f11284U = z4Var;
            this.f11285V = j;
        }

        public void run() {
            this.f11287c.mo15408a(C4539o5.this.f11272a, C4539o5.this.f11274c, this.f11284U, this.f11285V);
        }
    }

    /* renamed from: f.a.o5$b */
    class C4541b implements C1518c<C4563r> {
        C4541b() {
        }

        /* renamed from: a */
        public void trigger(C4563r rVar) {
            C4539o5.this.f11279h.incrementAndGet();
        }
    }

    /* renamed from: f.a.o5$c */
    class C4542c implements C1518c<C4554q> {
        C4542c() {
        }

        /* renamed from: a */
        public void trigger(C4554q qVar) {
            C4539o5.this.f11279h.decrementAndGet();
            C4539o5.this.mo15745b();
        }
    }

    /* renamed from: f.a.o5$d */
    class C4543d implements Runnable {

        /* renamed from: U */
        final /* synthetic */ C4641z4 f11290U;

        /* renamed from: V */
        final /* synthetic */ long f11291V;

        /* renamed from: c */
        final /* synthetic */ C4631y3 f11293c;

        C4543d(C4631y3 y3Var, C4641z4 z4Var, long j) {
            this.f11293c = y3Var;
            this.f11290U = z4Var;
            this.f11291V = j;
        }

        public void run() {
            this.f11293c.mo15408a(C4539o5.this.f11272a, C4539o5.this.f11274c, this.f11290U, this.f11291V);
        }
    }

    public C4539o5(Context context, C4595u0 u0Var, C4410c cVar, C1489b bVar, String str, String str2) {
        this.f11272a = context.getApplicationContext();
        this.f11273b = u0Var;
        this.f11274c = cVar;
        this.f11275d = bVar.mo6730w();
        StringBuilder sb = new StringBuilder();
        sb.append("com.appboy.storage.triggers.actions");
        sb.append(C1563i.m7484a(context, str, str2));
        this.f11276e = context.getSharedPreferences(sb.toString(), 0);
        this.f11277f = new C4524n5(context, str2);
        this.f11278g = new C4552p5(context, str, str2);
        this.f11281j = mo15747c();
        this.f11279h = new AtomicInteger(0);
        this.f11280i = new ArrayDeque();
        m15712d();
    }

    /* renamed from: d */
    private void m15712d() {
        C1557c.m7471d(f11271m, "Subscribing to trigger dispatch events.");
        this.f11274c.mo15487b(new C4541b(), C4563r.class);
        this.f11274c.mo15487b(new C4542c(), C4554q.class);
    }

    /* renamed from: c */
    private void m15711c(C4641z4 z4Var) {
        String str = f11271m;
        StringBuilder sb = new StringBuilder();
        sb.append("New incoming <");
        sb.append(z4Var.mo15479d());
        sb.append(">. Searching for matching triggers.");
        C1557c.m7458a(str, sb.toString());
        C4631y3 b = mo15744b(z4Var);
        if (b != null) {
            mo15746b(z4Var, b);
        }
    }

    /* renamed from: a */
    public void mo15671a(List<C4631y3> list) {
        boolean z;
        C4449f5 f5Var = new C4449f5();
        if (list == null) {
            C1557c.m7473e(f11271m, "Received a null list of triggers in registerTriggeredActions(). Doing nothing.");
            return;
        }
        synchronized (this.f11283l) {
            this.f11281j.clear();
            Editor edit = this.f11276e.edit();
            edit.clear();
            String str = f11271m;
            StringBuilder sb = new StringBuilder();
            sb.append("Registering ");
            sb.append(list.size());
            sb.append(" new triggered actions.");
            C1557c.m7458a(str, sb.toString());
            z = false;
            for (C4631y3 y3Var : list) {
                String str2 = f11271m;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Registering triggered action id ");
                sb2.append(y3Var.mo15473d());
                C1557c.m7458a(str2, sb2.toString());
                this.f11281j.put(y3Var.mo15473d(), y3Var);
                edit.putString(y3Var.mo15473d(), ((JSONObject) y3Var.mo6750b()).toString());
                if (y3Var.mo15471a((C4641z4) f5Var)) {
                    z = true;
                }
            }
            edit.apply();
        }
        this.f11278g.mo15671a(list);
        this.f11277f.mo15671a(list);
        if (z) {
            C1557c.m7469c(f11271m, "Test triggered actions found, triggering test event.");
            mo15653a((C4641z4) f5Var);
        } else {
            C1557c.m7458a(f11271m, "No test triggered actions found.");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo15745b() {
        if (this.f11279h.get() <= 0) {
            C1557c.m7458a(f11271m, "In flight trigger requests is empty. Executing any pending trigger events.");
            while (!this.f11280i.isEmpty()) {
                m15711c((C4641z4) this.f11280i.poll());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Map<String, C4631y3> mo15747c() {
        HashMap hashMap = new HashMap();
        Map all = this.f11276e.getAll();
        if (!(all == null || all.size() == 0)) {
            Set<String> keySet = all.keySet();
            if (!(keySet == null || keySet.size() == 0)) {
                try {
                    for (String str : keySet) {
                        String string = this.f11276e.getString(str, null);
                        if (C1563i.m7490d(string)) {
                            String str2 = f11271m;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Received null or blank serialized triggered action string for action id ");
                            sb.append(str);
                            sb.append(" from shared preferences. Not parsing.");
                            C1557c.m7473e(str2, sb.toString());
                        } else {
                            C4631y3 b = C4584s5.m15911b(new JSONObject(string), this.f11273b);
                            if (b != null) {
                                hashMap.put(b.mo15473d(), b);
                                String str3 = f11271m;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Retrieving templated triggered action id ");
                                sb2.append(b.mo15473d());
                                sb2.append(" from local storage.");
                                C1557c.m7458a(str3, sb2.toString());
                            }
                        }
                    }
                } catch (JSONException e) {
                    C1557c.m7470c(f11271m, "Encountered Json exception while parsing stored triggered actions.", e);
                } catch (Exception e2) {
                    C1557c.m7470c(f11271m, "Encountered unexpected exception while parsing stored triggered actions.", e2);
                }
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C4631y3 mo15744b(C4641z4 z4Var) {
        synchronized (this.f11283l) {
            ArrayList arrayList = new ArrayList();
            C4631y3 y3Var = null;
            int i = Integer.MIN_VALUE;
            for (C4631y3 y3Var2 : this.f11281j.values()) {
                if (y3Var2.mo15471a(z4Var) && this.f11278g.mo15695a(y3Var2)) {
                    if (m15708a(z4Var, y3Var2, this.f11282k, this.f11275d)) {
                        String str = f11271m;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Found potential triggered action for incoming trigger event. Action id ");
                        sb.append(y3Var2.mo15473d());
                        sb.append(".");
                        C1557c.m7458a(str, sb.toString());
                        int c = y3Var2.mo15472c().mo15855c();
                        if (c > i) {
                            y3Var = y3Var2;
                            i = c;
                        }
                        arrayList.add(y3Var2);
                    }
                }
            }
            if (y3Var == null) {
                String str2 = f11271m;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to match triggered action for incoming <");
                sb2.append(z4Var.mo15479d());
                sb2.append(">.");
                C1557c.m7458a(str2, sb2.toString());
                return null;
            }
            arrayList.remove(y3Var);
            y3Var.mo15469a(new C4571r5(arrayList));
            String str3 = f11271m;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Found best triggered action for incoming trigger event ");
            sb3.append(z4Var.mo15615e() != null ? C4569r3.m15868a((JSONObject) z4Var.mo15615e().mo6750b()) : "");
            sb3.append(".\nMatched Action id: ");
            sb3.append(y3Var.mo15473d());
            sb3.append(".");
            C1557c.m7458a(str3, sb3.toString());
            return y3Var;
        }
    }

    /* renamed from: a */
    public void mo15653a(C4641z4 z4Var) {
        this.f11280i.add(z4Var);
        if (this.f11279h.get() == 0) {
            mo15745b();
        }
    }

    /* renamed from: a */
    public C4513m5 mo15743a() {
        return this.f11278g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo15746b(C4641z4 z4Var, C4631y3 y3Var) {
        y3Var.mo15409a(this.f11277f.mo15638a(y3Var));
        C4591t4 c = y3Var.mo15472c();
        long g = c.mo15857e() != -1 ? z4Var.mo15616g() + ((long) c.mo15857e()) : -1;
        Handler handler = new Handler(Looper.getMainLooper());
        int g2 = c.mo15859g();
        String str = f11271m;
        StringBuilder sb = new StringBuilder();
        sb.append("Performing triggered action after a delay of ");
        sb.append(g2);
        sb.append(" seconds.");
        C1557c.m7458a(str, sb.toString());
        C4543d dVar = new C4543d(y3Var, z4Var, g);
        handler.postDelayed(dVar, (long) (g2 * 1000));
    }

    /* renamed from: a */
    public void mo15652a(long j) {
        this.f11282k = j;
    }

    /* renamed from: a */
    public void mo15654a(C4641z4 z4Var, C4631y3 y3Var) {
        long j;
        String str = f11271m;
        StringBuilder sb = new StringBuilder();
        sb.append("Trigger manager received failed triggered action with id: <");
        sb.append(y3Var.mo15473d());
        sb.append(">. Will attempt to perform fallback triggered actions, if present.");
        C1557c.m7458a(str, sb.toString());
        C4571r5 e = y3Var.mo15474e();
        if (e == null) {
            C1557c.m7458a(f11271m, "Triggered action has no trigger metadata and cannot fallback. Doing nothing");
            return;
        }
        C4631y3 a = e.mo15812a();
        if (a == null) {
            C1557c.m7458a(f11271m, "Triggered action has no fallback action to perform. Doing nothing");
            return;
        }
        a.mo15469a(e);
        a.mo15409a(this.f11277f.mo15638a(a));
        long g = z4Var.mo15616g();
        C4591t4 c = a.mo15472c();
        long e2 = (long) c.mo15857e();
        long millis = TimeUnit.SECONDS.toMillis((long) c.mo15859g());
        if (e2 != -1) {
            j = e2 + g;
        } else {
            j = g + millis + TimeUnit.SECONDS.toMillis(30);
        }
        long j2 = j;
        if (j2 < C4472i3.m15487c()) {
            String str2 = f11271m;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Fallback trigger has expired. Trigger id: ");
            sb2.append(a.mo15473d());
            C1557c.m7458a(str2, sb2.toString());
            m15707a(this.f11273b, a.mo15473d(), C1510e.INTERNAL_TIMEOUT_EXCEEDED);
            mo15654a(z4Var, a);
            return;
        }
        long max = Math.max(0, (millis + g) - C4472i3.m15487c());
        String str3 = f11271m;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Performing fallback triggered action with id: <");
        sb3.append(a.mo15473d());
        sb3.append("> with a ms delay: ");
        sb3.append(max);
        C1557c.m7458a(str3, sb3.toString());
        Handler handler = new Handler(Looper.getMainLooper());
        C4540a aVar = new C4540a(a, z4Var, j2);
        handler.postDelayed(aVar, max);
    }

    /* renamed from: a */
    static boolean m15708a(C4641z4 z4Var, C4631y3 y3Var, long j, long j2) {
        long j3;
        if (z4Var instanceof C4449f5) {
            C1557c.m7458a(f11271m, "Ignoring minimum time interval between triggered actions because the trigger event is a test.");
            return true;
        }
        long a = C4472i3.m15480a() + ((long) y3Var.mo15472c().mo15859g());
        int h = y3Var.mo15472c().mo15860h();
        if (h != -1) {
            String str = f11271m;
            StringBuilder sb = new StringBuilder();
            sb.append("Using override minimum display interval: ");
            sb.append(h);
            C1557c.m7458a(str, sb.toString());
            j3 = j + ((long) h);
        } else {
            j3 = j + j2;
        }
        if (a >= j3) {
            String str2 = f11271m;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Minimum time interval requirement met for matched trigger. Action display time: ");
            sb2.append(a);
            sb2.append(" . Next viable display time: ");
            sb2.append(j3);
            C1557c.m7469c(str2, sb2.toString());
            return true;
        }
        String str3 = f11271m;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Minimum time interval requirement and triggered action override time interval requirement of ");
        sb3.append(j2);
        sb3.append(" not met for matched trigger. Returning null. Next viable display time: ");
        sb3.append(j3);
        sb3.append(". Action display time: ");
        sb3.append(a);
        C1557c.m7469c(str3, sb3.toString());
        return false;
    }

    /* renamed from: a */
    static void m15707a(C4595u0 u0Var, String str, C1510e eVar) {
        String str2 = f11271m;
        StringBuilder sb = new StringBuilder();
        sb.append("Trigger internal timeout exceeded. Attempting to log trigger failure: ");
        sb.append(eVar);
        C1557c.m7469c(str2, sb.toString());
        if (C1563i.m7490d(str)) {
            String str3 = f11271m;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Trigger ID is null or blank. Not logging trigger failure: ");
            sb2.append(eVar);
            C1557c.m7458a(str3, sb2.toString());
        } else if (u0Var == null) {
            String str4 = f11271m;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Cannot log an trigger failure because the IAppboyManager is null. Trigger failure: ");
            sb3.append(eVar);
            C1557c.m7465b(str4, sb3.toString());
        } else {
            try {
                u0Var.mo15772a((C4432e1) C4548p1.m15768a((String) null, (String) null, str, eVar));
            } catch (JSONException e) {
                C1557c.m7472d(f11271m, "Failed to log trigger failure event from trigger manager.", e);
                u0Var.mo15776b((Throwable) e);
            }
        }
    }
}
