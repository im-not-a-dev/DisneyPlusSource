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

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0015\u001a\u00020\bH\u0016R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/LanguageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/core/content/assets/Language;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "nullableListOfStringAdapter", "", "", "nullableStringAdapter", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LanguageJsonAdapter.kt */
public final class LanguageJsonAdapter extends C11725h<Language> {
    private final C11725h<List<String>> nullableListOfStringAdapter;
    private final C11725h<String> nullableStringAdapter;
    private final C11739b options;
    private final C11725h<String> stringAdapter;

    public LanguageJsonAdapter(C11760v vVar) {
        String str = "features";
        String str2 = "trackType";
        String str3 = "name";
        C11739b a = C11739b.m37729a(str3, str2, "renditionName", "language", str);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "JsonReader.Options.of(\"n…, \"language\", \"features\")");
        this.options = a;
        C11725h<String> a2 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), str3);
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "moshi.adapter<String?>(S…tions.emptySet(), \"name\")");
        this.nullableStringAdapter = a2;
        C11725h<String> a3 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), str2);
        Intrinsics.checkReturnedValueIsNotNull((Object) a3, "moshi.adapter<String>(St….emptySet(), \"trackType\")");
        this.stringAdapter = a3;
        C11725h<List<String>> a4 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, String.class), C13188p0.m40531a(), str);
        Intrinsics.checkReturnedValueIsNotNull((Object) a4, "moshi.adapter<List<Strin…s.emptySet(), \"features\")");
        this.nullableListOfStringAdapter = a4;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, Language language) {
        if (language != null) {
            sVar.mo29791b();
            sVar.mo29796e("name");
            this.nullableStringAdapter.toJson(sVar, language.mo13105Z());
            sVar.mo29796e("trackType");
            this.stringAdapter.toJson(sVar, language.mo13107b0());
            sVar.mo29796e("renditionName");
            this.nullableStringAdapter.toJson(sVar, language.mo13106a0());
            sVar.mo29796e("language");
            this.stringAdapter.toJson(sVar, language.mo13104Y());
            sVar.mo29796e("features");
            this.nullableListOfStringAdapter.toJson(sVar, language.mo13103X());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(Language)";
    }

    public Language fromJson(C11737m mVar) {
        mVar.mo29763b();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        while (mVar.mo29770f()) {
            int a = mVar.mo29758a(this.options);
            if (a == -1) {
                mVar.mo29783q();
                mVar.mo29784r();
            } else if (a == 0) {
                str = (String) this.nullableStringAdapter.fromJson(mVar);
            } else if (a == 1) {
                String str5 = (String) this.stringAdapter.fromJson(mVar);
                if (str5 != null) {
                    str2 = str5;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Non-null value 'trackType' was null at ");
                    sb.append(mVar.mo29775j0());
                    throw new C11734j(sb.toString());
                }
            } else if (a == 2) {
                str3 = (String) this.nullableStringAdapter.fromJson(mVar);
            } else if (a == 3) {
                String str6 = (String) this.stringAdapter.fromJson(mVar);
                if (str6 != null) {
                    str4 = str6;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Non-null value 'languageCode' was null at ");
                    sb2.append(mVar.mo29775j0());
                    throw new C11734j(sb2.toString());
                }
            } else if (a == 4) {
                list = (List) this.nullableListOfStringAdapter.fromJson(mVar);
            }
        }
        mVar.mo29767d();
        if (str2 == null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Required property 'trackType' missing at ");
            sb3.append(mVar.mo29775j0());
            throw new C11734j(sb3.toString());
        } else if (str4 != null) {
            Language language = new Language(str, str2, str3, str4, list);
            return language;
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Required property 'languageCode' missing at ");
            sb4.append(mVar.mo29775j0());
            throw new C11734j(sb4.toString());
        }
    }
}
