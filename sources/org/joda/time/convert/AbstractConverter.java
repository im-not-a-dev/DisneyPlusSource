package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormatter;

public abstract class AbstractConverter implements Converter {
    protected AbstractConverter() {
    }

    public Chronology getChronology(Object obj, DateTimeZone dateTimeZone) {
        return ISOChronology.getInstance(dateTimeZone);
    }

    public long getInstantMillis(Object obj, Chronology chronology) {
        return DateTimeUtils.currentTimeMillis();
    }

    public int[] getPartialValues(ReadablePartial readablePartial, Object obj, Chronology chronology) {
        return chronology.get(readablePartial, getInstantMillis(obj, chronology));
    }

    public PeriodType getPeriodType(Object obj) {
        return PeriodType.standard();
    }

    public boolean isReadableInterval(Object obj, Chronology chronology) {
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Converter[");
        sb.append(getSupportedType() == null ? "null" : getSupportedType().getName());
        sb.append("]");
        return sb.toString();
    }

    public Chronology getChronology(Object obj, Chronology chronology) {
        return DateTimeUtils.getChronology(chronology);
    }

    public int[] getPartialValues(ReadablePartial readablePartial, Object obj, Chronology chronology, DateTimeFormatter dateTimeFormatter) {
        return getPartialValues(readablePartial, obj, chronology);
    }
}
