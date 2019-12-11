package p163g.p503n.p504a;

import java.util.concurrent.Callable;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Flowable;
import p520io.reactivex.Maybe;
import p520io.reactivex.Observable;
import p520io.reactivex.Single;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;

/* renamed from: g.n.a.e */
/* compiled from: AutoDispose */
public final class C11793e {

    /* renamed from: g.n.a.e$a */
    /* compiled from: AutoDispose */
    class C11794a implements C11820h<T> {

        /* renamed from: a */
        final /* synthetic */ CompletableSource f27430a;

        /* renamed from: g.n.a.e$a$a */
        /* compiled from: AutoDispose */
        class C11795a implements C11839v {

            /* renamed from: a */
            final /* synthetic */ Completable f27431a;

            C11795a(Completable completable) {
                this.f27431a = completable;
            }

            /* renamed from: a */
            public Disposable mo29926a(C11945a aVar, Consumer<? super Throwable> consumer) {
                return new C11814g(this.f27431a, C11794a.this.f27430a).mo30047a(aVar, consumer);
            }
        }

        /* renamed from: g.n.a.e$a$b */
        /* compiled from: AutoDispose */
        class C11796b implements C11842x<T> {

            /* renamed from: a */
            final /* synthetic */ Flowable f27433a;

            C11796b(Flowable flowable) {
                this.f27433a = flowable;
            }

            /* renamed from: a */
            public Disposable mo29927a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
                return new C11822j(this.f27433a, C11794a.this.f27430a).mo30077a(consumer, consumer2);
            }
        }

        /* renamed from: g.n.a.e$a$c */
        /* compiled from: AutoDispose */
        class C11797c implements C11844z<T> {

            /* renamed from: a */
            final /* synthetic */ Maybe f27435a;

            C11797c(Maybe maybe) {
                this.f27435a = maybe;
            }

            /* renamed from: a */
            public Disposable mo29928a() {
                return new C11823k(this.f27435a, C11794a.this.f27430a).mo30130e();
            }

            /* renamed from: a */
            public Disposable mo29929a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
                return new C11823k(this.f27435a, C11794a.this.f27430a).mo30110a(consumer, consumer2);
            }

            /* renamed from: a */
            public Disposable mo29930a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, C11945a aVar) {
                return new C11823k(this.f27435a, C11794a.this.f27430a).mo30111a(consumer, consumer2, aVar);
            }
        }

        /* renamed from: g.n.a.e$a$d */
        /* compiled from: AutoDispose */
        class C11798d implements C11786a0<T> {

            /* renamed from: a */
            final /* synthetic */ Observable f27437a;

            C11798d(Observable observable) {
                this.f27437a = observable;
            }

            /* renamed from: a */
            public Disposable mo29915a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
                return new C11824l(this.f27437a, C11794a.this.f27430a).mo30157a(consumer, consumer2);
            }
        }

        /* renamed from: g.n.a.e$a$e */
        /* compiled from: AutoDispose */
        class C11799e implements C11792d0<T> {

            /* renamed from: a */
            final /* synthetic */ Single f27439a;

            C11799e(Single single) {
                this.f27439a = single;
            }

            /* renamed from: a */
            public Disposable mo29920a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
                return new C11826n(this.f27439a, C11794a.this.f27430a).mo30214a(consumer, consumer2);
            }
        }

        C11794a(CompletableSource completableSource) {
            this.f27430a = completableSource;
        }

        public C11839v apply(Completable completable) {
            return new C11795a(completable);
        }

        /* renamed from: a */
        public C11842x<T> m37936a(Flowable<T> flowable) {
            return new C11796b(flowable);
        }

        public C11792d0<T> apply(Single<T> single) {
            return new C11799e(single);
        }

        /* renamed from: a */
        public C11844z<T> m37937a(Maybe<T> maybe) {
            return new C11797c(maybe);
        }

        /* renamed from: a */
        public C11786a0<T> m37938a(Observable<T> observable) {
            return new C11798d(observable);
        }
    }

    /* renamed from: a */
    public static <T> C11820h<T> m37930a(C11790c0 c0Var) {
        C11827o.m37973a(c0Var, "provider == null");
        return m37931a((CompletableSource) Completable.m38162b((Callable<? extends CompletableSource>) new C11787b<Object>(c0Var)));
    }

    /* renamed from: b */
    static /* synthetic */ CompletableSource m37932b(C11790c0 c0Var) throws Exception {
        try {
            return c0Var.mo17612d();
        } catch (C11788b0 e) {
            Consumer b = C11825m.m37971b();
            if (b == null) {
                return Completable.m38154a((Throwable) e);
            }
            b.accept(e);
            return Completable.m38169h();
        }
    }

    /* renamed from: a */
    public static <T> C11820h<T> m37931a(CompletableSource completableSource) {
        C11827o.m37973a(completableSource, "scope == null");
        return new C11794a(completableSource);
    }
}
