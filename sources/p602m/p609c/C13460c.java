package p602m.p609c;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.impl.StaticLoggerBinder;
import p602m.p609c.p610f.C13465c;
import p602m.p609c.p610f.C13466d;
import p602m.p609c.p611g.C13469c;
import p602m.p609c.p611g.C13472f;
import p602m.p609c.p611g.C13473g;
import p602m.p609c.p611g.C13474h;

/* renamed from: m.c.c */
/* compiled from: LoggerFactory */
public final class C13460c {

    /* renamed from: a */
    static volatile int f29980a;

    /* renamed from: b */
    static final C13473g f29981b = new C13473g();

    /* renamed from: c */
    static final C13469c f29982c = new C13469c();

    /* renamed from: d */
    static boolean f29983d = C13474h.m41509b("slf4j.detectLoggerNameMismatch");

    /* renamed from: e */
    private static final String[] f29984e = {"1.6", "1.7"};

    /* renamed from: f */
    private static String f29985f = "org/slf4j/impl/StaticLoggerBinder.class";

    private C13460c() {
    }

    /* renamed from: a */
    private static final void m41417a() {
        Set set = null;
        try {
            if (!m41431f()) {
                set = m41427c();
                m41428c(set);
            }
            StaticLoggerBinder.getSingleton();
            f29980a = 3;
            m41425b(set);
            m41429d();
            m41433h();
            f29981b.mo34757a();
        } catch (NoClassDefFoundError e) {
            if (m41426b(e.getMessage())) {
                f29980a = 4;
                C13474h.m41506a("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                C13474h.m41506a("Defaulting to no-operation (NOP) logger implementation");
                C13474h.m41506a("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                return;
            }
            m41419a((Throwable) e);
            throw e;
        } catch (NoSuchMethodError e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                f29980a = 2;
                C13474h.m41506a("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                C13474h.m41506a("Your binding is version 1.5.5 or earlier.");
                C13474h.m41506a("Upgrade your binding to version 1.6.x.");
            }
            throw e2;
        } catch (Exception e3) {
            m41419a((Throwable) e3);
            throw new IllegalStateException("Unexpected initialization failure", e3);
        }
    }

    /* renamed from: b */
    private static boolean m41426b(String str) {
        if (str == null) {
            return false;
        }
        return str.contains("org/slf4j/impl/StaticLoggerBinder") || str.contains("org.slf4j.impl.StaticLoggerBinder");
    }

    /* renamed from: c */
    static Set<URL> m41427c() {
        Enumeration enumeration;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = C13460c.class.getClassLoader();
            if (classLoader == null) {
                enumeration = ClassLoader.getSystemResources(f29985f);
            } else {
                enumeration = classLoader.getResources(f29985f);
            }
            while (enumeration.hasMoreElements()) {
                linkedHashSet.add((URL) enumeration.nextElement());
            }
        } catch (IOException e) {
            C13474h.m41507a("Error getting resources from path", e);
        }
        return linkedHashSet;
    }

    /* renamed from: d */
    private static void m41429d() {
        synchronized (f29981b) {
            f29981b.mo34760d();
            for (C13472f fVar : f29981b.mo34759c()) {
                fVar.mo34750a(m41416a(fVar.getName()));
            }
        }
    }

    /* renamed from: e */
    public static C13458a m41430e() {
        if (f29980a == 0) {
            synchronized (C13460c.class) {
                if (f29980a == 0) {
                    f29980a = 1;
                    m41432g();
                }
            }
        }
        int i = f29980a;
        if (i == 1) {
            return f29981b;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        } else if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        } else {
            if (i == 4) {
                return f29982c;
            }
            throw new IllegalStateException("Unreachable code");
        }
    }

    /* renamed from: f */
    private static boolean m41431f() {
        String c = C13474h.m41510c("java.vendor.url");
        if (c == null) {
            return false;
        }
        return c.toLowerCase().contains("android");
    }

    /* renamed from: g */
    private static final void m41432g() {
        m41417a();
        if (f29980a == 3) {
            m41434i();
        }
    }

    /* renamed from: h */
    private static void m41433h() {
        LinkedBlockingQueue b = f29981b.mo34758b();
        int size = b.size();
        ArrayList<C13466d> arrayList = new ArrayList<>(128);
        int i = 0;
        while (b.drainTo(arrayList, 128) != 0) {
            for (C13466d dVar : arrayList) {
                m41420a(dVar);
                int i2 = i + 1;
                if (i == 0) {
                    m41421a(dVar, size);
                }
                i = i2;
            }
            arrayList.clear();
        }
    }

    /* renamed from: i */
    private static final void m41434i() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String startsWith : f29984e) {
                if (str.startsWith(startsWith)) {
                    z = true;
                }
            }
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append("The requested version ");
                sb.append(str);
                sb.append(" by your slf4j binding is not compatible with ");
                sb.append(Arrays.asList(f29984e).toString());
                C13474h.m41506a(sb.toString());
                C13474h.m41506a("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
            }
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            C13474h.m41507a("Unexpected problem occured during version sanity check", th);
        }
    }

    /* renamed from: b */
    private static void m41424b() {
        C13474h.m41506a("The following set of substitute loggers may have been accessed");
        C13474h.m41506a("during the initialization phase. Logging calls during this");
        C13474h.m41506a("phase were not honored. However, subsequent logging calls to these");
        C13474h.m41506a("loggers will work as normally expected.");
        C13474h.m41506a("See also http://www.slf4j.org/codes.html#substituteLogger");
    }

    /* renamed from: b */
    private static void m41425b(Set<URL> set) {
        if (set != null && m41423a(set)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Actual binding is of type [");
            sb.append(StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr());
            sb.append("]");
            C13474h.m41506a(sb.toString());
        }
    }

    /* renamed from: c */
    private static void m41428c(Set<URL> set) {
        if (m41423a(set)) {
            C13474h.m41506a("Class path contains multiple SLF4J bindings.");
            for (URL url : set) {
                StringBuilder sb = new StringBuilder();
                sb.append("Found binding in [");
                sb.append(url);
                sb.append("]");
                C13474h.m41506a(sb.toString());
            }
            C13474h.m41506a("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    /* renamed from: a */
    static void m41419a(Throwable th) {
        f29980a = 2;
        C13474h.m41507a("Failed to instantiate SLF4J LoggerFactory", th);
    }

    /* renamed from: a */
    private static void m41421a(C13466d dVar, int i) {
        if (dVar.mo34735a().mo34752b()) {
            m41418a(i);
        } else if (!dVar.mo34735a().mo34753c()) {
            m41424b();
        }
    }

    /* renamed from: a */
    private static void m41420a(C13466d dVar) {
        if (dVar != null) {
            C13472f a = dVar.mo34735a();
            String name = a.getName();
            if (!a.mo34754d()) {
                if (!a.mo34753c()) {
                    if (a.mo34752b()) {
                        a.mo34751a((C13465c) dVar);
                    } else {
                        C13474h.m41506a(name);
                    }
                }
                return;
            }
            throw new IllegalStateException("Delegate logger cannot be null at this state.");
        }
    }

    /* renamed from: a */
    private static void m41418a(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("A number (");
        sb.append(i);
        sb.append(") of logging calls during the initialization phase have been intercepted and are");
        C13474h.m41506a(sb.toString());
        C13474h.m41506a("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        C13474h.m41506a("See also http://www.slf4j.org/codes.html#replay");
    }

    /* renamed from: a */
    private static boolean m41423a(Set<URL> set) {
        return set.size() > 1;
    }

    /* renamed from: a */
    public static C13459b m41416a(String str) {
        return m41430e().mo34719a(str);
    }

    /* renamed from: a */
    public static C13459b m41415a(Class<?> cls) {
        C13459b a = m41416a(cls.getName());
        if (f29983d) {
            Class a2 = C13474h.m41505a();
            if (a2 != null && m41422a(cls, a2)) {
                C13474h.m41506a(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", new Object[]{a.getName(), a2.getName()}));
                C13474h.m41506a("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return a;
    }

    /* renamed from: a */
    private static boolean m41422a(Class<?> cls, Class<?> cls2) {
        return !cls2.isAssignableFrom(cls);
    }
}
