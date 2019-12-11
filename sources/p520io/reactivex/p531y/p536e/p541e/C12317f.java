package p520io.reactivex.p531y.p536e.p541e;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11961o;
import p520io.reactivex.C11962p;
import p520io.reactivex.C11968q;
import p520io.reactivex.Observable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11950f;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12008a;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.e.f */
/* compiled from: ObservableCreate */
public final class C12317f<T> extends Observable<T> {

    /* renamed from: c */
    final C11962p<T> f28455c;

    /* renamed from: io.reactivex.y.e.e.f$a */
    /* compiled from: ObservableCreate */
    static final class C12318a<T> extends AtomicReference<Disposable> implements C11961o<T>, Disposable {

        /* renamed from: c */
        final C11968q<? super T> f28456c;

        C12318a(C11968q<? super T> qVar) {
            this.f28456c = qVar;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        public boolean mo30486a(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isDisposed()) {
                return false;
            }
            try {
                this.f28456c.onError(th);
                dispose();
                return true;
            } catch (Throwable th2) {
                dispose();
                throw th2;
            }
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12010c.m38619a((Disposable) get());
        }

        public void onComplete() {
            if (!isDisposed()) {
                try {
                    this.f28456c.onComplete();
                } finally {
                    dispose();
                }
            }
        }

        public void onError(Throwable th) {
            if (!mo30486a(th)) {
                C11915a.m38466b(th);
            }
        }

        public void onNext(T t) {
            if (t == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            if (!isDisposed()) {
                this.f28456c.onNext(t);
            }
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{C12318a.class.getSimpleName(), super.toString()});
        }

        /* renamed from: a */
        public void mo30485a(Disposable disposable) {
            C12010c.m38623b(this, disposable);
        }

        /* renamed from: a */
        public void mo30270a(C11950f fVar) {
            mo30485a((Disposable) new C12008a(fVar));
        }
    }

    public C12317f(C11962p<T> pVar) {
        this.f28455c = pVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        C12318a aVar = new C12318a(qVar);
        qVar.onSubscribe(aVar);
        try {
            this.f28455c.mo30271a(aVar);
        } catch (Throwable th) {
            C12003b.m38614b(th);
            aVar.onError(th);
        }
    }
}
