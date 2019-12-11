package com.bamtechmedia.dominguez.legal.api;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006%"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/api/LegalDisclosure;", "Landroid/os/Parcelable;", "disclosureCode", "", "requiresActiveConsent", "", "content", "Lcom/bamtechmedia/dominguez/legal/api/LegalContent;", "documents", "", "Lcom/bamtechmedia/dominguez/legal/api/LegalDocument;", "(Ljava/lang/String;ZLcom/bamtechmedia/dominguez/legal/api/LegalContent;Ljava/util/List;)V", "getContent", "()Lcom/bamtechmedia/dominguez/legal/api/LegalContent;", "getDisclosureCode", "()Ljava/lang/String;", "getDocuments", "()Ljava/util/List;", "getRequiresActiveConsent", "()Z", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "legalApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegalDataModels.kt */
public final class LegalDisclosure implements Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();
    private final LegalContent content;
    private final String disclosureCode;
    private final List<LegalDocument> documents;
    private final boolean requiresActiveConsent;

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    public static class Creator implements android.os.Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            boolean z = parcel.readInt() != 0;
            LegalContent legalContent = (LegalContent) LegalContent.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((LegalDocument) LegalDocument.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new LegalDisclosure(readString, z, legalContent, arrayList);
        }

        public final Object[] newArray(int i) {
            return new LegalDisclosure[i];
        }
    }

    public LegalDisclosure(String str, boolean z, LegalContent legalContent, List<LegalDocument> list) {
        this.disclosureCode = str;
        this.requiresActiveConsent = z;
        this.content = legalContent;
        this.documents = list;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bamtechmedia.dominguez.legal.api.LegalDocument>, for r4v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bamtechmedia.dominguez.legal.api.LegalDisclosure copy$default(com.bamtechmedia.dominguez.legal.api.LegalDisclosure r0, java.lang.String r1, boolean r2, com.bamtechmedia.dominguez.legal.api.LegalContent r3, java.util.List<com.bamtechmedia.dominguez.legal.api.LegalDocument> r4, int r5, java.lang.Object r6) {
        /*
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0006
            java.lang.String r1 = r0.disclosureCode
        L_0x0006:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x000c
            boolean r2 = r0.requiresActiveConsent
        L_0x000c:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0012
            com.bamtechmedia.dominguez.legal.api.LegalContent r3 = r0.content
        L_0x0012:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0018
            java.util.List<com.bamtechmedia.dominguez.legal.api.LegalDocument> r4 = r0.documents
        L_0x0018:
            com.bamtechmedia.dominguez.legal.api.LegalDisclosure r0 = r0.copy(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.legal.api.LegalDisclosure.copy$default(com.bamtechmedia.dominguez.legal.api.LegalDisclosure, java.lang.String, boolean, com.bamtechmedia.dominguez.legal.api.LegalContent, java.util.List, int, java.lang.Object):com.bamtechmedia.dominguez.legal.api.LegalDisclosure");
    }

    public final String component1() {
        return this.disclosureCode;
    }

    public final boolean component2() {
        return this.requiresActiveConsent;
    }

    public final LegalContent component3() {
        return this.content;
    }

    public final List<LegalDocument> component4() {
        return this.documents;
    }

    public final LegalDisclosure copy(String str, boolean z, LegalContent legalContent, List<LegalDocument> list) {
        return new LegalDisclosure(str, z, legalContent, list);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LegalDisclosure) {
                LegalDisclosure legalDisclosure = (LegalDisclosure) obj;
                if (Intrinsics.areEqual((Object) this.disclosureCode, (Object) legalDisclosure.disclosureCode)) {
                    if (!(this.requiresActiveConsent == legalDisclosure.requiresActiveConsent) || !Intrinsics.areEqual((Object) this.content, (Object) legalDisclosure.content) || !Intrinsics.areEqual((Object) this.documents, (Object) legalDisclosure.documents)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final LegalContent getContent() {
        return this.content;
    }

    public final String getDisclosureCode() {
        return this.disclosureCode;
    }

    public final List<LegalDocument> getDocuments() {
        return this.documents;
    }

    public final boolean getRequiresActiveConsent() {
        return this.requiresActiveConsent;
    }

    public int hashCode() {
        String str = this.disclosureCode;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.requiresActiveConsent;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        LegalContent legalContent = this.content;
        int hashCode2 = (i2 + (legalContent != null ? legalContent.hashCode() : 0)) * 31;
        List<LegalDocument> list = this.documents;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LegalDisclosure(disclosureCode=");
        sb.append(this.disclosureCode);
        sb.append(", requiresActiveConsent=");
        sb.append(this.requiresActiveConsent);
        sb.append(", content=");
        sb.append(this.content);
        sb.append(", documents=");
        sb.append(this.documents);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.disclosureCode);
        parcel.writeInt(this.requiresActiveConsent ? 1 : 0);
        this.content.writeToParcel(parcel, 0);
        List<LegalDocument> list = this.documents;
        parcel.writeInt(list.size());
        for (LegalDocument writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
    }
}
