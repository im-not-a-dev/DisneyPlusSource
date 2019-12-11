package com.bamtechmedia.dominguez.detail.series.data;

import com.bamtechmedia.dominguez.core.content.assets.DmcEpisode;
import com.bamtechmedia.dominguez.core.content.assets.DmcLabel;
import com.bamtechmedia.dominguez.detail.series.data.RemoteSeriesDetailDataSource.ContinueWatchingSeries;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11737m.C11739b;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11760v;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/data/RemoteSeriesDetailDataSource_ContinueWatchingSeriesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/detail/series/data/RemoteSeriesDetailDataSource$ContinueWatchingSeries;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "nullableDmcEpisodeAdapter", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcEpisode;", "nullableDmcLabelAdapter", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcLabel;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: RemoteSeriesDetailDataSource_ContinueWatchingSeriesJsonAdapter.kt */
public final class RemoteSeriesDetailDataSource_ContinueWatchingSeriesJsonAdapter extends C11725h<ContinueWatchingSeries> {
    private final C11725h<DmcEpisode> nullableDmcEpisodeAdapter;
    private final C11725h<DmcLabel> nullableDmcLabelAdapter;
    private final C11739b options;

    public RemoteSeriesDetailDataSource_ContinueWatchingSeriesJsonAdapter(C11760v vVar) {
        String str = "labels";
        String str2 = "resume";
        C11739b a = C11739b.m37729a(str2, str);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "JsonReader.Options.of(\"resume\", \"labels\")");
        this.options = a;
        C11725h<DmcEpisode> a2 = vVar.mo29869a((Type) DmcEpisode.class, C13188p0.m40531a(), str2);
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "moshi.adapter<DmcEpisode…ons.emptySet(), \"resume\")");
        this.nullableDmcEpisodeAdapter = a2;
        C11725h<DmcLabel> a3 = vVar.mo29869a((Type) DmcLabel.class, C13188p0.m40531a(), str);
        Intrinsics.checkReturnedValueIsNotNull((Object) a3, "moshi.adapter<DmcLabel?>…ons.emptySet(), \"labels\")");
        this.nullableDmcLabelAdapter = a3;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, ContinueWatchingSeries continueWatchingSeries) {
        if (continueWatchingSeries != null) {
            sVar.mo29791b();
            sVar.mo29796e("resume");
            this.nullableDmcEpisodeAdapter.toJson(sVar, continueWatchingSeries.mo18141b());
            sVar.mo29796e("labels");
            this.nullableDmcLabelAdapter.toJson(sVar, continueWatchingSeries.mo18140a());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(RemoteSeriesDetailDataSource.ContinueWatchingSeries)";
    }

    public ContinueWatchingSeries fromJson(C11737m mVar) {
        mVar.mo29763b();
        DmcEpisode dmcEpisode = null;
        DmcLabel dmcLabel = null;
        while (mVar.mo29770f()) {
            int a = mVar.mo29758a(this.options);
            if (a == -1) {
                mVar.mo29783q();
                mVar.mo29784r();
            } else if (a == 0) {
                dmcEpisode = (DmcEpisode) this.nullableDmcEpisodeAdapter.fromJson(mVar);
            } else if (a == 1) {
                dmcLabel = (DmcLabel) this.nullableDmcLabelAdapter.fromJson(mVar);
            }
        }
        mVar.mo29767d();
        return new ContinueWatchingSeries(dmcEpisode, dmcLabel);
    }
}
