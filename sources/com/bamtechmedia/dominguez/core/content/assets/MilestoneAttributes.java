package com.bamtechmedia.dominguez.core.content.assets;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.Metadata;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/MilestoneAttributes;", "Landroid/os/Parcelable;", "type", "", "startMillis", "", "(Ljava/lang/String;Ljava/lang/Long;)V", "getStartMillis", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Long;)Lcom/bamtechmedia/dominguez/core/content/assets/MilestoneAttributes;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: Milestones.kt */
public final class MilestoneAttributes implements Parcelable {
    public static final Creator CREATOR = new C3613a();

    /* renamed from: U */
    private final Long f9092U;

    /* renamed from: c */
    private final String f9093c;

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.MilestoneAttributes$a */
    public static class C3613a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            return new MilestoneAttributes(parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        public final Object[] newArray(int i) {
            return new MilestoneAttributes[i];
        }
    }

    public MilestoneAttributes(String str, Long l) {
        this.f9093c = str;
        this.f9092U = l;
    }

    /* renamed from: X */
    public final Long mo13137X() {
        return this.f9092U;
    }

    /* renamed from: Y */
    public final String mo13138Y() {
        return this.f9093c;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f9092U, (java.lang.Object) r3.f9092U) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.core.content.assets.MilestoneAttributes
            if (r0 == 0) goto L_0x001d
            com.bamtechmedia.dominguez.core.content.assets.MilestoneAttributes r3 = (com.bamtechmedia.dominguez.core.content.assets.MilestoneAttributes) r3
            java.lang.String r0 = r2.f9093c
            java.lang.String r1 = r3.f9093c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.Long r0 = r2.f9092U
            java.lang.Long r3 = r3.f9092U
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.assets.MilestoneAttributes.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f9093c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l = this.f9092U;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MilestoneAttributes(type=");
        sb.append(this.f9093c);
        sb.append(", startMillis=");
        sb.append(this.f9092U);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9093c);
        Long l = this.f9092U;
        if (l != null) {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
            return;
        }
        parcel.writeInt(0);
    }
}
