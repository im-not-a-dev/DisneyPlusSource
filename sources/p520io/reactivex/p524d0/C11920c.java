package p520io.reactivex.p524d0;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.C11947c;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001aF\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0005\"\b\b\u0001\u0010\u0004*\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0007H\u0007\u001aa\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\b0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0005\"\b\b\u0001\u0010\u0004*\u00020\u0005\"\b\b\u0002\u0010\b*\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00072\u001a\b\u0004\u0010\t\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\b0\nH\b¨\u0006\u000b"}, mo31007d2 = {"zipWith", "Lio/reactivex/Single;", "Lkotlin/Pair;", "T", "U", "", "other", "Lio/reactivex/SingleSource;", "R", "zipper", "Lkotlin/Function2;", "rxkotlin"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* renamed from: io.reactivex.d0.c */
/* compiled from: Singles.kt */
public final class C11920c {

    /* renamed from: io.reactivex.d0.c$a */
    /* compiled from: Singles.kt */
    static final class C11921a<T1, T2, R> implements C11947c<T, U, Pair<? extends T, ? extends U>> {

        /* renamed from: a */
        public static final C11921a f27602a = new C11921a();

        C11921a() {
        }

        public final Pair<T, U> apply(T t, U u) {
            return new Pair<>(t, u);
        }
    }

    /* renamed from: a */
    public static final <T, U> Single<Pair<T, U>> m38475a(Single<T> single, SingleSource<U> singleSource) {
        Single<Pair<T, U>> a = single.mo30205a(singleSource, (C11947c<? super T, ? super U, ? extends R>) C11921a.f27602a);
        C12880j.m40222a((Object) a, "zipWith(other, BiFunction { t, u -> Pair(t, u) })");
        return a;
    }
}
