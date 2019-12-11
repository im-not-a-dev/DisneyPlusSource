package org.joda.time.field;

import java.io.Serializable;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

public final class MillisDurationField extends DurationField implements Serializable {
    public static final DurationField INSTANCE = new MillisDurationField();
    private static final long serialVersionUID = 2656707858124633367L;

    private MillisDurationField() {
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public long add(long j, int i) {
        return FieldUtils.safeAdd(j, (long) i);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MillisDurationField) || getUnitMillis() != ((MillisDurationField) obj).getUnitMillis()) {
            return false;
        }
        return true;
    }

    public int getDifference(long j, long j2) {
        return FieldUtils.safeToInt(FieldUtils.safeSubtract(j, j2));
    }

    public long getDifferenceAsLong(long j, long j2) {
        return FieldUtils.safeSubtract(j, j2);
    }

    public long getMillis(int i) {
        return (long) i;
    }

    public long getMillis(int i, long j) {
        return (long) i;
    }

    public long getMillis(long j) {
        return j;
    }

    public long getMillis(long j, long j2) {
        return j;
    }

    public String getName() {
        return "millis";
    }

    public DurationFieldType getType() {
        return DurationFieldType.millis();
    }

    public final long getUnitMillis() {
        return 1;
    }

    public int getValue(long j) {
        return FieldUtils.safeToInt(j);
    }

    public long getValueAsLong(long j) {
        return j;
    }

    public long getValueAsLong(long j, long j2) {
        return j;
    }

    public int hashCode() {
        return (int) getUnitMillis();
    }

    public final boolean isPrecise() {
        return true;
    }

    public boolean isSupported() {
        return true;
    }

    public String toString() {
        return "DurationField[millis]";
    }

    public long add(long j, long j2) {
        return FieldUtils.safeAdd(j, j2);
    }

    public int compareTo(DurationField durationField) {
        int i = (getUnitMillis() > durationField.getUnitMillis() ? 1 : (getUnitMillis() == durationField.getUnitMillis() ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        return i < 0 ? -1 : 1;
    }

    public int getValue(long j, long j2) {
        return FieldUtils.safeToInt(j);
    }
}
