package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "Lkotlin/reflect/jvm/internal/impl/descriptors/ValueParameterDescriptor;", "kotlin.jvm.PlatformType", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: ReflectionObjectRenderer.kt */
final class ReflectionObjectRenderer$renderLambda$1$1 extends C12881k implements Function1<ValueParameterDescriptor, String> {
    public static final ReflectionObjectRenderer$renderLambda$1$1 INSTANCE = new ReflectionObjectRenderer$renderLambda$1$1();

    ReflectionObjectRenderer$renderLambda$1$1() {
        super(1);
    }

    public final String invoke(ValueParameterDescriptor valueParameterDescriptor) {
        ReflectionObjectRenderer reflectionObjectRenderer = ReflectionObjectRenderer.INSTANCE;
        Intrinsics.checkReturnedValueIsNotNull((Object) valueParameterDescriptor, "it");
        KotlinType type = valueParameterDescriptor.getType();
        Intrinsics.checkReturnedValueIsNotNull((Object) type, "it.type");
        return reflectionObjectRenderer.renderType(type);
    }
}
