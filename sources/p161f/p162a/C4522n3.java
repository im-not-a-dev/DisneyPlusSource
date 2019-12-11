package p161f.p162a;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.appboy.p033s.C1557c;
import com.google.android.gms.common.GoogleApiAvailability;

/* renamed from: f.a.n3 */
public final class C4522n3 {

    /* renamed from: a */
    private static final String f11227a = C1557c.m7461a(C4522n3.class);

    /* renamed from: a */
    public static boolean m15655a(Context context) {
        try {
            Class.forName("com.google.android.gms.common.GoogleApiAvailability");
            int c = GoogleApiAvailability.m30032a().mo24987c(context);
            if (c == 0) {
                C1557c.m7458a(f11227a, "Google Play Services is available.");
                return true;
            }
            String str = f11227a;
            StringBuilder sb = new StringBuilder();
            sb.append("Google Play Services is unavailable. Connection result: ");
            sb.append(c);
            C1557c.m7469c(str, sb.toString());
            return false;
        } catch (Exception e) {
            C1557c.m7472d(f11227a, "Google Play Services Availability API not found. Google Play Services not enabled.", e);
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m15656b(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gsf", 0);
            return true;
        } catch (NameNotFoundException unused) {
            return false;
        } catch (Exception unused2) {
            C1557c.m7465b(f11227a, "Unexpected exception while checking for com.google.android.gsf");
            return false;
        }
    }
}
