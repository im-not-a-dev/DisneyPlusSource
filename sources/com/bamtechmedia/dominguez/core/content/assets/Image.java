package com.bamtechmedia.dominguez.core.content.assets;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Set;
import kotlin.Metadata;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 32\u00020\u0001:\u00013BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jl\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010'J\t\u0010(\u001a\u00020\nHÖ\u0001J\u0013\u0010)\u001a\u00020\u00182\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\nHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\u0019\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011¨\u00064"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/Image;", "Landroid/os/Parcelable;", "masterId", "", "url", "aspectRatio", "Lcom/bamtechmedia/dominguez/core/content/assets/AspectRatio;", "locale", "purpose", "masterHeight", "", "masterWidth", "sourceEntity", "(Ljava/lang/String;Ljava/lang/String;Lcom/bamtechmedia/dominguez/core/content/assets/AspectRatio;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getAspectRatio", "()Lcom/bamtechmedia/dominguez/core/content/assets/AspectRatio;", "getLocale", "()Ljava/lang/String;", "getMasterHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMasterId", "getMasterWidth", "needsTransparency", "", "getNeedsTransparency", "()Z", "getPurpose", "getSourceEntity", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/bamtechmedia/dominguez/core/content/assets/AspectRatio;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/bamtechmedia/dominguez/core/content/assets/Image;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: Image.kt */
public final class Image implements Parcelable {
    public static final Creator CREATOR = new C3609b();

    /* renamed from: b0 */
    private static final Set<String> f9075b0 = C13188p0.m40533b("hero_tile", "logo", "logo_layer", "title_treatment_layer", "title_treatment", "hero_collection");

    /* renamed from: U */
    private final String f9076U;

    /* renamed from: V */
    private final C3623a f9077V;

    /* renamed from: W */
    private final String f9078W;

    /* renamed from: X */
    private final String f9079X;

    /* renamed from: Y */
    private final Integer f9080Y;

    /* renamed from: Z */
    private final Integer f9081Z;

    /* renamed from: a0 */
    private final String f9082a0;

    /* renamed from: c */
    private final String f9083c;

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.Image$a */
    /* compiled from: Image.kt */
    public static final class C3608a {
        private C3608a() {
        }

        public /* synthetic */ C3608a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.Image$b */
    public static class C3609b implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            Image image = new Image(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (C3623a) C3623a.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
            return image;
        }

        public final Object[] newArray(int i) {
            return new Image[i];
        }
    }

    static {
        new C3608a(null);
    }

    public Image(String str, String str2, C3623a aVar, String str3, String str4, Integer num, Integer num2, String str5) {
        this.f9083c = str;
        this.f9076U = str2;
        this.f9077V = aVar;
        this.f9078W = str3;
        this.f9079X = str4;
        this.f9080Y = num;
        this.f9081Z = num2;
        this.f9082a0 = str5;
    }

    /* renamed from: U */
    public final String mo13085U() {
        return this.f9083c;
    }

    /* renamed from: W */
    public final String mo13086W() {
        return this.f9079X;
    }

    /* renamed from: X */
    public final C3623a mo13087X() {
        return this.f9077V;
    }

    /* renamed from: Y */
    public final String mo13088Y() {
        return this.f9078W;
    }

    /* renamed from: Z */
    public final Integer mo13089Z() {
        return this.f9080Y;
    }

    /* renamed from: a0 */
    public final Integer mo13090a0() {
        return this.f9081Z;
    }

    /* renamed from: b0 */
    public final boolean mo13091b0() {
        String str = this.f9079X;
        return str == null || f9075b0.contains(str);
    }

    /* renamed from: c0 */
    public final String mo13092c0() {
        return this.f9082a0;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f9082a0, (java.lang.Object) r3.f9082a0) != false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x005b
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.core.content.assets.Image
            if (r0 == 0) goto L_0x0059
            com.bamtechmedia.dominguez.core.content.assets.Image r3 = (com.bamtechmedia.dominguez.core.content.assets.Image) r3
            java.lang.String r0 = r2.f9083c
            java.lang.String r1 = r3.f9083c
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = r2.f9076U
            java.lang.String r1 = r3.f9076U
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0059
            com.bamtechmedia.dominguez.core.content.assets.a r0 = r2.f9077V
            com.bamtechmedia.dominguez.core.content.assets.a r1 = r3.f9077V
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = r2.f9078W
            java.lang.String r1 = r3.f9078W
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = r2.f9079X
            java.lang.String r1 = r3.f9079X
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.lang.Integer r0 = r2.f9080Y
            java.lang.Integer r1 = r3.f9080Y
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.lang.Integer r0 = r2.f9081Z
            java.lang.Integer r1 = r3.f9081Z
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = r2.f9082a0
            java.lang.String r3 = r3.f9082a0
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r3 = 0
            return r3
        L_0x005b:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.assets.Image.equals(java.lang.Object):boolean");
    }

    public final String getUrl() {
        return this.f9076U;
    }

    public int hashCode() {
        String str = this.f9083c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9076U;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        C3623a aVar = this.f9077V;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str3 = this.f9078W;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f9079X;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num = this.f9080Y;
        int hashCode6 = (hashCode5 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f9081Z;
        int hashCode7 = (hashCode6 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str5 = this.f9082a0;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Image(masterId=");
        sb.append(this.f9083c);
        sb.append(", url=");
        sb.append(this.f9076U);
        sb.append(", aspectRatio=");
        sb.append(this.f9077V);
        sb.append(", locale=");
        sb.append(this.f9078W);
        sb.append(", purpose=");
        sb.append(this.f9079X);
        sb.append(", masterHeight=");
        sb.append(this.f9080Y);
        sb.append(", masterWidth=");
        sb.append(this.f9081Z);
        sb.append(", sourceEntity=");
        sb.append(this.f9082a0);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9083c);
        parcel.writeString(this.f9076U);
        C3623a aVar = this.f9077V;
        if (aVar != null) {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f9078W);
        parcel.writeString(this.f9079X);
        Integer num = this.f9080Y;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num2 = this.f9081Z;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f9082a0);
    }
}
