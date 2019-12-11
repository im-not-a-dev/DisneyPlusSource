package org.joda.time.field;

import java.io.Serializable;
import java.util.HashMap;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

public final class UnsupportedDurationField extends DurationField implements Serializable {
    private static HashMap<DurationFieldType, UnsupportedDurationField> cCache = null;
    private static final long serialVersionUID = -6390301302770925357L;
    private final DurationFieldType iType;

    private UnsupportedDurationField(DurationFieldType durationFieldType) {
        this.iType = durationFieldType;
    }

    public static synchronized UnsupportedDurationField getInstance(DurationFieldType durationFieldType) {
        UnsupportedDurationField unsupportedDurationField;
        synchronized (UnsupportedDurationField.class) {
            if (cCache == null) {
                cCache = new HashMap<>(7);
                unsupportedDurationField = null;
            } else {
                unsupportedDurationField = (UnsupportedDurationField) cCache.get(durationFieldType);
            }
            if (unsupportedDurationField == null) {
                unsupportedDurationField = new UnsupportedDurationField(durationFieldType);
                cCache.put(durationFieldType, unsupportedDurationField);
            }
        }
        return unsupportedDurationField;
    }

    private Object readResolve() {
        return getInstance(this.iType);
    }

    private UnsupportedOperationException unsupported() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.iType);
        sb.append(" field is unsupported");
        return new UnsupportedOperationException(sb.toString());
    }

    public long add(long j, int i) {
        throw unsupported();
    }

    public int compareTo(DurationField durationField) {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnsupportedDurationField)) {
            return false;
        }
        UnsupportedDurationField unsupportedDurationField = (UnsupportedDurationField) obj;
        if (unsupportedDurationField.getName() != null) {
            return unsupportedDurationField.getName().equals(getName());
        }
        if (getName() != null) {
            z = false;
        }
        return z;
    }

    public int getDifference(long j, long j2) {
        throw unsupported();
    }

    public long getDifferenceAsLong(long j, long j2) {
        throw unsupported();
    }

    public long getMillis(int i) {
        throw unsupported();
    }

    public String getName() {
        return this.iType.getName();
    }

    public final DurationFieldType getType() {
        return this.iType;
    }

    public long getUnitMillis() {
        return 0;
    }

    public int getValue(long j) {
        throw unsupported();
    }

    public long getValueAsLong(long j) {
        throw unsupported();
    }

    public int hashCode() {
        return getName().hashCode();
    }

    public boolean isPrecise() {
        return true;
    }

    public boolean isSupported() {
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UnsupportedDurationField[");
        sb.append(getName());
        sb.append(']');
        return sb.toString();
    }

    public long add(long j, long j2) {
        throw unsupported();
    }

    public long getMillis(long j) {
        throw unsupported();
    }

    public int getValue(long j, long j2) {
        throw unsupported();
    }

    public long getValueAsLong(long j, long j2) {
        throw unsupported();
    }

    public long getMillis(int i, long j) {
        throw unsupported();
    }

    public long getMillis(long j, long j2) {
        throw unsupported();
    }
}
