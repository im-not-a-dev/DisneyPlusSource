package p161f.p162a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: f.a.p5 */
public class C4552p5 implements C4513m5 {

    /* renamed from: c */
    private static final String f11334c = C1557c.m7461a(C4552p5.class);

    /* renamed from: a */
    private final SharedPreferences f11335a;

    /* renamed from: b */
    private Map<String, Long> f11336b = m15818a();

    public C4552p5(Context context, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("com.appboy.storage.triggers.re_eligibility");
        sb.append(C1563i.m7484a(context, str, str2));
        this.f11335a = context.getSharedPreferences(sb.toString(), 0);
    }

    /* renamed from: a */
    public void mo15671a(List<C4631y3> list) {
        HashSet hashSet = new HashSet();
        for (C4631y3 d : list) {
            hashSet.add(d.mo15473d());
        }
        HashSet<String> hashSet2 = new HashSet<>(this.f11336b.keySet());
        Editor edit = this.f11335a.edit();
        for (String str : hashSet2) {
            if (!hashSet.contains(str)) {
                String str2 = f11334c;
                StringBuilder sb = new StringBuilder();
                sb.append("Deleting outdated triggered action id ");
                sb.append(str);
                sb.append(" from re-eligibility list.");
                C1557c.m7458a(str2, sb.toString());
                this.f11336b.remove(str);
                edit.remove(str);
            } else {
                String str3 = f11334c;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Retaining triggered action ");
                sb2.append(str);
                sb2.append(" in re-eligibility list.");
                C1557c.m7458a(str3, sb2.toString());
            }
        }
        edit.apply();
    }

    /* renamed from: a */
    public boolean mo15695a(C4631y3 y3Var) {
        C4583s4 f = y3Var.mo15472c().mo15858f();
        String str = "Triggered action id ";
        if (f.mo15828a()) {
            String str2 = f11334c;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(y3Var.mo15473d());
            sb.append(" always eligible via configuration. Returning true for eligibility status");
            C1557c.m7458a(str2, sb.toString());
            return true;
        } else if (!this.f11336b.containsKey(y3Var.mo15473d())) {
            String str3 = f11334c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(y3Var.mo15473d());
            sb2.append(" always eligible via never having been triggered. Returning true for eligibility status");
            C1557c.m7458a(str3, sb2.toString());
            return true;
        } else if (f.mo15830d()) {
            String str4 = f11334c;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(y3Var.mo15473d());
            sb3.append(" no longer eligible due to having been triggered in the past and is only eligible once.");
            C1557c.m7458a(str4, sb3.toString());
            return false;
        } else {
            long longValue = ((Long) this.f11336b.get(y3Var.mo15473d())).longValue();
            String str5 = ").";
            String str6 = " seconds have passed since the last time it was triggered (minimum interval: ";
            if (C4472i3.m15480a() + ((long) y3Var.mo15472c().mo15859g()) >= ((long) f.mo15829c().intValue()) + longValue) {
                String str7 = f11334c;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Trigger action is re-eligible for display since ");
                sb4.append(C4472i3.m15480a() - longValue);
                sb4.append(str6);
                sb4.append(f.mo15829c());
                sb4.append(str5);
                C1557c.m7458a(str7, sb4.toString());
                return true;
            }
            String str8 = f11334c;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Trigger action is not re-eligible for display since only ");
            sb5.append(C4472i3.m15480a() - longValue);
            sb5.append(str6);
            sb5.append(f.mo15829c());
            sb5.append(str5);
            C1557c.m7458a(str8, sb5.toString());
            return false;
        }
    }

    /* renamed from: a */
    public void mo15694a(C4631y3 y3Var, long j) {
        String str = f11334c;
        StringBuilder sb = new StringBuilder();
        sb.append("Updating re-eligibility for action Id ");
        sb.append(y3Var.mo15473d());
        sb.append(" to time ");
        sb.append(j);
        sb.append(".");
        C1557c.m7458a(str, sb.toString());
        this.f11336b.put(y3Var.mo15473d(), Long.valueOf(j));
        Editor edit = this.f11335a.edit();
        edit.putLong(y3Var.mo15473d(), j);
        edit.apply();
    }

    /* renamed from: a */
    private Map<String, Long> m15818a() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Map all = this.f11335a.getAll();
        if (!(all == null || all.size() == 0)) {
            Set<String> keySet = all.keySet();
            if (!(keySet == null || keySet.size() == 0)) {
                try {
                    for (String str : keySet) {
                        long j = this.f11335a.getLong(str, 0);
                        String str2 = f11334c;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Retrieving triggered action id ");
                        sb.append(str);
                        sb.append(" eligibility information from local storage.");
                        C1557c.m7458a(str2, sb.toString());
                        concurrentHashMap.put(str, Long.valueOf(j));
                    }
                } catch (Exception e) {
                    C1557c.m7470c(f11334c, "Encountered unexpected exception while parsing stored re-eligibility information.", e);
                }
            }
        }
        return concurrentHashMap;
    }
}
