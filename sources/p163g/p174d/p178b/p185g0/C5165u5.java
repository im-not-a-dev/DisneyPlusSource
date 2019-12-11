package p163g.p174d.p178b.p185g0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.functions.Consumer;

/* renamed from: g.d.b.g0.u5 */
/* compiled from: WakeLockDelegate.kt */
final class C5165u5 implements Consumer {

    /* renamed from: c */
    private final /* synthetic */ Function1 f12482c;

    C5165u5(Function1 function1) {
        this.f12482c = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        Intrinsics.checkReturnedValueIsNotNull(this.f12482c.invoke(obj), "invoke(...)");
    }
}
