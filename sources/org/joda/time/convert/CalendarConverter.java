package org.joda.time.convert;

import java.util.Calendar;
import java.util.GregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

final class CalendarConverter extends AbstractConverter implements InstantConverter, PartialConverter {
    static final CalendarConverter INSTANCE = new CalendarConverter();

    protected CalendarConverter() {
    }

    public Chronology getChronology(Object obj, Chronology chronology) {
        DateTimeZone dateTimeZone;
        if (chronology != null) {
            return chronology;
        }
        Calendar calendar = (Calendar) obj;
        try {
            dateTimeZone = DateTimeZone.forTimeZone(calendar.getTimeZone());
        } catch (IllegalArgumentException unused) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        return getChronology((Object) calendar, dateTimeZone);
    }

    public long getInstantMillis(Object obj, Chronology chronology) {
        return ((Calendar) obj).getTime().getTime();
    }

    public Class<?> getSupportedType() {
        return Calendar.class;
    }

    public Chronology getChronology(Object obj, DateTimeZone dateTimeZone) {
        if (obj.getClass().getName().endsWith(".BuddhistCalendar")) {
            return BuddhistChronology.getInstance(dateTimeZone);
        }
        if (!(obj instanceof GregorianCalendar)) {
            return ISOChronology.getInstance(dateTimeZone);
        }
        long time = ((GregorianCalendar) obj).getGregorianChange().getTime();
        if (time == Long.MIN_VALUE) {
            return GregorianChronology.getInstance(dateTimeZone);
        }
        if (time == Long.MAX_VALUE) {
            return JulianChronology.getInstance(dateTimeZone);
        }
        return GJChronology.getInstance(dateTimeZone, time, 4);
    }
}
