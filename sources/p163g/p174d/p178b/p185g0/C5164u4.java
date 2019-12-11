package p163g.p174d.p178b.p185g0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.functions.Consumer;

/* renamed from: g.d.b.g0.u4 */
/* compiled from: PipViewDelegate.kt */
final class C5164u4 implements Consumer {

    /* renamed from: c */
    private final /* synthetic */ Function1 f12481c;

    C5164u4(Function1 function1) {
        this.f12481c = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        Intrinsics.checkReturnedValueIsNotNull(this.f12481c.invoke(obj), "invoke(...)");
    }
}
