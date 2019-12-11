package org.joda.time.field;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;

public final class ZeroIsMaxDateTimeField extends DecoratedDateTimeField {
    private static final long serialVersionUID = 961749798233026866L;

    public ZeroIsMaxDateTimeField(DateTimeField dateTimeField, DateTimeFieldType dateTimeFieldType) {
        super(dateTimeField, dateTimeFieldType);
        if (dateTimeField.getMinimumValue() != 0) {
            throw new IllegalArgumentException("Wrapped field's minumum value must be zero");
        }
    }

    public long add(long j, int i) {
        return getWrappedField().add(j, i);
    }

    public long addWrapField(long j, int i) {
        return getWrappedField().addWrapField(j, i);
    }

    public int get(long j) {
        int i = getWrappedField().get(j);
        return i == 0 ? getMaximumValue() : i;
    }

    public int getDifference(long j, long j2) {
        return getWrappedField().getDifference(j, j2);
    }

    public long getDifferenceAsLong(long j, long j2) {
        return getWrappedField().getDifferenceAsLong(j, j2);
    }

    public int getLeapAmount(long j) {
        return getWrappedField().getLeapAmount(j);
    }

    public DurationField getLeapDurationField() {
        return getWrappedField().getLeapDurationField();
    }

    public int getMaximumValue() {
        return getWrappedField().getMaximumValue() + 1;
    }

    public int getMinimumValue() {
        return 1;
    }

    public int getMinimumValue(long j) {
        return 1;
    }

    public int getMinimumValue(ReadablePartial readablePartial) {
        return 1;
    }

    public int getMinimumValue(ReadablePartial readablePartial, int[] iArr) {
        return 1;
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
        int maximumValue = getMaximumValue();
        FieldUtils.verifyValueBounds((DateTimeField) this, i, 1, maximumValue);
        if (i == maximumValue) {
            i = 0;
        }
        return getWrappedField().set(j, i);
    }

    public long add(long j, long j2) {
        return getWrappedField().add(j, j2);
    }

    public int[] addWrapField(ReadablePartial readablePartial, int i, int[] iArr, int i2) {
        return getWrappedField().addWrapField(readablePartial, i, iArr, i2);
    }

    public int getMaximumValue(long j) {
        return getWrappedField().getMaximumValue(j) + 1;
    }

    public int getMaximumValue(ReadablePartial readablePartial) {
        return getWrappedField().getMaximumValue(readablePartial) + 1;
    }

    public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
        return getWrappedField().getMaximumValue(readablePartial, iArr) + 1;
    }
}
