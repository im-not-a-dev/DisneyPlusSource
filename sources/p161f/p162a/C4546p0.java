package p161f.p162a;

import android.app.Activity;
import android.os.Handler;
import com.appboy.p024n.C1489b;
import com.appboy.p030r.p032p.C1552b;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import com.appboy.p033s.C1564j;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import p161f.p162a.C4517n1.C4519b;

/* renamed from: f.a.p0 */
public class C4546p0 implements C4595u0 {

    /* renamed from: r */
    private static final String f11302r = C1557c.m7461a(C4546p0.class);

    /* renamed from: a */
    private AtomicInteger f11303a = new AtomicInteger(0);

    /* renamed from: b */
    private AtomicInteger f11304b = new AtomicInteger(0);

    /* renamed from: c */
    private volatile String f11305c = "";

    /* renamed from: d */
    private final Object f11306d = new Object();

    /* renamed from: e */
    private final Object f11307e = new Object();

    /* renamed from: f */
    private final C4564r0 f11308f;

    /* renamed from: g */
    private final C4555q0 f11309g;

    /* renamed from: h */
    private final C4562q6 f11310h;

    /* renamed from: i */
    private final C4419d f11311i;

    /* renamed from: j */
    private final C4603v0 f11312j;

    /* renamed from: k */
    private final C1489b f11313k;

    /* renamed from: l */
    private final C4424d3 f11314l;

    /* renamed from: m */
    private final C4496l0 f11315m;

    /* renamed from: n */
    private final String f11316n;

    /* renamed from: o */
    private final C4415c3 f11317o;

    /* renamed from: p */
    private final Handler f11318p;

    /* renamed from: q */
    private Class<? extends Activity> f11319q = null;

    /* renamed from: f.a.p0$a */
    class C4547a implements Runnable {
        C4547a() {
        }

        public void run() {
            C4546p0.this.mo15778d();
        }
    }

    public C4546p0(C4564r0 r0Var, C4562q6 q6Var, C4419d dVar, C4603v0 v0Var, C1489b bVar, C4424d3 d3Var, C4496l0 l0Var, String str, boolean z, C4555q0 q0Var, C4415c3 c3Var) {
        this.f11308f = r0Var;
        this.f11310h = q6Var;
        this.f11311i = dVar;
        this.f11312j = v0Var;
        this.f11313k = bVar;
        this.f11316n = str;
        this.f11314l = d3Var;
        this.f11315m = l0Var;
        this.f11309g = q0Var;
        this.f11317o = c3Var;
        this.f11318p = C4537o3.m15702a();
    }

    /* renamed from: a */
    public C4462h1 mo15759a() {
        if (this.f11317o.mo15491a()) {
            C1557c.m7473e(f11302r, "SDK is disabled. Returning null session.");
            return null;
        }
        C4462h1 a = this.f11308f.mo15799a();
        String str = f11302r;
        StringBuilder sb = new StringBuilder();
        sb.append("Completed the openSession call. Starting or continuing session ");
        sb.append(a.mo15570a());
        C1557c.m7469c(str, sb.toString());
        return a;
    }

    /* renamed from: a */
    public void mo15771a(boolean z) {
    }

    /* renamed from: b */
    public C4462h1 mo15773b(Activity activity) {
        if (this.f11317o.mo15491a()) {
            C1557c.m7473e(f11302r, "SDK is disabled. Returning null session.");
            return null;
        } else if (this.f11319q != null && !activity.getClass().equals(this.f11319q)) {
            return null;
        } else {
            this.f11309g.mo15790b();
            String str = f11302r;
            StringBuilder sb = new StringBuilder();
            sb.append("Closed session with activity: ");
            sb.append(activity.getLocalClassName());
            C1557c.m7471d(str, sb.toString());
            return this.f11308f.mo15800b();
        }
    }

    /* renamed from: c */
    public void mo15777c() {
        if (this.f11317o.mo15491a()) {
            C1557c.m7473e(f11302r, "SDK is disabled. Not force closing session.");
            return;
        }
        this.f11319q = null;
        this.f11308f.mo15803e();
    }

    /* renamed from: d */
    public void mo15778d() {
        mo15765a(new C4519b());
    }

    /* renamed from: e */
    public String mo15779e() {
        return this.f11316n;
    }

    /* renamed from: c */
    private boolean m15738c(Throwable th) {
        synchronized (this.f11307e) {
            this.f11303a.getAndIncrement();
            if (this.f11305c.equals(th.getMessage()) && this.f11304b.get() > 3 && this.f11303a.get() < 100) {
                return true;
            }
            if (this.f11305c.equals(th.getMessage())) {
                this.f11304b.getAndIncrement();
            } else {
                this.f11304b.set(0);
            }
            if (this.f11303a.get() >= 100) {
                this.f11303a.set(0);
            }
            this.f11305c = th.getMessage();
            return false;
        }
    }

    /* renamed from: a */
    public C4462h1 mo15760a(Activity activity) {
        if (this.f11317o.mo15491a()) {
            C1557c.m7473e(f11302r, "SDK is disabled. Returning null session.");
            return null;
        }
        C4462h1 a = mo15759a();
        this.f11319q = activity.getClass();
        this.f11309g.mo15789a();
        String str = f11302r;
        StringBuilder sb = new StringBuilder();
        sb.append("Opened session with activity: ");
        sb.append(activity.getLocalClassName());
        C1557c.m7471d(str, sb.toString());
        return a;
    }

    /* renamed from: b */
    public C4470i1 mo15774b() {
        return this.f11308f.mo15801c();
    }

    /* renamed from: b */
    public void mo15776b(Throwable th) {
        m15736a(th, true);
    }

    /* renamed from: b */
    public void mo15775b(C4432e1 e1Var) {
        C1557c.m7458a(f11302r, "Posting geofence report for geofence event.");
        mo15764a((C4463h2) new C4454g2(this.f11313k.mo6710c(), e1Var));
    }

    /* renamed from: a */
    public boolean mo15772a(C4432e1 e1Var) {
        boolean z = false;
        if (this.f11317o.mo15491a()) {
            String str = f11302r;
            StringBuilder sb = new StringBuilder();
            sb.append("SDK is disabled. Not logging event: ");
            sb.append(e1Var);
            C1557c.m7473e(str, sb.toString());
            return false;
        }
        synchronized (this.f11306d) {
            if (e1Var != null) {
                if (this.f11308f.mo15802d() || this.f11308f.mo15801c() == null) {
                    String str2 = f11302r;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Not adding session id to event: ");
                    sb2.append(C4569r3.m15868a((JSONObject) e1Var.mo6750b()));
                    C1557c.m7458a(str2, sb2.toString());
                    z = true;
                } else {
                    e1Var.mo15518a(this.f11308f.mo15801c());
                }
                if (!C1563i.m7491e(mo15779e())) {
                    e1Var.mo15519a(mo15779e());
                } else {
                    String str3 = f11302r;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Not adding user id to event: ");
                    sb3.append(C4569r3.m15868a((JSONObject) e1Var.mo6750b()));
                    C1557c.m7458a(str3, sb3.toString());
                }
                String str4 = f11302r;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Attempting to log event: ");
                sb4.append(C4569r3.m15868a((JSONObject) e1Var.mo6750b()));
                C1557c.m7471d(str4, sb4.toString());
                if (e1Var instanceof C4567r1) {
                    C1557c.m7458a(f11302r, "Publishing an internal push body clicked event for any awaiting triggers.");
                    mo15766a((C4567r1) e1Var);
                }
                if (!e1Var.mo15526i()) {
                    this.f11315m.mo15664a(e1Var);
                }
                if (m15737a(z, e1Var)) {
                    C1557c.m7458a(f11302r, "Adding push click to dispatcher pending list");
                    this.f11310h.mo15660b(e1Var);
                } else {
                    this.f11310h.mo15658a(e1Var);
                }
                if (e1Var.mo15521d().equals(C4585s6.SESSION_START)) {
                    this.f11310h.mo15659a(e1Var.mo15525h());
                }
            } else {
                C1557c.m7465b(f11302r, "Appboy manager received null event.");
                throw new NullPointerException();
            }
        }
        if (z) {
            this.f11318p.removeCallbacksAndMessages(null);
            this.f11318p.postDelayed(new C4547a(), 1000);
        }
        return true;
    }

    /* renamed from: a */
    public void mo15769a(Throwable th) {
        m15736a(th, false);
    }

    /* renamed from: a */
    public void mo15768a(String str, String str2, boolean z) {
        if (str == null || !C1564j.m7497b(str)) {
            throw new IllegalArgumentException("Reply to email address is invalid");
        } else if (!C1563i.m7490d(str2)) {
            C1552b bVar = new C1552b(str2, str, z, this.f11312j.mo15818a(), mo15779e());
            mo15764a((C4463h2) new C4433e2(this.f11313k.mo6710c(), bVar));
        } else {
            throw new IllegalArgumentException("Feedback message cannot be null or blank");
        }
    }

    /* renamed from: a */
    public void mo15765a(C4519b bVar) {
        if (bVar == null) {
            C1557c.m7458a(f11302r, "Cannot request data sync with null respond with object");
            return;
        }
        C4424d3 d3Var = this.f11314l;
        if (d3Var != null && d3Var.mo15508l()) {
            bVar.mo15713a(new C4507m1(this.f11314l.mo15503g()));
        }
        bVar.mo15714a(mo15779e());
        C4517n1 c = bVar.mo15716c();
        if (c.mo15708c() && (c.mo15711g() || c.mo15709e())) {
            this.f11314l.mo15496a(false);
        }
        mo15764a((C4463h2) new C4414c2(this.f11313k.mo6710c(), c));
    }

    /* renamed from: a */
    public void mo15763a(C4445f1 f1Var) {
        C1557c.m7458a(f11302r, "Posting geofence request for location.");
        mo15764a((C4463h2) new C4446f2(this.f11313k.mo6710c(), f1Var));
    }

    /* renamed from: a */
    public void mo15764a(C4463h2 h2Var) {
        if (this.f11317o.mo15491a()) {
            C1557c.m7473e(f11302r, "SDK is disabled. Not adding request to dispatch.");
        } else {
            this.f11310h.mo15657a(this.f11311i, h2Var);
        }
    }

    /* renamed from: a */
    public void mo15762a(C4385a4 a4Var, C4641z4 z4Var) {
        C4520n2 n2Var = new C4520n2(this.f11313k.mo6710c(), a4Var, z4Var, this, mo15779e());
        mo15764a((C4463h2) n2Var);
    }

    /* renamed from: a */
    public void mo15767a(C4641z4 z4Var) {
        this.f11311i.mo15485a(new C4586t(z4Var), C4586t.class);
    }

    /* renamed from: a */
    public void mo15770a(List<String> list, long j) {
        C4536o2 o2Var = new C4536o2(this.f11313k.mo6710c(), list, j, this.f11316n);
        mo15764a((C4463h2) o2Var);
    }

    /* renamed from: a */
    public void mo15761a(long j, long j2) {
        C4405b2 b2Var = new C4405b2(this.f11313k.mo6710c(), j, j2, this.f11316n);
        mo15764a((C4463h2) b2Var);
    }

    /* renamed from: a */
    private void m15736a(Throwable th, boolean z) {
        try {
            if (m15738c(th)) {
                String str = f11302r;
                StringBuilder sb = new StringBuilder();
                sb.append("Not logging duplicate error: ");
                sb.append(th);
                C1557c.m7473e(str, sb.toString());
                return;
            }
            mo15772a((C4432e1) C4548p1.m15773a(th, mo15774b(), z));
        } catch (JSONException e) {
            String str2 = f11302r;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to create error event from ");
            sb2.append(th);
            C1557c.m7470c(str2, sb2.toString(), e);
        } catch (Exception e2) {
            C1557c.m7470c(f11302r, "Failed to log error.", e2);
        }
    }

    /* renamed from: a */
    private static boolean m15737a(boolean z, C4432e1 e1Var) {
        boolean z2 = false;
        if (!z) {
            return false;
        }
        if (e1Var instanceof C4556q1) {
            return !((C4556q1) e1Var).mo15792o();
        }
        if ((e1Var instanceof C4567r1) || (e1Var instanceof C4576s1)) {
            z2 = true;
        }
        return z2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo15766a(C4567r1 r1Var) {
        JSONObject c = r1Var.mo15520c();
        if (c != null) {
            this.f11311i.mo15485a(new C4574s(c.optString("cid", null), r1Var), C4574s.class);
            return;
        }
        C1557c.m7473e(f11302r, "Event json was null. Not publishing push clicked trigger event.");
    }
}
