package p520io.reactivex.p531y.p536e.p538b;

import org.reactivestreams.Subscriber;
import p520io.reactivex.C11955i;
import p520io.reactivex.Flowable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C11998a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p534c.C12038a;
import p520io.reactivex.p531y.p545h.C12529a;
import p520io.reactivex.p531y.p545h.C12530b;

/* renamed from: io.reactivex.y.e.b.g */
/* compiled from: FlowableDoOnEach */
public final class C12148g<T> extends C12111a<T, T> {

    /* renamed from: V */
    final Consumer<? super T> f27984V;

    /* renamed from: W */
    final Consumer<? super Throwable> f27985W;

    /* renamed from: X */
    final C11945a f27986X;

    /* renamed from: Y */
    final C11945a f27987Y;

    /* renamed from: io.reactivex.y.e.b.g$a */
    /* compiled from: FlowableDoOnEach */
    static final class C12149a<T> extends C12529a<T, T> {

        /* renamed from: Y */
        final Consumer<? super T> f27988Y;

        /* renamed from: Z */
        final Consumer<? super Throwable> f27989Z;

        /* renamed from: a0 */
        final C11945a f27990a0;

        /* renamed from: b0 */
        final C11945a f27991b0;

        C12149a(C12038a<? super T> aVar, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, C11945a aVar2, C11945a aVar3) {
            super(aVar);
            this.f27988Y = consumer;
            this.f27989Z = consumer2;
            this.f27990a0 = aVar2;
            this.f27991b0 = aVar3;
        }

        /* renamed from: a */
        public boolean mo30361a(T t) {
            if (this.f29037W) {
                return false;
            }
            try {
                this.f27988Y.accept(t);
                return this.f29039c.mo30361a(t);
            } catch (Throwable th) {
                mo30647a(th);
                return false;
            }
        }

        public void onComplete() {
            if (!this.f29037W) {
                try {
                    this.f27990a0.run();
                    this.f29037W = true;
                    this.f29039c.onComplete();
                    try {
                        this.f27991b0.run();
                    } catch (Throwable th) {
                        C12003b.m38614b(th);
                        C11915a.m38466b(th);
                    }
                } catch (Throwable th2) {
                    mo30647a(th2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f29037W) {
                C11915a.m38466b(th);
                return;
            }
            boolean z = true;
            this.f29037W = true;
            try {
                this.f27989Z.accept(th);
            } catch (Throwable th2) {
                C12003b.m38614b(th2);
                this.f29039c.onError(new C11998a(th, th2));
                z = false;
            }
            if (z) {
                this.f29039c.onError(th);
            }
            try {
                this.f27991b0.run();
            } catch (Throwable th3) {
                C12003b.m38614b(th3);
                C11915a.m38466b(th3);
            }
        }

        public void onNext(T t) {
            if (!this.f29037W) {
                if (this.f29038X != 0) {
                    this.f29039c.onNext(null);
                    return;
                }
                try {
                    this.f27988Y.accept(t);
                    this.f29039c.onNext(t);
                } catch (Throwable th) {
                    mo30647a(th);
                }
            }
        }

        public T poll() throws Exception {
            try {
                T poll = this.f29036V.poll();
                if (poll != null) {
                    try {
                        this.f27988Y.accept(poll);
                        this.f27991b0.run();
                    } catch (Throwable th) {
                        throw new C11998a(th, th);
                    }
                } else if (this.f29038X == 1) {
                    this.f27990a0.run();
                    this.f27991b0.run();
                }
                return poll;
            } catch (Throwable th2) {
                throw new C11998a(th, th2);
            }
        }

        /* renamed from: a */
        public int mo30285a(int i) {
            return mo30648b(i);
        }
    }

    /* renamed from: io.reactivex.y.e.b.g$b */
    /* compiled from: FlowableDoOnEach */
    static final class C12150b<T> extends C12530b<T, T> {

        /* renamed from: Y */
        final Consumer<? super T> f27992Y;

        /* renamed from: Z */
        final Consumer<? super Throwable> f27993Z;

        /* renamed from: a0 */
        final C11945a f27994a0;

        /* renamed from: b0 */
        final C11945a f27995b0;

        C12150b(Subscriber<? super T> subscriber, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, C11945a aVar, C11945a aVar2) {
            super(subscriber);
            this.f27992Y = consumer;
            this.f27993Z = consumer2;
            this.f27994a0 = aVar;
            this.f27995b0 = aVar2;
        }

        /* renamed from: a */
        public int mo30285a(int i) {
            return mo30652b(i);
        }

        public void onComplete() {
            if (!this.f29042W) {
                try {
                    this.f27994a0.run();
                    this.f29042W = true;
                    this.f29044c.onComplete();
                    try {
                        this.f27995b0.run();
                    } catch (Throwable th) {
                        C12003b.m38614b(th);
                        C11915a.m38466b(th);
                    }
                } catch (Throwable th2) {
                    mo30651a(th2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f29042W) {
                C11915a.m38466b(th);
                return;
            }
            boolean z = true;
            this.f29042W = true;
            try {
                this.f27993Z.accept(th);
            } catch (Throwable th2) {
                C12003b.m38614b(th2);
                this.f29044c.onError(new C11998a(th, th2));
                z = false;
            }
            if (z) {
                this.f29044c.onError(th);
            }
            try {
                this.f27995b0.run();
            } catch (Throwable th3) {
                C12003b.m38614b(th3);
                C11915a.m38466b(th3);
            }
        }

        public void onNext(T t) {
            if (!this.f29042W) {
                if (this.f29043X != 0) {
                    this.f29044c.onNext(null);
                    return;
                }
                try {
                    this.f27992Y.accept(t);
                    this.f29044c.onNext(t);
                } catch (Throwable th) {
                    mo30651a(th);
                }
            }
        }

        public T poll() throws Exception {
            try {
                T poll = this.f29041V.poll();
                if (poll != null) {
                    try {
                        this.f27992Y.accept(poll);
                        this.f27995b0.run();
                    } catch (Throwable th) {
                        throw new C11998a(th, th);
                    }
                } else if (this.f29043X == 1) {
                    this.f27994a0.run();
                    this.f27995b0.run();
                }
                return poll;
            } catch (Throwable th2) {
                throw new C11998a(th, th2);
            }
        }
    }

    public C12148g(Flowable<T> flowable, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, C11945a aVar, C11945a aVar2) {
        super(flowable);
        this.f27984V = consumer;
        this.f27985W = consumer2;
        this.f27986X = aVar;
        this.f27987Y = aVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29935a(Subscriber<? super T> subscriber) {
        if (subscriber instanceof C12038a) {
            Flowable<T> flowable = this.f27888U;
            C12149a aVar = new C12149a((C12038a) subscriber, this.f27984V, this.f27985W, this.f27986X, this.f27987Y);
            flowable.mo30080a((C11955i<? super T>) aVar);
            return;
        }
        Flowable<T> flowable2 = this.f27888U;
        C12150b bVar = new C12150b(subscriber, this.f27984V, this.f27985W, this.f27986X, this.f27987Y);
        flowable2.mo30080a((C11955i<? super T>) bVar);
    }
}
