package p163g.p503n.p504a.p507f0;

import java.util.Comparator;
import p163g.p503n.p504a.C11788b0;
import p163g.p503n.p504a.C11825m;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Observable;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;

/* renamed from: g.n.a.f0.h */
/* compiled from: LifecycleScopes */
public final class C11813h {

    /* renamed from: a */
    private static final Comparator<Comparable<Object>> f27450a = C11808c.f27449c;

    /* renamed from: a */
    public static <E> CompletableSource m37956a(C11812g<E> gVar) throws C11788b0 {
        return m37957a(gVar, true);
    }

    /* renamed from: a */
    public static <E> CompletableSource m37957a(C11812g<E> gVar, boolean z) throws C11788b0 {
        Object a = gVar.mo27432a();
        C11809d c = gVar.mo27434c();
        if (a != null) {
            try {
                return m37958a(gVar.mo27433b(), (E) c.apply(a));
            } catch (Exception e) {
                if (!z || !(e instanceof C11810e)) {
                    return Completable.m38154a((Throwable) e);
                }
                Consumer b = C11825m.m37971b();
                if (b != null) {
                    try {
                        b.accept((C11810e) e);
                        return Completable.m38169h();
                    } catch (Exception e2) {
                        return Completable.m38154a((Throwable) e2);
                    }
                } else {
                    throw e;
                }
            }
        } else {
            throw new C11811f();
        }
    }

    /* renamed from: a */
    public static <E> CompletableSource m37958a(Observable<E> observable, E e) {
        return m37959a(observable, e, e instanceof Comparable ? f27450a : null);
    }

    /* renamed from: a */
    static /* synthetic */ boolean m37961a(Comparator comparator, Object obj, Object obj2) throws Exception {
        return comparator.compare(obj2, obj) >= 0;
    }

    /* renamed from: a */
    public static <E> CompletableSource m37959a(Observable<E> observable, E e, Comparator<E> comparator) {
        C11952h hVar;
        if (comparator != null) {
            hVar = new C11806a(comparator, e);
        } else {
            hVar = new C11807b(e);
        }
        return observable.mo30175c(1).mo30181c(hVar).mo30190f();
    }
}
