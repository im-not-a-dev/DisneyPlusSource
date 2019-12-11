package p161f.p162a;

import com.appboy.p027p.C1516a;
import com.appboy.p027p.C1517b;
import com.appboy.p030r.C1532b;
import com.appboy.p033s.C1557c;
import java.net.URI;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.a2 */
public final class C4382a2 implements Runnable {

    /* renamed from: c0 */
    private static final String f10915c0 = C1557c.m7461a(C4382a2.class);

    /* renamed from: U */
    private final C4419d f10916U;

    /* renamed from: V */
    private final C4419d f10917V;

    /* renamed from: W */
    private final Map<String, String> f10918W;

    /* renamed from: X */
    private final C4457g5 f10919X;

    /* renamed from: Y */
    private final C4621x2 f10920Y;

    /* renamed from: Z */
    private final C4424d3 f10921Z;

    /* renamed from: a0 */
    private final C4589t2 f10922a0;

    /* renamed from: b0 */
    private final C4595u0 f10923b0;

    /* renamed from: c */
    private final C4463h2 f10924c;

    /* renamed from: f.a.a2$a */
    static /* synthetic */ class C4383a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10925a = new int[C4601u6.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                f.a.u6[] r0 = p161f.p162a.C4601u6.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10925a = r0
                int[] r0 = f10925a     // Catch:{ NoSuchFieldError -> 0x0014 }
                f.a.u6 r1 = p161f.p162a.C4601u6.GET     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f10925a     // Catch:{ NoSuchFieldError -> 0x001f }
                f.a.u6 r1 = p161f.p162a.C4601u6.POST     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p161f.p162a.C4382a2.C4383a.<clinit>():void");
        }
    }

    public C4382a2(C4463h2 h2Var, C4423d2 d2Var, C4457g5 g5Var, C4419d dVar, C4419d dVar2, C4621x2 x2Var, C4595u0 u0Var, C4424d3 d3Var, C4589t2 t2Var) {
        this.f10924c = h2Var;
        this.f10916U = dVar;
        this.f10917V = dVar2;
        this.f10918W = d2Var.mo15494a();
        this.f10924c.mo15459a(this.f10918W);
        this.f10919X = g5Var;
        this.f10920Y = x2Var;
        this.f10923b0 = u0Var;
        this.f10921Z = d3Var;
        this.f10922a0 = t2Var;
    }

    /* renamed from: a */
    private C4596u1 m15119a() {
        URI a = C4550p3.m15815a(this.f10924c.mo15622a());
        int i = C4383a.f10925a[this.f10924c.mo15460b().ordinal()];
        if (i == 1) {
            return new C4596u1(this.f10919X.mo15529a(a, this.f10918W), this.f10924c, this.f10923b0);
        }
        if (i != 2) {
            String str = f10915c0;
            StringBuilder sb = new StringBuilder();
            sb.append("Received a request with an unknown Http verb: [");
            sb.append(this.f10924c.mo15460b());
            sb.append("]");
            C1557c.m7473e(str, sb.toString());
            return null;
        }
        JSONObject i2 = this.f10924c.mo15462i();
        if (i2 != null) {
            return new C4596u1(this.f10919X.mo15530a(a, this.f10918W, i2), this.f10924c, this.f10923b0);
        }
        C1557c.m7465b(f10915c0, "Could not parse request parameters for put request to [%s], canceling request.");
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo15403b(C4596u1 u1Var) {
        String e = this.f10923b0.mo15779e();
        if (u1Var.mo15864a()) {
            try {
                C1517b a = this.f10920Y.mo15891a(u1Var.mo15871h(), e);
                if (a != null) {
                    this.f10917V.mo15485a(a, C1517b.class);
                }
            } catch (JSONException unused) {
                C1557c.m7473e(f10915c0, "Unable to update/publish feed.");
            }
        }
        if (u1Var.mo15870g()) {
            try {
                C1516a a2 = this.f10922a0.mo15836a(u1Var.mo15876m(), e);
                if (a2 != null) {
                    this.f10917V.mo15485a(a2, C1516a.class);
                }
            } catch (JSONException e2) {
                C1557c.m7470c(f10915c0, "Encountered JSON exception while parsing Content Cards update. Unable to publish Content Cards update event.", e2);
            }
        }
        if (u1Var.mo15866c()) {
            this.f10921Z.mo15495a(u1Var.mo15873j());
            this.f10916U.mo15485a(new C4495l(u1Var.mo15873j()), C4495l.class);
        }
        if (u1Var.mo15867d()) {
            this.f10916U.mo15485a(new C4602v(u1Var.mo15874k()), C4602v.class);
        }
        if (u1Var.mo15865b()) {
            C4463h2 h2Var = this.f10924c;
            if (h2Var instanceof C4520n2) {
                C4520n2 n2Var = (C4520n2) h2Var;
                C1532b i = u1Var.mo15872i();
                i.mo6801a(n2Var.mo15717l());
                this.f10916U.mo15485a(new C4476j(n2Var.mo15718m(), i, e), C4476j.class);
            }
        }
        if (u1Var.mo15869f()) {
            this.f10916U.mo15485a(new C4468i(u1Var.mo15875l()), C4468i.class);
        }
    }

    public void run() {
        try {
            C4596u1 a = m15119a();
            if (a != null) {
                mo15402a(a);
                this.f10916U.mo15485a(new C4459h(this.f10924c), C4459h.class);
                this.f10916U.mo15485a(new C4438f(this.f10924c), C4438f.class);
                return;
            }
            C1557c.m7473e(f10915c0, "Api response was null, failing task.");
            this.f10924c.mo15527a(this.f10916U, this.f10917V, new C4620x1("An error occurred during request processing, resulting in no valid response being received. Check the error log for more details."));
            this.f10916U.mo15485a(new C4430e(this.f10924c), C4430e.class);
        } catch (Exception e) {
            if (e instanceof C4610w) {
                C1557c.m7458a(f10915c0, "Experienced network communication exception processing API response. Sending network error event.");
                this.f10916U.mo15485a(new C4451g(this.f10924c), C4451g.class);
            }
            C1557c.m7474e(f10915c0, "Experienced exception processing API response. Failing task.", e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo15402a(C4596u1 u1Var) {
        if (!u1Var.mo15868e()) {
            this.f10924c.mo15458a(this.f10917V, u1Var);
        } else {
            m15120a(u1Var.mo15877n());
            this.f10924c.mo15527a(this.f10916U, this.f10917V, u1Var.mo15877n());
        }
        mo15403b(u1Var);
        this.f10924c.mo15623a(this.f10916U);
    }

    /* renamed from: a */
    private void m15120a(C4612w1 w1Var) {
        String str = f10915c0;
        StringBuilder sb = new StringBuilder();
        sb.append("Received server error from request: ");
        sb.append(w1Var.mo15834a());
        C1557c.m7465b(str, sb.toString());
    }
}
