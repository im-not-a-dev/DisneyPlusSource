package p520io.reactivex.p531y.p536e.p541e;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11968q;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p532a.C12013f;
import p520io.reactivex.p531y.p534c.C12043f;
import p520io.reactivex.p531y.p547j.C12551j;
import p520io.reactivex.p548z.C12557a;

/* renamed from: io.reactivex.y.e.e.o0 */
/* compiled from: ObservableReplay */
public final class C12359o0<T> extends C12557a<T> implements C12043f<T>, C12013f {

    /* renamed from: X */
    static final C12361b f28589X = new C12369j();

    /* renamed from: U */
    final AtomicReference<C12366g<T>> f28590U;

    /* renamed from: V */
    final C12361b<T> f28591V;

    /* renamed from: W */
    final ObservableSource<T> f28592W;

    /* renamed from: c */
    final ObservableSource<T> f28593c;

    /* renamed from: io.reactivex.y.e.e.o0$a */
    /* compiled from: ObservableReplay */
    static abstract class C12360a<T> extends AtomicReference<C12363d> implements C12364e<T> {

        /* renamed from: U */
        int f28594U;

        /* renamed from: c */
        C12363d f28595c;

        C12360a() {
            C12363d dVar = new C12363d(null);
            this.f28595c = dVar;
            set(dVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo30513a(C12363d dVar) {
            this.f28595c.set(dVar);
            this.f28595c = dVar;
            this.f28594U++;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Object mo30516b(Object obj) {
            return obj;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo30518b(C12363d dVar) {
            set(dVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public Object mo30519c(Object obj) {
            return obj;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo30520c() {
            C12363d dVar = (C12363d) ((C12363d) get()).get();
            this.f28594U--;
            mo30518b(dVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final void mo30521d() {
            C12363d dVar = (C12363d) get();
            if (dVar.f28600c != null) {
                C12363d dVar2 = new C12363d(null);
                dVar2.lazySet(dVar.get());
                set(dVar2);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public abstract void mo30522e();

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo30523f() {
            mo30521d();
        }

        /* renamed from: b */
        public final void mo30517b() {
            Object a = C12551j.m39357a();
            mo30516b(a);
            mo30513a(new C12363d(a));
            mo30523f();
        }

        /* renamed from: a */
        public final void mo30514a(T t) {
            C12551j.m39368e(t);
            mo30516b((Object) t);
            mo30513a(new C12363d(t));
            mo30522e();
        }

        /* renamed from: a */
        public final void mo30515a(Throwable th) {
            Object a = C12551j.m39359a(th);
            mo30516b(a);
            mo30513a(new C12363d(a));
            mo30523f();
        }

        /* renamed from: a */
        public final void mo30512a(C12362c<T> cVar) {
            if (cVar.getAndIncrement() == 0) {
                int i = 1;
                do {
                    C12363d dVar = (C12363d) cVar.mo30525a();
                    if (dVar == null) {
                        dVar = mo30511a();
                        cVar.f28597V = dVar;
                    }
                    while (!cVar.isDisposed()) {
                        C12363d dVar2 = (C12363d) dVar.get();
                        if (dVar2 != null) {
                            Object obj = dVar2.f28600c;
                            mo30519c(obj);
                            if (C12551j.m39362a(obj, cVar.f28596U)) {
                                cVar.f28597V = null;
                                return;
                            }
                            dVar = dVar2;
                        } else {
                            cVar.f28597V = dVar;
                            i = cVar.addAndGet(-i);
                        }
                    }
                    cVar.f28597V = null;
                    return;
                } while (i != 0);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C12363d mo30511a() {
            return (C12363d) get();
        }
    }

    /* renamed from: io.reactivex.y.e.e.o0$b */
    /* compiled from: ObservableReplay */
    interface C12361b<T> {
        C12364e<T> call();
    }

    /* renamed from: io.reactivex.y.e.e.o0$c */
    /* compiled from: ObservableReplay */
    static final class C12362c<T> extends AtomicInteger implements Disposable {

        /* renamed from: U */
        final C11968q<? super T> f28596U;

        /* renamed from: V */
        Object f28597V;

        /* renamed from: W */
        volatile boolean f28598W;

        /* renamed from: c */
        final C12366g<T> f28599c;

        C12362c(C12366g<T> gVar, C11968q<? super T> qVar) {
            this.f28599c = gVar;
            this.f28596U = qVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public <U> U mo30525a() {
            return this.f28597V;
        }

        public void dispose() {
            if (!this.f28598W) {
                this.f28598W = true;
                this.f28599c.mo30529b(this);
                this.f28597V = null;
            }
        }

        public boolean isDisposed() {
            return this.f28598W;
        }
    }

    /* renamed from: io.reactivex.y.e.e.o0$d */
    /* compiled from: ObservableReplay */
    static final class C12363d extends AtomicReference<C12363d> {

        /* renamed from: c */
        final Object f28600c;

        C12363d(Object obj) {
            this.f28600c = obj;
        }
    }

    /* renamed from: io.reactivex.y.e.e.o0$e */
    /* compiled from: ObservableReplay */
    interface C12364e<T> {
        /* renamed from: a */
        void mo30512a(C12362c<T> cVar);

        /* renamed from: a */
        void mo30514a(T t);

        /* renamed from: a */
        void mo30515a(Throwable th);

        /* renamed from: b */
        void mo30517b();
    }

    /* renamed from: io.reactivex.y.e.e.o0$f */
    /* compiled from: ObservableReplay */
    static final class C12365f<T> implements C12361b<T> {

        /* renamed from: a */
        private final int f28601a;

        C12365f(int i) {
            this.f28601a = i;
        }

        public C12364e<T> call() {
            return new C12368i(this.f28601a);
        }
    }

    /* renamed from: io.reactivex.y.e.e.o0$g */
    /* compiled from: ObservableReplay */
    static final class C12366g<T> extends AtomicReference<Disposable> implements C11968q<T>, Disposable {

        /* renamed from: X */
        static final C12362c[] f28602X = new C12362c[0];

        /* renamed from: Y */
        static final C12362c[] f28603Y = new C12362c[0];

        /* renamed from: U */
        boolean f28604U;

        /* renamed from: V */
        final AtomicReference<C12362c[]> f28605V = new AtomicReference<>(f28602X);

        /* renamed from: W */
        final AtomicBoolean f28606W = new AtomicBoolean();

        /* renamed from: c */
        final C12364e<T> f28607c;

        C12366g(C12364e<T> eVar) {
            this.f28607c = eVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo30527a(C12362c<T> cVar) {
            C12362c[] cVarArr;
            C12362c[] cVarArr2;
            do {
                cVarArr = (C12362c[]) this.f28605V.get();
                if (cVarArr == f28603Y) {
                    return false;
                }
                int length = cVarArr.length;
                cVarArr2 = new C12362c[(length + 1)];
                System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                cVarArr2[length] = cVar;
            } while (!this.f28605V.compareAndSet(cVarArr, cVarArr2));
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo30529b(C12362c<T> cVar) {
            C12362c[] cVarArr;
            C12362c[] cVarArr2;
            do {
                cVarArr = (C12362c[]) this.f28605V.get();
                int length = cVarArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (cVarArr[i2].equals(cVar)) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            cVarArr2 = f28602X;
                        } else {
                            C12362c[] cVarArr3 = new C12362c[(length - 1)];
                            System.arraycopy(cVarArr, 0, cVarArr3, 0, i);
                            System.arraycopy(cVarArr, i + 1, cVarArr3, i, (length - i) - 1);
                            cVarArr2 = cVarArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.f28605V.compareAndSet(cVarArr, cVarArr2));
        }

        public void dispose() {
            this.f28605V.set(f28603Y);
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return this.f28605V.get() == f28603Y;
        }

        public void onComplete() {
            if (!this.f28604U) {
                this.f28604U = true;
                this.f28607c.mo30517b();
                mo30528b();
            }
        }

        public void onError(Throwable th) {
            if (!this.f28604U) {
                this.f28604U = true;
                this.f28607c.mo30515a(th);
                mo30528b();
                return;
            }
            C11915a.m38466b(th);
        }

        public void onNext(T t) {
            if (!this.f28604U) {
                this.f28607c.mo30514a(t);
                mo30526a();
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38624c(this, disposable)) {
                mo30526a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30526a() {
            for (C12362c a : (C12362c[]) this.f28605V.get()) {
                this.f28607c.mo30512a(a);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo30528b() {
            for (C12362c a : (C12362c[]) this.f28605V.getAndSet(f28603Y)) {
                this.f28607c.mo30512a(a);
            }
        }
    }

    /* renamed from: io.reactivex.y.e.e.o0$h */
    /* compiled from: ObservableReplay */
    static final class C12367h<T> implements ObservableSource<T> {

        /* renamed from: U */
        private final C12361b<T> f28608U;

        /* renamed from: c */
        private final AtomicReference<C12366g<T>> f28609c;

        C12367h(AtomicReference<C12366g<T>> atomicReference, C12361b<T> bVar) {
            this.f28609c = atomicReference;
            this.f28608U = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo30162a(p520io.reactivex.C11968q<? super T> r4) {
            /*
                r3 = this;
            L_0x0000:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.y.e.e.o0$g<T>> r0 = r3.f28609c
                java.lang.Object r0 = r0.get()
                io.reactivex.y.e.e.o0$g r0 = (p520io.reactivex.p531y.p536e.p541e.C12359o0.C12366g) r0
                if (r0 != 0) goto L_0x0020
                io.reactivex.y.e.e.o0$b<T> r0 = r3.f28608U
                io.reactivex.y.e.e.o0$e r0 = r0.call()
                io.reactivex.y.e.e.o0$g r1 = new io.reactivex.y.e.e.o0$g
                r1.<init>(r0)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.y.e.e.o0$g<T>> r0 = r3.f28609c
                r2 = 0
                boolean r0 = r0.compareAndSet(r2, r1)
                if (r0 != 0) goto L_0x001f
                goto L_0x0000
            L_0x001f:
                r0 = r1
            L_0x0020:
                io.reactivex.y.e.e.o0$c r1 = new io.reactivex.y.e.e.o0$c
                r1.<init>(r0, r4)
                r4.onSubscribe(r1)
                r0.mo30527a(r1)
                boolean r4 = r1.isDisposed()
                if (r4 == 0) goto L_0x0035
                r0.mo30529b(r1)
                return
            L_0x0035:
                io.reactivex.y.e.e.o0$e<T> r4 = r0.f28607c
                r4.mo30512a(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p520io.reactivex.p531y.p536e.p541e.C12359o0.C12367h.mo30162a(io.reactivex.q):void");
        }
    }

    /* renamed from: io.reactivex.y.e.e.o0$i */
    /* compiled from: ObservableReplay */
    static final class C12368i<T> extends C12360a<T> {

        /* renamed from: V */
        final int f28610V;

        C12368i(int i) {
            this.f28610V = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo30522e() {
            if (this.f28594U > this.f28610V) {
                mo30520c();
            }
        }
    }

    /* renamed from: io.reactivex.y.e.e.o0$j */
    /* compiled from: ObservableReplay */
    static final class C12369j implements C12361b<Object> {
        C12369j() {
        }

        public C12364e<Object> call() {
            return new C12370k(16);
        }
    }

    /* renamed from: io.reactivex.y.e.e.o0$k */
    /* compiled from: ObservableReplay */
    static final class C12370k<T> extends ArrayList<Object> implements C12364e<T> {

        /* renamed from: c */
        volatile int f28611c;

        C12370k(int i) {
            super(i);
        }

        /* renamed from: a */
        public void mo30514a(T t) {
            C12551j.m39368e(t);
            add(t);
            this.f28611c++;
        }

        /* renamed from: b */
        public void mo30517b() {
            add(C12551j.m39357a());
            this.f28611c++;
        }

        /* renamed from: a */
        public void mo30515a(Throwable th) {
            add(C12551j.m39359a(th));
            this.f28611c++;
        }

        /* renamed from: a */
        public void mo30512a(C12362c<T> cVar) {
            if (cVar.getAndIncrement() == 0) {
                C11968q<? super T> qVar = cVar.f28596U;
                int i = 1;
                while (!cVar.isDisposed()) {
                    int i2 = this.f28611c;
                    Integer num = (Integer) cVar.mo30525a();
                    int intValue = num != null ? num.intValue() : 0;
                    while (intValue < i2) {
                        if (!C12551j.m39362a(get(intValue), qVar) && !cVar.isDisposed()) {
                            intValue++;
                        } else {
                            return;
                        }
                    }
                    cVar.f28597V = Integer.valueOf(intValue);
                    i = cVar.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }

    private C12359o0(ObservableSource<T> observableSource, ObservableSource<T> observableSource2, AtomicReference<C12366g<T>> atomicReference, C12361b<T> bVar) {
        this.f28592W = observableSource;
        this.f28593c = observableSource2;
        this.f28590U = atomicReference;
        this.f28591V = bVar;
    }

    /* renamed from: a */
    public static <T> C12557a<T> m39055a(ObservableSource<T> observableSource, int i) {
        if (i == Integer.MAX_VALUE) {
            return m39057e(observableSource);
        }
        return m39056a(observableSource, (C12361b<T>) new C12365f<T>(i));
    }

    /* renamed from: e */
    public static <T> C12557a<T> m39057e(ObservableSource<? extends T> observableSource) {
        return m39056a(observableSource, f28589X);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        this.f28592W.mo30162a(qVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo30498g(p520io.reactivex.functions.Consumer<? super p520io.reactivex.disposables.Disposable> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.y.e.e.o0$g<T>> r0 = r4.f28590U
            java.lang.Object r0 = r0.get()
            io.reactivex.y.e.e.o0$g r0 = (p520io.reactivex.p531y.p536e.p541e.C12359o0.C12366g) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.isDisposed()
            if (r1 == 0) goto L_0x0025
        L_0x0010:
            io.reactivex.y.e.e.o0$b<T> r1 = r4.f28591V
            io.reactivex.y.e.e.o0$e r1 = r1.call()
            io.reactivex.y.e.e.o0$g r2 = new io.reactivex.y.e.e.o0$g
            r2.<init>(r1)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.y.e.e.o0$g<T>> r1 = r4.f28590U
            boolean r0 = r1.compareAndSet(r0, r2)
            if (r0 != 0) goto L_0x0024
            goto L_0x0000
        L_0x0024:
            r0 = r2
        L_0x0025:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f28606W
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0039
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f28606W
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x0039
            r1 = 1
            goto L_0x003a
        L_0x0039:
            r1 = 0
        L_0x003a:
            r5.accept(r0)     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0044
            io.reactivex.ObservableSource<T> r5 = r4.f28593c
            r5.mo30162a(r0)
        L_0x0044:
            return
        L_0x0045:
            r5 = move-exception
            if (r1 == 0) goto L_0x004d
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f28606W
            r0.compareAndSet(r2, r3)
        L_0x004d:
            p520io.reactivex.p530x.C12003b.m38614b(r5)
            java.lang.RuntimeException r5 = p520io.reactivex.p531y.p547j.C12548h.m39353b(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p520io.reactivex.p531y.p536e.p541e.C12359o0.mo30498g(io.reactivex.functions.Consumer):void");
    }

    /* renamed from: a */
    static <T> C12557a<T> m39056a(ObservableSource<T> observableSource, C12361b<T> bVar) {
        AtomicReference atomicReference = new AtomicReference();
        return C11915a.m38456a((C12557a<T>) new C12359o0<T>(new C12367h(atomicReference, bVar), observableSource, atomicReference, bVar));
    }

    /* renamed from: a */
    public void mo30344a(Disposable disposable) {
        this.f28590U.compareAndSet((C12366g) disposable, null);
    }
}
