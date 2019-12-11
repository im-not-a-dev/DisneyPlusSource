package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.ReadWritableInterval;

public interface IntervalConverter extends Converter {
    boolean isReadableInterval(Object obj, Chronology chronology);

    void setInto(ReadWritableInterval readWritableInterval, Object obj, Chronology chronology);
}
