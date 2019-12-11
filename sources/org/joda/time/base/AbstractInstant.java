package org.joda.time.base;

import java.util.Date;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public abstract class AbstractInstant implements ReadableInstant {
    protected AbstractInstant() {
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReadableInstant)) {
            return false;
        }
        ReadableInstant readableInstant = (ReadableInstant) obj;
        if (getMillis() != readableInstant.getMillis() || !FieldUtils.equals(getChronology(), readableInstant.getChronology())) {
            z = false;
        }
        return z;
    }

    public int get(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return dateTimeFieldType.getField(getChronology()).get(getMillis());
        }
        throw new IllegalArgumentException("The DateTimeFieldType must not be null");
    }

    public DateTimeZone getZone() {
        return getChronology().getZone();
    }

    public int hashCode() {
        return ((int) (getMillis() ^ (getMillis() >>> 32))) + getChronology().hashCode();
    }

    public boolean isAfter(long j) {
        return getMillis() > j;
    }

    public boolean isAfterNow() {
        return isAfter(DateTimeUtils.currentTimeMillis());
    }

    public boolean isBefore(long j) {
        return getMillis() < j;
    }

    public boolean isBeforeNow() {
        return isBefore(DateTimeUtils.currentTimeMillis());
    }

    public boolean isEqual(long j) {
        return getMillis() == j;
    }

    public boolean isEqualNow() {
        return isEqual(DateTimeUtils.currentTimeMillis());
    }

    public boolean isSupported(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            return false;
        }
        return dateTimeFieldType.getField(getChronology()).isSupported();
    }

    public Date toDate() {
        return new Date(getMillis());
    }

    public DateTime toDateTime() {
        return new DateTime(getMillis(), getZone());
    }

    public DateTime toDateTimeISO() {
        return new DateTime(getMillis(), (Chronology) ISOChronology.getInstance(getZone()));
    }

    public Instant toInstant() {
        return new Instant(getMillis());
    }

    public MutableDateTime toMutableDateTime() {
        return new MutableDateTime(getMillis(), getZone());
    }

    public MutableDateTime toMutableDateTimeISO() {
        return new MutableDateTime(getMillis(), (Chronology) ISOChronology.getInstance(getZone()));
    }

    public String toString() {
        return ISODateTimeFormat.dateTime().print((ReadableInstant) this);
    }

    public int compareTo(ReadableInstant readableInstant) {
        if (this == readableInstant) {
            return 0;
        }
        int i = (getMillis() > readableInstant.getMillis() ? 1 : (getMillis() == readableInstant.getMillis() ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        return i < 0 ? -1 : 1;
    }

    public boolean isAfter(ReadableInstant readableInstant) {
        return isAfter(DateTimeUtils.getInstantMillis(readableInstant));
    }

    public boolean isBefore(ReadableInstant readableInstant) {
        return isBefore(DateTimeUtils.getInstantMillis(readableInstant));
    }

    public boolean isEqual(ReadableInstant readableInstant) {
        return isEqual(DateTimeUtils.getInstantMillis(readableInstant));
    }

    public DateTime toDateTime(DateTimeZone dateTimeZone) {
        return new DateTime(getMillis(), DateTimeUtils.getChronology(getChronology()).withZone(dateTimeZone));
    }

    public MutableDateTime toMutableDateTime(DateTimeZone dateTimeZone) {
        return new MutableDateTime(getMillis(), DateTimeUtils.getChronology(getChronology()).withZone(dateTimeZone));
    }

    public String toString(DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter == null) {
            return toString();
        }
        return dateTimeFormatter.print((ReadableInstant) this);
    }

    public int get(DateTimeField dateTimeField) {
        if (dateTimeField != null) {
            return dateTimeField.get(getMillis());
        }
        throw new IllegalArgumentException("The DateTimeField must not be null");
    }

    public DateTime toDateTime(Chronology chronology) {
        return new DateTime(getMillis(), chronology);
    }

    public MutableDateTime toMutableDateTime(Chronology chronology) {
        return new MutableDateTime(getMillis(), chronology);
    }
}
