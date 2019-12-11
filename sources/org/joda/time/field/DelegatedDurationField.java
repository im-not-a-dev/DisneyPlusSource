package org.joda.time.field;

import java.io.Serializable;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

public class DelegatedDurationField extends DurationField implements Serializable {
    private static final long serialVersionUID = -5576443481242007829L;
    private final DurationField iField;
    private final DurationFieldType iType;

    protected DelegatedDurationField(DurationField durationField) {
        this(durationField, null);
    }

    public long add(long j, int i) {
        return this.iField.add(j, i);
    }

    public boolean equals(Object obj) {
        if (obj instanceof DelegatedDurationField) {
            return this.iField.equals(((DelegatedDurationField) obj).iField);
        }
        return false;
    }

    public int getDifference(long j, long j2) {
        return this.iField.getDifference(j, j2);
    }

    public long getDifferenceAsLong(long j, long j2) {
        return this.iField.getDifferenceAsLong(j, j2);
    }

    public long getMillis(int i) {
        return this.iField.getMillis(i);
    }

    public String getName() {
        return this.iType.getName();
    }

    public DurationFieldType getType() {
        return this.iType;
    }

    public long getUnitMillis() {
        return this.iField.getUnitMillis();
    }

    public int getValue(long j) {
        return this.iField.getValue(j);
    }

    public long getValueAsLong(long j) {
        return this.iField.getValueAsLong(j);
    }

    public final DurationField getWrappedField() {
        return this.iField;
    }

    public int hashCode() {
        return this.iField.hashCode() ^ this.iType.hashCode();
    }

    public boolean isPrecise() {
        return this.iField.isPrecise();
    }

    public boolean isSupported() {
        return this.iField.isSupported();
    }

    public String toString() {
        if (this.iType == null) {
            return this.iField.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("DurationField[");
        sb.append(this.iType);
        sb.append(']');
        return sb.toString();
    }

    protected DelegatedDurationField(DurationField durationField, DurationFieldType durationFieldType) {
        if (durationField != null) {
            this.iField = durationField;
            if (durationFieldType == null) {
                durationFieldType = durationField.getType();
            }
            this.iType = durationFieldType;
            return;
        }
        throw new IllegalArgumentException("The field must not be null");
    }

    public long add(long j, long j2) {
        return this.iField.add(j, j2);
    }

    public int compareTo(DurationField durationField) {
        return this.iField.compareTo(durationField);
    }

    public long getMillis(long j) {
        return this.iField.getMillis(j);
    }

    public int getValue(long j, long j2) {
        return this.iField.getValue(j, j2);
    }

    public long getValueAsLong(long j, long j2) {
        return this.iField.getValueAsLong(j, j2);
    }

    public long getMillis(int i, long j) {
        return this.iField.getMillis(i, j);
    }

    public long getMillis(long j, long j2) {
        return this.iField.getMillis(j, j2);
    }
}
