package org.joda.time.base;

import org.joda.time.Duration;
import org.joda.time.Period;
import org.joda.time.ReadableDuration;
import org.joda.time.format.FormatUtils;

public abstract class AbstractDuration implements ReadableDuration {
    protected AbstractDuration() {
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReadableDuration)) {
            return false;
        }
        if (getMillis() != ((ReadableDuration) obj).getMillis()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        long millis = getMillis();
        return (int) (millis ^ (millis >>> 32));
    }

    public boolean isEqual(ReadableDuration readableDuration) {
        if (readableDuration == null) {
            readableDuration = Duration.ZERO;
        }
        return compareTo(readableDuration) == 0;
    }

    public boolean isLongerThan(ReadableDuration readableDuration) {
        if (readableDuration == null) {
            readableDuration = Duration.ZERO;
        }
        return compareTo(readableDuration) > 0;
    }

    public boolean isShorterThan(ReadableDuration readableDuration) {
        if (readableDuration == null) {
            readableDuration = Duration.ZERO;
        }
        return compareTo(readableDuration) < 0;
    }

    public Duration toDuration() {
        return new Duration(getMillis());
    }

    public Period toPeriod() {
        return new Period(getMillis());
    }

    public String toString() {
        long millis = getMillis();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PT");
        boolean z = millis < 0;
        FormatUtils.appendUnpaddedInteger(stringBuffer, millis);
        while (true) {
            int i = 3;
            if (stringBuffer.length() >= (z ? 7 : 6)) {
                break;
            }
            if (!z) {
                i = 2;
            }
            stringBuffer.insert(i, "0");
        }
        if ((millis / 1000) * 1000 == millis) {
            stringBuffer.setLength(stringBuffer.length() - 3);
        } else {
            stringBuffer.insert(stringBuffer.length() - 3, ".");
        }
        stringBuffer.append('S');
        return stringBuffer.toString();
    }

    public int compareTo(ReadableDuration readableDuration) {
        int i = (getMillis() > readableDuration.getMillis() ? 1 : (getMillis() == readableDuration.getMillis() ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }
}
