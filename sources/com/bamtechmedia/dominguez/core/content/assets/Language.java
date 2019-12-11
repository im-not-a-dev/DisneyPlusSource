package com.bamtechmedia.dominguez.core.content.assets;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;
import kotlin.Metadata;
import p163g.p500m.p501a.C11724g;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003JG\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\b\u0010\u0004\u001a\u0004\u0018\u00010\u001fJ\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0018HÖ\u0001R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006%"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/Language;", "Landroid/os/Parcelable;", "name", "", "trackType", "renditionName", "languageCode", "features", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getFeatures", "()Ljava/util/List;", "getLanguageCode", "()Ljava/lang/String;", "getName", "getRenditionName", "getTrackType", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "Lcom/bamtechmedia/dominguez/core/content/assets/TrackType;", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: Languages.kt */
public final class Language implements Parcelable {
    public static final Creator CREATOR = new C3610a();

    /* renamed from: U */
    private final String f9084U;

    /* renamed from: V */
    private final String f9085V;

    /* renamed from: W */
    private final String f9086W;

    /* renamed from: X */
    private final List<String> f9087X;

    /* renamed from: c */
    private final String f9088c;

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.Language$a */
    public static class C3610a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            Language language = new Language(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            return language;
        }

        public final Object[] newArray(int i) {
            return new Language[i];
        }
    }

    public Language(String str, String str2, String str3, @C11724g(name = "language") String str4, List<String> list) {
        this.f9088c = str;
        this.f9084U = str2;
        this.f9085V = str3;
        this.f9086W = str4;
        this.f9087X = list;
    }

    /* renamed from: X */
    public final List<String> mo13103X() {
        return this.f9087X;
    }

    /* renamed from: Y */
    public final String mo13104Y() {
        return this.f9086W;
    }

    /* renamed from: Z */
    public final String mo13105Z() {
        return this.f9088c;
    }

    /* renamed from: a0 */
    public final String mo13106a0() {
        return this.f9085V;
    }

    /* renamed from: b0 */
    public final String mo13107b0() {
        return this.f9084U;
    }

    public final Language copy(String str, String str2, String str3, @C11724g(name = "language") String str4, List<String> list) {
        Language language = new Language(str, str2, str3, str4, list);
        return language;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f9087X, (java.lang.Object) r3.f9087X) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.core.content.assets.Language
            if (r0 == 0) goto L_0x003b
            com.bamtechmedia.dominguez.core.content.assets.Language r3 = (com.bamtechmedia.dominguez.core.content.assets.Language) r3
            java.lang.String r0 = r2.f9088c
            java.lang.String r1 = r3.f9088c
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f9084U
            java.lang.String r1 = r3.f9084U
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f9085V
            java.lang.String r1 = r3.f9085V
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f9086W
            java.lang.String r1 = r3.f9086W
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.util.List<java.lang.String> r0 = r2.f9087X
            java.util.List<java.lang.String> r3 = r3.f9087X
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            return r3
        L_0x003d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.assets.Language.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f9088c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9084U;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9085V;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f9086W;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List<String> list = this.f9087X;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Language(name=");
        sb.append(this.f9088c);
        sb.append(", trackType=");
        sb.append(this.f9084U);
        sb.append(", renditionName=");
        sb.append(this.f9085V);
        sb.append(", languageCode=");
        sb.append(this.f9086W);
        sb.append(", features=");
        sb.append(this.f9087X);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9088c);
        parcel.writeString(this.f9084U);
        parcel.writeString(this.f9085V);
        parcel.writeString(this.f9086W);
        parcel.writeStringList(this.f9087X);
    }
}
