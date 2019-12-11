package p163g.p449j.p450a.p451a.p467f;

import com.google.android.gms.common.internal.C9908u;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: g.j.a.a.f.c0 */
final class C11429c0<TResult> extends C11435h<TResult> {

    /* renamed from: a */
    private final Object f26765a = new Object();

    /* renamed from: b */
    private final C11425a0<TResult> f26766b = new C11425a0<>();

    /* renamed from: c */
    private boolean f26767c;

    /* renamed from: d */
    private volatile boolean f26768d;

    /* renamed from: e */
    private TResult f26769e;

    /* renamed from: f */
    private Exception f26770f;

    C11429c0() {
    }

    /* renamed from: g */
    private final void m36909g() {
        C9908u.m30865b(this.f26767c, "Task is not yet complete");
    }

    /* renamed from: h */
    private final void m36910h() {
        C9908u.m30865b(!this.f26767c, "Task is already complete");
    }

    /* renamed from: i */
    private final void m36911i() {
        if (this.f26768d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: j */
    private final void m36912j() {
        synchronized (this.f26765a) {
            if (this.f26767c) {
                this.f26766b.mo29244a((C11435h<TResult>) this);
            }
        }
    }

    /* renamed from: a */
    public final <X extends Throwable> TResult mo29259a(Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f26765a) {
            m36909g();
            m36911i();
            if (cls.isInstance(this.f26770f)) {
                throw ((Throwable) cls.cast(this.f26770f));
            } else if (this.f26770f == null) {
                tresult = this.f26769e;
            } else {
                throw new C11433f(this.f26770f);
            }
        }
        return tresult;
    }

    /* renamed from: b */
    public final TResult mo29263b() {
        TResult tresult;
        synchronized (this.f26765a) {
            m36909g();
            m36911i();
            if (this.f26770f == null) {
                tresult = this.f26769e;
            } else {
                throw new C11433f(this.f26770f);
            }
        }
        return tresult;
    }

    /* renamed from: c */
    public final boolean mo29266c() {
        return this.f26768d;
    }

    /* renamed from: d */
    public final boolean mo29267d() {
        boolean z;
        synchronized (this.f26765a) {
            z = this.f26767c;
        }
        return z;
    }

    /* renamed from: e */
    public final boolean mo29268e() {
        boolean z;
        synchronized (this.f26765a) {
            z = this.f26767c && !this.f26768d && this.f26770f == null;
        }
        return z;
    }

    /* renamed from: f */
    public final boolean mo29269f() {
        synchronized (this.f26765a) {
            if (this.f26767c) {
                return false;
            }
            this.f26767c = true;
            this.f26768d = true;
            this.f26766b.mo29244a((C11435h<TResult>) this);
            return true;
        }
    }

    /* renamed from: b */
    public final <TContinuationResult> C11435h<TContinuationResult> mo29262b(Executor executor, C11424a<TResult, C11435h<TContinuationResult>> aVar) {
        C11429c0 c0Var = new C11429c0();
        this.f26766b.mo29245a((C11456z<TResult>) new C11444n<TResult>(executor, aVar, c0Var));
        m36912j();
        return c0Var;
    }

    /* renamed from: a */
    public final Exception mo29258a() {
        Exception exc;
        synchronized (this.f26765a) {
            exc = this.f26770f;
        }
        return exc;
    }

    /* renamed from: b */
    public final boolean mo29265b(TResult tresult) {
        synchronized (this.f26765a) {
            if (this.f26767c) {
                return false;
            }
            this.f26767c = true;
            this.f26769e = tresult;
            this.f26766b.mo29244a((C11435h<TResult>) this);
            return true;
        }
    }

    /* renamed from: a */
    public final C11435h<TResult> mo29251a(C11432e<? super TResult> eVar) {
        mo29256a(C11437j.f26774a, eVar);
        return this;
    }

    /* renamed from: a */
    public final C11435h<TResult> mo29256a(Executor executor, C11432e<? super TResult> eVar) {
        this.f26766b.mo29245a((C11456z<TResult>) new C11452v<TResult>(executor, eVar));
        m36912j();
        return this;
    }

    /* renamed from: a */
    public final C11435h<TResult> mo29250a(C11430d dVar) {
        mo29255a(C11437j.f26774a, dVar);
        return this;
    }

    /* renamed from: a */
    public final C11435h<TResult> mo29255a(Executor executor, C11430d dVar) {
        this.f26766b.mo29245a((C11456z<TResult>) new C11450t<TResult>(executor, dVar));
        m36912j();
        return this;
    }

    /* renamed from: a */
    public final C11435h<TResult> mo29249a(C11428c<TResult> cVar) {
        mo29254a(C11437j.f26774a, cVar);
        return this;
    }

    /* renamed from: b */
    public final boolean mo29264b(Exception exc) {
        C9908u.m30854a(exc, (Object) "Exception must not be null");
        synchronized (this.f26765a) {
            if (this.f26767c) {
                return false;
            }
            this.f26767c = true;
            this.f26770f = exc;
            this.f26766b.mo29244a((C11435h<TResult>) this);
            return true;
        }
    }

    /* renamed from: a */
    public final C11435h<TResult> mo29254a(Executor executor, C11428c<TResult> cVar) {
        this.f26766b.mo29245a((C11456z<TResult>) new C11448r<TResult>(executor, cVar));
        m36912j();
        return this;
    }

    /* renamed from: a */
    public final <TContinuationResult> C11435h<TContinuationResult> mo29248a(C11424a<TResult, TContinuationResult> aVar) {
        return mo29252a(C11437j.f26774a, aVar);
    }

    /* renamed from: a */
    public final <TContinuationResult> C11435h<TContinuationResult> mo29252a(Executor executor, C11424a<TResult, TContinuationResult> aVar) {
        C11429c0 c0Var = new C11429c0();
        this.f26766b.mo29245a((C11456z<TResult>) new C11442l<TResult>(executor, aVar, c0Var));
        m36912j();
        return c0Var;
    }

    /* renamed from: a */
    public final C11435h<TResult> mo29253a(Executor executor, C11426b bVar) {
        this.f26766b.mo29245a((C11456z<TResult>) new C11446p<TResult>(executor, bVar));
        m36912j();
        return this;
    }

    /* renamed from: a */
    public final <TContinuationResult> C11435h<TContinuationResult> mo29257a(Executor executor, C11434g<TResult, TContinuationResult> gVar) {
        C11429c0 c0Var = new C11429c0();
        this.f26766b.mo29245a((C11456z<TResult>) new C11454x<TResult>(executor, gVar, c0Var));
        m36912j();
        return c0Var;
    }

    /* renamed from: a */
    public final void mo29261a(TResult tresult) {
        synchronized (this.f26765a) {
            m36910h();
            this.f26767c = true;
            this.f26769e = tresult;
        }
        this.f26766b.mo29244a((C11435h<TResult>) this);
    }

    /* renamed from: a */
    public final void mo29260a(Exception exc) {
        C9908u.m30854a(exc, (Object) "Exception must not be null");
        synchronized (this.f26765a) {
            m36910h();
            this.f26767c = true;
            this.f26770f = exc;
        }
        this.f26766b.mo29244a((C11435h<TResult>) this);
    }
}
