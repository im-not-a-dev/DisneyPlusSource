package com.bamtechmedia.dominguez.core.content;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11734j;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11737m.C11739b;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11760v;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u000bH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/PromoLabelJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/core/content/PromoLabel;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "dateTimeAdapter", "Lorg/joda/time/DateTime;", "nullableIntAdapter", "", "nullableStringAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PromoLabelJsonAdapter.kt */
public final class PromoLabelJsonAdapter extends C11725h<PromoLabel> {
    private final C11725h<DateTime> dateTimeAdapter;
    private final C11725h<Integer> nullableIntAdapter;
    private final C11725h<String> nullableStringAdapter;
    private final C11739b options;
    private final C11725h<String> stringAdapter;

    public PromoLabelJsonAdapter(C11760v vVar) {
        C11739b a = C11739b.m37729a("type", "sunrise", "sunset", "subType", "seasonNumber", "episodeSequenceNumber");
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "JsonReader.Options.of(\"t… \"episodeSequenceNumber\")");
        this.options = a;
        C11725h<String> a2 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), "type");
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "moshi.adapter<String>(St…tions.emptySet(), \"type\")");
        this.stringAdapter = a2;
        C11725h<DateTime> a3 = vVar.mo29869a((Type) DateTime.class, C13188p0.m40531a(), "sunrise");
        Intrinsics.checkReturnedValueIsNotNull((Object) a3, "moshi.adapter<DateTime>(…ns.emptySet(), \"sunrise\")");
        this.dateTimeAdapter = a3;
        C11725h<String> a4 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), "subType");
        Intrinsics.checkReturnedValueIsNotNull((Object) a4, "moshi.adapter<String?>(S…ns.emptySet(), \"subType\")");
        this.nullableStringAdapter = a4;
        C11725h<Integer> a5 = vVar.mo29869a((Type) Integer.class, C13188p0.m40531a(), "seasonNumber");
        Intrinsics.checkReturnedValueIsNotNull((Object) a5, "moshi.adapter<Int?>(Int:…ptySet(), \"seasonNumber\")");
        this.nullableIntAdapter = a5;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, PromoLabel promoLabel) {
        if (promoLabel != null) {
            sVar.mo29791b();
            sVar.mo29796e("type");
            this.stringAdapter.toJson(sVar, promoLabel.mo12814b0());
            sVar.mo29796e("sunrise");
            this.dateTimeAdapter.toJson(sVar, promoLabel.mo12811Z());
            sVar.mo29796e("sunset");
            this.dateTimeAdapter.toJson(sVar, promoLabel.mo12813a0());
            sVar.mo29796e("subType");
            this.nullableStringAdapter.toJson(sVar, promoLabel.mo12810Y());
            sVar.mo29796e("seasonNumber");
            this.nullableIntAdapter.toJson(sVar, promoLabel.mo12808F());
            sVar.mo29796e("episodeSequenceNumber");
            this.nullableIntAdapter.toJson(sVar, promoLabel.mo12809X());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(PromoLabel)";
    }

    public PromoLabel fromJson(C11737m mVar) {
        C11737m mVar2 = mVar;
        mVar.mo29763b();
        boolean z = false;
        Integer num = null;
        String str = null;
        DateTime dateTime = null;
        DateTime dateTime2 = null;
        String str2 = null;
        Integer num2 = null;
        boolean z2 = false;
        while (mVar.mo29770f()) {
            switch (mVar2.mo29758a(this.options)) {
                case -1:
                    mVar.mo29783q();
                    mVar.mo29784r();
                    break;
                case 0:
                    String str3 = (String) this.stringAdapter.fromJson(mVar2);
                    if (str3 != null) {
                        str = str3;
                        break;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Non-null value 'type' was null at ");
                        sb.append(mVar.mo29775j0());
                        throw new C11734j(sb.toString());
                    }
                case 1:
                    DateTime dateTime3 = (DateTime) this.dateTimeAdapter.fromJson(mVar2);
                    if (dateTime3 != null) {
                        dateTime = dateTime3;
                        break;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Non-null value 'sunrise' was null at ");
                        sb2.append(mVar.mo29775j0());
                        throw new C11734j(sb2.toString());
                    }
                case 2:
                    DateTime dateTime4 = (DateTime) this.dateTimeAdapter.fromJson(mVar2);
                    if (dateTime4 != null) {
                        dateTime2 = dateTime4;
                        break;
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Non-null value 'sunset' was null at ");
                        sb3.append(mVar.mo29775j0());
                        throw new C11734j(sb3.toString());
                    }
                case 3:
                    str2 = (String) this.nullableStringAdapter.fromJson(mVar2);
                    break;
                case 4:
                    num = (Integer) this.nullableIntAdapter.fromJson(mVar2);
                    z = true;
                    break;
                case 5:
                    num2 = (Integer) this.nullableIntAdapter.fromJson(mVar2);
                    z2 = true;
                    break;
            }
        }
        mVar.mo29767d();
        if (str == null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Required property 'type' missing at ");
            sb4.append(mVar.mo29775j0());
            throw new C11734j(sb4.toString());
        } else if (dateTime == null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Required property 'sunrise' missing at ");
            sb5.append(mVar.mo29775j0());
            throw new C11734j(sb5.toString());
        } else if (dateTime2 != null) {
            PromoLabel promoLabel = new PromoLabel(str, dateTime, dateTime2, str2, null, null, 48, null);
            if (!z) {
                num = promoLabel.mo12808F();
            }
            Integer num3 = num;
            if (!z2) {
                num2 = promoLabel.mo12809X();
            }
            return PromoLabel.m12081a(promoLabel, null, null, null, null, num3, num2, 15, null);
        } else {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Required property 'sunset' missing at ");
            sb6.append(mVar.mo29775j0());
            throw new C11734j(sb6.toString());
        }
    }
}
