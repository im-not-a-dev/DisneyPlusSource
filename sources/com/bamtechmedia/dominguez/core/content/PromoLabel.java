package com.bamtechmedia.dominguez.core.content;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.Metadata;
import org.joda.time.DateTime;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\rJP\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001dJ\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\tHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0019\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\tHÖ\u0001R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011¨\u0006*"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/PromoLabel;", "Landroid/os/Parcelable;", "type", "", "sunrise", "Lorg/joda/time/DateTime;", "sunset", "subType", "seasonNumber", "", "episodeSequenceNumber", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getEpisodeSequenceNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSeasonNumber", "getSubType", "()Ljava/lang/String;", "getSunrise", "()Lorg/joda/time/DateTime;", "getSunset", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/bamtechmedia/dominguez/core/content/PromoLabel;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: DmcInterfaces.kt */
public final class PromoLabel implements Parcelable {
    public static final Creator CREATOR = new C3592a();

    /* renamed from: U */
    private final DateTime f8932U;

    /* renamed from: V */
    private final DateTime f8933V;

    /* renamed from: W */
    private final String f8934W;

    /* renamed from: X */
    private final Integer f8935X;

    /* renamed from: Y */
    private final Integer f8936Y;

    /* renamed from: c */
    private final String f8937c;

    /* renamed from: com.bamtechmedia.dominguez.core.content.PromoLabel$a */
    public static class C3592a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            PromoLabel promoLabel = new PromoLabel(parcel.readString(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            return promoLabel;
        }

        public final Object[] newArray(int i) {
            return new PromoLabel[i];
        }
    }

    public PromoLabel(String str, DateTime dateTime, DateTime dateTime2, String str2, Integer num, Integer num2) {
        this.f8937c = str;
        this.f8932U = dateTime;
        this.f8933V = dateTime2;
        this.f8934W = str2;
        this.f8935X = num;
        this.f8936Y = num2;
    }

    /* renamed from: a */
    public static /* synthetic */ PromoLabel m12081a(PromoLabel promoLabel, String str, DateTime dateTime, DateTime dateTime2, String str2, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = promoLabel.f8937c;
        }
        if ((i & 2) != 0) {
            dateTime = promoLabel.f8932U;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = promoLabel.f8933V;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            str2 = promoLabel.f8934W;
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            num = promoLabel.f8935X;
        }
        Integer num3 = num;
        if ((i & 32) != 0) {
            num2 = promoLabel.f8936Y;
        }
        return promoLabel.mo12812a(str, dateTime3, dateTime4, str3, num3, num2);
    }

    /* renamed from: F */
    public final Integer mo12808F() {
        return this.f8935X;
    }

    /* renamed from: X */
    public final Integer mo12809X() {
        return this.f8936Y;
    }

    /* renamed from: Y */
    public final String mo12810Y() {
        return this.f8934W;
    }

    /* renamed from: Z */
    public final DateTime mo12811Z() {
        return this.f8932U;
    }

    /* renamed from: a */
    public final PromoLabel mo12812a(String str, DateTime dateTime, DateTime dateTime2, String str2, Integer num, Integer num2) {
        PromoLabel promoLabel = new PromoLabel(str, dateTime, dateTime2, str2, num, num2);
        return promoLabel;
    }

    /* renamed from: a0 */
    public final DateTime mo12813a0() {
        return this.f8933V;
    }

    /* renamed from: b0 */
    public final String mo12814b0() {
        return this.f8937c;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f8936Y, (java.lang.Object) r3.f8936Y) != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0047
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.core.content.PromoLabel
            if (r0 == 0) goto L_0x0045
            com.bamtechmedia.dominguez.core.content.PromoLabel r3 = (com.bamtechmedia.dominguez.core.content.PromoLabel) r3
            java.lang.String r0 = r2.f8937c
            java.lang.String r1 = r3.f8937c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0045
            org.joda.time.DateTime r0 = r2.f8932U
            org.joda.time.DateTime r1 = r3.f8932U
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0045
            org.joda.time.DateTime r0 = r2.f8933V
            org.joda.time.DateTime r1 = r3.f8933V
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.f8934W
            java.lang.String r1 = r3.f8934W
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.Integer r0 = r2.f8935X
            java.lang.Integer r1 = r3.f8935X
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.Integer r0 = r2.f8936Y
            java.lang.Integer r3 = r3.f8936Y
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r3 = 0
            return r3
        L_0x0047:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.PromoLabel.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f8937c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        DateTime dateTime = this.f8932U;
        int hashCode2 = (hashCode + (dateTime != null ? dateTime.hashCode() : 0)) * 31;
        DateTime dateTime2 = this.f8933V;
        int hashCode3 = (hashCode2 + (dateTime2 != null ? dateTime2.hashCode() : 0)) * 31;
        String str2 = this.f8934W;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f8935X;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f8936Y;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PromoLabel(type=");
        sb.append(this.f8937c);
        sb.append(", sunrise=");
        sb.append(this.f8932U);
        sb.append(", sunset=");
        sb.append(this.f8933V);
        sb.append(", subType=");
        sb.append(this.f8934W);
        sb.append(", seasonNumber=");
        sb.append(this.f8935X);
        sb.append(", episodeSequenceNumber=");
        sb.append(this.f8936Y);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8937c);
        parcel.writeSerializable(this.f8932U);
        parcel.writeSerializable(this.f8933V);
        parcel.writeString(this.f8934W);
        Integer num = this.f8935X;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num2 = this.f8936Y;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
            return;
        }
        parcel.writeInt(0);
    }

    public /* synthetic */ PromoLabel(String str, DateTime dateTime, DateTime dateTime2, String str2, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, dateTime, dateTime2, str2, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2);
    }
}
