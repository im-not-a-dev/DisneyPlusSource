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

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002BM\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u0002HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\u0011\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0003H\u0003J\u0017\u0010/\u001a\u00020-2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000301H\u0001J]\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u00103\u001a\u00020-2\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\u0011\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u001eH\u0003J\t\u00108\u001a\u00020\u001eHÖ\u0001J\u0011\u00109\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u0003H\u0001J\t\u0010:\u001a\u00020-H\u0001J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00030<H\u0003J\u0011\u0010=\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u0003H\u0001J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00030?H\u0001J\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00030?2\u0006\u00107\u001a\u00020\u001eH\u0001J\u001f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010A\u001a\u00020\u001e2\u0006\u0010B\u001a\u00020\u001eH\u0001J\t\u0010C\u001a\u00020\u0005HÖ\u0001R\u001b\u0010\u000f\u001a\u00020\u00108VX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u000b\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\f\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0012\u0010\u001d\u001a\u00020\u001eX\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0014\u0010\"\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016¨\u0006D"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/sets/ContentSet;", "Lcom/bamtechmedia/dominguez/core/content/sets/DmcSet;", "", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "setId", "", "experimentToken", "texts", "Lcom/bamtechmedia/dominguez/core/content/assets/TextEntry;", "items", "type", "contentClass", "meta", "Lcom/bamtechmedia/dominguez/core/content/paging/DefaultPagingMetaData;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/bamtechmedia/dominguez/core/content/paging/DefaultPagingMetaData;)V", "actualType", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetType;", "getActualType", "()Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetType;", "actualType$delegate", "Lkotlin/Lazy;", "getContentClass", "()Ljava/lang/String;", "getExperimentToken", "getItems", "()Ljava/util/List;", "getMeta", "()Lcom/bamtechmedia/dominguez/core/content/paging/DefaultPagingMetaData;", "getSetId", "size", "", "getSize", "()I", "getTexts", "title", "getTitle", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "contains", "", "element", "containsAll", "elements", "", "copy", "equals", "other", "", "get", "index", "hashCode", "indexOf", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "toString", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: SetModels.kt */
public final class ContentSet extends C3778h implements List<C3626b>, C12872a {

    /* renamed from: b0 */
    static final /* synthetic */ KProperty[] f9356b0 = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(ContentSet.class), "actualType", "getActualType()Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetType;"))};

    /* renamed from: U */
    private final String f9357U;

    /* renamed from: V */
    private final String f9358V;

    /* renamed from: W */
    private final List<TextEntry> f9359W;

    /* renamed from: X */
    private final List<C3626b> f9360X;

    /* renamed from: Y */
    private final String f9361Y;

    /* renamed from: Z */
    private final String f9362Z;

    /* renamed from: a0 */
    private final DefaultPagingMetaData f9363a0;

    /* renamed from: c */
    private final Lazy f9364c;

    /* renamed from: com.bamtechmedia.dominguez.core.content.sets.ContentSet$a */
    /* compiled from: SetModels.kt */
    static final class C3754a extends C12881k implements Function0<ContentSetType> {

        /* renamed from: c */
        final /* synthetic */ ContentSet f9365c;

        C3754a(ContentSet contentSet) {
            this.f9365c = contentSet;
            super(0);
        }

        public final ContentSetType invoke() {
            return ContentSetType.Companion.mo13625a(this.f9365c.mo13618k());
        }
    }

    public /* synthetic */ ContentSet(String str, String str2, List list, List list2, String str3, String str4, DefaultPagingMetaData defaultPagingMetaData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? C13185o.m40513a() : list, list2, str3, str4, defaultPagingMetaData);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bamtechmedia.dominguez.core.content.assets.TextEntry>, for r8v0, types: [java.util.List] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bamtechmedia.dominguez.core.content.assets.b>, for r9v0, types: [java.util.List] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bamtechmedia.dominguez.core.content.sets.ContentSet m12706a(com.bamtechmedia.dominguez.core.content.sets.ContentSet r5, java.lang.String r6, java.lang.String r7, java.util.List<com.bamtechmedia.dominguez.core.content.assets.TextEntry> r8, java.util.List<com.bamtechmedia.dominguez.core.content.assets.C3626b> r9, java.lang.String r10, java.lang.String r11, com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData r12, int r13, java.lang.Object r14) {
        /*
            r14 = r13 & 1
            if (r14 == 0) goto L_0x0008
            java.lang.String r6 = r5.mo13608e()
        L_0x0008:
            r14 = r13 & 2
            if (r14 == 0) goto L_0x0010
            java.lang.String r7 = r5.mo13601a()
        L_0x0010:
            r14 = r7
            r7 = r13 & 4
            if (r7 == 0) goto L_0x0017
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.TextEntry> r8 = r5.f9359W
        L_0x0017:
            r0 = r8
            r7 = r13 & 8
            if (r7 == 0) goto L_0x001e
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.b> r9 = r5.f9360X
        L_0x001e:
            r1 = r9
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0025
            java.lang.String r10 = r5.f9361Y
        L_0x0025:
            r2 = r10
            r7 = r13 & 32
            if (r7 == 0) goto L_0x002e
            java.lang.String r11 = r5.mo13606c()
        L_0x002e:
            r3 = r11
            r7 = r13 & 64
            if (r7 == 0) goto L_0x0037
            com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData r12 = r5.m12717f0()
        L_0x0037:
            r4 = r12
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r0
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r4
            com.bamtechmedia.dominguez.core.content.sets.ContentSet r5 = r7.mo13600a(r8, r9, r10, r11, r12, r13, r14)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.sets.ContentSet.m12706a(com.bamtechmedia.dominguez.core.content.sets.ContentSet, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData, int, java.lang.Object):com.bamtechmedia.dominguez.core.content.sets.ContentSet");
    }

    /* renamed from: a */
    public final ContentSet mo13600a(String str, String str2, List<TextEntry> list, List<? extends C3626b> list2, String str3, String str4, DefaultPagingMetaData defaultPagingMetaData) {
        ContentSet contentSet = new ContentSet(str, str2, list, list2, str3, str4, defaultPagingMetaData);
        return contentSet;
    }

    /* renamed from: a */
    public String mo13601a() {
        return this.f9358V;
    }

    /* renamed from: a */
    public boolean mo13602a(C3626b bVar) {
        return this.f9360X.contains(bVar);
    }

    /* renamed from: b */
    public int mo13603b(C3626b bVar) {
        return this.f9360X.indexOf(bVar);
    }

    /* renamed from: b */
    public ContentSetType mo13604b() {
        Lazy lazy = this.f9364c;
        KProperty kProperty = f9356b0[0];
        return (ContentSetType) lazy.getValue();
    }

    /* renamed from: c */
    public int mo13605c(C3626b bVar) {
        return this.f9360X.lastIndexOf(bVar);
    }

    /* renamed from: c */
    public String mo13606c() {
        return this.f9362Z;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        return this.f9360X.containsAll(collection);
    }

    /* renamed from: e */
    public String mo13608e() {
        return this.f9357U;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) mo13457f0(), (java.lang.Object) r3.mo13457f0()) != false) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0061
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.core.content.sets.ContentSet
            if (r0 == 0) goto L_0x005f
            com.bamtechmedia.dominguez.core.content.sets.ContentSet r3 = (com.bamtechmedia.dominguez.core.content.sets.ContentSet) r3
            java.lang.String r0 = r2.mo13608e()
            java.lang.String r1 = r3.mo13608e()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = r2.mo13601a()
            java.lang.String r1 = r3.mo13601a()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x005f
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.TextEntry> r0 = r2.f9359W
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.TextEntry> r1 = r3.f9359W
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x005f
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.b> r0 = r2.f9360X
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.b> r1 = r3.f9360X
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = r2.f9361Y
            java.lang.String r1 = r3.f9361Y
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = r2.mo13606c()
            java.lang.String r1 = r3.mo13606c()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x005f
            com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData r0 = r2.m12717f0()
            com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData r3 = r3.m12717f0()
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r3 = 0
            return r3
        L_0x0061:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.sets.ContentSet.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public int mo13610f() {
        return this.f9360X.size();
    }

    /* renamed from: g */
    public String mo13611g() {
        return C3650u.m12406a(this.f9359W, C3648s.TITLE, null, C3647r.SET, 2, null);
    }

    public C3626b get(int i) {
        Object obj = this.f9360X.get(i);
        C12880j.m40222a(obj, "get(...)");
        return (C3626b) obj;
    }

    public int hashCode() {
        String e = mo13608e();
        int i = 0;
        int hashCode = (e != null ? e.hashCode() : 0) * 31;
        String a = mo13601a();
        int hashCode2 = (hashCode + (a != null ? a.hashCode() : 0)) * 31;
        List<TextEntry> list = this.f9359W;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List<C3626b> list2 = this.f9360X;
        int hashCode4 = (hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str = this.f9361Y;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 31;
        String c = mo13606c();
        int hashCode6 = (hashCode5 + (c != null ? c.hashCode() : 0)) * 31;
        DefaultPagingMetaData f0 = m12717f0();
        if (f0 != null) {
            i = f0.hashCode();
        }
        return hashCode6 + i;
    }

    /* renamed from: i */
    public final List<C3626b> mo13614i() {
        return this.f9360X;
    }

    public boolean isEmpty() {
        return this.f9360X.isEmpty();
    }

    public Iterator<C3626b> iterator() {
        return this.f9360X.iterator();
    }

    /* renamed from: j */
    public final List<TextEntry> mo13617j() {
        return this.f9359W;
    }

    /* renamed from: k */
    public final String mo13618k() {
        return this.f9361Y;
    }

    public ListIterator<C3626b> listIterator() {
        return this.f9360X.listIterator();
    }

    public ListIterator<C3626b> listIterator(int i) {
        return this.f9360X.listIterator(i);
    }

    public List<C3626b> subList(int i, int i2) {
        return this.f9360X.subList(i, i2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContentSet(setId=");
        sb.append(mo13608e());
        sb.append(", experimentToken=");
        sb.append(mo13601a());
        sb.append(", texts=");
        sb.append(this.f9359W);
        sb.append(", items=");
        sb.append(this.f9360X);
        sb.append(", type=");
        sb.append(this.f9361Y);
        sb.append(", contentClass=");
        sb.append(mo13606c());
        sb.append(", meta=");
        sb.append(m12717f0());
        sb.append(")");
        return sb.toString();
    }

    public ContentSet(String str, String str2, List<TextEntry> list, List<? extends C3626b> list2, String str3, String str4, DefaultPagingMetaData defaultPagingMetaData) {
        super(null);
        this.f9357U = str;
        this.f9358V = str2;
        this.f9359W = list;
        this.f9360X = list2;
        this.f9361Y = str3;
        this.f9362Z = str4;
        this.f9363a0 = defaultPagingMetaData;
        this.f9364c = C12763i.m39921a(new C3754a(this));
    }

    /* renamed from: f0 */
    public DefaultPagingMetaData m12717f0() {
        return this.f9363a0;
    }
}
