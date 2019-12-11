package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadableDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.InstantConverter;

public abstract class BaseDateTime extends AbstractDateTime implements ReadableDateTime, Serializable {
    private static final long serialVersionUID = -6728882245981L;
    private volatile Chronology iChronology;
    private volatile long iMillis;

    public BaseDateTime() {
        this(DateTimeUtils.currentTimeMillis(), (Chronology) ISOChronology.getInstance());
    }

    private void adjustForMinMax() {
        if (this.iMillis == Long.MIN_VALUE || this.iMillis == Long.MAX_VALUE) {
            this.iChronology = this.iChronology.withUTC();
        }
    }

    /* access modifiers changed from: protected */
    public Chronology checkChronology(Chronology chronology) {
        return DateTimeUtils.getChronology(chronology);
    }

    /* access modifiers changed from: protected */
    public long checkInstant(long j, Chronology chronology) {
        return j;
    }

    public Chronology getChronology() {
        return this.iChronology;
    }

    public long getMillis() {
        return this.iMillis;
    }

    /* access modifiers changed from: protected */
    public void setChronology(Chronology chronology) {
        this.iChronology = checkChronology(chronology);
    }

    /* access modifiers changed from: protected */
    public void setMillis(long j) {
        this.iMillis = checkInstant(j, this.iChronology);
    }

    public BaseDateTime(DateTimeZone dateTimeZone) {
        this(DateTimeUtils.currentTimeMillis(), (Chronology) ISOChronology.getInstance(dateTimeZone));
    }

    public BaseDateTime(Chronology chronology) {
        this(DateTimeUtils.currentTimeMillis(), chronology);
    }

    public BaseDateTime(long j) {
        this(j, (Chronology) ISOChronology.getInstance());
    }

    public BaseDateTime(long j, DateTimeZone dateTimeZone) {
        this(j, (Chronology) ISOChronology.getInstance(dateTimeZone));
    }

    public BaseDateTime(long j, Chronology chronology) {
        this.iChronology = checkChronology(chronology);
        this.iMillis = checkInstant(j, this.iChronology);
        adjustForMinMax();
    }

    public BaseDateTime(Object obj, DateTimeZone dateTimeZone) {
        InstantConverter instantConverter = ConverterManager.getInstance().getInstantConverter(obj);
        Chronology checkChronology = checkChronology(instantConverter.getChronology(obj, dateTimeZone));
        this.iChronology = checkChronology;
        this.iMillis = checkInstant(instantConverter.getInstantMillis(obj, checkChronology), checkChronology);
        adjustForMinMax();
    }

    public BaseDateTime(Object obj, Chronology chronology) {
        InstantConverter instantConverter = ConverterManager.getInstance().getInstantConverter(obj);
        this.iChronology = checkChronology(instantConverter.getChronology(obj, chronology));
        this.iMillis = checkInstant(instantConverter.getInstantMillis(obj, chronology), this.iChronology);
        adjustForMinMax();
    }

    public BaseDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this(i, i2, i3, i4, i5, i6, i7, (Chronology) ISOChronology.getInstance());
    }

    public BaseDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, DateTimeZone dateTimeZone) {
        this(i, i2, i3, i4, i5, i6, i7, (Chronology) ISOChronology.getInstance(dateTimeZone));
    }

    public BaseDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, Chronology chronology) {
        this.iChronology = checkChronology(chronology);
        this.iMillis = checkInstant(this.iChronology.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7), this.iChronology);
        adjustForMinMax();
    }
}
