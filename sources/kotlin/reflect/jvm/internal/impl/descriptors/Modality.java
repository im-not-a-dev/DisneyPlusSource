package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: Modality.kt */
public enum Modality {
    FINAL,
    SEALED,
    OPEN,
    ABSTRACT;
    
    public static final Companion Companion = null;

    /* compiled from: Modality.kt */
    public static final class Companion {
        private Companion() {
        }

        public final Modality convertFromFlags(boolean z, boolean z2) {
            if (z) {
                return Modality.ABSTRACT;
            }
            if (z2) {
                return Modality.OPEN;
            }
            return Modality.FINAL;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }
}
