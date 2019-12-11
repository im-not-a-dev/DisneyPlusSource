package p520io.reactivex.p531y.p536e.p538b;

import org.reactivestreams.Subscriber;
import p520io.reactivex.C11955i;
import p520io.reactivex.Flowable;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.p531y.p534c.C12038a;
import p520io.reactivex.p531y.p534c.C12048k;
import p520io.reactivex.p531y.p545h.C12529a;
import p520io.reactivex.p531y.p545h.C12530b;

/* renamed from: io.reactivex.y.e.b.l */
/* compiled from: FlowableFilter */
public final class C12169l<T> extends C12111a<T, T> {

    /* renamed from: V */
    final C11952h<? super T> f28049V;

    /* renamed from: io.reactivex.y.e.b.l$a */
    /* compiled from: FlowableFilter */
    static final class C12170a<T> extends C12529a<T, T> {

        /* renamed from: Y */
        final C11952h<? super T> f28050Y;

        C12170a(C12038a<? super T> aVar, C11952h<? super T> hVar) {
            super(aVar);
            this.f28050Y = hVar;
        }

        /* renamed from: a */
        public boolean mo30361a(T t) {
            if (this.f29037W) {
                return false;
            }
            if (this.f29038X != 0) {
                return this.f29039c.mo30361a(null);
            }
            boolean z = true;
            try {
                if (!this.f28050Y.test(t) || !this.f29039c.mo30361a(t)) {
                    z = false;
                }
                return z;
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
            C12048k<T> kVar = this.f29036V;
            C11952h<? super T> hVar = this.f28050Y;
            while (true) {
                T poll = kVar.poll();
                if (poll == null) {
                    return null;
                }
                if (hVar.test(poll)) {
                    return poll;
                }
                if (this.f29038X == 2) {
                    kVar.mo29946b(1);
                }
            }
        }

        /* renamed from: a */
        public int mo30285a(int i) {
            return mo30648b(i);
        }
    }

    /* renamed from: io.reactivex.y.e.b.l$b */
    /* compiled from: FlowableFilter */
    static final class C12171b<T> extends C12530b<T, T> implements C12038a<T> {

        /* renamed from: Y */
        final C11952h<? super T> f28051Y;

        C12171b(Subscriber<? super T> subscriber, C11952h<? super T> hVar) {
            super(subscriber);
            this.f28051Y = hVar;
        }

        /* renamed from: a */
        public boolean mo30361a(T t) {
            if (this.f29042W) {
                return false;
            }
            if (this.f29043X != 0) {
                this.f29044c.onNext(null);
                return true;
            }
            try {
                boolean test = this.f28051Y.test(t);
                if (test) {
                    this.f29044c.onNext(t);
                }
                return test;
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
            C12048k<T> kVar = this.f29041V;
            C11952h<? super T> hVar = this.f28051Y;
            while (true) {
                T poll = kVar.poll();
                if (poll == null) {
                    return null;
                }
                if (hVar.test(poll)) {
                    return poll;
                }
                if (this.f29043X == 2) {
                    kVar.mo29946b(1);
                }
            }
        }

        /* renamed from: a */
        public int mo30285a(int i) {
            return mo30652b(i);
        }
    }

    public C12169l(Flowable<T> flowable, C11952h<? super T> hVar) {
        super(flowable);
        this.f28049V = hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29935a(Subscriber<? super T> subscriber) {
        if (subscriber instanceof C12038a) {
            this.f27888U.mo30080a((C11955i<? super T>) new C12170a<Object>((C12038a) subscriber, this.f28049V));
        } else {
            this.f27888U.mo30080a((C11955i<? super T>) new C12171b<Object>(subscriber, this.f28049V));
        }
    }
}
