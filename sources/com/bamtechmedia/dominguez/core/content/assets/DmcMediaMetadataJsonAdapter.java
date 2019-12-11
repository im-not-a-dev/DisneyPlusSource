package com.bamtechmedia.dominguez.core.content.assets;

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

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0018\u001a\u00020\fH\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/DmcMediaMetadataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/core/content/assets/DmcMediaMetadata;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "listOfLanguageAdapter", "", "Lcom/bamtechmedia/dominguez/core/content/assets/Language;", "nullableFloatAdapter", "", "nullableListOfStringAdapter", "", "nullableStringAdapter", "options", "Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DmcMediaMetadataJsonAdapter.kt */
public final class DmcMediaMetadataJsonAdapter extends C11725h<DmcMediaMetadata> {
    private final C11725h<List<Language>> listOfLanguageAdapter;
    private final C11725h<Float> nullableFloatAdapter;
    private final C11725h<List<String>> nullableListOfStringAdapter;
    private final C11725h<String> nullableStringAdapter;
    private final C11739b options;

    public DmcMediaMetadataJsonAdapter(C11760v vVar) {
        String str = "audioTracks";
        String str2 = "format";
        String str3 = "activeAspectRatio";
        C11739b a = C11739b.m37729a(str3, str2, "features", str);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "JsonReader.Options.of(\"a…features\", \"audioTracks\")");
        this.options = a;
        C11725h<Float> a2 = vVar.mo29869a((Type) Float.class, C13188p0.m40531a(), str3);
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "moshi.adapter<Float?>(Fl…t(), \"activeAspectRatio\")");
        this.nullableFloatAdapter = a2;
        C11725h<String> a3 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), str2);
        Intrinsics.checkReturnedValueIsNotNull((Object) a3, "moshi.adapter<String?>(S…ons.emptySet(), \"format\")");
        this.nullableStringAdapter = a3;
        C11725h<List<String>> a4 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, String.class), C13188p0.m40531a(), "videoFeatures");
        Intrinsics.checkReturnedValueIsNotNull((Object) a4, "moshi.adapter<List<Strin…tySet(), \"videoFeatures\")");
        this.nullableListOfStringAdapter = a4;
        C11725h<List<Language>> a5 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, Language.class), C13188p0.m40531a(), str);
        Intrinsics.checkReturnedValueIsNotNull((Object) a5, "moshi.adapter<List<Langu…mptySet(), \"audioTracks\")");
        this.listOfLanguageAdapter = a5;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, DmcMediaMetadata dmcMediaMetadata) {
        if (dmcMediaMetadata != null) {
            sVar.mo29791b();
            sVar.mo29796e("activeAspectRatio");
            this.nullableFloatAdapter.toJson(sVar, dmcMediaMetadata.mo12957n());
            sVar.mo29796e("format");
            this.nullableStringAdapter.toJson(sVar, dmcMediaMetadata.getFormat());
            sVar.mo29796e("features");
            this.nullableListOfStringAdapter.toJson(sVar, dmcMediaMetadata.mo12950X());
            sVar.mo29796e("audioTracks");
            this.listOfLanguageAdapter.toJson(sVar, dmcMediaMetadata.mo12956l());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(DmcMediaMetadata)";
    }

    public DmcMediaMetadata fromJson(C11737m mVar) {
        mVar.mo29763b();
        Float f = null;
        boolean z = false;
        String str = null;
        List list = null;
        List list2 = null;
        while (mVar.mo29770f()) {
            int a = mVar.mo29758a(this.options);
            if (a == -1) {
                mVar.mo29783q();
                mVar.mo29784r();
            } else if (a == 0) {
                f = (Float) this.nullableFloatAdapter.fromJson(mVar);
                z = true;
            } else if (a == 1) {
                str = (String) this.nullableStringAdapter.fromJson(mVar);
            } else if (a == 2) {
                list = (List) this.nullableListOfStringAdapter.fromJson(mVar);
            } else if (a != 3) {
                continue;
            } else {
                List list3 = (List) this.listOfLanguageAdapter.fromJson(mVar);
                if (list3 != null) {
                    list2 = list3;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Non-null value 'audioTracks' was null at ");
                    sb.append(mVar.mo29775j0());
                    throw new C11734j(sb.toString());
                }
            }
        }
        mVar.mo29767d();
        if (list2 != null) {
            DmcMediaMetadata dmcMediaMetadata = new DmcMediaMetadata(null, str, list, list2, 1, null);
            if (!z) {
                f = dmcMediaMetadata.mo12957n();
            }
            return DmcMediaMetadata.m12176a(dmcMediaMetadata, f, null, null, null, 14, null);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Required property 'audioTracks' missing at ");
        sb2.append(mVar.mo29775j0());
        throw new C11734j(sb2.toString());
    }
}
