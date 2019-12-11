package p161f.p162a;

import android.location.Location;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1564j;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.k1 */
public final class C4487k1 implements C4445f1 {

    /* renamed from: X */
    private static final String f11125X = C1557c.m7461a(C4487k1.class);

    /* renamed from: U */
    private final double f11126U;

    /* renamed from: V */
    private final Double f11127V;

    /* renamed from: W */
    private final Double f11128W;

    /* renamed from: c */
    private final double f11129c;

    public C4487k1(Location location) {
        this(location.getLatitude(), location.getLongitude(), Double.valueOf(location.getAltitude()), Double.valueOf((double) location.getAccuracy()));
    }

    /* renamed from: a */
    public double mo15549a() {
        return this.f11129c;
    }

    /* renamed from: c */
    public boolean mo15648c() {
        return this.f11127V != null;
    }

    /* renamed from: d */
    public double mo15550d() {
        return this.f11126U;
    }

    /* renamed from: e */
    public boolean mo15649e() {
        return this.f11128W != null;
    }

    /* renamed from: f */
    public JSONObject mo6750b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("latitude", this.f11129c);
            jSONObject.put("longitude", this.f11126U);
            if (mo15648c()) {
                jSONObject.put("altitude", this.f11127V);
            }
            if (mo15649e()) {
                jSONObject.put("ll_accuracy", this.f11128W);
            }
        } catch (JSONException e) {
            C1557c.m7470c(f11125X, "Caught exception creating location Json.", e);
        }
        return jSONObject;
    }

    public C4487k1(double d, double d2, Double d3, Double d4) {
        if (C1564j.m7493a(d, d2)) {
            this.f11129c = d;
            this.f11126U = d2;
            this.f11127V = d3;
            this.f11128W = d4;
            return;
        }
        throw new IllegalArgumentException("Unable to create AppboyLocation. Latitude and longitude values are bounded by ±90 and ±180 respectively");
    }
}
