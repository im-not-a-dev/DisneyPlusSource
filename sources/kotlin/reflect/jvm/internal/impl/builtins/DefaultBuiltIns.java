package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* compiled from: DefaultBuiltIns.kt */
public final class DefaultBuiltIns extends KotlinBuiltIns {
    public static final Companion Companion = new Companion(null);
    private static final DefaultBuiltIns Instance = new DefaultBuiltIns(false, 1, null);

    /* compiled from: DefaultBuiltIns.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DefaultBuiltIns() {
        this(false, 1, null);
    }

    public DefaultBuiltIns(boolean z) {
        super(new LockBasedStorageManager("DefaultBuiltIns"));
        if (z) {
            createBuiltInsModule(false);
        }
    }

    public static final DefaultBuiltIns getInstance() {
        return Instance;
    }

    public /* synthetic */ DefaultBuiltIns(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            z = true;
        }
        this(z);
    }
}
