package org.joda.time;

public interface ReadablePeriod {
    boolean equals(Object obj);

    int get(DurationFieldType durationFieldType);

    DurationFieldType getFieldType(int i);

    PeriodType getPeriodType();

    int getValue(int i);

    int hashCode();

    boolean isSupported(DurationFieldType durationFieldType);

    int size();

    MutablePeriod toMutablePeriod();

    Period toPeriod();

    String toString();
}
