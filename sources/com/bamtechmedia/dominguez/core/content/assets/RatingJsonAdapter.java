package com.bamtechmedia.dominguez.core.content.assets;

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

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0015\u001a\u00020\bH\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/RatingJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/core/content/assets/Rating;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "listOfStringAdapter", "", "", "nullableStringAdapter", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: RatingJsonAdapter.kt */
public final class RatingJsonAdapter extends C11725h<Rating> {
    private final C11725h<List<String>> listOfStringAdapter;
    private final C11725h<String> nullableStringAdapter;
    private final C11739b options;
    private final C11725h<String> stringAdapter;

    public RatingJsonAdapter(C11760v vVar) {
        String str = "description";
        String str2 = "advisories";
        String str3 = "value";
        C11739b a = C11739b.m37729a(str3, "system", str2, str);
        C12880j.m40222a((Object) a, "JsonReader.Options.of(\"v…visories\", \"description\")");
        this.options = a;
        C11725h<String> a2 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), str3);
        C12880j.m40222a((Object) a2, "moshi.adapter<String>(St…ions.emptySet(), \"value\")");
        this.stringAdapter = a2;
        C11725h<List<String>> a3 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, String.class), C13188p0.m40531a(), str2);
        C12880j.m40222a((Object) a3, "moshi.adapter<List<Strin…emptySet(), \"advisories\")");
        this.listOfStringAdapter = a3;
        C11725h<String> a4 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), str);
        C12880j.m40222a((Object) a4, "moshi.adapter<String?>(S…mptySet(), \"description\")");
        this.nullableStringAdapter = a4;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, Rating rating) {
        if (rating != null) {
            sVar.mo29791b();
            sVar.mo29796e("value");
            this.stringAdapter.toJson(sVar, rating.mo13188Z());
            sVar.mo29796e("system");
            this.stringAdapter.toJson(sVar, rating.mo13187Y());
            sVar.mo29796e("advisories");
            this.listOfStringAdapter.toJson(sVar, rating.mo13186X());
            sVar.mo29796e("description");
            this.nullableStringAdapter.toJson(sVar, rating.getDescription());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(Rating)";
    }

    public Rating fromJson(C11737m mVar) {
        C11737m mVar2 = mVar;
        mVar.mo29763b();
        List list = null;
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (mVar.mo29770f()) {
            int a = mVar2.mo29758a(this.options);
            if (a == -1) {
                mVar.mo29783q();
                mVar.mo29784r();
            } else if (a == 0) {
                String str4 = (String) this.stringAdapter.fromJson(mVar2);
                if (str4 != null) {
                    str = str4;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Non-null value 'value_' was null at ");
                    sb.append(mVar.mo29775j0());
                    throw new C11734j(sb.toString());
                }
            } else if (a == 1) {
                String str5 = (String) this.stringAdapter.fromJson(mVar2);
                if (str5 != null) {
                    str2 = str5;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Non-null value 'system' was null at ");
                    sb2.append(mVar.mo29775j0());
                    throw new C11734j(sb2.toString());
                }
            } else if (a == 2) {
                list = (List) this.listOfStringAdapter.fromJson(mVar2);
                if (list == null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Non-null value 'advisories' was null at ");
                    sb3.append(mVar.mo29775j0());
                    throw new C11734j(sb3.toString());
                }
            } else if (a == 3) {
                str3 = (String) this.nullableStringAdapter.fromJson(mVar2);
                z = true;
            }
        }
        mVar.mo29767d();
        if (str == null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Required property 'value_' missing at ");
            sb4.append(mVar.mo29775j0());
            throw new C11734j(sb4.toString());
        } else if (str2 != null) {
            Rating rating = new Rating(str, str2, null, null, 12, null);
            if (list == null) {
                list = rating.mo13186X();
            }
            List list2 = list;
            if (!z) {
                str3 = rating.getDescription();
            }
            return Rating.m12301a(rating, null, null, list2, str3, 3, null);
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Required property 'system' missing at ");
            sb5.append(mVar.mo29775j0());
            throw new C11734j(sb5.toString());
        }
    }
}
