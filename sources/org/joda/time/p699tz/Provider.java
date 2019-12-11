package org.joda.time.p699tz;

import java.util.Set;
import org.joda.time.DateTimeZone;

/* renamed from: org.joda.time.tz.Provider */
public interface Provider {
    Set<String> getAvailableIDs();

    DateTimeZone getZone(String str);
}
