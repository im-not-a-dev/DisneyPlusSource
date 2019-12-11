package com.bamtechmedia.dominguez.collections.items;

import android.content.Context;
import android.os.Trace;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bamtechmedia.dominguez.collections.C3320f;
import com.bamtechmedia.dominguez.collections.C3320f.C3322b;
import com.bamtechmedia.dominguez.collections.items.C3402z.C3404b;
import com.bamtechmedia.dominguez.collections.p080o0.C3444j;
import com.bamtechmedia.dominguez.collections.p080o0.C3444j.C3445a;
import com.bamtechmedia.dominguez.collections.p080o0.C3446k;
import com.bamtechmedia.dominguez.collections.p080o0.C3452q;
import com.bamtechmedia.dominguez.core.content.C3651b;
import com.bamtechmedia.dominguez.core.content.C3685g;
import com.bamtechmedia.dominguez.core.content.C3688j;
import com.bamtechmedia.dominguez.core.content.C3689k;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.assets.Image;
import com.bamtechmedia.dominguez.core.content.containers.ContainerType;
import com.bamtechmedia.dominguez.core.content.paging.C3700c;
import com.bamtechmedia.dominguez.core.content.paging.C3702e;
import com.bamtechmedia.dominguez.core.design.widgets.AspectRatioImageView;
import com.bamtechmedia.dominguez.core.p088i.p091p.C3849b;
import com.bamtechmedia.dominguez.core.p216l.C5763b;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5843l;
import com.bamtechmedia.dominguez.core.utils.C5844l0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p096e.p121h.p135s.C4127b0;
import p163g.p201e.p202a.C5358a;
import p163g.p201e.p202a.C5362e;
import p163g.p201e.p202a.C5363f;
import p163g.p201e.p202a.C5364g;
import p163g.p509o.p510a.C11853e;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001:\u0002GHB\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0002\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\tH\u0016J&\u0010\u001f\u001a\u00020 2\u0006\u0010$\u001a\u00020\"2\u0006\u0010#\u001a\u00020\t2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&H\u0016J\u001e\u0010(\u001a\u00020 2\u0006\u0010$\u001a\u00020\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0)H\u0002J\u001e\u0010*\u001a\u00020 2\u0006\u0010$\u001a\u00020\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&H\u0002J\t\u0010+\u001a\u00020\u0003HÂ\u0003J\t\u0010,\u001a\u00020\u0015HÂ\u0003J\t\u0010-\u001a\u00020\u0017HÂ\u0003J\u0015\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u0019HÂ\u0003J\t\u0010/\u001a\u00020\u001cHÂ\u0003J\t\u00100\u001a\u00020\u001aHÂ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÂ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0006HÂ\u0003J\t\u00103\u001a\u00020\tHÂ\u0003J\t\u00104\u001a\u00020\u000bHÂ\u0003J\t\u00105\u001a\u00020\rHÂ\u0003J\t\u00106\u001a\u00020\u000fHÂ\u0003J\t\u00107\u001a\u00020\u0011HÂ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0013HÂ\u0003J«\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001aHÆ\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010'HÖ\u0003J\u0018\u0010=\u001a\u0004\u0018\u00010'2\f\u0010>\u001a\b\u0012\u0002\b\u0003\u0018\u00010?H\u0016J\b\u0010@\u001a\u00020\tH\u0016J\t\u0010A\u001a\u00020\tHÖ\u0001J\u0010\u0010B\u001a\u00020;2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0016\u0010C\u001a\u00020;2\f\u0010<\u001a\b\u0012\u0002\b\u0003\u0018\u00010?H\u0016J\u0018\u0010D\u001a\u00020 2\u0006\u0010$\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010E\u001a\u00020 2\u0006\u0010$\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\t\u0010F\u001a\u00020\u001aHÖ\u0001R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u0019X\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/items/ShelfListItem;", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "config", "Lcom/bamtechmedia/dominguez/collections/config/ContainerConfig;", "set", "Lcom/bamtechmedia/dominguez/core/content/paging/PagedList;", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "asset", "indexInSet", "", "clickHandler", "Lcom/bamtechmedia/dominguez/collections/items/CollectionItemClickHandler;", "pagingListener", "Lcom/bamtechmedia/dominguez/core/content/paging/PagingListener;", "analytics", "Lcom/bamtechmedia/dominguez/collections/CollectionAnalytics;", "debugAssetHelper", "Lcom/bamtechmedia/dominguez/collections/items/DebugAssetHelper;", "focusHelper", "Lcom/bamtechmedia/dominguez/collections/items/ShelfListItemFocusHelper;", "fallbackImage", "Lcom/bamtechmedia/dominguez/core/design/helper/FallbackImage;", "keyboardUtils", "Lcom/bamtechmedia/dominguez/core/utils/KeyboardUtils;", "trackExtraMap", "", "", "accessibility", "Lcom/bamtechmedia/dominguez/collections/items/CollectionAccessibility;", "parentCollection", "(Lcom/bamtechmedia/dominguez/collections/config/ContainerConfig;Lcom/bamtechmedia/dominguez/core/content/paging/PagedList;Lcom/bamtechmedia/dominguez/core/content/assets/Asset;ILcom/bamtechmedia/dominguez/collections/items/CollectionItemClickHandler;Lcom/bamtechmedia/dominguez/core/content/paging/PagingListener;Lcom/bamtechmedia/dominguez/collections/CollectionAnalytics;Lcom/bamtechmedia/dominguez/collections/items/DebugAssetHelper;Lcom/bamtechmedia/dominguez/collections/items/ShelfListItemFocusHelper;Lcom/bamtechmedia/dominguez/core/design/helper/FallbackImage;Lcom/bamtechmedia/dominguez/core/utils/KeyboardUtils;Ljava/util/Map;Lcom/bamtechmedia/dominguez/collections/items/CollectionAccessibility;Ljava/lang/String;)V", "bind", "", "viewHolder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "position", "holder", "payloads", "", "", "bindAsset", "", "bindConfig", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "getChangePayload", "newItem", "Lcom/xwray/groupie/Item;", "getLayout", "hashCode", "isOriginal", "isSameAs", "loadLogoImage", "loadPosterImage", "toString", "Factory", "Payload", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.items.y */
/* compiled from: ShelfListItem.kt */
public final class C3397y extends C11866a {

    /* renamed from: U */
    private final C3700c<C3626b> f8577U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final C3626b f8578V;

    /* renamed from: W */
    private final int f8579W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public final C3345c f8580X;

    /* renamed from: Y */
    private final C3702e f8581Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public final C3320f f8582Z;

    /* renamed from: a0 */
    private final C3364j f8583a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public final C3402z f8584b0;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3444j f8585c;

    /* renamed from: c0 */
    private final C3849b f8586c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public final C5843l f8587d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public final Map<String, String> f8588e0;

    /* renamed from: f0 */
    private final C3341a f8589f0;

    /* renamed from: g0 */
    private final String f8590g0;

    /* renamed from: com.bamtechmedia.dominguez.collections.items.y$a */
    /* compiled from: ShelfListItem.kt */
    public static final class C3398a {

        /* renamed from: a */
        private final C3320f f8591a;

        /* renamed from: b */
        private final C3345c f8592b;

        /* renamed from: c */
        private final C3364j f8593c;

        /* renamed from: d */
        private final C3404b f8594d;

        /* renamed from: e */
        private final C3702e f8595e;

        public C3398a(C3320f fVar, C3345c cVar, C3364j jVar, C3404b bVar, C3702e eVar) {
            this.f8591a = fVar;
            this.f8592b = cVar;
            this.f8593c = jVar;
            this.f8594d = bVar;
            this.f8595e = eVar;
        }

        /* renamed from: a */
        public static /* synthetic */ C3397y m11652a(C3398a aVar, C3444j jVar, String str, C3700c cVar, C3626b bVar, int i, boolean z, Map map, C3341a aVar2, String str2, int i2, Object obj) {
            return aVar.mo12556a(jVar, str, cVar, bVar, i, (i2 & 32) != 0 ? false : z, map, aVar2, str2);
        }

        /* renamed from: a */
        public final C3397y mo12556a(C3444j jVar, String str, C3700c<? extends C3626b> cVar, C3626b bVar, int i, boolean z, Map<String, String> map, C3341a aVar, String str2) {
            C3444j jVar2 = jVar;
            C3700c<? extends C3626b> cVar2 = cVar;
            C3626b bVar2 = bVar;
            int i2 = i;
            C3397y yVar = new C3397y(jVar2, cVar2, bVar2, i2, this.f8592b, this.f8595e, this.f8591a, this.f8593c, this.f8594d.mo12567a(bVar, str, jVar, z, this.f8591a), C3849b.f9526a, C5843l.f13627a, map, aVar, str2);
            return yVar;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.items.y$b */
    /* compiled from: ShelfListItem.kt */
    private static final class C3399b {

        /* renamed from: a */
        private final boolean f8596a;

        /* renamed from: b */
        private final boolean f8597b;

        public C3399b(boolean z, boolean z2) {
            this.f8596a = z;
            this.f8597b = z2;
        }

        /* renamed from: a */
        public final boolean mo12557a() {
            return this.f8596a;
        }

        /* renamed from: b */
        public final boolean mo12558b() {
            return this.f8597b;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C3399b) {
                    C3399b bVar = (C3399b) obj;
                    if (this.f8596a == bVar.f8596a) {
                        if (this.f8597b == bVar.f8597b) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.f8596a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = (z ? 1 : 0) * true;
            boolean z2 = this.f8597b;
            if (!z2) {
                i = z2;
            }
            return i2 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Payload(assetChanged=");
            sb.append(this.f8596a);
            sb.append(", configChanged=");
            sb.append(this.f8597b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.items.y$c */
    /* compiled from: ShelfListItem.kt */
    static final class C3400c implements OnClickListener {

        /* renamed from: U */
        final /* synthetic */ C11867b f8598U;

        /* renamed from: c */
        final /* synthetic */ C3397y f8599c;

        C3400c(C3397y yVar, C11867b bVar) {
            this.f8599c = yVar;
            this.f8598U = bVar;
        }

        public final void onClick(View view) {
            C3322b.m11431a(this.f8599c.f8582Z, this.f8599c.f8585c, this.f8598U.getAdapterPosition(), this.f8599c.f8578V, this.f8599c.f8588e0, false, 16, null);
            C3402z e = this.f8599c.f8584b0;
            if (e != null) {
                e.mo12564a(this.f8598U);
            }
            this.f8599c.f8580X.mo12436a(this.f8599c.f8578V);
            C13145v vVar = C13145v.f29587a;
            C5843l f = this.f8599c.f8587d0;
            View view2 = this.f8598U.itemView;
            Intrinsics.checkReturnedValueIsNotNull((Object) view2, "holder.itemView");
            f.mo17743a(view2);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.items.y$d */
    /* compiled from: ShelfListItem.kt */
    static final class C3401d implements OnClickListener {

        /* renamed from: c */
        public static final C3401d f8600c = new C3401d();

        C3401d() {
        }

        public final void onClick(View view) {
        }
    }

    public C3397y(C3444j jVar, C3700c<? extends C3626b> cVar, C3626b bVar, int i, C3345c cVar2, C3702e eVar, C3320f fVar, C3364j jVar2, C3402z zVar, C3849b bVar2, C5843l lVar, Map<String, String> map, C3341a aVar, String str) {
        this.f8585c = jVar;
        this.f8577U = cVar;
        this.f8578V = bVar;
        this.f8579W = i;
        this.f8580X = cVar2;
        this.f8581Y = eVar;
        this.f8582Z = fVar;
        this.f8583a0 = jVar2;
        this.f8584b0 = zVar;
        this.f8586c0 = bVar2;
        this.f8587d0 = lVar;
        this.f8588e0 = map;
        this.f8589f0 = aVar;
        this.f8590g0 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3397y) {
                C3397y yVar = (C3397y) obj;
                if (Intrinsics.areEqual((Object) this.f8585c, (Object) yVar.f8585c) && Intrinsics.areEqual((Object) this.f8577U, (Object) yVar.f8577U) && Intrinsics.areEqual((Object) this.f8578V, (Object) yVar.f8578V)) {
                    if (!(this.f8579W == yVar.f8579W) || !Intrinsics.areEqual((Object) this.f8580X, (Object) yVar.f8580X) || !Intrinsics.areEqual((Object) this.f8581Y, (Object) yVar.f8581Y) || !Intrinsics.areEqual((Object) this.f8582Z, (Object) yVar.f8582Z) || !Intrinsics.areEqual((Object) this.f8583a0, (Object) yVar.f8583a0) || !Intrinsics.areEqual((Object) this.f8584b0, (Object) yVar.f8584b0) || !Intrinsics.areEqual((Object) this.f8586c0, (Object) yVar.f8586c0) || !Intrinsics.areEqual((Object) this.f8587d0, (Object) yVar.f8587d0) || !Intrinsics.areEqual((Object) this.f8588e0, (Object) yVar.f8588e0) || !Intrinsics.areEqual((Object) this.f8589f0, (Object) yVar.f8589f0) || !Intrinsics.areEqual((Object) this.f8590g0, (Object) yVar.f8590g0)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public Object getChangePayload(C11853e<?> eVar) {
        if (eVar != null) {
            C3397y yVar = (C3397y) eVar;
            return new C3399b(!Intrinsics.areEqual((Object) yVar.f8578V, (Object) this.f8578V), !Intrinsics.areEqual((Object) this.f8585c, (Object) yVar.f8585c));
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bamtechmedia.dominguez.collections.items.ShelfListItem");
    }

    public int getLayout() {
        String str = "brand";
        if (Intrinsics.areEqual((Object) this.f8585c.mo12623d(), (Object) str)) {
            C3402z zVar = this.f8584b0;
            if (zVar != null && zVar.mo12566a()) {
                return C5364g.animated_brand_shelf_list_item;
            }
        }
        if (Intrinsics.areEqual((Object) this.f8585c.mo12623d(), (Object) str)) {
            return C5364g.brand_shelf_list_item;
        }
        if (Intrinsics.areEqual((Object) this.f8585c.mo12623d(), (Object) "featured")) {
            return C5364g.featured_shelf_list_item;
        }
        if (Intrinsics.areEqual((Object) this.f8585c.mo12623d(), (Object) "character")) {
            return C5364g.shelf_list_item_avatar;
        }
        if (this.f8585c.mo12631j() == C3452q.OVER_BOTTOM) {
            return C5364g.shelf_list_item_title_over_bottom;
        }
        if (this.f8585c.mo12631j() == C3452q.OVER) {
            return C5364g.shelf_list_item_title_over;
        }
        if (this.f8585c.mo12631j() == C3452q.UNDER) {
            return C5364g.shelf_list_item_title_below;
        }
        if (this.f8585c.mo12627g() == C3445a.HERO_SNAP) {
            return C5364g.shelf_list_item_hero;
        }
        return C5364g.shelf_list_item;
    }

    public int hashCode() {
        C3444j jVar = this.f8585c;
        int i = 0;
        int hashCode = (jVar != null ? jVar.hashCode() : 0) * 31;
        C3700c<C3626b> cVar = this.f8577U;
        int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        C3626b bVar = this.f8578V;
        int hashCode3 = (((hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.f8579W) * 31;
        C3345c cVar2 = this.f8580X;
        int hashCode4 = (hashCode3 + (cVar2 != null ? cVar2.hashCode() : 0)) * 31;
        C3702e eVar = this.f8581Y;
        int hashCode5 = (hashCode4 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        C3320f fVar = this.f8582Z;
        int hashCode6 = (hashCode5 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        C3364j jVar2 = this.f8583a0;
        int hashCode7 = (hashCode6 + (jVar2 != null ? jVar2.hashCode() : 0)) * 31;
        C3402z zVar = this.f8584b0;
        int hashCode8 = (hashCode7 + (zVar != null ? zVar.hashCode() : 0)) * 31;
        C3849b bVar2 = this.f8586c0;
        int hashCode9 = (hashCode8 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
        C5843l lVar = this.f8587d0;
        int hashCode10 = (hashCode9 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        Map<String, String> map = this.f8588e0;
        int hashCode11 = (hashCode10 + (map != null ? map.hashCode() : 0)) * 31;
        C3341a aVar = this.f8589f0;
        int hashCode12 = (hashCode11 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f8590g0;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode12 + i;
    }

    public boolean isSameAs(C11853e<?> eVar) {
        if (eVar == this) {
            return true;
        }
        if (eVar instanceof C3397y) {
            if (eVar instanceof C3384s) {
                C3397y yVar = (C3397y) eVar;
                if (yVar.f8578V == null && yVar.f8579W == this.f8579W) {
                    return true;
                }
            }
            C3626b bVar = ((C3397y) eVar).f8578V;
            C3626b bVar2 = this.f8578V;
            if (bVar == bVar2) {
                return true;
            }
            Object obj = null;
            if (!(bVar == null || bVar2 == null)) {
                obj = Boolean.valueOf(bVar2.mo12848a(bVar));
            }
            if (Intrinsics.areEqual(obj, (Object) Boolean.valueOf(true))) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShelfListItem(config=");
        sb.append(this.f8585c);
        sb.append(", set=");
        sb.append(this.f8577U);
        sb.append(", asset=");
        sb.append(this.f8578V);
        sb.append(", indexInSet=");
        sb.append(this.f8579W);
        sb.append(", clickHandler=");
        sb.append(this.f8580X);
        sb.append(", pagingListener=");
        sb.append(this.f8581Y);
        sb.append(", analytics=");
        sb.append(this.f8582Z);
        sb.append(", debugAssetHelper=");
        sb.append(this.f8583a0);
        sb.append(", focusHelper=");
        sb.append(this.f8584b0);
        sb.append(", fallbackImage=");
        sb.append(this.f8586c0);
        sb.append(", keyboardUtils=");
        sb.append(this.f8587d0);
        sb.append(", trackExtraMap=");
        sb.append(this.f8588e0);
        sb.append(", accessibility=");
        sb.append(this.f8589f0);
        sb.append(", parentCollection=");
        sb.append(this.f8590g0);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    private final void m11641a(C11867b bVar, C3626b bVar2) {
        AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) bVar.mo20994a().findViewById(C5363f.logo);
        if (aspectRatioImageView != null) {
            C3688j a = C3689k.m12544a(bVar2);
            Image a2 = a != null ? bVar2.mo12845a(a, this.f8585c.mo12621b()) : null;
            if (a2 != null) {
                C5763b.m18702a(aspectRatioImageView, a2, 0, null, null, false, false, false, 126, null);
            }
        }
    }

    /* renamed from: b */
    private final void m11645b(C11867b bVar, C3626b bVar2) {
        AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) bVar.mo20994a().findViewById(C5363f.poster);
        if (aspectRatioImageView != null) {
            Image a = bVar2.mo12846a(this.f8585c.mo12628h(), this.f8585c.mo12621b());
            boolean z = false;
            int a2 = C3849b.m12935a(this.f8586c0, this.f8585c.mo12621b().mo13242X(), 0, 2, null);
            Integer valueOf = Integer.valueOf(C5362e.transparent_placeholder);
            valueOf.intValue();
            String str = "brand";
            Integer num = Intrinsics.areEqual((Object) this.f8585c.mo12623d(), (Object) str) ? valueOf : null;
            Integer valueOf2 = Integer.valueOf(C3446k.m11762a(this.f8585c, aspectRatioImageView));
            if (Intrinsics.areEqual((Object) this.f8585c.mo12623d(), (Object) str) || Intrinsics.areEqual((Object) this.f8585c.mo12623d(), (Object) "character")) {
                z = true;
            }
            C5763b.m18702a(aspectRatioImageView, a, a2, num, valueOf2, z, m11643a(bVar2), false, 64, null);
        }
    }

    public void bind(C11867b bVar, int i, List<Object> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("bind asset: ");
        C3626b bVar2 = this.f8578V;
        sb.append(bVar2 != null ? bVar2.getTitle() : null);
        Trace.beginSection(sb.toString());
        C3402z zVar = this.f8584b0;
        if (zVar != null) {
            zVar.mo12565a(bVar, i);
        }
        m11646b(bVar, list);
        m11642a(bVar, list);
        Trace.endSection();
    }

    /* renamed from: a */
    private final boolean m11643a(C3626b bVar) {
        boolean z = true;
        boolean z2 = this.f8585c.mo12622c() == ContainerType.HeroContainer || this.f8585c.mo12622c() == ContainerType.HeroFullBleedContainer;
        boolean a = Intrinsics.areEqual((Object) this.f8590g0, (Object) "originals");
        if (!(bVar instanceof C3651b) || (bVar instanceof C3685g)) {
            z = false;
        }
        if (z2 || a || !z) {
            return false;
        }
        if (bVar != null) {
            return ((C3651b) bVar).mo13268i();
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bamtechmedia.dominguez.core.content.Browsable");
    }

    public void bind(C11867b bVar, int i) {
        bind(bVar, i, (List<Object>) new ArrayList<Object>());
    }

    /* renamed from: a */
    private final void m11642a(C11867b bVar, List<? extends Object> list) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (!list.isEmpty()) {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (!(next instanceof C3399b) || !((C3399b) next).mo12557a()) {
                        z2 = false;
                        continue;
                    } else {
                        z2 = true;
                        continue;
                    }
                    if (z2) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                z3 = false;
            }
        }
        this.f8581Y.mo12663a(this.f8577U, this.f8579W);
        C3626b bVar2 = this.f8578V;
        String str = "holder.itemView";
        if (bVar2 != null) {
            if (z3) {
                m11645b(bVar, bVar2);
                m11641a(bVar, this.f8578V);
                AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) bVar.mo20994a().findViewById(C5363f.poster);
                if (aspectRatioImageView != null) {
                    aspectRatioImageView.setContentDescription(this.f8589f0.mo12417a(this.f8585c, this.f8578V));
                }
                TextView textView = (TextView) bVar.mo20994a().findViewById(C5363f.title);
                if (textView != null) {
                    C5844l0.m18865a(textView, (CharSequence) this.f8578V.getTitle(), false, 2, (Object) null);
                }
            }
            bVar.itemView.setOnClickListener(new C3400c(this, bVar));
            C3364j jVar = this.f8583a0;
            View view = bVar.itemView;
            Intrinsics.checkReturnedValueIsNotNull((Object) view, str);
            jVar.mo12470a(view, this.f8578V);
            return;
        }
        if (z3) {
            View view2 = bVar.itemView;
            Intrinsics.checkReturnedValueIsNotNull((Object) view2, str);
            Context context = view2.getContext();
            Intrinsics.checkReturnedValueIsNotNull((Object) context, "holder.itemView.context");
            int b = C5837i.m18839b(context, C5358a.assetPlaceholder, null, false, 6, null);
            AspectRatioImageView aspectRatioImageView2 = (AspectRatioImageView) bVar.mo20994a().findViewById(C5363f.poster);
            if (aspectRatioImageView2 != null) {
                aspectRatioImageView2.setImageResource(b);
            }
            TextView textView2 = (TextView) bVar.mo20994a().findViewById(C5363f.title);
            if (textView2 != null) {
                C4127b0.m14131b(textView2, false);
            }
        }
        bVar.itemView.setOnClickListener(C3401d.f8600c);
    }

    /* renamed from: b */
    private final void m11646b(C11867b bVar, List<Object> list) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (!list.isEmpty()) {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (!(next instanceof C3399b) || !((C3399b) next).mo12558b()) {
                        z2 = false;
                        continue;
                    } else {
                        z2 = true;
                        continue;
                    }
                    if (z2) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                z3 = false;
            }
        }
        if (z3) {
            AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) bVar.mo20994a().findViewById(C5363f.poster);
            if (aspectRatioImageView != null) {
                aspectRatioImageView.setRatio(this.f8585c.mo12621b());
            }
            ShelfItemLayout shelfItemLayout = (ShelfItemLayout) bVar.mo20994a().findViewById(C5363f.shelfItemLayout);
            if (shelfItemLayout != null) {
                shelfItemLayout.setConfig(this.f8585c);
            }
        }
    }
}
