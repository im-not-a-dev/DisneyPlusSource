package p551j.p552a;

import java.util.concurrent.atomic.AtomicBoolean;
import p520io.sentry.event.C12562b;
import p551j.p552a.p557i.C12608e;
import p602m.p609c.C13459b;
import p602m.p609c.C13460c;

/* renamed from: j.a.b */
/* compiled from: Sentry */
public final class C12589b {

    /* renamed from: a */
    private static final C13459b f29196a = C13460c.m41415a(C12589b.class);

    /* renamed from: b */
    private static volatile C12590c f29197b = null;

    /* renamed from: c */
    private static AtomicBoolean f29198c = new AtomicBoolean(false);

    /* renamed from: d */
    private static C12608e f29199d = null;

    private C12589b() {
    }

    /* renamed from: a */
    public static C12590c m39528a(String str, C12591d dVar) {
        C12592e eVar = new C12592e();
        eVar.mo30903a(str);
        eVar.mo30902a(dVar);
        return m39527a(eVar);
    }

    /* renamed from: b */
    public static C12590c m39533b() {
        if (f29197b != null) {
            return f29197b;
        }
        synchronized (C12589b.class) {
            if (f29197b == null && !f29198c.get()) {
                f29198c.set(true);
                m39534c();
            }
        }
        return f29197b;
    }

    /* renamed from: c */
    public static C12590c m39534c() {
        return m39528a(null, null);
    }

    /* renamed from: a */
    public static C12590c m39527a(C12592e eVar) {
        f29199d = eVar.mo30904b();
        C12590c a = C12591d.m39550a(eVar.mo30901a(), eVar.mo30905c());
        m39531a(a);
        return a;
    }

    /* renamed from: a */
    public static C12608e m39529a() {
        return f29199d;
    }

    /* renamed from: a */
    public static void m39531a(C12590c cVar) {
        if (f29197b != null) {
            f29196a.mo34726b("Overwriting statically stored SentryClient instance {} with {}.", f29197b, cVar);
        }
        f29197b = cVar;
    }

    /* renamed from: a */
    public static void m39532a(Throwable th) {
        m39533b().mo30891a(th);
    }

    /* renamed from: a */
    public static void m39530a(C12562b bVar) {
        m39533b().mo30895c(bVar);
    }
}
