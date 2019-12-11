package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;
import p096e.p121h.p122j.C4027b;

/* renamed from: androidx.appcompat.app.l */
/* compiled from: TwilightManager */
class C0111l {

    /* renamed from: d */
    private static C0111l f407d;

    /* renamed from: a */
    private final Context f408a;

    /* renamed from: b */
    private final LocationManager f409b;

    /* renamed from: c */
    private final C0112a f410c = new C0112a();

    /* renamed from: androidx.appcompat.app.l$a */
    /* compiled from: TwilightManager */
    private static class C0112a {

        /* renamed from: a */
        boolean f411a;

        /* renamed from: b */
        long f412b;

        /* renamed from: c */
        long f413c;

        /* renamed from: d */
        long f414d;

        /* renamed from: e */
        long f415e;

        /* renamed from: f */
        long f416f;

        C0112a() {
        }
    }

    C0111l(Context context, LocationManager locationManager) {
        this.f408a = context;
        this.f409b = locationManager;
    }

    /* renamed from: a */
    static C0111l m639a(Context context) {
        if (f407d == null) {
            Context applicationContext = context.getApplicationContext();
            f407d = new C0111l(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f407d;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private Location m641b() {
        Location location = null;
        Location a = C4027b.m13802b(this.f408a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m638a("network") : null;
        if (C4027b.m13802b(this.f408a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m638a("gps");
        }
        if (location == null || a == null) {
            if (location != null) {
                a = location;
            }
            return a;
        }
        if (location.getTime() > a.getTime()) {
            a = location;
        }
        return a;
    }

    /* renamed from: c */
    private boolean m642c() {
        return this.f410c.f416f > System.currentTimeMillis();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo579a() {
        C0112a aVar = this.f410c;
        if (m642c()) {
            return aVar.f411a;
        }
        Location b = m641b();
        if (b != null) {
            m640a(b);
            return aVar.f411a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    /* renamed from: a */
    private Location m638a(String str) {
        try {
            if (this.f409b.isProviderEnabled(str)) {
                return this.f409b.getLastKnownLocation(str);
            }
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
        }
        return null;
    }

    /* renamed from: a */
    private void m640a(Location location) {
        long j;
        C0112a aVar = this.f410c;
        long currentTimeMillis = System.currentTimeMillis();
        C0110k a = C0110k.m636a();
        C0110k kVar = a;
        kVar.mo578a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = a.f404a;
        kVar.mo578a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = a.f406c == 1;
        long j3 = a.f405b;
        long j4 = j2;
        long j5 = a.f404a;
        long j6 = j3;
        boolean z2 = z;
        a.mo578a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j7 = a.f405b;
        if (j6 == -1 || j5 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            long j8 = currentTimeMillis > j5 ? 0 + j7 : currentTimeMillis > j6 ? 0 + j5 : 0 + j6;
            j = j8 + 60000;
        }
        aVar.f411a = z2;
        aVar.f412b = j4;
        aVar.f413c = j6;
        aVar.f414d = j5;
        aVar.f415e = j7;
        aVar.f416f = j;
    }
}
