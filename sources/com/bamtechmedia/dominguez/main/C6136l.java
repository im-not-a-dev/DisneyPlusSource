package com.bamtechmedia.dominguez.main;

import androidx.fragment.app.C0538i;
import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.auth.p061o0.C2739a;
import com.bamtechmedia.dominguez.core.p218n.C5773a;
import com.bamtechmedia.dominguez.core.p218n.C5791e;
import com.bamtechmedia.dominguez.profiles.C6761p0;
import com.bamtechmedia.dominguez.profiles.C6761p0.C6762a;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p203b.p299m.C7543f.C7544a;
import p163g.p201e.p203b.p299m.C7547h;
import p163g.p201e.p203b.p307o.p308p.C7629c;
import p163g.p201e.p203b.p312q.C7686g;
import p163g.p201e.p203b.p319v.p321b0.C7852f;
import p163g.p201e.p203b.p327y.p328g.C7931b;
import p163g.p201e.p203b.p406d0.C10580i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0001\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001a2\b\b\u0002\u0010\u001f\u001a\u00020\u0016H\u0002J\u0015\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"H\u0000¢\u0006\u0002\b#J\r\u0010$\u001a\u00020\u001dH\u0000¢\u0006\u0002\b%J\r\u0010&\u001a\u00020\u001dH\u0000¢\u0006\u0002\b'J\r\u0010(\u001a\u00020\u001dH\u0000¢\u0006\u0002\b)J\u0015\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u0016H\u0000¢\u0006\u0002\b,J\r\u0010-\u001a\u00020\u001dH\u0000¢\u0006\u0002\b.J\r\u0010/\u001a\u00020\u001dH\u0000¢\u0006\u0002\b0J\r\u00101\u001a\u00020\u001dH\u0000¢\u0006\u0002\b2J\r\u00103\u001a\u00020\u001dH\u0000¢\u0006\u0002\b4J\r\u00105\u001a\u00020\u001dH\u0000¢\u0006\u0002\b6J\r\u00107\u001a\u00020\u001dH\u0000¢\u0006\u0002\b8R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003X\u0004¢\u0006\u0002\n\u0000¨\u00069"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/main/MainActivityRouter;", "", "dialogRouter", "Ljavax/inject/Provider;", "Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;", "offlineRouter", "Lcom/bamtechmedia/dominguez/error/api/OfflineRouter;", "activityNavigation", "Lcom/bamtechmedia/dominguez/core/navigation/ActivityNavigation;", "splashFragmentFactory", "Lcom/bamtechmedia/dominguez/splash/SplashFragmentFactory;", "authFragmentFactory", "Lcom/bamtechmedia/dominguez/auth/api/AuthFragmentFactory;", "paywallFragmentFactory", "Lcom/bamtechmedia/dominguez/paywall/ui/PaywallFragmentFactory;", "globalNavFragmentFactory", "Lcom/bamtechmedia/dominguez/globalnav/GlobalNavFragmentFactory;", "profilesGlobalNavRouter", "Lcom/bamtechmedia/dominguez/profiles/ProfilesGlobalNavRouter;", "serviceUnavailableFragmentFactory", "Lcom/bamtechmedia/dominguez/portability/api/ServiceUnavailableFragmentFactory;", "isTelevision", "", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Z)V", "isNotSameInstance", "first", "Landroidx/fragment/app/Fragment;", "second", "replaceBackStack", "", "fragment", "replaceSameInstance", "showClearDataDialog", "adviceMessage", "", "showClearDataDialog$mainApp_release", "showUpdateDialog", "showUpdateDialog$mainApp_release", "startAuth", "startAuth$mainApp_release", "startCompletePurchase", "startCompletePurchase$mainApp_release", "startMainApp", "kidsMode", "startMainApp$mainApp_release", "startNoConnectionView", "startNoConnectionView$mainApp_release", "startPaywall", "startPaywall$mainApp_release", "startProfilePicker", "startProfilePicker$mainApp_release", "startRestartSubscription", "startRestartSubscription$mainApp_release", "startServiceUnavailableView", "startServiceUnavailableView$mainApp_release", "startSplash", "startSplash$mainApp_release", "mainApp_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.main.l */
/* compiled from: MainActivityRouter.kt */
public final class C6136l {

    /* renamed from: a */
    private final Provider<C7547h> f14100a;

    /* renamed from: b */
    private final Provider<C7629c> f14101b;

    /* renamed from: c */
    private final Provider<C5773a> f14102c;

    /* renamed from: d */
    private final Provider<C10580i> f14103d;

    /* renamed from: e */
    private final Provider<C2739a> f14104e;

    /* renamed from: f */
    private final Provider<C7852f> f14105f;

    /* renamed from: g */
    private final Provider<C7686g> f14106g;

    /* renamed from: h */
    private final Provider<C6761p0> f14107h;

    /* renamed from: i */
    private final Provider<C7931b> f14108i;

    /* renamed from: com.bamtechmedia.dominguez.main.l$a */
    /* compiled from: MainActivityRouter.kt */
    static final class C6137a extends C12881k implements Function1<C0538i, Boolean> {

        /* renamed from: U */
        final /* synthetic */ boolean f14109U;

        /* renamed from: V */
        final /* synthetic */ Fragment f14110V;

        /* renamed from: c */
        final /* synthetic */ C6136l f14111c;

        C6137a(C6136l lVar, boolean z, Fragment fragment) {
            this.f14111c = lVar;
            this.f14109U = z;
            this.f14110V = fragment;
            super(1);
        }

        /* renamed from: a */
        public final boolean mo18760a(C0538i iVar) {
            return this.f14109U || this.f14111c.m19556a(iVar.mo3160f(), this.f14110V);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo18760a((C0538i) obj));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.l$b */
    /* compiled from: MainActivityRouter.kt */
    static final class C6138b extends C12881k implements Function1<C0538i, Boolean> {

        /* renamed from: U */
        final /* synthetic */ C6136l f14112U;

        /* renamed from: c */
        final /* synthetic */ Fragment f14113c;

        C6138b(Fragment fragment, C6136l lVar) {
            this.f14113c = fragment;
            this.f14112U = lVar;
            super(1);
        }

        /* renamed from: a */
        public final boolean mo18761a(C0538i iVar) {
            return this.f14112U.m19556a(iVar.mo3160f(), this.f14113c);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo18761a((C0538i) obj));
        }
    }

    public C6136l(Provider<C7547h> provider, Provider<C7629c> provider2, Provider<C5773a> provider3, Provider<C10580i> provider4, Provider<C2739a> provider5, Provider<C7852f> provider6, Provider<C7686g> provider7, Provider<C6761p0> provider8, Provider<C7931b> provider9, boolean z) {
        this.f14100a = provider;
        this.f14101b = provider2;
        this.f14102c = provider3;
        this.f14103d = provider4;
        this.f14104e = provider5;
        this.f14105f = provider6;
        this.f14106g = provider7;
        this.f14107h = provider8;
        this.f14108i = provider9;
    }

    /* renamed from: b */
    public final void mo18752b() {
        m19555a(this, ((C2739a) this.f14104e.get()).mo11740b(), false, 2, null);
    }

    /* renamed from: c */
    public final void mo18753c() {
        m19555a(this, ((C7852f) this.f14105f.get()).mo20774c(), false, 2, null);
    }

    /* renamed from: d */
    public final void mo18754d() {
        m19555a(this, ((C7629c) this.f14101b.get()).newInstance(), false, 2, null);
    }

    /* renamed from: e */
    public final void mo18755e() {
        Fragment a = ((C7852f) this.f14105f.get()).mo20772a();
        C5773a.m18722a((C5773a) this.f14102c.get(), a, (C5791e) null, (Function1) new C6138b(a, this), 2, (Object) null);
    }

    /* renamed from: f */
    public final void mo18756f() {
        C6762a.m20854a((C6761p0) this.f14107h.get(), false, 1, null);
    }

    /* renamed from: g */
    public final void mo18757g() {
        m19555a(this, ((C7852f) this.f14105f.get()).mo20773b(), false, 2, null);
    }

    /* renamed from: h */
    public final void mo18758h() {
        m19555a(this, ((C7931b) this.f14108i.get()).mo20837a(false), false, 2, null);
    }

    /* renamed from: i */
    public final void mo18759i() {
        m19555a(this, ((C10580i) this.f14103d.get()).newInstance(), false, 2, null);
    }

    /* renamed from: a */
    public final void mo18751a(boolean z) {
        m19554a(((C7686g) this.f14106g.get()).mo20600a(z), true);
    }

    /* renamed from: a */
    static /* synthetic */ void m19555a(C6136l lVar, Fragment fragment, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        lVar.m19554a(fragment, z);
    }

    /* renamed from: a */
    private final void m19554a(Fragment fragment, boolean z) {
        C5773a.m18724b((C5773a) this.f14102c.get(), fragment, null, new C6137a(this, z, fragment), 2, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m19556a(Fragment fragment, Fragment fragment2) {
        return fragment == null || (Intrinsics.areEqual((Object) fragment.getClass(), (Object) fragment2.getClass()) ^ true);
    }

    /* renamed from: a */
    public final void mo18749a() {
        Object obj = this.f14100a.get();
        Intrinsics.checkReturnedValueIsNotNull(obj, "dialogRouter.get()");
        C7547h hVar = (C7547h) obj;
        C7544a aVar = new C7544a();
        aVar.mo20466a(C6203t.force_update_dialog);
        aVar.mo20484i(Integer.valueOf(C6204u.update_app_title));
        aVar.mo20467a(Integer.valueOf(C6204u.update_app_body));
        aVar.mo20480g(Integer.valueOf(C6204u.btn_update_app));
        aVar.mo20469a(false);
        hVar.mo20491b(aVar.mo20465a());
    }

    /* renamed from: a */
    public final void mo18750a(String str) {
        Object obj = this.f14100a.get();
        Intrinsics.checkReturnedValueIsNotNull(obj, "dialogRouter.get()");
        C7547h hVar = (C7547h) obj;
        C7544a aVar = new C7544a();
        aVar.mo20466a(C6203t.clear_data_dialog);
        aVar.mo20484i(Integer.valueOf(C6204u.splash_clear_data_title));
        aVar.mo20475d(str);
        aVar.mo20480g(Integer.valueOf(C6204u.splash_clear_data));
        aVar.mo20469a(false);
        hVar.mo20491b(aVar.mo20465a());
    }
}
