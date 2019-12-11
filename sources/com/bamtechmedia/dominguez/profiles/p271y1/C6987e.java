package com.bamtechmedia.dominguez.profiles.p271y1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C0715i.C0716a;
import androidx.lifecycle.C0722m;
import com.bamtech.sdk4.service.BadRequestException;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.analytics.C2413n;
import com.bamtechmedia.dominguez.analytics.p057o0.C2433b;
import com.bamtechmedia.dominguez.auth.p066r0.C2809j;
import com.bamtechmedia.dominguez.auth.p066r0.C2809j.C2810a;
import com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView;
import com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView.C5641a;
import com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView.C5642b.C5643a;
import com.bamtechmedia.dominguez.core.framework.C5755i;
import com.bamtechmedia.dominguez.core.utils.C5833g;
import com.bamtechmedia.dominguez.core.utils.C5864r;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import com.bamtechmedia.dominguez.profiles.C6626c0;
import com.bamtechmedia.dominguez.profiles.C6627c1;
import com.bamtechmedia.dominguez.profiles.C6629d0;
import com.bamtechmedia.dominguez.profiles.C6671h0;
import com.bamtechmedia.dominguez.profiles.C6671h0.C6672a;
import com.bamtechmedia.dominguez.profiles.C6725m1;
import com.bamtechmedia.dominguez.profiles.C6725m1.C6726a;
import com.bamtechmedia.dominguez.profiles.C6769r0.C6771b.C6774b;
import com.bamtechmedia.dominguez.profiles.C6769r0.C6771b.C6776c;
import com.bamtechmedia.dominguez.profiles.C6780r1;
import com.bamtechmedia.dominguez.profiles.C6969y0;
import com.bamtechmedia.dominguez.profiles.C7022z0;
import com.bamtechmedia.dominguez.profiles.p262t1.C6847a;
import com.bamtechmedia.dominguez.profiles.p271y1.C7012k.C7013a;
import com.uber.autodispose.android.lifecycle.C10541b;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.C12907r;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.p590y.C13180m;
import p096e.p121h.p135s.C4121a0;
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
import p512h.p513c.p514k.C11890i;
import p520io.reactivex.C11912b;
import p520io.reactivex.Completable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p527w.p529c.C11992a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 h2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002hiB\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010I\u001a\u00020J2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020J0LH\u0002J\u0010\u0010M\u001a\u00020J2\u0006\u0010N\u001a\u00020OH\u0002J\b\u0010P\u001a\u00020QH\u0016J$\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010W2\b\u0010X\u001a\u0004\u0018\u00010YH\u0016J\b\u0010Z\u001a\u00020JH\u0002J\u0010\u0010[\u001a\u00020\u000e2\u0006\u0010\\\u001a\u00020]H\u0016J\u0010\u0010^\u001a\u00020J2\u0006\u0010N\u001a\u00020OH\u0002J\u0010\u0010_\u001a\u00020J2\u0006\u0010`\u001a\u00020\u000eH\u0016J\b\u0010a\u001a\u00020JH\u0016J\b\u0010b\u001a\u00020JH\u0016J\u001a\u0010c\u001a\u00020J2\u0006\u0010d\u001a\u00020S2\b\u0010X\u001a\u0004\u0018\u00010YH\u0016J\u0010\u0010e\u001a\u00020J2\u0006\u0010f\u001a\u00020gH\u0002R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010'\u001a\u00020(8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010-\u001a\u00020.8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001e\u00103\u001a\u0002048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001e\u00109\u001a\u00020:8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001e\u0010?\u001a\u00020@8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020F8BX\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006j"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/picker/ProfilePickerTvFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/bamtechmedia/dominguez/globalnav/HideNavMenu;", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsStateProvider;", "Lcom/bamtechmedia/dominguez/core/utils/OnKeyDownHandler;", "Lcom/bamtechmedia/dominguez/core/design/widgets/NoConnectionView$RetryListener;", "()V", "logOutRouter", "Lcom/bamtechmedia/dominguez/auth/logout/LogOutRouter;", "getLogOutRouter", "()Lcom/bamtechmedia/dominguez/auth/logout/LogOutRouter;", "setLogOutRouter", "(Lcom/bamtechmedia/dominguez/auth/logout/LogOutRouter;)V", "newProfileSelected", "", "presenter", "Lcom/bamtechmedia/dominguez/profiles/picker/ProfilesTvPresenter;", "getPresenter", "()Lcom/bamtechmedia/dominguez/profiles/picker/ProfilesTvPresenter;", "setPresenter", "(Lcom/bamtechmedia/dominguez/profiles/picker/ProfilesTvPresenter;)V", "profileAccessibility", "Lcom/bamtechmedia/dominguez/profiles/ProfileAccessibility;", "getProfileAccessibility", "()Lcom/bamtechmedia/dominguez/profiles/ProfileAccessibility;", "setProfileAccessibility", "(Lcom/bamtechmedia/dominguez/profiles/ProfileAccessibility;)V", "profileAnalytics", "Lcom/bamtechmedia/dominguez/profiles/analytics/ProfilesAnalytics;", "getProfileAnalytics", "()Lcom/bamtechmedia/dominguez/profiles/analytics/ProfilesAnalytics;", "setProfileAnalytics", "(Lcom/bamtechmedia/dominguez/profiles/analytics/ProfilesAnalytics;)V", "profileNavRouter", "Lcom/bamtechmedia/dominguez/profiles/ProfileNavRouter;", "getProfileNavRouter", "()Lcom/bamtechmedia/dominguez/profiles/ProfileNavRouter;", "setProfileNavRouter", "(Lcom/bamtechmedia/dominguez/profiles/ProfileNavRouter;)V", "profilesHostViewModel", "Lcom/bamtechmedia/dominguez/profiles/ProfilesHostViewModel;", "getProfilesHostViewModel", "()Lcom/bamtechmedia/dominguez/profiles/ProfilesHostViewModel;", "setProfilesHostViewModel", "(Lcom/bamtechmedia/dominguez/profiles/ProfilesHostViewModel;)V", "profilesListener", "Lcom/bamtechmedia/dominguez/profiles/ProfilesListener;", "getProfilesListener", "()Lcom/bamtechmedia/dominguez/profiles/ProfilesListener;", "setProfilesListener", "(Lcom/bamtechmedia/dominguez/profiles/ProfilesListener;)V", "profilesMemoryCache", "Lcom/bamtechmedia/dominguez/profiles/ProfilesMemoryCache;", "getProfilesMemoryCache", "()Lcom/bamtechmedia/dominguez/profiles/ProfilesMemoryCache;", "setProfilesMemoryCache", "(Lcom/bamtechmedia/dominguez/profiles/ProfilesMemoryCache;)V", "profilesViewModel", "Lcom/bamtechmedia/dominguez/profiles/ProfilesViewModel;", "getProfilesViewModel", "()Lcom/bamtechmedia/dominguez/profiles/ProfilesViewModel;", "setProfilesViewModel", "(Lcom/bamtechmedia/dominguez/profiles/ProfilesViewModel;)V", "subscriptionMessage", "Lcom/bamtechmedia/dominguez/paywall/SubscriptionMessage;", "getSubscriptionMessage", "()Lcom/bamtechmedia/dominguez/paywall/SubscriptionMessage;", "setSubscriptionMessage", "(Lcom/bamtechmedia/dominguez/paywall/SubscriptionMessage;)V", "type", "Lcom/bamtechmedia/dominguez/profiles/picker/ProfilePickerTvFragment$Type;", "getType", "()Lcom/bamtechmedia/dominguez/profiles/picker/ProfilePickerTvFragment$Type;", "animateDismiss", "", "dismiss", "Lkotlin/Function0;", "clickWhoWatching", "profile", "Lcom/bamtechmedia/dominguez/profiles/Profile;", "getAnalyticsSection", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsSection;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onEditDoneButtonClicked", "onKeyDown", "keyCode", "", "onProfileItemClicked", "onRetryClicked", "isOffline", "onStart", "onStop", "onViewCreated", "view", "renderState", "state", "Lcom/bamtechmedia/dominguez/profiles/ProfilesViewModel$State;", "Companion", "Type", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.y1.e */
/* compiled from: ProfilePickerTvFragment.kt */
public final class C6987e extends C11890i implements C7717x, C2413n, C5864r, C5641a {

    /* renamed from: g0 */
    public static final C6988a f15520g0 = new C6988a(null);

    /* renamed from: U */
    public C7012k f15521U;

    /* renamed from: V */
    public C6725m1 f15522V;

    /* renamed from: W */
    public C6627c1 f15523W;

    /* renamed from: X */
    public C6671h0 f15524X;

    /* renamed from: Y */
    public C7022z0 f15525Y;

    /* renamed from: Z */
    public C6969y0 f15526Z;

    /* renamed from: a0 */
    public C7908x f15527a0;

    /* renamed from: b0 */
    public C6847a f15528b0;

    /* renamed from: c0 */
    public C6629d0 f15529c0;

    /* renamed from: d0 */
    public C2809j f15530d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public boolean f15531e0;

    /* renamed from: f0 */
    private HashMap f15532f0;

    /* renamed from: com.bamtechmedia.dominguez.profiles.y1.e$a */
    /* compiled from: ProfilePickerTvFragment.kt */
    public static final class C6988a {
        private C6988a() {
        }

        /* renamed from: a */
        public final C6987e mo19754a(C6989b bVar) {
            C6987e eVar = new C6987e();
            eVar.setArguments(C5833g.m18829a(C12907r.m40244a("picker_type", bVar)));
            return eVar;
        }

        public /* synthetic */ C6988a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.y1.e$b */
    /* compiled from: ProfilePickerTvFragment.kt */
    public enum C6989b {
        WHO_WATCHING(C7949h.edit_profile_title, C7949h.choose_profile_title, null),
        ADD_PROFILES(C7949h.done_editing_profile_title, C7949h.create_another_profile_title, Integer.valueOf(C7949h.set_up_profiles_copy)),
        EDIT_ALL_PROFILE(C7949h.done_editing_profile_title, C7949h.edit_profile_title, Integer.valueOf(C7949h.edit_profile_copy));
        

        /* renamed from: U */
        private final int f15537U;

        /* renamed from: V */
        private final Integer f15538V;

        /* renamed from: c */
        private final int f15539c;

        private C6989b(int i, int i2, Integer num) {
            this.f15539c = i;
            this.f15537U = i2;
            this.f15538V = num;
        }

        /* renamed from: a */
        public final int mo19755a() {
            return this.f15539c;
        }

        /* renamed from: b */
        public final Integer mo19756b() {
            return this.f15538V;
        }

        /* renamed from: c */
        public final int mo19757c() {
            return this.f15537U;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.y1.e$c */
    /* compiled from: ProfilePickerTvFragment.kt */
    static final class C6990c implements Runnable {

        /* renamed from: c */
        final /* synthetic */ Function0 f15540c;

        C6990c(Function0 function0) {
            this.f15540c = function0;
        }

        public final void run() {
            this.f15540c.invoke();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"<anonymous>", "", "run"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.profiles.y1.e$d */
    /* compiled from: ProfilePickerTvFragment.kt */
    static final class C6991d implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C6987e f15541a;

        /* renamed from: com.bamtechmedia.dominguez.profiles.y1.e$d$a */
        /* compiled from: ProfilePickerTvFragment.kt */
        static final class C6992a extends C12881k implements Function0<C13145v> {

            /* renamed from: c */
            final /* synthetic */ C6991d f15542c;

            C6992a(C6991d dVar) {
                this.f15542c = dVar;
                super(0);
            }

            public final void invoke() {
                C7022z0 t = this.f15542c.f15541a.mo19751t();
                C6726a aVar = (C6726a) this.f15542c.f15541a.mo19753v().getCurrentState();
                C6626c0 e = aVar != null ? aVar.mo19450e() : null;
                if (e != null) {
                    t.mo18810a(e);
                } else {
                    Intrinsics.throwNpe();
                    throw null;
                }
            }
        }

        C6991d(C6987e eVar) {
            this.f15541a = eVar;
        }

        public final void run() {
            this.f15541a.m21268c((Function0<C13145v>) new C6992a<C13145v>(this));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.y1.e$e */
    /* compiled from: ProfilePickerTvFragment.kt */
    static final class C6993e<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C6987e f15543c;

        C6993e(C6987e eVar) {
            this.f15543c = eVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            if (th instanceof BadRequestException) {
                C2810a.m10485a(this.f15543c.mo19746o(), 0, true, 1, (Object) null);
            } else {
                Intrinsics.checkReturnedValueIsNotNull((Object) th, "error");
                throw th;
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.y1.e$f */
    /* compiled from: ProfilePickerTvFragment.kt */
    static final class C6994f extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C6987e f15544c;

        C6994f(C6987e eVar) {
            this.f15544c = eVar;
            super(0);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void invoke() {
            /*
                r7 = this;
                com.bamtechmedia.dominguez.profiles.y1.e r0 = r7.f15544c
                com.bamtechmedia.dominguez.profiles.c1 r0 = r0.mo19752u()
                boolean r0 = r0.mo19290d()
                if (r0 == 0) goto L_0x0031
                com.bamtechmedia.dominguez.profiles.y1.e r0 = r7.f15544c
                com.bamtechmedia.dominguez.profiles.m1 r0 = r0.mo19753v()
                java.lang.Object r0 = r0.getCurrentState()
                com.bamtechmedia.dominguez.profiles.m1$a r0 = (com.bamtechmedia.dominguez.profiles.C6725m1.C6726a) r0
                if (r0 == 0) goto L_0x0028
                java.util.List r0 = r0.mo19449d()
                if (r0 == 0) goto L_0x0028
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                com.bamtechmedia.dominguez.profiles.c0 r0 = (com.bamtechmedia.dominguez.profiles.C6626c0) r0
                goto L_0x0029
            L_0x0028:
                r0 = 0
            L_0x0029:
                if (r0 == 0) goto L_0x0048
                com.bamtechmedia.dominguez.profiles.y1.e r1 = r7.f15544c
                r1.m21258a(r0)
                goto L_0x0048
            L_0x0031:
                com.bamtechmedia.dominguez.profiles.y1.e r0 = r7.f15544c
                com.bamtechmedia.dominguez.profiles.h0 r1 = r0.mo19749r()
                r2 = 0
                r3 = 0
                r4 = 1
                r5 = 2
                r6 = 0
                com.bamtechmedia.dominguez.profiles.C6671h0.C6672a.m20689a(r1, r2, r3, r4, r5, r6)
                com.bamtechmedia.dominguez.profiles.y1.e r0 = r7.f15544c
                com.bamtechmedia.dominguez.profiles.t1.a r0 = r0.mo19748q()
                r0.mo19617b()
            L_0x0048:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.profiles.p271y1.C6987e.C6994f.invoke():void");
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.y1.e$g */
    /* compiled from: ProfilePickerTvFragment.kt */
    static final class C6995g extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C6987e f15545c;

        C6995g(C6987e eVar) {
            this.f15545c = eVar;
            super(0);
        }

        public final void invoke() {
            C6672a.m20689a(this.f15545c.mo19749r(), false, false, true, 3, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.y1.e$h */
    /* compiled from: ProfilePickerTvFragment.kt */
    static final class C6996h extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C6987e f15546c;

        C6996h(C6987e eVar) {
            this.f15546c = eVar;
            super(0);
        }

        public final void invoke() {
            C6672a.m20687a(this.f15546c.mo19749r(), Intrinsics.areEqual((Object) this.f15546c.mo19750s().mo19724y(), (Object) C6776c.f15157c), false, 2, null);
            this.f15546c.mo19748q().mo19618c();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.y1.e$i */
    /* compiled from: ProfilePickerTvFragment.kt */
    static final class C6997i extends C12881k implements Function0<C13145v> {

        /* renamed from: U */
        final /* synthetic */ C6626c0 f15547U;

        /* renamed from: c */
        final /* synthetic */ C6987e f15548c;

        C6997i(C6987e eVar, C6626c0 c0Var) {
            this.f15548c = eVar;
            this.f15547U = c0Var;
            super(0);
        }

        public final void invoke() {
            this.f15548c.mo19749r().mo19400b(new C6780r1(this.f15547U, null, 2, null));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.y1.e$j */
    /* compiled from: ProfilePickerTvFragment.kt */
    static final class C6998j extends C12881k implements Function1<C6726a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C6987e f15549c;

        C6998j(C6987e eVar) {
            this.f15549c = eVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo19760a(C6726a aVar) {
            this.f15549c.m21259a(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19760a((C6726a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.y1.e$k */
    /* compiled from: ProfilePickerTvFragment.kt */
    static final class C6999k implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C6987e f15550c;

        C6999k(C6987e eVar) {
            this.f15550c = eVar;
        }

        public final void onClick(View view) {
            this.f15550c.m21270x();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"updateAdapter", "", "state", "Lcom/bamtechmedia/dominguez/profiles/ProfilesViewModel$State;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.profiles.y1.e$l */
    /* compiled from: ProfilePickerTvFragment.kt */
    static final class C7000l extends C12881k implements Function1<C6726a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C6987e f15551c;

        /* renamed from: com.bamtechmedia.dominguez.profiles.y1.e$l$a */
        /* compiled from: ProfilePickerTvFragment.kt */
        static final class C7001a extends C12881k implements Function0<C13145v> {

            /* renamed from: c */
            final /* synthetic */ C7000l f15552c;

            C7001a(C7000l lVar) {
                this.f15552c = lVar;
                super(0);
            }

            public final void invoke() {
                C6672a.m20688a(this.f15552c.f15551c.mo19749r(), false, false, null, false, null, 0, 62, null);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.profiles.y1.e$l$b */
        /* compiled from: ProfilePickerTvFragment.kt */
        static final class C7002b extends C12881k implements Function1<C6626c0, C13145v> {

            /* renamed from: c */
            final /* synthetic */ C7000l f15553c;

            C7002b(C7000l lVar) {
                this.f15553c = lVar;
                super(1);
            }

            /* renamed from: a */
            public final void mo19763a(C6626c0 c0Var) {
                this.f15553c.f15551c.m21265b(c0Var);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo19763a((C6626c0) obj);
                return C13145v.f29587a;
            }
        }

        C7000l(C6987e eVar) {
            this.f15551c = eVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo19762a(C6726a aVar) {
            int i = 0;
            C7013a a = this.f15551c.mo19747p().mo19776a(aVar, this.f15551c.m21269w() == C6989b.EDIT_ALL_PROFILE, (Function1<? super C6626c0, C13145v>) new C7002b<Object,C13145v>(this), (Function0<C13145v>) new C7001a<C13145v>(this));
            if (!aVar.mo19448c() && !this.f15551c.f15531e0) {
                ((LinearLayout) this.f15551c._$_findCachedViewById(C7946e.profilesViewGroup)).removeAllViews();
                for (Object next : a.mo19777a()) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        C7008j jVar = (C7008j) next;
                        LinearLayout linearLayout = (LinearLayout) this.f15551c._$_findCachedViewById(C7946e.profilesViewGroup);
                        LinearLayout linearLayout2 = (LinearLayout) this.f15551c._$_findCachedViewById(C7946e.profilesViewGroup);
                        Intrinsics.checkReturnedValueIsNotNull((Object) linearLayout2, "profilesViewGroup");
                        linearLayout.addView(jVar.mo19769a((ViewGroup) linearLayout2, i));
                        i = i2;
                    } else {
                        C13180m.m40455c();
                        throw null;
                    }
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19762a((C6726a) obj);
            return C13145v.f29587a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final C6989b m21269w() {
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("picker_type") : null;
        if (!(serializable instanceof C6989b)) {
            serializable = null;
        }
        C6989b bVar = (C6989b) serializable;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException("You must call one of the newInstance methods.");
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public final void m21270x() {
        int i = C7003f.$EnumSwitchMapping$1[m21269w().ordinal()];
        if (i == 1) {
            m21268c((Function0<C13145v>) new C6994f<C13145v>(this));
        } else if (i != 2) {
            m21268c((Function0<C13145v>) new C6996h<C13145v>(this));
        } else {
            m21268c((Function0<C13145v>) new C6995g<C13145v>(this));
        }
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f15532f0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f15532f0 == null) {
            this.f15532f0 = new HashMap();
        }
        View view = (View) this.f15532f0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f15532f0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public C2378m mo11534e() {
        C2433b bVar;
        if (m21269w() == C6989b.ADD_PROFILES) {
            bVar = C2433b.ADD_PROFILE;
        } else {
            String str = "profilesHostViewModel";
            if (m21269w() == C6989b.EDIT_ALL_PROFILE) {
                C6969y0 y0Var = this.f15526Z;
                if (y0Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(str);
                    throw null;
                } else if (Intrinsics.areEqual((Object) y0Var.mo19724y(), (Object) C6774b.f15156c)) {
                    bVar = C2433b.PROFILE_EDIT_PROFILE_ONBOARDING;
                }
            }
            if (m21269w() == C6989b.EDIT_ALL_PROFILE) {
                bVar = C2433b.PROFILE_EDIT_PROFILE;
            } else {
                C6969y0 y0Var2 = this.f15526Z;
                if (y0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(str);
                    throw null;
                } else if (Intrinsics.areEqual((Object) y0Var2.mo19724y(), (Object) C6774b.f15156c)) {
                    bVar = C2433b.PROFILE_SWITCHER;
                } else {
                    bVar = C2433b.PROFILE_SWITCHER_PROFILE;
                }
            }
        }
        return new C2378m(bVar, (String) null, 2, (DefaultConstructorMarker) null);
    }

    /* renamed from: o */
    public final C2809j mo19746o() {
        C2809j jVar = this.f15530d0;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("logOutRouter");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C7738g.m22802a(this, C7948g.fragment_profile_picker_tv, viewGroup, false, 4, null);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onRetryClicked(boolean z) {
        C6725m1 m1Var = this.f15522V;
        if (m1Var != null) {
            m1Var.mo19441A();
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("profilesViewModel");
            throw null;
        }
    }

    public void onStart() {
        super.onStart();
        C6725m1 m1Var = this.f15522V;
        if (m1Var != null) {
            C5755i.m18679a(this, m1Var, null, null, new C6998j(this), 6, null);
            C7908x xVar = this.f15527a0;
            if (xVar != null) {
                xVar.mo20833a();
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("subscriptionMessage");
                throw null;
            }
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("profilesViewModel");
            throw null;
        }
    }

    public void onStop() {
        super.onStop();
        ((NoConnectionView) _$_findCachedViewById(C7946e.profilesErrorView)).mo2144c();
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        TextView textView = (TextView) view.findViewById(C7946e.titleTextView);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, "view.titleTextView");
        textView.setText(C5880u.m18936a(m21269w().mo19757c()));
        TextView textView2 = (TextView) view.findViewById(C7946e.subTitleTextView);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView2, "view.subTitleTextView");
        Integer b = m21269w().mo19756b();
        textView2.setText(b != null ? C5880u.m18936a(b.intValue()) : null);
        Button button = (Button) view.findViewById(C7946e.editAllProfilesButton);
        button.setText(C5880u.m18936a(m21269w().mo19755a()));
        String str2 = "profileAccessibility";
        if (m21269w() == C6989b.EDIT_ALL_PROFILE) {
            C6629d0 d0Var = this.f15529c0;
            if (d0Var != null) {
                str = d0Var.mo19292a();
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(str2);
                throw null;
            }
        } else {
            C6629d0 d0Var2 = this.f15529c0;
            if (d0Var2 != null) {
                str = d0Var2.mo19298b();
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(str2);
                throw null;
            }
        }
        button.setContentDescription(str);
        button.setOnClickListener(new C6999k(this));
        ((NoConnectionView) _$_findCachedViewById(C7946e.profilesErrorView)).setRetryListener(this);
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(C7946e.profilesRoot);
        Intrinsics.checkReturnedValueIsNotNull((Object) constraintLayout, "profilesRoot");
        constraintLayout.setVisibility(8);
        NoConnectionView noConnectionView = (NoConnectionView) _$_findCachedViewById(C7946e.profilesErrorView);
        Intrinsics.checkReturnedValueIsNotNull((Object) noConnectionView, "profilesErrorView");
        noConnectionView.setVisibility(8);
    }

    /* renamed from: p */
    public final C7012k mo19747p() {
        C7012k kVar = this.f15521U;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        throw null;
    }

    /* renamed from: q */
    public final C6847a mo19748q() {
        C6847a aVar = this.f15528b0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("profileAnalytics");
        throw null;
    }

    /* renamed from: r */
    public final C6671h0 mo19749r() {
        C6671h0 h0Var = this.f15524X;
        if (h0Var != null) {
            return h0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("profileNavRouter");
        throw null;
    }

    /* renamed from: s */
    public final C6969y0 mo19750s() {
        C6969y0 y0Var = this.f15526Z;
        if (y0Var != null) {
            return y0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("profilesHostViewModel");
        throw null;
    }

    /* renamed from: t */
    public final C7022z0 mo19751t() {
        C7022z0 z0Var = this.f15525Y;
        if (z0Var != null) {
            return z0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("profilesListener");
        throw null;
    }

    /* renamed from: u */
    public final C6627c1 mo19752u() {
        C6627c1 c1Var = this.f15523W;
        if (c1Var != null) {
            return c1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("profilesMemoryCache");
        throw null;
    }

    /* renamed from: v */
    public final C6725m1 mo19753v() {
        C6725m1 m1Var = this.f15522V;
        if (m1Var != null) {
            return m1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("profilesViewModel");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m21268c(Function0<C13145v> function0) {
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C7946e.profilesViewGroup);
        String str = "profilesViewGroup";
        Intrinsics.checkReturnedValueIsNotNull((Object) linearLayout, str);
        if (linearLayout.getChildCount() == 0) {
            function0.invoke();
        }
        LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C7946e.profilesViewGroup);
        Intrinsics.checkReturnedValueIsNotNull((Object) linearLayout2, str);
        int i = 0;
        for (Object next : C4121a0.m14117a(linearLayout2)) {
            int i2 = i + 1;
            if (i >= 0) {
                ((View) next).animate().setDuration(300).setStartDelay(((long) i) * 50).translationY(20.0f).alpha(0.0f).start();
                i = i2;
            } else {
                C13180m.m40455c();
                throw null;
            }
        }
        LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(C7946e.profilesViewGroup);
        Intrinsics.checkReturnedValueIsNotNull((Object) linearLayout3, str);
        ((LinearLayout) _$_findCachedViewById(C7946e.profilesViewGroup)).postDelayed(new C6990c(function0), (((long) (linearLayout3.getChildCount() - 1)) * 50) + 300);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m21265b(C6626c0 c0Var) {
        int i = C7003f.$EnumSwitchMapping$0[m21269w().ordinal()];
        if (i == 1 || i == 2) {
            m21268c((Function0<C13145v>) new C6997i<C13145v>(this, c0Var));
            return;
        }
        C6847a aVar = this.f15528b0;
        if (aVar != null) {
            aVar.mo19619d();
            m21258a(c0Var);
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("profileAnalytics");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m21259a(C6726a aVar) {
        C7000l lVar = new C7000l(this);
        int i = 8;
        String str = "profilesRoot";
        if (aVar.mo19452f()) {
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(C7946e.profilesRoot);
            Intrinsics.checkReturnedValueIsNotNull((Object) constraintLayout, str);
            constraintLayout.setVisibility(8);
            NoConnectionView noConnectionView = (NoConnectionView) _$_findCachedViewById(C7946e.profilesErrorView);
            if (noConnectionView != null) {
                int i2 = C7945d.no_service;
                C7619i b = aVar.mo19447b();
                C5643a aVar2 = new C5643a(i2, null, null, b != null ? b.mo20546d() : null, 6, null);
                noConnectionView.mo17431a(aVar2);
                return;
            }
            return;
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(C7946e.profilesRoot);
        Intrinsics.checkReturnedValueIsNotNull((Object) constraintLayout2, str);
        constraintLayout2.setVisibility(0);
        NoConnectionView noConnectionView2 = (NoConnectionView) _$_findCachedViewById(C7946e.profilesErrorView);
        if (noConnectionView2 != null) {
            C4127b0.m14131b(noConnectionView2, false);
        }
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C7946e.profilesProgressbar);
        Intrinsics.checkReturnedValueIsNotNull((Object) progressBar, "profilesProgressbar");
        if (aVar.mo19448c()) {
            i = 0;
        }
        progressBar.setVisibility(i);
        TextView textView = (TextView) _$_findCachedViewById(C7946e.titleTextView);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, "titleTextView");
        textView.setVisibility(0);
        ((Button) _$_findCachedViewById(C7946e.editAllProfilesButton)).clearFocus();
        Button button = (Button) _$_findCachedViewById(C7946e.editAllProfilesButton);
        Intrinsics.checkReturnedValueIsNotNull((Object) button, "editAllProfilesButton");
        button.setVisibility(0);
        lVar.mo19762a(aVar);
    }

    /* renamed from: a */
    public boolean mo12232a(int i) {
        return this.f15531e0 && i != 4;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m21258a(C6626c0 c0Var) {
        this.f15531e0 = true;
        C6725m1 m1Var = this.f15522V;
        if (m1Var != null) {
            Completable a = m1Var.mo19442a(c0Var).mo30040a(C11992a.m38600a());
            Intrinsics.checkReturnedValueIsNotNull((Object) a, "profilesViewModel.select…dSchedulers.mainThread())");
            C0722m viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkReturnedValueIsNotNull((Object) viewLifecycleOwner, "viewLifecycleOwner");
            C10541b a2 = C10541b.m33255a(viewLifecycleOwner, C0716a.ON_DESTROY);
            Intrinsics.checkReturnedValueIsNotNull((Object) a2, "AndroidLifecycleScopePro…om(\n    this, untilEvent)");
            Object a3 = a.mo30048a((C11912b<? extends R>) C11793e.m37930a((C11790c0) a2));
            Intrinsics.checkReturnedValueIsNotNull(a3, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
            ((C11839v) a3).mo29926a(new C6991d(this), new C6993e(this));
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("profilesViewModel");
        throw null;
    }
}
