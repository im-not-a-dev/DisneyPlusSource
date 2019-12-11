package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;

class ReadablePeriodConverter extends AbstractConverter implements PeriodConverter {
    static final ReadablePeriodConverter INSTANCE = new ReadablePeriodConverter();

    protected ReadablePeriodConverter() {
    }

    public PeriodType getPeriodType(Object obj) {
        return ((ReadablePeriod) obj).getPeriodType();
    }

    public Class<?> getSupportedType() {
        return ReadablePeriod.class;
    }

    public void setInto(ReadWritablePeriod readWritablePeriod, Object obj, Chronology chronology) {
        readWritablePeriod.setPeriod((ReadablePeriod) obj);
    }
}
