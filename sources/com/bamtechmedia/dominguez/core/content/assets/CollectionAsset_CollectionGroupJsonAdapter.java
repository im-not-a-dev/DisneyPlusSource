package com.bamtechmedia.dominguez.core.content.assets;

import com.bamtechmedia.dominguez.core.content.assets.CollectionAsset.CollectionGroup;
import com.bamtechmedia.dominguez.core.content.collections.CollectionSlug;
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

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0016\u001a\u00020\nH\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/CollectionAsset_CollectionGroupJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/core/content/assets/CollectionAsset$CollectionGroup;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "listOfCollectionSlugAdapter", "", "Lcom/bamtechmedia/dominguez/core/content/collections/CollectionSlug;", "nullableStringAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: CollectionAsset_CollectionGroupJsonAdapter.kt */
public final class CollectionAsset_CollectionGroupJsonAdapter extends C11725h<CollectionGroup> {
    private final C11725h<List<CollectionSlug>> listOfCollectionSlugAdapter;
    private final C11725h<String> nullableStringAdapter;
    private final C11739b options;
    private final C11725h<String> stringAdapter;

    public CollectionAsset_CollectionGroupJsonAdapter(C11760v vVar) {
        String str = "slugs";
        String str2 = "contentClass";
        String str3 = "key";
        C11739b a = C11739b.m37729a(str3, str2, str);
        C12880j.m40222a((Object) a, "JsonReader.Options.of(\"k… \"contentClass\", \"slugs\")");
        this.options = a;
        C11725h<String> a2 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), str3);
        C12880j.m40222a((Object) a2, "moshi.adapter<String>(St…ctions.emptySet(), \"key\")");
        this.stringAdapter = a2;
        C11725h<String> a3 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), str2);
        C12880j.m40222a((Object) a3, "moshi.adapter<String?>(S…ptySet(), \"contentClass\")");
        this.nullableStringAdapter = a3;
        C11725h<List<CollectionSlug>> a4 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, CollectionSlug.class), C13188p0.m40531a(), str);
        C12880j.m40222a((Object) a4, "moshi.adapter<List<Colle…ions.emptySet(), \"slugs\")");
        this.listOfCollectionSlugAdapter = a4;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, CollectionGroup collectionGroup) {
        if (collectionGroup != null) {
            sVar.mo29791b();
            sVar.mo29796e("key");
            this.stringAdapter.toJson(sVar, collectionGroup.mo12854b());
            sVar.mo29796e("contentClass");
            this.nullableStringAdapter.toJson(sVar, collectionGroup.mo12853a());
            sVar.mo29796e("slugs");
            this.listOfCollectionSlugAdapter.toJson(sVar, collectionGroup.mo12855c());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(CollectionAsset.CollectionGroup)";
    }

    public CollectionGroup fromJson(C11737m mVar) {
        mVar.mo29763b();
        String str = null;
        String str2 = null;
        List list = null;
        while (mVar.mo29770f()) {
            int a = mVar.mo29758a(this.options);
            if (a == -1) {
                mVar.mo29783q();
                mVar.mo29784r();
            } else if (a == 0) {
                str = (String) this.stringAdapter.fromJson(mVar);
                if (str == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Non-null value 'key' was null at ");
                    sb.append(mVar.mo29775j0());
                    throw new C11734j(sb.toString());
                }
            } else if (a == 1) {
                str2 = (String) this.nullableStringAdapter.fromJson(mVar);
            } else if (a != 2) {
                continue;
            } else {
                list = (List) this.listOfCollectionSlugAdapter.fromJson(mVar);
                if (list == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Non-null value 'slugs' was null at ");
                    sb2.append(mVar.mo29775j0());
                    throw new C11734j(sb2.toString());
                }
            }
        }
        mVar.mo29767d();
        if (str == null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Required property 'key' missing at ");
            sb3.append(mVar.mo29775j0());
            throw new C11734j(sb3.toString());
        } else if (list != null) {
            return new CollectionGroup(str, str2, list);
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Required property 'slugs' missing at ");
            sb4.append(mVar.mo29775j0());
            throw new C11734j(sb4.toString());
        }
    }
}
