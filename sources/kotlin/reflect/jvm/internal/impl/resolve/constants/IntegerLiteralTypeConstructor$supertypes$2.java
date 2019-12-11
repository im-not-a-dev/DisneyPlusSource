package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: IntegerLiteralTypeConstructor.kt */
final class IntegerLiteralTypeConstructor$supertypes$2 extends C12881k implements Function0<List<SimpleType>> {
    final /* synthetic */ IntegerLiteralTypeConstructor this$0;

    IntegerLiteralTypeConstructor$supertypes$2(IntegerLiteralTypeConstructor integerLiteralTypeConstructor) {
        this.this$0 = integerLiteralTypeConstructor;
        super(0);
    }

    public final List<SimpleType> invoke() {
        ClassDescriptor comparable = this.this$0.getBuiltIns().getComparable();
        Intrinsics.checkReturnedValueIsNotNull((Object) comparable, "builtIns.comparable");
        SimpleType defaultType = comparable.getDefaultType();
        Intrinsics.checkReturnedValueIsNotNull((Object) defaultType, "builtIns.comparable.defaultType");
        List<SimpleType> e = C13185o.m40523e(TypeSubstitutionKt.replace$default(defaultType, C13183n.m40498a(new TypeProjectionImpl(Variance.IN_VARIANCE, this.this$0.type)), (Annotations) null, 2, (Object) null));
        if (!this.this$0.isContainsOnlyUnsignedTypes()) {
            e.add(this.this$0.getBuiltIns().getNumberType());
        }
        return e;
    }
}
