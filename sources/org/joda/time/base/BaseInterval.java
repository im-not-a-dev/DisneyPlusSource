package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.MutableInterval;
import org.joda.time.ReadWritableInterval;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.IntervalConverter;
import org.joda.time.field.FieldUtils;

public abstract class BaseInterval extends AbstractInterval implements ReadableInterval, Serializable {
    private static final long serialVersionUID = 576586928732749278L;
    private volatile Chronology iChronology;
    private volatile long iEndMillis;
    private volatile long iStartMillis;

    protected BaseInterval(long j, long j2, Chronology chronology) {
        this.iChronology = DateTimeUtils.getChronology(chronology);
        checkInterval(j, j2);
        this.iStartMillis = j;
        this.iEndMillis = j2;
    }

    public Chronology getChronology() {
        return this.iChronology;
    }

    public long getEndMillis() {
        return this.iEndMillis;
    }

    public long getStartMillis() {
        return this.iStartMillis;
    }

    /* access modifiers changed from: protected */
    public void setInterval(long j, long j2, Chronology chronology) {
        checkInterval(j, j2);
        this.iStartMillis = j;
        this.iEndMillis = j2;
        this.iChronology = DateTimeUtils.getChronology(chronology);
    }

    protected BaseInterval(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        if (readableInstant == null && readableInstant2 == null) {
            long currentTimeMillis = DateTimeUtils.currentTimeMillis();
            this.iEndMillis = currentTimeMillis;
            this.iStartMillis = currentTimeMillis;
            this.iChronology = ISOChronology.getInstance();
            return;
        }
        this.iChronology = DateTimeUtils.getInstantChronology(readableInstant);
        this.iStartMillis = DateTimeUtils.getInstantMillis(readableInstant);
        this.iEndMillis = DateTimeUtils.getInstantMillis(readableInstant2);
        checkInterval(this.iStartMillis, this.iEndMillis);
    }

    protected BaseInterval(ReadableInstant readableInstant, ReadableDuration readableDuration) {
        this.iChronology = DateTimeUtils.getInstantChronology(readableInstant);
        this.iStartMillis = DateTimeUtils.getInstantMillis(readableInstant);
        this.iEndMillis = FieldUtils.safeAdd(this.iStartMillis, DateTimeUtils.getDurationMillis(readableDuration));
        checkInterval(this.iStartMillis, this.iEndMillis);
    }

    protected BaseInterval(ReadableDuration readableDuration, ReadableInstant readableInstant) {
        this.iChronology = DateTimeUtils.getInstantChronology(readableInstant);
        this.iEndMillis = DateTimeUtils.getInstantMillis(readableInstant);
        this.iStartMillis = FieldUtils.safeAdd(this.iEndMillis, -DateTimeUtils.getDurationMillis(readableDuration));
        checkInterval(this.iStartMillis, this.iEndMillis);
    }

    protected BaseInterval(ReadableInstant readableInstant, ReadablePeriod readablePeriod) {
        Chronology instantChronology = DateTimeUtils.getInstantChronology(readableInstant);
        this.iChronology = instantChronology;
        this.iStartMillis = DateTimeUtils.getInstantMillis(readableInstant);
        if (readablePeriod == null) {
            this.iEndMillis = this.iStartMillis;
        } else {
            this.iEndMillis = instantChronology.add(readablePeriod, this.iStartMillis, 1);
        }
        checkInterval(this.iStartMillis, this.iEndMillis);
    }

    protected BaseInterval(ReadablePeriod readablePeriod, ReadableInstant readableInstant) {
        Chronology instantChronology = DateTimeUtils.getInstantChronology(readableInstant);
        this.iChronology = instantChronology;
        this.iEndMillis = DateTimeUtils.getInstantMillis(readableInstant);
        if (readablePeriod == null) {
            this.iStartMillis = this.iEndMillis;
        } else {
            this.iStartMillis = instantChronology.add(readablePeriod, this.iEndMillis, -1);
        }
        checkInterval(this.iStartMillis, this.iEndMillis);
    }

    protected BaseInterval(Object obj, Chronology chronology) {
        IntervalConverter intervalConverter = ConverterManager.getInstance().getIntervalConverter(obj);
        if (intervalConverter.isReadableInterval(obj, chronology)) {
            ReadableInterval readableInterval = (ReadableInterval) obj;
            if (chronology == null) {
                chronology = readableInterval.getChronology();
            }
            this.iChronology = chronology;
            this.iStartMillis = readableInterval.getStartMillis();
            this.iEndMillis = readableInterval.getEndMillis();
        } else if (this instanceof ReadWritableInterval) {
            intervalConverter.setInto((ReadWritableInterval) this, obj, chronology);
        } else {
            MutableInterval mutableInterval = new MutableInterval();
            intervalConverter.setInto(mutableInterval, obj, chronology);
            this.iChronology = mutableInterval.getChronology();
            this.iStartMillis = mutableInterval.getStartMillis();
            this.iEndMillis = mutableInterval.getEndMillis();
        }
        checkInterval(this.iStartMillis, this.iEndMillis);
    }
}
