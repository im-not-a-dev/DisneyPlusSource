package p163g.p449j.p450a.p451a.p467f;

import java.util.concurrent.Executor;

/* renamed from: g.j.a.a.f.x */
final class C11454x<TResult, TContinuationResult> implements C11426b, C11430d, C11432e<TContinuationResult>, C11456z<TResult> {

    /* renamed from: a */
    private final Executor f26807a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C11434g<TResult, TContinuationResult> f26808b;

    /* renamed from: c */
    private final C11429c0<TContinuationResult> f26809c;

    public C11454x(Executor executor, C11434g<TResult, TContinuationResult> gVar, C11429c0<TContinuationResult> c0Var) {
        this.f26807a = executor;
        this.f26808b = gVar;
        this.f26809c = c0Var;
    }

    /* renamed from: a */
    public final void mo29279a(C11435h<TResult> hVar) {
        this.f26807a.execute(new C11455y(this, hVar));
    }

    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f26809c.mo29261a(tcontinuationresult);
    }

    /* renamed from: a */
    public final void mo15690a(Exception exc) {
        this.f26809c.mo29260a(exc);
    }

    /* renamed from: a */
    public final void mo29246a() {
        this.f26809c.mo29269f();
    }
}
