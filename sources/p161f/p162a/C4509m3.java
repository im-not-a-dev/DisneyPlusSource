package p161f.p162a;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Looper;
import com.appboy.p030r.C1531a;
import com.appboy.p033s.C1557c;
import com.facebook.stetho.websocket.CloseCodes;
import com.google.android.gms.common.api.C9692b;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingRequest.Builder;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p163g.p449j.p450a.p451a.p467f.C11430d;
import p163g.p449j.p450a.p451a.p467f.C11432e;
import p163g.p449j.p450a.p451a.p467f.C11435h;

@SuppressLint({"MissingPermission"})
/* renamed from: f.a.m3 */
public final class C4509m3 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f11196a = C1557c.m7461a(C4509m3.class);

    /* renamed from: f.a.m3$a */
    static class C4510a implements C11430d {
        C4510a() {
        }

        /* renamed from: a */
        public void mo15690a(Exception exc) {
            if (exc instanceof C9692b) {
                int a = ((C9692b) exc).mo25041a();
                if (a != 0) {
                    switch (a) {
                        case 1000:
                            String a2 = C4509m3.f11196a;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Geofences not registered with Google Play Services due to GEOFENCE_NOT_AVAILABLE: ");
                            sb.append(a);
                            C1557c.m7473e(a2, sb.toString());
                            return;
                        case 1001:
                            String a3 = C4509m3.f11196a;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Geofences not registered with Google Play Services due to GEOFENCE_TOO_MANY_GEOFENCES: ");
                            sb2.append(a);
                            C1557c.m7473e(a3, sb2.toString());
                            return;
                        case CloseCodes.PROTOCOL_ERROR /*1002*/:
                            String a4 = C4509m3.f11196a;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Geofences not registered with Google Play Services due to GEOFENCE_TOO_MANY_PENDING_INTENTS: ");
                            sb3.append(a);
                            C1557c.m7473e(a4, sb3.toString());
                            return;
                        default:
                            String a5 = C4509m3.f11196a;
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Geofence pending result returned unknown status code: ");
                            sb4.append(a);
                            C1557c.m7473e(a5, sb4.toString());
                            return;
                    }
                } else {
                    C1557c.m7458a(C4509m3.f11196a, "Received Geofence registration success code in failure block with Google Play Services.");
                }
            } else {
                C1557c.m7470c(C4509m3.f11196a, "Geofence exception encountered while adding geofences.", exc);
            }
        }
    }

    /* renamed from: f.a.m3$b */
    static class C4511b implements C11432e<Void> {
        C4511b() {
        }

        /* renamed from: a */
        public void onSuccess(Void voidR) {
            C1557c.m7458a(C4509m3.f11196a, "Geofences successfully registered with Google Play Services.");
        }
    }

    /* renamed from: b */
    private static void m15612b(Context context, List<Geofence> list, PendingIntent pendingIntent) {
        C11435h addGeofences = LocationServices.getGeofencingClient(context).addGeofences(new Builder().addGeofences(list).setInitialTrigger(0).build(), pendingIntent);
        addGeofences.mo29251a((C11432e<? super TResult>) new C4511b<Object>());
        addGeofences.mo29250a((C11430d) new C4510a());
    }

    /* renamed from: a */
    public static void m15611a(Context context, List<C1531a> list, PendingIntent pendingIntent) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.support.geofences", 0);
            List<C1531a> a = C4501l3.m15578a(sharedPreferences);
            String str = "Obsolete geofence will be un-registered: ";
            if (list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (C1531a aVar : a) {
                    arrayList.add(aVar.mo6786N());
                    String str2 = f11196a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(aVar.mo6786N());
                    C1557c.m7458a(str2, sb.toString());
                }
                if (!arrayList.isEmpty()) {
                    LocationServices.getGeofencingClient(context).removeGeofences(arrayList);
                    sharedPreferences.edit().clear().apply();
                    String str3 = f11196a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("No new geofences to register. Cleared ");
                    sb2.append(a.size());
                    sb2.append(" previously registered geofences.");
                    C1557c.m7458a(str3, sb2.toString());
                } else {
                    C1557c.m7458a(f11196a, "No new geofences to register. No geofences are currently registered.");
                }
                return;
            }
            ArrayList<C1531a> arrayList2 = new ArrayList<>();
            HashSet hashSet = new HashSet();
            for (C1531a aVar2 : list) {
                hashSet.add(aVar2.mo6786N());
                boolean z = true;
                for (C1531a aVar3 : a) {
                    if (aVar2.mo6786N().equals(aVar3.mo6786N()) && aVar2.mo6792b(aVar3)) {
                        z = false;
                    }
                }
                if (z) {
                    String str4 = f11196a;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("New geofence will be registered: ");
                    sb3.append(aVar2.mo6786N());
                    C1557c.m7458a(str4, sb3.toString());
                    arrayList2.add(aVar2);
                }
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (C1531a aVar4 : a) {
                if (!hashSet.contains(aVar4.mo6786N())) {
                    arrayList3.add(aVar4.mo6786N());
                    String str5 = f11196a;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append(aVar4.mo6786N());
                    C1557c.m7458a(str5, sb4.toString());
                }
            }
            if (!arrayList3.isEmpty()) {
                Editor edit = sharedPreferences.edit();
                for (String remove : arrayList3) {
                    edit.remove(remove);
                }
                edit.apply();
                String str6 = f11196a;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Un-registering ");
                sb5.append(arrayList3.size());
                sb5.append(" obsolete geofences from Google Play Services.");
                C1557c.m7458a(str6, sb5.toString());
                LocationServices.getGeofencingClient(context).removeGeofences(arrayList3);
            } else {
                C1557c.m7458a(f11196a, "No obsolete geofences need to be unregistered from Google Play Services.");
            }
            if (!arrayList2.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                Editor edit2 = sharedPreferences.edit();
                for (C1531a aVar5 : arrayList2) {
                    arrayList4.add(aVar5.mo6789Q());
                    edit2.putString(aVar5.mo6786N(), aVar5.mo6750b().toString());
                }
                edit2.apply();
                String str7 = f11196a;
                StringBuilder sb6 = new StringBuilder();
                sb6.append("Registering ");
                sb6.append(arrayList2.size());
                sb6.append(" new geofences with Google Play Services.");
                C1557c.m7458a(str7, sb6.toString());
                m15612b(context, arrayList4, pendingIntent);
            } else {
                C1557c.m7458a(f11196a, "No new geofences need to be registered with Google Play Services.");
            }
        } catch (SecurityException e) {
            C1557c.m7470c(f11196a, "Security exception while adding geofences.", e);
        } catch (Exception e2) {
            C1557c.m7470c(f11196a, "Exception while adding geofences.", e2);
        }
    }

    /* renamed from: a */
    public static void m15610a(Context context, PendingIntent pendingIntent) {
        try {
            C1557c.m7458a(f11196a, "Requesting single location update from Google Play Services.");
            LocationRequest create = LocationRequest.create();
            create.setPriority(100);
            create.setNumUpdates(1);
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            LocationServices.getFusedLocationProviderClient(context).requestLocationUpdates(create, pendingIntent);
        } catch (SecurityException e) {
            C1557c.m7474e(f11196a, "Failed to request location update due to security exception from insufficient permissions.", e);
        } catch (Exception e2) {
            C1557c.m7474e(f11196a, "Failed to request location update due to exception.", e2);
        }
    }
}
