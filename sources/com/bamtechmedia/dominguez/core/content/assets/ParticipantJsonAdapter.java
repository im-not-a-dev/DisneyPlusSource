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

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/assets/ParticipantJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/core/content/assets/Participant;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "nullableIntAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "coreContentApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ParticipantJsonAdapter.kt */
public final class ParticipantJsonAdapter extends C11725h<Participant> {
    private final C11725h<Integer> nullableIntAdapter;
    private final C11739b options;
    private final C11725h<String> stringAdapter;

    public ParticipantJsonAdapter(C11760v vVar) {
        String str = "order";
        String str2 = "displayName";
        C11739b a = C11739b.m37729a(str2, "sortName", "role", str);
        C12880j.m40222a((Object) a, "JsonReader.Options.of(\"d…rtName\", \"role\", \"order\")");
        this.options = a;
        C11725h<String> a2 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), str2);
        C12880j.m40222a((Object) a2, "moshi.adapter<String>(St…mptySet(), \"displayName\")");
        this.stringAdapter = a2;
        C11725h<Integer> a3 = vVar.mo29869a((Type) Integer.class, C13188p0.m40531a(), str);
        C12880j.m40222a((Object) a3, "moshi.adapter<Int?>(Int:…ions.emptySet(), \"order\")");
        this.nullableIntAdapter = a3;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, Participant participant) {
        if (participant != null) {
            sVar.mo29791b();
            sVar.mo29796e("displayName");
            this.stringAdapter.toJson(sVar, participant.mo13150X());
            sVar.mo29796e("sortName");
            this.stringAdapter.toJson(sVar, participant.mo13154a0());
            sVar.mo29796e("role");
            this.stringAdapter.toJson(sVar, participant.mo13152Z());
            sVar.mo29796e("order");
            this.nullableIntAdapter.toJson(sVar, participant.mo13151Y());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(Participant)";
    }

    public Participant fromJson(C11737m mVar) {
        mVar.mo29763b();
        Integer num = null;
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (mVar.mo29770f()) {
            int a = mVar.mo29758a(this.options);
            if (a == -1) {
                mVar.mo29783q();
                mVar.mo29784r();
            } else if (a == 0) {
                String str4 = (String) this.stringAdapter.fromJson(mVar);
                if (str4 != null) {
                    str = str4;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Non-null value 'displayName' was null at ");
                    sb.append(mVar.mo29775j0());
                    throw new C11734j(sb.toString());
                }
            } else if (a == 1) {
                String str5 = (String) this.stringAdapter.fromJson(mVar);
                if (str5 != null) {
                    str2 = str5;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Non-null value 'sortName' was null at ");
                    sb2.append(mVar.mo29775j0());
                    throw new C11734j(sb2.toString());
                }
            } else if (a == 2) {
                String str6 = (String) this.stringAdapter.fromJson(mVar);
                if (str6 != null) {
                    str3 = str6;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Non-null value 'role' was null at ");
                    sb3.append(mVar.mo29775j0());
                    throw new C11734j(sb3.toString());
                }
            } else if (a == 3) {
                num = (Integer) this.nullableIntAdapter.fromJson(mVar);
                z = true;
            }
        }
        mVar.mo29767d();
        if (str == null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Required property 'displayName' missing at ");
            sb4.append(mVar.mo29775j0());
            throw new C11734j(sb4.toString());
        } else if (str2 == null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Required property 'sortName' missing at ");
            sb5.append(mVar.mo29775j0());
            throw new C11734j(sb5.toString());
        } else if (str3 != null) {
            Participant participant = new Participant(str, str2, str3, null, 8, null);
            if (!z) {
                num = participant.mo13151Y();
            }
            return Participant.m12285a(participant, null, null, null, num, 7, null);
        } else {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Required property 'role' missing at ");
            sb6.append(mVar.mo29775j0());
            throw new C11734j(sb6.toString());
        }
    }
}
