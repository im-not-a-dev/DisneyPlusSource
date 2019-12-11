package p163g.p449j.p450a.p451a.p457d.p464g;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.internal.C9733f;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.p400p.C9931c;
import com.google.android.gms.common.util.C9941e;
import com.google.android.gms.common.util.C9944h;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.C9963a;
import com.google.android.gms.dynamite.DynamiteModule.C9964b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.C10198t5;
import com.google.android.gms.measurement.p402a.C9981a;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: g.j.a.a.d.g.kc */
public class C11189kc {

    /* renamed from: h */
    private static volatile C11189kc f26306h = null;

    /* renamed from: i */
    private static Boolean f26307i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static Boolean f26308j = null;

    /* renamed from: k */
    private static boolean f26309k = false;

    /* renamed from: l */
    private static Boolean f26310l = null;

    /* renamed from: m */
    private static String f26311m = "use_dynamite_api";

    /* renamed from: n */
    private static String f26312n = "allow_remote_dynamite";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f26313a;

    /* renamed from: b */
    protected final C9941e f26314b;

    /* renamed from: c */
    private final ExecutorService f26315c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List<Pair<C10198t5, Object>> f26316d;

    /* renamed from: e */
    private int f26317e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f26318f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C11158i9 f26319g;

    /* renamed from: g.j.a.a.d.g.kc$a */
    abstract class C11190a implements Runnable {

        /* renamed from: U */
        final long f26320U;

        /* renamed from: V */
        private final boolean f26321V;

        /* renamed from: c */
        final long f26323c;

        C11190a(C11189kc kcVar) {
            this(true);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo28291a() throws RemoteException;

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo28292b() {
        }

        public void run() {
            if (C11189kc.this.f26318f) {
                mo28292b();
                return;
            }
            try {
                mo28291a();
            } catch (Exception e) {
                C11189kc.this.m35489a(e, false, this.f26321V);
                mo28292b();
            }
        }

        C11190a(boolean z) {
            this.f26323c = C11189kc.this.f26314b.mo25474c();
            this.f26320U = C11189kc.this.f26314b.mo25472a();
            this.f26321V = z;
        }
    }

    /* renamed from: g.j.a.a.d.g.kc$b */
    class C11191b implements ActivityLifecycleCallbacks {
        C11191b() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C11189kc.this.m35486a((C11190a) new C11323u(this, activity, bundle));
        }

        public final void onActivityDestroyed(Activity activity) {
            C11189kc.this.m35486a((C11190a) new C11393z(this, activity));
        }

        public final void onActivityPaused(Activity activity) {
            C11189kc.this.m35486a((C11190a) new C11338v(this, activity));
        }

        public final void onActivityResumed(Activity activity) {
            C11189kc.this.m35486a((C11190a) new C11352w(this, activity));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C11173ja jaVar = new C11173ja();
            C11189kc.this.m35486a((C11190a) new C11366x(this, activity, jaVar));
            Bundle d = jaVar.mo28614d(50);
            if (d != null) {
                bundle.putAll(d);
            }
        }

        public final void onActivityStarted(Activity activity) {
            C11189kc.this.m35486a((C11190a) new C11309t(this, activity));
        }

        public final void onActivityStopped(Activity activity) {
            C11189kc.this.m35486a((C11190a) new C11380y(this, activity));
        }
    }

    private C11189kc(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !m35497b(str2, str3)) {
            this.f26313a = "FA";
        } else {
            this.f26313a = str;
        }
        this.f26314b = C9944h.m30977d();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.f26315c = threadPoolExecutor;
        new C9981a(this);
        boolean z = false;
        if (!(!m35496b(context) || m35502f())) {
            this.f26318f = true;
            Log.w(this.f26313a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (!m35497b(str2, str3)) {
            if (str2 == null || str3 == null) {
                boolean z2 = str2 == null;
                if (str3 == null) {
                    z = true;
                }
                if (z2 ^ z) {
                    Log.w(this.f26313a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f26313a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
                this.f26318f = true;
                return;
            }
        }
        C11175jc jcVar = new C11175jc(this, str2, str3, context, bundle);
        m35486a((C11190a) jcVar);
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f26313a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C11191b());
        }
    }

    /* renamed from: a */
    public static C11189kc m35483a(Context context) {
        return m35484a(context, (String) null, (String) null, (String) null, (Bundle) null);
    }

    /* renamed from: b */
    private static boolean m35496b(Context context) {
        try {
            C9733f.m30270a(context);
            if (C9733f.m30272a() != null) {
                return true;
            }
        } catch (IllegalStateException unused) {
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static int m35498c(Context context) {
        return DynamiteModule.m31020b(context, ModuleDescriptor.MODULE_ID);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static int m35500d(Context context) {
        return DynamiteModule.m31013a(context, ModuleDescriptor.MODULE_ID);
    }

    /* renamed from: f */
    private static boolean m35502f() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: e */
    public final String mo28644e() {
        C11173ja jaVar = new C11173ja();
        m35486a((C11190a) new C11148i(this, jaVar));
        return jaVar.mo28613c(50);
    }

    /* renamed from: a */
    public static C11189kc m35484a(Context context, String str, String str2, String str3, Bundle bundle) {
        C9908u.m30853a(context);
        if (f26306h == null) {
            synchronized (C11189kc.class) {
                if (f26306h == null) {
                    C11189kc kcVar = new C11189kc(context, str, str2, str3, bundle);
                    f26306h = kcVar;
                }
            }
        }
        return f26306h;
    }

    /* renamed from: f */
    public static boolean m35503f(Context context) {
        m35501e(context);
        synchronized (C11189kc.class) {
            if (!f26309k) {
                try {
                    String str = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke(null, new Object[]{"measurement.dynamite.enabled", ""});
                    if ("true".equals(str)) {
                        f26310l = Boolean.valueOf(true);
                    } else if ("false".equals(str)) {
                        f26310l = Boolean.valueOf(false);
                    } else {
                        f26310l = null;
                    }
                    f26309k = true;
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    try {
                        Log.e("FA", "Unable to call SystemProperties.get()", e);
                        f26310l = null;
                    } finally {
                        f26309k = true;
                    }
                }
            }
        }
        Boolean bool = f26310l;
        if (bool == null) {
            bool = f26307i;
        }
        return bool.booleanValue();
    }

    /* renamed from: c */
    public final String mo28642c() {
        C11173ja jaVar = new C11173ja();
        m35486a((C11190a) new C11176k(this, jaVar));
        return jaVar.mo28613c(500);
    }

    /* renamed from: d */
    public final String mo28643d() {
        C11173ja jaVar = new C11173ja();
        m35486a((C11190a) new C11120g(this, jaVar));
        return jaVar.mo28613c(500);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m35497b(String str, String str2) {
        return (str2 == null || str == null || m35502f()) ? false : true;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m35501e(Context context) {
        synchronized (C11189kc.class) {
            try {
                if (f26307i != null && f26308j != null) {
                    return;
                }
                if (m35492a(context, "app_measurement_internal_disable_startup_flags")) {
                    f26307i = Boolean.valueOf(false);
                    f26308j = Boolean.valueOf(false);
                    return;
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                f26307i = Boolean.valueOf(sharedPreferences.getBoolean(f26311m, false));
                f26308j = Boolean.valueOf(sharedPreferences.getBoolean(f26312n, false));
                Editor edit = sharedPreferences.edit();
                edit.remove(f26311m);
                edit.remove(f26312n);
                edit.apply();
            } catch (ClassCastException | IllegalStateException | NullPointerException e) {
                Log.e("FA", "Exception reading flag from SharedPreferences.", e);
                f26307i = Boolean.valueOf(false);
                f26308j = Boolean.valueOf(false);
            }
        }
    }

    /* renamed from: b */
    public final void mo28640b(String str, String str2, Bundle bundle) {
        m35490a(str, str2, bundle, true, true, null);
    }

    /* renamed from: b */
    public final void mo28639b(String str) {
        m35486a((C11190a) new C11084e(this, str));
    }

    /* renamed from: c */
    public final int mo28641c(String str) {
        C11173ja jaVar = new C11173ja();
        m35486a((C11190a) new C11224n(this, str, jaVar));
        Integer num = (Integer) C11173ja.m35425a(jaVar.mo28614d(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: b */
    public final String mo28638b() {
        C11173ja jaVar = new C11173ja();
        m35486a((C11190a) new C11162j(this, jaVar));
        return jaVar.mo28613c(500);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m35486a(C11190a aVar) {
        this.f26315c.execute(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C11158i9 mo28628a(Context context, boolean z) {
        C9964b bVar;
        if (z) {
            try {
                bVar = DynamiteModule.f23245k;
            } catch (C9963a e) {
                m35489a((Exception) e, true, false);
                return null;
            }
        } else {
            bVar = DynamiteModule.f23243i;
        }
        return C11405zb.asInterface(DynamiteModule.m31015a(context, bVar, ModuleDescriptor.MODULE_ID).mo25482a("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m35489a(Exception exc, boolean z, boolean z2) {
        this.f26318f |= z;
        if (z) {
            Log.w(this.f26313a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        String str = "Error with data collection. Data lost.";
        if (z2) {
            mo28631a(5, str, (Object) exc, (Object) null, (Object) null);
        }
        Log.w(this.f26313a, str, exc);
    }

    /* renamed from: a */
    private final void m35490a(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        C11252p pVar = new C11252p(this, l, str, str2, bundle, z, z2);
        m35486a((C11190a) pVar);
    }

    /* renamed from: a */
    public final void mo28636a(String str, String str2, Object obj) {
        m35491a(str, str2, obj, true);
    }

    /* renamed from: a */
    private final void m35491a(String str, String str2, Object obj, boolean z) {
        C11295s sVar = new C11295s(this, str, str2, obj, z);
        m35486a((C11190a) sVar);
    }

    /* renamed from: a */
    public final void mo28633a(Bundle bundle) {
        m35486a((C11190a) new C11280r(this, bundle));
    }

    /* renamed from: a */
    public final void mo28635a(String str, String str2, Bundle bundle) {
        m35486a((C11190a) new C11049c(this, str, str2, bundle));
    }

    /* renamed from: a */
    public final List<Bundle> mo28629a(String str, String str2) {
        C11173ja jaVar = new C11173ja();
        m35486a((C11190a) new C11034b(this, str, str2, jaVar));
        List<Bundle> list = (List) C11173ja.m35425a(jaVar.mo28614d(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: a */
    public final void mo28632a(Activity activity, String str, String str2) {
        m35486a((C11190a) new C11068d(this, activity, str, str2));
    }

    /* renamed from: a */
    public final void mo28634a(String str) {
        m35486a((C11190a) new C11104f(this, str));
    }

    /* renamed from: a */
    public final long mo28627a() {
        C11173ja jaVar = new C11173ja();
        m35486a((C11190a) new C11134h(this, jaVar));
        Long l = (Long) C11173ja.m35425a(jaVar.mo28614d(500), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f26314b.mo25474c()).nextLong();
        int i = this.f26317e + 1;
        this.f26317e = i;
        return nextLong + ((long) i);
    }

    /* renamed from: a */
    public final Map<String, Object> mo28630a(String str, String str2, boolean z) {
        C11173ja jaVar = new C11173ja();
        C11211m mVar = new C11211m(this, str, str2, z, jaVar);
        m35486a((C11190a) mVar);
        Bundle d = jaVar.mo28614d(5000);
        if (d == null || d.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(d.size());
        for (String str3 : d.keySet()) {
            Object obj = d.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo28631a(int i, String str, Object obj, Object obj2, Object obj3) {
        C11192l lVar = new C11192l(this, false, 5, str, obj, null, null);
        m35486a((C11190a) lVar);
    }

    /* renamed from: a */
    public final void mo28637a(boolean z) {
        m35486a((C11190a) new C11238o(this, z));
    }

    /* renamed from: a */
    private static boolean m35492a(Context context, String str) {
        C9908u.m30863b(str);
        try {
            ApplicationInfo a = C9931c.m30956a(context).mo25459a(context.getPackageName(), 128);
            if (a != null) {
                if (a.metaData != null) {
                    return a.metaData.getBoolean(str);
                }
            }
        } catch (NameNotFoundException unused) {
        }
        return false;
    }
}
