package com.bamtechmedia.dominguez.profiles.p268x1.p270h;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bamtechmedia.dominguez.core.design.widgets.DisneyTitleToolbar;
import com.bamtechmedia.dominguez.core.framework.C5755i;
import com.bamtechmedia.dominguez.core.utils.C5833g;
import com.bamtechmedia.dominguez.core.utils.C5839j;
import com.bamtechmedia.dominguez.core.utils.C5883w;
import com.bamtechmedia.dominguez.core.utils.RecyclerViewExtKt;
import com.bamtechmedia.dominguez.profiles.C6780r1;
import com.bamtechmedia.dominguez.profiles.p268x1.p270h.C6952c.C6954b;
import com.bamtechmedia.dominguez.profiles.p268x1.p270h.C6952c.C6954b.C6955a;
import com.bamtechmedia.dominguez.profiles.p268x1.p270h.C6952c.C6954b.C6956b;
import com.bamtechmedia.dominguez.profiles.p268x1.p270h.C6952c.C6957c;
import java.util.Collection;
import java.util.HashMap;
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
import kotlin.reflect.KProperty;
import p163g.p201e.p203b.p312q.C7717x;
import p163g.p201e.p203b.p314r.C7738g;
import p163g.p201e.p203b.p330z.C7946e;
import p163g.p201e.p203b.p330z.C7948g;
import p163g.p509o.p510a.C11847b;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.C11863k;
import p512h.p513c.p514k.C11890i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 42\u00020\u00012\u00020\u0002:\u00014B\u0005¢\u0006\u0002\u0010\u0003J&\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020-H\u0016J\u001a\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020%2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0015\u00100\u001a\u00020-2\u0006\u00101\u001a\u000202H\u0001¢\u0006\u0002\b3R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198FX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00065"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/language/uiselector/ChooseLanguageFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/bamtechmedia/dominguez/globalnav/HideNavMenu;", "()V", "itemListener", "Lcom/bamtechmedia/dominguez/profiles/language/uiselector/LanguageSelectionListener;", "getItemListener", "()Lcom/bamtechmedia/dominguez/profiles/language/uiselector/LanguageSelectionListener;", "setItemListener", "(Lcom/bamtechmedia/dominguez/profiles/language/uiselector/LanguageSelectionListener;)V", "languageItemFactory", "Lcom/bamtechmedia/dominguez/profiles/language/uiselector/LanguageItemFactory;", "getLanguageItemFactory", "()Lcom/bamtechmedia/dominguez/profiles/language/uiselector/LanguageItemFactory;", "setLanguageItemFactory", "(Lcom/bamtechmedia/dominguez/profiles/language/uiselector/LanguageItemFactory;)V", "languagesAdapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/ViewHolder;", "languagesAdapter$annotations", "getLanguagesAdapter$profiles_release", "()Lcom/xwray/groupie/GroupAdapter;", "setLanguagesAdapter$profiles_release", "(Lcom/xwray/groupie/GroupAdapter;)V", "tempProfile", "Lcom/bamtechmedia/dominguez/profiles/TempProfile;", "getTempProfile", "()Lcom/bamtechmedia/dominguez/profiles/TempProfile;", "tempProfile$delegate", "Lcom/bamtechmedia/dominguez/core/utils/ParcelableFragmentArgumentDelegate;", "viewModel", "Lcom/bamtechmedia/dominguez/profiles/language/uiselector/ChooseLanguageViewModel;", "getViewModel", "()Lcom/bamtechmedia/dominguez/profiles/language/uiselector/ChooseLanguageViewModel;", "setViewModel", "(Lcom/bamtechmedia/dominguez/profiles/language/uiselector/ChooseLanguageViewModel;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "", "onViewCreated", "view", "renderState", "state", "Lcom/bamtechmedia/dominguez/profiles/language/uiselector/ChooseLanguageViewModel$State;", "renderState$profiles_release", "Companion", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.x1.h.a */
/* compiled from: ChooseLanguageFragment.kt */
public final class C6947a extends C11890i implements C7717x {

    /* renamed from: a0 */
    static final /* synthetic */ KProperty[] f15450a0 = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(C6947a.class), "tempProfile", "getTempProfile()Lcom/bamtechmedia/dominguez/profiles/TempProfile;"))};

    /* renamed from: b0 */
    public static final C6948a f15451b0 = new C6948a(null);

    /* renamed from: U */
    public C6952c f15452U;

    /* renamed from: V */
    public C6959d f15453V;

    /* renamed from: W */
    public C6960e f15454W;

    /* renamed from: X */
    private final C5883w f15455X = C5839j.m18852a("choose_language_temp_profile", (Function0) null, 2, (Object) null);

    /* renamed from: Y */
    private C11848c<C11863k> f15456Y = new C11848c<>();

    /* renamed from: Z */
    private HashMap f15457Z;

    /* renamed from: com.bamtechmedia.dominguez.profiles.x1.h.a$a */
    /* compiled from: ChooseLanguageFragment.kt */
    public static final class C6948a {
        private C6948a() {
        }

        /* renamed from: a */
        public final C6947a mo19699a(C6780r1 r1Var) {
            C6947a aVar = new C6947a();
            aVar.setArguments(C5833g.m18829a(C12907r.m40244a("choose_language_temp_profile", r1Var)));
            return aVar;
        }

        public /* synthetic */ C6948a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.x1.h.a$b */
    /* compiled from: ChooseLanguageFragment.kt */
    static final class C6949b extends C12881k implements Function1<C6957c, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C6947a f15458c;

        C6949b(C6947a aVar) {
            this.f15458c = aVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo19700a(C6957c cVar) {
            this.f15458c.mo19697a(cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19700a((C6957c) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.x1.h.a$c */
    /* compiled from: ChooseLanguageFragment.kt */
    static final class C6950c extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C6947a f15459c;

        C6950c(C6947a aVar) {
            this.f15459c = aVar;
            super(0);
        }

        public final void invoke() {
            this.f15459c.requireActivity().onBackPressed();
        }
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f15457Z;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f15457Z == null) {
            this.f15457Z = new HashMap();
        }
        View view = (View) this.f15457Z.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f15457Z.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public final void mo19697a(C6957c cVar) {
        C6954b a = cVar.mo19704a();
        if (a instanceof C6955a) {
            C6959d dVar = this.f15453V;
            if (dVar != null) {
                C6955a aVar = (C6955a) a;
                C6960e eVar = this.f15454W;
                if (eVar != null) {
                    this.f15456Y.mo29963a((Collection<? extends C11847b>) dVar.mo19709a(aVar, eVar));
                    return;
                }
                C12880j.m40227c("itemListener");
                throw null;
            }
            C12880j.m40227c("languageItemFactory");
            throw null;
        } else if (a instanceof C6956b) {
            this.f15456Y.mo13700a(((C6956b) a).mo19703a()).notifyChanged(Boolean.valueOf(false));
        }
    }

    /* renamed from: o */
    public final C6780r1 mo19698o() {
        return (C6780r1) this.f15455X.mo17776a(this, f15450a0[0]);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C7738g.m22802a(this, C7948g.fragment_choose_language, viewGroup, false, 4, null);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onStart() {
        super.onStart();
        C6952c cVar = this.f15452U;
        if (cVar != null) {
            C5755i.m18679a(this, cVar, null, null, new C6949b(this), 6, null);
            return;
        }
        C12880j.m40227c("viewModel");
        throw null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C7946e.recyclerView);
        String str = "recyclerView";
        C12880j.m40222a((Object) recyclerView, str);
        RecyclerViewExtKt.m18800a(this, recyclerView, this.f15456Y);
        DisneyTitleToolbar disneyTitleToolbar = (DisneyTitleToolbar) _$_findCachedViewById(C7946e.toolbar);
        if (disneyTitleToolbar != null) {
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C7946e.recyclerView);
            C12880j.m40222a((Object) recyclerView2, str);
            DisneyTitleToolbar.m18445a(disneyTitleToolbar, recyclerView2, null, null, null, null, 0, new C6950c(this), 62, null);
        }
    }
}
