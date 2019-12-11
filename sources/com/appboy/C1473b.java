package com.appboy;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import com.appboy.p024n.C1489b;
import com.appboy.p033s.C1557c;
import com.appboy.push.C1522a;
import com.appboy.push.C1525d;

/* renamed from: com.appboy.b */
/* compiled from: AppboyAdmReceiver */
public final class C1473b extends BroadcastReceiver {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f5309a = C1557c.m7461a(C1473b.class);

    /* renamed from: com.appboy.b$a */
    /* compiled from: AppboyAdmReceiver */
    public class C1474a extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        private final Context f5310a;

        /* renamed from: b */
        private final Intent f5311b;

        public C1474a(Context context, Intent intent) {
            this.f5310a = context;
            this.f5311b = intent;
            execute(new Void[0]);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                C1473b.this.mo6622a(this.f5310a, this.f5311b);
            } catch (Exception e) {
                C1557c.m7470c(C1473b.f5309a, "Failed to create and display notification.", e);
            }
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6624b(Context context, Intent intent) {
        if (C1525d.m7208a(intent)) {
            new C1474a(context, intent);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo6625c(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("error");
        String stringExtra2 = intent.getStringExtra("registration_id");
        String stringExtra3 = intent.getStringExtra("unregistered");
        if (stringExtra != null) {
            String str = f5309a;
            StringBuilder sb = new StringBuilder();
            sb.append("Error during ADM registration: ");
            sb.append(stringExtra);
            C1557c.m7465b(str, sb.toString());
        } else if (stringExtra2 != null) {
            String str2 = f5309a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Registering for ADM messages with registrationId: ");
            sb2.append(stringExtra2);
            C1557c.m7469c(str2, sb2.toString());
            C1440a.m6921c(context).mo6582d(stringExtra2);
        } else if (stringExtra3 != null) {
            String str3 = f5309a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("The device was un-registered from ADM: ");
            sb3.append(stringExtra3);
            C1557c.m7473e(str3, sb3.toString());
        } else {
            C1557c.m7473e(f5309a, "The ADM registration intent is missing error information, registration id, and unregistration confirmation. Ignoring.");
            return false;
        }
        return true;
    }

    public void onReceive(Context context, Intent intent) {
        String str = f5309a;
        StringBuilder sb = new StringBuilder();
        sb.append("Received broadcast message. Message: ");
        sb.append(intent.toString());
        C1557c.m7469c(str, sb.toString());
        String action = intent.getAction();
        if ("com.amazon.device.messaging.intent.REGISTRATION".equals(action)) {
            mo6623a(new C1489b(context), context, intent);
        } else if ("com.amazon.device.messaging.intent.RECEIVE".equals(action)) {
            mo6624b(context, intent);
        } else if ("com.appboy.action.CANCEL_NOTIFICATION".equals(action)) {
            C1525d.m7199a(context, intent);
        } else if ("com.appboy.action.APPBOY_ACTION_CLICKED".equals(action)) {
            C1522a.m7171a(context, intent);
        } else if ("com.appboy.action.APPBOY_PUSH_CLICKED".equals(action)) {
            C1525d.m7222c(context, intent);
        } else if ("com.appboy.action.APPBOY_PUSH_DELETED".equals(action)) {
            C1525d.m7211b(context, intent);
        } else {
            C1557c.m7473e(f5309a, "The ADM receiver received a message not sent from Appboy. Ignoring the message.");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo6622a(Context context, Intent intent) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if ("deleted_messages".equals(intent.getStringExtra("message_type"))) {
            int intExtra = intent.getIntExtra("total_deleted", -1);
            if (intExtra == -1) {
                String str = f5309a;
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to parse ADM message. Intent: ");
                sb.append(intent.toString());
                C1557c.m7465b(str, sb.toString());
            } else {
                String str2 = f5309a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ADM deleted ");
                sb2.append(intExtra);
                sb2.append(" messages. Fetch them from Appboy.");
                C1557c.m7469c(str2, sb2.toString());
            }
            return false;
        }
        Bundle extras = intent.getExtras();
        String str3 = f5309a;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Push message payload received: ");
        sb3.append(extras);
        C1557c.m7458a(str3, sb3.toString());
        if (C1525d.m7229d(extras)) {
            C1557c.m7469c(f5309a, "Push message is uninstall tracking push. Doing nothing. Not forwarding this notification to broadcast receivers.");
            return false;
        }
        String str4 = "appboy_push_received_timestamp";
        if (!extras.containsKey(str4)) {
            extras.putLong(str4, System.currentTimeMillis());
        }
        C1525d.m7212b(context, extras);
        Bundle a = C1525d.m7193a(extras);
        extras.putBundle("extra", a);
        if (C1525d.m7220b(intent)) {
            int b = C1525d.m7209b(extras);
            extras.putInt("nid", b);
            C1489b bVar = new C1489b(context);
            Notification a2 = C1525d.m7195a().mo6664a(bVar, context, extras, a);
            if (a2 == null) {
                C1557c.m7458a(f5309a, "Notification created by notification factory was null. Not displaying notification.");
                return false;
            }
            notificationManager.notify("appboy_notification", b, a2);
            C1525d.m7231e(context, extras);
            C1525d.m7219b(context, bVar, extras);
            String str5 = "nd";
            if (extras.containsKey(str5)) {
                C1525d.m7203a(context, C1473b.class, b, Integer.parseInt(extras.getString(str5)));
            }
            return true;
        }
        C1525d.m7231e(context, extras);
        C1525d.m7228d(context, extras);
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo6623a(C1489b bVar, Context context, Intent intent) {
        String str = f5309a;
        StringBuilder sb = new StringBuilder();
        sb.append("Received ADM registration. Message: ");
        sb.append(intent.toString());
        C1557c.m7469c(str, sb.toString());
        if (bVar.mo6732y()) {
            C1557c.m7458a(f5309a, "ADM enabled in appboy.xml. Continuing to process ADM registration intent.");
            mo6625c(context, intent);
            return true;
        }
        C1557c.m7473e(f5309a, "ADM not enabled in appboy.xml. Ignoring ADM registration intent. Note: you must set com_appboy_push_adm_messaging_registration_enabled to true in your appboy.xml to enable ADM.");
        return false;
    }
}
