package org.joda.time.chrono;

import java.util.HashMap;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.AssembledChronology.Fields;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.BaseDurationField;

public final class ZonedChronology extends AssembledChronology {
    private static final long NEAR_ZERO = 604800000;
    private static final long serialVersionUID = -1079258847191166848L;

    static final class ZonedDateTimeField extends BaseDateTimeField {
        private static final long serialVersionUID = -3968986277775529794L;
        final DurationField iDurationField;
        final DateTimeField iField;
        final DurationField iLeapDurationField;
        final DurationField iRangeDurationField;
        final boolean iTimeField;
        final DateTimeZone iZone;

        ZonedDateTimeField(DateTimeField dateTimeField, DateTimeZone dateTimeZone, DurationField durationField, DurationField durationField2, DurationField durationField3) {
            super(dateTimeField.getType());
            if (dateTimeField.isSupported()) {
                this.iField = dateTimeField;
                this.iZone = dateTimeZone;
                this.iDurationField = durationField;
                this.iTimeField = ZonedChronology.useTimeArithmetic(durationField);
                this.iRangeDurationField = durationField2;
                this.iLeapDurationField = durationField3;
                return;
            }
            throw new IllegalArgumentException();
        }

        private int getOffsetToAdd(long j) {
            int offset = this.iZone.getOffset(j);
            long j2 = (long) offset;
            if (((j + j2) ^ j) >= 0 || (j ^ j2) < 0) {
                return offset;
            }
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }

        public long add(long j, int i) {
            if (this.iTimeField) {
                long offsetToAdd = (long) getOffsetToAdd(j);
                return this.iField.add(j + offsetToAdd, i) - offsetToAdd;
            }
            return this.iZone.convertLocalToUTC(this.iField.add(this.iZone.convertUTCToLocal(j), i), false, j);
        }

        public long addWrapField(long j, int i) {
            if (this.iTimeField) {
                long offsetToAdd = (long) getOffsetToAdd(j);
                return this.iField.addWrapField(j + offsetToAdd, i) - offsetToAdd;
            }
            return this.iZone.convertLocalToUTC(this.iField.addWrapField(this.iZone.convertUTCToLocal(j), i), false, j);
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ZonedDateTimeField)) {
                return false;
            }
            ZonedDateTimeField zonedDateTimeField = (ZonedDateTimeField) obj;
            if (!this.iField.equals(zonedDateTimeField.iField) || !this.iZone.equals(zonedDateTimeField.iZone) || !this.iDurationField.equals(zonedDateTimeField.iDurationField) || !this.iRangeDurationField.equals(zonedDateTimeField.iRangeDurationField)) {
                z = false;
            }
            return z;
        }

        public int get(long j) {
            return this.iField.get(this.iZone.convertUTCToLocal(j));
        }

        public String getAsShortText(long j, Locale locale) {
            return this.iField.getAsShortText(this.iZone.convertUTCToLocal(j), locale);
        }

        public String getAsText(long j, Locale locale) {
            return this.iField.getAsText(this.iZone.convertUTCToLocal(j), locale);
        }

        public int getDifference(long j, long j2) {
            int i;
            int offsetToAdd = getOffsetToAdd(j2);
            DateTimeField dateTimeField = this.iField;
            if (this.iTimeField) {
                i = offsetToAdd;
            } else {
                i = getOffsetToAdd(j);
            }
            return dateTimeField.getDifference(j + ((long) i), j2 + ((long) offsetToAdd));
        }

        public long getDifferenceAsLong(long j, long j2) {
            int i;
            int offsetToAdd = getOffsetToAdd(j2);
            DateTimeField dateTimeField = this.iField;
            if (this.iTimeField) {
                i = offsetToAdd;
            } else {
                i = getOffsetToAdd(j);
            }
            return dateTimeField.getDifferenceAsLong(j + ((long) i), j2 + ((long) offsetToAdd));
        }

        public final DurationField getDurationField() {
            return this.iDurationField;
        }

        public int getLeapAmount(long j) {
            return this.iField.getLeapAmount(this.iZone.convertUTCToLocal(j));
        }

        public final DurationField getLeapDurationField() {
            return this.iLeapDurationField;
        }

        public int getMaximumShortTextLength(Locale locale) {
            return this.iField.getMaximumShortTextLength(locale);
        }

        public int getMaximumTextLength(Locale locale) {
            return this.iField.getMaximumTextLength(locale);
        }

        public int getMaximumValue() {
            return this.iField.getMaximumValue();
        }

        public int getMinimumValue() {
            return this.iField.getMinimumValue();
        }

        public final DurationField getRangeDurationField() {
            return this.iRangeDurationField;
        }

        public int hashCode() {
            return this.iField.hashCode() ^ this.iZone.hashCode();
        }

        public boolean isLeap(long j) {
            return this.iField.isLeap(this.iZone.convertUTCToLocal(j));
        }

        public boolean isLenient() {
            return this.iField.isLenient();
        }

        public long remainder(long j) {
            return this.iField.remainder(this.iZone.convertUTCToLocal(j));
        }

        public long roundCeiling(long j) {
            if (this.iTimeField) {
                long offsetToAdd = (long) getOffsetToAdd(j);
                return this.iField.roundCeiling(j + offsetToAdd) - offsetToAdd;
            }
            return this.iZone.convertLocalToUTC(this.iField.roundCeiling(this.iZone.convertUTCToLocal(j)), false, j);
        }

        public long roundFloor(long j) {
            if (this.iTimeField) {
                long offsetToAdd = (long) getOffsetToAdd(j);
                return this.iField.roundFloor(j + offsetToAdd) - offsetToAdd;
            }
            return this.iZone.convertLocalToUTC(this.iField.roundFloor(this.iZone.convertUTCToLocal(j)), false, j);
        }

        public long set(long j, int i) {
            long j2 = this.iField.set(this.iZone.convertUTCToLocal(j), i);
            long convertLocalToUTC = this.iZone.convertLocalToUTC(j2, false, j);
            if (get(convertLocalToUTC) == i) {
                return convertLocalToUTC;
            }
            IllegalInstantException illegalInstantException = new IllegalInstantException(j2, this.iZone.getID());
            IllegalFieldValueException illegalFieldValueException = new IllegalFieldValueException(this.iField.getType(), Integer.valueOf(i), illegalInstantException.getMessage());
            illegalFieldValueException.initCause(illegalInstantException);
            throw illegalFieldValueException;
        }

        public int getMaximumValue(long j) {
            return this.iField.getMaximumValue(this.iZone.convertUTCToLocal(j));
        }

        public int getMinimumValue(long j) {
            return this.iField.getMinimumValue(this.iZone.convertUTCToLocal(j));
        }

        public String getAsShortText(int i, Locale locale) {
            return this.iField.getAsShortText(i, locale);
        }

        public String getAsText(int i, Locale locale) {
            return this.iField.getAsText(i, locale);
        }

        public int getMaximumValue(ReadablePartial readablePartial) {
            return this.iField.getMaximumValue(readablePartial);
        }

        public int getMinimumValue(ReadablePartial readablePartial) {
            return this.iField.getMinimumValue(readablePartial);
        }

        public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
            return this.iField.getMaximumValue(readablePartial, iArr);
        }

        public int getMinimumValue(ReadablePartial readablePartial, int[] iArr) {
            return this.iField.getMinimumValue(readablePartial, iArr);
        }

        public long add(long j, long j2) {
            if (this.iTimeField) {
                long offsetToAdd = (long) getOffsetToAdd(j);
                return this.iField.add(j + offsetToAdd, j2) - offsetToAdd;
            }
            return this.iZone.convertLocalToUTC(this.iField.add(this.iZone.convertUTCToLocal(j), j2), false, j);
        }

        public long set(long j, String str, Locale locale) {
            return this.iZone.convertLocalToUTC(this.iField.set(this.iZone.convertUTCToLocal(j), str, locale), false, j);
        }
    }

    static class ZonedDurationField extends BaseDurationField {
        private static final long serialVersionUID = -485345310999208286L;
        final DurationField iField;
        final boolean iTimeField;
        final DateTimeZone iZone;

        ZonedDurationField(DurationField durationField, DateTimeZone dateTimeZone) {
            super(durationField.getType());
            if (durationField.isSupported()) {
                this.iField = durationField;
                this.iTimeField = ZonedChronology.useTimeArithmetic(durationField);
                this.iZone = dateTimeZone;
                return;
            }
            throw new IllegalArgumentException();
        }

        private long addOffset(long j) {
            return this.iZone.convertUTCToLocal(j);
        }

        private int getOffsetFromLocalToSubtract(long j) {
            int offsetFromLocal = this.iZone.getOffsetFromLocal(j);
            long j2 = (long) offsetFromLocal;
            if (((j - j2) ^ j) >= 0 || (j ^ j2) >= 0) {
                return offsetFromLocal;
            }
            throw new ArithmeticException("Subtracting time zone offset caused overflow");
        }

        private int getOffsetToAdd(long j) {
            int offset = this.iZone.getOffset(j);
            long j2 = (long) offset;
            if (((j + j2) ^ j) >= 0 || (j ^ j2) < 0) {
                return offset;
            }
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }

        public long add(long j, int i) {
            int offsetToAdd = getOffsetToAdd(j);
            long add = this.iField.add(j + ((long) offsetToAdd), i);
            if (!this.iTimeField) {
                offsetToAdd = getOffsetFromLocalToSubtract(add);
            }
            return add - ((long) offsetToAdd);
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ZonedDurationField)) {
                return false;
            }
            ZonedDurationField zonedDurationField = (ZonedDurationField) obj;
            if (!this.iField.equals(zonedDurationField.iField) || !this.iZone.equals(zonedDurationField.iZone)) {
                z = false;
            }
            return z;
        }

        public int getDifference(long j, long j2) {
            int i;
            int offsetToAdd = getOffsetToAdd(j2);
            DurationField durationField = this.iField;
            if (this.iTimeField) {
                i = offsetToAdd;
            } else {
                i = getOffsetToAdd(j);
            }
            return durationField.getDifference(j + ((long) i), j2 + ((long) offsetToAdd));
        }

        public long getDifferenceAsLong(long j, long j2) {
            int i;
            int offsetToAdd = getOffsetToAdd(j2);
            DurationField durationField = this.iField;
            if (this.iTimeField) {
                i = offsetToAdd;
            } else {
                i = getOffsetToAdd(j);
            }
            return durationField.getDifferenceAsLong(j + ((long) i), j2 + ((long) offsetToAdd));
        }

        public long getMillis(int i, long j) {
            return this.iField.getMillis(i, addOffset(j));
        }

        public long getUnitMillis() {
            return this.iField.getUnitMillis();
        }

        public int getValue(long j, long j2) {
            return this.iField.getValue(j, addOffset(j2));
        }

        public long getValueAsLong(long j, long j2) {
            return this.iField.getValueAsLong(j, addOffset(j2));
        }

        public int hashCode() {
            return this.iField.hashCode() ^ this.iZone.hashCode();
        }

        public boolean isPrecise() {
            if (this.iTimeField) {
                return this.iField.isPrecise();
            }
            return this.iField.isPrecise() && this.iZone.isFixed();
        }

        public long getMillis(long j, long j2) {
            return this.iField.getMillis(j, addOffset(j2));
        }

        public long add(long j, long j2) {
            int offsetToAdd = getOffsetToAdd(j);
            long add = this.iField.add(j + ((long) offsetToAdd), j2);
            if (!this.iTimeField) {
                offsetToAdd = getOffsetFromLocalToSubtract(add);
            }
            return add - ((long) offsetToAdd);
        }
    }

    private ZonedChronology(Chronology chronology, DateTimeZone dateTimeZone) {
        super(chronology, dateTimeZone);
    }

    private DurationField convertField(DurationField durationField, HashMap<Object, Object> hashMap) {
        if (durationField == null || !durationField.isSupported()) {
            return durationField;
        }
        if (hashMap.containsKey(durationField)) {
            return (DurationField) hashMap.get(durationField);
        }
        ZonedDurationField zonedDurationField = new ZonedDurationField(durationField, getZone());
        hashMap.put(durationField, zonedDurationField);
        return zonedDurationField;
    }

    public static ZonedChronology getInstance(Chronology chronology, DateTimeZone dateTimeZone) {
        if (chronology != null) {
            Chronology withUTC = chronology.withUTC();
            if (withUTC == null) {
                throw new IllegalArgumentException("UTC chronology must not be null");
            } else if (dateTimeZone != null) {
                return new ZonedChronology(withUTC, dateTimeZone);
            } else {
                throw new IllegalArgumentException("DateTimeZone must not be null");
            }
        } else {
            throw new IllegalArgumentException("Must supply a chronology");
        }
    }

    private long localToUTC(long j) {
        if (j == Long.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        if (j == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        DateTimeZone zone = getZone();
        int offsetFromLocal = zone.getOffsetFromLocal(j);
        long j2 = j - ((long) offsetFromLocal);
        if (j > NEAR_ZERO && j2 < 0) {
            return Long.MAX_VALUE;
        }
        if (j < -604800000 && j2 > 0) {
            return Long.MIN_VALUE;
        }
        if (offsetFromLocal == zone.getOffset(j2)) {
            return j2;
        }
        throw new IllegalInstantException(j, zone.getID());
    }

    static boolean useTimeArithmetic(DurationField durationField) {
        return durationField != null && durationField.getUnitMillis() < 43200000;
    }

    /* access modifiers changed from: protected */
    public void assemble(Fields fields) {
        HashMap hashMap = new HashMap();
        fields.eras = convertField(fields.eras, hashMap);
        fields.centuries = convertField(fields.centuries, hashMap);
        fields.years = convertField(fields.years, hashMap);
        fields.months = convertField(fields.months, hashMap);
        fields.weekyears = convertField(fields.weekyears, hashMap);
        fields.weeks = convertField(fields.weeks, hashMap);
        fields.days = convertField(fields.days, hashMap);
        fields.halfdays = convertField(fields.halfdays, hashMap);
        fields.hours = convertField(fields.hours, hashMap);
        fields.minutes = convertField(fields.minutes, hashMap);
        fields.seconds = convertField(fields.seconds, hashMap);
        fields.millis = convertField(fields.millis, hashMap);
        fields.year = convertField(fields.year, hashMap);
        fields.yearOfEra = convertField(fields.yearOfEra, hashMap);
        fields.yearOfCentury = convertField(fields.yearOfCentury, hashMap);
        fields.centuryOfEra = convertField(fields.centuryOfEra, hashMap);
        fields.era = convertField(fields.era, hashMap);
        fields.dayOfWeek = convertField(fields.dayOfWeek, hashMap);
        fields.dayOfMonth = convertField(fields.dayOfMonth, hashMap);
        fields.dayOfYear = convertField(fields.dayOfYear, hashMap);
        fields.monthOfYear = convertField(fields.monthOfYear, hashMap);
        fields.weekOfWeekyear = convertField(fields.weekOfWeekyear, hashMap);
        fields.weekyear = convertField(fields.weekyear, hashMap);
        fields.weekyearOfCentury = convertField(fields.weekyearOfCentury, hashMap);
        fields.millisOfSecond = convertField(fields.millisOfSecond, hashMap);
        fields.millisOfDay = convertField(fields.millisOfDay, hashMap);
        fields.secondOfMinute = convertField(fields.secondOfMinute, hashMap);
        fields.secondOfDay = convertField(fields.secondOfDay, hashMap);
        fields.minuteOfHour = convertField(fields.minuteOfHour, hashMap);
        fields.minuteOfDay = convertField(fields.minuteOfDay, hashMap);
        fields.hourOfDay = convertField(fields.hourOfDay, hashMap);
        fields.hourOfHalfday = convertField(fields.hourOfHalfday, hashMap);
        fields.clockhourOfDay = convertField(fields.clockhourOfDay, hashMap);
        fields.clockhourOfHalfday = convertField(fields.clockhourOfHalfday, hashMap);
        fields.halfdayOfDay = convertField(fields.halfdayOfDay, hashMap);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedChronology)) {
            return false;
        }
        ZonedChronology zonedChronology = (ZonedChronology) obj;
        if (!getBase().equals(zonedChronology.getBase()) || !getZone().equals(zonedChronology.getZone())) {
            z = false;
        }
        return z;
    }

    public long getDateTimeMillis(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        return localToUTC(getBase().getDateTimeMillis(i, i2, i3, i4));
    }

    public DateTimeZone getZone() {
        return (DateTimeZone) getParam();
    }

    public int hashCode() {
        return (getZone().hashCode() * 11) + 326565 + (getBase().hashCode() * 7);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ZonedChronology[");
        sb.append(getBase());
        sb.append(", ");
        sb.append(getZone().getID());
        sb.append(']');
        return sb.toString();
    }

    public Chronology withUTC() {
        return getBase();
    }

    public Chronology withZone(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        if (dateTimeZone == getParam()) {
            return this;
        }
        if (dateTimeZone == DateTimeZone.UTC) {
            return getBase();
        }
        return new ZonedChronology(getBase(), dateTimeZone);
    }

    public long getDateTimeMillis(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        return localToUTC(getBase().getDateTimeMillis(i, i2, i3, i4, i5, i6, i7));
    }

    private DateTimeField convertField(DateTimeField dateTimeField, HashMap<Object, Object> hashMap) {
        if (dateTimeField == null || !dateTimeField.isSupported()) {
            return dateTimeField;
        }
        if (hashMap.containsKey(dateTimeField)) {
            return (DateTimeField) hashMap.get(dateTimeField);
        }
        ZonedDateTimeField zonedDateTimeField = new ZonedDateTimeField(dateTimeField, getZone(), convertField(dateTimeField.getDurationField(), hashMap), convertField(dateTimeField.getRangeDurationField(), hashMap), convertField(dateTimeField.getLeapDurationField(), hashMap));
        hashMap.put(dateTimeField, zonedDateTimeField);
        return zonedDateTimeField;
    }

    public long getDateTimeMillis(long j, int i, int i2, int i3, int i4) throws IllegalArgumentException {
        return localToUTC(getBase().getDateTimeMillis(((long) getZone().getOffset(j)) + j, i, i2, i3, i4));
    }
}
