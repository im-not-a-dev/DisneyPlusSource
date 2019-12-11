package p161f.p162a;

import com.appboy.p024n.C1489b;
import com.appboy.p033s.C1557c;
import java.util.concurrent.ThreadFactory;

/* renamed from: f.a.k6 */
public class C4492k6 implements C4562q6 {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final String f11134j = C1557c.m7461a(C4492k6.class);

    /* renamed from: a */
    private final C1489b f11135a;

    /* renamed from: b */
    private final C4479j2 f11136b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C4544o6 f11137c;

    /* renamed from: d */
    private final Object f11138d = new Object();

    /* renamed from: e */
    private volatile boolean f11139e = false;

    /* renamed from: f */
    private volatile Thread f11140f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public volatile boolean f11141g = true;

    /* renamed from: h */
    private C4488k2 f11142h;

    /* renamed from: i */
    private boolean f11143i = false;

    /* renamed from: f.a.k6$b */
    class C4494b implements Runnable {
        private C4494b() {
        }

        public void run() {
            while (C4492k6.this.f11141g) {
                try {
                    C4492k6.this.m15548a(C4492k6.this.f11137c.mo15754b());
                } catch (InterruptedException e) {
                    String b = C4492k6.f11134j;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Automatic thread interrupted! This is usually the result of calling changeUser(). [");
                    sb.append(e.toString());
                    sb.append("]");
                    C1557c.m7465b(b, sb.toString());
                }
            }
        }
    }

    public C4492k6(C1489b bVar, C4419d dVar, C4479j2 j2Var, C4544o6 o6Var, ThreadFactory threadFactory, boolean z) {
        this.f11135a = bVar;
        this.f11136b = j2Var;
        this.f11137c = o6Var;
        this.f11140f = threadFactory.newThread(new C4494b());
        this.f11142h = new C4488k2(dVar);
        this.f11143i = z;
    }

    /* renamed from: c */
    private C4414c2 m15554c() {
        return new C4414c2(this.f11135a.mo6710c());
    }

    /* renamed from: a */
    public void mo15658a(C4432e1 e1Var) {
        this.f11137c.mo15658a(e1Var);
    }

    /* renamed from: b */
    public void mo15660b(C4432e1 e1Var) {
        this.f11137c.mo15660b(e1Var);
    }

    /* renamed from: b */
    private void m15553b(C4463h2 h2Var) {
        if (h2Var.mo15461g() || this.f11143i) {
            this.f11142h.mo15635a(h2Var);
        } else {
            this.f11136b.mo15635a(h2Var);
        }
    }

    /* renamed from: a */
    public void mo15657a(C4419d dVar, C4463h2 h2Var) {
        this.f11137c.mo15657a(dVar, h2Var);
    }

    /* renamed from: a */
    public void mo15659a(C4470i1 i1Var) {
        this.f11137c.mo15659a(i1Var);
    }

    /* renamed from: a */
    public void mo15656a(C4410c cVar) {
        synchronized (this.f11138d) {
            this.f11141g = false;
            this.f11140f.interrupt();
            this.f11140f = null;
        }
        if (!this.f11137c.mo15753a()) {
            this.f11137c.mo15657a(cVar, m15554c());
        }
        C4463h2 c = this.f11137c.mo15756c();
        if (c != null) {
            m15553b(c);
        }
        cVar.mo15484a();
    }

    /* renamed from: a */
    public void mo15655a() {
        synchronized (this.f11138d) {
            if (this.f11139e) {
                C1557c.m7458a(f11134j, "Automatic request execution start was previously requested, continuing without action.");
                return;
            }
            if (this.f11140f != null) {
                this.f11140f.start();
            }
            this.f11139e = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15548a(C4463h2 h2Var) {
        if (h2Var.mo15461g() || this.f11143i) {
            this.f11142h.mo15636b(h2Var);
        } else {
            this.f11136b.mo15636b(h2Var);
        }
    }
}
