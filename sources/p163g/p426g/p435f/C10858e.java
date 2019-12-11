package p163g.p426g.p435f;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import p163g.p426g.p427a.C10790b.C10799i;
import p163g.p426g.p427a.C10790b.C10800j;
import p163g.p426g.p427a.C10790b.C10801k;
import p163g.p426g.p427a.C10790b.C10810m;
import p163g.p426g.p427a.C10812d;
import p163g.p426g.p427a.C10812d.C10813a;
import p163g.p426g.p427a.C10815f;
import p163g.p426g.p427a.C10816g;
import p163g.p426g.p427a.p428i.C10821c;
import p163g.p426g.p427a.p429j.C10829c;
import p163g.p426g.p430b.C10837a;
import p163g.p426g.p432d.p433a.C10844e;
import p163g.p426g.p434e.C10852a;
import p163g.p426g.p436g.C10875d;
import p163g.p426g.p436g.C10879h;
import p163g.p426g.p436g.C10880i;
import p163g.p426g.p436g.C10887n;

/* renamed from: g.g.f.e */
/* compiled from: Monitor */
public class C10858e implements C10857d {

    /* renamed from: A */
    private C10829c f25667A;

    /* renamed from: B */
    private final Object f25668B;

    /* renamed from: C */
    private final Object f25669C;

    /* renamed from: D */
    private boolean f25670D;

    /* renamed from: E */
    private boolean f25671E;

    /* renamed from: F */
    private String f25672F;

    /* renamed from: G */
    private String f25673G;

    /* renamed from: H */
    private int f25674H;

    /* renamed from: I */
    private long f25675I;

    /* renamed from: a */
    private C10880i f25676a;

    /* renamed from: b */
    private int f25677b = 0;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C10821c f25678c = null;

    /* renamed from: d */
    private C10856c f25679d = null;

    /* renamed from: e */
    private C10812d f25680e = null;

    /* renamed from: f */
    private C10816g f25681f = null;

    /* renamed from: g */
    private C10875d f25682g = null;

    /* renamed from: h */
    private C10887n f25683h = null;

    /* renamed from: i */
    private double f25684i = 0.0d;

    /* renamed from: j */
    private boolean f25685j = false;

    /* renamed from: k */
    private boolean f25686k = false;

    /* renamed from: l */
    private boolean f25687l = false;

    /* renamed from: m */
    private boolean f25688m = false;

    /* renamed from: n */
    private C10862d f25689n;

    /* renamed from: o */
    private boolean f25690o;

    /* renamed from: p */
    private boolean f25691p;

    /* renamed from: q */
    private boolean f25692q;

    /* renamed from: r */
    private boolean f25693r;

    /* renamed from: s */
    private C10801k f25694s;

    /* renamed from: t */
    private C10799i f25695t;

    /* renamed from: u */
    private C10862d f25696u;

    /* renamed from: v */
    private int f25697v;

    /* renamed from: w */
    private int f25698w;

    /* renamed from: x */
    private int f25699x;

    /* renamed from: y */
    private int f25700y;

    /* renamed from: z */
    private String f25701z;

    /* renamed from: g.g.f.e$a */
    /* compiled from: Monitor */
    class C10859a implements Callable<Void> {
        C10859a() {
        }

        public Void call() throws Exception {
            C10858e.this.f25678c.mo27888j();
            C10858e.this.mo27937a(C10862d.NOT_MONITORED);
            C10858e.this.f25678c = null;
            return null;
        }
    }

    /* renamed from: g.g.f.e$b */
    /* compiled from: Monitor */
    class C10860b implements Callable<Void> {

        /* renamed from: c */
        String f25704c = null;

        C10860b() {
        }

        /* renamed from: a */
        public String mo27953a() {
            return this.f25704c;
        }

        public Void call() throws Exception {
            this.f25704c = C10858e.this.f25678c.mo27886h();
            return null;
        }
    }

    /* renamed from: g.g.f.e$c */
    /* compiled from: Monitor */
    class C10861c implements Callable<Void> {

        /* renamed from: c */
        String f25706c = null;

        C10861c() {
        }

        /* renamed from: a */
        public String mo27955a() {
            return this.f25706c;
        }

        public Void call() throws Exception {
            this.f25706c = C10858e.this.f25678c.mo27887i();
            return null;
        }
    }

    /* renamed from: g.g.f.e$d */
    /* compiled from: Monitor */
    public enum C10862d {
        STOPPED,
        PLAYING,
        BUFFERING,
        PAUSED,
        UNKNOWN,
        NOT_MONITORED
    }

    public C10858e(int i, C10856c cVar, C10812d dVar, C10816g gVar) {
        C10862d dVar2 = C10862d.NOT_MONITORED;
        this.f25689n = dVar2;
        this.f25690o = false;
        this.f25691p = false;
        this.f25692q = false;
        this.f25693r = false;
        this.f25694s = null;
        this.f25695t = null;
        this.f25696u = dVar2;
        this.f25697v = -1;
        this.f25698w = 7;
        this.f25699x = -1;
        this.f25700y = -1;
        this.f25701z = null;
        this.f25668B = new Object();
        this.f25669C = new Object();
        this.f25670D = true;
        this.f25671E = true;
        this.f25672F = null;
        this.f25673G = null;
        this.f25674H = 0;
        this.f25675I = 0;
        this.f25677b = i;
        this.f25679d = cVar;
        this.f25680e = dVar;
        this.f25681f = gVar;
        this.f25676a = this.f25681f.mo27862f();
        this.f25676a.mo27989b("Monitor");
        this.f25676a.mo27990a(this.f25677b);
        this.f25682g = this.f25681f.mo27858b();
        this.f25683h = this.f25681f.mo27867k();
        this.f25681f.mo27868l();
        this.f25667A = this.f25681f.mo27859c();
        if (this.f25680e.f25562j > 0) {
            this.f25670D = false;
        }
        if (this.f25680e.f25563k > 0) {
            this.f25671E = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        return -1;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m34235g() {
        /*
            r8 = this;
            long r0 = r8.f25675I
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x000f
            int r4 = r8.f25674H
            if (r4 <= 0) goto L_0x000f
            int r1 = (int) r0
            int r1 = r1 / r4
            return r1
        L_0x000f:
            java.lang.Object r0 = r8.f25668B
            monitor-enter(r0)
            g.g.a.i.c r1 = r8.f25678c     // Catch:{ all -> 0x004f }
            if (r1 == 0) goto L_0x004c
            g.g.f.e$d r1 = r8.f25696u     // Catch:{ all -> 0x004f }
            g.g.f.e$d r4 = p163g.p426g.p435f.C10858e.C10862d.PLAYING     // Catch:{ all -> 0x004f }
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x004f }
            if (r1 == 0) goto L_0x004c
            g.g.a.i.c r1 = r8.f25678c     // Catch:{ all -> 0x004f }
            int r1 = r1.mo27884f()     // Catch:{ all -> 0x004f }
            if (r1 <= 0) goto L_0x003a
            long r4 = r8.f25675I     // Catch:{ all -> 0x004f }
            g.g.a.i.c r1 = r8.f25678c     // Catch:{ all -> 0x004f }
            int r1 = r1.mo27884f()     // Catch:{ all -> 0x004f }
            long r6 = (long) r1     // Catch:{ all -> 0x004f }
            long r4 = r4 + r6
            r8.f25675I = r4     // Catch:{ all -> 0x004f }
            int r1 = r8.f25674H     // Catch:{ all -> 0x004f }
            int r1 = r1 + 1
            r8.f25674H = r1     // Catch:{ all -> 0x004f }
        L_0x003a:
            long r4 = r8.f25675I     // Catch:{ all -> 0x004f }
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x004c
            int r1 = r8.f25674H     // Catch:{ all -> 0x004f }
            if (r1 <= 0) goto L_0x004c
            long r1 = r8.f25675I     // Catch:{ all -> 0x004f }
            int r2 = (int) r1     // Catch:{ all -> 0x004f }
            int r1 = r8.f25674H     // Catch:{ all -> 0x004f }
            int r2 = r2 / r1
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            return r2
        L_0x004c:
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            r0 = -1
            return r0
        L_0x004f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p426g.p435f.C10858e.m34235g():int");
    }

    /* renamed from: b */
    public void mo27939b(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("act", "pss");
        hashMap.put("skto", Integer.valueOf(i));
        m34228a("CwsSeekEvent", (Map<String, Object>) hashMap);
    }

    /* renamed from: c */
    public void mo27948c() throws C10815f {
        this.f25676a.mo27993d("detachPlayer()");
        synchronized (this.f25668B) {
            if (this.f25678c != null) {
                this.f25682g.mo27986a((Callable<V>) new C10859a<V>(), "detachPlayer");
            }
        }
    }

    /* renamed from: d */
    public void mo27949d() {
        String a = C10844e.m34178a();
        if (a != null && !a.equals(this.f25672F)) {
            m34227a(this.f25672F, a);
            this.f25672F = a;
        }
        String b = C10844e.m34181b();
        if (b != null && !b.equals(this.f25673G)) {
            m34232b(this.f25673G, b);
            this.f25673G = b;
        }
    }

    /* renamed from: e */
    public int mo27950e() {
        return (int) (this.f25683h.mo28003a() - this.f25684i);
    }

    /* renamed from: f */
    public void mo27951f() {
        C10812d dVar = this.f25680e;
        if (dVar != null) {
            int i = dVar.f25555c;
            if (i > 0 && this.f25697v < 0) {
                mo27935a(i);
            }
            String str = this.f25680e.f25556d;
            if (str != null) {
                m34225a(str);
            }
        }
    }

    /* renamed from: a */
    public void mo27942a(double d) {
        this.f25676a.mo27993d("monitor starts");
        this.f25684i = d;
        HashMap hashMap = new HashMap();
        String str = this.f25680e.f25553a;
        if (str != null) {
            hashMap.put("an", str);
        }
        if (C10879h.m34318a(this.f25680e.f25557e)) {
            hashMap.put("vid", this.f25680e.f25557e);
        }
        if (C10879h.m34318a(this.f25680e.f25558f)) {
            hashMap.put("pn", this.f25680e.f25558f);
        }
        if (C10879h.m34318a(this.f25680e.f25556d)) {
            hashMap.put("rs", this.f25680e.f25556d);
        }
        if (C10879h.m34318a(this.f25680e.f25559g)) {
            hashMap.put("url", this.f25680e.f25559g);
        }
        C10813a aVar = this.f25680e.f25561i;
        if (aVar != null && !C10813a.UNKNOWN.equals(aVar)) {
            hashMap.put("lv", Boolean.valueOf(this.f25680e.f25561i.equals(C10813a.LIVE)));
        }
        Map<String, String> map = this.f25680e.f25554b;
        if (map != null && !map.isEmpty()) {
            hashMap.put("tags", this.f25680e.f25554b);
        }
        int i = this.f25680e.f25562j;
        if (i > 0) {
            hashMap.put("cl", Integer.valueOf(i));
        }
        int i2 = this.f25680e.f25563k;
        if (i2 > 0) {
            hashMap.put("efps", Integer.valueOf(i2));
        }
        m34229a(null, (Map<String, Object>) hashMap);
    }

    /* renamed from: b */
    public void mo27947b(Map<String, Object> map) {
        map.put("ps", Integer.valueOf(C10852a.m34198a(this.f25696u)));
        map.put("pj", Boolean.valueOf(this.f25686k));
        map.put("sf", Integer.valueOf(this.f25698w));
        synchronized (this.f25668B) {
            if (this.f25678c != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("ss", Integer.valueOf(C10844e.m34183d()));
                mo27945a(hashMap);
                if (this.f25678c.mo27878b() >= -1) {
                    map.put("bl", Integer.valueOf(this.f25678c.mo27878b()));
                }
                if (this.f25678c.mo27883e() >= -1) {
                    map.put("pht", Long.valueOf(this.f25678c.mo27883e()));
                }
                map.put("ss", Integer.valueOf(C10844e.m34183d()));
                String c = this.f25678c.mo27881c();
                String d = this.f25678c.mo27882d();
                HashMap hashMap2 = new HashMap();
                if (c != null) {
                    hashMap2.put("mn", c);
                }
                if (d != null) {
                    hashMap2.put("mv", d);
                }
                if (hashMap2.size() > 0) {
                    map.put("cc", hashMap2);
                }
                Map map2 = (Map) map.get("pm");
                boolean z = false;
                if (map2 != null) {
                    if (map2.get("fw") == null) {
                        C10860b bVar = new C10860b();
                        try {
                            this.f25682g.mo27986a((Callable<V>) bVar, "updateHeartbeat.getPlayerType");
                        } catch (Exception e) {
                            C10880i iVar = this.f25676a;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Exception in updateHeartbeat.getPlayerType: ");
                            sb.append(e.toString());
                            iVar.mo27988a(sb.toString());
                            e.printStackTrace();
                        }
                        if (bVar.mo27953a() != null) {
                            map2.put("fw", bVar.mo27953a());
                            z = true;
                        }
                    }
                    if (map2.get("fwv") == null) {
                        C10861c cVar = new C10861c();
                        try {
                            this.f25682g.mo27986a((Callable<V>) cVar, "updateHeartbeat.getPlayerVersion");
                        } catch (Exception e2) {
                            C10880i iVar2 = this.f25676a;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Exception in updateHeartbeat.getPlayerVersion: ");
                            sb2.append(e2.toString());
                            iVar2.mo27988a(sb2.toString());
                            e2.printStackTrace();
                        }
                        if (cVar.mo27955a() != null) {
                            map2.put("fwv", cVar.mo27955a());
                            z = true;
                        }
                    }
                    if (z) {
                        map.put("pm", map2);
                    }
                }
            } else {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("ss", Integer.valueOf(C10844e.m34183d()));
                mo27945a(hashMap3);
                map.put("bl", Integer.valueOf(-1));
                map.put("pht", Integer.valueOf(-1));
            }
        }
        int g = m34235g();
        if (g >= 0) {
            map.put("afps", Integer.valueOf(g));
        }
        int i = this.f25674H;
        if (i > 0 && this.f25675I > 0) {
            map.put("rfpscnt", Integer.valueOf(i));
            map.put("rfpstot", Long.valueOf(this.f25675I));
        }
        synchronized (this.f25669C) {
            HashMap hashMap4 = new HashMap();
            if (this.f25680e != null) {
                for (String str : this.f25680e.f25554b.keySet()) {
                    String str2 = (String) this.f25680e.f25554b.get(str);
                    if (!(str == null || str2 == null || str2.length() == 0)) {
                        hashMap4.put(str, str2);
                    }
                }
            }
            if (hashMap4.size() != 0) {
                map.put("tags", hashMap4);
            }
        }
        C10812d dVar = this.f25680e;
        if (dVar != null) {
            String str3 = dVar.f25557e;
            if (str3 != null) {
                map.put("vid", str3);
            }
        }
        C10812d dVar2 = this.f25680e;
        if (dVar2 != null) {
            map.put("an", dVar2.f25553a);
        }
        C10812d dVar3 = this.f25680e;
        if (dVar3 != null && !C10813a.UNKNOWN.equals(dVar3.f25561i)) {
            map.put("lv", Boolean.valueOf(C10813a.LIVE.equals(this.f25680e.f25561i)));
        }
        C10812d dVar4 = this.f25680e;
        if (dVar4 != null) {
            String str4 = dVar4.f25558f;
            if (str4 != null) {
                map.put("pn", str4);
            }
        }
        C10812d dVar5 = this.f25680e;
        if (dVar5 != null) {
            String str5 = dVar5.f25559g;
            if (str5 != null) {
                map.put("url", str5);
            }
        }
        C10812d dVar6 = this.f25680e;
        if (dVar6 != null) {
            String str6 = dVar6.f25556d;
            if (str6 != null) {
                map.put("rs", str6);
            }
        }
        C10812d dVar7 = this.f25680e;
        if (dVar7 != null) {
            int i2 = dVar7.f25562j;
            if (i2 > 0) {
                map.put("cl", Integer.valueOf(i2));
            }
        }
        C10812d dVar8 = this.f25680e;
        if (dVar8 != null) {
            int i3 = dVar8.f25563k;
            if (i3 > 0) {
                map.put("efps", Integer.valueOf(i3));
            }
        }
        int i4 = this.f25697v;
        if (i4 > 0) {
            map.put("br", Integer.valueOf(i4));
        }
        String str7 = this.f25701z;
        if (str7 != null) {
            map.put("csi", str7);
        }
        int i5 = this.f25699x;
        if (i5 >= 0 && this.f25700y >= 0) {
            map.put("w", Integer.valueOf(i5));
            map.put("h", Integer.valueOf(this.f25700y));
        }
        String str8 = this.f25672F;
        if (str8 != null) {
            map.put("ct", str8);
        }
        String str9 = this.f25673G;
        if (str9 != null) {
            map.put("le", str9);
        }
    }

    /* renamed from: c */
    private void m34234c(String str, String str2) {
        m34226a("rs", (Object) str, (Object) str2);
    }

    /* renamed from: c */
    private void m34233c(int i, int i2) {
        m34226a("efps", (Object) i > 0 ? Integer.valueOf(i) : null, (Object) Integer.valueOf(i2));
    }

    /* renamed from: a */
    public void mo27935a(int i) {
        this.f25676a.mo27992c("setBitrateKbps()");
        if (this.f25690o) {
            this.f25676a.mo27993d("setBitrateKbps(): ignored");
            return;
        }
        int i2 = this.f25697v;
        if (i2 != i && i >= -1) {
            C10880i iVar = this.f25676a;
            StringBuilder sb = new StringBuilder();
            sb.append("Change bitrate from ");
            sb.append(i2);
            sb.append(" to ");
            sb.append(i);
            iVar.mo27993d(sb.toString());
            m34224a(i2, i);
            this.f25697v = i;
        }
    }

    /* renamed from: a */
    private void m34225a(String str) {
        this.f25676a.mo27992c("setResource()");
        if (this.f25690o) {
            this.f25676a.mo27993d("setResource(): ignored");
            return;
        }
        if (str != null && !str.equals(this.f25680e.f25556d)) {
            C10880i iVar = this.f25676a;
            StringBuilder sb = new StringBuilder();
            sb.append("Change resource from ");
            sb.append(this.f25680e.f25556d);
            sb.append(" to ");
            sb.append(str);
            iVar.mo27993d(sb.toString());
            m34234c(this.f25680e.f25556d, str);
            this.f25680e.f25556d = str;
        }
    }

    /* renamed from: a */
    public void mo27944a(C10821c cVar) {
        this.f25676a.mo27993d("attachPlayer()");
        if (this.f25678c != null) {
            this.f25676a.mo27988a("Monitor.attachPlayer(): detach current PlayerStateManager first");
            return;
        }
        if (cVar.mo27877a((C10857d) this, this.f25677b)) {
            this.f25678c = cVar;
        } else {
            this.f25676a.mo27988a("attachPlayer(): instance of PlayerStateManager is already attached to a session");
        }
    }

    /* renamed from: a */
    public void mo27943a(C10801k kVar, C10799i iVar, C10800j jVar) {
        C10880i iVar2 = this.f25676a;
        StringBuilder sb = new StringBuilder();
        sb.append("adStart(): adStream= ");
        sb.append(kVar);
        sb.append(" adPlayer= ");
        sb.append(iVar);
        sb.append(" adPosition= ");
        sb.append(jVar);
        iVar2.mo27992c(sb.toString());
        if (this.f25693r) {
            this.f25676a.mo27995f("adStart(): Multiple adStart calls, ignoring");
            return;
        }
        this.f25693r = true;
        this.f25694s = kVar;
        this.f25695t = iVar;
        if (!this.f25685j) {
            m34230a(true);
        }
        C10801k kVar2 = this.f25694s;
        if (kVar2 != C10801k.CONTENT) {
            C10799i iVar3 = this.f25695t;
            if (iVar3 != C10799i.SEPARATE) {
                if (kVar2 == C10801k.SEPARATE && iVar3 == C10799i.CONTENT) {
                    if (!this.f25696u.equals(C10862d.NOT_MONITORED)) {
                        this.f25689n = this.f25696u;
                    }
                    mo27937a(C10862d.NOT_MONITORED);
                    this.f25688m = true;
                    this.f25690o = true;
                    this.f25691p = true;
                    this.f25692q = true;
                }
            }
        }
        if (!this.f25696u.equals(C10862d.NOT_MONITORED)) {
            this.f25689n = this.f25696u;
        }
        mo27937a(C10862d.NOT_MONITORED);
        this.f25688m = true;
    }

    /* renamed from: a */
    public void mo27941a() {
        this.f25676a.mo27993d("adEnd()");
        if (!this.f25693r) {
            this.f25676a.mo27993d("adEnd(): called before adStart, ignoring");
            return;
        }
        if (!this.f25685j) {
            m34230a(false);
        }
        C10801k kVar = this.f25694s;
        if (kVar != C10801k.CONTENT) {
            C10799i iVar = this.f25695t;
            if (iVar != C10799i.SEPARATE) {
                if (kVar == C10801k.SEPARATE && iVar == C10799i.CONTENT) {
                    this.f25690o = false;
                    this.f25691p = false;
                    this.f25692q = false;
                    if (!this.f25687l) {
                        this.f25688m = false;
                        mo27937a(this.f25689n);
                    }
                }
                this.f25693r = false;
                this.f25694s = null;
                this.f25695t = null;
            }
        }
        if (!this.f25687l) {
            this.f25688m = false;
            mo27937a(this.f25689n);
        }
        this.f25693r = false;
        this.f25694s = null;
        this.f25695t = null;
    }

    /* renamed from: a */
    private void m34230a(boolean z) {
        this.f25676a.mo27993d("TogglePauseJoin()");
        boolean z2 = this.f25686k;
        if (z2 == z) {
            this.f25676a.mo27993d("TogglePauseJoin(): same value ignoring");
            return;
        }
        m34226a("pj", (Object) Boolean.valueOf(z2), (Object) Boolean.valueOf(z));
        this.f25686k = z;
    }

    /* renamed from: a */
    public void mo27937a(C10862d dVar) {
        if (!this.f25696u.equals(dVar)) {
            if (this.f25696u.equals(C10862d.NOT_MONITORED) && !dVar.equals(C10862d.NOT_MONITORED)) {
                this.f25689n = dVar;
            }
            String str = "OnPlayerStateChange(): ";
            if (this.f25688m) {
                C10880i iVar = this.f25676a;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(dVar);
                sb.append(" (pooled, ");
                sb.append(this.f25693r ? "ad playing" : "preloading");
                sb.append(")");
                iVar.mo27992c(sb.toString());
                return;
            }
            C10880i iVar2 = this.f25676a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(dVar);
            iVar2.mo27992c(sb2.toString());
            if (!this.f25685j && dVar.equals(C10862d.PLAYING)) {
                this.f25685j = true;
                m34230a(false);
                if (this.f25680e.f25557e == null) {
                    this.f25676a.mo27988a("Missing viewerId. viewerId should be updated before first frame is rendered.");
                }
                C10813a aVar = this.f25680e.f25561i;
                if (aVar == null || C10813a.UNKNOWN.equals(aVar)) {
                    this.f25676a.mo27988a("Missing streamType - Live or VOD. streamType should be updated before first frame is rendered.");
                }
                if (this.f25680e.f25558f == null) {
                    this.f25676a.mo27988a("Missing applicationName. applicationName should be updated before first frame is rendered.");
                }
            }
            m34226a("ps", (Object) Integer.valueOf(C10852a.m34198a(this.f25696u)), (Object) Integer.valueOf(C10852a.m34198a(dVar)));
            C10880i iVar3 = this.f25676a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("SetPlayerState(): changing player state from ");
            sb3.append(this.f25696u);
            sb3.append(" to ");
            sb3.append(dVar);
            iVar3.mo27993d(sb3.toString());
            this.f25696u = dVar;
        }
    }

    /* renamed from: b */
    public void mo27946b() {
        this.f25676a.mo27993d("cleanup()");
        synchronized (this.f25668B) {
            if (this.f25678c != null) {
                try {
                    mo27948c();
                } catch (Exception e) {
                    C10880i iVar = this.f25676a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Exception in cleanup: ");
                    sb.append(e.toString());
                    iVar.mo27988a(sb.toString());
                    e.printStackTrace();
                }
            }
        }
        this.f25679d = null;
        this.f25680e = null;
        this.f25676a = null;
    }

    /* renamed from: b */
    private void m34232b(String str, String str2) {
        m34226a("le", (Object) str, (Object) str2);
    }

    /* renamed from: b */
    private void m34231b(int i, int i2) {
        m34226a("cl", (Object) i > 0 ? Integer.valueOf(i) : null, (Object) Integer.valueOf(i2));
    }

    /* renamed from: a */
    public void mo27936a(C10837a aVar) {
        if (aVar.mo27919a() == null || aVar.mo27919a().isEmpty()) {
            C10880i iVar = this.f25676a;
            StringBuilder sb = new StringBuilder();
            sb.append("OnError(): invalid error message string: ");
            sb.append(aVar.mo27919a());
            iVar.mo27988a(sb.toString());
        } else if (aVar.mo27920b() == null) {
            this.f25676a.mo27988a("OnError(): invalid error message severity");
        } else if (this.f25692q) {
            this.f25676a.mo27993d("monitor.onError(): ignored");
        } else {
            this.f25676a.mo27993d("Enqueue CwsErrorEvent");
            boolean z = aVar.mo27920b() == C10810m.FATAL;
            HashMap hashMap = new HashMap();
            hashMap.put("ft", Boolean.valueOf(z));
            hashMap.put("err", aVar.mo27919a().toString());
            m34228a("CwsErrorEvent", (Map<String, Object>) hashMap);
        }
    }

    /* renamed from: a */
    public int mo27940a(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i;
        }
    }

    /* renamed from: a */
    public void mo27938a(Map<String, String> map) {
        String str = "duration";
        String str2 = "framerate";
        try {
            if (map.containsKey(str2) && this.f25671E) {
                int a = mo27940a((String) map.get(str2), -1);
                if (a > 0 && !this.f25691p) {
                    if (a != this.f25680e.f25563k) {
                        m34233c(this.f25680e.f25563k, a);
                    }
                    this.f25680e.f25563k = a;
                }
            }
            if (map.containsKey(str) && this.f25670D) {
                int a2 = mo27940a((String) map.get(str), -1);
                if (a2 > 0 && !this.f25691p) {
                    if (a2 != this.f25680e.f25562j && a2 > 0) {
                        m34231b(this.f25680e.f25562j, a2);
                    }
                    this.f25680e.f25562j = a2;
                }
            }
        } catch (Exception e) {
            C10880i iVar = this.f25676a;
            StringBuilder sb = new StringBuilder();
            sb.append("monitor.OnMetadata() error: ");
            sb.append(e.toString());
            iVar.mo27988a(sb.toString());
        }
    }

    /* renamed from: a */
    public void mo27945a(HashMap<String, Object> hashMap) {
        C10829c cVar = this.f25667A;
        if (cVar == null || (!cVar.mo27895b() && !this.f25667A.mo27894a() && this.f25667A.isVisible())) {
            this.f25676a.mo27992c("enqueueDataSamplesEvent()");
            m34228a("CwsDataSamplesEvent", (Map<String, Object>) hashMap);
        }
    }

    /* renamed from: a */
    private void m34228a(String str, Map<String, Object> map) {
        if (this.f25679d != null) {
            synchronized (this.f25668B) {
                if (this.f25678c != null) {
                    if (this.f25678c.mo27878b() >= -1) {
                        map.put("bl", Integer.valueOf(this.f25678c.mo27878b()));
                    }
                    if (this.f25678c.mo27883e() >= -1) {
                        map.put("pht", Long.valueOf(this.f25678c.mo27883e()));
                    }
                } else {
                    map.put("bl", Integer.valueOf(-1));
                    map.put("pht", Integer.valueOf(-1));
                }
            }
            this.f25679d.mo27933a(str, map, mo27950e());
        }
    }

    /* renamed from: a */
    private void m34226a(String str, Object obj, Object obj2) {
        HashMap hashMap = new HashMap();
        if (obj != null) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(str, obj);
            hashMap.put("old", hashMap2);
        }
        HashMap hashMap3 = new HashMap();
        hashMap3.put(str, obj2);
        hashMap.put("new", hashMap3);
        m34228a("CwsStateChangeEvent", (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    private void m34229a(Map<String, Object> map, Map<String, Object> map2) {
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            HashMap hashMap2 = new HashMap();
            hashMap2.putAll(map);
            hashMap.put("old", hashMap2);
        }
        if (map2 != null && !map2.isEmpty()) {
            HashMap hashMap3 = new HashMap();
            hashMap3.putAll(map2);
            hashMap.put("new", hashMap3);
        }
        m34228a("CwsStateChangeEvent", (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    private void m34224a(int i, int i2) {
        m34226a("br", (Object) i > 0 ? Integer.valueOf(i) : null, (Object) Integer.valueOf(i2));
    }

    /* renamed from: a */
    private void m34227a(String str, String str2) {
        m34226a("ct", (Object) str, (Object) str2);
    }
}
