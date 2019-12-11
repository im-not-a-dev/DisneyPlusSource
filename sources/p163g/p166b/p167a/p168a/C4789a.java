package p163g.p166b.p167a.p168a;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.C1380a;
import com.android.billingclient.api.C1414g;
import com.android.billingclient.api.C1417h;
import com.android.billingclient.api.C1417h.C1419b;
import com.android.billingclient.api.C1421j;
import com.android.billingclient.api.C1426m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;

/* renamed from: g.b.a.a.a */
/* compiled from: BillingHelper */
public final class C4789a {

    /* renamed from: a */
    public static int f11929a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static C1417h m16673a(Intent intent, String str) {
        if (intent == null) {
            m16681c("BillingHelper", "Got null intent!");
            C1419b c = C1417h.m6850c();
            c.mo6505a(6);
            c.mo6506a("An internal error occurred.");
            return c.mo6507a();
        }
        C1419b c2 = C1417h.m6850c();
        c2.mo6505a(m16678b(intent.getExtras(), str));
        c2.mo6506a(m16675a(intent.getExtras(), str));
        return c2.mo6507a();
    }

    /* renamed from: b */
    public static void m16680b(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            Log.v(str, str2);
        }
    }

    /* renamed from: c */
    public static void m16681c(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    /* renamed from: b */
    public static int m16677b(Intent intent, String str) {
        return m16673a(intent, str).mo6504b();
    }

    /* renamed from: b */
    public static int m16678b(Bundle bundle, String str) {
        if (bundle == null) {
            m16681c(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            m16680b(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected type for bundle response code: ");
            sb.append(obj.getClass().getName());
            m16681c(str, sb.toString());
            return 6;
        }
    }

    /* renamed from: a */
    public static String m16675a(Bundle bundle, String str) {
        String str2 = "";
        if (bundle == null) {
            m16681c(str, "Unexpected null bundle received!");
            return str2;
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            m16680b(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return str2;
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected type for debug message: ");
            sb.append(obj.getClass().getName());
            m16681c(str, sb.toString());
            return str2;
        }
    }

    /* renamed from: b */
    public static Bundle m16679b(boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    /* renamed from: a */
    public static List<C1426m> m16676a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            String str = "BillingHelper";
            m16681c(str, "Couldn't find purchase lists, trying to find single data.");
            C1426m a = m16674a(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (a == null) {
                m16681c(str, "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(a);
        } else {
            int i = 0;
            while (i < stringArrayList.size() && i < stringArrayList2.size()) {
                C1426m a2 = m16674a((String) stringArrayList.get(i), (String) stringArrayList2.get(i));
                if (a2 != null) {
                    arrayList.add(a2);
                }
                i++;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Bundle m16670a(C1414g gVar, boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (gVar.mo6495d() != 0) {
            bundle.putInt("prorationMode", gVar.mo6495d());
        }
        if (!TextUtils.isEmpty(gVar.mo6492a())) {
            bundle.putString("accountId", gVar.mo6492a());
        }
        if (gVar.mo6499h()) {
            bundle.putBoolean("vr", true);
        }
        if (!TextUtils.isEmpty(gVar.mo6494c())) {
            bundle.putStringArrayList("skusToReplace", new ArrayList(Arrays.asList(new String[]{gVar.mo6494c()})));
        }
        if (!TextUtils.isEmpty(gVar.mo6493b())) {
            bundle.putString("developerId", gVar.mo6493b());
        }
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m16672a(boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m16671a(C1421j jVar, boolean z, String str) {
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        String a = jVar.mo6508a();
        if (z && !TextUtils.isEmpty(a)) {
            bundle.putString("developerPayload", a);
        }
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m16669a(C1380a aVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        String a = aVar.mo6446a();
        if (!TextUtils.isEmpty(a)) {
            bundle.putString("developerPayload", a);
        }
        return bundle;
    }

    /* renamed from: a */
    private static C1426m m16674a(String str, String str2) {
        C1426m mVar = null;
        String str3 = "BillingHelper";
        if (str == null || str2 == null) {
            m16681c(str3, "Received a bad purchase data.");
            return null;
        }
        try {
            mVar = new C1426m(str, str2);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Got JSONException while parsing purchase data: ");
            sb.append(e);
            m16681c(str3, sb.toString());
        }
        return mVar;
    }
}
