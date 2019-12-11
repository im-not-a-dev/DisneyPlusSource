package kotlin.reflect.jvm.internal.impl.types;

public class TypeProjectionImpl extends TypeProjectionBase {
    private final Variance projection;
    private final KotlinType type;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 3 || i == 4) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        if (i == 1 || i == 2) {
            objArr[0] = "type";
        } else if (i == 3 || i == 4) {
            objArr[0] = str2;
        } else {
            objArr[0] = "projection";
        }
        if (i == 3) {
            objArr[1] = "getProjectionKind";
        } else if (i != 4) {
            objArr[1] = str2;
        } else {
            objArr[1] = "getType";
        }
        if (!(i == 3 || i == 4)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 3 || i == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public TypeProjectionImpl(Variance variance, KotlinType kotlinType) {
        if (variance == null) {
            $$$reportNull$$$0(0);
        }
        if (kotlinType == null) {
            $$$reportNull$$$0(1);
        }
        this.projection = variance;
        this.type = kotlinType;
    }

    public Variance getProjectionKind() {
        Variance variance = this.projection;
        if (variance == null) {
            $$$reportNull$$$0(3);
        }
        return variance;
    }

    public KotlinType getType() {
        KotlinType kotlinType = this.type;
        if (kotlinType == null) {
            $$$reportNull$$$0(4);
        }
        return kotlinType;
    }

    public boolean isStarProjection() {
        return false;
    }

    public TypeProjectionImpl(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(2);
        }
        this(Variance.INVARIANT, kotlinType);
    }
}
