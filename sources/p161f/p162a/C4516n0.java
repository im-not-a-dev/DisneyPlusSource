package p161f.p162a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.appboy.p030r.C1531a;
import com.appboy.p033s.C1557c;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: f.a.n0 */
public class C4516n0 {

    /* renamed from: h */
    private static final String f11199h = C1557c.m7461a(C4516n0.class);

    /* renamed from: a */
    final SharedPreferences f11200a;

    /* renamed from: b */
    final SharedPreferences f11201b;

    /* renamed from: c */
    Map<String, Long> f11202c = mo15702a(this.f11201b);

    /* renamed from: d */
    long f11203d = this.f11200a.getLong("last_request_global", 0);

    /* renamed from: e */
    long f11204e = this.f11200a.getLong("last_report_global", 0);

    /* renamed from: f */
    int f11205f;

    /* renamed from: g */
    int f11206g;

    C4516n0(Context context, String str, C4424d3 d3Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("com.appboy.managers.geofences.eligibility.global.");
        sb.append(str);
        this.f11200a = context.getSharedPreferences(sb.toString(), 0);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("com.appboy.managers.geofences.eligibility.individual.");
        sb2.append(str);
        this.f11201b = context.getSharedPreferences(sb2.toString(), 0);
        this.f11205f = d3Var.mo15499c();
        this.f11206g = d3Var.mo15500d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo15704a(List<C1531a> list) {
        HashSet hashSet = new HashSet();
        for (C1531a N : list) {
            hashSet.add(N.mo6786N());
        }
        HashSet<String> hashSet2 = new HashSet<>(this.f11202c.keySet());
        Editor edit = this.f11201b.edit();
        for (String str : hashSet2) {
            if (!hashSet.contains(mo15700a(str))) {
                String str2 = f11199h;
                StringBuilder sb = new StringBuilder();
                sb.append("Deleting outdated re-eligibility id ");
                sb.append(str);
                sb.append(" from re-eligibility list.");
                C1557c.m7458a(str2, sb.toString());
                this.f11202c.remove(str);
                edit.remove(str);
            } else {
                String str3 = f11199h;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Retaining re-eligibility id ");
                sb2.append(str);
                sb2.append(" in re-eligibility list.");
                C1557c.m7458a(str3, sb2.toString());
            }
        }
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo15705a(long j, C1531a aVar, C4593t6 t6Var) {
        long j2 = j;
        C4593t6 t6Var2 = t6Var;
        if (aVar == null) {
            C1557c.m7473e(f11199h, "Geofence passed into getReportEligible() was null.");
            return false;
        }
        String N = aVar.mo6786N();
        String a = mo15701a(N, t6Var2);
        int K = t6Var2.equals(C4593t6.ENTER) ? aVar.mo6783K() : aVar.mo6784L();
        long j3 = j2 - this.f11204e;
        String str = " seconds have passed since the last time geofences were reported globally (minimum interval: ";
        String str2 = "Geofence report suppressed since only ";
        String str3 = "). id:";
        if (((long) this.f11206g) > j3) {
            String str4 = f11199h;
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(j3);
            sb.append(str);
            sb.append(this.f11206g);
            sb.append(str3);
            sb.append(N);
            C1557c.m7458a(str4, sb.toString());
            return false;
        }
        if (this.f11202c.containsKey(a)) {
            long longValue = j2 - ((Long) this.f11202c.get(a)).longValue();
            String str5 = N;
            String str6 = " transition:";
            String str7 = " seconds have passed since the last time this geofence/transition combination was reported (minimum interval: ";
            if (((long) K) > longValue) {
                String str8 = f11199h;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(longValue);
                sb2.append(str7);
                sb2.append(K);
                sb2.append(str3);
                sb2.append(str5);
                sb2.append(str6);
                sb2.append(t6Var2);
                C1557c.m7458a(str8, sb2.toString());
                return false;
            }
            N = str5;
            String str9 = f11199h;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(longValue);
            sb3.append(str7);
            sb3.append(K);
            sb3.append(str3);
            sb3.append(N);
            sb3.append(str6);
            sb3.append(t6Var2);
            C1557c.m7458a(str9, sb3.toString());
        } else {
            String str10 = f11199h;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Geofence report eligible since this geofence/transition combination has never reported. id:");
            sb4.append(N);
            sb4.append(" ");
            sb4.append(t6Var2);
            C1557c.m7458a(str10, sb4.toString());
        }
        String str11 = f11199h;
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Geofence report eligible since ");
        sb5.append(j3);
        sb5.append(str);
        sb5.append(this.f11206g);
        sb5.append(str3);
        sb5.append(N);
        C1557c.m7458a(str11, sb5.toString());
        this.f11202c.put(a, Long.valueOf(j));
        Editor edit = this.f11201b.edit();
        long j4 = j;
        edit.putLong(a, j4);
        edit.apply();
        this.f11204e = j4;
        Editor edit2 = this.f11200a.edit();
        edit2.putLong("last_report_global", j4);
        edit2.apply();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo15706a(boolean z, long j) {
        long j2 = j - this.f11203d;
        String str = ").";
        String str2 = " seconds have passed since the last time geofences were requested (minimum interval: ";
        if (z || ((long) this.f11205f) <= j2) {
            if (z) {
                String str3 = f11199h;
                StringBuilder sb = new StringBuilder();
                sb.append("Geofence request eligible. Ignoring rate limit for this geofence request. Elapsed time since last request:");
                sb.append(j2);
                C1557c.m7458a(str3, sb.toString());
            } else {
                String str4 = f11199h;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Geofence request eligible since ");
                sb2.append(j2);
                sb2.append(str2);
                sb2.append(this.f11205f);
                sb2.append(str);
                C1557c.m7458a(str4, sb2.toString());
            }
            this.f11203d = j;
            Editor edit = this.f11200a.edit();
            edit.putLong("last_request_global", this.f11203d);
            edit.apply();
            return true;
        }
        String str5 = f11199h;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Geofence request suppressed since only ");
        sb3.append(j2);
        sb3.append(str2);
        sb3.append(this.f11205f);
        sb3.append(str);
        C1557c.m7458a(str5, sb3.toString());
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo15700a(String str) {
        try {
            return str.split("_", 2)[1];
        } catch (Exception e) {
            String str2 = f11199h;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception trying to parse re-eligibility id: ");
            sb.append(str);
            C1557c.m7472d(str2, sb.toString(), e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo15701a(String str, C4593t6 t6Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(t6Var.toString().toLowerCase(Locale.US));
        sb.append("_");
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo15703a(C4629y1 y1Var) {
        int f = y1Var.mo15934f();
        String str = "s.";
        if (f >= 0) {
            this.f11205f = f;
            String str2 = f11199h;
            StringBuilder sb = new StringBuilder();
            sb.append("Min time since last geofence request reset via server configuration: ");
            sb.append(f);
            sb.append(str);
            C1557c.m7469c(str2, sb.toString());
        }
        int g = y1Var.mo15935g();
        if (g >= 0) {
            this.f11206g = g;
            String str3 = f11199h;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Min time since last geofence report reset via server configuration: ");
            sb2.append(g);
            sb2.append(str);
            C1557c.m7469c(str3, sb2.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Map<String, Long> mo15702a(SharedPreferences sharedPreferences) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Map all = sharedPreferences.getAll();
        if (!(all == null || all.size() == 0)) {
            Set<String> keySet = all.keySet();
            if (keySet.size() == 0) {
                return concurrentHashMap;
            }
            for (String str : keySet) {
                long j = sharedPreferences.getLong(str, 0);
                String str2 = f11199h;
                StringBuilder sb = new StringBuilder();
                sb.append("Retrieving geofence id ");
                sb.append(mo15700a(str));
                sb.append(" eligibility information from local storage.");
                C1557c.m7458a(str2, sb.toString());
                concurrentHashMap.put(str, Long.valueOf(j));
            }
        }
        return concurrentHashMap;
    }
}
