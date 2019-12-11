package p161f.p162a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* renamed from: f.a.d3 */
public class C4424d3 {

    /* renamed from: e */
    private static final String f11005e = C1557c.m7461a(C4424d3.class);

    /* renamed from: a */
    private final SharedPreferences f11006a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f11007b = new Object();

    /* renamed from: c */
    private AtomicBoolean f11008c = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4629y1 f11009d;

    /* renamed from: f.a.d3$b */
    class C4426b extends AsyncTask<Void, Void, Void> {
        private C4426b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            C4629y1 y1Var = new C4629y1();
            y1Var.mo15926b(C4424d3.this.mo15505i());
            y1Var.mo15921a(C4424d3.this.mo15504h());
            y1Var.mo15930c(C4424d3.this.mo15506j());
            y1Var.mo15920a(C4424d3.this.mo15503g());
            y1Var.mo15925b(C4424d3.this.mo15502f());
            y1Var.mo15919a(C4424d3.this.mo15499c());
            y1Var.mo15924b(C4424d3.this.mo15500d());
            y1Var.mo15929c(C4424d3.this.mo15501e());
            y1Var.mo15922a(C4424d3.this.mo15498b());
            y1Var.mo15927b(C4424d3.this.mo15497a());
            y1Var.mo15931c(C4424d3.this.mo15507k());
            synchronized (C4424d3.this.f11007b) {
                C4424d3.this.f11009d = y1Var;
            }
            return null;
        }
    }

    public C4424d3(Context context, String str) {
        String str2;
        if (str == null) {
            C1557c.m7465b(f11005e, "ServerConfigStorageProvider received null api key.");
            str2 = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(".");
            sb.append(str);
            str2 = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("com.appboy.storage.serverconfigstorageprovider");
        sb2.append(str2);
        this.f11006a = context.getSharedPreferences(sb2.toString(), 0);
        new C4426b().execute(new Void[0]);
    }

    /* renamed from: b */
    public boolean mo15498b() {
        synchronized (this.f11007b) {
            if (this.f11009d != null) {
                boolean i = this.f11009d.mo15937i();
                return i;
            }
            boolean z = this.f11006a.getBoolean("geofences_enabled", false);
            return z;
        }
    }

    /* renamed from: c */
    public int mo15499c() {
        synchronized (this.f11007b) {
            if (this.f11009d != null) {
                int f = this.f11009d.mo15934f();
                return f;
            }
            int i = this.f11006a.getInt("geofences_min_time_since_last_request", -1);
            return i;
        }
    }

    /* renamed from: d */
    public int mo15500d() {
        synchronized (this.f11007b) {
            if (this.f11009d != null) {
                int g = this.f11009d.mo15935g();
                return g;
            }
            int i = this.f11006a.getInt("geofences_min_time_since_last_report", -1);
            return i;
        }
    }

    /* renamed from: e */
    public int mo15501e() {
        synchronized (this.f11007b) {
            if (this.f11009d != null) {
                int h = this.f11009d.mo15936h();
                return h;
            }
            int i = this.f11006a.getInt("geofences_max_num_to_register", -1);
            return i;
        }
    }

    /* renamed from: f */
    public long mo15502f() {
        synchronized (this.f11007b) {
            if (this.f11009d != null) {
                long e = this.f11009d.mo15933e();
                return e;
            }
            long j = this.f11006a.getLong("messaging_session_timeout", -1);
            return j;
        }
    }

    /* renamed from: g */
    public long mo15503g() {
        synchronized (this.f11007b) {
            if (this.f11009d != null) {
                long a = this.f11009d.mo15918a();
                return a;
            }
            long j = this.f11006a.getLong("config_time", 0);
            return j;
        }
    }

    /* renamed from: h */
    public Set<String> mo15504h() {
        Set<String> set;
        synchronized (this.f11007b) {
            if (this.f11009d != null) {
                set = this.f11009d.mo15923b();
            } else {
                set = m15265a("blacklisted_events");
            }
            if (set != null) {
                return set;
            }
            HashSet hashSet = new HashSet();
            return hashSet;
        }
    }

    /* renamed from: i */
    public Set<String> mo15505i() {
        Set<String> set;
        synchronized (this.f11007b) {
            if (this.f11009d != null) {
                set = this.f11009d.mo15928c();
            } else {
                set = m15265a("blacklisted_attributes");
            }
            if (set != null) {
                return set;
            }
            HashSet hashSet = new HashSet();
            return hashSet;
        }
    }

    /* renamed from: j */
    public Set<String> mo15506j() {
        Set<String> set;
        synchronized (this.f11007b) {
            if (this.f11009d != null) {
                set = this.f11009d.mo15932d();
            } else {
                set = m15265a("blacklisted_purchases");
            }
            if (set != null) {
                return set;
            }
            HashSet hashSet = new HashSet();
            return hashSet;
        }
    }

    /* renamed from: k */
    public boolean mo15507k() {
        synchronized (this.f11007b) {
            if (this.f11009d != null) {
                boolean k = this.f11009d.mo15939k();
                return k;
            }
            boolean z = this.f11006a.getBoolean("test_user_device_logging_enabled", false);
            return z;
        }
    }

    /* renamed from: l */
    public boolean mo15508l() {
        return this.f11008c.get();
    }

    /* renamed from: a */
    public void mo15495a(C4629y1 y1Var) {
        synchronized (this.f11007b) {
            this.f11009d = y1Var;
        }
        try {
            Editor edit = this.f11006a.edit();
            if (y1Var.mo15923b() != null) {
                edit.putString("blacklisted_events", new JSONArray(y1Var.mo15923b()).toString());
            }
            if (y1Var.mo15928c() != null) {
                edit.putString("blacklisted_attributes", new JSONArray(y1Var.mo15928c()).toString());
            }
            if (y1Var.mo15932d() != null) {
                edit.putString("blacklisted_purchases", new JSONArray(y1Var.mo15932d()).toString());
            }
            edit.putLong("config_time", y1Var.mo15918a());
            edit.putInt("geofences_min_time_since_last_request", y1Var.mo15934f());
            edit.putInt("geofences_min_time_since_last_report", y1Var.mo15935g());
            edit.putInt("geofences_max_num_to_register", y1Var.mo15936h());
            edit.putBoolean("geofences_enabled", y1Var.mo15937i());
            edit.putBoolean("geofences_enabled_set", y1Var.mo15938j());
            edit.putLong("messaging_session_timeout", y1Var.mo15933e());
            edit.putBoolean("test_user_device_logging_enabled", y1Var.mo15939k());
            edit.apply();
        } catch (Exception e) {
            C1557c.m7474e(f11005e, "Could not persist server config to shared preferences.", e);
        }
    }

    /* renamed from: a */
    public boolean mo15497a() {
        synchronized (this.f11007b) {
            if (this.f11009d != null) {
                boolean j = this.f11009d.mo15938j();
                return j;
            }
            boolean z = this.f11006a.getBoolean("geofences_enabled_set", false);
            return z;
        }
    }

    /* renamed from: a */
    public void mo15496a(boolean z) {
        this.f11008c.set(z);
    }

    /* renamed from: a */
    private Set<String> m15265a(String str) {
        try {
            String string = this.f11006a.getString(str, "");
            if (C1563i.m7490d(string)) {
                return null;
            }
            JSONArray jSONArray = new JSONArray(string);
            HashSet hashSet = new HashSet();
            for (int i = 0; i < jSONArray.length(); i++) {
                hashSet.add(jSONArray.getString(i));
            }
            return hashSet;
        } catch (Exception e) {
            C1557c.m7474e(f11005e, "Experienced exception retrieving blacklisted strings from local storage. Returning null.", e);
            return null;
        }
    }
}
