package p163g.p426g.p432d.p433a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.TelephonyManager;
import java.util.Iterator;
import java.util.List;

/* renamed from: g.g.d.a.e */
/* compiled from: AndroidNetworkUtils */
public class C10844e {

    /* renamed from: a */
    private static Context f25632a;

    /* renamed from: a */
    public static void m34180a(Context context) {
        if (f25632a == null) {
            f25632a = context;
        }
    }

    /* renamed from: b */
    public static String m34181b() {
        WifiConfiguration wifiConfiguration;
        String str = "NONE";
        if (VERSION.SDK_INT < 29 && f25632a != null && m34186g().booleanValue() && C10847h.m34191a("android.permission.ACCESS_WIFI_STATE")) {
            WifiManager wifiManager = (WifiManager) f25632a.getSystemService("wifi");
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            if (connectionInfo != null) {
                WifiConfiguration wifiConfiguration2 = null;
                int networkId = connectionInfo.getNetworkId();
                Iterator it = wifiManager.getConfiguredNetworks().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    wifiConfiguration = (WifiConfiguration) it.next();
                    if (wifiConfiguration.status != 0) {
                        if (wifiConfiguration.networkId == networkId) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                wifiConfiguration2 = wifiConfiguration;
                if (wifiConfiguration2 != null) {
                    return m34179a(wifiConfiguration2);
                }
            }
        }
        return str;
    }

    /* renamed from: c */
    public static String m34182c() {
        Context context = f25632a;
        String str = "OTHER";
        if (context == null) {
            return str;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        return telephonyManager != null ? String.valueOf(telephonyManager.getNetworkType()) : str;
    }

    /* renamed from: d */
    public static int m34183d() {
        if (f25632a == null || m34184e().booleanValue()) {
            return 1000;
        }
        if (!m34186g().booleanValue()) {
            TelephonyManager telephonyManager = (TelephonyManager) f25632a.getSystemService("phone");
            if (!C10847h.m34191a("android.permission.ACCESS_COARSE_LOCATION")) {
                return 1000;
            }
            if ((VERSION.SDK_INT < 29 || C10847h.m34191a("android.permission.ACCESS_FINE_LOCATION")) && VERSION.SDK_INT >= 17) {
                List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
                if (allCellInfo != null && allCellInfo.size() > 0) {
                    for (CellInfo cellInfo : allCellInfo) {
                        if (cellInfo instanceof CellInfoGsm) {
                            return ((CellInfoGsm) cellInfo).getCellSignalStrength().getDbm();
                        }
                        if (cellInfo instanceof CellInfoCdma) {
                            return ((CellInfoCdma) cellInfo).getCellSignalStrength().getDbm();
                        }
                        if (VERSION.SDK_INT >= 18 && (cellInfo instanceof CellInfoWcdma)) {
                            return ((CellInfoWcdma) cellInfo).getCellSignalStrength().getDbm();
                        }
                        if (cellInfo instanceof CellInfoLte) {
                            return ((CellInfoLte) cellInfo).getCellSignalStrength().getDbm();
                        }
                    }
                }
            }
            return 1000;
        } else if (C10847h.m34191a("android.permission.ACCESS_WIFI_STATE")) {
            return ((WifiManager) f25632a.getSystemService("wifi")).getConnectionInfo().getRssi();
        } else {
            return 1000;
        }
    }

    /* renamed from: e */
    public static Boolean m34184e() {
        Context context = f25632a;
        boolean z = false;
        Boolean valueOf = Boolean.valueOf(false);
        if (context == null || !m34185f().booleanValue()) {
            return valueOf;
        }
        if (((ConnectivityManager) f25632a.getSystemService("connectivity")).getActiveNetworkInfo().getType() == 9) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: f */
    public static Boolean m34185f() {
        Context context = f25632a;
        boolean z = false;
        Boolean valueOf = Boolean.valueOf(false);
        if (context == null || !C10847h.m34191a("android.permission.ACCESS_NETWORK_STATE")) {
            return valueOf;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) f25632a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: g */
    public static Boolean m34186g() {
        Context context = f25632a;
        boolean z = false;
        Boolean valueOf = Boolean.valueOf(false);
        if (context == null || !m34185f().booleanValue()) {
            return valueOf;
        }
        if (((ConnectivityManager) f25632a.getSystemService("connectivity")).getActiveNetworkInfo().getType() == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: a */
    public static String m34178a() {
        if (m34184e().booleanValue()) {
            return "Ethernet";
        }
        if (m34186g().booleanValue()) {
            return "WiFi";
        }
        return m34182c();
    }

    /* renamed from: a */
    private static String m34179a(WifiConfiguration wifiConfiguration) {
        if (wifiConfiguration.allowedKeyManagement.get(1)) {
            return wifiConfiguration.allowedProtocols.get(1) ? "WPA2" : "WPA";
        }
        if (wifiConfiguration.allowedKeyManagement.get(2) || wifiConfiguration.allowedKeyManagement.get(3)) {
            return "EAP";
        }
        String[] strArr = wifiConfiguration.wepKeys;
        return (strArr.length <= 0 || strArr[0] == null) ? "NONE" : "WEP";
    }
}
