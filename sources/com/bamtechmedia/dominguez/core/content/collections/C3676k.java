package com.bamtechmedia.dominguez.core.content.collections;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/collections/Slug;", "Landroid/os/Parcelable;", "contentClass", "", "value", "canCache", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getCanCache", "()Z", "getContentClass", "()Ljava/lang/String;", "pageName", "getPageName", "getValue", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.content.collections.k */
/* compiled from: Slug.kt */
public final class C3676k implements Parcelable {
    public static final Creator CREATOR = new C3677a();

    /* renamed from: U */
    private final String f9218U;

    /* renamed from: V */
    private final boolean f9219V;

    /* renamed from: c */
    private final String f9220c;

    /* renamed from: com.bamtechmedia.dominguez.core.content.collections.k$a */
    public static class C3677a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            return new C3676k(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        public final Object[] newArray(int i) {
            return new C3676k[i];
        }
    }

    public C3676k(String str, String str2, boolean z) {
        this.f9220c = str;
        this.f9218U = str2;
        this.f9219V = z;
    }

    /* renamed from: X */
    public final boolean mo13374X() {
        return this.f9219V;
    }

    /* renamed from: Y */
    public final String mo13375Y() {
        return this.f9220c;
    }

    /* renamed from: Z */
    public final String mo13376Z() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9220c);
        sb.append(':');
        sb.append(this.f9218U);
        return sb.toString();
    }

    /* renamed from: a0 */
    public final String mo13377a0() {
        return this.f9218U;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3676k) {
                C3676k kVar = (C3676k) obj;
                if (C12880j.m40224a((Object) this.f9220c, (Object) kVar.f9220c) && C12880j.m40224a((Object) this.f9218U, (Object) kVar.f9218U)) {
                    if (this.f9219V == kVar.f9219V) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f9220c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9218U;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f9219V;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Slug(contentClass=");
        sb.append(this.f9220c);
        sb.append(", value=");
        sb.append(this.f9218U);
        sb.append(", canCache=");
        sb.append(this.f9219V);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9220c);
        parcel.writeString(this.f9218U);
        parcel.writeInt(this.f9219V ? 1 : 0);
    }

    public /* synthetic */ C3676k(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            z = true;
        }
        this(str, str2, z);
    }
}
