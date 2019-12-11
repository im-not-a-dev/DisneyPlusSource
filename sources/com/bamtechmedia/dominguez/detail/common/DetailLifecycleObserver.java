package com.bamtechmedia.dominguez.detail.common;

import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0722m;
import com.bamtechmedia.dominguez.detail.common.p230g0.C5948c;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/DetailLifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "viewModel", "Lcom/bamtechmedia/dominguez/detail/common/DetailViewModel;", "config", "Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailConfig;", "(Lcom/bamtechmedia/dominguez/detail/common/DetailViewModel;Lcom/bamtechmedia/dominguez/detail/common/tv/ContentDetailConfig;)V", "onStart", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DetailLifecycleObserver.kt */
public final class DetailLifecycleObserver implements C0710d {

    /* renamed from: U */
    private final C5948c f13679U;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C5967h<?> f13680c;

    /* renamed from: com.bamtechmedia.dominguez.detail.common.DetailLifecycleObserver$a */
    /* compiled from: DetailLifecycleObserver.kt */
    static final class C5895a<T> implements Consumer<Long> {

        /* renamed from: c */
        final /* synthetic */ DetailLifecycleObserver f13681c;

        C5895a(DetailLifecycleObserver detailLifecycleObserver) {
            this.f13681c = detailLifecycleObserver;
        }

        /* renamed from: a */
        public final void accept(Long l) {
            this.f13681c.f13680c.mo17915D();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.common.DetailLifecycleObserver$b */
    /* compiled from: DetailLifecycleObserver.kt */
    static final /* synthetic */ class C5896b extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C5896b f13682c = new C5896b();

        C5896b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo17794a(Throwable th) {
            C14100a.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C14100a.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17794a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    public DetailLifecycleObserver(C5967h<?> hVar, C5948c cVar) {
        this.f13680c = hVar;
        this.f13679U = cVar;
    }

    /* renamed from: a */
    public /* synthetic */ void mo4126a(C0722m mVar) {
        C0708c.m3735d(this, mVar);
    }

    /* renamed from: b */
    public /* synthetic */ void mo4127b(C0722m mVar) {
        C0708c.m3732a(this, mVar);
    }

    /* renamed from: c */
    public /* synthetic */ void mo4128c(C0722m mVar) {
        C0708c.m3734c(this, mVar);
    }

    /* renamed from: d */
    public /* synthetic */ void mo4129d(C0722m mVar) {
        C0708c.m3737f(this, mVar);
    }

    /* renamed from: e */
    public /* synthetic */ void mo4130e(C0722m mVar) {
        C0708c.m3733b(this, mVar);
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [com.bamtechmedia.dominguez.detail.common.DetailLifecycleObserver$b, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r2v1, types: [com.bamtechmedia.dominguez.detail.common.f] */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4131f(androidx.lifecycle.C0722m r9) {
        /*
            r8 = this;
            com.bamtechmedia.dominguez.detail.common.g0.c r0 = r8.f13679U
            java.lang.Long r0 = r0.mo17882k()
            r1 = 0
            if (r0 == 0) goto L_0x0019
            long r2 = r0.longValue()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0015
            r2 = 1
            goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            if (r2 == 0) goto L_0x0019
            r1 = r0
        L_0x0019:
            if (r1 == 0) goto L_0x005f
            r2 = 0
            long r4 = r1.longValue()
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            io.reactivex.r r7 = p520io.reactivex.p525e0.C11934b.m38498a()
            io.reactivex.Observable r0 = p520io.reactivex.Observable.m38298a(r2, r4, r6, r7)
            java.lang.String r1 = "Observable.interval(0L, …Schedulers.computation())"
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            androidx.lifecycle.i$a r1 = androidx.lifecycle.C0715i.C0716a.ON_STOP
            com.uber.autodispose.android.lifecycle.b r9 = com.uber.autodispose.android.lifecycle.C10541b.m33255a(r9, r1)
            java.lang.String r1 = "AndroidLifecycleScopePro…om(\n    this, untilEvent)"
            kotlin.jvm.internal.C12880j.m40222a(r9, r1)
            g.n.a.h r9 = p163g.p503n.p504a.C11793e.m37930a(r9)
            java.lang.Object r9 = r0.mo30161a(r9)
            java.lang.String r0 = "this.`as`(AutoDispose.autoDisposable(provider))"
            kotlin.jvm.internal.C12880j.m40222a(r9, r0)
            g.n.a.a0 r9 = (p163g.p503n.p504a.C11786a0) r9
            com.bamtechmedia.dominguez.detail.common.DetailLifecycleObserver$a r0 = new com.bamtechmedia.dominguez.detail.common.DetailLifecycleObserver$a
            r0.<init>(r8)
            com.bamtechmedia.dominguez.detail.common.DetailLifecycleObserver$b r1 = com.bamtechmedia.dominguez.detail.common.DetailLifecycleObserver.C5896b.f13682c
            if (r1 == 0) goto L_0x0059
            com.bamtechmedia.dominguez.detail.common.f r2 = new com.bamtechmedia.dominguez.detail.common.f
            r2.<init>(r1)
            r1 = r2
        L_0x0059:
            io.reactivex.functions.Consumer r1 = (p520io.reactivex.functions.Consumer) r1
            r9.mo29915a(r0, r1)
            goto L_0x0064
        L_0x005f:
            com.bamtechmedia.dominguez.detail.common.h<?> r9 = r8.f13680c
            r9.mo17915D()
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.common.DetailLifecycleObserver.mo4131f(androidx.lifecycle.m):void");
    }
}
