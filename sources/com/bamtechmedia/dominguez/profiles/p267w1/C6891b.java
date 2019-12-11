package com.bamtechmedia.dominguez.profiles.p267w1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.analytics.C2413n;
import com.bamtechmedia.dominguez.core.framework.C5755i;
import com.bamtechmedia.dominguez.core.utils.C5833g;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5839j;
import com.bamtechmedia.dominguez.core.utils.C5852n0;
import com.bamtechmedia.dominguez.core.utils.RecyclerViewExtKt;
import com.bamtechmedia.dominguez.profiles.C6626c0;
import com.bamtechmedia.dominguez.profiles.C6629d0;
import com.bamtechmedia.dominguez.profiles.C6661f1;
import com.bamtechmedia.dominguez.profiles.C6661f1.C6662a;
import com.bamtechmedia.dominguez.profiles.C6671h0;
import com.bamtechmedia.dominguez.profiles.C6671h0.C6672a;
import com.bamtechmedia.dominguez.profiles.C6725m1;
import com.bamtechmedia.dominguez.profiles.C6725m1.C6726a;
import com.bamtechmedia.dominguez.profiles.C6769r0.C6771b.C6774b;
import com.bamtechmedia.dominguez.profiles.C6780r1;
import com.bamtechmedia.dominguez.profiles.C6969y0;
import com.bamtechmedia.dominguez.profiles.p271y1.C7016l;
import java.util.Collection;
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
import p163g.p201e.p203b.p312q.C7717x;
import p163g.p201e.p203b.p314r.C7738g;
import p163g.p201e.p203b.p330z.C7946e;
import p163g.p201e.p203b.p330z.C7948g;
import p163g.p509o.p510a.C11847b;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.C11853e;
import p163g.p509o.p510a.C11863k;
import p512h.p513c.p514k.C11890i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 C2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001CB\u0005¢\u0006\u0002\u0010\u0004J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0002J\u0016\u00104\u001a\u0002012\f\u00105\u001a\b\u0012\u0004\u0012\u00020106H\u0002J\b\u00107\u001a\u00020%H\u0016J&\u00108\u001a\u0004\u0018\u0001092\u0006\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\b\u0010@\u001a\u000201H\u0016J\u001a\u0010A\u001a\u0002012\u0006\u0010B\u001a\u0002092\b\u0010>\u001a\u0004\u0018\u00010?H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001b\u0010$\u001a\u00020%8FX\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\u001e\u0010*\u001a\u00020+8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u0006D"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/edit/EditAllProfilesFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsStateProvider;", "Lcom/bamtechmedia/dominguez/globalnav/HideNavMenu;", "()V", "presenter", "Lcom/bamtechmedia/dominguez/profiles/ProfilesPresenter;", "getPresenter", "()Lcom/bamtechmedia/dominguez/profiles/ProfilesPresenter;", "setPresenter", "(Lcom/bamtechmedia/dominguez/profiles/ProfilesPresenter;)V", "profileAccessibility", "Lcom/bamtechmedia/dominguez/profiles/ProfileAccessibility;", "getProfileAccessibility", "()Lcom/bamtechmedia/dominguez/profiles/ProfileAccessibility;", "setProfileAccessibility", "(Lcom/bamtechmedia/dominguez/profiles/ProfileAccessibility;)V", "profileNavRouter", "Lcom/bamtechmedia/dominguez/profiles/ProfileNavRouter;", "getProfileNavRouter", "()Lcom/bamtechmedia/dominguez/profiles/ProfileNavRouter;", "setProfileNavRouter", "(Lcom/bamtechmedia/dominguez/profiles/ProfileNavRouter;)V", "profilesAdapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/ViewHolder;", "getProfilesAdapter", "()Lcom/xwray/groupie/GroupAdapter;", "setProfilesAdapter", "(Lcom/xwray/groupie/GroupAdapter;)V", "profilesHostViewModel", "Lcom/bamtechmedia/dominguez/profiles/ProfilesHostViewModel;", "getProfilesHostViewModel", "()Lcom/bamtechmedia/dominguez/profiles/ProfilesHostViewModel;", "setProfilesHostViewModel", "(Lcom/bamtechmedia/dominguez/profiles/ProfilesHostViewModel;)V", "section", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsSection;", "getSection", "()Lcom/bamtechmedia/dominguez/analytics/AnalyticsSection;", "section$delegate", "Lcom/bamtechmedia/dominguez/core/utils/ParcelableFragmentArgumentDelegate;", "viewModel", "Lcom/bamtechmedia/dominguez/profiles/ProfilesViewModel;", "getViewModel", "()Lcom/bamtechmedia/dominguez/profiles/ProfilesViewModel;", "setViewModel", "(Lcom/bamtechmedia/dominguez/profiles/ProfilesViewModel;)V", "blockProfilePicker", "", "isBlocked", "", "dismissEdit", "actionDismiss", "Lkotlin/Function0;", "getAnalyticsSection", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onViewCreated", "view", "Companion", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.w1.b */
/* compiled from: EditAllProfilesFragment.kt */
public final class C6891b extends C11890i implements C2413n, C7717x {

    /* renamed from: b0 */
    public static final C6892a f15348b0 = new C6892a(null);

    /* renamed from: U */
    public C6725m1 f15349U;

    /* renamed from: V */
    public C6661f1 f15350V;

    /* renamed from: W */
    public C6671h0 f15351W;

    /* renamed from: X */
    public C11848c<C11863k> f15352X;

    /* renamed from: Y */
    public C6969y0 f15353Y;

    /* renamed from: Z */
    public C6629d0 f15354Z;

    /* renamed from: a0 */
    private HashMap f15355a0;

    /* renamed from: com.bamtechmedia.dominguez.profiles.w1.b$a */
    /* compiled from: EditAllProfilesFragment.kt */
    public static final class C6892a {
        private C6892a() {
        }

        /* renamed from: a */
        public final C6891b mo19664a(C2378m mVar) {
            C6891b bVar = new C6891b();
            bVar.setArguments(C5833g.m18829a(C12907r.m40244a("section", mVar)));
            return bVar;
        }

        public /* synthetic */ C6892a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.w1.b$b */
    /* compiled from: EditAllProfilesFragment.kt */
    static final class C6893b implements OnClickListener {

        /* renamed from: c */
        public static final C6893b f15356c = new C6893b();

        C6893b() {
        }

        public final void onClick(View view) {
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"<anonymous>", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.profiles.w1.b$c */
    /* compiled from: EditAllProfilesFragment.kt */
    static final class C6894c extends C12881k implements Function0<C13145v> {

        /* renamed from: U */
        final /* synthetic */ int f15357U;

        /* renamed from: V */
        final /* synthetic */ int f15358V;

        /* renamed from: W */
        final /* synthetic */ Function0 f15359W;

        /* renamed from: c */
        final /* synthetic */ C6891b f15360c;

        /* renamed from: com.bamtechmedia.dominguez.profiles.w1.b$c$a */
        /* compiled from: EditAllProfilesFragment.kt */
        static final class C6895a extends C12881k implements Function0<C13145v> {

            /* renamed from: c */
            final /* synthetic */ C6894c f15361c;

            C6895a(C6894c cVar) {
                this.f15361c = cVar;
                super(0);
            }

            public final void invoke() {
                this.f15361c.f15359W.invoke();
            }
        }

        C6894c(C6891b bVar, int i, int i2, Function0 function0) {
            this.f15360c = bVar;
            this.f15357U = i;
            this.f15358V = i2;
            this.f15359W = function0;
            super(0);
        }

        public final void invoke() {
            if (this.f15357U == this.f15358V) {
                ConstraintLayout constraintLayout = (ConstraintLayout) this.f15360c._$_findCachedViewById(C7946e.editAllProfilesRoot);
                if (constraintLayout != null) {
                    C5852n0.m18881a((View) constraintLayout, true, (Function0<C13145v>) new C6895a<C13145v>(this));
                }
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.w1.b$d */
    /* compiled from: EditAllProfilesFragment.kt */
    static final class C6896d extends C12881k implements Function1<C6726a, C13145v> {

        /* renamed from: U */
        final /* synthetic */ Function1 f15362U;

        /* renamed from: V */
        final /* synthetic */ Function0 f15363V;

        /* renamed from: c */
        final /* synthetic */ C6891b f15364c;

        C6896d(C6891b bVar, Function1 function1, Function0 function0) {
            this.f15364c = bVar;
            this.f15362U = function1;
            this.f15363V = function0;
            super(1);
        }

        /* renamed from: a */
        public final void mo19666a(C6726a aVar) {
            C6662a a = C6661f1.m20653a(this.f15364c.mo19660o(), aVar, true, this.f15362U, this.f15363V, null, 16, null);
            ProgressBar progressBar = (ProgressBar) this.f15364c._$_findCachedViewById(C7946e.profilesProgressbar);
            C12880j.m40222a((Object) progressBar, "profilesProgressbar");
            progressBar.setVisibility(a.mo19371b() ? 0 : 8);
            this.f15364c.m21093b(aVar.mo19448c());
            this.f15364c.mo19662q().mo29963a((Collection<? extends C11847b>) a.mo19370a());
            TextView textView = (TextView) this.f15364c._$_findCachedViewById(C7946e.titleTextView);
            if (textView != null) {
                C4127b0.m14131b(textView, true);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19666a((C6726a) obj);
            return C13145v.f29587a;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"<anonymous>", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.profiles.w1.b$e */
    /* compiled from: EditAllProfilesFragment.kt */
    static final class C6897e extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C6891b f15365c;

        /* renamed from: com.bamtechmedia.dominguez.profiles.w1.b$e$a */
        /* compiled from: EditAllProfilesFragment.kt */
        static final class C6898a extends C12881k implements Function0<C13145v> {

            /* renamed from: c */
            final /* synthetic */ C6897e f15366c;

            C6898a(C6897e eVar) {
                this.f15366c = eVar;
                super(0);
            }

            public final void invoke() {
                C6672a.m20688a(this.f15366c.f15365c.mo19661p(), false, false, null, false, null, 0, 62, null);
            }
        }

        C6897e(C6891b bVar) {
            this.f15365c = bVar;
            super(0);
        }

        public final void invoke() {
            this.f15365c.m21093b(true);
            this.f15365c.m21094c(new C6898a(this));
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "", "it", "Lcom/bamtechmedia/dominguez/profiles/Profile;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.profiles.w1.b$f */
    /* compiled from: EditAllProfilesFragment.kt */
    static final class C6899f extends C12881k implements Function1<C6626c0, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C6891b f15367c;

        /* renamed from: com.bamtechmedia.dominguez.profiles.w1.b$f$a */
        /* compiled from: EditAllProfilesFragment.kt */
        static final class C6900a extends C12881k implements Function0<C13145v> {

            /* renamed from: U */
            final /* synthetic */ C6626c0 f15368U;

            /* renamed from: c */
            final /* synthetic */ C6899f f15369c;

            C6900a(C6899f fVar, C6626c0 c0Var) {
                this.f15369c = fVar;
                this.f15368U = c0Var;
                super(0);
            }

            public final void invoke() {
                this.f15369c.f15367c.mo19661p().mo19400b(new C6780r1(this.f15368U, null, 2, null));
            }
        }

        C6899f(C6891b bVar) {
            this.f15367c = bVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo19667a(C6626c0 c0Var) {
            this.f15367c.m21093b(true);
            this.f15367c.m21094c(new C6900a(this, c0Var));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19667a((C6626c0) obj);
            return C13145v.f29587a;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.profiles.w1.b$g */
    /* compiled from: EditAllProfilesFragment.kt */
    static final class C6901g implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C6891b f15370c;

        /* renamed from: com.bamtechmedia.dominguez.profiles.w1.b$g$a */
        /* compiled from: EditAllProfilesFragment.kt */
        static final class C6902a extends C12881k implements Function0<C13145v> {

            /* renamed from: c */
            final /* synthetic */ C6901g f15371c;

            C6902a(C6901g gVar) {
                this.f15371c = gVar;
                super(0);
            }

            public final void invoke() {
                C6672a.m20689a(this.f15371c.f15370c.mo19661p(), C12880j.m40224a((Object) this.f15371c.f15370c.mo19663r().mo19724y(), (Object) C6774b.f15156c), false, false, 6, null);
            }
        }

        C6901g(C6891b bVar) {
            this.f15370c = bVar;
        }

        public final void onClick(View view) {
            this.f15370c.m21094c(new C6902a(this));
        }
    }

    static {
        new KProperty[1][0] = C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(C6891b.class), "section", "getSection()Lcom/bamtechmedia/dominguez/analytics/AnalyticsSection;"));
    }

    public C6891b() {
        C5839j.m18852a("section", (Function0) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m21093b(boolean z) {
        if (z) {
            _$_findCachedViewById(C7946e.blockingView).setOnClickListener(C6893b.f15356c);
            return;
        }
        _$_findCachedViewById(C7946e.blockingView).setOnClickListener(null);
        View _$_findCachedViewById = _$_findCachedViewById(C7946e.blockingView);
        C12880j.m40222a((Object) _$_findCachedViewById, "blockingView");
        _$_findCachedViewById.setClickable(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m21094c(Function0<C13145v> function0) {
        C11848c<C11863k> cVar = this.f15352X;
        String str = "profilesAdapter";
        if (cVar != null) {
            int itemCount = cVar.getItemCount() - 1;
            int i = 0;
            if (itemCount >= 0) {
                while (true) {
                    C11848c<C11863k> cVar2 = this.f15352X;
                    if (cVar2 != null) {
                        C11853e a = cVar2.mo13700a(i);
                        if (a != null) {
                            ((C7016l) a).mo19782a((Function0<C13145v>) new C6894c<C13145v>(this, i, itemCount, function0));
                            if (i != itemCount) {
                                i++;
                            } else {
                                return;
                            }
                        } else {
                            throw new C13142s("null cannot be cast to non-null type com.bamtechmedia.dominguez.profiles.picker.ProfilesViewItem");
                        }
                    } else {
                        C12880j.m40227c(str);
                        throw null;
                    }
                }
            }
        } else {
            C12880j.m40227c(str);
            throw null;
        }
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f15355a0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f15355a0 == null) {
            this.f15355a0 = new HashMap();
        }
        View view = (View) this.f15355a0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f15355a0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public C2378m mo11534e() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            C2378m mVar = (C2378m) arguments.getParcelable("section");
            if (mVar != null) {
                C6969y0 y0Var = this.f15353Y;
                if (y0Var != null) {
                    return C12880j.m40224a((Object) y0Var.mo19724y(), (Object) C6774b.f15156c) ? C2378m.m8910a(mVar, null, "OnBoarding", null, null, 13, null) : mVar;
                }
                C12880j.m40227c("profilesHostViewModel");
                throw null;
            }
        }
        throw new IllegalArgumentException("No section is provided for EditAllProfilesFragment");
    }

    /* renamed from: o */
    public final C6661f1 mo19660o() {
        C6661f1 f1Var = this.f15350V;
        if (f1Var != null) {
            return f1Var;
        }
        C12880j.m40227c("presenter");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C7738g.m22802a(this, C7948g.fragment_edit_all_profiles, viewGroup, false, 4, null);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onStart() {
        super.onStart();
        C6899f fVar = new C6899f(this);
        C6897e eVar = new C6897e(this);
        C6725m1 m1Var = this.f15349U;
        if (m1Var != null) {
            C5755i.m18679a(this, m1Var, null, null, new C6896d(this, fVar, eVar), 6, null);
            return;
        }
        C12880j.m40227c("viewModel");
        throw null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C5852n0.m18884a(view, false, false, null, 7, null);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C7946e.editAllProfilesRecyclerView);
        String str = "editAllProfilesRecyclerView";
        C12880j.m40222a((Object) recyclerView, str);
        C11848c<C11863k> cVar = this.f15352X;
        if (cVar != null) {
            RecyclerViewExtKt.m18800a(this, recyclerView, cVar);
            Context context = view.getContext();
            C12880j.m40222a((Object) context, "view.context");
            if (C5837i.m18842d(context)) {
                RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C7946e.editAllProfilesRecyclerView);
                C12880j.m40222a((Object) recyclerView2, str);
                recyclerView2.getLayoutParams().height = -2;
            }
            ((TextView) _$_findCachedViewById(C7946e.doneButton)).setOnClickListener(new C6901g(this));
            TextView textView = (TextView) _$_findCachedViewById(C7946e.doneButton);
            C12880j.m40222a((Object) textView, "doneButton");
            C6629d0 d0Var = this.f15354Z;
            if (d0Var != null) {
                textView.setContentDescription(d0Var.mo19292a());
            } else {
                C12880j.m40227c("profileAccessibility");
                throw null;
            }
        } else {
            C12880j.m40227c("profilesAdapter");
            throw null;
        }
    }

    /* renamed from: p */
    public final C6671h0 mo19661p() {
        C6671h0 h0Var = this.f15351W;
        if (h0Var != null) {
            return h0Var;
        }
        C12880j.m40227c("profileNavRouter");
        throw null;
    }

    /* renamed from: q */
    public final C11848c<C11863k> mo19662q() {
        C11848c<C11863k> cVar = this.f15352X;
        if (cVar != null) {
            return cVar;
        }
        C12880j.m40227c("profilesAdapter");
        throw null;
    }

    /* renamed from: r */
    public final C6969y0 mo19663r() {
        C6969y0 y0Var = this.f15353Y;
        if (y0Var != null) {
            return y0Var;
        }
        C12880j.m40227c("profilesHostViewModel");
        throw null;
    }
}
