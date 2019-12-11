package p163g.p164a.p165a;

import android.app.Activity;
import android.content.Context;
import java.util.Map;

/* renamed from: g.a.a.m */
/* compiled from: Config */
public final class C4705m {

    /* renamed from: g.a.a.m$a */
    /* compiled from: Config */
    static class C4706a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ Activity f11707c;

        C4706a(Activity activity) {
            this.f11707c = activity;
        }

        public void run() {
            C4727p.m16424a(this.f11707c, null);
        }
    }

    /* renamed from: g.a.a.m$b */
    /* compiled from: Config */
    static class C4707b implements Runnable {
        C4707b() {
        }

        public void run() {
            C4727p.m16446i();
        }
    }

    /* renamed from: g.a.a.m$c */
    /* compiled from: Config */
    static class C4708c implements Runnable {
        C4708c() {
        }

        public void run() {
            C4684g1.m16316e();
        }
    }

    /* renamed from: g.a.a.m$d */
    /* compiled from: Config */
    public interface C4709d {
        /* renamed from: a */
        void mo16047a(C4711f fVar, Map<String, Object> map);
    }

    /* renamed from: g.a.a.m$e */
    /* compiled from: Config */
    public enum C4710e {
        APPLICATION_TYPE_HANDHELD(0),
        APPLICATION_TYPE_WEARABLE(1);

        private C4710e(int i) {
        }
    }

    /* renamed from: g.a.a.m$f */
    /* compiled from: Config */
    public enum C4711f {
        MOBILE_EVENT_LIFECYCLE(0),
        MOBILE_EVENT_ACQUISITION_INSTALL(1),
        MOBILE_EVENT_ACQUISITION_LAUNCH(2);

        private C4711f(int i) {
        }
    }

    /* renamed from: a */
    public static String m16369a() {
        return "4.17.1-AN";
    }

    /* renamed from: a */
    public static void m16371a(Context context) {
        m16372a(context, C4710e.APPLICATION_TYPE_HANDHELD);
    }

    /* renamed from: b */
    public static void m16375b() {
        if (C4783y0.m16611I()) {
            C4783y0.m16640c("Analytics - Method pauseCollectingLifecycleData is not available for Wearable", new Object[0]);
            return;
        }
        C4753r.m16528j();
        C4783y0.m16642d().execute(new C4707b());
    }

    /* renamed from: a */
    public static void m16372a(Context context, C4710e eVar) {
        C4783y0.m16625a(context);
        m16373a(eVar);
        if (eVar == C4710e.APPLICATION_TYPE_WEARABLE) {
            C4783y0.m16642d().execute(new C4708c());
        }
    }

    /* renamed from: a */
    public static void m16373a(C4710e eVar) {
        C4783y0.m16626a(eVar);
    }

    /* renamed from: a */
    public static void m16374a(Boolean bool) {
        C4783y0.m16632a(bool.booleanValue());
    }

    /* renamed from: a */
    public static void m16370a(Activity activity) {
        if (C4783y0.m16611I()) {
            C4783y0.m16640c("Analytics - Method collectLifecycleData is not available for Wearable", new Object[0]);
            return;
        }
        C4783y0.m16642d().execute(new C4706a(activity));
    }
}
