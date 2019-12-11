package p520io.reactivex.disposables;

import p520io.reactivex.functions.C11945a;
import p520io.reactivex.p531y.p532a.C12011d;
import p520io.reactivex.p531y.p533b.C12015a;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.disposables.b */
/* compiled from: Disposables */
public final class C11929b {
    /* renamed from: a */
    public static Disposable m38492a(Runnable runnable) {
        C12036b.m38663a(runnable, "run is null");
        return new C11931d(runnable);
    }

    /* renamed from: b */
    public static Disposable m38493b() {
        return m38492a(C12015a.f27743b);
    }

    /* renamed from: a */
    public static Disposable m38491a(C11945a aVar) {
        C12036b.m38663a(aVar, "run is null");
        return new C11928a(aVar);
    }

    /* renamed from: a */
    public static Disposable m38490a() {
        return C12011d.INSTANCE;
    }
}
