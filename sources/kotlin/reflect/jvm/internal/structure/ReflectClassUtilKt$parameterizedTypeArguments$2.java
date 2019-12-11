package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.p587i0.C12775h;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lkotlin/sequences/Sequence;", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "it", "Ljava/lang/reflect/ParameterizedType;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: reflectClassUtil.kt */
final class ReflectClassUtilKt$parameterizedTypeArguments$2 extends C12881k implements Function1<ParameterizedType, C12775h<? extends Type>> {
    public static final ReflectClassUtilKt$parameterizedTypeArguments$2 INSTANCE = new ReflectClassUtilKt$parameterizedTypeArguments$2();

    ReflectClassUtilKt$parameterizedTypeArguments$2() {
        super(1);
    }

    public final C12775h<Type> invoke(ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Intrinsics.checkReturnedValueIsNotNull((Object) actualTypeArguments, "it.actualTypeArguments");
        return C13174k.m40401c((Object[]) actualTypeArguments);
    }
}
