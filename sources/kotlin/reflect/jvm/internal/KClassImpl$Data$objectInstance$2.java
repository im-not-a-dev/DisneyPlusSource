package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import kotlin.TypeCastException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.KClassImpl.Data;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo31007d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KClassImpl.kt */
final class KClassImpl$Data$objectInstance$2 extends C12881k implements Function0<T> {
    final /* synthetic */ Data this$0;

    KClassImpl$Data$objectInstance$2(Data data) {
        this.this$0 = data;
        super(0);
    }

    public final T invoke() {
        Field field;
        ClassDescriptor descriptor = this.this$0.getDescriptor();
        if (descriptor.getKind() != ClassKind.OBJECT) {
            return null;
        }
        if (!descriptor.isCompanionObject() || CompanionObjectMapping.INSTANCE.isMappedIntrinsicCompanionObject(descriptor)) {
            field = KClassImpl.this.getJClass().getDeclaredField("INSTANCE");
        } else {
            field = KClassImpl.this.getJClass().getEnclosingClass().getDeclaredField(descriptor.getName().asString());
        }
        T t = field.get(null);
        if (t != null) {
            return t;
        }
        throw new TypeCastException("null cannot be cast to non-null type T");
    }
}
