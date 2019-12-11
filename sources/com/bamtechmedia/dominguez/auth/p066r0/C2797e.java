package com.bamtechmedia.dominguez.auth.p066r0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bamtechmedia.dominguez.auth.C2718i0;
import com.bamtechmedia.dominguez.auth.C2723k0;
import com.bamtechmedia.dominguez.auth.p061o0.C2743d;
import com.bamtechmedia.dominguez.core.utils.C5823d;
import com.bamtechmedia.dominguez.core.utils.C5833g;
import com.bamtechmedia.dominguez.core.utils.C5839j;
import com.bamtechmedia.dominguez.dictionaries.C6090n;
import com.bamtechmedia.dominguez.profiles.p263u1.C6859b;
import java.util.HashMap;
import kotlin.C12907r;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty;
import p512h.p513c.p514k.C11885d;
import p520io.reactivex.C11969r;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u0000 72\u00020\u0001:\u00017B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010&\u001a\u00020'H\u0002J\u0012\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J$\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0010\u00102\u001a\u00020)2\u0006\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u00020)H\u0002J\b\u00106\u001a\u00020'H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\t\u0010\u000bR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u00068"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/logout/LogOutDialogFragment;", "Ldagger/android/support/DaggerAppCompatDialogFragment;", "()V", "ioScheduler", "Lio/reactivex/Scheduler;", "getIoScheduler", "()Lio/reactivex/Scheduler;", "setIoScheduler", "(Lio/reactivex/Scheduler;)V", "isSoftLogout", "", "()Z", "isSoftLogout$delegate", "Lcom/bamtechmedia/dominguez/core/utils/BooleanFragmentArgumentDelegate;", "languageSwitcher", "Lcom/bamtechmedia/dominguez/dictionaries/LanguageSwitcher;", "getLanguageSwitcher", "()Lcom/bamtechmedia/dominguez/dictionaries/LanguageSwitcher;", "setLanguageSwitcher", "(Lcom/bamtechmedia/dominguez/dictionaries/LanguageSwitcher;)V", "logOutAction", "Lcom/bamtechmedia/dominguez/auth/logout/LogOutAction;", "getLogOutAction", "()Lcom/bamtechmedia/dominguez/auth/logout/LogOutAction;", "setLogOutAction", "(Lcom/bamtechmedia/dominguez/auth/logout/LogOutAction;)V", "logOutListener", "Lcom/bamtechmedia/dominguez/auth/api/LogOutListener;", "getLogOutListener", "()Lcom/bamtechmedia/dominguez/auth/api/LogOutListener;", "setLogOutListener", "(Lcom/bamtechmedia/dominguez/auth/api/LogOutListener;)V", "userProfileModeTracker", "Lcom/bamtechmedia/dominguez/profiles/api/UserProfileModeTracker;", "getUserProfileModeTracker", "()Lcom/bamtechmedia/dominguez/profiles/api/UserProfileModeTracker;", "setUserProfileModeTracker", "(Lcom/bamtechmedia/dominguez/profiles/api/UserProfileModeTracker;)V", "logOut", "Lio/reactivex/disposables/Disposable;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onLogOutError", "throwable", "", "onLogoutComplete", "softLogOut", "Companion", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.r0.e */
/* compiled from: LogOutDialogFragment.kt */
public final class C2797e extends C11885d {

    /* renamed from: b0 */
    static final /* synthetic */ KProperty[] f7550b0 = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(C2797e.class), "isSoftLogout", "isSoftLogout()Z"))};

    /* renamed from: c0 */
    public static final C2798a f7551c0 = new C2798a(null);

    /* renamed from: U */
    public C2793c f7552U;

    /* renamed from: V */
    public C2743d f7553V;

    /* renamed from: W */
    public C6090n f7554W;

    /* renamed from: X */
    public C6859b f7555X;

    /* renamed from: Y */
    public C11969r f7556Y;

    /* renamed from: Z */
    private final C5823d f7557Z = C5839j.m18846a("softLogout", Boolean.valueOf(false));

    /* renamed from: a0 */
    private HashMap f7558a0;

    /* renamed from: com.bamtechmedia.dominguez.auth.r0.e$a */
    /* compiled from: LogOutDialogFragment.kt */
    public static final class C2798a {
        private C2798a() {
        }

        /* renamed from: a */
        public final C2797e mo11809a(boolean z) {
            C2797e eVar = new C2797e();
            eVar.setArguments(C5833g.m18829a(C12907r.m40244a("softLogout", Boolean.valueOf(z))));
            return eVar;
        }

        public /* synthetic */ C2798a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.r0.e$b */
    /* compiled from: LogOutDialogFragment.kt */
    static final /* synthetic */ class C2799b extends C12879i implements Function0<C13145v> {
        C2799b(C2797e eVar) {
            super(0, eVar);
        }

        public final String getName() {
            return "onLogoutComplete";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C2797e.class);
        }

        public final String getSignature() {
            return "onLogoutComplete()V";
        }

        public final void invoke() {
            ((C2797e) this.receiver).m10472q();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.r0.e$c */
    /* compiled from: LogOutDialogFragment.kt */
    static final class C2800c implements C11945a {

        /* renamed from: a */
        public static final C2800c f7559a = new C2800c();

        C2800c() {
        }

        public final void run() {
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.r0.e$d */
    /* compiled from: LogOutDialogFragment.kt */
    static final /* synthetic */ class C2801d extends C12879i implements Function1<Throwable, C13145v> {
        C2801d(C2797e eVar) {
            super(1, eVar);
        }

        /* renamed from: a */
        public final void mo11810a(Throwable th) {
            ((C2797e) this.receiver).m10469a(th);
        }

        public final String getName() {
            return "onLogOutError";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C2797e.class);
        }

        public final String getSignature() {
            return "onLogOutError(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11810a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.r0.e$e */
    /* compiled from: LogOutDialogFragment.kt */
    static final /* synthetic */ class C2802e extends C12879i implements Function0<C13145v> {
        C2802e(C2797e eVar) {
            super(0, eVar);
        }

        public final String getName() {
            return "onLogoutComplete";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C2797e.class);
        }

        public final String getSignature() {
            return "onLogoutComplete()V";
        }

        public final void invoke() {
            ((C2797e) this.receiver).m10472q();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.r0.e$f */
    /* compiled from: LogOutDialogFragment.kt */
    static final class C2803f implements C11945a {

        /* renamed from: a */
        public static final C2803f f7560a = new C2803f();

        C2803f() {
        }

        public final void run() {
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.r0.e$g */
    /* compiled from: LogOutDialogFragment.kt */
    static final /* synthetic */ class C2804g extends C12879i implements Function1<Throwable, C13145v> {
        C2804g(C2797e eVar) {
            super(1, eVar);
        }

        /* renamed from: a */
        public final void mo11811a(Throwable th) {
            ((C2797e) this.receiver).m10469a(th);
        }

        public final String getName() {
            return "onLogOutError";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C2797e.class);
        }

        public final String getSignature() {
            return "onLogOutError(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11811a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: o */
    private final boolean m10470o() {
        return this.f7557Z.mo17732a(this, f7550b0[0]).booleanValue();
    }

    /* renamed from: p */
    private final Disposable m10471p() {
        C2793c cVar = this.f7552U;
        if (cVar != null) {
            Completable b = cVar.mo11570a().mo30050b((C11945a) new C2805f(new C2799b(this)));
            C6090n nVar = this.f7554W;
            if (nVar != null) {
                Disposable a = b.mo30034a((CompletableSource) nVar.mo18350a(null)).mo30047a(C2800c.f7559a, new C2806g(new C2801d(this)));
                Intrinsics.checkReturnedValueIsNotNull((Object) a, "logOutAction.onLogout()\n…ribe({}, ::onLogOutError)");
                return a;
            }
            Intrinsics.throwUninitializedPropertyAccessException("languageSwitcher");
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("logOutAction");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final void m10472q() {
        C6859b bVar = this.f7555X;
        if (bVar != null) {
            bVar.mo19624a(false);
            C2743d dVar = this.f7553V;
            if (dVar != null) {
                dVar.mo11753a();
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("logOutListener");
                throw null;
            }
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("userProfileModeTracker");
            throw null;
        }
    }

    /* renamed from: r */
    private final Disposable m10473r() {
        C2793c cVar = this.f7552U;
        if (cVar != null) {
            Completable b = cVar.mo11572c().mo30050b((C11945a) new C2805f(new C2802e(this)));
            C6090n nVar = this.f7554W;
            if (nVar != null) {
                Disposable a = b.mo30034a((CompletableSource) nVar.mo18350a(null)).mo30047a(C2803f.f7560a, new C2806g(new C2804g(this)));
                Intrinsics.checkReturnedValueIsNotNull((Object) a, "logOutAction.onSoftLogou…ribe({}, ::onLogOutError)");
                return a;
            }
            Intrinsics.throwUninitializedPropertyAccessException("languageSwitcher");
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("logOutAction");
        throw null;
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f7558a0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
        setStyle(0, C2723k0.FullScreenDialogOverlay);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C2718i0.fragment_progress, viewGroup, false);
        if (m10470o()) {
            m10473r();
        } else {
            m10471p();
        }
        Intrinsics.checkReturnedValueIsNotNull((Object) inflate, "inflater.inflate(R.layou…)\n            }\n        }");
        return inflate;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m10469a(Throwable th) {
        Timber.m44527b(th);
        C13145v vVar = C13145v.f29587a;
        m10472q();
    }
}
