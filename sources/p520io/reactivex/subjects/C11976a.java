package p520io.reactivex.subjects;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p520io.reactivex.C11968q;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p547j.C12540a;
import p520io.reactivex.p531y.p547j.C12540a.C12541a;
import p520io.reactivex.p531y.p547j.C12548h;
import p520io.reactivex.p531y.p547j.C12551j;

/* renamed from: io.reactivex.subjects.a */
/* compiled from: BehaviorSubject */
public final class C11976a<T> extends C11983e<T> {

    /* renamed from: a0 */
    static final C11977a[] f27671a0 = new C11977a[0];

    /* renamed from: b0 */
    static final C11977a[] f27672b0 = new C11977a[0];

    /* renamed from: U */
    final AtomicReference<C11977a<T>[]> f27673U;

    /* renamed from: V */
    final ReadWriteLock f27674V;

    /* renamed from: W */
    final Lock f27675W;

    /* renamed from: X */
    final Lock f27676X;

    /* renamed from: Y */
    final AtomicReference<Throwable> f27677Y;

    /* renamed from: Z */
    long f27678Z;

    /* renamed from: c */
    final AtomicReference<Object> f27679c;

    /* renamed from: io.reactivex.subjects.a$a */
    /* compiled from: BehaviorSubject */
    static final class C11977a<T> implements Disposable, C12541a<Object> {

        /* renamed from: U */
        final C11976a<T> f27680U;

        /* renamed from: V */
        boolean f27681V;

        /* renamed from: W */
        boolean f27682W;

        /* renamed from: X */
        C12540a<Object> f27683X;

        /* renamed from: Y */
        boolean f27684Y;

        /* renamed from: Z */
        volatile boolean f27685Z;

        /* renamed from: a0 */
        long f27686a0;

        /* renamed from: c */
        final C11968q<? super T> f27687c;

        C11977a(C11968q<? super T> qVar, C11976a<T> aVar) {
            this.f27687c = qVar;
            this.f27680U = aVar;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
            if (r0 == null) goto L_0x003d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
            if (test(r0) == false) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
            mo30314b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo30312a() {
            /*
                r4 = this;
                boolean r0 = r4.f27685Z
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r4)
                boolean r0 = r4.f27685Z     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x000c
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                return
            L_0x000c:
                boolean r0 = r4.f27681V     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x0012
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                return
            L_0x0012:
                io.reactivex.subjects.a<T> r0 = r4.f27680U     // Catch:{ all -> 0x003e }
                java.util.concurrent.locks.Lock r1 = r0.f27675W     // Catch:{ all -> 0x003e }
                r1.lock()     // Catch:{ all -> 0x003e }
                long r2 = r0.f27678Z     // Catch:{ all -> 0x003e }
                r4.f27686a0 = r2     // Catch:{ all -> 0x003e }
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r0.f27679c     // Catch:{ all -> 0x003e }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x003e }
                r1.unlock()     // Catch:{ all -> 0x003e }
                r1 = 1
                if (r0 == 0) goto L_0x002b
                r2 = 1
                goto L_0x002c
            L_0x002b:
                r2 = 0
            L_0x002c:
                r4.f27682W = r2     // Catch:{ all -> 0x003e }
                r4.f27681V = r1     // Catch:{ all -> 0x003e }
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x003d
                boolean r0 = r4.test(r0)
                if (r0 == 0) goto L_0x003a
                return
            L_0x003a:
                r4.mo30314b()
            L_0x003d:
                return
            L_0x003e:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p520io.reactivex.subjects.C11976a.C11977a.mo30312a():void");
        }

        /* JADX INFO: used method not loaded: io.reactivex.y.j.a.a(io.reactivex.y.j.a$a):null, types can be incorrect */
        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
            r0.mo30662a((p520io.reactivex.p531y.p547j.C12540a.C12541a) r2);
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo30314b() {
            /*
                r2 = this;
            L_0x0000:
                boolean r0 = r2.f27685Z
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r2)
                io.reactivex.y.j.a<java.lang.Object> r0 = r2.f27683X     // Catch:{ all -> 0x0017 }
                if (r0 != 0) goto L_0x000f
                r0 = 0
                r2.f27682W = r0     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                return
            L_0x000f:
                r1 = 0
                r2.f27683X = r1     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                r0.mo30662a(r2)
                goto L_0x0000
            L_0x0017:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p520io.reactivex.subjects.C11976a.C11977a.mo30314b():void");
        }

        public void dispose() {
            if (!this.f27685Z) {
                this.f27685Z = true;
                this.f27680U.mo30308b(this);
            }
        }

        public boolean isDisposed() {
            return this.f27685Z;
        }

        public boolean test(Object obj) {
            return this.f27685Z || C12551j.m39362a(obj, this.f27687c);
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0031, code lost:
            r3.f27684Y = true;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo30313a(java.lang.Object r4, long r5) {
            /*
                r3 = this;
                boolean r0 = r3.f27685Z
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                boolean r0 = r3.f27684Y
                if (r0 != 0) goto L_0x0037
                monitor-enter(r3)
                boolean r0 = r3.f27685Z     // Catch:{ all -> 0x0034 }
                if (r0 == 0) goto L_0x0010
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x0010:
                long r0 = r3.f27686a0     // Catch:{ all -> 0x0034 }
                int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r2 != 0) goto L_0x0018
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x0018:
                boolean r5 = r3.f27682W     // Catch:{ all -> 0x0034 }
                if (r5 == 0) goto L_0x002d
                io.reactivex.y.j.a<java.lang.Object> r5 = r3.f27683X     // Catch:{ all -> 0x0034 }
                if (r5 != 0) goto L_0x0028
                io.reactivex.y.j.a r5 = new io.reactivex.y.j.a     // Catch:{ all -> 0x0034 }
                r6 = 4
                r5.<init>(r6)     // Catch:{ all -> 0x0034 }
                r3.f27683X = r5     // Catch:{ all -> 0x0034 }
            L_0x0028:
                r5.mo30663a(r4)     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x002d:
                r5 = 1
                r3.f27681V = r5     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                r3.f27684Y = r5
                goto L_0x0037
            L_0x0034:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                throw r4
            L_0x0037:
                r3.test(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p520io.reactivex.subjects.C11976a.C11977a.mo30313a(java.lang.Object, long):void");
        }
    }

    C11976a() {
        this.f27674V = new ReentrantReadWriteLock();
        this.f27675W = this.f27674V.readLock();
        this.f27676X = this.f27674V.writeLock();
        this.f27673U = new AtomicReference<>(f27671a0);
        this.f27679c = new AtomicReference<>();
        this.f27677Y = new AtomicReference<>();
    }

    /* renamed from: e */
    public static <T> C11976a<T> m38562e(T t) {
        return new C11976a<>(t);
    }

    /* renamed from: p */
    public static <T> C11976a<T> m38563p() {
        return new C11976a<>();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo30307a(C11977a<T> aVar) {
        C11977a[] aVarArr;
        C11977a[] aVarArr2;
        do {
            aVarArr = (C11977a[]) this.f27673U.get();
            if (aVarArr == f27672b0) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C11977a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f27673U.compareAndSet(aVarArr, aVarArr2));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        C11977a aVar = new C11977a(qVar, this);
        qVar.onSubscribe(aVar);
        if (!mo30307a(aVar)) {
            Throwable th = (Throwable) this.f27677Y.get();
            if (th == C12548h.f29081a) {
                qVar.onComplete();
            } else {
                qVar.onError(th);
            }
        } else if (aVar.f27685Z) {
            mo30308b(aVar);
        } else {
            aVar.mo30312a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo30309c(Object obj) {
        this.f27676X.lock();
        this.f27678Z++;
        this.f27679c.lazySet(obj);
        this.f27676X.unlock();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C11977a<T>[] mo30310d(Object obj) {
        C11977a<T>[] aVarArr = (C11977a[]) this.f27673U.getAndSet(f27672b0);
        if (aVarArr != f27672b0) {
            mo30309c(obj);
        }
        return aVarArr;
    }

    /* renamed from: o */
    public T mo30311o() {
        T t = this.f27679c.get();
        if (C12551j.m39366c(t) || C12551j.m39367d(t)) {
            return null;
        }
        C12551j.m39364b(t);
        return t;
    }

    public void onComplete() {
        if (this.f27677Y.compareAndSet(null, C12548h.f29081a)) {
            Object a = C12551j.m39357a();
            for (C11977a a2 : mo30310d(a)) {
                a2.mo30313a(a, this.f27678Z);
            }
        }
    }

    public void onError(Throwable th) {
        C12036b.m38663a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f27677Y.compareAndSet(null, th)) {
            C11915a.m38466b(th);
            return;
        }
        Object a = C12551j.m39359a(th);
        for (C11977a a2 : mo30310d(a)) {
            a2.mo30313a(a, this.f27678Z);
        }
    }

    public void onNext(T t) {
        C12036b.m38663a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f27677Y.get() == null) {
            C12551j.m39368e(t);
            mo30309c(t);
            for (C11977a a : (C11977a[]) this.f27673U.get()) {
                a.mo30313a(t, this.f27678Z);
            }
        }
    }

    public void onSubscribe(Disposable disposable) {
        if (this.f27677Y.get() != null) {
            disposable.dispose();
        }
    }

    C11976a(T t) {
        this();
        AtomicReference<Object> atomicReference = this.f27679c;
        C12036b.m38663a(t, "defaultValue is null");
        atomicReference.lazySet(t);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo30308b(C11977a<T> aVar) {
        C11977a<T>[] aVarArr;
        C11977a[] aVarArr2;
        do {
            aVarArr = (C11977a[]) this.f27673U.get();
            int length = aVarArr.length;
            if (length != 0) {
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (aVarArr[i2] == aVar) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        aVarArr2 = f27671a0;
                    } else {
                        C11977a[] aVarArr3 = new C11977a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                        System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                        aVarArr2 = aVarArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.f27673U.compareAndSet(aVarArr, aVarArr2));
    }
}
