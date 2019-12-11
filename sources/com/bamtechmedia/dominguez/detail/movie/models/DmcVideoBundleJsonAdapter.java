package com.bamtechmedia.dominguez.detail.movie.models;

import com.bamtechmedia.dominguez.core.content.PromoLabel;
import com.bamtechmedia.dominguez.core.content.assets.DmcMovie;
import com.bamtechmedia.dominguez.detail.common.models.DmcExtraContent;
import com.bamtechmedia.dominguez.detail.common.models.DmcRelatedContent;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11737m.C11739b;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11760v;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/movie/models/DmcVideoBundleJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/detail/movie/models/DmcVideoBundle;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "nullableDmcExtraContentAdapter", "Lcom/bamtechmedia/dominguez/detail/common/models/DmcExtraContent;", "nullableDmcMovieAdapter", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcMovie;", "nullableDmcRelatedContentAdapter", "Lcom/bamtechmedia/dominguez/detail/common/models/DmcRelatedContent;", "nullablePromoLabelAdapter", "Lcom/bamtechmedia/dominguez/core/content/PromoLabel;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DmcVideoBundleJsonAdapter.kt */
public final class DmcVideoBundleJsonAdapter extends C11725h<DmcVideoBundle> {
    private final C11725h<DmcExtraContent> nullableDmcExtraContentAdapter;
    private final C11725h<DmcMovie> nullableDmcMovieAdapter;
    private final C11725h<DmcRelatedContent> nullableDmcRelatedContentAdapter;
    private final C11725h<PromoLabel> nullablePromoLabelAdapter;
    private final C11739b options;

    public DmcVideoBundleJsonAdapter(C11760v vVar) {
        String str = "related";
        String str2 = "extras";
        String str3 = "video";
        String str4 = "label";
        C11739b a = C11739b.m37729a(str4, str3, str2, str);
        C12880j.m40222a((Object) a, "JsonReader.Options.of(\"l…eo\", \"extras\", \"related\")");
        this.options = a;
        C11725h<PromoLabel> a2 = vVar.mo29869a((Type) PromoLabel.class, C13188p0.m40531a(), str4);
        C12880j.m40222a((Object) a2, "moshi.adapter<PromoLabel…ions.emptySet(), \"label\")");
        this.nullablePromoLabelAdapter = a2;
        C11725h<DmcMovie> a3 = vVar.mo29869a((Type) DmcMovie.class, C13188p0.m40531a(), str3);
        C12880j.m40222a((Object) a3, "moshi.adapter<DmcMovie?>…ions.emptySet(), \"video\")");
        this.nullableDmcMovieAdapter = a3;
        C11725h<DmcExtraContent> a4 = vVar.mo29869a((Type) DmcExtraContent.class, C13188p0.m40531a(), str2);
        C12880j.m40222a((Object) a4, "moshi.adapter<DmcExtraCo…ons.emptySet(), \"extras\")");
        this.nullableDmcExtraContentAdapter = a4;
        C11725h<DmcRelatedContent> a5 = vVar.mo29869a((Type) DmcRelatedContent.class, C13188p0.m40531a(), str);
        C12880j.m40222a((Object) a5, "moshi.adapter<DmcRelated…ns.emptySet(), \"related\")");
        this.nullableDmcRelatedContentAdapter = a5;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, DmcVideoBundle dmcVideoBundle) {
        if (dmcVideoBundle != null) {
            sVar.mo29791b();
            sVar.mo29796e("label");
            this.nullablePromoLabelAdapter.toJson(sVar, dmcVideoBundle.mo18085Y());
            sVar.mo29796e("video");
            this.nullableDmcMovieAdapter.toJson(sVar, dmcVideoBundle.mo18088a0());
            sVar.mo29796e("extras");
            this.nullableDmcExtraContentAdapter.toJson(sVar, dmcVideoBundle.mo18084X());
            sVar.mo29796e("related");
            this.nullableDmcRelatedContentAdapter.toJson(sVar, dmcVideoBundle.mo18086Z());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(DmcVideoBundle)";
    }

    public DmcVideoBundle fromJson(C11737m mVar) {
        C11737m mVar2 = mVar;
        mVar.mo29763b();
        boolean z = false;
        DmcExtraContent dmcExtraContent = null;
        PromoLabel promoLabel = null;
        DmcMovie dmcMovie = null;
        DmcRelatedContent dmcRelatedContent = null;
        boolean z2 = false;
        while (mVar.mo29770f()) {
            int a = mVar2.mo29758a(this.options);
            if (a == -1) {
                mVar.mo29783q();
                mVar.mo29784r();
            } else if (a == 0) {
                promoLabel = (PromoLabel) this.nullablePromoLabelAdapter.fromJson(mVar2);
            } else if (a == 1) {
                dmcMovie = (DmcMovie) this.nullableDmcMovieAdapter.fromJson(mVar2);
            } else if (a == 2) {
                dmcExtraContent = (DmcExtraContent) this.nullableDmcExtraContentAdapter.fromJson(mVar2);
                z = true;
            } else if (a == 3) {
                dmcRelatedContent = (DmcRelatedContent) this.nullableDmcRelatedContentAdapter.fromJson(mVar2);
                z2 = true;
            }
        }
        mVar.mo29767d();
        DmcVideoBundle dmcVideoBundle = new DmcVideoBundle(promoLabel, dmcMovie, null, null, 12, null);
        if (!z) {
            dmcExtraContent = dmcVideoBundle.mo18084X();
        }
        DmcExtraContent dmcExtraContent2 = dmcExtraContent;
        if (!z2) {
            dmcRelatedContent = dmcVideoBundle.mo18086Z();
        }
        return DmcVideoBundle.m19264a(dmcVideoBundle, null, null, dmcExtraContent2, dmcRelatedContent, 3, null);
    }
}
