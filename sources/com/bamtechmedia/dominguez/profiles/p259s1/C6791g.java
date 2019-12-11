package com.bamtechmedia.dominguez.profiles.p259s1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.C0532d;
import androidx.lifecycle.C0715i;
import androidx.lifecycle.C0715i.C0717b;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.analytics.C2413n;
import com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar;
import com.bamtechmedia.dominguez.core.design.widgets.OnOffToggleTextView;
import com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.C5704a;
import com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.FieldInputLayout;
import com.bamtechmedia.dominguez.core.framework.C5755i;
import com.bamtechmedia.dominguez.core.p084g.C3800a;
import com.bamtechmedia.dominguez.core.utils.C5816a;
import com.bamtechmedia.dominguez.core.utils.C5823d;
import com.bamtechmedia.dominguez.core.utils.C5833g;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5839j;
import com.bamtechmedia.dominguez.core.utils.C5852n0;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import com.bamtechmedia.dominguez.core.utils.C5883w;
import com.bamtechmedia.dominguez.profiles.C6629d0;
import com.bamtechmedia.dominguez.profiles.C6653e;
import com.bamtechmedia.dominguez.profiles.C6657f;
import com.bamtechmedia.dominguez.profiles.C6769r0.C6771b.C6774b;
import com.bamtechmedia.dominguez.profiles.C6780r1;
import com.bamtechmedia.dominguez.profiles.C6969y0;
import com.bamtechmedia.dominguez.profiles.p259s1.C6808i.C6809a;
import com.bamtechmedia.dominguez.profiles.p268x1.C6913e;
import java.util.HashMap;
import kotlin.C12907r;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import p096e.p121h.p135s.C4127b0;
import p163g.p201e.p203b.p299m.C7536a;
import p163g.p201e.p203b.p299m.C7536a.C7538b;
import p163g.p201e.p203b.p299m.C7543f.C7544a;
import p163g.p201e.p203b.p299m.C7547h;
import p163g.p201e.p203b.p312q.C7717x;
import p163g.p201e.p203b.p314r.C7738g;
import p163g.p201e.p203b.p330z.C7946e;
import p163g.p201e.p203b.p330z.C7948g;
import p163g.p201e.p203b.p330z.C7949h;
import p512h.p513c.p514k.C11890i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 m2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001mB\u0005¢\u0006\u0002\u0010\u0005J\b\u0010F\u001a\u00020GH\u0016J\"\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u001b2\u0006\u0010K\u001a\u00020\u001b2\b\u0010L\u001a\u0004\u0018\u00010MH\u0016J\u0018\u0010N\u001a\u00020\u001d2\u0006\u0010O\u001a\u00020\u001b2\u0006\u0010P\u001a\u00020\u001bH\u0016J&\u0010Q\u001a\u0004\u0018\u00010R2\u0006\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010V2\b\u0010W\u001a\u0004\u0018\u00010XH\u0016J\u000f\u0010Y\u001a\u0004\u0018\u00010IH\u0007¢\u0006\u0002\u0010ZJ\b\u0010[\u001a\u00020IH\u0016J\u0010\u0010\\\u001a\u00020I2\u0006\u0010]\u001a\u00020^H\u0007J\b\u0010_\u001a\u00020IH\u0016J\u001a\u0010`\u001a\u00020I2\u0006\u0010a\u001a\u00020R2\b\u0010W\u001a\u0004\u0018\u00010XH\u0016J\b\u0010b\u001a\u00020IH\u0002J\b\u0010c\u001a\u00020IH\u0002J\b\u0010d\u001a\u00020IH\u0002J3\u0010e\u001a\u00020I2\u0006\u0010f\u001a\u00020\u001d2!\u0010g\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\bi\u0012\b\bj\u0012\u0004\b\b(k\u0012\u0004\u0012\u00020I0hH\u0002J3\u0010l\u001a\u00020I2\u0006\u0010f\u001a\u00020\u001d2!\u0010g\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\bi\u0012\b\bj\u0012\u0004\b\b(k\u0012\u0004\u0012\u00020I0hH\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u001d8FX\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001c\u0010\u001eR\u000e\u0010!\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001e\u0010(\u001a\u00020)8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001e\u0010.\u001a\u00020/8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001e\u00104\u001a\u0002058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001b\u0010:\u001a\u00020;8FX\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b<\u0010=R\u001e\u0010@\u001a\u00020A8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006n"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/add/AddProfileFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/bamtechmedia/dominguez/globalnav/HideNavMenu;", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsStateProvider;", "Lcom/bamtechmedia/dominguez/dialogs/AlertDialogCallback;", "()V", "analytics", "Lcom/bamtechmedia/dominguez/profiles/add/AddProfileAnalytics;", "getAnalytics", "()Lcom/bamtechmedia/dominguez/profiles/add/AddProfileAnalytics;", "setAnalytics", "(Lcom/bamtechmedia/dominguez/profiles/add/AddProfileAnalytics;)V", "avatarImages", "Lcom/bamtechmedia/dominguez/profiles/AvatarImages;", "getAvatarImages", "()Lcom/bamtechmedia/dominguez/profiles/AvatarImages;", "setAvatarImages", "(Lcom/bamtechmedia/dominguez/profiles/AvatarImages;)V", "dialogRouter", "Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;", "getDialogRouter", "()Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;", "setDialogRouter", "(Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;)V", "error", "Lcom/bamtechmedia/dominguez/profiles/add/ProfileError;", "errorId", "", "isEditProfile", "", "()Z", "isEditProfile$delegate", "Lcom/bamtechmedia/dominguez/core/utils/BooleanFragmentArgumentDelegate;", "isRestart", "languageFallbackLogic", "Lcom/bamtechmedia/dominguez/profiles/language/LanguageFallbackLogic;", "getLanguageFallbackLogic", "()Lcom/bamtechmedia/dominguez/profiles/language/LanguageFallbackLogic;", "setLanguageFallbackLogic", "(Lcom/bamtechmedia/dominguez/profiles/language/LanguageFallbackLogic;)V", "profileAccessibility", "Lcom/bamtechmedia/dominguez/profiles/ProfileAccessibility;", "getProfileAccessibility", "()Lcom/bamtechmedia/dominguez/profiles/ProfileAccessibility;", "setProfileAccessibility", "(Lcom/bamtechmedia/dominguez/profiles/ProfileAccessibility;)V", "profilesHostViewModel", "Lcom/bamtechmedia/dominguez/profiles/ProfilesHostViewModel;", "getProfilesHostViewModel", "()Lcom/bamtechmedia/dominguez/profiles/ProfilesHostViewModel;", "setProfilesHostViewModel", "(Lcom/bamtechmedia/dominguez/profiles/ProfilesHostViewModel;)V", "setupProfileOptionViews", "Lcom/bamtechmedia/dominguez/profiles/add/SetupProfileOptionViews;", "getSetupProfileOptionViews", "()Lcom/bamtechmedia/dominguez/profiles/add/SetupProfileOptionViews;", "setSetupProfileOptionViews", "(Lcom/bamtechmedia/dominguez/profiles/add/SetupProfileOptionViews;)V", "tempProfile", "Lcom/bamtechmedia/dominguez/profiles/TempProfile;", "getTempProfile", "()Lcom/bamtechmedia/dominguez/profiles/TempProfile;", "tempProfile$delegate", "Lcom/bamtechmedia/dominguez/core/utils/ParcelableFragmentArgumentDelegate;", "viewModel", "Lcom/bamtechmedia/dominguez/profiles/add/AddProfileViewModel;", "getViewModel", "()Lcom/bamtechmedia/dominguez/profiles/add/AddProfileViewModel;", "setViewModel", "(Lcom/bamtechmedia/dominguez/profiles/add/AddProfileViewModel;)V", "getAnalyticsSection", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsSection;", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onAlertDialogAction", "requestId", "which", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onSaveClicked", "()Lkotlin/Unit;", "onStart", "onStateChanged", "state", "Lcom/bamtechmedia/dominguez/profiles/add/AddProfileViewModel$State;", "onStop", "onViewCreated", "view", "setupButtons", "setupViews", "showError", "toggleAutoSwitchPlay", "isKidsSwitchToggledOn", "autoPlayToggled", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isChecked", "toggleAutoSwitchPlayTv", "Companion", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.s1.g */
/* compiled from: AddProfileFragment.kt */
public final class C6791g extends C11890i implements C7717x, C2413n, C7536a {

    /* renamed from: i0 */
    static final /* synthetic */ KProperty[] f15185i0 = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(C6791g.class), "tempProfile", "getTempProfile()Lcom/bamtechmedia/dominguez/profiles/TempProfile;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(C6791g.class), "isEditProfile", "isEditProfile()Z"))};

    /* renamed from: j0 */
    public static final C6792a f15186j0 = new C6792a(null);

    /* renamed from: U */
    public C6808i f15187U;

    /* renamed from: V */
    public C6829k f15188V;

    /* renamed from: W */
    public C6969y0 f15189W;

    /* renamed from: X */
    public C6785b f15190X;

    /* renamed from: Y */
    public C6913e f15191Y;

    /* renamed from: Z */
    public C7547h f15192Z;

    /* renamed from: a0 */
    public C6657f f15193a0;

    /* renamed from: b0 */
    public C6629d0 f15194b0;

    /* renamed from: c0 */
    private final C5883w f15195c0 = C5839j.m18852a("temp_profile", (Function0) null, 2, (Object) null);

    /* renamed from: d0 */
    private final C5823d f15196d0 = C5839j.m18847a("is_edit_profile", (Boolean) null, 2, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public boolean f15197e0;

    /* renamed from: f0 */
    private int f15198f0;

    /* renamed from: g0 */
    private C6828j f15199g0;

    /* renamed from: h0 */
    private HashMap f15200h0;

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.g$a */
    /* compiled from: AddProfileFragment.kt */
    public static final class C6792a {
        private C6792a() {
        }

        /* renamed from: a */
        public final C6791g mo19535a(C6780r1 r1Var, boolean z, C2378m mVar) {
            C6791g gVar = new C6791g();
            gVar.setArguments(C5833g.m18829a(C12907r.m40244a("section", mVar), C12907r.m40244a("temp_profile", r1Var), C12907r.m40244a("is_edit_profile", Boolean.valueOf(z))));
            return gVar;
        }

        public /* synthetic */ C6792a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.g$b */
    /* compiled from: AddProfileFragment.kt */
    static final class C6793b extends C12881k implements Function1<C6809a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C6791g f15201c;

        C6793b(C6791g gVar) {
            this.f15201c = gVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo19536a(C6809a aVar) {
            this.f15201c.mo19528a(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19536a((C6809a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.g$c */
    /* compiled from: AddProfileFragment.kt */
    static final class C6794c extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C6791g f15202c;

        C6794c(C6791g gVar) {
            this.f15202c = gVar;
            super(0);
        }

        public final void invoke() {
            this.f15202c.requireActivity().onBackPressed();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.g$d */
    /* compiled from: AddProfileFragment.kt */
    static final class C6795d extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C6791g f15203c;

        C6795d(C6791g gVar) {
            this.f15203c = gVar;
            super(0);
        }

        public final void invoke() {
            this.f15203c.mo19534s();
            this.f15203c.mo19530o().mo19525b();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.g$e */
    /* compiled from: AddProfileFragment.kt */
    static final class C6796e implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C6791g f15204c;

        C6796e(C6791g gVar) {
            this.f15204c = gVar;
        }

        public final void onClick(View view) {
            this.f15204c.mo19534s();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.g$f */
    /* compiled from: AddProfileFragment.kt */
    static final class C6797f implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C6791g f15205c;

        C6797f(C6791g gVar) {
            this.f15205c = gVar;
        }

        public final void onClick(View view) {
            this.f15205c.getViewModel().mo19557z();
            this.f15205c.mo19530o().mo19524a();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.g$g */
    /* compiled from: AddProfileFragment.kt */
    static final class C6798g implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C6791g f15206c;

        C6798g(C6791g gVar) {
            this.f15206c = gVar;
        }

        public final void onClick(View view) {
            this.f15206c.f15197e0 = true;
            this.f15206c.getViewModel().mo19550a(this.f15206c);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.g$h */
    /* compiled from: AddProfileFragment.kt */
    static final class C6799h implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C6791g f15207c;

        C6799h(C6791g gVar) {
            this.f15207c = gVar;
        }

        public final void onClick(View view) {
            this.f15207c.getViewModel().mo19550a(this.f15207c);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.g$i */
    /* compiled from: AddProfileFragment.kt */
    static final class C6800i extends C12881k implements Function1<String, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C6791g f15208c;

        C6800i(C6791g gVar) {
            this.f15208c = gVar;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C13145v.f29587a;
        }

        public final void invoke(String str) {
            C0715i lifecycle = this.f15208c.getLifecycle();
            C12880j.m40222a((Object) lifecycle, "lifecycle");
            if (lifecycle.mo4133a().mo4136a(C0717b.RESUMED)) {
                this.f15208c.getViewModel().mo19552b(C12833x.m40181f(str).toString());
            }
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "", "it", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.g$j */
    /* compiled from: AddProfileFragment.kt */
    static final class C6801j extends C12881k implements Function1<Boolean, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C6791g f15209c;

        /* renamed from: com.bamtechmedia.dominguez.profiles.s1.g$j$a */
        /* compiled from: AddProfileFragment.kt */
        static final class C6802a extends C12881k implements Function1<Boolean, C13145v> {

            /* renamed from: c */
            final /* synthetic */ C6801j f15210c;

            C6802a(C6801j jVar) {
                this.f15210c = jVar;
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return C13145v.f29587a;
            }

            public final void invoke(boolean z) {
                this.f15210c.f15209c.getViewModel().mo19553d(z);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.profiles.s1.g$j$b */
        /* compiled from: AddProfileFragment.kt */
        static final class C6803b extends C12881k implements Function1<Boolean, C13145v> {

            /* renamed from: c */
            final /* synthetic */ C6801j f15211c;

            C6803b(C6801j jVar) {
                this.f15211c = jVar;
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return C13145v.f29587a;
            }

            public final void invoke(boolean z) {
                this.f15211c.f15209c.getViewModel().mo19553d(z);
            }
        }

        C6801j(C6791g gVar) {
            this.f15209c = gVar;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return C13145v.f29587a;
        }

        public final void invoke(boolean z) {
            this.f15209c.getViewModel().mo19555f(z);
            C0532d requireActivity = this.f15209c.requireActivity();
            C12880j.m40222a((Object) requireActivity, "requireActivity()");
            if (C5837i.m18843e(requireActivity)) {
                this.f15209c.m20895b(z, new C6802a(this));
            } else {
                this.f15209c.m20893a(z, (Function1<? super Boolean, C13145v>) new C6803b<Object,C13145v>(this));
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.g$k */
    /* compiled from: AddProfileFragment.kt */
    static final class C6804k extends C12881k implements Function1<Boolean, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C6791g f15212c;

        C6804k(C6791g gVar) {
            this.f15212c = gVar;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return C13145v.f29587a;
        }

        public final void invoke(boolean z) {
            this.f15212c.getViewModel().mo19553d(z);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.g$l */
    /* compiled from: AddProfileFragment.kt */
    static final class C6805l extends C12881k implements Function1<Boolean, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C6791g f15213c;

        C6805l(C6791g gVar) {
            this.f15213c = gVar;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return C13145v.f29587a;
        }

        public final void invoke(boolean z) {
            this.f15213c.getViewModel().mo19554e(z);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.s1.g$m */
    /* compiled from: AddProfileFragment.kt */
    static final class C6806m extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C6791g f15214c;

        C6806m(C6791g gVar) {
            this.f15214c = gVar;
            super(0);
        }

        public final void invoke() {
            this.f15214c.f15197e0 = true;
            this.f15214c.getViewModel().mo19551b(this.f15214c);
        }
    }

    /* renamed from: t */
    private final void m20896t() {
        DisneyTitleToolbar disneyTitleToolbar = (DisneyTitleToolbar) _$_findCachedViewById(C7946e.disneyToolbar);
        if (disneyTitleToolbar != null) {
            NestedScrollView nestedScrollView = (NestedScrollView) _$_findCachedViewById(C7946e.addProfileScrollView);
            C12880j.m40222a((Object) nestedScrollView, "addProfileScrollView");
            DisneyTitleToolbar.m18444a(disneyTitleToolbar, nestedScrollView, (Function1) null, 0, (Function0) new C6794c(this), 6, (Object) null);
        }
        DisneyTitleToolbar disneyTitleToolbar2 = (DisneyTitleToolbar) _$_findCachedViewById(C7946e.disneyToolbar);
        if (disneyTitleToolbar2 != null) {
            DisneyTitleToolbar.m18447a(disneyTitleToolbar2, (String) null, (Function0) new C6795d(this), 1, (Object) null);
        }
        Button button = (Button) _$_findCachedViewById(C7946e.doneButton);
        if (button != null) {
            button.setOnClickListener(new C6796e(this));
        }
        View _$_findCachedViewById = _$_findCachedViewById(C7946e.deleteButton);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setOnClickListener(new C6797f(this));
        }
    }

    /* renamed from: u */
    private final void m20897u() {
        int i = mo19533r() ? C7949h.edit_profile_title_2 : C7949h.create_profile_add_profile;
        TextView textView = (TextView) _$_findCachedViewById(C7946e.titleTextView);
        if (textView != null) {
            textView.setText(C5880u.m18936a(i));
        }
        DisneyTitleToolbar disneyTitleToolbar = (DisneyTitleToolbar) _$_findCachedViewById(C7946e.disneyToolbar);
        if (disneyTitleToolbar != null) {
            disneyTitleToolbar.setTitle(C5880u.m18936a(i));
        }
        C6629d0 d0Var = this.f15194b0;
        if (d0Var != null) {
            d0Var.mo19296a(this);
            m20896t();
            View _$_findCachedViewById = _$_findCachedViewById(C7946e.profileImage);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setOnClickListener(new C6798g(this));
            }
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C7946e.profileIconOption);
            if (linearLayout != null) {
                linearLayout.setOnClickListener(new C6799h(this));
            }
            C5704a.m18600a((FieldInputLayout) _$_findCachedViewById(C7946e.profileNameInput), null, new C6800i(this), C13183n.m40498a((ConstraintLayout) _$_findCachedViewById(C7946e.addProfileScrollContainer)), true, 1, null);
            if (mo19532q().isDefault()) {
                TextView textView2 = (TextView) _$_findCachedViewById(C7946e.defaultTextView);
                if (textView2 != null) {
                    textView2.setText(C5880u.m18936a(C7949h.primaryprofileexplainer));
                }
            }
            String str = "setupProfileOptionViews";
            if (!mo19532q().isDefault()) {
                C6829k kVar = this.f15188V;
                if (kVar != null) {
                    kVar.mo19600a(this, mo19532q().mo19354R(), (Function1<? super Boolean, C13145v>) new C6801j<Object,C13145v>(this));
                } else {
                    C12880j.m40227c(str);
                    throw null;
                }
            }
            C6829k kVar2 = this.f15188V;
            if (kVar2 != null) {
                kVar2.mo19602b(this, mo19532q().mo19356T(), mo19533r(), new C6804k(this));
                C6829k kVar3 = this.f15188V;
                if (kVar3 != null) {
                    kVar3.mo19601a(this, mo19532q().mo19351O(), mo19533r(), new C6805l(this));
                    C6829k kVar4 = this.f15188V;
                    if (kVar4 != null) {
                        kVar4.mo19599a(this, mo19533r(), (Function0<C13145v>) new C6806m<C13145v>(this));
                    } else {
                        C12880j.m40227c(str);
                        throw null;
                    }
                } else {
                    C12880j.m40227c(str);
                    throw null;
                }
            } else {
                C12880j.m40227c(str);
                throw null;
            }
        } else {
            C12880j.m40227c("profileAccessibility");
            throw null;
        }
    }

    /* renamed from: v */
    private final void m20898v() {
        C6828j jVar = this.f15199g0;
        if (jVar != null) {
            C7547h hVar = this.f15192Z;
            if (hVar != null) {
                C7544a aVar = new C7544a();
                aVar.mo20485i(jVar.mo19594c());
                aVar.mo20481g(jVar.mo19592a());
                aVar.mo20475d(jVar.mo19593b());
                hVar.mo20491b(aVar.mo20465a());
                return;
            }
            C12880j.m40227c("dialogRouter");
            throw null;
        }
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f15200h0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f15200h0 == null) {
            this.f15200h0 = new HashMap();
        }
        View view = (View) this.f15200h0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f15200h0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: d */
    public boolean mo11888d() {
        return C7538b.m22446a(this);
    }

    /* renamed from: e */
    public C2378m mo11534e() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            C2378m mVar = (C2378m) arguments.getParcelable("section");
            if (mVar != null) {
                C6969y0 y0Var = this.f15189W;
                if (y0Var != null) {
                    return C12880j.m40224a((Object) y0Var.mo19724y(), (Object) C6774b.f15156c) ? C2378m.m8910a(mVar, null, "OnBoarding", null, null, 13, null) : mVar;
                }
                C12880j.m40227c("profilesHostViewModel");
                throw null;
            }
        }
        throw new IllegalArgumentException("No section is provided for AddProfileFragment");
    }

    public final C6808i getViewModel() {
        C6808i iVar = this.f15187U;
        if (iVar != null) {
            return iVar;
        }
        C12880j.m40227c("viewModel");
        throw null;
    }

    /* renamed from: o */
    public final C6785b mo19530o() {
        C6785b bVar = this.f15190X;
        if (bVar != null) {
            return bVar;
        }
        C12880j.m40227c("analytics");
        throw null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null && i2 == -1) {
            if (i == 1000 || i == 2000) {
                Parcelable parcelableExtra = intent.getParcelableExtra("temp_profile");
                if (parcelableExtra != null) {
                    C6780r1 r1Var = (C6780r1) parcelableExtra;
                    C6808i iVar = this.f15187U;
                    if (iVar != null) {
                        iVar.mo19549a(r1Var, i);
                    } else {
                        C12880j.m40227c("viewModel");
                        throw null;
                    }
                } else {
                    throw new C13142s("null cannot be cast to non-null type com.bamtechmedia.dominguez.profiles.TempProfile");
                }
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C7738g.m22802a(this, C7948g.fragment_add_profile, viewGroup, false, 4, null);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onStart() {
        super.onStart();
        C0532d requireActivity = requireActivity();
        C12880j.m40222a((Object) requireActivity, "requireActivity()");
        C5816a.m18809b(requireActivity);
        C6808i iVar = this.f15187U;
        if (iVar != null) {
            C5755i.m18679a(this, iVar, null, null, new C6793b(this), 6, null);
            return;
        }
        C12880j.m40227c("viewModel");
        throw null;
    }

    public void onStop() {
        C0532d requireActivity = requireActivity();
        C12880j.m40222a((Object) requireActivity, "requireActivity()");
        C5816a.m18808a(requireActivity);
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C5852n0.m18884a(view, false, false, null, 6, null);
        m20897u();
    }

    /* renamed from: p */
    public final C6629d0 mo19531p() {
        C6629d0 d0Var = this.f15194b0;
        if (d0Var != null) {
            return d0Var;
        }
        C12880j.m40227c("profileAccessibility");
        throw null;
    }

    /* renamed from: q */
    public final C6780r1 mo19532q() {
        return (C6780r1) this.f15195c0.mo17776a(this, f15185i0[0]);
    }

    /* renamed from: r */
    public final boolean mo19533r() {
        return this.f15196d0.mo17732a(this, f15185i0[1]).booleanValue();
    }

    /* renamed from: s */
    public final C13145v mo19534s() {
        if (this.f15199g0 != null) {
            m20898v();
            return C13145v.f29587a;
        } else if (this.f15198f0 != 0) {
            FieldInputLayout fieldInputLayout = (FieldInputLayout) _$_findCachedViewById(C7946e.profileNameInput);
            if (fieldInputLayout == null) {
                return null;
            }
            fieldInputLayout.mo17574a(C5880u.m18936a(this.f15198f0));
            return C13145v.f29587a;
        } else {
            C6808i iVar = this.f15187U;
            if (iVar != null) {
                iVar.mo19548B();
                return C13145v.f29587a;
            }
            C12880j.m40227c("viewModel");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m20895b(boolean z, Function1<? super Boolean, C13145v> function1) {
        if (z) {
            OnOffToggleTextView onOffToggleTextView = (OnOffToggleTextView) _$_findCachedViewById(C7946e.autoPlayOnOffText);
            if (onOffToggleTextView != null) {
                boolean z2 = true;
                if (onOffToggleTextView.isChecked()) {
                    OnOffToggleTextView onOffToggleTextView2 = (OnOffToggleTextView) _$_findCachedViewById(C7946e.autoPlayOnOffText);
                    if (onOffToggleTextView2 != null) {
                        onOffToggleTextView2.toggle();
                    }
                    OnOffToggleTextView onOffToggleTextView3 = (OnOffToggleTextView) _$_findCachedViewById(C7946e.autoPlayOnOffText);
                    if (onOffToggleTextView3 == null || !onOffToggleTextView3.isChecked()) {
                        z2 = false;
                    }
                    function1.invoke(Boolean.valueOf(z2));
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo11887a(int i, int i2) {
        if (i == C7946e.delete_profile_request && i2 == -1) {
            C6808i iVar = this.f15187U;
            if (iVar != null) {
                iVar.mo19547A();
            } else {
                C12880j.m40227c("viewModel");
                throw null;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo19528a(C6809a aVar) {
        if (aVar.mo19562d()) {
            requireActivity().onBackPressed();
        }
        this.f15198f0 = aVar.mo19565f();
        this.f15199g0 = aVar.mo19563e();
        m20898v();
        TextView textView = (TextView) _$_findCachedViewById(C7946e.titleTextView);
        if (textView != null) {
            C4127b0.m14131b(textView, true);
        }
        DisneyTitleToolbar disneyTitleToolbar = (DisneyTitleToolbar) _$_findCachedViewById(C7946e.disneyToolbar);
        boolean z = false;
        if (disneyTitleToolbar != null) {
            disneyTitleToolbar.mo17380c(!aVar.mo19573m() || aVar.mo19574n());
        }
        View _$_findCachedViewById = _$_findCachedViewById(C7946e.deleteButton);
        if (_$_findCachedViewById != null) {
            if (!aVar.mo19573m() && aVar.mo19574n()) {
                z = true;
            }
            C4127b0.m14131b(_$_findCachedViewById, z);
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(C7946e.profileImage);
        if (_$_findCachedViewById2 != null) {
            _$_findCachedViewById2.setEnabled(!aVar.mo19569i());
        }
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C7946e.loadingView);
        if (progressBar != null) {
            C4127b0.m14131b(progressBar, aVar.mo19569i());
        }
        if (aVar.mo19565f() != 0) {
            FieldInputLayout fieldInputLayout = (FieldInputLayout) _$_findCachedViewById(C7946e.profileNameInput);
            if (fieldInputLayout != null) {
                fieldInputLayout.mo17574a(C5880u.m18936a(aVar.mo19565f()));
            }
        } else {
            FieldInputLayout fieldInputLayout2 = (FieldInputLayout) _$_findCachedViewById(C7946e.profileNameInput);
            if (fieldInputLayout2 != null) {
                fieldInputLayout2.mo2144c();
            }
        }
        C6653e b = aVar.mo19560b();
        View _$_findCachedViewById3 = _$_findCachedViewById(C7946e.profileImage);
        if (!(_$_findCachedViewById3 instanceof ImageView)) {
            _$_findCachedViewById3 = null;
        }
        ImageView imageView = (ImageView) _$_findCachedViewById3;
        if (imageView != null && ((b != null && aVar.mo19566g()) || imageView.getDrawable() == null)) {
            View _$_findCachedViewById4 = _$_findCachedViewById(C7946e.profileImage);
            if (_$_findCachedViewById4 != null) {
                C3800a.m12829a(_$_findCachedViewById4, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 200, 0, null, null, null, null, 258046, null);
            }
            C6657f fVar = this.f15193a0;
            if (fVar != null) {
                fVar.mo19349a((ImageView) _$_findCachedViewById(C7946e.profileImage), b);
            } else {
                C12880j.m40227c("avatarImages");
                throw null;
            }
        }
        FieldInputLayout fieldInputLayout3 = (FieldInputLayout) _$_findCachedViewById(C7946e.profileNameInput);
        if (fieldInputLayout3 != null) {
            String inputTextValue = fieldInputLayout3.getInputTextValue();
            if (inputTextValue != null && C12832w.m40118a(inputTextValue) && (!C12832w.m40118a(aVar.mo19571k()))) {
                FieldInputLayout fieldInputLayout4 = (FieldInputLayout) _$_findCachedViewById(C7946e.profileNameInput);
                if (fieldInputLayout4 != null) {
                    fieldInputLayout4.setInputTextValue(aVar.mo19571k());
                }
            }
        }
        C6829k kVar = this.f15188V;
        if (kVar != null) {
            C6913e eVar = this.f15191Y;
            if (eVar != null) {
                kVar.mo19598a(this, eVar, aVar.mo19572l());
                C6629d0 d0Var = this.f15194b0;
                if (d0Var != null) {
                    d0Var.mo19297a(aVar, this);
                } else {
                    C12880j.m40227c("profileAccessibility");
                    throw null;
                }
            } else {
                C12880j.m40227c("languageFallbackLogic");
                throw null;
            }
        } else {
            C12880j.m40227c("setupProfileOptionViews");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m20893a(boolean z, Function1<? super Boolean, C13145v> function1) {
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) _$_findCachedViewById(C7946e.autoPlayToggleSwitch);
            if (switchCompat != null) {
                boolean z2 = true;
                if (switchCompat.isChecked()) {
                    SwitchCompat switchCompat2 = (SwitchCompat) _$_findCachedViewById(C7946e.autoPlayToggleSwitch);
                    if (switchCompat2 != null) {
                        switchCompat2.toggle();
                    }
                    SwitchCompat switchCompat3 = (SwitchCompat) _$_findCachedViewById(C7946e.autoPlayToggleSwitch);
                    if (switchCompat3 == null || !switchCompat3.isChecked()) {
                        z2 = false;
                    }
                    function1.invoke(Boolean.valueOf(z2));
                }
            }
        }
    }
}
