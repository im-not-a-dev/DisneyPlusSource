package com.appboy.push;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.SystemClock;
import androidx.core.app.C0478i.C0483d;
import com.appboy.AppboyFcmReceiver;
import com.appboy.C1440a;
import com.appboy.C1473b;
import com.appboy.C1475c;
import com.appboy.C1478f;
import com.appboy.C1483k;
import com.appboy.p024n.C1489b;
import com.appboy.p025o.C1492a;
import com.appboy.p025o.C1497e;
import com.appboy.p033s.C1555b;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1560f;
import com.appboy.p033s.C1562h;
import com.appboy.p033s.C1563i;
import com.appboy.p034ui.AppboyNavigator;
import com.appboy.p034ui.actions.ActionFactory;
import com.appboy.p034ui.support.UriUtils;
import com.appboy.push.p028e.C1526a;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appboy.push.d */
/* compiled from: AppboyNotificationUtils */
public class C1525d {

    /* renamed from: a */
    private static final String f5565a = C1557c.m7461a(C1525d.class);

    /* renamed from: a */
    public static Bundle m7193a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String str = "appboy_story_newly_received";
        String str2 = "extra";
        if (bundle.containsKey(str) && !bundle.getBoolean(str)) {
            return bundle.getBundle(str2);
        }
        if (!C1478f.f5324a.booleanValue()) {
            return m7194a(bundle.getString(str2, "{}"));
        }
        return new Bundle(bundle);
    }

    /* renamed from: a */
    public static boolean m7206a(int i) {
        return i >= -2 && i <= 2;
    }

    /* renamed from: b */
    public static void m7211b(Context context, Intent intent) {
        try {
            C1557c.m7458a(f5565a, "Sending notification deleted broadcast");
            m7215b(context, ".intent.APPBOY_PUSH_DELETED", intent.getExtras());
        } catch (Exception e) {
            C1557c.m7470c(f5565a, "Exception occurred attempting to handle notification delete intent.", e);
        }
    }

    @TargetApi(21)
    /* renamed from: b */
    public static boolean m7218b(int i) {
        return i == -1 || i == 0 || i == 1;
    }

    /* renamed from: c */
    public static void m7222c(Context context, Intent intent) {
        try {
            m7230e(context, intent);
            m7235g(context, intent);
            if (new C1489b(context).mo6717j()) {
                m7233f(context, intent);
            }
        } catch (Exception e) {
            C1557c.m7470c(f5565a, "Exception occurred attempting to handle notification opened intent.", e);
        }
    }

    /* renamed from: d */
    public static boolean m7228d(Context context, Bundle bundle) {
        String str = "ab_sync_geos";
        if (!bundle.containsKey(str)) {
            C1557c.m7458a(f5565a, "Geofence sync key not included in push payload. Not syncing geofences.");
        } else if (Boolean.parseBoolean(bundle.getString(str))) {
            C1475c.m6994a(context, true);
            return true;
        } else {
            C1557c.m7458a(f5565a, "Geofence sync key was false. Not syncing geofences.");
        }
        return false;
    }

    /* renamed from: e */
    public static void m7231e(Context context, Bundle bundle) {
        C1557c.m7458a(f5565a, "Sending push message received broadcast");
        m7215b(context, ".intent.APPBOY_PUSH_RECEIVED", bundle);
    }

    /* renamed from: f */
    public static void m7233f(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("extra");
        if (bundleExtra == null) {
            bundleExtra = new Bundle();
        }
        String str = "cid";
        bundleExtra.putString(str, intent.getStringExtra(str));
        bundleExtra.putString("source", "Appboy");
        String str2 = "uri";
        String stringExtra = intent.getStringExtra(str2);
        if (!C1563i.m7490d(stringExtra)) {
            String str3 = f5565a;
            StringBuilder sb = new StringBuilder();
            sb.append("Found a deep link ");
            sb.append(stringExtra);
            C1557c.m7458a(str3, sb.toString());
            String str4 = "ab_use_webview";
            boolean equalsIgnoreCase = "true".equalsIgnoreCase(intent.getStringExtra(str4));
            String str5 = f5565a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Use webview set to: ");
            sb2.append(equalsIgnoreCase);
            C1557c.m7458a(str5, sb2.toString());
            bundleExtra.putString(str2, stringExtra);
            bundleExtra.putBoolean(str4, equalsIgnoreCase);
            AppboyNavigator.getAppboyNavigator().gotoUri(context, ActionFactory.createUriActionFromUrlString(stringExtra, bundleExtra, equalsIgnoreCase, C1497e.PUSH));
            return;
        }
        C1557c.m7458a(f5565a, "Push notification had no deep link. Opening main activity.");
        context.startActivity(UriUtils.getMainActivityIntent(context, bundleExtra));
    }

    /* renamed from: g */
    public static void m7236g(C0483d dVar, Bundle bundle) {
        if (bundle != null) {
            C1557c.m7458a(f5565a, "Setting ticker for notification");
            dVar.mo2670d((CharSequence) bundle.getString("t"));
        }
    }

    /* renamed from: h */
    public static void m7237h(C0483d dVar, Bundle bundle) {
        if (VERSION.SDK_INT < 21) {
            C1557c.m7458a(f5565a, "Notification visibility not supported on this android version. Not setting visibility for notification.");
        } else if (bundle != null) {
            String str = "ab_vs";
            if (bundle.containsKey(str)) {
                try {
                    int parseInt = Integer.parseInt(bundle.getString(str));
                    if (m7218b(parseInt)) {
                        C1557c.m7458a(f5565a, "Setting visibility for notification");
                        dVar.mo2675f(parseInt);
                        return;
                    }
                    String str2 = f5565a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Received invalid notification visibility ");
                    sb.append(parseInt);
                    C1557c.m7465b(str2, sb.toString());
                } catch (Exception e) {
                    C1557c.m7470c(f5565a, "Failed to parse visibility from notificationExtras", e);
                }
            }
        }
    }

    /* renamed from: e */
    public static void m7232e(C0483d dVar, Bundle bundle) {
        if (bundle != null) {
            String str = "sd";
            if (bundle.containsKey(str)) {
                String string = bundle.getString(str);
                if (string == null) {
                    return;
                }
                if (string.equals("d")) {
                    C1557c.m7458a(f5565a, "Setting default sound for notification.");
                    dVar.mo2659b(1);
                    return;
                }
                C1557c.m7458a(f5565a, "Setting sound for notification via uri.");
                dVar.mo2651a(Uri.parse(string));
                return;
            }
        }
        C1557c.m7458a(f5565a, "Sound key not present in notification extras. Not setting sound for notification.");
    }

    /* renamed from: g */
    static void m7235g(Context context, Intent intent) {
        C1557c.m7458a(f5565a, "Sending notification opened broadcast");
        m7215b(context, ".intent.APPBOY_NOTIFICATION_OPENED", intent.getExtras());
    }

    /* renamed from: b */
    public static boolean m7220b(Intent intent) {
        Bundle extras = intent.getExtras();
        return extras != null && extras.containsKey("t") && extras.containsKey("a");
    }

    /* renamed from: b */
    public static int m7209b(Bundle bundle) {
        if (bundle != null) {
            String str = "n";
            if (bundle.containsKey(str)) {
                try {
                    int parseInt = Integer.parseInt(bundle.getString(str));
                    String str2 = f5565a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Using notification id provided in the message's extras bundle: ");
                    sb.append(parseInt);
                    C1557c.m7458a(str2, sb.toString());
                    return parseInt;
                } catch (NumberFormatException e) {
                    C1557c.m7470c(f5565a, "Unable to parse notification id provided in the message's extras bundle. Using default notification id instead: -1", e);
                    return -1;
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                String str3 = "";
                sb2.append(bundle.getString("t", str3));
                sb2.append(bundle.getString("a", str3));
                int hashCode = sb2.toString().hashCode();
                String str4 = f5565a;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Message without notification id provided in the extras bundle received. Using a hash of the message: ");
                sb3.append(hashCode);
                C1557c.m7458a(str4, sb3.toString());
                return hashCode;
            }
        } else {
            C1557c.m7458a(f5565a, "Message without extras bundle received. Using default notification id: ");
            return -1;
        }
    }

    /* renamed from: d */
    public static void m7227d(C0483d dVar, Bundle bundle) {
        if (bundle.containsKey("ab_c")) {
            C1557c.m7458a(f5565a, "Set show when not supported in story push.");
            dVar.mo2671d(false);
        }
    }

    /* renamed from: a */
    public static Bundle m7194a(String str) {
        try {
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                bundle.putString(str2, jSONObject.getString(str2));
            }
            return bundle;
        } catch (JSONException e) {
            C1557c.m7470c(f5565a, "Unable parse JSON into a bundle.", e);
            return null;
        }
    }

    /* renamed from: c */
    public static int m7221c(Bundle bundle) {
        if (bundle != null) {
            String str = "p";
            if (bundle.containsKey(str)) {
                try {
                    int parseInt = Integer.parseInt(bundle.getString(str));
                    if (m7206a(parseInt)) {
                        return parseInt;
                    }
                    String str2 = f5565a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Received invalid notification priority ");
                    sb.append(parseInt);
                    C1557c.m7465b(str2, sb.toString());
                } catch (NumberFormatException e) {
                    C1557c.m7470c(f5565a, "Unable to parse custom priority. Returning default priority of 0", e);
                }
            }
        }
        return 0;
    }

    /* renamed from: d */
    public static boolean m7229d(Bundle bundle) {
        String str = "appboy_uninstall_tracking";
        if (bundle != null) {
            try {
                if (bundle.containsKey(str)) {
                    return true;
                }
                Bundle bundle2 = bundle.getBundle("extra");
                if (bundle2 != null) {
                    return bundle2.containsKey(str);
                }
            } catch (Exception e) {
                C1557c.m7470c(f5565a, "Failed to determine if push is uninstall tracking. Returning false.", e);
            }
        }
        return false;
    }

    /* renamed from: e */
    private static void m7230e(Context context, Intent intent) {
        C1440a.m6921c(context).mo6559a(intent);
    }

    /* renamed from: c */
    public static void m7223c(Context context, Bundle bundle) {
        if (bundle.containsKey("ab_c")) {
            String str = "appboy_story_newly_received";
            if (bundle.getBoolean(str, false)) {
                String str2 = "ab_c*_i";
                String a = C1522a.m7169a(0, bundle, str2);
                int i = 0;
                while (!C1563i.m7490d(a)) {
                    String str3 = f5565a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Pre-fetching bitmap at URL: ");
                    sb.append(a);
                    C1557c.m7471d(str3, sb.toString());
                    C1440a.m6921c(context).mo6578c().mo6659a(context, a, C1492a.NOTIFICATION_ONE_IMAGE_STORY);
                    i++;
                    a = C1522a.m7169a(i, bundle, str2);
                }
                bundle.putBoolean(str, false);
            }
        }
    }

    /* renamed from: d */
    public static void m7226d(Context context, Intent intent) {
        String str = "appboy_action_uri";
        try {
            C1440a.m6921c(context).mo6576b(intent.getStringExtra("appboy_campaign_id"), intent.getStringExtra("appboy_story_page_id"));
            String str2 = "uri";
            if (!C1563i.m7490d(intent.getStringExtra(str))) {
                intent.putExtra(str2, intent.getStringExtra(str));
                String stringExtra = intent.getStringExtra("appboy_action_use_webview");
                if (!C1563i.m7490d(stringExtra)) {
                    intent.putExtra("ab_use_webview", stringExtra);
                }
            } else {
                intent.removeExtra(str2);
            }
            context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            m7235g(context, intent);
            if (new C1489b(context).mo6717j()) {
                m7233f(context, intent);
            }
        } catch (Exception e) {
            C1557c.m7470c(f5565a, "Caught exception while handling story click.", e);
        }
    }

    /* renamed from: a */
    public static boolean m7208a(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            if ("true".equals(extras.getString("_ab"))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m7219b(Context context, C1489b bVar, Bundle bundle) {
        if (!C1562h.m7482a(context, "android.permission.WAKE_LOCK") || !bVar.mo6723p()) {
            return false;
        }
        if (VERSION.SDK_INT >= 26) {
            NotificationChannel a = m7191a((NotificationManager) context.getSystemService("notification"), bundle);
            if (a == null) {
                C1557c.m7458a(f5565a, "Not waking screen on Android O+ device, could not find notification channel.");
                return false;
            }
            int a2 = m7189a(a);
            if (a2 == 1) {
                String str = f5565a;
                StringBuilder sb = new StringBuilder();
                sb.append("Not acquiring wake-lock for Android O+ notification with importance: ");
                sb.append(a2);
                C1557c.m7458a(str, sb.toString());
                return false;
            }
        } else if (m7221c(bundle) == -2) {
            return false;
        }
        WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(268435482, f5565a);
        newWakeLock.acquire();
        newWakeLock.release();
        return true;
    }

    /* renamed from: a */
    public static void m7203a(Context context, Class<?> cls, int i, int i2) {
        Intent intent = new Intent(context, cls);
        intent.setAction("com.appboy.action.CANCEL_NOTIFICATION");
        intent.putExtra("nid", i);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 134217728);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (i2 >= 1000) {
            String str = f5565a;
            StringBuilder sb = new StringBuilder();
            sb.append("Setting Notification duration alarm for ");
            sb.append(i2);
            sb.append(" ms");
            C1557c.m7458a(str, sb.toString());
            alarmManager.set(3, SystemClock.elapsedRealtime() + ((long) i2), broadcast);
        }
    }

    /* renamed from: f */
    public static void m7234f(C0483d dVar, Bundle bundle) {
        if (bundle != null) {
            String str = "s";
            if (bundle.containsKey(str)) {
                String string = bundle.getString(str);
                if (string != null) {
                    C1557c.m7458a(f5565a, "Setting summary text for notification");
                    dVar.mo2666c((CharSequence) string);
                    return;
                }
                return;
            }
        }
        C1557c.m7458a(f5565a, "Summary text not present in notification extras. Not setting summary text for notification.");
    }

    /* renamed from: c */
    public static void m7225c(C1489b bVar, C0483d dVar, Bundle bundle) {
        if (bundle != null) {
            C1557c.m7458a(f5565a, "Setting title for notification");
            dVar.mo2661b(C1526a.m7238a(bVar, bundle.getString("t")));
        }
    }

    /* renamed from: a */
    public static C1483k m7195a() {
        C1483k p = C1440a.m6943p();
        return p == null ? C1523b.m7175a() : p;
    }

    /* renamed from: c */
    public static void m7224c(C0483d dVar, Bundle bundle) {
        if (bundle != null) {
            C1557c.m7458a(f5565a, "Setting priority for notification");
            dVar.mo2669d(m7221c(bundle));
        }
    }

    /* renamed from: a */
    public static void m7201a(Context context, C0483d dVar, Bundle bundle) {
        try {
            dVar.mo2649a(m7192a(context, "com.appboy.action.APPBOY_PUSH_CLICKED", bundle));
        } catch (Exception e) {
            C1557c.m7470c(f5565a, "Error setting content intent.", e);
        }
    }

    /* renamed from: a */
    public static int m7190a(C1489b bVar, C0483d dVar) {
        int v = bVar.mo6729v();
        if (v == 0) {
            C1557c.m7458a(f5565a, "Small notification icon resource was not found. Will use the app icon when displaying notifications.");
            v = bVar.mo6709b();
        } else {
            C1557c.m7458a(f5565a, "Setting small icon for notification via resource id");
        }
        dVar.mo2673e(v);
        return v;
    }

    /* renamed from: b */
    public static void m7217b(C1489b bVar, C0483d dVar, Bundle bundle) {
        if (bundle != null) {
            C1557c.m7458a(f5565a, "Setting content for notification");
            dVar.mo2655a(C1526a.m7238a(bVar, bundle.getString("a")));
        }
    }

    /* renamed from: b */
    public static void m7213b(Context context, C0483d dVar, Bundle bundle) {
        C1557c.m7458a(f5565a, "Setting delete intent.");
        try {
            dVar.mo2660b(m7192a(context, "com.appboy.action.APPBOY_PUSH_DELETED", bundle));
        } catch (Exception e) {
            C1557c.m7470c(f5565a, "Error setting delete intent.", e);
        }
    }

    /* renamed from: a */
    public static boolean m7207a(Context context, C1489b bVar, C0483d dVar, Bundle bundle) {
        String str = "ab_li";
        if (bundle.containsKey("ab_c")) {
            C1557c.m7458a(f5565a, "Large icon not supported in story push.");
            return false;
        }
        if (bundle != null) {
            try {
                if (bundle.containsKey(str)) {
                    C1557c.m7458a(f5565a, "Setting large icon for notification");
                    dVar.mo2650a(C1555b.m7450a(context, Uri.parse(bundle.getString(str)), C1492a.NOTIFICATION_LARGE_ICON));
                    return true;
                }
            } catch (Exception e) {
                C1557c.m7470c(f5565a, "Error setting large notification icon", e);
            }
        }
        C1557c.m7458a(f5565a, "Large icon bitmap url not present in extras. Attempting to use resource id instead.");
        int r = bVar.mo6725r();
        if (r != 0) {
            dVar.mo2650a(BitmapFactory.decodeResource(context.getResources(), r));
            return true;
        }
        C1557c.m7458a(f5565a, "Large icon resource id not present for notification");
        C1557c.m7458a(f5565a, "Large icon not set for notification");
        return false;
    }

    /* renamed from: b */
    public static void m7214b(Context context, C1489b bVar, C0483d dVar, Bundle bundle) {
        if (VERSION.SDK_INT >= 21 && bundle != null) {
            String str = "ab_pn";
            if (bundle.containsKey(str)) {
                String a = m7196a(context, bVar, bundle);
                Bundle a2 = m7194a(bundle.getString(str));
                C0483d dVar2 = new C0483d(context, a);
                m7217b(bVar, dVar2, a2);
                m7225c(bVar, dVar2, a2);
                m7234f(dVar2, a2);
                m7190a(bVar, dVar2);
                m7205a(bVar, dVar2, a2);
                dVar.mo2648a(dVar2.mo2644a());
            }
        }
    }

    /* renamed from: a */
    public static void m7202a(Context context, C0483d dVar, Bundle bundle, Bundle bundle2) {
        if (bundle != null) {
            C1557c.m7458a(f5565a, "Setting style for notification");
            dVar.mo2654a(C1524c.m7184a(context, bundle, bundle2, dVar));
        }
    }

    /* renamed from: b */
    public static Class<?> m7210b() {
        if (C1478f.f5324a.booleanValue()) {
            return C1473b.class;
        }
        return AppboyFcmReceiver.class;
    }

    /* renamed from: a */
    public static void m7205a(C1489b bVar, C0483d dVar, Bundle bundle) {
        if (VERSION.SDK_INT >= 21) {
            if (bundle != null) {
                String str = "ac";
                if (bundle.containsKey(str)) {
                    C1557c.m7458a(f5565a, "Using accent color for notification from extras bundle");
                    dVar.mo2645a((int) Long.parseLong(bundle.getString(str)));
                    return;
                }
            }
            C1557c.m7458a(f5565a, "Using default accent color for notification");
            dVar.mo2645a(bVar.mo6712e());
        }
    }

    /* renamed from: b */
    public static void m7216b(C0483d dVar, Bundle bundle) {
        if (VERSION.SDK_INT >= 26) {
            String string = bundle.getString("ab_bc", null);
            if (!C1563i.m7490d(string)) {
                try {
                    dVar.mo2665c(Integer.parseInt(string));
                } catch (NumberFormatException e) {
                    C1557c.m7470c(f5565a, "Caught exception while setting number on notification.", e);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m7204a(C0483d dVar, Bundle bundle) {
        if (VERSION.SDK_INT >= 21) {
            if (bundle != null) {
                String str = "ab_ct";
                if (bundle.containsKey(str)) {
                    C1557c.m7458a(f5565a, "Setting category for notification");
                    dVar.mo2656a(bundle.getString(str));
                    return;
                }
            }
            C1557c.m7458a(f5565a, "Category not present in notification extras. Not setting category for notification.");
            return;
        }
        C1557c.m7458a(f5565a, "Notification category not supported on this android version. Not setting category for notification.");
    }

    /* renamed from: b */
    public static void m7212b(Context context, Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("cid");
            if (!C1563i.m7490d(string)) {
                C1440a.m6921c(context).mo6575b(string);
                return;
            }
            String str = f5565a;
            StringBuilder sb = new StringBuilder();
            sb.append("Could not log push delivery event due to null or blank campaign id in push extras bundle: ");
            sb.append(bundle);
            C1557c.m7458a(str, sb.toString());
            return;
        }
        C1557c.m7458a(f5565a, "Could not log push delivery event due to null push extras bundle.");
    }

    /* renamed from: b */
    private static void m7215b(Context context, String str, Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(str);
        Intent intent = new Intent(sb.toString());
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        C1560f.m7480a(context, intent);
    }

    /* renamed from: a */
    public static void m7199a(Context context, Intent intent) {
        String str = "nid";
        try {
            if (intent.hasExtra(str)) {
                int intExtra = intent.getIntExtra(str, -1);
                String str2 = f5565a;
                StringBuilder sb = new StringBuilder();
                sb.append("Cancelling notification action with id: ");
                sb.append(intExtra);
                C1557c.m7458a(str2, sb.toString());
                ((NotificationManager) context.getSystemService("notification")).cancel("appboy_notification", intExtra);
            }
        } catch (Exception e) {
            C1557c.m7470c(f5565a, "Exception occurred handling cancel notification intent.", e);
        }
    }

    /* renamed from: a */
    public static void m7198a(Context context, int i) {
        try {
            String str = f5565a;
            StringBuilder sb = new StringBuilder();
            sb.append("Cancelling notification action with id: ");
            sb.append(i);
            C1557c.m7458a(str, sb.toString());
            Intent intent = new Intent("com.appboy.action.CANCEL_NOTIFICATION").setClass(context, m7210b());
            intent.putExtra("nid", i);
            C1560f.m7480a(context, intent);
        } catch (Exception e) {
            C1557c.m7470c(f5565a, "Exception occurred attempting to cancel notification.", e);
        }
    }

    /* renamed from: a */
    public static String m7196a(Context context, C1489b bVar, Bundle bundle) {
        String a = m7197a(bundle, "ab_nc");
        String str = "com_appboy_default_notification_channel";
        if (VERSION.SDK_INT < 26) {
            if (a == null) {
                a = str;
            }
            return a;
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (a != null) {
            if (notificationManager.getNotificationChannel(a) != null) {
                String str2 = f5565a;
                StringBuilder sb = new StringBuilder();
                sb.append("Found notification channel in extras with id: ");
                sb.append(a);
                C1557c.m7458a(str2, sb.toString());
                return a;
            }
            String str3 = f5565a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Notification channel from extras is invalid. No channel found with id: ");
            sb2.append(a);
            C1557c.m7458a(str3, sb2.toString());
        }
        if (notificationManager.getNotificationChannel(str) == null) {
            C1557c.m7458a(f5565a, "Appboy default notification channel does not exist on device; creating");
            NotificationChannel notificationChannel = new NotificationChannel(str, bVar.mo6714g(), 3);
            notificationChannel.setDescription(bVar.mo6713f());
            notificationManager.createNotificationChannel(notificationChannel);
        }
        return str;
    }

    /* renamed from: a */
    public static void m7200a(Context context, Bundle bundle) {
        if (!C1478f.f5324a.booleanValue()) {
            String str = "ab_cd";
            if (bundle.containsKey(str)) {
                String string = bundle.getString(str, null);
                String string2 = bundle.getString("ab_cd_uid", null);
                String str2 = f5565a;
                StringBuilder sb = new StringBuilder();
                sb.append("Push contains associated Content Cards card. User id: ");
                sb.append(string2);
                sb.append(" Card data: ");
                sb.append(string);
                C1557c.m7458a(str2, sb.toString());
                C1475c.m6993a(context, string, string2);
            }
        }
    }

    /* renamed from: a */
    private static String m7197a(Bundle bundle, String str) {
        if (bundle != null) {
            String string = bundle.getString(str, null);
            if (!C1563i.m7490d(string)) {
                return string;
            }
        }
        return null;
    }

    @TargetApi(26)
    /* renamed from: a */
    static NotificationChannel m7191a(NotificationManager notificationManager, Bundle bundle) {
        if (bundle == null) {
            C1557c.m7458a(f5565a, "Notification extras bundle was null. Could not find a valid notification channel");
            return null;
        }
        String string = bundle.getString("ab_nc", null);
        if (!C1563i.m7490d(string)) {
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(string);
            if (notificationChannel != null) {
                String str = f5565a;
                StringBuilder sb = new StringBuilder();
                sb.append("Found notification channel in extras with id: ");
                sb.append(string);
                C1557c.m7458a(str, sb.toString());
                return notificationChannel;
            }
            String str2 = f5565a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Notification channel from extras is invalid, no channel found with id: ");
            sb2.append(string);
            C1557c.m7458a(str2, sb2.toString());
        }
        NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel("com_appboy_default_notification_channel");
        if (notificationChannel2 != null) {
            return notificationChannel2;
        }
        C1557c.m7458a(f5565a, "Appboy default notification channel does not exist on device.");
        return null;
    }

    @TargetApi(26)
    /* renamed from: a */
    private static int m7189a(NotificationChannel notificationChannel) {
        return notificationChannel.getImportance();
    }

    /* renamed from: a */
    private static PendingIntent m7192a(Context context, String str, Bundle bundle) {
        Intent intent = new Intent(str).setClass(context, m7210b());
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        return PendingIntent.getBroadcast(context, C1560f.m7479a(), intent, 1073741824);
    }
}
