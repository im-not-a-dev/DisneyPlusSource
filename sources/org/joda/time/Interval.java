package org.joda.time;

import java.io.Serializable;
import org.joda.time.base.BaseInterval;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

public final class Interval extends BaseInterval implements ReadableInterval, Serializable {
    private static final long serialVersionUID = 4922451897541386752L;

    public Interval(long j, long j2) {
        super(j, j2, null);
    }

    public static Interval parse(String str) {
        return new Interval(str);
    }

    public static Interval parseWithOffset(String str) {
        ReadablePeriod readablePeriod;
        int indexOf = str.indexOf(47);
        if (indexOf >= 0) {
            String substring = str.substring(0, indexOf);
            String str2 = "Format invalid: ";
            if (substring.length() > 0) {
                String substring2 = str.substring(indexOf + 1);
                if (substring2.length() > 0) {
                    DateTimeFormatter withOffsetParsed = ISODateTimeFormat.dateTimeParser().withOffsetParsed();
                    PeriodFormatter standard = ISOPeriodFormat.standard();
                    char charAt = substring.charAt(0);
                    ReadableInstant readableInstant = null;
                    if (charAt == 'P' || charAt == 'p') {
                        readablePeriod = standard.withParseType(PeriodType.standard()).parsePeriod(substring);
                    } else {
                        readableInstant = withOffsetParsed.parseDateTime(substring);
                        readablePeriod = null;
                    }
                    char charAt2 = substring2.charAt(0);
                    if (charAt2 != 'P' && charAt2 != 'p') {
                        DateTime parseDateTime = withOffsetParsed.parseDateTime(substring2);
                        if (readablePeriod != null) {
                            return new Interval(readablePeriod, (ReadableInstant) parseDateTime);
                        }
                        return new Interval(readableInstant, (ReadableInstant) parseDateTime);
                    } else if (readablePeriod == null) {
                        return new Interval(readableInstant, (ReadablePeriod) standard.withParseType(PeriodType.standard()).parsePeriod(substring2));
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Interval composed of two durations: ");
                        sb.append(str);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(str);
                    throw new IllegalArgumentException(sb2.toString());
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str2);
                sb3.append(str);
                throw new IllegalArgumentException(sb3.toString());
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Format requires a '/' separator: ");
            sb4.append(str);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    public boolean abuts(ReadableInterval readableInterval) {
        boolean z = false;
        if (readableInterval == null) {
            long currentTimeMillis = DateTimeUtils.currentTimeMillis();
            if (getStartMillis() == currentTimeMillis || getEndMillis() == currentTimeMillis) {
                z = true;
            }
            return z;
        }
        if (readableInterval.getEndMillis() == getStartMillis() || getEndMillis() == readableInterval.getStartMillis()) {
            z = true;
        }
        return z;
    }

    public Interval gap(ReadableInterval readableInterval) {
        ReadableInterval readableInterval2 = DateTimeUtils.getReadableInterval(readableInterval);
        long startMillis = readableInterval2.getStartMillis();
        long endMillis = readableInterval2.getEndMillis();
        long startMillis2 = getStartMillis();
        long endMillis2 = getEndMillis();
        if (startMillis2 > endMillis) {
            Interval interval = new Interval(endMillis, startMillis2, getChronology());
            return interval;
        } else if (startMillis <= endMillis2) {
            return null;
        } else {
            Interval interval2 = new Interval(endMillis2, startMillis, getChronology());
            return interval2;
        }
    }

    public Interval overlap(ReadableInterval readableInterval) {
        ReadableInterval readableInterval2 = DateTimeUtils.getReadableInterval(readableInterval);
        if (!overlaps(readableInterval2)) {
            return null;
        }
        Interval interval = new Interval(Math.max(getStartMillis(), readableInterval2.getStartMillis()), Math.min(getEndMillis(), readableInterval2.getEndMillis()), getChronology());
        return interval;
    }

    public Interval toInterval() {
        return this;
    }

    public Interval withChronology(Chronology chronology) {
        if (getChronology() == chronology) {
            return this;
        }
        Interval interval = new Interval(getStartMillis(), getEndMillis(), chronology);
        return interval;
    }

    public Interval withDurationAfterStart(ReadableDuration readableDuration) {
        long durationMillis = DateTimeUtils.getDurationMillis(readableDuration);
        if (durationMillis == toDurationMillis()) {
            return this;
        }
        Chronology chronology = getChronology();
        long startMillis = getStartMillis();
        Interval interval = new Interval(startMillis, chronology.add(startMillis, durationMillis, 1), chronology);
        return interval;
    }

    public Interval withDurationBeforeEnd(ReadableDuration readableDuration) {
        long durationMillis = DateTimeUtils.getDurationMillis(readableDuration);
        if (durationMillis == toDurationMillis()) {
            return this;
        }
        Chronology chronology = getChronology();
        long endMillis = getEndMillis();
        Interval interval = new Interval(chronology.add(endMillis, durationMillis, -1), endMillis, chronology);
        return interval;
    }

    public Interval withEnd(ReadableInstant readableInstant) {
        return withEndMillis(DateTimeUtils.getInstantMillis(readableInstant));
    }

    public Interval withEndMillis(long j) {
        if (j == getEndMillis()) {
            return this;
        }
        Interval interval = new Interval(getStartMillis(), j, getChronology());
        return interval;
    }

    public Interval withPeriodAfterStart(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            return withDurationAfterStart(null);
        }
        Chronology chronology = getChronology();
        long startMillis = getStartMillis();
        Interval interval = new Interval(startMillis, chronology.add(readablePeriod, startMillis, 1), chronology);
        return interval;
    }

    public Interval withPeriodBeforeEnd(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            return withDurationBeforeEnd(null);
        }
        Chronology chronology = getChronology();
        long endMillis = getEndMillis();
        Interval interval = new Interval(chronology.add(readablePeriod, endMillis, -1), endMillis, chronology);
        return interval;
    }

    public Interval withStart(ReadableInstant readableInstant) {
        return withStartMillis(DateTimeUtils.getInstantMillis(readableInstant));
    }

    public Interval withStartMillis(long j) {
        if (j == getStartMillis()) {
            return this;
        }
        Interval interval = new Interval(j, getEndMillis(), getChronology());
        return interval;
    }

    public Interval(long j, long j2, DateTimeZone dateTimeZone) {
        super(j, j2, ISOChronology.getInstance(dateTimeZone));
    }

    public Interval(long j, long j2, Chronology chronology) {
        super(j, j2, chronology);
    }

    public Interval(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        super(readableInstant, readableInstant2);
    }

    public Interval(ReadableInstant readableInstant, ReadableDuration readableDuration) {
        super(readableInstant, readableDuration);
    }

    public Interval(ReadableDuration readableDuration, ReadableInstant readableInstant) {
        super(readableDuration, readableInstant);
    }

    public Interval(ReadableInstant readableInstant, ReadablePeriod readablePeriod) {
        super(readableInstant, readablePeriod);
    }

    public Interval(ReadablePeriod readablePeriod, ReadableInstant readableInstant) {
        super(readablePeriod, readableInstant);
    }

    public Interval(Object obj) {
        super(obj, (Chronology) null);
    }

    public Interval(Object obj, Chronology chronology) {
        super(obj, chronology);
    }
}
