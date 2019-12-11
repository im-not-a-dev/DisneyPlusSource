package com.bamtechmedia.dominguez.core.content.assets;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11734j;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11737m.C11739b;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11760v;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/MilestoneAttributesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/core/content/assets/MilestoneAttributes;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "nullableLongAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MilestoneAttributesJsonAdapter.kt */
public final class MilestoneAttributesJsonAdapter extends C11725h<MilestoneAttributes> {
    private final C11725h<Long> nullableLongAdapter;
    private final C11739b options;
    private final C11725h<String> stringAdapter;

    public MilestoneAttributesJsonAdapter(C11760v vVar) {
        String str = "startMillis";
        String str2 = "type";
        C11739b a = C11739b.m37729a(str2, str);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "JsonReader.Options.of(\"type\", \"startMillis\")");
        this.options = a;
        C11725h<String> a2 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), str2);
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "moshi.adapter<String>(St…tions.emptySet(), \"type\")");
        this.stringAdapter = a2;
        C11725h<Long> a3 = vVar.mo29869a((Type) Long.class, C13188p0.m40531a(), str);
        Intrinsics.checkReturnedValueIsNotNull((Object) a3, "moshi.adapter<Long?>(Lon…mptySet(), \"startMillis\")");
        this.nullableLongAdapter = a3;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, MilestoneAttributes milestoneAttributes) {
        if (milestoneAttributes != null) {
            sVar.mo29791b();
            sVar.mo29796e("type");
            this.stringAdapter.toJson(sVar, milestoneAttributes.mo13138Y());
            sVar.mo29796e("startMillis");
            this.nullableLongAdapter.toJson(sVar, milestoneAttributes.mo13137X());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(MilestoneAttributes)";
    }

    public MilestoneAttributes fromJson(C11737m mVar) {
        mVar.mo29763b();
        String str = null;
        Long l = null;
        while (mVar.mo29770f()) {
            int a = mVar.mo29758a(this.options);
            if (a == -1) {
                mVar.mo29783q();
                mVar.mo29784r();
            } else if (a == 0) {
                str = (String) this.stringAdapter.fromJson(mVar);
                if (str == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Non-null value 'type' was null at ");
                    sb.append(mVar.mo29775j0());
                    throw new C11734j(sb.toString());
                }
            } else if (a == 1) {
                l = (Long) this.nullableLongAdapter.fromJson(mVar);
            }
        }
        mVar.mo29767d();
        if (str != null) {
            return new MilestoneAttributes(str, l);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Required property 'type' missing at ");
        sb2.append(mVar.mo29775j0());
        throw new C11734j(sb2.toString());
    }
}
