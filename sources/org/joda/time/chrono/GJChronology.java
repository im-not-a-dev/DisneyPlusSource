package org.joda.time.chrono;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.AssembledChronology.Fields;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public final class GJChronology extends AssembledChronology {
    static final Instant DEFAULT_CUTOVER = new Instant(-12219292800000L);
    private static final ConcurrentHashMap<GJCacheKey, GJChronology> cCache = new ConcurrentHashMap<>();
    private static final long serialVersionUID = -2545574827706931671L;
    private Instant iCutoverInstant;
    private long iCutoverMillis;
    /* access modifiers changed from: private */
    public long iGapDuration;
    /* access modifiers changed from: private */
    public GregorianChronology iGregorianChronology;
    private JulianChronology iJulianChronology;

    private class CutoverField extends BaseDateTimeField {
        private static final long serialVersionUID = 3528501219481026402L;
        final boolean iConvertByWeekyear;
        final long iCutover;
        protected DurationField iDurationField;
        final DateTimeField iGregorianField;
        final DateTimeField iJulianField;
        protected DurationField iRangeDurationField;

        CutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, long j) {
            this(gJChronology, dateTimeField, dateTimeField2, j, false);
        }

        public long add(long j, int i) {
            return this.iGregorianField.add(j, i);
        }

        public int get(long j) {
            if (j >= this.iCutover) {
                return this.iGregorianField.get(j);
            }
            return this.iJulianField.get(j);
        }

        public String getAsShortText(long j, Locale locale) {
            if (j >= this.iCutover) {
                return this.iGregorianField.getAsShortText(j, locale);
            }
            return this.iJulianField.getAsShortText(j, locale);
        }

        public String getAsText(long j, Locale locale) {
            if (j >= this.iCutover) {
                return this.iGregorianField.getAsText(j, locale);
            }
            return this.iJulianField.getAsText(j, locale);
        }

        public int getDifference(long j, long j2) {
            return this.iGregorianField.getDifference(j, j2);
        }

        public long getDifferenceAsLong(long j, long j2) {
            return this.iGregorianField.getDifferenceAsLong(j, j2);
        }

        public DurationField getDurationField() {
            return this.iDurationField;
        }

        public int getLeapAmount(long j) {
            if (j >= this.iCutover) {
                return this.iGregorianField.getLeapAmount(j);
            }
            return this.iJulianField.getLeapAmount(j);
        }

        public DurationField getLeapDurationField() {
            return this.iGregorianField.getLeapDurationField();
        }

        public int getMaximumShortTextLength(Locale locale) {
            return Math.max(this.iJulianField.getMaximumShortTextLength(locale), this.iGregorianField.getMaximumShortTextLength(locale));
        }

        public int getMaximumTextLength(Locale locale) {
            return Math.max(this.iJulianField.getMaximumTextLength(locale), this.iGregorianField.getMaximumTextLength(locale));
        }

        public int getMaximumValue() {
            return this.iGregorianField.getMaximumValue();
        }

        public int getMinimumValue() {
            return this.iJulianField.getMinimumValue();
        }

        public DurationField getRangeDurationField() {
            return this.iRangeDurationField;
        }

        /* access modifiers changed from: protected */
        public long gregorianToJulian(long j) {
            if (this.iConvertByWeekyear) {
                return GJChronology.this.gregorianToJulianByWeekyear(j);
            }
            return GJChronology.this.gregorianToJulianByYear(j);
        }

        public boolean isLeap(long j) {
            if (j >= this.iCutover) {
                return this.iGregorianField.isLeap(j);
            }
            return this.iJulianField.isLeap(j);
        }

        public boolean isLenient() {
            return false;
        }

        /* access modifiers changed from: protected */
        public long julianToGregorian(long j) {
            if (this.iConvertByWeekyear) {
                return GJChronology.this.julianToGregorianByWeekyear(j);
            }
            return GJChronology.this.julianToGregorianByYear(j);
        }

        public long roundCeiling(long j) {
            if (j >= this.iCutover) {
                return this.iGregorianField.roundCeiling(j);
            }
            long roundCeiling = this.iJulianField.roundCeiling(j);
            return (roundCeiling < this.iCutover || roundCeiling - GJChronology.this.iGapDuration < this.iCutover) ? roundCeiling : julianToGregorian(roundCeiling);
        }

        public long roundFloor(long j) {
            if (j < this.iCutover) {
                return this.iJulianField.roundFloor(j);
            }
            long roundFloor = this.iGregorianField.roundFloor(j);
            if (roundFloor >= this.iCutover || GJChronology.this.iGapDuration + roundFloor >= this.iCutover) {
                return roundFloor;
            }
            return gregorianToJulian(roundFloor);
        }

        public long set(long j, int i) {
            long j2;
            if (j >= this.iCutover) {
                j2 = this.iGregorianField.set(j, i);
                if (j2 < this.iCutover) {
                    if (GJChronology.this.iGapDuration + j2 < this.iCutover) {
                        j2 = gregorianToJulian(j2);
                    }
                    if (get(j2) != i) {
                        throw new IllegalFieldValueException(this.iGregorianField.getType(), (Number) Integer.valueOf(i), (Number) null, (Number) null);
                    }
                }
            } else {
                j2 = this.iJulianField.set(j, i);
                if (j2 >= this.iCutover) {
                    if (j2 - GJChronology.this.iGapDuration >= this.iCutover) {
                        j2 = julianToGregorian(j2);
                    }
                    if (get(j2) != i) {
                        throw new IllegalFieldValueException(this.iJulianField.getType(), (Number) Integer.valueOf(i), (Number) null, (Number) null);
                    }
                }
            }
            return j2;
        }

        CutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, long j, boolean z) {
            this(dateTimeField, dateTimeField2, null, j, z);
        }

        public long add(long j, long j2) {
            return this.iGregorianField.add(j, j2);
        }

        public int getMaximumValue(long j) {
            if (j >= this.iCutover) {
                return this.iGregorianField.getMaximumValue(j);
            }
            int maximumValue = this.iJulianField.getMaximumValue(j);
            long j2 = this.iJulianField.set(j, maximumValue);
            long j3 = this.iCutover;
            if (j2 >= j3) {
                DateTimeField dateTimeField = this.iJulianField;
                maximumValue = dateTimeField.get(dateTimeField.add(j3, -1));
            }
            return maximumValue;
        }

        public int getMinimumValue(ReadablePartial readablePartial) {
            return this.iJulianField.getMinimumValue(readablePartial);
        }

        CutoverField(DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, long j, boolean z) {
            super(dateTimeField2.getType());
            this.iJulianField = dateTimeField;
            this.iGregorianField = dateTimeField2;
            this.iCutover = j;
            this.iConvertByWeekyear = z;
            this.iDurationField = dateTimeField2.getDurationField();
            if (durationField == null) {
                durationField = dateTimeField2.getRangeDurationField();
                if (durationField == null) {
                    durationField = dateTimeField.getRangeDurationField();
                }
            }
            this.iRangeDurationField = durationField;
        }

        public int[] add(ReadablePartial readablePartial, int i, int[] iArr, int i2) {
            if (i2 == 0) {
                return iArr;
            }
            if (!DateTimeUtils.isContiguous(readablePartial)) {
                return super.add(readablePartial, i, iArr, i2);
            }
            long j = 0;
            int size = readablePartial.size();
            for (int i3 = 0; i3 < size; i3++) {
                j = readablePartial.getFieldType(i3).getField(GJChronology.this).set(j, iArr[i3]);
            }
            return GJChronology.this.get(readablePartial, add(j, i2));
        }

        public int getMinimumValue(ReadablePartial readablePartial, int[] iArr) {
            return this.iJulianField.getMinimumValue(readablePartial, iArr);
        }

        public String getAsShortText(int i, Locale locale) {
            return this.iGregorianField.getAsShortText(i, locale);
        }

        public String getAsText(int i, Locale locale) {
            return this.iGregorianField.getAsText(i, locale);
        }

        public int getMinimumValue(long j) {
            if (j < this.iCutover) {
                return this.iJulianField.getMinimumValue(j);
            }
            int minimumValue = this.iGregorianField.getMinimumValue(j);
            long j2 = this.iGregorianField.set(j, minimumValue);
            long j3 = this.iCutover;
            if (j2 < j3) {
                minimumValue = this.iGregorianField.get(j3);
            }
            return minimumValue;
        }

        public int getMaximumValue(ReadablePartial readablePartial) {
            return getMaximumValue(GJChronology.getInstanceUTC().set(readablePartial, 0));
        }

        public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
            GJChronology instanceUTC = GJChronology.getInstanceUTC();
            int size = readablePartial.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                DateTimeField field = readablePartial.getFieldType(i).getField(instanceUTC);
                if (iArr[i] <= field.getMaximumValue(j)) {
                    j = field.set(j, iArr[i]);
                }
            }
            return getMaximumValue(j);
        }

        public long set(long j, String str, Locale locale) {
            if (j >= this.iCutover) {
                long j2 = this.iGregorianField.set(j, str, locale);
                if (j2 >= this.iCutover || GJChronology.this.iGapDuration + j2 >= this.iCutover) {
                    return j2;
                }
                return gregorianToJulian(j2);
            }
            long j3 = this.iJulianField.set(j, str, locale);
            return (j3 < this.iCutover || j3 - GJChronology.this.iGapDuration < this.iCutover) ? j3 : julianToGregorian(j3);
        }
    }

    private final class ImpreciseCutoverField extends CutoverField {
        private static final long serialVersionUID = 3410248757173576441L;

        ImpreciseCutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, long j) {
            this(dateTimeField, dateTimeField2, (DurationField) null, j, false);
        }

        public long add(long j, int i) {
            if (j >= this.iCutover) {
                long add = this.iGregorianField.add(j, i);
                if (add >= this.iCutover || GJChronology.this.iGapDuration + add >= this.iCutover) {
                    return add;
                }
                if (this.iConvertByWeekyear) {
                    if (GJChronology.this.iGregorianChronology.weekyear().get(add) <= 0) {
                        add = GJChronology.this.iGregorianChronology.weekyear().add(add, -1);
                    }
                } else if (GJChronology.this.iGregorianChronology.year().get(add) <= 0) {
                    add = GJChronology.this.iGregorianChronology.year().add(add, -1);
                }
                return gregorianToJulian(add);
            }
            long add2 = this.iJulianField.add(j, i);
            return (add2 < this.iCutover || add2 - GJChronology.this.iGapDuration < this.iCutover) ? add2 : julianToGregorian(add2);
        }

        public int getDifference(long j, long j2) {
            long j3 = this.iCutover;
            if (j >= j3) {
                if (j2 >= j3) {
                    return this.iGregorianField.getDifference(j, j2);
                }
                return this.iJulianField.getDifference(gregorianToJulian(j), j2);
            } else if (j2 < j3) {
                return this.iJulianField.getDifference(j, j2);
            } else {
                return this.iGregorianField.getDifference(julianToGregorian(j), j2);
            }
        }

        public long getDifferenceAsLong(long j, long j2) {
            long j3 = this.iCutover;
            if (j >= j3) {
                if (j2 >= j3) {
                    return this.iGregorianField.getDifferenceAsLong(j, j2);
                }
                return this.iJulianField.getDifferenceAsLong(gregorianToJulian(j), j2);
            } else if (j2 < j3) {
                return this.iJulianField.getDifferenceAsLong(j, j2);
            } else {
                return this.iGregorianField.getDifferenceAsLong(julianToGregorian(j), j2);
            }
        }

        public int getMaximumValue(long j) {
            if (j >= this.iCutover) {
                return this.iGregorianField.getMaximumValue(j);
            }
            return this.iJulianField.getMaximumValue(j);
        }

        public int getMinimumValue(long j) {
            if (j >= this.iCutover) {
                return this.iGregorianField.getMinimumValue(j);
            }
            return this.iJulianField.getMinimumValue(j);
        }

        ImpreciseCutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, long j) {
            this(dateTimeField, dateTimeField2, durationField, j, false);
        }

        ImpreciseCutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, DurationField durationField2, long j) {
            this(dateTimeField, dateTimeField2, durationField, j, false);
            this.iRangeDurationField = durationField2;
        }

        ImpreciseCutoverField(DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, long j, boolean z) {
            super(GJChronology.this, dateTimeField, dateTimeField2, j, z);
            if (durationField == null) {
                durationField = new LinkedDurationField(this.iDurationField, this);
            }
            this.iDurationField = durationField;
        }

        public long add(long j, long j2) {
            if (j >= this.iCutover) {
                long add = this.iGregorianField.add(j, j2);
                if (add >= this.iCutover || GJChronology.this.iGapDuration + add >= this.iCutover) {
                    return add;
                }
                if (this.iConvertByWeekyear) {
                    if (GJChronology.this.iGregorianChronology.weekyear().get(add) <= 0) {
                        add = GJChronology.this.iGregorianChronology.weekyear().add(add, -1);
                    }
                } else if (GJChronology.this.iGregorianChronology.year().get(add) <= 0) {
                    add = GJChronology.this.iGregorianChronology.year().add(add, -1);
                }
                return gregorianToJulian(add);
            }
            long add2 = this.iJulianField.add(j, j2);
            return (add2 < this.iCutover || add2 - GJChronology.this.iGapDuration < this.iCutover) ? add2 : julianToGregorian(add2);
        }
    }

    private static class LinkedDurationField extends DecoratedDurationField {
        private static final long serialVersionUID = 4097975388007713084L;
        private final ImpreciseCutoverField iField;

        LinkedDurationField(DurationField durationField, ImpreciseCutoverField impreciseCutoverField) {
            super(durationField, durationField.getType());
            this.iField = impreciseCutoverField;
        }

        public long add(long j, int i) {
            return this.iField.add(j, i);
        }

        public int getDifference(long j, long j2) {
            return this.iField.getDifference(j, j2);
        }

        public long getDifferenceAsLong(long j, long j2) {
            return this.iField.getDifferenceAsLong(j, j2);
        }

        public long add(long j, long j2) {
            return this.iField.add(j, j2);
        }
    }

    private GJChronology(JulianChronology julianChronology, GregorianChronology gregorianChronology, Instant instant) {
        super(null, new Object[]{julianChronology, gregorianChronology, instant});
    }

    private static long convertByWeekyear(long j, Chronology chronology, Chronology chronology2) {
        return chronology2.millisOfDay().set(chronology2.dayOfWeek().set(chronology2.weekOfWeekyear().set(chronology2.weekyear().set(0, chronology.weekyear().get(j)), chronology.weekOfWeekyear().get(j)), chronology.dayOfWeek().get(j)), chronology.millisOfDay().get(j));
    }

    private static long convertByYear(long j, Chronology chronology, Chronology chronology2) {
        return chronology2.getDateTimeMillis(chronology.year().get(j), chronology.monthOfYear().get(j), chronology.dayOfMonth().get(j), chronology.millisOfDay().get(j));
    }

    public static GJChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), (ReadableInstant) DEFAULT_CUTOVER, 4);
    }

    public static GJChronology getInstanceUTC() {
        return getInstance(DateTimeZone.UTC, (ReadableInstant) DEFAULT_CUTOVER, 4);
    }

    private Object readResolve() {
        return getInstance(getZone(), (ReadableInstant) this.iCutoverInstant, getMinimumDaysInFirstWeek());
    }

    /* access modifiers changed from: protected */
    public void assemble(Fields fields) {
        Object[] objArr = (Object[]) getParam();
        JulianChronology julianChronology = (JulianChronology) objArr[0];
        GregorianChronology gregorianChronology = (GregorianChronology) objArr[1];
        Instant instant = (Instant) objArr[2];
        this.iCutoverMillis = instant.getMillis();
        this.iJulianChronology = julianChronology;
        this.iGregorianChronology = gregorianChronology;
        this.iCutoverInstant = instant;
        if (getBase() == null) {
            if (julianChronology.getMinimumDaysInFirstWeek() == gregorianChronology.getMinimumDaysInFirstWeek()) {
                long j = this.iCutoverMillis;
                this.iGapDuration = j - julianToGregorianByYear(j);
                fields.copyFieldsFrom(gregorianChronology);
                if (gregorianChronology.millisOfDay().get(this.iCutoverMillis) == 0) {
                    CutoverField cutoverField = new CutoverField(this, julianChronology.millisOfSecond(), fields.millisOfSecond, this.iCutoverMillis);
                    fields.millisOfSecond = cutoverField;
                    CutoverField cutoverField2 = new CutoverField(this, julianChronology.millisOfDay(), fields.millisOfDay, this.iCutoverMillis);
                    fields.millisOfDay = cutoverField2;
                    CutoverField cutoverField3 = new CutoverField(this, julianChronology.secondOfMinute(), fields.secondOfMinute, this.iCutoverMillis);
                    fields.secondOfMinute = cutoverField3;
                    CutoverField cutoverField4 = new CutoverField(this, julianChronology.secondOfDay(), fields.secondOfDay, this.iCutoverMillis);
                    fields.secondOfDay = cutoverField4;
                    CutoverField cutoverField5 = new CutoverField(this, julianChronology.minuteOfHour(), fields.minuteOfHour, this.iCutoverMillis);
                    fields.minuteOfHour = cutoverField5;
                    CutoverField cutoverField6 = new CutoverField(this, julianChronology.minuteOfDay(), fields.minuteOfDay, this.iCutoverMillis);
                    fields.minuteOfDay = cutoverField6;
                    CutoverField cutoverField7 = new CutoverField(this, julianChronology.hourOfDay(), fields.hourOfDay, this.iCutoverMillis);
                    fields.hourOfDay = cutoverField7;
                    CutoverField cutoverField8 = new CutoverField(this, julianChronology.hourOfHalfday(), fields.hourOfHalfday, this.iCutoverMillis);
                    fields.hourOfHalfday = cutoverField8;
                    CutoverField cutoverField9 = new CutoverField(this, julianChronology.clockhourOfDay(), fields.clockhourOfDay, this.iCutoverMillis);
                    fields.clockhourOfDay = cutoverField9;
                    CutoverField cutoverField10 = new CutoverField(this, julianChronology.clockhourOfHalfday(), fields.clockhourOfHalfday, this.iCutoverMillis);
                    fields.clockhourOfHalfday = cutoverField10;
                    CutoverField cutoverField11 = new CutoverField(this, julianChronology.halfdayOfDay(), fields.halfdayOfDay, this.iCutoverMillis);
                    fields.halfdayOfDay = cutoverField11;
                }
                CutoverField cutoverField12 = new CutoverField(this, julianChronology.era(), fields.era, this.iCutoverMillis);
                fields.era = cutoverField12;
                ImpreciseCutoverField impreciseCutoverField = new ImpreciseCutoverField(this, julianChronology.year(), fields.year, this.iCutoverMillis);
                fields.year = impreciseCutoverField;
                fields.years = fields.year.getDurationField();
                ImpreciseCutoverField impreciseCutoverField2 = new ImpreciseCutoverField(this, julianChronology.yearOfEra(), fields.yearOfEra, fields.years, this.iCutoverMillis);
                fields.yearOfEra = impreciseCutoverField2;
                ImpreciseCutoverField impreciseCutoverField3 = new ImpreciseCutoverField(this, julianChronology.centuryOfEra(), fields.centuryOfEra, this.iCutoverMillis);
                fields.centuryOfEra = impreciseCutoverField3;
                fields.centuries = fields.centuryOfEra.getDurationField();
                ImpreciseCutoverField impreciseCutoverField4 = new ImpreciseCutoverField(this, julianChronology.yearOfCentury(), fields.yearOfCentury, fields.years, fields.centuries, this.iCutoverMillis);
                fields.yearOfCentury = impreciseCutoverField4;
                ImpreciseCutoverField impreciseCutoverField5 = new ImpreciseCutoverField(this, julianChronology.monthOfYear(), fields.monthOfYear, (DurationField) null, fields.years, this.iCutoverMillis);
                fields.monthOfYear = impreciseCutoverField5;
                fields.months = fields.monthOfYear.getDurationField();
                ImpreciseCutoverField impreciseCutoverField6 = new ImpreciseCutoverField(julianChronology.weekyear(), fields.weekyear, (DurationField) null, this.iCutoverMillis, true);
                fields.weekyear = impreciseCutoverField6;
                fields.weekyears = fields.weekyear.getDurationField();
                ImpreciseCutoverField impreciseCutoverField7 = new ImpreciseCutoverField(this, julianChronology.weekyearOfCentury(), fields.weekyearOfCentury, fields.weekyears, fields.centuries, this.iCutoverMillis);
                fields.weekyearOfCentury = impreciseCutoverField7;
                CutoverField cutoverField13 = new CutoverField(julianChronology.dayOfYear(), fields.dayOfYear, fields.years, gregorianChronology.year().roundCeiling(this.iCutoverMillis), false);
                fields.dayOfYear = cutoverField13;
                CutoverField cutoverField14 = new CutoverField(julianChronology.weekOfWeekyear(), fields.weekOfWeekyear, fields.weekyears, gregorianChronology.weekyear().roundCeiling(this.iCutoverMillis), true);
                fields.weekOfWeekyear = cutoverField14;
                CutoverField cutoverField15 = new CutoverField(this, julianChronology.dayOfMonth(), fields.dayOfMonth, this.iCutoverMillis);
                cutoverField15.iRangeDurationField = fields.months;
                fields.dayOfMonth = cutoverField15;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GJChronology)) {
            return false;
        }
        GJChronology gJChronology = (GJChronology) obj;
        if (!(this.iCutoverMillis == gJChronology.iCutoverMillis && getMinimumDaysInFirstWeek() == gJChronology.getMinimumDaysInFirstWeek() && getZone().equals(gJChronology.getZone()))) {
            z = false;
        }
        return z;
    }

    public long getDateTimeMillis(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        Chronology base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i, i2, i3, i4);
        }
        long dateTimeMillis = this.iGregorianChronology.getDateTimeMillis(i, i2, i3, i4);
        if (dateTimeMillis < this.iCutoverMillis) {
            dateTimeMillis = this.iJulianChronology.getDateTimeMillis(i, i2, i3, i4);
            if (dateTimeMillis >= this.iCutoverMillis) {
                throw new IllegalArgumentException("Specified date does not exist");
            }
        }
        return dateTimeMillis;
    }

    public Instant getGregorianCutover() {
        return this.iCutoverInstant;
    }

    public int getMinimumDaysInFirstWeek() {
        return this.iGregorianChronology.getMinimumDaysInFirstWeek();
    }

    public DateTimeZone getZone() {
        Chronology base = getBase();
        if (base != null) {
            return base.getZone();
        }
        return DateTimeZone.UTC;
    }

    /* access modifiers changed from: 0000 */
    public long gregorianToJulianByWeekyear(long j) {
        return convertByWeekyear(j, this.iGregorianChronology, this.iJulianChronology);
    }

    /* access modifiers changed from: 0000 */
    public long gregorianToJulianByYear(long j) {
        return convertByYear(j, this.iGregorianChronology, this.iJulianChronology);
    }

    public int hashCode() {
        return ("GJ".hashCode() * 11) + getZone().hashCode() + getMinimumDaysInFirstWeek() + this.iCutoverInstant.hashCode();
    }

    /* access modifiers changed from: 0000 */
    public long julianToGregorianByWeekyear(long j) {
        return convertByWeekyear(j, this.iJulianChronology, this.iGregorianChronology);
    }

    /* access modifiers changed from: 0000 */
    public long julianToGregorianByYear(long j) {
        return convertByYear(j, this.iJulianChronology, this.iGregorianChronology);
    }

    public String toString() {
        DateTimeFormatter dateTimeFormatter;
        StringBuffer stringBuffer = new StringBuffer(60);
        stringBuffer.append("GJChronology");
        stringBuffer.append('[');
        stringBuffer.append(getZone().getID());
        if (this.iCutoverMillis != DEFAULT_CUTOVER.getMillis()) {
            stringBuffer.append(",cutover=");
            if (withUTC().dayOfYear().remainder(this.iCutoverMillis) == 0) {
                dateTimeFormatter = ISODateTimeFormat.date();
            } else {
                dateTimeFormatter = ISODateTimeFormat.dateTime();
            }
            dateTimeFormatter.withChronology(withUTC()).printTo(stringBuffer, this.iCutoverMillis);
        }
        if (getMinimumDaysInFirstWeek() != 4) {
            stringBuffer.append(",mdfw=");
            stringBuffer.append(getMinimumDaysInFirstWeek());
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    public Chronology withUTC() {
        return withZone(DateTimeZone.UTC);
    }

    public Chronology withZone(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        if (dateTimeZone == getZone()) {
            return this;
        }
        return getInstance(dateTimeZone, (ReadableInstant) this.iCutoverInstant, getMinimumDaysInFirstWeek());
    }

    private GJChronology(Chronology chronology, JulianChronology julianChronology, GregorianChronology gregorianChronology, Instant instant) {
        super(chronology, new Object[]{julianChronology, gregorianChronology, instant});
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, (ReadableInstant) DEFAULT_CUTOVER, 4);
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone, ReadableInstant readableInstant) {
        return getInstance(dateTimeZone, readableInstant, 4);
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone, ReadableInstant readableInstant, int i) {
        Instant instant;
        GJChronology gJChronology;
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        if (readableInstant == null) {
            instant = DEFAULT_CUTOVER;
        } else {
            instant = readableInstant.toInstant();
            if (new LocalDate(instant.getMillis(), (Chronology) GregorianChronology.getInstance(zone)).getYear() <= 0) {
                throw new IllegalArgumentException("Cutover too early. Must be on or after 0001-01-01.");
            }
        }
        GJCacheKey gJCacheKey = new GJCacheKey(zone, instant, i);
        GJChronology gJChronology2 = (GJChronology) cCache.get(gJCacheKey);
        if (gJChronology2 != null) {
            return gJChronology2;
        }
        DateTimeZone dateTimeZone2 = DateTimeZone.UTC;
        if (zone == dateTimeZone2) {
            gJChronology = new GJChronology(JulianChronology.getInstance(zone, i), GregorianChronology.getInstance(zone, i), instant);
        } else {
            GJChronology instance = getInstance(dateTimeZone2, (ReadableInstant) instant, i);
            gJChronology = new GJChronology(ZonedChronology.getInstance(instance, zone), instance.iJulianChronology, instance.iGregorianChronology, instance.iCutoverInstant);
        }
        GJChronology gJChronology3 = (GJChronology) cCache.putIfAbsent(gJCacheKey, gJChronology);
        return gJChronology3 != null ? gJChronology3 : gJChronology;
    }

    public long getDateTimeMillis(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        long j;
        Chronology base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
        }
        try {
            j = this.iGregorianChronology.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
            int i8 = i2;
            int i9 = i3;
        } catch (IllegalFieldValueException e) {
            if (i2 == 2 && i3 == 29) {
                j = this.iGregorianChronology.getDateTimeMillis(i, i2, 28, i4, i5, i6, i7);
                if (j >= this.iCutoverMillis) {
                    throw e;
                }
            } else {
                throw e;
            }
        }
        if (j < this.iCutoverMillis) {
            j = this.iJulianChronology.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
            if (j >= this.iCutoverMillis) {
                throw new IllegalArgumentException("Specified date does not exist");
            }
        }
        return j;
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone, long j, int i) {
        ReadableInstant readableInstant;
        if (j == DEFAULT_CUTOVER.getMillis()) {
            readableInstant = null;
        } else {
            readableInstant = new Instant(j);
        }
        return getInstance(dateTimeZone, readableInstant, i);
    }
}
