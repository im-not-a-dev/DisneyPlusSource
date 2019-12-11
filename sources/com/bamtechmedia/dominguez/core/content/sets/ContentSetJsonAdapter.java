package com.bamtechmedia.dominguez.core.content.sets;

import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.assets.TextEntry;
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

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u001a\u001a\u00020\u000eH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/sets/ContentSetJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/core/content/sets/ContentSet;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "defaultPagingMetaDataAdapter", "Lcom/bamtechmedia/dominguez/core/content/paging/DefaultPagingMetaData;", "listOfAssetAdapter", "", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "listOfTextEntryAdapter", "Lcom/bamtechmedia/dominguez/core/content/assets/TextEntry;", "nullableStringAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ContentSetJsonAdapter.kt */
public final class ContentSetJsonAdapter extends C11725h<ContentSet> {
    private final C11725h<DefaultPagingMetaData> defaultPagingMetaDataAdapter;
    private final C11725h<List<C3626b>> listOfAssetAdapter;
    private final C11725h<List<TextEntry>> listOfTextEntryAdapter;
    private final C11725h<String> nullableStringAdapter;
    private final C11739b options;
    private final C11725h<String> stringAdapter;

    public ContentSetJsonAdapter(C11760v vVar) {
        C11739b a = C11739b.m37729a("setId", "experimentToken", "texts", "items", "type", "contentClass", "meta");
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "JsonReader.Options.of(\"s…, \"contentClass\", \"meta\")");
        this.options = a;
        C11725h<String> a2 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), "setId");
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "moshi.adapter<String>(St…ions.emptySet(), \"setId\")");
        this.stringAdapter = a2;
        C11725h<String> a3 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), "experimentToken");
        Intrinsics.checkReturnedValueIsNotNull((Object) a3, "moshi.adapter<String?>(S…Set(), \"experimentToken\")");
        this.nullableStringAdapter = a3;
        C11725h<List<TextEntry>> a4 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, TextEntry.class), C13188p0.m40531a(), "texts");
        Intrinsics.checkReturnedValueIsNotNull((Object) a4, "moshi.adapter<List<TextE…ions.emptySet(), \"texts\")");
        this.listOfTextEntryAdapter = a4;
        C11725h<List<C3626b>> a5 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, C3626b.class), C13188p0.m40531a(), "items");
        Intrinsics.checkReturnedValueIsNotNull((Object) a5, "moshi.adapter<List<Asset…ions.emptySet(), \"items\")");
        this.listOfAssetAdapter = a5;
        C11725h<DefaultPagingMetaData> a6 = vVar.mo29869a((Type) DefaultPagingMetaData.class, C13188p0.m40531a(), "meta");
        Intrinsics.checkReturnedValueIsNotNull((Object) a6, "moshi.adapter<DefaultPag…tions.emptySet(), \"meta\")");
        this.defaultPagingMetaDataAdapter = a6;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, ContentSet contentSet) {
        if (contentSet != null) {
            sVar.mo29791b();
            sVar.mo29796e("setId");
            this.stringAdapter.toJson(sVar, contentSet.mo13608e());
            sVar.mo29796e("experimentToken");
            this.nullableStringAdapter.toJson(sVar, contentSet.mo13601a());
            sVar.mo29796e("texts");
            this.listOfTextEntryAdapter.toJson(sVar, contentSet.mo13617j());
            sVar.mo29796e("items");
            this.listOfAssetAdapter.toJson(sVar, contentSet.mo13614i());
            sVar.mo29796e("type");
            this.stringAdapter.toJson(sVar, contentSet.mo13618k());
            sVar.mo29796e("contentClass");
            this.stringAdapter.toJson(sVar, contentSet.mo13606c());
            sVar.mo29796e("meta");
            this.defaultPagingMetaDataAdapter.toJson(sVar, contentSet.m12717f0());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ContentSet)";
    }

    public ContentSet fromJson(C11737m mVar) {
        C11737m mVar2 = mVar;
        mVar.mo29763b();
        List list = null;
        String str = null;
        String str2 = null;
        List list2 = null;
        String str3 = null;
        String str4 = null;
        DefaultPagingMetaData defaultPagingMetaData = null;
        while (mVar.mo29770f()) {
            switch (mVar2.mo29758a(this.options)) {
                case -1:
                    mVar.mo29783q();
                    mVar.mo29784r();
                    break;
                case 0:
                    String str5 = (String) this.stringAdapter.fromJson(mVar2);
                    if (str5 != null) {
                        str = str5;
                        break;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Non-null value 'setId' was null at ");
                        sb.append(mVar.mo29775j0());
                        throw new C11734j(sb.toString());
                    }
                case 1:
                    str2 = (String) this.nullableStringAdapter.fromJson(mVar2);
                    break;
                case 2:
                    list = (List) this.listOfTextEntryAdapter.fromJson(mVar2);
                    if (list != null) {
                        break;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Non-null value 'texts' was null at ");
                        sb2.append(mVar.mo29775j0());
                        throw new C11734j(sb2.toString());
                    }
                case 3:
                    List list3 = (List) this.listOfAssetAdapter.fromJson(mVar2);
                    if (list3 != null) {
                        list2 = list3;
                        break;
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Non-null value 'items' was null at ");
                        sb3.append(mVar.mo29775j0());
                        throw new C11734j(sb3.toString());
                    }
                case 4:
                    String str6 = (String) this.stringAdapter.fromJson(mVar2);
                    if (str6 != null) {
                        str3 = str6;
                        break;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Non-null value 'type' was null at ");
                        sb4.append(mVar.mo29775j0());
                        throw new C11734j(sb4.toString());
                    }
                case 5:
                    String str7 = (String) this.stringAdapter.fromJson(mVar2);
                    if (str7 != null) {
                        str4 = str7;
                        break;
                    } else {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Non-null value 'contentClass' was null at ");
                        sb5.append(mVar.mo29775j0());
                        throw new C11734j(sb5.toString());
                    }
                case 6:
                    DefaultPagingMetaData defaultPagingMetaData2 = (DefaultPagingMetaData) this.defaultPagingMetaDataAdapter.fromJson(mVar2);
                    if (defaultPagingMetaData2 != null) {
                        defaultPagingMetaData = defaultPagingMetaData2;
                        break;
                    } else {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("Non-null value 'meta' was null at ");
                        sb6.append(mVar.mo29775j0());
                        throw new C11734j(sb6.toString());
                    }
            }
        }
        mVar.mo29767d();
        if (str == null) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Required property 'setId' missing at ");
            sb7.append(mVar.mo29775j0());
            throw new C11734j(sb7.toString());
        } else if (list2 == null) {
            StringBuilder sb8 = new StringBuilder();
            sb8.append("Required property 'items' missing at ");
            sb8.append(mVar.mo29775j0());
            throw new C11734j(sb8.toString());
        } else if (str3 == null) {
            StringBuilder sb9 = new StringBuilder();
            sb9.append("Required property 'type' missing at ");
            sb9.append(mVar.mo29775j0());
            throw new C11734j(sb9.toString());
        } else if (str4 == null) {
            StringBuilder sb10 = new StringBuilder();
            sb10.append("Required property 'contentClass' missing at ");
            sb10.append(mVar.mo29775j0());
            throw new C11734j(sb10.toString());
        } else if (defaultPagingMetaData != null) {
            ContentSet contentSet = new ContentSet(str, str2, null, list2, str3, str4, defaultPagingMetaData, 4, null);
            if (list == null) {
                list = contentSet.mo13617j();
            }
            return ContentSet.m12706a(contentSet, null, null, list, null, null, null, null, 123, null);
        } else {
            StringBuilder sb11 = new StringBuilder();
            sb11.append("Required property 'meta' missing at ");
            sb11.append(mVar.mo29775j0());
            throw new C11734j(sb11.toString());
        }
    }
}
