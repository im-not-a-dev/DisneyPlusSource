package org.joda.time.p699tz;

import java.util.Locale;

/* renamed from: org.joda.time.tz.NameProvider */
public interface NameProvider {
    String getName(Locale locale, String str, String str2);

    String getShortName(Locale locale, String str, String str2);
}
