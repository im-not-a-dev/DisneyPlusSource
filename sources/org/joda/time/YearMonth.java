package org.joda.time;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.joda.time.base.BasePartial;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractPartialFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public final class YearMonth extends BasePartial implements ReadablePartial, Serializable {
    private static final DateTimeFieldType[] FIELD_TYPES = {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()};
    public static final int MONTH_OF_YEAR = 1;
    public static final int YEAR = 0;
    private static final long serialVersionUID = 797544782896179L;

    public static class Property extends AbstractPartialFieldProperty implements Serializable {
        private static final long serialVersionUID = 5727734012190224363L;
        private final YearMonth iBase;
        private final int iFieldIndex;

        Property(YearMonth yearMonth, int i) {
            this.iBase = yearMonth;
            this.iFieldIndex = i;
        }

        public YearMonth addToCopy(int i) {
            return new YearMonth(this.iBase, getField().add(this.iBase, this.iFieldIndex, this.iBase.getValues(), i));
        }

        public YearMonth addWrapFieldToCopy(int i) {
            return new YearMonth(this.iBase, getField().addWrapField(this.iBase, this.iFieldIndex, this.iBase.getValues(), i));
        }

        public int get() {
            return this.iBase.getValue(this.iFieldIndex);
        }

        public DateTimeField getField() {
            return this.iBase.getField(this.iFieldIndex);
        }

        /* access modifiers changed from: protected */
        public ReadablePartial getReadablePartial() {
            return this.iBase;
        }

        public YearMonth getYearMonth() {
            return this.iBase;
        }

        public YearMonth setCopy(int i) {
            return new YearMonth(this.iBase, getField().set(this.iBase, this.iFieldIndex, this.iBase.getValues(), i));
        }

        public YearMonth setCopy(String str, Locale locale) {
            return new YearMonth(this.iBase, getField().set(this.iBase, this.iFieldIndex, this.iBase.getValues(), str, locale));
        }

        public YearMonth setCopy(String str) {
            return setCopy(str, null);
        }
    }

    public YearMonth() {
    }

    public static YearMonth fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            return new YearMonth(calendar.get(1), calendar.get(2) + 1);
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    public static YearMonth fromDateFields(Date date) {
        if (date != null) {
            return new YearMonth(date.getYear() + 1900, date.getMonth() + 1);
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static YearMonth now() {
        return new YearMonth();
    }

    public static YearMonth parse(String str) {
        return parse(str, ISODateTimeFormat.localDateParser());
    }

    private Object readResolve() {
        return !DateTimeZone.UTC.equals(getChronology().getZone()) ? new YearMonth(this, getChronology().withUTC()) : this;
    }

    /* access modifiers changed from: protected */
    public DateTimeField getField(int i, Chronology chronology) {
        if (i == 0) {
            return chronology.year();
        }
        if (i == 1) {
            return chronology.monthOfYear();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public DateTimeFieldType getFieldType(int i) {
        return FIELD_TYPES[i];
    }

    public DateTimeFieldType[] getFieldTypes() {
        return (DateTimeFieldType[]) FIELD_TYPES.clone();
    }

    public int getMonthOfYear() {
        return getValue(1);
    }

    public int getYear() {
        return getValue(0);
    }

    public YearMonth minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public YearMonth minusMonths(int i) {
        return withFieldAdded(DurationFieldType.months(), FieldUtils.safeNegate(i));
    }

    public YearMonth minusYears(int i) {
        return withFieldAdded(DurationFieldType.years(), FieldUtils.safeNegate(i));
    }

    public Property monthOfYear() {
        return new Property(this, 1);
    }

    public YearMonth plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public YearMonth plusMonths(int i) {
        return withFieldAdded(DurationFieldType.months(), i);
    }

    public YearMonth plusYears(int i) {
        return withFieldAdded(DurationFieldType.years(), i);
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, indexOfSupported(dateTimeFieldType));
    }

    public int size() {
        return 2;
    }

    public Interval toInterval() {
        return toInterval(null);
    }

    public LocalDate toLocalDate(int i) {
        return new LocalDate(getYear(), getMonthOfYear(), i, getChronology());
    }

    public String toString() {
        return ISODateTimeFormat.yearMonth().print((ReadablePartial) this);
    }

    public YearMonth withChronologyRetainFields(Chronology chronology) {
        Chronology withUTC = DateTimeUtils.getChronology(chronology).withUTC();
        if (withUTC == getChronology()) {
            return this;
        }
        YearMonth yearMonth = new YearMonth(this, withUTC);
        withUTC.validate(yearMonth, getValues());
        return yearMonth;
    }

    public YearMonth withField(DateTimeFieldType dateTimeFieldType, int i) {
        int indexOfSupported = indexOfSupported(dateTimeFieldType);
        if (i == getValue(indexOfSupported)) {
            return this;
        }
        return new YearMonth(this, getField(indexOfSupported).set(this, indexOfSupported, getValues(), i));
    }

    public YearMonth withFieldAdded(DurationFieldType durationFieldType, int i) {
        int indexOfSupported = indexOfSupported(durationFieldType);
        if (i == 0) {
            return this;
        }
        return new YearMonth(this, getField(indexOfSupported).add(this, indexOfSupported, getValues(), i));
    }

    public YearMonth withMonthOfYear(int i) {
        return new YearMonth(this, getChronology().monthOfYear().set(this, 1, getValues(), i));
    }

    public YearMonth withPeriodAdded(ReadablePeriod readablePeriod, int i) {
        if (readablePeriod == null || i == 0) {
            return this;
        }
        int[] values = getValues();
        for (int i2 = 0; i2 < readablePeriod.size(); i2++) {
            int indexOf = indexOf(readablePeriod.getFieldType(i2));
            if (indexOf >= 0) {
                values = getField(indexOf).add(this, indexOf, values, FieldUtils.safeMultiply(readablePeriod.getValue(i2), i));
            }
        }
        return new YearMonth(this, values);
    }

    public YearMonth withYear(int i) {
        return new YearMonth(this, getChronology().year().set(this, 0, getValues(), i));
    }

    public Property year() {
        return new Property(this, 0);
    }

    public YearMonth(DateTimeZone dateTimeZone) {
        super((Chronology) ISOChronology.getInstance(dateTimeZone));
    }

    public static YearMonth now(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new YearMonth(dateTimeZone);
        }
        throw new NullPointerException("Zone must not be null");
    }

    public static YearMonth parse(String str, DateTimeFormatter dateTimeFormatter) {
        LocalDate parseLocalDate = dateTimeFormatter.parseLocalDate(str);
        return new YearMonth(parseLocalDate.getYear(), parseLocalDate.getMonthOfYear());
    }

    public Interval toInterval(DateTimeZone dateTimeZone) {
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        return new Interval((ReadableInstant) toLocalDate(1).toDateTimeAtStartOfDay(zone), (ReadableInstant) plusMonths(1).toLocalDate(1).toDateTimeAtStartOfDay(zone));
    }

    public String toString(String str) {
        if (str == null) {
            return toString();
        }
        return DateTimeFormat.forPattern(str).print((ReadablePartial) this);
    }

    public YearMonth(Chronology chronology) {
        super(chronology);
    }

    public YearMonth(long j) {
        super(j);
    }

    public static YearMonth now(Chronology chronology) {
        if (chronology != null) {
            return new YearMonth(chronology);
        }
        throw new NullPointerException("Chronology must not be null");
    }

    public String toString(String str, Locale locale) throws IllegalArgumentException {
        if (str == null) {
            return toString();
        }
        return DateTimeFormat.forPattern(str).withLocale(locale).print((ReadablePartial) this);
    }

    public YearMonth(long j, Chronology chronology) {
        super(j, chronology);
    }

    public YearMonth(Object obj) {
        super(obj, null, ISODateTimeFormat.localDateParser());
    }

    public YearMonth(Object obj, Chronology chronology) {
        super(obj, DateTimeUtils.getChronology(chronology), ISODateTimeFormat.localDateParser());
    }

    public YearMonth(int i, int i2) {
        this(i, i2, null);
    }

    public YearMonth(int i, int i2, Chronology chronology) {
        super(new int[]{i, i2}, chronology);
    }

    YearMonth(YearMonth yearMonth, int[] iArr) {
        super((BasePartial) yearMonth, iArr);
    }

    YearMonth(YearMonth yearMonth, Chronology chronology) {
        super((BasePartial) yearMonth, chronology);
    }
}
