package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* compiled from: typeQualifiers.kt */
public final class JavaTypeQualifiers {
    public static final Companion Companion = new Companion(null);
    /* access modifiers changed from: private */
    public static final JavaTypeQualifiers NONE;
    private final boolean isNotNullTypeParameter;
    private final boolean isNullabilityQualifierForWarning;
    private final MutabilityQualifier mutability;
    private final NullabilityQualifier nullability;

    /* compiled from: typeQualifiers.kt */
    public static final class Companion {
        private Companion() {
        }

        public final JavaTypeQualifiers getNONE() {
            return JavaTypeQualifiers.NONE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        JavaTypeQualifiers javaTypeQualifiers = new JavaTypeQualifiers(null, null, false, false, 8, null);
        NONE = javaTypeQualifiers;
    }

    public JavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2) {
        this.nullability = nullabilityQualifier;
        this.mutability = mutabilityQualifier;
        this.isNotNullTypeParameter = z;
        this.isNullabilityQualifierForWarning = z2;
    }

    public final MutabilityQualifier getMutability() {
        return this.mutability;
    }

    public final NullabilityQualifier getNullability() {
        return this.nullability;
    }

    public final boolean isNotNullTypeParameter() {
        return this.isNotNullTypeParameter;
    }

    public final boolean isNullabilityQualifierForWarning() {
        return this.isNullabilityQualifierForWarning;
    }

    public /* synthetic */ JavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 8) != 0) {
            z2 = false;
        }
        this(nullabilityQualifier, mutabilityQualifier, z, z2);
    }
}
