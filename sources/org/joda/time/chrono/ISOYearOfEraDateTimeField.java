package org.joda.time.chrono;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.DecoratedDateTimeField;
import org.joda.time.field.FieldUtils;

class ISOYearOfEraDateTimeField extends DecoratedDateTimeField {
    static final DateTimeField INSTANCE = new ISOYearOfEraDateTimeField();
    private static final long serialVersionUID = 7037524068969447317L;

    private ISOYearOfEraDateTimeField() {
        super(GregorianChronology.getInstanceUTC().year(), DateTimeFieldType.yearOfEra());
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public long add(long j, int i) {
        return getWrappedField().add(j, i);
    }

    public long addWrapField(long j, int i) {
        return getWrappedField().addWrapField(j, i);
    }

    public int get(long j) {
        int i = getWrappedField().get(j);
        return i < 0 ? -i : i;
    }

    public int getDifference(long j, long j2) {
        return getWrappedField().getDifference(j, j2);
    }

    public long getDifferenceAsLong(long j, long j2) {
        return getWrappedField().getDifferenceAsLong(j, j2);
    }

    public int getMaximumValue() {
        return getWrappedField().getMaximumValue();
    }

    public int getMinimumValue() {
        return 0;
    }

    public DurationField getRangeDurationField() {
        return GregorianChronology.getInstanceUTC().eras();
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

    public long set(long j, int i) {
        FieldUtils.verifyValueBounds((DateTimeField) this, i, 0, getMaximumValue());
        if (getWrappedField().get(j) < 0) {
            i = -i;
        }
        return super.set(j, i);
    }

    public long add(long j, long j2) {
        return getWrappedField().add(j, j2);
    }

    public int[] addWrapField(ReadablePartial readablePartial, int i, int[] iArr, int i2) {
        return getWrappedField().addWrapField(readablePartial, i, iArr, i2);
    }
}
