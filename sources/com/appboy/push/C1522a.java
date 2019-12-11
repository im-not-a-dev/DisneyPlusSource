package com.appboy.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.C0478i.C0479a.C0480a;
import androidx.core.app.C0478i.C0483d;
import com.appboy.C1440a;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1560f;
import com.appboy.p033s.C1563i;

/* renamed from: com.appboy.push.a */
/* compiled from: AppboyNotificationActionUtils */
public class C1522a {

    /* renamed from: a */
    private static final String f5560a = C1557c.m7461a(C1522a.class);

    /* renamed from: a */
    public static void m7173a(Context context, C0483d dVar, Bundle bundle) {
        if (bundle == null) {
            try {
                C1557c.m7473e(f5560a, "Notification extras were null. Doing nothing.");
            } catch (Exception e) {
                C1557c.m7470c(f5560a, "Caught exception while adding notification action buttons.", e);
            }
        } else {
            for (int i = 0; !C1563i.m7490d(m7169a(i, bundle, "ab_a*_a")); i++) {
                m7174a(context, dVar, bundle, i);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0092 A[Catch:{ Exception -> 0x0096 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m7171a(android.content.Context r6, android.content.Intent r7) {
        /*
            java.lang.String r0 = "appboy_action_use_webview"
            java.lang.String r1 = "appboy_action_uri"
            java.lang.String r2 = "ab_uri"
            java.lang.String r3 = "appboy_action_type"
            java.lang.String r3 = r7.getStringExtra(r3)     // Catch:{ Exception -> 0x0096 }
            boolean r4 = com.appboy.p033s.C1563i.m7490d(r3)     // Catch:{ Exception -> 0x0096 }
            if (r4 == 0) goto L_0x001a
            java.lang.String r6 = f5560a     // Catch:{ Exception -> 0x0096 }
            java.lang.String r7 = "Notification action button type was blank or null. Doing nothing."
            com.appboy.p033s.C1557c.m7473e(r6, r7)     // Catch:{ Exception -> 0x0096 }
            return
        L_0x001a:
            java.lang.String r4 = "nid"
            r5 = -1
            int r4 = r7.getIntExtra(r4, r5)     // Catch:{ Exception -> 0x0096 }
            m7172a(r6, r7, r3)     // Catch:{ Exception -> 0x0096 }
            boolean r5 = r3.equals(r2)     // Catch:{ Exception -> 0x0096 }
            if (r5 != 0) goto L_0x0047
            java.lang.String r5 = "ab_open"
            boolean r5 = r3.equals(r5)     // Catch:{ Exception -> 0x0096 }
            if (r5 == 0) goto L_0x0033
            goto L_0x0047
        L_0x0033:
            java.lang.String r7 = "ab_none"
            boolean r7 = r3.equals(r7)     // Catch:{ Exception -> 0x0096 }
            if (r7 == 0) goto L_0x003f
            com.appboy.push.C1525d.m7198a(r6, r4)     // Catch:{ Exception -> 0x0096 }
            goto L_0x009e
        L_0x003f:
            java.lang.String r6 = f5560a     // Catch:{ Exception -> 0x0096 }
            java.lang.String r7 = "Unknown notification action button clicked. Doing nothing."
            com.appboy.p033s.C1557c.m7473e(r6, r7)     // Catch:{ Exception -> 0x0096 }
            goto L_0x009e
        L_0x0047:
            com.appboy.push.C1525d.m7198a(r6, r4)     // Catch:{ Exception -> 0x0096 }
            android.content.Intent r4 = new android.content.Intent     // Catch:{ Exception -> 0x0096 }
            java.lang.String r5 = "android.intent.action.CLOSE_SYSTEM_DIALOGS"
            r4.<init>(r5)     // Catch:{ Exception -> 0x0096 }
            r6.sendBroadcast(r4)     // Catch:{ Exception -> 0x0096 }
            boolean r2 = r3.equals(r2)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r3 = "uri"
            if (r2 == 0) goto L_0x0081
            android.os.Bundle r2 = r7.getExtras()     // Catch:{ Exception -> 0x0096 }
            boolean r2 = r2.containsKey(r1)     // Catch:{ Exception -> 0x0096 }
            if (r2 == 0) goto L_0x0081
            java.lang.String r1 = r7.getStringExtra(r1)     // Catch:{ Exception -> 0x0096 }
            r7.putExtra(r3, r1)     // Catch:{ Exception -> 0x0096 }
            android.os.Bundle r1 = r7.getExtras()     // Catch:{ Exception -> 0x0096 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ Exception -> 0x0096 }
            if (r1 == 0) goto L_0x0084
            java.lang.String r1 = "ab_use_webview"
            java.lang.String r0 = r7.getStringExtra(r0)     // Catch:{ Exception -> 0x0096 }
            r7.putExtra(r1, r0)     // Catch:{ Exception -> 0x0096 }
            goto L_0x0084
        L_0x0081:
            r7.removeExtra(r3)     // Catch:{ Exception -> 0x0096 }
        L_0x0084:
            com.appboy.push.C1525d.m7235g(r6, r7)     // Catch:{ Exception -> 0x0096 }
            com.appboy.n.b r0 = new com.appboy.n.b     // Catch:{ Exception -> 0x0096 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x0096 }
            boolean r0 = r0.mo6717j()     // Catch:{ Exception -> 0x0096 }
            if (r0 == 0) goto L_0x009e
            com.appboy.push.C1525d.m7233f(r6, r7)     // Catch:{ Exception -> 0x0096 }
            goto L_0x009e
        L_0x0096:
            r6 = move-exception
            java.lang.String r7 = f5560a
            java.lang.String r0 = "Caught exception while handling notification action button click."
            com.appboy.p033s.C1557c.m7470c(r7, r0, r6)
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appboy.push.C1522a.m7171a(android.content.Context, android.content.Intent):void");
    }

    /* renamed from: a */
    private static void m7174a(Context context, C0483d dVar, Bundle bundle, int i) {
        PendingIntent pendingIntent;
        Bundle bundle2 = new Bundle(bundle);
        String a = m7169a(i, bundle, "ab_a*_a");
        bundle2.putInt("appboy_action_index", i);
        bundle2.putString("appboy_action_type", a);
        bundle2.putString("appboy_action_id", m7169a(i, bundle, "ab_a*_id"));
        bundle2.putString("appboy_action_uri", m7169a(i, bundle, "ab_a*_uri"));
        bundle2.putString("appboy_action_use_webview", m7169a(i, bundle, "ab_a*_use_webview"));
        String str = "com.appboy.action.APPBOY_ACTION_CLICKED";
        String str2 = "Adding notification action with type: ";
        if (a.equals("ab_none")) {
            String str3 = f5560a;
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(a);
            sb.append(" . Setting intent class to notification receiver.");
            C1557c.m7471d(str3, sb.toString());
            Intent intent = new Intent(str).setClass(context, C1525d.m7210b());
            intent.putExtras(bundle2);
            pendingIntent = PendingIntent.getBroadcast(context, C1560f.m7479a(), intent, 134217728);
        } else {
            String str4 = f5560a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(a);
            sb2.append(" Setting intent class to AppboyNotificationRoutingActivity");
            C1557c.m7471d(str4, sb2.toString());
            Intent intent2 = new Intent(str).setClass(context, AppboyNotificationRoutingActivity.class);
            intent2.putExtras(bundle2);
            pendingIntent = PendingIntent.getActivity(context, C1560f.m7479a(), intent2, 134217728);
        }
        C0480a aVar = new C0480a(0, m7169a(i, bundle, "ab_a*_t"), pendingIntent);
        aVar.mo2634a(new Bundle(bundle2));
        dVar.mo2653a(aVar.mo2635a());
    }

    /* renamed from: a */
    private static void m7172a(Context context, Intent intent, String str) {
        C1440a.m6921c(context).mo6567a(intent.getStringExtra("cid"), intent.getStringExtra("appboy_action_id"), str);
    }

    /* renamed from: a */
    public static String m7169a(int i, Bundle bundle, String str) {
        return m7170a(i, bundle, str, "");
    }

    /* renamed from: a */
    public static String m7170a(int i, Bundle bundle, String str, String str2) {
        String string = bundle.getString(str.replace("*", String.valueOf(i)));
        return string == null ? str2 : string;
    }
}
