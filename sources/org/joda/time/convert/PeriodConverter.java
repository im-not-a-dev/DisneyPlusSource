package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;

public interface PeriodConverter extends Converter {
    PeriodType getPeriodType(Object obj);

    void setInto(ReadWritablePeriod readWritablePeriod, Object obj, Chronology chronology);
}
