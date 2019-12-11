package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.KPropertyImpl.Setter;
import kotlin.reflect.jvm.internal.calls.Caller;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, mo31007d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/calls/Caller;", "R", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KPropertyImpl.kt */
final class KPropertyImpl$Setter$caller$2 extends C12881k implements Function0<Caller<?>> {
    final /* synthetic */ Setter this$0;

    KPropertyImpl$Setter$caller$2(Setter setter) {
        this.this$0 = setter;
        super(0);
    }

    public final Caller<?> invoke() {
        return KPropertyImplKt.computeCallerForAccessor(this.this$0, false);
    }
}
