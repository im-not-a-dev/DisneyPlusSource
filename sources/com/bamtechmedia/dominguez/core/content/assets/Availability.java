package com.bamtechmedia.dominguez.core.content.assets;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.Metadata;
import org.joda.time.DateTime;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u000fJH\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001dJ\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0013\u0010 \u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001fHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0019\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/Availability;", "Landroid/os/Parcelable;", "region", "", "appears", "Lorg/joda/time/DateTime;", "expires", "minPromotionalStartDate", "kidsMode", "", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;)V", "getAppears", "()Lorg/joda/time/DateTime;", "getExpires", "getKidsMode", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMinPromotionalStartDate", "getRegion", "()Ljava/lang/String;", "safeForKids", "getSafeForKids", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;)Lcom/bamtechmedia/dominguez/core/content/assets/Availability;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: Availability.kt */
public final class Availability implements Parcelable {
    public static final Creator CREATOR = new C3595a();

    /* renamed from: U */
    private final DateTime f8938U;

    /* renamed from: V */
    private final DateTime f8939V;

    /* renamed from: W */
    private final DateTime f8940W;

    /* renamed from: X */
    private final Boolean f8941X;

    /* renamed from: c */
    private final String f8942c;

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.Availability$a */
    public static class C3595a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            Boolean bool;
            String readString = parcel.readString();
            DateTime dateTime = (DateTime) parcel.readSerializable();
            DateTime dateTime2 = (DateTime) parcel.readSerializable();
            DateTime dateTime3 = (DateTime) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            Availability availability = new Availability(readString, dateTime, dateTime2, dateTime3, bool);
            return availability;
        }

        public final Object[] newArray(int i) {
            return new Availability[i];
        }
    }

    public Availability(String str, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, Boolean bool) {
        this.f8942c = str;
        this.f8938U = dateTime;
        this.f8939V = dateTime2;
        this.f8940W = dateTime3;
        this.f8941X = bool;
    }

    /* renamed from: X */
    public final DateTime mo12825X() {
        return this.f8938U;
    }

    /* renamed from: Y */
    public final DateTime mo12826Y() {
        return this.f8939V;
    }

    /* renamed from: Z */
    public final Boolean mo12827Z() {
        return this.f8941X;
    }

    /* renamed from: a0 */
    public final DateTime mo12828a0() {
        return this.f8940W;
    }

    /* renamed from: b0 */
    public final String mo12829b0() {
        return this.f8942c;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f8941X, (java.lang.Object) r3.f8941X) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.core.content.assets.Availability
            if (r0 == 0) goto L_0x003b
            com.bamtechmedia.dominguez.core.content.assets.Availability r3 = (com.bamtechmedia.dominguez.core.content.assets.Availability) r3
            java.lang.String r0 = r2.f8942c
            java.lang.String r1 = r3.f8942c
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x003b
            org.joda.time.DateTime r0 = r2.f8938U
            org.joda.time.DateTime r1 = r3.f8938U
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x003b
            org.joda.time.DateTime r0 = r2.f8939V
            org.joda.time.DateTime r1 = r3.f8939V
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x003b
            org.joda.time.DateTime r0 = r2.f8940W
            org.joda.time.DateTime r1 = r3.f8940W
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.Boolean r0 = r2.f8941X
            java.lang.Boolean r3 = r3.f8941X
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.assets.Availability.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f8942c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        DateTime dateTime = this.f8938U;
        int hashCode2 = (hashCode + (dateTime != null ? dateTime.hashCode() : 0)) * 31;
        DateTime dateTime2 = this.f8939V;
        int hashCode3 = (hashCode2 + (dateTime2 != null ? dateTime2.hashCode() : 0)) * 31;
        DateTime dateTime3 = this.f8940W;
        int hashCode4 = (hashCode3 + (dateTime3 != null ? dateTime3.hashCode() : 0)) * 31;
        Boolean bool = this.f8941X;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Availability(region=");
        sb.append(this.f8942c);
        sb.append(", appears=");
        sb.append(this.f8938U);
        sb.append(", expires=");
        sb.append(this.f8939V);
        sb.append(", minPromotionalStartDate=");
        sb.append(this.f8940W);
        sb.append(", kidsMode=");
        sb.append(this.f8941X);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        boolean z;
        parcel.writeString(this.f8942c);
        parcel.writeSerializable(this.f8938U);
        parcel.writeSerializable(this.f8939V);
        parcel.writeSerializable(this.f8940W);
        Boolean bool = this.f8941X;
        if (bool != null) {
            parcel.writeInt(1);
            z = bool.booleanValue();
        } else {
            z = false;
        }
        parcel.writeInt(z ? 1 : 0);
    }
}
