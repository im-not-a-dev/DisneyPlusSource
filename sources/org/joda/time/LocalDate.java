package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import org.joda.time.base.BaseLocal;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.PartialConverter;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public final class LocalDate extends BaseLocal implements ReadablePartial, Serializable {
    private static final Set<DurationFieldType> DATE_DURATION_TYPES = new HashSet();
    private static final int DAY_OF_MONTH = 2;
    private static final int MONTH_OF_YEAR = 1;
    private static final int YEAR = 0;
    private static final long serialVersionUID = -8775358157899L;
    private final Chronology iChronology;
    private transient int iHash;
    private final long iLocalMillis;

    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = -3193829732634L;
        private transient DateTimeField iField;
        private transient LocalDate iInstant;

        Property(LocalDate localDate, DateTimeField dateTimeField) {
            this.iInstant = localDate;
            this.iField = dateTimeField;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.iInstant = (LocalDate) objectInputStream.readObject();
            this.iField = ((DateTimeFieldType) objectInputStream.readObject()).getField(this.iInstant.getChronology());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.iInstant);
            objectOutputStream.writeObject(this.iField.getType());
        }

        public LocalDate addToCopy(int i) {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.add(localDate.getLocalMillis(), i));
        }

        public LocalDate addWrapFieldToCopy(int i) {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.addWrapField(localDate.getLocalMillis(), i));
        }

        /* access modifiers changed from: protected */
        public Chronology getChronology() {
            return this.iInstant.getChronology();
        }

        public DateTimeField getField() {
            return this.iField;
        }

        public LocalDate getLocalDate() {
            return this.iInstant;
        }

        /* access modifiers changed from: protected */
        public long getMillis() {
            return this.iInstant.getLocalMillis();
        }

        public LocalDate roundCeilingCopy() {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.roundCeiling(localDate.getLocalMillis()));
        }

        public LocalDate roundFloorCopy() {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.roundFloor(localDate.getLocalMillis()));
        }

        public LocalDate roundHalfCeilingCopy() {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.roundHalfCeiling(localDate.getLocalMillis()));
        }

        public LocalDate roundHalfEvenCopy() {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.roundHalfEven(localDate.getLocalMillis()));
        }

        public LocalDate roundHalfFloorCopy() {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.roundHalfFloor(localDate.getLocalMillis()));
        }

        public LocalDate setCopy(int i) {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.set(localDate.getLocalMillis(), i));
        }

        public LocalDate withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public LocalDate withMinimumValue() {
            return setCopy(getMinimumValue());
        }

        public LocalDate setCopy(String str, Locale locale) {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.set(localDate.getLocalMillis(), str, locale));
        }

        public LocalDate setCopy(String str) {
            return setCopy(str, null);
        }
    }

    static {
        DATE_DURATION_TYPES.add(DurationFieldType.days());
        DATE_DURATION_TYPES.add(DurationFieldType.weeks());
        DATE_DURATION_TYPES.add(DurationFieldType.months());
        DATE_DURATION_TYPES.add(DurationFieldType.weekyears());
        DATE_DURATION_TYPES.add(DurationFieldType.years());
        DATE_DURATION_TYPES.add(DurationFieldType.centuries());
        DATE_DURATION_TYPES.add(DurationFieldType.eras());
    }

    public LocalDate() {
        this(DateTimeUtils.currentTimeMillis(), (Chronology) ISOChronology.getInstance());
    }

    public static LocalDate fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            int i = calendar.get(0);
            int i2 = calendar.get(1);
            if (i != 1) {
                i2 = 1 - i2;
            }
            return new LocalDate(i2, calendar.get(2) + 1, calendar.get(5));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    public static LocalDate fromDateFields(Date date) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        } else if (date.getTime() >= 0) {
            return new LocalDate(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(date);
            return fromCalendarFields(gregorianCalendar);
        }
    }

    public static LocalDate now() {
        return new LocalDate();
    }

    public static LocalDate parse(String str) {
        return parse(str, ISODateTimeFormat.localDateParser());
    }

    private Object readResolve() {
        Chronology chronology = this.iChronology;
        if (chronology == null) {
            return new LocalDate(this.iLocalMillis, (Chronology) ISOChronology.getInstanceUTC());
        }
        return !DateTimeZone.UTC.equals(chronology.getZone()) ? new LocalDate(this.iLocalMillis, this.iChronology.withUTC()) : this;
    }

    public Property centuryOfEra() {
        return new Property(this, getChronology().centuryOfEra());
    }

    public Property dayOfMonth() {
        return new Property(this, getChronology().dayOfMonth());
    }

    public Property dayOfWeek() {
        return new Property(this, getChronology().dayOfWeek());
    }

    public Property dayOfYear() {
        return new Property(this, getChronology().dayOfYear());
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDate) {
            LocalDate localDate = (LocalDate) obj;
            if (this.iChronology.equals(localDate.iChronology)) {
                if (this.iLocalMillis != localDate.iLocalMillis) {
                    z = false;
                }
                return z;
            }
        }
        return super.equals(obj);
    }

    public Property era() {
        return new Property(this, getChronology().era());
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

    public int getCenturyOfEra() {
        return getChronology().centuryOfEra().get(getLocalMillis());
    }

    public Chronology getChronology() {
        return this.iChronology;
    }

    public int getDayOfMonth() {
        return getChronology().dayOfMonth().get(getLocalMillis());
    }

    public int getDayOfWeek() {
        return getChronology().dayOfWeek().get(getLocalMillis());
    }

    public int getDayOfYear() {
        return getChronology().dayOfYear().get(getLocalMillis());
    }

    public int getEra() {
        return getChronology().era().get(getLocalMillis());
    }

    /* access modifiers changed from: protected */
    public DateTimeField getField(int i, Chronology chronology) {
        if (i == 0) {
            return chronology.year();
        }
        if (i == 1) {
            return chronology.monthOfYear();
        }
        if (i == 2) {
            return chronology.dayOfMonth();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public long getLocalMillis() {
        return this.iLocalMillis;
    }

    public int getMonthOfYear() {
        return getChronology().monthOfYear().get(getLocalMillis());
    }

    public int getValue(int i) {
        if (i == 0) {
            return getChronology().year().get(getLocalMillis());
        }
        if (i == 1) {
            return getChronology().monthOfYear().get(getLocalMillis());
        }
        if (i == 2) {
            return getChronology().dayOfMonth().get(getLocalMillis());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public int getWeekOfWeekyear() {
        return getChronology().weekOfWeekyear().get(getLocalMillis());
    }

    public int getWeekyear() {
        return getChronology().weekyear().get(getLocalMillis());
    }

    public int getYear() {
        return getChronology().year().get(getLocalMillis());
    }

    public int getYearOfCentury() {
        return getChronology().yearOfCentury().get(getLocalMillis());
    }

    public int getYearOfEra() {
        return getChronology().yearOfEra().get(getLocalMillis());
    }

    public int hashCode() {
        int i = this.iHash;
        if (i != 0) {
            return i;
        }
        int hashCode = super.hashCode();
        this.iHash = hashCode;
        return hashCode;
    }

    public boolean isSupported(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            return false;
        }
        DurationFieldType durationType = dateTimeFieldType.getDurationType();
        if (DATE_DURATION_TYPES.contains(durationType) || durationType.getField(getChronology()).getUnitMillis() >= getChronology().days().getUnitMillis()) {
            return dateTimeFieldType.getField(getChronology()).isSupported();
        }
        return false;
    }

    public LocalDate minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public LocalDate minusDays(int i) {
        if (i == 0) {
            return this;
        }
        return withLocalMillis(getChronology().days().subtract(getLocalMillis(), i));
    }

    public LocalDate minusMonths(int i) {
        if (i == 0) {
            return this;
        }
        return withLocalMillis(getChronology().months().subtract(getLocalMillis(), i));
    }

    public LocalDate minusWeeks(int i) {
        if (i == 0) {
            return this;
        }
        return withLocalMillis(getChronology().weeks().subtract(getLocalMillis(), i));
    }

    public LocalDate minusYears(int i) {
        if (i == 0) {
            return this;
        }
        return withLocalMillis(getChronology().years().subtract(getLocalMillis(), i));
    }

    public Property monthOfYear() {
        return new Property(this, getChronology().monthOfYear());
    }

    public LocalDate plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public LocalDate plusDays(int i) {
        if (i == 0) {
            return this;
        }
        return withLocalMillis(getChronology().days().add(getLocalMillis(), i));
    }

    public LocalDate plusMonths(int i) {
        if (i == 0) {
            return this;
        }
        return withLocalMillis(getChronology().months().add(getLocalMillis(), i));
    }

    public LocalDate plusWeeks(int i) {
        if (i == 0) {
            return this;
        }
        return withLocalMillis(getChronology().weeks().add(getLocalMillis(), i));
    }

    public LocalDate plusYears(int i) {
        if (i == 0) {
            return this;
        }
        return withLocalMillis(getChronology().years().add(getLocalMillis(), i));
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

    public int size() {
        return 3;
    }

    public Date toDate() {
        int dayOfMonth = getDayOfMonth();
        Date date = new Date(getYear() - 1900, getMonthOfYear() - 1, dayOfMonth);
        LocalDate fromDateFields = fromDateFields(date);
        if (fromDateFields.isBefore(this)) {
            while (!fromDateFields.equals(this)) {
                date.setTime(date.getTime() + 3600000);
                fromDateFields = fromDateFields(date);
            }
            while (date.getDate() == dayOfMonth) {
                date.setTime(date.getTime() - 1000);
            }
            date.setTime(date.getTime() + 1000);
            return date;
        } else if (!fromDateFields.equals(this)) {
            return date;
        } else {
            Date date2 = new Date(date.getTime() - ((long) TimeZone.getDefault().getDSTSavings()));
            return date2.getDate() == dayOfMonth ? date2 : date;
        }
    }

    @Deprecated
    public DateMidnight toDateMidnight() {
        return toDateMidnight(null);
    }

    public DateTime toDateTime(LocalTime localTime) {
        return toDateTime(localTime, null);
    }

    public DateTime toDateTimeAtCurrentTime() {
        return toDateTimeAtCurrentTime(null);
    }

    @Deprecated
    public DateTime toDateTimeAtMidnight() {
        return toDateTimeAtMidnight(null);
    }

    public DateTime toDateTimeAtStartOfDay() {
        return toDateTimeAtStartOfDay(null);
    }

    public Interval toInterval() {
        return toInterval(null);
    }

    public LocalDateTime toLocalDateTime(LocalTime localTime) {
        if (localTime == null) {
            throw new IllegalArgumentException("The time must not be null");
        } else if (getChronology() == localTime.getChronology()) {
            return new LocalDateTime(getLocalMillis() + localTime.getLocalMillis(), getChronology());
        } else {
            throw new IllegalArgumentException("The chronology of the time does not match");
        }
    }

    public String toString() {
        return ISODateTimeFormat.date().print((ReadablePartial) this);
    }

    public Property weekOfWeekyear() {
        return new Property(this, getChronology().weekOfWeekyear());
    }

    public Property weekyear() {
        return new Property(this, getChronology().weekyear());
    }

    public LocalDate withCenturyOfEra(int i) {
        return withLocalMillis(getChronology().centuryOfEra().set(getLocalMillis(), i));
    }

    public LocalDate withDayOfMonth(int i) {
        return withLocalMillis(getChronology().dayOfMonth().set(getLocalMillis(), i));
    }

    public LocalDate withDayOfWeek(int i) {
        return withLocalMillis(getChronology().dayOfWeek().set(getLocalMillis(), i));
    }

    public LocalDate withDayOfYear(int i) {
        return withLocalMillis(getChronology().dayOfYear().set(getLocalMillis(), i));
    }

    public LocalDate withEra(int i) {
        return withLocalMillis(getChronology().era().set(getLocalMillis(), i));
    }

    public LocalDate withField(DateTimeFieldType dateTimeFieldType, int i) {
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

    public LocalDate withFieldAdded(DurationFieldType durationFieldType, int i) {
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

    public LocalDate withFields(ReadablePartial readablePartial) {
        return readablePartial == null ? this : withLocalMillis(getChronology().set(readablePartial, getLocalMillis()));
    }

    /* access modifiers changed from: 0000 */
    public LocalDate withLocalMillis(long j) {
        long roundFloor = this.iChronology.dayOfMonth().roundFloor(j);
        return roundFloor == getLocalMillis() ? this : new LocalDate(roundFloor, getChronology());
    }

    public LocalDate withMonthOfYear(int i) {
        return withLocalMillis(getChronology().monthOfYear().set(getLocalMillis(), i));
    }

    public LocalDate withPeriodAdded(ReadablePeriod readablePeriod, int i) {
        if (readablePeriod == null || i == 0) {
            return this;
        }
        long localMillis = getLocalMillis();
        Chronology chronology = getChronology();
        for (int i2 = 0; i2 < readablePeriod.size(); i2++) {
            long safeMultiply = (long) FieldUtils.safeMultiply(readablePeriod.getValue(i2), i);
            DurationFieldType fieldType = readablePeriod.getFieldType(i2);
            if (isSupported(fieldType)) {
                localMillis = fieldType.getField(chronology).add(localMillis, safeMultiply);
            }
        }
        return withLocalMillis(localMillis);
    }

    public LocalDate withWeekOfWeekyear(int i) {
        return withLocalMillis(getChronology().weekOfWeekyear().set(getLocalMillis(), i));
    }

    public LocalDate withWeekyear(int i) {
        return withLocalMillis(getChronology().weekyear().set(getLocalMillis(), i));
    }

    public LocalDate withYear(int i) {
        return withLocalMillis(getChronology().year().set(getLocalMillis(), i));
    }

    public LocalDate withYearOfCentury(int i) {
        return withLocalMillis(getChronology().yearOfCentury().set(getLocalMillis(), i));
    }

    public LocalDate withYearOfEra(int i) {
        return withLocalMillis(getChronology().yearOfEra().set(getLocalMillis(), i));
    }

    public Property year() {
        return new Property(this, getChronology().year());
    }

    public Property yearOfCentury() {
        return new Property(this, getChronology().yearOfCentury());
    }

    public Property yearOfEra() {
        return new Property(this, getChronology().yearOfEra());
    }

    public LocalDate(DateTimeZone dateTimeZone) {
        this(DateTimeUtils.currentTimeMillis(), (Chronology) ISOChronology.getInstance(dateTimeZone));
    }

    public static LocalDate now(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new LocalDate(dateTimeZone);
        }
        throw new NullPointerException("Zone must not be null");
    }

    public static LocalDate parse(String str, DateTimeFormatter dateTimeFormatter) {
        return dateTimeFormatter.parseLocalDate(str);
    }

    public int compareTo(ReadablePartial readablePartial) {
        int i = 0;
        if (this == readablePartial) {
            return 0;
        }
        if (readablePartial instanceof LocalDate) {
            LocalDate localDate = (LocalDate) readablePartial;
            if (this.iChronology.equals(localDate.iChronology)) {
                long j = this.iLocalMillis;
                long j2 = localDate.iLocalMillis;
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

    @Deprecated
    public DateMidnight toDateMidnight(DateTimeZone dateTimeZone) {
        return new DateMidnight(getYear(), getMonthOfYear(), getDayOfMonth(), getChronology().withZone(DateTimeUtils.getZone(dateTimeZone)));
    }

    public DateTime toDateTime(LocalTime localTime, DateTimeZone dateTimeZone) {
        if (localTime == null) {
            return toDateTimeAtCurrentTime(dateTimeZone);
        }
        if (getChronology() == localTime.getChronology()) {
            DateTime dateTime = new DateTime(getYear(), getMonthOfYear(), getDayOfMonth(), localTime.getHourOfDay(), localTime.getMinuteOfHour(), localTime.getSecondOfMinute(), localTime.getMillisOfSecond(), getChronology().withZone(dateTimeZone));
            return dateTime;
        }
        throw new IllegalArgumentException("The chronology of the time does not match");
    }

    public DateTime toDateTimeAtCurrentTime(DateTimeZone dateTimeZone) {
        Chronology withZone = getChronology().withZone(DateTimeUtils.getZone(dateTimeZone));
        return new DateTime(withZone.set(this, DateTimeUtils.currentTimeMillis()), withZone);
    }

    @Deprecated
    public DateTime toDateTimeAtMidnight(DateTimeZone dateTimeZone) {
        DateTime dateTime = new DateTime(getYear(), getMonthOfYear(), getDayOfMonth(), 0, 0, 0, 0, getChronology().withZone(DateTimeUtils.getZone(dateTimeZone)));
        return dateTime;
    }

    public DateTime toDateTimeAtStartOfDay(DateTimeZone dateTimeZone) {
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        Chronology withZone = getChronology().withZone(zone);
        return new DateTime(withZone.dayOfMonth().roundFloor(zone.convertLocalToUTC(getLocalMillis() + 21600000, false)), withZone).withEarlierOffsetAtOverlap();
    }

    public Interval toInterval(DateTimeZone dateTimeZone) {
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        return new Interval((ReadableInstant) toDateTimeAtStartOfDay(zone), (ReadableInstant) plusDays(1).toDateTimeAtStartOfDay(zone));
    }

    public String toString(String str) {
        if (str == null) {
            return toString();
        }
        return DateTimeFormat.forPattern(str).print((ReadablePartial) this);
    }

    public LocalDate(Chronology chronology) {
        this(DateTimeUtils.currentTimeMillis(), chronology);
    }

    public LocalDate(long j) {
        this(j, (Chronology) ISOChronology.getInstance());
    }

    public static LocalDate now(Chronology chronology) {
        if (chronology != null) {
            return new LocalDate(chronology);
        }
        throw new NullPointerException("Chronology must not be null");
    }

    public String toString(String str, Locale locale) throws IllegalArgumentException {
        if (str == null) {
            return toString();
        }
        return DateTimeFormat.forPattern(str).withLocale(locale).print((ReadablePartial) this);
    }

    public LocalDate(long j, DateTimeZone dateTimeZone) {
        this(j, (Chronology) ISOChronology.getInstance(dateTimeZone));
    }

    public LocalDate(long j, Chronology chronology) {
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        long millisKeepLocal = chronology2.getZone().getMillisKeepLocal(DateTimeZone.UTC, j);
        Chronology withUTC = chronology2.withUTC();
        this.iLocalMillis = withUTC.dayOfMonth().roundFloor(millisKeepLocal);
        this.iChronology = withUTC;
    }

    public boolean isSupported(DurationFieldType durationFieldType) {
        if (durationFieldType == null) {
            return false;
        }
        DurationField field = durationFieldType.getField(getChronology());
        if (DATE_DURATION_TYPES.contains(durationFieldType) || field.getUnitMillis() >= getChronology().days().getUnitMillis()) {
            return field.isSupported();
        }
        return false;
    }

    public LocalDate(Object obj) {
        this(obj, (Chronology) null);
    }

    public LocalDate(Object obj, DateTimeZone dateTimeZone) {
        PartialConverter partialConverter = ConverterManager.getInstance().getPartialConverter(obj);
        Chronology chronology = DateTimeUtils.getChronology(partialConverter.getChronology(obj, dateTimeZone));
        this.iChronology = chronology.withUTC();
        int[] partialValues = partialConverter.getPartialValues(this, obj, chronology, ISODateTimeFormat.localDateParser());
        this.iLocalMillis = this.iChronology.getDateTimeMillis(partialValues[0], partialValues[1], partialValues[2], 0);
    }

    public LocalDate(Object obj, Chronology chronology) {
        PartialConverter partialConverter = ConverterManager.getInstance().getPartialConverter(obj);
        Chronology chronology2 = DateTimeUtils.getChronology(partialConverter.getChronology(obj, chronology));
        this.iChronology = chronology2.withUTC();
        int[] partialValues = partialConverter.getPartialValues(this, obj, chronology2, ISODateTimeFormat.localDateParser());
        this.iLocalMillis = this.iChronology.getDateTimeMillis(partialValues[0], partialValues[1], partialValues[2], 0);
    }

    public LocalDate(int i, int i2, int i3) {
        this(i, i2, i3, ISOChronology.getInstanceUTC());
    }

    public LocalDate(int i, int i2, int i3, Chronology chronology) {
        Chronology withUTC = DateTimeUtils.getChronology(chronology).withUTC();
        long dateTimeMillis = withUTC.getDateTimeMillis(i, i2, i3, 0);
        this.iChronology = withUTC;
        this.iLocalMillis = dateTimeMillis;
    }
}
