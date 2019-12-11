package com.bamtechmedia.dominguez.core.content.collections;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;
import kotlin.Metadata;
import p163g.p500m.p501a.C11724g;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J!\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u001e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/collections/DmcVideoArt;", "Lcom/bamtechmedia/dominguez/core/content/collections/VideoArt;", "Landroid/os/Parcelable;", "purpose", "", "dmcVideoMeta", "Lcom/bamtechmedia/dominguez/core/content/collections/DmcVideoArtMediaMetadata;", "(Ljava/lang/String;Lcom/bamtechmedia/dominguez/core/content/collections/DmcVideoArtMediaMetadata;)V", "getDmcVideoMeta", "()Lcom/bamtechmedia/dominguez/core/content/collections/DmcVideoArtMediaMetadata;", "getPurpose", "()Ljava/lang/String;", "url", "getUrl", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: DmcVideoArt.kt */
public final class DmcVideoArt implements C3680n, Parcelable {
    public static final Creator CREATOR = new C3656a();

    /* renamed from: U */
    private final DmcVideoArtMediaMetadata f9184U;

    /* renamed from: c */
    private final String f9185c;

    /* renamed from: com.bamtechmedia.dominguez.core.content.collections.DmcVideoArt$a */
    public static class C3656a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            return new DmcVideoArt(parcel.readString(), parcel.readInt() != 0 ? (DmcVideoArtMediaMetadata) DmcVideoArtMediaMetadata.CREATOR.createFromParcel(parcel) : null);
        }

        public final Object[] newArray(int i) {
            return new DmcVideoArt[i];
        }
    }

    public DmcVideoArt(String str, @C11724g(name = "mediaMetadata") DmcVideoArtMediaMetadata dmcVideoArtMediaMetadata) {
        this.f9185c = str;
        this.f9184U = dmcVideoArtMediaMetadata;
    }

    /* renamed from: W */
    public String mo13319W() {
        return this.f9185c;
    }

    /* renamed from: X */
    public final DmcVideoArtMediaMetadata mo13320X() {
        return this.f9184U;
    }

    public final DmcVideoArt copy(String str, @C11724g(name = "mediaMetadata") DmcVideoArtMediaMetadata dmcVideoArtMediaMetadata) {
        return new DmcVideoArt(str, dmcVideoArtMediaMetadata);
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f9184U, (java.lang.Object) r3.f9184U) != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0023
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.core.content.collections.DmcVideoArt
            if (r0 == 0) goto L_0x0021
            com.bamtechmedia.dominguez.core.content.collections.DmcVideoArt r3 = (com.bamtechmedia.dominguez.core.content.collections.DmcVideoArt) r3
            java.lang.String r0 = r2.mo13319W()
            java.lang.String r1 = r3.mo13319W()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0021
            com.bamtechmedia.dominguez.core.content.collections.DmcVideoArtMediaMetadata r0 = r2.f9184U
            com.bamtechmedia.dominguez.core.content.collections.DmcVideoArtMediaMetadata r3 = r3.f9184U
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r3 = 0
            return r3
        L_0x0023:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.collections.DmcVideoArt.equals(java.lang.Object):boolean");
    }

    public String getUrl() {
        DmcVideoArtMediaMetadata dmcVideoArtMediaMetadata = this.f9184U;
        if (dmcVideoArtMediaMetadata != null) {
            List X = dmcVideoArtMediaMetadata.mo13332X();
            if (X != null) {
                DmcUrl dmcUrl = (DmcUrl) C13199w.m40591g(X);
                if (dmcUrl != null) {
                    return dmcUrl.getUrl();
                }
            }
        }
        return null;
    }

    public int hashCode() {
        String W = mo13319W();
        int i = 0;
        int hashCode = (W != null ? W.hashCode() : 0) * 31;
        DmcVideoArtMediaMetadata dmcVideoArtMediaMetadata = this.f9184U;
        if (dmcVideoArtMediaMetadata != null) {
            i = dmcVideoArtMediaMetadata.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DmcVideoArt(purpose=");
        sb.append(mo13319W());
        sb.append(", dmcVideoMeta=");
        sb.append(this.f9184U);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9185c);
        DmcVideoArtMediaMetadata dmcVideoArtMediaMetadata = this.f9184U;
        if (dmcVideoArtMediaMetadata != null) {
            parcel.writeInt(1);
            dmcVideoArtMediaMetadata.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }
}
