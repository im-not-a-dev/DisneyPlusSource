package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.C0478i.C0482c;
import androidx.core.app.C0478i.C0483d;
import androidx.core.app.C0478i.C0485f;
import com.google.android.gms.common.util.C9948l;
import java.util.Arrays;
import java.util.Iterator;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import p096e.p121h.p122j.C4025a;

/* renamed from: com.google.firebase.messaging.e */
/* compiled from: com.google.firebase:firebase-messaging@@19.0.1 */
public final class C10517e {

    /* renamed from: d */
    private static final AtomicInteger f24912d = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: a */
    private final Context f24913a;

    /* renamed from: b */
    private final String f24914b;

    /* renamed from: c */
    private Bundle f24915c;

    public C10517e(Context context, String str) {
        this.f24913a = context;
        this.f24914b = str;
    }

    /* renamed from: b */
    public static boolean m33190b(Bundle bundle) {
        return "1".equals(m33185a(bundle, "gcm.n.e")) || m33185a(bundle, "gcm.n.icon") != null;
    }

    /* renamed from: c */
    public static String m33193c(Bundle bundle, String str) {
        String valueOf = String.valueOf(str);
        String str2 = "_loc_key";
        return m33185a(bundle, str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf));
    }

    /* renamed from: d */
    private final String m33196d(Bundle bundle, String str) {
        String a = m33185a(bundle, str);
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        return m33198e(bundle, str);
    }

    /* renamed from: e */
    private final CharSequence m33197e(Bundle bundle) {
        String d = m33196d(bundle, "gcm.n.title");
        if (!TextUtils.isEmpty(d)) {
            return d;
        }
        try {
            return m33188b(0).loadLabel(this.f24913a.getPackageManager());
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(valueOf);
            Log.e("FirebaseMessaging", sb.toString());
            return "";
        }
    }

    /* renamed from: f */
    private static boolean m33199f(Bundle bundle) {
        if (bundle != null) {
            if ("1".equals(bundle.getString("google.c.a.e"))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C10519g mo27383a(Bundle bundle) {
        Uri uri;
        Intent intent;
        PendingIntent pendingIntent;
        C0483d dVar = new C0483d(this.f24913a, m33194c(m33185a(bundle, "gcm.n.android_channel_id")));
        dVar.mo2657a(true);
        dVar.mo2661b(m33197e(bundle));
        String d = m33196d(bundle, "gcm.n.body");
        if (!TextUtils.isEmpty(d)) {
            dVar.mo2655a((CharSequence) d);
            C0482c cVar = new C0482c();
            cVar.mo2641a((CharSequence) d);
            dVar.mo2654a((C0485f) cVar);
        }
        dVar.mo2673e(m33182a(m33185a(bundle, "gcm.n.icon")));
        String c = m33192c(bundle);
        PendingIntent pendingIntent2 = null;
        if (TextUtils.isEmpty(c)) {
            uri = null;
        } else {
            if (!"default".equals(c)) {
                if (this.f24913a.getResources().getIdentifier(c, "raw", this.f24914b) != 0) {
                    String str = this.f24914b;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(c).length());
                    sb.append("android.resource://");
                    sb.append(str);
                    sb.append("/raw/");
                    sb.append(c);
                    uri = Uri.parse(sb.toString());
                }
            }
            uri = RingtoneManager.getDefaultUri(2);
        }
        if (uri != null) {
            dVar.mo2651a(uri);
        }
        String a = m33185a(bundle, "gcm.n.click_action");
        if (!TextUtils.isEmpty(a)) {
            intent = new Intent(a);
            intent.setPackage(this.f24914b);
            intent.setFlags(268435456);
        } else {
            Uri d2 = m33195d(bundle);
            if (d2 != null) {
                intent = new Intent("android.intent.action.VIEW");
                intent.setPackage(this.f24914b);
                intent.setData(d2);
            } else {
                intent = this.f24913a.getPackageManager().getLaunchIntentForPackage(this.f24914b);
                if (intent == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                }
            }
        }
        if (intent == null) {
            pendingIntent = null;
        } else {
            intent.addFlags(67108864);
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2 != null && str2.startsWith("google.c.")) {
                    it.remove();
                }
            }
            intent.putExtras(bundle2);
            for (String str3 : bundle2.keySet()) {
                if (str3.startsWith("gcm.n.") || str3.startsWith("gcm.notification.")) {
                    intent.removeExtra(str3);
                }
            }
            pendingIntent = PendingIntent.getActivity(this.f24913a, f24912d.incrementAndGet(), intent, 1073741824);
            if (m33199f(bundle)) {
                Intent intent2 = new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN");
                m33186a(intent2, bundle);
                intent2.putExtra("pending_intent", pendingIntent);
                pendingIntent = m33183a(f24912d.incrementAndGet(), intent2);
            }
        }
        dVar.mo2649a(pendingIntent);
        if (m33199f(bundle)) {
            Intent intent3 = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS");
            m33186a(intent3, bundle);
            pendingIntent2 = m33183a(f24912d.incrementAndGet(), intent3);
        }
        if (pendingIntent2 != null) {
            dVar.mo2660b(pendingIntent2);
        }
        Integer b = m33189b(m33185a(bundle, "gcm.n.color"));
        if (b != null) {
            dVar.mo2645a(b.intValue());
        }
        String a2 = m33185a(bundle, "gcm.n.tag");
        if (TextUtils.isEmpty(a2)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("FCM-Notification:");
            sb2.append(uptimeMillis);
            a2 = sb2.toString();
        }
        return new C10519g(dVar, a2, 0);
    }

    /* renamed from: c */
    public static String m33192c(Bundle bundle) {
        String a = m33185a(bundle, "gcm.n.sound2");
        return TextUtils.isEmpty(a) ? m33185a(bundle, "gcm.n.sound") : a;
    }

    /* renamed from: b */
    public static Object[] m33191b(Bundle bundle, String str) {
        String valueOf = String.valueOf(str);
        String str2 = "_loc_args";
        String a = m33185a(bundle, str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf));
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(a);
            Object[] objArr = new String[jSONArray.length()];
            for (int i = 0; i < objArr.length; i++) {
                objArr[i] = jSONArray.opt(i);
            }
            return objArr;
        } catch (JSONException unused) {
            String valueOf2 = String.valueOf(str);
            String substring = (str2.length() != 0 ? valueOf2.concat(str2) : new String(valueOf2)).substring(6);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 41 + String.valueOf(a).length());
            sb.append("Malformed ");
            sb.append(substring);
            sb.append(": ");
            sb.append(a);
            sb.append("  Default value will be used.");
            Log.w("FirebaseMessaging", sb.toString());
            return null;
        }
    }

    /* renamed from: d */
    static Uri m33195d(Bundle bundle) {
        String a = m33185a(bundle, "gcm.n.link_android");
        if (TextUtils.isEmpty(a)) {
            a = m33185a(bundle, "gcm.n.link");
        }
        if (!TextUtils.isEmpty(a)) {
            return Uri.parse(a);
        }
        return null;
    }

    @TargetApi(26)
    /* renamed from: c */
    private final String m33194c(String str) {
        if (!C9948l.m30996i()) {
            return null;
        }
        int i = 0;
        try {
            i = m33188b(i).targetSdkVersion;
        } catch (NameNotFoundException unused) {
        }
        if (i < 26) {
            return null;
        }
        NotificationManager notificationManager = (NotificationManager) this.f24913a.getSystemService(NotificationManager.class);
        String str2 = "FirebaseMessaging";
        if (!TextUtils.isEmpty(str)) {
            if (notificationManager.getNotificationChannel(str) != null) {
                return str;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 122);
            sb.append("Notification Channel requested (");
            sb.append(str);
            sb.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
            Log.w(str2, sb.toString());
        }
        String string = m33184a().getString("com.google.firebase.messaging.default_notification_channel_id");
        if (TextUtils.isEmpty(string)) {
            Log.w(str2, "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
        } else if (notificationManager.getNotificationChannel(string) != null) {
            return string;
        } else {
            Log.w(str2, "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
        }
        String str3 = "fcm_fallback_notification_channel";
        if (notificationManager.getNotificationChannel(str3) == null) {
            notificationManager.createNotificationChannel(new NotificationChannel(str3, this.f24913a.getString(this.f24913a.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", this.f24914b)), 3));
        }
        return str3;
    }

    /* renamed from: e */
    private final String m33198e(Bundle bundle, String str) {
        String c = m33193c(bundle, str);
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        Resources resources = this.f24913a.getResources();
        int identifier = resources.getIdentifier(c, "string", this.f24914b);
        String str2 = " Default value will be used.";
        String str3 = "FirebaseMessaging";
        if (identifier == 0) {
            String valueOf = String.valueOf(str);
            String str4 = "_loc_key";
            String substring = (str4.length() != 0 ? valueOf.concat(str4) : new String(valueOf)).substring(6);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 49 + String.valueOf(str).length());
            sb.append(substring);
            sb.append(" resource not found: ");
            sb.append(str);
            sb.append(str2);
            Log.w(str3, sb.toString());
            return null;
        }
        Object[] b = m33191b(bundle, str);
        if (b == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, b);
        } catch (MissingFormatArgumentException e) {
            String arrays = Arrays.toString(b);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 58 + String.valueOf(arrays).length());
            sb2.append("Missing format argument for ");
            sb2.append(str);
            sb2.append(": ");
            sb2.append(arrays);
            sb2.append(str2);
            Log.w(str3, sb2.toString(), e);
            return null;
        }
    }

    /* renamed from: b */
    private final Integer m33189b(String str) {
        if (VERSION.SDK_INT < 21) {
            return null;
        }
        String str2 = "FirebaseMessaging";
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 54);
                sb.append("Color ");
                sb.append(str);
                sb.append(" not valid. Notification will use default color.");
                Log.w(str2, sb.toString());
            }
        }
        int i = m33184a().getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i != 0) {
            try {
                return Integer.valueOf(C4025a.m13788a(this.f24913a, i));
            } catch (NotFoundException unused2) {
                Log.w(str2, "Cannot find the color resource referenced in AndroidManifest.");
            }
        }
        return null;
    }

    /* renamed from: b */
    private final ApplicationInfo m33188b(int i) throws NameNotFoundException {
        return this.f24913a.getPackageManager().getApplicationInfo(this.f24914b, i);
    }

    /* renamed from: a */
    public static String m33185a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    @TargetApi(26)
    /* renamed from: a */
    private final boolean m33187a(int i) {
        String str = "FirebaseMessaging";
        if (VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(this.f24913a.getResources().getDrawable(i, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb = new StringBuilder(77);
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i);
            Log.e(str, sb.toString());
            return false;
        } catch (NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i);
            sb2.append(", treating it as an invalid icon");
            Log.e(str, sb2.toString());
            return false;
        }
    }

    /* renamed from: a */
    private final int m33182a(String str) {
        String str2 = "FirebaseMessaging";
        if (!TextUtils.isEmpty(str)) {
            Resources resources = this.f24913a.getResources();
            int identifier = resources.getIdentifier(str, "drawable", this.f24914b);
            if (identifier != 0 && m33187a(identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str, "mipmap", this.f24914b);
            if (identifier2 != 0 && m33187a(identifier2)) {
                return identifier2;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("Icon resource ");
            sb.append(str);
            sb.append(" not found. Notification will use default icon.");
            Log.w(str2, sb.toString());
        }
        int i = m33184a().getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !m33187a(i)) {
            try {
                i = m33188b(0).icon;
            } catch (NameNotFoundException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 35);
                sb2.append("Couldn't get own application info: ");
                sb2.append(valueOf);
                Log.w(str2, sb2.toString());
            }
        }
        if (i == 0 || !m33187a(i)) {
            i = 17301651;
        }
        return i;
    }

    /* renamed from: a */
    private final synchronized Bundle m33184a() {
        if (this.f24915c != null) {
            return this.f24915c;
        }
        try {
            ApplicationInfo b = m33188b(128);
            if (!(b == null || b.metaData == null)) {
                this.f24915c = b.metaData;
                return this.f24915c;
            }
        } catch (NameNotFoundException e) {
            String str = "FirebaseMessaging";
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(valueOf);
            Log.w(str, sb.toString());
        }
        return Bundle.EMPTY;
    }

    /* renamed from: a */
    private static void m33186a(Intent intent, Bundle bundle) {
        for (String str : bundle.keySet()) {
            if (str.startsWith("google.c.a.") || str.equals("from")) {
                intent.putExtra(str, bundle.getString(str));
            }
        }
    }

    /* renamed from: a */
    private final PendingIntent m33183a(int i, Intent intent) {
        return PendingIntent.getBroadcast(this.f24913a, i, new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(this.f24913a, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), 1073741824);
    }
}
