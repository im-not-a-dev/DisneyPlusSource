package p163g.p201e.p203b.p316t;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bamtechmedia.dominguez.core.framework.C5755i;
import com.bamtechmedia.dominguez.core.utils.RecyclerViewExtKt;
import com.disney.disneyplus.R;
import java.util.Collection;
import java.util.HashMap;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p163g.p201e.p203b.p312q.C7700r;
import p163g.p201e.p203b.p316t.C7793s.C7794a;
import p163g.p201e.p412c.C10647a;
import p163g.p509o.p510a.C11847b;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.C11863k;
import p512h.p513c.p514k.C11890i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/options/OptionsTvFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/bamtechmedia/dominguez/globalnav/GlobalNavTvEnabled;", "()V", "adapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/ViewHolder;", "adapter$annotations", "getAdapter", "()Lcom/xwray/groupie/GroupAdapter;", "setAdapter", "(Lcom/xwray/groupie/GroupAdapter;)V", "optionsViewModel", "Lcom/bamtechmedia/dominguez/options/OptionsViewModel;", "getOptionsViewModel", "()Lcom/bamtechmedia/dominguez/options/OptionsViewModel;", "setOptionsViewModel", "(Lcom/bamtechmedia/dominguez/options/OptionsViewModel;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "", "onViewCreated", "view", "tv_prodGoogleRelease"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.t.l */
/* compiled from: OptionsTvFragment.kt */
public final class C7784l extends C11890i implements C7700r {

    /* renamed from: U */
    private C11848c<C11863k> f16862U = new C11848c<>();

    /* renamed from: V */
    public C7793s f16863V;

    /* renamed from: W */
    private HashMap f16864W;

    /* renamed from: g.e.b.t.l$a */
    /* compiled from: OptionsTvFragment.kt */
    static final class C7785a extends C12881k implements Function1<C7794a, C13145v> {

        /* renamed from: c */
        final /* synthetic */ C7784l f16865c;

        C7785a(C7784l lVar) {
            this.f16865c = lVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo20693a(C7794a aVar) {
            if (!aVar.mo20700a()) {
                this.f16865c.getAdapter().mo29963a((Collection<? extends C11847b>) aVar.mo20701b());
                ((RecyclerView) this.f16865c._$_findCachedViewById(C10647a.optionsList)).requestFocus();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20693a((C7794a) obj);
            return C13145v.f29587a;
        }
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f16864W;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f16864W == null) {
            this.f16864W = new HashMap();
        }
        View view = (View) this.f16864W.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f16864W.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final C11848c<C11863k> getAdapter() {
        return this.f16862U;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_options, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onStart() {
        super.onStart();
        C7793s sVar = this.f16863V;
        String str = "optionsViewModel";
        if (sVar != null) {
            C5755i.m18679a(this, sVar, null, null, new C7785a(this), 6, null);
            C7793s sVar2 = this.f16863V;
            if (sVar2 != null) {
                sVar2.mo20699y();
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(str);
                throw null;
            }
        } else {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            throw null;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C10647a.optionsList);
        Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView, "optionsList");
        RecyclerViewExtKt.m18800a(this, recyclerView, this.f16862U);
    }
}
