package com.bamtechmedia.dominguez.core.content.sets;

import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.assets.C3647r;
import com.bamtechmedia.dominguez.core.content.assets.C3648s;
import com.bamtechmedia.dominguez.core.content.assets.C3650u;
import com.bamtechmedia.dominguez.core.content.assets.TextEntry;
import com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.jvm.internal.p589f0.C12872a;
import kotlin.reflect.KProperty;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002BU\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\u0010\u000fJ\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\t0\u0002HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\rHÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0011\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u0003H\u0003J\u0017\u0010:\u001a\u0002082\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00030<H\u0001Jg\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\u0013\u0010>\u001a\u0002082\b\u0010?\u001a\u0004\u0018\u00010@HÖ\u0003J\u0011\u0010A\u001a\u00020\u00032\u0006\u0010B\u001a\u00020)H\u0003J\t\u0010C\u001a\u00020)HÖ\u0001J\u0011\u0010D\u001a\u00020)2\u0006\u00109\u001a\u00020\u0003H\u0001J\t\u0010E\u001a\u000208H\u0001J\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00030GH\u0003J\u0011\u0010H\u001a\u00020)2\u0006\u00109\u001a\u00020\u0003H\u0001J\u000f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00030JH\u0001J\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00030J2\u0006\u0010B\u001a\u00020)H\u0001J\u001f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010L\u001a\u00020)2\u0006\u0010M\u001a\u00020)H\u0001J\t\u0010N\u001a\u00020\u0005HÖ\u0001R\u001b\u0010\u0010\u001a\u00020\u00118VX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0014\u0010\f\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0014\u0010&\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001fR\u0012\u0010(\u001a\u00020)X\u0005¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0017R\u0014\u0010-\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001f¨\u0006O"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/sets/ReferenceSet;", "Lcom/bamtechmedia/dominguez/core/content/sets/DmcSet;", "", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "experimentToken", "", "refId", "refType", "texts", "Lcom/bamtechmedia/dominguez/core/content/assets/TextEntry;", "refIdType", "contentClass", "meta", "Lcom/bamtechmedia/dominguez/core/content/paging/DefaultPagingMetaData;", "assets", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/bamtechmedia/dominguez/core/content/paging/DefaultPagingMetaData;Ljava/util/List;)V", "actualType", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetType;", "getActualType", "()Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetType;", "actualType$delegate", "Lkotlin/Lazy;", "getAssets", "()Ljava/util/List;", "availabilityHint", "Lcom/bamtechmedia/dominguez/core/content/sets/AvailabilityHint;", "getAvailabilityHint", "()Lcom/bamtechmedia/dominguez/core/content/sets/AvailabilityHint;", "setAvailabilityHint", "(Lcom/bamtechmedia/dominguez/core/content/sets/AvailabilityHint;)V", "getContentClass", "()Ljava/lang/String;", "getExperimentToken", "getMeta", "()Lcom/bamtechmedia/dominguez/core/content/paging/DefaultPagingMetaData;", "getRefId", "getRefIdType", "getRefType", "setId", "getSetId", "size", "", "getSize", "()I", "getTexts", "title", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "contains", "", "element", "containsAll", "elements", "", "copy", "equals", "other", "", "get", "index", "hashCode", "indexOf", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "toString", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: SetModels.kt */
public final class ReferenceSet extends C3778h implements List<C3626b>, C12872a {

    /* renamed from: e0 */
    static final /* synthetic */ KProperty[] f9366e0 = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(ReferenceSet.class), "actualType", "getActualType()Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetType;"))};

    /* renamed from: U */
    private final Lazy f9367U;

    /* renamed from: V */
    private final String f9368V;

    /* renamed from: W */
    private final String f9369W;

    /* renamed from: X */
    private final String f9370X;

    /* renamed from: Y */
    private final String f9371Y;

    /* renamed from: Z */
    private final List<TextEntry> f9372Z;

    /* renamed from: a0 */
    private final String f9373a0;

    /* renamed from: b0 */
    private final String f9374b0;

    /* renamed from: c */
    private AvailabilityHint f9375c;

    /* renamed from: c0 */
    private final DefaultPagingMetaData f9376c0;

    /* renamed from: d0 */
    private final List<C3626b> f9377d0;

    /* renamed from: com.bamtechmedia.dominguez.core.content.sets.ReferenceSet$a */
    /* compiled from: SetModels.kt */
    static final class C3756a extends C12881k implements Function0<ContentSetType> {

        /* renamed from: c */
        final /* synthetic */ ReferenceSet f9378c;

        C3756a(ReferenceSet referenceSet) {
            this.f9378c = referenceSet;
            super(0);
        }

        public final ContentSetType invoke() {
            return ContentSetType.Companion.mo13625a(this.f9378c.mo13638m());
        }
    }

    public /* synthetic */ ReferenceSet(String str, String str2, String str3, List list, String str4, String str5, DefaultPagingMetaData defaultPagingMetaData, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, list, str4, str5, defaultPagingMetaData, (i & 128) != 0 ? C13185o.m40513a() : list2);
    }

    /* renamed from: a */
    public static /* synthetic */ ReferenceSet m12724a(ReferenceSet referenceSet, String str, String str2, String str3, List list, String str4, String str5, DefaultPagingMetaData defaultPagingMetaData, List list2, int i, Object obj) {
        ReferenceSet referenceSet2 = referenceSet;
        int i2 = i;
        return referenceSet.mo13626a((i2 & 1) != 0 ? referenceSet.mo13601a() : str, (i2 & 2) != 0 ? referenceSet2.f9370X : str2, (i2 & 4) != 0 ? referenceSet2.f9371Y : str3, (i2 & 8) != 0 ? referenceSet2.f9372Z : list, (i2 & 16) != 0 ? referenceSet2.f9373a0 : str4, (i2 & 32) != 0 ? referenceSet.mo13606c() : str5, (i2 & 64) != 0 ? referenceSet.m12736f0() : defaultPagingMetaData, (i2 & 128) != 0 ? referenceSet2.f9377d0 : list2);
    }

    /* renamed from: a */
    public final ReferenceSet mo13626a(String str, String str2, String str3, List<TextEntry> list, String str4, String str5, DefaultPagingMetaData defaultPagingMetaData, List<? extends C3626b> list2) {
        ReferenceSet referenceSet = new ReferenceSet(str, str2, str3, list, str4, str5, defaultPagingMetaData, list2);
        return referenceSet;
    }

    /* renamed from: a */
    public String mo13601a() {
        return this.f9369W;
    }

    /* renamed from: a */
    public boolean mo13602a(C3626b bVar) {
        return this.f9377d0.contains(bVar);
    }

    /* renamed from: b */
    public int mo13603b(C3626b bVar) {
        return this.f9377d0.indexOf(bVar);
    }

    /* renamed from: b */
    public ContentSetType mo13604b() {
        Lazy lazy = this.f9367U;
        KProperty kProperty = f9366e0[0];
        return (ContentSetType) lazy.getValue();
    }

    /* renamed from: c */
    public int mo13605c(C3626b bVar) {
        return this.f9377d0.lastIndexOf(bVar);
    }

    /* renamed from: c */
    public String mo13606c() {
        return this.f9374b0;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        return this.f9377d0.containsAll(collection);
    }

    /* renamed from: e */
    public String mo13608e() {
        return this.f9370X;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0062, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f9377d0, (java.lang.Object) r3.f9377d0) != false) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0067
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.core.content.sets.ReferenceSet
            if (r0 == 0) goto L_0x0065
            com.bamtechmedia.dominguez.core.content.sets.ReferenceSet r3 = (com.bamtechmedia.dominguez.core.content.sets.ReferenceSet) r3
            java.lang.String r0 = r2.mo13601a()
            java.lang.String r1 = r3.mo13601a()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0065
            java.lang.String r0 = r2.f9370X
            java.lang.String r1 = r3.f9370X
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0065
            java.lang.String r0 = r2.f9371Y
            java.lang.String r1 = r3.f9371Y
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0065
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.TextEntry> r0 = r2.f9372Z
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.TextEntry> r1 = r3.f9372Z
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0065
            java.lang.String r0 = r2.f9373a0
            java.lang.String r1 = r3.f9373a0
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0065
            java.lang.String r0 = r2.mo13606c()
            java.lang.String r1 = r3.mo13606c()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0065
            com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData r0 = r2.m12736f0()
            com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData r1 = r3.m12736f0()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0065
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.b> r0 = r2.f9377d0
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.b> r3 = r3.f9377d0
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r3 = 0
            return r3
        L_0x0067:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.sets.ReferenceSet.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public int mo13610f() {
        return this.f9377d0.size();
    }

    /* renamed from: g */
    public String mo13611g() {
        return this.f9368V;
    }

    public C3626b get(int i) {
        Object obj = this.f9377d0.get(i);
        C12880j.m40222a(obj, "get(...)");
        return (C3626b) obj;
    }

    public int hashCode() {
        String a = mo13601a();
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        String str = this.f9370X;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9371Y;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<TextEntry> list = this.f9372Z;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        String str3 = this.f9373a0;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String c = mo13606c();
        int hashCode6 = (hashCode5 + (c != null ? c.hashCode() : 0)) * 31;
        DefaultPagingMetaData f0 = m12736f0();
        int hashCode7 = (hashCode6 + (f0 != null ? f0.hashCode() : 0)) * 31;
        List<C3626b> list2 = this.f9377d0;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode7 + i;
    }

    /* renamed from: i */
    public final List<C3626b> mo13632i() {
        return this.f9377d0;
    }

    public boolean isEmpty() {
        return this.f9377d0.isEmpty();
    }

    public Iterator<C3626b> iterator() {
        return this.f9377d0.iterator();
    }

    /* renamed from: j */
    public final AvailabilityHint mo13635j() {
        return this.f9375c;
    }

    /* renamed from: k */
    public final String mo13636k() {
        return this.f9370X;
    }

    /* renamed from: l */
    public final String mo13637l() {
        return this.f9373a0;
    }

    public ListIterator<C3626b> listIterator() {
        return this.f9377d0.listIterator();
    }

    public ListIterator<C3626b> listIterator(int i) {
        return this.f9377d0.listIterator(i);
    }

    /* renamed from: m */
    public final String mo13638m() {
        return this.f9371Y;
    }

    /* renamed from: n */
    public final List<TextEntry> mo13639n() {
        return this.f9372Z;
    }

    public List<C3626b> subList(int i, int i2) {
        return this.f9377d0.subList(i, i2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ReferenceSet(experimentToken=");
        sb.append(mo13601a());
        sb.append(", refId=");
        sb.append(this.f9370X);
        sb.append(", refType=");
        sb.append(this.f9371Y);
        sb.append(", texts=");
        sb.append(this.f9372Z);
        sb.append(", refIdType=");
        sb.append(this.f9373a0);
        sb.append(", contentClass=");
        sb.append(mo13606c());
        sb.append(", meta=");
        sb.append(m12736f0());
        sb.append(", assets=");
        sb.append(this.f9377d0);
        sb.append(")");
        return sb.toString();
    }

    public ReferenceSet(String str, String str2, String str3, List<TextEntry> list, String str4, String str5, DefaultPagingMetaData defaultPagingMetaData, List<? extends C3626b> list2) {
        super(null);
        this.f9369W = str;
        this.f9370X = str2;
        this.f9371Y = str3;
        this.f9372Z = list;
        this.f9373a0 = str4;
        this.f9374b0 = str5;
        this.f9376c0 = defaultPagingMetaData;
        this.f9377d0 = list2;
        this.f9375c = AvailabilityHint.UNKNOWN;
        this.f9367U = C12763i.m39921a(new C3756a(this));
        this.f9368V = C3650u.m12406a(this.f9372Z, C3648s.TITLE, null, C3647r.SET, 2, null);
    }

    /* renamed from: a */
    public final void mo13627a(AvailabilityHint availabilityHint) {
        this.f9375c = availabilityHint;
    }

    /* renamed from: f0 */
    public DefaultPagingMetaData m12736f0() {
        return this.f9376c0;
    }
}
