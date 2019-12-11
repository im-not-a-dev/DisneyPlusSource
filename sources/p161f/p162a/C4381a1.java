package p161f.p162a;

import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* renamed from: f.a.a1 */
public class C4381a1 {

    /* renamed from: f */
    private static final String f10909f = C1557c.m7461a(C4381a1.class);

    /* renamed from: a */
    private final List<String> f10910a = new ArrayList(32);

    /* renamed from: b */
    private long f10911b;

    /* renamed from: c */
    private boolean f10912c = false;

    /* renamed from: d */
    private final Object f10913d = new Object();

    /* renamed from: e */
    private C4595u0 f10914e;

    /* renamed from: b */
    static String m15110b(String str, String str2, Throwable th) {
        if (C1563i.m7490d(str)) {
            return null;
        }
        if (C1563i.m7490d(str2) && (th == null || C1563i.m7490d(th.getMessage()))) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m15111c());
        sb.append(" ");
        sb.append(str);
        String sb2 = sb.toString();
        String str3 = ": ";
        if (str2 != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(str3);
            sb3.append(str2);
            sb2 = sb3.toString();
        }
        if (th != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb2);
            sb4.append(str3);
            sb4.append(th.getMessage());
            sb2 = sb4.toString();
        }
        return sb2.substring(0, Math.min(sb2.length(), 1000));
    }

    /* renamed from: c */
    private static String m15111c() {
        return C4472i3.m15482a(new Date(), C4573r6.ANDROID_LOGCAT);
    }

    /* renamed from: d */
    private boolean m15112d() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        if (stackTrace == null || stackTrace.length == 0) {
            return true;
        }
        StackTraceElement stackTraceElement = stackTrace[1];
        String methodName = stackTraceElement.getMethodName();
        String className = stackTraceElement.getClassName();
        int i = 0;
        for (StackTraceElement stackTraceElement2 : stackTrace) {
            if (stackTraceElement2.getClassName().equals(className) && stackTraceElement2.getMethodName().equals(methodName)) {
                i++;
            }
        }
        if (i != 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo15398a(String str, String str2, Throwable th) {
        if (this.f10912c) {
            if ((str2 == null || (!str2.contains("device_logs") && !str2.contains("test_user_data"))) && !m15112d()) {
                synchronized (this.f10913d) {
                    if (this.f10910a.size() >= 32) {
                        mo15401b();
                    }
                    if (this.f10910a.isEmpty() || this.f10911b == 0) {
                        this.f10911b = C4472i3.m15480a();
                    }
                    String b = m15110b(str, str2, th);
                    if (b != null) {
                        this.f10910a.add(b);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo15401b() {
        synchronized (this.f10913d) {
            if (this.f10914e != null) {
                ArrayList arrayList = new ArrayList();
                for (String add : this.f10910a) {
                    arrayList.add(add);
                }
                this.f10914e.mo15770a((List<String>) arrayList, this.f10911b);
            }
            this.f10910a.clear();
            this.f10911b = 0;
        }
    }

    /* renamed from: a */
    public void mo15399a(boolean z) {
        synchronized (this.f10913d) {
            if (!z) {
                this.f10910a.clear();
            } else {
                C1557c.m7468b(f10909f, "Test user device logging is enabled.", false);
            }
        }
        this.f10912c = z;
    }

    /* renamed from: a */
    public void mo15396a(C4595u0 u0Var) {
        this.f10914e = u0Var;
    }

    /* renamed from: a */
    public void mo15397a(C4629y1 y1Var) {
        mo15399a(y1Var.mo15939k());
    }

    /* renamed from: a */
    public boolean mo15400a() {
        return this.f10912c;
    }
}
