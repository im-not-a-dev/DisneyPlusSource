package org.joda.time.field;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;

public class OffsetDateTimeField extends DecoratedDateTimeField {
    private static final long serialVersionUID = 3145790132623583142L;
    private final int iMax;
    private final int iMin;
    private final int iOffset;

    public OffsetDateTimeField(DateTimeField dateTimeField, int i) {
        this(dateTimeField, dateTimeField == null ? null : dateTimeField.getType(), i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public long add(long j, int i) {
        long add = super.add(j, i);
        FieldUtils.verifyValueBounds((DateTimeField) this, get(add), this.iMin, this.iMax);
        return add;
    }

    public long addWrapField(long j, int i) {
        return set(j, FieldUtils.getWrappedValue(get(j), i, this.iMin, this.iMax));
    }

    public int get(long j) {
        return super.get(j) + this.iOffset;
    }

    public int getLeapAmount(long j) {
        return getWrappedField().getLeapAmount(j);
    }

    public DurationField getLeapDurationField() {
        return getWrappedField().getLeapDurationField();
    }

    public int getMaximumValue() {
        return this.iMax;
    }

    public int getMinimumValue() {
        return this.iMin;
    }

    public int getOffset() {
        return this.iOffset;
    }

    public boolean isLeap(long j) {
        return getWrappedField().isLeap(j);
    }

    public long remainder(long j) {
        return getWrappedField().remainder(j);
    }

    public long roundCeiling(long j) {
        return getWrappedField().roundCeiling(j);
    }

    public long roundFloor(long j) {
        return getWrappedField().roundFloor(j);
    }

    public long roundHalfCeiling(long j) {
        return getWrappedField().roundHalfCeiling(j);
    }

    public long roundHalfEven(long j) {
        return getWrappedField().roundHalfEven(j);
    }

    public long roundHalfFloor(long j) {
        return getWrappedField().roundHalfFloor(j);
    }

    public long set(long j, int i) {
        FieldUtils.verifyValueBounds((DateTimeField) this, i, this.iMin, this.iMax);
        return super.set(j, i - this.iOffset);
    }

    public OffsetDateTimeField(DateTimeField dateTimeField, DateTimeFieldType dateTimeFieldType, int i) {
        this(dateTimeField, dateTimeFieldType, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public OffsetDateTimeField(DateTimeField dateTimeField, DateTimeFieldType dateTimeFieldType, int i, int i2, int i3) {
        super(dateTimeField, dateTimeFieldType);
        if (i != 0) {
            this.iOffset = i;
            if (i2 < dateTimeField.getMinimumValue() + i) {
                this.iMin = dateTimeField.getMinimumValue() + i;
            } else {
                this.iMin = i2;
            }
            if (i3 > dateTimeField.getMaximumValue() + i) {
                this.iMax = dateTimeField.getMaximumValue() + i;
            } else {
                this.iMax = i3;
            }
        } else {
            throw new IllegalArgumentException("The offset cannot be zero");
        }
    }

    public long add(long j, long j2) {
        long add = super.add(j, j2);
        FieldUtils.verifyValueBounds((DateTimeField) this, get(add), this.iMin, this.iMax);
        return add;
    }
}
