package com.bamtechmedia.dominguez.core.content.assets;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.Metadata;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/DmcVideoMeta;", "Landroid/os/Parcelable;", "bookmarkData", "Lcom/bamtechmedia/dominguez/core/content/assets/UserMediaMeta;", "(Lcom/bamtechmedia/dominguez/core/content/assets/UserMediaMeta;)V", "getBookmarkData", "()Lcom/bamtechmedia/dominguez/core/content/assets/UserMediaMeta;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: DmcVideoMeta.kt */
public final class DmcVideoMeta implements Parcelable {
    public static final Creator CREATOR = new C3606a();

    /* renamed from: c */
    private final UserMediaMeta f9073c;

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.DmcVideoMeta$a */
    public static class C3606a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            return new DmcVideoMeta((UserMediaMeta) parcel.readParcelable(DmcVideoMeta.class.getClassLoader()));
        }

        public final Object[] newArray(int i) {
            return new DmcVideoMeta[i];
        }
    }

    public DmcVideoMeta(UserMediaMeta userMediaMeta) {
        this.f9073c = userMediaMeta;
    }

    /* renamed from: X */
    public final UserMediaMeta mo13065X() {
        return this.f9073c;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f9073c, (java.lang.Object) ((com.bamtechmedia.dominguez.core.content.assets.DmcVideoMeta) r2).f9073c) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtechmedia.dominguez.core.content.assets.DmcVideoMeta
            if (r0 == 0) goto L_0x0013
            com.bamtechmedia.dominguez.core.content.assets.DmcVideoMeta r2 = (com.bamtechmedia.dominguez.core.content.assets.DmcVideoMeta) r2
            com.bamtechmedia.dominguez.core.content.assets.UserMediaMeta r0 = r1.f9073c
            com.bamtechmedia.dominguez.core.content.assets.UserMediaMeta r2 = r2.f9073c
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.assets.DmcVideoMeta.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        UserMediaMeta userMediaMeta = this.f9073c;
        if (userMediaMeta != null) {
            return userMediaMeta.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DmcVideoMeta(bookmarkData=");
        sb.append(this.f9073c);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f9073c, i);
    }
}
