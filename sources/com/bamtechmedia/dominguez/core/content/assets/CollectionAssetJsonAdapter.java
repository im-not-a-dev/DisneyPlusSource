package com.bamtechmedia.dominguez.core.content.assets;

import com.bamtechmedia.dominguez.core.content.assets.CollectionAsset.CollectionGroup;
import com.bamtechmedia.dominguez.core.content.collections.C3680n;
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

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/CollectionAssetJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/core/content/assets/CollectionAsset;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "listOfTextEntryAdapter", "", "Lcom/bamtechmedia/dominguez/core/content/assets/TextEntry;", "nullableCollectionGroupAdapter", "Lcom/bamtechmedia/dominguez/core/content/assets/CollectionAsset$CollectionGroup;", "nullableListOfImageAdapter", "Lcom/bamtechmedia/dominguez/core/content/assets/Image;", "nullableListOfVideoArtAdapter", "Lcom/bamtechmedia/dominguez/core/content/collections/VideoArt;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: CollectionAssetJsonAdapter.kt */
public final class CollectionAssetJsonAdapter extends C11725h<CollectionAsset> {
    private final C11725h<List<TextEntry>> listOfTextEntryAdapter;
    private final C11725h<CollectionGroup> nullableCollectionGroupAdapter;
    private final C11725h<List<Image>> nullableListOfImageAdapter;
    private final C11725h<List<C3680n>> nullableListOfVideoArtAdapter;
    private final C11739b options;

    public CollectionAssetJsonAdapter(C11760v vVar) {
        String str = "videoArt";
        String str2 = "images";
        String str3 = "texts";
        String str4 = "collectionGroup";
        C11739b a = C11739b.m37729a(str4, str3, str2, str);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "JsonReader.Options.of(\"c…s\", \"images\", \"videoArt\")");
        this.options = a;
        C11725h<CollectionGroup> a2 = vVar.mo29869a((Type) CollectionGroup.class, C13188p0.m40531a(), str4);
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "moshi.adapter<Collection…Set(), \"collectionGroup\")");
        this.nullableCollectionGroupAdapter = a2;
        C11725h<List<TextEntry>> a3 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, TextEntry.class), C13188p0.m40531a(), str3);
        Intrinsics.checkReturnedValueIsNotNull((Object) a3, "moshi.adapter<List<TextE…ions.emptySet(), \"texts\")");
        this.listOfTextEntryAdapter = a3;
        C11725h<List<Image>> a4 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, Image.class), C13188p0.m40531a(), str2);
        Intrinsics.checkReturnedValueIsNotNull((Object) a4, "moshi.adapter<List<Image…ons.emptySet(), \"images\")");
        this.nullableListOfImageAdapter = a4;
        C11725h<List<C3680n>> a5 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, C3680n.class), C13188p0.m40531a(), str);
        Intrinsics.checkReturnedValueIsNotNull((Object) a5, "moshi.adapter<List<Video…s.emptySet(), \"videoArt\")");
        this.nullableListOfVideoArtAdapter = a5;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, CollectionAsset collectionAsset) {
        if (collectionAsset != null) {
            sVar.mo29791b();
            sVar.mo29796e("collectionGroup");
            this.nullableCollectionGroupAdapter.toJson(sVar, collectionAsset.mo12840K());
            sVar.mo29796e("texts");
            this.listOfTextEntryAdapter.toJson(sVar, collectionAsset.mo12844R());
            sVar.mo29796e("images");
            this.nullableListOfImageAdapter.toJson(sVar, collectionAsset.mo12847a());
            sVar.mo29796e("videoArt");
            this.nullableListOfVideoArtAdapter.toJson(sVar, collectionAsset.mo12839H());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(CollectionAsset)";
    }

    public CollectionAsset fromJson(C11737m mVar) {
        mVar.mo29763b();
        CollectionGroup collectionGroup = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        while (mVar.mo29770f()) {
            int a = mVar.mo29758a(this.options);
            if (a == -1) {
                mVar.mo29783q();
                mVar.mo29784r();
            } else if (a == 0) {
                collectionGroup = (CollectionGroup) this.nullableCollectionGroupAdapter.fromJson(mVar);
            } else if (a == 1) {
                list = (List) this.listOfTextEntryAdapter.fromJson(mVar);
                if (list == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Non-null value 'texts' was null at ");
                    sb.append(mVar.mo29775j0());
                    throw new C11734j(sb.toString());
                }
            } else if (a == 2) {
                list2 = (List) this.nullableListOfImageAdapter.fromJson(mVar);
            } else if (a == 3) {
                list3 = (List) this.nullableListOfVideoArtAdapter.fromJson(mVar);
            }
        }
        mVar.mo29767d();
        if (list != null) {
            return new CollectionAsset(collectionGroup, list, list2, list3);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Required property 'texts' missing at ");
        sb2.append(mVar.mo29775j0());
        throw new C11734j(sb2.toString());
    }
}
