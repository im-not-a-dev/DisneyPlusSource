package kotlinx.coroutines;

import kotlin.C13145v;
import kotlin.jvm.functions.Function2;
import kotlin.p573a0.C12683c;
import kotlin.p573a0.C12688f;
import kotlinx.coroutines.p593k2.C13327a;

/* renamed from: kotlinx.coroutines.t1 */
/* compiled from: Builders.common.kt */
final class C13400t1 extends C13220b2 {

    /* renamed from: W */
    private Function2<? super C13233e0, ? super C12683c<? super C13145v>, ? extends Object> f29898W;

    public C13400t1(C12688f fVar, Function2<? super C13233e0, ? super C12683c<? super C13145v>, ? extends Object> function2) {
        super(fVar, false);
        this.f29898W = function2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo34339t() {
        Function2<? super C13233e0, ? super C12683c<? super C13145v>, ? extends Object> function2 = this.f29898W;
        if (function2 != null) {
            this.f29898W = null;
            C13327a.m40952a(function2, this, this);
            return;
        }
        throw new IllegalStateException("Already started".toString());
    }
}
