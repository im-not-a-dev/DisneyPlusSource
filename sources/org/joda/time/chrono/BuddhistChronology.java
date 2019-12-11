package org.joda.time.chrono;

import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.chrono.AssembledChronology.Fields;
import org.joda.time.field.DelegatedDateTimeField;
import org.joda.time.field.DividedDateTimeField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.RemainderDateTimeField;
import org.joda.time.field.SkipUndoDateTimeField;
import org.joda.time.field.UnsupportedDurationField;

public final class BuddhistChronology extends AssembledChronology {

    /* renamed from: BE */
    public static final int f31926BE = 1;
    private static final int BUDDHIST_OFFSET = 543;
    private static final DateTimeField ERA_FIELD = new BasicSingleEraDateTimeField("BE");
    private static final BuddhistChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);
    private static final ConcurrentHashMap<DateTimeZone, BuddhistChronology> cCache = new ConcurrentHashMap<>();
    private static final long serialVersionUID = -3474595157769370126L;

    private BuddhistChronology(Chronology chronology, Object obj) {
        super(chronology, obj);
    }

    public static BuddhistChronology getInstance() {
        return getInstance(DateTimeZone.getDefault());
    }

    public static BuddhistChronology getInstanceUTC() {
        return INSTANCE_UTC;
    }

    private Object readResolve() {
        Chronology base = getBase();
        return base == null ? getInstanceUTC() : getInstance(base.getZone());
    }

    /* access modifiers changed from: protected */
    public void assemble(Fields fields) {
        if (getParam() == null) {
            fields.eras = UnsupportedDurationField.getInstance(DurationFieldType.eras());
            fields.year = new OffsetDateTimeField(new SkipUndoDateTimeField(this, fields.year), BUDDHIST_OFFSET);
            DateTimeField dateTimeField = fields.yearOfEra;
            fields.yearOfEra = new DelegatedDateTimeField(fields.year, fields.eras, DateTimeFieldType.yearOfEra());
            fields.weekyear = new OffsetDateTimeField(new SkipUndoDateTimeField(this, fields.weekyear), BUDDHIST_OFFSET);
            fields.centuryOfEra = new DividedDateTimeField(new OffsetDateTimeField(fields.yearOfEra, 99), fields.eras, DateTimeFieldType.centuryOfEra(), 100);
            fields.centuries = fields.centuryOfEra.getDurationField();
            fields.yearOfCentury = new OffsetDateTimeField(new RemainderDateTimeField((DividedDateTimeField) fields.centuryOfEra), DateTimeFieldType.yearOfCentury(), 1);
            fields.weekyearOfCentury = new OffsetDateTimeField(new RemainderDateTimeField(fields.weekyear, fields.centuries, DateTimeFieldType.weekyearOfCentury(), 100), DateTimeFieldType.weekyearOfCentury(), 1);
            fields.era = ERA_FIELD;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuddhistChronology)) {
            return false;
        }
        return getZone().equals(((BuddhistChronology) obj).getZone());
    }

    public int hashCode() {
        return ("Buddhist".hashCode() * 11) + getZone().hashCode();
    }

    public String toString() {
        DateTimeZone zone = getZone();
        String str = "BuddhistChronology";
        if (zone == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('[');
        sb.append(zone.getID());
        sb.append(']');
        return sb.toString();
    }

    public Chronology withUTC() {
        return INSTANCE_UTC;
    }

    public Chronology withZone(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        if (dateTimeZone == getZone()) {
            return this;
        }
        return getInstance(dateTimeZone);
    }

    public static BuddhistChronology getInstance(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        BuddhistChronology buddhistChronology = (BuddhistChronology) cCache.get(dateTimeZone);
        if (buddhistChronology != null) {
            return buddhistChronology;
        }
        BuddhistChronology buddhistChronology2 = new BuddhistChronology(GJChronology.getInstance(dateTimeZone, null), null);
        DateTime dateTime = new DateTime(1, 1, 1, 0, 0, 0, 0, (Chronology) buddhistChronology2);
        BuddhistChronology buddhistChronology3 = new BuddhistChronology(LimitChronology.getInstance(buddhistChronology2, dateTime, null), "");
        BuddhistChronology buddhistChronology4 = (BuddhistChronology) cCache.putIfAbsent(dateTimeZone, buddhistChronology3);
        return buddhistChronology4 != null ? buddhistChronology4 : buddhistChronology3;
    }
}
