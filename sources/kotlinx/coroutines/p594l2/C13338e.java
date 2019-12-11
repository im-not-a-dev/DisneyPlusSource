package kotlinx.coroutines.p594l2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.p573a0.C12683c;
import kotlin.p573a0.C12688f;
import kotlin.p573a0.p575i.p576a.C12704d;
import kotlin.p573a0.p575i.p576a.C12706f;
import kotlinx.coroutines.C13210a;
import kotlinx.coroutines.C13218b0;
import kotlinx.coroutines.p592j2.C13316l;
import kotlinx.coroutines.p592j2.C13321q;
import kotlinx.coroutines.p596n2.C13367b;
import kotlinx.coroutines.p597o2.C13372b;
import kotlinx.coroutines.p597o2.C13372b.C13373a;
import kotlinx.coroutines.p597o2.C13380d;
import p520io.reactivex.C11961o;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0012\u0004\u0012\u00028\u00000\u00052\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006B\u001d\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001c\u001a\u00020\u001b2\u0014\u0010\u001a\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00040\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0010H\u0014¢\u0006\u0004\b!\u0010\u0018J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0004H\u0014¢\u0006\u0004\b#\u0010$JX\u0010+\u001a\u00020\u0004\"\u0004\b\u0001\u0010%2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010&2\u0006\u0010\u001e\u001a\u00028\u00002(\u0010*\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010)\u0012\u0006\u0012\u0004\u0018\u00010\u00010(H\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001b\u0010-\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u001b\u0010/\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b/\u0010.J!\u00100\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b0\u0010\u0018J\u000f\u00101\u001a\u00020\u0004H\u0002¢\u0006\u0004\b1\u00102R\u001c\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0016\u00106\u001a\u00020\u00108V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u001c\u00108\u001a\u00020\u00108\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b8\u00107R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<R(\u0010?\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00068V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010@\u0002\u0004\n\u0002\b\u0019¨\u0006A"}, mo31007d2 = {"Lkotlinx/coroutines/rx2/RxObservableCoroutine;", "", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlinx/coroutines/selects/SelectClause2;", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Lio/reactivex/ObservableEmitter;", "subscriber", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lio/reactivex/ObservableEmitter;)V", "", "cause", "", "close", "(Ljava/lang/Throwable;)Z", "elem", "doLockedNext", "(Ljava/lang/Object;)V", "handled", "doLockedSignalCompleted", "(Ljava/lang/Throwable;Z)V", "Lkotlin/Function1;", "handler", "", "invokeOnClose", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Void;", "element", "offer", "(Ljava/lang/Object;)Z", "onCancelled", "value", "onCompleted", "(Lkotlin/Unit;)V", "R", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "registerSelectClause2", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendSuspend", "signalCompleted", "unlockAndCheckCompleted", "()V", "getChannel", "()Lkotlinx/coroutines/channels/SendChannel;", "channel", "isClosedForSend", "()Z", "isFull", "Z", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSend", "Lio/reactivex/ObservableEmitter;", "kotlinx-coroutines-rx2"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlinx.coroutines.l2.e */
/* compiled from: RxObservable.kt */
final class C13338e<T> extends C13210a<C13145v> implements C13316l<T>, C13367b<T, C13321q<? super T>> {

    /* renamed from: Y */
    private static final AtomicIntegerFieldUpdater f29778Y = AtomicIntegerFieldUpdater.newUpdater(C13338e.class, "_signal");

    /* renamed from: W */
    private final C13372b f29779W = C13380d.m41114a(false, 1, null);

    /* renamed from: X */
    private final C11961o<T> f29780X;
    private volatile int _signal = 0;

    @C12706f(mo31052c = "kotlinx.coroutines.rx2.RxObservableCoroutine", mo31053f = "RxObservable.kt", mo31054l = {104}, mo31055m = "sendSuspend")
    /* renamed from: kotlinx.coroutines.l2.e$a */
    /* compiled from: RxObservable.kt */
    static final class C13339a extends C12704d {

        /* renamed from: W */
        /* synthetic */ Object f29781W;

        /* renamed from: X */
        int f29782X;

        /* renamed from: Y */
        final /* synthetic */ C13338e f29783Y;

        /* renamed from: Z */
        Object f29784Z;

        /* renamed from: a0 */
        Object f29785a0;

        C13339a(C13338e eVar, C12683c cVar) {
            this.f29783Y = eVar;
            super(cVar);
        }

        /* renamed from: a */
        public final Object mo5580a(Object obj) {
            this.f29781W = obj;
            this.f29782X |= Integer.MIN_VALUE;
            return this.f29783Y.mo34518b(null, (C12683c<? super C13145v>) this);
        }
    }

    public C13338e(C12688f fVar, C11961o<T> oVar) {
        super(fVar, true);
        this.f29780X = oVar;
        this.f29779W.mo34567a();
    }

    /* renamed from: c */
    private final void m40972c(Throwable th, boolean z) {
        if (f29778Y.compareAndSet(this, 0, -1) && C13373a.m41098a(this.f29779W, null, 1, null)) {
            m40971b(th, z);
        }
    }

    /* renamed from: f */
    private final void m40973f(T t) {
        if (mo34330a()) {
            try {
                this.f29780X.onNext(t);
                m40974u();
            } catch (Throwable th) {
                mo34589b(th);
                C13373a.m41099b(this.f29779W, null, 1, null);
                throw th;
            }
        } else {
            m40971b(mo34594h(), mo34595i());
            throw mo34507c();
        }
    }

    /* renamed from: u */
    private final void m40974u() {
        C13373a.m41099b(this.f29779W, null, 1, null);
        if (!mo34330a() && C13373a.m41098a(this.f29779W, null, 1, null)) {
            m40971b(mo34594h(), mo34595i());
        }
    }

    /* renamed from: a */
    public Object mo34502a(T t, C12683c<? super C13145v> cVar) {
        if (offer(t)) {
            return C13145v.f29587a;
        }
        return mo34518b(t, cVar);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo34518b(T r5, kotlin.p573a0.C12683c<? super kotlin.C13145v> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.p594l2.C13338e.C13339a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.l2.e$a r0 = (kotlinx.coroutines.p594l2.C13338e.C13339a) r0
            int r1 = r0.f29782X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f29782X = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.l2.e$a r0 = new kotlinx.coroutines.l2.e$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f29781W
            java.lang.Object r1 = kotlin.p573a0.p574h.C12700d.m39820a()
            int r2 = r0.f29782X
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r5 = r0.f29785a0
            java.lang.Object r0 = r0.f29784Z
            kotlinx.coroutines.l2.e r0 = (kotlinx.coroutines.p594l2.C13338e) r0
            kotlin.C12903o.m40241a(r6)
            goto L_0x004b
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C12903o.m40241a(r6)
            kotlinx.coroutines.o2.b r6 = r4.f29779W
            r0.f29784Z = r4
            r0.f29785a0 = r5
            r0.f29782X = r3
            r2 = 0
            java.lang.Object r6 = kotlinx.coroutines.p597o2.C13372b.C13373a.m41097a(r6, r2, r0, r3, r2)
            if (r6 != r1) goto L_0x004a
            return r1
        L_0x004a:
            r0 = r4
        L_0x004b:
            r0.m40973f(r5)
            kotlin.v r5 = kotlin.C13145v.f29587a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p594l2.C13338e.mo34518b(java.lang.Object, kotlin.a0.c):java.lang.Object");
    }

    public boolean offer(T t) {
        if (!C13373a.m41098a(this.f29779W, null, 1, null)) {
            return false;
        }
        m40973f(t);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo34333e(C13145v vVar) {
        m40972c(null, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo34328a(Throwable th, boolean z) {
        m40972c(th, z);
    }

    /* renamed from: b */
    private final void m40971b(Throwable th, boolean z) {
        try {
            if (this._signal >= -1) {
                this._signal = -2;
                if (th != null) {
                    if (!(th instanceof CancellationException)) {
                        this.f29780X.onError(th);
                        if (!z && C13340f.m40983a(th)) {
                            C13218b0.m40651a(mo31038b(), th);
                        }
                    }
                }
                this.f29780X.onComplete();
            }
        } catch (Throwable th2) {
            C13373a.m41099b(this.f29779W, null, 1, null);
            throw th2;
        }
        C13373a.m41099b(this.f29779W, null, 1, null);
    }
}
