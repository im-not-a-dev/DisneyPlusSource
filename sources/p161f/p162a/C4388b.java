package p161f.p162a;

import android.content.Context;
import com.appboy.C1440a;
import com.appboy.C1475c;
import com.appboy.p027p.C1518c;
import com.appboy.p027p.C1519d;
import com.appboy.p033s.C1557c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import p161f.p162a.C4517n1.C4519b;

/* renamed from: f.a.b */
public class C4388b {
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final String f10933r = C1557c.m7461a(C4388b.class);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4619x0 f10934a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4562q6 f10935b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C4595u0 f10936c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f10937d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C4464h3 f10938e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C4597u2 f10939f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C4424d3 f10940g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C4491k5 f10941h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C4496l0 f10942i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C4506m0 f10943j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C4381a1 f10944k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C4419d f10945l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C4513m5 f10946m;

    /* renamed from: n */
    AtomicBoolean f10947n = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: o */
    public AtomicBoolean f10948o = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C4574s f10949p;

    /* renamed from: q */
    long f10950q = 0;

    /* renamed from: f.a.b$a */
    class C4389a implements C1518c<C4515n> {
        C4389a() {
        }

        /* renamed from: a */
        public void trigger(C4515n nVar) {
            C4388b.this.m15146a(nVar);
            C1440a.m6921c(C4388b.this.f10937d).mo6588j();
        }
    }

    /* renamed from: f.a.b$b */
    class C4390b implements C1518c<C4495l> {
        C4390b() {
        }

        /* renamed from: a */
        public void trigger(C4495l lVar) {
            C4388b.this.f10943j.mo15678a(lVar.mo15662a());
            C4388b.this.f10944k.mo15397a(lVar.mo15662a());
        }
    }

    /* renamed from: f.a.b$c */
    class C4391c implements C1518c<C4468i> {
        C4391c() {
        }

        /* renamed from: a */
        public void trigger(C4468i iVar) {
            C4388b.this.f10943j.mo15679a(iVar.mo15617a());
        }
    }

    /* renamed from: f.a.b$d */
    class C4392d implements C1518c<C4574s> {
        C4392d() {
        }

        /* renamed from: a */
        public void trigger(C4574s sVar) {
            C4388b.this.f10948o.set(true);
            C4388b.this.f10949p = sVar;
            C1557c.m7469c(C4388b.f10933r, "Requesting trigger update due to trigger-eligible push click event");
            C4595u0 f = C4388b.this.f10936c;
            C4519b bVar = new C4519b();
            bVar.mo15715b();
            f.mo15765a(bVar);
        }
    }

    /* renamed from: f.a.b$e */
    class C4393e implements C1518c<C4602v> {
        C4393e() {
        }

        /* renamed from: a */
        public void trigger(C4602v vVar) {
            C4388b.this.f10941h.mo15671a(vVar.mo15882a());
            C4388b.this.mo15428c();
            C4388b.this.mo15429d();
        }
    }

    /* renamed from: f.a.b$f */
    class C4394f implements C1518c<C4438f> {
        C4394f() {
        }

        /* renamed from: a */
        public void trigger(C4438f fVar) {
            C4463h2 a = fVar.mo15531a();
            C4517n1 f = a.mo15589f();
            if (f != null && f.mo15708c()) {
                C4388b.this.f10940g.mo15496a(false);
            }
            C4498l1 c = a.mo15585c();
            if (c != null) {
                C4388b.this.f10939f.mo15794b(c, true);
            }
            C4535o1 e = a.mo15588e();
            if (e != null) {
                C4388b.this.f10938e.mo15794b(e, true);
            }
            C4404b1 h = a.mo15590h();
            if (h != null) {
                C4388b.this.f10942i.mo15665a((List<C4432e1>) new ArrayList<C4432e1>(h.mo15456a()));
            }
        }
    }

    /* renamed from: f.a.b$g */
    class C4395g implements C1518c<C4586t> {
        C4395g() {
        }

        /* renamed from: a */
        public void trigger(C4586t tVar) {
            C4388b.this.f10941h.mo15653a(tVar.mo15832a());
        }
    }

    /* renamed from: f.a.b$h */
    class C4396h implements C1518c<Throwable> {

        /* renamed from: a */
        final /* synthetic */ Semaphore f10958a;

        C4396h(Semaphore semaphore) {
            this.f10958a = semaphore;
        }

        /* renamed from: a */
        public void trigger(Throwable th) {
            Semaphore semaphore;
            try {
                C4388b.this.f10936c.mo15776b(th);
                semaphore = this.f10958a;
                if (semaphore == null) {
                    return;
                }
            } catch (Exception e) {
                C1557c.m7470c(C4388b.f10933r, "Failed to log error.", e);
                semaphore = this.f10958a;
                if (semaphore == null) {
                    return;
                }
            } catch (Throwable th2) {
                Semaphore semaphore2 = this.f10958a;
                if (semaphore2 != null) {
                    semaphore2.release();
                }
                throw th2;
            }
            semaphore.release();
        }
    }

    /* renamed from: f.a.b$i */
    class C4397i implements C1518c<C4476j> {
        C4397i() {
        }

        /* renamed from: a */
        public void trigger(C4476j jVar) {
            C4631y3 a = jVar.mo15628a();
            synchronized (C4388b.this.f10946m) {
                if (C4388b.this.f10946m.mo15695a(a)) {
                    C4388b.this.f10945l.mo15485a(new C1519d(jVar.mo15629b(), jVar.mo15630c()), C1519d.class);
                    C4388b.this.f10946m.mo15694a(a, C4472i3.m15480a());
                    C4388b.this.f10941h.mo15652a(C4472i3.m15480a());
                } else {
                    String q = C4388b.f10933r;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not publish in-app message with trigger action id: ");
                    sb.append(a.mo15473d());
                    C1557c.m7458a(q, sb.toString());
                }
            }
        }
    }

    /* renamed from: f.a.b$j */
    class C4398j implements C1518c<C4594u> {
        C4398j() {
        }

        /* renamed from: a */
        public void trigger(C4594u uVar) {
            C4388b.this.f10941h.mo15654a(uVar.mo15862a(), uVar.mo15863b());
        }
    }

    /* renamed from: f.a.b$k */
    class C4399k implements C1518c<C4618x> {
        C4399k() {
        }

        /* renamed from: a */
        public void trigger(C4618x xVar) {
            try {
                C4388b.this.f10936c.mo15769a((Throwable) xVar);
            } catch (Exception e) {
                C1557c.m7470c(C4388b.f10933r, "Failed to log the storage exception.", e);
            }
        }
    }

    /* renamed from: f.a.b$l */
    class C4400l implements C1518c<C4430e> {
        C4400l() {
        }

        /* renamed from: a */
        public void trigger(C4430e eVar) {
            C4463h2 a = eVar.mo15513a();
            C4517n1 f = a.mo15589f();
            if (f != null) {
                if (f.mo15711g()) {
                    C4388b.this.mo15428c();
                    C4388b.this.mo15429d();
                }
                if (f.mo15708c()) {
                    C4388b.this.f10940g.mo15496a(true);
                }
            }
            C4498l1 c = a.mo15585c();
            if (c != null) {
                C4388b.this.f10939f.mo15794b(c, false);
            }
            C4535o1 e = a.mo15588e();
            if (e != null) {
                C4388b.this.f10938e.mo15794b(e, false);
            }
            C4404b1 h = a.mo15590h();
            if (h != null) {
                for (C4432e1 a2 : h.mo15456a()) {
                    C4388b.this.f10935b.mo15658a(a2);
                }
            }
        }
    }

    /* renamed from: f.a.b$m */
    class C4401m implements C1518c<C4505m> {
        C4401m() {
        }

        /* renamed from: a */
        public void trigger(C4505m mVar) {
            C1557c.m7458a(C4388b.f10933r, "Session start event for new session received.");
            C4388b.this.f10936c.mo15772a((C4432e1) C4548p1.m15796n());
            C4388b.this.f10934a.mo15739a();
            C4388b.this.mo15440o();
            C1475c.m6994a(C4388b.this.f10937d, false);
            C4388b.this.f10938e.mo15604d();
        }
    }

    /* renamed from: f.a.b$n */
    class C4402n implements C1518c<C4485k> {
        C4402n() {
        }

        /* renamed from: a */
        public void trigger(C4485k kVar) {
            C4388b.this.mo15440o();
        }
    }

    public C4388b(Context context, C4619x0 x0Var, C4562q6 q6Var, C4546p0 p0Var, C4464h3 h3Var, C4597u2 u2Var, C4424d3 d3Var, C4491k5 k5Var, C4513m5 m5Var, C4496l0 l0Var, C4506m0 m0Var, C4381a1 a1Var, C4419d dVar) {
        this.f10934a = x0Var;
        this.f10935b = q6Var;
        this.f10936c = p0Var;
        this.f10937d = context;
        this.f10938e = h3Var;
        this.f10939f = u2Var;
        this.f10940g = d3Var;
        this.f10941h = k5Var;
        this.f10946m = m5Var;
        this.f10942i = l0Var;
        this.f10943j = m0Var;
        this.f10944k = a1Var;
        this.f10945l = dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public void mo15440o() {
        if (this.f10950q + 5 < C4472i3.m15480a()) {
            this.f10947n.set(true);
            C1557c.m7458a(f10933r, "Requesting trigger refresh.");
            C4595u0 u0Var = this.f10936c;
            C4519b bVar = new C4519b();
            bVar.mo15715b();
            u0Var.mo15765a(bVar);
            this.f10950q = C4472i3.m15480a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public C1518c<C4618x> mo15441p() {
        return new C4399k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1518c<C4430e> mo15427b() {
        return new C4400l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo15428c() {
        if (this.f10947n.compareAndSet(true, false)) {
            this.f10941h.mo15653a((C4641z4) new C4417c5());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo15429d() {
        if (this.f10948o.compareAndSet(true, false) && this.f10949p.mo15816a() != null) {
            this.f10941h.mo15653a((C4641z4) new C4436e5(this.f10949p.mo15816a(), this.f10949p.mo15817b()));
            this.f10949p = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C1518c<C4505m> mo15430e() {
        return new C4401m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C1518c<C4485k> mo15431f() {
        return new C4402n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C1518c<C4515n> mo15432g() {
        return new C4389a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C1518c<C4495l> mo15433h() {
        return new C4390b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C1518c<C4468i> mo15434i() {
        return new C4391c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C1518c<C4574s> mo15435j() {
        return new C4392d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C1518c<C4602v> mo15436k() {
        return new C4393e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C1518c<C4586t> mo15437l() {
        return new C4395g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C1518c<C4476j> mo15438m() {
        return new C4397i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C1518c<C4594u> mo15439n() {
        return new C4398j();
    }

    /* renamed from: a */
    public void mo15426a(C4410c cVar) {
        cVar.mo15487b(mo15427b(), C4430e.class);
        cVar.mo15487b(mo15430e(), C4505m.class);
        cVar.mo15487b(mo15432g(), C4515n.class);
        cVar.mo15487b(mo15435j(), C4574s.class);
        cVar.mo15487b(mo15433h(), C4495l.class);
        cVar.mo15487b(mo15425a((Semaphore) null), Throwable.class);
        cVar.mo15487b(mo15441p(), C4618x.class);
        cVar.mo15487b(mo15436k(), C4602v.class);
        cVar.mo15487b(mo15431f(), C4485k.class);
        cVar.mo15487b(mo15424a(), C4438f.class);
        cVar.mo15487b(mo15434i(), C4468i.class);
        cVar.mo15487b(mo15437l(), C4586t.class);
        cVar.mo15487b(mo15438m(), C4476j.class);
        cVar.mo15487b(mo15439n(), C4594u.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1518c<C4438f> mo15424a() {
        return new C4394f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1518c<Throwable> mo15425a(Semaphore semaphore) {
        return new C4396h(semaphore);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15146a(C4515n nVar) {
        try {
            C4462h1 a = nVar.mo15699a();
            C4548p1 a2 = C4548p1.m15760a(a.mo15575f());
            a2.mo15518a(a.mo15570a());
            this.f10936c.mo15772a((C4432e1) a2);
        } catch (JSONException unused) {
            C1557c.m7473e(f10933r, "Could not create session end event.");
        }
    }
}
