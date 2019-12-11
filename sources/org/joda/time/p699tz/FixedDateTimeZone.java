package org.joda.time.p699tz;

import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.joda.time.DateTimeZone;

/* renamed from: org.joda.time.tz.FixedDateTimeZone */
public final class FixedDateTimeZone extends DateTimeZone {
    private static final long serialVersionUID = -3513011772763289092L;
    private final String iNameKey;
    private final int iStandardOffset;
    private final int iWallOffset;

    public FixedDateTimeZone(String str, String str2, int i, int i2) {
        super(str);
        this.iNameKey = str2;
        this.iWallOffset = i;
        this.iStandardOffset = i2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedDateTimeZone)) {
            return false;
        }
        FixedDateTimeZone fixedDateTimeZone = (FixedDateTimeZone) obj;
        if (!(getID().equals(fixedDateTimeZone.getID()) && this.iStandardOffset == fixedDateTimeZone.iStandardOffset && this.iWallOffset == fixedDateTimeZone.iWallOffset)) {
            z = false;
        }
        return z;
    }

    public String getNameKey(long j) {
        return this.iNameKey;
    }

    public int getOffset(long j) {
        return this.iWallOffset;
    }

    public int getOffsetFromLocal(long j) {
        return this.iWallOffset;
    }

    public int getStandardOffset(long j) {
        return this.iStandardOffset;
    }

    public int hashCode() {
        return getID().hashCode() + (this.iStandardOffset * 37) + (this.iWallOffset * 31);
    }

    public boolean isFixed() {
        return true;
    }

    public long nextTransition(long j) {
        return j;
    }

    public long previousTransition(long j) {
        return j;
    }

    public TimeZone toTimeZone() {
        String id = getID();
        if (id.length() != 6 || (!id.startsWith("+") && !id.startsWith("-"))) {
            return new SimpleTimeZone(this.iWallOffset, getID());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("GMT");
        sb.append(getID());
        return TimeZone.getTimeZone(sb.toString());
    }
}
