package com.bamtechmedia.dominguez.core.content.assets;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import org.joda.time.DateTime;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11734j;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11737m.C11739b;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11760v;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0016\u001a\u00020\rH\u0016R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/AvailabilityJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/core/content/assets/Availability;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "nullableBooleanAdapter", "", "nullableDateTimeAdapter", "Lorg/joda/time/DateTime;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AvailabilityJsonAdapter.kt */
public final class AvailabilityJsonAdapter extends C11725h<Availability> {
    private final C11725h<Boolean> nullableBooleanAdapter;
    private final C11725h<DateTime> nullableDateTimeAdapter;
    private final C11739b options;
    private final C11725h<String> stringAdapter;

    public AvailabilityJsonAdapter(C11760v vVar) {
        String str = "kidsMode";
        String str2 = "appears";
        String str3 = "region";
        C11739b a = C11739b.m37729a(str3, str2, "expires", "minPromotionalStartDate", str);
        C12880j.m40222a((Object) a, "JsonReader.Options.of(\"r…alStartDate\", \"kidsMode\")");
        this.options = a;
        C11725h<String> a2 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), str3);
        C12880j.m40222a((Object) a2, "moshi.adapter<String>(St…ons.emptySet(), \"region\")");
        this.stringAdapter = a2;
        C11725h<DateTime> a3 = vVar.mo29869a((Type) DateTime.class, C13188p0.m40531a(), str2);
        C12880j.m40222a((Object) a3, "moshi.adapter<DateTime?>…ns.emptySet(), \"appears\")");
        this.nullableDateTimeAdapter = a3;
        C11725h<Boolean> a4 = vVar.mo29869a((Type) Boolean.class, C13188p0.m40531a(), str);
        C12880j.m40222a((Object) a4, "moshi.adapter<Boolean?>(…s.emptySet(), \"kidsMode\")");
        this.nullableBooleanAdapter = a4;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, Availability availability) {
        if (availability != null) {
            sVar.mo29791b();
            sVar.mo29796e("region");
            this.stringAdapter.toJson(sVar, availability.mo12829b0());
            sVar.mo29796e("appears");
            this.nullableDateTimeAdapter.toJson(sVar, availability.mo12825X());
            sVar.mo29796e("expires");
            this.nullableDateTimeAdapter.toJson(sVar, availability.mo12826Y());
            sVar.mo29796e("minPromotionalStartDate");
            this.nullableDateTimeAdapter.toJson(sVar, availability.mo12828a0());
            sVar.mo29796e("kidsMode");
            this.nullableBooleanAdapter.toJson(sVar, availability.mo12827Z());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(Availability)";
    }

    public Availability fromJson(C11737m mVar) {
        mVar.mo29763b();
        String str = null;
        DateTime dateTime = null;
        DateTime dateTime2 = null;
        DateTime dateTime3 = null;
        Boolean bool = null;
        while (mVar.mo29770f()) {
            int a = mVar.mo29758a(this.options);
            if (a == -1) {
                mVar.mo29783q();
                mVar.mo29784r();
            } else if (a == 0) {
                String str2 = (String) this.stringAdapter.fromJson(mVar);
                if (str2 != null) {
                    str = str2;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Non-null value 'region' was null at ");
                    sb.append(mVar.mo29775j0());
                    throw new C11734j(sb.toString());
                }
            } else if (a == 1) {
                dateTime = (DateTime) this.nullableDateTimeAdapter.fromJson(mVar);
            } else if (a == 2) {
                dateTime2 = (DateTime) this.nullableDateTimeAdapter.fromJson(mVar);
            } else if (a == 3) {
                dateTime3 = (DateTime) this.nullableDateTimeAdapter.fromJson(mVar);
            } else if (a == 4) {
                bool = (Boolean) this.nullableBooleanAdapter.fromJson(mVar);
            }
        }
        mVar.mo29767d();
        if (str != null) {
            Availability availability = new Availability(str, dateTime, dateTime2, dateTime3, bool);
            return availability;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Required property 'region' missing at ");
        sb2.append(mVar.mo29775j0());
        throw new C11734j(sb2.toString());
    }
}
