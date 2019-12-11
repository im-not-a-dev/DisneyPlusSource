package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* renamed from: com.google.android.gms.measurement.internal.t3 */
final class C10196t3 extends C10101k5 {

    /* renamed from: A */
    static final Pair<String, Long> f23930A = new Pair<>("", Long.valueOf(0));

    /* renamed from: c */
    private SharedPreferences f23931c;

    /* renamed from: d */
    public C10236x3 f23932d;

    /* renamed from: e */
    public final C10246y3 f23933e = new C10246y3(this, "last_upload", 0);

    /* renamed from: f */
    public final C10246y3 f23934f = new C10246y3(this, "last_upload_attempt", 0);

    /* renamed from: g */
    public final C10246y3 f23935g = new C10246y3(this, "backoff", 0);

    /* renamed from: h */
    public final C10246y3 f23936h = new C10246y3(this, "last_delete_stale", 0);

    /* renamed from: i */
    public final C10246y3 f23937i = new C10246y3(this, "midnight_offset", 0);

    /* renamed from: j */
    public final C10246y3 f23938j = new C10246y3(this, "first_open_time", 0);

    /* renamed from: k */
    public final C10246y3 f23939k = new C10246y3(this, "app_install_time", 0);

    /* renamed from: l */
    public final C9990a4 f23940l = new C9990a4(this, "app_instance_id", null);

    /* renamed from: m */
    private String f23941m;

    /* renamed from: n */
    private boolean f23942n;

    /* renamed from: o */
    private long f23943o;

    /* renamed from: p */
    public final C10246y3 f23944p = new C10246y3(this, "time_before_start", 10000);

    /* renamed from: q */
    public final C10246y3 f23945q = new C10246y3(this, "session_timeout", 1800000);

    /* renamed from: r */
    public final C10216v3 f23946r = new C10216v3(this, "start_new_session", true);

    /* renamed from: s */
    public final C9990a4 f23947s = new C9990a4(this, "non_personalized_ads", null);

    /* renamed from: t */
    public final C10216v3 f23948t = new C10216v3(this, "use_dynamite_api", false);

    /* renamed from: u */
    public final C10216v3 f23949u = new C10216v3(this, "allow_remote_dynamite", false);

    /* renamed from: v */
    public final C10246y3 f23950v = new C10246y3(this, "last_pause_time", 0);

    /* renamed from: w */
    public final C10246y3 f23951w = new C10246y3(this, "time_active", 0);

    /* renamed from: x */
    public boolean f23952x;

    /* renamed from: y */
    public C10216v3 f23953y = new C10216v3(this, "app_backgrounded", false);

    /* renamed from: z */
    public C10246y3 f23954z = new C10246y3(this, "deep_link_last_retrieved", -1);

    C10196t3(C10145o4 o4Var) {
        super(o4Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final SharedPreferences m31822B() {
        mo25662j();
        mo25884p();
        return this.f23931c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public final boolean mo26087A() {
        return this.f23931c.contains("deferred_analytics_collection");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Pair<String, Boolean> mo26088a(String str) {
        String str2 = "";
        mo25662j();
        long a = mo25896c().mo25472a();
        String str3 = this.f23941m;
        if (str3 != null && a < this.f23943o) {
            return new Pair<>(str3, Boolean.valueOf(this.f23942n));
        }
        this.f23943o = a + mo25900g().mo25811a(str, C10106l.f23654g);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(mo25895b());
            if (advertisingIdInfo != null) {
                this.f23941m = advertisingIdInfo.getId();
                this.f23942n = advertisingIdInfo.isLimitAdTrackingEnabled();
            }
            if (this.f23941m == null) {
                this.f23941m = str2;
            }
        } catch (Exception e) {
            mo25898e().mo25868A().mo25909a("Unable to get advertising id", e);
            this.f23941m = str2;
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.f23941m, Boolean.valueOf(this.f23942n));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final String mo26091b(String str) {
        mo25662j();
        String str2 = (String) mo26088a(str).first;
        MessageDigest x = C10251y8.m31989x();
        if (x == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, x.digest(str2.getBytes()))});
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo26093c(String str) {
        mo25662j();
        Editor edit = m31822B().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo26095d(String str) {
        mo25662j();
        Editor edit = m31822B().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo25655r() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo25886s() {
        this.f23931c = mo25895b().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        String str = "has_been_opened";
        this.f23952x = this.f23931c.getBoolean(str, false);
        if (!this.f23952x) {
            Editor edit = this.f23931c.edit();
            edit.putBoolean(str, true);
            edit.apply();
        }
        C10236x3 x3Var = new C10236x3(this, "health_monitor", Math.max(0, ((Long) C10106l.f23656h.mo26194a(null)).longValue()));
        this.f23932d = x3Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public final String mo26097t() {
        mo25662j();
        return m31822B().getString("gmp_app_id", null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public final String mo26098u() {
        mo25662j();
        return m31822B().getString("admob_app_id", null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public final Boolean mo26099v() {
        mo25662j();
        String str = "use_service";
        if (!m31822B().contains(str)) {
            return null;
        }
        return Boolean.valueOf(m31822B().getBoolean(str, false));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public final void mo26100w() {
        mo25662j();
        mo25898e().mo25869B().mo25908a("Clearing collection preferences.");
        if (mo25900g().mo25813a(C10106l.f23665l0)) {
            Boolean x = mo26101x();
            Editor edit = m31822B().edit();
            edit.clear();
            edit.apply();
            if (x != null) {
                mo26089a(x.booleanValue());
            }
            return;
        }
        boolean contains = m31822B().contains("measurement_enabled");
        boolean z = true;
        if (contains) {
            z = mo26094c(true);
        }
        Editor edit2 = m31822B().edit();
        edit2.clear();
        edit2.apply();
        if (contains) {
            mo26089a(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public final Boolean mo26101x() {
        mo25662j();
        String str = "measurement_enabled";
        if (m31822B().contains(str)) {
            return Boolean.valueOf(m31822B().getBoolean(str, true));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final String mo26102y() {
        mo25662j();
        String str = "previous_os_version";
        String string = m31822B().getString(str, null);
        mo25901k().mo25884p();
        String str2 = VERSION.RELEASE;
        if (!TextUtils.isEmpty(str2) && !str2.equals(string)) {
            Editor edit = m31822B().edit();
            edit.putString(str, str2);
            edit.apply();
        }
        return string;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public final boolean mo26103z() {
        mo25662j();
        return m31822B().getBoolean("deferred_analytics_collection", false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo26092b(boolean z) {
        mo25662j();
        mo25898e().mo25869B().mo25909a("Setting useService", Boolean.valueOf(z));
        Editor edit = m31822B().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo26094c(boolean z) {
        mo25662j();
        return m31822B().getBoolean("measurement_enabled", z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo26096d(boolean z) {
        mo25662j();
        mo25898e().mo25869B().mo25909a("Updating deferred analytics collection", Boolean.valueOf(z));
        Editor edit = m31822B().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo26089a(boolean z) {
        mo25662j();
        mo25898e().mo25869B().mo25909a("Setting measurementEnabled", Boolean.valueOf(z));
        Editor edit = m31822B().edit();
        edit.putBoolean("measurement_enabled", z);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo26090a(long j) {
        return j - this.f23945q.mo26196a() > this.f23950v.mo26196a();
    }
}
