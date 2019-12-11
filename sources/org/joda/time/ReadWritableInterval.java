package org.joda.time;

public interface ReadWritableInterval extends ReadableInterval {
    void setChronology(Chronology chronology);

    void setDurationAfterStart(ReadableDuration readableDuration);

    void setDurationBeforeEnd(ReadableDuration readableDuration);

    void setEnd(ReadableInstant readableInstant);

    void setEndMillis(long j);

    void setInterval(long j, long j2);

    void setInterval(ReadableInstant readableInstant, ReadableInstant readableInstant2);

    void setInterval(ReadableInterval readableInterval);

    void setPeriodAfterStart(ReadablePeriod readablePeriod);

    void setPeriodBeforeEnd(ReadablePeriod readablePeriod);

    void setStart(ReadableInstant readableInstant);

    void setStartMillis(long j);
}
