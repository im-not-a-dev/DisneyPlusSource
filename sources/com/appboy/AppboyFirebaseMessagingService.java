package com.appboy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appboy.p033s.C1557c;
import com.google.firebase.messaging.C10515c;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.Map;
import java.util.Map.Entry;

public class AppboyFirebaseMessagingService extends FirebaseMessagingService {

    /* renamed from: Z */
    private static final String f5212Z = C1557c.m7461a(AppboyFirebaseMessagingService.class);

    /* renamed from: a0 */
    private static final AppboyFcmReceiver f5213a0 = new AppboyFcmReceiver();

    /* renamed from: b */
    public static boolean m6908b(C10515c cVar) {
        Map c = cVar.mo27381c();
        if (c == null) {
            String str = f5212Z;
            StringBuilder sb = new StringBuilder();
            sb.append("Remote message data from FCM was null. Returning false for Braze push check. Remote message: ");
            sb.append(cVar);
            C1557c.m7473e(str, sb.toString());
            return false;
        }
        return "true".equals(c.get("_ab"));
    }

    /* renamed from: a */
    public void mo6556a(C10515c cVar) {
        super.mo6556a(cVar);
        m6907a(this, cVar);
    }

    /* renamed from: a */
    public static boolean m6907a(Context context, C10515c cVar) {
        if (cVar == null) {
            C1557c.m7473e(f5212Z, "Remote message from FCM was null. Remote message did not originate from Braze.");
            return false;
        } else if (!m6908b(cVar)) {
            String str = f5212Z;
            StringBuilder sb = new StringBuilder();
            sb.append("Remote message did not originate from Braze. Not consuming remote message: ");
            sb.append(cVar);
            C1557c.m7469c(str, sb.toString());
            return false;
        } else {
            Map c = cVar.mo27381c();
            String str2 = f5212Z;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Got remote message from FCM: ");
            sb2.append(c);
            C1557c.m7469c(str2, sb2.toString());
            Intent intent = new Intent("firebase_messaging_service_routing_action");
            Bundle bundle = new Bundle();
            for (Entry entry : c.entrySet()) {
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                String str5 = f5212Z;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Adding bundle item from FCM remote data with key: ");
                sb3.append(str3);
                sb3.append(" and value: ");
                sb3.append(str4);
                C1557c.m7471d(str5, sb3.toString());
                bundle.putString(str3, str4);
            }
            intent.putExtras(bundle);
            f5213a0.onReceive(context, intent);
            return true;
        }
    }
}
