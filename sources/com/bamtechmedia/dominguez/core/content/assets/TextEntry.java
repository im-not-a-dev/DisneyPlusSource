package com.bamtechmedia.dominguez.core.content.assets;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.Metadata;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B/\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB-\u0012\u0006\u0010\u0002\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\fJ\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006&"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/TextEntry;", "Landroid/os/Parcelable;", "field", "Lcom/bamtechmedia/dominguez/core/content/assets/TextEntryField;", "type", "Lcom/bamtechmedia/dominguez/core/content/assets/TextEntryType;", "language", "", "content", "sourceEntity", "Lcom/bamtechmedia/dominguez/core/content/assets/SourceEntityType;", "(Lcom/bamtechmedia/dominguez/core/content/assets/TextEntryField;Lcom/bamtechmedia/dominguez/core/content/assets/TextEntryType;Ljava/lang/String;Ljava/lang/String;Lcom/bamtechmedia/dominguez/core/content/assets/SourceEntityType;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getField", "getLanguage", "getSourceEntity", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: TextModels.kt */
public final class TextEntry implements Parcelable {
    public static final Creator CREATOR = new C3620a();

    /* renamed from: U */
    private final String f9107U;

    /* renamed from: V */
    private final String f9108V;

    /* renamed from: W */
    private final String f9109W;

    /* renamed from: X */
    private final String f9110X;

    /* renamed from: c */
    private final String f9111c;

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.TextEntry$a */
    public static class C3620a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            TextEntry textEntry = new TextEntry(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            return textEntry;
        }

        public final Object[] newArray(int i) {
            return new TextEntry[i];
        }
    }

    public TextEntry(String str, String str2, String str3, String str4, String str5) {
        this.f9111c = str;
        this.f9107U = str2;
        this.f9108V = str3;
        this.f9109W = str4;
        this.f9110X = str5;
    }

    /* renamed from: X */
    public final String mo13210X() {
        return this.f9109W;
    }

    /* renamed from: Y */
    public final String mo13211Y() {
        return this.f9111c;
    }

    /* renamed from: Z */
    public final String mo13212Z() {
        return this.f9108V;
    }

    /* renamed from: a0 */
    public final String mo13213a0() {
        return this.f9110X;
    }

    /* renamed from: b0 */
    public final String mo13214b0() {
        return this.f9107U;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f9110X, (java.lang.Object) r3.f9110X) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.core.content.assets.TextEntry
            if (r0 == 0) goto L_0x003b
            com.bamtechmedia.dominguez.core.content.assets.TextEntry r3 = (com.bamtechmedia.dominguez.core.content.assets.TextEntry) r3
            java.lang.String r0 = r2.f9111c
            java.lang.String r1 = r3.f9111c
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f9107U
            java.lang.String r1 = r3.f9107U
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f9108V
            java.lang.String r1 = r3.f9108V
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f9109W
            java.lang.String r1 = r3.f9109W
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f9110X
            java.lang.String r3 = r3.f9110X
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            return r3
        L_0x003d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.assets.TextEntry.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f9111c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9107U;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9108V;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f9109W;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f9110X;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TextEntry(field=");
        sb.append(this.f9111c);
        sb.append(", type=");
        sb.append(this.f9107U);
        sb.append(", language=");
        sb.append(this.f9108V);
        sb.append(", content=");
        sb.append(this.f9109W);
        sb.append(", sourceEntity=");
        sb.append(this.f9110X);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9111c);
        parcel.writeString(this.f9107U);
        parcel.writeString(this.f9108V);
        parcel.writeString(this.f9109W);
        parcel.writeString(this.f9110X);
    }
}
