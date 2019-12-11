package p520io.reactivex.p531y.p536e.p541e;

import p520io.reactivex.C11968q;
import p520io.reactivex.C11969r;
import p520io.reactivex.C11969r.C11972c;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p534c.C12046i;
import p520io.reactivex.p531y.p534c.C12051n;
import p520io.reactivex.p531y.p535d.C12053b;
import p520io.reactivex.p531y.p543f.C12491c;
import p520io.reactivex.p531y.p544g.C12524q;

/* renamed from: io.reactivex.y.e.e.h0 */
/* compiled from: ObservableObserveOn */
public final class C12329h0<T> extends C12294a<T, T> {

    /* renamed from: U */
    final C11969r f28481U;

    /* renamed from: V */
    final boolean f28482V;

    /* renamed from: W */
    final int f28483W;

    /* renamed from: io.reactivex.y.e.e.h0$a */
    /* compiled from: ObservableObserveOn */
    static final class C12330a<T> extends C12053b<T> implements C11968q<T>, Runnable {

        /* renamed from: U */
        final C11972c f28484U;

        /* renamed from: V */
        final boolean f28485V;

        /* renamed from: W */
        final int f28486W;

        /* renamed from: X */
        C12051n<T> f28487X;

        /* renamed from: Y */
        Disposable f28488Y;

        /* renamed from: Z */
        Throwable f28489Z;

        /* renamed from: a0 */
        volatile boolean f28490a0;

        /* renamed from: b0 */
        volatile boolean f28491b0;

        /* renamed from: c */
        final C11968q<? super T> f28492c;

        /* renamed from: c0 */
        int f28493c0;

        /* renamed from: d0 */
        boolean f28494d0;

        C12330a(C11968q<? super T> qVar, C11972c cVar, boolean z, int i) {
            this.f28492c = qVar;
            this.f28484U = cVar;
            this.f28485V = z;
            this.f28486W = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30491a() {
            int i = 1;
            while (!this.f28491b0) {
                boolean z = this.f28490a0;
                Throwable th = this.f28489Z;
                if (this.f28485V || !z || th == null) {
                    this.f28492c.onNext(null);
                    if (z) {
                        this.f28491b0 = true;
                        Throwable th2 = this.f28489Z;
                        if (th2 != null) {
                            this.f28492c.onError(th2);
                        } else {
                            this.f28492c.onComplete();
                        }
                        this.f28484U.dispose();
                        return;
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    this.f28491b0 = true;
                    this.f28492c.onError(th);
                    this.f28484U.dispose();
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo30493b() {
            C12051n<T> nVar = this.f28487X;
            C11968q<? super T> qVar = this.f28492c;
            int i = 1;
            while (!mo30492a(this.f28490a0, nVar.isEmpty(), qVar)) {
                while (true) {
                    boolean z = this.f28490a0;
                    try {
                        Object poll = nVar.poll();
                        boolean z2 = poll == null;
                        if (!mo30492a(z, z2, qVar)) {
                            if (z2) {
                                i = addAndGet(-i);
                                if (i == 0) {
                                    return;
                                }
                            } else {
                                qVar.onNext(poll);
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C12003b.m38614b(th);
                        this.f28491b0 = true;
                        this.f28488Y.dispose();
                        nVar.clear();
                        qVar.onError(th);
                        this.f28484U.dispose();
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo30494c() {
            if (getAndIncrement() == 0) {
                this.f28484U.mo30296a((Runnable) this);
            }
        }

        public void clear() {
            this.f28487X.clear();
        }

        public void dispose() {
            if (!this.f28491b0) {
                this.f28491b0 = true;
                this.f28488Y.dispose();
                this.f28484U.dispose();
                if (getAndIncrement() == 0) {
                    this.f28487X.clear();
                }
            }
        }

        public boolean isDisposed() {
            return this.f28491b0;
        }

        public boolean isEmpty() {
            return this.f28487X.isEmpty();
        }

        public void onComplete() {
            if (!this.f28490a0) {
                this.f28490a0 = true;
                mo30494c();
            }
        }

        public void onError(Throwable th) {
            if (this.f28490a0) {
                C11915a.m38466b(th);
                return;
            }
            this.f28489Z = th;
            this.f28490a0 = true;
            mo30494c();
        }

        public void onNext(T t) {
            if (!this.f28490a0) {
                if (this.f28493c0 != 2) {
                    this.f28487X.offer(t);
                }
                mo30494c();
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28488Y, disposable)) {
                this.f28488Y = disposable;
                if (disposable instanceof C12046i) {
                    C12046i iVar = (C12046i) disposable;
                    int a = iVar.mo30285a(7);
                    if (a == 1) {
                        this.f28493c0 = a;
                        this.f28487X = iVar;
                        this.f28490a0 = true;
                        this.f28492c.onSubscribe(this);
                        mo30494c();
                        return;
                    } else if (a == 2) {
                        this.f28493c0 = a;
                        this.f28487X = iVar;
                        this.f28492c.onSubscribe(this);
                        return;
                    }
                }
                this.f28487X = new C12491c(this.f28486W);
                this.f28492c.onSubscribe(this);
            }
        }

        public T poll() throws Exception {
            return this.f28487X.poll();
        }

        public void run() {
            if (this.f28494d0) {
                mo30491a();
            } else {
                mo30493b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo30492a(boolean z, boolean z2, C11968q<? super T> qVar) {
            if (this.f28491b0) {
                this.f28487X.clear();
                return true;
            }
            if (z) {
                Throwable th = this.f28489Z;
                if (this.f28485V) {
                    if (z2) {
                        this.f28491b0 = true;
                        if (th != null) {
                            qVar.onError(th);
                        } else {
                            qVar.onComplete();
                        }
                        this.f28484U.dispose();
                        return true;
                    }
                } else if (th != null) {
                    this.f28491b0 = true;
                    this.f28487X.clear();
                    qVar.onError(th);
                    this.f28484U.dispose();
                    return true;
                } else if (z2) {
                    this.f28491b0 = true;
                    qVar.onComplete();
                    this.f28484U.dispose();
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public int mo30285a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f28494d0 = true;
            return 2;
        }
    }

    public C12329h0(ObservableSource<T> observableSource, C11969r rVar, boolean z, int i) {
        super(observableSource);
        this.f28481U = rVar;
        this.f28482V = z;
        this.f28483W = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        C11969r rVar = this.f28481U;
        if (rVar instanceof C12524q) {
            this.f28379c.mo30162a(qVar);
            return;
        }
        this.f28379c.mo30162a(new C12330a(qVar, rVar.mo30292a(), this.f28482V, this.f28483W));
    }
}
