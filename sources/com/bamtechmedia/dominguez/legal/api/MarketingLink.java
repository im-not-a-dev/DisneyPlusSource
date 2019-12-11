package com.bamtechmedia.dominguez.legal.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006 "}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/api/MarketingLink;", "Landroid/os/Parcelable;", "href", "", "text", "start", "", "documentCode", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getDocumentCode", "()Ljava/lang/String;", "getHref", "getStart", "()I", "getText", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "legalApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegalDataModels.kt */
public final class MarketingLink implements Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();
    private final String documentCode;
    private final String href;
    private final int start;
    private final String text;

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    public static class Creator implements android.os.Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            return new MarketingLink(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new MarketingLink[i];
        }
    }

    public MarketingLink(String str, String str2, int i, String str3) {
        this.href = str;
        this.text = str2;
        this.start = i;
        this.documentCode = str3;
    }

    public static /* synthetic */ MarketingLink copy$default(MarketingLink marketingLink, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = marketingLink.href;
        }
        if ((i2 & 2) != 0) {
            str2 = marketingLink.text;
        }
        if ((i2 & 4) != 0) {
            i = marketingLink.start;
        }
        if ((i2 & 8) != 0) {
            str3 = marketingLink.documentCode;
        }
        return marketingLink.copy(str, str2, i, str3);
    }

    public final String component1() {
        return this.href;
    }

    public final String component2() {
        return this.text;
    }

    public final int component3() {
        return this.start;
    }

    public final String component4() {
        return this.documentCode;
    }

    public final MarketingLink copy(String str, String str2, int i, String str3) {
        return new MarketingLink(str, str2, i, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MarketingLink) {
                MarketingLink marketingLink = (MarketingLink) obj;
                if (Intrinsics.areEqual((Object) this.href, (Object) marketingLink.href) && Intrinsics.areEqual((Object) this.text, (Object) marketingLink.text)) {
                    if (!(this.start == marketingLink.start) || !Intrinsics.areEqual((Object) this.documentCode, (Object) marketingLink.documentCode)) {
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

    public final int getStart() {
        return this.start;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.href;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.text;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.start) * 31;
        String str3 = this.documentCode;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MarketingLink(href=");
        sb.append(this.href);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", start=");
        sb.append(this.start);
        sb.append(", documentCode=");
        sb.append(this.documentCode);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.href);
        parcel.writeString(this.text);
        parcel.writeInt(this.start);
        parcel.writeString(this.documentCode);
    }
}
