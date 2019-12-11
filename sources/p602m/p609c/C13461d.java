package p602m.p609c;

import java.util.Map;
import org.slf4j.impl.StaticMDCBinder;
import p602m.p609c.p611g.C13470d;
import p602m.p609c.p611g.C13474h;
import p602m.p609c.p612h.C13477a;

/* renamed from: m.c.d */
/* compiled from: MDC */
public class C13461d {

    /* renamed from: a */
    static C13477a f29986a;

    static {
        try {
            f29986a = m41435a();
        } catch (NoClassDefFoundError e) {
            f29986a = new C13470d();
            String message = e.getMessage();
            if (message == null || !message.contains("StaticMDCBinder")) {
                throw e;
            }
            C13474h.m41506a("Failed to load class \"org.slf4j.impl.StaticMDCBinder\".");
            C13474h.m41506a("Defaulting to no-operation MDCAdapter implementation.");
            C13474h.m41506a("See http://www.slf4j.org/codes.html#no_static_mdc_binder for further details.");
        } catch (Exception e2) {
            C13474h.m41507a("MDC binding unsuccessful.", e2);
        }
    }

    /* renamed from: a */
    private static C13477a m41435a() throws NoClassDefFoundError {
        try {
            return StaticMDCBinder.getSingleton().getMDCA();
        } catch (NoSuchMethodError unused) {
            return StaticMDCBinder.SINGLETON.getMDCA();
        }
    }

    /* renamed from: b */
    public static void m41437b() {
        C13477a aVar = f29986a;
        if (aVar != null) {
            aVar.clear();
            return;
        }
        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
    }

    /* renamed from: c */
    public static Map<String, String> m41438c() {
        C13477a aVar = f29986a;
        if (aVar != null) {
            return aVar.mo34746a();
        }
        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
    }

    /* renamed from: a */
    public static void m41436a(Map<String, String> map) {
        C13477a aVar = f29986a;
        if (aVar != null) {
            aVar.mo34747a(map);
            return;
        }
        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
    }
}
