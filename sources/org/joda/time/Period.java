package org.joda.time;

import java.io.Serializable;
import org.joda.time.base.BasePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

public final class Period extends BasePeriod implements ReadablePeriod, Serializable {
    public static final Period ZERO = new Period();
    private static final long serialVersionUID = 741052353876488155L;

    public Period() {
        super(0, (PeriodType) null, (Chronology) null);
    }

    private void checkYearsAndMonths(String str) {
        String str2 = "Cannot convert to ";
        if (getMonths() != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            sb.append(" as this period contains months and months vary in length");
            throw new UnsupportedOperationException(sb.toString());
        } else if (getYears() != 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str);
            sb2.append(" as this period contains years and years vary in length");
            throw new UnsupportedOperationException(sb2.toString());
        }
    }

    public static Period days(int i) {
        return new Period(new int[]{0, 0, 0, i, 0, 0, 0, 0}, PeriodType.standard());
    }

    public static Period fieldDifference(ReadablePartial readablePartial, ReadablePartial readablePartial2) {
        if (readablePartial == null || readablePartial2 == null) {
            throw new IllegalArgumentException("ReadablePartial objects must not be null");
        }
        String str = "ReadablePartial objects must have the same set of fields";
        if (readablePartial.size() == readablePartial2.size()) {
            DurationFieldType[] durationFieldTypeArr = new DurationFieldType[readablePartial.size()];
            int[] iArr = new int[readablePartial.size()];
            int i = 0;
            int size = readablePartial.size();
            while (i < size) {
                if (readablePartial.getFieldType(i) == readablePartial2.getFieldType(i)) {
                    durationFieldTypeArr[i] = readablePartial.getFieldType(i).getDurationType();
                    if (i <= 0 || durationFieldTypeArr[i - 1] != durationFieldTypeArr[i]) {
                        iArr[i] = readablePartial2.getValue(i) - readablePartial.getValue(i);
                        i++;
                    } else {
                        throw new IllegalArgumentException("ReadablePartial objects must not have overlapping fields");
                    }
                } else {
                    throw new IllegalArgumentException(str);
                }
            }
            return new Period(iArr, PeriodType.forFields(durationFieldTypeArr));
        }
        throw new IllegalArgumentException(str);
    }

    public static Period hours(int i) {
        return new Period(new int[]{0, 0, 0, 0, i, 0, 0, 0}, PeriodType.standard());
    }

    public static Period millis(int i) {
        return new Period(new int[]{0, 0, 0, 0, 0, 0, 0, i}, PeriodType.standard());
    }

    public static Period minutes(int i) {
        return new Period(new int[]{0, 0, 0, 0, 0, i, 0, 0}, PeriodType.standard());
    }

    public static Period months(int i) {
        return new Period(new int[]{0, i, 0, 0, 0, 0, 0, 0}, PeriodType.standard());
    }

    public static Period parse(String str) {
        return parse(str, ISOPeriodFormat.standard());
    }

    public static Period seconds(int i) {
        return new Period(new int[]{0, 0, 0, 0, 0, 0, i, 0}, PeriodType.standard());
    }

    public static Period weeks(int i) {
        return new Period(new int[]{0, 0, i, 0, 0, 0, 0, 0}, PeriodType.standard());
    }

    public static Period years(int i) {
        return new Period(new int[]{i, 0, 0, 0, 0, 0, 0, 0}, PeriodType.standard());
    }

    public int getDays() {
        return getPeriodType().getIndexedField(this, PeriodType.DAY_INDEX);
    }

    public int getHours() {
        return getPeriodType().getIndexedField(this, PeriodType.HOUR_INDEX);
    }

    public int getMillis() {
        return getPeriodType().getIndexedField(this, PeriodType.MILLI_INDEX);
    }

    public int getMinutes() {
        return getPeriodType().getIndexedField(this, PeriodType.MINUTE_INDEX);
    }

    public int getMonths() {
        return getPeriodType().getIndexedField(this, PeriodType.MONTH_INDEX);
    }

    public int getSeconds() {
        return getPeriodType().getIndexedField(this, PeriodType.SECOND_INDEX);
    }

    public int getWeeks() {
        return getPeriodType().getIndexedField(this, PeriodType.WEEK_INDEX);
    }

    public int getYears() {
        return getPeriodType().getIndexedField(this, PeriodType.YEAR_INDEX);
    }

    public Period minus(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, values, -readablePeriod.get(DurationFieldType.YEARS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, values, -readablePeriod.get(DurationFieldType.MONTHS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, values, -readablePeriod.get(DurationFieldType.WEEKS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, values, -readablePeriod.get(DurationFieldType.DAYS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, values, -readablePeriod.get(DurationFieldType.HOURS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, values, -readablePeriod.get(DurationFieldType.MINUTES_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, values, -readablePeriod.get(DurationFieldType.SECONDS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, values, -readablePeriod.get(DurationFieldType.MILLIS_TYPE));
        return new Period(values, getPeriodType());
    }

    public Period minusDays(int i) {
        return plusDays(-i);
    }

    public Period minusHours(int i) {
        return plusHours(-i);
    }

    public Period minusMillis(int i) {
        return plusMillis(-i);
    }

    public Period minusMinutes(int i) {
        return plusMinutes(-i);
    }

    public Period minusMonths(int i) {
        return plusMonths(-i);
    }

    public Period minusSeconds(int i) {
        return plusSeconds(-i);
    }

    public Period minusWeeks(int i) {
        return plusWeeks(-i);
    }

    public Period minusYears(int i) {
        return plusYears(-i);
    }

    public Period multipliedBy(int i) {
        if (this == ZERO || i == 1) {
            return this;
        }
        int[] values = getValues();
        for (int i2 = 0; i2 < values.length; i2++) {
            values[i2] = FieldUtils.safeMultiply(values[i2], i);
        }
        return new Period(values, getPeriodType());
    }

    public Period negated() {
        return multipliedBy(-1);
    }

    public Period normalizedStandard() {
        return normalizedStandard(PeriodType.standard());
    }

    public Period plus(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, values, readablePeriod.get(DurationFieldType.YEARS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, values, readablePeriod.get(DurationFieldType.MONTHS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, values, readablePeriod.get(DurationFieldType.WEEKS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, values, readablePeriod.get(DurationFieldType.DAYS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, values, readablePeriod.get(DurationFieldType.HOURS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, values, readablePeriod.get(DurationFieldType.MINUTES_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, values, readablePeriod.get(DurationFieldType.SECONDS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, values, readablePeriod.get(DurationFieldType.MILLIS_TYPE));
        return new Period(values, getPeriodType());
    }

    public Period plusDays(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period plusHours(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period plusMillis(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period plusMinutes(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period plusMonths(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period plusSeconds(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period plusWeeks(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period plusYears(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period toPeriod() {
        return this;
    }

    public Days toStandardDays() {
        checkYearsAndMonths("Days");
        return Days.days(FieldUtils.safeToInt(FieldUtils.safeAdd(FieldUtils.safeAdd((((((long) getMillis()) + (((long) getSeconds()) * 1000)) + (((long) getMinutes()) * 60000)) + (((long) getHours()) * 3600000)) / 86400000, (long) getDays()), ((long) getWeeks()) * 7)));
    }

    public Duration toStandardDuration() {
        checkYearsAndMonths("Duration");
        return new Duration(((long) getMillis()) + (((long) getSeconds()) * 1000) + (((long) getMinutes()) * 60000) + (((long) getHours()) * 3600000) + (((long) getDays()) * 86400000) + (((long) getWeeks()) * 604800000));
    }

    public Hours toStandardHours() {
        checkYearsAndMonths("Hours");
        return Hours.hours(FieldUtils.safeToInt(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(((((long) getMillis()) + (((long) getSeconds()) * 1000)) + (((long) getMinutes()) * 60000)) / 3600000, (long) getHours()), ((long) getDays()) * 24), ((long) getWeeks()) * 168)));
    }

    public Minutes toStandardMinutes() {
        checkYearsAndMonths("Minutes");
        return Minutes.minutes(FieldUtils.safeToInt(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd((((long) getMillis()) + (((long) getSeconds()) * 1000)) / 60000, (long) getMinutes()), ((long) getHours()) * 60), ((long) getDays()) * 1440), ((long) getWeeks()) * 10080)));
    }

    public Seconds toStandardSeconds() {
        checkYearsAndMonths("Seconds");
        return Seconds.seconds(FieldUtils.safeToInt(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd((long) (getMillis() / 1000), (long) getSeconds()), ((long) getMinutes()) * 60), ((long) getHours()) * 3600), ((long) getDays()) * 86400), ((long) getWeeks()) * 604800)));
    }

    public Weeks toStandardWeeks() {
        checkYearsAndMonths("Weeks");
        return Weeks.weeks(FieldUtils.safeToInt(((long) getWeeks()) + (((((((long) getMillis()) + (((long) getSeconds()) * 1000)) + (((long) getMinutes()) * 60000)) + (((long) getHours()) * 3600000)) + (((long) getDays()) * 86400000)) / 604800000)));
    }

    public Period withDays(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.DAY_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period withField(DurationFieldType durationFieldType, int i) {
        if (durationFieldType != null) {
            int[] values = getValues();
            super.setFieldInto(values, durationFieldType, i);
            return new Period(values, getPeriodType());
        }
        throw new IllegalArgumentException("Field must not be null");
    }

    public Period withFieldAdded(DurationFieldType durationFieldType, int i) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        } else if (i == 0) {
            return this;
        } else {
            int[] values = getValues();
            super.addFieldInto(values, durationFieldType, i);
            return new Period(values, getPeriodType());
        }
    }

    public Period withFields(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            return this;
        }
        return new Period(super.mergePeriodInto(getValues(), readablePeriod), getPeriodType());
    }

    public Period withHours(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.HOUR_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period withMillis(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.MILLI_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period withMinutes(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.MINUTE_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period withMonths(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.MONTH_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period withPeriodType(PeriodType periodType) {
        PeriodType periodType2 = DateTimeUtils.getPeriodType(periodType);
        if (periodType2.equals(getPeriodType())) {
            return this;
        }
        return new Period((Object) this, periodType2);
    }

    public Period withSeconds(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.SECOND_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period withWeeks(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.WEEK_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period withYears(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.YEAR_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public Period(int i, int i2, int i3, int i4) {
        super(0, 0, 0, 0, i, i2, i3, i4, PeriodType.standard());
    }

    public static Period parse(String str, PeriodFormatter periodFormatter) {
        return periodFormatter.parsePeriod(str);
    }

    public Period normalizedStandard(PeriodType periodType) {
        PeriodType periodType2 = DateTimeUtils.getPeriodType(periodType);
        Period period = new Period(((long) getMillis()) + (((long) getSeconds()) * 1000) + (((long) getMinutes()) * 60000) + (((long) getHours()) * 3600000) + (((long) getDays()) * 86400000) + (((long) getWeeks()) * 604800000), periodType2, (Chronology) ISOChronology.getInstanceUTC());
        int years = getYears();
        int months = getMonths();
        if (!(years == 0 && months == 0)) {
            long j = (((long) years) * 12) + ((long) months);
            if (periodType2.isSupported(DurationFieldType.YEARS_TYPE)) {
                int safeToInt = FieldUtils.safeToInt(j / 12);
                period = period.withYears(safeToInt);
                j -= (long) (safeToInt * 12);
            }
            if (periodType2.isSupported(DurationFieldType.MONTHS_TYPE)) {
                int safeToInt2 = FieldUtils.safeToInt(j);
                j -= (long) safeToInt2;
                period = period.withMonths(safeToInt2);
            }
            if (j != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to normalize as PeriodType is missing either years or months but period has a month/year amount: ");
                sb.append(toString());
                throw new UnsupportedOperationException(sb.toString());
            }
        }
        return period;
    }

    public Period(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        super(i, i2, i3, i4, i5, i6, i7, i8, PeriodType.standard());
    }

    public Period(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PeriodType periodType) {
        super(i, i2, i3, i4, i5, i6, i7, i8, periodType);
    }

    public Period(long j) {
        super(j);
    }

    public Period(long j, PeriodType periodType) {
        super(j, periodType, (Chronology) null);
    }

    public Period(long j, Chronology chronology) {
        super(j, (PeriodType) null, chronology);
    }

    public Period(long j, PeriodType periodType, Chronology chronology) {
        super(j, periodType, chronology);
    }

    public Period(long j, long j2) {
        super(j, j2, null, null);
    }

    public Period(long j, long j2, PeriodType periodType) {
        super(j, j2, periodType, null);
    }

    public Period(long j, long j2, Chronology chronology) {
        super(j, j2, null, chronology);
    }

    public Period(long j, long j2, PeriodType periodType, Chronology chronology) {
        super(j, j2, periodType, chronology);
    }

    public Period(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        super(readableInstant, readableInstant2, (PeriodType) null);
    }

    public Period(ReadableInstant readableInstant, ReadableInstant readableInstant2, PeriodType periodType) {
        super(readableInstant, readableInstant2, periodType);
    }

    public Period(ReadablePartial readablePartial, ReadablePartial readablePartial2) {
        super(readablePartial, readablePartial2, (PeriodType) null);
    }

    public Period(ReadablePartial readablePartial, ReadablePartial readablePartial2, PeriodType periodType) {
        super(readablePartial, readablePartial2, periodType);
    }

    public Period(ReadableInstant readableInstant, ReadableDuration readableDuration) {
        super(readableInstant, readableDuration, (PeriodType) null);
    }

    public Period(ReadableInstant readableInstant, ReadableDuration readableDuration, PeriodType periodType) {
        super(readableInstant, readableDuration, periodType);
    }

    public Period(ReadableDuration readableDuration, ReadableInstant readableInstant) {
        super(readableDuration, readableInstant, (PeriodType) null);
    }

    public Period(ReadableDuration readableDuration, ReadableInstant readableInstant, PeriodType periodType) {
        super(readableDuration, readableInstant, periodType);
    }

    public Period(Object obj) {
        super(obj, (PeriodType) null, (Chronology) null);
    }

    public Period(Object obj, PeriodType periodType) {
        super(obj, periodType, (Chronology) null);
    }

    public Period(Object obj, Chronology chronology) {
        super(obj, (PeriodType) null, chronology);
    }

    public Period(Object obj, PeriodType periodType, Chronology chronology) {
        super(obj, periodType, chronology);
    }

    private Period(int[] iArr, PeriodType periodType) {
        super(iArr, periodType);
    }
}
