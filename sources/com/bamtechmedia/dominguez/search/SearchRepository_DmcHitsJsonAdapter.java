package com.bamtechmedia.dominguez.search;

import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.paging.DefaultPagingMetaData;
import com.bamtechmedia.dominguez.search.SearchRepository.DmcAssetWrapper;
import com.bamtechmedia.dominguez.search.SearchRepository.DmcHits;
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

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/search/SearchRepository_DmcHitsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/search/SearchRepository$DmcHits;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "defaultPagingMetaDataAdapter", "Lcom/bamtechmedia/dominguez/core/content/paging/DefaultPagingMetaData;", "listOfAssetAdapter", "", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "listOfDmcAssetWrapperAdapter", "Lcom/bamtechmedia/dominguez/search/SearchRepository$DmcAssetWrapper;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "search_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SearchRepository_DmcHitsJsonAdapter.kt */
public final class SearchRepository_DmcHitsJsonAdapter extends C11725h<DmcHits> {
    private final C11725h<DefaultPagingMetaData> defaultPagingMetaDataAdapter;
    private final C11725h<List<C3626b>> listOfAssetAdapter;
    private final C11725h<List<DmcAssetWrapper>> listOfDmcAssetWrapperAdapter;
    private final C11739b options;
    private final C11725h<String> stringAdapter;

    public SearchRepository_DmcHitsJsonAdapter(C11760v vVar) {
        String str = "assets";
        String str2 = "meta";
        String str3 = "resultsType";
        String str4 = "hits";
        C11739b a = C11739b.m37729a(str4, str3, str2, str);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "JsonReader.Options.of(\"h…sType\", \"meta\", \"assets\")");
        this.options = a;
        C11725h<List<DmcAssetWrapper>> a2 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, DmcAssetWrapper.class), C13188p0.m40531a(), str4);
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "moshi.adapter<List<Searc…tions.emptySet(), \"hits\")");
        this.listOfDmcAssetWrapperAdapter = a2;
        C11725h<String> a3 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), str3);
        Intrinsics.checkReturnedValueIsNotNull((Object) a3, "moshi.adapter<String>(St…mptySet(), \"resultsType\")");
        this.stringAdapter = a3;
        C11725h<DefaultPagingMetaData> a4 = vVar.mo29869a((Type) DefaultPagingMetaData.class, C13188p0.m40531a(), str2);
        Intrinsics.checkReturnedValueIsNotNull((Object) a4, "moshi.adapter<DefaultPag…tions.emptySet(), \"meta\")");
        this.defaultPagingMetaDataAdapter = a4;
        C11725h<List<C3626b>> a5 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, C3626b.class), C13188p0.m40531a(), str);
        Intrinsics.checkReturnedValueIsNotNull((Object) a5, "moshi.adapter<List<Asset…ons.emptySet(), \"assets\")");
        this.listOfAssetAdapter = a5;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, DmcHits dmcHits) {
        if (dmcHits != null) {
            sVar.mo29791b();
            sVar.mo29796e("hits");
            this.listOfDmcAssetWrapperAdapter.toJson(sVar, dmcHits.mo20876c());
            sVar.mo29796e("resultsType");
            this.stringAdapter.toJson(sVar, dmcHits.mo20881d());
            sVar.mo29796e("meta");
            this.defaultPagingMetaDataAdapter.toJson(sVar, dmcHits.m23193f0());
            sVar.mo29796e("assets");
            this.listOfAssetAdapter.toJson(sVar, dmcHits.mo20874b());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(SearchRepository.DmcHits)";
    }

    public DmcHits fromJson(C11737m mVar) {
        mVar.mo29763b();
        List list = null;
        List list2 = null;
        String str = null;
        DefaultPagingMetaData defaultPagingMetaData = null;
        while (mVar.mo29770f()) {
            int a = mVar.mo29758a(this.options);
            if (a == -1) {
                mVar.mo29783q();
                mVar.mo29784r();
            } else if (a == 0) {
                List list3 = (List) this.listOfDmcAssetWrapperAdapter.fromJson(mVar);
                if (list3 != null) {
                    list2 = list3;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Non-null value 'hits' was null at ");
                    sb.append(mVar.mo29775j0());
                    throw new C11734j(sb.toString());
                }
            } else if (a == 1) {
                String str2 = (String) this.stringAdapter.fromJson(mVar);
                if (str2 != null) {
                    str = str2;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Non-null value 'resultsType' was null at ");
                    sb2.append(mVar.mo29775j0());
                    throw new C11734j(sb2.toString());
                }
            } else if (a == 2) {
                DefaultPagingMetaData defaultPagingMetaData2 = (DefaultPagingMetaData) this.defaultPagingMetaDataAdapter.fromJson(mVar);
                if (defaultPagingMetaData2 != null) {
                    defaultPagingMetaData = defaultPagingMetaData2;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Non-null value 'meta' was null at ");
                    sb3.append(mVar.mo29775j0());
                    throw new C11734j(sb3.toString());
                }
            } else if (a != 3) {
                continue;
            } else {
                list = (List) this.listOfAssetAdapter.fromJson(mVar);
                if (list == null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Non-null value 'assets' was null at ");
                    sb4.append(mVar.mo29775j0());
                    throw new C11734j(sb4.toString());
                }
            }
        }
        mVar.mo29767d();
        if (list2 == null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Required property 'hits' missing at ");
            sb5.append(mVar.mo29775j0());
            throw new C11734j(sb5.toString());
        } else if (str == null) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Required property 'resultsType' missing at ");
            sb6.append(mVar.mo29775j0());
            throw new C11734j(sb6.toString());
        } else if (defaultPagingMetaData != null) {
            DmcHits dmcHits = new DmcHits(list2, str, defaultPagingMetaData, null, 8, null);
            if (list == null) {
                list = dmcHits.mo20874b();
            }
            return DmcHits.m23184a(dmcHits, null, null, null, list, 7, null);
        } else {
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Required property 'meta' missing at ");
            sb7.append(mVar.mo29775j0());
            throw new C11734j(sb7.toString());
        }
    }
}
