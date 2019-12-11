package p163g.p174d.p178b.p185g0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.functions.Consumer;

/* renamed from: g.d.b.g0.i4 */
/* compiled from: HideViewsWhileSeekingDelegate.kt */
final class C5031i4 implements Consumer {

    /* renamed from: c */
    private final /* synthetic */ Function1 f12305c;

    C5031i4(Function1 function1) {
        this.f12305c = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        Intrinsics.checkReturnedValueIsNotNull(this.f12305c.invoke(obj), "invoke(...)");
    }
}
