package com.bamtechmedia.dominguez.core.content.paging;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11734j;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11737m.C11739b;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11760v;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/paging/DefaultPagingMetaDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/core/content/paging/DefaultPagingMetaData;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "intAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultPagingMetaDataJsonAdapter.kt */
public final class DefaultPagingMetaDataJsonAdapter extends C11725h<DefaultPagingMetaData> {
    private final C11725h<Integer> intAdapter;
    private final C11739b options;

    public DefaultPagingMetaDataJsonAdapter(C11760v vVar) {
        String str = "hits";
        C11739b a = C11739b.m37729a(str, "page_size", "offset");
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "JsonReader.Options.of(\"h…\", \"page_size\", \"offset\")");
        this.options = a;
        C11725h<Integer> a2 = vVar.mo29869a((Type) Integer.TYPE, C13188p0.m40531a(), str);
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "moshi.adapter<Int>(Int::…tions.emptySet(), \"hits\")");
        this.intAdapter = a2;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, DefaultPagingMetaData defaultPagingMetaData) {
        if (defaultPagingMetaData != null) {
            sVar.mo29791b();
            sVar.mo29796e("hits");
            this.intAdapter.toJson(sVar, Integer.valueOf(defaultPagingMetaData.mo13413b0()));
            sVar.mo29796e("page_size");
            this.intAdapter.toJson(sVar, Integer.valueOf(defaultPagingMetaData.mo13411Z()));
            sVar.mo29796e("offset");
            this.intAdapter.toJson(sVar, Integer.valueOf(defaultPagingMetaData.mo13409X()));
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(DefaultPagingMetaData)";
    }

    public DefaultPagingMetaData fromJson(C11737m mVar) {
        mVar.mo29763b();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        while (mVar.mo29770f()) {
            int a = mVar.mo29758a(this.options);
            if (a == -1) {
                mVar.mo29783q();
                mVar.mo29784r();
            } else if (a == 0) {
                Integer num4 = (Integer) this.intAdapter.fromJson(mVar);
                if (num4 != null) {
                    num = Integer.valueOf(num4.intValue());
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Non-null value 'hits' was null at ");
                    sb.append(mVar.mo29775j0());
                    throw new C11734j(sb.toString());
                }
            } else if (a == 1) {
                Integer num5 = (Integer) this.intAdapter.fromJson(mVar);
                if (num5 != null) {
                    num2 = Integer.valueOf(num5.intValue());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Non-null value 'pageSize' was null at ");
                    sb2.append(mVar.mo29775j0());
                    throw new C11734j(sb2.toString());
                }
            } else if (a != 2) {
                continue;
            } else {
                Integer num6 = (Integer) this.intAdapter.fromJson(mVar);
                if (num6 != null) {
                    num3 = Integer.valueOf(num6.intValue());
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Non-null value 'offset' was null at ");
                    sb3.append(mVar.mo29775j0());
                    throw new C11734j(sb3.toString());
                }
            }
        }
        mVar.mo29767d();
        if (num != null) {
            int intValue = num.intValue();
            if (num2 != null) {
                int intValue2 = num2.intValue();
                if (num3 != null) {
                    return new DefaultPagingMetaData(intValue, intValue2, num3.intValue());
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Required property 'offset' missing at ");
                sb4.append(mVar.mo29775j0());
                throw new C11734j(sb4.toString());
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Required property 'pageSize' missing at ");
            sb5.append(mVar.mo29775j0());
            throw new C11734j(sb5.toString());
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append("Required property 'hits' missing at ");
        sb6.append(mVar.mo29775j0());
        throw new C11734j(sb6.toString());
    }
}
