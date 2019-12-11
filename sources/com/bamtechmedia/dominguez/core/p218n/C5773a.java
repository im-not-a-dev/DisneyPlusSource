package com.bamtechmedia.dominguez.core.p218n;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.C0530c;
import androidx.fragment.app.C0532d;
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
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import p163g.p437h.p438a.p439a.p440a.C10893a;
import p163g.p437h.p438a.p439a.p440a.C10895c;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J0\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eJ\u0006\u0010\u0011\u001a\u00020\bJ\u001f\u0010\u0012\u001a\u00020\b2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0002\b\u0015J\u000e\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0018J\u001a\u0010\u0019\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fJ0\u0010\u001a\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eJ\u001a\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u001e\u001a\u00020\b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u000eJ*\u0010\u001e\u001a\u00020\b\"\b\b\u0000\u0010\"*\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\"0%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'J$\u0010(\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010)\u001a\u00020\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018J:\u0010*\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010+\u001a\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/navigation/ActivityNavigation;", "Lcom/bamtechmedia/dominguez/core/navigation/DialogFragmentHost;", "navEventHandler", "Lcom/disney/dominguez/navigation/core/NavEventHandler;", "fragmentContainerId", "", "(Lcom/disney/dominguez/navigation/core/NavEventHandler;I)V", "addBackStack", "", "fragment", "Landroidx/fragment/app/Fragment;", "transitionAnimations", "Lcom/bamtechmedia/dominguez/core/navigation/FragmentTransitionAnimations;", "predicate", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentManager;", "", "goBack", "navigateOnActivity", "runOnActivity", "Landroidx/fragment/app/FragmentActivity;", "Lkotlin/ExtensionFunctionType;", "popBackStack", "backStackName", "", "removeBackStack", "replaceBackStack", "showDialogFragment", "Landroidx/fragment/app/DialogFragment;", "tag", "startActivity", "createIntent", "Landroid/content/Context;", "Landroid/content/Intent;", "T", "Landroid/app/Activity;", "activityClass", "Ljava/lang/Class;", "extras", "Landroid/os/Bundle;", "startFragment", "popCurrentFromStack", "updateBackStack", "isAdded", "Companion", "core-ui-framework_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.n.a */
/* compiled from: ActivityNavigation.kt */
public final class C5773a implements C5783b {

    /* renamed from: c */
    public static final C5774a f13535c = new C5774a(null);

    /* renamed from: a */
    private final C8436a f13536a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f13537b;

    /* renamed from: com.bamtechmedia.dominguez.core.n.a$a */
    /* compiled from: ActivityNavigation.kt */
    public static final class C5774a {
        private C5774a() {
        }

        /* renamed from: a */
        public final C5773a mo17673a(C0532d dVar, int i) {
            C0741y a = C0703a0.m3718a(dVar).mo4180a(ViewModelNavEventHandler.class);
            C12880j.m40222a((Object) a, "ViewModelProviders.of(ac…EventHandler::class.java)");
            ViewModelNavEventHandler viewModelNavEventHandler = (ViewModelNavEventHandler) a;
            if (!viewModelNavEventHandler.mo21647y().contains(Integer.valueOf(dVar.getLifecycle().hashCode()))) {
                dVar.getLifecycle().mo4134a(new Observer(viewModelNavEventHandler, new C10893a(dVar)));
                viewModelNavEventHandler.mo21647y().add(Integer.valueOf(dVar.getLifecycle().hashCode()));
            }
            return new C5773a(viewModelNavEventHandler, i);
        }

        public /* synthetic */ C5774a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.n.a$b */
    /* compiled from: ActivityNavigation.kt */
    static final class C5775b extends C12881k implements Function1<C0538i, Boolean> {

        /* renamed from: c */
        public static final C5775b f13538c = new C5775b();

        C5775b() {
            super(1);
        }

        /* renamed from: a */
        public final boolean mo17674a(C0538i iVar) {
            return true;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo17674a((C0538i) obj));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.n.a$c */
    /* compiled from: ActivityNavigation.kt */
    static final class C5776c extends C12881k implements Function1<C0532d, C13145v> {

        /* renamed from: c */
        final /* synthetic */ String f13539c;

        C5776c(String str) {
            this.f13539c = str;
            super(1);
        }

        /* renamed from: a */
        public final void mo17675a(C0532d dVar) {
            dVar.getSupportFragmentManager().mo3152a(this.f13539c, 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17675a((C0532d) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.n.a$d */
    /* compiled from: ActivityNavigation.kt */
    static final class C5777d extends C12881k implements Function1<C0532d, C13145v> {

        /* renamed from: U */
        final /* synthetic */ Fragment f13540U;

        /* renamed from: c */
        final /* synthetic */ C5791e f13541c;

        C5777d(C5791e eVar, Fragment fragment) {
            this.f13541c = eVar;
            this.f13540U = fragment;
            super(1);
        }

        /* renamed from: a */
        public final void mo17676a(C0532d dVar) {
            C0564o a = dVar.getSupportFragmentManager().mo3147a();
            C5791e eVar = this.f13541c;
            if (eVar != null) {
                a.mo3310a(eVar.mo17688a(), eVar.mo17689b(), eVar.mo17690c(), eVar.mo17691d());
            }
            a.mo3045c(this.f13540U);
            a.mo3030a();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17676a((C0532d) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.n.a$e */
    /* compiled from: ActivityNavigation.kt */
    static final class C5778e extends C12881k implements Function1<C0538i, Boolean> {

        /* renamed from: c */
        public static final C5778e f13542c = new C5778e();

        C5778e() {
            super(1);
        }

        /* renamed from: a */
        public final boolean mo17677a(C0538i iVar) {
            return true;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo17677a((C0538i) obj));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.n.a$f */
    /* compiled from: ActivityNavigation.kt */
    static final class C5779f extends C12881k implements Function1<C0532d, C13145v> {

        /* renamed from: U */
        final /* synthetic */ C0530c f13543U;

        /* renamed from: c */
        final /* synthetic */ String f13544c;

        C5779f(String str, C0530c cVar) {
            this.f13544c = str;
            this.f13543U = cVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo17678a(C0532d dVar) {
            if (this.f13544c == null || dVar.getSupportFragmentManager().mo3146a(this.f13544c) == null) {
                this.f13543U.show(dVar.getSupportFragmentManager(), this.f13544c);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17678a((C0532d) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.n.a$g */
    /* compiled from: ActivityNavigation.kt */
    static final class C5780g extends C12881k implements Function1<C0532d, C13145v> {

        /* renamed from: c */
        final /* synthetic */ Function1 f13545c;

        C5780g(Function1 function1) {
            this.f13545c = function1;
            super(1);
        }

        /* renamed from: a */
        public final void mo17679a(C0532d dVar) {
            dVar.startActivity((Intent) this.f13545c.invoke(dVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17679a((C0532d) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.n.a$h */
    /* compiled from: ActivityNavigation.kt */
    static final class C5781h extends C12881k implements Function1<C0532d, C13145v> {

        /* renamed from: U */
        final /* synthetic */ boolean f13546U;

        /* renamed from: V */
        final /* synthetic */ Fragment f13547V;

        /* renamed from: W */
        final /* synthetic */ String f13548W;

        /* renamed from: c */
        final /* synthetic */ C5773a f13549c;

        C5781h(C5773a aVar, boolean z, Fragment fragment, String str) {
            this.f13549c = aVar;
            this.f13546U = z;
            this.f13547V = fragment;
            this.f13548W = str;
            super(1);
        }

        /* renamed from: a */
        public final void mo17680a(C0532d dVar) {
            if (this.f13546U) {
                dVar.getSupportFragmentManager().mo3161g();
            }
            C0564o a = dVar.getSupportFragmentManager().mo3147a();
            a.mo3318b(this.f13549c.f13537b, this.f13547V);
            a.mo3048d(this.f13547V);
            a.mo3316a(true);
            a.mo3315a(this.f13548W);
            a.mo3030a();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17680a((C0532d) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.n.a$i */
    /* compiled from: ActivityNavigation.kt */
    static final class C5782i extends C12881k implements Function1<C0532d, C13145v> {

        /* renamed from: U */
        final /* synthetic */ Function1 f13550U;

        /* renamed from: V */
        final /* synthetic */ C5791e f13551V;

        /* renamed from: W */
        final /* synthetic */ boolean f13552W;

        /* renamed from: X */
        final /* synthetic */ Fragment f13553X;

        /* renamed from: c */
        final /* synthetic */ C5773a f13554c;

        C5782i(C5773a aVar, Function1 function1, C5791e eVar, boolean z, Fragment fragment) {
            this.f13554c = aVar;
            this.f13550U = function1;
            this.f13551V = eVar;
            this.f13552W = z;
            this.f13553X = fragment;
            super(1);
        }

        /* renamed from: a */
        public final void mo17681a(C0532d dVar) {
            dVar.getSupportFragmentManager().mo3156b();
            Function1 function1 = this.f13550U;
            C0538i supportFragmentManager = dVar.getSupportFragmentManager();
            String str = "supportFragmentManager";
            C12880j.m40222a((Object) supportFragmentManager, str);
            if (((Boolean) function1.invoke(supportFragmentManager)).booleanValue()) {
                C0538i supportFragmentManager2 = dVar.getSupportFragmentManager();
                C12880j.m40222a((Object) supportFragmentManager2, str);
                if (supportFragmentManager2.mo3157c() > 0) {
                    C0539a b = dVar.getSupportFragmentManager().mo3154b(0);
                    C12880j.m40222a((Object) b, "supportFragmentManager.getBackStackEntryAt(0)");
                    dVar.getSupportFragmentManager().mo3148a(b.getId(), 1);
                }
                C0564o a = dVar.getSupportFragmentManager().mo3147a();
                C5791e eVar = this.f13551V;
                if (eVar != null) {
                    a.mo3310a(eVar.mo17688a(), eVar.mo17689b(), eVar.mo17690c(), eVar.mo17691d());
                }
                if (this.f13552W) {
                    a.mo3311a(this.f13554c.f13537b, this.f13553X);
                } else {
                    a.mo3318b(this.f13554c.f13537b, this.f13553X);
                }
                a.mo3048d(this.f13553X);
                a.mo3316a(true);
                a.mo3030a();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17681a((C0532d) obj);
            return C13145v.f29587a;
        }
    }

    public C5773a(C8436a aVar, int i) {
        this.f13536a = aVar;
        this.f13537b = i;
    }

    /* renamed from: a */
    public static final C5773a m18719a(C0532d dVar, int i) {
        return f13535c.mo17673a(dVar, i);
    }

    /* renamed from: b */
    public static /* synthetic */ void m18724b(C5773a aVar, Fragment fragment, C5791e eVar, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            eVar = null;
        }
        if ((i & 4) != 0) {
            function1 = C5778e.f13542c;
        }
        aVar.mo17671b(fragment, eVar, function1);
    }

    /* renamed from: a */
    public final void mo17670a(Function1<? super C0532d, C13145v> function1) {
        this.f13536a.mo21645a(new C10895c(function1));
    }

    /* renamed from: b */
    public final void mo17671b(Fragment fragment, C5791e eVar, Function1<? super C0538i, Boolean> function1) {
        m18720a(fragment, eVar, function1, false);
    }

    /* renamed from: a */
    public static /* synthetic */ void m18722a(C5773a aVar, Fragment fragment, C5791e eVar, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            eVar = null;
        }
        if ((i & 4) != 0) {
            function1 = C5775b.f13538c;
        }
        aVar.mo17666a(fragment, eVar, function1);
    }

    /* renamed from: b */
    public final void mo17672b(Function1<? super Context, ? extends Intent> function1) {
        mo17670a((Function1<? super C0532d, C13145v>) new C5780g<Object,C13145v>(function1));
    }

    /* renamed from: a */
    public final void mo17666a(Fragment fragment, C5791e eVar, Function1<? super C0538i, Boolean> function1) {
        m18720a(fragment, eVar, function1, true);
    }

    /* renamed from: a */
    private final void m18720a(Fragment fragment, C5791e eVar, Function1<? super C0538i, Boolean> function1, boolean z) {
        C5782i iVar = new C5782i(this, function1, eVar, z, fragment);
        mo17670a((Function1<? super C0532d, C13145v>) iVar);
    }

    /* renamed from: a */
    public static /* synthetic */ void m18721a(C5773a aVar, Fragment fragment, C5791e eVar, int i, Object obj) {
        if ((i & 2) != 0) {
            eVar = null;
        }
        aVar.mo17665a(fragment, eVar);
    }

    /* renamed from: a */
    public final void mo17665a(Fragment fragment, C5791e eVar) {
        mo17670a((Function1<? super C0532d, C13145v>) new C5777d<Object,C13145v>(eVar, fragment));
    }

    /* renamed from: a */
    public static /* synthetic */ void m18723a(C5773a aVar, Fragment fragment, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        aVar.mo17667a(fragment, z, str);
    }

    /* renamed from: a */
    public final void mo17667a(Fragment fragment, boolean z, String str) {
        mo17670a((Function1<? super C0532d, C13145v>) new C5781h<Object,C13145v>(this, z, fragment, str));
    }

    /* renamed from: a */
    public void mo17668a(C0530c cVar, String str) {
        mo17670a((Function1<? super C0532d, C13145v>) new C5779f<Object,C13145v>(str, cVar));
    }

    /* renamed from: a */
    public final void mo17669a(String str) {
        mo17670a((Function1<? super C0532d, C13145v>) new C5776c<Object,C13145v>(str));
    }
}
