package p161f.p162a;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources.NotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.appboy.p024n.C1489b;
import com.appboy.p033s.C1557c;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: f.a.s0 */
public class C4575s0 implements C4603v0 {

    /* renamed from: f */
    private static final String f11381f = C1557c.m7461a(C4575s0.class);

    /* renamed from: a */
    private final Context f11382a;

    /* renamed from: b */
    private final C4611w0 f11383b;

    /* renamed from: c */
    private final C4597u2 f11384c;

    /* renamed from: d */
    private String f11385d;

    /* renamed from: e */
    private final C1489b f11386e;

    public C4575s0(Context context, C1489b bVar, C4611w0 w0Var, C4597u2 u2Var) {
        if (context != null) {
            this.f11382a = context;
            this.f11386e = bVar;
            this.f11383b = w0Var;
            this.f11384c = u2Var;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: f */
    private String m15883f() {
        return String.valueOf(VERSION.SDK_INT);
    }

    /* renamed from: g */
    private String m15884g() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.f11382a.getSystemService("phone");
            int phoneType = telephonyManager.getPhoneType();
            if (phoneType == 0) {
                return null;
            }
            if (phoneType == 1 || phoneType == 2) {
                return telephonyManager.getNetworkOperatorName();
            }
            C1557c.m7473e(f11381f, "Unknown phone type");
            return null;
        } catch (NotFoundException e) {
            C1557c.m7470c(f11381f, "Caught resources not found exception while reading the phone carrier name.", e);
            return null;
        } catch (SecurityException e2) {
            C1557c.m7470c(f11381f, "Caught security exception while reading the phone carrier name.", e2);
            return null;
        }
    }

    /* renamed from: h */
    private String m15885h() {
        return Build.MODEL;
    }

    /* renamed from: i */
    private Locale m15886i() {
        return Locale.getDefault();
    }

    /* renamed from: j */
    private TimeZone m15887j() {
        return TimeZone.getDefault();
    }

    /* renamed from: k */
    private DisplayMetrics m15888k() {
        WindowManager windowManager = (WindowManager) this.f11382a.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: l */
    private boolean m15889l() {
        int rotation = ((WindowManager) this.f11382a.getSystemService("window")).getDefaultDisplay().getRotation();
        return rotation == 1 || rotation == 3;
    }

    /* renamed from: m */
    private boolean m15890m() {
        if (VERSION.SDK_INT < 28) {
            return false;
        }
        try {
            return ((ActivityManager) this.f11382a.getSystemService("activity")).isBackgroundRestricted();
        } catch (Exception e) {
            C1557c.m7470c(f11381f, "Failed to collect background restriction information from Activity Manager", e);
            return false;
        }
    }

    /* renamed from: a */
    public C4498l1 mo15818a() {
        C4498l1 l1Var = new C4498l1(this.f11386e, m15883f(), m15884g(), m15885h(), m15882a(m15886i()), m15887j().getID(), m15881a(m15888k(), m15889l()), Boolean.valueOf(mo15819b()), Boolean.valueOf(m15890m()));
        return l1Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo15819b() {
        String str = "from";
        String str2 = "androidx.core.app.NotificationManagerCompat";
        int i = VERSION.SDK_INT;
        if (i >= 24) {
            NotificationManager notificationManager = (NotificationManager) this.f11382a.getSystemService("notification");
            if (notificationManager != null) {
                return notificationManager.areNotificationsEnabled();
            }
            return true;
        }
        if (i >= 19) {
            try {
                Method a = C4598u3.m15986a(str2, str, (Class<?>[]) new Class[]{Context.class});
                if (a == null) {
                    a = C4598u3.m15986a(str2, str, (Class<?>[]) new Class[]{Context.class});
                    if (a == null) {
                        return true;
                    }
                }
                Object a2 = C4598u3.m15984a((Object) null, a, this.f11382a);
                if (a2 == null) {
                    return true;
                }
                Method a3 = C4598u3.m15985a(a2.getClass(), "areNotificationsEnabled", (Class<?>[]) new Class[0]);
                if (a3 == null) {
                    return true;
                }
                Object a4 = C4598u3.m15984a(a2, a3, new Object[0]);
                if (a4 instanceof Boolean) {
                    return ((Boolean) a4).booleanValue();
                }
                return true;
            } catch (Exception e) {
                C1557c.m7470c(f11381f, "Failed to read notifications enabled state from NotificationManagerCompat.", e);
            }
        }
        return true;
    }

    /* renamed from: c */
    public String mo15820c() {
        String a = this.f11383b.mo15647a();
        if (a == null) {
            C1557c.m7465b(f11381f, "Error reading deviceId, received a null value.");
        }
        return a;
    }

    /* renamed from: d */
    public C4498l1 mo15821d() {
        this.f11384c.mo15878a(mo15818a());
        return (C4498l1) this.f11384c.mo15793b();
    }

    /* renamed from: e */
    public String mo15822e() {
        PackageInfo packageInfo;
        String str = this.f11385d;
        if (str != null) {
            return str;
        }
        String packageName = this.f11382a.getPackageName();
        try {
            packageInfo = this.f11382a.getPackageManager().getPackageInfo(packageName, 0);
        } catch (NameNotFoundException e) {
            String str2 = f11381f;
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to inspect package [");
            sb.append(packageName);
            sb.append("]");
            C1557c.m7470c(str2, sb.toString(), e);
            packageInfo = null;
        }
        if (packageInfo == null) {
            packageInfo = this.f11382a.getPackageManager().getPackageArchiveInfo(this.f11382a.getApplicationInfo().sourceDir, 0);
        }
        if (packageInfo != null) {
            this.f11385d = packageInfo.versionName;
            return this.f11385d;
        }
        C1557c.m7458a(f11381f, "App version could not be read. Returning null");
        return null;
    }

    /* renamed from: a */
    static String m15882a(Locale locale) {
        return locale.toString();
    }

    /* renamed from: a */
    static String m15881a(DisplayMetrics displayMetrics, boolean z) {
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        String str = "x";
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            sb.append(str);
            sb.append(i);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i);
        sb2.append(str);
        sb2.append(i2);
        return sb2.toString();
    }
}
