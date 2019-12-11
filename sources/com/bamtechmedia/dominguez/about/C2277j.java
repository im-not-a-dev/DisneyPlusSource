package com.bamtechmedia.dominguez.about;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.C0108i;
import androidx.fragment.app.C0530c;
import androidx.recyclerview.widget.RecyclerView;
import com.bamtechmedia.dominguez.about.p052r.p053i.C2331e;
import com.bamtechmedia.dominguez.core.utils.C5833g;
import com.bamtechmedia.dominguez.core.utils.RecyclerViewExtKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.C11863k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J&\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/about/JsonConfigFragment;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "()V", "adapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/ViewHolder;", "getTheme", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "Companion", "about_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.about.j */
/* compiled from: JsonConfigFragment.kt */
public final class C2277j extends C0108i {

    /* renamed from: V */
    public static final C2278a f6411V = new C2278a(null);

    /* renamed from: U */
    private HashMap f6412U;

    /* renamed from: c */
    private final C11848c<C11863k> f6413c = new C11848c<>();

    /* renamed from: com.bamtechmedia.dominguez.about.j$a */
    /* compiled from: JsonConfigFragment.kt */
    public static final class C2278a {
        private C2278a() {
        }

        /* renamed from: a */
        public final C0530c mo11324a(Map<String, ? extends Object> map) {
            C2277j jVar = new C2277j();
            Object[] array = C13177k0.m40416f(map).toArray(new Pair[0]);
            if (array != null) {
                Pair[] pairArr = (Pair[]) array;
                jVar.setArguments(C5833g.m18829a((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
                return jVar;
            }
            throw new C13142s("null cannot be cast to non-null type kotlin.Array<T>");
        }

        public /* synthetic */ C2278a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f6412U;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f6412U == null) {
            this.f6412U = new HashMap();
        }
        View view = (View) this.f6412U.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f6412U.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public int getTheme() {
        return C2286q.FullscreenDialog;
    }

    public void onCreate(Bundle bundle) {
        Collection collection;
        super.onCreate(bundle);
        C11848c<C11863k> cVar = this.f6413c;
        Bundle arguments = getArguments();
        if (arguments != null) {
            Set<String> keySet = arguments.keySet();
            if (keySet != null) {
                collection = new ArrayList(C13187p.m40525a((Iterable) keySet, 10));
                for (String str : keySet) {
                    Intrinsics.checkReturnedValueIsNotNull((Object) str, "it");
                    Bundle arguments2 = getArguments();
                    C2331e eVar = new C2331e(str, String.valueOf(arguments2 != null ? arguments2.get(str) : null), null, 4, null);
                    collection.add(eVar);
                }
                cVar.mo29963a(collection);
            }
        }
        collection = C13185o.m40513a();
        cVar.mo29963a(collection);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C2284o.fragment_json_config, viewGroup, false);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C2283n.config_recycler);
        Intrinsics.checkReturnedValueIsNotNull((Object) recyclerView, "config_recycler");
        RecyclerViewExtKt.m18800a(this, recyclerView, this.f6413c);
    }
}
