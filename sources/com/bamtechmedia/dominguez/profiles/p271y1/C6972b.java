package com.bamtechmedia.dominguez.profiles.p271y1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C0715i.C0716a;
import androidx.lifecycle.C0722m;
import androidx.recyclerview.widget.RecyclerView;
import com.bamtech.sdk4.service.BadRequestException;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.analytics.C2413n;
import com.bamtechmedia.dominguez.analytics.p057o0.C2433b;
import com.bamtechmedia.dominguez.auth.p066r0.C2809j;
import com.bamtechmedia.dominguez.auth.p066r0.C2809j.C2810a;
import com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar;
import com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView;
import com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView.C5641a;
import com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView.C5642b.C5643a;
import com.bamtechmedia.dominguez.core.framework.C5755i;
import com.bamtechmedia.dominguez.core.p088i.p091p.C3848a;
import com.bamtechmedia.dominguez.core.utils.C5823d;
import com.bamtechmedia.dominguez.core.utils.C5833g;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5839j;
import com.bamtechmedia.dominguez.core.utils.C5852n0;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import com.bamtechmedia.dominguez.core.utils.RecyclerViewExtKt;
import com.bamtechmedia.dominguez.profiles.C6626c0;
import com.bamtechmedia.dominguez.profiles.C6627c1;
import com.bamtechmedia.dominguez.profiles.C6629d0;
import com.bamtechmedia.dominguez.profiles.C6661f1;
import com.bamtechmedia.dominguez.profiles.C6661f1.C6662a;
import com.bamtechmedia.dominguez.profiles.C6671h0;
import com.bamtechmedia.dominguez.profiles.C6671h0.C6672a;
import com.bamtechmedia.dominguez.profiles.C6725m1;
import com.bamtechmedia.dominguez.profiles.C6725m1.C6726a;
import com.bamtechmedia.dominguez.profiles.C6769r0.C6771b;
import com.bamtechmedia.dominguez.profiles.C6769r0.C6771b.C6774b;
import com.bamtechmedia.dominguez.profiles.C6769r0.C6771b.C6776c;
import com.bamtechmedia.dominguez.profiles.C6769r0.C6771b.C6778d;
import com.bamtechmedia.dominguez.profiles.C6780r1;
import com.bamtechmedia.dominguez.profiles.C6969y0;
import com.bamtechmedia.dominguez.profiles.C7022z0;
import com.bamtechmedia.dominguez.profiles.p262t1.C6847a;
import com.uber.autodispose.android.lifecycle.C10541b;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.C12907r;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.p590y.C13162e0;
import kotlin.reflect.KProperty;
import p096e.p121h.p135s.C4127b0;
import p163g.p201e.p203b.p307o.C7619i;
import p163g.p201e.p203b.p312q.C7717x;
import p163g.p201e.p203b.p314r.C7738g;
import p163g.p201e.p203b.p319v.C7908x;
import p163g.p201e.p203b.p330z.C7945d;
import p163g.p201e.p203b.p330z.C7946e;
import p163g.p201e.p203b.p330z.C7948g;
import p163g.p201e.p203b.p330z.C7949h;
import p163g.p503n.p504a.C11790c0;
import p163g.p503n.p504a.C11793e;
import p163g.p503n.p504a.C11839v;
import p163g.p509o.p510a.C11847b;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.C11853e;
import p163g.p509o.p510a.C11863k;
import p512h.p513c.p514k.C11890i;
import p520io.reactivex.C11912b;
import p520io.reactivex.Completable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p527w.p529c.C11992a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 s2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001sB\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020\u0014H\u0002J\b\u0010X\u001a\u00020VH\u0002J\b\u0010Y\u001a\u00020ZH\u0016J\b\u0010[\u001a\u00020VH\u0002J$\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020_2\b\u0010`\u001a\u0004\u0018\u00010a2\b\u0010b\u001a\u0004\u0018\u00010cH\u0016J\b\u0010d\u001a\u00020VH\u0002J\u0010\u0010e\u001a\u00020V2\u0006\u0010f\u001a\u00020gH\u0002J\u0010\u0010h\u001a\u00020V2\u0006\u0010i\u001a\u00020\u0014H\u0016J\b\u0010j\u001a\u00020VH\u0016J\b\u0010k\u001a\u00020VH\u0016J\u001a\u0010l\u001a\u00020V2\u0006\u0010m\u001a\u00020]2\b\u0010b\u001a\u0004\u0018\u00010cH\u0016J\u0010\u0010n\u001a\u00020V2\u0006\u0010o\u001a\u00020pH\u0002J\u0010\u0010q\u001a\u00020V2\u0006\u0010f\u001a\u00020gH\u0002J\u0010\u0010r\u001a\u00020V2\u0006\u0010m\u001a\u00020]H\u0002R$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0015R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u00020&8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020,8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u00101\u001a\u0002028\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001e\u00107\u001a\u0002088\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001e\u0010=\u001a\u00020>8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001e\u0010C\u001a\u00020D8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001e\u0010I\u001a\u00020J8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001e\u0010O\u001a\u00020P8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T¨\u0006t"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/picker/ProfilePickerFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/bamtechmedia/dominguez/globalnav/HideNavMenu;", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsStateProvider;", "Lcom/bamtechmedia/dominguez/core/design/widgets/NoConnectionView$RetryListener;", "()V", "adapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/ViewHolder;", "getAdapter", "()Lcom/xwray/groupie/GroupAdapter;", "setAdapter", "(Lcom/xwray/groupie/GroupAdapter;)V", "backgroundHelper", "Lcom/bamtechmedia/dominguez/core/design/helper/BackgroundHelper;", "getBackgroundHelper", "()Lcom/bamtechmedia/dominguez/core/design/helper/BackgroundHelper;", "setBackgroundHelper", "(Lcom/bamtechmedia/dominguez/core/design/helper/BackgroundHelper;)V", "isAddProfiles", "", "()Z", "isAddProfiles$delegate", "Lcom/bamtechmedia/dominguez/core/utils/BooleanFragmentArgumentDelegate;", "logOutRouter", "Lcom/bamtechmedia/dominguez/auth/logout/LogOutRouter;", "getLogOutRouter", "()Lcom/bamtechmedia/dominguez/auth/logout/LogOutRouter;", "setLogOutRouter", "(Lcom/bamtechmedia/dominguez/auth/logout/LogOutRouter;)V", "newProfileSelected", "presenter", "Lcom/bamtechmedia/dominguez/profiles/ProfilesPresenter;", "getPresenter", "()Lcom/bamtechmedia/dominguez/profiles/ProfilesPresenter;", "setPresenter", "(Lcom/bamtechmedia/dominguez/profiles/ProfilesPresenter;)V", "profileAccessibility", "Lcom/bamtechmedia/dominguez/profiles/ProfileAccessibility;", "getProfileAccessibility", "()Lcom/bamtechmedia/dominguez/profiles/ProfileAccessibility;", "setProfileAccessibility", "(Lcom/bamtechmedia/dominguez/profiles/ProfileAccessibility;)V", "profileAnalytics", "Lcom/bamtechmedia/dominguez/profiles/analytics/ProfilesAnalytics;", "getProfileAnalytics", "()Lcom/bamtechmedia/dominguez/profiles/analytics/ProfilesAnalytics;", "setProfileAnalytics", "(Lcom/bamtechmedia/dominguez/profiles/analytics/ProfilesAnalytics;)V", "profileNavRouter", "Lcom/bamtechmedia/dominguez/profiles/ProfileNavRouter;", "getProfileNavRouter", "()Lcom/bamtechmedia/dominguez/profiles/ProfileNavRouter;", "setProfileNavRouter", "(Lcom/bamtechmedia/dominguez/profiles/ProfileNavRouter;)V", "profilesHostViewModel", "Lcom/bamtechmedia/dominguez/profiles/ProfilesHostViewModel;", "getProfilesHostViewModel", "()Lcom/bamtechmedia/dominguez/profiles/ProfilesHostViewModel;", "setProfilesHostViewModel", "(Lcom/bamtechmedia/dominguez/profiles/ProfilesHostViewModel;)V", "profilesListener", "Lcom/bamtechmedia/dominguez/profiles/ProfilesListener;", "getProfilesListener", "()Lcom/bamtechmedia/dominguez/profiles/ProfilesListener;", "setProfilesListener", "(Lcom/bamtechmedia/dominguez/profiles/ProfilesListener;)V", "profilesMemoryCache", "Lcom/bamtechmedia/dominguez/profiles/ProfilesMemoryCache;", "getProfilesMemoryCache", "()Lcom/bamtechmedia/dominguez/profiles/ProfilesMemoryCache;", "setProfilesMemoryCache", "(Lcom/bamtechmedia/dominguez/profiles/ProfilesMemoryCache;)V", "profilesViewModel", "Lcom/bamtechmedia/dominguez/profiles/ProfilesViewModel;", "getProfilesViewModel", "()Lcom/bamtechmedia/dominguez/profiles/ProfilesViewModel;", "setProfilesViewModel", "(Lcom/bamtechmedia/dominguez/profiles/ProfilesViewModel;)V", "subscriptionMessage", "Lcom/bamtechmedia/dominguez/paywall/SubscriptionMessage;", "getSubscriptionMessage", "()Lcom/bamtechmedia/dominguez/paywall/SubscriptionMessage;", "setSubscriptionMessage", "(Lcom/bamtechmedia/dominguez/paywall/SubscriptionMessage;)V", "blockProfilePicker", "", "isBlocked", "dismissProfilePicker", "getAnalyticsSection", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsSection;", "onAddProfileClicked", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onEditOrDoneButtonClicked", "onProfileItemClicked", "profile", "Lcom/bamtechmedia/dominguez/profiles/Profile;", "onRetryClicked", "isOffline", "onStart", "onStop", "onViewCreated", "view", "renderState", "state", "Lcom/bamtechmedia/dominguez/profiles/ProfilesViewModel$State;", "selectProfile", "setMobileToolbar", "Companion", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.y1.b */
/* compiled from: ProfilePickerFragment.kt */
public final class C6972b extends C11890i implements C7717x, C2413n, C5641a {

    /* renamed from: j0 */
    static final /* synthetic */ KProperty[] f15490j0 = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(C6972b.class), "isAddProfiles", "isAddProfiles()Z"))};

    /* renamed from: k0 */
    public static final C6973a f15491k0 = new C6973a(null);

    /* renamed from: U */
    public C6661f1 f15492U;

    /* renamed from: V */
    public C2809j f15493V;

    /* renamed from: W */
    public C6725m1 f15494W;

    /* renamed from: X */
    public C6627c1 f15495X;

    /* renamed from: Y */
    public C6671h0 f15496Y;

    /* renamed from: Z */
    public C7022z0 f15497Z;

    /* renamed from: a0 */
    public C11848c<C11863k> f15498a0;

    /* renamed from: b0 */
    public C6969y0 f15499b0;

    /* renamed from: c0 */
    public C7908x f15500c0;

    /* renamed from: d0 */
    public C6847a f15501d0;

    /* renamed from: e0 */
    public C6629d0 f15502e0;

    /* renamed from: f0 */
    public C3848a f15503f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public boolean f15504g0;

    /* renamed from: h0 */
    private final C5823d f15505h0 = C5839j.m18847a("is_add_profiles", (Boolean) null, 2, (Object) null);

    /* renamed from: i0 */
    private HashMap f15506i0;

    /* renamed from: com.bamtechmedia.dominguez.profiles.y1.b$a */
    /* compiled from: ProfilePickerFragment.kt */
    public static final class C6973a {
        private C6973a() {
        }

        /* renamed from: a */
        public final C6972b mo19737a(boolean z) {
            C6972b bVar = new C6972b();
            bVar.setArguments(C5833g.m18829a(C12907r.m40244a("is_add_profiles", Boolean.valueOf(z))));
            return bVar;
        }

        public /* synthetic */ C6973a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.y1.b$b */
    /* compiled from: ProfilePickerFragment.kt */
    static final class C6974b implements OnClickListener {

        /* renamed from: c */
        public static final C6974b f15507c = new C6974b();

        C6974b() {
        }

        public final void onClick(View view) {
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.y1.b$c */
    /* compiled from: ProfilePickerFragment.kt */
    static final class C6975c extends C12881k implements Function0<C13145v> {

        /* renamed from: U */
        final /* synthetic */ C6972b f15508U;

        /* renamed from: c */
        final /* synthetic */ int f15509c;

        C6975c(int i, C6972b bVar) {
            this.f15509c = i;
            this.f15508U = bVar;
            super(0);
        }

        public final void invoke() {
            if (this.f15509c == this.f15508U.getAdapter().getItemCount() - 1) {
                ConstraintLayout constraintLayout = (ConstraintLayout) this.f15508U._$_findCachedViewById(C7946e.profilesRoot);
                if (constraintLayout != null) {
                    C5852n0.m18882a(constraintLayout, false, C6984c.f15519c, 1, null);
                }
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.y1.b$d */
    /* compiled from: ProfilePickerFragment.kt */
    static final class C6976d extends C12881k implements Function1<C6726a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C6972b f15510c;

        C6976d(C6972b bVar) {
            this.f15510c = bVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo19739a(C6726a aVar) {
            this.f15510c.m21235a(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19739a((C6726a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.y1.b$e */
    /* compiled from: ProfilePickerFragment.kt */
    static final class C6977e implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C6972b f15511c;

        C6977e(C6972b bVar) {
            this.f15511c = bVar;
        }

        public final void onClick(View view) {
            this.f15511c.m21248u();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"updateAdapter", "", "state", "Lcom/bamtechmedia/dominguez/profiles/ProfilesViewModel$State;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.profiles.y1.b$f */
    /* compiled from: ProfilePickerFragment.kt */
    static final class C6978f extends C12881k implements Function1<C6726a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C6972b f15512c;

        /* renamed from: com.bamtechmedia.dominguez.profiles.y1.b$f$a */
        /* compiled from: ProfilePickerFragment.kt */
        static final class C6979a extends C12881k implements Function0<C13145v> {

            /* renamed from: c */
            final /* synthetic */ C6978f f15513c;

            C6979a(C6978f fVar) {
                this.f15513c = fVar;
                super(0);
            }

            public final void invoke() {
                this.f15513c.f15512c.m21247t();
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.profiles.y1.b$f$b */
        /* compiled from: ProfilePickerFragment.kt */
        static final class C6980b extends C12881k implements Function1<C6626c0, C13145v> {

            /* renamed from: c */
            final /* synthetic */ C6978f f15514c;

            C6980b(C6978f fVar) {
                this.f15514c = fVar;
                super(1);
            }

            /* renamed from: a */
            public final void mo19742a(C6626c0 c0Var) {
                this.f15514c.f15512c.m21234a(c0Var);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo19742a((C6626c0) obj);
                return C13145v.f29587a;
            }
        }

        C6978f(C6972b bVar) {
            this.f15512c = bVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo19741a(C6726a aVar) {
            String a;
            C6980b bVar = new C6980b(this);
            C6979a aVar2 = new C6979a(this);
            C6661f1 p = this.f15512c.mo19735p();
            Context requireContext = this.f15512c.requireContext();
            C12880j.m40222a((Object) requireContext, "requireContext()");
            if (C5837i.m18842d(requireContext)) {
                a = null;
            } else if (this.f15512c.m21246s()) {
                a = C5880u.m18936a(C7949h.create_another_profile_title);
            } else {
                a = C5880u.m18936a(C7949h.choose_profile_title);
            }
            C6662a a2 = p.mo19369a(aVar, false, bVar, aVar2, a);
            if (!aVar.mo19448c() && !this.f15512c.f15504g0) {
                this.f15512c.getAdapter().mo29963a((Collection<? extends C11847b>) a2.mo19370a());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19741a((C6726a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.y1.b$g */
    /* compiled from: ProfilePickerFragment.kt */
    static final class C6981g implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C6972b f15515a;

        /* renamed from: b */
        final /* synthetic */ C6626c0 f15516b;

        C6981g(C6972b bVar, C6626c0 c0Var) {
            this.f15515a = bVar;
            this.f15516b = c0Var;
        }

        public final void run() {
            this.f15515a.mo19736q().mo18810a(this.f15516b);
            C13145v vVar = C13145v.f29587a;
            this.f15515a.m21245r();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.y1.b$h */
    /* compiled from: ProfilePickerFragment.kt */
    static final class C6982h<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C6972b f15517c;

        C6982h(C6972b bVar) {
            this.f15517c = bVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            if (th instanceof BadRequestException) {
                C2810a.m10485a(this.f15517c.mo19734o(), 0, true, 1, (Object) null);
            } else {
                C12880j.m40222a((Object) th, "error");
                throw th;
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.y1.b$i */
    /* compiled from: ProfilePickerFragment.kt */
    static final class C6983i extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C6972b f15518c;

        C6983i(C6972b bVar) {
            this.f15518c = bVar;
            super(0);
        }

        public final void invoke() {
            this.f15518c.m21248u();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final void m21245r() {
        C11848c<C11863k> cVar = this.f15498a0;
        String str = "adapter";
        if (cVar != null) {
            Iterator it = C12762h.m39920d(0, cVar.getItemCount()).iterator();
            while (it.hasNext()) {
                int b = ((C13162e0) it).mo31079b();
                C11848c<C11863k> cVar2 = this.f15498a0;
                if (cVar2 != null) {
                    C11853e a = cVar2.mo13700a(b);
                    if (!(a instanceof C7016l)) {
                        a = null;
                    }
                    C7016l lVar = (C7016l) a;
                    if (lVar != null) {
                        lVar.mo19782a((Function0<C13145v>) new C6975c<C13145v>(b, this));
                    }
                } else {
                    C12880j.m40227c(str);
                    throw null;
                }
            }
            return;
        }
        C12880j.m40227c(str);
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public final boolean m21246s() {
        return this.f15505h0.mo17732a(this, f15490j0[0]).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public final void m21247t() {
        C6671h0 h0Var = this.f15496Y;
        if (h0Var != null) {
            C6672a.m20688a(h0Var, false, false, null, false, null, 0, 62, null);
        } else {
            C12880j.m40227c("profileNavRouter");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public final void m21248u() {
        String str = "profileAnalytics";
        String str2 = "profileNavRouter";
        C6626c0 c0Var = null;
        if (m21246s()) {
            C6627c1 c1Var = this.f15495X;
            if (c1Var == null) {
                C12880j.m40227c("profilesMemoryCache");
                throw null;
            } else if (c1Var.mo19290d()) {
                C6725m1 m1Var = this.f15494W;
                if (m1Var != null) {
                    C6726a aVar = (C6726a) m1Var.getCurrentState();
                    if (aVar != null) {
                        List d = aVar.mo19449d();
                        if (d != null) {
                            c0Var = (C6626c0) d.get(0);
                        }
                    }
                    if (c0Var != null) {
                        m21239b(c0Var);
                        return;
                    }
                    return;
                }
                C12880j.m40227c("profilesViewModel");
                throw null;
            } else {
                C6671h0 h0Var = this.f15496Y;
                if (h0Var != null) {
                    C6672a.m20689a(h0Var, false, false, true, 2, null);
                    C6847a aVar2 = this.f15501d0;
                    if (aVar2 != null) {
                        aVar2.mo19617b();
                    } else {
                        C12880j.m40227c(str);
                        throw null;
                    }
                } else {
                    C12880j.m40227c(str2);
                    throw null;
                }
            }
        } else {
            C6969y0 y0Var = this.f15499b0;
            if (y0Var != null) {
                C6771b y = y0Var.mo19724y();
                boolean z = C12880j.m40224a((Object) y, (Object) C6776c.f15157c) || C12880j.m40224a((Object) y, (Object) C6778d.f15158c);
                C6671h0 h0Var2 = this.f15496Y;
                if (h0Var2 != null) {
                    C6672a.m20687a(h0Var2, false, z, 1, null);
                    C6847a aVar3 = this.f15501d0;
                    if (aVar3 != null) {
                        aVar3.mo19618c();
                    } else {
                        C12880j.m40227c(str);
                        throw null;
                    }
                } else {
                    C12880j.m40227c(str2);
                    throw null;
                }
            } else {
                C12880j.m40227c("profilesHostViewModel");
                throw null;
            }
        }
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f15506i0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f15506i0 == null) {
            this.f15506i0 = new HashMap();
        }
        View view = (View) this.f15506i0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f15506i0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final C11848c<C11863k> getAdapter() {
        C11848c<C11863k> cVar = this.f15498a0;
        if (cVar != null) {
            return cVar;
        }
        C12880j.m40227c("adapter");
        throw null;
    }

    /* renamed from: o */
    public final C2809j mo19734o() {
        C2809j jVar = this.f15493V;
        if (jVar != null) {
            return jVar;
        }
        C12880j.m40227c("logOutRouter");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C7738g.m22802a(this, C7948g.fragment_profile_picker, viewGroup, false, 4, null);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onRetryClicked(boolean z) {
        C6725m1 m1Var = this.f15494W;
        if (m1Var != null) {
            m1Var.mo19441A();
        } else {
            C12880j.m40227c("profilesViewModel");
            throw null;
        }
    }

    public void onStart() {
        super.onStart();
        C6725m1 m1Var = this.f15494W;
        if (m1Var != null) {
            C5755i.m18679a(this, m1Var, null, null, new C6976d(this), 6, null);
            C7908x xVar = this.f15500c0;
            if (xVar != null) {
                xVar.mo20833a();
            } else {
                C12880j.m40227c("subscriptionMessage");
                throw null;
            }
        } else {
            C12880j.m40227c("profilesViewModel");
            throw null;
        }
    }

    public void onStop() {
        super.onStop();
        NoConnectionView noConnectionView = (NoConnectionView) _$_findCachedViewById(C7946e.profilesErrorView);
        if (noConnectionView != null) {
            noConnectionView.mo2144c();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        int i2;
        Context requireContext = requireContext();
        C12880j.m40222a((Object) requireContext, "requireContext()");
        if (C5837i.m18842d(requireContext)) {
            C5852n0.m18884a(view, false, false, null, 7, null);
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C7946e.profilesRecyclerView);
        C12880j.m40222a((Object) recyclerView, "view.profilesRecyclerView");
        C11848c<C11863k> cVar = this.f15498a0;
        if (cVar != null) {
            RecyclerViewExtKt.m18800a(this, recyclerView, cVar);
            if (m21246s()) {
                i = C7949h.done_editing_profile_title;
            } else {
                i = C7949h.edit_profile_title;
            }
            String a = C5880u.m18936a(i);
            TextView textView = (TextView) view.findViewById(C7946e.titleTextView);
            if (textView != null) {
                if (m21246s()) {
                    i2 = C7949h.create_another_profile_title;
                } else {
                    i2 = C7949h.choose_profile_title;
                }
                textView.setText(C5880u.m18936a(i2));
            }
            TextView textView2 = (TextView) view.findViewById(C7946e.editTextView);
            if (textView2 != null) {
                textView2.setText(a);
            }
            if (!m21246s()) {
                TextView textView3 = (TextView) view.findViewById(C7946e.editTextView);
                if (textView3 != null) {
                    C6629d0 d0Var = this.f15502e0;
                    if (d0Var != null) {
                        textView3.setContentDescription(d0Var.mo19298b());
                    } else {
                        C12880j.m40227c("profileAccessibility");
                        throw null;
                    }
                }
            }
            TextView textView4 = (TextView) view.findViewById(C7946e.editTextView);
            if (textView4 != null) {
                textView4.setOnClickListener(new C6977e(this));
            }
            TextView textView5 = (TextView) view.findViewById(C7946e.descriptionTextView);
            if (textView5 != null) {
                C4127b0.m14131b(textView5, m21246s());
            }
            NoConnectionView noConnectionView = (NoConnectionView) _$_findCachedViewById(C7946e.profilesErrorView);
            if (noConnectionView != null) {
                noConnectionView.setRetryListener(this);
            }
            NoConnectionView noConnectionView2 = (NoConnectionView) _$_findCachedViewById(C7946e.profilesErrorView);
            if (noConnectionView2 != null) {
                C4127b0.m14131b(noConnectionView2, false);
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(C7946e.profilesRoot);
            C12880j.m40222a((Object) constraintLayout, "profilesRoot");
            constraintLayout.setVisibility(8);
            m21233a(view);
            return;
        }
        C12880j.m40227c("adapter");
        throw null;
    }

    /* renamed from: p */
    public final C6661f1 mo19735p() {
        C6661f1 f1Var = this.f15492U;
        if (f1Var != null) {
            return f1Var;
        }
        C12880j.m40227c("presenter");
        throw null;
    }

    /* renamed from: q */
    public final C7022z0 mo19736q() {
        C7022z0 z0Var = this.f15497Z;
        if (z0Var != null) {
            return z0Var;
        }
        C12880j.m40227c("profilesListener");
        throw null;
    }

    /* renamed from: b */
    private final void m21239b(C6626c0 c0Var) {
        this.f15504g0 = true;
        C6725m1 m1Var = this.f15494W;
        if (m1Var != null) {
            Completable a = m1Var.mo19442a(c0Var).mo30040a(C11992a.m38600a());
            C12880j.m40222a((Object) a, "profilesViewModel.select…dSchedulers.mainThread())");
            C0722m viewLifecycleOwner = getViewLifecycleOwner();
            C12880j.m40222a((Object) viewLifecycleOwner, "viewLifecycleOwner");
            C10541b a2 = C10541b.m33255a(viewLifecycleOwner, C0716a.ON_DESTROY);
            C12880j.m40222a((Object) a2, "AndroidLifecycleScopePro…om(\n    this, untilEvent)");
            Object a3 = a.mo30048a((C11912b<? extends R>) C11793e.m37930a((C11790c0) a2));
            C12880j.m40222a(a3, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
            ((C11839v) a3).mo29926a(new C6981g(this, c0Var), new C6982h(this));
            return;
        }
        C12880j.m40227c("profilesViewModel");
        throw null;
    }

    /* renamed from: e */
    public C2378m mo11534e() {
        C2378m mVar = new C2378m(C2433b.PROFILE_SWITCHER, (String) null, 2, (DefaultConstructorMarker) null);
        C6969y0 y0Var = this.f15499b0;
        if (y0Var != null) {
            if (!C12880j.m40224a((Object) y0Var.mo19724y(), (Object) C6774b.f15156c)) {
                mVar = C2378m.m8910a(mVar, null, "Profile", null, null, 13, null);
            }
            return m21246s() ? new C2378m(C2433b.ADD_PROFILE, (String) null, 2, (DefaultConstructorMarker) null) : mVar;
        }
        C12880j.m40227c("profilesHostViewModel");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m21235a(C6726a aVar) {
        C6978f fVar = new C6978f(this);
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C7946e.profilesProgressbar);
        C12880j.m40222a((Object) progressBar, "profilesProgressbar");
        progressBar.setVisibility(aVar.mo19448c() ? 0 : 8);
        String str = "profilesRoot";
        if (aVar.mo19452f()) {
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(C7946e.profilesRoot);
            C12880j.m40222a((Object) constraintLayout, str);
            constraintLayout.setVisibility(8);
            NoConnectionView noConnectionView = (NoConnectionView) _$_findCachedViewById(C7946e.profilesErrorView);
            if (noConnectionView != null) {
                int i = C7945d.no_service;
                C7619i b = aVar.mo19447b();
                C5643a aVar2 = new C5643a(i, null, null, b != null ? b.mo20546d() : null, 6, null);
                noConnectionView.mo17431a(aVar2);
                return;
            }
            return;
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(C7946e.profilesRoot);
        C12880j.m40222a((Object) constraintLayout2, str);
        constraintLayout2.setVisibility(0);
        NoConnectionView noConnectionView2 = (NoConnectionView) _$_findCachedViewById(C7946e.profilesErrorView);
        if (noConnectionView2 != null) {
            C4127b0.m14131b(noConnectionView2, false);
        }
        TextView textView = (TextView) _$_findCachedViewById(C7946e.editTextView);
        boolean z = true;
        if (textView != null) {
            C4127b0.m14131b(textView, !aVar.mo19448c());
        }
        DisneyTitleToolbar disneyTitleToolbar = (DisneyTitleToolbar) _$_findCachedViewById(C7946e.disneyToolbar);
        if (disneyTitleToolbar != null) {
            disneyTitleToolbar.mo17378a(!aVar.mo19448c());
        }
        TextView textView2 = (TextView) _$_findCachedViewById(C7946e.titleTextView);
        if (textView2 != null) {
            C4127b0.m14131b(textView2, true);
        }
        if (!aVar.mo19448c() && !this.f15504g0) {
            z = false;
        }
        m21240b(z);
        fVar.mo19741a(aVar);
    }

    /* renamed from: b */
    private final void m21240b(boolean z) {
        if (z) {
            View _$_findCachedViewById = _$_findCachedViewById(C7946e.blockingView);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setOnClickListener(C6974b.f15507c);
                return;
            }
            return;
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(C7946e.blockingView);
        if (_$_findCachedViewById2 != null) {
            _$_findCachedViewById2.setOnClickListener(null);
        }
        View _$_findCachedViewById3 = _$_findCachedViewById(C7946e.blockingView);
        if (_$_findCachedViewById3 != null) {
            _$_findCachedViewById3.setClickable(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m21234a(C6626c0 c0Var) {
        m21240b(true);
        if (m21246s()) {
            C6671h0 h0Var = this.f15496Y;
            if (h0Var != null) {
                h0Var.mo19400b(new C6780r1(c0Var, null, 2, null));
            } else {
                C12880j.m40227c("profileNavRouter");
                throw null;
            }
        } else {
            C6847a aVar = this.f15501d0;
            if (aVar != null) {
                aVar.mo19619d();
                m21239b(c0Var);
                return;
            }
            C12880j.m40227c("profileAnalytics");
            throw null;
        }
    }

    /* renamed from: a */
    private final void m21233a(View view) {
        int i;
        int i2;
        DisneyTitleToolbar disneyTitleToolbar = (DisneyTitleToolbar) view.findViewById(C7946e.disneyToolbar);
        if (disneyTitleToolbar != null) {
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C7946e.profilesRecyclerView);
            C12880j.m40222a((Object) recyclerView, "profilesRecyclerView");
            C3848a aVar = this.f15503f0;
            if (aVar != null) {
                DisneyTitleToolbar.m18445a(disneyTitleToolbar, recyclerView, aVar, null, null, null, 0, null, 124, null);
            } else {
                C12880j.m40227c("backgroundHelper");
                throw null;
            }
        }
        DisneyTitleToolbar disneyTitleToolbar2 = (DisneyTitleToolbar) view.findViewById(C7946e.disneyToolbar);
        if (disneyTitleToolbar2 != null) {
            disneyTitleToolbar2.mo17380c(false);
        }
        DisneyTitleToolbar disneyTitleToolbar3 = (DisneyTitleToolbar) view.findViewById(C7946e.disneyToolbar);
        if (disneyTitleToolbar3 != null) {
            if (m21246s()) {
                i2 = C7949h.done_editing_profile_title;
            } else {
                i2 = C7949h.edit_profile_title;
            }
            disneyTitleToolbar3.mo17377a(C5880u.m18936a(i2), (Function0<C13145v>) new C6983i<C13145v>(this));
        }
        DisneyTitleToolbar disneyTitleToolbar4 = (DisneyTitleToolbar) view.findViewById(C7946e.disneyToolbar);
        if (disneyTitleToolbar4 != null) {
            if (m21246s()) {
                i = C7949h.create_another_profile_title;
            } else {
                i = C7949h.choose_profile_title;
            }
            disneyTitleToolbar4.setTitle(C5880u.m18936a(i));
        }
        if (!m21246s()) {
            DisneyTitleToolbar disneyTitleToolbar5 = (DisneyTitleToolbar) view.findViewById(C7946e.disneyToolbar);
            if (disneyTitleToolbar5 != null) {
                C6629d0 d0Var = this.f15502e0;
                if (d0Var != null) {
                    DisneyTitleToolbar.m18446a(disneyTitleToolbar5, (CharSequence) null, (CharSequence) d0Var.mo19298b(), 1, (Object) null);
                } else {
                    C12880j.m40227c("profileAccessibility");
                    throw null;
                }
            }
        }
    }
}
