package org.joda.time.chrono;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.PreciseDurationDateTimeField;

final class BasicDayOfMonthDateTimeField extends PreciseDurationDateTimeField {
    private static final long serialVersionUID = -4677223814028011723L;
    private final BasicChronology iChronology;

    BasicDayOfMonthDateTimeField(BasicChronology basicChronology, DurationField durationField) {
        super(DateTimeFieldType.dayOfMonth(), durationField);
        this.iChronology = basicChronology;
    }

    private Object readResolve() {
        return this.iChronology.dayOfMonth();
    }

    public int get(long j) {
        return this.iChronology.getDayOfMonth(j);
    }

    public int getMaximumValue() {
        return this.iChronology.getDaysInMonthMax();
    }

    /* access modifiers changed from: protected */
    public int getMaximumValueForSet(long j, int i) {
        return this.iChronology.getDaysInMonthMaxForSet(j, i);
    }

    public int getMinimumValue() {
        return 1;
    }

    public DurationField getRangeDurationField() {
        return this.iChronology.months();
    }

    public boolean isLeap(long j) {
        return this.iChronology.isLeapDay(j);
    }

    public int getMaximumValue(long j) {
        return this.iChronology.getDaysInMonthMax(j);
    }

    public int getMaximumValue(ReadablePartial readablePartial) {
        if (!readablePartial.isSupported(DateTimeFieldType.monthOfYear())) {
            return getMaximumValue();
        }
        int i = readablePartial.get(DateTimeFieldType.monthOfYear());
        if (!readablePartial.isSupported(DateTimeFieldType.year())) {
            return this.iChronology.getDaysInMonthMax(i);
        }
        return this.iChronology.getDaysInYearMonth(readablePartial.get(DateTimeFieldType.year()), i);
    }

    public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
        int size = readablePartial.size();
        for (int i = 0; i < size; i++) {
            if (readablePartial.getFieldType(i) == DateTimeFieldType.monthOfYear()) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < size; i3++) {
                    if (readablePartial.getFieldType(i3) == DateTimeFieldType.year()) {
                        return this.iChronology.getDaysInYearMonth(iArr[i3], i2);
                    }
                }
                return this.iChronology.getDaysInMonthMax(i2);
            }
        }
        return getMaximumValue();
    }
}
