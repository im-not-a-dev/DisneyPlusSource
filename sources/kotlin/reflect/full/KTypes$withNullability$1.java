package kotlin.reflect.full;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.KTypeImpl;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KTypes.kt */
final class KTypes$withNullability$1 extends C12881k implements Function0<Type> {
    final /* synthetic */ KType $this_withNullability;

    KTypes$withNullability$1(KType kType) {
        this.$this_withNullability = kType;
        super(0);
    }

    public final Type invoke() {
        return ((KTypeImpl) this.$this_withNullability).getJavaType$kotlin_reflection();
    }
}
