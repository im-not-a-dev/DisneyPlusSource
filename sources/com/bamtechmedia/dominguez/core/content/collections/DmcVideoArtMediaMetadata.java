package com.bamtechmedia.dominguez.core.content.collections;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/collections/DmcVideoArtMediaMetadata;", "Landroid/os/Parcelable;", "urls", "", "Lcom/bamtechmedia/dominguez/core/content/collections/DmcUrl;", "(Ljava/util/List;)V", "getUrls", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: DmcVideoArt.kt */
public final class DmcVideoArtMediaMetadata implements Parcelable {
    public static final Creator CREATOR = new C3657a();

    /* renamed from: c */
    private final List<DmcUrl> f9186c;

    /* renamed from: com.bamtechmedia.dominguez.core.content.collections.DmcVideoArtMediaMetadata$a */
    public static class C3657a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add((DmcUrl) DmcUrl.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            return new DmcVideoArtMediaMetadata(arrayList);
        }

        public final Object[] newArray(int i) {
            return new DmcVideoArtMediaMetadata[i];
        }
    }

    public DmcVideoArtMediaMetadata(List<DmcUrl> list) {
        this.f9186c = list;
    }

    /* renamed from: X */
    public final List<DmcUrl> mo13332X() {
        return this.f9186c;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f9186c, (java.lang.Object) ((com.bamtechmedia.dominguez.core.content.collections.DmcVideoArtMediaMetadata) r2).f9186c) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtechmedia.dominguez.core.content.collections.DmcVideoArtMediaMetadata
            if (r0 == 0) goto L_0x0013
            com.bamtechmedia.dominguez.core.content.collections.DmcVideoArtMediaMetadata r2 = (com.bamtechmedia.dominguez.core.content.collections.DmcVideoArtMediaMetadata) r2
            java.util.List<com.bamtechmedia.dominguez.core.content.collections.DmcUrl> r0 = r1.f9186c
            java.util.List<com.bamtechmedia.dominguez.core.content.collections.DmcUrl> r2 = r2.f9186c
            boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.collections.DmcVideoArtMediaMetadata.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        List<DmcUrl> list = this.f9186c;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DmcVideoArtMediaMetadata(urls=");
        sb.append(this.f9186c);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        List<DmcUrl> list = this.f9186c;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (DmcUrl writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, 0);
            }
            return;
        }
        parcel.writeInt(0);
    }
}
