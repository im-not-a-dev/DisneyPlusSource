package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.KProperty1Impl.Getter;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003 \u0001H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KProperty1Impl$Getter;", "T", "R", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KProperty1Impl.kt */
final class KProperty1Impl$_getter$1 extends C12881k implements Function0<Getter<T, ? extends R>> {
    final /* synthetic */ KProperty1Impl this$0;

    KProperty1Impl$_getter$1(KProperty1Impl kProperty1Impl) {
        this.this$0 = kProperty1Impl;
        super(0);
    }

    public final Getter<T, R> invoke() {
        return new Getter<>(this.this$0);
    }
}
