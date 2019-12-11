package org.joda.time.field;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;

public class PreciseDateTimeField extends PreciseDurationDateTimeField {
    private static final long serialVersionUID = -5586801265774496376L;
    private final int iRange;
    private final DurationField iRangeField;

    public PreciseDateTimeField(DateTimeFieldType dateTimeFieldType, DurationField durationField, DurationField durationField2) {
        super(dateTimeFieldType, durationField);
        if (durationField2.isPrecise()) {
            this.iRange = (int) (durationField2.getUnitMillis() / getUnitMillis());
            if (this.iRange >= 2) {
                this.iRangeField = durationField2;
                return;
            }
            throw new IllegalArgumentException("The effective range must be at least 2");
        }
        throw new IllegalArgumentException("Range duration field must be precise");
    }

    public long addWrapField(long j, int i) {
        int i2 = get(j);
        return j + (((long) (FieldUtils.getWrappedValue(i2, i, getMinimumValue(), getMaximumValue()) - i2)) * getUnitMillis());
    }

    public int get(long j) {
        if (j >= 0) {
            return (int) ((j / getUnitMillis()) % ((long) this.iRange));
        }
        return (this.iRange - 1) + ((int) (((j + 1) / getUnitMillis()) % ((long) this.iRange)));
    }

    public int getMaximumValue() {
        return this.iRange - 1;
    }

    public int getRange() {
        return this.iRange;
    }

    public DurationField getRangeDurationField() {
        return this.iRangeField;
    }

    public long set(long j, int i) {
        FieldUtils.verifyValueBounds((DateTimeField) this, i, getMinimumValue(), getMaximumValue());
        return j + (((long) (i - get(j))) * this.iUnitMillis);
    }
}
