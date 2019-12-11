package org.joda.time.base;

import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadablePeriod;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

public abstract class AbstractPeriod implements ReadablePeriod {
    protected AbstractPeriod() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReadablePeriod)) {
            return false;
        }
        ReadablePeriod readablePeriod = (ReadablePeriod) obj;
        if (size() != readablePeriod.size()) {
            return false;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (getValue(i) != readablePeriod.getValue(i) || getFieldType(i) != readablePeriod.getFieldType(i)) {
                return false;
            }
        }
        return true;
    }

    public int get(DurationFieldType durationFieldType) {
        int indexOf = indexOf(durationFieldType);
        if (indexOf == -1) {
            return 0;
        }
        return getValue(indexOf);
    }

    public DurationFieldType getFieldType(int i) {
        return getPeriodType().getFieldType(i);
    }

    public DurationFieldType[] getFieldTypes() {
        DurationFieldType[] durationFieldTypeArr = new DurationFieldType[size()];
        for (int i = 0; i < durationFieldTypeArr.length; i++) {
            durationFieldTypeArr[i] = getFieldType(i);
        }
        return durationFieldTypeArr;
    }

    public int[] getValues() {
        int[] iArr = new int[size()];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = getValue(i);
        }
        return iArr;
    }

    public int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (((i * 27) + getValue(i2)) * 27) + getFieldType(i2).hashCode();
        }
        return i;
    }

    public int indexOf(DurationFieldType durationFieldType) {
        return getPeriodType().indexOf(durationFieldType);
    }

    public boolean isSupported(DurationFieldType durationFieldType) {
        return getPeriodType().isSupported(durationFieldType);
    }

    public int size() {
        return getPeriodType().size();
    }

    public MutablePeriod toMutablePeriod() {
        return new MutablePeriod((Object) this);
    }

    public Period toPeriod() {
        return new Period((Object) this);
    }

    public String toString() {
        return ISOPeriodFormat.standard().print(this);
    }

    public String toString(PeriodFormatter periodFormatter) {
        if (periodFormatter == null) {
            return toString();
        }
        return periodFormatter.print(this);
    }
}
