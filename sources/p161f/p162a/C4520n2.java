package p161f.p162a;

import android.net.Uri;
import com.appboy.p025o.p026k.C1510e;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p161f.p162a.C4517n1.C4519b;

/* renamed from: f.a.n2 */
public class C4520n2 extends C4638z1 {
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public static final String f11215p0 = C1557c.m7461a(C4520n2.class);

    /* renamed from: g0 */
    private final String f11216g0;

    /* renamed from: h0 */
    private final long f11217h0;

    /* renamed from: i0 */
    private final String f11218i0;

    /* renamed from: j0 */
    private final C4641z4 f11219j0;

    /* renamed from: k0 */
    private final C4385a4 f11220k0;

    /* renamed from: l0 */
    private final C4517n1 f11221l0;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public final C4595u0 f11222m0;

    /* renamed from: n0 */
    private final C4549p2 f11223n0 = m15646p();

    /* renamed from: o0 */
    private final long f11224o0 = m15643a(this.f11220k0.mo15472c());

    /* renamed from: f.a.n2$a */
    class C4521a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C4463h2 f11226c;

        C4521a(C4463h2 h2Var) {
            this.f11226c = h2Var;
        }

        public void run() {
            C1557c.m7458a(C4520n2.f11215p0, "Adding request to dispatch");
            C4520n2.this.f11222m0.mo15764a(this.f11226c);
        }
    }

    public C4520n2(String str, C4385a4 a4Var, C4641z4 z4Var, C4595u0 u0Var, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("template");
        super(Uri.parse(sb.toString()), null);
        this.f11216g0 = a4Var.mo15413l();
        this.f11217h0 = a4Var.mo15412k();
        this.f11218i0 = a4Var.mo15414m();
        this.f11219j0 = z4Var;
        C4519b bVar = new C4519b();
        bVar.mo15714a(str2);
        this.f11221l0 = bVar.mo15716c();
        this.f11222m0 = u0Var;
        this.f11220k0 = a4Var;
    }

    /* renamed from: p */
    private C4549p2 m15646p() {
        return new C4549p2((int) Math.min(this.f11224o0, TimeUnit.MINUTES.toMillis(1)), (int) TimeUnit.SECONDS.toMillis(1));
    }

    /* renamed from: b */
    public C4601u6 mo15460b() {
        return C4601u6.POST;
    }

    /* renamed from: g */
    public boolean mo15461g() {
        return false;
    }

    /* renamed from: i */
    public JSONObject mo15462i() {
        JSONObject i = super.mo15462i();
        if (i == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trigger_id", this.f11216g0);
            jSONObject.put("trigger_event_type", this.f11219j0.mo15479d());
            if (this.f11219j0.mo15615e() != null) {
                jSONObject.put("data", this.f11219j0.mo15615e().mo6750b());
            }
            i.put("template", jSONObject);
            if (this.f11221l0.mo15710f()) {
                i.put("respond_with", this.f11221l0.mo6750b());
            }
            return i;
        } catch (JSONException e) {
            C1557c.m7474e(f11215p0, "Experienced JSONException while retrieving parameters. Returning null.", e);
            return null;
        }
    }

    /* renamed from: l */
    public long mo15717l() {
        return this.f11217h0;
    }

    /* renamed from: m */
    public C4631y3 mo15718m() {
        return this.f11220k0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo15719n() {
        C1557c.m7469c(f11215p0, "Template request failed. Attempting to log in-app message template request failure.");
        if (C1563i.m7490d(this.f11216g0)) {
            C1557c.m7458a(f11215p0, "Trigger ID not found. Not logging in-app message template request failure.");
        } else if (this.f11222m0 == null) {
            C1557c.m7465b(f11215p0, "Cannot log an in-app message template request failure because the IAppboyManager is null.");
        } else {
            try {
                this.f11222m0.mo15772a((C4432e1) C4548p1.m15768a((String) null, (String) null, this.f11216g0, C1510e.TEMPLATE_REQUEST));
            } catch (JSONException e) {
                this.f11222m0.mo15776b((Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public void mo15458a(C4419d dVar, C4596u1 u1Var) {
        this.f11223n0.mo15786a();
        if (u1Var == null || !u1Var.mo15865b()) {
            mo15719n();
        } else if (!C1563i.m7490d(this.f11218i0)) {
            u1Var.mo15872i().mo6805b(this.f11218i0);
        }
    }

    /* renamed from: a */
    public void mo15527a(C4419d dVar, C4419d dVar2, C4612w1 w1Var) {
        super.mo15527a(dVar, dVar2, w1Var);
        mo15719n();
        if (w1Var instanceof C4588t1) {
            dVar.mo15485a(new C4594u(this.f11219j0, this.f11220k0), C4594u.class);
        } else if (w1Var instanceof C4620x1) {
            C1557c.m7471d(f11215p0, "Response error was a server failure. Retrying request after some delay if not expired.");
            long g = this.f11219j0.mo15616g() + this.f11224o0;
            if (C4472i3.m15487c() < g) {
                int c = this.f11223n0.mo15788c();
                String str = f11215p0;
                StringBuilder sb = new StringBuilder();
                sb.append("Retrying template request after delay of ");
                sb.append(c);
                sb.append(" ms");
                C1557c.m7458a(str, sb.toString());
                C4537o3.m15702a().postDelayed(new C4521a(this), (long) c);
                return;
            }
            String str2 = f11215p0;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Template request expired at time: ");
            sb2.append(g);
            sb2.append(" and is not eligible for a backoff response. Not retrying or performing any fallback triggers");
            C1557c.m7458a(str2, sb2.toString());
        }
    }

    /* renamed from: a */
    private long m15643a(C4591t4 t4Var) {
        if (t4Var.mo15857e() == -1) {
            return TimeUnit.SECONDS.toMillis((long) (t4Var.mo15859g() + 30));
        }
        return (long) t4Var.mo15857e();
    }
}
