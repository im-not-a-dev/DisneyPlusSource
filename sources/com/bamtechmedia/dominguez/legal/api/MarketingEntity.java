package com.bamtechmedia.dominguez.legal.api;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\u000e\u0010\u0016\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0017J\u000e\u0010\u0018\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0019J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0013\u0010!\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020 HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020 HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006+"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/api/MarketingEntity;", "Landroid/os/Parcelable;", "code", "", "textId", "displayCheckbox", "", "checked", "text", "links", "", "Lcom/bamtechmedia/dominguez/legal/api/MarketingLink;", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/List;)V", "getChecked", "()Z", "getCode$legalApi_release", "()Ljava/lang/String;", "getDisplayCheckbox", "getLinks", "()Ljava/util/List;", "getText", "getTextId$legalApi_release", "component1", "component1$legalApi_release", "component2", "component2$legalApi_release", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "legalApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegalDataModels.kt */
public final class MarketingEntity implements Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();
    private final boolean checked;
    private final String code;
    private final boolean displayCheckbox;
    private final List<MarketingLink> links;
    private final String text;
    private final String textId;

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    public static class Creator implements android.os.Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((MarketingLink) MarketingLink.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            MarketingEntity marketingEntity = new MarketingEntity(readString, readString2, z2, z, readString3, arrayList);
            return marketingEntity;
        }

        public final Object[] newArray(int i) {
            return new MarketingEntity[i];
        }
    }

    public MarketingEntity(String str, String str2, boolean z, boolean z2, String str3, List<MarketingLink> list) {
        this.code = str;
        this.textId = str2;
        this.displayCheckbox = z;
        this.checked = z2;
        this.text = str3;
        this.links = list;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bamtechmedia.dominguez.legal.api.MarketingLink>, for r10v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bamtechmedia.dominguez.legal.api.MarketingEntity copy$default(com.bamtechmedia.dominguez.legal.api.MarketingEntity r4, java.lang.String r5, java.lang.String r6, boolean r7, boolean r8, java.lang.String r9, java.util.List<com.bamtechmedia.dominguez.legal.api.MarketingLink> r10, int r11, java.lang.Object r12) {
        /*
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0006
            java.lang.String r5 = r4.code
        L_0x0006:
            r12 = r11 & 2
            if (r12 == 0) goto L_0x000c
            java.lang.String r6 = r4.textId
        L_0x000c:
            r12 = r6
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0013
            boolean r7 = r4.displayCheckbox
        L_0x0013:
            r0 = r7
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001a
            boolean r8 = r4.checked
        L_0x001a:
            r1 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0021
            java.lang.String r9 = r4.text
        L_0x0021:
            r2 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0028
            java.util.List<com.bamtechmedia.dominguez.legal.api.MarketingLink> r10 = r4.links
        L_0x0028:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r10 = r1
            r11 = r2
            r12 = r3
            com.bamtechmedia.dominguez.legal.api.MarketingEntity r4 = r6.copy(r7, r8, r9, r10, r11, r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.legal.api.MarketingEntity.copy$default(com.bamtechmedia.dominguez.legal.api.MarketingEntity, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.util.List, int, java.lang.Object):com.bamtechmedia.dominguez.legal.api.MarketingEntity");
    }

    public final String component1$legalApi_release() {
        return this.code;
    }

    public final String component2$legalApi_release() {
        return this.textId;
    }

    public final boolean component3() {
        return this.displayCheckbox;
    }

    public final boolean component4() {
        return this.checked;
    }

    public final String component5() {
        return this.text;
    }

    public final List<MarketingLink> component6() {
        return this.links;
    }

    public final MarketingEntity copy(String str, String str2, boolean z, boolean z2, String str3, List<MarketingLink> list) {
        MarketingEntity marketingEntity = new MarketingEntity(str, str2, z, z2, str3, list);
        return marketingEntity;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MarketingEntity) {
                MarketingEntity marketingEntity = (MarketingEntity) obj;
                if (Intrinsics.areEqual((Object) this.code, (Object) marketingEntity.code) && Intrinsics.areEqual((Object) this.textId, (Object) marketingEntity.textId)) {
                    if (this.displayCheckbox == marketingEntity.displayCheckbox) {
                        if (!(this.checked == marketingEntity.checked) || !Intrinsics.areEqual((Object) this.text, (Object) marketingEntity.text) || !Intrinsics.areEqual((Object) this.links, (Object) marketingEntity.links)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final String getCode$legalApi_release() {
        return this.code;
    }

    public final boolean getDisplayCheckbox() {
        return this.displayCheckbox;
    }

    public final List<MarketingLink> getLinks() {
        return this.links;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTextId$legalApi_release() {
        return this.textId;
    }

    public int hashCode() {
        String str = this.code;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.textId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.displayCheckbox;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z2 = this.checked;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        String str3 = this.text;
        int hashCode3 = (i3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<MarketingLink> list = this.links;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MarketingEntity(code=");
        sb.append(this.code);
        sb.append(", textId=");
        sb.append(this.textId);
        sb.append(", displayCheckbox=");
        sb.append(this.displayCheckbox);
        sb.append(", checked=");
        sb.append(this.checked);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", links=");
        sb.append(this.links);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.code);
        parcel.writeString(this.textId);
        parcel.writeInt(this.displayCheckbox ? 1 : 0);
        parcel.writeInt(this.checked ? 1 : 0);
        parcel.writeString(this.text);
        List<MarketingLink> list = this.links;
        parcel.writeInt(list.size());
        for (MarketingLink writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
    }
}
