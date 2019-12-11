package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ServiceLoader;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;

/* compiled from: BuiltInsLoader.kt */
final class BuiltInsLoader$Companion$Instance$2 extends C12881k implements Function0<BuiltInsLoader> {
    public static final BuiltInsLoader$Companion$Instance$2 INSTANCE = new BuiltInsLoader$Companion$Instance$2();

    BuiltInsLoader$Companion$Instance$2() {
        super(0);
    }

    public final BuiltInsLoader invoke() {
        Class<BuiltInsLoader> cls = BuiltInsLoader.class;
        ServiceLoader load = ServiceLoader.load(cls, cls.getClassLoader());
        C12880j.m40222a((Object) load, "implementations");
        BuiltInsLoader builtInsLoader = (BuiltInsLoader) C13199w.m40590g((Iterable) load);
        if (builtInsLoader != null) {
            return builtInsLoader;
        }
        throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
    }
}
