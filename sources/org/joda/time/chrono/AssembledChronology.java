package org.joda.time.chrono;

import java.io.IOException;
import java.io.ObjectInputStream;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;

public abstract class AssembledChronology extends BaseChronology {
    private static final long serialVersionUID = -6728465968995518215L;
    private final Chronology iBase;
    private transient int iBaseFlags;
    private transient DurationField iCenturies;
    private transient DateTimeField iCenturyOfEra;
    private transient DateTimeField iClockhourOfDay;
    private transient DateTimeField iClockhourOfHalfday;
    private transient DateTimeField iDayOfMonth;
    private transient DateTimeField iDayOfWeek;
    private transient DateTimeField iDayOfYear;
    private transient DurationField iDays;
    private transient DateTimeField iEra;
    private transient DurationField iEras;
    private transient DateTimeField iHalfdayOfDay;
    private transient DurationField iHalfdays;
    private transient DateTimeField iHourOfDay;
    private transient DateTimeField iHourOfHalfday;
    private transient DurationField iHours;
    private transient DurationField iMillis;
    private transient DateTimeField iMillisOfDay;
    private transient DateTimeField iMillisOfSecond;
    private transient DateTimeField iMinuteOfDay;
    private transient DateTimeField iMinuteOfHour;
    private transient DurationField iMinutes;
    private transient DateTimeField iMonthOfYear;
    private transient DurationField iMonths;
    private final Object iParam;
    private transient DateTimeField iSecondOfDay;
    private transient DateTimeField iSecondOfMinute;
    private transient DurationField iSeconds;
    private transient DateTimeField iWeekOfWeekyear;
    private transient DurationField iWeeks;
    private transient DateTimeField iWeekyear;
    private transient DateTimeField iWeekyearOfCentury;
    private transient DurationField iWeekyears;
    private transient DateTimeField iYear;
    private transient DateTimeField iYearOfCentury;
    private transient DateTimeField iYearOfEra;
    private transient DurationField iYears;

    public static final class Fields {
        public DurationField centuries;
        public DateTimeField centuryOfEra;
        public DateTimeField clockhourOfDay;
        public DateTimeField clockhourOfHalfday;
        public DateTimeField dayOfMonth;
        public DateTimeField dayOfWeek;
        public DateTimeField dayOfYear;
        public DurationField days;
        public DateTimeField era;
        public DurationField eras;
        public DateTimeField halfdayOfDay;
        public DurationField halfdays;
        public DateTimeField hourOfDay;
        public DateTimeField hourOfHalfday;
        public DurationField hours;
        public DurationField millis;
        public DateTimeField millisOfDay;
        public DateTimeField millisOfSecond;
        public DateTimeField minuteOfDay;
        public DateTimeField minuteOfHour;
        public DurationField minutes;
        public DateTimeField monthOfYear;
        public DurationField months;
        public DateTimeField secondOfDay;
        public DateTimeField secondOfMinute;
        public DurationField seconds;
        public DateTimeField weekOfWeekyear;
        public DurationField weeks;
        public DateTimeField weekyear;
        public DateTimeField weekyearOfCentury;
        public DurationField weekyears;
        public DateTimeField year;
        public DateTimeField yearOfCentury;
        public DateTimeField yearOfEra;
        public DurationField years;

        Fields() {
        }

        private static boolean isSupported(DurationField durationField) {
            if (durationField == null) {
                return false;
            }
            return durationField.isSupported();
        }

        public void copyFieldsFrom(Chronology chronology) {
            DurationField millis2 = chronology.millis();
            if (isSupported(millis2)) {
                this.millis = millis2;
            }
            DurationField seconds2 = chronology.seconds();
            if (isSupported(seconds2)) {
                this.seconds = seconds2;
            }
            DurationField minutes2 = chronology.minutes();
            if (isSupported(minutes2)) {
                this.minutes = minutes2;
            }
            DurationField hours2 = chronology.hours();
            if (isSupported(hours2)) {
                this.hours = hours2;
            }
            DurationField halfdays2 = chronology.halfdays();
            if (isSupported(halfdays2)) {
                this.halfdays = halfdays2;
            }
            DurationField days2 = chronology.days();
            if (isSupported(days2)) {
                this.days = days2;
            }
            DurationField weeks2 = chronology.weeks();
            if (isSupported(weeks2)) {
                this.weeks = weeks2;
            }
            DurationField weekyears2 = chronology.weekyears();
            if (isSupported(weekyears2)) {
                this.weekyears = weekyears2;
            }
            DurationField months2 = chronology.months();
            if (isSupported(months2)) {
                this.months = months2;
            }
            DurationField years2 = chronology.years();
            if (isSupported(years2)) {
                this.years = years2;
            }
            DurationField centuries2 = chronology.centuries();
            if (isSupported(centuries2)) {
                this.centuries = centuries2;
            }
            DurationField eras2 = chronology.eras();
            if (isSupported(eras2)) {
                this.eras = eras2;
            }
            DateTimeField millisOfSecond2 = chronology.millisOfSecond();
            if (isSupported(millisOfSecond2)) {
                this.millisOfSecond = millisOfSecond2;
            }
            DateTimeField millisOfDay2 = chronology.millisOfDay();
            if (isSupported(millisOfDay2)) {
                this.millisOfDay = millisOfDay2;
            }
            DateTimeField secondOfMinute2 = chronology.secondOfMinute();
            if (isSupported(secondOfMinute2)) {
                this.secondOfMinute = secondOfMinute2;
            }
            DateTimeField secondOfDay2 = chronology.secondOfDay();
            if (isSupported(secondOfDay2)) {
                this.secondOfDay = secondOfDay2;
            }
            DateTimeField minuteOfHour2 = chronology.minuteOfHour();
            if (isSupported(minuteOfHour2)) {
                this.minuteOfHour = minuteOfHour2;
            }
            DateTimeField minuteOfDay2 = chronology.minuteOfDay();
            if (isSupported(minuteOfDay2)) {
                this.minuteOfDay = minuteOfDay2;
            }
            DateTimeField hourOfDay2 = chronology.hourOfDay();
            if (isSupported(hourOfDay2)) {
                this.hourOfDay = hourOfDay2;
            }
            DateTimeField clockhourOfDay2 = chronology.clockhourOfDay();
            if (isSupported(clockhourOfDay2)) {
                this.clockhourOfDay = clockhourOfDay2;
            }
            DateTimeField hourOfHalfday2 = chronology.hourOfHalfday();
            if (isSupported(hourOfHalfday2)) {
                this.hourOfHalfday = hourOfHalfday2;
            }
            DateTimeField clockhourOfHalfday2 = chronology.clockhourOfHalfday();
            if (isSupported(clockhourOfHalfday2)) {
                this.clockhourOfHalfday = clockhourOfHalfday2;
            }
            DateTimeField halfdayOfDay2 = chronology.halfdayOfDay();
            if (isSupported(halfdayOfDay2)) {
                this.halfdayOfDay = halfdayOfDay2;
            }
            DateTimeField dayOfWeek2 = chronology.dayOfWeek();
            if (isSupported(dayOfWeek2)) {
                this.dayOfWeek = dayOfWeek2;
            }
            DateTimeField dayOfMonth2 = chronology.dayOfMonth();
            if (isSupported(dayOfMonth2)) {
                this.dayOfMonth = dayOfMonth2;
            }
            DateTimeField dayOfYear2 = chronology.dayOfYear();
            if (isSupported(dayOfYear2)) {
                this.dayOfYear = dayOfYear2;
            }
            DateTimeField weekOfWeekyear2 = chronology.weekOfWeekyear();
            if (isSupported(weekOfWeekyear2)) {
                this.weekOfWeekyear = weekOfWeekyear2;
            }
            DateTimeField weekyear2 = chronology.weekyear();
            if (isSupported(weekyear2)) {
                this.weekyear = weekyear2;
            }
            DateTimeField weekyearOfCentury2 = chronology.weekyearOfCentury();
            if (isSupported(weekyearOfCentury2)) {
                this.weekyearOfCentury = weekyearOfCentury2;
            }
            DateTimeField monthOfYear2 = chronology.monthOfYear();
            if (isSupported(monthOfYear2)) {
                this.monthOfYear = monthOfYear2;
            }
            DateTimeField year2 = chronology.year();
            if (isSupported(year2)) {
                this.year = year2;
            }
            DateTimeField yearOfEra2 = chronology.yearOfEra();
            if (isSupported(yearOfEra2)) {
                this.yearOfEra = yearOfEra2;
            }
            DateTimeField yearOfCentury2 = chronology.yearOfCentury();
            if (isSupported(yearOfCentury2)) {
                this.yearOfCentury = yearOfCentury2;
            }
            DateTimeField centuryOfEra2 = chronology.centuryOfEra();
            if (isSupported(centuryOfEra2)) {
                this.centuryOfEra = centuryOfEra2;
            }
            DateTimeField era2 = chronology.era();
            if (isSupported(era2)) {
                this.era = era2;
            }
        }

        private static boolean isSupported(DateTimeField dateTimeField) {
            if (dateTimeField == null) {
                return false;
            }
            return dateTimeField.isSupported();
        }
    }

    protected AssembledChronology(Chronology chronology, Object obj) {
        this.iBase = chronology;
        this.iParam = obj;
        setFields();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        setFields();
    }

    private void setFields() {
        Fields fields = new Fields();
        Chronology chronology = this.iBase;
        if (chronology != null) {
            fields.copyFieldsFrom(chronology);
        }
        assemble(fields);
        DurationField durationField = fields.millis;
        if (durationField == null) {
            durationField = super.millis();
        }
        this.iMillis = durationField;
        DurationField durationField2 = fields.seconds;
        if (durationField2 == null) {
            durationField2 = super.seconds();
        }
        this.iSeconds = durationField2;
        DurationField durationField3 = fields.minutes;
        if (durationField3 == null) {
            durationField3 = super.minutes();
        }
        this.iMinutes = durationField3;
        DurationField durationField4 = fields.hours;
        if (durationField4 == null) {
            durationField4 = super.hours();
        }
        this.iHours = durationField4;
        DurationField durationField5 = fields.halfdays;
        if (durationField5 == null) {
            durationField5 = super.halfdays();
        }
        this.iHalfdays = durationField5;
        DurationField durationField6 = fields.days;
        if (durationField6 == null) {
            durationField6 = super.days();
        }
        this.iDays = durationField6;
        DurationField durationField7 = fields.weeks;
        if (durationField7 == null) {
            durationField7 = super.weeks();
        }
        this.iWeeks = durationField7;
        DurationField durationField8 = fields.weekyears;
        if (durationField8 == null) {
            durationField8 = super.weekyears();
        }
        this.iWeekyears = durationField8;
        DurationField durationField9 = fields.months;
        if (durationField9 == null) {
            durationField9 = super.months();
        }
        this.iMonths = durationField9;
        DurationField durationField10 = fields.years;
        if (durationField10 == null) {
            durationField10 = super.years();
        }
        this.iYears = durationField10;
        DurationField durationField11 = fields.centuries;
        if (durationField11 == null) {
            durationField11 = super.centuries();
        }
        this.iCenturies = durationField11;
        DurationField durationField12 = fields.eras;
        if (durationField12 == null) {
            durationField12 = super.eras();
        }
        this.iEras = durationField12;
        DateTimeField dateTimeField = fields.millisOfSecond;
        if (dateTimeField == null) {
            dateTimeField = super.millisOfSecond();
        }
        this.iMillisOfSecond = dateTimeField;
        DateTimeField dateTimeField2 = fields.millisOfDay;
        if (dateTimeField2 == null) {
            dateTimeField2 = super.millisOfDay();
        }
        this.iMillisOfDay = dateTimeField2;
        DateTimeField dateTimeField3 = fields.secondOfMinute;
        if (dateTimeField3 == null) {
            dateTimeField3 = super.secondOfMinute();
        }
        this.iSecondOfMinute = dateTimeField3;
        DateTimeField dateTimeField4 = fields.secondOfDay;
        if (dateTimeField4 == null) {
            dateTimeField4 = super.secondOfDay();
        }
        this.iSecondOfDay = dateTimeField4;
        DateTimeField dateTimeField5 = fields.minuteOfHour;
        if (dateTimeField5 == null) {
            dateTimeField5 = super.minuteOfHour();
        }
        this.iMinuteOfHour = dateTimeField5;
        DateTimeField dateTimeField6 = fields.minuteOfDay;
        if (dateTimeField6 == null) {
            dateTimeField6 = super.minuteOfDay();
        }
        this.iMinuteOfDay = dateTimeField6;
        DateTimeField dateTimeField7 = fields.hourOfDay;
        if (dateTimeField7 == null) {
            dateTimeField7 = super.hourOfDay();
        }
        this.iHourOfDay = dateTimeField7;
        DateTimeField dateTimeField8 = fields.clockhourOfDay;
        if (dateTimeField8 == null) {
            dateTimeField8 = super.clockhourOfDay();
        }
        this.iClockhourOfDay = dateTimeField8;
        DateTimeField dateTimeField9 = fields.hourOfHalfday;
        if (dateTimeField9 == null) {
            dateTimeField9 = super.hourOfHalfday();
        }
        this.iHourOfHalfday = dateTimeField9;
        DateTimeField dateTimeField10 = fields.clockhourOfHalfday;
        if (dateTimeField10 == null) {
            dateTimeField10 = super.clockhourOfHalfday();
        }
        this.iClockhourOfHalfday = dateTimeField10;
        DateTimeField dateTimeField11 = fields.halfdayOfDay;
        if (dateTimeField11 == null) {
            dateTimeField11 = super.halfdayOfDay();
        }
        this.iHalfdayOfDay = dateTimeField11;
        DateTimeField dateTimeField12 = fields.dayOfWeek;
        if (dateTimeField12 == null) {
            dateTimeField12 = super.dayOfWeek();
        }
        this.iDayOfWeek = dateTimeField12;
        DateTimeField dateTimeField13 = fields.dayOfMonth;
        if (dateTimeField13 == null) {
            dateTimeField13 = super.dayOfMonth();
        }
        this.iDayOfMonth = dateTimeField13;
        DateTimeField dateTimeField14 = fields.dayOfYear;
        if (dateTimeField14 == null) {
            dateTimeField14 = super.dayOfYear();
        }
        this.iDayOfYear = dateTimeField14;
        DateTimeField dateTimeField15 = fields.weekOfWeekyear;
        if (dateTimeField15 == null) {
            dateTimeField15 = super.weekOfWeekyear();
        }
        this.iWeekOfWeekyear = dateTimeField15;
        DateTimeField dateTimeField16 = fields.weekyear;
        if (dateTimeField16 == null) {
            dateTimeField16 = super.weekyear();
        }
        this.iWeekyear = dateTimeField16;
        DateTimeField dateTimeField17 = fields.weekyearOfCentury;
        if (dateTimeField17 == null) {
            dateTimeField17 = super.weekyearOfCentury();
        }
        this.iWeekyearOfCentury = dateTimeField17;
        DateTimeField dateTimeField18 = fields.monthOfYear;
        if (dateTimeField18 == null) {
            dateTimeField18 = super.monthOfYear();
        }
        this.iMonthOfYear = dateTimeField18;
        DateTimeField dateTimeField19 = fields.year;
        if (dateTimeField19 == null) {
            dateTimeField19 = super.year();
        }
        this.iYear = dateTimeField19;
        DateTimeField dateTimeField20 = fields.yearOfEra;
        if (dateTimeField20 == null) {
            dateTimeField20 = super.yearOfEra();
        }
        this.iYearOfEra = dateTimeField20;
        DateTimeField dateTimeField21 = fields.yearOfCentury;
        if (dateTimeField21 == null) {
            dateTimeField21 = super.yearOfCentury();
        }
        this.iYearOfCentury = dateTimeField21;
        DateTimeField dateTimeField22 = fields.centuryOfEra;
        if (dateTimeField22 == null) {
            dateTimeField22 = super.centuryOfEra();
        }
        this.iCenturyOfEra = dateTimeField22;
        DateTimeField dateTimeField23 = fields.era;
        if (dateTimeField23 == null) {
            dateTimeField23 = super.era();
        }
        this.iEra = dateTimeField23;
        Chronology chronology2 = this.iBase;
        int i = 0;
        if (chronology2 != null) {
            int i2 = ((this.iHourOfDay == chronology2.hourOfDay() && this.iMinuteOfHour == this.iBase.minuteOfHour() && this.iSecondOfMinute == this.iBase.secondOfMinute() && this.iMillisOfSecond == this.iBase.millisOfSecond()) ? 1 : 0) | (this.iMillisOfDay == this.iBase.millisOfDay() ? 2 : 0);
            if (this.iYear == this.iBase.year() && this.iMonthOfYear == this.iBase.monthOfYear() && this.iDayOfMonth == this.iBase.dayOfMonth()) {
                i = 4;
            }
            i |= i2;
        }
        this.iBaseFlags = i;
    }

    /* access modifiers changed from: protected */
    public abstract void assemble(Fields fields);

    public final DurationField centuries() {
        return this.iCenturies;
    }

    public final DateTimeField centuryOfEra() {
        return this.iCenturyOfEra;
    }

    public final DateTimeField clockhourOfDay() {
        return this.iClockhourOfDay;
    }

    public final DateTimeField clockhourOfHalfday() {
        return this.iClockhourOfHalfday;
    }

    public final DateTimeField dayOfMonth() {
        return this.iDayOfMonth;
    }

    public final DateTimeField dayOfWeek() {
        return this.iDayOfWeek;
    }

    public final DateTimeField dayOfYear() {
        return this.iDayOfYear;
    }

    public final DurationField days() {
        return this.iDays;
    }

    public final DateTimeField era() {
        return this.iEra;
    }

    public final DurationField eras() {
        return this.iEras;
    }

    /* access modifiers changed from: protected */
    public final Chronology getBase() {
        return this.iBase;
    }

    public long getDateTimeMillis(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        Chronology chronology = this.iBase;
        if (chronology == null || (this.iBaseFlags & 6) != 6) {
            return super.getDateTimeMillis(i, i2, i3, i4);
        }
        return chronology.getDateTimeMillis(i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public final Object getParam() {
        return this.iParam;
    }

    public DateTimeZone getZone() {
        Chronology chronology = this.iBase;
        if (chronology != null) {
            return chronology.getZone();
        }
        return null;
    }

    public final DateTimeField halfdayOfDay() {
        return this.iHalfdayOfDay;
    }

    public final DurationField halfdays() {
        return this.iHalfdays;
    }

    public final DateTimeField hourOfDay() {
        return this.iHourOfDay;
    }

    public final DateTimeField hourOfHalfday() {
        return this.iHourOfHalfday;
    }

    public final DurationField hours() {
        return this.iHours;
    }

    public final DurationField millis() {
        return this.iMillis;
    }

    public final DateTimeField millisOfDay() {
        return this.iMillisOfDay;
    }

    public final DateTimeField millisOfSecond() {
        return this.iMillisOfSecond;
    }

    public final DateTimeField minuteOfDay() {
        return this.iMinuteOfDay;
    }

    public final DateTimeField minuteOfHour() {
        return this.iMinuteOfHour;
    }

    public final DurationField minutes() {
        return this.iMinutes;
    }

    public final DateTimeField monthOfYear() {
        return this.iMonthOfYear;
    }

    public final DurationField months() {
        return this.iMonths;
    }

    public final DateTimeField secondOfDay() {
        return this.iSecondOfDay;
    }

    public final DateTimeField secondOfMinute() {
        return this.iSecondOfMinute;
    }

    public final DurationField seconds() {
        return this.iSeconds;
    }

    public final DateTimeField weekOfWeekyear() {
        return this.iWeekOfWeekyear;
    }

    public final DurationField weeks() {
        return this.iWeeks;
    }

    public final DateTimeField weekyear() {
        return this.iWeekyear;
    }

    public final DateTimeField weekyearOfCentury() {
        return this.iWeekyearOfCentury;
    }

    public final DurationField weekyears() {
        return this.iWeekyears;
    }

    public final DateTimeField year() {
        return this.iYear;
    }

    public final DateTimeField yearOfCentury() {
        return this.iYearOfCentury;
    }

    public final DateTimeField yearOfEra() {
        return this.iYearOfEra;
    }

    public final DurationField years() {
        return this.iYears;
    }

    public long getDateTimeMillis(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        Chronology chronology = this.iBase;
        if (chronology == null || (this.iBaseFlags & 5) != 5) {
            return super.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
        }
        return chronology.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
    }

    public long getDateTimeMillis(long j, int i, int i2, int i3, int i4) throws IllegalArgumentException {
        Chronology chronology = this.iBase;
        if (chronology == null || (this.iBaseFlags & 1) != 1) {
            return super.getDateTimeMillis(j, i, i2, i3, i4);
        }
        return chronology.getDateTimeMillis(j, i, i2, i3, i4);
    }
}
