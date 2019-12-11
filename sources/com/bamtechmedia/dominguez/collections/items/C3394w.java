package com.bamtechmedia.dominguez.collections.items;

import android.view.View;
import com.bamtechmedia.dominguez.collections.C3416k0;
import com.bamtechmedia.dominguez.collections.C3416k0.C3417a;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u001c\u0010\u0012\u001a\u00020\u0011*\u00020\u00132\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/items/ShelfItemSessionHelper;", "", "shelfItemSession", "Lcom/bamtechmedia/dominguez/collections/ShelfItemSession;", "(Lcom/bamtechmedia/dominguez/collections/ShelfItemSession;)V", "clearCollectionFocusItem", "", "restoreCollectionFocusPosition", "itemView", "Landroid/view/View;", "shelfId", "", "asset", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "setCollectionFocusPosition", "setHeroAutoPagingEnabled", "enabled", "", "isSameAs", "Lcom/bamtechmedia/dominguez/collections/ShelfItemSession$CollectionFocusItem;", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.items.w */
/* compiled from: ShelfItemSessionHelper.kt */
public final class C3394w {

    /* renamed from: a */
    private final C3416k0 f8573a;

    /* renamed from: com.bamtechmedia.dominguez.collections.items.w$a */
    /* compiled from: ShelfItemSessionHelper.kt */
    static final class C3395a implements Runnable {

        /* renamed from: U */
        final /* synthetic */ View f8574U;

        /* renamed from: c */
        final /* synthetic */ C3394w f8575c;

        C3395a(C3394w wVar, View view) {
            this.f8575c = wVar;
            this.f8574U = view;
        }

        public final void run() {
            this.f8574U.requestFocus();
            this.f8575c.m11634a();
        }
    }

    public C3394w(C3416k0 k0Var) {
        this.f8573a = k0Var;
    }

    /* renamed from: a */
    public final void mo12549a(String str, C3626b bVar) {
        this.f8573a.mo12580a(new C3417a(str, bVar));
    }

    /* renamed from: a */
    public final void mo12548a(View view, String str, C3626b bVar) {
        C3417a t = this.f8573a.mo12378t();
        if (t != null && m11636a(t, str, bVar)) {
            view.post(new C3395a(this, view));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m11634a() {
        this.f8573a.mo12580a((C3417a) null);
    }

    /* renamed from: a */
    private final boolean m11636a(C3417a aVar, String str, C3626b bVar) {
        C3626b a = aVar.mo12583a();
        return a != null && a.mo12848a(bVar) && Intrinsics.areEqual((Object) aVar.mo12584b(), (Object) str);
    }
}
