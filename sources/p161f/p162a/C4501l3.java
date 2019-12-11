package p161f.p162a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.appboy.p030r.C1531a;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import com.appboy.receivers.AppboyActionReceiver;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.l3 */
public final class C4501l3 {

    /* renamed from: a */
    private static final String f11165a = C1557c.m7461a(C4501l3.class);

    /* renamed from: a */
    public static PendingIntent m15577a(Context context) {
        return PendingIntent.getBroadcast(context, 0, new Intent("com.appboy.action.receiver.APPBOY_GEOFENCE_UPDATE").setClass(context, AppboyActionReceiver.class), 134217728);
    }

    /* renamed from: b */
    public static PendingIntent m15581b(Context context) {
        return PendingIntent.getBroadcast(context, 0, new Intent("com.appboy.action.receiver.APPBOY_GEOFENCE_LOCATION_UPDATE").setClass(context, AppboyActionReceiver.class), 134217728);
    }

    /* renamed from: a */
    public static boolean m15579a(C4424d3 d3Var) {
        if (!d3Var.mo15497a()) {
            C1557c.m7469c(f11165a, "Geofences implicitly disabled via server configuration.");
            return false;
        } else if (d3Var.mo15498b()) {
            C1557c.m7469c(f11165a, "Geofences enabled in server configuration.");
            return true;
        } else {
            C1557c.m7469c(f11165a, "Geofences explicitly disabled via server configuration.");
            return false;
        }
    }

    /* renamed from: b */
    public static int m15580b(C4424d3 d3Var) {
        if (d3Var.mo15501e() > 0) {
            return d3Var.mo15501e();
        }
        return 20;
    }

    /* renamed from: a */
    public static List<C1531a> m15578a(SharedPreferences sharedPreferences) {
        ArrayList arrayList = new ArrayList();
        Map all = sharedPreferences.getAll();
        if (all == null || all.size() == 0) {
            C1557c.m7458a(f11165a, "Did not find stored geofences.");
            return arrayList;
        }
        Set<String> keySet = all.keySet();
        if (keySet == null || keySet.size() == 0) {
            C1557c.m7473e(f11165a, "Failed to find stored geofence keys.");
            return arrayList;
        }
        for (String str : keySet) {
            String string = sharedPreferences.getString(str, null);
            try {
                if (C1563i.m7490d(string)) {
                    String str2 = f11165a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Received null or blank serialized  geofence string for geofence id ");
                    sb.append(str);
                    sb.append(" from shared preferences. Not parsing.");
                    C1557c.m7473e(str2, sb.toString());
                } else {
                    arrayList.add(new C1531a(new JSONObject(string)));
                }
            } catch (JSONException e) {
                String str3 = f11165a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Encountered Json exception while parsing stored geofence: ");
                sb2.append(string);
                C1557c.m7470c(str3, sb2.toString(), e);
            } catch (Exception e2) {
                String str4 = f11165a;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Encountered unexpected exception while parsing stored geofence: ");
                sb3.append(string);
                C1557c.m7470c(str4, sb3.toString(), e2);
            }
        }
        return arrayList;
    }
}
