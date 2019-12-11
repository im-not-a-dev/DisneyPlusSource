package p551j.p552a.p563m;

import java.util.concurrent.atomic.AtomicInteger;
import p602m.p609c.C13459b;
import p602m.p609c.C13460c;

/* renamed from: j.a.m.a */
/* compiled from: SentryEnvironment */
public final class C12654a {

    /* renamed from: a */
    protected static final ThreadLocal<AtomicInteger> f29342a = new C12655a();

    /* renamed from: b */
    private static final C13459b f29343b = C13460c.m41415a(C12654a.class);

    /* renamed from: j.a.m.a$a */
    /* compiled from: SentryEnvironment */
    static class C12655a extends ThreadLocal<AtomicInteger> {
        C12655a() {
        }

        /* access modifiers changed from: protected */
        public AtomicInteger initialValue() {
            return new AtomicInteger();
        }
    }

    private C12654a() {
    }

    /* renamed from: a */
    public static String m39689a() {
        return "sentry-java/1.7.27-f6366";
    }

    /* renamed from: b */
    public static boolean m39690b() {
        return ((AtomicInteger) f29342a.get()).get() > 0;
    }

    /* renamed from: c */
    public static void m39691c() {
        try {
            if (m39690b()) {
                f29343b.mo34724b("Thread already managed by Sentry");
            }
        } finally {
            ((AtomicInteger) f29342a.get()).incrementAndGet();
        }
    }

    /* renamed from: d */
    public static void m39692d() {
        try {
            if (!m39690b()) {
                m39691c();
                f29343b.mo34724b("Thread not yet managed by Sentry");
            }
        } finally {
            if (((AtomicInteger) f29342a.get()).decrementAndGet() == 0) {
                f29342a.remove();
            }
        }
    }
}
