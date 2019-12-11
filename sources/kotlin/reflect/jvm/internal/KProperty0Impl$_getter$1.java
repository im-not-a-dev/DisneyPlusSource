package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.KProperty0Impl.Getter;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, mo31007d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KProperty0Impl$Getter;", "R", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KProperty0Impl.kt */
final class KProperty0Impl$_getter$1 extends C12881k implements Function0<Getter<? extends R>> {
    final /* synthetic */ KProperty0Impl this$0;

    KProperty0Impl$_getter$1(KProperty0Impl kProperty0Impl) {
        this.this$0 = kProperty0Impl;
        super(0);
    }

    public final Getter<R> invoke() {
        return new Getter<>(this.this$0);
    }
}
