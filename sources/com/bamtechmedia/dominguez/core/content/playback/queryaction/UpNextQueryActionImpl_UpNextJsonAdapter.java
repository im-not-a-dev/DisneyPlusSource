package com.bamtechmedia.dominguez.core.content.playback.queryaction;

import com.bamtechmedia.dominguez.core.content.assets.C3632f;
import com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl.ItemFrom;
import com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl.ItemTo;
import com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl.ParentItemTo;
import com.bamtechmedia.dominguez.core.content.playback.queryaction.UpNextQueryActionImpl.UpNext;
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

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/playback/queryaction/UpNextQueryActionImpl_UpNextJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/core/content/playback/queryaction/UpNextQueryActionImpl$UpNext;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "listOfDmcAssetAdapter", "", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcAsset;", "nullableItemFromAdapter", "Lcom/bamtechmedia/dominguez/core/content/playback/queryaction/UpNextQueryActionImpl$ItemFrom;", "nullableItemToAdapter", "Lcom/bamtechmedia/dominguez/core/content/playback/queryaction/UpNextQueryActionImpl$ItemTo;", "nullableParentItemToAdapter", "Lcom/bamtechmedia/dominguez/core/content/playback/queryaction/UpNextQueryActionImpl$ParentItemTo;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: UpNextQueryActionImpl_UpNextJsonAdapter.kt */
public final class UpNextQueryActionImpl_UpNextJsonAdapter extends C11725h<UpNext> {
    private final C11725h<List<C3632f>> listOfDmcAssetAdapter;
    private final C11725h<ItemFrom> nullableItemFromAdapter;
    private final C11725h<ItemTo> nullableItemToAdapter;
    private final C11725h<ParentItemTo> nullableParentItemToAdapter;
    private final C11739b options;
    private final C11725h<String> stringAdapter;

    public UpNextQueryActionImpl_UpNextJsonAdapter(C11760v vVar) {
        String str = "parentItemTo";
        String str2 = "itemTo";
        String str3 = "itemFrom";
        String str4 = "upNextType";
        C11739b a = C11739b.m37729a("items", str4, str3, str2, str);
        C12880j.m40222a((Object) a, "JsonReader.Options.of(\"i…\"itemTo\", \"parentItemTo\")");
        this.options = a;
        C11725h<List<C3632f>> a2 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, C3632f.class), C13188p0.m40531a(), "upNextElements");
        C12880j.m40222a((Object) a2, "moshi.adapter<List<DmcAs…ySet(), \"upNextElements\")");
        this.listOfDmcAssetAdapter = a2;
        C11725h<String> a3 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), str4);
        C12880j.m40222a((Object) a3, "moshi.adapter<String>(St…emptySet(), \"upNextType\")");
        this.stringAdapter = a3;
        C11725h<ItemFrom> a4 = vVar.mo29869a((Type) ItemFrom.class, C13188p0.m40531a(), str3);
        C12880j.m40222a((Object) a4, "moshi.adapter<UpNextQuer…s.emptySet(), \"itemFrom\")");
        this.nullableItemFromAdapter = a4;
        C11725h<ItemTo> a5 = vVar.mo29869a((Type) ItemTo.class, C13188p0.m40531a(), str2);
        C12880j.m40222a((Object) a5, "moshi.adapter<UpNextQuer…ons.emptySet(), \"itemTo\")");
        this.nullableItemToAdapter = a5;
        C11725h<ParentItemTo> a6 = vVar.mo29869a((Type) ParentItemTo.class, C13188p0.m40531a(), str);
        C12880j.m40222a((Object) a6, "moshi.adapter<UpNextQuer…ptySet(), \"parentItemTo\")");
        this.nullableParentItemToAdapter = a6;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, UpNext upNext) {
        if (upNext != null) {
            sVar.mo29791b();
            sVar.mo29796e("items");
            this.listOfDmcAssetAdapter.toJson(sVar, upNext.mo13508a0());
            sVar.mo29796e("upNextType");
            this.stringAdapter.toJson(sVar, upNext.mo13509b0());
            sVar.mo29796e("itemFrom");
            this.nullableItemFromAdapter.toJson(sVar, upNext.mo13505X());
            sVar.mo29796e("itemTo");
            this.nullableItemToAdapter.toJson(sVar, upNext.mo13506Y());
            sVar.mo29796e("parentItemTo");
            this.nullableParentItemToAdapter.toJson(sVar, upNext.mo13507Z());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(UpNextQueryActionImpl.UpNext)";
    }

    public UpNext fromJson(C11737m mVar) {
        C11737m mVar2 = mVar;
        mVar.mo29763b();
        List list = null;
        String str = null;
        ItemFrom itemFrom = null;
        ItemTo itemTo = null;
        ParentItemTo parentItemTo = null;
        while (mVar.mo29770f()) {
            int a = mVar2.mo29758a(this.options);
            if (a == -1) {
                mVar.mo29783q();
                mVar.mo29784r();
            } else if (a == 0) {
                list = (List) this.listOfDmcAssetAdapter.fromJson(mVar2);
                if (list == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Non-null value 'upNextElements' was null at ");
                    sb.append(mVar.mo29775j0());
                    throw new C11734j(sb.toString());
                }
            } else if (a == 1) {
                String str2 = (String) this.stringAdapter.fromJson(mVar2);
                if (str2 != null) {
                    str = str2;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Non-null value 'upNextType' was null at ");
                    sb2.append(mVar.mo29775j0());
                    throw new C11734j(sb2.toString());
                }
            } else if (a == 2) {
                itemFrom = (ItemFrom) this.nullableItemFromAdapter.fromJson(mVar2);
            } else if (a == 3) {
                itemTo = (ItemTo) this.nullableItemToAdapter.fromJson(mVar2);
            } else if (a == 4) {
                parentItemTo = (ParentItemTo) this.nullableParentItemToAdapter.fromJson(mVar2);
            }
        }
        mVar.mo29767d();
        if (str != null) {
            UpNext upNext = new UpNext(null, str, itemFrom, itemTo, parentItemTo, 1, null);
            if (list == null) {
                list = upNext.mo13508a0();
            }
            return UpNext.m12604a(upNext, list, null, null, null, null, 30, null);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Required property 'upNextType' missing at ");
        sb3.append(mVar.mo29775j0());
        throw new C11734j(sb3.toString());
    }
}
