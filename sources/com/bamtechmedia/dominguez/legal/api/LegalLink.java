package com.bamtechmedia.dominguez.legal.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/api/LegalLink;", "Landroid/os/Parcelable;", "href", "", "label", "start", "", "documentCode", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getDocumentCode", "()Ljava/lang/String;", "getHref", "getLabel", "getStart", "()I", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "legalApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegalDataModels.kt */
public final class LegalLink implements Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();
    private final String documentCode;
    private final String href;
    private final String label;
    private final int start;

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    public static class Creator implements android.os.Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            return new LegalLink(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new LegalLink[i];
        }
    }

    public LegalLink(String str, String str2, int i, String str3) {
        this.href = str;
        this.label = str2;
        this.start = i;
        this.documentCode = str3;
    }

    public static /* synthetic */ LegalLink copy$default(LegalLink legalLink, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = legalLink.href;
        }
        if ((i2 & 2) != 0) {
            str2 = legalLink.label;
        }
        if ((i2 & 4) != 0) {
            i = legalLink.start;
        }
        if ((i2 & 8) != 0) {
            str3 = legalLink.documentCode;
        }
        return legalLink.copy(str, str2, i, str3);
    }

    public final String component1() {
        return this.href;
    }

    public final String component2() {
        return this.label;
    }

    public final int component3() {
        return this.start;
    }

    public final String component4() {
        return this.documentCode;
    }

    public final LegalLink copy(String str, String str2, int i, String str3) {
        return new LegalLink(str, str2, i, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LegalLink) {
                LegalLink legalLink = (LegalLink) obj;
                if (C12880j.m40224a((Object) this.href, (Object) legalLink.href) && C12880j.m40224a((Object) this.label, (Object) legalLink.label)) {
                    if (!(this.start == legalLink.start) || !C12880j.m40224a((Object) this.documentCode, (Object) legalLink.documentCode)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getDocumentCode() {
        return this.documentCode;
    }

    public final String getHref() {
        return this.href;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getStart() {
        return this.start;
    }

    public int hashCode() {
        String str = this.href;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.label;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.start) * 31;
        String str3 = this.documentCode;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LegalLink(href=");
        sb.append(this.href);
        sb.append(", label=");
        sb.append(this.label);
        sb.append(", start=");
        sb.append(this.start);
        sb.append(", documentCode=");
        sb.append(this.documentCode);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.href);
        parcel.writeString(this.label);
        parcel.writeInt(this.start);
        parcel.writeString(this.documentCode);
    }
}
