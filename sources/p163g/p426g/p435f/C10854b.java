package p163g.p426g.p435f;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import com.bamtechmedia.dominguez.legal.DefaultLegalApi;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import p163g.p426g.p427a.C10811c;
import p163g.p426g.p427a.C10816g;
import p163g.p426g.p427a.p429j.C10827a;
import p163g.p426g.p427a.p429j.C10829c;
import p163g.p426g.p431c.C10838a;
import p163g.p426g.p431c.C10839b;
import p163g.p426g.p432d.p433a.C10847h;
import p163g.p426g.p432d.p433a.C10850k;
import p163g.p426g.p434e.C10852a;
import p163g.p426g.p436g.C10880i;

/* renamed from: g.g.f.b */
/* compiled from: ConvivaOfflineManager */
public class C10854b {

    /* renamed from: a */
    private static C10853a f25655a;

    /* renamed from: b */
    private static C10838a f25656b;

    /* renamed from: c */
    private static Context f25657c = C10847h.m34189a().getApplicationContext();

    /* renamed from: d */
    private static String f25658d = C10852a.f25648c;

    /* renamed from: e */
    private static boolean f25659e = false;

    /* renamed from: f */
    private static C10829c f25660f = null;

    /* renamed from: g */
    private static String f25661g = null;

    /* renamed from: h */
    private static C10880i f25662h = null;

    /* renamed from: i */
    private static C10811c f25663i = null;

    /* renamed from: j */
    private static ThreadPoolExecutor f25664j = ((ThreadPoolExecutor) Executors.newFixedThreadPool(2));

    /* renamed from: g.g.f.b$a */
    /* compiled from: ConvivaOfflineManager */
    static class C10855a implements C10827a {
        C10855a() {
        }

        /* renamed from: a */
        public void mo27892a(boolean z, String str) {
            C10854b.m34209b(Boolean.valueOf(z), str);
        }
    }

    /* renamed from: b */
    static boolean m34210b() {
        return f25659e;
    }

    /* renamed from: c */
    private static void m34211c() {
        try {
            f25658d = f25657c.getSharedPreferences("Conviva", 0).getString("clid", null);
        } catch (Exception unused) {
            f25662h.mo27992c("error loading offline clientid");
        }
    }

    /* renamed from: d */
    public static void m34212d() {
        C10850k kVar = new C10850k();
        C10853a aVar = f25655a;
        if (aVar == null || f25660f == null || aVar.mo27929c() || f25660f.mo27895b() || f25660f.mo27894a() || !f25660f.isVisible()) {
            C10880i iVar = f25662h;
            if (iVar != null) {
                iVar.mo27992c("No HBs in offline database");
            }
        } else {
            String b = f25655a.mo27928b();
            if (b == null) {
                f25662h.mo27992c("fetchedheartbeat is null");
                return;
            }
            String str = DefaultLegalApi.MIME_TYPE_JSON;
            Map a = f25656b.mo27922a(b);
            String str2 = "clid";
            if (String.valueOf(a.get(str2)).equals(String.valueOf(0))) {
                m34211c();
                a.put(str2, f25658d);
            }
            try {
                f25662h.mo27992c("sending offline heartbeat");
                String a2 = f25656b.mo27921a(a);
                kVar.mo27923a("POST", f25661g, a2, str, 10000, new C10855a());
                if (f25664j.isShutdown() || f25664j.getActiveCount() == f25664j.getMaximumPoolSize()) {
                    new Thread(kVar).start();
                } else {
                    f25664j.submit(kVar);
                }
            } catch (Exception unused) {
                f25662h.mo27992c("Error posting offline heartbeat");
            }
        }
    }

    /* renamed from: a */
    public static void m34207a(C10811c cVar, C10816g gVar) {
        f25657c = C10847h.m34189a().getApplicationContext();
        f25655a = C10853a.m34200d();
        f25656b = new C10839b();
        f25663i = cVar;
        StringBuilder sb = new StringBuilder();
        sb.append(f25663i.f25552c);
        sb.append(C10852a.f25647b);
        f25661g = sb.toString();
        f25660f = gVar.mo27859c();
        f25662h = gVar.mo27862f();
        f25662h.mo27989b("ConvivaOfflineManager");
        m34212d();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m34209b(Boolean bool, String str) {
        if (!bool.booleanValue()) {
            f25662h.mo27988a("received no response (or a bad response) to offline heartbeat POST request.");
            return;
        }
        Map a = f25656b.mo27922a(str);
        if (a == null) {
            f25662h.mo27995f("JSON: Received null decoded response for offline HB");
            return;
        }
        String str2 = "seq";
        String obj = a.containsKey(str2) ? a.get(str2).toString() : "-1";
        C10880i iVar = f25662h;
        StringBuilder sb = new StringBuilder();
        sb.append("receiveResponse(): received valid response for HB[");
        sb.append(obj);
        sb.append("]");
        iVar.mo27992c(sb.toString());
        String str3 = "clid";
        if (a.containsKey(str3)) {
            String obj2 = a.get(str3).toString();
            if (!obj2.equals(f25658d)) {
                Editor edit = f25657c.getSharedPreferences("Conviva", 0).edit();
                edit.putString(str3, obj2);
                C10880i iVar2 = f25662h;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("receiveResponse(): setting the client id to ");
                sb2.append(obj2);
                sb2.append(" (from server)");
                iVar2.mo27992c(sb2.toString());
                if (edit.commit()) {
                    f25658d = obj2;
                    f25659e = true;
                }
            }
        }
        String str4 = "err";
        if (a.containsKey(str4)) {
            String str5 = (String) a.get(str4);
            if (!str5.equals(C10852a.f25649d)) {
                C10880i iVar3 = f25662h;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("receiveResponse(): error posting offline heartbeat: ");
                sb3.append(str5);
                iVar3.mo27988a(sb3.toString());
                return;
            }
        }
        f25655a.mo27926a();
        m34212d();
    }

    /* renamed from: a */
    static String m34206a() {
        return f25658d;
    }
}
