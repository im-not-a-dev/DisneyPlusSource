package p602m.p609c.p611g;

import java.io.PrintStream;

/* renamed from: m.c.g.h */
/* compiled from: Util */
public final class C13474h {

    /* renamed from: a */
    private static C13476b f30009a = null;

    /* renamed from: b */
    private static boolean f30010b = false;

    /* renamed from: m.c.g.h$b */
    /* compiled from: Util */
    private static final class C13476b extends SecurityManager {
        private C13476b() {
        }

        /* access modifiers changed from: protected */
        public Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    private C13474h() {
    }

    /* renamed from: a */
    public static Class<?> m41505a() {
        C13476b b = m41508b();
        if (b == null) {
            return null;
        }
        Class<?>[] classContext = b.getClassContext();
        String name = C13474h.class.getName();
        int i = 0;
        while (i < classContext.length && !name.equals(classContext[i].getName())) {
            i++;
        }
        if (i < classContext.length) {
            int i2 = i + 2;
            if (i2 < classContext.length) {
                return classContext[i2];
            }
        }
        throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
    }

    /* renamed from: b */
    public static boolean m41509b(String str) {
        String c = m41510c(str);
        if (c == null) {
            return false;
        }
        return c.equalsIgnoreCase("true");
    }

    /* renamed from: c */
    public static String m41510c(String str) {
        if (str != null) {
            try {
                return System.getProperty(str);
            } catch (SecurityException unused) {
                return null;
            }
        } else {
            throw new IllegalArgumentException("null input");
        }
    }

    /* renamed from: b */
    private static C13476b m41508b() {
        C13476b bVar = f30009a;
        if (bVar != null) {
            return bVar;
        }
        if (f30010b) {
            return null;
        }
        f30009a = m41511c();
        f30010b = true;
        return f30009a;
    }

    /* renamed from: c */
    private static C13476b m41511c() {
        try {
            return new C13476b();
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static final void m41507a(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }

    /* renamed from: a */
    public static final void m41506a(String str) {
        PrintStream printStream = System.err;
        StringBuilder sb = new StringBuilder();
        sb.append("SLF4J: ");
        sb.append(str);
        printStream.println(sb.toString());
    }
}
