package kotlin.reflect.jvm.internal.components;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, mo31007d2 = {"tryLoadClass", "Ljava/lang/Class;", "Ljava/lang/ClassLoader;", "fqName", "", "descriptors.runtime"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: ReflectJavaClassFinder.kt */
public final class ReflectJavaClassFinderKt {
    public static final Class<?> tryLoadClass(ClassLoader classLoader, String str) {
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
