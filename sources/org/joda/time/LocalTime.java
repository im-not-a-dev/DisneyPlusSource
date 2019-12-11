package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.joda.time.base.BaseLocal;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.PartialConverter;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public final class LocalTime extends BaseLocal implements ReadablePartial, Serializable {
    private static final int HOUR_OF_DAY = 0;
    public static final LocalTime MIDNIGHT = new LocalTime(0, 0, 0, 0);
    private static final int MILLIS_OF_SECOND = 3;
    private static final int MINUTE_OF_HOUR = 1;
    private static final int SECOND_OF_MINUTE = 2;
    private static final Set<DurationFieldType> TIME_DURATION_TYPES = new HashSet();
    private static final long serialVersionUID = -12873158713873L;
    private final Chronology iChronology;
    private final long iLocalMillis;

    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = -325842547277223L;
        private transient DateTimeField iField;
        private transient LocalTime iInstant;

        Property(LocalTime localTime, DateTimeField dateTimeField) {
            this.iInstant = localTime;
            this.iField = dateTimeField;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.iInstant = (LocalTime) objectInputStream.readObject();
            this.iField = ((DateTimeFieldType) objectInputStream.readObject()).getField(this.iInstant.getChronology());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.iInstant);
            objectOutputStream.writeObject(this.iField.getType());
        }

        public LocalTime addCopy(int i) {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.add(localTime.getLocalMillis(), i));
        }

        public LocalTime addNoWrapToCopy(int i) {
            long add = this.iField.add(this.iInstant.getLocalMillis(), i);
            if (((long) this.iInstant.getChronology().millisOfDay().get(add)) == add) {
                return this.iInstant.withLocalMillis(add);
            }
            throw new IllegalArgumentException("The addition exceeded the boundaries of LocalTime");
        }

        public LocalTime addWrapFieldToCopy(int i) {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.addWrapField(localTime.getLocalMillis(), i));
        }

        /* access modifiers changed from: protected */
        public Chronology getChronology() {
            return this.iInstant.getChronology();
        }

        public DateTimeField getField() {
            return this.iField;
        }

        public LocalTime getLocalTime() {
            return this.iInstant;
        }

        /* access modifiers changed from: protected */
        public long getMillis() {
            return this.iInstant.getLocalMillis();
        }

        public LocalTime roundCeilingCopy() {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.roundCeiling(localTime.getLocalMillis()));
        }

        public LocalTime roundFloorCopy() {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.roundFloor(localTime.getLocalMillis()));
        }

        public LocalTime roundHalfCeilingCopy() {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.roundHalfCeiling(localTime.getLocalMillis()));
        }

        public LocalTime roundHalfEvenCopy() {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.roundHalfEven(localTime.getLocalMillis()));
        }

        public LocalTime roundHalfFloorCopy() {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.roundHalfFloor(localTime.getLocalMillis()));
        }

        public LocalTime setCopy(int i) {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.set(localTime.getLocalMillis(), i));
        }

        public LocalTime withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public LocalTime withMinimumValue() {
            return setCopy(getMinimumValue());
        }

        public LocalTime addCopy(long j) {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.add(localTime.getLocalMillis(), j));
        }

        public LocalTime setCopy(String str, Locale locale) {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.set(localTime.getLocalMillis(), str, locale));
        }

        public LocalTime setCopy(String str) {
            return setCopy(str, null);
        }
    }

    static {
        TIME_DURATION_TYPES.add(DurationFieldType.millis());
        TIME_DURATION_TYPES.add(DurationFieldType.seconds());
        TIME_DURATION_TYPES.add(DurationFieldType.minutes());
        TIME_DURATION_TYPES.add(DurationFieldType.hours());
    }

    public LocalTime() {
        this(DateTimeUtils.currentTimeMillis(), (Chronology) ISOChronology.getInstance());
    }

    public static LocalTime fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            return new LocalTime(calendar.get(11), calendar.get(12), calendar.get(13), calendar.get(14));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    public static LocalTime fromDateFields(Date date) {
        if (date != null) {
            return new LocalTime(date.getHours(), date.getMinutes(), date.getSeconds(), (((int) (date.getTime() % 1000)) + 1000) % 1000);
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static LocalTime fromMillisOfDay(long j) {
        return fromMillisOfDay(j, null);
    }

    public static LocalTime now() {
        return new LocalTime();
    }

    public static LocalTime parse(String str) {
        return parse(str, ISODateTimeFormat.localTimeParser());
    }

    private Object readResolve() {
        Chronology chronology = this.iChronology;
        if (chronology == null) {
            return new LocalTime(this.iLocalMillis, (Chronology) ISOChronology.getInstanceUTC());
        }
        return !DateTimeZone.UTC.equals(chronology.getZone()) ? new LocalTime(this.iLocalMillis, this.iChronology.withUTC()) : this;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.iChronology.equals(localTime.iChronology)) {
                if (this.iLocalMillis != localTime.iLocalMillis) {
                    z = false;
                }
                return z;
            }
        }
        return super.equals(obj);
    }

    public int get(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        } else if (isSupported(dateTimeFieldType)) {
            return dateTimeFieldType.getField(getChronology()).get(getLocalMillis());
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Field '");
            sb.append(dateTimeFieldType);
            sb.append("' is not supported");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public Chronology getChronology() {
        return this.iChronology;
    }

    /* access modifiers changed from: protected */
    public DateTimeField getField(int i, Chronology chronology) {
        if (i == 0) {
            return chronology.hourOfDay();
        }
        if (i == 1) {
            return chronology.minuteOfHour();
        }
        if (i == 2) {
            return chronology.secondOfMinute();
        }
        if (i == 3) {
            return chronology.millisOfSecond();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public int getHourOfDay() {
        return getChronology().hourOfDay().get(getLocalMillis());
    }

    /* access modifiers changed from: protected */
    public long getLocalMillis() {
        return this.iLocalMillis;
    }

    public int getMillisOfDay() {
        return getChronology().millisOfDay().get(getLocalMillis());
    }

    public int getMillisOfSecond() {
        return getChronology().millisOfSecond().get(getLocalMillis());
    }

    public int getMinuteOfHour() {
        return getChronology().minuteOfHour().get(getLocalMillis());
    }

    public int getSecondOfMinute() {
        return getChronology().secondOfMinute().get(getLocalMillis());
    }

    public int getValue(int i) {
        if (i == 0) {
            return getChronology().hourOfDay().get(getLocalMillis());
        }
        if (i == 1) {
            return getChronology().minuteOfHour().get(getLocalMillis());
        }
        if (i == 2) {
            return getChronology().secondOfMinute().get(getLocalMillis());
        }
        if (i == 3) {
            return getChronology().millisOfSecond().get(getLocalMillis());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public Property hourOfDay() {
        return new Property(this, getChronology().hourOfDay());
    }

    public boolean isSupported(DateTimeFieldType dateTimeFieldType) {
        boolean z = false;
        if (dateTimeFieldType == null || !isSupported(dateTimeFieldType.getDurationType())) {
            return false;
        }
        DurationFieldType rangeDurationType = dateTimeFieldType.getRangeDurationType();
        if (isSupported(rangeDurationType) || rangeDurationType == DurationFieldType.days()) {
            z = true;
        }
        return z;
    }

    public Property millisOfDay() {
        return new Property(this, getChronology().millisOfDay());
    }

    public Property millisOfSecond() {
        return new Property(this, getChronology().millisOfSecond());
    }

    public LocalTime minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public LocalTime minusHours(int i) {
        if (i == 0) {
            return this;
        }
        return withLocalMillis(getChronology().hours().subtract(getLocalMillis(), i));
    }

    public LocalTime minusMillis(int i) {
        if (i == 0) {
            return this;
        }
        return withLocalMillis(getChronology().millis().subtract(getLocalMillis(), i));
    }

    public LocalTime minusMinutes(int i) {
        if (i == 0) {
            return this;
        }
        return withLocalMillis(getChronology().minutes().subtract(getLocalMillis(), i));
    }

    public LocalTime minusSeconds(int i) {
        if (i == 0) {
            return this;
        }
        return withLocalMillis(getChronology().seconds().subtract(getLocalMillis(), i));
    }

    public Property minuteOfHour() {
        return new Property(this, getChronology().minuteOfHour());
    }

    public LocalTime plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public LocalTime plusHours(int i) {
        if (i == 0) {
            return this;
        }
        return withLocalMillis(getChronology().hours().add(getLocalMillis(), i));
    }

    public LocalTime plusMillis(int i) {
        if (i == 0) {
            return this;
        }
        return withLocalMillis(getChronology().millis().add(getLocalMillis(), i));
    }

    public LocalTime plusMinutes(int i) {
        if (i == 0) {
            return this;
        }
        return withLocalMillis(getChronology().minutes().add(getLocalMillis(), i));
    }

    public LocalTime plusSeconds(int i) {
        if (i == 0) {
            return this;
        }
        return withLocalMillis(getChronology().seconds().add(getLocalMillis(), i));
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        } else if (isSupported(dateTimeFieldType)) {
            return new Property(this, dateTimeFieldType.getField(getChronology()));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Field '");
            sb.append(dateTimeFieldType);
            sb.append("' is not supported");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public Property secondOfMinute() {
        return new Property(this, getChronology().secondOfMinute());
    }

    public int size() {
        return 4;
    }

    public DateTime toDateTimeToday() {
        return toDateTimeToday(null);
    }

    public String toString() {
        return ISODateTimeFormat.time().print((ReadablePartial) this);
    }

    public LocalTime withField(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        } else if (isSupported(dateTimeFieldType)) {
            return withLocalMillis(dateTimeFieldType.getField(getChronology()).set(getLocalMillis(), i));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Field '");
            sb.append(dateTimeFieldType);
            sb.append("' is not supported");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public LocalTime withFieldAdded(DurationFieldType durationFieldType, int i) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        } else if (!isSupported(durationFieldType)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Field '");
            sb.append(durationFieldType);
            sb.append("' is not supported");
            throw new IllegalArgumentException(sb.toString());
        } else if (i == 0) {
            return this;
        } else {
            return withLocalMillis(durationFieldType.getField(getChronology()).add(getLocalMillis(), i));
        }
    }

    public LocalTime withFields(ReadablePartial readablePartial) {
        return readablePartial == null ? this : withLocalMillis(getChronology().set(readablePartial, getLocalMillis()));
    }

    public LocalTime withHourOfDay(int i) {
        return withLocalMillis(getChronology().hourOfDay().set(getLocalMillis(), i));
    }

    /* access modifiers changed from: 0000 */
    public LocalTime withLocalMillis(long j) {
        return j == getLocalMillis() ? this : new LocalTime(j, getChronology());
    }

    public LocalTime withMillisOfDay(int i) {
        return withLocalMillis(getChronology().millisOfDay().set(getLocalMillis(), i));
    }

    public LocalTime withMillisOfSecond(int i) {
        return withLocalMillis(getChronology().millisOfSecond().set(getLocalMillis(), i));
    }

    public LocalTime withMinuteOfHour(int i) {
        return withLocalMillis(getChronology().minuteOfHour().set(getLocalMillis(), i));
    }

    public LocalTime withPeriodAdded(ReadablePeriod readablePeriod, int i) {
        return (readablePeriod == null || i == 0) ? this : withLocalMillis(getChronology().add(readablePeriod, getLocalMillis(), i));
    }

    public LocalTime withSecondOfMinute(int i) {
        return withLocalMillis(getChronology().secondOfMinute().set(getLocalMillis(), i));
    }

    public LocalTime(DateTimeZone dateTimeZone) {
        this(DateTimeUtils.currentTimeMillis(), (Chronology) ISOChronology.getInstance(dateTimeZone));
    }

    public static LocalTime fromMillisOfDay(long j, Chronology chronology) {
        return new LocalTime(j, DateTimeUtils.getChronology(chronology).withUTC());
    }

    public static LocalTime now(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new LocalTime(dateTimeZone);
        }
        throw new NullPointerException("Zone must not be null");
    }

    public static LocalTime parse(String str, DateTimeFormatter dateTimeFormatter) {
        return dateTimeFormatter.parseLocalTime(str);
    }

    public int compareTo(ReadablePartial readablePartial) {
        int i = 0;
        if (this == readablePartial) {
            return 0;
        }
        if (readablePartial instanceof LocalTime) {
            LocalTime localTime = (LocalTime) readablePartial;
            if (this.iChronology.equals(localTime.iChronology)) {
                long j = this.iLocalMillis;
                long j2 = localTime.iLocalMillis;
                if (j < j2) {
                    i = -1;
                } else if (j != j2) {
                    i = 1;
                }
                return i;
            }
        }
        return super.compareTo(readablePartial);
    }

    public DateTime toDateTimeToday(DateTimeZone dateTimeZone) {
        Chronology withZone = getChronology().withZone(dateTimeZone);
        return new DateTime(withZone.set(this, DateTimeUtils.currentTimeMillis()), withZone);
    }

    public String toString(String str) {
        if (str == null) {
            return toString();
        }
        return DateTimeFormat.forPattern(str).print((ReadablePartial) this);
    }

    public LocalTime(Chronology chronology) {
        this(DateTimeUtils.currentTimeMillis(), chronology);
    }

    public LocalTime(long j) {
        this(j, (Chronology) ISOChronology.getInstance());
    }

    public static LocalTime now(Chronology chronology) {
        if (chronology != null) {
            return new LocalTime(chronology);
        }
        throw new NullPointerException("Chronology must not be null");
    }

    public boolean isSupported(DurationFieldType durationFieldType) {
        if (durationFieldType == null) {
            return false;
        }
        DurationField field = durationFieldType.getField(getChronology());
        if (TIME_DURATION_TYPES.contains(durationFieldType) || field.getUnitMillis() < getChronology().days().getUnitMillis()) {
            return field.isSupported();
        }
        return false;
    }

    public String toString(String str, Locale locale) throws IllegalArgumentException {
        if (str == null) {
            return toString();
        }
        return DateTimeFormat.forPattern(str).withLocale(locale).print((ReadablePartial) this);
    }

    public LocalTime(long j, DateTimeZone dateTimeZone) {
        this(j, (Chronology) ISOChronology.getInstance(dateTimeZone));
    }

    public LocalTime(long j, Chronology chronology) {
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        long millisKeepLocal = chronology2.getZone().getMillisKeepLocal(DateTimeZone.UTC, j);
        Chronology withUTC = chronology2.withUTC();
        this.iLocalMillis = (long) withUTC.millisOfDay().get(millisKeepLocal);
        this.iChronology = withUTC;
    }

    public LocalTime(Object obj) {
        this(obj, (Chronology) null);
    }

    public LocalTime(Object obj, DateTimeZone dateTimeZone) {
        PartialConverter partialConverter = ConverterManager.getInstance().getPartialConverter(obj);
        Chronology chronology = DateTimeUtils.getChronology(partialConverter.getChronology(obj, dateTimeZone));
        this.iChronology = chronology.withUTC();
        int[] partialValues = partialConverter.getPartialValues(this, obj, chronology, ISODateTimeFormat.localTimeParser());
        this.iLocalMillis = this.iChronology.getDateTimeMillis(0, partialValues[0], partialValues[1], partialValues[2], partialValues[3]);
    }

    public LocalTime(Object obj, Chronology chronology) {
        PartialConverter partialConverter = ConverterManager.getInstance().getPartialConverter(obj);
        Chronology chronology2 = DateTimeUtils.getChronology(partialConverter.getChronology(obj, chronology));
        this.iChronology = chronology2.withUTC();
        int[] partialValues = partialConverter.getPartialValues(this, obj, chronology2, ISODateTimeFormat.localTimeParser());
        this.iLocalMillis = this.iChronology.getDateTimeMillis(0, partialValues[0], partialValues[1], partialValues[2], partialValues[3]);
    }

    public LocalTime(int i, int i2) {
        this(i, i2, 0, 0, ISOChronology.getInstanceUTC());
    }

    public LocalTime(int i, int i2, int i3) {
        this(i, i2, i3, 0, ISOChronology.getInstanceUTC());
    }

    public LocalTime(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, ISOChronology.getInstanceUTC());
    }

    public LocalTime(int i, int i2, int i3, int i4, Chronology chronology) {
        Chronology withUTC = DateTimeUtils.getChronology(chronology).withUTC();
        long dateTimeMillis = withUTC.getDateTimeMillis(0, i, i2, i3, i4);
        this.iChronology = withUTC;
        this.iLocalMillis = dateTimeMillis;
    }
}
