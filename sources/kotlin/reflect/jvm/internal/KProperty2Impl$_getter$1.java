package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.KProperty2Impl.Getter;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0006\b\u0002\u0010\u0004 \u0001H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KProperty2Impl$Getter;", "D", "E", "R", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KProperty2Impl.kt */
final class KProperty2Impl$_getter$1 extends C12881k implements Function0<Getter<D, E, ? extends R>> {
    final /* synthetic */ KProperty2Impl this$0;

    KProperty2Impl$_getter$1(KProperty2Impl kProperty2Impl) {
        this.this$0 = kProperty2Impl;
        super(0);
    }

    public final Getter<D, E, R> invoke() {
        return new Getter<>(this.this$0);
    }
}
