package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.C12898l;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;

/* compiled from: ClassicTypeSystemContext.kt */
public final class ClassicTypeSystemContextKt {

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Variance.values().length];

        static {
            $EnumSwitchMapping$0[Variance.INVARIANT.ordinal()] = 1;
            $EnumSwitchMapping$0[Variance.IN_VARIANCE.ordinal()] = 2;
            $EnumSwitchMapping$0[Variance.OUT_VARIANCE.ordinal()] = 3;
        }
    }

    public static final TypeVariance convertVariance(Variance variance) {
        int i = WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
        if (i == 1) {
            return TypeVariance.INV;
        }
        if (i == 2) {
            return TypeVariance.IN;
        }
        if (i == 3) {
            return TypeVariance.OUT;
        }
        throw new C12898l();
    }
}
