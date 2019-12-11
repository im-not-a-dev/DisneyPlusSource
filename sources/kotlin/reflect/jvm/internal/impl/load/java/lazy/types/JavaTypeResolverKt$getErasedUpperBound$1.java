package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* compiled from: JavaTypeResolver.kt */
final class JavaTypeResolverKt$getErasedUpperBound$1 extends C12881k implements Function0<SimpleType> {
    final /* synthetic */ TypeParameterDescriptor $this_getErasedUpperBound;

    JavaTypeResolverKt$getErasedUpperBound$1(TypeParameterDescriptor typeParameterDescriptor) {
        this.$this_getErasedUpperBound = typeParameterDescriptor;
        super(0);
    }

    public final SimpleType invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append("Can't compute erased upper bound of type parameter `");
        sb.append(this.$this_getErasedUpperBound);
        sb.append('`');
        SimpleType createErrorType = ErrorUtils.createErrorType(sb.toString());
        Intrinsics.checkReturnedValueIsNotNull((Object) createErrorType, "ErrorUtils.createErrorTy… type parameter `$this`\")");
        return createErrorType;
    }
}
