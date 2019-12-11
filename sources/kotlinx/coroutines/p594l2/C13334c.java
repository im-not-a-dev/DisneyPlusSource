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
import p520io.reactivex.C11914c;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableEmitter;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aA\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¢\u0006\u0002\b\nø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001aI\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00032'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¢\u0006\u0002\b\nH\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001aG\u0010\u0000\u001a\u00020\u0001*\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u00032'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, mo31007d2 = {"rxCompletable", "Lio/reactivex/Completable;", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Completable;", "rxCompletableInternal", "scope", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Completable;", "kotlinx-coroutines-rx2"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* renamed from: kotlinx.coroutines.l2.c */
/* compiled from: RxCompletable.kt */
public final class C13334c {

    /* renamed from: kotlinx.coroutines.l2.c$a */
    /* compiled from: RxCompletable.kt */
    static final class C13335a implements C11914c {

        /* renamed from: a */
        final /* synthetic */ C13233e0 f29769a;

        /* renamed from: b */
        final /* synthetic */ C12688f f29770b;

        /* renamed from: c */
        final /* synthetic */ Function2 f29771c;

        C13335a(C13233e0 e0Var, C12688f fVar, Function2 function2) {
            this.f29769a = e0Var;
            this.f29770b = fVar;
            this.f29771c = function2;
        }

        public final void subscribe(CompletableEmitter completableEmitter) {
            C13333b bVar = new C13333b(C13415y.m41267a(this.f29769a, this.f29770b), completableEmitter);
            completableEmitter.mo30057a(new C13332a(bVar));
            bVar.mo34329a(C13246h0.DEFAULT, bVar, this.f29771c);
        }
    }

    /* renamed from: a */
    public static final Completable m40966a(C12688f fVar, Function2<? super C13233e0, ? super C12683c<? super C13145v>, ? extends Object> function2) {
        if (fVar.get(C13324k1.f29761e) == null) {
            return m40967a(C13230d1.f29658c, fVar, function2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Completable context cannot contain job in it.");
        sb.append("Its lifecycle should be managed via Disposable handle. Had ");
        sb.append(fVar);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: a */
    private static final Completable m40967a(C13233e0 e0Var, C12688f fVar, Function2<? super C13233e0, ? super C12683c<? super C13145v>, ? extends Object> function2) {
        Completable a = Completable.m38151a((C11914c) new C13335a(e0Var, fVar, function2));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "Completable.create { sub…AULT, coroutine, block)\n}");
        return a;
    }
}
