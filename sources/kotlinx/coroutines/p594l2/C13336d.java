package kotlinx.coroutines.p594l2;

import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.p573a0.C12683c;
import kotlin.p573a0.C12688f;
import kotlin.p573a0.p575i.p576a.C12706f;
import kotlin.p573a0.p575i.p576a.C12714m;
import kotlinx.coroutines.p592j2.C13316l;
import kotlinx.coroutines.p592j2.C13318n;
import p520io.reactivex.Observable;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a'\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0000\u0010\u0007*\u00020\b*\b\u0012\u0004\u0012\u0002H\u00070\tH\u0007¢\u0006\u0002\b\n\u001a(\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\f\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00070\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a*\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000f\"\b\b\u0000\u0010\u0007*\u00020\b*\b\u0012\u0004\u0012\u0002H\u00070\u00102\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a'\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000f\"\b\b\u0000\u0010\u0007*\u00020\b*\b\u0012\u0004\u0012\u0002H\u00070\tH\u0007¢\u0006\u0002\b\n\u001a*\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0012\"\b\b\u0000\u0010\u0007*\u00020\b*\b\u0012\u0004\u0012\u0002H\u00070\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0013"}, mo31007d2 = {"asCompletable", "Lio/reactivex/Completable;", "Lkotlinx/coroutines/Job;", "context", "Lkotlin/coroutines/CoroutineContext;", "asFlowable", "Lio/reactivex/Flowable;", "T", "", "Lkotlinx/coroutines/flow/Flow;", "from", "asMaybe", "Lio/reactivex/Maybe;", "Lkotlinx/coroutines/Deferred;", "asObservable", "Lio/reactivex/Observable;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "asSingle", "Lio/reactivex/Single;", "kotlinx-coroutines-rx2"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* renamed from: kotlinx.coroutines.l2.d */
/* compiled from: RxConvert.kt */
public final class C13336d {

    @C12706f(mo31052c = "kotlinx.coroutines.rx2.RxConvertKt$asObservable$1", mo31053f = "RxConvert.kt", mo31054l = {78, 79}, mo31055m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.l2.d$a */
    /* compiled from: RxConvert.kt */
    static final class C13337a extends C12714m implements Function2<C13316l<? super T>, C12683c<? super C13145v>, Object> {

        /* renamed from: X */
        private C13316l f29772X;

        /* renamed from: Y */
        Object f29773Y;

        /* renamed from: Z */
        Object f29774Z;

        /* renamed from: a0 */
        Object f29775a0;

        /* renamed from: b0 */
        int f29776b0;

        /* renamed from: c0 */
        final /* synthetic */ C13318n f29777c0;

        C13337a(C13318n nVar, C12683c cVar) {
            this.f29777c0 = nVar;
            super(2, cVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x005c  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo5580a(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.p573a0.p574h.C12700d.m39820a()
                int r1 = r7.f29776b0
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0034
                if (r1 == r3) goto L_0x0026
                if (r1 != r2) goto L_0x001e
                java.lang.Object r1 = r7.f29775a0
                kotlinx.coroutines.j2.f r1 = (kotlinx.coroutines.p592j2.C13306f) r1
                java.lang.Object r4 = r7.f29773Y
                kotlinx.coroutines.j2.l r4 = (kotlinx.coroutines.p592j2.C13316l) r4
                kotlin.C12903o.m40241a(r8)
                r8 = r7
                r6 = r4
                r4 = r0
                r0 = r6
                goto L_0x0042
            L_0x001e:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x0026:
                java.lang.Object r1 = r7.f29774Z
                kotlinx.coroutines.j2.f r1 = (kotlinx.coroutines.p592j2.C13306f) r1
                java.lang.Object r4 = r7.f29773Y
                kotlinx.coroutines.j2.l r4 = (kotlinx.coroutines.p592j2.C13316l) r4
                kotlin.C12903o.m40241a(r8)
                r5 = r0
                r0 = r7
                goto L_0x0054
            L_0x0034:
                kotlin.C12903o.m40241a(r8)
                kotlinx.coroutines.j2.l r8 = r7.f29772X
                kotlinx.coroutines.j2.n r1 = r7.f29777c0
                kotlinx.coroutines.j2.f r1 = r1.iterator()
                r4 = r0
                r0 = r8
                r8 = r7
            L_0x0042:
                r8.f29773Y = r0
                r8.f29774Z = r1
                r8.f29776b0 = r3
                java.lang.Object r5 = r1.mo34476a(r8)
                if (r5 != r4) goto L_0x004f
                return r4
            L_0x004f:
                r6 = r0
                r0 = r8
                r8 = r5
                r5 = r4
                r4 = r6
            L_0x0054:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L_0x0073
                java.lang.Object r8 = r1.next()
                r0.f29773Y = r4
                r0.f29774Z = r8
                r0.f29775a0 = r1
                r0.f29776b0 = r2
                java.lang.Object r8 = r4.mo34502a(r8, r0)
                if (r8 != r5) goto L_0x006f
                return r5
            L_0x006f:
                r8 = r0
                r0 = r4
                r4 = r5
                goto L_0x0042
            L_0x0073:
                kotlin.v r8 = kotlin.C13145v.f29587a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p594l2.C13336d.C13337a.mo5580a(java.lang.Object):java.lang.Object");
        }

        /* renamed from: a */
        public final C12683c<C13145v> mo5581a(Object obj, C12683c<?> cVar) {
            C13337a aVar = new C13337a(this.f29777c0, cVar);
            aVar.f29772X = (C13316l) obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C13337a) mo5581a(obj, (C12683c) obj2)).mo5580a(C13145v.f29587a);
        }
    }

    /* renamed from: a */
    public static final <T> Observable<T> m40968a(C13318n<? extends T> nVar, C12688f fVar) {
        return C13340f.m40981a(fVar, new C13337a(nVar, null));
    }
}
