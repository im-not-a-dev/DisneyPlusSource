package com.appboy.p024n;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.appboy.p025o.C1498f;
import com.appboy.p025o.C1504j;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1561g;
import com.appboy.p033s.C1563i;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p161f.p162a.C4478j1;
import p161f.p162a.C4480j3;

/* renamed from: com.appboy.n.b */
public class C1489b extends C1491c {

    /* renamed from: f */
    private static final String f5388f = C1557c.m7461a(C1489b.class);

    /* renamed from: e */
    private final Context f5389e;

    /* renamed from: com.appboy.n.b$a */
    enum C1490a {
        SMALL,
        LARGE
    }

    public C1489b(Context context) {
        super(context);
        this.f5389e = context;
    }

    /* renamed from: C */
    private String m7097C() {
        return mo6735a("com_appboy_server_target", "PROD");
    }

    /* renamed from: A */
    public boolean mo6705A() {
        return mo6737a("com_appboy_firebase_cloud_messaging_registration_enabled", false);
    }

    /* renamed from: B */
    public boolean mo6706B() {
        return !mo6737a("com_appboy_disable_location_collection", false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo6708a(java.util.Locale r12) {
        /*
            r11 = this;
            r0 = 0
            if (r12 != 0) goto L_0x000b
            java.lang.String r12 = f5388f
            java.lang.String r1 = "Passed in a null locale to match."
            com.appboy.p033s.C1557c.m7458a(r12, r1)
            return r0
        L_0x000b:
            f.a.j6 r1 = r11.f5396c
            java.lang.String r2 = "com_appboy_locale_api_key_map"
            boolean r1 = r1.mo15645a(r2)
            r3 = 0
            if (r1 == 0) goto L_0x0043
            f.a.j6 r1 = r11.f5396c
            java.lang.String r1 = r1.mo15640a(r2, r0)
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0039 }
            r2.<init>(r1)     // Catch:{ JSONException -> 0x0039 }
            int r1 = r2.length()     // Catch:{ JSONException -> 0x0039 }
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ JSONException -> 0x0039 }
            r4 = 0
        L_0x0028:
            int r5 = r2.length()     // Catch:{ JSONException -> 0x0037 }
            if (r4 >= r5) goto L_0x0047
            java.lang.String r5 = r2.getString(r4)     // Catch:{ JSONException -> 0x0037 }
            r1[r4] = r5     // Catch:{ JSONException -> 0x0037 }
            int r4 = r4 + 1
            goto L_0x0028
        L_0x0037:
            r2 = move-exception
            goto L_0x003b
        L_0x0039:
            r2 = move-exception
            r1 = r0
        L_0x003b:
            java.lang.String r4 = f5388f
            java.lang.String r5 = "Caught exception creating locale to api key mapping from override cache"
            com.appboy.p033s.C1557c.m7470c(r4, r5, r2)
            goto L_0x0047
        L_0x0043:
            java.lang.String[] r1 = r11.mo6738a(r2, r0)
        L_0x0047:
            if (r1 != 0) goto L_0x0051
            java.lang.String r12 = f5388f
            java.lang.String r1 = "Locale to api key mappings not present in XML."
            com.appboy.p033s.C1557c.m7458a(r12, r1)
            return r0
        L_0x0051:
            int r2 = r1.length
            r4 = 0
        L_0x0053:
            if (r4 >= r2) goto L_0x00a1
            r5 = r1[r4]
            java.lang.String r6 = ","
            int r7 = com.appboy.p033s.C1563i.m7487b(r5, r6)
            r8 = 1
            if (r7 == r8) goto L_0x0061
            goto L_0x0097
        L_0x0061:
            java.lang.String[] r5 = r5.split(r6)
            int r6 = r5.length
            r7 = 2
            if (r6 == r7) goto L_0x006a
            goto L_0x0097
        L_0x006a:
            r6 = r5[r3]
            java.lang.String r6 = r6.trim()
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r6 = r6.toLowerCase(r7)
            java.lang.String r7 = r12.toString()
            java.util.Locale r9 = java.util.Locale.US
            java.lang.String r7 = r7.toLowerCase(r9)
            boolean r7 = r6.equals(r7)
            java.lang.String r9 = r12.getCountry()
            java.util.Locale r10 = java.util.Locale.US
            java.lang.String r9 = r9.toLowerCase(r10)
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x009a
            if (r7 == 0) goto L_0x0097
            goto L_0x009a
        L_0x0097:
            int r4 = r4 + 1
            goto L_0x0053
        L_0x009a:
            r12 = r5[r8]
            java.lang.String r12 = r12.trim()
            return r12
        L_0x00a1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appboy.p024n.C1489b.mo6708a(java.util.Locale):java.lang.String");
    }

    /* renamed from: b */
    public int mo6709b() {
        String str = "application_icon";
        if (this.f5395b.containsKey(str)) {
            return ((Integer) this.f5395b.get(str)).intValue();
        }
        String packageName = this.f5389e.getPackageName();
        int i = 0;
        try {
            i = this.f5389e.getPackageManager().getApplicationInfo(packageName, i).icon;
        } catch (NameNotFoundException unused) {
            String str2 = f5388f;
            StringBuilder sb = new StringBuilder();
            String str3 = "Cannot find package named ";
            sb.append(str3);
            sb.append(packageName);
            C1557c.m7465b(str2, sb.toString());
            try {
                i = this.f5389e.getPackageManager().getApplicationInfo(this.f5389e.getPackageName(), i).icon;
            } catch (NameNotFoundException unused2) {
                String str4 = f5388f;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(packageName);
                C1557c.m7465b(str4, sb2.toString());
            }
        }
        this.f5395b.put(str, Integer.valueOf(i));
        return i;
    }

    /* renamed from: c */
    public String mo6710c() {
        return "STAGING".equals(m7097C().toUpperCase(Locale.US)) ? "https://sondheim.appboy.com/api/v3/" : "https://sdk.iad-01.braze.com/api/v3/";
    }

    /* renamed from: d */
    public String mo6711d() {
        return mo6735a("com_appboy_custom_endpoint", (String) null);
    }

    @TargetApi(21)
    /* renamed from: e */
    public int mo6712e() {
        return mo6734a("com_appboy_default_notification_accent_color", 0);
    }

    /* renamed from: f */
    public String mo6713f() {
        return mo6735a("com_appboy_default_notification_channel_description", "");
    }

    /* renamed from: g */
    public String mo6714g() {
        return mo6735a("com_appboy_default_notification_channel_name", "General");
    }

    /* renamed from: h */
    public EnumSet<C1498f> mo6715h() {
        String str = "com_appboy_device_object_whitelist";
        if (this.f5395b.containsKey(str)) {
            return (EnumSet) this.f5395b.get(str);
        }
        EnumSet<C1498f> a = C4480j3.m15506a(C1498f.class, mo6736a(str, (Set<String>) new HashSet<String>()));
        this.f5395b.put(str, a);
        return a;
    }

    /* renamed from: i */
    public String mo6716i() {
        return mo6735a("com_appboy_firebase_cloud_messaging_sender_id", (String) null);
    }

    /* renamed from: j */
    public boolean mo6717j() {
        return mo6737a("com_appboy_handle_push_deep_links_automatically", false);
    }

    /* renamed from: k */
    public boolean mo6718k() {
        return mo6737a("com_appboy_device_object_whitelisting_enabled", false);
    }

    /* renamed from: l */
    public boolean mo6719l() {
        return mo6737a("com_appboy_device_in_app_message_accessibility_exclusive_mode_enabled", false);
    }

    /* renamed from: m */
    public boolean mo6720m() {
        return mo6737a("com_appboy_newsfeed_unread_visual_indicator_on", true);
    }

    /* renamed from: n */
    public boolean mo6721n() {
        return mo6737a("com_appboy_push_deep_link_back_stack_activity_enabled", true);
    }

    /* renamed from: o */
    public boolean mo6722o() {
        return mo6737a("com_appboy_push_notification_html_rendering_enabled", false);
    }

    /* renamed from: p */
    public boolean mo6723p() {
        return mo6737a("com_appboy_push_wake_screen_for_notification_enabled", true);
    }

    /* renamed from: q */
    public boolean mo6724q() {
        return mo6737a("com_appboy_session_start_based_timeout_enabled", false);
    }

    /* renamed from: r */
    public int mo6725r() {
        return m7098a(C1490a.LARGE);
    }

    /* renamed from: s */
    public String mo6726s() {
        return mo6735a("com_appboy_push_deep_link_back_stack_activity_class_name", "");
    }

    /* renamed from: t */
    public C1504j mo6727t() {
        String a = mo6735a("com_appboy_sdk_flavor", (String) null);
        if (C1563i.m7490d(a)) {
            return null;
        }
        try {
            return C1504j.valueOf(a.toUpperCase(Locale.US));
        } catch (Exception e) {
            C1557c.m7470c(f5388f, "Exception while parsing stored SDK flavor. Returning null.", e);
            return null;
        }
    }

    /* renamed from: u */
    public int mo6728u() {
        return mo6734a("com_appboy_session_timeout", 10);
    }

    /* renamed from: v */
    public int mo6729v() {
        return m7098a(C1490a.SMALL);
    }

    /* renamed from: w */
    public long mo6730w() {
        return (long) mo6734a("com_appboy_trigger_action_minimum_time_interval_seconds", 30);
    }

    /* renamed from: x */
    public int mo6731x() {
        int i;
        String str = "version_code";
        if (this.f5395b.containsKey(str)) {
            return ((Integer) this.f5395b.get(str)).intValue();
        }
        try {
            i = this.f5389e.getPackageManager().getPackageInfo(C1561g.m7481a(this.f5389e), 0).versionCode;
        } catch (Exception e) {
            C1557c.m7470c(f5388f, "Unable to read the version code.", e);
            i = -1;
        }
        this.f5395b.put(str, Integer.valueOf(i));
        return i;
    }

    /* renamed from: y */
    public boolean mo6732y() {
        return mo6737a("com_appboy_push_adm_messaging_registration_enabled", false);
    }

    /* renamed from: z */
    public boolean mo6733z() {
        return mo6737a("com_appboy_content_cards_unread_visual_indicator_enabled", true);
    }

    /* renamed from: a */
    public C4478j1 mo6707a() {
        String str = "com_appboy_api_key";
        C4478j1 j1Var = (C4478j1) this.f5395b.get(str);
        if (j1Var == null) {
            String a = this.f5396c.mo15640a(str, (String) null);
            if (a != null) {
                C1557c.m7469c(f5388f, "Found an override api key. Using it to configure Appboy.");
            } else {
                a = mo6708a(Locale.getDefault());
                if (a != null) {
                    C1557c.m7469c(f5388f, "Found a locale that matches the current locale in appboy.xml. Using the associated api key");
                } else {
                    a = mo6740b(str, (String) null);
                }
            }
            if (a != null) {
                j1Var = new C4478j1(a);
                this.f5395b.put(str, j1Var);
            }
        }
        if (j1Var != null) {
            return j1Var;
        }
        String str2 = "****************************************************";
        C1557c.m7465b(f5388f, str2);
        String str3 = "**                                                **";
        C1557c.m7465b(f5388f, str3);
        C1557c.m7465b(f5388f, "**                 !! WARNING !!                  **");
        C1557c.m7465b(f5388f, str3);
        C1557c.m7465b(f5388f, "**     No API key set in res/values/appboy.xml    **");
        C1557c.m7465b(f5388f, "** No cached API Key found from Appboy.configure  **");
        C1557c.m7465b(f5388f, "**          Braze functionality disabled          **");
        C1557c.m7465b(f5388f, str3);
        C1557c.m7465b(f5388f, str2);
        throw new RuntimeException("Unable to read the Braze API key from the res/values/appboy.xml file. See log for more details.");
    }

    /* renamed from: a */
    private int m7098a(C1490a aVar) {
        String str = aVar.equals(C1490a.LARGE) ? "com_appboy_push_large_notification_icon" : "com_appboy_push_small_notification_icon";
        if (this.f5395b.containsKey(str)) {
            return ((Integer) this.f5395b.get(str)).intValue();
        }
        String str2 = "drawable";
        if (this.f5396c.mo15645a(str)) {
            String a = this.f5396c.mo15640a(str, "");
            int identifier = this.f5389e.getResources().getIdentifier(a, str2, C1561g.m7481a(this.f5389e));
            this.f5395b.put(str, Integer.valueOf(identifier));
            String str3 = f5388f;
            StringBuilder sb = new StringBuilder();
            sb.append("Using runtime override value for key: ");
            sb.append(str);
            sb.append(" and value: ");
            sb.append(a);
            C1557c.m7458a(str3, sb.toString());
            return identifier;
        }
        int identifier2 = this.f5389e.getResources().getIdentifier(str, str2, C1561g.m7481a(this.f5389e));
        this.f5395b.put(str, Integer.valueOf(identifier2));
        return identifier2;
    }
}
