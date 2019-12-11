package com.bamtechmedia.dominguez.collections.items;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0722m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0818u;
import com.bamtechmedia.dominguez.collections.p080o0.C3444j;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.C11863k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000b\"\b\b\u0000\u0010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u000b0\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0016\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\tX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/items/ShelfFragmentHelper;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "recyclerViews", "", "Landroidx/recyclerview/widget/RecyclerView;", "shelfAdapters", "", "", "Lcom/xwray/groupie/GroupAdapter;", "viewPoolMap", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "adapter", "T", "Lcom/xwray/groupie/ViewHolder;", "shelfId", "create", "Lkotlin/Function0;", "onDestroy", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onShelfRecyclerCreated", "recyclerView", "config", "Lcom/bamtechmedia/dominguez/collections/config/ContainerConfig;", "collectionsApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ShelfFragmentHelper.kt */
public final class ShelfFragmentHelper implements C0710d {

    /* renamed from: U */
    private final Map<String, C11848c<?>> f8393U = new LinkedHashMap();

    /* renamed from: V */
    private final Map<String, C0818u> f8394V = new LinkedHashMap();

    /* renamed from: W */
    private final Fragment f8395W;

    /* renamed from: c */
    private final Set<RecyclerView> f8396c = new LinkedHashSet();

    public ShelfFragmentHelper(Fragment fragment) {
        this.f8395W = fragment;
    }

    /* renamed from: a */
    public final <T extends C11863k> C11848c<?> mo12398a(String str, Function0<? extends C11848c<T>> function0) {
        Map<String, C11848c<?>> map = this.f8393U;
        Object obj = map.get(str);
        if (obj == null) {
            obj = (C11848c) function0.invoke();
            map.put(str, obj);
        }
        return (C11848c) obj;
    }

    /* renamed from: a */
    public /* synthetic */ void mo4126a(C0722m mVar) {
        C0708c.m3735d(this, mVar);
    }

    /* renamed from: b */
    public /* synthetic */ void mo4127b(C0722m mVar) {
        C0708c.m3732a(this, mVar);
    }

    /* renamed from: c */
    public /* synthetic */ void mo4128c(C0722m mVar) {
        C0708c.m3734c(this, mVar);
    }

    /* renamed from: d */
    public /* synthetic */ void mo4129d(C0722m mVar) {
        C0708c.m3737f(this, mVar);
    }

    /* renamed from: e */
    public void mo4130e(C0722m mVar) {
        for (String put : this.f8394V.keySet()) {
            this.f8394V.put(put, new C0818u());
        }
        this.f8394V.clear();
        for (RecyclerView adapter : this.f8396c) {
            adapter.setAdapter(null);
        }
        this.f8396c.clear();
    }

    /* renamed from: f */
    public /* synthetic */ void mo4131f(C0722m mVar) {
        C0708c.m3736e(this, mVar);
    }

    /* renamed from: a */
    public final void mo12399a(RecyclerView recyclerView, C3444j jVar) {
        if (this.f8395W.getView() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(jVar.mo12622c());
            sb.append('_');
            sb.append(jVar.mo12623d());
            sb.append('_');
            sb.append(jVar.mo12621b().mo13242X());
            String sb2 = sb.toString();
            Map<String, C0818u> map = this.f8394V;
            Object obj = map.get(sb2);
            if (obj == null) {
                obj = new C0818u();
                map.put(sb2, obj);
            }
            recyclerView.setRecycledViewPool((C0818u) obj);
            this.f8396c.add(recyclerView);
        }
    }
}
