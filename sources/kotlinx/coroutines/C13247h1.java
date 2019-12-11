package kotlinx.coroutines;

import kotlin.C13145v;
import kotlin.jvm.functions.Function1;

/* renamed from: kotlinx.coroutines.h1 */
/* compiled from: CancellableContinuationImpl.kt */
final class C13247h1 extends C13236f {

    /* renamed from: c */
    private final Function1<Throwable, C13145v> f29670c;

    public C13247h1(Function1<? super Throwable, C13145v> function1) {
        this.f29670c = function1;
    }

    /* renamed from: a */
    public void mo34381a(Throwable th) {
        this.f29670c.invoke(th);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo34381a((Throwable) obj);
        return C13145v.f29587a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvokeOnCancel[");
        sb.append(C13323k0.m40937a((Object) this.f29670c));
        sb.append('@');
        sb.append(C13323k0.m40939b(this));
        sb.append(']');
        return sb.toString();
    }
}
