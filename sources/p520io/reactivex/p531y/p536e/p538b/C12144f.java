package p520io.reactivex.p531y.p536e.p538b;

import org.reactivestreams.Subscriber;
import p520io.reactivex.C11955i;
import p520io.reactivex.Flowable;
import p520io.reactivex.functions.C11948d;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p531y.p534c.C12038a;
import p520io.reactivex.p531y.p545h.C12529a;
import p520io.reactivex.p531y.p545h.C12530b;

/* renamed from: io.reactivex.y.e.b.f */
/* compiled from: FlowableDistinctUntilChanged */
public final class C12144f<T, K> extends C12111a<T, T> {

    /* renamed from: V */
    final Function<? super T, K> f27970V;

    /* renamed from: W */
    final C11948d<? super K, ? super K> f27971W;

    /* renamed from: io.reactivex.y.e.b.f$a */
    /* compiled from: FlowableDistinctUntilChanged */
    static final class C12145a<T, K> extends C12529a<T, T> {

        /* renamed from: Y */
        final Function<? super T, K> f27972Y;

        /* renamed from: Z */
        final C11948d<? super K, ? super K> f27973Z;

        /* renamed from: a0 */
        K f27974a0;

        /* renamed from: b0 */
        boolean f27975b0;

        C12145a(C12038a<? super T> aVar, Function<? super T, K> function, C11948d<? super K, ? super K> dVar) {
            super(aVar);
            this.f27972Y = function;
            this.f27973Z = dVar;
        }

        /* renamed from: a */
        public boolean mo30361a(T t) {
            if (this.f29037W) {
                return false;
            }
            if (this.f29038X != 0) {
                return this.f29039c.mo30361a(t);
            }
            try {
                K apply = this.f27972Y.apply(t);
                if (this.f27975b0) {
                    boolean a = this.f27973Z.mo30263a(this.f27974a0, apply);
                    this.f27974a0 = apply;
                    if (a) {
                        return false;
                    }
                } else {
                    this.f27975b0 = true;
                    this.f27974a0 = apply;
                }
                this.f29039c.onNext(t);
                return true;
            } catch (Throwable th) {
                mo30647a(th);
                return true;
            }
        }

        public void onNext(T t) {
            if (!mo30361a(t)) {
                this.f29035U.mo29946b(1);
            }
        }

        public T poll() throws Exception {
            while (true) {
                T poll = this.f29036V.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.f27972Y.apply(poll);
                if (!this.f27975b0) {
                    this.f27975b0 = true;
                    this.f27974a0 = apply;
                    return poll;
                } else if (!this.f27973Z.mo30263a(this.f27974a0, apply)) {
                    this.f27974a0 = apply;
                    return poll;
                } else {
                    this.f27974a0 = apply;
                    if (this.f29038X != 1) {
                        this.f29035U.mo29946b(1);
                    }
                }
            }
        }

        /* renamed from: a */
        public int mo30285a(int i) {
            return mo30648b(i);
        }
    }

    /* renamed from: io.reactivex.y.e.b.f$b */
    /* compiled from: FlowableDistinctUntilChanged */
    static final class C12146b<T, K> extends C12530b<T, T> implements C12038a<T> {

        /* renamed from: Y */
        final Function<? super T, K> f27976Y;

        /* renamed from: Z */
        final C11948d<? super K, ? super K> f27977Z;

        /* renamed from: a0 */
        K f27978a0;

        /* renamed from: b0 */
        boolean f27979b0;

        C12146b(Subscriber<? super T> subscriber, Function<? super T, K> function, C11948d<? super K, ? super K> dVar) {
            super(subscriber);
            this.f27976Y = function;
            this.f27977Z = dVar;
        }

        /* renamed from: a */
        public boolean mo30361a(T t) {
            if (this.f29042W) {
                return false;
            }
            if (this.f29043X != 0) {
                this.f29044c.onNext(t);
                return true;
            }
            try {
                K apply = this.f27976Y.apply(t);
                if (this.f27979b0) {
                    boolean a = this.f27977Z.mo30263a(this.f27978a0, apply);
                    this.f27978a0 = apply;
                    if (a) {
                        return false;
                    }
                } else {
                    this.f27979b0 = true;
                    this.f27978a0 = apply;
                }
                this.f29044c.onNext(t);
                return true;
            } catch (Throwable th) {
                mo30651a(th);
                return true;
            }
        }

        public void onNext(T t) {
            if (!mo30361a(t)) {
                this.f29040U.mo29946b(1);
            }
        }

        public T poll() throws Exception {
            while (true) {
                T poll = this.f29041V.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.f27976Y.apply(poll);
                if (!this.f27979b0) {
                    this.f27979b0 = true;
                    this.f27978a0 = apply;
                    return poll;
                } else if (!this.f27977Z.mo30263a(this.f27978a0, apply)) {
                    this.f27978a0 = apply;
                    return poll;
                } else {
                    this.f27978a0 = apply;
                    if (this.f29043X != 1) {
                        this.f29040U.mo29946b(1);
                    }
                }
            }
        }

        /* renamed from: a */
        public int mo30285a(int i) {
            return mo30652b(i);
        }
    }

    public C12144f(Flowable<T> flowable, Function<? super T, K> function, C11948d<? super K, ? super K> dVar) {
        super(flowable);
        this.f27970V = function;
        this.f27971W = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29935a(Subscriber<? super T> subscriber) {
        if (subscriber instanceof C12038a) {
            this.f27888U.mo30080a((C11955i<? super T>) new C12145a<Object>((C12038a) subscriber, this.f27970V, this.f27971W));
            return;
        }
        this.f27888U.mo30080a((C11955i<? super T>) new C12146b<Object>(subscriber, this.f27970V, this.f27971W));
    }
}
