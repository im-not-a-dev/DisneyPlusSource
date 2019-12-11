package com.bamtechmedia.dominguez.core.content;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.Metadata;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/GenreMeta;", "Landroid/os/Parcelable;", "partnerId", "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getPartnerId", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: DmcInterfaces.kt */
public final class GenreMeta implements Parcelable {
    public static final Creator CREATOR = new C3591a();

    /* renamed from: U */
    private final String f8930U;

    /* renamed from: c */
    private final String f8931c;

    /* renamed from: com.bamtechmedia.dominguez.core.content.GenreMeta$a */
    public static class C3591a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            return new GenreMeta(parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new GenreMeta[i];
        }
    }

    public GenreMeta(String str, String str2) {
        this.f8931c = str;
        this.f8930U = str2;
    }

    /* renamed from: X */
    public final String mo12797X() {
        return this.f8930U;
    }

    /* renamed from: Y */
    public final String mo12798Y() {
        return this.f8931c;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f8930U, (java.lang.Object) r3.f8930U) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.core.content.GenreMeta
            if (r0 == 0) goto L_0x001d
            com.bamtechmedia.dominguez.core.content.GenreMeta r3 = (com.bamtechmedia.dominguez.core.content.GenreMeta) r3
            java.lang.String r0 = r2.f8931c
            java.lang.String r1 = r3.f8931c
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f8930U
            java.lang.String r3 = r3.f8930U
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.GenreMeta.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f8931c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f8930U;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GenreMeta(partnerId=");
        sb.append(this.f8931c);
        sb.append(", name=");
        sb.append(this.f8930U);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8931c);
        parcel.writeString(this.f8930U);
    }
}
