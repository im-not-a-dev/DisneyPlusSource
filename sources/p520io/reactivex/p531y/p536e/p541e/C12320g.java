package p520io.reactivex.p531y.p536e.p541e;

import java.util.concurrent.TimeUnit;
import p520io.reactivex.C11968q;
import p520io.reactivex.C11969r;
import p520io.reactivex.C11969r.C11972c;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p521a0.C11911d;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.e.g */
/* compiled from: ObservableDelay */
public final class C12320g<T> extends C12294a<T, T> {

    /* renamed from: U */
    final long f28458U;

    /* renamed from: V */
    final TimeUnit f28459V;

    /* renamed from: W */
    final C11969r f28460W;

    /* renamed from: X */
    final boolean f28461X;

    /* renamed from: io.reactivex.y.e.e.g$a */
    /* compiled from: ObservableDelay */
    static final class C12321a<T> implements C11968q<T>, Disposable {

        /* renamed from: U */
        final long f28462U;

        /* renamed from: V */
        final TimeUnit f28463V;

        /* renamed from: W */
        final C11972c f28464W;

        /* renamed from: X */
        final boolean f28465X;

        /* renamed from: Y */
        Disposable f28466Y;

        /* renamed from: c */
        final C11968q<? super T> f28467c;

        /* renamed from: io.reactivex.y.e.e.g$a$a */
        /* compiled from: ObservableDelay */
        final class C12322a implements Runnable {
            C12322a() {
            }

            public void run() {
                try {
                    C12321a.this.f28467c.onComplete();
                } finally {
                    C12321a.this.f28464W.dispose();
                }
            }
        }

        /* renamed from: io.reactivex.y.e.e.g$a$b */
        /* compiled from: ObservableDelay */
        final class C12323b implements Runnable {

            /* renamed from: c */
            private final Throwable f28470c;

            C12323b(Throwable th) {
                this.f28470c = th;
            }

            public void run() {
                try {
                    C12321a.this.f28467c.onError(this.f28470c);
                } finally {
                    C12321a.this.f28464W.dispose();
                }
            }
        }

        /* renamed from: io.reactivex.y.e.e.g$a$c */
        /* compiled from: ObservableDelay */
        final class C12324c implements Runnable {

            /* renamed from: c */
            private final T f28472c;

            C12324c(T t) {
                this.f28472c = t;
            }

            public void run() {
                C12321a.this.f28467c.onNext(this.f28472c);
            }
        }

        C12321a(C11968q<? super T> qVar, long j, TimeUnit timeUnit, C11972c cVar, boolean z) {
            this.f28467c = qVar;
            this.f28462U = j;
            this.f28463V = timeUnit;
            this.f28464W = cVar;
            this.f28465X = z;
        }

        public void dispose() {
            this.f28466Y.dispose();
            this.f28464W.dispose();
        }

        public boolean isDisposed() {
            return this.f28464W.isDisposed();
        }

        public void onComplete() {
            this.f28464W.mo30298a(new C12322a(), this.f28462U, this.f28463V);
        }

        public void onError(Throwable th) {
            this.f28464W.mo30298a(new C12323b(th), this.f28465X ? this.f28462U : 0, this.f28463V);
        }

        public void onNext(T t) {
            this.f28464W.mo30298a(new C12324c(t), this.f28462U, this.f28463V);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28466Y, disposable)) {
                this.f28466Y = disposable;
                this.f28467c.onSubscribe(this);
            }
        }
    }

    public C12320g(ObservableSource<T> observableSource, long j, TimeUnit timeUnit, C11969r rVar, boolean z) {
        super(observableSource);
        this.f28458U = j;
        this.f28459V = timeUnit;
        this.f28460W = rVar;
        this.f28461X = z;
    }

    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        C11968q<? super T> qVar2;
        if (this.f28461X) {
            qVar2 = qVar;
        } else {
            qVar2 = new C11911d<>(qVar);
        }
        C11972c a = this.f28460W.mo30292a();
        ObservableSource<T> observableSource = this.f28379c;
        C12321a aVar = new C12321a(qVar2, this.f28458U, this.f28459V, a, this.f28461X);
        observableSource.mo30162a(aVar);
    }
}
