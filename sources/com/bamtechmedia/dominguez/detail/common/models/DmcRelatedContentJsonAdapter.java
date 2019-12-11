package com.bamtechmedia.dominguez.detail.common.models;

import com.bamtechmedia.dominguez.core.content.assets.C3632f;
import com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11734j;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11737m.C11739b;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11760v;
import p163g.p500m.p501a.C11780y;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0017\u001a\u00020\fH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/models/DmcRelatedContentJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/detail/common/models/DmcRelatedContent;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "defaultPagingMetaDataAdapter", "Lcom/bamtechmedia/dominguez/core/content/paging/DefaultPagingMetaData;", "listOfDmcAssetAdapter", "", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcAsset;", "nullableStringAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DmcRelatedContentJsonAdapter.kt */
public final class DmcRelatedContentJsonAdapter extends C11725h<DmcRelatedContent> {
    private final C11725h<DefaultPagingMetaData> defaultPagingMetaDataAdapter;
    private final C11725h<List<C3632f>> listOfDmcAssetAdapter;
    private final C11725h<String> nullableStringAdapter;
    private final C11739b options;

    public DmcRelatedContentJsonAdapter(C11760v vVar) {
        String str = "experimentToken";
        String str2 = "meta";
        String str3 = "items";
        C11739b a = C11739b.m37729a(str3, str2, str);
        C12880j.m40222a((Object) a, "JsonReader.Options.of(\"i…meta\", \"experimentToken\")");
        this.options = a;
        C11725h<List<C3632f>> a2 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, C3632f.class), C13188p0.m40531a(), str3);
        C12880j.m40222a((Object) a2, "moshi.adapter<List<DmcAs…ions.emptySet(), \"items\")");
        this.listOfDmcAssetAdapter = a2;
        C11725h<DefaultPagingMetaData> a3 = vVar.mo29869a((Type) DefaultPagingMetaData.class, C13188p0.m40531a(), str2);
        C12880j.m40222a((Object) a3, "moshi.adapter<DefaultPag…tions.emptySet(), \"meta\")");
        this.defaultPagingMetaDataAdapter = a3;
        C11725h<String> a4 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), str);
        C12880j.m40222a((Object) a4, "moshi.adapter<String?>(S…Set(), \"experimentToken\")");
        this.nullableStringAdapter = a4;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, DmcRelatedContent dmcRelatedContent) {
        if (dmcRelatedContent != null) {
            sVar.mo29791b();
            sVar.mo29796e("items");
            this.listOfDmcAssetAdapter.toJson(sVar, dmcRelatedContent.mo17984X());
            sVar.mo29796e("meta");
            this.defaultPagingMetaDataAdapter.toJson(sVar, dmcRelatedContent.m19180f0());
            sVar.mo29796e("experimentToken");
            this.nullableStringAdapter.toJson(sVar, dmcRelatedContent.mo17987a());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(DmcRelatedContent)";
    }

    public DmcRelatedContent fromJson(C11737m mVar) {
        mVar.mo29763b();
        String str = null;
        boolean z = false;
        List list = null;
        DefaultPagingMetaData defaultPagingMetaData = null;
        while (mVar.mo29770f()) {
            int a = mVar.mo29758a(this.options);
            if (a == -1) {
                mVar.mo29783q();
                mVar.mo29784r();
            } else if (a == 0) {
                List list2 = (List) this.listOfDmcAssetAdapter.fromJson(mVar);
                if (list2 != null) {
                    list = list2;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Non-null value 'items' was null at ");
                    sb.append(mVar.mo29775j0());
                    throw new C11734j(sb.toString());
                }
            } else if (a == 1) {
                DefaultPagingMetaData defaultPagingMetaData2 = (DefaultPagingMetaData) this.defaultPagingMetaDataAdapter.fromJson(mVar);
                if (defaultPagingMetaData2 != null) {
                    defaultPagingMetaData = defaultPagingMetaData2;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Non-null value 'meta' was null at ");
                    sb2.append(mVar.mo29775j0());
                    throw new C11734j(sb2.toString());
                }
            } else if (a == 2) {
                str = (String) this.nullableStringAdapter.fromJson(mVar);
                z = true;
            }
        }
        mVar.mo29767d();
        if (list == null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Required property 'items' missing at ");
            sb3.append(mVar.mo29775j0());
            throw new C11734j(sb3.toString());
        } else if (defaultPagingMetaData != null) {
            DmcRelatedContent dmcRelatedContent = new DmcRelatedContent(list, defaultPagingMetaData, null, 4, null);
            if (!z) {
                str = dmcRelatedContent.mo17987a();
            }
            return DmcRelatedContent.m19171a(dmcRelatedContent, null, null, str, 3, null);
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Required property 'meta' missing at ");
            sb4.append(mVar.mo29775j0());
            throw new C11734j(sb4.toString());
        }
    }
}
