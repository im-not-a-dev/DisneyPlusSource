package com.bamtechmedia.dominguez.collections.items;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.View.OnClickListener;
import com.bamtechmedia.dominguez.collections.C3320f;
import com.bamtechmedia.dominguez.collections.C3320f.C3322b;
import com.bamtechmedia.dominguez.collections.p080o0.C3444j;
import com.bamtechmedia.dominguez.core.content.C3651b;
import com.bamtechmedia.dominguez.core.content.C3716q;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.paging.C3700c;
import com.bamtechmedia.dominguez.core.content.paging.C3702e;
import com.bamtechmedia.dominguez.core.utils.C5821c0;
import java.util.List;
import java.util.Map;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p171c.p172a.p173a.C4793a;
import p163g.p201e.p202a.C5364g;
import p163g.p509o.p510a.C11853e;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 E2\u00020\u0001:\u0003DEFBw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\tH\u0016J&\u0010\u001c\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\t2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0016J\t\u0010%\u001a\u00020\u0003HÂ\u0003J\t\u0010&\u001a\u00020\u0015HÂ\u0003J\u0015\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u0017HÂ\u0003J\t\u0010(\u001a\u00020\u001aHÂ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÂ\u0003J\t\u0010*\u001a\u00020\u0006HÂ\u0003J\t\u0010+\u001a\u00020\tHÂ\u0003J\t\u0010,\u001a\u00020\u000bHÂ\u0003J\t\u0010-\u001a\u00020\rHÂ\u0003J\t\u0010.\u001a\u00020\u000fHÂ\u0003J\t\u0010/\u001a\u00020\u0011HÂ\u0003J\t\u00100\u001a\u00020\u0013HÂ\u0003J\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u001aHÆ\u0001J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0002J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010$HÖ\u0003J\u0018\u00109\u001a\u0004\u0018\u00010$2\f\u0010:\u001a\b\u0012\u0002\b\u0003\u0018\u00010;H\u0016J\b\u0010<\u001a\u00020\tH\u0016J\t\u0010=\u001a\u00020\tHÖ\u0001J\b\u0010>\u001a\u000207H\u0002J\u0016\u0010?\u001a\u0002072\f\u00108\u001a\b\u0012\u0002\b\u0003\u0018\u00010;H\u0016J\t\u0010@\u001a\u00020\u0018HÖ\u0001J\u0016\u0010A\u001a\u00020B*\u00020B2\b\u0010C\u001a\u0004\u0018\u000103H\u0002R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u0017X\u0004¢\u0006\u0002\n\u0000¨\u0006G"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/items/CollectionListItem;", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "config", "Lcom/bamtechmedia/dominguez/collections/config/ContainerConfig;", "assets", "Lcom/bamtechmedia/dominguez/core/content/paging/PagedList;", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "asset", "index", "", "overrideStrings", "Lcom/bamnet/config/strings/OverrideStrings;", "runtimeConverter", "Lcom/bamtechmedia/dominguez/core/utils/RuntimeConverter;", "analytics", "Lcom/bamtechmedia/dominguez/collections/CollectionAnalytics;", "clickHandler", "Lcom/bamtechmedia/dominguez/collections/items/CollectionItemClickHandler;", "debugAssetHelper", "Lcom/bamtechmedia/dominguez/collections/items/DebugAssetHelper;", "pagingListener", "Lcom/bamtechmedia/dominguez/core/content/paging/PagingListener;", "trackExtraMap", "", "", "ratingFormatter", "Lcom/bamtechmedia/dominguez/core/content/RatingAdvisoriesFormatter;", "(Lcom/bamtechmedia/dominguez/collections/config/ContainerConfig;Lcom/bamtechmedia/dominguez/core/content/paging/PagedList;Lcom/bamtechmedia/dominguez/core/content/assets/Asset;ILcom/bamnet/config/strings/OverrideStrings;Lcom/bamtechmedia/dominguez/core/utils/RuntimeConverter;Lcom/bamtechmedia/dominguez/collections/CollectionAnalytics;Lcom/bamtechmedia/dominguez/collections/items/CollectionItemClickHandler;Lcom/bamtechmedia/dominguez/collections/items/DebugAssetHelper;Lcom/bamtechmedia/dominguez/core/content/paging/PagingListener;Ljava/util/Map;Lcom/bamtechmedia/dominguez/core/content/RatingAdvisoriesFormatter;)V", "bind", "", "viewHolder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "position", "holder", "payloads", "", "", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "createMetaDataText", "", "browsable", "Lcom/bamtechmedia/dominguez/core/content/Browsable;", "equals", "", "other", "getChangePayload", "newItem", "Lcom/xwray/groupie/Item;", "getLayout", "hashCode", "isOriginal", "isSameAs", "toString", "appendMetaData", "Landroid/text/SpannableStringBuilder;", "string", "ChangePayload", "Companion", "Factory", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.items.g */
/* compiled from: CollectionListItem.kt */
public final class C3350g extends C11866a {

    /* renamed from: U */
    private final C3700c<C3626b> f8428U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final C3626b f8429V;

    /* renamed from: W */
    private final int f8430W;

    /* renamed from: X */
    private final C4793a f8431X;

    /* renamed from: Y */
    private final C5821c0 f8432Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public final C3320f f8433Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public final C3345c f8434a0;

    /* renamed from: b0 */
    private final C3364j f8435b0;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3444j f8436c;

    /* renamed from: c0 */
    private final C3702e f8437c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public final Map<String, String> f8438d0;

    /* renamed from: e0 */
    private final C3716q f8439e0;

    /* renamed from: com.bamtechmedia.dominguez.collections.items.g$a */
    /* compiled from: CollectionListItem.kt */
    private static final class C3351a {

        /* renamed from: a */
        private final boolean f8440a;

        public C3351a(boolean z) {
            this.f8440a = z;
        }

        /* renamed from: a */
        public final boolean mo12449a() {
            return this.f8440a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C3351a) {
                    if (this.f8440a == ((C3351a) obj).f8440a) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.f8440a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ChangePayload(assetChanged=");
            sb.append(this.f8440a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.items.g$b */
    /* compiled from: CollectionListItem.kt */
    private static final class C3352b {
        private C3352b() {
        }

        public /* synthetic */ C3352b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.items.g$c */
    /* compiled from: CollectionListItem.kt */
    public static final class C3353c {

        /* renamed from: a */
        private final C3320f f8441a;

        /* renamed from: b */
        private final C3345c f8442b;

        /* renamed from: c */
        private final C3364j f8443c;

        /* renamed from: d */
        private final C4793a f8444d;

        /* renamed from: e */
        private final C3702e f8445e;

        /* renamed from: f */
        private final C3716q f8446f;

        /* renamed from: g */
        private final C5821c0 f8447g;

        public C3353c(C3320f fVar, C3345c cVar, C3364j jVar, C4793a aVar, C3702e eVar, C3716q qVar, C5821c0 c0Var) {
            this.f8441a = fVar;
            this.f8442b = cVar;
            this.f8443c = jVar;
            this.f8444d = aVar;
            this.f8445e = eVar;
            this.f8446f = qVar;
            this.f8447g = c0Var;
        }

        /* renamed from: a */
        public final C3350g mo12453a(C3444j jVar, C3700c<? extends C3626b> cVar, C3626b bVar, int i, Map<String, String> map) {
            C3350g gVar = new C3350g(jVar, cVar, bVar, i, this.f8444d, this.f8447g, this.f8441a, this.f8442b, this.f8443c, this.f8445e, map, this.f8446f);
            return gVar;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.collections.items.g$d */
    /* compiled from: CollectionListItem.kt */
    static final class C3354d implements OnClickListener {

        /* renamed from: U */
        final /* synthetic */ C3350g f8448U;

        /* renamed from: c */
        final /* synthetic */ C11867b f8449c;

        C3354d(C11867b bVar, C3350g gVar, List list) {
            this.f8449c = bVar;
            this.f8448U = gVar;
        }

        public final void onClick(View view) {
            C3322b.m11431a(this.f8448U.f8433Z, this.f8448U.f8436c, this.f8449c.getAdapterPosition(), this.f8448U.f8429V, this.f8448U.f8438d0, false, 16, null);
            this.f8448U.f8434a0.mo12436a(this.f8448U.f8429V);
        }
    }

    static {
        new C3352b(null);
    }

    public C3350g(C3444j jVar, C3700c<? extends C3626b> cVar, C3626b bVar, int i, C4793a aVar, C5821c0 c0Var, C3320f fVar, C3345c cVar2, C3364j jVar2, C3702e eVar, Map<String, String> map, C3716q qVar) {
        this.f8436c = jVar;
        this.f8428U = cVar;
        this.f8429V = bVar;
        this.f8430W = i;
        this.f8431X = aVar;
        this.f8432Y = c0Var;
        this.f8433Z = fVar;
        this.f8434a0 = cVar2;
        this.f8435b0 = jVar2;
        this.f8437c0 = eVar;
        this.f8438d0 = map;
        this.f8439e0 = qVar;
    }

    public void bind(C11867b bVar, int i) {
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3350g) {
                C3350g gVar = (C3350g) obj;
                if (C12880j.m40224a((Object) this.f8436c, (Object) gVar.f8436c) && C12880j.m40224a((Object) this.f8428U, (Object) gVar.f8428U) && C12880j.m40224a((Object) this.f8429V, (Object) gVar.f8429V)) {
                    if (!(this.f8430W == gVar.f8430W) || !C12880j.m40224a((Object) this.f8431X, (Object) gVar.f8431X) || !C12880j.m40224a((Object) this.f8432Y, (Object) gVar.f8432Y) || !C12880j.m40224a((Object) this.f8433Z, (Object) gVar.f8433Z) || !C12880j.m40224a((Object) this.f8434a0, (Object) gVar.f8434a0) || !C12880j.m40224a((Object) this.f8435b0, (Object) gVar.f8435b0) || !C12880j.m40224a((Object) this.f8437c0, (Object) gVar.f8437c0) || !C12880j.m40224a((Object) this.f8438d0, (Object) gVar.f8438d0) || !C12880j.m40224a((Object) this.f8439e0, (Object) gVar.f8439e0)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public Object getChangePayload(C11853e<?> eVar) {
        C3626b bVar = this.f8429V;
        if (eVar != null) {
            return new C3351a(!C12880j.m40224a((Object) bVar, (Object) ((C3350g) eVar).f8429V));
        }
        throw new C13142s("null cannot be cast to non-null type com.bamtechmedia.dominguez.collections.items.CollectionListItem");
    }

    public int getLayout() {
        return C5364g.list_item;
    }

    public int hashCode() {
        C3444j jVar = this.f8436c;
        int i = 0;
        int hashCode = (jVar != null ? jVar.hashCode() : 0) * 31;
        C3700c<C3626b> cVar = this.f8428U;
        int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        C3626b bVar = this.f8429V;
        int hashCode3 = (((hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.f8430W) * 31;
        C4793a aVar = this.f8431X;
        int hashCode4 = (hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        C5821c0 c0Var = this.f8432Y;
        int hashCode5 = (hashCode4 + (c0Var != null ? c0Var.hashCode() : 0)) * 31;
        C3320f fVar = this.f8433Z;
        int hashCode6 = (hashCode5 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        C3345c cVar2 = this.f8434a0;
        int hashCode7 = (hashCode6 + (cVar2 != null ? cVar2.hashCode() : 0)) * 31;
        C3364j jVar2 = this.f8435b0;
        int hashCode8 = (hashCode7 + (jVar2 != null ? jVar2.hashCode() : 0)) * 31;
        C3702e eVar = this.f8437c0;
        int hashCode9 = (hashCode8 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        Map<String, String> map = this.f8438d0;
        int hashCode10 = (hashCode9 + (map != null ? map.hashCode() : 0)) * 31;
        C3716q qVar = this.f8439e0;
        if (qVar != null) {
            i = qVar.hashCode();
        }
        return hashCode10 + i;
    }

    public boolean isSameAs(C11853e<?> eVar) {
        return (eVar instanceof C3350g) && ((C3350g) eVar).f8430W == this.f8430W;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CollectionListItem(config=");
        sb.append(this.f8436c);
        sb.append(", assets=");
        sb.append(this.f8428U);
        sb.append(", asset=");
        sb.append(this.f8429V);
        sb.append(", index=");
        sb.append(this.f8430W);
        sb.append(", overrideStrings=");
        sb.append(this.f8431X);
        sb.append(", runtimeConverter=");
        sb.append(this.f8432Y);
        sb.append(", analytics=");
        sb.append(this.f8433Z);
        sb.append(", clickHandler=");
        sb.append(this.f8434a0);
        sb.append(", debugAssetHelper=");
        sb.append(this.f8435b0);
        sb.append(", pagingListener=");
        sb.append(this.f8437c0);
        sb.append(", trackExtraMap=");
        sb.append(this.f8438d0);
        sb.append(", ratingFormatter=");
        sb.append(this.f8439e0);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    private final boolean m11530a() {
        C3626b bVar = this.f8429V;
        return (bVar instanceof C3651b) && ((C3651b) bVar).mo13268i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r3 != null) goto L_0x0023;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.CharSequence m11529a(com.bamtechmedia.dominguez.core.content.C3651b r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.mo13267h()
            boolean r1 = r6 instanceof com.bamtechmedia.dominguez.core.content.C3693o
            r2 = 0
            if (r1 != 0) goto L_0x000b
            r3 = r2
            goto L_0x000c
        L_0x000b:
            r3 = r6
        L_0x000c:
            com.bamtechmedia.dominguez.core.content.o r3 = (com.bamtechmedia.dominguez.core.content.C3693o) r3
            if (r3 == 0) goto L_0x0015
            com.bamtechmedia.dominguez.core.content.assets.Rating r3 = r3.mo13265g()
            goto L_0x0016
        L_0x0015:
            r3 = r2
        L_0x0016:
            if (r3 == 0) goto L_0x0021
            com.bamtechmedia.dominguez.core.content.q r4 = r5.f8439e0
            android.text.Spannable r3 = r4.mo13544a(r3)
            if (r3 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            java.lang.String r3 = ""
        L_0x0023:
            com.bamtechmedia.dominguez.core.utils.c0 r4 = r5.f8432Y
            if (r1 != 0) goto L_0x0028
            r6 = r2
        L_0x0028:
            com.bamtechmedia.dominguez.core.content.o r6 = (com.bamtechmedia.dominguez.core.content.C3693o) r6
            if (r6 == 0) goto L_0x0030
            java.lang.Long r2 = r6.mo12913w()
        L_0x0030:
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r6 = r4.mo17731b(r2, r6)
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>()
            r5.m11527a(r1, r3)
            r5.m11527a(r1, r0)
            r5.m11527a(r1, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.collections.items.C3350g.m11529a(com.bamtechmedia.dominguez.core.content.b):java.lang.CharSequence");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bind(p163g.p509o.p510a.p511l.C11867b r17, int r18, java.util.List<java.lang.Object> r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            com.bamtechmedia.dominguez.core.content.paging.e r3 = r0.f8437c0
            com.bamtechmedia.dominguez.core.content.paging.c<com.bamtechmedia.dominguez.core.content.assets.b> r4 = r0.f8428U
            int r5 = r0.f8430W
            r3.mo12663a(r4, r5)
            android.view.View r3 = r1.itemView
            com.bamtechmedia.dominguez.collections.items.g$d r4 = new com.bamtechmedia.dominguez.collections.items.g$d
            r4.<init>(r1, r0, r2)
            r3.setOnClickListener(r4)
            com.bamtechmedia.dominguez.collections.items.j r3 = r0.f8435b0
            android.view.View r4 = r1.itemView
            java.lang.String r5 = "itemView"
            kotlin.jvm.internal.C12880j.m40222a(r4, r5)
            com.bamtechmedia.dominguez.core.content.assets.b r5 = r0.f8429V
            r3.mo12470a(r4, r5)
            android.view.View r3 = r17.mo20994a()
            int r4 = p163g.p201e.p202a.C5363f.thumbnailImage
            android.view.View r3 = r3.findViewById(r4)
            com.bamtechmedia.dominguez.core.design.widgets.AspectRatioImageView r3 = (com.bamtechmedia.dominguez.core.design.widgets.AspectRatioImageView) r3
            com.bamtechmedia.dominguez.collections.o0.j r4 = r0.f8436c
            com.bamtechmedia.dominguez.core.content.assets.a r4 = r4.mo12621b()
            r3.setRatio(r4)
            boolean r3 = r19.isEmpty()
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0074
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0050
            boolean r3 = r19.isEmpty()
            if (r3 == 0) goto L_0x0050
        L_0x004e:
            r2 = 0
            goto L_0x0070
        L_0x0050:
            java.util.Iterator r2 = r19.iterator()
        L_0x0054:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x004e
            java.lang.Object r3 = r2.next()
            boolean r6 = r3 instanceof com.bamtechmedia.dominguez.collections.items.C3350g.C3351a
            if (r6 == 0) goto L_0x006c
            com.bamtechmedia.dominguez.collections.items.g$a r3 = (com.bamtechmedia.dominguez.collections.items.C3350g.C3351a) r3
            boolean r3 = r3.mo12449a()
            if (r3 == 0) goto L_0x006c
            r3 = 1
            goto L_0x006d
        L_0x006c:
            r3 = 0
        L_0x006d:
            if (r3 == 0) goto L_0x0054
            r2 = 1
        L_0x0070:
            if (r2 == 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r4 = 0
        L_0x0074:
            if (r4 == 0) goto L_0x0120
            android.view.View r2 = r17.mo20994a()
            int r3 = p163g.p201e.p202a.C5363f.thumbnailImage
            android.view.View r2 = r2.findViewById(r3)
            r6 = r2
            com.bamtechmedia.dominguez.core.design.widgets.AspectRatioImageView r6 = (com.bamtechmedia.dominguez.core.design.widgets.AspectRatioImageView) r6
            java.lang.String r2 = "thumbnailImage"
            kotlin.jvm.internal.C12880j.m40222a(r6, r2)
            com.bamtechmedia.dominguez.core.content.assets.b r3 = r0.f8429V
            com.bamtechmedia.dominguez.collections.o0.j r4 = r0.f8436c
            java.lang.String r4 = r4.mo12628h()
            com.bamtechmedia.dominguez.collections.o0.j r7 = r0.f8436c
            com.bamtechmedia.dominguez.core.content.assets.a r7 = r7.mo12621b()
            com.bamtechmedia.dominguez.core.content.assets.Image r7 = r3.mo12846a(r4, r7)
            com.bamtechmedia.dominguez.core.i.p.b r3 = com.bamtechmedia.dominguez.core.p088i.p091p.C3849b.f9526a
            com.bamtechmedia.dominguez.collections.o0.j r4 = r0.f8436c
            com.bamtechmedia.dominguez.core.content.assets.a r4 = r4.mo12621b()
            float r4 = r4.mo13242X()
            r8 = 2
            r15 = 0
            int r8 = com.bamtechmedia.dominguez.core.p088i.p091p.C3849b.m12935a(r3, r4, r5, r8, r15)
            r9 = 0
            com.bamtechmedia.dominguez.collections.o0.j r3 = r0.f8436c
            android.view.View r4 = r17.mo20994a()
            int r5 = p163g.p201e.p202a.C5363f.thumbnailImage
            android.view.View r4 = r4.findViewById(r5)
            com.bamtechmedia.dominguez.core.design.widgets.AspectRatioImageView r4 = (com.bamtechmedia.dominguez.core.design.widgets.AspectRatioImageView) r4
            kotlin.jvm.internal.C12880j.m40222a(r4, r2)
            int r2 = com.bamtechmedia.dominguez.collections.p080o0.C3446k.m11762a(r3, r4)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            r11 = 0
            boolean r12 = r16.m11530a()
            r13 = 0
            r14 = 84
            r2 = 0
            r3 = r15
            r15 = r2
            com.bamtechmedia.dominguez.core.p216l.C5763b.m18702a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            android.view.View r2 = r17.mo20994a()
            int r4 = p163g.p201e.p202a.C5363f.title
            android.view.View r2 = r2.findViewById(r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L_0x00eb
            com.bamtechmedia.dominguez.core.content.assets.b r4 = r0.f8429V
            java.lang.String r4 = r4.getTitle()
            r2.setText(r4)
        L_0x00eb:
            com.bamtechmedia.dominguez.core.content.assets.b r2 = r0.f8429V
            boolean r2 = r2 instanceof com.bamtechmedia.dominguez.core.content.C3651b
            java.lang.String r4 = "metaData"
            if (r2 == 0) goto L_0x010e
            android.view.View r1 = r17.mo20994a()
            int r2 = p163g.p201e.p202a.C5363f.metaData
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            kotlin.jvm.internal.C12880j.m40222a(r1, r4)
            com.bamtechmedia.dominguez.core.content.assets.b r2 = r0.f8429V
            com.bamtechmedia.dominguez.core.content.b r2 = (com.bamtechmedia.dominguez.core.content.C3651b) r2
            java.lang.CharSequence r2 = r0.m11529a(r2)
            r1.setText(r2)
            goto L_0x0120
        L_0x010e:
            android.view.View r1 = r17.mo20994a()
            int r2 = p163g.p201e.p202a.C5363f.metaData
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            kotlin.jvm.internal.C12880j.m40222a(r1, r4)
            r1.setText(r3)
        L_0x0120:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.collections.items.C3350g.bind(g.o.a.l.b, int, java.util.List):void");
    }

    /* renamed from: a */
    private final SpannableStringBuilder m11527a(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence) {
        boolean z = false;
        if (!(charSequence == null || charSequence.length() == 0)) {
            if (spannableStringBuilder.length() > 0) {
                z = true;
            }
            if (z) {
                spannableStringBuilder.append(" • ");
            }
            spannableStringBuilder.append(C12833x.m40181f(charSequence));
        }
        return spannableStringBuilder;
    }
}
