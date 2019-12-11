package com.bamtechmedia.dominguez.core.content.assets;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11734j;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11737m.C11739b;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11760v;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u000bH\u0016R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/ImageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/core/content/assets/Image;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "nullableAspectRatioAdapter", "Lcom/bamtechmedia/dominguez/core/content/assets/AspectRatio;", "nullableIntAdapter", "", "nullableStringAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ImageJsonAdapter.kt */
public final class ImageJsonAdapter extends C11725h<Image> {
    private final C11725h<C3623a> nullableAspectRatioAdapter;
    private final C11725h<Integer> nullableIntAdapter;
    private final C11725h<String> nullableStringAdapter;
    private final C11739b options;
    private final C11725h<String> stringAdapter;

    public ImageJsonAdapter(C11760v vVar) {
        C11739b a = C11739b.m37729a("masterId", "url", "aspectRatio", "locale", "purpose", "masterHeight", "masterWidth", "sourceEntity");
        C12880j.m40222a((Object) a, "JsonReader.Options.of(\"m…erWidth\", \"sourceEntity\")");
        this.options = a;
        C11725h<String> a2 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), "masterId");
        C12880j.m40222a((Object) a2, "moshi.adapter<String?>(S…s.emptySet(), \"masterId\")");
        this.nullableStringAdapter = a2;
        C11725h<String> a3 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), "url");
        C12880j.m40222a((Object) a3, "moshi.adapter<String>(St…ctions.emptySet(), \"url\")");
        this.stringAdapter = a3;
        C11725h<C3623a> a4 = vVar.mo29869a((Type) C3623a.class, C13188p0.m40531a(), "aspectRatio");
        C12880j.m40222a((Object) a4, "moshi.adapter<AspectRati…mptySet(), \"aspectRatio\")");
        this.nullableAspectRatioAdapter = a4;
        C11725h<Integer> a5 = vVar.mo29869a((Type) Integer.class, C13188p0.m40531a(), "masterHeight");
        C12880j.m40222a((Object) a5, "moshi.adapter<Int?>(Int:…ptySet(), \"masterHeight\")");
        this.nullableIntAdapter = a5;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, Image image) {
        if (image != null) {
            sVar.mo29791b();
            sVar.mo29796e("masterId");
            this.nullableStringAdapter.toJson(sVar, image.mo13085U());
            sVar.mo29796e("url");
            this.stringAdapter.toJson(sVar, image.getUrl());
            sVar.mo29796e("aspectRatio");
            this.nullableAspectRatioAdapter.toJson(sVar, image.mo13087X());
            sVar.mo29796e("locale");
            this.nullableStringAdapter.toJson(sVar, image.mo13088Y());
            sVar.mo29796e("purpose");
            this.nullableStringAdapter.toJson(sVar, image.mo13086W());
            sVar.mo29796e("masterHeight");
            this.nullableIntAdapter.toJson(sVar, image.mo13089Z());
            sVar.mo29796e("masterWidth");
            this.nullableIntAdapter.toJson(sVar, image.mo13090a0());
            sVar.mo29796e("sourceEntity");
            this.nullableStringAdapter.toJson(sVar, image.mo13092c0());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(Image)";
    }

    public Image fromJson(C11737m mVar) {
        mVar.mo29763b();
        String str = null;
        String str2 = null;
        C3623a aVar = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        Integer num2 = null;
        String str5 = null;
        while (mVar.mo29770f()) {
            switch (mVar.mo29758a(this.options)) {
                case -1:
                    mVar.mo29783q();
                    mVar.mo29784r();
                    break;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 1:
                    String str6 = (String) this.stringAdapter.fromJson(mVar);
                    if (str6 != null) {
                        str2 = str6;
                        break;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Non-null value 'url' was null at ");
                        sb.append(mVar.mo29775j0());
                        throw new C11734j(sb.toString());
                    }
                case 2:
                    aVar = (C3623a) this.nullableAspectRatioAdapter.fromJson(mVar);
                    break;
                case 3:
                    str3 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 4:
                    str4 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 5:
                    num = (Integer) this.nullableIntAdapter.fromJson(mVar);
                    break;
                case 6:
                    num2 = (Integer) this.nullableIntAdapter.fromJson(mVar);
                    break;
                case 7:
                    str5 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
            }
        }
        mVar.mo29767d();
        if (str2 != null) {
            Image image = new Image(str, str2, aVar, str3, str4, num, num2, str5);
            return image;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Required property 'url' missing at ");
        sb2.append(mVar.mo29775j0());
        throw new C11734j(sb2.toString());
    }
}
