package com.bamtechmedia.dominguez.core.content.assets;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bamtechmedia.dominguez.core.content.C3691m;
import com.bamtechmedia.dominguez.core.content.PromoLabel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/DmcLabel;", "Landroid/os/Parcelable;", "Lcom/bamtechmedia/dominguez/core/content/Label;", "watchlistLabel", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcWatchlistLabel;", "promoLabels", "", "Lcom/bamtechmedia/dominguez/core/content/PromoLabel;", "(Lcom/bamtechmedia/dominguez/core/content/assets/DmcWatchlistLabel;Ljava/util/List;)V", "getPromoLabels", "()Ljava/util/List;", "getWatchlistLabel", "()Lcom/bamtechmedia/dominguez/core/content/assets/DmcWatchlistLabel;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: DmcLabel.kt */
public final class DmcLabel implements Parcelable, C3691m {
    public static final Creator CREATOR = new C3599a();

    /* renamed from: U */
    private final List<PromoLabel> f9004U;

    /* renamed from: c */
    private final DmcWatchlistLabel f9005c;

    /* renamed from: com.bamtechmedia.dominguez.core.content.assets.DmcLabel$a */
    public static class C3599a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            DmcWatchlistLabel dmcWatchlistLabel = parcel.readInt() != 0 ? (DmcWatchlistLabel) DmcWatchlistLabel.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList2.add((PromoLabel) parcel.readParcelable(DmcLabel.class.getClassLoader()));
                    readInt--;
                }
                arrayList = arrayList2;
            }
            return new DmcLabel(dmcWatchlistLabel, arrayList);
        }

        public final Object[] newArray(int i) {
            return new DmcLabel[i];
        }
    }

    public DmcLabel(DmcWatchlistLabel dmcWatchlistLabel, List<PromoLabel> list) {
        this.f9005c = dmcWatchlistLabel;
        this.f9004U = list;
    }

    /* renamed from: X */
    public List<PromoLabel> mo12939X() {
        return this.f9004U;
    }

    /* renamed from: Y */
    public DmcWatchlistLabel mo12940Y() {
        return this.f9005c;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) mo12939X(), (java.lang.Object) r3.mo12939X()) != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0027
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.core.content.assets.DmcLabel
            if (r0 == 0) goto L_0x0025
            com.bamtechmedia.dominguez.core.content.assets.DmcLabel r3 = (com.bamtechmedia.dominguez.core.content.assets.DmcLabel) r3
            com.bamtechmedia.dominguez.core.content.assets.DmcWatchlistLabel r0 = r2.mo12940Y()
            com.bamtechmedia.dominguez.core.content.assets.DmcWatchlistLabel r1 = r3.mo12940Y()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0025
            java.util.List r0 = r2.mo12939X()
            java.util.List r3 = r3.mo12939X()
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r3 = 0
            return r3
        L_0x0027:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.assets.DmcLabel.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        DmcWatchlistLabel Y = mo12940Y();
        int i = 0;
        int hashCode = (Y != null ? Y.hashCode() : 0) * 31;
        List X = mo12939X();
        if (X != null) {
            i = X.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DmcLabel(watchlistLabel=");
        sb.append(mo12940Y());
        sb.append(", promoLabels=");
        sb.append(mo12939X());
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        DmcWatchlistLabel dmcWatchlistLabel = this.f9005c;
        if (dmcWatchlistLabel != null) {
            parcel.writeInt(1);
            dmcWatchlistLabel.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        List<PromoLabel> list = this.f9004U;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (PromoLabel writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i);
            }
            return;
        }
        parcel.writeInt(0);
    }
}
