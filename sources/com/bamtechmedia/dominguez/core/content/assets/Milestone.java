package com.bamtechmedia.dominguez.core.content.assets;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/Milestone;", "Landroid/os/Parcelable;", "milestoneTime", "", "Lcom/bamtechmedia/dominguez/core/content/assets/MilestoneAttributes;", "milestoneType", "", "(Ljava/util/List;Ljava/lang/String;)V", "getMilestoneTime", "()Ljava/util/List;", "getMilestoneType", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: Milestones.kt */
public final class Milestone implements Parcelable {
    public static final Creator CREATOR = new C3612a();

    /* renamed from: U */
    private final String f9090U;

    /* renamed from: c */
    private final List<MilestoneAttributes> f9091c;

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.Milestone$a */
    public static class C3612a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((MilestoneAttributes) MilestoneAttributes.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new Milestone(arrayList, parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new Milestone[i];
        }
    }

    public Milestone(List<MilestoneAttributes> list, String str) {
        this.f9091c = list;
        this.f9090U = str;
    }

    /* renamed from: X */
    public final List<MilestoneAttributes> mo13128X() {
        return this.f9091c;
    }

    /* renamed from: Y */
    public final String mo13129Y() {
        return this.f9090U;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f9090U, (java.lang.Object) r3.f9090U) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.core.content.assets.Milestone
            if (r0 == 0) goto L_0x001d
            com.bamtechmedia.dominguez.core.content.assets.Milestone r3 = (com.bamtechmedia.dominguez.core.content.assets.Milestone) r3
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.MilestoneAttributes> r0 = r2.f9091c
            java.util.List<com.bamtechmedia.dominguez.core.content.assets.MilestoneAttributes> r1 = r3.f9091c
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f9090U
            java.lang.String r3 = r3.f9090U
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.assets.Milestone.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        List<MilestoneAttributes> list = this.f9091c;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f9090U;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Milestone(milestoneTime=");
        sb.append(this.f9091c);
        sb.append(", milestoneType=");
        sb.append(this.f9090U);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        List<MilestoneAttributes> list = this.f9091c;
        parcel.writeInt(list.size());
        for (MilestoneAttributes writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        parcel.writeString(this.f9090U);
    }
}
