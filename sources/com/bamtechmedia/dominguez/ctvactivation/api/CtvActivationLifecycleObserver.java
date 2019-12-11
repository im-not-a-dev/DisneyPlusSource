package com.bamtechmedia.dominguez.ctvactivation.api;

import android.annotation.SuppressLint;
import androidx.fragment.app.C0532d;
import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0722m;
import com.uber.autodispose.android.lifecycle.C10541b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p203b.p278h.p279k.C7248c;
import p163g.p201e.p203b.p278h.p280l.C7252a;
import p163g.p503n.p504a.C11790c0;
import p163g.p503n.p504a.C11793e;
import p163g.p503n.p504a.C11844z;
import p512h.C11868a;
import p520io.reactivex.C11957k;
import p520io.reactivex.Maybe;
import p520io.reactivex.Single;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B+\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/ctvactivation/api/CtvActivationLifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "lazyViewModel", "Ldagger/Lazy;", "Lcom/bamtechmedia/dominguez/ctvactivation/common/CtvActivatorViewModel;", "config", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/ctvactivation/config/CtvActivationConfigImpl;", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Ldagger/Lazy;Lio/reactivex/Single;Landroidx/fragment/app/FragmentActivity;)V", "onStart", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStop", "ctvActivation_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: CtvActivationLifecycleObserver.kt */
public final class CtvActivationLifecycleObserver implements C0710d {

    /* renamed from: U */
    private final Single<C7252a> f13668U;

    /* renamed from: V */
    private final C0532d f13669V;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C11868a<C7248c> f13670c;

    /* renamed from: com.bamtechmedia.dominguez.ctvactivation.api.CtvActivationLifecycleObserver$a */
    /* compiled from: CtvActivationLifecycleObserver.kt */
    static final class C5887a<T> implements C11952h<C7252a> {

        /* renamed from: c */
        public static final C5887a f13671c = new C5887a();

        C5887a() {
        }

        /* renamed from: a */
        public final boolean test(C7252a aVar) {
            return aVar.mo20060a();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.ctvactivation.api.CtvActivationLifecycleObserver$b */
    /* compiled from: CtvActivationLifecycleObserver.kt */
    static final class C5888b<T> implements Consumer<C7252a> {

        /* renamed from: c */
        final /* synthetic */ CtvActivationLifecycleObserver f13672c;

        C5888b(CtvActivationLifecycleObserver ctvActivationLifecycleObserver) {
            this.f13672c = ctvActivationLifecycleObserver;
        }

        /* renamed from: a */
        public final void accept(C7252a aVar) {
            ((C7248c) this.f13672c.f13670c.get()).setEnabled(true);
        }
    }

    public CtvActivationLifecycleObserver(C11868a<C7248c> aVar, Single<C7252a> single, C0532d dVar) {
        this.f13670c = aVar;
        this.f13668U = single;
        this.f13669V = dVar;
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
    public void mo4129d(C0722m mVar) {
        if (((C7252a) this.f13668U.mo30224c()).mo20060a() && !this.f13669V.isChangingConfigurations()) {
            ((C7248c) this.f13670c.get()).setEnabled(false);
        }
    }

    /* renamed from: e */
    public /* synthetic */ void mo4130e(C0722m mVar) {
        C0708c.m3733b(this, mVar);
    }

    @SuppressLint({"RxSubscribeOnError"})
    /* renamed from: f */
    public void mo4131f(C0722m mVar) {
        Maybe c = this.f13668U.mo30202a((C11952h<? super T>) C5887a.f13671c).mo30123c((Consumer<? super T>) new C5888b<Object>(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) c, "config.filter { it.enabl…bled = true\n            }");
        C10541b a = C10541b.m33254a(mVar);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "AndroidLifecycleScopeProvider.from(\n    this)");
        Object a2 = c.mo30112a((C11957k<T, ? extends R>) C11793e.m37930a((C11790c0) a));
        Intrinsics.checkReturnedValueIsNotNull(a2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11844z) a2).mo29928a();
    }
}
