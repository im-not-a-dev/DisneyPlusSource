package p520io.reactivex.p524d0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.functions.Consumer;

/* renamed from: io.reactivex.d0.f */
/* compiled from: subscribers.kt */
final class C11927f implements Consumer {

    /* renamed from: c */
    private final /* synthetic */ Function1 f27610c;

    C11927f(Function1 function1) {
        this.f27610c = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        Intrinsics.checkReturnedValueIsNotNull(this.f27610c.invoke(obj), "invoke(...)");
    }
}
