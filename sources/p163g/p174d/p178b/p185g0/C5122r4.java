package p163g.p174d.p178b.p185g0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.functions.Consumer;

/* renamed from: g.d.b.g0.r4 */
/* compiled from: PauseWhileSeekingDelegate.kt */
final class C5122r4 implements Consumer {

    /* renamed from: c */
    private final /* synthetic */ Function1 f12430c;

    C5122r4(Function1 function1) {
        this.f12430c = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        Intrinsics.checkReturnedValueIsNotNull(this.f12430c.invoke(obj), "invoke(...)");
    }
}
