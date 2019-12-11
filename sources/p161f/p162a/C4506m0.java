package p161f.p162a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.appboy.p024n.C1489b;
import com.appboy.p030r.C1531a;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1562h;
import com.google.android.gms.location.LocationServices;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: f.a.m0 */
public class C4506m0 {

    /* renamed from: n */
    private static final String f11171n = C1557c.m7461a(C4506m0.class);

    /* renamed from: a */
    private final Context f11172a;

    /* renamed from: b */
    private final C1489b f11173b;

    /* renamed from: c */
    private final C4424d3 f11174c;

    /* renamed from: d */
    final C4595u0 f11175d;

    /* renamed from: e */
    private final Object f11176e = new Object();

    /* renamed from: f */
    final SharedPreferences f11177f;

    /* renamed from: g */
    final List<C1531a> f11178g;

    /* renamed from: h */
    final PendingIntent f11179h;

    /* renamed from: i */
    final PendingIntent f11180i;

    /* renamed from: j */
    C4516n0 f11181j;

    /* renamed from: k */
    C4445f1 f11182k;

    /* renamed from: l */
    boolean f11183l;

    /* renamed from: m */
    int f11184m;

    public C4506m0(Context context, String str, C4595u0 u0Var, C1489b bVar, C4424d3 d3Var) {
        boolean z = false;
        this.f11183l = false;
        this.f11172a = context.getApplicationContext();
        this.f11175d = u0Var;
        this.f11177f = context.getSharedPreferences(m15588b(str), 0);
        this.f11173b = bVar;
        this.f11174c = d3Var;
        if (C4501l3.m15579a(this.f11174c) && mo15682a(context)) {
            z = true;
        }
        this.f11183l = z;
        this.f11184m = C4501l3.m15580b(this.f11174c);
        this.f11178g = C4501l3.m15578a(this.f11177f);
        this.f11179h = C4501l3.m15577a(context);
        this.f11180i = C4501l3.m15581b(context);
        this.f11181j = new C4516n0(context, str, d3Var);
        mo15681a(true);
    }

    /* renamed from: a */
    public void mo15675a() {
        C1557c.m7458a(f11171n, "Request to set up geofences received.");
        this.f11183l = C4501l3.m15579a(this.f11174c) && mo15682a(this.f11172a);
        mo15681a(false);
        mo15687b(true);
    }

    /* renamed from: b */
    public void mo15686b(String str, C4593t6 t6Var) {
        if (!this.f11183l) {
            C1557c.m7473e(f11171n, "Appboy geofences not enabled. Not posting geofence report.");
            return;
        }
        try {
            C4548p1 a = C4548p1.m15765a(str, t6Var.toString().toLowerCase(Locale.US));
            if (mo15683a(str, t6Var)) {
                this.f11175d.mo15772a((C4432e1) a);
            }
            if (this.f11181j.mo15705a(C4472i3.m15480a(), mo15674a(str), t6Var)) {
                this.f11175d.mo15775b((C4432e1) a);
            }
        } catch (Exception e) {
            C1557c.m7474e(f11171n, "Failed to record geofence transition.", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo15682a(Context context) {
        if (!C4534o0.m15691a(this.f11173b)) {
            C1557c.m7458a(f11171n, "Location collection not available. Geofences not enabled.");
            return false;
        } else if (!C1562h.m7482a(context, "android.permission.ACCESS_FINE_LOCATION")) {
            C1557c.m7469c(f11171n, "Fine grained location permissions not found. Geofences not enabled.");
            return false;
        } else if (!C4522n3.m15655a(context)) {
            C1557c.m7458a(f11171n, "Google Play Services not available. Geofences not enabled.");
            return false;
        } else {
            try {
                if (Class.forName("com.google.android.gms.location.LocationServices", false, C4506m0.class.getClassLoader()) != null) {
                    return true;
                }
                throw new RuntimeException("com.google.android.gms.location.LocationServices not found.");
            } catch (Exception unused) {
                C1557c.m7458a(f11171n, "Google Play Services Location API not found. Geofences not enabled.");
                return false;
            }
        }
    }

    /* renamed from: b */
    public void mo15687b(boolean z) {
        if (!this.f11183l) {
            C1557c.m7458a(f11171n, "Appboy geofences not enabled. Not requesting geofences.");
            return;
        }
        if (this.f11181j.mo15706a(z, C4472i3.m15480a())) {
            mo15685b(this.f11180i);
        }
    }

    /* renamed from: b */
    public void mo15684b() {
        if (!this.f11183l) {
            C1557c.m7458a(f11171n, "Appboy geofences not enabled. Not un-registering geofences.");
            return;
        }
        C1557c.m7458a(f11171n, "Tearing down all geofences.");
        mo15676a(this.f11179h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15681a(boolean z) {
        if (!this.f11183l) {
            C1557c.m7458a(f11171n, "Appboy geofences not enabled. Geofences not set up.");
            return;
        }
        C1557c.m7458a(f11171n, "Location permissions and Google Play Services available. Location collection and Geofencing enabled via config.");
        if (z) {
            synchronized (this.f11176e) {
                mo15680a(this.f11178g, this.f11179h);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo15685b(PendingIntent pendingIntent) {
        C4509m3.m15610a(this.f11172a, pendingIntent);
    }

    /* renamed from: b */
    static String m15588b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("com.appboy.managers.geofences.storage.");
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15676a(PendingIntent pendingIntent) {
        C1557c.m7458a(f11171n, "Tearing down geofences.");
        if (pendingIntent != null) {
            C1557c.m7458a(f11171n, "Unregistering any Braze geofences from Google Play Services.");
            LocationServices.getGeofencingClient(this.f11172a).removeGeofences(pendingIntent);
        }
        synchronized (this.f11176e) {
            C1557c.m7458a(f11171n, "Deleting locally stored geofences.");
            Editor edit = this.f11177f.edit();
            edit.clear();
            this.f11178g.clear();
            edit.apply();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo15683a(String str, C4593t6 t6Var) {
        synchronized (this.f11176e) {
            C1531a a = mo15674a(str);
            if (a != null) {
                if (t6Var.equals(C4593t6.ENTER)) {
                    boolean I = a.mo6781I();
                    return I;
                } else if (t6Var.equals(C4593t6.EXIT)) {
                    boolean J = a.mo6782J();
                    return J;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1531a mo15674a(String str) {
        synchronized (this.f11176e) {
            for (C1531a aVar : this.f11178g) {
                if (aVar.mo6786N().equals(str)) {
                    return aVar;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public void mo15677a(C4445f1 f1Var) {
        if (!this.f11183l) {
            C1557c.m7458a(f11171n, "Appboy geofences not enabled. Not requesting geofences.");
            return;
        }
        if (f1Var != null) {
            this.f11182k = f1Var;
            this.f11175d.mo15763a(this.f11182k);
        }
    }

    /* renamed from: a */
    public void mo15678a(C4629y1 y1Var) {
        if (y1Var == null) {
            C1557c.m7473e(f11171n, "Could not configure geofence manager from server config. Server config was null.");
            return;
        }
        boolean i = y1Var.mo15937i();
        String str = f11171n;
        StringBuilder sb = new StringBuilder();
        sb.append("Geofences enabled server config value ");
        sb.append(i);
        sb.append(" received.");
        C1557c.m7458a(str, sb.toString());
        boolean z = i && mo15682a(this.f11172a);
        if (z != this.f11183l) {
            this.f11183l = z;
            String str2 = f11171n;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Geofences enabled status newly set to ");
            sb2.append(this.f11183l);
            sb2.append(" during server config update.");
            C1557c.m7469c(str2, sb2.toString());
            if (this.f11183l) {
                mo15681a(false);
                mo15687b(true);
            } else {
                mo15676a(this.f11179h);
            }
        } else {
            String str3 = f11171n;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Geofences enabled status ");
            sb3.append(this.f11183l);
            sb3.append(" unchanged during server config update.");
            C1557c.m7458a(str3, sb3.toString());
        }
        int h = y1Var.mo15936h();
        if (h >= 0) {
            this.f11184m = h;
            String str4 = f11171n;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Max number to register newly set to ");
            sb4.append(this.f11184m);
            sb4.append(" via server config.");
            C1557c.m7469c(str4, sb4.toString());
        }
        this.f11181j.mo15703a(y1Var);
    }

    /* renamed from: a */
    public void mo15679a(List<C1531a> list) {
        if (list == null) {
            C1557c.m7473e(f11171n, "Appboy geofence list was null. Not adding new geofences to local storage.");
        } else if (!this.f11183l) {
            C1557c.m7473e(f11171n, "Appboy geofences not enabled. Not adding new geofences to local storage.");
        } else {
            if (this.f11182k != null) {
                for (C1531a aVar : list) {
                    aVar.mo6791a(C4582s3.m15904a(this.f11182k.mo15549a(), this.f11182k.mo15550d(), aVar.mo6787O(), aVar.mo6788P()));
                }
                Collections.sort(list);
            }
            synchronized (this.f11176e) {
                String str = f11171n;
                StringBuilder sb = new StringBuilder();
                sb.append("Received new geofence list of size: ");
                sb.append(list.size());
                C1557c.m7458a(str, sb.toString());
                Editor edit = this.f11177f.edit();
                edit.clear();
                this.f11178g.clear();
                int i = 0;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C1531a aVar2 = (C1531a) it.next();
                    if (i == this.f11184m) {
                        String str2 = f11171n;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Reached maximum number of new geofences: ");
                        sb2.append(this.f11184m);
                        C1557c.m7458a(str2, sb2.toString());
                        break;
                    }
                    this.f11178g.add(aVar2);
                    String str3 = f11171n;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Adding new geofence to local storage: ");
                    sb3.append(aVar2.toString());
                    C1557c.m7458a(str3, sb3.toString());
                    edit.putString(aVar2.mo6786N(), aVar2.mo6750b().toString());
                    i++;
                }
                edit.apply();
                String str4 = f11171n;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Added ");
                sb4.append(this.f11178g.size());
                sb4.append(" new geofences to local storage.");
                C1557c.m7458a(str4, sb4.toString());
            }
            this.f11181j.mo15704a(list);
            mo15681a(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15680a(List<C1531a> list, PendingIntent pendingIntent) {
        C4509m3.m15611a(this.f11172a, list, pendingIntent);
    }
}
