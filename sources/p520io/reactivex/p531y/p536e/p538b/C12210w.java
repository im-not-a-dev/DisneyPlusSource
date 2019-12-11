package p520io.reactivex.p531y.p536e.p538b;

import org.reactivestreams.Subscriber;
import p520io.reactivex.C11955i;
import p520io.reactivex.Flowable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p534c.C12038a;
import p520io.reactivex.p531y.p545h.C12529a;
import p520io.reactivex.p531y.p545h.C12530b;

/* renamed from: io.reactivex.y.e.b.w */
/* compiled from: FlowableMap */
public final class C12210w<T, U> extends C12111a<T, U> {

    /* renamed from: V */
    final Function<? super T, ? extends U> f28193V;

    /* renamed from: io.reactivex.y.e.b.w$a */
    /* compiled from: FlowableMap */
    static final class C12211a<T, U> extends C12529a<T, U> {

        /* renamed from: Y */
        final Function<? super T, ? extends U> f28194Y;

        C12211a(C12038a<? super U> aVar, Function<? super T, ? extends U> function) {
            super(aVar);
            this.f28194Y = function;
        }

        /* renamed from: a */
        public boolean mo30361a(T t) {
            if (this.f29037W) {
                return false;
            }
            try {
                Object apply = this.f28194Y.apply(t);
                C12036b.m38663a(apply, "The mapper function returned a null value.");
                return this.f29039c.mo30361a(apply);
            } catch (Throwable th) {
                mo30647a(th);
                return true;
            }
        }

        public void onNext(T t) {
            if (!this.f29037W) {
                if (this.f29038X != 0) {
                    this.f29039c.onNext(null);
                    return;
                }
                try {
                    Object apply = this.f28194Y.apply(t);
                    C12036b.m38663a(apply, "The mapper function returned a null value.");
                    this.f29039c.onNext(apply);
                } catch (Throwable th) {
                    mo30647a(th);
                }
            }
        }

        public U poll() throws Exception {
            Object poll = this.f29036V.poll();
            if (poll == null) {
                return null;
            }
            U apply = this.f28194Y.apply(poll);
            C12036b.m38663a(apply, "The mapper function returned a null value.");
            return apply;
        }

        /* renamed from: a */
        public int mo30285a(int i) {
            return mo30648b(i);
        }
    }

    /* renamed from: io.reactivex.y.e.b.w$b */
    /* compiled from: FlowableMap */
    static final class C12212b<T, U> extends C12530b<T, U> {

        /* renamed from: Y */
        final Function<? super T, ? extends U> f28195Y;

        C12212b(Subscriber<? super U> subscriber, Function<? super T, ? extends U> function) {
            super(subscriber);
            this.f28195Y = function;
        }

        /* renamed from: a */
        public int mo30285a(int i) {
            return mo30652b(i);
        }

        public void onNext(T t) {
            if (!this.f29042W) {
                if (this.f29043X != 0) {
                    this.f29044c.onNext(null);
                    return;
                }
                try {
                    Object apply = this.f28195Y.apply(t);
                    C12036b.m38663a(apply, "The mapper function returned a null value.");
                    this.f29044c.onNext(apply);
                } catch (Throwable th) {
                    mo30651a(th);
                }
            }
        }

        public U poll() throws Exception {
            Object poll = this.f29041V.poll();
            if (poll == null) {
                return null;
            }
            U apply = this.f28195Y.apply(poll);
            C12036b.m38663a(apply, "The mapper function returned a null value.");
            return apply;
        }
    }

    public C12210w(Flowable<T> flowable, Function<? super T, ? extends U> function) {
        super(flowable);
        this.f28193V = function;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29935a(Subscriber<? super U> subscriber) {
        if (subscriber instanceof C12038a) {
            this.f27888U.mo30080a((C11955i<? super T>) new C12211a<Object>((C12038a) subscriber, this.f28193V));
        } else {
            this.f27888U.mo30080a((C11955i<? super T>) new C12212b<Object>(subscriber, this.f28193V));
        }
    }
}
