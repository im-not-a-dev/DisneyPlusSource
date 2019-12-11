package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;

/* compiled from: PackagePartProvider.kt */
public interface PackagePartProvider {

    /* compiled from: PackagePartProvider.kt */
    public static final class Empty implements PackagePartProvider {
        public static final Empty INSTANCE = new Empty();

        private Empty() {
        }

        public List<String> findPackageParts(String str) {
            return C13185o.m40513a();
        }
    }

    List<String> findPackageParts(String str);
}
