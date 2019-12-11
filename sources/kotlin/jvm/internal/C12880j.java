package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.C12738f;
import kotlin.C13144u;

/* renamed from: kotlin.jvm.internal.j */
/* compiled from: Intrinsics */
public class C12880j {
    private C12880j() {
    }

    /* renamed from: a */
    public static int m40217a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: a */
    public static void m40220a() {
        C12738f fVar = new C12738f();
        m40218a((T) fVar);
        throw fVar;
    }

    /* renamed from: b */
    public static void m40226b(String str) {
        C13144u uVar = new C13144u(str);
        m40218a((T) uVar);
        throw uVar;
    }

    /* renamed from: c */
    public static void m40227c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("lateinit property ");
        sb.append(str);
        sb.append(" has not been initialized");
        m40226b(sb.toString());
        throw null;
    }

    /* renamed from: a */
    public static void m40222a(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" must not be null");
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            m40218a((T) illegalStateException);
            throw illegalStateException;
        }
    }

    /* renamed from: b */
    public static void m40225b() {
        m40223a("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
        throw null;
    }

    /* renamed from: a */
    public static boolean m40224a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public static void m40223a(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* renamed from: a */
    public static void m40221a(int i, String str) {
        m40225b();
        throw null;
    }

    /* renamed from: a */
    private static <T extends Throwable> T m40218a(T t) {
        m40219a(t, C12880j.class.getName());
        return t;
    }

    /* renamed from: a */
    static <T extends Throwable> T m40219a(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }
}
