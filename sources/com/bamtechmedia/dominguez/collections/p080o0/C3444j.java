package com.bamtechmedia.dominguez.collections.p080o0;

import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import com.bamtechmedia.dominguez.collections.items.C3343b;
import com.bamtechmedia.dominguez.core.content.assets.C3623a;
import com.bamtechmedia.dominguez.core.content.containers.ContainerType;
import com.bamtechmedia.dominguez.core.content.sets.C3788m;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import net.danlew.android.joda.DateUtils;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001:\u0001_B£\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c¢\u0006\u0002\u0010\u001dJ\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\t\u0010F\u001a\u00020\u0011HÆ\u0003J\t\u0010G\u001a\u00020\tHÆ\u0003J\t\u0010H\u001a\u00020\u000bHÆ\u0003J\t\u0010I\u001a\u00020\u000bHÆ\u0003J\t\u0010J\u001a\u00020\u000bHÆ\u0003J\t\u0010K\u001a\u00020\u0017HÆ\u0003J\t\u0010L\u001a\u00020\u000bHÆ\u0003J\u000f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001aHÆ\u0003J\t\u0010N\u001a\u00020\u001cHÆ\u0003J\t\u0010O\u001a\u00020\u0005HÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\t\u0010Q\u001a\u00020\u0005HÆ\u0003J\t\u0010R\u001a\u00020\tHÆ\u0003J\t\u0010S\u001a\u00020\u000bHÆ\u0003J\t\u0010T\u001a\u00020\u000bHÆ\u0003J\t\u0010U\u001a\u00020\tHÆ\u0003J\t\u0010V\u001a\u00020\u0005HÆ\u0003J\u000e\u0010W\u001a\u00020\t2\u0006\u0010X\u001a\u00020YJÍ\u0001\u0010Z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cHÆ\u0001J\u0013\u0010[\u001a\u00020\t2\b\u0010\\\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010]\u001a\u00020\u0005HÖ\u0001J\t\u0010^\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020+¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0013\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010)R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010'R\u0013\u00100\u001a\u0004\u0018\u0001018F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b4\u0010)R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u00107\u001a\u000208¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b;\u0010%R\u0011\u0010\u0018\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b<\u0010%R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b=\u0010'R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\u0015\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b@\u0010%R\u0011\u0010\u0014\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bA\u0010%R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bB\u0010'R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bC\u0010'¨\u0006`"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/config/ContainerConfig;", "", "containerType", "Lcom/bamtechmedia/dominguez/core/content/containers/ContainerType;", "startMargin", "", "endMargin", "topMargin", "gridView", "", "contentClass", "", "setTitleValue", "isVisible", "tiles", "itemMargin", "aspectRatio", "Lcom/bamtechmedia/dominguez/core/content/assets/AspectRatio;", "listView", "imagePurpose", "tileTitle", "tileMeta", "scaleOnFocus", "", "snap", "tags", "", "analyticsValues", "Lcom/bamtechmedia/dominguez/collections/items/CollectionAnalyticsValues;", "(Lcom/bamtechmedia/dominguez/core/content/containers/ContainerType;IIIZLjava/lang/String;Ljava/lang/String;ZIILcom/bamtechmedia/dominguez/core/content/assets/AspectRatio;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Ljava/util/List;Lcom/bamtechmedia/dominguez/collections/items/CollectionAnalyticsValues;)V", "getAnalyticsValues", "()Lcom/bamtechmedia/dominguez/collections/items/CollectionAnalyticsValues;", "getAspectRatio", "()Lcom/bamtechmedia/dominguez/core/content/assets/AspectRatio;", "getContainerType", "()Lcom/bamtechmedia/dominguez/core/content/containers/ContainerType;", "getContentClass", "()Ljava/lang/String;", "getEndMargin", "()I", "getGridView", "()Z", "horizontalScrollBehaviour", "Lcom/bamtechmedia/dominguez/collections/config/ContainerConfig$HorizontalScrollBehaviour;", "getHorizontalScrollBehaviour", "()Lcom/bamtechmedia/dominguez/collections/config/ContainerConfig$HorizontalScrollBehaviour;", "getImagePurpose", "getItemMargin", "labelLocation", "Lcom/bamtechmedia/dominguez/collections/config/LabelLocation;", "getLabelLocation", "()Lcom/bamtechmedia/dominguez/collections/config/LabelLocation;", "getListView", "getScaleOnFocus", "()F", "setTitle", "Lcom/bamtechmedia/dominguez/collections/config/ContainerTitleLocation;", "getSetTitle", "()Lcom/bamtechmedia/dominguez/collections/config/ContainerTitleLocation;", "getSetTitleValue", "getSnap", "getStartMargin", "getTags", "()Ljava/util/List;", "getTileMeta", "getTileTitle", "getTiles", "getTopMargin", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "containsSetTag", "tag", "Lcom/bamtechmedia/dominguez/core/content/sets/SetTag;", "copy", "equals", "other", "hashCode", "toString", "HorizontalScrollBehaviour", "collectionsApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.o0.j */
/* compiled from: ContainerConfig.kt */
public final class C3444j {

    /* renamed from: a */
    private final C3451p f8674a;

    /* renamed from: b */
    private final C3445a f8675b;

    /* renamed from: c */
    private final ContainerType f8676c;

    /* renamed from: d */
    private final int f8677d;

    /* renamed from: e */
    private final int f8678e;

    /* renamed from: f */
    private final int f8679f;

    /* renamed from: g */
    private final boolean f8680g;

    /* renamed from: h */
    private final String f8681h;

    /* renamed from: i */
    private final String f8682i;

    /* renamed from: j */
    private final boolean f8683j;

    /* renamed from: k */
    private final int f8684k;

    /* renamed from: l */
    private final int f8685l;

    /* renamed from: m */
    private final C3623a f8686m;

    /* renamed from: n */
    private final boolean f8687n;

    /* renamed from: o */
    private final String f8688o;

    /* renamed from: p */
    private final String f8689p;

    /* renamed from: q */
    private final String f8690q;

    /* renamed from: r */
    private final float f8691r;

    /* renamed from: s */
    private final String f8692s;

    /* renamed from: t */
    private final List<String> f8693t;

    /* renamed from: u */
    private final C3343b f8694u;

    /* renamed from: com.bamtechmedia.dominguez.collections.o0.j$a */
    /* compiled from: ContainerConfig.kt */
    public enum C3445a {
        NO_SNAP("none"),
        PAGER_SNAP("paged"),
        HERO_SNAP("centerScale");
        

        /* renamed from: c */
        private final String f8699c;

        private C3445a(String str) {
            this.f8699c = str;
        }

        /* renamed from: a */
        public final String mo12641a() {
            return this.f8699c;
        }
    }

    public C3444j(ContainerType containerType, int i, int i2, int i3, boolean z, String str, String str2, boolean z2, int i4, int i5, C3623a aVar, boolean z3, String str3, String str4, String str5, float f, String str6, List<String> list, C3343b bVar) {
        C3451p pVar;
        C3445a aVar2;
        this.f8676c = containerType;
        this.f8677d = i;
        this.f8678e = i2;
        this.f8679f = i3;
        this.f8680g = z;
        this.f8681h = str;
        this.f8682i = str2;
        this.f8683j = z2;
        this.f8684k = i4;
        this.f8685l = i5;
        this.f8686m = aVar;
        this.f8687n = z3;
        this.f8688o = str3;
        this.f8689p = str4;
        this.f8690q = str5;
        this.f8691r = f;
        this.f8692s = str6;
        this.f8693t = list;
        this.f8694u = bVar;
        C3451p[] values = C3451p.values();
        int length = values.length;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                pVar = null;
                break;
            }
            pVar = values[i7];
            if (C12880j.m40224a((Object) pVar.mo12645a(), (Object) this.f8682i)) {
                break;
            }
            i7++;
        }
        if (pVar == null) {
            pVar = C3451p.NONE;
        }
        this.f8674a = pVar;
        C3445a[] values2 = C3445a.values();
        int length2 = values2.length;
        while (true) {
            if (i6 >= length2) {
                aVar2 = null;
                break;
            }
            aVar2 = values2[i6];
            if (C12880j.m40224a((Object) aVar2.mo12641a(), (Object) this.f8692s)) {
                break;
            }
            i6++;
        }
        if (aVar2 == null) {
            aVar2 = C3445a.NO_SNAP;
        }
        this.f8675b = aVar2;
    }

    /* renamed from: a */
    public static /* synthetic */ C3444j m11740a(C3444j jVar, ContainerType containerType, int i, int i2, int i3, boolean z, String str, String str2, boolean z2, int i4, int i5, C3623a aVar, boolean z3, String str3, String str4, String str5, float f, String str6, List list, C3343b bVar, int i6, Object obj) {
        C3444j jVar2 = jVar;
        int i7 = i6;
        return jVar.mo12619a((i7 & 1) != 0 ? jVar2.f8676c : containerType, (i7 & 2) != 0 ? jVar2.f8677d : i, (i7 & 4) != 0 ? jVar2.f8678e : i2, (i7 & 8) != 0 ? jVar2.f8679f : i3, (i7 & 16) != 0 ? jVar2.f8680g : z, (i7 & 32) != 0 ? jVar2.f8681h : str, (i7 & 64) != 0 ? jVar2.f8682i : str2, (i7 & 128) != 0 ? jVar2.f8683j : z2, (i7 & 256) != 0 ? jVar2.f8684k : i4, (i7 & DateUtils.FORMAT_NO_NOON) != 0 ? jVar2.f8685l : i5, (i7 & 1024) != 0 ? jVar2.f8686m : aVar, (i7 & DateUtils.FORMAT_NO_MIDNIGHT) != 0 ? jVar2.f8687n : z3, (i7 & 4096) != 0 ? jVar2.f8688o : str3, (i7 & ContentServiceClientExtras.URL_SIZE_LIMIT) != 0 ? jVar2.f8689p : str4, (i7 & DateUtils.FORMAT_ABBREV_TIME) != 0 ? jVar2.f8690q : str5, (i7 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? jVar2.f8691r : f, (i7 & DateUtils.FORMAT_ABBREV_MONTH) != 0 ? jVar2.f8692s : str6, (i7 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? jVar2.f8693t : list, (i7 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? jVar2.f8694u : bVar);
    }

    /* renamed from: a */
    public final C3343b mo12618a() {
        return this.f8694u;
    }

    /* renamed from: a */
    public final C3444j mo12619a(ContainerType containerType, int i, int i2, int i3, boolean z, String str, String str2, boolean z2, int i4, int i5, C3623a aVar, boolean z3, String str3, String str4, String str5, float f, String str6, List<String> list, C3343b bVar) {
        C3444j jVar = new C3444j(containerType, i, i2, i3, z, str, str2, z2, i4, i5, aVar, z3, str3, str4, str5, f, str6, list, bVar);
        return jVar;
    }

    /* renamed from: b */
    public final C3623a mo12621b() {
        return this.f8686m;
    }

    /* renamed from: c */
    public final ContainerType mo12622c() {
        return this.f8676c;
    }

    /* renamed from: d */
    public final String mo12623d() {
        return this.f8681h;
    }

    /* renamed from: e */
    public final int mo12624e() {
        return this.f8678e;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3444j) {
                C3444j jVar = (C3444j) obj;
                if (C12880j.m40224a((Object) this.f8676c, (Object) jVar.f8676c)) {
                    if (this.f8677d == jVar.f8677d) {
                        if (this.f8678e == jVar.f8678e) {
                            if (this.f8679f == jVar.f8679f) {
                                if ((this.f8680g == jVar.f8680g) && C12880j.m40224a((Object) this.f8681h, (Object) jVar.f8681h) && C12880j.m40224a((Object) this.f8682i, (Object) jVar.f8682i)) {
                                    if (this.f8683j == jVar.f8683j) {
                                        if (this.f8684k == jVar.f8684k) {
                                            if ((this.f8685l == jVar.f8685l) && C12880j.m40224a((Object) this.f8686m, (Object) jVar.f8686m)) {
                                                if (!(this.f8687n == jVar.f8687n) || !C12880j.m40224a((Object) this.f8688o, (Object) jVar.f8688o) || !C12880j.m40224a((Object) this.f8689p, (Object) jVar.f8689p) || !C12880j.m40224a((Object) this.f8690q, (Object) jVar.f8690q) || Float.compare(this.f8691r, jVar.f8691r) != 0 || !C12880j.m40224a((Object) this.f8692s, (Object) jVar.f8692s) || !C12880j.m40224a((Object) this.f8693t, (Object) jVar.f8693t) || !C12880j.m40224a((Object) this.f8694u, (Object) jVar.f8694u)) {
                                                    return false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo12626f() {
        return this.f8680g;
    }

    /* renamed from: g */
    public final C3445a mo12627g() {
        return this.f8675b;
    }

    /* renamed from: h */
    public final String mo12628h() {
        return this.f8688o;
    }

    public int hashCode() {
        ContainerType containerType = this.f8676c;
        int i = 0;
        int hashCode = (((((((containerType != null ? containerType.hashCode() : 0) * 31) + this.f8677d) * 31) + this.f8678e) * 31) + this.f8679f) * 31;
        boolean z = this.f8680g;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        String str = this.f8681h;
        int hashCode2 = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8682i;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z2 = this.f8683j;
        if (z2) {
            z2 = true;
        }
        int i3 = (((((hashCode3 + (z2 ? 1 : 0)) * 31) + this.f8684k) * 31) + this.f8685l) * 31;
        C3623a aVar = this.f8686m;
        int hashCode4 = (i3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        boolean z3 = this.f8687n;
        if (z3) {
            z3 = true;
        }
        int i4 = (hashCode4 + (z3 ? 1 : 0)) * 31;
        String str3 = this.f8688o;
        int hashCode5 = (i4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f8689p;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f8690q;
        int hashCode7 = (((hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31) + Float.floatToIntBits(this.f8691r)) * 31;
        String str6 = this.f8692s;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        List<String> list = this.f8693t;
        int hashCode9 = (hashCode8 + (list != null ? list.hashCode() : 0)) * 31;
        C3343b bVar = this.f8694u;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode9 + i;
    }

    /* renamed from: i */
    public final int mo12630i() {
        return this.f8685l;
    }

    /* renamed from: j */
    public final C3452q mo12631j() {
        String str = this.f8689p;
        int hashCode = str.hashCode();
        if (hashCode != 3423444) {
            if (hashCode != 93621297) {
                if (hashCode == 960955382 && str.equals("over_bottom")) {
                    return C3452q.OVER_BOTTOM;
                }
            } else if (str.equals("below")) {
                return C3452q.UNDER;
            }
        } else if (str.equals("over")) {
            return C3452q.OVER;
        }
        return null;
    }

    /* renamed from: k */
    public final boolean mo12632k() {
        return this.f8687n;
    }

    /* renamed from: l */
    public final float mo12633l() {
        return this.f8691r;
    }

    /* renamed from: m */
    public final C3451p mo12634m() {
        return this.f8674a;
    }

    /* renamed from: n */
    public final int mo12635n() {
        return this.f8677d;
    }

    /* renamed from: o */
    public final String mo12636o() {
        return this.f8690q;
    }

    /* renamed from: p */
    public final int mo12637p() {
        return this.f8684k;
    }

    /* renamed from: q */
    public final int mo12638q() {
        return this.f8679f;
    }

    /* renamed from: r */
    public final boolean mo12639r() {
        return this.f8683j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContainerConfig(containerType=");
        sb.append(this.f8676c);
        sb.append(", startMargin=");
        sb.append(this.f8677d);
        sb.append(", endMargin=");
        sb.append(this.f8678e);
        sb.append(", topMargin=");
        sb.append(this.f8679f);
        sb.append(", gridView=");
        sb.append(this.f8680g);
        sb.append(", contentClass=");
        sb.append(this.f8681h);
        sb.append(", setTitleValue=");
        sb.append(this.f8682i);
        sb.append(", isVisible=");
        sb.append(this.f8683j);
        sb.append(", tiles=");
        sb.append(this.f8684k);
        sb.append(", itemMargin=");
        sb.append(this.f8685l);
        sb.append(", aspectRatio=");
        sb.append(this.f8686m);
        sb.append(", listView=");
        sb.append(this.f8687n);
        sb.append(", imagePurpose=");
        sb.append(this.f8688o);
        sb.append(", tileTitle=");
        sb.append(this.f8689p);
        sb.append(", tileMeta=");
        sb.append(this.f8690q);
        sb.append(", scaleOnFocus=");
        sb.append(this.f8691r);
        sb.append(", snap=");
        sb.append(this.f8692s);
        sb.append(", tags=");
        sb.append(this.f8693t);
        sb.append(", analyticsValues=");
        sb.append(this.f8694u);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo12620a(C3788m mVar) {
        return this.f8693t.contains(mVar.mo13693a());
    }
}
