package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.KMutableProperty0Impl.Setter;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, mo31007d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KMutableProperty0Impl$Setter;", "R", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KProperty0Impl.kt */
final class KMutableProperty0Impl$_setter$1 extends C12881k implements Function0<Setter<R>> {
    final /* synthetic */ KMutableProperty0Impl this$0;

    KMutableProperty0Impl$_setter$1(KMutableProperty0Impl kMutableProperty0Impl) {
        this.this$0 = kMutableProperty0Impl;
        super(0);
    }

    public final Setter<R> invoke() {
        return new Setter<>(this.this$0);
    }
}
