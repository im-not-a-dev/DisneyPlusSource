package p163g.p164a.p165a;

import android.content.SharedPreferences.Editor;
import com.facebook.stetho.common.Utf8Charset;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import net.danlew.android.joda.DateUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p163g.p164a.p165a.C4669e1.C4670a;

/* renamed from: g.a.a.f1 */
/* compiled from: VisitorIDService */
final class C4673f1 {

    /* renamed from: k */
    static String f11656k = "dpm.demdex.net";

    /* renamed from: l */
    private static C4673f1 f11657l;

    /* renamed from: m */
    private static final Object f11658m = new Object();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public long f11659a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public long f11660b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f11661c = C4728p0.m16448H().mo16098q();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f11662d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f11663e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f11664f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f11665g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f11666h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public List<C4669e1> f11667i;

    /* renamed from: j */
    private final ExecutorService f11668j = Executors.newSingleThreadExecutor();

    /* renamed from: g.a.a.f1$a */
    /* compiled from: VisitorIDService */
    class C4674a implements Runnable {
        C4674a() {
        }

        public void run() {
            C4673f1.this.f11662d = null;
            C4673f1.this.f11667i = null;
            C4673f1.this.f11665g = null;
            C4673f1.this.f11666h = null;
            C4673f1.this.f11663e = null;
            C4673f1.this.f11664f = null;
            try {
                Editor C = C4783y0.m16605C();
                C.remove("ADBMOBILE_VISITORID_IDS");
                C.remove("ADBMOBILE_PERSISTED_MID");
                C.remove("ADBMOBILE_PERSISTED_MID_HINT");
                C.remove("ADBMOBILE_PERSISTED_MID_BLOB");
                C.apply();
            } catch (C4785b unused) {
                C4783y0.m16640c("ID Service - Unable to purge identities (application context is null)", new Object[0]);
            }
        }
    }

    /* renamed from: g.a.a.f1$b */
    /* compiled from: VisitorIDService */
    class C4675b implements Callable<Void> {
        C4675b() {
        }

        public Void call() throws Exception {
            try {
                C4673f1.this.m16281e(C4673f1.this.m16261a(C4783y0.m16604B().getString("ADBMOBILE_VISITORID_IDS", null)));
                C4673f1.this.f11662d = C4783y0.m16604B().getString("ADBMOBILE_PERSISTED_MID", null);
                C4673f1.this.f11663e = C4783y0.m16604B().getString("ADBMOBILE_PERSISTED_MID_HINT", null);
                C4673f1.this.f11664f = C4783y0.m16604B().getString("ADBMOBILE_PERSISTED_MID_BLOB", null);
                C4673f1.this.f11659a = C4783y0.m16604B().getLong("ADBMOBILE_VISITORID_TTL", 0);
                C4673f1.this.f11660b = C4783y0.m16604B().getLong("ADBMOBILE_VISITORID_SYNC", 0);
            } catch (C4785b e) {
                C4673f1.this.f11662d = null;
                C4673f1.this.f11663e = null;
                C4673f1.this.f11664f = null;
                C4783y0.m16636b("Visitor - Unable to check for stored visitor ID due to context error (%s)", e.getMessage());
            }
            return null;
        }
    }

    /* renamed from: g.a.a.f1$c */
    /* compiled from: VisitorIDService */
    class C4676c implements Runnable {

        /* renamed from: U */
        final /* synthetic */ HashMap f11671U;

        /* renamed from: V */
        final /* synthetic */ HashMap f11672V;

        /* renamed from: W */
        final /* synthetic */ C4670a f11673W;

        /* renamed from: c */
        final /* synthetic */ boolean f11675c;

        C4676c(boolean z, HashMap hashMap, HashMap hashMap2, C4670a aVar) {
            this.f11675c = z;
            this.f11671U = hashMap;
            this.f11672V = hashMap2;
            this.f11673W = aVar;
        }

        public void run() {
            String str = "d_optout";
            String str2 = "id_sync_ttl";
            if (C4728p0.m16448H().mo16106y()) {
                if (C4728p0.m16448H().mo16101t() != C4758r0.MOBILE_PRIVACY_STATUS_OPT_IN) {
                    C4783y0.m16630a("ID Service - Ignoring ID Sync due to privacy status not being opt in", new Object[0]);
                    return;
                }
                String r = C4728p0.m16448H().mo16099r();
                boolean z = C4783y0.m16607E() - C4673f1.this.f11660b > C4673f1.this.f11659a || this.f11675c;
                boolean z2 = this.f11671U != null;
                boolean z3 = this.f11672V != null;
                if (C4673f1.this.m16288j() == null || z2 || z3 || z) {
                    StringBuilder sb = new StringBuilder(C4728p0.m16448H().mo16104w() ? "https" : "http");
                    sb.append("://");
                    sb.append(C4673f1.this.f11661c);
                    sb.append("/id?d_ver=2&d_rtbd=json&d_orgid=");
                    sb.append(r);
                    String str3 = "d_mid";
                    String str4 = "=";
                    String str5 = "&";
                    if (C4673f1.this.m16288j() != null) {
                        sb.append(str5);
                        sb.append(str3);
                        sb.append(str4);
                        sb.append(C4673f1.this.m16288j());
                    }
                    String str6 = "d_blob";
                    if (C4673f1.this.f11664f != null) {
                        sb.append(str5);
                        sb.append(str6);
                        sb.append(str4);
                        sb.append(C4673f1.this.f11664f);
                    }
                    String str7 = "dcs_region";
                    if (C4673f1.this.f11663e != null) {
                        sb.append(str5);
                        sb.append(str7);
                        sb.append(str4);
                        sb.append(C4673f1.this.f11663e);
                    }
                    List a = C4673f1.this.m16262a((Map<String, String>) this.f11671U, this.f11673W);
                    String b = C4673f1.this.m16268b(a);
                    if (b != null) {
                        sb.append(b);
                    }
                    String a2 = C4673f1.this.m16269b((Map<String, String>) this.f11672V);
                    if (a2 != null) {
                        sb.append(a2);
                    }
                    if (C4728p0.m16448H().mo16097p()) {
                        sb.append("&d_coop_unsafe=1");
                    }
                    String sb2 = sb.toString();
                    C4783y0.m16630a("ID Service - Sending id sync call (%s)", sb2);
                    JSONObject a3 = C4673f1.this.mo16007a(C4779x0.m16599a(sb2, null, 2000, "ID Service"));
                    String str8 = "error_msg";
                    if (a3 != null && a3.has(str3) && !a3.has(str8)) {
                        try {
                            if (a3.has(str6)) {
                                C4673f1.this.f11664f = a3.getString(str6);
                            }
                            if (a3.has(str7)) {
                                C4673f1.this.f11663e = a3.getString(str7);
                            }
                            if (a3.has(str2)) {
                                C4673f1.this.f11659a = (long) a3.getInt(str2);
                            }
                            String str9 = "";
                            if (a3.has(str) && a3.getJSONArray(str).length() > 0) {
                                C4728p0.m16448H().mo16079a(C4758r0.MOBILE_PRIVACY_STATUS_OPT_OUT);
                                str9 = ", global privacy status: opted out";
                            }
                            C4783y0.m16630a("ID Service - Got ID Response (mid: %s, blob: %s, hint: %s, ttl: %d%s)", C4673f1.this.m16288j(), C4673f1.this.f11664f, C4673f1.this.f11663e, Long.valueOf(C4673f1.this.f11659a), str9);
                        } catch (JSONException e) {
                            C4783y0.m16630a("ID Service - Error parsing response (%s)", e.getLocalizedMessage());
                        }
                    } else if (a3 != null && a3.has(str8)) {
                        try {
                            C4783y0.m16636b("ID Service - Service returned error (%s)", a3.getString(str8));
                        } catch (JSONException e2) {
                            C4783y0.m16636b("ID Service - Unable to read error condition(%s)", e2.getLocalizedMessage());
                        }
                    }
                    C4673f1.this.f11660b = C4783y0.m16607E();
                    C4673f1 f1Var = C4673f1.this;
                    f1Var.m16281e(f1Var.m16277d(a));
                    C4673f1 f1Var2 = C4673f1.this;
                    String e3 = f1Var2.m16272c(f1Var2.f11667i);
                    C4684g1.m16307a(C4673f1.this.m16288j(), C4673f1.this.f11663e, C4673f1.this.f11664f, C4673f1.this.f11659a, C4673f1.this.f11660b, e3);
                    try {
                        Editor C = C4783y0.m16605C();
                        C.putString("ADBMOBILE_VISITORID_IDS", e3);
                        C.putString("ADBMOBILE_PERSISTED_MID", C4673f1.this.m16288j());
                        C.putString("ADBMOBILE_PERSISTED_MID_HINT", C4673f1.this.f11663e);
                        C.putString("ADBMOBILE_PERSISTED_MID_BLOB", C4673f1.this.f11664f);
                        C.putLong("ADBMOBILE_VISITORID_TTL", C4673f1.this.f11659a);
                        C.putLong("ADBMOBILE_VISITORID_SYNC", C4673f1.this.f11660b);
                        C.commit();
                    } catch (C4785b e4) {
                        C4783y0.m16636b("ID Service - Unable to persist identifiers to shared preferences(%s)", e4.getLocalizedMessage());
                    }
                }
            }
        }
    }

    /* renamed from: g.a.a.f1$d */
    /* compiled from: VisitorIDService */
    class C4677d implements Callable<String> {
        C4677d() {
        }

        public String call() throws Exception {
            return C4673f1.this.m16288j();
        }
    }

    /* renamed from: g.a.a.f1$e */
    /* compiled from: VisitorIDService */
    class C4678e implements Callable<Void> {

        /* renamed from: c */
        final /* synthetic */ StringBuilder f11678c;

        C4678e(StringBuilder sb) {
            this.f11678c = sb;
        }

        public Void call() throws Exception {
            if (C4673f1.this.m16288j() != null) {
                this.f11678c.append("?");
                this.f11678c.append("mid");
                String str = "=";
                this.f11678c.append(str);
                this.f11678c.append(C4673f1.this.m16288j());
                this.f11678c.append("&");
                this.f11678c.append("mcorgid");
                this.f11678c.append(str);
                this.f11678c.append(C4728p0.m16448H().mo16099r());
            }
            return null;
        }
    }

    /* renamed from: g.a.a.f1$f */
    /* compiled from: VisitorIDService */
    class C4679f implements Callable<String> {
        C4679f() {
        }

        public String call() throws Exception {
            return C4673f1.this.f11665g != null ? C4673f1.this.f11665g : "";
        }
    }

    /* renamed from: g.a.a.f1$g */
    /* compiled from: VisitorIDService */
    class C4680g implements Callable<Void> {

        /* renamed from: c */
        final /* synthetic */ Map f11681c;

        C4680g(Map map) {
            this.f11681c = map;
        }

        public Void call() throws Exception {
            if (C4673f1.this.m16288j() != null) {
                this.f11681c.put("mid", C4673f1.this.m16288j());
                if (C4673f1.this.f11664f != null) {
                    this.f11681c.put("aamb", C4673f1.this.f11664f);
                }
                if (C4673f1.this.f11663e != null) {
                    this.f11681c.put("aamlh", C4673f1.this.f11663e);
                }
            }
            return null;
        }
    }

    /* renamed from: g.a.a.f1$h */
    /* compiled from: VisitorIDService */
    class C4681h implements Callable<Void> {

        /* renamed from: c */
        final /* synthetic */ StringBuilder f11683c;

        C4681h(StringBuilder sb) {
            this.f11683c = sb;
        }

        public Void call() throws Exception {
            if (C4673f1.this.m16288j() != null) {
                String str = "&";
                this.f11683c.append(str);
                this.f11683c.append("d_mid");
                String str2 = "=";
                this.f11683c.append(str2);
                this.f11683c.append(C4673f1.this.m16288j());
                if (C4673f1.this.f11664f != null) {
                    this.f11683c.append(str);
                    this.f11683c.append("d_blob");
                    this.f11683c.append(str2);
                    this.f11683c.append(C4673f1.this.f11664f);
                }
                if (C4673f1.this.f11663e != null) {
                    this.f11683c.append(str);
                    this.f11683c.append("dcs_region");
                    this.f11683c.append(str2);
                    this.f11683c.append(C4673f1.this.f11663e);
                }
                if (C4673f1.this.f11666h != null) {
                    this.f11683c.append(C4673f1.this.f11666h);
                }
            }
            return null;
        }
    }

    protected C4673f1() {
        String str = this.f11661c;
        if (str == null || str.isEmpty()) {
            this.f11661c = f11656k;
        }
        mo16016h();
        mo16008a(null);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final String m16288j() {
        if (this.f11662d == null && C4728p0.m16448H().mo16101t() != C4758r0.MOBILE_PRIVACY_STATUS_OPT_OUT && C4728p0.m16448H().mo16106y()) {
            this.f11662d = m16286i();
            C4783y0.m16630a("ID Service - generating mid locally (mid: %s, ttl: %d)", this.f11662d, Long.valueOf(this.f11659a));
            try {
                Editor C = C4783y0.m16605C();
                C.putString("ADBMOBILE_PERSISTED_MID", this.f11662d);
                C.commit();
            } catch (C4785b e) {
                C4783y0.m16636b("ID Service - Unable to persist identifiers to shared preferences(%s)", e.getLocalizedMessage());
            }
        }
        return this.f11662d;
    }

    /* renamed from: k */
    public static C4673f1 m16289k() {
        C4673f1 f1Var;
        synchronized (f11658m) {
            if (f11657l == null) {
                f11657l = new C4673f1();
            }
            f1Var = f11657l;
        }
        return f1Var;
    }

    /* renamed from: i */
    private String m16286i() {
        UUID randomUUID = UUID.randomUUID();
        long mostSignificantBits = randomUUID.getMostSignificantBits();
        long leastSignificantBits = randomUUID.getLeastSignificantBits();
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        if (mostSignificantBits < 0) {
            mostSignificantBits = -mostSignificantBits;
        }
        objArr[0] = Long.valueOf(mostSignificantBits);
        if (leastSignificantBits < 0) {
            leastSignificantBits = -leastSignificantBits;
        }
        objArr[1] = Long.valueOf(leastSignificantBits);
        return String.format(locale, "%019d%019d", objArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo16015g() {
        this.f11668j.execute(new C4674a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo16016h() {
        FutureTask futureTask = new FutureTask(new C4675b());
        this.f11668j.execute(futureTask);
        try {
            futureTask.get();
        } catch (Exception e) {
            C4783y0.m16636b("ID Service - Unable to initialize visitor ID variables(%s)", e.getLocalizedMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo16014f() {
        return this.f11661c;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m16281e(List<C4669e1> list) {
        this.f11667i = list;
        this.f11665g = m16257a(this.f11667i);
        this.f11666h = m16268b(this.f11667i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo16011c() {
        FutureTask futureTask = new FutureTask(new C4679f());
        this.f11668j.execute(futureTask);
        try {
            return (String) futureTask.get();
        } catch (Exception e) {
            C4783y0.m16636b("ID Service - Unable to retrieve analytics id string from queue(%s)", e.getLocalizedMessage());
            return "";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Map<String, Object> mo16012d() {
        HashMap hashMap = new HashMap();
        FutureTask futureTask = new FutureTask(new C4680g(hashMap));
        this.f11668j.execute(futureTask);
        try {
            futureTask.get();
        } catch (Exception e) {
            C4783y0.m16636b("ID Service - Unable to retrieve analytics parameters from queue(%s)", e.getLocalizedMessage());
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo16010b() {
        StringBuilder sb = new StringBuilder();
        FutureTask futureTask = new FutureTask(new C4678e(sb));
        this.f11668j.execute(futureTask);
        try {
            futureTask.get();
        } catch (Exception e) {
            C4783y0.m16636b("ID Service - Unable to retrieve analytics id parameters from queue(%s)", e.getLocalizedMessage());
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16008a(Map<String, String> map) {
        mo16009a(map, null, C4670a.VISITOR_ID_AUTHENTICATION_STATE_UNKNOWN, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo16013e() {
        FutureTask futureTask = new FutureTask(new C4677d());
        this.f11668j.execute(futureTask);
        try {
            return (String) futureTask.get();
        } catch (Exception e) {
            C4783y0.m16636b("ID Service - Unable to retrieve marketing cloud id from queue(%s)", e.getLocalizedMessage());
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public String m16272c(List<C4669e1> list) {
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (C4669e1 e1Var : list) {
            sb.append("&");
            sb.append("d_cid_ic");
            sb.append("=");
            sb.append(e1Var.f11648a);
            String str = "%01";
            sb.append(str);
            String str2 = e1Var.f11649b;
            if (str2 != null) {
                sb.append(str2);
            }
            sb.append(str);
            sb.append(e1Var.f11650c.mo16005a());
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16009a(Map<String, String> map, Map<String, String> map2, C4670a aVar, boolean z) {
        HashMap hashMap = null;
        HashMap hashMap2 = map != null ? new HashMap(map) : null;
        if (map2 != null) {
            hashMap = new HashMap(map2);
        }
        HashMap hashMap3 = hashMap;
        ExecutorService executorService = this.f11668j;
        C4676c cVar = new C4676c(z, hashMap2, hashMap3, aVar);
        executorService.execute(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public List<C4669e1> m16277d(List<C4669e1> list) {
        ArrayList arrayList;
        if (list == null) {
            return this.f11667i;
        }
        List<C4669e1> list2 = this.f11667i;
        if (list2 != null) {
            arrayList = new ArrayList(list2);
        } else {
            arrayList = new ArrayList();
        }
        for (C4669e1 e1Var : list) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    C4669e1 e1Var2 = (C4669e1) it.next();
                    if (e1Var2.mo16003a(e1Var.f11648a)) {
                        e1Var2.f11650c = e1Var.f11650c;
                        e1Var2.f11649b = e1Var.f11649b;
                        break;
                    }
                } else {
                    try {
                        arrayList.add(e1Var);
                        break;
                    } catch (IllegalStateException e) {
                        C4783y0.m16640c("ID Service - Unable to create ID after encoding:(%s)", e.getLocalizedMessage());
                    }
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public String m16268b(List<C4669e1> list) {
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (C4669e1 e1Var : list) {
            sb.append("&");
            sb.append("d_cid_ic");
            sb.append("=");
            sb.append(C4783y0.m16619a(e1Var.f11648a));
            String str = "%01";
            sb.append(str);
            String a = C4783y0.m16619a(e1Var.f11649b);
            if (a != null) {
                sb.append(a);
            }
            sb.append(str);
            sb.append(e1Var.f11650c.mo16005a());
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final JSONObject mo16007a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return new JSONObject(new String(bArr, Utf8Charset.NAME));
        } catch (UnsupportedEncodingException e) {
            C4783y0.m16636b("ID Service - Unable to decode response(%s)", e.getLocalizedMessage());
            return null;
        } catch (JSONException e2) {
            C4783y0.m16630a("ID Service - Unable to parse response(%s)", e2.getLocalizedMessage());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo16006a() {
        StringBuilder sb = new StringBuilder();
        FutureTask futureTask = new FutureTask(new C4681h(sb));
        this.f11668j.execute(futureTask);
        try {
            futureTask.get();
        } catch (Exception e) {
            C4783y0.m16636b("ID Service - Unable to retrieve audience manager parameters from queue(%s)", e.getLocalizedMessage());
        }
        return sb.toString();
    }

    /* renamed from: a */
    private String m16257a(List<C4669e1> list) {
        if (list == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (C4669e1 e1Var : list) {
            hashMap.put(e1Var.mo16004b(), e1Var.f11649b);
            hashMap.put(e1Var.mo16002a(), Integer.valueOf(e1Var.f11650c.mo16005a()));
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("cid", C4783y0.m16633b((Map<String, Object>) hashMap));
        StringBuilder sb = new StringBuilder(DateUtils.FORMAT_NO_MIDNIGHT);
        C4783y0.m16631a((Map<String, Object>) hashMap2, sb);
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public String m16269b(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap(map);
        StringBuilder sb = new StringBuilder();
        for (Entry entry : hashMap.entrySet()) {
            sb.append("&d_cid=");
            sb.append(C4783y0.m16619a((String) entry.getKey()));
            sb.append("%01");
            sb.append(C4783y0.m16619a((String) entry.getValue()));
        }
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public List<C4669e1> m16262a(Map<String, String> map, C4670a aVar) {
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap(map);
        ArrayList arrayList = new ArrayList();
        for (Entry entry : hashMap.entrySet()) {
            try {
                arrayList.add(new C4669e1("d_cid_ic", (String) entry.getKey(), (String) entry.getValue(), aVar));
            } catch (IllegalStateException e) {
                C4783y0.m16640c("ID Service - Unable to create ID after encoding:(%s)", e.getLocalizedMessage());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public List<C4669e1> m16261a(String str) {
        if (str == null) {
            return null;
        }
        List<String> asList = Arrays.asList(str.split("&"));
        ArrayList arrayList = new ArrayList();
        for (String str2 : asList) {
            if (str2.length() > 0) {
                int indexOf = str2.indexOf("=");
                if (indexOf == -1) {
                    C4783y0.m16640c("ID Service - Unable to load Customer ID from Shared Preferences: %s", str2);
                } else {
                    try {
                        String substring = str2.substring(0, indexOf);
                        String substring2 = str2.substring(indexOf + 1, str2.length());
                        List asList2 = Arrays.asList(substring2.split("%01"));
                        if (asList2.size() != 3) {
                            C4783y0.m16640c("ID Service - Unable to load Customer ID from Shared Preferences, value was malformed: %s", substring2);
                        } else {
                            try {
                                arrayList.add(new C4669e1(substring, (String) asList2.get(0), (String) asList2.get(1), C4670a.values()[Integer.parseInt((String) asList2.get(2))]));
                            } catch (NumberFormatException e) {
                                C4783y0.m16640c("ID Service - Unable to parse visitor ID: (%s) exception:(%s)", str2, e.getLocalizedMessage());
                            } catch (IllegalStateException e2) {
                                C4783y0.m16640c("ID Service - Unable to create ID after encoding:(%s)", e2.getLocalizedMessage());
                            }
                        }
                    } catch (IndexOutOfBoundsException e3) {
                        C4783y0.m16640c("ID Service - Unable to load Customer ID from Shared Preferences, name or value was malformed: %s (%s)", str2, e3.getLocalizedMessage());
                    }
                }
            }
        }
        return arrayList;
    }
}
