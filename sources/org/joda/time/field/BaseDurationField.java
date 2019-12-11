package org.joda.time.field;

import java.io.Serializable;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

public abstract class BaseDurationField extends DurationField implements Serializable {
    private static final long serialVersionUID = -2554245107589433218L;
    private final DurationFieldType iType;

    protected BaseDurationField(DurationFieldType durationFieldType) {
        if (durationFieldType != null) {
            this.iType = durationFieldType;
            return;
        }
        throw new IllegalArgumentException("The type must not be null");
    }

    public int getDifference(long j, long j2) {
        return FieldUtils.safeToInt(getDifferenceAsLong(j, j2));
    }

    public long getMillis(int i) {
        return ((long) i) * getUnitMillis();
    }

    public final String getName() {
        return this.iType.getName();
    }

    public final DurationFieldType getType() {
        return this.iType;
    }

    public int getValue(long j) {
        return FieldUtils.safeToInt(getValueAsLong(j));
    }

    public long getValueAsLong(long j) {
        return j / getUnitMillis();
    }

    public final boolean isSupported() {
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DurationField[");
        sb.append(getName());
        sb.append(']');
        return sb.toString();
    }

    public int compareTo(DurationField durationField) {
        int i = (getUnitMillis() > durationField.getUnitMillis() ? 1 : (getUnitMillis() == durationField.getUnitMillis() ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        return i < 0 ? -1 : 1;
    }

    public long getMillis(long j) {
        return FieldUtils.safeMultiply(j, getUnitMillis());
    }

    public int getValue(long j, long j2) {
        return FieldUtils.safeToInt(getValueAsLong(j, j2));
    }
}
