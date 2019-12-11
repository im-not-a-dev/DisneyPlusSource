package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.KClassifier;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"<anonymous>", "Lkotlin/reflect/KClassifier;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KTypeImpl.kt */
final class KTypeImpl$classifier$2 extends C12881k implements Function0<KClassifier> {
    final /* synthetic */ KTypeImpl this$0;

    KTypeImpl$classifier$2(KTypeImpl kTypeImpl) {
        this.this$0 = kTypeImpl;
        super(0);
    }

    public final KClassifier invoke() {
        KTypeImpl kTypeImpl = this.this$0;
        return kTypeImpl.convert(kTypeImpl.getType());
    }
}
