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

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/TextEntryJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/core/content/assets/TextEntry;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TextEntryJsonAdapter.kt */
public final class TextEntryJsonAdapter extends C11725h<TextEntry> {
    private final C11739b options;
    private final C11725h<String> stringAdapter;

    public TextEntryJsonAdapter(C11760v vVar) {
        String str = "field";
        C11739b a = C11739b.m37729a(str, "type", "language", "content", "sourceEntity");
        C12880j.m40222a((Object) a, "JsonReader.Options.of(\"f…content\", \"sourceEntity\")");
        this.options = a;
        C11725h<String> a2 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), str);
        C12880j.m40222a((Object) a2, "moshi.adapter<String>(St…ions.emptySet(), \"field\")");
        this.stringAdapter = a2;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, TextEntry textEntry) {
        if (textEntry != null) {
            sVar.mo29791b();
            sVar.mo29796e("field");
            this.stringAdapter.toJson(sVar, textEntry.mo13211Y());
            sVar.mo29796e("type");
            this.stringAdapter.toJson(sVar, textEntry.mo13214b0());
            sVar.mo29796e("language");
            this.stringAdapter.toJson(sVar, textEntry.mo13212Z());
            sVar.mo29796e("content");
            this.stringAdapter.toJson(sVar, textEntry.mo13210X());
            sVar.mo29796e("sourceEntity");
            this.stringAdapter.toJson(sVar, textEntry.mo13213a0());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(TextEntry)";
    }

    public TextEntry fromJson(C11737m mVar) {
        mVar.mo29763b();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (mVar.mo29770f()) {
            int a = mVar.mo29758a(this.options);
            if (a == -1) {
                mVar.mo29783q();
                mVar.mo29784r();
            } else if (a == 0) {
                String str6 = (String) this.stringAdapter.fromJson(mVar);
                if (str6 != null) {
                    str = str6;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Non-null value 'field' was null at ");
                    sb.append(mVar.mo29775j0());
                    throw new C11734j(sb.toString());
                }
            } else if (a == 1) {
                String str7 = (String) this.stringAdapter.fromJson(mVar);
                if (str7 != null) {
                    str2 = str7;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Non-null value 'type' was null at ");
                    sb2.append(mVar.mo29775j0());
                    throw new C11734j(sb2.toString());
                }
            } else if (a == 2) {
                String str8 = (String) this.stringAdapter.fromJson(mVar);
                if (str8 != null) {
                    str3 = str8;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Non-null value 'language' was null at ");
                    sb3.append(mVar.mo29775j0());
                    throw new C11734j(sb3.toString());
                }
            } else if (a == 3) {
                String str9 = (String) this.stringAdapter.fromJson(mVar);
                if (str9 != null) {
                    str4 = str9;
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Non-null value 'content' was null at ");
                    sb4.append(mVar.mo29775j0());
                    throw new C11734j(sb4.toString());
                }
            } else if (a != 4) {
                continue;
            } else {
                String str10 = (String) this.stringAdapter.fromJson(mVar);
                if (str10 != null) {
                    str5 = str10;
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Non-null value 'sourceEntity' was null at ");
                    sb5.append(mVar.mo29775j0());
                    throw new C11734j(sb5.toString());
                }
            }
        }
        mVar.mo29767d();
        if (str == null) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Required property 'field' missing at ");
            sb6.append(mVar.mo29775j0());
            throw new C11734j(sb6.toString());
        } else if (str2 == null) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Required property 'type' missing at ");
            sb7.append(mVar.mo29775j0());
            throw new C11734j(sb7.toString());
        } else if (str3 == null) {
            StringBuilder sb8 = new StringBuilder();
            sb8.append("Required property 'language' missing at ");
            sb8.append(mVar.mo29775j0());
            throw new C11734j(sb8.toString());
        } else if (str4 == null) {
            StringBuilder sb9 = new StringBuilder();
            sb9.append("Required property 'content' missing at ");
            sb9.append(mVar.mo29775j0());
            throw new C11734j(sb9.toString());
        } else if (str5 != null) {
            TextEntry textEntry = new TextEntry(str, str2, str3, str4, str5);
            return textEntry;
        } else {
            StringBuilder sb10 = new StringBuilder();
            sb10.append("Required property 'sourceEntity' missing at ");
            sb10.append(mVar.mo29775j0());
            throw new C11734j(sb10.toString());
        }
    }
}
