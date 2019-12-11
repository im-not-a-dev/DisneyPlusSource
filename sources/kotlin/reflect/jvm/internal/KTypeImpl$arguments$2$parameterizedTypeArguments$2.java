package kotlin.reflect.jvm.internal;

import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo31007d2 = {"<anonymous>", "", "Ljava/lang/reflect/Type;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KTypeImpl.kt */
final class KTypeImpl$arguments$2$parameterizedTypeArguments$2 extends C12881k implements Function0<List<? extends Type>> {
    final /* synthetic */ KTypeImpl$arguments$2 this$0;

    KTypeImpl$arguments$2$parameterizedTypeArguments$2(KTypeImpl$arguments$2 kTypeImpl$arguments$2) {
        this.this$0 = kTypeImpl$arguments$2;
        super(0);
    }

    public final List<Type> invoke() {
        return ReflectClassUtilKt.getParameterizedTypeArguments(this.this$0.this$0.getJavaType$kotlin_reflection());
    }
}
