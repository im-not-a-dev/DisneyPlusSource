package p161f.p162a;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.appboy.p033s.C1557c;

/* renamed from: f.a.l6 */
public final class C4504l6 implements C4553p6 {

    /* renamed from: b */
    private static final String f11168b = C1557c.m7461a(C4504l6.class);

    /* renamed from: a */
    private C4609v6 f11169a = C4609v6.UNKNOWN;

    /* renamed from: a */
    public C4609v6 mo15672a() {
        return this.f11169a;
    }

    /* renamed from: a */
    public void mo15673a(Intent intent, ConnectivityManager connectivityManager) {
        String action = intent.getAction();
        if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
                if (activeNetworkInfo != null && !booleanExtra) {
                    activeNetworkInfo.isConnectedOrConnecting();
                    activeNetworkInfo.isRoaming();
                    switch (activeNetworkInfo.getType()) {
                        case 0:
                            int subtype = activeNetworkInfo.getSubtype();
                            if (subtype != 3) {
                                if (subtype == 13) {
                                    this.f11169a = C4609v6.FOUR_G;
                                    break;
                                } else {
                                    this.f11169a = C4609v6.TWO_G;
                                    break;
                                }
                            } else {
                                this.f11169a = C4609v6.THREE_G;
                                break;
                            }
                        case 1:
                            this.f11169a = C4609v6.WIFI;
                            break;
                        case 2:
                            this.f11169a = C4609v6.UNKNOWN;
                            break;
                        case 3:
                            this.f11169a = C4609v6.UNKNOWN;
                            break;
                        case 4:
                            this.f11169a = C4609v6.UNKNOWN;
                            break;
                        case 5:
                            this.f11169a = C4609v6.UNKNOWN;
                            break;
                        case 6:
                            this.f11169a = C4609v6.WIFI;
                            break;
                        case 7:
                            this.f11169a = C4609v6.UNKNOWN;
                            break;
                        case 8:
                            this.f11169a = C4609v6.UNKNOWN;
                            break;
                        case 9:
                            this.f11169a = C4609v6.UNKNOWN;
                            break;
                        default:
                            this.f11169a = C4609v6.UNKNOWN;
                            break;
                    }
                } else {
                    this.f11169a = C4609v6.NONE;
                }
            } catch (SecurityException e) {
                C1557c.m7470c(f11168b, "Failed to get active network information. Ensure the permission android.permission.ACCESS_NETWORK_STATE is defined in your AndroidManifest.xml", e);
            }
        } else {
            String str = f11168b;
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected system broadcast received [");
            sb.append(action);
            sb.append("]");
            C1557c.m7473e(str, sb.toString());
        }
    }
}
