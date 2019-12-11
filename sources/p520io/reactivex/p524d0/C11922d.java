package p520io.reactivex.p524d0;

import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import p520io.reactivex.Observable;
import p520io.reactivex.Single;
import p520io.reactivex.disposables.Disposable;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\b\b\u0000\u0010\n*\u00020\u0007*\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00020\u0004H\u0002\u001a\u0012\u0010\u000b\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002\u001a\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\t*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004H\u0002\u001aX\u0010\u000e\u001a\u00020\u0002\"\b\b\u0000\u0010\n*\u00020\u0007*\b\u0012\u0004\u0012\u0002H\n0\u000f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00020\u0004H\u0007\u001aX\u0010\u000e\u001a\u00020\u0002\"\b\b\u0000\u0010\n*\u00020\u0007*\b\u0012\u0004\u0012\u0002H\n0\u00132\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00020\u0004H\u0007\u001a2\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0007\u001aX\u0010\u0014\u001a\u00020\u0015\"\b\b\u0000\u0010\n*\u00020\u0007*\b\u0012\u0004\u0012\u0002H\n0\u000f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00020\u0004H\u0007\u001aX\u0010\u0014\u001a\u00020\u0015\"\b\b\u0000\u0010\n*\u00020\u0007*\b\u0012\u0004\u0012\u0002H\n0\u00172\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00020\u0004H\u0007\u001aX\u0010\u0014\u001a\u00020\u0015\"\b\b\u0000\u0010\n*\u00020\u0007*\b\u0012\u0004\u0012\u0002H\n0\u00132\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00020\u0004H\u0007\u001aH\u0010\u0014\u001a\u00020\u0015\"\b\b\u0000\u0010\n*\u00020\u0007*\b\u0012\u0004\u0012\u0002H\n0\u00192\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00020\u0004H\u0007\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004X\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, mo31007d2 = {"onCompleteStub", "Lkotlin/Function0;", "", "onErrorStub", "Lkotlin/Function1;", "", "onNextStub", "", "asConsumer", "Lio/reactivex/functions/Consumer;", "T", "asOnCompleteAction", "Lio/reactivex/functions/Action;", "asOnErrorConsumer", "blockingSubscribeBy", "Lio/reactivex/Flowable;", "onError", "onComplete", "onNext", "Lio/reactivex/Observable;", "subscribeBy", "Lio/reactivex/disposables/Disposable;", "Lio/reactivex/Completable;", "Lio/reactivex/Maybe;", "onSuccess", "Lio/reactivex/Single;", "rxkotlin"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* renamed from: io.reactivex.d0.d */
/* compiled from: subscribers.kt */
public final class C11922d {

    /* renamed from: a */
    private static final Function1<Object, C13145v> f27603a = C11925c.f27608c;

    /* renamed from: b */
    private static final Function1<Throwable, C13145v> f27604b = C11924b.f27607c;

    /* renamed from: c */
    private static final Function0<C13145v> f27605c = C11923a.f27606c;

    /* renamed from: io.reactivex.d0.d$a */
    /* compiled from: subscribers.kt */
    static final class C11923a extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        public static final C11923a f27606c = new C11923a();

        C11923a() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* renamed from: io.reactivex.d0.d$b */
    /* compiled from: subscribers.kt */
    static final class C11924b extends C12881k implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C11924b f27607c = new C11924b();

        C11924b() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C13145v.f29587a;
        }

        public final void invoke(Throwable th) {
        }
    }

    /* renamed from: io.reactivex.d0.d$c */
    /* compiled from: subscribers.kt */
    static final class C11925c extends C12881k implements Function1<Object, C13145v> {

        /* renamed from: c */
        public static final C11925c f27608c = new C11925c();

        C11925c() {
            super(1);
        }

        public final void invoke(Object obj) {
        }
    }

    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r0v1, types: [io.reactivex.d0.f] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final <T> p520io.reactivex.functions.Consumer<T> m38480a(kotlin.jvm.functions.Function1<? super T, kotlin.C13145v> r1) {
        /*
            kotlin.jvm.functions.Function1<java.lang.Object, kotlin.v> r0 = f27603a
            if (r1 != r0) goto L_0x000e
            io.reactivex.functions.Consumer r1 = p520io.reactivex.p531y.p533b.C12015a.m38648b()
            java.lang.String r0 = "Functions.emptyConsumer()"
            kotlin.jvm.internal.C12880j.m40222a(r1, r0)
            goto L_0x0018
        L_0x000e:
            if (r1 == 0) goto L_0x0016
            io.reactivex.d0.f r0 = new io.reactivex.d0.f
            r0.<init>(r1)
            r1 = r0
        L_0x0016:
            io.reactivex.functions.Consumer r1 = (p520io.reactivex.functions.Consumer) r1
        L_0x0018:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p520io.reactivex.p524d0.C11922d.m38480a(kotlin.jvm.functions.Function1):io.reactivex.functions.Consumer");
    }

    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r0v1, types: [io.reactivex.d0.f] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final p520io.reactivex.functions.Consumer<java.lang.Throwable> m38482b(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.C13145v> r1) {
        /*
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.v> r0 = f27604b
            if (r1 != r0) goto L_0x000c
            io.reactivex.functions.Consumer<java.lang.Throwable> r1 = p520io.reactivex.p531y.p533b.C12015a.f27746e
            java.lang.String r0 = "Functions.ON_ERROR_MISSING"
            kotlin.jvm.internal.C12880j.m40222a(r1, r0)
            goto L_0x0016
        L_0x000c:
            if (r1 == 0) goto L_0x0014
            io.reactivex.d0.f r0 = new io.reactivex.d0.f
            r0.<init>(r1)
            r1 = r0
        L_0x0014:
            io.reactivex.functions.Consumer r1 = (p520io.reactivex.functions.Consumer) r1
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p520io.reactivex.p524d0.C11922d.m38482b(kotlin.jvm.functions.Function1):io.reactivex.functions.Consumer");
    }

    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r0v1, types: [io.reactivex.d0.e] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final p520io.reactivex.functions.C11945a m38481a(kotlin.jvm.functions.Function0<kotlin.C13145v> r1) {
        /*
            kotlin.jvm.functions.Function0<kotlin.v> r0 = f27605c
            if (r1 != r0) goto L_0x000c
            io.reactivex.functions.a r1 = p520io.reactivex.p531y.p533b.C12015a.f27744c
            java.lang.String r0 = "Functions.EMPTY_ACTION"
            kotlin.jvm.internal.C12880j.m40222a(r1, r0)
            goto L_0x0016
        L_0x000c:
            if (r1 == 0) goto L_0x0014
            io.reactivex.d0.e r0 = new io.reactivex.d0.e
            r0.<init>(r1)
            r1 = r0
        L_0x0014:
            io.reactivex.functions.a r1 = (p520io.reactivex.functions.C11945a) r1
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p520io.reactivex.p524d0.C11922d.m38481a(kotlin.jvm.functions.Function0):io.reactivex.functions.a");
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=kotlin.jvm.functions.Function0, code=kotlin.jvm.functions.Function0<kotlin.v>, for r2v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=kotlin.jvm.functions.Function1, code=kotlin.jvm.functions.Function1<java.lang.Object, kotlin.v>, for r3v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=kotlin.jvm.functions.Function1, code=kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.v>, for r1v0, types: [kotlin.jvm.functions.Function1] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ p520io.reactivex.disposables.Disposable m38477a(p520io.reactivex.Observable r0, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.C13145v> r1, kotlin.jvm.functions.Function0<kotlin.C13145v> r2, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.C13145v> r3, int r4, java.lang.Object r5) {
        /*
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0006
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.v> r1 = f27604b
        L_0x0006:
            r5 = r4 & 2
            if (r5 == 0) goto L_0x000c
            kotlin.jvm.functions.Function0<kotlin.v> r2 = f27605c
        L_0x000c:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0012
            kotlin.jvm.functions.Function1<java.lang.Object, kotlin.v> r3 = f27603a
        L_0x0012:
            io.reactivex.disposables.Disposable r0 = m38476a(r0, r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p520io.reactivex.p524d0.C11922d.m38477a(io.reactivex.Observable, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, int, java.lang.Object):io.reactivex.disposables.Disposable");
    }

    /* renamed from: a */
    public static final <T> Disposable m38476a(Observable<T> observable, Function1<? super Throwable, C13145v> function1, Function0<C13145v> function0, Function1<? super T, C13145v> function12) {
        Disposable a = observable.mo30158a(m38480a(function12), m38482b(function1), m38481a(function0));
        C12880j.m40222a((Object) a, "subscribe(onNext.asConsu…ete.asOnCompleteAction())");
        return a;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=kotlin.jvm.functions.Function1, code=kotlin.jvm.functions.Function1<java.lang.Object, kotlin.v>, for r2v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=kotlin.jvm.functions.Function1, code=kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.v>, for r1v0, types: [kotlin.jvm.functions.Function1] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ p520io.reactivex.disposables.Disposable m38479a(p520io.reactivex.Single r0, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.C13145v> r1, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.C13145v> r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.v> r1 = f27604b
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            kotlin.jvm.functions.Function1<java.lang.Object, kotlin.v> r2 = f27603a
        L_0x000c:
            io.reactivex.disposables.Disposable r0 = m38478a(r0, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p520io.reactivex.p524d0.C11922d.m38479a(io.reactivex.Single, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, int, java.lang.Object):io.reactivex.disposables.Disposable");
    }

    /* renamed from: a */
    public static final <T> Disposable m38478a(Single<T> single, Function1<? super Throwable, C13145v> function1, Function1<? super T, C13145v> function12) {
        Disposable a = single.mo30214a(m38480a(function12), m38482b(function1));
        C12880j.m40222a((Object) a, "subscribe(onSuccess.asCo…rror.asOnErrorConsumer())");
        return a;
    }
}
