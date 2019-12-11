package com.jakewharton.rxrelay2;

import java.lang.reflect.Array;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11968q;
import p520io.reactivex.disposables.Disposable;

/* renamed from: com.jakewharton.rxrelay2.d */
/* compiled from: ReplayRelay */
public final class C10534d<T> extends C10533c<T> {

    /* renamed from: V */
    static final C10537c[] f24960V = new C10537c[0];

    /* renamed from: W */
    private static final Object[] f24961W = new Object[0];

    /* renamed from: U */
    final AtomicReference<C10537c<T>[]> f24962U = new AtomicReference<>(f24960V);

    /* renamed from: c */
    final C10536b<T> f24963c;

    /* renamed from: com.jakewharton.rxrelay2.d$a */
    /* compiled from: ReplayRelay */
    static final class C10535a<T> extends AtomicReference<C10535a<T>> {

        /* renamed from: c */
        final T f24964c;

        C10535a(T t) {
            this.f24964c = t;
        }
    }

    /* renamed from: com.jakewharton.rxrelay2.d$b */
    /* compiled from: ReplayRelay */
    interface C10536b<T> {
        /* renamed from: a */
        void mo27423a(C10537c<T> cVar);

        /* renamed from: a */
        T[] mo27424a(T[] tArr);

        void add(T t);
    }

    /* renamed from: com.jakewharton.rxrelay2.d$c */
    /* compiled from: ReplayRelay */
    static final class C10537c<T> extends AtomicInteger implements Disposable {

        /* renamed from: U */
        final C10534d<T> f24965U;

        /* renamed from: V */
        Object f24966V;

        /* renamed from: W */
        volatile boolean f24967W;

        /* renamed from: c */
        final C11968q<? super T> f24968c;

        C10537c(C11968q<? super T> qVar, C10534d<T> dVar) {
            this.f24968c = qVar;
            this.f24965U = dVar;
        }

        public void dispose() {
            if (!this.f24967W) {
                this.f24967W = true;
                this.f24965U.mo27420b(this);
            }
        }

        public boolean isDisposed() {
            return this.f24967W;
        }
    }

    /* renamed from: com.jakewharton.rxrelay2.d$d */
    /* compiled from: ReplayRelay */
    static final class C10538d<T> extends AtomicReference<Object> implements C10536b<T> {

        /* renamed from: U */
        int f24969U;

        /* renamed from: V */
        volatile C10535a<T> f24970V;

        /* renamed from: W */
        C10535a<T> f24971W;

        /* renamed from: c */
        final int f24972c;

        C10538d(int i) {
            if (i > 0) {
                this.f24972c = i;
                C10535a<T> aVar = new C10535a<>(null);
                this.f24971W = aVar;
                this.f24970V = aVar;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("maxSize > 0 required but it was ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public T[] mo27424a(T[] tArr) {
            C10535a<T> aVar = this.f24970V;
            int a = mo27426a();
            if (a != 0) {
                if (tArr.length < a) {
                    tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a);
                }
                for (int i = 0; i != a; i++) {
                    aVar = (C10535a) aVar.get();
                    tArr[i] = aVar.f24964c;
                }
                if (tArr.length > a) {
                    tArr[a] = null;
                }
            } else if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }

        public void add(T t) {
            C10535a<T> aVar = new C10535a<>(t);
            C10535a<T> aVar2 = this.f24971W;
            this.f24971W = aVar;
            this.f24969U++;
            aVar2.set(aVar);
            mo27427b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo27427b() {
            int i = this.f24969U;
            if (i > this.f24972c) {
                this.f24969U = i - 1;
                this.f24970V = (C10535a) this.f24970V.get();
            }
        }

        /* renamed from: a */
        public void mo27423a(C10537c<T> cVar) {
            if (cVar.getAndIncrement() == 0) {
                int i = 1;
                C11968q<? super T> qVar = cVar.f24968c;
                C10535a<T> aVar = (C10535a) cVar.f24966V;
                if (aVar == null) {
                    aVar = this.f24970V;
                }
                while (!cVar.f24967W) {
                    C10535a<T> aVar2 = (C10535a) aVar.get();
                    if (aVar2 != null) {
                        qVar.onNext(aVar2.f24964c);
                        aVar = aVar2;
                    } else if (aVar.get() != null) {
                        continue;
                    } else {
                        cVar.f24966V = aVar;
                        i = cVar.addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
                cVar.f24966V = null;
            }
        }

        /* renamed from: a */
        public int mo27426a() {
            C10535a<T> aVar = this.f24970V;
            int i = 0;
            while (i != Integer.MAX_VALUE) {
                aVar = (C10535a) aVar.get();
                if (aVar == null) {
                    break;
                }
                i++;
            }
            return i;
        }
    }

    C10534d(C10536b<T> bVar) {
        this.f24963c = bVar;
    }

    /* renamed from: c */
    public static <T> C10534d<T> m33233c(int i) {
        return new C10534d<>(new C10538d(i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo27419a(C10537c<T> cVar) {
        C10537c[] cVarArr;
        C10537c[] cVarArr2;
        do {
            cVarArr = (C10537c[]) this.f24962U.get();
            int length = cVarArr.length;
            cVarArr2 = new C10537c[(length + 1)];
            System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
            cVarArr2[length] = cVar;
        } while (!this.f24962U.compareAndSet(cVarArr, cVarArr2));
        return true;
    }

    public void accept(T t) {
        if (t != null) {
            C10536b<T> bVar = this.f24963c;
            bVar.add(t);
            for (C10537c a : (C10537c[]) this.f24962U.get()) {
                bVar.mo27423a(a);
            }
            return;
        }
        throw new NullPointerException("value == null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        C10537c cVar = new C10537c(qVar, this);
        qVar.onSubscribe(cVar);
        if (!cVar.f24967W) {
            if (!mo27419a(cVar) || !cVar.f24967W) {
                this.f24963c.mo27423a(cVar);
            } else {
                mo27420b(cVar);
            }
        }
    }

    /* renamed from: n */
    public Object[] mo27422n() {
        Object[] b = mo27421b((T[]) f24961W);
        return b == f24961W ? new Object[0] : b;
    }

    /* renamed from: b */
    public T[] mo27421b(T[] tArr) {
        return this.f24963c.mo27424a(tArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo27420b(C10537c<T> cVar) {
        C10537c<T>[] cVarArr;
        C10537c[] cVarArr2;
        do {
            cVarArr = (C10537c[]) this.f24962U.get();
            if (cVarArr != f24960V) {
                int length = cVarArr.length;
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (cVarArr[i2] == cVar) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        cVarArr2 = f24960V;
                    } else {
                        C10537c[] cVarArr3 = new C10537c[(length - 1)];
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
        } while (!this.f24962U.compareAndSet(cVarArr, cVarArr2));
    }
}
