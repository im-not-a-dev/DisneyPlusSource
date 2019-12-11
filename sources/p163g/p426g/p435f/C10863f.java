package p163g.p426g.p435f;

import com.bamtechmedia.dominguez.legal.DefaultLegalApi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p163g.p426g.p427a.C10790b;
import p163g.p426g.p427a.C10790b.C10799i;
import p163g.p426g.p427a.C10790b.C10800j;
import p163g.p426g.p427a.C10790b.C10801k;
import p163g.p426g.p427a.C10790b.C10810m;
import p163g.p426g.p427a.C10811c;
import p163g.p426g.p427a.C10812d;
import p163g.p426g.p427a.C10812d.C10813a;
import p163g.p426g.p427a.C10815f;
import p163g.p426g.p427a.C10816g;
import p163g.p426g.p427a.p428i.C10821c;
import p163g.p426g.p427a.p429j.C10827a;
import p163g.p426g.p427a.p429j.C10828b;
import p163g.p426g.p427a.p429j.C10829c;
import p163g.p426g.p430b.C10837a;
import p163g.p426g.p431c.C10838a;
import p163g.p426g.p432d.p433a.C10844e;
import p163g.p426g.p434e.C10852a;
import p163g.p426g.p435f.C10867g.C10868a;
import p163g.p426g.p436g.C10869a;
import p163g.p426g.p436g.C10872c;
import p163g.p426g.p436g.C10876e;
import p163g.p426g.p436g.C10879h;
import p163g.p426g.p436g.C10880i;
import p163g.p426g.p436g.C10885m;
import p163g.p426g.p436g.C10887n;
import p163g.p426g.p436g.C10888o;

/* renamed from: g.g.f.f */
/* compiled from: Session */
public class C10863f {

    /* renamed from: A */
    private double f25714A;

    /* renamed from: a */
    private C10812d f25715a = null;

    /* renamed from: b */
    private int f25716b = 0;

    /* renamed from: c */
    private C10856c f25717c;

    /* renamed from: d */
    private C10858e f25718d;

    /* renamed from: e */
    private C10790b f25719e;

    /* renamed from: f */
    private C10811c f25720f;

    /* renamed from: g */
    private C10872c f25721g;

    /* renamed from: h */
    private C10816g f25722h;

    /* renamed from: i */
    private C10852a f25723i;

    /* renamed from: j */
    private C10887n f25724j;

    /* renamed from: k */
    private C10888o f25725k;

    /* renamed from: l */
    private C10838a f25726l;

    /* renamed from: m */
    private C10880i f25727m;

    /* renamed from: n */
    private C10876e f25728n;

    /* renamed from: o */
    private C10885m f25729o;

    /* renamed from: p */
    private C10829c f25730p;

    /* renamed from: q */
    private double f25731q = 0.0d;

    /* renamed from: r */
    private int f25732r = 0;

    /* renamed from: s */
    private C10828b f25733s = null;

    /* renamed from: t */
    private boolean f25734t = false;

    /* renamed from: u */
    private String f25735u = "2.145.3";

    /* renamed from: v */
    private C10868a f25736v = C10868a.GLOBAL;

    /* renamed from: w */
    private C10853a f25737w = null;

    /* renamed from: x */
    private boolean f25738x = false;

    /* renamed from: y */
    private ArrayList<HashMap<String, Object>> f25739y = new ArrayList<>();

    /* renamed from: z */
    private int f25740z = 2;

    /* renamed from: g.g.f.f$a */
    /* compiled from: Session */
    class C10864a implements C10827a {
        C10864a() {
        }

        /* renamed from: a */
        public void mo27892a(boolean z, String str) {
            try {
                C10863f.this.m34257a(Boolean.valueOf(z), str);
            } catch (NullPointerException e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: g.g.f.f$b */
    /* compiled from: Session */
    class C10865b implements C10869a {
        C10865b() {
        }

        /* renamed from: a */
        public void mo27969a() {
            C10863f.this.m34265m();
            C10863f.this.m34263k();
        }
    }

    /* renamed from: g.g.f.f$c */
    /* compiled from: Session */
    class C10866c implements Runnable {
        C10866c() {
        }

        public void run() {
            C10863f.this.m34265m();
        }
    }

    public C10863f(int i, C10856c cVar, C10812d dVar, C10858e eVar, C10790b bVar, C10811c cVar2, C10872c cVar3, C10816g gVar, C10868a aVar) {
        this.f25716b = i;
        this.f25717c = cVar;
        this.f25715a = dVar;
        this.f25718d = eVar;
        this.f25719e = bVar;
        this.f25720f = new C10811c(cVar2);
        this.f25721g = cVar3;
        this.f25722h = gVar;
        this.f25724j = this.f25722h.mo27867k();
        this.f25725k = this.f25722h.mo27868l();
        this.f25726l = this.f25722h.mo27861e();
        this.f25722h.mo27858b();
        this.f25727m = this.f25722h.mo27862f();
        this.f25727m.mo27989b("Session");
        this.f25727m.mo27990a(this.f25716b);
        this.f25728n = this.f25722h.mo27860d();
        this.f25729o = this.f25722h.mo27866j();
        this.f25723i = this.f25722h.mo27864h();
        this.f25730p = this.f25722h.mo27859c();
        this.f25722h.mo27855a();
        this.f25722h.mo27870n();
        this.f25736v = aVar;
        this.f25737w = C10853a.m34200d();
        C10812d dVar2 = this.f25715a;
        if (dVar2 == null || dVar2.f25554b != null) {
            C10812d dVar3 = this.f25715a;
            if (dVar3 != null) {
                Map<String, String> map = dVar3.f25554b;
                if (map != null) {
                    String str = "c3.video.offlinePlayback";
                    if (map.containsKey(str)) {
                        if ("true".equals(this.f25715a.f25554b.get(str))) {
                            this.f25738x = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            this.f25727m.mo27992c(" isOffline flag is not true. Offline data will not be collected");
            return;
        }
        dVar2.f25554b = new HashMap();
    }

    /* renamed from: j */
    private void m34262j() {
        if (this.f25740z > 0) {
            HashMap hashMap = new HashMap();
            int i = this.f25732r;
            hashMap.put("seq", Integer.valueOf(i > 0 ? i - 1 : 0));
            hashMap.put("err", "pending");
            hashMap.put("rtt", Double.valueOf(this.f25724j.mo28003a()));
            this.f25739y.add(hashMap);
        }
        while (this.f25739y.size() > this.f25740z) {
            this.f25739y.remove(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m34263k() {
        C10828b bVar = this.f25733s;
        if (bVar != null) {
            bVar.cancel();
            this.f25733s = null;
        }
        this.f25733s = this.f25725k.mo28005b(new C10866c(), this.f25720f.f25551b * 1000, "sendHeartbeat");
    }

    /* renamed from: l */
    private Map<String, Object> m34264l() {
        boolean z = this.f25738x;
        Boolean valueOf = Boolean.valueOf(true);
        if (z && this.f25717c.mo27934b() <= 1 && !C10844e.m34186g().booleanValue()) {
            return null;
        }
        List a = this.f25717c.mo27932a();
        HashMap hashMap = new HashMap();
        hashMap.put("t", "CwsSessionHb");
        hashMap.put("evs", a);
        hashMap.put("cid", this.f25720f.f25550a);
        String str = "clid";
        if (C10854b.m34210b()) {
            hashMap.put(str, C10854b.m34206a());
        } else {
            hashMap.put(str, this.f25721g.mo27978a("clientId"));
        }
        hashMap.put("sid", Integer.valueOf(this.f25716b));
        hashMap.put("seq", Integer.valueOf(this.f25732r));
        hashMap.put("pver", C10852a.f25646a);
        hashMap.put("clv", this.f25735u);
        hashMap.put("iid", Integer.valueOf(this.f25719e.mo27823a()));
        hashMap.put("sdk", valueOf);
        if (C10868a.AD.equals(this.f25736v)) {
            hashMap.put("ad", valueOf);
        }
        try {
            Map a2 = this.f25723i.mo27925a(this.f25729o.mo28000a());
            if (a2 != null) {
                hashMap.put("pm", a2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        C10858e eVar = this.f25718d;
        String str2 = "sf";
        if (eVar != null) {
            eVar.mo27947b((Map<String, Object>) hashMap);
        } else {
            hashMap.put(str2, Integer.valueOf(0));
        }
        if (this.f25738x) {
            hashMap.put(str2, Integer.valueOf(71));
        }
        if (((Boolean) this.f25721g.mo27978a("sendLogs")).booleanValue()) {
            hashMap.put("lg", this.f25722h.mo27869m());
        }
        this.f25714A = this.f25724j.mo28003a();
        hashMap.put("st", Integer.valueOf((int) (this.f25714A - this.f25731q)));
        hashMap.put("sst", Double.valueOf(this.f25731q));
        hashMap.put("caps", Integer.valueOf(0));
        this.f25732r++;
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m34265m() {
        boolean z;
        if (!this.f25734t) {
            if (this.f25717c.mo27934b() > 0) {
                z = true;
            } else if (this.f25718d != null) {
                z = false;
            } else {
                return;
            }
            if ((z || (!this.f25730p.mo27895b() && this.f25730p.isVisible())) && !this.f25730p.mo27894a()) {
                C10858e eVar = this.f25718d;
                if (eVar != null) {
                    eVar.mo27949d();
                }
                Map l = m34264l();
                if (l != null) {
                    ArrayList arrayList = null;
                    ArrayList<HashMap<String, Object>> arrayList2 = this.f25739y;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        arrayList = new ArrayList();
                        Iterator it = this.f25739y.iterator();
                        while (it.hasNext()) {
                            arrayList.add((HashMap) ((HashMap) it.next()).clone());
                        }
                        for (int i = 0; i < arrayList.size(); i++) {
                            if (C10852a.f25651f.equals(((HashMap) arrayList.get(i)).get("err"))) {
                                ((HashMap) arrayList.get(i)).put("rtt", Integer.valueOf(-1));
                            }
                        }
                        l.put("hbinfos", arrayList);
                    }
                    m34260a(l);
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                }
                m34262j();
                return;
            }
            this.f25727m.mo27993d("Do not send out heartbeat: player is sleeping or not visible");
        }
    }

    /* renamed from: n */
    private void m34266n() {
        C10812d dVar = this.f25715a;
        if (dVar != null) {
            if (!C10879h.m34318a(dVar.f25553a)) {
                this.f25727m.mo27995f("Missing assetName during session creation");
            }
            if (!C10879h.m34318a(this.f25715a.f25556d)) {
                this.f25727m.mo27995f("Missing resource during session creation");
            }
            if (!C10879h.m34318a(this.f25715a.f25559g)) {
                this.f25727m.mo27995f("Missing streamUrl during session creation");
            }
            if (this.f25715a.f25563k <= 0) {
                this.f25727m.mo27995f("Missing encodedFrameRate during session creation");
            }
            if (!C10879h.m34318a(this.f25715a.f25557e)) {
                this.f25727m.mo27995f("Missing viewerId during session creation");
            }
            C10813a aVar = this.f25715a.f25561i;
            if (aVar == null || C10813a.UNKNOWN.equals(aVar)) {
                this.f25727m.mo27995f("Missing streamType during session creation");
            }
            if (!C10879h.m34318a(this.f25715a.f25558f)) {
                this.f25727m.mo27995f("Missing applicationName during session creation");
            }
            if (this.f25715a.f25562j <= 0) {
                this.f25727m.mo27995f("Missing duration during session creation");
            }
        }
    }

    /* renamed from: c */
    public void mo27962c() {
        this.f25734t = true;
        if (!mo27965f()) {
            this.f25718d.mo27946b();
            this.f25718d = null;
        }
        if (this.f25717c != null) {
            this.f25717c = null;
        }
        ArrayList<HashMap<String, Object>> arrayList = this.f25739y;
        if (arrayList != null) {
            arrayList.clear();
            this.f25739y = null;
        }
        this.f25715a = null;
        this.f25720f = null;
        this.f25722h = null;
        this.f25724j = null;
        this.f25738x = false;
        this.f25725k = null;
        this.f25726l = null;
        this.f25727m = null;
    }

    /* renamed from: d */
    public void mo27963d() {
        this.f25727m.mo27993d("cws.sendSessionEndEvent()");
        String str = "CwsSessionEndEvent";
        this.f25717c.mo27933a(str, new HashMap(), mo27964e());
    }

    /* renamed from: e */
    public int mo27964e() {
        return (int) (this.f25724j.mo28003a() - this.f25731q);
    }

    /* renamed from: f */
    public boolean mo27965f() {
        return this.f25718d == null;
    }

    /* renamed from: g */
    public boolean mo27966g() {
        return C10868a.VIDEO.equals(this.f25736v);
    }

    /* renamed from: h */
    public String mo27967h() {
        return mo27965f() ? "(global session)" : "";
    }

    /* renamed from: i */
    public void mo27968i() {
        if (mo27966g()) {
            C10812d dVar = this.f25715a;
            if (!(dVar == null || dVar.f25553a == null)) {
                C10880i iVar = this.f25727m;
                StringBuilder sb = new StringBuilder();
                sb.append("Session.start(): assetName=");
                sb.append(this.f25715a.f25553a);
                iVar.mo27993d(sb.toString());
            }
            m34266n();
        }
        this.f25731q = this.f25724j.mo28003a();
        if (!mo27965f()) {
            this.f25718d.mo27942a(this.f25731q);
            this.f25718d.mo27951f();
        }
        this.f25732r = 0;
        if (this.f25721g.mo27981a()) {
            m34265m();
            m34263k();
            return;
        }
        this.f25721g.mo27979a((C10869a) new C10865b());
    }

    /* renamed from: b */
    public void mo27961b() {
        C10880i iVar = this.f25727m;
        StringBuilder sb = new StringBuilder();
        sb.append("Session.cleanup()");
        sb.append(mo27967h());
        iVar.mo27993d(sb.toString());
        C10828b bVar = this.f25733s;
        if (bVar != null) {
            bVar.cancel();
            this.f25733s = null;
        }
        C10880i iVar2 = this.f25727m;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Schedule the last hb before session cleanup");
        sb2.append(mo27967h());
        iVar2.mo27992c(sb2.toString());
        if (!mo27965f()) {
            mo27963d();
        }
        m34265m();
        mo27962c();
    }

    /* renamed from: a */
    public void mo27958a(C10801k kVar, C10799i iVar, C10800j jVar) {
        this.f25718d.mo27943a(kVar, iVar, jVar);
    }

    /* renamed from: a */
    public void mo27957a() {
        this.f25718d.mo27941a();
    }

    /* renamed from: a */
    public void mo27959a(C10821c cVar) throws C10815f {
        this.f25718d.mo27944a(cVar);
    }

    /* renamed from: a */
    public void mo27960a(String str, C10810m mVar) {
        C10880i iVar = this.f25727m;
        StringBuilder sb = new StringBuilder();
        sb.append("reportError(): ");
        sb.append(str);
        iVar.mo27993d(sb.toString());
        this.f25718d.mo27936a(new C10837a(str, mVar));
    }

    /* renamed from: a */
    private void m34260a(Map<String, Object> map) {
        String a = this.f25726l.mo27921a(map);
        if (a != null) {
            try {
                if (C10844e.m34186g().booleanValue() || !this.f25738x) {
                    m34258a(a);
                    return;
                }
                this.f25727m.mo27992c("Adding HBs to offline db");
                this.f25737w.mo27927a(a);
            } catch (Exception e) {
                C10880i iVar = this.f25727m;
                StringBuilder sb = new StringBuilder();
                sb.append("JSON post error: ");
                sb.append(e.toString());
                iVar.mo27988a(sb.toString());
            }
        }
    }

    /* renamed from: a */
    private void m34258a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f25720f.f25552c);
        sb.append(C10852a.f25647b);
        String sb2 = sb.toString();
        C10880i iVar = this.f25727m;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Send HB[");
        sb3.append(this.f25732r - 1);
        sb3.append("]");
        sb3.append(mo27967h());
        iVar.mo27993d(sb3.toString());
        String str2 = "POST";
        String str3 = str;
        this.f25728n.mo27987a(str2, sb2, str3, DefaultLegalApi.MIME_TYPE_JSON, new C10864a());
    }

    /* renamed from: a */
    private void m34259a(String str, String str2, double d) {
        String str3;
        int i;
        if (this.f25739y != null) {
            int intValue = Integer.valueOf(str).intValue();
            while (true) {
                str3 = "seq";
                i = 0;
                if (this.f25739y.size() > 0 && ((Integer) ((HashMap) this.f25739y.get(0)).get(str3)).intValue() < intValue) {
                    this.f25739y.remove(0);
                }
            }
            while (i < this.f25739y.size()) {
                if (((Integer) ((HashMap) this.f25739y.get(i)).get(str3)).intValue() == intValue) {
                    ((HashMap) this.f25739y.get(i)).put(str3, Integer.valueOf(intValue));
                    ((HashMap) this.f25739y.get(i)).put("err", str2);
                    boolean equals = C10852a.f25651f.equals(str2);
                    String str4 = "rtt";
                    if (equals) {
                        ((HashMap) this.f25739y.get(i)).put(str4, Integer.valueOf(-1));
                        return;
                    } else {
                        ((HashMap) this.f25739y.get(i)).put(str4, Integer.valueOf((int) (d - ((Double) ((HashMap) this.f25739y.get(i)).get(str4)).doubleValue())));
                        return;
                    }
                } else {
                    i++;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m34257a(Boolean bool, String str) {
        String str2;
        if (!this.f25734t) {
            C10887n nVar = this.f25724j;
            double a = nVar != null ? nVar.mo28003a() : 0.0d;
            if (!bool.booleanValue()) {
                C10880i iVar = this.f25727m;
                if (iVar != null) {
                    iVar.mo27988a("received no response (or a bad response) to heartbeat POST request.");
                    return;
                }
            }
            Map a2 = this.f25726l.mo27922a(str);
            if (a2 == null) {
                this.f25727m.mo27995f("JSON: Received null decoded response");
                return;
            }
            String str3 = "seq";
            String valueOf = a2.containsKey(str3) ? String.valueOf(a2.get(str3)) : "-1";
            String str4 = "err";
            if (a2.containsKey(str4)) {
                str2 = String.valueOf(a2.get(str4));
                if (!C10852a.f25649d.equals(str2)) {
                    C10880i iVar2 = this.f25727m;
                    StringBuilder sb = new StringBuilder();
                    sb.append("onHeartbeatResponse(): error posting heartbeat: ");
                    sb.append(str2);
                    iVar2.mo27988a(sb.toString());
                }
            } else {
                str2 = null;
            }
            C10880i iVar3 = this.f25727m;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onHeartbeatResponse(): received valid response for HB[");
            sb2.append(valueOf);
            sb2.append("]");
            iVar3.mo27992c(sb2.toString());
            String str5 = "clid";
            if (a2.containsKey(str5)) {
                String valueOf2 = String.valueOf(a2.get(str5));
                String str6 = "clientId";
                if (!valueOf2.equals(this.f25721g.mo27978a(str6))) {
                    C10880i iVar4 = this.f25727m;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("onHeartbeatResponse(): setting the client id to ");
                    sb3.append(valueOf2);
                    sb3.append(" (from server)");
                    iVar4.mo27992c(sb3.toString());
                    this.f25721g.mo27980a(str6, (Object) valueOf2);
                    this.f25721g.mo27985d();
                }
            }
            String str7 = "cfg";
            if (a2.containsKey(str7)) {
                Map map = (Map) a2.get(str7);
                if (map != null) {
                    String str8 = "slg";
                    boolean z = map.containsKey(str8) && ((Boolean) map.get(str8)).booleanValue();
                    String str9 = "sendLogs";
                    if (z != ((Boolean) this.f25721g.mo27978a(str9)).booleanValue()) {
                        C10880i iVar5 = this.f25727m;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Turning ");
                        sb4.append(z ? "on" : "off");
                        sb4.append(" sending of logs");
                        iVar5.mo27993d(sb4.toString());
                        this.f25721g.mo27980a(str9, (Object) Boolean.valueOf(z));
                    }
                    String str10 = "hbi";
                    if (map.containsKey(str10)) {
                        long longValue = ((Long) map.get(str10)).longValue();
                        if (((long) this.f25720f.f25551b) != longValue) {
                            C10880i iVar6 = this.f25727m;
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Received hbIntervalMs from server ");
                            sb5.append(longValue);
                            iVar6.mo27993d(sb5.toString());
                            this.f25720f.f25551b = (int) longValue;
                            m34263k();
                        }
                    }
                    String str11 = "gw";
                    if (map.containsKey(str11)) {
                        String valueOf3 = String.valueOf(map.get(str11));
                        if (!this.f25720f.f25552c.equals(valueOf3)) {
                            C10880i iVar7 = this.f25727m;
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("Received gatewayUrl from server ");
                            sb6.append(valueOf3);
                            iVar7.mo27993d(sb6.toString());
                            this.f25720f.f25552c = valueOf3;
                        }
                    }
                    String str12 = "maxhbinfos";
                    if (map.containsKey(str12)) {
                        this.f25740z = ((Integer) map.get(str12)).intValue();
                    }
                } else {
                    return;
                }
            }
            m34259a(valueOf, str2, a);
        }
    }
}
