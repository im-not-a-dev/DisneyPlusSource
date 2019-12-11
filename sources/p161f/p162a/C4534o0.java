package p161f.p162a;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import com.appboy.p024n.C1489b;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1562h;
import com.appboy.receivers.AppboyActionReceiver;
import java.util.concurrent.TimeUnit;

@SuppressLint({"MissingPermission"})
/* renamed from: f.a.o0 */
public class C4534o0 implements C4619x0 {

    /* renamed from: e */
    private static final String f11257e = C1557c.m7461a(C4534o0.class);

    /* renamed from: f */
    private static final long f11258f = TimeUnit.MINUTES.toMillis(10);

    /* renamed from: a */
    private final Context f11259a;

    /* renamed from: b */
    private final LocationManager f11260b;

    /* renamed from: c */
    private final C4595u0 f11261c;

    /* renamed from: d */
    private final boolean f11262d;

    public C4534o0(Context context, C4595u0 u0Var, C1489b bVar) {
        this.f11259a = context;
        this.f11261c = u0Var;
        this.f11260b = (LocationManager) context.getSystemService("location");
        this.f11262d = m15691a(bVar);
    }

    /* renamed from: a */
    public boolean mo15740a(C4445f1 f1Var) {
        try {
            this.f11261c.mo15772a((C4432e1) C4548p1.m15761a(f1Var));
            return true;
        } catch (Exception e) {
            C1557c.m7474e(f11257e, "Failed to log location recorded event.", e);
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo15739a() {
        if (!this.f11262d) {
            C1557c.m7469c(f11257e, "Did not request single location update. Location collection is disabled.");
            return false;
        }
        boolean a = C1562h.m7482a(this.f11259a, "android.permission.ACCESS_FINE_LOCATION");
        boolean a2 = C1562h.m7482a(this.f11259a, "android.permission.ACCESS_COARSE_LOCATION");
        if (a2 || a) {
            if (a) {
                Location a3 = m15689a(this.f11260b);
                if (a3 != null) {
                    String str = f11257e;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Setting user location to last known GPS location: ");
                    sb.append(a3);
                    C1557c.m7458a(str, sb.toString());
                    mo15740a((C4445f1) new C4487k1(a3));
                    return true;
                }
            }
            String a4 = m15690a(this.f11260b, a, a2);
            if (a4 == null) {
                C1557c.m7458a(f11257e, "Could not request single location update. Could not find suitable location provider.");
                return false;
            }
            try {
                String str2 = f11257e;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Requesting single location update with provider: ");
                sb2.append(a4);
                C1557c.m7458a(str2, sb2.toString());
                this.f11260b.requestSingleUpdate(a4, PendingIntent.getBroadcast(this.f11259a, 0, new Intent("com.appboy.action.receiver.SINGLE_LOCATION_UPDATE").setClass(this.f11259a, AppboyActionReceiver.class), 134217728));
                return true;
            } catch (SecurityException e) {
                C1557c.m7474e(f11257e, "Failed to request single location update due to security exception from insufficient permissions.", e);
                return false;
            } catch (Exception e2) {
                C1557c.m7474e(f11257e, "Failed to request single location update due to exception.", e2);
                return false;
            }
        } else {
            C1557c.m7469c(f11257e, "Did not request single location update. Neither fine nor coarse location permissions found.");
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m15691a(C1489b bVar) {
        if (bVar.mo6706B()) {
            C1557c.m7469c(f11257e, "Location collection enabled via sdk configuration.");
            return true;
        }
        C1557c.m7469c(f11257e, "Location collection disabled via sdk configuration.");
        return false;
    }

    /* renamed from: a */
    static String m15690a(LocationManager locationManager, boolean z, boolean z2) {
        String str = "passive";
        String str2 = "network";
        if ((z2 || z) && locationManager.isProviderEnabled(str2)) {
            return str2;
        }
        if (!z || !locationManager.isProviderEnabled(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    static Location m15689a(LocationManager locationManager) {
        String str = "gps";
        if (!locationManager.isProviderEnabled(str)) {
            return null;
        }
        Location lastKnownLocation = locationManager.getLastKnownLocation(str);
        if (lastKnownLocation == null) {
            return null;
        }
        long c = C4472i3.m15487c() - lastKnownLocation.getTime();
        if (c > f11258f) {
            String str2 = f11257e;
            StringBuilder sb = new StringBuilder();
            sb.append("Last known GPS location is too old and will not be used. Age ms: ");
            sb.append(c);
            C1557c.m7471d(str2, sb.toString());
            return null;
        }
        String str3 = f11257e;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Using last known GPS location: ");
        sb2.append(lastKnownLocation);
        C1557c.m7458a(str3, sb2.toString());
        return lastKnownLocation;
    }
}
