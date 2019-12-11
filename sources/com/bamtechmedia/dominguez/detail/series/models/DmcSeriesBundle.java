package com.bamtechmedia.dominguez.detail.series.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bamtechmedia.dominguez.core.content.PromoLabel;
import com.bamtechmedia.dominguez.core.content.assets.DmcSeries;
import com.bamtechmedia.dominguez.detail.common.models.DmcExtraContent;
import com.bamtechmedia.dominguez.detail.common.models.DmcRelatedContent;
import kotlin.Metadata;
import p163g.p500m.p501a.C11724g;
import p163g.p500m.p501a.C11733i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003JM\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020#HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020#HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u00060"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/models/DmcSeriesBundle;", "Landroid/os/Parcelable;", "label", "Lcom/bamtechmedia/dominguez/core/content/PromoLabel;", "dmcSeries", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcSeries;", "dmcSeasons", "Lcom/bamtechmedia/dominguez/detail/series/models/SeriesBundleSeasons;", "episodes", "Lcom/bamtechmedia/dominguez/detail/series/models/SeriesBundleEpisodes;", "related", "Lcom/bamtechmedia/dominguez/detail/common/models/DmcRelatedContent;", "extras", "Lcom/bamtechmedia/dominguez/detail/common/models/DmcExtraContent;", "(Lcom/bamtechmedia/dominguez/core/content/PromoLabel;Lcom/bamtechmedia/dominguez/core/content/assets/DmcSeries;Lcom/bamtechmedia/dominguez/detail/series/models/SeriesBundleSeasons;Lcom/bamtechmedia/dominguez/detail/series/models/SeriesBundleEpisodes;Lcom/bamtechmedia/dominguez/detail/common/models/DmcRelatedContent;Lcom/bamtechmedia/dominguez/detail/common/models/DmcExtraContent;)V", "getDmcSeasons", "()Lcom/bamtechmedia/dominguez/detail/series/models/SeriesBundleSeasons;", "getDmcSeries", "()Lcom/bamtechmedia/dominguez/core/content/assets/DmcSeries;", "getEpisodes", "()Lcom/bamtechmedia/dominguez/detail/series/models/SeriesBundleEpisodes;", "getExtras", "()Lcom/bamtechmedia/dominguez/detail/common/models/DmcExtraContent;", "getLabel", "()Lcom/bamtechmedia/dominguez/core/content/PromoLabel;", "getRelated", "()Lcom/bamtechmedia/dominguez/detail/common/models/DmcRelatedContent;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@C11733i(generateAdapter = true)
/* compiled from: SeriesDetailModels.kt */
public final class DmcSeriesBundle implements Parcelable {
    public static final Creator CREATOR = new C6039a();

    /* renamed from: U */
    private final DmcSeries f13914U;

    /* renamed from: V */
    private final SeriesBundleSeasons f13915V;

    /* renamed from: W */
    private final SeriesBundleEpisodes f13916W;

    /* renamed from: X */
    private final DmcRelatedContent f13917X;

    /* renamed from: Y */
    private final DmcExtraContent f13918Y;

    /* renamed from: c */
    private final PromoLabel f13919c;

    /* renamed from: com.bamtechmedia.dominguez.detail.series.models.DmcSeriesBundle$a */
    public static class C6039a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            DmcSeriesBundle dmcSeriesBundle = new DmcSeriesBundle((PromoLabel) parcel.readParcelable(DmcSeriesBundle.class.getClassLoader()), (DmcSeries) parcel.readParcelable(DmcSeriesBundle.class.getClassLoader()), (SeriesBundleSeasons) SeriesBundleSeasons.CREATOR.createFromParcel(parcel), (SeriesBundleEpisodes) SeriesBundleEpisodes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? (DmcRelatedContent) DmcRelatedContent.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (DmcExtraContent) DmcExtraContent.CREATOR.createFromParcel(parcel) : null);
            return dmcSeriesBundle;
        }

        public final Object[] newArray(int i) {
            return new DmcSeriesBundle[i];
        }
    }

    public DmcSeriesBundle(PromoLabel promoLabel, @C11724g(name = "series") DmcSeries dmcSeries, @C11724g(name = "seasons") SeriesBundleSeasons seriesBundleSeasons, SeriesBundleEpisodes seriesBundleEpisodes, DmcRelatedContent dmcRelatedContent, DmcExtraContent dmcExtraContent) {
        this.f13919c = promoLabel;
        this.f13914U = dmcSeries;
        this.f13915V = seriesBundleSeasons;
        this.f13916W = seriesBundleEpisodes;
        this.f13917X = dmcRelatedContent;
        this.f13918Y = dmcExtraContent;
    }

    /* renamed from: a */
    public static /* synthetic */ DmcSeriesBundle m19331a(DmcSeriesBundle dmcSeriesBundle, PromoLabel promoLabel, DmcSeries dmcSeries, SeriesBundleSeasons seriesBundleSeasons, SeriesBundleEpisodes seriesBundleEpisodes, DmcRelatedContent dmcRelatedContent, DmcExtraContent dmcExtraContent, int i, Object obj) {
        if ((i & 1) != 0) {
            promoLabel = dmcSeriesBundle.f13919c;
        }
        if ((i & 2) != 0) {
            dmcSeries = dmcSeriesBundle.f13914U;
        }
        DmcSeries dmcSeries2 = dmcSeries;
        if ((i & 4) != 0) {
            seriesBundleSeasons = dmcSeriesBundle.f13915V;
        }
        SeriesBundleSeasons seriesBundleSeasons2 = seriesBundleSeasons;
        if ((i & 8) != 0) {
            seriesBundleEpisodes = dmcSeriesBundle.f13916W;
        }
        SeriesBundleEpisodes seriesBundleEpisodes2 = seriesBundleEpisodes;
        if ((i & 16) != 0) {
            dmcRelatedContent = dmcSeriesBundle.f13917X;
        }
        DmcRelatedContent dmcRelatedContent2 = dmcRelatedContent;
        if ((i & 32) != 0) {
            dmcExtraContent = dmcSeriesBundle.f13918Y;
        }
        return dmcSeriesBundle.copy(promoLabel, dmcSeries2, seriesBundleSeasons2, seriesBundleEpisodes2, dmcRelatedContent2, dmcExtraContent);
    }

    /* renamed from: X */
    public final SeriesBundleSeasons mo18177X() {
        return this.f13915V;
    }

    /* renamed from: Y */
    public final DmcSeries mo18178Y() {
        return this.f13914U;
    }

    /* renamed from: Z */
    public final SeriesBundleEpisodes mo18179Z() {
        return this.f13916W;
    }

    /* renamed from: a0 */
    public final DmcExtraContent mo18180a0() {
        return this.f13918Y;
    }

    /* renamed from: b0 */
    public final PromoLabel mo18181b0() {
        return this.f13919c;
    }

    /* renamed from: c0 */
    public final DmcRelatedContent mo18182c0() {
        return this.f13917X;
    }

    public final DmcSeriesBundle copy(PromoLabel promoLabel, @C11724g(name = "series") DmcSeries dmcSeries, @C11724g(name = "seasons") SeriesBundleSeasons seriesBundleSeasons, SeriesBundleEpisodes seriesBundleEpisodes, DmcRelatedContent dmcRelatedContent, DmcExtraContent dmcExtraContent) {
        DmcSeriesBundle dmcSeriesBundle = new DmcSeriesBundle(promoLabel, dmcSeries, seriesBundleSeasons, seriesBundleEpisodes, dmcRelatedContent, dmcExtraContent);
        return dmcSeriesBundle;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f13918Y, (java.lang.Object) r3.f13918Y) != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0047
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.detail.series.models.DmcSeriesBundle
            if (r0 == 0) goto L_0x0045
            com.bamtechmedia.dominguez.detail.series.models.DmcSeriesBundle r3 = (com.bamtechmedia.dominguez.detail.series.models.DmcSeriesBundle) r3
            com.bamtechmedia.dominguez.core.content.PromoLabel r0 = r2.f13919c
            com.bamtechmedia.dominguez.core.content.PromoLabel r1 = r3.f13919c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0045
            com.bamtechmedia.dominguez.core.content.assets.DmcSeries r0 = r2.f13914U
            com.bamtechmedia.dominguez.core.content.assets.DmcSeries r1 = r3.f13914U
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0045
            com.bamtechmedia.dominguez.detail.series.models.SeriesBundleSeasons r0 = r2.f13915V
            com.bamtechmedia.dominguez.detail.series.models.SeriesBundleSeasons r1 = r3.f13915V
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0045
            com.bamtechmedia.dominguez.detail.series.models.SeriesBundleEpisodes r0 = r2.f13916W
            com.bamtechmedia.dominguez.detail.series.models.SeriesBundleEpisodes r1 = r3.f13916W
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0045
            com.bamtechmedia.dominguez.detail.common.models.DmcRelatedContent r0 = r2.f13917X
            com.bamtechmedia.dominguez.detail.common.models.DmcRelatedContent r1 = r3.f13917X
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0045
            com.bamtechmedia.dominguez.detail.common.models.DmcExtraContent r0 = r2.f13918Y
            com.bamtechmedia.dominguez.detail.common.models.DmcExtraContent r3 = r3.f13918Y
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r3 = 0
            return r3
        L_0x0047:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.series.models.DmcSeriesBundle.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        PromoLabel promoLabel = this.f13919c;
        int i = 0;
        int hashCode = (promoLabel != null ? promoLabel.hashCode() : 0) * 31;
        DmcSeries dmcSeries = this.f13914U;
        int hashCode2 = (hashCode + (dmcSeries != null ? dmcSeries.hashCode() : 0)) * 31;
        SeriesBundleSeasons seriesBundleSeasons = this.f13915V;
        int hashCode3 = (hashCode2 + (seriesBundleSeasons != null ? seriesBundleSeasons.hashCode() : 0)) * 31;
        SeriesBundleEpisodes seriesBundleEpisodes = this.f13916W;
        int hashCode4 = (hashCode3 + (seriesBundleEpisodes != null ? seriesBundleEpisodes.hashCode() : 0)) * 31;
        DmcRelatedContent dmcRelatedContent = this.f13917X;
        int hashCode5 = (hashCode4 + (dmcRelatedContent != null ? dmcRelatedContent.hashCode() : 0)) * 31;
        DmcExtraContent dmcExtraContent = this.f13918Y;
        if (dmcExtraContent != null) {
            i = dmcExtraContent.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DmcSeriesBundle(label=");
        sb.append(this.f13919c);
        sb.append(", dmcSeries=");
        sb.append(this.f13914U);
        sb.append(", dmcSeasons=");
        sb.append(this.f13915V);
        sb.append(", episodes=");
        sb.append(this.f13916W);
        sb.append(", related=");
        sb.append(this.f13917X);
        sb.append(", extras=");
        sb.append(this.f13918Y);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f13919c, i);
        parcel.writeParcelable(this.f13914U, i);
        this.f13915V.writeToParcel(parcel, 0);
        this.f13916W.writeToParcel(parcel, 0);
        DmcRelatedContent dmcRelatedContent = this.f13917X;
        if (dmcRelatedContent != null) {
            parcel.writeInt(1);
            dmcRelatedContent.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        DmcExtraContent dmcExtraContent = this.f13918Y;
        if (dmcExtraContent != null) {
            parcel.writeInt(1);
            dmcExtraContent.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public /* synthetic */ DmcSeriesBundle(PromoLabel promoLabel, DmcSeries dmcSeries, SeriesBundleSeasons seriesBundleSeasons, SeriesBundleEpisodes seriesBundleEpisodes, DmcRelatedContent dmcRelatedContent, DmcExtraContent dmcExtraContent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(promoLabel, dmcSeries, seriesBundleSeasons, seriesBundleEpisodes, (i & 16) != 0 ? null : dmcRelatedContent, (i & 32) != 0 ? null : dmcExtraContent);
    }
}
