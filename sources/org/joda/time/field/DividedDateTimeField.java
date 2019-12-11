package org.joda.time.field;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;

public class DividedDateTimeField extends DecoratedDateTimeField {
    private static final long serialVersionUID = 8318475124230605365L;
    final int iDivisor;
    final DurationField iDurationField;
    private final int iMax;
    private final int iMin;
    final DurationField iRangeDurationField;

    public DividedDateTimeField(DateTimeField dateTimeField, DateTimeFieldType dateTimeFieldType, int i) {
        this(dateTimeField, dateTimeField.getRangeDurationField(), dateTimeFieldType, i);
    }

    private int getRemainder(int i) {
        if (i >= 0) {
            return i % this.iDivisor;
        }
        int i2 = this.iDivisor;
        return (i2 - 1) + ((i + 1) % i2);
    }

    public long add(long j, int i) {
        return getWrappedField().add(j, i * this.iDivisor);
    }

    public long addWrapField(long j, int i) {
        return set(j, FieldUtils.getWrappedValue(get(j), i, this.iMin, this.iMax));
    }

    public int get(long j) {
        int i = getWrappedField().get(j);
        if (i >= 0) {
            return i / this.iDivisor;
        }
        return ((i + 1) / this.iDivisor) - 1;
    }

    public int getDifference(long j, long j2) {
        return getWrappedField().getDifference(j, j2) / this.iDivisor;
    }

    public long getDifferenceAsLong(long j, long j2) {
        return getWrappedField().getDifferenceAsLong(j, j2) / ((long) this.iDivisor);
    }

    public int getDivisor() {
        return this.iDivisor;
    }

    public DurationField getDurationField() {
        return this.iDurationField;
    }

    public int getMaximumValue() {
        return this.iMax;
    }

    public int getMinimumValue() {
        return this.iMin;
    }

    public DurationField getRangeDurationField() {
        DurationField durationField = this.iRangeDurationField;
        if (durationField != null) {
            return durationField;
        }
        return super.getRangeDurationField();
    }

    public long remainder(long j) {
        return set(j, get(getWrappedField().remainder(j)));
    }

    public long roundFloor(long j) {
        DateTimeField wrappedField = getWrappedField();
        return wrappedField.roundFloor(wrappedField.set(j, get(j) * this.iDivisor));
    }

    public long set(long j, int i) {
        FieldUtils.verifyValueBounds((DateTimeField) this, i, this.iMin, this.iMax);
        return getWrappedField().set(j, (i * this.iDivisor) + getRemainder(getWrappedField().get(j)));
    }

    public DividedDateTimeField(DateTimeField dateTimeField, DurationField durationField, DateTimeFieldType dateTimeFieldType, int i) {
        super(dateTimeField, dateTimeFieldType);
        if (i >= 2) {
            DurationField durationField2 = dateTimeField.getDurationField();
            if (durationField2 == null) {
                this.iDurationField = null;
            } else {
                this.iDurationField = new ScaledDurationField(durationField2, dateTimeFieldType.getDurationType(), i);
            }
            this.iRangeDurationField = durationField;
            this.iDivisor = i;
            int minimumValue = dateTimeField.getMinimumValue();
            int i2 = minimumValue >= 0 ? minimumValue / i : ((minimumValue + 1) / i) - 1;
            int maximumValue = dateTimeField.getMaximumValue();
            int i3 = maximumValue >= 0 ? maximumValue / i : ((maximumValue + 1) / i) - 1;
            this.iMin = i2;
            this.iMax = i3;
            return;
        }
        throw new IllegalArgumentException("The divisor must be at least 2");
    }

    public long add(long j, long j2) {
        return getWrappedField().add(j, j2 * ((long) this.iDivisor));
    }

    public DividedDateTimeField(RemainderDateTimeField remainderDateTimeField, DateTimeFieldType dateTimeFieldType) {
        this(remainderDateTimeField, (DurationField) null, dateTimeFieldType);
    }

    public DividedDateTimeField(RemainderDateTimeField remainderDateTimeField, DurationField durationField, DateTimeFieldType dateTimeFieldType) {
        super(remainderDateTimeField.getWrappedField(), dateTimeFieldType);
        int i = remainderDateTimeField.iDivisor;
        this.iDivisor = i;
        this.iDurationField = remainderDateTimeField.iRangeField;
        this.iRangeDurationField = durationField;
        DateTimeField wrappedField = getWrappedField();
        int minimumValue = wrappedField.getMinimumValue();
        int i2 = minimumValue >= 0 ? minimumValue / i : ((minimumValue + 1) / i) - 1;
        int maximumValue = wrappedField.getMaximumValue();
        int i3 = maximumValue >= 0 ? maximumValue / i : ((maximumValue + 1) / i) - 1;
        this.iMin = i2;
        this.iMax = i3;
    }
}
