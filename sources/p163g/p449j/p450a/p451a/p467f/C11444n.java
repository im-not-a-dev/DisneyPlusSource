package p163g.p449j.p450a.p451a.p467f;

import java.util.concurrent.Executor;

/* renamed from: g.j.a.a.f.n */
final class C11444n<TResult, TContinuationResult> implements C11426b, C11430d, C11432e<TContinuationResult>, C11456z<TResult> {

    /* renamed from: a */
    private final Executor f26783a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C11424a<TResult, C11435h<TContinuationResult>> f26784b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C11429c0<TContinuationResult> f26785c;

    public C11444n(Executor executor, C11424a<TResult, C11435h<TContinuationResult>> aVar, C11429c0<TContinuationResult> c0Var) {
        this.f26783a = executor;
        this.f26784b = aVar;
        this.f26785c = c0Var;
    }

    /* renamed from: a */
    public final void mo29279a(C11435h<TResult> hVar) {
        this.f26783a.execute(new C11445o(this, hVar));
    }

    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f26785c.mo29261a(tcontinuationresult);
    }

    /* renamed from: a */
    public final void mo15690a(Exception exc) {
        this.f26785c.mo29260a(exc);
    }

    /* renamed from: a */
    public final void mo29246a() {
        this.f26785c.mo29269f();
    }
}
