package com.bamtechmedia.dominguez.core.content.collections;

import com.bamtechmedia.dominguez.core.content.assets.Image;
import com.bamtechmedia.dominguez.core.content.assets.TextEntry;
import com.bamtechmedia.dominguez.core.content.containers.Container;
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

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u0014H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/collections/StandardCollectionJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/core/content/collections/StandardCollection;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "collectionGroupAdapter", "Lcom/bamtechmedia/dominguez/core/content/collections/CollectionGroup;", "listOfContainerAdapter", "", "Lcom/bamtechmedia/dominguez/core/content/containers/Container;", "listOfImageAdapter", "Lcom/bamtechmedia/dominguez/core/content/assets/Image;", "listOfTextEntryAdapter", "Lcom/bamtechmedia/dominguez/core/content/assets/TextEntry;", "nullableListOfVideoArtAdapter", "Lcom/bamtechmedia/dominguez/core/content/collections/VideoArt;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: StandardCollectionJsonAdapter.kt */
public final class StandardCollectionJsonAdapter extends C11725h<StandardCollection> {
    private final C11725h<CollectionGroup> collectionGroupAdapter;
    private final C11725h<List<Container>> listOfContainerAdapter;
    private final C11725h<List<Image>> listOfImageAdapter;
    private final C11725h<List<TextEntry>> listOfTextEntryAdapter;
    private final C11725h<List<C3680n>> nullableListOfVideoArtAdapter;
    private final C11739b options;
    private final C11725h<String> stringAdapter;

    public StandardCollectionJsonAdapter(C11760v vVar) {
        C11739b a = C11739b.m37729a("collectionId", "collectionGroup", "texts", "containers", "images", "videoArt");
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "JsonReader.Options.of(\"c…s\", \"images\", \"videoArt\")");
        this.options = a;
        C11725h<String> a2 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), "collectionId");
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "moshi.adapter<String>(St…ptySet(), \"collectionId\")");
        this.stringAdapter = a2;
        C11725h<CollectionGroup> a3 = vVar.mo29869a((Type) CollectionGroup.class, C13188p0.m40531a(), "collectionGroup");
        Intrinsics.checkReturnedValueIsNotNull((Object) a3, "moshi.adapter<Collection…Set(), \"collectionGroup\")");
        this.collectionGroupAdapter = a3;
        C11725h<List<TextEntry>> a4 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, TextEntry.class), C13188p0.m40531a(), "texts");
        Intrinsics.checkReturnedValueIsNotNull((Object) a4, "moshi.adapter<List<TextE…ions.emptySet(), \"texts\")");
        this.listOfTextEntryAdapter = a4;
        C11725h<List<Container>> a5 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, Container.class), C13188p0.m40531a(), "containers");
        Intrinsics.checkReturnedValueIsNotNull((Object) a5, "moshi.adapter<List<Conta…emptySet(), \"containers\")");
        this.listOfContainerAdapter = a5;
        C11725h<List<Image>> a6 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, Image.class), C13188p0.m40531a(), "images");
        Intrinsics.checkReturnedValueIsNotNull((Object) a6, "moshi.adapter<List<Image…ons.emptySet(), \"images\")");
        this.listOfImageAdapter = a6;
        C11725h<List<C3680n>> a7 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, C3680n.class), C13188p0.m40531a(), "videoArt");
        Intrinsics.checkReturnedValueIsNotNull((Object) a7, "moshi.adapter<List<Video…s.emptySet(), \"videoArt\")");
        this.nullableListOfVideoArtAdapter = a7;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, StandardCollection standardCollection) {
        if (standardCollection != null) {
            sVar.mo29791b();
            sVar.mo29796e("collectionId");
            this.stringAdapter.toJson(sVar, standardCollection.mo13349U());
            sVar.mo29796e("collectionGroup");
            this.collectionGroupAdapter.toJson(sVar, standardCollection.mo13348T());
            sVar.mo29796e("texts");
            this.listOfTextEntryAdapter.toJson(sVar, standardCollection.mo13350V());
            sVar.mo29796e("containers");
            this.listOfContainerAdapter.toJson(sVar, standardCollection.mo13343O());
            sVar.mo29796e("images");
            this.listOfImageAdapter.toJson(sVar, standardCollection.mo12847a());
            sVar.mo29796e("videoArt");
            this.nullableListOfVideoArtAdapter.toJson(sVar, standardCollection.mo12839H());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(StandardCollection)";
    }

    public StandardCollection fromJson(C11737m mVar) {
        C11737m mVar2 = mVar;
        mVar.mo29763b();
        List list = null;
        String str = null;
        CollectionGroup collectionGroup = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        while (mVar.mo29770f()) {
            switch (mVar2.mo29758a(this.options)) {
                case -1:
                    mVar.mo29783q();
                    mVar.mo29784r();
                    break;
                case 0:
                    String str2 = (String) this.stringAdapter.fromJson(mVar2);
                    if (str2 != null) {
                        str = str2;
                        break;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Non-null value 'collectionId' was null at ");
                        sb.append(mVar.mo29775j0());
                        throw new C11734j(sb.toString());
                    }
                case 1:
                    CollectionGroup collectionGroup2 = (CollectionGroup) this.collectionGroupAdapter.fromJson(mVar2);
                    if (collectionGroup2 != null) {
                        collectionGroup = collectionGroup2;
                        break;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Non-null value 'collectionGroup' was null at ");
                        sb2.append(mVar.mo29775j0());
                        throw new C11734j(sb2.toString());
                    }
                case 2:
                    List list5 = (List) this.listOfTextEntryAdapter.fromJson(mVar2);
                    if (list5 != null) {
                        list2 = list5;
                        break;
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Non-null value 'texts' was null at ");
                        sb3.append(mVar.mo29775j0());
                        throw new C11734j(sb3.toString());
                    }
                case 3:
                    list = (List) this.listOfContainerAdapter.fromJson(mVar2);
                    if (list != null) {
                        break;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Non-null value 'containers' was null at ");
                        sb4.append(mVar.mo29775j0());
                        throw new C11734j(sb4.toString());
                    }
                case 4:
                    List list6 = (List) this.listOfImageAdapter.fromJson(mVar2);
                    if (list6 != null) {
                        list3 = list6;
                        break;
                    } else {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Non-null value 'images' was null at ");
                        sb5.append(mVar.mo29775j0());
                        throw new C11734j(sb5.toString());
                    }
                case 5:
                    list4 = (List) this.nullableListOfVideoArtAdapter.fromJson(mVar2);
                    break;
            }
        }
        mVar.mo29767d();
        if (str == null) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Required property 'collectionId' missing at ");
            sb6.append(mVar.mo29775j0());
            throw new C11734j(sb6.toString());
        } else if (collectionGroup == null) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Required property 'collectionGroup' missing at ");
            sb7.append(mVar.mo29775j0());
            throw new C11734j(sb7.toString());
        } else if (list2 == null) {
            StringBuilder sb8 = new StringBuilder();
            sb8.append("Required property 'texts' missing at ");
            sb8.append(mVar.mo29775j0());
            throw new C11734j(sb8.toString());
        } else if (list3 != null) {
            StandardCollection standardCollection = new StandardCollection(str, collectionGroup, list2, null, list3, list4, 8, null);
            if (list == null) {
                list = standardCollection.mo13343O();
            }
            return StandardCollection.m12444a(standardCollection, null, null, null, list, null, null, 55, null);
        } else {
            StringBuilder sb9 = new StringBuilder();
            sb9.append("Required property 'images' missing at ");
            sb9.append(mVar.mo29775j0());
            throw new C11734j(sb9.toString());
        }
    }
}
