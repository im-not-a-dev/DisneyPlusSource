package com.appboy;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import androidx.core.app.NotificationManagerCompat;
import com.appboy.p024n.C1489b;
import com.appboy.p033s.C1557c;
import com.appboy.push.C1522a;
import com.appboy.push.C1525d;

public final class AppboyFcmReceiver extends BroadcastReceiver {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f5208a = C1557c.m7461a(AppboyFcmReceiver.class);

    /* renamed from: com.appboy.AppboyFcmReceiver$a */
    public class C1439a extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        private final Context f5209a;

        /* renamed from: b */
        private final Intent f5210b;

        public C1439a(Context context, Intent intent) {
            this.f5209a = context;
            this.f5210b = intent;
            execute(new Void[0]);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                AppboyFcmReceiver.this.mo6551a(this.f5209a, this.f5210b);
            } catch (Exception e) {
                C1557c.m7470c(AppboyFcmReceiver.f5208a, "Failed to create and display notification.", e);
            }
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6552b(Context context, Intent intent) {
        if (C1525d.m7208a(intent)) {
            new C1439a(context, intent);
        }
    }

    public void onReceive(Context context, Intent intent) {
        String str = f5208a;
        StringBuilder sb = new StringBuilder();
        sb.append("Received broadcast message. Message: ");
        sb.append(intent.toString());
        C1557c.m7469c(str, sb.toString());
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "firebase_messaging_service_routing_action".equals(action)) {
            mo6552b(context, intent);
        } else if ("com.appboy.action.CANCEL_NOTIFICATION".equals(action)) {
            C1525d.m7199a(context, intent);
        } else if ("com.appboy.action.APPBOY_ACTION_CLICKED".equals(action)) {
            C1522a.m7171a(context, intent);
        } else if ("com.appboy.action.STORY_TRAVERSE".equals(action)) {
            mo6552b(context, intent);
        } else if ("com.appboy.action.APPBOY_STORY_CLICKED".equals(action)) {
            C1525d.m7226d(context, intent);
        } else if ("com.appboy.action.APPBOY_PUSH_CLICKED".equals(action)) {
            C1525d.m7222c(context, intent);
        } else if ("com.appboy.action.APPBOY_PUSH_DELETED".equals(action)) {
            C1525d.m7211b(context, intent);
        } else {
            C1557c.m7473e(f5208a, "The FCM receiver received a message not sent from Appboy. Ignoring the message.");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo6551a(Context context, Intent intent) {
        NotificationManagerCompat from = NotificationManagerCompat.from(context);
        if ("deleted_messages".equals(intent.getStringExtra("message_type"))) {
            int intExtra = intent.getIntExtra("total_deleted", -1);
            if (intExtra == -1) {
                String str = f5208a;
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to parse FCM message. Intent: ");
                sb.append(intent.toString());
                C1557c.m7465b(str, sb.toString());
            } else {
                String str2 = f5208a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("FCM deleted ");
                sb2.append(intExtra);
                sb2.append(" messages. Fetch them from Appboy.");
                C1557c.m7469c(str2, sb2.toString());
            }
            return false;
        }
        Bundle extras = intent.getExtras();
        String str3 = f5208a;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Push message payload received: ");
        sb3.append(extras);
        C1557c.m7469c(str3, sb3.toString());
        Bundle a = C1525d.m7193a(extras);
        extras.putBundle("extra", a);
        String str4 = "appboy_push_received_timestamp";
        if (!extras.containsKey(str4)) {
            extras.putLong(str4, System.currentTimeMillis());
        }
        if (C1525d.m7229d(extras)) {
            C1557c.m7469c(f5208a, "Push message is uninstall tracking push. Doing nothing. Not forwarding this notification to broadcast receivers.");
            return false;
        }
        C1525d.m7200a(context, extras);
        if (C1525d.m7220b(intent)) {
            C1557c.m7458a(f5208a, "Received notification push");
            int b = C1525d.m7209b(extras);
            extras.putInt("nid", b);
            C1489b bVar = new C1489b(context);
            C1483k a2 = C1525d.m7195a();
            if (extras.containsKey("ab_c")) {
                String str5 = "appboy_story_newly_received";
                if (!extras.containsKey(str5)) {
                    C1557c.m7458a(f5208a, "Received the initial push story notification.");
                    extras.putBoolean(str5, true);
                    C1525d.m7212b(context, extras);
                }
            } else {
                C1525d.m7212b(context, extras);
            }
            Notification a3 = a2.mo6664a(bVar, context, extras, a);
            if (a3 == null) {
                C1557c.m7458a(f5208a, "Notification created by notification factory was null. Not displaying notification.");
                return false;
            }
            from.notify("appboy_notification", b, a3);
            C1525d.m7231e(context, extras);
            C1525d.m7219b(context, bVar, extras);
            if (extras != null) {
                String str6 = "nd";
                if (extras.containsKey(str6)) {
                    C1525d.m7203a(context, AppboyFcmReceiver.class, b, Integer.parseInt(extras.getString(str6)));
                }
            }
            return true;
        }
        C1557c.m7458a(f5208a, "Received data push");
        C1525d.m7212b(context, extras);
        C1525d.m7231e(context, extras);
        C1525d.m7228d(context, extras);
        return false;
    }
}
