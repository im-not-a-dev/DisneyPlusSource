package com.bamtechmedia.dominguez.legal.api;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11734j;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11737m.C11739b;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11760v;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/api/MarketingInputJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/legal/api/MarketingInput;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "booleanAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "legalApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MarketingInputJsonAdapter.kt */
public final class MarketingInputJsonAdapter extends C11725h<MarketingInput> {
    private final C11725h<Boolean> booleanAdapter;
    private final C11739b options;
    private final C11725h<String> stringAdapter;

    public MarketingInputJsonAdapter(C11760v vVar) {
        String str = "subscribed";
        String str2 = "code";
        C11739b a = C11739b.m37729a(str2, "textID", str);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "JsonReader.Options.of(\"c…, \"textID\", \"subscribed\")");
        this.options = a;
        C11725h<String> a2 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), str2);
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "moshi.adapter<String>(St…tions.emptySet(), \"code\")");
        this.stringAdapter = a2;
        C11725h<Boolean> a3 = vVar.mo29869a((Type) Boolean.TYPE, C13188p0.m40531a(), str);
        Intrinsics.checkReturnedValueIsNotNull((Object) a3, "moshi.adapter<Boolean>(B…emptySet(), \"subscribed\")");
        this.booleanAdapter = a3;
    }

    public String toString() {
        return "GeneratedJsonAdapter(MarketingInput)";
    }

    public MarketingInput fromJson(C11737m mVar) {
        mVar.mo29763b();
        String str = null;
        String str2 = null;
        Boolean bool = null;
        while (mVar.mo29770f()) {
            int a = mVar.mo29758a(this.options);
            if (a == -1) {
                mVar.mo29783q();
                mVar.mo29784r();
            } else if (a == 0) {
                str = (String) this.stringAdapter.fromJson(mVar);
                if (str == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Non-null value 'code' was null at ");
                    sb.append(mVar.mo29775j0());
                    throw new C11734j(sb.toString());
                }
            } else if (a == 1) {
                str2 = (String) this.stringAdapter.fromJson(mVar);
                if (str2 == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Non-null value 'textId' was null at ");
                    sb2.append(mVar.mo29775j0());
                    throw new C11734j(sb2.toString());
                }
            } else if (a != 2) {
                continue;
            } else {
                Boolean bool2 = (Boolean) this.booleanAdapter.fromJson(mVar);
                if (bool2 != null) {
                    bool = Boolean.valueOf(bool2.booleanValue());
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Non-null value 'subscribed' was null at ");
                    sb3.append(mVar.mo29775j0());
                    throw new C11734j(sb3.toString());
                }
            }
        }
        mVar.mo29767d();
        if (str == null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Required property 'code' missing at ");
            sb4.append(mVar.mo29775j0());
            throw new C11734j(sb4.toString());
        } else if (str2 == null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Required property 'textId' missing at ");
            sb5.append(mVar.mo29775j0());
            throw new C11734j(sb5.toString());
        } else if (bool != null) {
            return new MarketingInput(str, str2, bool.booleanValue());
        } else {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Required property 'subscribed' missing at ");
            sb6.append(mVar.mo29775j0());
            throw new C11734j(sb6.toString());
        }
    }

    public void toJson(C11747s sVar, MarketingInput marketingInput) {
        if (marketingInput != null) {
            sVar.mo29791b();
            sVar.mo29796e("code");
            this.stringAdapter.toJson(sVar, marketingInput.getCode());
            sVar.mo29796e("textID");
            this.stringAdapter.toJson(sVar, marketingInput.getTextId());
            sVar.mo29796e("subscribed");
            this.booleanAdapter.toJson(sVar, Boolean.valueOf(marketingInput.getSubscribed()));
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }
}
