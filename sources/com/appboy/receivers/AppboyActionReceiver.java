package com.appboy.receivers;

import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.appboy.C1440a;
import com.appboy.C1475c;
import com.appboy.p033s.C1557c;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingEvent;
import com.google.android.gms.location.LocationResult;
import java.util.List;
import p161f.p162a.C4445f1;
import p161f.p162a.C4487k1;
import p161f.p162a.C4593t6;

public class AppboyActionReceiver extends BroadcastReceiver {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f5694a = C1557c.m7461a(AppboyActionReceiver.class);

    /* renamed from: com.appboy.receivers.AppboyActionReceiver$a */
    static class C1553a implements Runnable {

        /* renamed from: U */
        private final Context f5695U;

        /* renamed from: V */
        private final PendingResult f5696V;

        /* renamed from: W */
        private final Intent f5697W;

        /* renamed from: c */
        private final String f5698c;

        C1553a(Context context, Intent intent, PendingResult pendingResult) {
            this.f5695U = context;
            this.f5697W = intent;
            this.f5698c = intent.getAction();
            this.f5696V = pendingResult;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo6894a() {
            if (this.f5698c == null) {
                C1557c.m7458a(AppboyActionReceiver.f5694a, "Received intent with null action. Doing nothing.");
                return false;
            }
            String a = AppboyActionReceiver.f5694a;
            StringBuilder sb = new StringBuilder();
            sb.append("Received intent with action ");
            sb.append(this.f5698c);
            C1557c.m7458a(a, sb.toString());
            if (this.f5698c.equals("com.appboy.action.receiver.DATA_SYNC")) {
                C1557c.m7460a(AppboyActionReceiver.f5694a, "Requesting immediate data flush from AppboyActionReceiver.", false);
                C1440a.m6921c(this.f5695U).mo6588j();
                return true;
            } else if (this.f5698c.equals("com.appboy.action.receiver.APPBOY_GEOFENCE_LOCATION_UPDATE")) {
                if (LocationResult.hasResult(this.f5697W)) {
                    String a2 = AppboyActionReceiver.f5694a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("AppboyActionReceiver received intent with location result: ");
                    sb2.append(this.f5698c);
                    C1557c.m7458a(a2, sb2.toString());
                    return m7439a(this.f5695U, LocationResult.extractResult(this.f5697W));
                }
                String a3 = AppboyActionReceiver.f5694a;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("AppboyActionReceiver received intent without location result: ");
                sb3.append(this.f5698c);
                C1557c.m7473e(a3, sb3.toString());
                return false;
            } else if (this.f5698c.equals("com.appboy.action.receiver.APPBOY_GEOFENCE_UPDATE")) {
                String a4 = AppboyActionReceiver.f5694a;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("AppboyActionReceiver received intent with geofence transition: ");
                sb4.append(this.f5698c);
                C1557c.m7458a(a4, sb4.toString());
                return m7438a(this.f5695U, GeofencingEvent.fromIntent(this.f5697W));
            } else if (this.f5698c.equals("com.appboy.action.receiver.SINGLE_LOCATION_UPDATE")) {
                String a5 = AppboyActionReceiver.f5694a;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("AppboyActionReceiver received intent with single location update: ");
                sb5.append(this.f5698c);
                C1557c.m7458a(a5, sb5.toString());
                return m7437a(this.f5695U, (Location) this.f5697W.getExtras().get("location"));
            } else {
                String a6 = AppboyActionReceiver.f5694a;
                StringBuilder sb6 = new StringBuilder();
                sb6.append("Unknown intent received in AppboyActionReceiver with action: ");
                sb6.append(this.f5698c);
                C1557c.m7473e(a6, sb6.toString());
                return false;
            }
        }

        public void run() {
            try {
                mo6894a();
            } catch (Exception e) {
                String a = AppboyActionReceiver.f5694a;
                StringBuilder sb = new StringBuilder();
                sb.append("Caught exception while performing the AppboyActionReceiver work. Action: ");
                sb.append(this.f5698c);
                sb.append(" Intent: ");
                sb.append(this.f5697W);
                C1557c.m7470c(a, sb.toString(), e);
            }
            this.f5696V.finish();
        }

        /* renamed from: a */
        private static boolean m7437a(Context context, Location location) {
            try {
                C1475c.m6991a(context, (C4445f1) new C4487k1(location));
                return true;
            } catch (Exception e) {
                C1557c.m7470c(AppboyActionReceiver.f5694a, "Exception while processing single location update", e);
                return false;
            }
        }

        /* renamed from: a */
        static boolean m7439a(Context context, LocationResult locationResult) {
            try {
                C1475c.m6996b(context, new C4487k1(locationResult.getLastLocation()));
                return true;
            } catch (Exception e) {
                C1557c.m7470c(AppboyActionReceiver.f5694a, "Exception while processing location result", e);
                return false;
            }
        }

        /* renamed from: a */
        static boolean m7438a(Context context, GeofencingEvent geofencingEvent) {
            if (geofencingEvent.hasError()) {
                int errorCode = geofencingEvent.getErrorCode();
                String a = AppboyActionReceiver.f5694a;
                StringBuilder sb = new StringBuilder();
                sb.append("AppboyLocation Services error: ");
                sb.append(errorCode);
                C1557c.m7465b(a, sb.toString());
                return false;
            }
            int geofenceTransition = geofencingEvent.getGeofenceTransition();
            List<Geofence> triggeringGeofences = geofencingEvent.getTriggeringGeofences();
            if (1 == geofenceTransition) {
                for (Geofence requestId : triggeringGeofences) {
                    C1475c.m6992a(context, requestId.getRequestId(), C4593t6.ENTER);
                }
                return true;
            } else if (2 == geofenceTransition) {
                for (Geofence requestId2 : triggeringGeofences) {
                    C1475c.m6992a(context, requestId2.getRequestId(), C4593t6.EXIT);
                }
                return true;
            } else {
                String a2 = AppboyActionReceiver.f5694a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unsupported transition type received: ");
                sb2.append(geofenceTransition);
                C1557c.m7473e(a2, sb2.toString());
                return false;
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            C1557c.m7473e(f5694a, "AppboyActionReceiver received null intent. Doing nothing.");
        } else {
            new Thread(new C1553a(context.getApplicationContext(), intent, goAsync())).start();
        }
    }
}
