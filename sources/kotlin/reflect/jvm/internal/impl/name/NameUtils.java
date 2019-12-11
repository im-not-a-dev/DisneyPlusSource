package kotlin.reflect.jvm.internal.impl.name;

import kotlin.p588j0.C12815k;

/* compiled from: NameUtils.kt */
public final class NameUtils {
    public static final NameUtils INSTANCE = new NameUtils();
    private static final C12815k SANITIZE_AS_JAVA_INVALID_CHARACTERS = new C12815k("[^\\p{L}\\p{Digit}]");

    private NameUtils() {
    }

    public static final String sanitizeAsJavaIdentifier(String str) {
        return SANITIZE_AS_JAVA_INVALID_CHARACTERS.mo31136a((CharSequence) str, "_");
    }
}
