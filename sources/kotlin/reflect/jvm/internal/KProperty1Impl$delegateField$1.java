package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003 \u0001H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Ljava/lang/reflect/Field;", "T", "R", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KProperty1Impl.kt */
final class KProperty1Impl$delegateField$1 extends C12881k implements Function0<Field> {
    final /* synthetic */ KProperty1Impl this$0;

    KProperty1Impl$delegateField$1(KProperty1Impl kProperty1Impl) {
        this.this$0 = kProperty1Impl;
        super(0);
    }

    public final Field invoke() {
        return this.this$0.computeDelegateField();
    }
}
