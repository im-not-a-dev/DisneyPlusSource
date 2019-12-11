package com.bamtechmedia.dominguez.about;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bamtechmedia.dominguez.about.C2262f.C2266d;
import com.bamtechmedia.dominguez.core.framework.C5741g;
import com.bamtechmedia.dominguez.core.utils.RecyclerViewExtKt;
import java.util.Collection;
import java.util.HashMap;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p203b.p314r.C7738g;
import p163g.p509o.p510a.C11847b;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.C11863k;
import p512h.p513c.p514k.C11890i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u001a\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0006\u0010\"\u001a\u00020\u001fR$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006#"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/about/AboutFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "adapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/ViewHolder;", "getAdapter", "()Lcom/xwray/groupie/GroupAdapter;", "setAdapter", "(Lcom/xwray/groupie/GroupAdapter;)V", "presenter", "Lcom/bamtechmedia/dominguez/about/AboutPresenter;", "getPresenter", "()Lcom/bamtechmedia/dominguez/about/AboutPresenter;", "setPresenter", "(Lcom/bamtechmedia/dominguez/about/AboutPresenter;)V", "viewModel", "Lcom/bamtechmedia/dominguez/about/AboutViewModel;", "getViewModel", "()Lcom/bamtechmedia/dominguez/about/AboutViewModel;", "setViewModel", "(Lcom/bamtechmedia/dominguez/about/AboutViewModel;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "", "onViewCreated", "view", "refreshItems", "about_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.about.d */
/* compiled from: AboutFragment.kt */
public final class C2258d extends C11890i {

    /* renamed from: U */
    public C2262f f6386U;

    /* renamed from: V */
    public AboutPresenter f6387V;

    /* renamed from: W */
    public C11848c<C11863k> f6388W;

    /* renamed from: X */
    private HashMap f6389X;

    /* renamed from: com.bamtechmedia.dominguez.about.d$a */
    /* compiled from: AboutFragment.kt */
    static final class C2259a extends C12881k implements Function1<C2266d, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C2258d f6390c;

        C2259a(C2258d dVar) {
            this.f6390c = dVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo11302a(C2266d dVar) {
            this.f6390c.getAdapter().mo29963a((Collection<? extends C11847b>) this.f6390c.mo11300o().mo11296a(dVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11302a((C2266d) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.about.d$b */
    /* compiled from: AboutFragment.kt */
    static final class C2260b implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C2258d f6391c;

        C2260b(C2258d dVar) {
            this.f6391c = dVar;
        }

        public final void onClick(View view) {
            this.f6391c.requireActivity().onBackPressed();
        }
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f6389X;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f6389X == null) {
            this.f6389X = new HashMap();
        }
        View view = (View) this.f6389X.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f6389X.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final C11848c<C11863k> getAdapter() {
        C11848c<C11863k> cVar = this.f6388W;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        throw null;
    }

    /* renamed from: o */
    public final AboutPresenter mo11300o() {
        AboutPresenter aboutPresenter = this.f6387V;
        if (aboutPresenter != null) {
            return aboutPresenter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C7738g.m22801a(this, C2284o.fragment_about, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onStart() {
        super.onStart();
        C2262f fVar = this.f6386U;
        if (fVar != null) {
            C5741g.observeInLifecycle$default(fVar, this, null, null, new C2259a(this), 6, null);
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        throw null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(C2283n.backButton);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C2260b(this));
        }
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C2283n.aboutRecyclerView);
        Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView, "aboutRecyclerView");
        C11848c<C11863k> cVar = this.f6388W;
        if (cVar != null) {
            RecyclerViewExtKt.m18800a(this, recyclerView, cVar);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            throw null;
        }
    }

    /* renamed from: p */
    public final void mo11301p() {
        C2262f fVar = this.f6386U;
        if (fVar != null) {
            C2266d dVar = (C2266d) fVar.getCurrentState();
            if (dVar != null) {
                C11848c<C11863k> cVar = this.f6388W;
                if (cVar != null) {
                    AboutPresenter aboutPresenter = this.f6387V;
                    if (aboutPresenter != null) {
                        cVar.mo29963a((Collection<? extends C11847b>) aboutPresenter.mo11296a(dVar));
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("presenter");
                        throw null;
                    }
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    throw null;
                }
            }
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            throw null;
        }
    }
}
