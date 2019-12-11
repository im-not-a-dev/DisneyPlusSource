package org.joda.time.format;

import java.util.Locale;
import org.joda.time.ReadWritablePeriod;

public interface PeriodParser {
    int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i, Locale locale);
}
