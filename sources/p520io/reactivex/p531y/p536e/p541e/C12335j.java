package p520io.reactivex.p531y.p536e.p541e;

import p520io.reactivex.C11968q;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p534c.C12046i;
import p520io.reactivex.p531y.p535d.C12053b;

/* renamed from: io.reactivex.y.e.e.j */
/* compiled from: ObservableDoFinally */
public final class C12335j<T> extends C12294a<T, T> {

    /* renamed from: U */
    final C11945a f28505U;

    /* renamed from: io.reactivex.y.e.e.j$a */
    /* compiled from: ObservableDoFinally */
    static final class C12336a<T> extends C12053b<T> implements C11968q<T> {

        /* renamed from: U */
        final C11945a f28506U;

        /* renamed from: V */
        Disposable f28507V;

        /* renamed from: W */
        C12046i<T> f28508W;

        /* renamed from: X */
        boolean f28509X;

        /* renamed from: c */
        final C11968q<? super T> f28510c;

        C12336a(C11968q<? super T> qVar, C11945a aVar) {
            this.f28510c = qVar;
            this.f28506U = aVar;
        }

        /* renamed from: a */
        public int mo30285a(int i) {
            C12046i<T> iVar = this.f28508W;
            if (iVar == null || (i & 4) != 0) {
                return 0;
            }
            int a = iVar.mo30285a(i);
            if (a != 0) {
                boolean z = true;
                if (a != 1) {
                    z = false;
                }
                this.f28509X = z;
            }
            return a;
        }

        public void clear() {
            this.f28508W.clear();
        }

        public void dispose() {
            this.f28507V.dispose();
            mo30496a();
        }

        public boolean isDisposed() {
            return this.f28507V.isDisposed();
        }

        public boolean isEmpty() {
            return this.f28508W.isEmpty();
        }

        public void onComplete() {
            this.f28510c.onComplete();
            mo30496a();
        }

        public void onError(Throwable th) {
            this.f28510c.onError(th);
            mo30496a();
        }

        public void onNext(T t) {
            this.f28510c.onNext(t);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28507V, disposable)) {
                this.f28507V = disposable;
                if (disposable instanceof C12046i) {
                    this.f28508W = (C12046i) disposable;
                }
                this.f28510c.onSubscribe(this);
            }
        }

        public T poll() throws Exception {
            T poll = this.f28508W.poll();
            if (poll == null && this.f28509X) {
                mo30496a();
            }
            return poll;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30496a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f28506U.run();
                } catch (Throwable th) {
                    C12003b.m38614b(th);
                    C11915a.m38466b(th);
                }
            }
        }
    }

    public C12335j(ObservableSource<T> observableSource, C11945a aVar) {
        super(observableSource);
        this.f28505U = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        this.f28379c.mo30162a(new C12336a(qVar, this.f28505U));
    }
}
