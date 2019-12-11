package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.ReadWritableInterval;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;

class NullConverter extends AbstractConverter implements InstantConverter, PartialConverter, DurationConverter, PeriodConverter, IntervalConverter {
    static final NullConverter INSTANCE = new NullConverter();

    protected NullConverter() {
    }

    public long getDurationMillis(Object obj) {
        return 0;
    }

    public Class<?> getSupportedType() {
        return null;
    }

    public void setInto(ReadWritablePeriod readWritablePeriod, Object obj, Chronology chronology) {
        readWritablePeriod.setPeriod((ReadablePeriod) null);
    }

    public void setInto(ReadWritableInterval readWritableInterval, Object obj, Chronology chronology) {
        readWritableInterval.setChronology(chronology);
        long currentTimeMillis = DateTimeUtils.currentTimeMillis();
        readWritableInterval.setInterval(currentTimeMillis, currentTimeMillis);
    }
}
