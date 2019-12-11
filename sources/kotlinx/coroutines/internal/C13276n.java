package kotlinx.coroutines.internal;

import kotlin.p573a0.C12683c;
import kotlin.p573a0.C12688f;
import kotlin.p573a0.p575i.p576a.C12705e;
import kotlinx.coroutines.C13210a;
import kotlinx.coroutines.C13213a2;
import kotlinx.coroutines.C13389r;

/* renamed from: kotlinx.coroutines.internal.n */
/* compiled from: Scopes.kt */
public class C13276n<T> extends C13210a<T> implements C12705e {

    /* renamed from: W */
    public final C12683c<T> f29710W;

    public C13276n(C12688f fVar, C12683c<? super T> cVar) {
        super(fVar, true);
        this.f29710W = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo34446a(Object obj, int i) {
        if (obj instanceof C13389r) {
            Throwable th = ((C13389r) obj).f29880a;
            if (i != 4) {
                th = C13278p.m40811a(th, this.f29710W);
            }
            C13213a2.m40642a(this.f29710W, th, i);
            return;
        }
        C13213a2.m40644b(this.f29710W, obj, i);
    }

    /* renamed from: f */
    public final C12705e mo31047f() {
        return (C12705e) this.f29710W;
    }

    /* renamed from: g */
    public final StackTraceElement mo31048g() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo34447n() {
        return true;
    }

    /* renamed from: r */
    public int mo34337r() {
        return 2;
    }
}
