package com.bamtechmedia.dominguez.profiles.p266v1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.C0722m;
import androidx.recyclerview.widget.RecyclerView;
import com.bamtechmedia.dominguez.collections.C3333i;
import com.bamtechmedia.dominguez.collections.C3333i.C3334a;
import com.bamtechmedia.dominguez.collections.C3432o;
import com.bamtechmedia.dominguez.collections.C3454q;
import com.bamtechmedia.dominguez.collections.C3454q.C3456b;
import com.bamtechmedia.dominguez.collections.C3502x;
import com.bamtechmedia.dominguez.collections.C3502x.C3503a;
import com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar;
import com.bamtechmedia.dominguez.core.framework.C5755i;
import com.bamtechmedia.dominguez.core.p084g.C3800a;
import com.bamtechmedia.dominguez.core.p088i.p091p.C3848a;
import com.bamtechmedia.dominguez.core.p215k.C5759b;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper.C5805c;
import com.bamtechmedia.dominguez.core.recycler.RecyclerViewSnapScrollHelper.C5805c.C5808c;
import com.bamtechmedia.dominguez.core.utils.C5823d;
import com.bamtechmedia.dominguez.core.utils.C5833g;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5839j;
import com.bamtechmedia.dominguez.core.utils.C5852n0;
import com.bamtechmedia.dominguez.core.utils.C5864r;
import com.bamtechmedia.dominguez.core.utils.C5883w;
import com.bamtechmedia.dominguez.core.utils.RecyclerViewExtKt;
import com.bamtechmedia.dominguez.profiles.C6626c0;
import com.bamtechmedia.dominguez.profiles.C6627c1;
import com.bamtechmedia.dominguez.profiles.C6629d0;
import com.bamtechmedia.dominguez.profiles.C6653e;
import com.bamtechmedia.dominguez.profiles.C6657f;
import com.bamtechmedia.dominguez.profiles.C6780r1;
import com.bamtechmedia.dominguez.profiles.p266v1.C6882h.C6883a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.C12907r;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.p587i0.C12775h;
import kotlin.p590y.C13180m;
import kotlin.reflect.KProperty;
import p096e.p121h.p135s.C4121a0;
import p096e.p121h.p135s.C4127b0;
import p163g.p201e.p203b.p312q.C7717x;
import p163g.p201e.p203b.p314r.C7738g;
import p163g.p201e.p203b.p330z.C7946e;
import p163g.p201e.p203b.p330z.C7948g;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.C11863k;
import p512h.p513c.p514k.C11890i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 p2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001pB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010V\u001a\u00020WH\u0002J\b\u0010X\u001a\u00020WH\u0002J$\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\2\b\u0010]\u001a\u0004\u0018\u00010^2\b\u0010_\u001a\u0004\u0018\u00010`H\u0016J\b\u0010a\u001a\u00020WH\u0016J\u0010\u0010b\u001a\u0002032\u0006\u0010c\u001a\u00020dH\u0016J\b\u0010e\u001a\u00020WH\u0016J\u001a\u0010f\u001a\u00020W2\u0006\u0010g\u001a\u00020Z2\b\u0010_\u001a\u0004\u0018\u00010`H\u0016J\u0010\u0010h\u001a\u00020W2\u0006\u0010i\u001a\u00020jH\u0002J\u0010\u0010k\u001a\u00020W2\u0006\u0010i\u001a\u00020lH\u0002J\u0012\u0010m\u001a\u00020W2\b\u0010n\u001a\u0004\u0018\u00010oH\u0002R$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020!8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001b\u00102\u001a\u0002038FX\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b2\u00104R\u001e\u00107\u001a\u0002088\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001e\u0010=\u001a\u00020>8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001e\u0010C\u001a\u00020D8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001e\u0010I\u001a\u00020J8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001b\u0010O\u001a\u00020P8FX\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bQ\u0010RR\u000e\u0010U\u001a\u000203X\u000e¢\u0006\u0002\n\u0000¨\u0006q"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/avatar/ChooseAvatarFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/bamtechmedia/dominguez/globalnav/HideNavMenu;", "Lcom/bamtechmedia/dominguez/core/utils/OnKeyDownHandler;", "()V", "adapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/ViewHolder;", "getAdapter", "()Lcom/xwray/groupie/GroupAdapter;", "setAdapter", "(Lcom/xwray/groupie/GroupAdapter;)V", "avatarImages", "Lcom/bamtechmedia/dominguez/profiles/AvatarImages;", "getAvatarImages", "()Lcom/bamtechmedia/dominguez/profiles/AvatarImages;", "setAvatarImages", "(Lcom/bamtechmedia/dominguez/profiles/AvatarImages;)V", "backgroundHelper", "Lcom/bamtechmedia/dominguez/core/design/helper/BackgroundHelper;", "getBackgroundHelper", "()Lcom/bamtechmedia/dominguez/core/design/helper/BackgroundHelper;", "setBackgroundHelper", "(Lcom/bamtechmedia/dominguez/core/design/helper/BackgroundHelper;)V", "chooseAvatarsViewModel", "Lcom/bamtechmedia/dominguez/profiles/avatar/ChooseAvatarViewModel;", "getChooseAvatarsViewModel", "()Lcom/bamtechmedia/dominguez/profiles/avatar/ChooseAvatarViewModel;", "setChooseAvatarsViewModel", "(Lcom/bamtechmedia/dominguez/profiles/avatar/ChooseAvatarViewModel;)V", "collectionView", "Lcom/bamtechmedia/dominguez/collections/CollectionViewPresenter$CollectionView;", "collectionViewModel", "Lcom/bamtechmedia/dominguez/collections/CollectionViewModel;", "getCollectionViewModel", "()Lcom/bamtechmedia/dominguez/collections/CollectionViewModel;", "setCollectionViewModel", "(Lcom/bamtechmedia/dominguez/collections/CollectionViewModel;)V", "focusFinder", "Lcom/bamtechmedia/dominguez/core/focus/FocusFinderWrapper;", "getFocusFinder", "()Lcom/bamtechmedia/dominguez/core/focus/FocusFinderWrapper;", "setFocusFinder", "(Lcom/bamtechmedia/dominguez/core/focus/FocusFinderWrapper;)V", "focusHelper", "Lcom/bamtechmedia/dominguez/collections/CollectionViewFocusHelper;", "getFocusHelper", "()Lcom/bamtechmedia/dominguez/collections/CollectionViewFocusHelper;", "setFocusHelper", "(Lcom/bamtechmedia/dominguez/collections/CollectionViewFocusHelper;)V", "isEditMode", "", "()Z", "isEditMode$delegate", "Lcom/bamtechmedia/dominguez/core/utils/BooleanFragmentArgumentDelegate;", "presenter", "Lcom/bamtechmedia/dominguez/collections/CollectionViewPresenter;", "getPresenter", "()Lcom/bamtechmedia/dominguez/collections/CollectionViewPresenter;", "setPresenter", "(Lcom/bamtechmedia/dominguez/collections/CollectionViewPresenter;)V", "profileAccessibility", "Lcom/bamtechmedia/dominguez/profiles/ProfileAccessibility;", "getProfileAccessibility", "()Lcom/bamtechmedia/dominguez/profiles/ProfileAccessibility;", "setProfileAccessibility", "(Lcom/bamtechmedia/dominguez/profiles/ProfileAccessibility;)V", "profilesMemoryCache", "Lcom/bamtechmedia/dominguez/profiles/ProfilesMemoryCache;", "getProfilesMemoryCache", "()Lcom/bamtechmedia/dominguez/profiles/ProfilesMemoryCache;", "setProfilesMemoryCache", "(Lcom/bamtechmedia/dominguez/profiles/ProfilesMemoryCache;)V", "recyclerViewSnapScrollHelper", "Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewSnapScrollHelper;", "getRecyclerViewSnapScrollHelper", "()Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewSnapScrollHelper;", "setRecyclerViewSnapScrollHelper", "(Lcom/bamtechmedia/dominguez/core/recycler/RecyclerViewSnapScrollHelper;)V", "tempProfile", "Lcom/bamtechmedia/dominguez/profiles/TempProfile;", "getTempProfile", "()Lcom/bamtechmedia/dominguez/profiles/TempProfile;", "tempProfile$delegate", "Lcom/bamtechmedia/dominguez/core/utils/ParcelableFragmentArgumentDelegate;", "wasEmpty", "filterAvatars", "", "initializeViews", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onKeyDown", "keyCode", "", "onStart", "onViewCreated", "view", "renderChooseAvatarViewState", "state", "Lcom/bamtechmedia/dominguez/profiles/avatar/ChooseAvatarViewModel$State;", "renderCollectionViewState", "Lcom/bamtechmedia/dominguez/collections/CollectionViewModel$State;", "showError", "error", "", "Companion", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.v1.b */
/* compiled from: ChooseAvatarFragment.kt */
public final class C6869b extends C11890i implements C7717x, C5864r {

    /* renamed from: k0 */
    static final /* synthetic */ KProperty[] f15309k0 = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(C6869b.class), "isEditMode", "isEditMode()Z")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(C6869b.class), "tempProfile", "getTempProfile()Lcom/bamtechmedia/dominguez/profiles/TempProfile;"))};

    /* renamed from: l0 */
    public static final C6870a f15310l0 = new C6870a(null);

    /* renamed from: U */
    public C3454q f15311U;

    /* renamed from: V */
    public C6882h f15312V;

    /* renamed from: W */
    public C6627c1 f15313W;

    /* renamed from: X */
    public C3502x f15314X;

    /* renamed from: Y */
    public C11848c<C11863k> f15315Y;

    /* renamed from: Z */
    public C3432o f15316Z;

    /* renamed from: a0 */
    public C6629d0 f15317a0;

    /* renamed from: b0 */
    public RecyclerViewSnapScrollHelper f15318b0;

    /* renamed from: c0 */
    public C3848a f15319c0;

    /* renamed from: d0 */
    public C5759b f15320d0;

    /* renamed from: e0 */
    public C6657f f15321e0;

    /* renamed from: f0 */
    private C3503a f15322f0;

    /* renamed from: g0 */
    private final C5823d f15323g0 = C5839j.m18847a("choose_avatar_is_edit_mode", (Boolean) null, 2, (Object) null);

    /* renamed from: h0 */
    private final C5883w f15324h0 = C5839j.m18852a("choose_avatar_temp_profile", (Function0) null, 2, (Object) null);

    /* renamed from: i0 */
    private boolean f15325i0 = true;

    /* renamed from: j0 */
    private HashMap f15326j0;

    /* renamed from: com.bamtechmedia.dominguez.profiles.v1.b$a */
    /* compiled from: ChooseAvatarFragment.kt */
    public static final class C6870a {
        private C6870a() {
        }

        /* renamed from: a */
        public final C6869b mo19643a(boolean z, C6780r1 r1Var) {
            C6869b bVar = new C6869b();
            bVar.setArguments(C5833g.m18829a(C12907r.m40244a("choose_avatar_is_edit_mode", Boolean.valueOf(z)), C12907r.m40244a("choose_avatar_temp_profile", r1Var)));
            return bVar;
        }

        public /* synthetic */ C6870a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.v1.b$b */
    /* compiled from: ChooseAvatarFragment.kt */
    static final class C6871b extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C6869b f15327c;

        C6871b(C6869b bVar) {
            this.f15327c = bVar;
            super(0);
        }

        public final void invoke() {
            this.f15327c.requireActivity().onBackPressed();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.v1.b$c */
    /* compiled from: ChooseAvatarFragment.kt */
    static final class C6872c extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C6869b f15328c;

        C6872c(C6869b bVar) {
            this.f15328c = bVar;
            super(0);
        }

        public final void invoke() {
            this.f15328c.mo19640o().mo19648y();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.v1.b$d */
    /* compiled from: ChooseAvatarFragment.kt */
    static final class C6873d implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C6869b f15329c;

        C6873d(C6869b bVar) {
            this.f15329c = bVar;
        }

        public final void onClick(View view) {
            this.f15329c.mo19640o().mo19648y();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.v1.b$e */
    /* compiled from: ChooseAvatarFragment.kt */
    static final class C6874e extends C12881k implements Function1<C3456b, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C6869b f15330c;

        C6874e(C6869b bVar) {
            this.f15330c = bVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo19645a(C3456b bVar) {
            this.f15330c.m21046a(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19645a((C3456b) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.v1.b$f */
    /* compiled from: ChooseAvatarFragment.kt */
    static final class C6875f extends C12881k implements Function1<C6883a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C6869b f15331c;

        C6875f(C6869b bVar) {
            this.f15331c = bVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo19646a(C6883a aVar) {
            this.f15331c.m21049a(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19646a((C6883a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.v1.b$g */
    /* compiled from: ChooseAvatarFragment.kt */
    static final class C6876g extends C12881k implements Function0<C13145v> {

        /* renamed from: U */
        final /* synthetic */ C6869b f15332U;

        /* renamed from: V */
        final /* synthetic */ int f15333V;

        /* renamed from: c */
        final /* synthetic */ int f15334c;

        C6876g(int i, C6869b bVar, int i2) {
            this.f15334c = i;
            this.f15332U = bVar;
            this.f15333V = i2;
            super(0);
        }

        public final void invoke() {
            if (this.f15334c == this.f15333V) {
                this.f15332U.mo19640o().mo19649z();
            }
        }
    }

    /* renamed from: e */
    private final void m21050e(String str) {
        if (str != null) {
            Context requireContext = requireContext();
            Intrinsics.checkReturnedValueIsNotNull((Object) requireContext, "requireContext()");
            Toast makeText = Toast.makeText(requireContext.getApplicationContext(), str, 0);
            makeText.show();
            Intrinsics.checkReturnedValueIsNotNull((Object) makeText, "Toast.makeText(applicati…uration).apply { show() }");
        }
    }

    /* renamed from: r */
    private final void m21051r() {
        C6627c1 c1Var = this.f15313W;
        if (c1Var != null) {
            List<C6653e> c = c1Var.mo19288c();
            ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) c, 10));
            for (C6653e j : c) {
                arrayList.add(j.mo19333j());
            }
            C6626c0 X = mo19641p().mo19513X();
            List a = C6877c.m21060a(arrayList, X != null ? X.mo19364j() : null, mo19641p().mo19364j());
            C3454q qVar = this.f15311U;
            if (qVar != null) {
                qVar.mo12647a((C3333i) new C3334a(a));
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("collectionViewModel");
                throw null;
            }
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("profilesMemoryCache");
            throw null;
        }
    }

    /* renamed from: s */
    private final void m21052s() {
        DisneyTitleToolbar disneyTitleToolbar = (DisneyTitleToolbar) _$_findCachedViewById(C7946e.disneyToolbar);
        String str = "recyclerView";
        if (disneyTitleToolbar != null) {
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C7946e.recyclerView);
            Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView, str);
            C3848a aVar = this.f15319c0;
            if (aVar != null) {
                DisneyTitleToolbar.m18445a(disneyTitleToolbar, recyclerView, aVar, null, null, null, 0, new C6871b(this), 60, null);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("backgroundHelper");
                throw null;
            }
        }
        DisneyTitleToolbar disneyTitleToolbar2 = (DisneyTitleToolbar) _$_findCachedViewById(C7946e.disneyToolbar);
        if (disneyTitleToolbar2 != null) {
            disneyTitleToolbar2.mo17380c(mo19642q());
        }
        C6629d0 d0Var = this.f15317a0;
        if (d0Var != null) {
            CharSequence c = d0Var.mo19299c();
            if (!mo19642q()) {
                DisneyTitleToolbar disneyTitleToolbar3 = (DisneyTitleToolbar) _$_findCachedViewById(C7946e.disneyToolbar);
                if (disneyTitleToolbar3 != null) {
                    DisneyTitleToolbar.m18447a(disneyTitleToolbar3, (String) null, (Function0) new C6872c(this), 1, (Object) null);
                }
                DisneyTitleToolbar disneyTitleToolbar4 = (DisneyTitleToolbar) _$_findCachedViewById(C7946e.disneyToolbar);
                if (disneyTitleToolbar4 != null) {
                    DisneyTitleToolbar.m18446a(disneyTitleToolbar4, (CharSequence) null, c, 1, (Object) null);
                }
            }
            Button button = (Button) _$_findCachedViewById(C7946e.skipButton);
            if (button != null) {
                C4127b0.m14131b(button, !mo19642q());
            }
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C7946e.profileContainer);
            if (linearLayout != null) {
                C4127b0.m14131b(linearLayout, mo19642q());
            }
            Button button2 = (Button) _$_findCachedViewById(C7946e.skipButton);
            if (button2 != null) {
                button2.setOnClickListener(new C6873d(this));
            }
            Button button3 = (Button) _$_findCachedViewById(C7946e.skipButton);
            if (button3 != null) {
                button3.setContentDescription(c);
            }
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C7946e.recyclerView);
            Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView2, str);
            C11848c<C11863k> cVar = this.f15315Y;
            if (cVar != null) {
                RecyclerViewExtKt.m18800a(this, recyclerView2, cVar);
                ((RecyclerView) _$_findCachedViewById(C7946e.recyclerView)).setHasFixedSize(true);
                if (mo19642q()) {
                    C6626c0 X = mo19641p().mo19513X();
                    String j = X != null ? X.mo19364j() : null;
                    C6626c0 X2 = mo19641p().mo19513X();
                    CharSequence profileName = X2 != null ? X2.getProfileName() : null;
                    if (j != null) {
                        C6627c1 c1Var = this.f15313W;
                        if (c1Var != null) {
                            C6653e a = c1Var.mo19285a(j);
                            C6657f fVar = this.f15321e0;
                            if (fVar != null) {
                                fVar.mo19349a((ImageView) _$_findCachedViewById(C7946e.profileImageView), a);
                            } else {
                                Intrinsics.throwUninitializedPropertyAccessException("avatarImages");
                                throw null;
                            }
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("profilesMemoryCache");
                            throw null;
                        }
                    }
                    TextView textView = (TextView) _$_findCachedViewById(C7946e.profileNameText);
                    if (textView != null) {
                        textView.setText(profileName);
                        return;
                    }
                    return;
                }
                return;
            }
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("profileAccessibility");
        throw null;
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f15326j0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f15326j0 == null) {
            this.f15326j0 = new HashMap();
        }
        View view = (View) this.f15326j0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f15326j0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: o */
    public final C6882h mo19640o() {
        C6882h hVar = this.f15312V;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("chooseAvatarsViewModel");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C7738g.m22802a(this, C7948g.fragment_choose_avatar, viewGroup, false, 4, null);
    }

    public void onDestroyView() {
        this.f15322f0 = null;
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onStart() {
        super.onStart();
        C3454q qVar = this.f15311U;
        if (qVar != null) {
            qVar.mo12646a(this, new C6874e(this));
            C6882h hVar = this.f15312V;
            if (hVar != null) {
                C5755i.m18679a(this, hVar, null, null, new C6875f(this), 6, null);
                m21051r();
                return;
            }
            Intrinsics.throwUninitializedPropertyAccessException("chooseAvatarsViewModel");
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("collectionViewModel");
        throw null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m21052s();
        C11848c<C11863k> cVar = this.f15315Y;
        if (cVar != null) {
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C7946e.recyclerView);
            String str = "recyclerView";
            Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView, str);
            ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C7946e.progress);
            Intrinsics.checkReturnedValueIsNotNull((Object) progressBar, "progress");
            C3503a aVar = new C3503a(cVar, recyclerView, progressBar, null, null, null, 56, null);
            this.f15322f0 = aVar;
            RecyclerViewSnapScrollHelper recyclerViewSnapScrollHelper = this.f15318b0;
            if (recyclerViewSnapScrollHelper != null) {
                C0722m viewLifecycleOwner = getViewLifecycleOwner();
                Intrinsics.checkReturnedValueIsNotNull((Object) viewLifecycleOwner, "viewLifecycleOwner");
                RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C7946e.recyclerView);
                Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView2, str);
                recyclerViewSnapScrollHelper.mo17710a(viewLifecycleOwner, recyclerView2, (C5805c) new C5808c(null, 1, null));
                return;
            }
            Intrinsics.throwUninitializedPropertyAccessException("recyclerViewSnapScrollHelper");
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        throw null;
    }

    /* renamed from: p */
    public final C6780r1 mo19641p() {
        return (C6780r1) this.f15324h0.mo17776a(this, f15309k0[1]);
    }

    /* renamed from: q */
    public final boolean mo19642q() {
        return this.f15323g0.mo17732a(this, f15309k0[0]).booleanValue();
    }

    /* renamed from: a */
    public boolean mo12232a(int i) {
        View view = getView();
        View findFocus = view != null ? view.findFocus() : null;
        boolean z = i == 20 || i == 22 || i == 21;
        Context requireContext = requireContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) requireContext, "requireContext()");
        if (!C5837i.m18843e(requireContext) || findFocus == null) {
            return false;
        }
        if (findFocus.getId() != C7946e.skipButton || !z) {
            C3432o oVar = this.f15316Z;
            if (oVar != null) {
                boolean a = oVar.mo12605a(i, findFocus, false);
                if (!a) {
                    RecyclerViewSnapScrollHelper recyclerViewSnapScrollHelper = this.f15318b0;
                    if (recyclerViewSnapScrollHelper != null) {
                        RecyclerViewSnapScrollHelper.m18771a(recyclerViewSnapScrollHelper, i, findFocus, null, 4, null);
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("recyclerViewSnapScrollHelper");
                        throw null;
                    }
                }
                return a;
            }
            Intrinsics.throwUninitializedPropertyAccessException("focusHelper");
            throw null;
        }
        C5759b bVar = this.f15320d0;
        if (bVar != null) {
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C7946e.recyclerView);
            Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView, "recyclerView");
            View a2 = bVar.mo17645a(recyclerView);
            if (a2 != null) {
                return C5852n0.m18886a(a2, 0, 1, (Object) null);
            }
            return false;
        }
        Intrinsics.throwUninitializedPropertyAccessException("focusFinder");
        throw null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m21046a(com.bamtechmedia.dominguez.collections.C3454q.C3456b r8) {
        /*
            r7 = this;
            g.o.a.c<g.o.a.k> r0 = r7.f15315Y
            r1 = 0
            if (r0 == 0) goto L_0x00d9
            int r0 = r0.getItemCount()
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x000f
            r0 = 1
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            com.bamtechmedia.dominguez.collections.x r4 = r7.f15314X
            java.lang.String r5 = "presenter"
            if (r4 == 0) goto L_0x00d5
            com.bamtechmedia.dominguez.collections.x$a r6 = r7.f15322f0
            if (r6 == 0) goto L_0x00c9
            r4.mo12703a(r6, r8)
            boolean r4 = r7.f15325i0
            if (r4 == 0) goto L_0x002c
            int r4 = p163g.p201e.p203b.p330z.C7946e.recyclerView
            android.view.View r4 = r7._$_findCachedViewById(r4)
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            r4.scheduleLayoutAnimation()
        L_0x002c:
            com.bamtechmedia.dominguez.core.content.collections.a r4 = r8.mo12653a()
            if (r4 == 0) goto L_0x003d
            java.util.List r4 = r4.mo13343O()
            if (r4 == 0) goto L_0x003d
            boolean r4 = r4.isEmpty()
            goto L_0x003e
        L_0x003d:
            r4 = 1
        L_0x003e:
            r7.f15325i0 = r4
            int r4 = p163g.p201e.p203b.p330z.C7946e.skipButton
            android.view.View r4 = r7._$_findCachedViewById(r4)
            android.widget.Button r4 = (android.widget.Button) r4
            if (r4 == 0) goto L_0x0052
            boolean r6 = r8.mo12659f()
            r6 = r6 ^ r3
            r4.setEnabled(r6)
        L_0x0052:
            int r4 = p163g.p201e.p203b.p330z.C7946e.disneyToolbar
            android.view.View r4 = r7._$_findCachedViewById(r4)
            com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar r4 = (com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar) r4
            if (r4 == 0) goto L_0x0064
            boolean r6 = r8.mo12659f()
            r6 = r6 ^ r3
            r4.mo17378a(r6)
        L_0x0064:
            com.bamtechmedia.dominguez.profiles.v1.h r4 = r7.f15312V
            if (r4 == 0) goto L_0x00c3
            com.bamtechmedia.dominguez.collections.x r6 = r7.f15314X
            if (r6 == 0) goto L_0x00bf
            java.util.List r1 = r6.mo12702a(r8)
            r4.mo19647a(r1)
            android.content.Context r1 = r7.requireContext()
            java.lang.String r4 = "requireContext()"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r1, r4)
            boolean r1 = com.bamtechmedia.dominguez.core.utils.C5837i.m18843e(r1)
            if (r1 == 0) goto L_0x00be
            if (r0 == 0) goto L_0x009b
            int r8 = p163g.p201e.p203b.p330z.C7946e.recyclerView
            android.view.View r8 = r7._$_findCachedViewById(r8)
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            r8.mo3684i(r2)
            int r8 = p163g.p201e.p203b.p330z.C7946e.recyclerView
            android.view.View r8 = r7._$_findCachedViewById(r8)
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            r8.requestFocus()
            goto L_0x00be
        L_0x009b:
            boolean r8 = r8.mo12659f()
            if (r8 != 0) goto L_0x00be
            int r8 = p163g.p201e.p203b.p330z.C7946e.skipButton
            android.view.View r8 = r7._$_findCachedViewById(r8)
            android.widget.Button r8 = (android.widget.Button) r8
            if (r8 == 0) goto L_0x00be
            boolean r8 = r8.isFocusable()
            if (r8 != 0) goto L_0x00be
            int r8 = p163g.p201e.p203b.p330z.C7946e.skipButton
            android.view.View r8 = r7._$_findCachedViewById(r8)
            android.widget.Button r8 = (android.widget.Button) r8
            if (r8 == 0) goto L_0x00be
            r8.setFocusable(r3)
        L_0x00be:
            return
        L_0x00bf:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
            throw r1
        L_0x00c3:
            java.lang.String r8 = "chooseAvatarsViewModel"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
            throw r1
        L_0x00c9:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x00d5:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
            throw r1
        L_0x00d9:
            java.lang.String r8 = "adapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.profiles.p266v1.C6869b.m21046a(com.bamtechmedia.dominguez.collections.q$b):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m21049a(C6883a aVar) {
        m21050e(aVar.mo19650a());
        if (aVar.mo19651b()) {
            Context requireContext = requireContext();
            Intrinsics.checkReturnedValueIsNotNull((Object) requireContext, "requireContext()");
            if (!C5837i.m18843e(requireContext)) {
                RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C7946e.recyclerView);
                String str = "recyclerView";
                Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView, str);
                int childCount = recyclerView.getChildCount() - 1;
                RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C7946e.recyclerView);
                Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView2, str);
                C12775h a = C4121a0.m14117a(recyclerView2);
                int i = 0;
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i >= 0) {
                        View view = (View) next;
                        Iterator it2 = it;
                        long j = ((long) i) * 50;
                        C6876g gVar = r2;
                        C6876g gVar2 = new C6876g(i, this, childCount);
                        C3800a.m12829a(view, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0.0f, 10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 300, j, null, null, gVar, null, 184189, null);
                        it = it2;
                        i = i2;
                    } else {
                        C13180m.m40455c();
                        throw null;
                    }
                }
                return;
            }
            C6882h hVar = this.f15312V;
            if (hVar != null) {
                hVar.mo19649z();
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("chooseAvatarsViewModel");
                throw null;
            }
        }
    }
}
