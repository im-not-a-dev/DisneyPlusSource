package p163g.p426g.p427a.p428i;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import p163g.p426g.p427a.C10815f;
import p163g.p426g.p427a.C10816g;
import p163g.p426g.p427a.C10817h.C10818a;
import p163g.p426g.p430b.C10837a;
import p163g.p426g.p435f.C10857d;
import p163g.p426g.p435f.C10858e.C10862d;
import p163g.p426g.p436g.C10875d;
import p163g.p426g.p436g.C10880i;

/* renamed from: g.g.a.i.c */
/* compiled from: PlayerStateManager */
public class C10821c implements C10820b {

    /* renamed from: a */
    private C10880i f25594a;

    /* renamed from: b */
    private C10816g f25595b;

    /* renamed from: c */
    private C10875d f25596c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C10857d f25597d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f25598e = -2;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C10826e f25599f = C10826e.UNKNOWN;

    /* renamed from: g */
    private Map<String, String> f25600g = new HashMap();

    /* renamed from: h */
    private String f25601h = null;

    /* renamed from: i */
    private String f25602i = null;

    /* renamed from: j */
    private C10837a f25603j = null;

    /* renamed from: k */
    private ArrayList<C10837a> f25604k = new ArrayList<>();

    /* renamed from: l */
    private String f25605l = null;

    /* renamed from: m */
    private String f25606m = null;

    /* renamed from: n */
    private C10819a f25607n = null;

    /* renamed from: g.g.a.i.c$a */
    /* compiled from: PlayerStateManager */
    class C10822a implements Callable<Void> {

        /* renamed from: c */
        final /* synthetic */ int f25609c;

        C10822a(int i) {
            this.f25609c = i;
        }

        public Void call() throws C10815f {
            if (C10821c.this.f25597d != null) {
                C10821c.this.f25597d.mo27939b(this.f25609c);
            }
            return null;
        }
    }

    /* renamed from: g.g.a.i.c$b */
    /* compiled from: PlayerStateManager */
    static /* synthetic */ class C10823b {

        /* renamed from: a */
        static final /* synthetic */ int[] f25610a = new int[C10826e.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                g.g.a.i.c$e[] r0 = p163g.p426g.p427a.p428i.C10821c.C10826e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25610a = r0
                int[] r0 = f25610a     // Catch:{ NoSuchFieldError -> 0x0014 }
                g.g.a.i.c$e r1 = p163g.p426g.p427a.p428i.C10821c.C10826e.STOPPED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f25610a     // Catch:{ NoSuchFieldError -> 0x001f }
                g.g.a.i.c$e r1 = p163g.p426g.p427a.p428i.C10821c.C10826e.PLAYING     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f25610a     // Catch:{ NoSuchFieldError -> 0x002a }
                g.g.a.i.c$e r1 = p163g.p426g.p427a.p428i.C10821c.C10826e.BUFFERING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f25610a     // Catch:{ NoSuchFieldError -> 0x0035 }
                g.g.a.i.c$e r1 = p163g.p426g.p427a.p428i.C10821c.C10826e.PAUSED     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f25610a     // Catch:{ NoSuchFieldError -> 0x0040 }
                g.g.a.i.c$e r1 = p163g.p426g.p427a.p428i.C10821c.C10826e.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p163g.p426g.p427a.p428i.C10821c.C10823b.<clinit>():void");
        }
    }

    /* renamed from: g.g.a.i.c$c */
    /* compiled from: PlayerStateManager */
    class C10824c implements Callable<Void> {

        /* renamed from: c */
        final /* synthetic */ C10826e f25612c;

        C10824c(C10826e eVar) {
            this.f25612c = eVar;
        }

        public Void call() throws C10815f {
            if (C10821c.m34114e(this.f25612c)) {
                if (C10821c.this.f25597d != null) {
                    C10821c.this.f25597d.mo27937a(C10821c.m34113d(this.f25612c));
                }
                C10821c.this.f25599f = this.f25612c;
            } else {
                C10821c cVar = C10821c.this;
                StringBuilder sb = new StringBuilder();
                sb.append("PlayerStateManager.SetPlayerState(): invalid state: ");
                sb.append(this.f25612c);
                cVar.m34109a(sb.toString(), C10818a.ERROR);
            }
            return null;
        }
    }

    /* renamed from: g.g.a.i.c$d */
    /* compiled from: PlayerStateManager */
    class C10825d implements Callable<Void> {

        /* renamed from: c */
        final /* synthetic */ int f25614c;

        C10825d(int i) {
            this.f25614c = i;
        }

        public Void call() {
            int i = this.f25614c;
            if (i >= -1) {
                if (C10821c.this.f25597d != null) {
                    C10821c.this.f25597d.mo27935a(i);
                }
                C10821c.this.f25598e = i;
            }
            return null;
        }
    }

    /* renamed from: g.g.a.i.c$e */
    /* compiled from: PlayerStateManager */
    public enum C10826e {
        STOPPED,
        PLAYING,
        BUFFERING,
        PAUSED,
        UNKNOWN
    }

    public C10821c(C10816g gVar) {
        if (gVar == null) {
            Log.e("CONVIVA : ", "SystemFactory is null");
            return;
        }
        this.f25595b = gVar;
        this.f25594a = this.f25595b.mo27862f();
        this.f25594a.mo27989b("PlayerStateManager");
        this.f25596c = this.f25595b.mo27858b();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static C10862d m34113d(C10826e eVar) {
        int i = C10823b.f25610a[eVar.ordinal()];
        if (i == 1) {
            return C10862d.STOPPED;
        }
        if (i == 2) {
            return C10862d.PLAYING;
        }
        if (i == 3) {
            return C10862d.BUFFERING;
        }
        if (i != 4) {
            return C10862d.UNKNOWN;
        }
        return C10862d.PAUSED;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static boolean m34114e(C10826e eVar) {
        return eVar == C10826e.STOPPED || eVar == C10826e.PLAYING || eVar == C10826e.BUFFERING || eVar == C10826e.PAUSED || eVar == C10826e.UNKNOWN;
    }

    /* renamed from: k */
    private Map<String, String> m34115k() {
        return this.f25600g;
    }

    /* renamed from: l */
    private void m34116l() {
        if (this.f25597d != null) {
            try {
                mo27875a(mo27885g());
            } catch (C10815f e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error set current player state ");
                sb.append(e.getMessage());
                m34109a(sb.toString(), C10818a.ERROR);
            }
            try {
                mo27873a(mo27872a());
            } catch (C10815f e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error set current bitrate ");
                sb2.append(e2.getMessage());
                m34109a(sb2.toString(), C10818a.ERROR);
            }
            m34110a(m34115k());
            for (int i = 0; i < this.f25604k.size(); i++) {
                m34108a((C10837a) this.f25604k.get(i));
            }
            this.f25604k.clear();
        }
    }

    /* renamed from: f */
    public int mo27884f() {
        String str = "Exception ";
        if (this.f25607n != null) {
            try {
                return ((Integer) C10819a.class.getDeclaredMethod("c", null).invoke(this.f25607n, null)).intValue();
            } catch (NoSuchMethodException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(e.toString());
                m34109a(sb.toString(), C10818a.DEBUG);
            } catch (IllegalAccessException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(e2.toString());
                m34109a(sb2.toString(), C10818a.DEBUG);
            } catch (InvocationTargetException e3) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(e3.toString());
                m34109a(sb3.toString(), C10818a.DEBUG);
            }
        }
        return -1;
    }

    /* renamed from: g */
    public C10826e mo27885g() {
        return this.f25599f;
    }

    /* renamed from: h */
    public String mo27886h() {
        return this.f25602i;
    }

    /* renamed from: i */
    public String mo27887i() {
        return this.f25601h;
    }

    /* renamed from: j */
    public void mo27888j() {
        this.f25597d = null;
        C10880i iVar = this.f25594a;
        if (iVar != null) {
            iVar.mo27990a(-1);
        }
    }

    /* renamed from: b */
    public void mo27880b(String str) {
        this.f25601h = str;
    }

    /* renamed from: c */
    public String mo27881c() {
        return this.f25605l;
    }

    /* renamed from: e */
    public long mo27883e() {
        C10819a aVar = this.f25607n;
        if (aVar != null) {
            return aVar.mo7659b();
        }
        return -1;
    }

    /* renamed from: b */
    public void mo27879b(int i) throws C10815f {
        this.f25596c.mo27986a((Callable<V>) new C10822a<V>(i), "PlayerStateManager.sendSeekStart");
    }

    /* renamed from: b */
    public int mo27878b() {
        C10819a aVar = this.f25607n;
        if (aVar != null) {
            return aVar.mo7657a();
        }
        return -2;
    }

    /* renamed from: a */
    public void mo27876a(String str) {
        this.f25602i = str;
    }

    /* renamed from: a */
    public boolean mo27877a(C10857d dVar, int i) {
        if (this.f25597d != null) {
            return false;
        }
        this.f25597d = dVar;
        C10880i iVar = this.f25594a;
        if (iVar != null) {
            iVar.mo27990a(i);
        }
        m34116l();
        return true;
    }

    /* renamed from: d */
    public String mo27882d() {
        return this.f25606m;
    }

    /* renamed from: a */
    public void mo27875a(C10826e eVar) throws C10815f {
        this.f25596c.mo27986a((Callable<V>) new C10824c<V>(eVar), "PlayerStateManager.setPlayerState");
    }

    /* renamed from: a */
    public int mo27872a() {
        return this.f25598e;
    }

    /* renamed from: a */
    public void mo27873a(int i) throws C10815f {
        this.f25596c.mo27986a((Callable<V>) new C10825d<V>(i), "PlayerStateManager.setBitrateKbps");
    }

    /* renamed from: a */
    private void m34108a(C10837a aVar) {
        this.f25603j = aVar;
        C10857d dVar = this.f25597d;
        if (dVar != null) {
            dVar.mo27936a(this.f25603j);
        } else {
            this.f25604k.add(this.f25603j);
        }
    }

    /* renamed from: a */
    private void m34110a(Map<String, String> map) {
        for (Entry entry : map.entrySet()) {
            this.f25600g.put(entry.getKey(), entry.getValue());
        }
        C10857d dVar = this.f25597d;
        if (dVar != null) {
            dVar.mo27938a(this.f25600g);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m34109a(String str, C10818a aVar) {
        C10880i iVar = this.f25594a;
        if (iVar != null) {
            iVar.mo27991a(str, aVar);
        }
    }

    /* renamed from: a */
    public void mo27874a(C10819a aVar) {
        this.f25607n = aVar;
    }
}
