package com.bamtechmedia.dominguez.detail.common.models;

import com.bamtechmedia.dominguez.core.content.assets.DmcExtra;
import com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11734j;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11737m.C11739b;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11760v;
import p163g.p500m.p501a.C11780y;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/models/DmcExtraContentJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/detail/common/models/DmcExtraContent;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "defaultPagingMetaDataAdapter", "Lcom/bamtechmedia/dominguez/core/content/paging/DefaultPagingMetaData;", "listOfDmcExtraAdapter", "", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcExtra;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DmcExtraContentJsonAdapter.kt */
public final class DmcExtraContentJsonAdapter extends C11725h<DmcExtraContent> {
    private final C11725h<DefaultPagingMetaData> defaultPagingMetaDataAdapter;
    private final C11725h<List<DmcExtra>> listOfDmcExtraAdapter;
    private final C11739b options;

    public DmcExtraContentJsonAdapter(C11760v vVar) {
        String str = "meta";
        String str2 = "videos";
        C11739b a = C11739b.m37729a(str2, str);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "JsonReader.Options.of(\"videos\", \"meta\")");
        this.options = a;
        C11725h<List<DmcExtra>> a2 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, DmcExtra.class), C13188p0.m40531a(), str2);
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "moshi.adapter<List<DmcEx…ons.emptySet(), \"videos\")");
        this.listOfDmcExtraAdapter = a2;
        C11725h<DefaultPagingMetaData> a3 = vVar.mo29869a((Type) DefaultPagingMetaData.class, C13188p0.m40531a(), str);
        Intrinsics.checkReturnedValueIsNotNull((Object) a3, "moshi.adapter<DefaultPag…tions.emptySet(), \"meta\")");
        this.defaultPagingMetaDataAdapter = a3;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, DmcExtraContent dmcExtraContent) {
        if (dmcExtraContent != null) {
            sVar.mo29791b();
            sVar.mo29796e("videos");
            this.listOfDmcExtraAdapter.toJson(sVar, dmcExtraContent.mo17938Y());
            sVar.mo29796e("meta");
            this.defaultPagingMetaDataAdapter.toJson(sVar, dmcExtraContent.m19167f0());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(DmcExtraContent)";
    }

    public DmcExtraContent fromJson(C11737m mVar) {
        mVar.mo29763b();
        List list = null;
        DefaultPagingMetaData defaultPagingMetaData = null;
        while (mVar.mo29770f()) {
            int a = mVar.mo29758a(this.options);
            if (a == -1) {
                mVar.mo29783q();
                mVar.mo29784r();
            } else if (a == 0) {
                list = (List) this.listOfDmcExtraAdapter.fromJson(mVar);
                if (list == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Non-null value 'videos' was null at ");
                    sb.append(mVar.mo29775j0());
                    throw new C11734j(sb.toString());
                }
            } else if (a != 1) {
                continue;
            } else {
                defaultPagingMetaData = (DefaultPagingMetaData) this.defaultPagingMetaDataAdapter.fromJson(mVar);
                if (defaultPagingMetaData == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Non-null value 'meta' was null at ");
                    sb2.append(mVar.mo29775j0());
                    throw new C11734j(sb2.toString());
                }
            }
        }
        mVar.mo29767d();
        if (list == null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Required property 'videos' missing at ");
            sb3.append(mVar.mo29775j0());
            throw new C11734j(sb3.toString());
        } else if (defaultPagingMetaData != null) {
            return new DmcExtraContent(list, defaultPagingMetaData);
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Required property 'meta' missing at ");
            sb4.append(mVar.mo29775j0());
            throw new C11734j(sb4.toString());
        }
    }
}
