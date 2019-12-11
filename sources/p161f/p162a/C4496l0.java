package p161f.p162a;

import com.appboy.p033s.C1557c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: f.a.l0 */
public class C4496l0 {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String f11146d = C1557c.m7461a(C4496l0.class);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4630y2 f11147a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4630y2 f11148b;

    /* renamed from: c */
    private boolean f11149c = false;

    /* renamed from: f.a.l0$a */
    class C4497a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C4562q6 f11151c;

        C4497a(C4562q6 q6Var) {
            this.f11151c = q6Var;
        }

        public void run() {
            C1557c.m7458a(C4496l0.f11146d, "Started offline AppboyEvent recovery task.");
            C4496l0.m15563a(this.f11151c, C4496l0.this.f11148b, C4496l0.this.f11147a);
        }
    }

    public C4496l0(C4630y2 y2Var, C4630y2 y2Var2) {
        this.f11148b = y2Var;
        this.f11147a = y2Var2;
    }

    /* renamed from: a */
    public void mo15664a(C4432e1 e1Var) {
        if (this.f11149c) {
            String str = f11146d;
            StringBuilder sb = new StringBuilder();
            sb.append("Storage manager is closed. Not adding event: ");
            sb.append(e1Var);
            C1557c.m7473e(str, sb.toString());
            return;
        }
        this.f11148b.mo15464a(e1Var);
    }

    /* renamed from: a */
    public void mo15665a(List<C4432e1> list) {
        if (this.f11149c) {
            String str = f11146d;
            StringBuilder sb = new StringBuilder();
            sb.append("Storage manager is closed. Not deleting events: ");
            sb.append(list);
            C1557c.m7473e(str, sb.toString());
            return;
        }
        this.f11148b.mo15467b(list);
    }

    /* renamed from: a */
    public void mo15666a(Executor executor, C4562q6 q6Var) {
        if (this.f11149c) {
            C1557c.m7473e(f11146d, "Storage manager is closed. Not starting offline recovery.");
        } else {
            executor.execute(new C4497a(q6Var));
        }
    }

    /* renamed from: a */
    public void mo15663a() {
        this.f11149c = true;
        this.f11148b.mo15468d();
    }

    /* renamed from: a */
    static void m15563a(C4562q6 q6Var, C4630y2 y2Var, C4630y2 y2Var2) {
        HashSet hashSet = new HashSet();
        for (C4432e1 e1Var : y2Var.mo15463a()) {
            String str = f11146d;
            StringBuilder sb = new StringBuilder();
            sb.append("Adding event to dispatch from active storage: ");
            sb.append(e1Var);
            C1557c.m7471d(str, sb.toString());
            hashSet.add(e1Var.mo15524g());
            q6Var.mo15658a(e1Var);
        }
        if (y2Var2 != null) {
            Collection<C4432e1> a = y2Var2.mo15463a();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (C4432e1 e1Var2 : a) {
                arrayList.add(e1Var2);
                if (e1Var2.mo15526i()) {
                    String str2 = f11146d;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Event present in migrated storage is non persistable. Not re-adding to current storage: ");
                    sb2.append(e1Var2);
                    C1557c.m7458a(str2, sb2.toString());
                } else if (hashSet.contains(e1Var2.mo15524g())) {
                    String str3 = f11146d;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Event present in both storage providers. Not re-adding to current storage: ");
                    sb3.append(e1Var2);
                    C1557c.m7458a(str3, sb3.toString());
                } else {
                    String str4 = f11146d;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Found event in storage from migrated storage provider: ");
                    sb4.append(e1Var2);
                    C1557c.m7458a(str4, sb4.toString());
                    arrayList2.add(e1Var2);
                }
            }
            y2Var2.mo15467b(arrayList);
            y2Var.mo15465a((List<C4432e1>) arrayList2);
        }
    }
}
