package com.bamtechmedia.dominguez.core.p218n;

import android.content.Intent;
import androidx.fragment.app.C0538i;
import androidx.fragment.app.C0538i.C0539a;
import androidx.fragment.app.C0564o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0703a0;
import androidx.lifecycle.C0741y;
import com.disney.dominguez.navigation.core.C8436a;
import com.disney.dominguez.navigation.core.ViewModelNavEventHandler;
import com.disney.dominguez.navigation.core.ViewModelNavEventHandler.Observer;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p163g.p437h.p438a.p439a.p440a.C10894b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fJ<\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/navigation/FragmentViewNavigation;", "Lcom/bamtechmedia/dominguez/core/navigation/FragmentNavigation;", "navEventHandler", "Lcom/disney/dominguez/navigation/core/NavEventHandler;", "fragmentContainerId", "", "(Lcom/disney/dominguez/navigation/core/NavEventHandler;I)V", "getFragmentContainerId", "()I", "popStackWithResult", "", "data", "Landroid/content/Intent;", "replaceBackStack", "fragment", "Landroidx/fragment/app/Fragment;", "startFragment", "popCurrentFromStack", "", "transitionAnimations", "Lcom/bamtechmedia/dominguez/core/navigation/FragmentTransitionAnimations;", "backStackName", "", "transactionMode", "Lcom/bamtechmedia/dominguez/core/navigation/FragmentViewNavigation$TransactionMode;", "Companion", "TransactionMode", "core-ui-framework_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.n.f */
/* compiled from: FragmentViewNavigation.kt */
public final class C5792f extends C5786d {

    /* renamed from: c */
    public static final C5793a f13565c = new C5793a(null);

    /* renamed from: b */
    private final int f13566b;

    /* renamed from: com.bamtechmedia.dominguez.core.n.f$a */
    /* compiled from: FragmentViewNavigation.kt */
    public static final class C5793a {
        private C5793a() {
        }

        /* renamed from: a */
        public final C5792f mo17699a(Fragment fragment, int i) {
            C0741y a = C0703a0.m3720b(fragment).mo4180a(ViewModelNavEventHandler.class);
            Intrinsics.checkReturnedValueIsNotNull((Object) a, "ViewModelProviders.of(fr…EventHandler::class.java)");
            ViewModelNavEventHandler viewModelNavEventHandler = (ViewModelNavEventHandler) a;
            if (!viewModelNavEventHandler.mo21647y().contains(Integer.valueOf(fragment.getLifecycle().hashCode()))) {
                fragment.getLifecycle().mo4134a(new Observer(viewModelNavEventHandler, new C10894b(fragment)));
                viewModelNavEventHandler.mo21647y().add(Integer.valueOf(fragment.getLifecycle().hashCode()));
            }
            return new C5792f(viewModelNavEventHandler, i);
        }

        public /* synthetic */ C5793a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.n.f$b */
    /* compiled from: FragmentViewNavigation.kt */
    public enum C5794b {
        REPLACE_VIEW,
        ADD_VIEW
    }

    /* renamed from: com.bamtechmedia.dominguez.core.n.f$c */
    /* compiled from: FragmentViewNavigation.kt */
    static final class C5795c extends C12881k implements Function1<Fragment, C13145v> {

        /* renamed from: c */
        final /* synthetic */ Intent f13570c;

        C5795c(Intent intent) {
            this.f13570c = intent;
            super(1);
        }

        /* renamed from: a */
        public final void mo17700a(Fragment fragment) {
            C0538i childFragmentManager = fragment.getChildFragmentManager();
            Intrinsics.checkReturnedValueIsNotNull((Object) childFragmentManager, "childFragmentManager");
            Fragment f = childFragmentManager.mo3160f();
            if (f != null) {
                Fragment targetFragment = f.getTargetFragment();
                if (targetFragment != null) {
                    targetFragment.onActivityResult(f.getTargetRequestCode(), -1, this.f13570c);
                }
            }
            fragment.getChildFragmentManager().mo3161g();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17700a((Fragment) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.n.f$d */
    /* compiled from: FragmentViewNavigation.kt */
    static final class C5796d extends C12881k implements Function1<Fragment, C13145v> {

        /* renamed from: U */
        final /* synthetic */ Fragment f13571U;

        /* renamed from: c */
        final /* synthetic */ C5792f f13572c;

        C5796d(C5792f fVar, Fragment fragment) {
            this.f13572c = fVar;
            this.f13571U = fragment;
            super(1);
        }

        /* renamed from: a */
        public final void mo17701a(Fragment fragment) {
            fragment.getChildFragmentManager().mo3156b();
            C0538i childFragmentManager = fragment.getChildFragmentManager();
            Intrinsics.checkReturnedValueIsNotNull((Object) childFragmentManager, "childFragmentManager");
            if (childFragmentManager.mo3157c() > 0) {
                C0539a b = fragment.getChildFragmentManager().mo3154b(0);
                Intrinsics.checkReturnedValueIsNotNull((Object) b, "childFragmentManager.getBackStackEntryAt(0)");
                fragment.getChildFragmentManager().mo3148a(b.getId(), 1);
            }
            C0564o a = fragment.getChildFragmentManager().mo3147a();
            a.mo3318b(this.f13572c.mo17698b(), this.f13571U);
            a.mo3048d(this.f13571U);
            a.mo3316a(true);
            a.mo3030a();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17701a((Fragment) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.n.f$e */
    /* compiled from: FragmentViewNavigation.kt */
    static final class C5797e extends C12881k implements Function1<Fragment, C13145v> {

        /* renamed from: U */
        final /* synthetic */ boolean f13573U;

        /* renamed from: V */
        final /* synthetic */ C5791e f13574V;

        /* renamed from: W */
        final /* synthetic */ C5794b f13575W;

        /* renamed from: X */
        final /* synthetic */ Fragment f13576X;

        /* renamed from: Y */
        final /* synthetic */ String f13577Y;

        /* renamed from: c */
        final /* synthetic */ C5792f f13578c;

        C5797e(C5792f fVar, boolean z, C5791e eVar, C5794b bVar, Fragment fragment, String str) {
            this.f13578c = fVar;
            this.f13573U = z;
            this.f13574V = eVar;
            this.f13575W = bVar;
            this.f13576X = fragment;
            this.f13577Y = str;
            super(1);
        }

        /* renamed from: a */
        public final void mo17702a(Fragment fragment) {
            if (this.f13573U) {
                fragment.getChildFragmentManager().mo3161g();
            }
            C0564o a = fragment.getChildFragmentManager().mo3147a();
            C5791e eVar = this.f13574V;
            if (eVar != null) {
                a.mo3310a(eVar.mo17688a(), eVar.mo17689b(), eVar.mo17690c(), eVar.mo17691d());
            }
            if (this.f13575W == C5794b.ADD_VIEW) {
                a.mo3311a(this.f13578c.mo17698b(), this.f13576X);
            } else {
                a.mo3318b(this.f13578c.mo17698b(), this.f13576X);
            }
            a.mo3048d(this.f13576X);
            a.mo3315a(this.f13577Y);
            a.mo3316a(true);
            a.mo3030a();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17702a((Fragment) obj);
            return C13145v.f29587a;
        }
    }

    public C5792f(C8436a aVar, int i) {
        super(aVar);
        this.f13566b = i;
    }

    /* renamed from: a */
    public static final C5792f m18756a(Fragment fragment, int i) {
        return f13565c.mo17699a(fragment, i);
    }

    /* renamed from: a */
    public final void mo17696a(Fragment fragment) {
        mo17684a(new C5796d(this, fragment));
    }

    /* renamed from: b */
    public final int mo17698b() {
        return this.f13566b;
    }

    /* renamed from: a */
    public static /* synthetic */ void m18757a(C5792f fVar, Fragment fragment, boolean z, C5791e eVar, String str, C5794b bVar, int i, Object obj) {
        boolean z2 = (i & 2) != 0 ? false : z;
        C5791e eVar2 = (i & 4) != 0 ? null : eVar;
        String str2 = (i & 8) != 0 ? null : str;
        if ((i & 16) != 0) {
            bVar = C5794b.REPLACE_VIEW;
        }
        fVar.mo17697a(fragment, z2, eVar2, str2, bVar);
    }

    /* renamed from: a */
    public final void mo17697a(Fragment fragment, boolean z, C5791e eVar, String str, C5794b bVar) {
        C5797e eVar2 = new C5797e(this, z, eVar, bVar, fragment, str);
        mo17684a(eVar2);
    }

    /* renamed from: a */
    public final void mo17695a(Intent intent) {
        mo17684a(new C5795c(intent));
    }
}
