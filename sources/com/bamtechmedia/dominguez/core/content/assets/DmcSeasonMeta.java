package com.bamtechmedia.dominguez.core.content.assets;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bamtechmedia.dominguez.core.content.C3790u;
import kotlin.Metadata;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bHÖ\u0001R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/DmcSeasonMeta;", "Landroid/os/Parcelable;", "Lcom/bamtechmedia/dominguez/core/content/SeasonMeta;", "labels", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcLabel;", "(Lcom/bamtechmedia/dominguez/core/content/assets/DmcLabel;)V", "getLabels", "()Lcom/bamtechmedia/dominguez/core/content/assets/DmcLabel;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: DmcSeasonMeta.kt */
public final class DmcSeasonMeta implements Parcelable, C3790u {
    public static final Creator CREATOR = new C3603a();

    /* renamed from: c */
    private final DmcLabel f9052c;

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.DmcSeasonMeta$a */
    public static class C3603a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            return new DmcSeasonMeta(parcel.readInt() != 0 ? (DmcLabel) DmcLabel.CREATOR.createFromParcel(parcel) : null);
        }

        public final Object[] newArray(int i) {
            return new DmcSeasonMeta[i];
        }
    }

    public DmcSeasonMeta(DmcLabel dmcLabel) {
        this.f9052c = dmcLabel;
    }

    /* renamed from: X */
    public DmcLabel mo13014X() {
        return this.f9052c;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) mo13014X(), (java.lang.Object) ((com.bamtechmedia.dominguez.core.content.assets.DmcSeasonMeta) r2).mo13014X()) != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0019
            boolean r0 = r2 instanceof com.bamtechmedia.dominguez.core.content.assets.DmcSeasonMeta
            if (r0 == 0) goto L_0x0017
            com.bamtechmedia.dominguez.core.content.assets.DmcSeasonMeta r2 = (com.bamtechmedia.dominguez.core.content.assets.DmcSeasonMeta) r2
            com.bamtechmedia.dominguez.core.content.assets.DmcLabel r0 = r1.mo13014X()
            com.bamtechmedia.dominguez.core.content.assets.DmcLabel r2 = r2.mo13014X()
            boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
            if (r2 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r2 = 0
            return r2
        L_0x0019:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.assets.DmcSeasonMeta.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        DmcLabel X = mo13014X();
        if (X != null) {
            return X.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DmcSeasonMeta(labels=");
        sb.append(mo13014X());
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        DmcLabel dmcLabel = this.f9052c;
        if (dmcLabel != null) {
            parcel.writeInt(1);
            dmcLabel.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }
}
