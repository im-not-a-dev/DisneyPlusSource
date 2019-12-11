package com.bamtechmedia.dominguez.core.utils;

import java.util.concurrent.TimeUnit;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p503n.p504a.C11793e;
import p163g.p503n.p504a.C11839v;
import p520io.reactivex.C11912b;
import p520io.reactivex.C11969r;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Single;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\b\u001a=\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u00042\u0006\u0010\u0002\u001a\u00020\u00032\u0014\b\u0006\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u00020\u00030\u0007H\b\u001aG\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\t0\u0004\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\n*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\t0\u00042\u0014\b\u0004\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\n0\u0007H\b\u001a0\u0010\f\u001a\u00020\r*\u00020\u00012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u0007\u001a\u0016\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u0004\u001a7\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u0001H\u0005H\u00050\u0004\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u00042\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000fH\b\u001a)\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001b\u001a;\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001c¨\u0006\u001d"}, mo31007d2 = {"debugLog", "Lio/reactivex/Completable;", "name", "", "Lio/reactivex/Single;", "T", "block", "Lkotlin/Function1;", "mapListItems", "", "R", "mapper", "mustComplete", "", "onComplete", "Lkotlin/Function0;", "onError", "", "onIOExceptionReturn", "kotlin.jvm.PlatformType", "optionalTimeout", "value", "", "unit", "Ljava/util/concurrent/TimeUnit;", "scheduler", "Lio/reactivex/Scheduler;", "(Lio/reactivex/Completable;Ljava/lang/Long;Ljava/util/concurrent/TimeUnit;Lio/reactivex/Scheduler;)Lio/reactivex/Completable;", "(Lio/reactivex/Single;Ljava/lang/Long;Ljava/util/concurrent/TimeUnit;Lio/reactivex/Scheduler;)Lio/reactivex/Single;", "core-utils_release"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.utils.e0 */
/* compiled from: RxExt.kt */
public final class C5826e0 {

    /* renamed from: com.bamtechmedia.dominguez.core.utils.e0$a */
    /* compiled from: RxExt.kt */
    static final class C5827a extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        public static final C5827a f13614c = new C5827a();

        C5827a() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.utils.e0$b */
    /* compiled from: RxExt.kt */
    static final /* synthetic */ class C5828b extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C5828b f13615c = new C5828b();

        C5828b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo17735a(Throwable th) {
            Timber.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(Timber.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17735a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m18823a(Completable completable, Function0 function0, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = C5827a.f13614c;
        }
        if ((i & 2) != 0) {
            function1 = C5828b.f13615c;
        }
        m18822a(completable, function0, function1);
    }

    /* renamed from: a */
    public static final void m18822a(Completable completable, Function0<C13145v> function0, Function1<? super Throwable, C13145v> function1) {
        Completable i = Completable.m38170i();
        Intrinsics.checkReturnedValueIsNotNull((Object) i, "Completable.never()");
        Object a = completable.mo30048a((C11912b<? extends R>) C11793e.m37931a((CompletableSource) i));
        Intrinsics.checkReturnedValueIsNotNull(a, "this.`as`(AutoDispose.autoDisposable<Any>(scope))");
        ((C11839v) a).mo29926a(new C5832f0(function0), new C5834g0(function1));
    }

    /* renamed from: a */
    public static final Completable m18820a(Completable completable, Long l, TimeUnit timeUnit, C11969r rVar) {
        if (l == null) {
            return completable;
        }
        Completable a = completable.mo30033a(l.longValue(), timeUnit, rVar);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "timeout(value, unit, scheduler)");
        return a;
    }

    /* renamed from: a */
    public static final <T> Single<T> m18821a(Single<T> single, Long l, TimeUnit timeUnit, C11969r rVar) {
        if (l == null) {
            return single;
        }
        Single<T> a = single.mo30203a(l.longValue(), timeUnit, rVar);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "timeout(value, unit, scheduler)");
        return a;
    }

    /* renamed from: a */
    public static final <T> void m18824a(Single<T> single) {
        Completable e = single.mo30228e();
        Intrinsics.checkReturnedValueIsNotNull((Object) e, "this.ignoreElement()");
        m18823a(e, null, null, 3, null);
    }
}
