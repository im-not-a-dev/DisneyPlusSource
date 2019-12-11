package com.bamtechmedia.dominguez.detail.common.p230g0.p231i;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.C0513i;
import com.bamtechmedia.dominguez.collections.items.ShelfItemLayout;
import com.bamtechmedia.dominguez.collections.p080o0.C3444j;
import com.bamtechmedia.dominguez.collections.p080o0.C3446k;
import com.bamtechmedia.dominguez.collections.p081ui.C3493c;
import com.bamtechmedia.dominguez.collections.p081ui.ShelfItemRecyclerView;
import com.bamtechmedia.dominguez.core.content.C3651b.C3652a;
import com.bamtechmedia.dominguez.core.content.C3653c;
import com.bamtechmedia.dominguez.core.content.C3653c.C3654a;
import com.bamtechmedia.dominguez.core.content.C3685g;
import com.bamtechmedia.dominguez.core.content.C3686h;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.content.assets.C3623a;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.assets.C3646q;
import com.bamtechmedia.dominguez.core.content.assets.C3649t;
import com.bamtechmedia.dominguez.core.content.assets.Image;
import com.bamtechmedia.dominguez.core.content.paging.C3700c;
import com.bamtechmedia.dominguez.core.content.paging.C3702e;
import com.bamtechmedia.dominguez.core.design.widgets.AspectRatioImageView;
import com.bamtechmedia.dominguez.core.p088i.p091p.C3849b;
import com.bamtechmedia.dominguez.core.p216l.C5763b;
import com.bamtechmedia.dominguez.detail.common.p225b0.C5906a;
import com.bamtechmedia.dominguez.detail.movie.data.C6018a;
import java.util.List;
import java.util.UUID;
import kotlin.C12907r;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import p163g.p171c.p172a.p173a.C4793a;
import p163g.p201e.p203b.p287k.C7310d;
import p163g.p201e.p203b.p287k.C7312f;
import p163g.p201e.p203b.p287k.C7313g;
import p163g.p201e.p203b.p287k.C7314h;
import p163g.p509o.p510a.C11853e;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u0000 M2\u00020\u00012\u00020\u0002:\u0002LMBS\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J&\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$H\u0016J\t\u0010&\u001a\u00020\u0004HÂ\u0003J\t\u0010'\u001a\u00020\u0006HÂ\u0003J\t\u0010(\u001a\u00020\bHÂ\u0003J\t\u0010)\u001a\u00020\nHÂ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0\fHÂ\u0003J\t\u0010+\u001a\u00020\u000fHÂ\u0003J\t\u0010,\u001a\u00020\u0011HÂ\u0003J\t\u0010-\u001a\u00020\u0013HÂ\u0003J\t\u0010.\u001a\u00020\u0015HÂ\u0003Ji\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010%H\u0002J\u0018\u00103\u001a\u0004\u0018\u00010%2\f\u00104\u001a\b\u0012\u0002\b\u0003\u0018\u000105H\u0016J\b\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u00020\"H\u0016J\b\u0010;\u001a\u00020\"H\u0016J\u0016\u0010<\u001a\u0002012\f\u00102\u001a\b\u0012\u0002\b\u0003\u0018\u000105H\u0016J$\u0010=\u001a\u0002012\b\u0010>\u001a\u0004\u0018\u00010?2\u0006\u0010@\u001a\u00020\"2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\u0010\u0010C\u001a\u00020\u001e2\u0006\u0010D\u001a\u00020EH\u0002J\u0010\u0010F\u001a\u00020\u001e2\u0006\u0010G\u001a\u00020 H\u0002J\u0018\u0010H\u001a\u00020\u001e2\u0006\u0010D\u001a\u00020E2\u0006\u0010I\u001a\u000201H\u0002J\u0018\u0010J\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\t\u0010K\u001a\u000207HÖ\u0001R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006N"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/tv/items/PlayableDetailViewTvItem;", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "Landroid/view/View$OnKeyListener;", "config", "Lcom/bamtechmedia/dominguez/collections/config/ContainerConfig;", "playable", "Lcom/bamtechmedia/dominguez/core/content/Playable;", "shelfListItemScaleHelper", "Lcom/bamtechmedia/dominguez/collections/ui/ShelfListItemScaleHelper;", "overrideStrings", "Lcom/bamnet/config/strings/OverrideStrings;", "assets", "Lcom/bamtechmedia/dominguez/core/content/paging/PagedList;", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "pagingListener", "Lcom/bamtechmedia/dominguez/core/content/paging/PagingListener;", "router", "Lcom/bamtechmedia/dominguez/core/content/ContentTypeRouter;", "analytics", "Lcom/bamtechmedia/dominguez/detail/common/analytics/DetailAnalytics;", "analyticsInfo", "Lcom/bamtechmedia/dominguez/detail/movie/data/DetailAnalyticsInfo;", "(Lcom/bamtechmedia/dominguez/collections/config/ContainerConfig;Lcom/bamtechmedia/dominguez/core/content/Playable;Lcom/bamtechmedia/dominguez/collections/ui/ShelfListItemScaleHelper;Lcom/bamnet/config/strings/OverrideStrings;Lcom/bamtechmedia/dominguez/core/content/paging/PagedList;Lcom/bamtechmedia/dominguez/core/content/paging/PagingListener;Lcom/bamtechmedia/dominguez/core/content/ContentTypeRouter;Lcom/bamtechmedia/dominguez/detail/common/analytics/DetailAnalytics;Lcom/bamtechmedia/dominguez/detail/movie/data/DetailAnalyticsInfo;)V", "descriptionDisplay", "Lcom/bamtechmedia/dominguez/detail/common/tv/items/DescriptionDisplay;", "getDescriptionDisplay", "()Lcom/bamtechmedia/dominguez/detail/common/tv/items/DescriptionDisplay;", "setDescriptionDisplay", "(Lcom/bamtechmedia/dominguez/detail/common/tv/items/DescriptionDisplay;)V", "bind", "", "viewHolder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "position", "", "payloads", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "getChangePayload", "newItem", "Lcom/xwray/groupie/Item;", "getDescription", "", "getId", "", "getLayout", "hashCode", "isSameAs", "onKey", "v", "Landroid/view/View;", "keyCode", "event", "Landroid/view/KeyEvent;", "setAssetTitle", "textView", "Landroid/widget/TextView;", "setImage", "holder", "setTitleTextAppearance", "hasFocus", "setupScaleHelper", "toString", "ChangePayload", "Companion", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.detail.common.g0.i.d */
/* compiled from: PlayableDetailViewTvItem.kt */
public final class C5962d extends C11866a implements OnKeyListener {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final C3444j f13786U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final C3693o f13787V;

    /* renamed from: W */
    private final C3493c f13788W;

    /* renamed from: X */
    private final C4793a f13789X;

    /* renamed from: Y */
    private final C3700c<C3626b> f13790Y;

    /* renamed from: Z */
    private final C3702e f13791Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public final C3653c f13792a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public final C5906a f13793b0;

    /* renamed from: c */
    private C5960b f13794c;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public final C6018a f13795c0;

    /* renamed from: com.bamtechmedia.dominguez.detail.common.g0.i.d$a */
    /* compiled from: PlayableDetailViewTvItem.kt */
    public static final class C5963a {

        /* renamed from: a */
        private final boolean f13796a;

        public C5963a(boolean z) {
            this.f13796a = z;
        }

        /* renamed from: a */
        public final boolean mo17906a() {
            return this.f13796a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C5963a) {
                    if (this.f13796a == ((C5963a) obj).f13796a) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.f13796a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ChangePayload(playableChanged=");
            sb.append(this.f13796a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.common.g0.i.d$b */
    /* compiled from: PlayableDetailViewTvItem.kt */
    public static final class C5964b {
        private C5964b() {
        }

        public /* synthetic */ C5964b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.common.g0.i.d$c */
    /* compiled from: PlayableDetailViewTvItem.kt */
    static final class C5965c implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C5962d f13797c;

        C5965c(C5962d dVar, List list, C11867b bVar, int i) {
            this.f13797c = dVar;
        }

        public final void onClick(View view) {
            C3654a.m12426a(this.f13797c.f13792a0, this.f13797c.f13787V, 0, 2, null);
            this.f13797c.f13793b0.mo17812a(this.f13797c.f13795c0, this.f13797c.f13787V);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.detail.common.g0.i.d$d */
    /* compiled from: PlayableDetailViewTvItem.kt */
    static final class C5966d extends C12881k implements Function1<Boolean, C13145v> {

        /* renamed from: U */
        final /* synthetic */ C11867b f13798U;

        /* renamed from: V */
        final /* synthetic */ int f13799V;

        /* renamed from: c */
        final /* synthetic */ C5962d f13800c;

        C5966d(C5962d dVar, C11867b bVar, int i) {
            this.f13800c = dVar;
            this.f13798U = bVar;
            this.f13799V = i;
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return C13145v.f29587a;
        }

        public final void invoke(boolean z) {
            C5962d dVar = this.f13800c;
            TextView textView = (TextView) this.f13798U.mo20994a().findViewById(C7310d.assetItemTitle);
            C12880j.m40222a((Object) textView, "viewHolder.assetItemTitle");
            dVar.m19119a(textView, z);
            ImageView imageView = (ImageView) this.f13798U.mo20994a().findViewById(C7310d.assetItemPlayIcon);
            C12880j.m40222a((Object) imageView, "viewHolder.assetItemPlayIcon");
            imageView.setVisibility(z ? 0 : 8);
            C5960b a = this.f13800c.mo17898a();
            if (a != null) {
                a.mo17893a(z ? this.f13800c.m19124b() : "");
            }
            if (z) {
                View view = this.f13798U.itemView;
                C12880j.m40222a((Object) view, "viewHolder.itemView");
                ViewParent parent = view.getParent();
                if (!(parent instanceof ShelfItemRecyclerView)) {
                    parent = null;
                }
                ShelfItemRecyclerView shelfItemRecyclerView = (ShelfItemRecyclerView) parent;
                if (shelfItemRecyclerView != null) {
                    shelfItemRecyclerView.mo12695k(this.f13799V, this.f13800c.f13786U.mo12637p());
                }
            }
        }
    }

    static {
        new C5964b(null);
    }

    public C5962d(C3444j jVar, C3693o oVar, C3493c cVar, C4793a aVar, C3700c<? extends C3626b> cVar2, C3702e eVar, C3653c cVar3, C5906a aVar2, C6018a aVar3) {
        this.f13786U = jVar;
        this.f13787V = oVar;
        this.f13788W = cVar;
        this.f13789X = aVar;
        this.f13790Y = cVar2;
        this.f13791Z = eVar;
        this.f13792a0 = cVar3;
        this.f13793b0 = aVar2;
        this.f13795c0 = aVar3;
    }

    public void bind(C11867b bVar, int i) {
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5962d) {
            C5962d dVar = (C5962d) obj;
            if (C12880j.m40224a((Object) dVar.f13787V.mo12903f(), (Object) this.f13787V.mo12903f()) && C12880j.m40224a((Object) dVar.f13787V.getContentType(), (Object) this.f13787V.getContentType()) && C12880j.m40224a((Object) dVar.f13786U, (Object) this.f13786U) && dVar.f13790Y.size() == this.f13790Y.size()) {
                return true;
            }
        }
        return false;
    }

    public Object getChangePayload(C11853e<?> eVar) {
        if (!(eVar instanceof C5962d)) {
            eVar = null;
        }
        C5962d dVar = (C5962d) eVar;
        if (dVar != null) {
            return new C5963a(!C12880j.m40224a((Object) dVar.f13787V, (Object) this.f13787V));
        }
        return null;
    }

    public long getId() {
        try {
            UUID fromString = UUID.fromString(this.f13787V.mo12903f());
            C12880j.m40222a((Object) fromString, "UUID.fromString(playable.contentId)");
            return fromString.getMostSignificantBits() & Long.MAX_VALUE;
        } catch (IllegalArgumentException unused) {
            return super.getId();
        }
    }

    public int getLayout() {
        return C7312f.detail_asset_item_tv;
    }

    public int hashCode() {
        String contentType = this.f13787V.getContentType();
        return ((contentType != null ? contentType.hashCode() : 0) * 31) + this.f13787V.mo12903f().hashCode();
    }

    public boolean isSameAs(C11853e<?> eVar) {
        return (eVar instanceof C5962d) && C12880j.m40224a((Object) ((C5962d) eVar).f13787V.mo12903f(), (Object) this.f13787V.mo12903f());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        if ((r4 != null ? r4.focusSearch(130) : null) != null) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKey(android.view.View r4, int r5, android.view.KeyEvent r6) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L_0x000c
            int r6 = r6.getAction()
            if (r6 != 0) goto L_0x000c
            r6 = 1
            goto L_0x000d
        L_0x000c:
            r6 = 0
        L_0x000d:
            if (r6 == 0) goto L_0x0020
            r2 = 20
            if (r5 != r2) goto L_0x0020
            if (r4 == 0) goto L_0x001c
            r2 = 130(0x82, float:1.82E-43)
            android.view.View r4 = r4.focusSearch(r2)
            goto L_0x001d
        L_0x001c:
            r4 = 0
        L_0x001d:
            if (r4 == 0) goto L_0x0020
            goto L_0x0028
        L_0x0020:
            if (r6 == 0) goto L_0x0027
            r4 = 19
            if (r5 != r4) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            if (r0 == 0) goto L_0x0033
            com.bamtechmedia.dominguez.detail.common.g0.i.b r4 = r3.f13794c
            if (r4 == 0) goto L_0x0033
            java.lang.String r5 = ""
            r4.mo17893a(r5)
        L_0x0033:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.common.p230g0.p231i.C5962d.onKey(android.view.View, int, android.view.KeyEvent):boolean");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlayableDetailViewTvItem(config=");
        sb.append(this.f13786U);
        sb.append(", playable=");
        sb.append(this.f13787V);
        sb.append(", shelfListItemScaleHelper=");
        sb.append(this.f13788W);
        sb.append(", overrideStrings=");
        sb.append(this.f13789X);
        sb.append(", assets=");
        sb.append(this.f13790Y);
        sb.append(", pagingListener=");
        sb.append(this.f13791Z);
        sb.append(", router=");
        sb.append(this.f13792a0);
        sb.append(", analytics=");
        sb.append(this.f13793b0);
        sb.append(", analyticsInfo=");
        sb.append(this.f13795c0);
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final String m19124b() {
        C3693o oVar = this.f13787V;
        if (oVar instanceof C3685g) {
            return C3652a.m12419a(oVar, C3649t.BRIEF, null, 2, null);
        }
        return oVar instanceof C3686h ? C3652a.m12419a(oVar, C3649t.MEDIUM, null, 2, null) : "";
    }

    /* renamed from: a */
    public final C5960b mo17898a() {
        return this.f13794c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        if (r0 != false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bind(p163g.p509o.p510a.p511l.C11867b r6, int r7, java.util.List<? extends java.lang.Object> r8) {
        /*
            r5 = this;
            boolean r0 = r8.isEmpty()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0036
            boolean r0 = r8 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0014
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0014
        L_0x0012:
            r0 = 0
            goto L_0x0034
        L_0x0014:
            java.util.Iterator r0 = r8.iterator()
        L_0x0018:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0012
            java.lang.Object r3 = r0.next()
            boolean r4 = r3 instanceof com.bamtechmedia.dominguez.detail.common.p230g0.p231i.C5962d.C5963a
            if (r4 == 0) goto L_0x0030
            com.bamtechmedia.dominguez.detail.common.g0.i.d$a r3 = (com.bamtechmedia.dominguez.detail.common.p230g0.p231i.C5962d.C5963a) r3
            boolean r3 = r3.mo17906a()
            if (r3 == 0) goto L_0x0030
            r3 = 1
            goto L_0x0031
        L_0x0030:
            r3 = 0
        L_0x0031:
            if (r3 == 0) goto L_0x0018
            r0 = 1
        L_0x0034:
            if (r0 == 0) goto L_0x0037
        L_0x0036:
            r1 = 1
        L_0x0037:
            if (r1 == 0) goto L_0x0064
            android.view.View r0 = r6.mo20994a()
            int r1 = p163g.p201e.p203b.p287k.C7310d.shelfItemLayout
            android.view.View r0 = r0.findViewById(r1)
            com.bamtechmedia.dominguez.collections.items.ShelfItemLayoutWrapper r0 = (com.bamtechmedia.dominguez.collections.items.ShelfItemLayoutWrapper) r0
            com.bamtechmedia.dominguez.collections.o0.j r1 = r5.f13786U
            r0.setConfig(r1)
            r5.m19122a(r6, r7)
            r5.m19121a(r6)
            android.view.View r0 = r6.mo20994a()
            int r1 = p163g.p201e.p203b.p287k.C7310d.assetItemTitle
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = "assetItemTitle"
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            r5.m19118a(r0)
        L_0x0064:
            com.bamtechmedia.dominguez.core.content.paging.e r0 = r5.f13791Z
            com.bamtechmedia.dominguez.core.content.paging.c<com.bamtechmedia.dominguez.core.content.assets.b> r1 = r5.f13790Y
            com.bamtechmedia.dominguez.core.content.o r3 = r5.f13787V
            int r3 = r1.indexOf(r3)
            r0.mo12663a(r1, r3)
            android.view.View r0 = r6.itemView
            com.bamtechmedia.dominguez.detail.common.g0.i.d$c r1 = new com.bamtechmedia.dominguez.detail.common.g0.i.d$c
            r1.<init>(r5, r8, r6, r7)
            r0.setOnClickListener(r1)
            android.view.View r7 = r6.itemView
            r7.setOnKeyListener(r5)
            android.view.View r6 = r6.itemView
            int r7 = p163g.p201e.p203b.p287k.C7310d.focusHelperHorizontalFocusSearchWithinParent
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            r6.setTag(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.common.p230g0.p231i.C5962d.bind(g.o.a.l.b, int, java.util.List):void");
    }

    /* renamed from: a */
    public final void mo17899a(C5960b bVar) {
        this.f13794c = bVar;
    }

    /* renamed from: a */
    private final void m19121a(C11867b bVar) {
        Image a = C3646q.m12401a(this.f13787V);
        AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) bVar.mo20994a().findViewById(C7310d.assetItemImage);
        String str = "holder.assetItemImage";
        C12880j.m40222a((Object) aspectRatioImageView, str);
        C3444j jVar = this.f13786U;
        AspectRatioImageView aspectRatioImageView2 = (AspectRatioImageView) bVar.mo20994a().findViewById(C7310d.assetItemImage);
        C12880j.m40222a((Object) aspectRatioImageView2, str);
        C5763b.m18702a(aspectRatioImageView, a, C3849b.m12935a(C3849b.f9526a, C3623a.f9125b0.mo13248a().mo13242X(), 0, 2, null), null, Integer.valueOf(C3446k.m11762a(jVar, aspectRatioImageView2)), false, false, false, 116, null);
    }

    /* renamed from: a */
    private final void m19122a(C11867b bVar, int i) {
        C3493c cVar = this.f13788W;
        View view = bVar.itemView;
        C12880j.m40222a((Object) view, "viewHolder.itemView");
        ShelfItemLayout shelfItemLayout = (ShelfItemLayout) bVar.mo20994a().findViewById(C7310d.cardView);
        C12880j.m40222a((Object) shelfItemLayout, "viewHolder.cardView");
        C3493c.m11865a(cVar, view, shelfItemLayout, this.f13786U, false, new C5966d(this, bVar, i), 8, null);
    }

    /* renamed from: a */
    private final void m19118a(TextView textView) {
        String str;
        C3693o oVar = this.f13787V;
        if (oVar instanceof C3685g) {
            str = this.f13789X.mo16171a(C7313g.video_episode_title, C13173j0.m40356a(C12907r.m40244a("episodeNumber", String.valueOf(((C3685g) oVar).mo12878I())), C12907r.m40244a("title", this.f13787V.getTitle())));
        } else {
            str = oVar.getTitle();
        }
        textView.setText(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m19119a(TextView textView, boolean z) {
        int i;
        if (z) {
            i = C7314h.Disney_TextAppearance_Tv_TitleFocused;
        } else {
            i = C7314h.Disney_TextAppearance_Tv_TitleUnfocused;
        }
        C0513i.m2778d(textView, i);
    }
}
