package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* renamed from: kotlin.jvm.internal.j */
/* compiled from: Intrinsics */
public class Intrinsics {
    private Intrinsics() {
    }

    /* renamed from: a */
    public static int compare(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: a */
    public static void throwNpe() {
        KotlinNullPointerException fVar = new KotlinNullPointerException();
        sanitizeStackTrace((T) fVar);
        throw fVar;
    }

    /* renamed from: b */
    public static void throwUninitializedProperty(String str) {
        UninitializedPropertyAccessException uVar = new UninitializedPropertyAccessException(str);
        sanitizeStackTrace((T) uVar);
        throw uVar;
    }

    /* renamed from: c */
    public static void throwUninitializedPropertyAccessException(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("lateinit property ");
        sb.append(str);
        sb.append(" has not been initialized");
        throwUninitializedProperty(sb.toString());
        throw null;
    }

    /* renamed from: a */
    public static void checkReturnedValueIsNotNull(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" must not be null");
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            sanitizeStackTrace((T) illegalStateException);
            throw illegalStateException;
        }
    }

    /* renamed from: b */
    public static void throwUndefinedForReified() {
        throwUndefinedForReified("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* renamed from: a */
    public static boolean areEqual(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public static void throwUndefinedForReified(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* renamed from: a */
    public static void reifiedOperationMarker(int i, String str) {
        throwUndefinedForReified();
        throw null;
    }

    /* renamed from: a */
    private static <T extends Throwable> T sanitizeStackTrace(T t) {
        sanitizeStackTrace(t, Intrinsics.class.getName());
        return t;
    }

    /* renamed from: a */
    static <T extends Throwable> T sanitizeStackTrace(T t, String str) {
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
