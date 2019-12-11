package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.C13145v;
import kotlin.jvm.functions.Function1;

/* renamed from: kotlinx.coroutines.i1 */
/* compiled from: JobSupport.kt */
final class C13251i1 extends C13344m1<C13324k1> {

    /* renamed from: Y */
    private static final AtomicIntegerFieldUpdater f29675Y = AtomicIntegerFieldUpdater.newUpdater(C13251i1.class, "_invoked");

    /* renamed from: X */
    private final Function1<Throwable, C13145v> f29676X;
    private volatile int _invoked = 0;

    public C13251i1(C13324k1 k1Var, Function1<? super Throwable, C13145v> function1) {
        super(k1Var);
        this.f29676X = function1;
    }

    /* renamed from: b */
    public void mo34401b(Throwable th) {
        if (f29675Y.compareAndSet(this, 0, 1)) {
            this.f29676X.invoke(th);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo34401b((Throwable) obj);
        return C13145v.f29587a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvokeOnCancelling[");
        sb.append(C13323k0.m40937a((Object) this));
        sb.append('@');
        sb.append(C13323k0.m40939b(this));
        sb.append(']');
        return sb.toString();
    }
}
