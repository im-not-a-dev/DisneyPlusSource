package org.joda.time.chrono;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology.Fields;
import org.joda.time.field.DividedDateTimeField;
import org.joda.time.field.RemainderDateTimeField;

public final class ISOChronology extends AssembledChronology {
    private static final ISOChronology INSTANCE_UTC = new ISOChronology(GregorianChronology.getInstanceUTC());
    private static final ConcurrentHashMap<DateTimeZone, ISOChronology> cCache = new ConcurrentHashMap<>();
    private static final long serialVersionUID = -6212696554273812441L;

    private static final class Stub implements Serializable {
        private static final long serialVersionUID = -6212696554273812441L;
        private transient DateTimeZone iZone;

        Stub(DateTimeZone dateTimeZone) {
            this.iZone = dateTimeZone;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.iZone = (DateTimeZone) objectInputStream.readObject();
        }

        private Object readResolve() {
            return ISOChronology.getInstance(this.iZone);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.iZone);
        }
    }

    static {
        cCache.put(DateTimeZone.UTC, INSTANCE_UTC);
    }

    private ISOChronology(Chronology chronology) {
        super(chronology, null);
    }

    public static ISOChronology getInstance() {
        return getInstance(DateTimeZone.getDefault());
    }

    public static ISOChronology getInstanceUTC() {
        return INSTANCE_UTC;
    }

    private Object writeReplace() {
        return new Stub(getZone());
    }

    /* access modifiers changed from: protected */
    public void assemble(Fields fields) {
        if (getBase().getZone() == DateTimeZone.UTC) {
            fields.centuryOfEra = new DividedDateTimeField(ISOYearOfEraDateTimeField.INSTANCE, DateTimeFieldType.centuryOfEra(), 100);
            fields.centuries = fields.centuryOfEra.getDurationField();
            fields.yearOfCentury = new RemainderDateTimeField((DividedDateTimeField) fields.centuryOfEra, DateTimeFieldType.yearOfCentury());
            fields.weekyearOfCentury = new RemainderDateTimeField((DividedDateTimeField) fields.centuryOfEra, fields.weekyears, DateTimeFieldType.weekyearOfCentury());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ISOChronology)) {
            return false;
        }
        return getZone().equals(((ISOChronology) obj).getZone());
    }

    public int hashCode() {
        return ("ISO".hashCode() * 11) + getZone().hashCode();
    }

    public String toString() {
        DateTimeZone zone = getZone();
        String str = "ISOChronology";
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

    public static ISOChronology getInstance(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        ISOChronology iSOChronology = (ISOChronology) cCache.get(dateTimeZone);
        if (iSOChronology != null) {
            return iSOChronology;
        }
        ISOChronology iSOChronology2 = new ISOChronology(ZonedChronology.getInstance(INSTANCE_UTC, dateTimeZone));
        ISOChronology iSOChronology3 = (ISOChronology) cCache.putIfAbsent(dateTimeZone, iSOChronology2);
        return iSOChronology3 != null ? iSOChronology3 : iSOChronology2;
    }
}
