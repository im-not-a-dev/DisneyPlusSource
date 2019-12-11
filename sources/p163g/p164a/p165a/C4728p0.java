package p163g.p164a.p165a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences.Editor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.facebook.stetho.common.Utf8Charset;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p163g.p164a.p165a.C4705m.C4709d;
import p163g.p164a.p165a.C4705m.C4711f;

/* renamed from: g.a.a.p0 */
/* compiled from: MobileConfig */
final class C4728p0 {

    /* renamed from: F */
    private static final C4758r0 f11762F = C4758r0.MOBILE_PRIVACY_STATUS_OPT_IN;

    /* renamed from: G */
    private static C4728p0 f11763G = null;

    /* renamed from: H */
    private static final Object f11764H = new Object();

    /* renamed from: I */
    private static final Object f11765I = new Object();

    /* renamed from: J */
    private static final Object f11766J = new Object();

    /* renamed from: K */
    private static final Object f11767K = new Object();

    /* renamed from: L */
    private static final Object f11768L = new Object();

    /* renamed from: M */
    private static InputStream f11769M = null;

    /* renamed from: N */
    private static final Object f11770N = new Object();

    /* renamed from: A */
    private boolean f11771A;

    /* renamed from: B */
    private Boolean f11772B;

    /* renamed from: C */
    private Boolean f11773C;

    /* renamed from: D */
    private Boolean f11774D;

    /* renamed from: E */
    private Boolean f11775E;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f11776a = false;

    /* renamed from: b */
    private C4709d f11777b = null;

    /* renamed from: c */
    private String f11778c = null;

    /* renamed from: d */
    private String f11779d = null;

    /* renamed from: e */
    private String f11780e;

    /* renamed from: f */
    private boolean f11781f;

    /* renamed from: g */
    private boolean f11782g;

    /* renamed from: h */
    private boolean f11783h;

    /* renamed from: i */
    private int f11784i;

    /* renamed from: j */
    private int f11785j;

    /* renamed from: k */
    private int f11786k;

    /* renamed from: l */
    private C4758r0 f11787l;

    /* renamed from: m */
    private List<List<Object>> f11788m;

    /* renamed from: n */
    private String f11789n;

    /* renamed from: o */
    private String f11790o;

    /* renamed from: p */
    private int f11791p;

    /* renamed from: q */
    private String f11792q;

    /* renamed from: r */
    private boolean f11793r;

    /* renamed from: s */
    private int f11794s;

    /* renamed from: t */
    private String f11795t;

    /* renamed from: u */
    private String f11796u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public String f11797v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public ArrayList<C4746q> f11798w;

    /* renamed from: x */
    private ArrayList<C4746q> f11799x;

    /* renamed from: y */
    private String f11800y;

    /* renamed from: z */
    private String f11801z;

    /* renamed from: g.a.a.p0$a */
    /* compiled from: MobileConfig */
    class C4729a implements C4775c {

        /* renamed from: g.a.a.p0$a$a */
        /* compiled from: MobileConfig */
        class C4730a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ File f11804c;

            C4730a(File file) {
                this.f11804c = file;
            }

            public void run() {
                if (this.f11804c != null) {
                    C4783y0.m16630a("Config - Using remote definition for points of interest", new Object[0]);
                    C4728p0.this.mo16083b(this.f11804c);
                }
            }
        }

        C4729a() {
        }

        /* renamed from: a */
        public void mo16108a(boolean z, File file) {
            C4783y0.m16642d().execute(new C4730a(file));
        }
    }

    /* renamed from: g.a.a.p0$b */
    /* compiled from: MobileConfig */
    class C4731b implements Runnable {
        C4731b() {
        }

        public void run() {
            String str = "messageImages";
            if (C4728p0.this.f11798w == null || C4728p0.this.f11798w.size() <= 0) {
                C4772v0.m16580c(str);
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = C4728p0.this.f11798w.iterator();
            while (it.hasNext()) {
                C4746q qVar = (C4746q) it.next();
                ArrayList<ArrayList<String>> arrayList2 = qVar.f11822h;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    Iterator it2 = qVar.f11822h.iterator();
                    while (it2.hasNext()) {
                        ArrayList arrayList3 = (ArrayList) it2.next();
                        if (arrayList3.size() > 0) {
                            Iterator it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                String str2 = (String) it3.next();
                                arrayList.add(str2);
                                C4772v0.m16578b(str2, 10000, 10000, null, str);
                            }
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                C4772v0.m16572a(str, (List<String>) arrayList);
            } else {
                C4772v0.m16580c(str);
            }
        }
    }

    /* renamed from: g.a.a.p0$c */
    /* compiled from: MobileConfig */
    class C4732c extends BroadcastReceiver {

        /* renamed from: g.a.a.p0$c$a */
        /* compiled from: MobileConfig */
        class C4733a implements Runnable {
            C4733a(C4732c cVar) {
            }

            public void run() {
                C4783y0.m16630a("Analytics - Network status changed (reachable)", new Object[0]);
                C4689j.m16331o().mo15985a(false);
            }
        }

        C4732c() {
        }

        public void onReceive(Context context, Intent intent) {
            C4728p0 p0Var = C4728p0.this;
            p0Var.f11776a = p0Var.mo16081a(context);
            if (C4728p0.this.f11776a) {
                C4783y0.m16642d().execute(new C4733a(this));
                return;
            }
            C4783y0.m16630a("Analytics - Network status changed (unreachable)", new Object[0]);
        }
    }

    /* renamed from: g.a.a.p0$d */
    /* compiled from: MobileConfig */
    class C4734d implements Runnable {
        C4734d(C4728p0 p0Var) {
        }

        public void run() {
            C4783y0.m16630a("Analytics - Privacy status set to opt in, attempting to send Analytics hits and postbacks in queue.", new Object[0]);
            C4689j.m16331o().mo15985a(false);
        }
    }

    /* renamed from: g.a.a.p0$e */
    /* compiled from: MobileConfig */
    class C4735e implements Runnable {
        C4735e(C4728p0 p0Var) {
        }

        public void run() {
            C4783y0.m16630a("Data Callback - Privacy status set to opt in, attempting to send all requests in queue", new Object[0]);
            C4660c1.m16235o().mo15985a(false);
        }
    }

    /* renamed from: g.a.a.p0$f */
    /* compiled from: MobileConfig */
    class C4736f implements Runnable {
        C4736f(C4728p0 p0Var) {
        }

        public void run() {
            C4783y0.m16630a("Pii Callback - Privacy status set to opt in, attempting to send all requests in queue", new Object[0]);
            C4766t0.m16544o().mo15985a(false);
        }
    }

    /* renamed from: g.a.a.p0$g */
    /* compiled from: MobileConfig */
    class C4737g implements Runnable {
        C4737g(C4728p0 p0Var) {
        }

        public void run() {
            C4783y0.m16630a("Analytics - Privacy status set to opt out, purging database of Analytics requests and postbacks.", new Object[0]);
            C4689j.m16331o().mo15987h();
        }
    }

    /* renamed from: g.a.a.p0$h */
    /* compiled from: MobileConfig */
    class C4738h implements Runnable {
        C4738h(C4728p0 p0Var) {
        }

        public void run() {
            C4783y0.m16630a("Data Callback - Privacy status set to opt out, attempting to clear queue of all requests", new Object[0]);
            C4660c1.m16235o().mo15987h();
        }
    }

    /* renamed from: g.a.a.p0$i */
    /* compiled from: MobileConfig */
    class C4739i implements Runnable {
        C4739i(C4728p0 p0Var) {
        }

        public void run() {
            C4783y0.m16630a("PII - Privacy status set to opt out, attempting to clear queue of all requests.", new Object[0]);
            C4766t0.m16544o().mo15987h();
        }
    }

    /* renamed from: g.a.a.p0$j */
    /* compiled from: MobileConfig */
    class C4740j implements Runnable {

        /* renamed from: g.a.a.p0$j$a */
        /* compiled from: MobileConfig */
        class C4741a implements C4775c {
            C4741a() {
            }

            /* renamed from: a */
            public void mo16108a(boolean z, File file) {
                C4728p0.this.mo16080a(file);
                C4728p0.this.m16450J();
                C4728p0.this.m16451K();
            }
        }

        C4740j() {
        }

        public void run() {
            if (C4728p0.this.f11797v == null || C4728p0.this.f11797v.length() <= 0) {
                C4728p0.this.m16450J();
            } else {
                C4772v0.m16579b(C4728p0.this.f11797v, (C4775c) new C4741a());
            }
        }
    }

    /* renamed from: g.a.a.p0$k */
    /* compiled from: MobileConfig */
    class C4742k implements Runnable {

        /* renamed from: g.a.a.p0$k$a */
        /* compiled from: MobileConfig */
        class C4743a implements Callable<Void> {
            C4743a(C4742k kVar) {
            }

            public Void call() throws Exception {
                return null;
            }
        }

        C4742k(C4728p0 p0Var) {
        }

        public void run() {
            FutureTask futureTask = new FutureTask(new C4743a(this));
            C4783y0.m16662v().execute(futureTask);
            try {
                futureTask.get();
            } catch (Exception e) {
                C4783y0.m16636b("Data Callback - Error waiting for callbacks being loaded (%s)", e.getMessage());
            }
        }
    }

    /* renamed from: g.a.a.p0$l */
    /* compiled from: MobileConfig */
    class C4744l implements Runnable {

        /* renamed from: g.a.a.p0$l$a */
        /* compiled from: MobileConfig */
        class C4745a implements Callable<Void> {
            C4745a(C4744l lVar) {
            }

            public Void call() throws Exception {
                return null;
            }
        }

        C4744l(C4728p0 p0Var) {
        }

        public void run() {
            FutureTask futureTask = new FutureTask(new C4745a(this));
            C4783y0.m16662v().execute(futureTask);
            try {
                futureTask.get();
            } catch (Exception e) {
                C4783y0.m16636b("Pii Callback - Error waiting for callbacks being loaded (%s)", e.getMessage());
            }
        }
    }

    private C4728p0() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        JSONArray jSONArray;
        JSONObject jSONObject6;
        String str;
        String str2 = "PrivacyStatus";
        String str3 = "Audience Manager - Not Configured.";
        String str4 = "Target - Not Configured.";
        String str5 = Utf8Charset.NAME;
        this.f11780e = str5;
        this.f11781f = true;
        this.f11782g = false;
        this.f11783h = true;
        this.f11784i = 300;
        this.f11785j = 0;
        this.f11786k = 0;
        this.f11787l = f11762F;
        this.f11788m = null;
        this.f11789n = null;
        this.f11790o = null;
        this.f11791p = 2;
        this.f11792q = null;
        this.f11793r = false;
        this.f11794s = 2;
        this.f11795t = null;
        this.f11796u = null;
        this.f11797v = null;
        this.f11798w = null;
        this.f11799x = null;
        this.f11800y = null;
        this.f11801z = null;
        this.f11771A = false;
        this.f11772B = null;
        this.f11773C = null;
        this.f11774D = null;
        this.f11775E = null;
        mo16076G();
        JSONObject I = m16449I();
        if (I != null) {
            try {
                jSONObject = I.getJSONObject("analytics");
            } catch (JSONException unused) {
                C4783y0.m16630a("Analytics - Not configured.", new Object[0]);
                jSONObject = null;
            }
            String str6 = "server";
            if (jSONObject != null) {
                try {
                    this.f11779d = jSONObject.getString(str6);
                    this.f11778c = jSONObject.getString("rsids");
                } catch (JSONException unused2) {
                    this.f11779d = null;
                    this.f11778c = null;
                    C4783y0.m16630a("Analytics - Not Configured.", new Object[0]);
                }
                try {
                    this.f11780e = jSONObject.getString("charset");
                } catch (JSONException unused3) {
                    this.f11780e = str5;
                }
                try {
                    this.f11781f = jSONObject.getBoolean("ssl");
                } catch (JSONException unused4) {
                    this.f11781f = true;
                }
                try {
                    this.f11782g = jSONObject.getBoolean("offlineEnabled");
                } catch (JSONException unused5) {
                    this.f11782g = false;
                }
                try {
                    this.f11783h = jSONObject.getBoolean("backdateSessionInfo");
                } catch (JSONException unused6) {
                    this.f11783h = true;
                }
                try {
                    this.f11784i = jSONObject.getInt("lifecycleTimeout");
                } catch (JSONException unused7) {
                    this.f11784i = 300;
                }
                try {
                    this.f11785j = jSONObject.getInt("referrerTimeout");
                } catch (JSONException unused8) {
                    this.f11785j = 0;
                }
                try {
                    this.f11786k = jSONObject.getInt("batchLimit");
                } catch (JSONException unused9) {
                    this.f11786k = 0;
                }
                try {
                    if (C4783y0.m16604B().contains(str2)) {
                        this.f11787l = C4758r0.values()[C4783y0.m16604B().getInt(str2, 0)];
                    } else {
                        try {
                            str = jSONObject.getString("privacyDefault");
                        } catch (JSONException unused10) {
                            str = null;
                        }
                        this.f11787l = str != null ? m16458b(str) : f11762F;
                    }
                    try {
                        m16460b(jSONObject.getJSONArray("poi"));
                    } catch (JSONException e) {
                        C4783y0.m16636b("Analytics - Malformed POI List(%s)", e.getLocalizedMessage());
                    }
                } catch (C4785b e2) {
                    C4783y0.m16636b("Config - Error pulling privacy from shared preferences. (%s)", e2.getMessage());
                    return;
                }
            }
            try {
                jSONObject2 = I.getJSONObject("target");
            } catch (JSONException unused11) {
                C4783y0.m16630a(str4, new Object[0]);
                jSONObject2 = null;
            }
            String str7 = "timeout";
            if (jSONObject2 != null) {
                try {
                    this.f11790o = jSONObject2.getString("clientCode");
                } catch (JSONException unused12) {
                    this.f11790o = null;
                    C4783y0.m16630a(str4, new Object[0]);
                }
                try {
                    this.f11791p = jSONObject2.getInt(str7);
                } catch (JSONException unused13) {
                    this.f11791p = 2;
                }
                try {
                    jSONObject2.getLong("environmentId");
                } catch (JSONException unused14) {
                }
            }
            try {
                jSONObject3 = I.getJSONObject("audienceManager");
            } catch (JSONException unused15) {
                C4783y0.m16630a(str3, new Object[0]);
                jSONObject3 = null;
            }
            if (jSONObject3 != null) {
                try {
                    this.f11792q = jSONObject3.getString(str6);
                } catch (JSONException unused16) {
                    this.f11792q = null;
                    C4783y0.m16630a(str3, new Object[0]);
                }
                try {
                    this.f11793r = jSONObject3.getBoolean("analyticsForwardingEnabled");
                } catch (JSONException unused17) {
                    this.f11793r = false;
                }
                if (this.f11793r) {
                    C4783y0.m16630a("Audience Manager - Analytics Server-Side Forwarding Is Enabled.", new Object[0]);
                }
                try {
                    this.f11794s = jSONObject3.getInt(str7);
                } catch (JSONException unused18) {
                    this.f11794s = 2;
                }
            }
            try {
                jSONObject4 = I.getJSONObject("acquisition");
            } catch (JSONException unused19) {
                C4783y0.m16630a("Acquisition - Not Configured.", new Object[0]);
                jSONObject4 = null;
            }
            if (jSONObject4 != null) {
                try {
                    this.f11796u = jSONObject4.getString("appid");
                    this.f11795t = jSONObject4.getString(str6);
                } catch (JSONException unused20) {
                    this.f11796u = null;
                    this.f11795t = null;
                    C4783y0.m16630a("Acquisition - Not configured correctly (missing server or app identifier).", new Object[0]);
                }
            }
            try {
                jSONObject5 = I.getJSONObject("remotes");
            } catch (JSONException unused21) {
                C4783y0.m16630a("Remotes - Not Configured.", new Object[0]);
                jSONObject5 = null;
            }
            String str8 = "messages";
            if (jSONObject5 != null) {
                try {
                    this.f11797v = jSONObject5.getString(str8);
                } catch (JSONException e3) {
                    C4783y0.m16630a("Config - No in-app messages remote url loaded (%s)", e3.getLocalizedMessage());
                }
                try {
                    this.f11789n = jSONObject5.getString("analytics.poi");
                } catch (JSONException e4) {
                    C4783y0.m16630a("Config - No points of interest remote url loaded (%s)", e4.getLocalizedMessage());
                }
            }
            try {
                jSONArray = I.getJSONArray(str8);
            } catch (JSONException unused22) {
                C4783y0.m16630a("Messages - Not configured locally.", new Object[0]);
                jSONArray = null;
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                m16455a(jSONArray);
            }
            try {
                jSONObject6 = I.getJSONObject("marketingCloud");
            } catch (JSONException unused23) {
                C4783y0.m16630a("Marketing Cloud - Not configured locally.", new Object[0]);
                jSONObject6 = null;
            }
            if (jSONObject6 != null) {
                try {
                    this.f11800y = jSONObject6.getString("org");
                } catch (JSONException unused24) {
                    this.f11800y = null;
                    C4783y0.m16630a("Visitor - ID Service Not Configured.", new Object[0]);
                }
                try {
                    this.f11801z = jSONObject6.getString(str6);
                } catch (JSONException unused25) {
                    this.f11801z = null;
                    C4783y0.m16630a("Visitor ID Service - Custom endpoint not found in configuration, using default endpoint.", new Object[0]);
                }
                try {
                    this.f11771A = jSONObject6.getBoolean("coopUnsafe");
                } catch (JSONException unused26) {
                    C4783y0.m16630a("Visitor - Coop Unsafe Not Configured.", new Object[0]);
                }
            }
            mo16107z();
            m16451K();
        }
    }

    /* renamed from: H */
    protected static C4728p0 m16448H() {
        C4728p0 p0Var;
        synchronized (f11764H) {
            if (f11763G == null) {
                f11763G = new C4728p0();
            }
            p0Var = f11763G;
        }
        return p0Var;
    }

    /* renamed from: I */
    private JSONObject m16449I() {
        InputStream inputStream;
        synchronized (f11770N) {
            inputStream = f11769M;
        }
        JSONObject jSONObject = null;
        if (inputStream != null) {
            try {
                C4783y0.m16630a("Config - Attempting to load config file from override stream", new Object[0]);
                jSONObject = m16453a(inputStream);
            } catch (IOException e) {
                C4783y0.m16630a("Config - Error loading user defined config (%s)", e.getMessage());
            } catch (JSONException e2) {
                C4783y0.m16630a("Config - Error parsing user defined config (%s)", e2.getMessage());
            }
        }
        if (jSONObject != null) {
            return jSONObject;
        }
        if (inputStream != null) {
            C4783y0.m16630a("Config - Failed attempting to load custom config, will fall back to standard config location.", new Object[0]);
        }
        C4783y0.m16630a("Config - Attempting to load config file from default location", new Object[0]);
        JSONObject a = m16454a("ADBMobileConfig.json");
        if (a != null) {
            return a;
        }
        C4783y0.m16630a("Config - Could not find config file at expected location.  Attempting to load from www folder", new Object[0]);
        StringBuilder sb = new StringBuilder();
        sb.append("www");
        sb.append(File.separator);
        sb.append("ADBMobileConfig.json");
        return m16454a(sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public void m16450J() {
        C4783y0.m16661u().execute(new C4731b());
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public void m16451K() {
        ArrayList<C4746q> arrayList = this.f11798w;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C4746q qVar = (C4746q) it.next();
                HashMap e = qVar.mo16131e();
                if (qVar.mo16130d() && qVar.f11816b.mo16069a() != ((Integer) e.get(qVar.f11815a)).intValue()) {
                    qVar.mo16133g();
                }
            }
        }
        ArrayList<C4746q> arrayList2 = this.f11799x;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C4746q qVar2 = (C4746q) it2.next();
                HashMap e2 = qVar2.mo16131e();
                if (qVar2.mo16130d() && qVar2.f11816b.mo16069a() != ((Integer) e2.get(qVar2.f11815a)).intValue()) {
                    qVar2.mo16133g();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public boolean mo16070A() {
        String str = this.f11795t;
        return str != null && this.f11796u != null && str.length() > 0 && this.f11796u.length() > 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public boolean mo16071B() {
        boolean booleanValue;
        synchronized (f11765I) {
            if (this.f11772B == null) {
                this.f11772B = Boolean.valueOf(mo16103v() != null && mo16103v().length() > 0 && mo16105x() != null && mo16105x().length() > 0);
                if (!this.f11772B.booleanValue()) {
                    C4783y0.m16630a("Analytics - Your config file is not set up to use Analytics(missing report suite id(s) or tracking server information)", new Object[0]);
                }
            }
            booleanValue = this.f11772B.booleanValue();
        }
        return booleanValue;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public boolean mo16072C() {
        boolean booleanValue;
        if (C4783y0.m16611I()) {
            return false;
        }
        synchronized (f11767K) {
            if (this.f11774D == null) {
                this.f11774D = Boolean.valueOf(mo16086e() != null && mo16086e().length() > 0);
                if (!this.f11774D.booleanValue()) {
                    C4783y0.m16630a("Audience Manager - Your config file is not set up to use Audience Manager(missing audience manager server information)", new Object[0]);
                }
            }
            booleanValue = this.f11774D.booleanValue();
        }
        return booleanValue;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public boolean mo16073D() {
        boolean booleanValue;
        synchronized (f11766J) {
            if (this.f11773C == null) {
                this.f11773C = Boolean.valueOf(C4684g1.m16314c());
            }
            booleanValue = this.f11773C.booleanValue();
        }
        return booleanValue;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public boolean mo16074E() {
        boolean booleanValue;
        if (C4783y0.m16611I()) {
            return false;
        }
        synchronized (f11768L) {
            if (this.f11775E == null) {
                this.f11775E = Boolean.valueOf(mo16093l() != null && mo16093l().length() > 0);
                if (!this.f11775E.booleanValue()) {
                    C4783y0.m16630a("Target Worker - Your config file is not set up to use Target(missing client code information)", new Object[0]);
                }
            }
            booleanValue = this.f11775E.booleanValue();
        }
        return booleanValue;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public boolean mo16075F() {
        return C4783y0.m16611I() || this.f11776a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo16076G() {
        Context context;
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        try {
            context = C4783y0.m16603A().getApplicationContext();
        } catch (C4785b e) {
            C4783y0.m16636b("Analytics - Error registering network receiver (%s)", e.getMessage());
            context = null;
        }
        if (context != null) {
            context.registerReceiver(new C4732c(), intentFilter);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo16087f() {
        return this.f11794s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public int mo16088g() {
        return this.f11793r ? 10 : 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo16089h() {
        return this.f11783h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo16090i() {
        return this.f11786k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public ArrayList<C4746q> mo16091j() {
        return this.f11799x;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public String mo16092k() {
        return this.f11780e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public String mo16093l() {
        return this.f11790o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public int mo16094m() {
        return this.f11791p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public ArrayList<C4746q> mo16095n() {
        return this.f11798w;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public int mo16096o() {
        return this.f11784i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo16097p() {
        return this.f11771A;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public String mo16098q() {
        return this.f11801z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public String mo16099r() {
        return this.f11800y;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo16100s() {
        return this.f11782g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public C4758r0 mo16101t() {
        return this.f11787l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public int mo16102u() {
        return this.f11785j * 1000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public String mo16103v() {
        return this.f11778c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public boolean mo16104w() {
        return this.f11781f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public String mo16105x() {
        return this.f11779d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public boolean mo16106y() {
        String str = this.f11800y;
        return str != null && str.length() > 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo16107z() {
        String str = this.f11797v;
        if (str != null && str.length() > 0) {
            mo16080a(C4772v0.m16583f(this.f11797v));
        }
        String str2 = this.f11789n;
        if (str2 != null && str2.length() > 0) {
            mo16083b(C4772v0.m16583f(this.f11789n));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo16082b() {
        C4783y0.m16662v().execute(new C4740j());
        C4783y0.m16606D().execute(new C4742k(this));
        C4783y0.m16664x().execute(new C4744l(this));
        String str = this.f11789n;
        if (str != null && str.length() > 0) {
            C4772v0.m16571a(this.f11789n, (C4775c) new C4729a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo16084c() {
        if (this.f11798w == null) {
            this.f11798w = new ArrayList<>();
        }
        C4702l0 f = C4648a1.m16198k().mo15975f();
        if (C4721o0.m16407a(f.f11815a) == null) {
            this.f11798w.add(f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo16085d() {
        return this.f11793r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo16086e() {
        return this.f11792q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16078a(C4711f fVar, Map<String, Object> map) {
        C4709d dVar = this.f11777b;
        if (dVar == null) {
            C4783y0.m16630a("Config - A callback has not been registered for Adobe events.", new Object[0]);
            return;
        }
        if (map != null) {
            dVar.mo16047a(fVar, new HashMap(map));
        } else {
            dVar.mo16047a(fVar, null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16079a(C4758r0 r0Var) {
        if (r0Var != null) {
            if (r0Var != C4758r0.MOBILE_PRIVACY_STATUS_UNKNOWN || this.f11782g) {
                if (r0Var == C4758r0.MOBILE_PRIVACY_STATUS_OPT_IN) {
                    C4783y0.m16642d().execute(new C4734d(this));
                    C4783y0.m16606D().execute(new C4735e(this));
                    C4783y0.m16664x().execute(new C4736f(this));
                }
                if (r0Var == C4758r0.MOBILE_PRIVACY_STATUS_OPT_OUT) {
                    C4783y0.m16642d().execute(new C4737g(this));
                    C4783y0.m16606D().execute(new C4738h(this));
                    C4783y0.m16664x().execute(new C4739i(this));
                    C4749q0.m16525c();
                }
                this.f11787l = r0Var;
                C4684g1.m16304a(r0Var.mo16142a());
                try {
                    Editor C = C4783y0.m16605C();
                    C.putInt("PrivacyStatus", r0Var.mo16142a());
                    C.commit();
                } catch (C4785b e) {
                    C4783y0.m16636b("Config - Error persisting privacy status (%s).", e.getMessage());
                }
                return;
            }
            C4783y0.m16640c("Analytics - Cannot set privacy status to unknown when offline tracking is disabled", new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e A[SYNTHETIC, Splitter:B:26:0x004e] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006f A[SYNTHETIC, Splitter:B:35:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0082 A[SYNTHETIC, Splitter:B:41:0x0082] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16083b(java.io.File r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Config - Unable to close file stream (%s)"
            if (r7 != 0) goto L_0x0005
            return
        L_0x0005:
            r1 = 0
            r2 = 1
            r3 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ JSONException -> 0x005f, IOException -> 0x003e }
            r4.<init>(r7)     // Catch:{ JSONException -> 0x005f, IOException -> 0x003e }
            org.json.JSONObject r7 = r6.m16453a(r4)     // Catch:{ JSONException -> 0x0039, IOException -> 0x0036, all -> 0x0033 }
            if (r7 == 0) goto L_0x0022
            java.lang.String r3 = "analytics"
            org.json.JSONObject r7 = r7.getJSONObject(r3)     // Catch:{ JSONException -> 0x0039, IOException -> 0x0036, all -> 0x0033 }
            java.lang.String r3 = "poi"
            org.json.JSONArray r7 = r7.getJSONArray(r3)     // Catch:{ JSONException -> 0x0039, IOException -> 0x0036, all -> 0x0033 }
            r6.m16460b(r7)     // Catch:{ JSONException -> 0x0039, IOException -> 0x0036, all -> 0x0033 }
        L_0x0022:
            r4.close()     // Catch:{ IOException -> 0x0026 }
            goto L_0x007f
        L_0x0026:
            r7 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r7 = r7.getLocalizedMessage()
            r2[r1] = r7
            p163g.p164a.p165a.C4783y0.m16636b(r0, r2)
            goto L_0x007f
        L_0x0033:
            r7 = move-exception
            r3 = r4
            goto L_0x0080
        L_0x0036:
            r7 = move-exception
            r3 = r4
            goto L_0x003f
        L_0x0039:
            r7 = move-exception
            r3 = r4
            goto L_0x0060
        L_0x003c:
            r7 = move-exception
            goto L_0x0080
        L_0x003e:
            r7 = move-exception
        L_0x003f:
            java.lang.String r4 = "Config - Unable to open points of interest config file, falling back to bundled poi (%s)"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x003c }
            java.lang.String r7 = r7.getLocalizedMessage()     // Catch:{ all -> 0x003c }
            r5[r1] = r7     // Catch:{ all -> 0x003c }
            p163g.p164a.p165a.C4783y0.m16640c(r4, r5)     // Catch:{ all -> 0x003c }
            if (r3 == 0) goto L_0x007f
            r3.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x007f
        L_0x0052:
            r7 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r7 = r7.getLocalizedMessage()
            r2[r1] = r7
            p163g.p164a.p165a.C4783y0.m16636b(r0, r2)
            goto L_0x007f
        L_0x005f:
            r7 = move-exception
        L_0x0060:
            java.lang.String r4 = "Config - Unable to read points of interest remote config file, falling back to bundled poi (%s)"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x003c }
            java.lang.String r7 = r7.getLocalizedMessage()     // Catch:{ all -> 0x003c }
            r5[r1] = r7     // Catch:{ all -> 0x003c }
            p163g.p164a.p165a.C4783y0.m16636b(r4, r5)     // Catch:{ all -> 0x003c }
            if (r3 == 0) goto L_0x007f
            r3.close()     // Catch:{ IOException -> 0x0073 }
            goto L_0x007f
        L_0x0073:
            r7 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r7 = r7.getLocalizedMessage()
            r2[r1] = r7
            p163g.p164a.p165a.C4783y0.m16636b(r0, r2)
        L_0x007f:
            return
        L_0x0080:
            if (r3 == 0) goto L_0x0092
            r3.close()     // Catch:{ IOException -> 0x0086 }
            goto L_0x0092
        L_0x0086:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = r3.getLocalizedMessage()
            r2[r1] = r3
            p163g.p164a.p165a.C4783y0.m16636b(r0, r2)
        L_0x0092:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p164a.p165a.C4728p0.mo16083b(java.io.File):void");
    }

    /* renamed from: b */
    private C4758r0 m16458b(String str) {
        if (str != null) {
            if (str.equalsIgnoreCase("optedin")) {
                return C4758r0.MOBILE_PRIVACY_STATUS_OPT_IN;
            }
            if (str.equalsIgnoreCase("optedout")) {
                return C4758r0.MOBILE_PRIVACY_STATUS_OPT_OUT;
            }
            if (str.equalsIgnoreCase("optunknown")) {
                return C4758r0.MOBILE_PRIVACY_STATUS_UNKNOWN;
            }
        }
        return f11762F;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0040 A[SYNTHETIC, Splitter:B:24:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0061 A[SYNTHETIC, Splitter:B:33:0x0061] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0074 A[SYNTHETIC, Splitter:B:39:0x0074] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16080a(java.io.File r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Messages - Unable to close file stream (%s)"
            if (r7 != 0) goto L_0x0005
            return
        L_0x0005:
            r1 = 0
            r2 = 1
            r3 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ JSONException -> 0x0051, IOException -> 0x0030 }
            r4.<init>(r7)     // Catch:{ JSONException -> 0x0051, IOException -> 0x0030 }
            org.json.JSONObject r7 = r6.m16453a(r4)     // Catch:{ JSONException -> 0x002b, IOException -> 0x0028, all -> 0x0025 }
            r6.m16456a(r7)     // Catch:{ JSONException -> 0x002b, IOException -> 0x0028, all -> 0x0025 }
            r4.close()     // Catch:{ IOException -> 0x0018 }
            goto L_0x0071
        L_0x0018:
            r7 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r7 = r7.getLocalizedMessage()
            r2[r1] = r7
            p163g.p164a.p165a.C4783y0.m16636b(r0, r2)
            goto L_0x0071
        L_0x0025:
            r7 = move-exception
            r3 = r4
            goto L_0x0072
        L_0x0028:
            r7 = move-exception
            r3 = r4
            goto L_0x0031
        L_0x002b:
            r7 = move-exception
            r3 = r4
            goto L_0x0052
        L_0x002e:
            r7 = move-exception
            goto L_0x0072
        L_0x0030:
            r7 = move-exception
        L_0x0031:
            java.lang.String r4 = "Messages - Unable to open messages config file, falling back to bundled messages (%s)"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x002e }
            java.lang.String r7 = r7.getLocalizedMessage()     // Catch:{ all -> 0x002e }
            r5[r1] = r7     // Catch:{ all -> 0x002e }
            p163g.p164a.p165a.C4783y0.m16640c(r4, r5)     // Catch:{ all -> 0x002e }
            if (r3 == 0) goto L_0x0071
            r3.close()     // Catch:{ IOException -> 0x0044 }
            goto L_0x0071
        L_0x0044:
            r7 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r7 = r7.getLocalizedMessage()
            r2[r1] = r7
            p163g.p164a.p165a.C4783y0.m16636b(r0, r2)
            goto L_0x0071
        L_0x0051:
            r7 = move-exception
        L_0x0052:
            java.lang.String r4 = "Messages - Unable to read messages remote config file, falling back to bundled messages (%s)"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x002e }
            java.lang.String r7 = r7.getLocalizedMessage()     // Catch:{ all -> 0x002e }
            r5[r1] = r7     // Catch:{ all -> 0x002e }
            p163g.p164a.p165a.C4783y0.m16636b(r4, r5)     // Catch:{ all -> 0x002e }
            if (r3 == 0) goto L_0x0071
            r3.close()     // Catch:{ IOException -> 0x0065 }
            goto L_0x0071
        L_0x0065:
            r7 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r7 = r7.getLocalizedMessage()
            r2[r1] = r7
            p163g.p164a.p165a.C4783y0.m16636b(r0, r2)
        L_0x0071:
            return
        L_0x0072:
            if (r3 == 0) goto L_0x0084
            r3.close()     // Catch:{ IOException -> 0x0078 }
            goto L_0x0084
        L_0x0078:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = r3.getLocalizedMessage()
            r2[r1] = r3
            p163g.p164a.p165a.C4783y0.m16636b(r0, r2)
        L_0x0084:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p164a.p165a.C4728p0.mo16080a(java.io.File):void");
    }

    /* renamed from: b */
    private void m16460b(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                this.f11788m = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                    ArrayList arrayList = new ArrayList(4);
                    arrayList.add(jSONArray2.getString(0));
                    arrayList.add(Double.valueOf(jSONArray2.getDouble(1)));
                    arrayList.add(Double.valueOf(jSONArray2.getDouble(2)));
                    arrayList.add(Double.valueOf(jSONArray2.getDouble(3)));
                    this.f11788m.add(arrayList);
                }
            } catch (JSONException e) {
                C4783y0.m16636b("Messages - Unable to parse remote points of interest JSON (%s)", e.getMessage());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16077a() {
        if (this.f11798w != null) {
            C4702l0 f = C4648a1.m16198k().mo15975f();
            Iterator it = this.f11798w.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C4746q) it.next()).f11815a.equalsIgnoreCase(f.f11815a)) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    /* renamed from: a */
    private JSONObject m16454a(String str) {
        JSONObject jSONObject = null;
        try {
            Resources resources = C4783y0.m16603A().getResources();
            if (resources == null) {
                return null;
            }
            AssetManager assets = resources.getAssets();
            if (assets == null) {
                return null;
            }
            jSONObject = m16453a(assets.open(str));
            return jSONObject;
        } catch (IOException e) {
            C4783y0.m16636b("Config - Exception loading config file (%s)", e.getMessage());
        } catch (JSONException e2) {
            C4783y0.m16636b("Config - Exception parsing config file (%s)", e2.getMessage());
        } catch (C4785b e3) {
            C4783y0.m16636b("Config - Null context when attempting to read config file (%s)", e3.getMessage());
        }
    }

    /* renamed from: a */
    private JSONObject m16453a(InputStream inputStream) throws JSONException, IOException {
        String str = "Config - Unable to close stream (%s)";
        if (inputStream == null) {
            return null;
        }
        try {
            byte[] bArr = new byte[inputStream.available()];
            inputStream.read(bArr);
            JSONObject jSONObject = new JSONObject(new String(bArr, Utf8Charset.NAME));
            try {
            } catch (IOException e) {
                C4783y0.m16636b(str, e.getMessage());
            }
            return jSONObject;
        } catch (IOException e2) {
            C4783y0.m16636b("Config - Exception when reading config (%s)", e2.getMessage());
            try {
            } catch (IOException e3) {
                C4783y0.m16636b(str, e3.getMessage());
            }
        } catch (NullPointerException e4) {
            C4783y0.m16636b("Config - Stream closed when attempting to load config (%s)", e4.getMessage());
            try {
            } catch (IOException e5) {
                C4783y0.m16636b(str, e5.getMessage());
            }
        } finally {
            try {
                inputStream.close();
            } catch (IOException e6) {
                C4783y0.m16636b(str, e6.getMessage());
            }
        }
        return new JSONObject();
    }

    /* renamed from: a */
    private void m16456a(JSONObject jSONObject) {
        JSONArray jSONArray;
        String str = "messageImages";
        if (jSONObject == null) {
            C4783y0.m16630a("Messages - Remote messages config was null, falling back to bundled messages", new Object[0]);
            C4772v0.m16580c(str);
            return;
        }
        try {
            jSONArray = jSONObject.getJSONArray("messages");
        } catch (JSONException unused) {
            C4783y0.m16630a("Messages - Remote messages not configured, falling back to bundled messages", new Object[0]);
            jSONArray = null;
        }
        C4783y0.m16630a("Messages - Using remote definition for messages", new Object[0]);
        if (jSONArray == null || jSONArray.length() <= 0) {
            C4772v0.m16580c(str);
            this.f11798w = null;
            this.f11799x = null;
            return;
        }
        m16455a(jSONArray);
    }

    /* renamed from: a */
    private void m16455a(JSONArray jSONArray) {
        try {
            ArrayList<C4746q> arrayList = new ArrayList<>();
            ArrayList<C4746q> arrayList2 = new ArrayList<>();
            ArrayList arrayList3 = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                C4746q b = C4746q.m16505b(jSONArray.getJSONObject(i));
                if (b != null) {
                    C4783y0.m16630a("Messages - loaded message - %s", b.mo16129c());
                    if (b.getClass() == C4714n0.class) {
                        arrayList3.add(b);
                    } else {
                        if (b.getClass() != C4712m0.class) {
                            if (b.getClass() != C4695k0.class) {
                                arrayList.add(b);
                            }
                        }
                        arrayList2.add(b);
                    }
                }
            }
            this.f11798w = arrayList;
            this.f11799x = arrayList2;
        } catch (JSONException e) {
            C4783y0.m16636b("Messages - Unable to parse messages JSON (%s)", e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r4.isConnected() != false) goto L_0x0029;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo16081a(android.content.Context r4) {
        /*
            r3 = this;
            r0 = 1
            if (r4 == 0) goto L_0x006c
            r1 = 0
            java.lang.String r2 = "connectivity"
            java.lang.Object r4 = r4.getSystemService(r2)     // Catch:{ NullPointerException -> 0x005c, SecurityException -> 0x004c, Exception -> 0x003c }
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4     // Catch:{ NullPointerException -> 0x005c, SecurityException -> 0x004c, Exception -> 0x003c }
            if (r4 == 0) goto L_0x0034
            android.net.NetworkInfo r4 = r4.getActiveNetworkInfo()     // Catch:{ NullPointerException -> 0x005c, SecurityException -> 0x004c, Exception -> 0x003c }
            if (r4 == 0) goto L_0x0021
            boolean r2 = r4.isAvailable()     // Catch:{ NullPointerException -> 0x005c, SecurityException -> 0x004c, Exception -> 0x003c }
            if (r2 == 0) goto L_0x0028
            boolean r4 = r4.isConnected()     // Catch:{ NullPointerException -> 0x005c, SecurityException -> 0x004c, Exception -> 0x003c }
            if (r4 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0021:
            java.lang.String r4 = "Analytics - Unable to determine connectivity status due to there being no default network currently active"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ NullPointerException -> 0x0031, SecurityException -> 0x002e, Exception -> 0x002b }
            p163g.p164a.p165a.C4783y0.m16640c(r4, r2)     // Catch:{ NullPointerException -> 0x0031, SecurityException -> 0x002e, Exception -> 0x002b }
        L_0x0028:
            r0 = 0
        L_0x0029:
            r2 = r0
            goto L_0x006d
        L_0x002b:
            r4 = move-exception
            r2 = 0
            goto L_0x003e
        L_0x002e:
            r4 = move-exception
            r2 = 0
            goto L_0x004e
        L_0x0031:
            r4 = move-exception
            r2 = 0
            goto L_0x005e
        L_0x0034:
            java.lang.String r4 = "Analytics - Unable to determine connectivity status due to the system service requested being unrecognized"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ NullPointerException -> 0x005c, SecurityException -> 0x004c, Exception -> 0x003c }
            p163g.p164a.p165a.C4783y0.m16640c(r4, r2)     // Catch:{ NullPointerException -> 0x005c, SecurityException -> 0x004c, Exception -> 0x003c }
            goto L_0x006c
        L_0x003c:
            r4 = move-exception
            r2 = 1
        L_0x003e:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r4 = r4.getLocalizedMessage()
            r0[r1] = r4
            java.lang.String r4 = "Analytics - Unable to access connectivity status due to an unexpected error (%s)"
            p163g.p164a.p165a.C4783y0.m16640c(r4, r0)
            goto L_0x006d
        L_0x004c:
            r4 = move-exception
            r2 = 1
        L_0x004e:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r4 = r4.getLocalizedMessage()
            r0[r1] = r4
            java.lang.String r4 = "Analytics - Unable to access connectivity status due to a security error (%s)"
            p163g.p164a.p165a.C4783y0.m16636b(r4, r0)
            goto L_0x006d
        L_0x005c:
            r4 = move-exception
            r2 = 1
        L_0x005e:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r4 = r4.getLocalizedMessage()
            r0[r1] = r4
            java.lang.String r4 = "Analytics - Unable to determine connectivity status due to an unexpected error (%s)"
            p163g.p164a.p165a.C4783y0.m16640c(r4, r0)
            goto L_0x006d
        L_0x006c:
            r2 = 1
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p164a.p165a.C4728p0.mo16081a(android.content.Context):boolean");
    }
}
