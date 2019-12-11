package com.bamtechmedia.dominguez.legal.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/api/LegalDocument;", "Landroid/os/Parcelable;", "documentCode", "", "title", "(Ljava/lang/String;Ljava/lang/String;)V", "getDocumentCode", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "legalApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegalDataModels.kt */
public final class LegalDocument implements Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new Creator();
    private final String documentCode;
    private final String title;

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    public static class Creator implements android.os.Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            return new LegalDocument(parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new LegalDocument[i];
        }
    }

    public LegalDocument(String str, String str2) {
        this.documentCode = str;
        this.title = str2;
    }

    public static /* synthetic */ LegalDocument copy$default(LegalDocument legalDocument, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = legalDocument.documentCode;
        }
        if ((i & 2) != 0) {
            str2 = legalDocument.title;
        }
        return legalDocument.copy(str, str2);
    }

    public final String component1() {
        return this.documentCode;
    }

    public final String component2() {
        return this.title;
    }

    public final LegalDocument copy(String str, String str2) {
        return new LegalDocument(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.title, (java.lang.Object) r3.title) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.legal.api.LegalDocument
            if (r0 == 0) goto L_0x001d
            com.bamtechmedia.dominguez.legal.api.LegalDocument r3 = (com.bamtechmedia.dominguez.legal.api.LegalDocument) r3
            java.lang.String r0 = r2.documentCode
            java.lang.String r1 = r3.documentCode
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.title
            java.lang.String r3 = r3.title
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.legal.api.LegalDocument.equals(java.lang.Object):boolean");
    }

    public final String getDocumentCode() {
        return this.documentCode;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.documentCode;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LegalDocument(documentCode=");
        sb.append(this.documentCode);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.documentCode);
        parcel.writeString(this.title);
    }
}
