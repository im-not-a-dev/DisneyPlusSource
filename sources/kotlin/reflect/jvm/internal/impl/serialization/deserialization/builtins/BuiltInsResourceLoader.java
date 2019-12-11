package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.io.InputStream;

/* compiled from: BuiltInsResourceLoader.kt */
public final class BuiltInsResourceLoader {
    public final InputStream loadResource(String str) {
        ClassLoader classLoader = BuiltInsResourceLoader.class.getClassLoader();
        if (classLoader != null) {
            InputStream resourceAsStream = classLoader.getResourceAsStream(str);
            if (resourceAsStream != null) {
                return resourceAsStream;
            }
        }
        return ClassLoader.getSystemResourceAsStream(str);
    }
}
