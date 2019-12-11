package com.bamtechmedia.dominguez.detail.series.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bamtechmedia.dominguez.core.content.C3685g;
import com.bamtechmedia.dominguez.core.content.C3791v;
import com.bamtechmedia.dominguez.core.content.GenreMeta;
import com.bamtechmedia.dominguez.core.content.PromoLabel;
import com.bamtechmedia.dominguez.core.content.assets.C3647r;
import com.bamtechmedia.dominguez.core.content.assets.C3649t;
import com.bamtechmedia.dominguez.core.content.assets.DmcEpisode;
import com.bamtechmedia.dominguez.core.content.assets.DmcSeries;
import com.bamtechmedia.dominguez.detail.common.C5982j;
import com.bamtechmedia.dominguez.detail.common.C6003u;
import com.bamtechmedia.dominguez.detail.common.models.DmcExtraContent;
import com.bamtechmedia.dominguez.detail.common.models.DmcRelatedContent;
import com.bamtechmedia.dominguez.detail.common.p228e0.C5923c;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010G\u001a\u00020\u0004HÂ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010I\u001a\u00020\bHÂ\u0003J\t\u0010J\u001a\u00020\nHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u000eHÆ\u0003JK\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\t\u0010N\u001a\u00020OHÖ\u0001J\u0013\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010SHÖ\u0003J\t\u0010T\u001a\u00020OHÖ\u0001J\t\u0010U\u001a\u00020\u0011HÖ\u0001J\u0019\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020OHÖ\u0001R\u001a\u0010\u0010\u001a\u00020\u00118VX\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u00198VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001e8VX\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010!R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010$\u001a\u0004\u0018\u00010%8VX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u00118VX\u0004¢\u0006\f\u0012\u0004\b+\u0010\u0013\u001a\u0004\b,\u0010\u0015R$\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020.@RX\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u0013\u001a\u0004\b1\u00102R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001a\u00105\u001a\u0002068VX\u0004¢\u0006\f\u0012\u0004\b7\u0010\u0013\u001a\u0004\b8\u00109R\u0014\u0010:\u001a\u00020;8VX\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020?8VX\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020D0C8VX\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006["}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/models/DmcSeriesDetail;", "Lcom/bamtechmedia/dominguez/detail/series/models/SeriesDetail;", "Landroid/os/Parcelable;", "dmcSeries", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcSeries;", "label", "Lcom/bamtechmedia/dominguez/core/content/PromoLabel;", "dmcSeasons", "Lcom/bamtechmedia/dominguez/detail/series/models/SeriesBundleSeasons;", "episodes", "Lcom/bamtechmedia/dominguez/detail/series/models/SeriesBundleEpisodes;", "related", "Lcom/bamtechmedia/dominguez/detail/common/models/DmcRelatedContent;", "extras", "Lcom/bamtechmedia/dominguez/detail/common/models/DmcExtraContent;", "(Lcom/bamtechmedia/dominguez/core/content/assets/DmcSeries;Lcom/bamtechmedia/dominguez/core/content/PromoLabel;Lcom/bamtechmedia/dominguez/detail/series/models/SeriesBundleSeasons;Lcom/bamtechmedia/dominguez/detail/series/models/SeriesBundleEpisodes;Lcom/bamtechmedia/dominguez/detail/common/models/DmcRelatedContent;Lcom/bamtechmedia/dominguez/detail/common/models/DmcExtraContent;)V", "briefDescription", "", "briefDescription$annotations", "()V", "getBriefDescription", "()Ljava/lang/String;", "getEpisodes", "()Lcom/bamtechmedia/dominguez/detail/series/models/SeriesBundleEpisodes;", "episodesPerSeason", "", "Lcom/bamtechmedia/dominguez/detail/series/models/PagedEpisodes;", "getEpisodesPerSeason", "()Ljava/util/Map;", "extraContent", "Lcom/bamtechmedia/dominguez/detail/common/ExtraContent;", "extraContent$annotations", "getExtraContent", "()Lcom/bamtechmedia/dominguez/detail/common/ExtraContent;", "getExtras", "()Lcom/bamtechmedia/dominguez/detail/common/models/DmcExtraContent;", "firstEpisode", "Lcom/bamtechmedia/dominguez/core/content/Episode;", "getFirstEpisode", "()Lcom/bamtechmedia/dominguez/core/content/Episode;", "getLabel", "()Lcom/bamtechmedia/dominguez/core/content/PromoLabel;", "mediumDescription", "mediumDescription$annotations", "getMediumDescription", "<set-?>", "Lcom/bamtechmedia/dominguez/detail/common/metadata/PlayableMetadata;", "metadata", "metadata$annotations", "getMetadata", "()Lcom/bamtechmedia/dominguez/detail/common/metadata/PlayableMetadata;", "getRelated", "()Lcom/bamtechmedia/dominguez/detail/common/models/DmcRelatedContent;", "relatedContent", "Lcom/bamtechmedia/dominguez/detail/common/RelatedContent;", "relatedContent$annotations", "getRelatedContent", "()Lcom/bamtechmedia/dominguez/detail/common/RelatedContent;", "seasons", "Lcom/bamtechmedia/dominguez/detail/series/models/PagedSeasons;", "getSeasons", "()Lcom/bamtechmedia/dominguez/detail/series/models/PagedSeasons;", "series", "Lcom/bamtechmedia/dominguez/core/content/Series;", "getSeries", "()Lcom/bamtechmedia/dominguez/core/content/Series;", "typedGenres", "", "Lcom/bamtechmedia/dominguez/core/content/GenreMeta;", "getTypedGenres", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.detail.series.models.a */
/* compiled from: SeriesDetailModels.kt */
public final class C6042a implements C6046d, Parcelable {
    public static final Creator CREATOR = new C6043a();

    /* renamed from: U */
    private final DmcSeries f13925U;

    /* renamed from: V */
    private final PromoLabel f13926V;

    /* renamed from: W */
    private final SeriesBundleSeasons f13927W;

    /* renamed from: X */
    private final SeriesBundleEpisodes f13928X;

    /* renamed from: Y */
    private final DmcRelatedContent f13929Y;

    /* renamed from: Z */
    private final DmcExtraContent f13930Z;

    /* renamed from: c */
    private transient C5923c f13931c;

    /* renamed from: com.bamtechmedia.dominguez.detail.series.models.a$a */
    public static class C6043a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C6042a aVar = new C6042a((DmcSeries) parcel.readParcelable(C6042a.class.getClassLoader()), (PromoLabel) parcel.readParcelable(C6042a.class.getClassLoader()), (SeriesBundleSeasons) SeriesBundleSeasons.CREATOR.createFromParcel(parcel), (SeriesBundleEpisodes) SeriesBundleEpisodes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? (DmcRelatedContent) DmcRelatedContent.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (DmcExtraContent) DmcExtraContent.CREATOR.createFromParcel(parcel) : null);
            return aVar;
        }

        public final Object[] newArray(int i) {
            return new C6042a[i];
        }
    }

    public C6042a(DmcSeries dmcSeries, PromoLabel promoLabel, SeriesBundleSeasons seriesBundleSeasons, SeriesBundleEpisodes seriesBundleEpisodes, DmcRelatedContent dmcRelatedContent, DmcExtraContent dmcExtraContent) {
        this.f13925U = dmcSeries;
        this.f13926V = promoLabel;
        this.f13927W = seriesBundleSeasons;
        this.f13928X = seriesBundleEpisodes;
        this.f13929Y = dmcRelatedContent;
        this.f13930Z = dmcExtraContent;
        C5923c cVar = new C5923c(this.f13925U.getTitle(), this.f13925U.getDescription(), null, null, null, null, null, null, null, null, null, 2044, null);
        this.f13931c = cVar;
    }

    /* renamed from: X */
    public C5923c mo18281X() {
        return this.f13931c;
    }

    /* renamed from: Y */
    public C5982j mo18282Y() {
        DmcExtraContent dmcExtraContent = this.f13930Z;
        return dmcExtraContent != null ? dmcExtraContent : new DmcExtraContent(C13185o.m40513a(), C6047e.f13932a);
    }

    /* renamed from: Z */
    public PromoLabel mo18283Z() {
        return this.f13926V;
    }

    /* renamed from: a0 */
    public C6003u mo18284a0() {
        DmcRelatedContent dmcRelatedContent = this.f13929Y;
        if (dmcRelatedContent != null) {
            return dmcRelatedContent;
        }
        DmcRelatedContent dmcRelatedContent2 = new DmcRelatedContent(C13185o.m40513a(), C6047e.f13932a, null, 4, null);
        return dmcRelatedContent2;
    }

    /* renamed from: b0 */
    public String mo18285b0() {
        return this.f13925U.mo13261a(C3649t.BRIEF, C3647r.SERIES);
    }

    /* renamed from: c */
    public List<GenreMeta> mo18286c() {
        return this.f13925U.mo12896c();
    }

    /* renamed from: c0 */
    public C6045c mo18287c0() {
        return this.f13927W;
    }

    /* renamed from: d0 */
    public C3791v mo18288d0() {
        return this.f13925U;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e0 */
    public C3685g mo18290e0() {
        Object obj;
        Iterator it = this.f13928X.mo18202Z().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Integer R = ((DmcEpisode) obj).mo12884R();
            boolean z = true;
            if (R == null || R.intValue() != 1) {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (C3685g) obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f13930Z, (java.lang.Object) r3.f13930Z) != false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x004b
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.detail.series.models.C6042a
            if (r0 == 0) goto L_0x0049
            com.bamtechmedia.dominguez.detail.series.models.a r3 = (com.bamtechmedia.dominguez.detail.series.models.C6042a) r3
            com.bamtechmedia.dominguez.core.content.assets.DmcSeries r0 = r2.f13925U
            com.bamtechmedia.dominguez.core.content.assets.DmcSeries r1 = r3.f13925U
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0049
            com.bamtechmedia.dominguez.core.content.PromoLabel r0 = r2.mo18283Z()
            com.bamtechmedia.dominguez.core.content.PromoLabel r1 = r3.mo18283Z()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0049
            com.bamtechmedia.dominguez.detail.series.models.SeriesBundleSeasons r0 = r2.f13927W
            com.bamtechmedia.dominguez.detail.series.models.SeriesBundleSeasons r1 = r3.f13927W
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0049
            com.bamtechmedia.dominguez.detail.series.models.SeriesBundleEpisodes r0 = r2.f13928X
            com.bamtechmedia.dominguez.detail.series.models.SeriesBundleEpisodes r1 = r3.f13928X
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0049
            com.bamtechmedia.dominguez.detail.common.models.DmcRelatedContent r0 = r2.f13929Y
            com.bamtechmedia.dominguez.detail.common.models.DmcRelatedContent r1 = r3.f13929Y
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0049
            com.bamtechmedia.dominguez.detail.common.models.DmcExtraContent r0 = r2.f13930Z
            com.bamtechmedia.dominguez.detail.common.models.DmcExtraContent r3 = r3.f13930Z
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            r3 = 0
            return r3
        L_0x004b:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.detail.series.models.C6042a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        DmcSeries dmcSeries = this.f13925U;
        int i = 0;
        int hashCode = (dmcSeries != null ? dmcSeries.hashCode() : 0) * 31;
        PromoLabel Z = mo18283Z();
        int hashCode2 = (hashCode + (Z != null ? Z.hashCode() : 0)) * 31;
        SeriesBundleSeasons seriesBundleSeasons = this.f13927W;
        int hashCode3 = (hashCode2 + (seriesBundleSeasons != null ? seriesBundleSeasons.hashCode() : 0)) * 31;
        SeriesBundleEpisodes seriesBundleEpisodes = this.f13928X;
        int hashCode4 = (hashCode3 + (seriesBundleEpisodes != null ? seriesBundleEpisodes.hashCode() : 0)) * 31;
        DmcRelatedContent dmcRelatedContent = this.f13929Y;
        int hashCode5 = (hashCode4 + (dmcRelatedContent != null ? dmcRelatedContent.hashCode() : 0)) * 31;
        DmcExtraContent dmcExtraContent = this.f13930Z;
        if (dmcExtraContent != null) {
            i = dmcExtraContent.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DmcSeriesDetail(dmcSeries=");
        sb.append(this.f13925U);
        sb.append(", label=");
        sb.append(mo18283Z());
        sb.append(", dmcSeasons=");
        sb.append(this.f13927W);
        sb.append(", episodes=");
        sb.append(this.f13928X);
        sb.append(", related=");
        sb.append(this.f13929Y);
        sb.append(", extras=");
        sb.append(this.f13930Z);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f13925U, i);
        parcel.writeParcelable(this.f13926V, i);
        this.f13927W.writeToParcel(parcel, 0);
        this.f13928X.writeToParcel(parcel, 0);
        DmcRelatedContent dmcRelatedContent = this.f13929Y;
        if (dmcRelatedContent != null) {
            parcel.writeInt(1);
            dmcRelatedContent.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        DmcExtraContent dmcExtraContent = this.f13930Z;
        if (dmcExtraContent != null) {
            parcel.writeInt(1);
            dmcExtraContent.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }
}
