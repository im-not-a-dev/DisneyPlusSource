package p520io.reactivex.p531y.p536e.p541e;

import p520io.reactivex.C11968q;
import p520io.reactivex.Observable;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p535d.C12054c;

/* renamed from: io.reactivex.y.e.e.w */
/* compiled from: ObservableFromArray */
public final class C12405w<T> extends Observable<T> {

    /* renamed from: c */
    final T[] f28730c;

    /* renamed from: io.reactivex.y.e.e.w$a */
    /* compiled from: ObservableFromArray */
    static final class C12406a<T> extends C12054c<T> {

        /* renamed from: U */
        final T[] f28731U;

        /* renamed from: V */
        int f28732V;

        /* renamed from: W */
        boolean f28733W;

        /* renamed from: X */
        volatile boolean f28734X;

        /* renamed from: c */
        final C11968q<? super T> f28735c;

        C12406a(C11968q<? super T> qVar, T[] tArr) {
            this.f28735c = qVar;
            this.f28731U = tArr;
        }

        /* renamed from: a */
        public int mo30285a(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f28733W = true;
            return 1;
        }

        public void clear() {
            this.f28732V = this.f28731U.length;
        }

        public void dispose() {
            this.f28734X = true;
        }

        public boolean isDisposed() {
            return this.f28734X;
        }

        public boolean isEmpty() {
            return this.f28732V == this.f28731U.length;
        }

        public T poll() {
            int i = this.f28732V;
            T[] tArr = this.f28731U;
            if (i == tArr.length) {
                return null;
            }
            this.f28732V = i + 1;
            T t = tArr[i];
            C12036b.m38663a(t, "The array element is null");
            return t;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30564a() {
            T[] tArr = this.f28731U;
            int length = tArr.length;
            for (int i = 0; i < length && !isDisposed(); i++) {
                T t = tArr[i];
                if (t == null) {
                    C11968q<? super T> qVar = this.f28735c;
                    StringBuilder sb = new StringBuilder();
                    sb.append("The element at index ");
                    sb.append(i);
                    sb.append(" is null");
                    qVar.onError(new NullPointerException(sb.toString()));
                    return;
                }
                this.f28735c.onNext(t);
            }
            if (!isDisposed()) {
                this.f28735c.onComplete();
            }
        }
    }

    public C12405w(T[] tArr) {
        this.f28730c = tArr;
    }

    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        C12406a aVar = new C12406a(qVar, this.f28730c);
        qVar.onSubscribe(aVar);
        if (!aVar.f28733W) {
            aVar.mo30564a();
        }
    }
}
