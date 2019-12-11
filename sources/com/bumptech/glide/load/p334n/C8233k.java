package com.bumptech.glide.load.p334n;

import android.util.Log;
import com.bumptech.glide.load.C8111g;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.C8118l;
import com.bumptech.glide.load.p334n.p336b0.C8178a;
import com.bumptech.glide.load.p334n.p336b0.C8178a.C8179a;
import com.bumptech.glide.load.p334n.p336b0.C8181b;
import com.bumptech.glide.load.p334n.p336b0.C8191h;
import com.bumptech.glide.load.p334n.p336b0.C8191h.C8192a;
import com.bumptech.glide.load.p334n.p337c0.C8201a;
import java.util.Map;
import p096e.p121h.p134r.C4114f;
import p163g.p413f.p414a.C10654g;
import p163g.p413f.p414a.C10657j;
import p163g.p413f.p414a.p420u.C10732i;
import p163g.p413f.p414a.p424w.C10770f;
import p163g.p413f.p414a.p424w.C10774j;
import p163g.p413f.p414a.p424w.p425l.C10777a;
import p163g.p413f.p414a.p424w.p425l.C10777a.C10781d;

/* renamed from: com.bumptech.glide.load.n.k */
/* compiled from: Engine */
public class C8233k implements C8246m, C8192a, C8250a {

    /* renamed from: i */
    private static final boolean f17611i = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    private final C8254s f17612a;

    /* renamed from: b */
    private final C8248o f17613b;

    /* renamed from: c */
    private final C8191h f17614c;

    /* renamed from: d */
    private final C8236b f17615d;

    /* renamed from: e */
    private final C8261y f17616e;

    /* renamed from: f */
    private final C8238c f17617f;

    /* renamed from: g */
    private final C8234a f17618g;

    /* renamed from: h */
    private final C8147a f17619h;

    /* renamed from: com.bumptech.glide.load.n.k$a */
    /* compiled from: Engine */
    static class C8234a {

        /* renamed from: a */
        final C8221e f17620a;

        /* renamed from: b */
        final C4114f<C8216h<?>> f17621b = C10777a.m34038a(150, (C10781d<T>) new C8235a<T>());

        /* renamed from: c */
        private int f17622c;

        /* renamed from: com.bumptech.glide.load.n.k$a$a */
        /* compiled from: Engine */
        class C8235a implements C10781d<C8216h<?>> {
            C8235a() {
            }

            public C8216h<?> create() {
                C8234a aVar = C8234a.this;
                return new C8216h<>(aVar.f17620a, aVar.f17621b);
            }
        }

        C8234a(C8221e eVar) {
            this.f17620a = eVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public <R> C8216h<R> mo21377a(C10654g gVar, Object obj, C8247n nVar, C8111g gVar2, int i, int i2, Class<?> cls, Class<R> cls2, C10657j jVar, C8227j jVar2, Map<Class<?>, C8118l<?>> map, boolean z, boolean z2, boolean z3, C8115i iVar, C8218b<R> bVar) {
            C10654g gVar3 = gVar;
            Object obj2 = obj;
            C8247n nVar2 = nVar;
            C8111g gVar4 = gVar2;
            int i3 = i;
            int i4 = i2;
            Class<?> cls3 = cls;
            Class<R> cls4 = cls2;
            C10657j jVar3 = jVar;
            C8227j jVar4 = jVar2;
            Map<Class<?>, C8118l<?>> map2 = map;
            boolean z4 = z;
            boolean z5 = z2;
            boolean z6 = z3;
            C8115i iVar2 = iVar;
            C8218b<R> bVar2 = bVar;
            C8216h hVar = (C8216h) this.f17621b.mo14666a();
            C10774j.m34012a(hVar);
            C8216h<R> hVar2 = hVar;
            C8216h<R> hVar3 = hVar2;
            int i5 = this.f17622c;
            int i6 = i5;
            this.f17622c = i5 + 1;
            hVar3.mo21346a(gVar3, obj2, nVar2, gVar4, i3, i4, cls3, cls4, jVar3, jVar4, map2, z4, z5, z6, iVar2, bVar2, i6);
            return hVar2;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.k$b */
    /* compiled from: Engine */
    static class C8236b {

        /* renamed from: a */
        final C8201a f17624a;

        /* renamed from: b */
        final C8201a f17625b;

        /* renamed from: c */
        final C8201a f17626c;

        /* renamed from: d */
        final C8201a f17627d;

        /* renamed from: e */
        final C8246m f17628e;

        /* renamed from: f */
        final C4114f<C8240l<?>> f17629f = C10777a.m34038a(150, (C10781d<T>) new C8237a<T>());

        /* renamed from: com.bumptech.glide.load.n.k$b$a */
        /* compiled from: Engine */
        class C8237a implements C10781d<C8240l<?>> {
            C8237a() {
            }

            public C8240l<?> create() {
                C8236b bVar = C8236b.this;
                C8240l lVar = new C8240l(bVar.f17624a, bVar.f17625b, bVar.f17626c, bVar.f17627d, bVar.f17628e, bVar.f17629f);
                return lVar;
            }
        }

        C8236b(C8201a aVar, C8201a aVar2, C8201a aVar3, C8201a aVar4, C8246m mVar) {
            this.f17624a = aVar;
            this.f17625b = aVar2;
            this.f17626c = aVar3;
            this.f17627d = aVar4;
            this.f17628e = mVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public <R> C8240l<R> mo21378a(C8111g gVar, boolean z, boolean z2, boolean z3, boolean z4) {
            C8240l<R> lVar = (C8240l) this.f17629f.mo14666a();
            C10774j.m34012a(lVar);
            C8240l<R> lVar2 = lVar;
            lVar2.mo21380a(gVar, z, z2, z3, z4);
            return lVar2;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.k$c */
    /* compiled from: Engine */
    private static class C8238c implements C8221e {

        /* renamed from: a */
        private final C8179a f17631a;

        /* renamed from: b */
        private volatile C8178a f17632b;

        C8238c(C8179a aVar) {
            this.f17631a = aVar;
        }

        /* renamed from: a */
        public C8178a mo21361a() {
            if (this.f17632b == null) {
                synchronized (this) {
                    if (this.f17632b == null) {
                        this.f17632b = this.f17631a.build();
                    }
                    if (this.f17632b == null) {
                        this.f17632b = new C8181b();
                    }
                }
            }
            return this.f17632b;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.k$d */
    /* compiled from: Engine */
    public class C8239d {

        /* renamed from: a */
        private final C8240l<?> f17633a;

        /* renamed from: b */
        private final C10732i f17634b;

        C8239d(C10732i iVar, C8240l<?> lVar) {
            this.f17634b = iVar;
            this.f17633a = lVar;
        }

        /* renamed from: a */
        public void mo21379a() {
            synchronized (C8233k.this) {
                this.f17633a.mo21389c(this.f17634b);
            }
        }
    }

    public C8233k(C8191h hVar, C8179a aVar, C8201a aVar2, C8201a aVar3, C8201a aVar4, C8201a aVar5, boolean z) {
        this(hVar, aVar, aVar2, aVar3, aVar4, aVar5, null, null, null, null, null, null, z);
    }

    /* renamed from: b */
    private C8249p<?> m23926b(C8111g gVar, boolean z) {
        if (!z) {
            return null;
        }
        C8249p<?> a = m23923a(gVar);
        if (a != null) {
            a.mo21410c();
            this.f17619h.mo21207a(gVar, a);
        }
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <R> com.bumptech.glide.load.p334n.C8233k.C8239d mo21372a(p163g.p413f.p414a.C10654g r31, java.lang.Object r32, com.bumptech.glide.load.C8111g r33, int r34, int r35, java.lang.Class<?> r36, java.lang.Class<R> r37, p163g.p413f.p414a.C10657j r38, com.bumptech.glide.load.p334n.C8227j r39, java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.C8118l<?>> r40, boolean r41, boolean r42, com.bumptech.glide.load.C8115i r43, boolean r44, boolean r45, boolean r46, boolean r47, p163g.p413f.p414a.p420u.C10732i r48, java.util.concurrent.Executor r49) {
        /*
            r30 = this;
            r1 = r30
            r0 = r44
            r8 = r48
            r9 = r49
            monitor-enter(r30)
            boolean r2 = f17611i     // Catch:{ all -> 0x00c5 }
            if (r2 == 0) goto L_0x0012
            long r2 = p163g.p413f.p414a.p424w.C10770f.m33999a()     // Catch:{ all -> 0x00c5 }
            goto L_0x0014
        L_0x0012:
            r2 = 0
        L_0x0014:
            r10 = r2
            com.bumptech.glide.load.n.o r12 = r1.f17613b     // Catch:{ all -> 0x00c5 }
            r13 = r32
            r14 = r33
            r15 = r34
            r16 = r35
            r17 = r40
            r18 = r36
            r19 = r37
            r20 = r43
            com.bumptech.glide.load.n.n r12 = r12.mo21406a(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x00c5 }
            com.bumptech.glide.load.n.p r2 = r1.m23924a(r12, r0)     // Catch:{ all -> 0x00c5 }
            r3 = 0
            if (r2 == 0) goto L_0x0042
            com.bumptech.glide.load.a r0 = com.bumptech.glide.load.C8105a.MEMORY_CACHE     // Catch:{ all -> 0x00c5 }
            r8.mo27750a(r2, r0)     // Catch:{ all -> 0x00c5 }
            boolean r0 = f17611i     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = "Loaded resource from active resources"
            m23925a(r0, r10, r12)     // Catch:{ all -> 0x00c5 }
        L_0x0040:
            monitor-exit(r30)
            return r3
        L_0x0042:
            com.bumptech.glide.load.n.p r2 = r1.m23926b(r12, r0)     // Catch:{ all -> 0x00c5 }
            if (r2 == 0) goto L_0x0058
            com.bumptech.glide.load.a r0 = com.bumptech.glide.load.C8105a.MEMORY_CACHE     // Catch:{ all -> 0x00c5 }
            r8.mo27750a(r2, r0)     // Catch:{ all -> 0x00c5 }
            boolean r0 = f17611i     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = "Loaded resource from cache"
            m23925a(r0, r10, r12)     // Catch:{ all -> 0x00c5 }
        L_0x0056:
            monitor-exit(r30)
            return r3
        L_0x0058:
            com.bumptech.glide.load.n.s r2 = r1.f17612a     // Catch:{ all -> 0x00c5 }
            r15 = r47
            com.bumptech.glide.load.n.l r2 = r2.mo21432a(r12, r15)     // Catch:{ all -> 0x00c5 }
            if (r2 == 0) goto L_0x0075
            r2.mo21384a(r8, r9)     // Catch:{ all -> 0x00c5 }
            boolean r0 = f17611i     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x006e
            java.lang.String r0 = "Added to existing load"
            m23925a(r0, r10, r12)     // Catch:{ all -> 0x00c5 }
        L_0x006e:
            com.bumptech.glide.load.n.k$d r0 = new com.bumptech.glide.load.n.k$d     // Catch:{ all -> 0x00c5 }
            r0.<init>(r8, r2)     // Catch:{ all -> 0x00c5 }
            monitor-exit(r30)
            return r0
        L_0x0075:
            com.bumptech.glide.load.n.k$b r2 = r1.f17615d     // Catch:{ all -> 0x00c5 }
            r3 = r12
            r4 = r44
            r5 = r45
            r6 = r46
            r7 = r47
            com.bumptech.glide.load.n.l r0 = r2.mo21378a(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00c5 }
            com.bumptech.glide.load.n.k$a r13 = r1.f17618g     // Catch:{ all -> 0x00c5 }
            r14 = r31
            r15 = r32
            r16 = r12
            r17 = r33
            r18 = r34
            r19 = r35
            r20 = r36
            r21 = r37
            r22 = r38
            r23 = r39
            r24 = r40
            r25 = r41
            r26 = r42
            r27 = r47
            r28 = r43
            r29 = r0
            com.bumptech.glide.load.n.h r2 = r13.mo21377a(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x00c5 }
            com.bumptech.glide.load.n.s r3 = r1.f17612a     // Catch:{ all -> 0x00c5 }
            r3.mo21433a(r12, r0)     // Catch:{ all -> 0x00c5 }
            r0.mo21384a(r8, r9)     // Catch:{ all -> 0x00c5 }
            r0.mo21386b(r2)     // Catch:{ all -> 0x00c5 }
            boolean r2 = f17611i     // Catch:{ all -> 0x00c5 }
            if (r2 == 0) goto L_0x00be
            java.lang.String r2 = "Started new load"
            m23925a(r2, r10, r12)     // Catch:{ all -> 0x00c5 }
        L_0x00be:
            com.bumptech.glide.load.n.k$d r2 = new com.bumptech.glide.load.n.k$d     // Catch:{ all -> 0x00c5 }
            r2.<init>(r8, r0)     // Catch:{ all -> 0x00c5 }
            monitor-exit(r30)
            return r2
        L_0x00c5:
            r0 = move-exception
            monitor-exit(r30)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p334n.C8233k.mo21372a(g.f.a.g, java.lang.Object, com.bumptech.glide.load.g, int, int, java.lang.Class, java.lang.Class, g.f.a.j, com.bumptech.glide.load.n.j, java.util.Map, boolean, boolean, com.bumptech.glide.load.i, boolean, boolean, boolean, boolean, g.f.a.u.i, java.util.concurrent.Executor):com.bumptech.glide.load.n.k$d");
    }

    C8233k(C8191h hVar, C8179a aVar, C8201a aVar2, C8201a aVar3, C8201a aVar4, C8201a aVar5, C8254s sVar, C8248o oVar, C8147a aVar6, C8236b bVar, C8234a aVar7, C8261y yVar, boolean z) {
        this.f17614c = hVar;
        C8179a aVar8 = aVar;
        this.f17617f = new C8238c(aVar);
        C8147a aVar9 = aVar6 == null ? new C8147a(z) : aVar6;
        this.f17619h = aVar9;
        aVar9.mo21209a((C8250a) this);
        this.f17613b = oVar == null ? new C8248o() : oVar;
        this.f17612a = sVar == null ? new C8254s() : sVar;
        this.f17615d = bVar == null ? new C8236b(aVar2, aVar3, aVar4, aVar5, this) : bVar;
        this.f17618g = aVar7 == null ? new C8234a(this.f17617f) : aVar7;
        this.f17616e = yVar == null ? new C8261y() : yVar;
        hVar.mo21282a((C8192a) this);
    }

    /* renamed from: b */
    public void mo21376b(C8258v<?> vVar) {
        if (vVar instanceof C8249p) {
            ((C8249p) vVar).mo21413f();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    /* renamed from: a */
    private static void m23925a(String str, long j, C8111g gVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C10770f.m33998a(j));
        sb.append("ms, key: ");
        sb.append(gVar);
        Log.v("Engine", sb.toString());
    }

    /* renamed from: a */
    private C8249p<?> m23924a(C8111g gVar, boolean z) {
        if (!z) {
            return null;
        }
        C8249p<?> b = this.f17619h.mo21210b(gVar);
        if (b != null) {
            b.mo21410c();
        }
        return b;
    }

    /* renamed from: a */
    private C8249p<?> m23923a(C8111g gVar) {
        C8258v a = this.f17614c.mo21279a(gVar);
        if (a == null) {
            return null;
        }
        if (a instanceof C8249p) {
            return (C8249p) a;
        }
        return new C8249p(a, true, true);
    }

    /* renamed from: a */
    public synchronized void mo21375a(C8240l<?> lVar, C8111g gVar, C8249p<?> pVar) {
        if (pVar != null) {
            pVar.mo21408a(gVar, this);
            if (pVar.mo21412e()) {
                this.f17619h.mo21207a(gVar, pVar);
            }
        }
        this.f17612a.mo21434b(gVar, lVar);
    }

    /* renamed from: a */
    public synchronized void mo21374a(C8240l<?> lVar, C8111g gVar) {
        this.f17612a.mo21434b(gVar, lVar);
    }

    /* renamed from: a */
    public void mo21287a(C8258v<?> vVar) {
        this.f17616e.mo21439a(vVar);
    }

    /* renamed from: a */
    public synchronized void mo21373a(C8111g gVar, C8249p<?> pVar) {
        this.f17619h.mo21206a(gVar);
        if (pVar.mo21412e()) {
            this.f17614c.mo21280a(gVar, pVar);
        } else {
            this.f17616e.mo21439a(pVar);
        }
    }
}
