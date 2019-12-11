package com.bamtechmedia.dominguez.core.content.assets;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;
import kotlin.Metadata;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006!"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/Rating;", "Landroid/os/Parcelable;", "value", "", "system", "advisories", "", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getAdvisories", "()Ljava/util/List;", "getDescription", "()Ljava/lang/String;", "getSystem", "getValue", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: Rating.kt */
public final class Rating implements Parcelable {
    public static final Creator CREATOR = new C3618a();

    /* renamed from: U */
    private final String f9102U;

    /* renamed from: V */
    private final List<String> f9103V;

    /* renamed from: W */
    private final String f9104W;

    /* renamed from: c */
    private final String f9105c;

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.Rating$a */
    public static class C3618a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            return new Rating(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new Rating[i];
        }
    }

    public Rating(String str, String str2, List<String> list, String str3) {
        this.f9105c = str;
        this.f9102U = str2;
        this.f9103V = list;
        this.f9104W = str3;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.String>, for r3v0, types: [java.util.List] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bamtechmedia.dominguez.core.content.assets.Rating m12301a(com.bamtechmedia.dominguez.core.content.assets.Rating r0, java.lang.String r1, java.lang.String r2, java.util.List<java.lang.String> r3, java.lang.String r4, int r5, java.lang.Object r6) {
        /*
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0006
            java.lang.String r1 = r0.f9105c
        L_0x0006:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x000c
            java.lang.String r2 = r0.f9102U
        L_0x000c:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0012
            java.util.List<java.lang.String> r3 = r0.f9103V
        L_0x0012:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0018
            java.lang.String r4 = r0.f9104W
        L_0x0018:
            com.bamtechmedia.dominguez.core.content.assets.Rating r0 = r0.mo13189a(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.assets.Rating.m12301a(com.bamtechmedia.dominguez.core.content.assets.Rating, java.lang.String, java.lang.String, java.util.List, java.lang.String, int, java.lang.Object):com.bamtechmedia.dominguez.core.content.assets.Rating");
    }

    /* renamed from: X */
    public final List<String> mo13186X() {
        return this.f9103V;
    }

    /* renamed from: Y */
    public final String mo13187Y() {
        return this.f9102U;
    }

    /* renamed from: Z */
    public final String mo13188Z() {
        return this.f9105c;
    }

    /* renamed from: a */
    public final Rating mo13189a(String str, String str2, List<String> list, String str3) {
        return new Rating(str, str2, list, str3);
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f9104W, (java.lang.Object) r3.f9104W) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.core.content.assets.Rating
            if (r0 == 0) goto L_0x0031
            com.bamtechmedia.dominguez.core.content.assets.Rating r3 = (com.bamtechmedia.dominguez.core.content.assets.Rating) r3
            java.lang.String r0 = r2.f9105c
            java.lang.String r1 = r3.f9105c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f9102U
            java.lang.String r1 = r3.f9102U
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.util.List<java.lang.String> r0 = r2.f9103V
            java.util.List<java.lang.String> r1 = r3.f9103V
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f9104W
            java.lang.String r3 = r3.f9104W
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.assets.Rating.equals(java.lang.Object):boolean");
    }

    public final String getDescription() {
        return this.f9104W;
    }

    public int hashCode() {
        String str = this.f9105c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9102U;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list = this.f9103V;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str3 = this.f9104W;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating(value=");
        sb.append(this.f9105c);
        sb.append(", system=");
        sb.append(this.f9102U);
        sb.append(", advisories=");
        sb.append(this.f9103V);
        sb.append(", description=");
        sb.append(this.f9104W);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9105c);
        parcel.writeString(this.f9102U);
        parcel.writeStringList(this.f9103V);
        parcel.writeString(this.f9104W);
    }

    public /* synthetic */ Rating(String str, String str2, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            list = C13185o.m40513a();
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        this(str, str2, list, str3);
    }
}
