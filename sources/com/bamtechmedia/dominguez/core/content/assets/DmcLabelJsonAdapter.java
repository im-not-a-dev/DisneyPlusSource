package com.bamtechmedia.dominguez.core.content.assets;

import com.bamtechmedia.dominguez.core.content.PromoLabel;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11737m.C11739b;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11760v;
import p163g.p500m.p501a.C11780y;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/DmcLabelJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcLabel;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "nullableDmcWatchlistLabelAdapter", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcWatchlistLabel;", "nullableListOfPromoLabelAdapter", "", "Lcom/bamtechmedia/dominguez/core/content/PromoLabel;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DmcLabelJsonAdapter.kt */
public final class DmcLabelJsonAdapter extends C11725h<DmcLabel> {
    private final C11725h<DmcWatchlistLabel> nullableDmcWatchlistLabelAdapter;
    private final C11725h<List<PromoLabel>> nullableListOfPromoLabelAdapter;
    private final C11739b options;

    public DmcLabelJsonAdapter(C11760v vVar) {
        String str = "promoLabels";
        String str2 = "watchlistLabel";
        C11739b a = C11739b.m37729a(str2, str);
        C12880j.m40222a((Object) a, "JsonReader.Options.of(\"w…istLabel\", \"promoLabels\")");
        this.options = a;
        C11725h<DmcWatchlistLabel> a2 = vVar.mo29869a((Type) DmcWatchlistLabel.class, C13188p0.m40531a(), str2);
        C12880j.m40222a((Object) a2, "moshi.adapter<DmcWatchli…ySet(), \"watchlistLabel\")");
        this.nullableDmcWatchlistLabelAdapter = a2;
        C11725h<List<PromoLabel>> a3 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, PromoLabel.class), C13188p0.m40531a(), str);
        C12880j.m40222a((Object) a3, "moshi.adapter<List<Promo…mptySet(), \"promoLabels\")");
        this.nullableListOfPromoLabelAdapter = a3;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, DmcLabel dmcLabel) {
        if (dmcLabel != null) {
            sVar.mo29791b();
            sVar.mo29796e("watchlistLabel");
            this.nullableDmcWatchlistLabelAdapter.toJson(sVar, dmcLabel.mo12940Y());
            sVar.mo29796e("promoLabels");
            this.nullableListOfPromoLabelAdapter.toJson(sVar, dmcLabel.mo12939X());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(DmcLabel)";
    }

    public DmcLabel fromJson(C11737m mVar) {
        mVar.mo29763b();
        DmcWatchlistLabel dmcWatchlistLabel = null;
        List list = null;
        while (mVar.mo29770f()) {
            int a = mVar.mo29758a(this.options);
            if (a == -1) {
                mVar.mo29783q();
                mVar.mo29784r();
            } else if (a == 0) {
                dmcWatchlistLabel = (DmcWatchlistLabel) this.nullableDmcWatchlistLabelAdapter.fromJson(mVar);
            } else if (a == 1) {
                list = (List) this.nullableListOfPromoLabelAdapter.fromJson(mVar);
            }
        }
        mVar.mo29767d();
        return new DmcLabel(dmcWatchlistLabel, list);
    }
}
