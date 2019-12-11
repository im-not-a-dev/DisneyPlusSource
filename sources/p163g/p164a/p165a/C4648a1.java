package p163g.p164a.p165a;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;

/* renamed from: g.a.a.a1 */
/* compiled from: TargetPreviewManager */
class C4648a1 implements C4719c, C4720d {

    /* renamed from: i */
    private static C4648a1 f11602i;

    /* renamed from: j */
    private static final Object f11603j = new Object();

    /* renamed from: k */
    private static final Object f11604k = new Object();

    /* renamed from: a */
    private String f11605a = null;

    /* renamed from: b */
    private String f11606b = null;

    /* renamed from: c */
    private float f11607c = -1.0f;

    /* renamed from: d */
    private float f11608d = -1.0f;

    /* renamed from: e */
    private String f11609e = null;

    /* renamed from: f */
    private final Object f11610f = new Object();

    /* renamed from: g */
    private String f11611g = null;

    /* renamed from: h */
    private C4702l0 f11612h = null;

    /* renamed from: g.a.a.a1$a */
    /* compiled from: TargetPreviewManager */
    class C4649a implements OnClickListener {

        /* renamed from: g.a.a.a1$a$a */
        /* compiled from: TargetPreviewManager */
        class C4650a implements Runnable {
            C4650a() {
            }

            public void run() {
                C4648a1.this.mo15970c();
            }
        }

        C4649a() {
        }

        public void onClick(View view) {
            C4783y0.m16642d().execute(new C4650a());
        }
    }

    /* renamed from: g.a.a.a1$b */
    /* compiled from: TargetPreviewManager */
    class C4651b implements Runnable {

        /* renamed from: g.a.a.a1$b$a */
        /* compiled from: TargetPreviewManager */
        class C4652a implements Runnable {
            C4652a(C4651b bVar) {
            }

            public void run() {
                try {
                    Toast.makeText(C4783y0.m16653m(), "Could not download Target Preview UI. Please try again!", 0).show();
                } catch (C4784a e) {
                    C4783y0.m16630a("Could not show error message!(%s) ", e);
                }
            }
        }

        C4651b() {
        }

        public void run() {
            C4763s0 a = C4779x0.m16594a(C4648a1.m16198k().m16199l(), "GET", "text/html", null, C4728p0.m16448H().mo16094m(), null, "Target Preview", null);
            if (a != null && a.f11851a == 200) {
                String str = a.f11852b;
                if (str != null) {
                    C4648a1.this.m16197e(str);
                    C4728p0.m16448H().mo16084c();
                    HashMap hashMap = new HashMap();
                    hashMap.put("a.targetpreview.show", "true");
                    C4721o0.m16413a(hashMap, null, null);
                    return;
                }
            }
            try {
                C4783y0.m16653m().runOnUiThread(new C4652a(this));
            } catch (C4784a e) {
                C4783y0.m16630a("Could not show error message!(%s) ", e);
            }
        }
    }

    private C4648a1() {
    }

    /* renamed from: b */
    private void m16196b(float f, float f2) {
        this.f11607c = f;
        this.f11608d = f2;
    }

    /* renamed from: k */
    static C4648a1 m16198k() {
        C4648a1 a1Var;
        synchronized (f11604k) {
            if (f11602i == null) {
                f11602i = new C4648a1();
            }
            a1Var = f11602i;
        }
        return a1Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public String m16199l() {
        String str = this.f11605a;
        String str2 = (str == null || str.isEmpty()) ? "https://hal.testandtarget.omniture.com" : this.f11605a;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("/ui/admin/%s/preview/?token=%s");
        return String.format(Locale.US, sb.toString(), new Object[]{C4728p0.m16448H().mo16093l(), C4783y0.m16619a(mo15978i())});
    }

    /* renamed from: m */
    private void m16200m() {
        mo15973d(null);
        mo15967a((String) null);
        m16197e(null);
        mo15969b(null);
        m16196b(-1.0f, -1.0f);
    }

    /* renamed from: n */
    private synchronized void m16201n() {
        try {
            Activity m = C4783y0.m16653m();
            C4715o oVar = new C4715o(m, this.f11607c, this.f11608d);
            oVar.setTag("ADBFloatingButtonTag");
            oVar.setOnClickListener(new C4649a());
            oVar.mo16056a(m, (C4719c) this, (C4720d) this);
        } catch (C4784a e) {
            C4783y0.m16630a("Target - Could not show the floating button (%s)", e);
        }
        return;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo15971c(String str) {
        if (str != null && C4728p0.m16448H().mo16074E()) {
            mo15973d(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo15973d(String str) {
        synchronized (f11603j) {
            this.f11609e = str;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public float mo15974e() {
        return this.f11608d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C4702l0 mo15975f() {
        if (this.f11612h == null) {
            this.f11612h = mo15964a();
        }
        return this.f11612h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public String mo15976g() {
        return this.f11606b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public String mo15977h() {
        return this.f11611g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo15978i() {
        String str;
        synchronized (f11603j) {
            str = this.f11609e;
        }
        return str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo15979j() {
        if (mo15978i() != null) {
            m16201n();
        } else {
            C4715o.m16399b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m16197e(String str) {
        this.f11611g = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15967a(String str) {
        synchronized (this.f11610f) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo15969b(String str) {
        this.f11605a = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo15970c() {
        if (mo15978i() == null || mo15978i().isEmpty()) {
            C4783y0.m16630a("No Target Preview token setup!", new Object[0]);
            return;
        }
        C4783y0.m16642d().execute(new C4651b());
    }

    /* renamed from: b */
    public void mo15968b() {
        C4728p0.m16448H().mo16077a();
        m16200m();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public float mo15972d() {
        return this.f11607c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4702l0 mo15964a() {
        C4702l0 l0Var = new C4702l0();
        StringBuilder sb = new StringBuilder();
        sb.append("TargetPreview-");
        sb.append(UUID.randomUUID());
        l0Var.f11815a = sb.toString();
        l0Var.f11817c = new Date(C4783y0.m16607E() * 1000);
        l0Var.f11842s = mo15977h();
        l0Var.f11816b = C4726e.MESSAGE_SHOW_RULE_ALWAYS;
        l0Var.f11825k = new ArrayList<>();
        C4782y yVar = new C4782y();
        yVar.f11865a = "a.targetpreview.show";
        yVar.f11866b = new ArrayList<>();
        yVar.f11866b.add("true");
        l0Var.f11825k.add(yVar);
        l0Var.f11824j = new ArrayList<>();
        return l0Var;
    }

    /* renamed from: a */
    public void mo15966a(C4715o oVar) {
        if (oVar != null) {
            m16196b(oVar.getXCompat(), oVar.getYCompat());
        }
    }

    /* renamed from: a */
    public void mo15965a(float f, float f2) {
        m16196b(f, f2);
    }
}
