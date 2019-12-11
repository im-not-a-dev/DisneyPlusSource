package com.jakewharton.rxrelay2;

import com.jakewharton.rxrelay2.C10529a.C10530a;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p520io.reactivex.C11968q;
import p520io.reactivex.disposables.Disposable;

public final class BehaviorRelay<T> extends C10533c<T> {

    /* renamed from: Y */
    static final C10528a[] f24938Y = new C10528a[0];

    /* renamed from: U */
    final AtomicReference<C10528a<T>[]> f24939U = new AtomicReference<>(f24938Y);

    /* renamed from: V */
    final Lock f24940V;

    /* renamed from: W */
    final Lock f24941W;

    /* renamed from: X */
    long f24942X;

    /* renamed from: c */
    final AtomicReference<T> f24943c = new AtomicReference<>();

    /* renamed from: com.jakewharton.rxrelay2.BehaviorRelay$a */
    static final class C10528a<T> implements Disposable, C10530a<T> {

        /* renamed from: U */
        final BehaviorRelay<T> f24944U;

        /* renamed from: V */
        boolean f24945V;

        /* renamed from: W */
        boolean f24946W;

        /* renamed from: X */
        C10529a<T> f24947X;

        /* renamed from: Y */
        boolean f24948Y;

        /* renamed from: Z */
        volatile boolean f24949Z;

        /* renamed from: a0 */
        long f24950a0;

        /* renamed from: c */
        final C11968q<? super T> f24951c;

        C10528a(C11968q<? super T> qVar, BehaviorRelay<T> behaviorRelay) {
            this.f24951c = qVar;
            this.f24944U = behaviorRelay;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
            if (r0 == null) goto L_0x0039;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
            test(r0);
            mo27413b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo27411a() {
            /*
                r4 = this;
                boolean r0 = r4.f24949Z
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r4)
                boolean r0 = r4.f24949Z     // Catch:{ all -> 0x003a }
                if (r0 == 0) goto L_0x000c
                monitor-exit(r4)     // Catch:{ all -> 0x003a }
                return
            L_0x000c:
                boolean r0 = r4.f24945V     // Catch:{ all -> 0x003a }
                if (r0 == 0) goto L_0x0012
                monitor-exit(r4)     // Catch:{ all -> 0x003a }
                return
            L_0x0012:
                com.jakewharton.rxrelay2.BehaviorRelay<T> r0 = r4.f24944U     // Catch:{ all -> 0x003a }
                java.util.concurrent.locks.Lock r1 = r0.f24940V     // Catch:{ all -> 0x003a }
                r1.lock()     // Catch:{ all -> 0x003a }
                long r2 = r0.f24942X     // Catch:{ all -> 0x003a }
                r4.f24950a0 = r2     // Catch:{ all -> 0x003a }
                java.util.concurrent.atomic.AtomicReference<T> r0 = r0.f24943c     // Catch:{ all -> 0x003a }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x003a }
                r1.unlock()     // Catch:{ all -> 0x003a }
                r1 = 1
                if (r0 == 0) goto L_0x002b
                r2 = 1
                goto L_0x002c
            L_0x002b:
                r2 = 0
            L_0x002c:
                r4.f24946W = r2     // Catch:{ all -> 0x003a }
                r4.f24945V = r1     // Catch:{ all -> 0x003a }
                monitor-exit(r4)     // Catch:{ all -> 0x003a }
                if (r0 == 0) goto L_0x0039
                r4.test(r0)
                r4.mo27413b()
            L_0x0039:
                return
            L_0x003a:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x003a }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.jakewharton.rxrelay2.BehaviorRelay.C10528a.mo27411a():void");
        }

        /* JADX INFO: used method not loaded: com.jakewharton.rxrelay2.a.a(com.jakewharton.rxrelay2.a$a):null, types can be incorrect */
        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
            r0.mo27414a((com.jakewharton.rxrelay2.C10529a.C10530a) r2);
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo27413b() {
            /*
                r2 = this;
            L_0x0000:
                boolean r0 = r2.f24949Z
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r2)
                com.jakewharton.rxrelay2.a<T> r0 = r2.f24947X     // Catch:{ all -> 0x0017 }
                if (r0 != 0) goto L_0x000f
                r0 = 0
                r2.f24946W = r0     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                return
            L_0x000f:
                r1 = 0
                r2.f24947X = r1     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                r0.mo27414a(r2)
                goto L_0x0000
            L_0x0017:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.jakewharton.rxrelay2.BehaviorRelay.C10528a.mo27413b():void");
        }

        public void dispose() {
            if (!this.f24949Z) {
                this.f24949Z = true;
                this.f24944U.mo27407b(this);
            }
        }

        public boolean isDisposed() {
            return this.f24949Z;
        }

        public boolean test(T t) {
            if (!this.f24949Z) {
                this.f24951c.onNext(t);
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0031, code lost:
            r3.f24948Y = true;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo27412a(T r4, long r5) {
            /*
                r3 = this;
                boolean r0 = r3.f24949Z
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                boolean r0 = r3.f24948Y
                if (r0 != 0) goto L_0x0037
                monitor-enter(r3)
                boolean r0 = r3.f24949Z     // Catch:{ all -> 0x0034 }
                if (r0 == 0) goto L_0x0010
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x0010:
                long r0 = r3.f24950a0     // Catch:{ all -> 0x0034 }
                int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r2 != 0) goto L_0x0018
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x0018:
                boolean r5 = r3.f24946W     // Catch:{ all -> 0x0034 }
                if (r5 == 0) goto L_0x002d
                com.jakewharton.rxrelay2.a<T> r5 = r3.f24947X     // Catch:{ all -> 0x0034 }
                if (r5 != 0) goto L_0x0028
                com.jakewharton.rxrelay2.a r5 = new com.jakewharton.rxrelay2.a     // Catch:{ all -> 0x0034 }
                r6 = 4
                r5.<init>(r6)     // Catch:{ all -> 0x0034 }
                r3.f24947X = r5     // Catch:{ all -> 0x0034 }
            L_0x0028:
                r5.mo27415a(r4)     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x002d:
                r5 = 1
                r3.f24945V = r5     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                r3.f24948Y = r5
                goto L_0x0037
            L_0x0034:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                throw r4
            L_0x0037:
                r3.test(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.jakewharton.rxrelay2.BehaviorRelay.C10528a.mo27412a(java.lang.Object, long):void");
        }
    }

    BehaviorRelay() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f24940V = reentrantReadWriteLock.readLock();
        this.f24941W = reentrantReadWriteLock.writeLock();
    }

    /* renamed from: o */
    public static <T> BehaviorRelay<T> m33217o() {
        return new BehaviorRelay<>();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27406a(C10528a<T> aVar) {
        C10528a[] aVarArr;
        C10528a[] aVarArr2;
        do {
            aVarArr = (C10528a[]) this.f24939U.get();
            int length = aVarArr.length;
            aVarArr2 = new C10528a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f24939U.compareAndSet(aVarArr, aVarArr2));
    }

    public void accept(T t) {
        if (t != null) {
            mo27409c(t);
            for (C10528a a : (C10528a[]) this.f24939U.get()) {
                a.mo27412a(t, this.f24942X);
            }
            return;
        }
        throw new NullPointerException("value == null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        C10528a aVar = new C10528a(qVar, this);
        qVar.onSubscribe(aVar);
        mo27406a(aVar);
        if (aVar.f24949Z) {
            mo27407b(aVar);
        } else {
            aVar.mo27411a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo27409c(T t) {
        this.f24941W.lock();
        this.f24942X++;
        this.f24943c.lazySet(t);
        this.f24941W.unlock();
    }

    /* renamed from: n */
    public T mo27410n() {
        return this.f24943c.get();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo27407b(C10528a<T> aVar) {
        C10528a<T>[] aVarArr;
        C10528a[] aVarArr2;
        do {
            aVarArr = (C10528a[]) this.f24939U.get();
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
                        aVarArr2 = f24938Y;
                    } else {
                        C10528a[] aVarArr3 = new C10528a[(length - 1)];
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
        } while (!this.f24939U.compareAndSet(aVarArr, aVarArr2));
    }
}
