package com.bamtechmedia.dominguez.detail.series.models;

import com.bamtechmedia.dominguez.core.content.PromoLabel;
import com.bamtechmedia.dominguez.core.content.assets.DmcSeries;
import com.bamtechmedia.dominguez.detail.common.models.DmcExtraContent;
import com.bamtechmedia.dominguez.detail.common.models.DmcRelatedContent;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11734j;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11737m.C11739b;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11760v;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0001X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/models/DmcSeriesBundleJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/detail/series/models/DmcSeriesBundle;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "nullableDmcExtraContentAdapter", "Lcom/bamtechmedia/dominguez/detail/common/models/DmcExtraContent;", "nullableDmcRelatedContentAdapter", "Lcom/bamtechmedia/dominguez/detail/common/models/DmcRelatedContent;", "nullableDmcSeriesAdapter", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcSeries;", "nullablePromoLabelAdapter", "Lcom/bamtechmedia/dominguez/core/content/PromoLabel;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "seriesBundleEpisodesAdapter", "Lcom/bamtechmedia/dominguez/detail/series/models/SeriesBundleEpisodes;", "seriesBundleSeasonsAdapter", "Lcom/bamtechmedia/dominguez/detail/series/models/SeriesBundleSeasons;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DmcSeriesBundleJsonAdapter.kt */
public final class DmcSeriesBundleJsonAdapter extends C11725h<DmcSeriesBundle> {
    private final C11725h<DmcExtraContent> nullableDmcExtraContentAdapter;
    private final C11725h<DmcRelatedContent> nullableDmcRelatedContentAdapter;
    private final C11725h<DmcSeries> nullableDmcSeriesAdapter;
    private final C11725h<PromoLabel> nullablePromoLabelAdapter;
    private final C11739b options;
    private final C11725h<SeriesBundleEpisodes> seriesBundleEpisodesAdapter;
    private final C11725h<SeriesBundleSeasons> seriesBundleSeasonsAdapter;

    public DmcSeriesBundleJsonAdapter(C11760v vVar) {
        C11739b a = C11739b.m37729a("label", "series", "seasons", "episodes", "related", "extras");
        C12880j.m40222a((Object) a, "JsonReader.Options.of(\"l…es\", \"related\", \"extras\")");
        this.options = a;
        C11725h<PromoLabel> a2 = vVar.mo29869a((Type) PromoLabel.class, C13188p0.m40531a(), "label");
        C12880j.m40222a((Object) a2, "moshi.adapter<PromoLabel…ions.emptySet(), \"label\")");
        this.nullablePromoLabelAdapter = a2;
        C11725h<DmcSeries> a3 = vVar.mo29869a((Type) DmcSeries.class, C13188p0.m40531a(), "dmcSeries");
        C12880j.m40222a((Object) a3, "moshi.adapter<DmcSeries?….emptySet(), \"dmcSeries\")");
        this.nullableDmcSeriesAdapter = a3;
        C11725h<SeriesBundleSeasons> a4 = vVar.mo29869a((Type) SeriesBundleSeasons.class, C13188p0.m40531a(), "dmcSeasons");
        C12880j.m40222a((Object) a4, "moshi.adapter<SeriesBund…emptySet(), \"dmcSeasons\")");
        this.seriesBundleSeasonsAdapter = a4;
        C11725h<SeriesBundleEpisodes> a5 = vVar.mo29869a((Type) SeriesBundleEpisodes.class, C13188p0.m40531a(), "episodes");
        C12880j.m40222a((Object) a5, "moshi.adapter<SeriesBund…s.emptySet(), \"episodes\")");
        this.seriesBundleEpisodesAdapter = a5;
        C11725h<DmcRelatedContent> a6 = vVar.mo29869a((Type) DmcRelatedContent.class, C13188p0.m40531a(), "related");
        C12880j.m40222a((Object) a6, "moshi.adapter<DmcRelated…ns.emptySet(), \"related\")");
        this.nullableDmcRelatedContentAdapter = a6;
        C11725h<DmcExtraContent> a7 = vVar.mo29869a((Type) DmcExtraContent.class, C13188p0.m40531a(), "extras");
        C12880j.m40222a((Object) a7, "moshi.adapter<DmcExtraCo…ons.emptySet(), \"extras\")");
        this.nullableDmcExtraContentAdapter = a7;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, DmcSeriesBundle dmcSeriesBundle) {
        if (dmcSeriesBundle != null) {
            sVar.mo29791b();
            sVar.mo29796e("label");
            this.nullablePromoLabelAdapter.toJson(sVar, dmcSeriesBundle.mo18181b0());
            sVar.mo29796e("series");
            this.nullableDmcSeriesAdapter.toJson(sVar, dmcSeriesBundle.mo18178Y());
            sVar.mo29796e("seasons");
            this.seriesBundleSeasonsAdapter.toJson(sVar, dmcSeriesBundle.mo18177X());
            sVar.mo29796e("episodes");
            this.seriesBundleEpisodesAdapter.toJson(sVar, dmcSeriesBundle.mo18179Z());
            sVar.mo29796e("related");
            this.nullableDmcRelatedContentAdapter.toJson(sVar, dmcSeriesBundle.mo18182c0());
            sVar.mo29796e("extras");
            this.nullableDmcExtraContentAdapter.toJson(sVar, dmcSeriesBundle.mo18180a0());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(DmcSeriesBundle)";
    }

    public DmcSeriesBundle fromJson(C11737m mVar) {
        C11737m mVar2 = mVar;
        mVar.mo29763b();
        boolean z = false;
        DmcRelatedContent dmcRelatedContent = null;
        PromoLabel promoLabel = null;
        DmcSeries dmcSeries = null;
        SeriesBundleSeasons seriesBundleSeasons = null;
        SeriesBundleEpisodes seriesBundleEpisodes = null;
        DmcExtraContent dmcExtraContent = null;
        boolean z2 = false;
        while (mVar.mo29770f()) {
            switch (mVar2.mo29758a(this.options)) {
                case -1:
                    mVar.mo29783q();
                    mVar.mo29784r();
                    break;
                case 0:
                    promoLabel = (PromoLabel) this.nullablePromoLabelAdapter.fromJson(mVar2);
                    break;
                case 1:
                    dmcSeries = (DmcSeries) this.nullableDmcSeriesAdapter.fromJson(mVar2);
                    break;
                case 2:
                    SeriesBundleSeasons seriesBundleSeasons2 = (SeriesBundleSeasons) this.seriesBundleSeasonsAdapter.fromJson(mVar2);
                    if (seriesBundleSeasons2 != null) {
                        seriesBundleSeasons = seriesBundleSeasons2;
                        break;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Non-null value 'dmcSeasons' was null at ");
                        sb.append(mVar.mo29775j0());
                        throw new C11734j(sb.toString());
                    }
                case 3:
                    SeriesBundleEpisodes seriesBundleEpisodes2 = (SeriesBundleEpisodes) this.seriesBundleEpisodesAdapter.fromJson(mVar2);
                    if (seriesBundleEpisodes2 != null) {
                        seriesBundleEpisodes = seriesBundleEpisodes2;
                        break;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Non-null value 'episodes' was null at ");
                        sb2.append(mVar.mo29775j0());
                        throw new C11734j(sb2.toString());
                    }
                case 4:
                    dmcRelatedContent = (DmcRelatedContent) this.nullableDmcRelatedContentAdapter.fromJson(mVar2);
                    z = true;
                    break;
                case 5:
                    dmcExtraContent = (DmcExtraContent) this.nullableDmcExtraContentAdapter.fromJson(mVar2);
                    z2 = true;
                    break;
            }
        }
        mVar.mo29767d();
        if (seriesBundleSeasons == null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Required property 'dmcSeasons' missing at ");
            sb3.append(mVar.mo29775j0());
            throw new C11734j(sb3.toString());
        } else if (seriesBundleEpisodes != null) {
            DmcSeriesBundle dmcSeriesBundle = new DmcSeriesBundle(promoLabel, dmcSeries, seriesBundleSeasons, seriesBundleEpisodes, null, null, 48, null);
            if (!z) {
                dmcRelatedContent = dmcSeriesBundle.mo18182c0();
            }
            DmcRelatedContent dmcRelatedContent2 = dmcRelatedContent;
            if (!z2) {
                dmcExtraContent = dmcSeriesBundle.mo18180a0();
            }
            return DmcSeriesBundle.m19331a(dmcSeriesBundle, null, null, null, null, dmcRelatedContent2, dmcExtraContent, 15, null);
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Required property 'episodes' missing at ");
            sb4.append(mVar.mo29775j0());
            throw new C11734j(sb4.toString());
        }
    }
}
