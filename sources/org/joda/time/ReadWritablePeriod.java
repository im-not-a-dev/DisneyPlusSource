package org.joda.time;

public interface ReadWritablePeriod extends ReadablePeriod {
    void add(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    void add(DurationFieldType durationFieldType, int i);

    void add(ReadableInterval readableInterval);

    void add(ReadablePeriod readablePeriod);

    void addDays(int i);

    void addHours(int i);

    void addMillis(int i);

    void addMinutes(int i);

    void addMonths(int i);

    void addSeconds(int i);

    void addWeeks(int i);

    void addYears(int i);

    void clear();

    void set(DurationFieldType durationFieldType, int i);

    void setDays(int i);

    void setHours(int i);

    void setMillis(int i);

    void setMinutes(int i);

    void setMonths(int i);

    void setPeriod(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    void setPeriod(ReadableInterval readableInterval);

    void setPeriod(ReadablePeriod readablePeriod);

    void setSeconds(int i);

    void setValue(int i, int i2);

    void setWeeks(int i);

    void setYears(int i);
}
