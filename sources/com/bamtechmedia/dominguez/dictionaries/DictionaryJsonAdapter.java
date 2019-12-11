package com.bamtechmedia.dominguez.dictionaries;

import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11734j;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11737m.C11739b;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11760v;
import p163g.p500m.p501a.C11780y;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0014\u001a\u00020\bH\u0016R \u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/dictionaries/DictionaryJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/dictionaries/Dictionary;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "mapOfStringStringAdapter", "", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "config_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DictionaryJsonAdapter.kt */
public final class DictionaryJsonAdapter extends C11725h<Dictionary> {
    private final C11725h<Map<String, String>> mapOfStringStringAdapter;
    private final C11739b options;
    private final C11725h<String> stringAdapter;

    public DictionaryJsonAdapter(C11760v vVar) {
        String str = "version";
        C11739b a = C11739b.m37729a(str, "resourceKey", "entries_json");
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "JsonReader.Options.of(\"v…urceKey\", \"entries_json\")");
        this.options = a;
        C11725h<String> a2 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), str);
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "moshi.adapter<String>(St…ns.emptySet(), \"version\")");
        this.stringAdapter = a2;
        C11725h<Map<String, String>> a3 = vVar.mo29869a((Type) C11780y.m37894a((Type) Map.class, String.class, String.class), C13188p0.m40531a(), "entries");
        Intrinsics.checkReturnedValueIsNotNull((Object) a3, "moshi.adapter<Map<String…ns.emptySet(), \"entries\")");
        this.mapOfStringStringAdapter = a3;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, Dictionary dictionary) {
        if (dictionary != null) {
            sVar.mo29791b();
            sVar.mo29796e("version");
            this.stringAdapter.toJson(sVar, dictionary.mo18328c());
            sVar.mo29796e("resourceKey");
            this.stringAdapter.toJson(sVar, dictionary.mo18327b());
            sVar.mo29796e("entries_json");
            this.mapOfStringStringAdapter.toJson(sVar, dictionary.mo18326a());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(Dictionary)";
    }

    public Dictionary fromJson(C11737m mVar) {
        mVar.mo29763b();
        String str = null;
        String str2 = null;
        Map map = null;
        while (mVar.mo29770f()) {
            int a = mVar.mo29758a(this.options);
            if (a == -1) {
                mVar.mo29783q();
                mVar.mo29784r();
            } else if (a == 0) {
                str = (String) this.stringAdapter.fromJson(mVar);
                if (str == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Non-null value 'version' was null at ");
                    sb.append(mVar.mo29775j0());
                    throw new C11734j(sb.toString());
                }
            } else if (a == 1) {
                str2 = (String) this.stringAdapter.fromJson(mVar);
                if (str2 == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Non-null value 'resourceKey' was null at ");
                    sb2.append(mVar.mo29775j0());
                    throw new C11734j(sb2.toString());
                }
            } else if (a != 2) {
                continue;
            } else {
                map = (Map) this.mapOfStringStringAdapter.fromJson(mVar);
                if (map == null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Non-null value 'entries' was null at ");
                    sb3.append(mVar.mo29775j0());
                    throw new C11734j(sb3.toString());
                }
            }
        }
        mVar.mo29767d();
        if (str == null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Required property 'version' missing at ");
            sb4.append(mVar.mo29775j0());
            throw new C11734j(sb4.toString());
        } else if (str2 == null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Required property 'resourceKey' missing at ");
            sb5.append(mVar.mo29775j0());
            throw new C11734j(sb5.toString());
        } else if (map != null) {
            return new Dictionary(str, str2, map);
        } else {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Required property 'entries' missing at ");
            sb6.append(mVar.mo29775j0());
            throw new C11734j(sb6.toString());
        }
    }
}
