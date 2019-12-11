package kotlinx.coroutines;

import kotlin.C13145v;
import kotlin.jvm.functions.Function1;

/* renamed from: kotlinx.coroutines.u */
/* compiled from: CancellableContinuationImpl.kt */
final class C13401u {

    /* renamed from: a */
    public final Object f29899a;

    /* renamed from: b */
    public final Function1<Throwable, C13145v> f29900b;

    public C13401u(Object obj, Function1<? super Throwable, C13145v> function1) {
        this.f29899a = obj;
        this.f29900b = function1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CompletedWithCancellation[");
        sb.append(this.f29899a);
        sb.append(']');
        return sb.toString();
    }
}
