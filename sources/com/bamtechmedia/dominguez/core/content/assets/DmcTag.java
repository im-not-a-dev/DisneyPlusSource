package com.bamtechmedia.dominguez.core.content.assets;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\r\u0010\u0016\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0017J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/DmcTag;", "Landroid/os/Parcelable;", "type", "", "value", "displayName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "getType", "getValue", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "isOriginal", "isOriginal$coreContent_release", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: DmcTag.kt */
public final class DmcTag implements Parcelable {
    public static final Creator CREATOR = new C3605a();

    /* renamed from: U */
    private final String f9070U;

    /* renamed from: V */
    private final String f9071V;

    /* renamed from: c */
    private final String f9072c;

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.DmcTag$a */
    public static class C3605a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            return new DmcTag(parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new DmcTag[i];
        }
    }

    public DmcTag(String str, String str2, String str3) {
        this.f9072c = str;
        this.f9070U = str2;
        this.f9071V = str3;
    }

    /* renamed from: X */
    public final String mo13052X() {
        return this.f9071V;
    }

    /* renamed from: Y */
    public final String mo13053Y() {
        return this.f9072c;
    }

    /* renamed from: Z */
    public final String mo13054Z() {
        return this.f9070U;
    }

    /* renamed from: a0 */
    public final boolean mo13055a0() {
        return Intrinsics.areEqual((Object) this.f9072c, (Object) "disneyPlusOriginal") && Intrinsics.areEqual((Object) this.f9070U, (Object) "true");
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f9071V, (java.lang.Object) r3.f9071V) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.core.content.assets.DmcTag
            if (r0 == 0) goto L_0x0027
            com.bamtechmedia.dominguez.core.content.assets.DmcTag r3 = (com.bamtechmedia.dominguez.core.content.assets.DmcTag) r3
            java.lang.String r0 = r2.f9072c
            java.lang.String r1 = r3.f9072c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f9070U
            java.lang.String r1 = r3.f9070U
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f9071V
            java.lang.String r3 = r3.f9071V
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.assets.DmcTag.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f9072c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9070U;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9071V;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DmcTag(type=");
        sb.append(this.f9072c);
        sb.append(", value=");
        sb.append(this.f9070U);
        sb.append(", displayName=");
        sb.append(this.f9071V);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9072c);
        parcel.writeString(this.f9070U);
        parcel.writeString(this.f9071V);
    }
}
