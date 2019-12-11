package com.bamtechmedia.dominguez.analytics;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11734j;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11737m.C11739b;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11760v;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0016\u001a\u00020\rH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/AudienceManagerJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/analytics/AudienceManager;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "booleanAdapter", "", "intAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "analytics_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AudienceManagerJsonAdapter.kt */
public final class AudienceManagerJsonAdapter extends C11725h<AudienceManager> {
    private final C11725h<Boolean> booleanAdapter;
    private final C11725h<Integer> intAdapter;
    private final C11739b options;
    private final C11725h<String> stringAdapter;

    public AudienceManagerJsonAdapter(C11760v vVar) {
        String str = "timeout";
        String str2 = "analyticsForwardingEnabled";
        String str3 = "server";
        C11739b a = C11739b.m37729a(str3, str2, str);
        C12880j.m40222a((Object) a, "JsonReader.Options.of(\"s…rdingEnabled\", \"timeout\")");
        this.options = a;
        C11725h<String> a2 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), str3);
        C12880j.m40222a((Object) a2, "moshi.adapter<String>(St…ons.emptySet(), \"server\")");
        this.stringAdapter = a2;
        C11725h<Boolean> a3 = vVar.mo29869a((Type) Boolean.TYPE, C13188p0.m40531a(), str2);
        C12880j.m40222a((Object) a3, "moshi.adapter<Boolean>(B…lyticsForwardingEnabled\")");
        this.booleanAdapter = a3;
        C11725h<Integer> a4 = vVar.mo29869a((Type) Integer.TYPE, C13188p0.m40531a(), str);
        C12880j.m40222a((Object) a4, "moshi.adapter<Int>(Int::…ns.emptySet(), \"timeout\")");
        this.intAdapter = a4;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, AudienceManager audienceManager) {
        if (audienceManager != null) {
            sVar.mo29791b();
            sVar.mo29796e("server");
            this.stringAdapter.toJson(sVar, audienceManager.mo11414b());
            sVar.mo29796e("analyticsForwardingEnabled");
            this.booleanAdapter.toJson(sVar, Boolean.valueOf(audienceManager.mo11413a()));
            sVar.mo29796e("timeout");
            this.intAdapter.toJson(sVar, Integer.valueOf(audienceManager.mo11415c()));
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(AudienceManager)";
    }

    public AudienceManager fromJson(C11737m mVar) {
        mVar.mo29763b();
        String str = null;
        Boolean bool = null;
        Integer num = null;
        while (mVar.mo29770f()) {
            int a = mVar.mo29758a(this.options);
            if (a == -1) {
                mVar.mo29783q();
                mVar.mo29784r();
            } else if (a == 0) {
                str = (String) this.stringAdapter.fromJson(mVar);
                if (str == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Non-null value 'server' was null at ");
                    sb.append(mVar.mo29775j0());
                    throw new C11734j(sb.toString());
                }
            } else if (a == 1) {
                Boolean bool2 = (Boolean) this.booleanAdapter.fromJson(mVar);
                if (bool2 != null) {
                    bool = Boolean.valueOf(bool2.booleanValue());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Non-null value 'analyticsForwardingEnabled' was null at ");
                    sb2.append(mVar.mo29775j0());
                    throw new C11734j(sb2.toString());
                }
            } else if (a != 2) {
                continue;
            } else {
                Integer num2 = (Integer) this.intAdapter.fromJson(mVar);
                if (num2 != null) {
                    num = Integer.valueOf(num2.intValue());
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Non-null value 'timeout' was null at ");
                    sb3.append(mVar.mo29775j0());
                    throw new C11734j(sb3.toString());
                }
            }
        }
        mVar.mo29767d();
        if (str == null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Required property 'server' missing at ");
            sb4.append(mVar.mo29775j0());
            throw new C11734j(sb4.toString());
        } else if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (num != null) {
                return new AudienceManager(str, booleanValue, num.intValue());
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Required property 'timeout' missing at ");
            sb5.append(mVar.mo29775j0());
            throw new C11734j(sb5.toString());
        } else {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Required property 'analyticsForwardingEnabled' missing at ");
            sb6.append(mVar.mo29775j0());
            throw new C11734j(sb6.toString());
        }
    }
}
