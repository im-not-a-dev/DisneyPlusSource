package com.bamtechmedia.dominguez.collections.items;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0808o;
import androidx.recyclerview.widget.RecyclerView.C0817t;
import com.bamtechmedia.dominguez.collections.C3320f;
import com.bamtechmedia.dominguez.collections.C3416k0;
import com.bamtechmedia.dominguez.collections.C3416k0.C3417a;
import com.bamtechmedia.dominguez.collections.C3416k0.C3418b;
import com.bamtechmedia.dominguez.collections.p078m0.C3424c;
import com.bamtechmedia.dominguez.collections.p080o0.C3441g;
import com.bamtechmedia.dominguez.collections.p080o0.C3444j;
import com.bamtechmedia.dominguez.collections.p080o0.C3451p;
import com.bamtechmedia.dominguez.collections.p081ui.ShelfItemRecyclerView;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.containers.ContainerType;
import com.bamtechmedia.dominguez.core.content.paging.C3700c;
import com.bamtechmedia.dominguez.core.content.paging.C3702e;
import com.bamtechmedia.dominguez.core.content.sets.C3788m;
import com.bamtechmedia.dominguez.core.utils.C5825e;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.RecyclerViewExtKt;
import java.util.List;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.C11853e;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0005\b&\u0018\u0000 d2\u00020\u0001:\u0002cdB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00132\u0006\u00109\u001a\u00020:H\u0002J\u0010\u0010;\u001a\u0002072\u0006\u0010<\u001a\u00020=H\u0002J\u0018\u0010>\u001a\u0002072\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH\u0016J&\u0010>\u001a\u0002072\u0006\u0010C\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020F0EH\u0017J\b\u0010G\u001a\u00020\u0013H\u0016J\b\u0010H\u001a\u00020\u0013H\u0016J\u0010\u0010I\u001a\u00020@2\u0006\u0010J\u001a\u00020KH\u0016J\u0010\u0010L\u001a\u0002072\u0006\u0010<\u001a\u00020=H\u0002J\u0018\u0010M\u001a\u0004\u0018\u00010F2\f\u0010N\u001a\b\u0012\u0002\b\u0003\u0018\u00010OH\u0016J\b\u0010P\u001a\u00020BH\u0016J\u0017\u0010Q\u001a\u00020B2\b\u0010R\u001a\u0004\u0018\u00010SH\u0001¢\u0006\u0002\bTJ\u0010\u0010U\u001a\u00020B2\u0006\u0010<\u001a\u00020=H\u0002J\b\u0010V\u001a\u00020\u0013H\u0002J\u0016\u0010W\u001a\u00020\u00132\f\u0010X\u001a\b\u0012\u0002\b\u0003\u0018\u00010OH\u0016J\u000e\u0010Y\u001a\b\u0012\u0004\u0012\u00020@0ZH\u0014J\u0010\u0010[\u001a\u0002072\u0006\u0010A\u001a\u00020BH\u0016J\u0018\u0010\\\u001a\u0002072\u0006\u0010]\u001a\u00020=2\u0006\u00108\u001a\u00020\u0013H\u0002J\u001c\u0010^\u001a\u0002072\u0006\u0010A\u001a\u00020B2\n\b\u0002\u0010_\u001a\u0004\u0018\u00010`H\u0002J\u0010\u0010a\u001a\u0002072\u0006\u0010?\u001a\u00020@H\u0016J\u0014\u0010b\u001a\u000207*\u00020@2\u0006\u0010A\u001a\u00020BH\u0002R\u0014\u0010\u0005\u001a\u00020\u00068DX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8DX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8DX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001d8DX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010!8DX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\u00020)8DX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020-8DX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00100\u001a\u0002018DX\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0016\u00104\u001a\u0004\u0018\u00010-8DX\u0004¢\u0006\u0006\u001a\u0004\b5\u0010/¨\u0006e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/items/ShelfItem;", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "parameters", "Lcom/bamtechmedia/dominguez/collections/items/ShelfItemParameters;", "(Lcom/bamtechmedia/dominguez/collections/items/ShelfItemParameters;)V", "analytics", "Lcom/bamtechmedia/dominguez/collections/CollectionAnalytics;", "getAnalytics", "()Lcom/bamtechmedia/dominguez/collections/CollectionAnalytics;", "assets", "Lcom/bamtechmedia/dominguez/core/content/paging/PagedList;", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "getAssets", "()Lcom/bamtechmedia/dominguez/core/content/paging/PagedList;", "bindListener", "Lcom/bamtechmedia/dominguez/collections/items/ShelfBindListener;", "getBindListener", "()Lcom/bamtechmedia/dominguez/collections/items/ShelfBindListener;", "boundItems", "", "buildVersionProvider", "Lcom/bamtechmedia/dominguez/core/utils/BuildVersionProvider;", "getBuildVersionProvider", "()Lcom/bamtechmedia/dominguez/core/utils/BuildVersionProvider;", "collectionsAppConfig", "Lcom/bamtechmedia/dominguez/collections/config/CollectionsAppConfig;", "getCollectionsAppConfig", "()Lcom/bamtechmedia/dominguez/collections/config/CollectionsAppConfig;", "config", "Lcom/bamtechmedia/dominguez/collections/config/ContainerConfig;", "getConfig", "()Lcom/bamtechmedia/dominguez/collections/config/ContainerConfig;", "items", "", "getItems", "()Ljava/util/List;", "pagingListener", "Lcom/bamtechmedia/dominguez/core/content/paging/PagingListener;", "getPagingListener", "()Lcom/bamtechmedia/dominguez/core/content/paging/PagingListener;", "shelfFragmentHelper", "Lcom/bamtechmedia/dominguez/collections/items/ShelfFragmentHelper;", "getShelfFragmentHelper", "()Lcom/bamtechmedia/dominguez/collections/items/ShelfFragmentHelper;", "shelfId", "", "getShelfId", "()Ljava/lang/String;", "shelfItemSession", "Lcom/bamtechmedia/dominguez/collections/ShelfItemSession;", "getShelfItemSession", "()Lcom/bamtechmedia/dominguez/collections/ShelfItemSession;", "shelfTitle", "getShelfTitle", "applyFirstPosition", "", "isTelevision", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "attachShelfScrollListener", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "bind", "viewHolder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "position", "", "holder", "payloads", "", "", "containerTitleVisible", "containerTopPaddingEnabled", "createViewHolder", "itemView", "Landroid/view/View;", "detachShelfScrollListener", "getChangePayload", "newItem", "Lcom/xwray/groupie/Item;", "getFirstItem", "getFocusedAssetPosition", "collectionFocusItem", "Lcom/bamtechmedia/dominguez/collections/ShelfItemSession$CollectionFocusItem;", "getFocusedAssetPosition$collectionsApi_release", "getHeroPosition", "isHeroContainer", "isSameAs", "other", "onCreateAdapter", "Lcom/xwray/groupie/GroupAdapter;", "restoreIndicator", "restoreScrollPosition", "rv", "saveItemPosition", "location", "", "unbind", "applyConfigChanges", "ChangePayload", "Companion", "collectionsApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.items.s */
/* compiled from: ShelfItem.kt */
public abstract class C3384s extends C11866a {

    /* renamed from: U */
    private final C5825e f8531U = this.f8534X.mo12534e();

    /* renamed from: V */
    private final C3441g f8532V = this.f8534X.mo12536f();

    /* renamed from: W */
    private boolean f8533W;

    /* renamed from: X */
    private final C3392v f8534X;

    /* renamed from: c */
    private final C3702e f8535c = this.f8534X.mo12540i();

    /* renamed from: com.bamtechmedia.dominguez.collections.items.s$a */
    /* compiled from: ShelfItem.kt */
    private static final class C3385a {

        /* renamed from: a */
        private final boolean f8536a;

        /* renamed from: b */
        private final boolean f8537b;

        /* renamed from: c */
        private final boolean f8538c;

        public C3385a(boolean z, boolean z2, boolean z3) {
            this.f8536a = z;
            this.f8537b = z2;
            this.f8538c = z3;
        }

        /* renamed from: a */
        public final boolean mo12521a() {
            return this.f8538c;
        }

        /* renamed from: b */
        public final boolean mo12522b() {
            return this.f8537b;
        }

        /* renamed from: c */
        public final boolean mo12523c() {
            return this.f8536a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C3385a) {
                    C3385a aVar = (C3385a) obj;
                    if (this.f8536a == aVar.f8536a) {
                        if (this.f8537b == aVar.f8537b) {
                            if (this.f8538c == aVar.f8538c) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.f8536a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = (z ? 1 : 0) * true;
            boolean z2 = this.f8537b;
            if (z2) {
                z2 = true;
            }
            int i3 = (i2 + (z2 ? 1 : 0)) * 31;
            boolean z3 = this.f8538c;
            if (!z3) {
                i = z3;
            }
            return i3 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ChangePayload(titleChanged=");
            sb.append(this.f8536a);
            sb.append(", itemsWereAdded=");
            sb.append(this.f8537b);
            sb.append(", configHasChanged=");
            sb.append(this.f8538c);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.items.s$b */
    /* compiled from: ShelfItem.kt */
    public static final class C3386b {
        private C3386b() {
        }

        public /* synthetic */ C3386b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.items.s$c */
    /* compiled from: ShelfItem.kt */
    static final class C3387c implements Runnable {

        /* renamed from: c */
        final /* synthetic */ View f8539c;

        C3387c(View view) {
            this.f8539c = view;
        }

        public final void run() {
            this.f8539c.requestFocus();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.items.s$d */
    /* compiled from: ShelfItem.kt */
    public static final class C3388d extends C0817t {

        /* renamed from: a */
        private int f8540a;

        /* renamed from: b */
        final /* synthetic */ C3384s f8541b;

        C3388d(C3384s sVar) {
            this.f8541b = sVar;
            this.f8540a = Math.max(sVar.mo12499h() - 1, 0);
        }

        /* renamed from: a */
        public void mo4783a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                C0808o layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    int H = linearLayoutManager.mo4318H();
                    int I = linearLayoutManager.mo4319I();
                    this.f8541b.mo12510c().mo12371a(this.f8541b.mo12514g(), this.f8540a, I);
                    this.f8540a = I;
                    int[] iArr = new int[2];
                    View c = linearLayoutManager.mo4337c(H);
                    if (c != null) {
                        c.getLocationOnScreen(iArr);
                    }
                    Context context = recyclerView.getContext();
                    Intrinsics.checkReturnedValueIsNotNull((Object) context, "recyclerView.context");
                    boolean e = C5837i.m18843e(context);
                    if (this.f8541b.m11591o() && e) {
                        int a = this.f8541b.m11590c(recyclerView);
                        if (a != this.f8541b.mo12499h()) {
                            C3384s.m11585a(this.f8541b, a, null, 2, null);
                        }
                    } else if (this.f8541b.m11591o()) {
                        C3384s sVar = this.f8541b;
                        C3384s.m11585a(sVar, sVar.m11590c(recyclerView), null, 2, null);
                    } else if (e) {
                        C3384s.m11585a(this.f8541b, H, null, 2, null);
                    } else {
                        this.f8541b.m11581a(H, iArr);
                    }
                } else {
                    throw new C13142s("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                }
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.items.s$e */
    /* compiled from: ShelfItem.kt */
    static final class C3389e extends C12881k implements Function0<C11848c<C11867b>> {

        /* renamed from: c */
        final /* synthetic */ C3384s f8542c;

        C3389e(C3384s sVar) {
            this.f8542c = sVar;
            super(0);
        }

        public final C11848c<C11867b> invoke() {
            return this.f8542c.mo12501n();
        }
    }

    static {
        new C3386b(null);
    }

    public C3384s(C3392v vVar) {
        super(vVar.mo12545n());
        this.f8534X = vVar;
    }

    /* renamed from: b */
    private final void m11589b(RecyclerView recyclerView) {
        Object tag = recyclerView.getTag(C3424c.tagShelfScrollListener);
        if (!(tag instanceof C0817t)) {
            tag = null;
        }
        C0817t tVar = (C0817t) tag;
        if (tVar != null) {
            recyclerView.mo4404b(tVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final boolean m11591o() {
        return this.f8534X.mo12537g().mo12622c() == ContainerType.HeroContainer || this.f8534X.mo12537g().mo12622c() == ContainerType.HeroFullBleedContainer;
    }

    /* renamed from: a */
    public void mo12497a(int i) {
    }

    /* renamed from: b */
    public boolean mo12492b() {
        return true;
    }

    public void bind(C11867b bVar, int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C3320f mo12510c() {
        return this.f8534X.mo12531b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C3700c<C3626b> mo12511d() {
        return this.f8534X.mo12532c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C3374o mo12512e() {
        return this.f8534X.mo12533d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C3441g mo12513f() {
        return this.f8532V;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C3444j mo12514g() {
        return this.f8534X.mo12537g();
    }

    public Object getChangePayload(C11853e<?> eVar) {
        C3700c d = mo12511d();
        if (eVar != null) {
            C3384s sVar = (C3384s) eVar;
            return new C3385a(!Intrinsics.areEqual((Object) mo12519m(), (Object) sVar.mo12519m()), !Intrinsics.areEqual((Object) d, (Object) sVar.mo12511d()), !Intrinsics.areEqual((Object) mo12514g(), (Object) sVar.mo12514g()));
        }
        throw new C13142s("null cannot be cast to non-null type com.bamtechmedia.dominguez.collections.items.ShelfItem");
    }

    /* renamed from: h */
    public int mo12499h() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final List<C11866a> mo12515i() {
        return this.f8534X.mo12538h();
    }

    public boolean isSameAs(C11853e<?> eVar) {
        return (eVar instanceof C3384s) && Intrinsics.areEqual((Object) ((C3384s) eVar).mo12517k(), (Object) mo12517k());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final ShelfFragmentHelper mo12516j() {
        return this.f8534X.mo12541j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final String mo12517k() {
        return this.f8534X.mo12542k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final C3416k0 mo12518l() {
        return this.f8534X.mo12543l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final String mo12519m() {
        return this.f8534X.mo12544m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C11848c<C11867b> mo12501n() {
        Object obj = this.f8534X.mo12530a().get();
        Intrinsics.checkReturnedValueIsNotNull(obj, "parameters.adapterProvider.get()");
        return (C11848c) obj;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final int m11590c(RecyclerView recyclerView) {
        C0808o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            int H = ((LinearLayoutManager) layoutManager).mo4318H();
            return H < 0 ? mo12499h() : H;
        }
        throw new C13142s("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
    }

    public C11867b createViewHolder(View view) {
        C11867b createViewHolder = super.createViewHolder(view);
        ShelfItemRecyclerView shelfItemRecyclerView = (ShelfItemRecyclerView) createViewHolder.mo20994a().findViewById(C3424c.shelfRecyclerView);
        String str = "holder.shelfRecyclerView";
        Intrinsics.checkReturnedValueIsNotNull((Object) shelfItemRecyclerView, str);
        C0808o layoutManager = shelfItemRecyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager != null) {
            linearLayoutManager.mo4345k(mo12514g().mo12637p() + 1);
        }
        ShelfFragmentHelper j = mo12516j();
        ShelfItemRecyclerView shelfItemRecyclerView2 = (ShelfItemRecyclerView) createViewHolder.mo20994a().findViewById(C3424c.shelfRecyclerView);
        Intrinsics.checkReturnedValueIsNotNull((Object) shelfItemRecyclerView2, str);
        j.mo12399a((RecyclerView) shelfItemRecyclerView2, mo12514g());
        return createViewHolder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0176, code lost:
        if (r9 != false) goto L_0x0178;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bind(p163g.p509o.p510a.p511l.C11867b r8, int r9, java.util.List<java.lang.Object> r10) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ShelfItem bind: "
            r0.append(r1)
            java.lang.String r1 = r7.mo12519m()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.os.Trace.beginSection(r0)
            super.bind(r8, r9, r10)
            android.view.View r0 = r8.mo20994a()
            int r1 = com.bamtechmedia.dominguez.collections.p078m0.C3424c.shelfRecyclerView
            android.view.View r0 = r0.findViewById(r1)
            com.bamtechmedia.dominguez.collections.ui.ShelfItemRecyclerView r0 = (com.bamtechmedia.dominguez.collections.p081ui.ShelfItemRecyclerView) r0
            java.lang.String r1 = "holder.shelfRecyclerView"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r1)
            r7.m11589b(r0)
            android.view.View r0 = r8.mo20994a()
            int r2 = com.bamtechmedia.dominguez.collections.p078m0.C3424c.shelfRecyclerView
            android.view.View r0 = r0.findViewById(r2)
            com.bamtechmedia.dominguez.collections.ui.ShelfItemRecyclerView r0 = (com.bamtechmedia.dominguez.collections.p081ui.ShelfItemRecyclerView) r0
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r1)
            r7.m11582a(r0)
            com.bamtechmedia.dominguez.collections.items.ShelfFragmentHelper r0 = r7.mo12516j()
            java.lang.String r2 = r7.mo12517k()
            com.bamtechmedia.dominguez.collections.items.s$e r3 = new com.bamtechmedia.dominguez.collections.items.s$e
            r3.<init>(r7)
            g.o.a.c r0 = r0.mo12398a(r2, r3)
            boolean r2 = r7.f8533W
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x009b
            boolean r2 = r10.isEmpty()
            if (r2 != 0) goto L_0x008f
            boolean r2 = r10 instanceof java.util.Collection
            if (r2 == 0) goto L_0x006a
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto L_0x006a
        L_0x0068:
            r2 = 0
            goto L_0x008a
        L_0x006a:
            java.util.Iterator r2 = r10.iterator()
        L_0x006e:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0068
            java.lang.Object r5 = r2.next()
            boolean r6 = r5 instanceof com.bamtechmedia.dominguez.collections.items.C3384s.C3385a
            if (r6 == 0) goto L_0x0086
            com.bamtechmedia.dominguez.collections.items.s$a r5 = (com.bamtechmedia.dominguez.collections.items.C3384s.C3385a) r5
            boolean r5 = r5.mo12522b()
            if (r5 == 0) goto L_0x0086
            r5 = 1
            goto L_0x0087
        L_0x0086:
            r5 = 0
        L_0x0087:
            if (r5 == 0) goto L_0x006e
            r2 = 1
        L_0x008a:
            if (r2 == 0) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            r2 = 0
            goto L_0x0090
        L_0x008f:
            r2 = 1
        L_0x0090:
            if (r2 == 0) goto L_0x009b
            java.util.List r2 = r7.mo12515i()
            r0.mo29963a(r2)
            r7.f8533W = r4
        L_0x009b:
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto L_0x00b0
            android.view.View r2 = r8.mo20994a()
            int r5 = com.bamtechmedia.dominguez.collections.p078m0.C3424c.shelfRecyclerView
            android.view.View r2 = r2.findViewById(r5)
            com.bamtechmedia.dominguez.collections.ui.ShelfItemRecyclerView r2 = (com.bamtechmedia.dominguez.collections.p081ui.ShelfItemRecyclerView) r2
            r2.mo4380a(r0, r4)
        L_0x00b0:
            android.view.View r0 = r8.mo20994a()
            int r2 = com.bamtechmedia.dominguez.collections.p078m0.C3424c.shelfRecyclerView
            android.view.View r0 = r0.findViewById(r2)
            com.bamtechmedia.dominguez.collections.ui.ShelfItemRecyclerView r0 = (com.bamtechmedia.dominguez.collections.p081ui.ShelfItemRecyclerView) r0
            int r2 = com.bamtechmedia.dominguez.collections.p078m0.C3424c.focusHelperShelfRecyclerView
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            r0.setTag(r2, r5)
            com.bamtechmedia.dominguez.collections.items.o r0 = r7.mo12512e()
            com.bamtechmedia.dominguez.core.content.paging.c r2 = r7.mo12511d()
            r0.mo12479a(r2)
            com.bamtechmedia.dominguez.core.content.paging.e r0 = r7.f8535c
            boolean r2 = r0 instanceof com.bamtechmedia.dominguez.core.content.paging.C3704g
            if (r2 == 0) goto L_0x00df
            com.bamtechmedia.dominguez.core.content.paging.g r0 = (com.bamtechmedia.dominguez.core.content.paging.C3704g) r0
            java.lang.String r2 = r7.mo12517k()
            r0.mo13476a(r2)
        L_0x00df:
            android.view.View r0 = r8.mo20994a()
            int r2 = com.bamtechmedia.dominguez.collections.p078m0.C3424c.shelfRecyclerView
            android.view.View r0 = r0.findViewById(r2)
            com.bamtechmedia.dominguez.collections.ui.ShelfItemRecyclerView r0 = (com.bamtechmedia.dominguez.collections.p081ui.ShelfItemRecyclerView) r0
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r1)
            android.view.View r1 = r8.mo30014c()
            java.lang.String r2 = "holder.root"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r1, r2)
            android.content.Context r1 = r1.getContext()
            java.lang.String r2 = "holder.root.context"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r1, r2)
            boolean r1 = com.bamtechmedia.dominguez.core.utils.C5837i.m18843e(r1)
            r7.m11583a(r0, r1)
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x013e
            boolean r0 = r10 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0119
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x0119
        L_0x0117:
            r0 = 0
            goto L_0x0139
        L_0x0119:
            java.util.Iterator r0 = r10.iterator()
        L_0x011d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0117
            java.lang.Object r1 = r0.next()
            boolean r2 = r1 instanceof com.bamtechmedia.dominguez.collections.items.C3384s.C3385a
            if (r2 == 0) goto L_0x0135
            com.bamtechmedia.dominguez.collections.items.s$a r1 = (com.bamtechmedia.dominguez.collections.items.C3384s.C3385a) r1
            boolean r1 = r1.mo12521a()
            if (r1 == 0) goto L_0x0135
            r1 = 1
            goto L_0x0136
        L_0x0135:
            r1 = 0
        L_0x0136:
            if (r1 == 0) goto L_0x011d
            r0 = 1
        L_0x0139:
            if (r0 == 0) goto L_0x013c
            goto L_0x013e
        L_0x013c:
            r0 = 0
            goto L_0x013f
        L_0x013e:
            r0 = 1
        L_0x013f:
            if (r0 == 0) goto L_0x0144
            r7.m11586a(r8, r9)
        L_0x0144:
            boolean r9 = r10.isEmpty()
            if (r9 != 0) goto L_0x0178
            boolean r9 = r10 instanceof java.util.Collection
            if (r9 == 0) goto L_0x0156
            boolean r9 = r10.isEmpty()
            if (r9 == 0) goto L_0x0156
        L_0x0154:
            r9 = 0
            goto L_0x0176
        L_0x0156:
            java.util.Iterator r9 = r10.iterator()
        L_0x015a:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0154
            java.lang.Object r10 = r9.next()
            boolean r0 = r10 instanceof com.bamtechmedia.dominguez.collections.items.C3384s.C3385a
            if (r0 == 0) goto L_0x0172
            com.bamtechmedia.dominguez.collections.items.s$a r10 = (com.bamtechmedia.dominguez.collections.items.C3384s.C3385a) r10
            boolean r10 = r10.mo12523c()
            if (r10 == 0) goto L_0x0172
            r10 = 1
            goto L_0x0173
        L_0x0172:
            r10 = 0
        L_0x0173:
            if (r10 == 0) goto L_0x015a
            r9 = 1
        L_0x0176:
            if (r9 == 0) goto L_0x0179
        L_0x0178:
            r3 = 1
        L_0x0179:
            if (r3 == 0) goto L_0x0196
            android.view.View r8 = r8.itemView
            java.lang.String r9 = "holder.itemView"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r8, r9)
            int r9 = com.bamtechmedia.dominguez.collections.p078m0.C3424c.shelfTitle
            android.view.View r8 = r8.findViewById(r9)
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.lang.String r9 = "holder.itemView.shelfTitle"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r8, r9)
            java.lang.String r9 = r7.mo12519m()
            r8.setText(r9)
        L_0x0196:
            android.os.Trace.endSection()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.collections.items.C3384s.bind(g.o.a.l.b, int, java.util.List):void");
    }

    /* renamed from: a */
    public void unbind(C11867b bVar) {
        ShelfItemRecyclerView shelfItemRecyclerView = (ShelfItemRecyclerView) bVar.mo20994a().findViewById(C3424c.shelfRecyclerView);
        String str = "viewHolder.shelfRecyclerView";
        Intrinsics.checkReturnedValueIsNotNull((Object) shelfItemRecyclerView, str);
        m11589b(shelfItemRecyclerView);
        ShelfItemRecyclerView shelfItemRecyclerView2 = (ShelfItemRecyclerView) bVar.mo20994a().findViewById(C3424c.shelfRecyclerView);
        Intrinsics.checkReturnedValueIsNotNull((Object) shelfItemRecyclerView2, str);
        shelfItemRecyclerView2.setAdapter(null);
        super.unbind(bVar);
    }

    /* renamed from: a */
    private final void m11586a(C11867b bVar, int i) {
        int i2;
        View view = bVar.itemView;
        String str = "itemView";
        Intrinsics.checkReturnedValueIsNotNull((Object) view, str);
        Context context = view.getContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) context, "itemView.context");
        boolean e = C5837i.m18843e(context);
        int n = mo12514g().mo12635n() - (mo12514g().mo12630i() / 2);
        ShelfItemRecyclerView shelfItemRecyclerView = (ShelfItemRecyclerView) bVar.mo20994a().findViewById(C3424c.shelfRecyclerView);
        String str2 = "shelfRecyclerView";
        Intrinsics.checkReturnedValueIsNotNull((Object) shelfItemRecyclerView, str2);
        int e2 = mo12514g().mo12624e() - (mo12514g().mo12630i() / 2);
        int i3 = 0;
        if (e) {
            i2 = 0;
        } else if (i != mo12499h() || !mo12514g().mo12620a(C3788m.FULL_TOP_MARGIN)) {
            i2 = mo12514g().mo12630i() / 2;
        } else {
            i2 = mo12514g().mo12630i();
        }
        int i4 = mo12514g().mo12630i();
        if (!e) {
            i4 /= 2;
        }
        shelfItemRecyclerView.setPaddingRelative(n, i2, e2, i4);
        if (this.f8531U.mo17733a() >= 28) {
            ((ShelfItemRecyclerView) bVar.mo20994a().findViewById(C3424c.shelfRecyclerView)).setFadingEdgeLength(n);
            ShelfItemRecyclerView shelfItemRecyclerView2 = (ShelfItemRecyclerView) bVar.mo20994a().findViewById(C3424c.shelfRecyclerView);
            Intrinsics.checkReturnedValueIsNotNull((Object) shelfItemRecyclerView2, str2);
            shelfItemRecyclerView2.setHorizontalFadingEdgeEnabled(e);
        }
        View view2 = bVar.itemView;
        Intrinsics.checkReturnedValueIsNotNull((Object) view2, str);
        ((ShelfContainerLayout) view2.findViewById(C3424c.shelfContainer)).mo12395a(mo12492b(), mo12514g().mo12630i(), mo12514g().mo12638q(), i);
        View view3 = bVar.itemView;
        Intrinsics.checkReturnedValueIsNotNull((Object) view3, str);
        TextView textView = (TextView) view3.findViewById(C3424c.shelfTitle);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, "itemView.shelfTitle");
        if (!mo12491a()) {
            i3 = 8;
        }
        textView.setVisibility(i3);
    }

    /* renamed from: a */
    private final void m11582a(RecyclerView recyclerView) {
        C3388d dVar = new C3388d(this);
        recyclerView.mo4385a((C0817t) dVar);
        recyclerView.setTag(C3424c.tagShelfScrollListener, dVar);
    }

    /* renamed from: a */
    static /* synthetic */ void m11585a(C3384s sVar, int i, int[] iArr, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                iArr = null;
            }
            sVar.m11581a(i, iArr);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveItemPosition");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m11581a(int i, int[] iArr) {
        mo12518l().mo12582y().put(mo12517k(), new C3418b(i, iArr != null ? Integer.valueOf(iArr[0]) : null));
    }

    /* renamed from: a */
    private final void m11583a(RecyclerView recyclerView, boolean z) {
        if (recyclerView.getScrollState() == 0) {
            if (!m11591o() || !z || m11590c(recyclerView) == mo12499h()) {
                C0808o layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    C3418b bVar = (C3418b) mo12518l().mo12582y().get(mo12517k());
                    int a = mo12507a(mo12518l().mo12378t());
                    if (bVar == null) {
                        m11587a(z, linearLayoutManager);
                    } else if (!m11591o() && a != -1 && !RecyclerViewExtKt.m18801a(linearLayoutManager, a)) {
                        linearLayoutManager.mo3903i(a);
                    } else if (bVar.mo12588a() == null) {
                        int b = bVar.mo12589b();
                        mo12497a(b);
                        linearLayoutManager.mo3903i(b + ((!m11591o() || !z) ? 0 : 1));
                    } else {
                        linearLayoutManager.mo4342f(bVar.mo12589b(), bVar.mo12588a().intValue());
                    }
                } else {
                    throw new C13142s("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                }
            }
        }
    }

    /* renamed from: a */
    private final void m11587a(boolean z, LinearLayoutManager linearLayoutManager) {
        if (m11591o()) {
            linearLayoutManager.mo3903i(mo12499h() - (z ^ true ? 1 : 0));
            if (z && mo12518l().mo12378t() == null) {
                View c = linearLayoutManager.mo4337c(mo12499h());
                if (c != null) {
                    c.post(new C3387c(c));
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo12507a(C3417a aVar) {
        if ((aVar != null ? aVar.mo12583a() : null) == null || !Intrinsics.areEqual((Object) aVar.mo12584b(), (Object) mo12517k())) {
            return -1;
        }
        int i = 0;
        for (C3626b a : mo12511d()) {
            if (a.mo12848a(aVar.mo12583a())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    public boolean mo12491a() {
        return mo12514g().mo12634m() == C3451p.f8708U;
    }
}
