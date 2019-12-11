package com.bamtech.sdk4.location;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtech/sdk4/location/GpsLocation;", "Lcom/bamtech/sdk4/location/GeoLocation;", "latitude", "", "longitude", "(DD)V", "getLatitude", "()Ljava/lang/Double;", "getLongitude", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "extension-session"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: GeoLocation.kt */
public final class GpsLocation implements GeoLocation {
    private final double latitude;
    private final double longitude;

    public GpsLocation(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0032, code lost:
        if (java.lang.Double.compare(getLongitude().doubleValue(), r5.getLongitude().doubleValue()) == 0) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            if (r4 == r5) goto L_0x0037
            boolean r0 = r5 instanceof com.bamtech.sdk4.location.GpsLocation
            if (r0 == 0) goto L_0x0035
            com.bamtech.sdk4.location.GpsLocation r5 = (com.bamtech.sdk4.location.GpsLocation) r5
            java.lang.Double r0 = r4.getLatitude()
            double r0 = r0.doubleValue()
            java.lang.Double r2 = r5.getLatitude()
            double r2 = r2.doubleValue()
            int r0 = java.lang.Double.compare(r0, r2)
            if (r0 != 0) goto L_0x0035
            java.lang.Double r0 = r4.getLongitude()
            double r0 = r0.doubleValue()
            java.lang.Double r5 = r5.getLongitude()
            double r2 = r5.doubleValue()
            int r5 = java.lang.Double.compare(r0, r2)
            if (r5 != 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r5 = 0
            return r5
        L_0x0037:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.location.GpsLocation.equals(java.lang.Object):boolean");
    }

    public Double getLatitude() {
        return Double.valueOf(this.latitude);
    }

    public Double getLongitude() {
        return Double.valueOf(this.longitude);
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(getLatitude().doubleValue());
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
        long doubleToLongBits2 = Double.doubleToLongBits(getLongitude().doubleValue());
        return i + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GpsLocation(latitude=");
        sb.append(getLatitude());
        sb.append(", longitude=");
        sb.append(getLongitude());
        sb.append(")");
        return sb.toString();
    }
}
