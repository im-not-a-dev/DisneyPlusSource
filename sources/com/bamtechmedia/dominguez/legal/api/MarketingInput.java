package com.bamtechmedia.dominguez.legal.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p500m.p501a.C11724g;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B!\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0011\u001a\u00020\bHÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006!"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/api/MarketingInput;", "Landroid/os/Parcelable;", "marketingEntity", "Lcom/bamtechmedia/dominguez/legal/api/MarketingEntity;", "accepted", "", "(Lcom/bamtechmedia/dominguez/legal/api/MarketingEntity;Z)V", "code", "", "textId", "subscribed", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getCode", "()Ljava/lang/String;", "getSubscribed", "()Z", "getTextId", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "legalApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: LegalDataModels.kt */
public final class MarketingInput implements Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();
    private final String code;
    private final boolean subscribed;
    private final String textId;

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    public static class Creator implements android.os.Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            return new MarketingInput(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        public final Object[] newArray(int i) {
            return new MarketingInput[i];
        }
    }

    public MarketingInput(String str, @C11724g(name = "textID") String str2, boolean z) {
        this.code = str;
        this.textId = str2;
        this.subscribed = z;
    }

    public static /* synthetic */ MarketingInput copy$default(MarketingInput marketingInput, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketingInput.code;
        }
        if ((i & 2) != 0) {
            str2 = marketingInput.textId;
        }
        if ((i & 4) != 0) {
            z = marketingInput.subscribed;
        }
        return marketingInput.copy(str, str2, z);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.textId;
    }

    public final boolean component3() {
        return this.subscribed;
    }

    public final MarketingInput copy(String str, @C11724g(name = "textID") String str2, boolean z) {
        return new MarketingInput(str, str2, z);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MarketingInput) {
                MarketingInput marketingInput = (MarketingInput) obj;
                if (C12880j.m40224a((Object) this.code, (Object) marketingInput.code) && C12880j.m40224a((Object) this.textId, (Object) marketingInput.textId)) {
                    if (this.subscribed == marketingInput.subscribed) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getCode() {
        return this.code;
    }

    public final boolean getSubscribed() {
        return this.subscribed;
    }

    public final String getTextId() {
        return this.textId;
    }

    public int hashCode() {
        String str = this.code;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.textId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.subscribed;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MarketingInput(code=");
        sb.append(this.code);
        sb.append(", textId=");
        sb.append(this.textId);
        sb.append(", subscribed=");
        sb.append(this.subscribed);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.code);
        parcel.writeString(this.textId);
        parcel.writeInt(this.subscribed ? 1 : 0);
    }

    public MarketingInput(MarketingEntity marketingEntity, boolean z) {
        this(marketingEntity.getCode$legalApi_release(), marketingEntity.getTextId$legalApi_release(), z);
    }
}
