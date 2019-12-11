package com.bamtechmedia.dominguez.analytics;

import android.app.Activity;
import androidx.fragment.app.C0532d;
import androidx.fragment.app.C0538i;
import androidx.fragment.app.C0538i.C0540b;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0703a0;
import androidx.lifecycle.C0715i.C0716a;
import androidx.lifecycle.C0722m;
import androidx.lifecycle.C0741y;
import androidx.lifecycle.C0742z;
import com.bamtechmedia.dominguez.analytics.C2348e.C2349a;
import com.uber.autodispose.android.lifecycle.C10541b;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p503n.p504a.C11790c0;
import p163g.p503n.p504a.C11792d0;
import p163g.p503n.p504a.C11793e;
import p520io.reactivex.C11974s;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001bB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/PageLoadAnalytics;", "", "activePageTracker", "Lcom/bamtechmedia/dominguez/analytics/ActivePageTracker;", "adobe", "Lcom/bamtechmedia/dominguez/analytics/AdobeAnalytics;", "braze", "Lcom/bamtechmedia/dominguez/analytics/BrazeAnalytics;", "glimpse", "Lcom/bamtechmedia/dominguez/analytics/GlimpseAnalytics;", "(Lcom/bamtechmedia/dominguez/analytics/ActivePageTracker;Lcom/bamtechmedia/dominguez/analytics/AdobeAnalytics;Lcom/bamtechmedia/dominguez/analytics/BrazeAnalytics;Lcom/bamtechmedia/dominguez/analytics/GlimpseAnalytics;)V", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "fragmentLifecycleCallbacks", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "onFragmentStarted", "fragment", "Landroidx/fragment/app/Fragment;", "onFragmentViewCreated", "onFragmentViewDestroyed", "trackSection", "viewModel", "Lcom/bamtechmedia/dominguez/analytics/PageLoadAnalytics$FragmentAnalyticsViewModel;", "section", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsSection;", "FragmentAnalyticsViewModel", "analytics_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.analytics.b0 */
/* compiled from: PageLoadAnalytics.kt */
public class C2340b0 {

    /* renamed from: a */
    private final C2336b f6542a;

    /* renamed from: b */
    private final C2348e f6543b;

    /* renamed from: c */
    private final C2436p f6544c;

    /* renamed from: d */
    private final C2476z f6545d;

    /* renamed from: com.bamtechmedia.dominguez.analytics.b0$a */
    /* compiled from: PageLoadAnalytics.kt */
    public static final class C2341a extends C0741y {

        /* renamed from: a */
        private AtomicBoolean f6546a = new AtomicBoolean(false);

        /* renamed from: b */
        private C2378m f6547b;

        /* renamed from: a */
        public final void mo11455a(C2378m mVar) {
            this.f6547b = mVar;
        }

        /* renamed from: y */
        public final AtomicBoolean mo11456y() {
            return this.f6546a;
        }

        /* renamed from: z */
        public final C2378m mo11457z() {
            return this.f6547b;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.analytics.b0$b */
    /* compiled from: PageLoadAnalytics.kt */
    static final class C2342b<T> implements Consumer<C2378m> {

        /* renamed from: U */
        final /* synthetic */ C2341a f6548U;

        /* renamed from: c */
        final /* synthetic */ C2340b0 f6549c;

        C2342b(C2340b0 b0Var, C2341a aVar) {
            this.f6549c = b0Var;
            this.f6548U = aVar;
        }

        /* renamed from: a */
        public final void accept(C2378m mVar) {
            C2340b0 b0Var = this.f6549c;
            C2341a aVar = this.f6548U;
            C12880j.m40222a((Object) mVar, "it");
            b0Var.m8834a(aVar, mVar);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.analytics.b0$c */
    /* compiled from: PageLoadAnalytics.kt */
    static final class C2343c<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C2343c f6550c = new C2343c();

        C2343c() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C14100a.m44523a(th);
        }
    }

    public C2340b0(C2336b bVar, C2348e eVar, C2436p pVar, C2476z zVar) {
        this.f6542a = bVar;
        this.f6543b = eVar;
        this.f6544c = pVar;
        this.f6545d = zVar;
    }

    /* renamed from: b */
    public final void mo11453b(Fragment fragment) {
        if (!(fragment instanceof C2413n)) {
            fragment = null;
        }
        C2413n nVar = (C2413n) fragment;
        if (nVar != null) {
            C2378m a = C2430o.m8990a(nVar);
            if (a != null) {
                this.f6542a.mo11443a(a);
            }
        }
    }

    /* renamed from: c */
    public final void mo11454c(Fragment fragment) {
        C0532d activity = fragment.getActivity();
        if (activity != null) {
            ArrayList arrayList = new ArrayList();
            C0538i supportFragmentManager = activity.getSupportFragmentManager();
            C12880j.m40222a((Object) supportFragmentManager, "supportFragmentManager");
            Fragment f = supportFragmentManager.mo3160f();
            while (f != null && f.isAdded()) {
                C2413n nVar = (C2413n) (!(f instanceof C2413n) ? null : f);
                if (nVar != null) {
                    arrayList.add(nVar);
                }
                C0538i childFragmentManager = f.getChildFragmentManager();
                C12880j.m40222a((Object) childFragmentManager, "candidate.childFragmentManager");
                f = childFragmentManager.mo3160f();
            }
            C2413n nVar2 = (C2413n) C13199w.m40591g(C13199w.m40606q(arrayList));
            if (nVar2 != null) {
                C2378m a = C2430o.m8990a(nVar2);
                if (a != null) {
                    this.f6542a.mo11443a(a);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo11451a(Activity activity, C0540b bVar) {
        C2413n nVar = (C2413n) (!(activity instanceof C2413n) ? null : activity);
        if (nVar != null) {
            C2378m a = C2430o.m8990a(nVar);
            if (a != null) {
                this.f6542a.mo11443a(a);
            }
        }
        if (!(activity instanceof C0532d)) {
            activity = null;
        }
        C0532d dVar = (C0532d) activity;
        if (dVar != null) {
            C0538i supportFragmentManager = dVar.getSupportFragmentManager();
            if (supportFragmentManager != null) {
                supportFragmentManager.mo3150a(bVar, true);
            }
        }
    }

    /* renamed from: a */
    public final void mo11452a(Fragment fragment) {
        C0742z b = C0703a0.m3720b(fragment);
        C12880j.m40222a((Object) b, "ViewModelProviders.of(fragment)");
        C0741y a = b.mo4180a(C2341a.class);
        C12880j.m40222a((Object) a, "get(VM::class.java)");
        C2341a aVar = (C2341a) a;
        if (aVar.mo11456y().get()) {
            C2336b bVar = this.f6542a;
            C2378m z = aVar.mo11457z();
            if (z != null) {
                bVar.mo11443a(z);
                this.f6545d.mo11539i();
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (fragment instanceof C2359f0) {
            Single n = ((C2359f0) fragment).mo11486n();
            C10541b a2 = C10541b.m33255a((C0722m) fragment, C0716a.ON_DESTROY);
            C12880j.m40222a((Object) a2, "AndroidLifecycleScopePro…om(\n    this, untilEvent)");
            Object a3 = n.mo30215a((C11974s<T, ? extends R>) C11793e.m37930a((C11790c0) a2));
            C12880j.m40222a(a3, "this.`as`(AutoDispose.autoDisposable(provider))");
            ((C11792d0) a3).mo29920a(new C2342b(this, aVar), C2343c.f6550c);
        } else if (fragment instanceof C2413n) {
            C2378m a4 = C2430o.m8990a((C2413n) fragment);
            if (a4 != null) {
                m8834a(aVar, a4);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m8834a(C2341a aVar, C2378m mVar) {
        if (!aVar.mo11456y().getAndSet(true)) {
            this.f6542a.mo11443a(mVar);
            aVar.mo11455a(mVar);
            C2349a.m8854a(this.f6543b, mVar.mo11509X(), null, 2, null);
            this.f6544c.mo11568a(mVar.mo11509X());
            this.f6545d.mo11539i();
        }
    }
}
