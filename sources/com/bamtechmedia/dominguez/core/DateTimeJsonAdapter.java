package com.bamtechmedia.dominguez.core;

import kotlin.Metadata;
import org.joda.time.DateTime;
import p163g.p500m.p501a.C11723f;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11779x;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¨\u0006\f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/DateTimeJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lorg/joda/time/DateTime;", "()V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DateTimeJsonAdapter.kt */
public final class DateTimeJsonAdapter extends C11725h<DateTime> {
    @C11723f
    public DateTime fromJson(C11737m mVar) {
        return DateTime.parse(mVar.mo29779n());
    }

    @C11779x
    public void toJson(C11747s sVar, DateTime dateTime) {
        if (dateTime == null || sVar.mo29799g(dateTime.toString()) == null) {
            sVar.mo29800i();
        }
    }
}
