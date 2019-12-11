package com.bamtechmedia.dominguez.profiles;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010JD\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\t\u0010\u0019\u001a\u00020\bHÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006%"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/AvatarImpl;", "Lcom/bamtechmedia/dominguez/profiles/Avatar;", "avatarId", "", "avatarTitle", "imageUrl", "masterId", "masterWidth", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getAvatarId", "()Ljava/lang/String;", "getAvatarTitle", "getImageUrl", "getMasterId", "getMasterWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/bamtechmedia/dominguez/profiles/AvatarImpl;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.h */
/* compiled from: AvatarImpl.kt */
public final class C6669h implements C6653e {
    public static final Creator CREATOR = new C6670a();

    /* renamed from: U */
    private final String f15020U;

    /* renamed from: V */
    private final String f15021V;

    /* renamed from: W */
    private final String f15022W;

    /* renamed from: X */
    private final Integer f15023X;

    /* renamed from: c */
    private final String f15024c;

    /* renamed from: com.bamtechmedia.dominguez.profiles.h$a */
    public static class C6670a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C6669h hVar = new C6669h(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            return hVar;
        }

        public final Object[] newArray(int i) {
            return new C6669h[i];
        }
    }

    public C6669h(String str, String str2, String str3, String str4, Integer num) {
        this.f15024c = str;
        this.f15020U = str2;
        this.f15021V = str3;
        this.f15022W = str4;
        this.f15023X = num;
    }

    /* renamed from: U */
    public String mo19331U() {
        return this.f15022W;
    }

    /* renamed from: V */
    public String mo19332V() {
        return this.f15020U;
    }

    /* renamed from: a */
    public String mo19384a() {
        return this.f15021V;
    }

    /* renamed from: b */
    public Integer mo19385b() {
        return this.f15023X;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) mo19385b(), (java.lang.Object) r3.mo19385b()) != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0051
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.profiles.C6669h
            if (r0 == 0) goto L_0x004f
            com.bamtechmedia.dominguez.profiles.h r3 = (com.bamtechmedia.dominguez.profiles.C6669h) r3
            java.lang.String r0 = r2.mo19333j()
            java.lang.String r1 = r3.mo19333j()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.mo19332V()
            java.lang.String r1 = r3.mo19332V()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.mo19384a()
            java.lang.String r1 = r3.mo19384a()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.mo19331U()
            java.lang.String r1 = r3.mo19331U()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.Integer r0 = r2.mo19385b()
            java.lang.Integer r3 = r3.mo19385b()
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r3 = 0
            return r3
        L_0x0051:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.profiles.C6669h.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String j = mo19333j();
        int i = 0;
        int hashCode = (j != null ? j.hashCode() : 0) * 31;
        String V = mo19332V();
        int hashCode2 = (hashCode + (V != null ? V.hashCode() : 0)) * 31;
        String a = mo19384a();
        int hashCode3 = (hashCode2 + (a != null ? a.hashCode() : 0)) * 31;
        String U = mo19331U();
        int hashCode4 = (hashCode3 + (U != null ? U.hashCode() : 0)) * 31;
        Integer b = mo19385b();
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode4 + i;
    }

    /* renamed from: j */
    public String mo19333j() {
        return this.f15024c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AvatarImpl(avatarId=");
        sb.append(mo19333j());
        sb.append(", avatarTitle=");
        sb.append(mo19332V());
        sb.append(", imageUrl=");
        sb.append(mo19384a());
        sb.append(", masterId=");
        sb.append(mo19331U());
        sb.append(", masterWidth=");
        sb.append(mo19385b());
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeString(this.f15024c);
        parcel.writeString(this.f15020U);
        parcel.writeString(this.f15021V);
        parcel.writeString(this.f15022W);
        Integer num = this.f15023X;
        if (num != null) {
            parcel.writeInt(1);
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
    }
}
