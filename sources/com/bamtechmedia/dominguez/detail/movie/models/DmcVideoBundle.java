package com.bamtechmedia.dominguez.detail.movie.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bamtechmedia.dominguez.core.content.PromoLabel;
import com.bamtechmedia.dominguez.core.content.assets.DmcMovie;
import com.bamtechmedia.dominguez.detail.common.models.DmcExtraContent;
import com.bamtechmedia.dominguez.detail.common.models.DmcRelatedContent;
import kotlin.Metadata;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/movie/models/DmcVideoBundle;", "Landroid/os/Parcelable;", "label", "Lcom/bamtechmedia/dominguez/core/content/PromoLabel;", "video", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcMovie;", "extras", "Lcom/bamtechmedia/dominguez/detail/common/models/DmcExtraContent;", "related", "Lcom/bamtechmedia/dominguez/detail/common/models/DmcRelatedContent;", "(Lcom/bamtechmedia/dominguez/core/content/PromoLabel;Lcom/bamtechmedia/dominguez/core/content/assets/DmcMovie;Lcom/bamtechmedia/dominguez/detail/common/models/DmcExtraContent;Lcom/bamtechmedia/dominguez/detail/common/models/DmcRelatedContent;)V", "getExtras", "()Lcom/bamtechmedia/dominguez/detail/common/models/DmcExtraContent;", "getLabel", "()Lcom/bamtechmedia/dominguez/core/content/PromoLabel;", "getRelated", "()Lcom/bamtechmedia/dominguez/detail/common/models/DmcRelatedContent;", "getVideo", "()Lcom/bamtechmedia/dominguez/core/content/assets/DmcMovie;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: MovieDetailsModels.kt */
public final class DmcVideoBundle implements Parcelable {
    public static final Creator CREATOR = new C6021a();

    /* renamed from: U */
    private final DmcMovie f13875U;

    /* renamed from: V */
    private final DmcExtraContent f13876V;

    /* renamed from: W */
    private final DmcRelatedContent f13877W;

    /* renamed from: c */
    private final PromoLabel f13878c;

    /* renamed from: com.bamtechmedia.dominguez.detail.movie.models.DmcVideoBundle$a */
    public static class C6021a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            PromoLabel promoLabel = (PromoLabel) parcel.readParcelable(DmcVideoBundle.class.getClassLoader());
            DmcMovie dmcMovie = (DmcMovie) parcel.readParcelable(DmcVideoBundle.class.getClassLoader());
            DmcRelatedContent dmcRelatedContent = null;
            DmcExtraContent dmcExtraContent = parcel.readInt() != 0 ? (DmcExtraContent) DmcExtraContent.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                dmcRelatedContent = (DmcRelatedContent) DmcRelatedContent.CREATOR.createFromParcel(parcel);
            }
            return new DmcVideoBundle(promoLabel, dmcMovie, dmcExtraContent, dmcRelatedContent);
        }

        public final Object[] newArray(int i) {
            return new DmcVideoBundle[i];
        }
    }

    public DmcVideoBundle(PromoLabel promoLabel, DmcMovie dmcMovie, DmcExtraContent dmcExtraContent, DmcRelatedContent dmcRelatedContent) {
        this.f13878c = promoLabel;
        this.f13875U = dmcMovie;
        this.f13876V = dmcExtraContent;
        this.f13877W = dmcRelatedContent;
    }

    /* renamed from: a */
    public static /* synthetic */ DmcVideoBundle m19264a(DmcVideoBundle dmcVideoBundle, PromoLabel promoLabel, DmcMovie dmcMovie, DmcExtraContent dmcExtraContent, DmcRelatedContent dmcRelatedContent, int i, Object obj) {
        if ((i & 1) != 0) {
            promoLabel = dmcVideoBundle.f13878c;
        }
        if ((i & 2) != 0) {
            dmcMovie = dmcVideoBundle.f13875U;
        }
        if ((i & 4) != 0) {
            dmcExtraContent = dmcVideoBundle.f13876V;
        }
        if ((i & 8) != 0) {
            dmcRelatedContent = dmcVideoBundle.f13877W;
        }
        return dmcVideoBundle.mo18087a(promoLabel, dmcMovie, dmcExtraContent, dmcRelatedContent);
    }

    /* renamed from: X */
    public final DmcExtraContent mo18084X() {
        return this.f13876V;
    }

    /* renamed from: Y */
    public final PromoLabel mo18085Y() {
        return this.f13878c;
    }

    /* renamed from: Z */
    public final DmcRelatedContent mo18086Z() {
        return this.f13877W;
    }

    /* renamed from: a */
    public final DmcVideoBundle mo18087a(PromoLabel promoLabel, DmcMovie dmcMovie, DmcExtraContent dmcExtraContent, DmcRelatedContent dmcRelatedContent) {
        return new DmcVideoBundle(promoLabel, dmcMovie, dmcExtraContent, dmcRelatedContent);
    }

    /* renamed from: a0 */
    public final DmcMovie mo18088a0() {
        return this.f13875U;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f13877W, (java.lang.Object) r3.f13877W) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.detail.movie.models.DmcVideoBundle
            if (r0 == 0) goto L_0x0031
            com.bamtechmedia.dominguez.detail.movie.models.DmcVideoBundle r3 = (com.bamtechmedia.dominguez.detail.movie.models.DmcVideoBundle) r3
            com.bamtechmedia.dominguez.core.content.PromoLabel r0 = r2.f13878c
            com.bamtechmedia.dominguez.core.content.PromoLabel r1 = r3.f13878c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.bamtechmedia.dominguez.core.content.assets.DmcMovie r0 = r2.f13875U
            com.bamtechmedia.dominguez.core.content.assets.DmcMovie r1 = r3.f13875U
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.bamtechmedia.dominguez.detail.common.models.DmcExtraContent r0 = r2.f13876V
            com.bamtechmedia.dominguez.detail.common.models.DmcExtraContent r1 = r3.f13876V
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.bamtechmedia.dominguez.detail.common.models.DmcRelatedContent r0 = r2.f13877W
            com.bamtechmedia.dominguez.detail.common.models.DmcRelatedContent r3 = r3.f13877W
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.movie.models.DmcVideoBundle.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        PromoLabel promoLabel = this.f13878c;
        int i = 0;
        int hashCode = (promoLabel != null ? promoLabel.hashCode() : 0) * 31;
        DmcMovie dmcMovie = this.f13875U;
        int hashCode2 = (hashCode + (dmcMovie != null ? dmcMovie.hashCode() : 0)) * 31;
        DmcExtraContent dmcExtraContent = this.f13876V;
        int hashCode3 = (hashCode2 + (dmcExtraContent != null ? dmcExtraContent.hashCode() : 0)) * 31;
        DmcRelatedContent dmcRelatedContent = this.f13877W;
        if (dmcRelatedContent != null) {
            i = dmcRelatedContent.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DmcVideoBundle(label=");
        sb.append(this.f13878c);
        sb.append(", video=");
        sb.append(this.f13875U);
        sb.append(", extras=");
        sb.append(this.f13876V);
        sb.append(", related=");
        sb.append(this.f13877W);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f13878c, i);
        parcel.writeParcelable(this.f13875U, i);
        DmcExtraContent dmcExtraContent = this.f13876V;
        if (dmcExtraContent != null) {
            parcel.writeInt(1);
            dmcExtraContent.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        DmcRelatedContent dmcRelatedContent = this.f13877W;
        if (dmcRelatedContent != null) {
            parcel.writeInt(1);
            dmcRelatedContent.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public /* synthetic */ DmcVideoBundle(PromoLabel promoLabel, DmcMovie dmcMovie, DmcExtraContent dmcExtraContent, DmcRelatedContent dmcRelatedContent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            dmcExtraContent = null;
        }
        if ((i & 8) != 0) {
            dmcRelatedContent = null;
        }
        this(promoLabel, dmcMovie, dmcExtraContent, dmcRelatedContent);
    }
}
