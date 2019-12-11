package p161f.p162a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import com.appboy.p033s.C1554a;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1560f;
import com.appboy.p033s.C1563i;
import com.appboy.p033s.C1565k;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: f.a.n5 */
public class C4524n5 implements C4483j5 {

    /* renamed from: e */
    private static final String f11228e = C1557c.m7461a(C4524n5.class);

    /* renamed from: a */
    private final Context f11229a;

    /* renamed from: b */
    private final SharedPreferences f11230b;

    /* renamed from: c */
    private Map<String, String> f11231c;

    /* renamed from: d */
    private Map<String, String> f11232d = new HashMap();

    public C4524n5(Context context, String str) {
        this.f11229a = context;
        StringBuilder sb = new StringBuilder();
        sb.append("com.appboy.storage.triggers.local_assets.");
        sb.append(str);
        this.f11230b = context.getSharedPreferences(sb.toString(), 0);
        this.f11231c = mo15723a();
    }

    /* renamed from: c */
    private void m15662c() {
        try {
            File[] listFiles = mo15724b().listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    String path = file.getPath();
                    String str = "Asset ";
                    if (this.f11231c.containsValue(path)) {
                        String str2 = f11228e;
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(path);
                        sb.append(" is not obsolete. Not deleting.");
                        C1557c.m7458a(str2, sb.toString());
                    } else if (!this.f11232d.containsValue(path)) {
                        String str3 = f11228e;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Deleting obsolete asset ");
                        sb2.append(path);
                        sb2.append(" from filesystem.");
                        C1557c.m7458a(str3, sb2.toString());
                        C1554a.m7443a(file);
                    } else {
                        String str4 = f11228e;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str);
                        sb3.append(path);
                        sb3.append(" is being preserved. Not deleting.");
                        C1557c.m7458a(str4, sb3.toString());
                    }
                }
            }
        } catch (Exception e) {
            C1557c.m7466b(f11228e, "Exception while deleting obsolete assets from filesystem.", (Throwable) e);
        }
    }

    /* renamed from: a */
    public void mo15671a(List<C4631y3> list) {
        HashSet<C4561q5> hashSet = new HashSet<>();
        HashSet hashSet2 = new HashSet();
        m15660a(list, hashSet, hashSet2);
        Editor edit = this.f11230b.edit();
        m15661a(hashSet2, edit, this.f11231c, this.f11232d);
        m15662c();
        for (C4561q5 q5Var : hashSet) {
            String b = q5Var.mo15798b();
            if (this.f11231c.containsKey(b)) {
                String str = f11228e;
                StringBuilder sb = new StringBuilder();
                sb.append("Local assets already contains remote path string: ");
                sb.append(b);
                C1557c.m7458a(str, sb.toString());
            } else {
                try {
                    String a = mo15722a(q5Var);
                    if (!C1563i.m7490d(a)) {
                        String str2 = f11228e;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Adding new local path ");
                        sb2.append(a);
                        sb2.append(" for remote path ");
                        sb2.append(b);
                        sb2.append(" to cache.");
                        C1557c.m7458a(str2, sb2.toString());
                        this.f11231c.put(b, a);
                        edit.putString(b, a);
                        edit.apply();
                    }
                } catch (Exception e) {
                    String str3 = f11228e;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Failed to add new local path for remote path ");
                    sb3.append(b);
                    C1557c.m7470c(str3, sb3.toString(), e);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public File mo15724b() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11229a.getCacheDir().getPath());
        sb.append("/");
        sb.append("ab_triggers");
        return new File(sb.toString());
    }

    /* renamed from: a */
    public String mo15638a(C4631y3 y3Var) {
        if (!y3Var.mo15470a()) {
            C1557c.m7458a(f11228e, "Prefetch turned off for this triggered action. Not retrieving local asset path.");
            return null;
        }
        C4561q5 g = y3Var.mo15411g();
        if (g == null) {
            C1557c.m7469c(f11228e, "Remote path was null or blank. Not retrieving local asset path.");
            return null;
        }
        String b = g.mo15798b();
        if (C1563i.m7490d(b)) {
            C1557c.m7473e(f11228e, "Remote asset path string was null or blank. Not retrieving local asset path.");
            return null;
        } else if (this.f11231c.containsKey(b)) {
            String str = (String) this.f11231c.get(b);
            if (!new File(str).exists()) {
                String str2 = f11228e;
                StringBuilder sb = new StringBuilder();
                sb.append("Local asset for remote asset path did not exist: ");
                sb.append(b);
                C1557c.m7473e(str2, sb.toString());
                return null;
            }
            String str3 = f11228e;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Retrieving local asset path for remote asset path: ");
            sb2.append(b);
            C1557c.m7469c(str3, sb2.toString());
            this.f11232d.put(b, str);
            return str;
        } else {
            String str4 = f11228e;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("No local asset path found for remote asset path: ");
            sb3.append(b);
            C1557c.m7473e(str4, sb3.toString());
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo15722a(C4561q5 q5Var) {
        File b = mo15724b();
        String b2 = q5Var.mo15798b();
        String str = " for remote path ";
        String str2 = ". Not storing local asset";
        if (q5Var.mo15797a().equals(C4625x4.ZIP)) {
            String a = C1565k.m7500a(b, b2);
            if (!C1563i.m7490d(a)) {
                String str3 = f11228e;
                StringBuilder sb = new StringBuilder();
                sb.append("Storing local triggered action html zip asset at local path ");
                sb.append(a);
                sb.append(str);
                sb.append(b2);
                C1557c.m7469c(str3, sb.toString());
                return a;
            }
            String str4 = f11228e;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to store html zip asset for remote path ");
            sb2.append(b2);
            sb2.append(str2);
            C1557c.m7458a(str4, sb2.toString());
            return null;
        }
        File a2 = C1554a.m7441a(b.toString(), b2, Integer.toString(C1560f.m7479a()), null);
        if (a2 != null) {
            Uri fromFile = Uri.fromFile(a2);
            if (fromFile != null) {
                String str5 = f11228e;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Storing local triggered action image asset at local path ");
                sb3.append(fromFile.getPath());
                sb3.append(str);
                sb3.append(b2);
                C1557c.m7469c(str5, sb3.toString());
                return fromFile.getPath();
            }
            String str6 = f11228e;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Failed to store image asset for remote path ");
            sb4.append(b2);
            sb4.append(str2);
            C1557c.m7458a(str6, sb4.toString());
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Map<String, String> mo15723a() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Map all = this.f11230b.getAll();
        if (!(all == null || all.size() == 0)) {
            Set<String> keySet = all.keySet();
            if (!(keySet == null || keySet.size() == 0)) {
                try {
                    for (String str : keySet) {
                        String string = this.f11230b.getString(str, null);
                        if (!C1563i.m7490d(string)) {
                            String str2 = f11228e;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Retrieving trigger local asset path ");
                            sb.append(string);
                            sb.append(" from local storage for remote path ");
                            sb.append(str);
                            sb.append(".");
                            C1557c.m7458a(str2, sb.toString());
                            concurrentHashMap.put(str, string);
                        }
                    }
                } catch (Exception e) {
                    C1557c.m7470c(f11228e, "Encountered unexpected exception while parsing stored triggered action local assets.", e);
                }
            }
        }
        return concurrentHashMap;
    }

    /* renamed from: a */
    private static void m15661a(Set<String> set, Editor editor, Map<String, String> map, Map<String, String> map2) {
        for (String str : new HashSet(map.keySet())) {
            if (map2.containsKey(str)) {
                String str2 = f11228e;
                StringBuilder sb = new StringBuilder();
                sb.append("Not removing local path for remote path ");
                sb.append(str);
                sb.append(" from cache because it is being preserved until the end of the app run.");
                C1557c.m7458a(str2, sb.toString());
            } else if (!set.contains(str)) {
                String str3 = (String) map.get(str);
                map.remove(str);
                editor.remove(str);
                if (!C1563i.m7490d(str3)) {
                    String str4 = f11228e;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Removing obsolete local path ");
                    sb2.append(str3);
                    sb2.append(" for obsolete remote path ");
                    sb2.append(str);
                    sb2.append(" from cache.");
                    C1557c.m7458a(str4, sb2.toString());
                    C1554a.m7443a(new File(str3));
                }
            }
        }
        editor.apply();
    }

    /* renamed from: a */
    private static void m15660a(List<C4631y3> list, Set<C4561q5> set, Set<String> set2) {
        for (C4631y3 y3Var : list) {
            C4561q5 g = y3Var.mo15411g();
            if (g != null && !C1563i.m7490d(g.mo15798b())) {
                String str = ".";
                if (y3Var.mo15470a()) {
                    String str2 = f11228e;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Received new remote path for triggered action ");
                    sb.append(y3Var.mo15473d());
                    sb.append(" at ");
                    sb.append(g.mo15798b());
                    sb.append(str);
                    C1557c.m7458a(str2, sb.toString());
                    set.add(g);
                    set2.add(g.mo15798b());
                } else {
                    String str3 = f11228e;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Pre-fetch off for triggered action ");
                    sb2.append(y3Var.mo15473d());
                    sb2.append(". Not pre-fetching assets at remote path ");
                    sb2.append(g.mo15798b());
                    sb2.append(str);
                    C1557c.m7458a(str3, sb2.toString());
                }
            }
        }
    }
}
