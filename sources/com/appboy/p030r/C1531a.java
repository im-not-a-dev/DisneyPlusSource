package com.appboy.p030r;

import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.Geofence.Builder;
import org.json.JSONException;
import org.json.JSONObject;
import p161f.p162a.C4608v5;
import p161f.p162a.C4626x5;

/* renamed from: com.appboy.r.a */
public class C1531a implements C1535e<JSONObject>, Comparable<C1531a> {

    /* renamed from: U */
    private final String f5579U;

    /* renamed from: V */
    private final double f5580V;

    /* renamed from: W */
    private final double f5581W;

    /* renamed from: X */
    final int f5582X;

    /* renamed from: Y */
    private final int f5583Y;

    /* renamed from: Z */
    private final int f5584Z;

    /* renamed from: a0 */
    private final boolean f5585a0;

    /* renamed from: b0 */
    private final boolean f5586b0;

    /* renamed from: c */
    private final JSONObject f5587c;

    /* renamed from: c0 */
    final boolean f5588c0;

    /* renamed from: d0 */
    final boolean f5589d0;

    /* renamed from: e0 */
    final int f5590e0;

    /* renamed from: f0 */
    double f5591f0;

    public C1531a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        this(jSONObject2, jSONObject2.getString("id"), jSONObject2.getDouble("latitude"), jSONObject2.getDouble("longitude"), jSONObject2.getInt("radius"), jSONObject2.getInt("cooldown_enter"), jSONObject2.getInt("cooldown_exit"), jSONObject2.getBoolean("analytics_enabled_enter"), jSONObject2.getBoolean("analytics_enabled_exit"), jSONObject2.optBoolean("enter_events", true), jSONObject2.optBoolean("exit_events", true), jSONObject2.optInt("notification_responsiveness", 30000));
    }

    /* renamed from: I */
    public boolean mo6781I() {
        return this.f5586b0;
    }

    /* renamed from: J */
    public boolean mo6782J() {
        return this.f5585a0;
    }

    /* renamed from: K */
    public int mo6783K() {
        return this.f5583Y;
    }

    /* renamed from: L */
    public int mo6784L() {
        return this.f5584Z;
    }

    /* renamed from: M */
    public double mo6785M() {
        return this.f5591f0;
    }

    /* renamed from: N */
    public String mo6786N() {
        return this.f5579U;
    }

    /* renamed from: O */
    public double mo6787O() {
        return this.f5580V;
    }

    /* renamed from: P */
    public double mo6788P() {
        return this.f5581W;
    }

    /* renamed from: Q */
    public Geofence mo6789Q() {
        Builder builder = new Builder();
        builder.setRequestId(this.f5579U).setCircularRegion(this.f5580V, this.f5581W, (float) this.f5582X).setNotificationResponsiveness(this.f5590e0).setExpirationDuration(-1);
        int i = this.f5588c0 ? 1 : 0;
        if (this.f5589d0) {
            i |= 2;
        }
        builder.setTransitionTypes(i);
        return builder.build();
    }

    /* renamed from: a */
    public void mo6791a(double d) {
        this.f5591f0 = d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppboyGeofence{");
        sb.append("id=");
        sb.append(this.f5579U);
        sb.append(", latitude='");
        sb.append(this.f5580V);
        sb.append(", longitude=");
        sb.append(this.f5581W);
        sb.append(", radiusMeters=");
        sb.append(this.f5582X);
        sb.append(", cooldownEnterSeconds=");
        sb.append(this.f5583Y);
        sb.append(", cooldownExitSeconds=");
        sb.append(this.f5584Z);
        sb.append(", analyticsEnabledEnter=");
        sb.append(this.f5586b0);
        sb.append(", analyticsEnabledExit=");
        sb.append(this.f5585a0);
        sb.append(", enterEvents=");
        sb.append(this.f5588c0);
        sb.append(", exitEvents=");
        sb.append(this.f5589d0);
        sb.append(", notificationResponsivenessMs=");
        sb.append(this.f5590e0);
        sb.append(", distanceFromGeofenceRefresh=");
        sb.append(this.f5591f0);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public int compareTo(C1531a aVar) {
        double d = this.f5591f0;
        int i = 1;
        if (d == -1.0d) {
            return 1;
        }
        if (d < aVar.mo6785M()) {
            i = -1;
        }
        return i;
    }

    /* renamed from: b */
    public boolean mo6792b(C1531a aVar) {
        try {
            C4608v5.m16017a(aVar.mo6750b(), this.f5587c, C4626x5.LENIENT);
            return true;
        } catch (AssertionError | JSONException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public JSONObject m7269b() {
        return this.f5587c;
    }

    C1531a(JSONObject jSONObject, String str, double d, double d2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, int i4) {
        this.f5591f0 = -1.0d;
        this.f5587c = jSONObject;
        this.f5579U = str;
        this.f5580V = d;
        this.f5581W = d2;
        this.f5582X = i;
        this.f5583Y = i2;
        this.f5584Z = i3;
        this.f5586b0 = z;
        this.f5585a0 = z2;
        this.f5588c0 = z3;
        this.f5589d0 = z4;
        this.f5590e0 = i4;
    }
}
