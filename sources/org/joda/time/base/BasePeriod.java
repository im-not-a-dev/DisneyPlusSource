package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.PeriodConverter;
import org.joda.time.field.FieldUtils;

public abstract class BasePeriod extends AbstractPeriod implements ReadablePeriod, Serializable {
    private static final ReadablePeriod DUMMY_PERIOD = new AbstractPeriod() {
        public PeriodType getPeriodType() {
            return PeriodType.time();
        }

        public int getValue(int i) {
            return 0;
        }
    };
    private static final long serialVersionUID = -2110953284060001145L;
    private final PeriodType iType;
    private final int[] iValues;

    protected BasePeriod(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PeriodType periodType) {
        this.iType = checkPeriodType(periodType);
        this.iValues = setPeriodInternal(i, i2, i3, i4, i5, i6, i7, i8);
    }

    private void checkAndUpdate(DurationFieldType durationFieldType, int[] iArr, int i) {
        int indexOf = indexOf(durationFieldType);
        if (indexOf != -1) {
            iArr[indexOf] = i;
        } else if (i != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Period does not support field '");
            sb.append(durationFieldType.getName());
            sb.append("'");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private void setPeriodInternal(ReadablePeriod readablePeriod) {
        int[] iArr = new int[size()];
        int size = readablePeriod.size();
        for (int i = 0; i < size; i++) {
            checkAndUpdate(readablePeriod.getFieldType(i), iArr, readablePeriod.getValue(i));
        }
        setValues(iArr);
    }

    /* access modifiers changed from: protected */
    public void addField(DurationFieldType durationFieldType, int i) {
        addFieldInto(this.iValues, durationFieldType, i);
    }

    /* access modifiers changed from: protected */
    public void addFieldInto(int[] iArr, DurationFieldType durationFieldType, int i) {
        int indexOf = indexOf(durationFieldType);
        if (indexOf != -1) {
            iArr[indexOf] = FieldUtils.safeAdd(iArr[indexOf], i);
        } else if (i != 0 || durationFieldType == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Period does not support field '");
            sb.append(durationFieldType);
            sb.append("'");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void addPeriod(ReadablePeriod readablePeriod) {
        if (readablePeriod != null) {
            setValues(addPeriodInto(getValues(), readablePeriod));
        }
    }

    /* access modifiers changed from: protected */
    public int[] addPeriodInto(int[] iArr, ReadablePeriod readablePeriod) {
        int size = readablePeriod.size();
        for (int i = 0; i < size; i++) {
            DurationFieldType fieldType = readablePeriod.getFieldType(i);
            int value = readablePeriod.getValue(i);
            if (value != 0) {
                int indexOf = indexOf(fieldType);
                if (indexOf != -1) {
                    iArr[indexOf] = FieldUtils.safeAdd(getValue(indexOf), value);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Period does not support field '");
                    sb.append(fieldType.getName());
                    sb.append("'");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        return iArr;
    }

    /* access modifiers changed from: protected */
    public PeriodType checkPeriodType(PeriodType periodType) {
        return DateTimeUtils.getPeriodType(periodType);
    }

    public PeriodType getPeriodType() {
        return this.iType;
    }

    public int getValue(int i) {
        return this.iValues[i];
    }

    /* access modifiers changed from: protected */
    public void mergePeriod(ReadablePeriod readablePeriod) {
        if (readablePeriod != null) {
            setValues(mergePeriodInto(getValues(), readablePeriod));
        }
    }

    /* access modifiers changed from: protected */
    public int[] mergePeriodInto(int[] iArr, ReadablePeriod readablePeriod) {
        int size = readablePeriod.size();
        for (int i = 0; i < size; i++) {
            checkAndUpdate(readablePeriod.getFieldType(i), iArr, readablePeriod.getValue(i));
        }
        return iArr;
    }

    /* access modifiers changed from: protected */
    public void setField(DurationFieldType durationFieldType, int i) {
        setFieldInto(this.iValues, durationFieldType, i);
    }

    /* access modifiers changed from: protected */
    public void setFieldInto(int[] iArr, DurationFieldType durationFieldType, int i) {
        int indexOf = indexOf(durationFieldType);
        if (indexOf != -1) {
            iArr[indexOf] = i;
        } else if (i != 0 || durationFieldType == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Period does not support field '");
            sb.append(durationFieldType);
            sb.append("'");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void setPeriod(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            setValues(new int[size()]);
        } else {
            setPeriodInternal(readablePeriod);
        }
    }

    /* access modifiers changed from: protected */
    public void setValue(int i, int i2) {
        this.iValues[i] = i2;
    }

    /* access modifiers changed from: protected */
    public void setValues(int[] iArr) {
        int[] iArr2 = this.iValues;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
    }

    public Duration toDurationFrom(ReadableInstant readableInstant) {
        long instantMillis = DateTimeUtils.getInstantMillis(readableInstant);
        return new Duration(instantMillis, DateTimeUtils.getInstantChronology(readableInstant).add((ReadablePeriod) this, instantMillis, 1));
    }

    public Duration toDurationTo(ReadableInstant readableInstant) {
        long instantMillis = DateTimeUtils.getInstantMillis(readableInstant);
        return new Duration(DateTimeUtils.getInstantChronology(readableInstant).add((ReadablePeriod) this, instantMillis, -1), instantMillis);
    }

    /* access modifiers changed from: protected */
    public void setPeriod(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        setValues(setPeriodInternal(i, i2, i3, i4, i5, i6, i7, i8));
    }

    protected BasePeriod(long j, long j2, PeriodType periodType, Chronology chronology) {
        PeriodType checkPeriodType = checkPeriodType(periodType);
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        this.iType = checkPeriodType;
        this.iValues = chronology2.get(this, j, j2);
    }

    private int[] setPeriodInternal(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int[] iArr = new int[size()];
        checkAndUpdate(DurationFieldType.years(), iArr, i);
        checkAndUpdate(DurationFieldType.months(), iArr, i2);
        checkAndUpdate(DurationFieldType.weeks(), iArr, i3);
        checkAndUpdate(DurationFieldType.days(), iArr, i4);
        checkAndUpdate(DurationFieldType.hours(), iArr, i5);
        checkAndUpdate(DurationFieldType.minutes(), iArr, i6);
        checkAndUpdate(DurationFieldType.seconds(), iArr, i7);
        checkAndUpdate(DurationFieldType.millis(), iArr, i8);
        return iArr;
    }

    protected BasePeriod(ReadableInstant readableInstant, ReadableInstant readableInstant2, PeriodType periodType) {
        PeriodType checkPeriodType = checkPeriodType(periodType);
        if (readableInstant == null && readableInstant2 == null) {
            this.iType = checkPeriodType;
            this.iValues = new int[size()];
            return;
        }
        long instantMillis = DateTimeUtils.getInstantMillis(readableInstant);
        long instantMillis2 = DateTimeUtils.getInstantMillis(readableInstant2);
        Chronology intervalChronology = DateTimeUtils.getIntervalChronology(readableInstant, readableInstant2);
        this.iType = checkPeriodType;
        this.iValues = intervalChronology.get(this, instantMillis, instantMillis2);
    }

    protected BasePeriod(ReadablePartial readablePartial, ReadablePartial readablePartial2, PeriodType periodType) {
        if (readablePartial == null || readablePartial2 == null) {
            throw new IllegalArgumentException("ReadablePartial objects must not be null");
        } else if (!(readablePartial instanceof BaseLocal) || !(readablePartial2 instanceof BaseLocal) || readablePartial.getClass() != readablePartial2.getClass()) {
            String str = "ReadablePartial objects must have the same set of fields";
            if (readablePartial.size() == readablePartial2.size()) {
                int i = 0;
                int size = readablePartial.size();
                while (i < size) {
                    if (readablePartial.getFieldType(i) == readablePartial2.getFieldType(i)) {
                        i++;
                    } else {
                        throw new IllegalArgumentException(str);
                    }
                }
                if (DateTimeUtils.isContiguous(readablePartial)) {
                    this.iType = checkPeriodType(periodType);
                    Chronology withUTC = DateTimeUtils.getChronology(readablePartial.getChronology()).withUTC();
                    this.iValues = withUTC.get(this, withUTC.set(readablePartial, 0), withUTC.set(readablePartial2, 0));
                    return;
                }
                throw new IllegalArgumentException("ReadablePartial objects must be contiguous");
            }
            throw new IllegalArgumentException(str);
        } else {
            PeriodType checkPeriodType = checkPeriodType(periodType);
            long localMillis = ((BaseLocal) readablePartial).getLocalMillis();
            long localMillis2 = ((BaseLocal) readablePartial2).getLocalMillis();
            Chronology chronology = DateTimeUtils.getChronology(readablePartial.getChronology());
            this.iType = checkPeriodType;
            this.iValues = chronology.get(this, localMillis, localMillis2);
        }
    }

    protected BasePeriod(ReadableInstant readableInstant, ReadableDuration readableDuration, PeriodType periodType) {
        PeriodType checkPeriodType = checkPeriodType(periodType);
        long instantMillis = DateTimeUtils.getInstantMillis(readableInstant);
        long safeAdd = FieldUtils.safeAdd(instantMillis, DateTimeUtils.getDurationMillis(readableDuration));
        Chronology instantChronology = DateTimeUtils.getInstantChronology(readableInstant);
        this.iType = checkPeriodType;
        this.iValues = instantChronology.get(this, instantMillis, safeAdd);
    }

    protected BasePeriod(ReadableDuration readableDuration, ReadableInstant readableInstant, PeriodType periodType) {
        PeriodType checkPeriodType = checkPeriodType(periodType);
        long durationMillis = DateTimeUtils.getDurationMillis(readableDuration);
        long instantMillis = DateTimeUtils.getInstantMillis(readableInstant);
        long safeSubtract = FieldUtils.safeSubtract(instantMillis, durationMillis);
        Chronology instantChronology = DateTimeUtils.getInstantChronology(readableInstant);
        this.iType = checkPeriodType;
        this.iValues = instantChronology.get(this, safeSubtract, instantMillis);
    }

    protected BasePeriod(long j) {
        this.iType = PeriodType.standard();
        int[] iArr = ISOChronology.getInstanceUTC().get(DUMMY_PERIOD, j);
        this.iValues = new int[8];
        System.arraycopy(iArr, 0, this.iValues, 4, 4);
    }

    protected BasePeriod(long j, PeriodType periodType, Chronology chronology) {
        PeriodType checkPeriodType = checkPeriodType(periodType);
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        this.iType = checkPeriodType;
        this.iValues = chronology2.get((ReadablePeriod) this, j);
    }

    protected BasePeriod(Object obj, PeriodType periodType, Chronology chronology) {
        PeriodConverter periodConverter = ConverterManager.getInstance().getPeriodConverter(obj);
        if (periodType == null) {
            periodType = periodConverter.getPeriodType(obj);
        }
        PeriodType checkPeriodType = checkPeriodType(periodType);
        this.iType = checkPeriodType;
        if (this instanceof ReadWritablePeriod) {
            this.iValues = new int[size()];
            periodConverter.setInto((ReadWritablePeriod) this, obj, DateTimeUtils.getChronology(chronology));
            return;
        }
        this.iValues = new MutablePeriod(obj, checkPeriodType, chronology).getValues();
    }

    protected BasePeriod(int[] iArr, PeriodType periodType) {
        this.iType = periodType;
        this.iValues = iArr;
    }
}
