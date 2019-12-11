package kotlinx.coroutines.p594l2;

import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p573a0.C12683c;
import kotlin.p573a0.C12688f;
import kotlinx.coroutines.C13230d1;
import kotlinx.coroutines.C13233e0;
import kotlinx.coroutines.C13246h0;
import kotlinx.coroutines.C13324k1;
import kotlinx.coroutines.C13415y;
import kotlinx.coroutines.p592j2.C13316l;
import p520io.reactivex.C11961o;
import p520io.reactivex.C11962p;
import p520io.reactivex.Observable;
import p520io.reactivex.p530x.C12003b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000F\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\u001a[\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2/\b\u0001\u0010\n\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a_\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0000\u0010\u0006*\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\t2-\u0010\n\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b¢\u0006\u0002\b\u000fH\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a\f\u0010\u0015\u001a\u00020\u0016*\u00020\u0017H\u0000\u001a_\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0000\u0010\u0006*\u00020\u0007*\u00020\u00132\b\b\u0002\u0010\b\u001a\u00020\t2/\b\u0001\u0010\n\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, mo31007d2 = {"CLOSED", "", "OPEN", "SIGNALLED", "rxObservable", "Lio/reactivex/Observable;", "T", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Observable;", "rxObservableInternal", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Observable;", "isFatal", "", "", "kotlinx-coroutines-rx2"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* renamed from: kotlinx.coroutines.l2.f */
/* compiled from: RxObservable.kt */
public final class C13340f {

    /* renamed from: kotlinx.coroutines.l2.f$a */
    /* compiled from: RxObservable.kt */
    static final class C13341a<T> implements C11962p<T> {

        /* renamed from: a */
        final /* synthetic */ C13233e0 f29786a;

        /* renamed from: b */
        final /* synthetic */ C12688f f29787b;

        /* renamed from: c */
        final /* synthetic */ Function2 f29788c;

        C13341a(C13233e0 e0Var, C12688f fVar, Function2 function2) {
            this.f29786a = e0Var;
            this.f29787b = fVar;
            this.f29788c = function2;
        }

        /* renamed from: a */
        public final void mo30271a(C11961o<T> oVar) {
            C13338e eVar = new C13338e(C13415y.m41267a(this.f29786a, this.f29787b), oVar);
            oVar.mo30270a(new C13332a(eVar));
            eVar.mo34329a(C13246h0.DEFAULT, eVar, this.f29788c);
        }
    }

    /* renamed from: a */
    public static final <T> Observable<T> m40981a(C12688f fVar, Function2<? super C13316l<? super T>, ? super C12683c<? super C13145v>, ? extends Object> function2) {
        if (fVar.get(C13324k1.f29761e) == null) {
            return m40982a(C13230d1.f29658c, fVar, function2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Observable context cannot contain job in it.");
        sb.append("Its lifecycle should be managed via Disposable handle. Had ");
        sb.append(fVar);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: a */
    private static final <T> Observable<T> m40982a(C13233e0 e0Var, C12688f fVar, Function2<? super C13316l<? super T>, ? super C12683c<? super C13145v>, ? extends Object> function2) {
        Observable<T> a = Observable.m38301a((C11962p<T>) new C13341a<T>(e0Var, fVar, function2));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "Observable.create { subs…AULT, coroutine, block)\n}");
        return a;
    }

    /* renamed from: a */
    public static final boolean m40983a(Throwable th) {
        try {
            C12003b.m38614b(th);
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }
}
