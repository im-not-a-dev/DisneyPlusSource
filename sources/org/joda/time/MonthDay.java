package org.joda.time;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.joda.time.base.BasePartial;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractPartialFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.ISODateTimeFormat;

public final class MonthDay extends BasePartial implements ReadablePartial, Serializable {
    public static final int DAY_OF_MONTH = 1;
    private static final DateTimeFieldType[] FIELD_TYPES = {DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()};
    public static final int MONTH_OF_YEAR = 0;
    private static final DateTimeFormatter PARSER = new DateTimeFormatterBuilder().appendOptional(ISODateTimeFormat.localDateParser().getParser()).appendOptional(DateTimeFormat.forPattern("--MM-dd").getParser()).toFormatter();
    private static final long serialVersionUID = 2954560699050434609L;

    public static class Property extends AbstractPartialFieldProperty implements Serializable {
        private static final long serialVersionUID = 5727734012190224363L;
        private final MonthDay iBase;
        private final int iFieldIndex;

        Property(MonthDay monthDay, int i) {
            this.iBase = monthDay;
            this.iFieldIndex = i;
        }

        public MonthDay addToCopy(int i) {
            return new MonthDay(this.iBase, getField().add(this.iBase, this.iFieldIndex, this.iBase.getValues(), i));
        }

        public MonthDay addWrapFieldToCopy(int i) {
            return new MonthDay(this.iBase, getField().addWrapField(this.iBase, this.iFieldIndex, this.iBase.getValues(), i));
        }

        public int get() {
            return this.iBase.getValue(this.iFieldIndex);
        }

        public DateTimeField getField() {
            return this.iBase.getField(this.iFieldIndex);
        }

        public MonthDay getMonthDay() {
            return this.iBase;
        }

        /* access modifiers changed from: protected */
        public ReadablePartial getReadablePartial() {
            return this.iBase;
        }

        public MonthDay setCopy(int i) {
            return new MonthDay(this.iBase, getField().set(this.iBase, this.iFieldIndex, this.iBase.getValues(), i));
        }

        public MonthDay setCopy(String str, Locale locale) {
            return new MonthDay(this.iBase, getField().set(this.iBase, this.iFieldIndex, this.iBase.getValues(), str, locale));
        }

        public MonthDay setCopy(String str) {
            return setCopy(str, null);
        }
    }

    public MonthDay() {
    }

    public static MonthDay fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            return new MonthDay(calendar.get(2) + 1, calendar.get(5));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    public static MonthDay fromDateFields(Date date) {
        if (date != null) {
            return new MonthDay(date.getMonth() + 1, date.getDate());
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static MonthDay now() {
        return new MonthDay();
    }

    public static MonthDay parse(String str) {
        return parse(str, PARSER);
    }

    private Object readResolve() {
        return !DateTimeZone.UTC.equals(getChronology().getZone()) ? new MonthDay(this, getChronology().withUTC()) : this;
    }

    public Property dayOfMonth() {
        return new Property(this, 1);
    }

    public int getDayOfMonth() {
        return getValue(1);
    }

    /* access modifiers changed from: protected */
    public DateTimeField getField(int i, Chronology chronology) {
        if (i == 0) {
            return chronology.monthOfYear();
        }
        if (i == 1) {
            return chronology.dayOfMonth();
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
        return getValue(0);
    }

    public MonthDay minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public MonthDay minusDays(int i) {
        return withFieldAdded(DurationFieldType.days(), FieldUtils.safeNegate(i));
    }

    public MonthDay minusMonths(int i) {
        return withFieldAdded(DurationFieldType.months(), FieldUtils.safeNegate(i));
    }

    public Property monthOfYear() {
        return new Property(this, 0);
    }

    public MonthDay plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public MonthDay plusDays(int i) {
        return withFieldAdded(DurationFieldType.days(), i);
    }

    public MonthDay plusMonths(int i) {
        return withFieldAdded(DurationFieldType.months(), i);
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, indexOfSupported(dateTimeFieldType));
    }

    public int size() {
        return 2;
    }

    public LocalDate toLocalDate(int i) {
        return new LocalDate(i, getMonthOfYear(), getDayOfMonth(), getChronology());
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DateTimeFieldType.monthOfYear());
        arrayList.add(DateTimeFieldType.dayOfMonth());
        return ISODateTimeFormat.forFields(arrayList, true, true).print((ReadablePartial) this);
    }

    public MonthDay withChronologyRetainFields(Chronology chronology) {
        Chronology withUTC = DateTimeUtils.getChronology(chronology).withUTC();
        if (withUTC == getChronology()) {
            return this;
        }
        MonthDay monthDay = new MonthDay(this, withUTC);
        withUTC.validate(monthDay, getValues());
        return monthDay;
    }

    public MonthDay withDayOfMonth(int i) {
        return new MonthDay(this, getChronology().dayOfMonth().set(this, 1, getValues(), i));
    }

    public MonthDay withField(DateTimeFieldType dateTimeFieldType, int i) {
        int indexOfSupported = indexOfSupported(dateTimeFieldType);
        if (i == getValue(indexOfSupported)) {
            return this;
        }
        return new MonthDay(this, getField(indexOfSupported).set(this, indexOfSupported, getValues(), i));
    }

    public MonthDay withFieldAdded(DurationFieldType durationFieldType, int i) {
        int indexOfSupported = indexOfSupported(durationFieldType);
        if (i == 0) {
            return this;
        }
        return new MonthDay(this, getField(indexOfSupported).add(this, indexOfSupported, getValues(), i));
    }

    public MonthDay withMonthOfYear(int i) {
        return new MonthDay(this, getChronology().monthOfYear().set(this, 0, getValues(), i));
    }

    public MonthDay withPeriodAdded(ReadablePeriod readablePeriod, int i) {
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
        return new MonthDay(this, values);
    }

    public MonthDay(DateTimeZone dateTimeZone) {
        super((Chronology) ISOChronology.getInstance(dateTimeZone));
    }

    public static MonthDay now(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new MonthDay(dateTimeZone);
        }
        throw new NullPointerException("Zone must not be null");
    }

    public static MonthDay parse(String str, DateTimeFormatter dateTimeFormatter) {
        LocalDate parseLocalDate = dateTimeFormatter.parseLocalDate(str);
        return new MonthDay(parseLocalDate.getMonthOfYear(), parseLocalDate.getDayOfMonth());
    }

    public MonthDay(Chronology chronology) {
        super(chronology);
    }

    public MonthDay(long j) {
        super(j);
    }

    public static MonthDay now(Chronology chronology) {
        if (chronology != null) {
            return new MonthDay(chronology);
        }
        throw new NullPointerException("Chronology must not be null");
    }

    public MonthDay(long j, Chronology chronology) {
        super(j, chronology);
    }

    public String toString(String str) {
        if (str == null) {
            return toString();
        }
        return DateTimeFormat.forPattern(str).print((ReadablePartial) this);
    }

    public MonthDay(Object obj) {
        super(obj, null, ISODateTimeFormat.localDateParser());
    }

    public MonthDay(Object obj, Chronology chronology) {
        super(obj, DateTimeUtils.getChronology(chronology), ISODateTimeFormat.localDateParser());
    }

    public String toString(String str, Locale locale) throws IllegalArgumentException {
        if (str == null) {
            return toString();
        }
        return DateTimeFormat.forPattern(str).withLocale(locale).print((ReadablePartial) this);
    }

    public MonthDay(int i, int i2) {
        this(i, i2, null);
    }

    public MonthDay(int i, int i2, Chronology chronology) {
        super(new int[]{i, i2}, chronology);
    }

    MonthDay(MonthDay monthDay, int[] iArr) {
        super((BasePartial) monthDay, iArr);
    }

    MonthDay(MonthDay monthDay, Chronology chronology) {
        super((BasePartial) monthDay, chronology);
    }
}
