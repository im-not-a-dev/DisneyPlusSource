package com.bamtech.sdk4.internal.media.offline.p047db.converters;

import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u0014\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/db/converters/DateTimeConverter;", "", "()V", "formatter", "Lorg/joda/time/format/DateTimeFormatter;", "fromTimestamp", "Lorg/joda/time/DateTime;", "value", "", "toTimestamp", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.internal.media.offline.db.converters.DateTimeConverter */
/* compiled from: DateTimeConverter.kt */
public final class DateTimeConverter {
    private static final DateTimeFormatter formatter;

    static {
        new DateTimeConverter();
        DateTimeFormatter withZoneUTC = ISODateTimeFormat.dateTime().withZoneUTC();
        C12880j.m40222a((Object) withZoneUTC, "ISODateTimeFormat.dateTime().withZoneUTC()");
        formatter = withZoneUTC;
    }

    private DateTimeConverter() {
    }

    public static final DateTime fromTimestamp(String str) {
        if (str != null) {
            return formatter.parseDateTime(str);
        }
        return null;
    }

    public static final String toTimestamp(DateTime dateTime) {
        if (dateTime != null) {
            return dateTime.toString(formatter);
        }
        return null;
    }
}
