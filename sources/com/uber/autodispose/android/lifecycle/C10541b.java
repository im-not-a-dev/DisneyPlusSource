package com.uber.autodispose.android.lifecycle;

import androidx.lifecycle.C0715i;
import androidx.lifecycle.C0715i.C0716a;
import androidx.lifecycle.C0722m;
import p163g.p503n.p504a.C11788b0;
import p163g.p503n.p504a.p507f0.C11809d;
import p163g.p503n.p504a.p507f0.C11810e;
import p163g.p503n.p504a.p507f0.C11812g;
import p163g.p503n.p504a.p507f0.C11813h;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Observable;

/* renamed from: com.uber.autodispose.android.lifecycle.b */
/* compiled from: AndroidLifecycleScopeProvider */
public final class C10541b implements C11812g<C0716a> {

    /* renamed from: c */
    private static final C11809d<C0716a> f24981c = C10540a.f24980c;

    /* renamed from: a */
    private final C11809d<C0716a> f24982a;

    /* renamed from: b */
    private final LifecycleEventsObservable f24983b;

    /* renamed from: com.uber.autodispose.android.lifecycle.b$a */
    /* compiled from: AndroidLifecycleScopeProvider */
    static /* synthetic */ class C10542a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24984a = new int[C0716a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                androidx.lifecycle.i$a[] r0 = androidx.lifecycle.C0715i.C0716a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f24984a = r0
                int[] r0 = f24984a     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.lifecycle.i$a r1 = androidx.lifecycle.C0715i.C0716a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f24984a     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.lifecycle.i$a r1 = androidx.lifecycle.C0715i.C0716a.ON_START     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f24984a     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.lifecycle.i$a r1 = androidx.lifecycle.C0715i.C0716a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f24984a     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.lifecycle.i$a r1 = androidx.lifecycle.C0715i.C0716a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f24984a     // Catch:{ NoSuchFieldError -> 0x0040 }
                androidx.lifecycle.i$a r1 = androidx.lifecycle.C0715i.C0716a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f24984a     // Catch:{ NoSuchFieldError -> 0x004b }
                androidx.lifecycle.i$a r1 = androidx.lifecycle.C0715i.C0716a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uber.autodispose.android.lifecycle.C10541b.C10542a.<clinit>():void");
        }
    }

    /* renamed from: com.uber.autodispose.android.lifecycle.b$b */
    /* compiled from: AndroidLifecycleScopeProvider */
    private static class C10543b implements C11809d<C0716a> {

        /* renamed from: c */
        private final C0716a f24985c;

        C10543b(C0716a aVar) {
            this.f24985c = aVar;
        }

        /* renamed from: a */
        public C0716a apply(C0716a aVar) throws C11788b0 {
            return this.f24985c;
        }
    }

    private C10541b(C0715i iVar, C11809d<C0716a> dVar) {
        this.f24983b = new LifecycleEventsObservable(iVar);
        this.f24982a = dVar;
    }

    /* renamed from: b */
    public Observable<C0716a> mo27433b() {
        return this.f24983b;
    }

    /* renamed from: c */
    public C11809d<C0716a> mo27434c() {
        return this.f24982a;
    }

    /* renamed from: d */
    public CompletableSource mo17612d() {
        return C11813h.m37956a(this);
    }

    /* renamed from: a */
    static /* synthetic */ C0716a m33250a(C0716a aVar) throws C11788b0 {
        int i = C10542a.f24984a[aVar.ordinal()];
        if (i == 1) {
            return C0716a.ON_DESTROY;
        }
        if (i == 2) {
            return C0716a.ON_STOP;
        }
        if (i == 3) {
            return C0716a.ON_PAUSE;
        }
        if (i == 4) {
            return C0716a.ON_STOP;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Lifecycle has ended! Last event was ");
        sb.append(aVar);
        throw new C11810e(sb.toString());
    }

    /* renamed from: a */
    public static C10541b m33254a(C0722m mVar) {
        return m33251a(mVar.getLifecycle());
    }

    /* renamed from: a */
    public static C10541b m33255a(C0722m mVar, C0716a aVar) {
        return m33252a(mVar.getLifecycle(), aVar);
    }

    /* renamed from: a */
    public static C10541b m33251a(C0715i iVar) {
        return m33253a(iVar, f24981c);
    }

    /* renamed from: a */
    public static C10541b m33252a(C0715i iVar, C0716a aVar) {
        return m33253a(iVar, (C11809d<C0716a>) new C10543b<C0716a>(aVar));
    }

    /* renamed from: a */
    public static C10541b m33253a(C0715i iVar, C11809d<C0716a> dVar) {
        return new C10541b(iVar, dVar);
    }

    /* renamed from: a */
    public C0716a m33257a() {
        this.f24983b.mo27428n();
        return this.f24983b.mo27429o();
    }
}
