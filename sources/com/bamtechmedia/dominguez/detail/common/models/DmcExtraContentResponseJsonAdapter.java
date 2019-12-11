package com.bamtechmedia.dominguez.detail.common.models;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11734j;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11737m.C11739b;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11760v;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/models/DmcExtraContentResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/detail/common/models/DmcExtraContentResponse;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "dmcExtraContentAdapter", "Lcom/bamtechmedia/dominguez/detail/common/models/DmcExtraContent;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DmcExtraContentResponseJsonAdapter.kt */
public final class DmcExtraContentResponseJsonAdapter extends C11725h<DmcExtraContentResponse> {
    private final C11725h<DmcExtraContent> dmcExtraContentAdapter;
    private final C11739b options;

    public DmcExtraContentResponseJsonAdapter(C11760v vVar) {
        C11739b a = C11739b.m37729a("DmcExtras");
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "JsonReader.Options.of(\"DmcExtras\")");
        this.options = a;
        C11725h<DmcExtraContent> a2 = vVar.mo29869a((Type) DmcExtraContent.class, C13188p0.m40531a(), "extrasContent");
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "moshi.adapter<DmcExtraCo…tySet(), \"extrasContent\")");
        this.dmcExtraContentAdapter = a2;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, DmcExtraContentResponse dmcExtraContentResponse) {
        if (dmcExtraContentResponse != null) {
            sVar.mo29791b();
            sVar.mo29796e("DmcExtras");
            this.dmcExtraContentAdapter.toJson(sVar, dmcExtraContentResponse.mo17977a());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(DmcExtraContentResponse)";
    }

    public DmcExtraContentResponse fromJson(C11737m mVar) {
        mVar.mo29763b();
        DmcExtraContent dmcExtraContent = null;
        while (mVar.mo29770f()) {
            int a = mVar.mo29758a(this.options);
            if (a == -1) {
                mVar.mo29783q();
                mVar.mo29784r();
            } else if (a != 0) {
                continue;
            } else {
                dmcExtraContent = (DmcExtraContent) this.dmcExtraContentAdapter.fromJson(mVar);
                if (dmcExtraContent == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Non-null value 'extrasContent' was null at ");
                    sb.append(mVar.mo29775j0());
                    throw new C11734j(sb.toString());
                }
            }
        }
        mVar.mo29767d();
        if (dmcExtraContent != null) {
            return new DmcExtraContentResponse(dmcExtraContent);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Required property 'extrasContent' missing at ");
        sb2.append(mVar.mo29775j0());
        throw new C11734j(sb2.toString());
    }
}
