package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter.All;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* compiled from: JvmBuiltInsSettings.kt */
final class FallbackBuiltIns extends KotlinBuiltIns {
    public static final Companion Companion = new Companion(null);
    /* access modifiers changed from: private */
    public static final KotlinBuiltIns Instance = new FallbackBuiltIns();

    /* compiled from: JvmBuiltInsSettings.kt */
    public static final class Companion {
        private Companion() {
        }

        public final KotlinBuiltIns getInstance() {
            return FallbackBuiltIns.Instance;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private FallbackBuiltIns() {
        super(new LockBasedStorageManager("FallbackBuiltIns"));
        createBuiltInsModule(true);
    }

    /* access modifiers changed from: protected */
    public All getPlatformDependentDeclarationFilter() {
        return All.INSTANCE;
    }
}
