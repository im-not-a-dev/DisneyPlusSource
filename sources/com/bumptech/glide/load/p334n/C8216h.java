package com.bumptech.glide.load.p334n;

import android.os.Build.VERSION;
import android.util.Log;
import com.bumptech.glide.load.C8105a;
import com.bumptech.glide.load.C8107c;
import com.bumptech.glide.load.C8111g;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.C8117k;
import com.bumptech.glide.load.C8118l;
import com.bumptech.glide.load.p332m.C8122d;
import com.bumptech.glide.load.p332m.C8124e;
import com.bumptech.glide.load.p334n.C8213f.C8214a;
import com.bumptech.glide.load.p334n.p336b0.C8178a;
import com.bumptech.glide.load.p341p.p342c.C8371k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p096e.p121h.p134r.C4114f;
import p163g.p413f.p414a.C10654g;
import p163g.p413f.p414a.C10657j;
import p163g.p413f.p414a.p424w.C10770f;
import p163g.p413f.p414a.p424w.p425l.C10777a.C10783f;
import p163g.p413f.p414a.p424w.p425l.C10785b;
import p163g.p413f.p414a.p424w.p425l.C10786c;

/* renamed from: com.bumptech.glide.load.n.h */
/* compiled from: DecodeJob */
class C8216h<R> implements C8214a, Runnable, Comparable<C8216h<?>>, C10783f {

    /* renamed from: U */
    private final List<Throwable> f17549U = new ArrayList();

    /* renamed from: V */
    private final C10786c f17550V = C10786c.m34054b();

    /* renamed from: W */
    private final C8221e f17551W;

    /* renamed from: X */
    private final C4114f<C8216h<?>> f17552X;

    /* renamed from: Y */
    private final C8220d<?> f17553Y = new C8220d<>();

    /* renamed from: Z */
    private final C8222f f17554Z = new C8222f();

    /* renamed from: a0 */
    private C10654g f17555a0;

    /* renamed from: b0 */
    private C8111g f17556b0;

    /* renamed from: c */
    private final C8215g<R> f17557c = new C8215g<>();

    /* renamed from: c0 */
    private C10657j f17558c0;

    /* renamed from: d0 */
    private C8247n f17559d0;

    /* renamed from: e0 */
    private int f17560e0;

    /* renamed from: f0 */
    private int f17561f0;

    /* renamed from: g0 */
    private C8227j f17562g0;

    /* renamed from: h0 */
    private C8115i f17563h0;

    /* renamed from: i0 */
    private C8218b<R> f17564i0;

    /* renamed from: j0 */
    private int f17565j0;

    /* renamed from: k0 */
    private C8224h f17566k0;

    /* renamed from: l0 */
    private C8223g f17567l0;

    /* renamed from: m0 */
    private long f17568m0;

    /* renamed from: n0 */
    private boolean f17569n0;

    /* renamed from: o0 */
    private Object f17570o0;

    /* renamed from: p0 */
    private Thread f17571p0;

    /* renamed from: q0 */
    private C8111g f17572q0;

    /* renamed from: r0 */
    private C8111g f17573r0;

    /* renamed from: s0 */
    private Object f17574s0;

    /* renamed from: t0 */
    private C8105a f17575t0;

    /* renamed from: u0 */
    private C8122d<?> f17576u0;

    /* renamed from: v0 */
    private volatile C8213f f17577v0;

    /* renamed from: w0 */
    private volatile boolean f17578w0;

    /* renamed from: x0 */
    private volatile boolean f17579x0;

    /* renamed from: com.bumptech.glide.load.n.h$a */
    /* compiled from: DecodeJob */
    static /* synthetic */ class C8217a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17580a = new int[C8223g.values().length];

        /* renamed from: b */
        static final /* synthetic */ int[] f17581b = new int[C8224h.values().length];

        /* renamed from: c */
        static final /* synthetic */ int[] f17582c = new int[C8107c.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|5|6|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0032 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0052 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0070 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x007a */
        static {
            /*
                com.bumptech.glide.load.c[] r0 = com.bumptech.glide.load.C8107c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17582c = r0
                r0 = 1
                int[] r1 = f17582c     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bumptech.glide.load.c r2 = com.bumptech.glide.load.C8107c.SOURCE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f17582c     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bumptech.glide.load.c r3 = com.bumptech.glide.load.C8107c.TRANSFORMED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                com.bumptech.glide.load.n.h$h[] r2 = com.bumptech.glide.load.p334n.C8216h.C8224h.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f17581b = r2
                int[] r2 = f17581b     // Catch:{ NoSuchFieldError -> 0x0032 }
                com.bumptech.glide.load.n.h$h r3 = com.bumptech.glide.load.p334n.C8216h.C8224h.RESOURCE_CACHE     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r2 = f17581b     // Catch:{ NoSuchFieldError -> 0x003c }
                com.bumptech.glide.load.n.h$h r3 = com.bumptech.glide.load.p334n.C8216h.C8224h.DATA_CACHE     // Catch:{ NoSuchFieldError -> 0x003c }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                r2 = 3
                int[] r3 = f17581b     // Catch:{ NoSuchFieldError -> 0x0047 }
                com.bumptech.glide.load.n.h$h r4 = com.bumptech.glide.load.p334n.C8216h.C8224h.SOURCE     // Catch:{ NoSuchFieldError -> 0x0047 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0047 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                int[] r3 = f17581b     // Catch:{ NoSuchFieldError -> 0x0052 }
                com.bumptech.glide.load.n.h$h r4 = com.bumptech.glide.load.p334n.C8216h.C8224h.FINISHED     // Catch:{ NoSuchFieldError -> 0x0052 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0052 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0052 }
            L_0x0052:
                int[] r3 = f17581b     // Catch:{ NoSuchFieldError -> 0x005d }
                com.bumptech.glide.load.n.h$h r4 = com.bumptech.glide.load.p334n.C8216h.C8224h.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x005d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                com.bumptech.glide.load.n.h$g[] r3 = com.bumptech.glide.load.p334n.C8216h.C8223g.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f17580a = r3
                int[] r3 = f17580a     // Catch:{ NoSuchFieldError -> 0x0070 }
                com.bumptech.glide.load.n.h$g r4 = com.bumptech.glide.load.p334n.C8216h.C8223g.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x0070 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0070 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0070 }
            L_0x0070:
                int[] r0 = f17580a     // Catch:{ NoSuchFieldError -> 0x007a }
                com.bumptech.glide.load.n.h$g r3 = com.bumptech.glide.load.p334n.C8216h.C8223g.SWITCH_TO_SOURCE_SERVICE     // Catch:{ NoSuchFieldError -> 0x007a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                int[] r0 = f17580a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.bumptech.glide.load.n.h$g r1 = com.bumptech.glide.load.p334n.C8216h.C8223g.DECODE_DATA     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p334n.C8216h.C8217a.<clinit>():void");
        }
    }

    /* renamed from: com.bumptech.glide.load.n.h$b */
    /* compiled from: DecodeJob */
    interface C8218b<R> {
        /* renamed from: a */
        void mo21353a(C8216h<?> hVar);

        /* renamed from: a */
        void mo21354a(C8251q qVar);

        /* renamed from: a */
        void mo21355a(C8258v<R> vVar, C8105a aVar);
    }

    /* renamed from: com.bumptech.glide.load.n.h$c */
    /* compiled from: DecodeJob */
    private final class C8219c<Z> implements C8226a<Z> {

        /* renamed from: a */
        private final C8105a f17583a;

        C8219c(C8105a aVar) {
            this.f17583a = aVar;
        }

        /* renamed from: a */
        public C8258v<Z> mo21356a(C8258v<Z> vVar) {
            return C8216h.this.mo21347a(this.f17583a, vVar);
        }
    }

    /* renamed from: com.bumptech.glide.load.n.h$d */
    /* compiled from: DecodeJob */
    private static class C8220d<Z> {

        /* renamed from: a */
        private C8111g f17585a;

        /* renamed from: b */
        private C8117k<Z> f17586b;

        /* renamed from: c */
        private C8256u<Z> f17587c;

        C8220d() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public <X> void mo21358a(C8111g gVar, C8117k<X> kVar, C8256u<X> uVar) {
            this.f17585a = gVar;
            this.f17586b = kVar;
            this.f17587c = uVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo21360b() {
            return this.f17587c != null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo21359a(C8221e eVar, C8115i iVar) {
            C10785b.m34051a("DecodeJob.encode");
            try {
                eVar.mo21361a().mo21270a(this.f17585a, new C8212e(this.f17586b, this.f17587c, iVar));
            } finally {
                this.f17587c.mo21437c();
                C10785b.m34050a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo21357a() {
            this.f17585a = null;
            this.f17586b = null;
            this.f17587c = null;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.h$e */
    /* compiled from: DecodeJob */
    interface C8221e {
        /* renamed from: a */
        C8178a mo21361a();
    }

    /* renamed from: com.bumptech.glide.load.n.h$f */
    /* compiled from: DecodeJob */
    private static class C8222f {

        /* renamed from: a */
        private boolean f17588a;

        /* renamed from: b */
        private boolean f17589b;

        /* renamed from: c */
        private boolean f17590c;

        C8222f() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public synchronized boolean mo21363a(boolean z) {
            this.f17588a = true;
            return m23890b(z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public synchronized boolean mo21364b() {
            this.f17590c = true;
            return m23890b(false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public synchronized void mo21365c() {
            this.f17589b = false;
            this.f17588a = false;
            this.f17590c = false;
        }

        /* renamed from: b */
        private boolean m23890b(boolean z) {
            return (this.f17590c || z || this.f17589b) && this.f17588a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public synchronized boolean mo21362a() {
            this.f17589b = true;
            return m23890b(false);
        }
    }

    /* renamed from: com.bumptech.glide.load.n.h$g */
    /* compiled from: DecodeJob */
    private enum C8223g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* renamed from: com.bumptech.glide.load.n.h$h */
    /* compiled from: DecodeJob */
    private enum C8224h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    C8216h(C8221e eVar, C4114f<C8216h<?>> fVar) {
        this.f17551W = eVar;
        this.f17552X = fVar;
    }

    /* renamed from: e */
    private void m23861e() {
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.f17568m0;
            StringBuilder sb = new StringBuilder();
            sb.append("data: ");
            sb.append(this.f17574s0);
            sb.append(", cache key: ");
            sb.append(this.f17572q0);
            sb.append(", fetcher: ");
            sb.append(this.f17576u0);
            m23859a("Retrieved data", j, sb.toString());
        }
        C8258v vVar = null;
        try {
            vVar = m23854a(this.f17576u0, (Data) this.f17574s0, this.f17575t0);
        } catch (C8251q e) {
            e.mo21418a(this.f17573r0, this.f17575t0);
            this.f17549U.add(e);
        }
        if (vVar != null) {
            m23860b(vVar, this.f17575t0);
        } else {
            m23868l();
        }
    }

    /* renamed from: f */
    private C8213f m23862f() {
        int i = C8217a.f17581b[this.f17566k0.ordinal()];
        if (i == 1) {
            return new C8259w(this.f17557c, this);
        }
        if (i == 2) {
            return new C8200c(this.f17557c, this);
        }
        if (i == 3) {
            return new C8263z(this.f17557c, this);
        }
        if (i == 4) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unrecognized stage: ");
        sb.append(this.f17566k0);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: g */
    private int m23863g() {
        return this.f17558c0.ordinal();
    }

    /* renamed from: h */
    private void m23864h() {
        m23870n();
        this.f17564i0.mo21354a(new C8251q("Failed to load resource", (List<Throwable>) new ArrayList<Throwable>(this.f17549U)));
        m23866j();
    }

    /* renamed from: i */
    private void m23865i() {
        if (this.f17554Z.mo21362a()) {
            m23867k();
        }
    }

    /* renamed from: j */
    private void m23866j() {
        if (this.f17554Z.mo21364b()) {
            m23867k();
        }
    }

    /* renamed from: k */
    private void m23867k() {
        this.f17554Z.mo21365c();
        this.f17553Y.mo21357a();
        this.f17557c.mo21325a();
        this.f17578w0 = false;
        this.f17555a0 = null;
        this.f17556b0 = null;
        this.f17563h0 = null;
        this.f17558c0 = null;
        this.f17559d0 = null;
        this.f17564i0 = null;
        this.f17566k0 = null;
        this.f17577v0 = null;
        this.f17571p0 = null;
        this.f17572q0 = null;
        this.f17574s0 = null;
        this.f17575t0 = null;
        this.f17576u0 = null;
        this.f17568m0 = 0;
        this.f17579x0 = false;
        this.f17570o0 = null;
        this.f17549U.clear();
        this.f17552X.mo14667a(this);
    }

    /* renamed from: l */
    private void m23868l() {
        this.f17571p0 = Thread.currentThread();
        this.f17568m0 = C10770f.m33999a();
        boolean z = false;
        while (!this.f17579x0 && this.f17577v0 != null) {
            z = this.f17577v0.mo21297a();
            if (z) {
                break;
            }
            this.f17566k0 = m23853a(this.f17566k0);
            this.f17577v0 = m23862f();
            if (this.f17566k0 == C8224h.SOURCE) {
                mo21320b();
                return;
            }
        }
        if ((this.f17566k0 == C8224h.FINISHED || this.f17579x0) && !z) {
            m23864h();
        }
    }

    /* renamed from: m */
    private void m23869m() {
        int i = C8217a.f17580a[this.f17567l0.ordinal()];
        if (i == 1) {
            this.f17566k0 = m23853a(C8224h.INITIALIZE);
            this.f17577v0 = m23862f();
            m23868l();
        } else if (i == 2) {
            m23868l();
        } else if (i == 3) {
            m23861e();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unrecognized run reason: ");
            sb.append(this.f17567l0);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: n */
    private void m23870n() {
        Throwable th;
        this.f17550V.mo27821a();
        if (this.f17578w0) {
            if (this.f17549U.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.f17549U;
                th = (Throwable) list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.f17578w0 = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C8216h<R> mo21346a(C10654g gVar, Object obj, C8247n nVar, C8111g gVar2, int i, int i2, Class<?> cls, Class<R> cls2, C10657j jVar, C8227j jVar2, Map<Class<?>, C8118l<?>> map, boolean z, boolean z2, boolean z3, C8115i iVar, C8218b<R> bVar, int i3) {
        this.f17557c.mo21326a(gVar, obj, gVar2, i, i2, jVar2, cls, cls2, jVar, iVar, map, z, z2, this.f17551W);
        this.f17555a0 = gVar;
        this.f17556b0 = gVar2;
        this.f17558c0 = jVar;
        this.f17559d0 = nVar;
        this.f17560e0 = i;
        this.f17561f0 = i2;
        this.f17562g0 = jVar2;
        this.f17569n0 = z3;
        this.f17563h0 = iVar;
        this.f17564i0 = bVar;
        this.f17565j0 = i3;
        this.f17567l0 = C8223g.INITIALIZE;
        this.f17570o0 = obj;
        return this;
    }

    /* renamed from: b */
    public void mo21320b() {
        this.f17567l0 = C8223g.SWITCH_TO_SOURCE_SERVICE;
        this.f17564i0.mo21353a(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo21350c() {
        C8224h a = m23853a(C8224h.INITIALIZE);
        return a == C8224h.RESOURCE_CACHE || a == C8224h.DATA_CACHE;
    }

    /* renamed from: d */
    public C10786c mo21296d() {
        return this.f17550V;
    }

    public void run() {
        String str = "DecodeJob";
        C10785b.m34052a("DecodeJob#run(model=%s)", this.f17570o0);
        C8122d<?> dVar = this.f17576u0;
        try {
            if (this.f17579x0) {
                m23864h();
                if (dVar != null) {
                    dVar.cleanup();
                }
                C10785b.m34050a();
                return;
            }
            m23869m();
            if (dVar != null) {
                dVar.cleanup();
            }
            C10785b.m34050a();
        } catch (C8177b e) {
            throw e;
        } catch (Throwable th) {
            if (dVar != null) {
                dVar.cleanup();
            }
            C10785b.m34050a();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r3v1, types: [com.bumptech.glide.load.n.v] */
    /* JADX WARNING: type inference failed for: r3v7, types: [com.bumptech.glide.load.n.u] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m23860b(com.bumptech.glide.load.p334n.C8258v<R> r3, com.bumptech.glide.load.C8105a r4) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.bumptech.glide.load.p334n.C8253r
            if (r0 == 0) goto L_0x000a
            r0 = r3
            com.bumptech.glide.load.n.r r0 = (com.bumptech.glide.load.p334n.C8253r) r0
            r0.initialize()
        L_0x000a:
            r0 = 0
            com.bumptech.glide.load.n.h$d<?> r1 = r2.f17553Y
            boolean r1 = r1.mo21360b()
            if (r1 == 0) goto L_0x0018
            com.bumptech.glide.load.n.u r3 = com.bumptech.glide.load.p334n.C8256u.m23993b(r3)
            r0 = r3
        L_0x0018:
            r2.m23857a(r3, r4)
            com.bumptech.glide.load.n.h$h r3 = com.bumptech.glide.load.p334n.C8216h.C8224h.ENCODE
            r2.f17566k0 = r3
            com.bumptech.glide.load.n.h$d<?> r3 = r2.f17553Y     // Catch:{ all -> 0x0039 }
            boolean r3 = r3.mo21360b()     // Catch:{ all -> 0x0039 }
            if (r3 == 0) goto L_0x0030
            com.bumptech.glide.load.n.h$d<?> r3 = r2.f17553Y     // Catch:{ all -> 0x0039 }
            com.bumptech.glide.load.n.h$e r4 = r2.f17551W     // Catch:{ all -> 0x0039 }
            com.bumptech.glide.load.i r1 = r2.f17563h0     // Catch:{ all -> 0x0039 }
            r3.mo21359a(r4, r1)     // Catch:{ all -> 0x0039 }
        L_0x0030:
            if (r0 == 0) goto L_0x0035
            r0.mo21437c()
        L_0x0035:
            r2.m23865i()
            return
        L_0x0039:
            r3 = move-exception
            if (r0 == 0) goto L_0x003f
            r0.mo21437c()
        L_0x003f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p334n.C8216h.m23860b(com.bumptech.glide.load.n.v, com.bumptech.glide.load.a):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21349a(boolean z) {
        if (this.f17554Z.mo21363a(z)) {
            m23867k();
        }
    }

    /* renamed from: a */
    public int compareTo(C8216h<?> hVar) {
        int g = m23863g() - hVar.m23863g();
        return g == 0 ? this.f17565j0 - hVar.f17565j0 : g;
    }

    /* renamed from: a */
    public void mo21348a() {
        this.f17579x0 = true;
        C8213f fVar = this.f17577v0;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    /* renamed from: a */
    private void m23857a(C8258v<R> vVar, C8105a aVar) {
        m23870n();
        this.f17564i0.mo21355a(vVar, aVar);
    }

    /* renamed from: a */
    private C8224h m23853a(C8224h hVar) {
        int i = C8217a.f17581b[hVar.ordinal()];
        if (i == 1) {
            return this.f17562g0.mo21368a() ? C8224h.DATA_CACHE : m23853a(C8224h.DATA_CACHE);
        } else if (i == 2) {
            return this.f17569n0 ? C8224h.FINISHED : C8224h.SOURCE;
        } else if (i == 3 || i == 4) {
            return C8224h.FINISHED;
        } else {
            if (i == 5) {
                return this.f17562g0.mo21371b() ? C8224h.RESOURCE_CACHE : m23853a(C8224h.RESOURCE_CACHE);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unrecognized stage: ");
            sb.append(hVar);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public void mo21319a(C8111g gVar, Object obj, C8122d<?> dVar, C8105a aVar, C8111g gVar2) {
        this.f17572q0 = gVar;
        this.f17574s0 = obj;
        this.f17576u0 = dVar;
        this.f17575t0 = aVar;
        this.f17573r0 = gVar2;
        if (Thread.currentThread() != this.f17571p0) {
            this.f17567l0 = C8223g.DECODE_DATA;
            this.f17564i0.mo21353a(this);
            return;
        }
        C10785b.m34051a("DecodeJob.decodeFromRetrievedData");
        try {
            m23861e();
        } finally {
            C10785b.m34050a();
        }
    }

    /* renamed from: a */
    public void mo21318a(C8111g gVar, Exception exc, C8122d<?> dVar, C8105a aVar) {
        dVar.cleanup();
        C8251q qVar = new C8251q("Fetching data failed", (Throwable) exc);
        qVar.mo21419a(gVar, aVar, dVar.mo21140a());
        this.f17549U.add(qVar);
        if (Thread.currentThread() != this.f17571p0) {
            this.f17567l0 = C8223g.SWITCH_TO_SOURCE_SERVICE;
            this.f17564i0.mo21353a(this);
            return;
        }
        m23868l();
    }

    /* renamed from: a */
    private <Data> C8258v<R> m23854a(C8122d<?> dVar, Data data, C8105a aVar) throws C8251q {
        if (data == null) {
            dVar.cleanup();
            return null;
        }
        try {
            long a = C10770f.m33999a();
            C8258v<R> a2 = m23855a(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Decoded result ");
                sb.append(a2);
                m23858a(sb.toString(), a);
            }
            return a2;
        } finally {
            dVar.cleanup();
        }
    }

    /* renamed from: a */
    private <Data> C8258v<R> m23855a(Data data, C8105a aVar) throws C8251q {
        return m23856a(data, aVar, this.f17557c.mo21323a(data.getClass()));
    }

    /* renamed from: a */
    private C8115i m23852a(C8105a aVar) {
        C8115i iVar = this.f17563h0;
        if (VERSION.SDK_INT < 26) {
            return iVar;
        }
        boolean z = aVar == C8105a.RESOURCE_DISK_CACHE || this.f17557c.mo21344o();
        Boolean bool = (Boolean) iVar.mo21162a(C8371k.f17855h);
        if (bool != null && (!bool.booleanValue() || z)) {
            return iVar;
        }
        C8115i iVar2 = new C8115i();
        iVar2.mo21163a(this.f17563h0);
        iVar2.mo21161a(C8371k.f17855h, Boolean.valueOf(z));
        return iVar2;
    }

    /* renamed from: a */
    private <Data, ResourceType> C8258v<R> m23856a(Data data, C8105a aVar, C8255t<Data, ResourceType, R> tVar) throws C8251q {
        C8115i a = m23852a(aVar);
        C8124e b = this.f17555a0.mo27541f().mo27556b(data);
        try {
            return tVar.mo21435a(b, a, this.f17560e0, this.f17561f0, new C8219c(aVar));
        } finally {
            b.cleanup();
        }
    }

    /* renamed from: a */
    private void m23858a(String str, long j) {
        m23859a(str, j, (String) null);
    }

    /* renamed from: a */
    private void m23859a(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C10770f.m33998a(j));
        sb.append(", load key: ");
        sb.append(this.f17559d0);
        if (str2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(", ");
            sb2.append(str2);
            str3 = sb2.toString();
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    /* JADX WARNING: type inference failed for: r12v6, types: [com.bumptech.glide.load.n.d] */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Z> com.bumptech.glide.load.p334n.C8258v<Z> mo21347a(com.bumptech.glide.load.C8105a r12, com.bumptech.glide.load.p334n.C8258v<Z> r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r13.get()
            java.lang.Class r8 = r0.getClass()
            com.bumptech.glide.load.a r0 = com.bumptech.glide.load.C8105a.RESOURCE_DISK_CACHE
            r1 = 0
            if (r12 == r0) goto L_0x0020
            com.bumptech.glide.load.n.g<R> r0 = r11.f17557c
            com.bumptech.glide.load.l r0 = r0.mo21328b(r8)
            g.f.a.g r2 = r11.f17555a0
            int r3 = r11.f17560e0
            int r4 = r11.f17561f0
            com.bumptech.glide.load.n.v r2 = r0.mo21168a(r2, r13, r3, r4)
            r7 = r0
            r0 = r2
            goto L_0x0022
        L_0x0020:
            r0 = r13
            r7 = r1
        L_0x0022:
            boolean r2 = r13.equals(r0)
            if (r2 != 0) goto L_0x002b
            r13.mo21407a()
        L_0x002b:
            com.bumptech.glide.load.n.g<R> r13 = r11.f17557c
            boolean r13 = r13.mo21330b(r0)
            if (r13 == 0) goto L_0x0040
            com.bumptech.glide.load.n.g<R> r13 = r11.f17557c
            com.bumptech.glide.load.k r1 = r13.mo21322a(r0)
            com.bumptech.glide.load.i r13 = r11.f17563h0
            com.bumptech.glide.load.c r13 = r1.mo21167a(r13)
            goto L_0x0042
        L_0x0040:
            com.bumptech.glide.load.c r13 = com.bumptech.glide.load.C8107c.NONE
        L_0x0042:
            r10 = r1
            com.bumptech.glide.load.n.g<R> r1 = r11.f17557c
            com.bumptech.glide.load.g r2 = r11.f17572q0
            boolean r1 = r1.mo21327a(r2)
            r2 = 1
            r1 = r1 ^ r2
            com.bumptech.glide.load.n.j r3 = r11.f17562g0
            boolean r12 = r3.mo21370a(r1, r12, r13)
            if (r12 == 0) goto L_0x00b3
            if (r10 == 0) goto L_0x00a5
            int[] r12 = com.bumptech.glide.load.p334n.C8216h.C8217a.f17582c
            int r1 = r13.ordinal()
            r12 = r12[r1]
            if (r12 == r2) goto L_0x0092
            r1 = 2
            if (r12 != r1) goto L_0x007b
            com.bumptech.glide.load.n.x r12 = new com.bumptech.glide.load.n.x
            com.bumptech.glide.load.n.g<R> r13 = r11.f17557c
            com.bumptech.glide.load.n.a0.b r2 = r13.mo21329b()
            com.bumptech.glide.load.g r3 = r11.f17572q0
            com.bumptech.glide.load.g r4 = r11.f17556b0
            int r5 = r11.f17560e0
            int r6 = r11.f17561f0
            com.bumptech.glide.load.i r9 = r11.f17563h0
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x009b
        L_0x007b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown strategy: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x0092:
            com.bumptech.glide.load.n.d r12 = new com.bumptech.glide.load.n.d
            com.bumptech.glide.load.g r13 = r11.f17572q0
            com.bumptech.glide.load.g r1 = r11.f17556b0
            r12.<init>(r13, r1)
        L_0x009b:
            com.bumptech.glide.load.n.u r0 = com.bumptech.glide.load.p334n.C8256u.m23993b(r0)
            com.bumptech.glide.load.n.h$d<?> r13 = r11.f17553Y
            r13.mo21358a(r12, r10, r0)
            goto L_0x00b3
        L_0x00a5:
            g.f.a.l$d r12 = new g.f.a.l$d
            java.lang.Object r13 = r0.get()
            java.lang.Class r13 = r13.getClass()
            r12.<init>(r13)
            throw r12
        L_0x00b3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p334n.C8216h.mo21347a(com.bumptech.glide.load.a, com.bumptech.glide.load.n.v):com.bumptech.glide.load.n.v");
    }
}
