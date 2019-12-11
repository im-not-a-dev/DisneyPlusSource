package org.joda.time.p699tz;

import java.util.Collections;
import java.util.Set;
import org.joda.time.DateTimeZone;

/* renamed from: org.joda.time.tz.UTCProvider */
public final class UTCProvider implements Provider {
    private static final Set<String> AVAILABLE_IDS = Collections.singleton("UTC");

    public Set<String> getAvailableIDs() {
        return AVAILABLE_IDS;
    }

    public DateTimeZone getZone(String str) {
        if ("UTC".equalsIgnoreCase(str)) {
            return DateTimeZone.UTC;
        }
        return null;
    }
}
