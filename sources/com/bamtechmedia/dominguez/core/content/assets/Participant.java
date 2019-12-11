package com.bamtechmedia.dominguez.core.content.assets;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.Metadata;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\fJ8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006#"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/Participant;", "Landroid/os/Parcelable;", "displayName", "", "sortName", "role", "order", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getDisplayName", "()Ljava/lang/String;", "getOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRole", "getSortName", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/bamtechmedia/dominguez/core/content/assets/Participant;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: Participant.kt */
public final class Participant implements Parcelable {
    public static final Creator CREATOR = new C3615b();

    /* renamed from: U */
    private final String f9094U;

    /* renamed from: V */
    private final String f9095V;

    /* renamed from: W */
    private final Integer f9096W;

    /* renamed from: c */
    private final String f9097c;

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.Participant$a */
    /* compiled from: Participant.kt */
    public static final class C3614a {
        private C3614a() {
        }

        public /* synthetic */ C3614a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.Participant$b */
    public static class C3615b implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            return new Participant(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        public final Object[] newArray(int i) {
            return new Participant[i];
        }
    }

    static {
        new C3614a(null);
    }

    public Participant(String str, String str2, String str3, Integer num) {
        this.f9097c = str;
        this.f9094U = str2;
        this.f9095V = str3;
        this.f9096W = num;
    }

    /* renamed from: a */
    public static /* synthetic */ Participant m12285a(Participant participant, String str, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = participant.f9097c;
        }
        if ((i & 2) != 0) {
            str2 = participant.f9094U;
        }
        if ((i & 4) != 0) {
            str3 = participant.f9095V;
        }
        if ((i & 8) != 0) {
            num = participant.f9096W;
        }
        return participant.mo13153a(str, str2, str3, num);
    }

    /* renamed from: X */
    public final String mo13150X() {
        return this.f9097c;
    }

    /* renamed from: Y */
    public final Integer mo13151Y() {
        return this.f9096W;
    }

    /* renamed from: Z */
    public final String mo13152Z() {
        return this.f9095V;
    }

    /* renamed from: a */
    public final Participant mo13153a(String str, String str2, String str3, Integer num) {
        return new Participant(str, str2, str3, num);
    }

    /* renamed from: a0 */
    public final String mo13154a0() {
        return this.f9094U;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f9096W, (java.lang.Object) r3.f9096W) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.core.content.assets.Participant
            if (r0 == 0) goto L_0x0031
            com.bamtechmedia.dominguez.core.content.assets.Participant r3 = (com.bamtechmedia.dominguez.core.content.assets.Participant) r3
            java.lang.String r0 = r2.f9097c
            java.lang.String r1 = r3.f9097c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f9094U
            java.lang.String r1 = r3.f9094U
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f9095V
            java.lang.String r1 = r3.f9095V
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.Integer r0 = r2.f9096W
            java.lang.Integer r3 = r3.f9096W
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.assets.Participant.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f9097c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9094U;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9095V;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.f9096W;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Participant(displayName=");
        sb.append(this.f9097c);
        sb.append(", sortName=");
        sb.append(this.f9094U);
        sb.append(", role=");
        sb.append(this.f9095V);
        sb.append(", order=");
        sb.append(this.f9096W);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeString(this.f9097c);
        parcel.writeString(this.f9094U);
        parcel.writeString(this.f9095V);
        Integer num = this.f9096W;
        if (num != null) {
            parcel.writeInt(1);
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
    }

    public /* synthetic */ Participant(String str, String str2, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 8) != 0) {
            num = null;
        }
        this(str, str2, str3, num);
    }
}
