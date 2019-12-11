package kotlinx.coroutines;

import kotlin.C13145v;
import kotlin.jvm.functions.Function1;

/* renamed from: kotlinx.coroutines.j1 */
/* compiled from: JobSupport.kt */
final class C13293j1 extends C13388q1<C13324k1> {

    /* renamed from: X */
    private final Function1<Throwable, C13145v> f29732X;

    public C13293j1(C13324k1 k1Var, Function1<? super Throwable, C13145v> function1) {
        super(k1Var);
        this.f29732X = function1;
    }

    /* renamed from: b */
    public void mo34401b(Throwable th) {
        this.f29732X.invoke(th);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo34401b((Throwable) obj);
        return C13145v.f29587a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvokeOnCompletion[");
        sb.append(C13323k0.m40937a((Object) this));
        sb.append('@');
        sb.append(C13323k0.m40939b(this));
        sb.append(']');
        return sb.toString();
    }
}
