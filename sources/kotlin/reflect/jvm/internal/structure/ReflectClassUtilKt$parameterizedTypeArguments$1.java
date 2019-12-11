package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo31007d2 = {"<anonymous>", "Ljava/lang/reflect/ParameterizedType;", "it", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: reflectClassUtil.kt */
final class ReflectClassUtilKt$parameterizedTypeArguments$1 extends C12881k implements Function1<ParameterizedType, ParameterizedType> {
    public static final ReflectClassUtilKt$parameterizedTypeArguments$1 INSTANCE = new ReflectClassUtilKt$parameterizedTypeArguments$1();

    ReflectClassUtilKt$parameterizedTypeArguments$1() {
        super(1);
    }

    public final ParameterizedType invoke(ParameterizedType parameterizedType) {
        Type ownerType = parameterizedType.getOwnerType();
        if (!(ownerType instanceof ParameterizedType)) {
            ownerType = null;
        }
        return (ParameterizedType) ownerType;
    }
}
