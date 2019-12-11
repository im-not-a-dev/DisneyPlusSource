package com.bamtechmedia.dominguez.core.content.collections;

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

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0015\u001a\u00020\fH\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/collections/CollectionGroupJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/core/content/collections/CollectionGroup;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "listOfCollectionSlugAdapter", "", "Lcom/bamtechmedia/dominguez/core/content/collections/CollectionSlug;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: CollectionGroupJsonAdapter.kt */
public final class CollectionGroupJsonAdapter extends C11725h<CollectionGroup> {
    private final C11725h<List<CollectionSlug>> listOfCollectionSlugAdapter;
    private final C11739b options;
    private final C11725h<String> stringAdapter;

    public CollectionGroupJsonAdapter(C11760v vVar) {
        String str = "slugs";
        String str2 = "key";
        C11739b a = C11739b.m37729a(str2, "collectionGroupId", "contentClass", str);
        C12880j.m40222a((Object) a, "JsonReader.Options.of(\"k… \"contentClass\", \"slugs\")");
        this.options = a;
        C11725h<String> a2 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), str2);
        C12880j.m40222a((Object) a2, "moshi.adapter<String>(St…ctions.emptySet(), \"key\")");
        this.stringAdapter = a2;
        C11725h<List<CollectionSlug>> a3 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, CollectionSlug.class), C13188p0.m40531a(), str);
        C12880j.m40222a((Object) a3, "moshi.adapter<List<Colle…ions.emptySet(), \"slugs\")");
        this.listOfCollectionSlugAdapter = a3;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, CollectionGroup collectionGroup) {
        if (collectionGroup != null) {
            sVar.mo29791b();
            sVar.mo29796e("key");
            this.stringAdapter.toJson(sVar, collectionGroup.mo13297c());
            sVar.mo29796e("collectionGroupId");
            this.stringAdapter.toJson(sVar, collectionGroup.mo13295a());
            sVar.mo29796e("contentClass");
            this.stringAdapter.toJson(sVar, collectionGroup.mo13296b());
            sVar.mo29796e("slugs");
            this.listOfCollectionSlugAdapter.toJson(sVar, collectionGroup.mo13298d());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(CollectionGroup)";
    }

    public CollectionGroup fromJson(C11737m mVar) {
        mVar.mo29763b();
        String str = null;
        String str2 = null;
        String str3 = null;
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
                str2 = (String) this.stringAdapter.fromJson(mVar);
                if (str2 == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Non-null value 'collectionGroupId' was null at ");
                    sb2.append(mVar.mo29775j0());
                    throw new C11734j(sb2.toString());
                }
            } else if (a == 2) {
                str3 = (String) this.stringAdapter.fromJson(mVar);
                if (str3 == null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Non-null value 'contentClass' was null at ");
                    sb3.append(mVar.mo29775j0());
                    throw new C11734j(sb3.toString());
                }
            } else if (a != 3) {
                continue;
            } else {
                list = (List) this.listOfCollectionSlugAdapter.fromJson(mVar);
                if (list == null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Non-null value 'slugs' was null at ");
                    sb4.append(mVar.mo29775j0());
                    throw new C11734j(sb4.toString());
                }
            }
        }
        mVar.mo29767d();
        if (str == null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Required property 'key' missing at ");
            sb5.append(mVar.mo29775j0());
            throw new C11734j(sb5.toString());
        } else if (str2 == null) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Required property 'collectionGroupId' missing at ");
            sb6.append(mVar.mo29775j0());
            throw new C11734j(sb6.toString());
        } else if (str3 == null) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Required property 'contentClass' missing at ");
            sb7.append(mVar.mo29775j0());
            throw new C11734j(sb7.toString());
        } else if (list != null) {
            return new CollectionGroup(str, str2, str3, list);
        } else {
            StringBuilder sb8 = new StringBuilder();
            sb8.append("Required property 'slugs' missing at ");
            sb8.append(mVar.mo29775j0());
            throw new C11734j(sb8.toString());
        }
    }
}
