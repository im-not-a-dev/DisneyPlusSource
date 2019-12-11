package p163g.p413f.p414a.p420u;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.C8105a;
import com.bumptech.glide.load.p334n.C8233k;
import com.bumptech.glide.load.p334n.C8233k.C8239d;
import com.bumptech.glide.load.p334n.C8251q;
import com.bumptech.glide.load.p334n.C8258v;
import com.bumptech.glide.load.p341p.p344e.C8400a;
import java.util.List;
import java.util.concurrent.Executor;
import p096e.p121h.p134r.C4114f;
import p163g.p413f.p414a.C10654g;
import p163g.p413f.p414a.C10657j;
import p163g.p413f.p414a.p420u.p421l.C10746h;
import p163g.p413f.p414a.p420u.p421l.C10747i;
import p163g.p413f.p414a.p420u.p422m.C10758e;
import p163g.p413f.p414a.p424w.C10775k;
import p163g.p413f.p414a.p424w.p425l.C10777a;
import p163g.p413f.p414a.p424w.p425l.C10777a.C10781d;
import p163g.p413f.p414a.p424w.p425l.C10777a.C10783f;
import p163g.p413f.p414a.p424w.p425l.C10786c;

/* renamed from: g.f.a.u.j */
/* compiled from: SingleRequest */
public final class C10733j<R> implements C10726d, C10746h, C10732i, C10783f {

    /* renamed from: v0 */
    private static final C4114f<C10733j<?>> f25385v0 = C10777a.m34038a(150, (C10781d<T>) new C10734a<T>());

    /* renamed from: w0 */
    private static final boolean f25386w0 = Log.isLoggable("Request", 2);

    /* renamed from: U */
    private final String f25387U;

    /* renamed from: V */
    private final C10786c f25388V;

    /* renamed from: W */
    private C10730g<R> f25389W;

    /* renamed from: X */
    private C10727e f25390X;

    /* renamed from: Y */
    private Context f25391Y;

    /* renamed from: Z */
    private C10654g f25392Z;

    /* renamed from: a0 */
    private Object f25393a0;

    /* renamed from: b0 */
    private Class<R> f25394b0;

    /* renamed from: c */
    private boolean f25395c;

    /* renamed from: c0 */
    private C10723a<?> f25396c0;

    /* renamed from: d0 */
    private int f25397d0;

    /* renamed from: e0 */
    private int f25398e0;

    /* renamed from: f0 */
    private C10657j f25399f0;

    /* renamed from: g0 */
    private C10747i<R> f25400g0;

    /* renamed from: h0 */
    private List<C10730g<R>> f25401h0;

    /* renamed from: i0 */
    private C8233k f25402i0;

    /* renamed from: j0 */
    private C10758e<? super R> f25403j0;

    /* renamed from: k0 */
    private Executor f25404k0;

    /* renamed from: l0 */
    private C8258v<R> f25405l0;

    /* renamed from: m0 */
    private C8239d f25406m0;

    /* renamed from: n0 */
    private long f25407n0;

    /* renamed from: o0 */
    private C10735b f25408o0;

    /* renamed from: p0 */
    private Drawable f25409p0;

    /* renamed from: q0 */
    private Drawable f25410q0;

    /* renamed from: r0 */
    private Drawable f25411r0;

    /* renamed from: s0 */
    private int f25412s0;

    /* renamed from: t0 */
    private int f25413t0;

    /* renamed from: u0 */
    private RuntimeException f25414u0;

    /* renamed from: g.f.a.u.j$a */
    /* compiled from: SingleRequest */
    class C10734a implements C10781d<C10733j<?>> {
        C10734a() {
        }

        public C10733j<?> create() {
            return new C10733j<>();
        }
    }

    /* renamed from: g.f.a.u.j$b */
    /* compiled from: SingleRequest */
    private enum C10735b {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    C10733j() {
        this.f25387U = f25386w0 ? String.valueOf(super.hashCode()) : null;
        this.f25388V = C10786c.m34054b();
    }

    /* renamed from: a */
    private synchronized void m33838a(Context context, C10654g gVar, Object obj, Class<R> cls, C10723a<?> aVar, int i, int i2, C10657j jVar, C10747i<R> iVar, C10730g<R> gVar2, List<C10730g<R>> list, C10727e eVar, C8233k kVar, C10758e<? super R> eVar2, Executor executor) {
        this.f25391Y = context;
        this.f25392Z = gVar;
        this.f25393a0 = obj;
        this.f25394b0 = cls;
        this.f25396c0 = aVar;
        this.f25397d0 = i;
        this.f25398e0 = i2;
        this.f25399f0 = jVar;
        this.f25400g0 = iVar;
        this.f25389W = gVar2;
        this.f25401h0 = list;
        this.f25390X = eVar;
        this.f25402i0 = kVar;
        this.f25403j0 = eVar2;
        this.f25404k0 = executor;
        this.f25408o0 = C10735b.PENDING;
        if (this.f25414u0 == null && gVar.mo27542g()) {
            this.f25414u0 = new RuntimeException("Glide request origin trace");
        }
    }

    /* renamed from: b */
    public static <R> C10733j<R> m33844b(Context context, C10654g gVar, Object obj, Class<R> cls, C10723a<?> aVar, int i, int i2, C10657j jVar, C10747i<R> iVar, C10730g<R> gVar2, List<C10730g<R>> list, C10727e eVar, C8233k kVar, C10758e<? super R> eVar2, Executor executor) {
        C10733j<R> jVar2 = (C10733j) f25385v0.mo14666a();
        if (jVar2 == null) {
            jVar2 = new C10733j<>();
        }
        jVar2.m33838a(context, gVar, obj, cls, aVar, i, i2, jVar, iVar, gVar2, list, eVar, kVar, eVar2, executor);
        return jVar2;
    }

    /* renamed from: h */
    private boolean m33846h() {
        C10727e eVar = this.f25390X;
        return eVar == null || eVar.mo27730f(this);
    }

    /* renamed from: i */
    private boolean m33847i() {
        C10727e eVar = this.f25390X;
        return eVar == null || eVar.mo27724c(this);
    }

    /* renamed from: j */
    private boolean m33848j() {
        C10727e eVar = this.f25390X;
        return eVar == null || eVar.mo27726d(this);
    }

    /* renamed from: k */
    private void m33849k() {
        m33845b();
        this.f25388V.mo27821a();
        this.f25400g0.mo27735a((C10746h) this);
        C8239d dVar = this.f25406m0;
        if (dVar != null) {
            dVar.mo21379a();
            this.f25406m0 = null;
        }
    }

    /* renamed from: l */
    private Drawable m33850l() {
        if (this.f25409p0 == null) {
            this.f25409p0 = this.f25396c0.mo27693d();
            if (this.f25409p0 == null && this.f25396c0.mo27692c() > 0) {
                this.f25409p0 = m33837a(this.f25396c0.mo27692c());
            }
        }
        return this.f25409p0;
    }

    /* renamed from: m */
    private Drawable m33851m() {
        if (this.f25411r0 == null) {
            this.f25411r0 = this.f25396c0.mo27694e();
            if (this.f25411r0 == null && this.f25396c0.mo27696f() > 0) {
                this.f25411r0 = m33837a(this.f25396c0.mo27696f());
            }
        }
        return this.f25411r0;
    }

    /* renamed from: n */
    private Drawable m33852n() {
        if (this.f25410q0 == null) {
            this.f25410q0 = this.f25396c0.mo27702k();
            if (this.f25410q0 == null && this.f25396c0.mo27703l() > 0) {
                this.f25410q0 = m33837a(this.f25396c0.mo27703l());
            }
        }
        return this.f25410q0;
    }

    /* renamed from: o */
    private boolean m33853o() {
        C10727e eVar = this.f25390X;
        return eVar == null || !eVar.mo27722b();
    }

    /* renamed from: p */
    private void m33854p() {
        C10727e eVar = this.f25390X;
        if (eVar != null) {
            eVar.mo27721b(this);
        }
    }

    /* renamed from: q */
    private void m33855q() {
        C10727e eVar = this.f25390X;
        if (eVar != null) {
            eVar.mo27727e(this);
        }
    }

    /* renamed from: r */
    private synchronized void m33856r() {
        if (m33847i()) {
            Drawable drawable = null;
            if (this.f25393a0 == null) {
                drawable = m33851m();
            }
            if (drawable == null) {
                drawable = m33850l();
            }
            if (drawable == null) {
                drawable = m33852n();
            }
            this.f25400g0.mo20646a(drawable);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a4, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo27723c() {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.m33845b()     // Catch:{ all -> 0x00ad }
            g.f.a.w.l.c r0 = r3.f25388V     // Catch:{ all -> 0x00ad }
            r0.mo27821a()     // Catch:{ all -> 0x00ad }
            long r0 = p163g.p413f.p414a.p424w.C10770f.m33999a()     // Catch:{ all -> 0x00ad }
            r3.f25407n0 = r0     // Catch:{ all -> 0x00ad }
            java.lang.Object r0 = r3.f25393a0     // Catch:{ all -> 0x00ad }
            if (r0 != 0) goto L_0x003a
            int r0 = r3.f25397d0     // Catch:{ all -> 0x00ad }
            int r1 = r3.f25398e0     // Catch:{ all -> 0x00ad }
            boolean r0 = p163g.p413f.p414a.p424w.C10775k.m34033b(r0, r1)     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x0025
            int r0 = r3.f25397d0     // Catch:{ all -> 0x00ad }
            r3.f25412s0 = r0     // Catch:{ all -> 0x00ad }
            int r0 = r3.f25398e0     // Catch:{ all -> 0x00ad }
            r3.f25413t0 = r0     // Catch:{ all -> 0x00ad }
        L_0x0025:
            android.graphics.drawable.Drawable r0 = r3.m33851m()     // Catch:{ all -> 0x00ad }
            if (r0 != 0) goto L_0x002d
            r0 = 5
            goto L_0x002e
        L_0x002d:
            r0 = 3
        L_0x002e:
            com.bumptech.glide.load.n.q r1 = new com.bumptech.glide.load.n.q     // Catch:{ all -> 0x00ad }
            java.lang.String r2 = "Received nullMODEL"
            r1.<init>(r2)     // Catch:{ all -> 0x00ad }
            r3.m33839a(r1, r0)     // Catch:{ all -> 0x00ad }
            monitor-exit(r3)
            return
        L_0x003a:
            g.f.a.u.j$b r0 = r3.f25408o0     // Catch:{ all -> 0x00ad }
            g.f.a.u.j$b r1 = p163g.p413f.p414a.p420u.C10733j.C10735b.RUNNING     // Catch:{ all -> 0x00ad }
            if (r0 == r1) goto L_0x00a5
            g.f.a.u.j$b r0 = r3.f25408o0     // Catch:{ all -> 0x00ad }
            g.f.a.u.j$b r1 = p163g.p413f.p414a.p420u.C10733j.C10735b.COMPLETE     // Catch:{ all -> 0x00ad }
            if (r0 != r1) goto L_0x004f
            com.bumptech.glide.load.n.v<R> r0 = r3.f25405l0     // Catch:{ all -> 0x00ad }
            com.bumptech.glide.load.a r1 = com.bumptech.glide.load.C8105a.MEMORY_CACHE     // Catch:{ all -> 0x00ad }
            r3.mo27750a(r0, r1)     // Catch:{ all -> 0x00ad }
            monitor-exit(r3)
            return
        L_0x004f:
            g.f.a.u.j$b r0 = p163g.p413f.p414a.p420u.C10733j.C10735b.WAITING_FOR_SIZE     // Catch:{ all -> 0x00ad }
            r3.f25408o0 = r0     // Catch:{ all -> 0x00ad }
            int r0 = r3.f25397d0     // Catch:{ all -> 0x00ad }
            int r1 = r3.f25398e0     // Catch:{ all -> 0x00ad }
            boolean r0 = p163g.p413f.p414a.p424w.C10775k.m34033b(r0, r1)     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x0065
            int r0 = r3.f25397d0     // Catch:{ all -> 0x00ad }
            int r1 = r3.f25398e0     // Catch:{ all -> 0x00ad }
            r3.mo27751a(r0, r1)     // Catch:{ all -> 0x00ad }
            goto L_0x006a
        L_0x0065:
            g.f.a.u.l.i<R> r0 = r3.f25400g0     // Catch:{ all -> 0x00ad }
            r0.mo27739b(r3)     // Catch:{ all -> 0x00ad }
        L_0x006a:
            g.f.a.u.j$b r0 = r3.f25408o0     // Catch:{ all -> 0x00ad }
            g.f.a.u.j$b r1 = p163g.p413f.p414a.p420u.C10733j.C10735b.RUNNING     // Catch:{ all -> 0x00ad }
            if (r0 == r1) goto L_0x0076
            g.f.a.u.j$b r0 = r3.f25408o0     // Catch:{ all -> 0x00ad }
            g.f.a.u.j$b r1 = p163g.p413f.p414a.p420u.C10733j.C10735b.WAITING_FOR_SIZE     // Catch:{ all -> 0x00ad }
            if (r0 != r1) goto L_0x0085
        L_0x0076:
            boolean r0 = r3.m33847i()     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x0085
            g.f.a.u.l.i<R> r0 = r3.f25400g0     // Catch:{ all -> 0x00ad }
            android.graphics.drawable.Drawable r1 = r3.m33852n()     // Catch:{ all -> 0x00ad }
            r0.mo27738b(r1)     // Catch:{ all -> 0x00ad }
        L_0x0085:
            boolean r0 = f25386w0     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x00a3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ad }
            r0.<init>()     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = "finished run method in "
            r0.append(r1)     // Catch:{ all -> 0x00ad }
            long r1 = r3.f25407n0     // Catch:{ all -> 0x00ad }
            double r1 = p163g.p413f.p414a.p424w.C10770f.m33998a(r1)     // Catch:{ all -> 0x00ad }
            r0.append(r1)     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00ad }
            r3.m33842a(r0)     // Catch:{ all -> 0x00ad }
        L_0x00a3:
            monitor-exit(r3)
            return
        L_0x00a5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = "Cannot restart a running request"
            r0.<init>(r1)     // Catch:{ all -> 0x00ad }
            throw r0     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p413f.p414a.p420u.C10733j.mo27723c():void");
    }

    public synchronized void clear() {
        m33845b();
        this.f25388V.mo27821a();
        if (this.f25408o0 != C10735b.CLEARED) {
            m33849k();
            if (this.f25405l0 != null) {
                m33840a(this.f25405l0);
            }
            if (m33846h()) {
                this.f25400g0.mo27740c(m33852n());
            }
            this.f25408o0 = C10735b.CLEARED;
        }
    }

    /* renamed from: d */
    public C10786c mo21296d() {
        return this.f25388V;
    }

    /* renamed from: e */
    public synchronized boolean mo27728e() {
        return isComplete();
    }

    /* renamed from: f */
    public synchronized boolean mo27729f() {
        return this.f25408o0 == C10735b.FAILED;
    }

    /* renamed from: g */
    public synchronized boolean mo27731g() {
        return this.f25408o0 == C10735b.CLEARED;
    }

    public synchronized boolean isComplete() {
        return this.f25408o0 == C10735b.COMPLETE;
    }

    public synchronized boolean isRunning() {
        return this.f25408o0 == C10735b.RUNNING || this.f25408o0 == C10735b.WAITING_FOR_SIZE;
    }

    /* renamed from: b */
    private void m33845b() {
        if (this.f25395c) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* renamed from: a */
    public synchronized void mo27718a() {
        m33845b();
        this.f25391Y = null;
        this.f25392Z = null;
        this.f25393a0 = null;
        this.f25394b0 = null;
        this.f25396c0 = null;
        this.f25397d0 = -1;
        this.f25398e0 = -1;
        this.f25400g0 = null;
        this.f25401h0 = null;
        this.f25389W = null;
        this.f25390X = null;
        this.f25403j0 = null;
        this.f25406m0 = null;
        this.f25409p0 = null;
        this.f25410q0 = null;
        this.f25411r0 = null;
        this.f25412s0 = -1;
        this.f25413t0 = -1;
        this.f25414u0 = null;
        f25385v0.mo14667a(this);
    }

    /* renamed from: a */
    private void m33840a(C8258v<?> vVar) {
        this.f25402i0.mo21376b(vVar);
        this.f25405l0 = null;
    }

    /* renamed from: a */
    private Drawable m33837a(int i) {
        return C8400a.m24418a((Context) this.f25392Z, i, this.f25396c0.mo27708q() != null ? this.f25396c0.mo27708q() : this.f25391Y.getTheme());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f0, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo27751a(int r22, int r23) {
        /*
            r21 = this;
            r15 = r21
            monitor-enter(r21)
            g.f.a.w.l.c r0 = r15.f25388V     // Catch:{ all -> 0x00f7 }
            r0.mo27821a()     // Catch:{ all -> 0x00f7 }
            boolean r0 = f25386w0     // Catch:{ all -> 0x00f7 }
            if (r0 == 0) goto L_0x0026
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f7 }
            r0.<init>()     // Catch:{ all -> 0x00f7 }
            java.lang.String r1 = "Got onSizeReady in "
            r0.append(r1)     // Catch:{ all -> 0x00f7 }
            long r1 = r15.f25407n0     // Catch:{ all -> 0x00f7 }
            double r1 = p163g.p413f.p414a.p424w.C10770f.m33998a(r1)     // Catch:{ all -> 0x00f7 }
            r0.append(r1)     // Catch:{ all -> 0x00f7 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00f7 }
            r15.m33842a(r0)     // Catch:{ all -> 0x00f7 }
        L_0x0026:
            g.f.a.u.j$b r0 = r15.f25408o0     // Catch:{ all -> 0x00f7 }
            g.f.a.u.j$b r1 = p163g.p413f.p414a.p420u.C10733j.C10735b.WAITING_FOR_SIZE     // Catch:{ all -> 0x00f7 }
            if (r0 == r1) goto L_0x002e
            monitor-exit(r21)
            return
        L_0x002e:
            g.f.a.u.j$b r0 = p163g.p413f.p414a.p420u.C10733j.C10735b.RUNNING     // Catch:{ all -> 0x00f7 }
            r15.f25408o0 = r0     // Catch:{ all -> 0x00f7 }
            g.f.a.u.a<?> r0 = r15.f25396c0     // Catch:{ all -> 0x00f7 }
            float r0 = r0.mo27707p()     // Catch:{ all -> 0x00f7 }
            r1 = r22
            int r1 = m33836a(r1, r0)     // Catch:{ all -> 0x00f7 }
            r15.f25412s0 = r1     // Catch:{ all -> 0x00f7 }
            r1 = r23
            int r0 = m33836a(r1, r0)     // Catch:{ all -> 0x00f7 }
            r15.f25413t0 = r0     // Catch:{ all -> 0x00f7 }
            boolean r0 = f25386w0     // Catch:{ all -> 0x00f7 }
            if (r0 == 0) goto L_0x0066
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f7 }
            r0.<init>()     // Catch:{ all -> 0x00f7 }
            java.lang.String r1 = "finished setup for calling load in "
            r0.append(r1)     // Catch:{ all -> 0x00f7 }
            long r1 = r15.f25407n0     // Catch:{ all -> 0x00f7 }
            double r1 = p163g.p413f.p414a.p424w.C10770f.m33998a(r1)     // Catch:{ all -> 0x00f7 }
            r0.append(r1)     // Catch:{ all -> 0x00f7 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00f7 }
            r15.m33842a(r0)     // Catch:{ all -> 0x00f7 }
        L_0x0066:
            com.bumptech.glide.load.n.k r1 = r15.f25402i0     // Catch:{ all -> 0x00f7 }
            g.f.a.g r2 = r15.f25392Z     // Catch:{ all -> 0x00f7 }
            java.lang.Object r3 = r15.f25393a0     // Catch:{ all -> 0x00f7 }
            g.f.a.u.a<?> r0 = r15.f25396c0     // Catch:{ all -> 0x00f7 }
            com.bumptech.glide.load.g r4 = r0.mo27706o()     // Catch:{ all -> 0x00f7 }
            int r5 = r15.f25412s0     // Catch:{ all -> 0x00f7 }
            int r6 = r15.f25413t0     // Catch:{ all -> 0x00f7 }
            g.f.a.u.a<?> r0 = r15.f25396c0     // Catch:{ all -> 0x00f7 }
            java.lang.Class r7 = r0.mo27705n()     // Catch:{ all -> 0x00f7 }
            java.lang.Class<R> r8 = r15.f25394b0     // Catch:{ all -> 0x00f7 }
            g.f.a.j r9 = r15.f25399f0     // Catch:{ all -> 0x00f7 }
            g.f.a.u.a<?> r0 = r15.f25396c0     // Catch:{ all -> 0x00f7 }
            com.bumptech.glide.load.n.j r10 = r0.mo27690b()     // Catch:{ all -> 0x00f7 }
            g.f.a.u.a<?> r0 = r15.f25396c0     // Catch:{ all -> 0x00f7 }
            java.util.Map r11 = r0.mo27709r()     // Catch:{ all -> 0x00f7 }
            g.f.a.u.a<?> r0 = r15.f25396c0     // Catch:{ all -> 0x00f7 }
            boolean r12 = r0.mo27716y()     // Catch:{ all -> 0x00f7 }
            g.f.a.u.a<?> r0 = r15.f25396c0     // Catch:{ all -> 0x00f7 }
            boolean r13 = r0.mo27714w()     // Catch:{ all -> 0x00f7 }
            g.f.a.u.a<?> r0 = r15.f25396c0     // Catch:{ all -> 0x00f7 }
            com.bumptech.glide.load.i r14 = r0.mo27698h()     // Catch:{ all -> 0x00f7 }
            g.f.a.u.a<?> r0 = r15.f25396c0     // Catch:{ all -> 0x00f7 }
            boolean r0 = r0.mo27712u()     // Catch:{ all -> 0x00f7 }
            r22 = r0
            g.f.a.u.a<?> r0 = r15.f25396c0     // Catch:{ all -> 0x00f7 }
            boolean r16 = r0.mo27711t()     // Catch:{ all -> 0x00f7 }
            g.f.a.u.a<?> r0 = r15.f25396c0     // Catch:{ all -> 0x00f7 }
            boolean r17 = r0.mo27710s()     // Catch:{ all -> 0x00f7 }
            g.f.a.u.a<?> r0 = r15.f25396c0     // Catch:{ all -> 0x00f7 }
            boolean r18 = r0.mo27697g()     // Catch:{ all -> 0x00f7 }
            java.util.concurrent.Executor r0 = r15.f25404k0     // Catch:{ all -> 0x00f7 }
            r15 = r22
            r19 = r21
            r20 = r0
            com.bumptech.glide.load.n.k$d r0 = r1.mo21372a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x00f3 }
            r1 = r21
            r1.f25406m0 = r0     // Catch:{ all -> 0x00f1 }
            g.f.a.u.j$b r0 = r1.f25408o0     // Catch:{ all -> 0x00f1 }
            g.f.a.u.j$b r2 = p163g.p413f.p414a.p420u.C10733j.C10735b.RUNNING     // Catch:{ all -> 0x00f1 }
            if (r0 == r2) goto L_0x00d1
            r0 = 0
            r1.f25406m0 = r0     // Catch:{ all -> 0x00f1 }
        L_0x00d1:
            boolean r0 = f25386w0     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x00ef
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            r0.<init>()     // Catch:{ all -> 0x00f1 }
            java.lang.String r2 = "finished onSizeReady in "
            r0.append(r2)     // Catch:{ all -> 0x00f1 }
            long r2 = r1.f25407n0     // Catch:{ all -> 0x00f1 }
            double r2 = p163g.p413f.p414a.p424w.C10770f.m33998a(r2)     // Catch:{ all -> 0x00f1 }
            r0.append(r2)     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00f1 }
            r1.m33842a(r0)     // Catch:{ all -> 0x00f1 }
        L_0x00ef:
            monitor-exit(r21)
            return
        L_0x00f1:
            r0 = move-exception
            goto L_0x00f9
        L_0x00f3:
            r0 = move-exception
            r1 = r21
            goto L_0x00f9
        L_0x00f7:
            r0 = move-exception
            r1 = r15
        L_0x00f9:
            monitor-exit(r21)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p413f.p414a.p420u.C10733j.mo27751a(int, int):void");
    }

    /* renamed from: a */
    private static int m33836a(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * ((float) i));
    }

    /* renamed from: a */
    public synchronized void mo27750a(C8258v<?> vVar, C8105a aVar) {
        this.f25388V.mo27821a();
        this.f25406m0 = null;
        if (vVar == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected to receive a Resource<R> with an object of ");
            sb.append(this.f25394b0);
            sb.append(" inside, but instead got null.");
            mo27749a(new C8251q(sb.toString()));
            return;
        }
        Object obj = vVar.get();
        if (obj != null) {
            if (this.f25394b0.isAssignableFrom(obj.getClass())) {
                if (!m33848j()) {
                    m33840a(vVar);
                    this.f25408o0 = C10735b.COMPLETE;
                    return;
                }
                m33841a(vVar, obj, aVar);
                return;
            }
        }
        m33840a(vVar);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Expected to receive an object of ");
        sb2.append(this.f25394b0);
        sb2.append(" but instead got ");
        sb2.append(obj != null ? obj.getClass() : "");
        sb2.append("{");
        sb2.append(obj);
        sb2.append("} inside Resource{");
        sb2.append(vVar);
        sb2.append("}.");
        sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
        mo27749a(new C8251q(sb2.toString()));
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ac A[Catch:{ all -> 0x00be }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m33841a(com.bumptech.glide.load.p334n.C8258v<R> r11, R r12, com.bumptech.glide.load.C8105a r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r6 = r10.m33853o()     // Catch:{ all -> 0x00c2 }
            g.f.a.u.j$b r0 = p163g.p413f.p414a.p420u.C10733j.C10735b.COMPLETE     // Catch:{ all -> 0x00c2 }
            r10.f25408o0 = r0     // Catch:{ all -> 0x00c2 }
            r10.f25405l0 = r11     // Catch:{ all -> 0x00c2 }
            g.f.a.g r11 = r10.f25392Z     // Catch:{ all -> 0x00c2 }
            int r11 = r11.mo27540e()     // Catch:{ all -> 0x00c2 }
            r0 = 3
            if (r11 > r0) goto L_0x006b
            java.lang.String r11 = "Glide"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r0.<init>()     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = "Finished loading "
            r0.append(r1)     // Catch:{ all -> 0x00c2 }
            java.lang.Class r1 = r12.getClass()     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = r1.getSimpleName()     // Catch:{ all -> 0x00c2 }
            r0.append(r1)     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = " from "
            r0.append(r1)     // Catch:{ all -> 0x00c2 }
            r0.append(r13)     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = " for "
            r0.append(r1)     // Catch:{ all -> 0x00c2 }
            java.lang.Object r1 = r10.f25393a0     // Catch:{ all -> 0x00c2 }
            r0.append(r1)     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = " with size ["
            r0.append(r1)     // Catch:{ all -> 0x00c2 }
            int r1 = r10.f25412s0     // Catch:{ all -> 0x00c2 }
            r0.append(r1)     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = "x"
            r0.append(r1)     // Catch:{ all -> 0x00c2 }
            int r1 = r10.f25413t0     // Catch:{ all -> 0x00c2 }
            r0.append(r1)     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = "] in "
            r0.append(r1)     // Catch:{ all -> 0x00c2 }
            long r1 = r10.f25407n0     // Catch:{ all -> 0x00c2 }
            double r1 = p163g.p413f.p414a.p424w.C10770f.m33998a(r1)     // Catch:{ all -> 0x00c2 }
            r0.append(r1)     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = " ms"
            r0.append(r1)     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00c2 }
            android.util.Log.d(r11, r0)     // Catch:{ all -> 0x00c2 }
        L_0x006b:
            r11 = 1
            r10.f25395c = r11     // Catch:{ all -> 0x00c2 }
            r7 = 0
            java.util.List<g.f.a.u.g<R>> r0 = r10.f25401h0     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x0093
            java.util.List<g.f.a.u.g<R>> r0 = r10.f25401h0     // Catch:{ all -> 0x00be }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x00be }
            r9 = 0
        L_0x007a:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x0094
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x00be }
            g.f.a.u.g r0 = (p163g.p413f.p414a.p420u.C10730g) r0     // Catch:{ all -> 0x00be }
            java.lang.Object r2 = r10.f25393a0     // Catch:{ all -> 0x00be }
            g.f.a.u.l.i<R> r3 = r10.f25400g0     // Catch:{ all -> 0x00be }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.mo27737a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00be }
            r9 = r9 | r0
            goto L_0x007a
        L_0x0093:
            r9 = 0
        L_0x0094:
            g.f.a.u.g<R> r0 = r10.f25389W     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x00a8
            g.f.a.u.g<R> r0 = r10.f25389W     // Catch:{ all -> 0x00be }
            java.lang.Object r2 = r10.f25393a0     // Catch:{ all -> 0x00be }
            g.f.a.u.l.i<R> r3 = r10.f25400g0     // Catch:{ all -> 0x00be }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.mo27737a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r11 = 0
        L_0x00a9:
            r11 = r11 | r9
            if (r11 != 0) goto L_0x00b7
            g.f.a.u.m.e<? super R> r11 = r10.f25403j0     // Catch:{ all -> 0x00be }
            g.f.a.u.m.d r11 = r11.mo27772a(r13, r6)     // Catch:{ all -> 0x00be }
            g.f.a.u.l.i<R> r13 = r10.f25400g0     // Catch:{ all -> 0x00be }
            r13.mo20648a(r12, r11)     // Catch:{ all -> 0x00be }
        L_0x00b7:
            r10.f25395c = r7     // Catch:{ all -> 0x00c2 }
            r10.m33855q()     // Catch:{ all -> 0x00c2 }
            monitor-exit(r10)
            return
        L_0x00be:
            r11 = move-exception
            r10.f25395c = r7     // Catch:{ all -> 0x00c2 }
            throw r11     // Catch:{ all -> 0x00c2 }
        L_0x00c2:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p413f.p414a.p420u.C10733j.m33841a(com.bumptech.glide.load.n.v, java.lang.Object, com.bumptech.glide.load.a):void");
    }

    /* renamed from: a */
    public synchronized void mo27749a(C8251q qVar) {
        m33839a(qVar, 5);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private synchronized void m33839a(C8251q qVar, int i) {
        boolean z;
        this.f25388V.mo27821a();
        qVar.mo21420a((Exception) this.f25414u0);
        int e = this.f25392Z.mo27540e();
        if (e <= i) {
            StringBuilder sb = new StringBuilder();
            sb.append("Load failed for ");
            sb.append(this.f25393a0);
            sb.append(" with size [");
            sb.append(this.f25412s0);
            sb.append("x");
            sb.append(this.f25413t0);
            sb.append("]");
            Log.w("Glide", sb.toString(), qVar);
            if (e <= 4) {
                qVar.mo21421a("Glide");
            }
        }
        this.f25406m0 = null;
        this.f25408o0 = C10735b.FAILED;
        boolean z2 = true;
        this.f25395c = true;
        try {
            if (this.f25401h0 != null) {
                z = false;
                for (C10730g a : this.f25401h0) {
                    z |= a.mo27736a(qVar, this.f25393a0, this.f25400g0, m33853o());
                }
            } else {
                z = false;
            }
            if (this.f25389W == null || !this.f25389W.mo27736a(qVar, this.f25393a0, this.f25400g0, m33853o())) {
                z2 = false;
            }
            if (!z && !z2) {
                m33856r();
            }
            this.f25395c = false;
            m33854p();
        } catch (Throwable th) {
            this.f25395c = false;
            throw th;
        }
    }

    /* renamed from: a */
    public synchronized boolean mo27720a(C10726d dVar) {
        boolean z = false;
        if (!(dVar instanceof C10733j)) {
            return false;
        }
        C10733j jVar = (C10733j) dVar;
        synchronized (jVar) {
            if (this.f25397d0 == jVar.f25397d0 && this.f25398e0 == jVar.f25398e0 && C10775k.m34030a(this.f25393a0, jVar.f25393a0) && this.f25394b0.equals(jVar.f25394b0) && this.f25396c0.equals(jVar.f25396c0) && this.f25399f0 == jVar.f25399f0 && m33843a(jVar)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    private synchronized boolean m33843a(C10733j<?> jVar) {
        boolean z;
        synchronized (jVar) {
            z = false;
            if ((this.f25401h0 == null ? 0 : this.f25401h0.size()) == (jVar.f25401h0 == null ? 0 : jVar.f25401h0.size())) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    private void m33842a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" this: ");
        sb.append(this.f25387U);
        Log.v("Request", sb.toString());
    }
}
