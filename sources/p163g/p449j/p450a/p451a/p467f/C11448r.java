package p163g.p449j.p450a.p451a.p467f;

import java.util.concurrent.Executor;

/* renamed from: g.j.a.a.f.r */
final class C11448r<TResult> implements C11456z<TResult> {

    /* renamed from: a */
    private final Executor f26792a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f26793b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C11428c<TResult> f26794c;

    public C11448r(Executor executor, C11428c<TResult> cVar) {
        this.f26792a = executor;
        this.f26794c = cVar;
    }

    /* renamed from: a */
    public final void mo29279a(C11435h<TResult> hVar) {
        synchronized (this.f26793b) {
            if (this.f26794c != null) {
                this.f26792a.execute(new C11449s(this, hVar));
            }
        }
    }
}
