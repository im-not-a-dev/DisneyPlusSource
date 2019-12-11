package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.AbstractNullabilityChecker;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.LowerIfFlexible;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* compiled from: NewKotlinTypeChecker.kt */
public final class NullabilityChecker {
    public static final NullabilityChecker INSTANCE = new NullabilityChecker();

    private NullabilityChecker() {
    }

    public final boolean isSubtypeOfAny(UnwrappedType unwrappedType) {
        return AbstractNullabilityChecker.INSTANCE.hasNotNullSupertype(SimpleClassicTypeSystemContext.INSTANCE.newBaseTypeCheckerContext(false), FlexibleTypesKt.lowerIfFlexible(unwrappedType), LowerIfFlexible.INSTANCE);
    }
}
