package com.uber.autodispose.android.lifecycle;

import androidx.lifecycle.C0715i;
import androidx.lifecycle.C0715i.C0716a;
import androidx.lifecycle.C0715i.C0717b;
import androidx.lifecycle.C0721l;
import androidx.lifecycle.C0722m;
import androidx.lifecycle.C0732u;
import p163g.p503n.p504a.p505e0.p506b.C11803c;
import p163g.p503n.p504a.p505e0.p506b.C11804d;
import p520io.reactivex.C11968q;
import p520io.reactivex.Observable;
import p520io.reactivex.subjects.C11976a;

class LifecycleEventsObservable extends Observable<C0716a> {

    /* renamed from: U */
    private final C11976a<C0716a> f24973U = C11976a.m38563p();

    /* renamed from: c */
    private final C0715i f24974c;

    static final class ArchLifecycleObserver extends C11804d implements C0721l {

        /* renamed from: U */
        private final C0715i f24975U;

        /* renamed from: V */
        private final C11968q<? super C0716a> f24976V;

        /* renamed from: W */
        private final C11976a<C0716a> f24977W;

        ArchLifecycleObserver(C0715i iVar, C11968q<? super C0716a> qVar, C11976a<C0716a> aVar) {
            this.f24975U = iVar;
            this.f24976V = qVar;
            this.f24977W = aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo27430b() {
            this.f24975U.mo4135b(this);
        }

        /* access modifiers changed from: 0000 */
        @C0732u(C0716a.ON_ANY)
        public void onStateChange(C0722m mVar, C0716a aVar) {
            if (!isDisposed()) {
                if (!(aVar == C0716a.ON_CREATE && this.f24977W.mo30311o() == aVar)) {
                    this.f24977W.onNext(aVar);
                }
                this.f24976V.onNext(aVar);
            }
        }
    }

    /* renamed from: com.uber.autodispose.android.lifecycle.LifecycleEventsObservable$a */
    static /* synthetic */ class C10539a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24978a = new int[C0717b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                androidx.lifecycle.i$b[] r0 = androidx.lifecycle.C0715i.C0717b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f24978a = r0
                int[] r0 = f24978a     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.lifecycle.i$b r1 = androidx.lifecycle.C0715i.C0717b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f24978a     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.lifecycle.i$b r1 = androidx.lifecycle.C0715i.C0717b.CREATED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f24978a     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.lifecycle.i$b r1 = androidx.lifecycle.C0715i.C0717b.STARTED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f24978a     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.lifecycle.i$b r1 = androidx.lifecycle.C0715i.C0717b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f24978a     // Catch:{ NoSuchFieldError -> 0x0040 }
                androidx.lifecycle.i$b r1 = androidx.lifecycle.C0715i.C0717b.DESTROYED     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uber.autodispose.android.lifecycle.LifecycleEventsObservable.C10539a.<clinit>():void");
        }
    }

    LifecycleEventsObservable(C0715i iVar) {
        this.f24974c = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27408b(C11968q<? super C0716a> qVar) {
        ArchLifecycleObserver archLifecycleObserver = new ArchLifecycleObserver(this.f24974c, qVar, this.f24973U);
        qVar.onSubscribe(archLifecycleObserver);
        if (!C11803c.m37948a()) {
            qVar.onError(new IllegalStateException("Lifecycles can only be bound to on the main thread!"));
            return;
        }
        this.f24974c.mo4134a(archLifecycleObserver);
        if (archLifecycleObserver.isDisposed()) {
            this.f24974c.mo4135b(archLifecycleObserver);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo27428n() {
        C0716a aVar;
        int i = C10539a.f24978a[this.f24974c.mo4133a().ordinal()];
        if (i == 1) {
            aVar = C0716a.ON_CREATE;
        } else if (i == 2) {
            aVar = C0716a.ON_START;
        } else if (i == 3 || i == 4) {
            aVar = C0716a.ON_RESUME;
        } else {
            aVar = C0716a.ON_DESTROY;
        }
        this.f24973U.onNext(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public C0716a mo27429o() {
        return (C0716a) this.f24973U.mo30311o();
    }
}
