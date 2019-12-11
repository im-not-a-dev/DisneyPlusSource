package p602m.p613d.p683g;

import java.security.AccessControlException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Map;

/* renamed from: m.d.g.i */
/* compiled from: Properties */
public class C14088i {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final ThreadLocal f31109a = new ThreadLocal();

    /* renamed from: m.d.g.i$a */
    /* compiled from: Properties */
    static class C14089a implements PrivilegedAction {

        /* renamed from: a */
        final /* synthetic */ String f31110a;

        C14089a(String str) {
            this.f31110a = str;
        }

        public Object run() {
            Map map = (Map) C14088i.f31109a.get();
            if (map != null) {
                return map.get(this.f31110a);
            }
            return System.getProperty(this.f31110a);
        }
    }

    /* renamed from: b */
    public static boolean m44484b(String str) {
        try {
            String a = m44482a(str);
            if (a != null) {
                return "true".equals(C14090j.m44486a(a));
            }
        } catch (AccessControlException unused) {
        }
        return false;
    }

    /* renamed from: a */
    private static String m44482a(String str) {
        return (String) AccessController.doPrivileged(new C14089a(str));
    }
}
