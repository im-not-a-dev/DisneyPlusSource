package p163g.p201e.p203b.p312q;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalFocusChangeListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.C0538i;
import androidx.fragment.app.C0538i.C0540b;
import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.channels.p073tv.C3204a;
import com.bamtechmedia.dominguez.core.design.widgets.disneynavigationbar.DisneyTvNavigationBar;
import com.bamtechmedia.dominguez.core.design.widgets.disneynavigationbar.DisneyTvNavigationBar.C5669b;
import com.bamtechmedia.dominguez.core.framework.C5755i;
import com.bamtechmedia.dominguez.core.p088i.p091p.C3848a;
import com.bamtechmedia.dominguez.core.utils.C5823d;
import com.bamtechmedia.dominguez.core.utils.C5833g;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5839j;
import com.bamtechmedia.dominguez.core.utils.C5845m;
import com.bamtechmedia.dominguez.core.utils.C5864r;
import com.bamtechmedia.dominguez.profiles.C6626c0;
import com.bamtechmedia.dominguez.profiles.C6653e;
import com.bamtechmedia.dominguez.profiles.C6657f;
import com.bamtechmedia.dominguez.profiles.C6725m1;
import com.bamtechmedia.dominguez.profiles.C6725m1.C6726a;
import com.bamtechmedia.dominguez.profiles.p263u1.C6859b;
import com.disney.disneyplus.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.C12907r;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import p163g.p201e.p203b.p298l.C7530o;
import p163g.p201e.p203b.p312q.C7713w.C7714a;
import p163g.p201e.p203b.p312q.p313d0.C7664b;
import p163g.p201e.p203b.p314r.C7736f;
import p163g.p201e.p203b.p314r.C7736f.C7737a;
import p163g.p201e.p203b.p319v.C7819a;
import p163g.p201e.p203b.p319v.C7908x;
import p163g.p201e.p412c.C10647a;
import p512h.p513c.p514k.C11890i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 `2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001`B\u0005¢\u0006\u0002\u0010\u0006J*\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010J2\u0006\u0010K\u001a\u00020&H\u0016J\r\u0010L\u001a\u00020&H\u0001¢\u0006\u0002\bMJ&\u0010N\u001a\u0004\u0018\u00010D2\u0006\u0010E\u001a\u00020F2\b\u0010I\u001a\u0004\u0018\u00010J2\b\u0010O\u001a\u0004\u0018\u00010PH\u0016J\b\u0010Q\u001a\u00020RH\u0016J\u001c\u0010S\u001a\u00020R2\b\u0010T\u001a\u0004\u0018\u00010D2\b\u0010U\u001a\u0004\u0018\u00010DH\u0016J\u0010\u0010V\u001a\u00020&2\u0006\u0010W\u001a\u00020HH\u0016J\b\u0010X\u001a\u00020RH\u0016J\u001a\u0010Y\u001a\u00020R2\u0006\u0010Z\u001a\u00020D2\b\u0010O\u001a\u0004\u0018\u00010PH\u0016J\b\u0010[\u001a\u00020RH\u0002J\u0010\u0010\\\u001a\u00020R2\u0006\u0010]\u001a\u00020^H\u0016J\u0010\u0010_\u001a\u00020R2\u0006\u0010]\u001a\u00020^H\u0016R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001b\u0010%\u001a\u00020&8FX\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\u001e\u0010+\u001a\u00020,8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u00101\u001a\u0002028\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001e\u00107\u001a\u0002088\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001e\u0010=\u001a\u00020>8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006a"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/globalnav/GlobalNavTvFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/bamtechmedia/dominguez/core/utils/OnKeyDownHandler;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "Lcom/bamtechmedia/dominguez/paywall/BackgroundAnimationScaler;", "Lcom/bamtechmedia/dominguez/kidsmode/KidsModeInflater;", "()V", "avatarImages", "Lcom/bamtechmedia/dominguez/profiles/AvatarImages;", "getAvatarImages", "()Lcom/bamtechmedia/dominguez/profiles/AvatarImages;", "setAvatarImages", "(Lcom/bamtechmedia/dominguez/profiles/AvatarImages;)V", "backgroundHelper", "Lcom/bamtechmedia/dominguez/core/design/helper/BackgroundHelper;", "getBackgroundHelper", "()Lcom/bamtechmedia/dominguez/core/design/helper/BackgroundHelper;", "setBackgroundHelper", "(Lcom/bamtechmedia/dominguez/core/design/helper/BackgroundHelper;)V", "channelManager", "Lcom/bamtechmedia/dominguez/channels/tv/ChannelManager;", "getChannelManager", "()Lcom/bamtechmedia/dominguez/channels/tv/ChannelManager;", "setChannelManager", "(Lcom/bamtechmedia/dominguez/channels/tv/ChannelManager;)V", "dpadHelper", "Lcom/bamtechmedia/dominguez/globalnav/GlobalNavDpadHelper;", "getDpadHelper", "()Lcom/bamtechmedia/dominguez/globalnav/GlobalNavDpadHelper;", "setDpadHelper", "(Lcom/bamtechmedia/dominguez/globalnav/GlobalNavDpadHelper;)V", "freeTrialWelcomeRouter", "Lcom/bamtechmedia/dominguez/dialog/FreeTrialWelcomeRouter;", "getFreeTrialWelcomeRouter", "()Lcom/bamtechmedia/dominguez/dialog/FreeTrialWelcomeRouter;", "setFreeTrialWelcomeRouter", "(Lcom/bamtechmedia/dominguez/dialog/FreeTrialWelcomeRouter;)V", "kidsMode", "", "getKidsMode", "()Z", "kidsMode$delegate", "Lcom/bamtechmedia/dominguez/core/utils/BooleanFragmentArgumentDelegate;", "profileViewModel", "Lcom/bamtechmedia/dominguez/profiles/ProfilesViewModel;", "getProfileViewModel", "()Lcom/bamtechmedia/dominguez/profiles/ProfilesViewModel;", "setProfileViewModel", "(Lcom/bamtechmedia/dominguez/profiles/ProfilesViewModel;)V", "subscriptionMessage", "Lcom/bamtechmedia/dominguez/paywall/SubscriptionMessage;", "getSubscriptionMessage", "()Lcom/bamtechmedia/dominguez/paywall/SubscriptionMessage;", "setSubscriptionMessage", "(Lcom/bamtechmedia/dominguez/paywall/SubscriptionMessage;)V", "userProfileModeTracker", "Lcom/bamtechmedia/dominguez/profiles/api/UserProfileModeTracker;", "getUserProfileModeTracker", "()Lcom/bamtechmedia/dominguez/profiles/api/UserProfileModeTracker;", "setUserProfileModeTracker", "(Lcom/bamtechmedia/dominguez/profiles/api/UserProfileModeTracker;)V", "viewModel", "Lcom/bamtechmedia/dominguez/globalnav/TvGlobalNavViewModel;", "getViewModel", "()Lcom/bamtechmedia/dominguez/globalnav/TvGlobalNavViewModel;", "setViewModel", "(Lcom/bamtechmedia/dominguez/globalnav/TvGlobalNavViewModel;)V", "inflateKidsModeLayout", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "resource", "", "container", "Landroid/view/ViewGroup;", "attachToRoot", "isGlobalNavDisabled", "isGlobalNavDisabled$tv_prodGoogleRelease", "onCreateView", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onGlobalFocusChanged", "oldFocus", "newFocus", "onKeyDown", "keyCode", "onStart", "onViewCreated", "view", "registerFragmentLifecycleCallbacks", "scaleRootViewDown", "duration", "", "scaleRootViewUp", "Companion", "tv_prodGoogleRelease"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.q.t */
/* compiled from: GlobalNavTvFragment.kt */
public final class C7702t extends C11890i implements C5864r, OnGlobalFocusChangeListener, C7819a, C7736f {

    /* renamed from: f0 */
    static final /* synthetic */ KProperty[] f16744f0 = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(C7702t.class), "kidsMode", "getKidsMode()Z"))};

    /* renamed from: g0 */
    public static final C7703a f16745g0 = new C7703a(null);

    /* renamed from: U */
    private final C5823d f16746U = C5839j.m18846a("kidsMode", Boolean.valueOf(false));

    /* renamed from: V */
    public C7655b0 f16747V;

    /* renamed from: W */
    public C6725m1 f16748W;

    /* renamed from: X */
    public C7684f f16749X;

    /* renamed from: Y */
    public C7908x f16750Y;

    /* renamed from: Z */
    public C7530o f16751Z;

    /* renamed from: a0 */
    public C6657f f16752a0;

    /* renamed from: b0 */
    public C3204a f16753b0;

    /* renamed from: c0 */
    public C3848a f16754c0;

    /* renamed from: d0 */
    public C6859b f16755d0;

    /* renamed from: e0 */
    private HashMap f16756e0;

    /* renamed from: g.e.b.q.t$a */
    /* compiled from: GlobalNavTvFragment.kt */
    public static final class C7703a implements C7686g {
        private C7703a() {
        }

        public /* synthetic */ C7703a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public C7702t m22735a(boolean z) {
            C7702t tVar = new C7702t();
            Pair[] pairArr = {C12907r.m40244a("kidsMode", Boolean.valueOf(z))};
            tVar.setArguments(C5833g.m18829a((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
            return tVar;
        }
    }

    /* renamed from: g.e.b.q.t$b */
    /* compiled from: GlobalNavTvFragment.kt */
    static final class C7704b extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7702t f16757c;

        C7704b(C7702t tVar) {
            this.f16757c = tVar;
            super(0);
        }

        public final void invoke() {
            ((DisneyTvNavigationBar) this.f16757c._$_findCachedViewById(C10647a.menuNavigation)).mo17493a(C5669b.EXPANDED);
        }
    }

    /* renamed from: g.e.b.q.t$c */
    /* compiled from: GlobalNavTvFragment.kt */
    static final class C7705c extends C12881k implements Function1<C7714a, C13145v> {

        /* renamed from: c */
        public static final C7705c f16758c = new C7705c();

        C7705c() {
            super(1);
        }

        /* renamed from: a */
        public final void mo20623a(C7714a aVar) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20623a((C7714a) obj);
            return C13145v.f29587a;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "", "state", "Lcom/bamtechmedia/dominguez/profiles/ProfilesViewModel$State;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.q.t$d */
    /* compiled from: GlobalNavTvFragment.kt */
    static final class C7706d extends C12881k implements Function1<C6726a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7702t f16759c;

        /* renamed from: g.e.b.q.t$d$a */
        /* compiled from: GlobalNavTvFragment.kt */
        static final class C7707a extends C12881k implements Function1<ImageView, C13145v> {

            /* renamed from: U */
            final /* synthetic */ C7706d f16760U;

            /* renamed from: c */
            final /* synthetic */ C6653e f16761c;

            C7707a(C6653e eVar, C7706d dVar, C6726a aVar) {
                this.f16761c = eVar;
                this.f16760U = dVar;
                super(1);
            }

            /* renamed from: a */
            public final void mo20625a(ImageView imageView) {
                this.f16760U.f16759c.mo20618o().mo19349a(imageView, this.f16761c);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo20625a((ImageView) obj);
                return C13145v.f29587a;
            }
        }

        C7706d(C7702t tVar) {
            this.f16759c = tVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo20624a(C6726a aVar) {
            Object obj;
            Iterator it = aVar.mo19449d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C6626c0) obj).mo19353Q()) {
                    break;
                }
            }
            C6626c0 c0Var = (C6626c0) obj;
            if (c0Var != null) {
                ((DisneyTvNavigationBar) this.f16759c._$_findCachedViewById(C10647a.menuNavigation)).mo17499a(c0Var.getProfileName(), (Function1<? super ImageView, C13145v>) new C7707a<Object,C13145v>((C6653e) aVar.mo19446a().get(c0Var.mo19364j()), this, aVar));
                this.f16759c.mo20620p().mo12258d();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20624a((C6726a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.q.t$e */
    /* compiled from: GlobalNavTvFragment.kt */
    static final class C7708e implements OnFocusChangeListener {

        /* renamed from: c */
        final /* synthetic */ C7702t f16762c;

        C7708e(C7702t tVar) {
            this.f16762c = tVar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z && !this.f16762c.mo20622r()) {
                ((DisneyTvNavigationBar) this.f16762c._$_findCachedViewById(C10647a.menuNavigation)).mo17493a(C5669b.EXPANDED);
            }
        }
    }

    /* renamed from: g.e.b.q.t$f */
    /* compiled from: GlobalNavTvFragment.kt */
    static final class C7709f extends C12881k implements Function2<Integer, Boolean, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7702t f16763c;

        C7709f(C7702t tVar) {
            this.f16763c = tVar;
            super(2);
        }

        /* renamed from: a */
        public final void mo20627a(int i, boolean z) {
            this.f16763c.getViewModel().mo20581y().mo20630a(i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo20627a(((Number) obj).intValue(), ((Boolean) obj2).booleanValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.q.t$g */
    /* compiled from: GlobalNavTvFragment.kt */
    public static final class C7710g extends C0540b {

        /* renamed from: a */
        final /* synthetic */ C7702t f16764a;

        C7710g(C7702t tVar) {
            this.f16764a = tVar;
        }

        /* renamed from: a */
        private final boolean m22740a(C7664b bVar) {
            C0538i childFragmentManager = bVar.getChildFragmentManager();
            Intrinsics.checkReturnedValueIsNotNull((Object) childFragmentManager, "childFragmentManager");
            return childFragmentManager.mo3160f() != null;
        }

        /* renamed from: e */
        public void mo3174e(C0538i iVar, Fragment fragment) {
            int i;
            C5669b bVar;
            super.mo3174e(iVar, fragment);
            Fragment a = this.f16764a.getChildFragmentManager().mo3145a((int) R.id.globalNavContent);
            Object obj = null;
            if (!(a instanceof C7664b)) {
                a = null;
            }
            C7664b bVar2 = (C7664b) a;
            DisneyTvNavigationBar disneyTvNavigationBar = (DisneyTvNavigationBar) this.f16764a._$_findCachedViewById(C10647a.menuNavigation);
            if (bVar2 != null) {
                C7689j o = bVar2.mo20587o();
                if (o != null) {
                    i = o.mo20604Z();
                    disneyTvNavigationBar.setSelectedMenuItem(i);
                    if (bVar2 != null && m22740a(bVar2)) {
                        boolean a2 = C7701s.m22724a(iVar);
                        View view = this.f16764a.getView();
                        View findFocus = view != null ? view.findFocus() : null;
                        View _$_findCachedViewById = this.f16764a._$_findCachedViewById(C10647a.globalNavAccessibilityFocusWorkaround);
                        Intrinsics.checkReturnedValueIsNotNull((Object) _$_findCachedViewById, "globalNavAccessibilityFocusWorkaround");
                        _$_findCachedViewById.setFocusable(a2);
                        DisneyTvNavigationBar disneyTvNavigationBar2 = (DisneyTvNavigationBar) this.f16764a._$_findCachedViewById(C10647a.menuNavigation);
                        if (!a2) {
                            bVar = C5669b.DISABLED;
                        } else {
                            if (findFocus != null) {
                                obj = findFocus.getTag(R.id.focusHelperHideNavOnViewFocus);
                            }
                            if (Intrinsics.areEqual(obj, (Object) Boolean.valueOf(true))) {
                                bVar = C5669b.HIDDEN;
                            } else if (findFocus == null || !C7712v.m22751a(findFocus)) {
                                bVar = C5669b.COLLAPSED;
                            } else {
                                bVar = C5669b.EXPANDED;
                            }
                        }
                        disneyTvNavigationBar2.mo17493a(bVar);
                        return;
                    }
                }
            }
            i = ((DisneyTvNavigationBar) this.f16764a._$_findCachedViewById(C10647a.menuNavigation)).getSelectedMenuItem();
            disneyTvNavigationBar.setSelectedMenuItem(i);
            if (bVar2 != null) {
            }
        }
    }

    /* renamed from: s */
    private final void m22725s() {
        getChildFragmentManager().mo3150a((C0540b) new C7710g(this), true);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f16756e0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f16756e0 == null) {
            this.f16756e0 = new HashMap();
        }
        View view = (View) this.f16756e0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f16756e0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo20615a(long j) {
    }

    /* renamed from: a */
    public boolean mo12232a(int i) {
        if (mo20622r()) {
            return false;
        }
        C7684f fVar = this.f16749X;
        String str = "dpadHelper";
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            throw null;
        } else if (fVar.mo20598a(i)) {
            C7684f fVar2 = this.f16749X;
            if (fVar2 != null) {
                return fVar2.mo20599a(getView(), i, (Function0<C13145v>) new C7704b<C13145v>(this));
            }
            Intrinsics.throwUninitializedPropertyAccessException(str);
            throw null;
        } else if (i == 4) {
            return ((DisneyTvNavigationBar) _$_findCachedViewById(C10647a.menuNavigation)).mo17493a(C5669b.EXPANDED);
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public void mo20616b(long j) {
    }

    public final C7655b0 getViewModel() {
        C7655b0 b0Var = this.f16747V;
        if (b0Var != null) {
            return b0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        throw null;
    }

    /* renamed from: o */
    public final C6657f mo20618o() {
        C6657f fVar = this.f16752a0;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("avatarImages");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C7737a.m22800a(this, layoutInflater, R.layout.fragment_global_nav, viewGroup, false, 8, null);
    }

    public void onDestroyView() {
        FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(C10647a.globalNavContent);
        Intrinsics.checkReturnedValueIsNotNull((Object) frameLayout, "globalNavContent");
        frameLayout.getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onGlobalFocusChanged(View view, View view2) {
        if (!mo20622r()) {
            if (Intrinsics.areEqual(view2 != null ? view2.getTag(R.id.focusHelperHideNavOnViewFocus) : null, (Object) Boolean.valueOf(true))) {
                ((DisneyTvNavigationBar) _$_findCachedViewById(C10647a.menuNavigation)).mo17493a(C5669b.HIDDEN);
            } else if (view2 != null && !C7712v.m22751a(view2)) {
                ((DisneyTvNavigationBar) _$_findCachedViewById(C10647a.menuNavigation)).mo17493a(C5669b.COLLAPSED);
            }
        }
    }

    public void onStart() {
        C6859b bVar = this.f16755d0;
        if (bVar != null) {
            bVar.mo19624a(true);
            super.onStart();
            C7655b0 b0Var = this.f16747V;
            if (b0Var != null) {
                C5755i.m18679a(this, b0Var, null, null, C7705c.f16758c, 6, null);
                C6725m1 m1Var = this.f16748W;
                if (m1Var != null) {
                    C5755i.m18679a(this, m1Var, null, null, new C7706d(this), 6, null);
                    Context requireContext = requireContext();
                    Intrinsics.checkReturnedValueIsNotNull((Object) requireContext, "requireContext()");
                    boolean a = C5837i.m18836a(requireContext);
                    View _$_findCachedViewById = _$_findCachedViewById(C10647a.globalNavAccessibilityFocusWorkaround);
                    Intrinsics.checkReturnedValueIsNotNull((Object) _$_findCachedViewById, "globalNavAccessibilityFocusWorkaround");
                    _$_findCachedViewById.setVisibility(a ? 0 : 8);
                    if (a) {
                        _$_findCachedViewById(C10647a.globalNavAccessibilityFocusWorkaround).setOnFocusChangeListener(new C7708e(this));
                        return;
                    }
                    return;
                }
                Intrinsics.throwUninitializedPropertyAccessException("profileViewModel");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userProfileModeTracker");
        throw null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C3848a aVar = this.f16754c0;
        String str = "backgroundHelper";
        if (aVar != null) {
            View _$_findCachedViewById = _$_findCachedViewById(C10647a.globalNavBackground);
            Intrinsics.checkReturnedValueIsNotNull((Object) _$_findCachedViewById, "globalNavBackground");
            aVar.mo13766b(_$_findCachedViewById);
            DisneyTvNavigationBar disneyTvNavigationBar = (DisneyTvNavigationBar) _$_findCachedViewById(C10647a.menuNavigation);
            C7655b0 b0Var = this.f16747V;
            String str2 = "viewModel";
            if (b0Var != null) {
                List z = b0Var.mo20582z();
                C3848a aVar2 = this.f16754c0;
                if (aVar2 != null) {
                    disneyTvNavigationBar.mo17500a(z, aVar2, new C7709f(this));
                    if (bundle == null) {
                        C7655b0 b0Var2 = this.f16747V;
                        if (b0Var2 != null) {
                            b0Var2.mo20581y().mo20632b();
                            ((DisneyTvNavigationBar) _$_findCachedViewById(C10647a.menuNavigation)).mo17493a(C5669b.COLLAPSED);
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException(str2);
                            throw null;
                        }
                    }
                    FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(C10647a.globalNavContent);
                    Intrinsics.checkReturnedValueIsNotNull((Object) frameLayout, "globalNavContent");
                    frameLayout.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
                    m22725s();
                    return;
                }
                Intrinsics.throwUninitializedPropertyAccessException(str);
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(str2);
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException(str);
        throw null;
    }

    /* renamed from: p */
    public final C3204a mo20620p() {
        C3204a aVar = this.f16753b0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("channelManager");
        throw null;
    }

    /* renamed from: q */
    public final boolean mo20621q() {
        return this.f16746U.mo17732a(this, f16744f0[0]).booleanValue();
    }

    /* renamed from: r */
    public final boolean mo20622r() {
        C0538i childFragmentManager = getChildFragmentManager();
        Intrinsics.checkReturnedValueIsNotNull((Object) childFragmentManager, "childFragmentManager");
        return !C7701s.m22724a(childFragmentManager);
    }

    /* renamed from: a */
    public View mo19494a(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z) {
        if (mo20621q()) {
            layoutInflater = C5845m.m18866a(layoutInflater, 2132017924);
        }
        View inflate = layoutInflater.inflate(i, viewGroup, z);
        Intrinsics.checkReturnedValueIsNotNull((Object) inflate, "kidsAwareInflater.inflat… container, attachToRoot)");
        return inflate;
    }
}
