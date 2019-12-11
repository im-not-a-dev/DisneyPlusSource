package com.bamtechmedia.dominguez.core;

import com.bamtechmedia.dominguez.core.content.assets.C3623a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p500m.p501a.C11723f;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11734j;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11779x;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0017J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\tH\u0002J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0017R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/AspectRatioJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/core/content/assets/AspectRatio;", "()V", "aspectRatioPattern", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "stringRatioMap", "", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "parseStringValue", "stringValue", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AspectRatioJsonAdapter.kt */
public final class AspectRatioJsonAdapter extends C11725h<C3623a> {

    /* renamed from: a */
    private final Pattern f8914a = Pattern.compile("^([\\d]+)[:|x]([\\d]+)$");

    /* renamed from: b */
    private final Map<String, C3623a> f8915b = new LinkedHashMap();

    /* renamed from: a */
    private final C3623a m12054a(String str) {
        float f;
        Map<String, C3623a> map = this.f8915b;
        Object obj = map.get(str);
        if (obj == null) {
            Matcher matcher = this.f8914a.matcher(str);
            if (matcher.find()) {
                String group = matcher.group(1);
                Intrinsics.checkReturnedValueIsNotNull((Object) group, "matcher.group(1)");
                float parseFloat = Float.parseFloat(group);
                String group2 = matcher.group(2);
                Intrinsics.checkReturnedValueIsNotNull((Object) group2, "matcher.group(2)");
                f = parseFloat / Float.parseFloat(group2);
            } else {
                f = Float.parseFloat(str);
            }
            obj = new C3623a(f);
            map.put(str, obj);
        }
        return (C3623a) obj;
    }

    @C11723f
    public C3623a fromJson(C11737m mVar) {
        Object p = mVar.mo29781p();
        if (p instanceof Number) {
            return C3623a.f9125b0.mo13249a(((Number) p).floatValue());
        }
        if (p instanceof String) {
            return m12054a((String) p);
        }
        if (p == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can not parse value for aspectRatio: ");
        sb.append(mVar.mo29781p());
        throw new C11734j(sb.toString());
    }

    @C11779x
    public void toJson(C11747s sVar, C3623a aVar) {
        if (aVar == null) {
            sVar.mo29800i();
        } else {
            sVar.mo29790a((Number) Float.valueOf(aVar.mo13242X()));
        }
    }
}
