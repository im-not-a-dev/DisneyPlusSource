package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadablePeriod;

class ReadableDurationConverter extends AbstractConverter implements DurationConverter, PeriodConverter {
    static final ReadableDurationConverter INSTANCE = new ReadableDurationConverter();

    protected ReadableDurationConverter() {
    }

    public long getDurationMillis(Object obj) {
        return ((ReadableDuration) obj).getMillis();
    }

    public Class<?> getSupportedType() {
        return ReadableDuration.class;
    }

    public void setInto(ReadWritablePeriod readWritablePeriod, Object obj, Chronology chronology) {
        int[] iArr = DateTimeUtils.getChronology(chronology).get((ReadablePeriod) readWritablePeriod, ((ReadableDuration) obj).getMillis());
        for (int i = 0; i < iArr.length; i++) {
            readWritablePeriod.setValue(i, iArr[i]);
        }
    }
}
