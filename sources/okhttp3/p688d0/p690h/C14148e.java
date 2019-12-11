package okhttp3.p688d0.p690h;

import java.io.IOException;
import okhttp3.C14232e;
import okhttp3.C14252r;
import okhttp3.C14266z;
import okhttp3.Call;
import okhttp3.Interceptor.Chain;
import okhttp3.OkHttpClient;
import okhttp3.p688d0.C14126e;
import okhttp3.p688d0.p690h.C14153j.C14154a;
import okhttp3.p688d0.p691i.C14160c;

/* renamed from: okhttp3.d0.h.e */
/* compiled from: ExchangeFinder */
final class C14148e {

    /* renamed from: a */
    private final C14155k f31422a;

    /* renamed from: b */
    private final C14232e f31423b;

    /* renamed from: c */
    private final C14150g f31424c;

    /* renamed from: d */
    private final Call f31425d;

    /* renamed from: e */
    private final C14252r f31426e;

    /* renamed from: f */
    private C14154a f31427f;

    /* renamed from: g */
    private final C14153j f31428g;

    /* renamed from: h */
    private C14149f f31429h;

    /* renamed from: i */
    private boolean f31430i;

    /* renamed from: j */
    private C14266z f31431j;

    C14148e(C14155k kVar, C14150g gVar, C14232e eVar, Call call, C14252r rVar) {
        this.f31422a = kVar;
        this.f31424c = gVar;
        this.f31423b = eVar;
        this.f31425d = call;
        this.f31426e = rVar;
        this.f31428g = new C14153j(eVar, gVar.f31453e, call, rVar);
    }

    /* renamed from: e */
    private boolean m44929e() {
        C14149f fVar = this.f31422a.f31476i;
        return fVar != null && fVar.f31442l == 0 && C14126e.m44835a(fVar.mo35967f().mo36280a().mo36176k(), this.f31423b.mo36176k());
    }

    /* renamed from: a */
    public C14160c mo35950a(OkHttpClient okHttpClient, Chain chain, boolean z) {
        try {
            return m44928a(chain.mo35784d(), chain.mo35782b(), chain.mo35783c(), okHttpClient.mo35804r(), okHttpClient.mo35810x(), z).mo35954a(okHttpClient, chain);
        } catch (C14152i e) {
            mo35953d();
            throw e;
        } catch (IOException e2) {
            mo35953d();
            throw new C14152i(e2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
        return r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo35951b() {
        /*
            r3 = this;
            okhttp3.d0.h.g r0 = r3.f31424c
            monitor-enter(r0)
            okhttp3.z r1 = r3.f31431j     // Catch:{ all -> 0x0034 }
            r2 = 1
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return r2
        L_0x000a:
            boolean r1 = r3.m44929e()     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x001c
            okhttp3.d0.h.k r1 = r3.f31422a     // Catch:{ all -> 0x0034 }
            okhttp3.d0.h.f r1 = r1.f31476i     // Catch:{ all -> 0x0034 }
            okhttp3.z r1 = r1.mo35967f()     // Catch:{ all -> 0x0034 }
            r3.f31431j = r1     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return r2
        L_0x001c:
            okhttp3.d0.h.j$a r1 = r3.f31427f     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0028
            okhttp3.d0.h.j$a r1 = r3.f31427f     // Catch:{ all -> 0x0034 }
            boolean r1 = r1.mo35985b()     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x0032
        L_0x0028:
            okhttp3.d0.h.j r1 = r3.f31428g     // Catch:{ all -> 0x0034 }
            boolean r1 = r1.mo35982a()     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r2 = 0
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return r2
        L_0x0034:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.p688d0.p690h.C14148e.mo35951b():boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo35952c() {
        boolean z;
        synchronized (this.f31424c) {
            z = this.f31430i;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo35953d() {
        synchronized (this.f31424c) {
            this.f31430i = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0.mo35962a(r9) != false) goto L_0x0018;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private okhttp3.p688d0.p690h.C14149f m44928a(int r4, int r5, int r6, int r7, boolean r8, boolean r9) throws java.io.IOException {
        /*
            r3 = this;
        L_0x0000:
            okhttp3.d0.h.f r0 = r3.m44927a(r4, r5, r6, r7, r8)
            okhttp3.d0.h.g r1 = r3.f31424c
            monitor-enter(r1)
            int r2 = r0.f31443m     // Catch:{ all -> 0x0019 }
            if (r2 != 0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            return r0
        L_0x000d:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            boolean r1 = r0.mo35962a(r9)
            if (r1 != 0) goto L_0x0018
            r0.mo35966e()
            goto L_0x0000
        L_0x0018:
            return r0
        L_0x0019:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.p688d0.p690h.C14148e.m44928a(int, int, int, int, boolean, boolean):okhttp3.d0.h.f");
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private okhttp3.p688d0.p690h.C14149f m44927a(int r19, int r20, int r21, int r22, boolean r23) throws java.io.IOException {
        /*
            r18 = this;
            r1 = r18
            okhttp3.d0.h.g r2 = r1.f31424c
            monitor-enter(r2)
            okhttp3.d0.h.k r0 = r1.f31422a     // Catch:{ all -> 0x014a }
            boolean r0 = r0.mo35997f()     // Catch:{ all -> 0x014a }
            if (r0 != 0) goto L_0x0142
            r0 = 0
            r1.f31430i = r0     // Catch:{ all -> 0x014a }
            okhttp3.d0.h.k r3 = r1.f31422a     // Catch:{ all -> 0x014a }
            okhttp3.d0.h.f r3 = r3.f31476i     // Catch:{ all -> 0x014a }
            okhttp3.d0.h.k r4 = r1.f31422a     // Catch:{ all -> 0x014a }
            okhttp3.d0.h.f r4 = r4.f31476i     // Catch:{ all -> 0x014a }
            r5 = 0
            if (r4 == 0) goto L_0x002a
            okhttp3.d0.h.k r4 = r1.f31422a     // Catch:{ all -> 0x014a }
            okhttp3.d0.h.f r4 = r4.f31476i     // Catch:{ all -> 0x014a }
            boolean r4 = r4.f31441k     // Catch:{ all -> 0x014a }
            if (r4 == 0) goto L_0x002a
            okhttp3.d0.h.k r4 = r1.f31422a     // Catch:{ all -> 0x014a }
            java.net.Socket r4 = r4.mo35998g()     // Catch:{ all -> 0x014a }
            goto L_0x002b
        L_0x002a:
            r4 = r5
        L_0x002b:
            okhttp3.d0.h.k r6 = r1.f31422a     // Catch:{ all -> 0x014a }
            okhttp3.d0.h.f r6 = r6.f31476i     // Catch:{ all -> 0x014a }
            if (r6 == 0) goto L_0x0037
            okhttp3.d0.h.k r3 = r1.f31422a     // Catch:{ all -> 0x014a }
            okhttp3.d0.h.f r3 = r3.f31476i     // Catch:{ all -> 0x014a }
            r6 = r5
            goto L_0x0039
        L_0x0037:
            r6 = r3
            r3 = r5
        L_0x0039:
            r7 = 1
            if (r3 != 0) goto L_0x006a
            okhttp3.d0.h.g r8 = r1.f31424c     // Catch:{ all -> 0x014a }
            okhttp3.e r9 = r1.f31423b     // Catch:{ all -> 0x014a }
            okhttp3.d0.h.k r10 = r1.f31422a     // Catch:{ all -> 0x014a }
            boolean r8 = r8.mo35974a(r9, r10, r5, r0)     // Catch:{ all -> 0x014a }
            if (r8 == 0) goto L_0x0050
            okhttp3.d0.h.k r3 = r1.f31422a     // Catch:{ all -> 0x014a }
            okhttp3.d0.h.f r3 = r3.f31476i     // Catch:{ all -> 0x014a }
            r8 = r3
            r9 = r5
            r3 = 1
            goto L_0x006d
        L_0x0050:
            okhttp3.z r8 = r1.f31431j     // Catch:{ all -> 0x014a }
            if (r8 == 0) goto L_0x005b
            okhttp3.z r8 = r1.f31431j     // Catch:{ all -> 0x014a }
            r1.f31431j = r5     // Catch:{ all -> 0x014a }
        L_0x0058:
            r9 = r8
            r8 = r3
            goto L_0x006c
        L_0x005b:
            boolean r8 = r18.m44929e()     // Catch:{ all -> 0x014a }
            if (r8 == 0) goto L_0x006a
            okhttp3.d0.h.k r8 = r1.f31422a     // Catch:{ all -> 0x014a }
            okhttp3.d0.h.f r8 = r8.f31476i     // Catch:{ all -> 0x014a }
            okhttp3.z r8 = r8.mo35967f()     // Catch:{ all -> 0x014a }
            goto L_0x0058
        L_0x006a:
            r8 = r3
            r9 = r5
        L_0x006c:
            r3 = 0
        L_0x006d:
            monitor-exit(r2)     // Catch:{ all -> 0x014a }
            okhttp3.p688d0.C14126e.m44832a(r4)
            if (r6 == 0) goto L_0x007a
            okhttp3.r r2 = r1.f31426e
            okhttp3.Call r4 = r1.f31425d
            r2.mo36229b(r4, r6)
        L_0x007a:
            if (r3 == 0) goto L_0x0083
            okhttp3.r r2 = r1.f31426e
            okhttp3.Call r4 = r1.f31425d
            r2.mo36224a(r4, r8)
        L_0x0083:
            if (r8 == 0) goto L_0x0086
            return r8
        L_0x0086:
            if (r9 != 0) goto L_0x009c
            okhttp3.d0.h.j$a r2 = r1.f31427f
            if (r2 == 0) goto L_0x0092
            boolean r2 = r2.mo35985b()
            if (r2 != 0) goto L_0x009c
        L_0x0092:
            okhttp3.d0.h.j r2 = r1.f31428g
            okhttp3.d0.h.j$a r2 = r2.mo35983b()
            r1.f31427f = r2
            r2 = 1
            goto L_0x009d
        L_0x009c:
            r2 = 0
        L_0x009d:
            okhttp3.d0.h.g r4 = r1.f31424c
            monitor-enter(r4)
            okhttp3.d0.h.k r6 = r1.f31422a     // Catch:{ all -> 0x013f }
            boolean r6 = r6.mo35997f()     // Catch:{ all -> 0x013f }
            if (r6 != 0) goto L_0x0137
            if (r2 == 0) goto L_0x00c2
            okhttp3.d0.h.j$a r2 = r1.f31427f     // Catch:{ all -> 0x013f }
            java.util.List r2 = r2.mo35984a()     // Catch:{ all -> 0x013f }
            okhttp3.d0.h.g r6 = r1.f31424c     // Catch:{ all -> 0x013f }
            okhttp3.e r10 = r1.f31423b     // Catch:{ all -> 0x013f }
            okhttp3.d0.h.k r11 = r1.f31422a     // Catch:{ all -> 0x013f }
            boolean r0 = r6.mo35974a(r10, r11, r2, r0)     // Catch:{ all -> 0x013f }
            if (r0 == 0) goto L_0x00c3
            okhttp3.d0.h.k r0 = r1.f31422a     // Catch:{ all -> 0x013f }
            okhttp3.d0.h.f r8 = r0.f31476i     // Catch:{ all -> 0x013f }
            r3 = 1
            goto L_0x00c3
        L_0x00c2:
            r2 = r5
        L_0x00c3:
            if (r3 != 0) goto L_0x00d6
            if (r9 != 0) goto L_0x00cd
            okhttp3.d0.h.j$a r0 = r1.f31427f     // Catch:{ all -> 0x013f }
            okhttp3.z r9 = r0.mo35986c()     // Catch:{ all -> 0x013f }
        L_0x00cd:
            okhttp3.d0.h.f r8 = new okhttp3.d0.h.f     // Catch:{ all -> 0x013f }
            okhttp3.d0.h.g r0 = r1.f31424c     // Catch:{ all -> 0x013f }
            r8.<init>(r0, r9)     // Catch:{ all -> 0x013f }
            r1.f31429h = r8     // Catch:{ all -> 0x013f }
        L_0x00d6:
            monitor-exit(r4)     // Catch:{ all -> 0x013f }
            if (r3 == 0) goto L_0x00e1
            okhttp3.r r0 = r1.f31426e
            okhttp3.Call r2 = r1.f31425d
            r0.mo36224a(r2, r8)
            return r8
        L_0x00e1:
            okhttp3.Call r0 = r1.f31425d
            okhttp3.r r3 = r1.f31426e
            r10 = r8
            r11 = r19
            r12 = r20
            r13 = r21
            r14 = r22
            r15 = r23
            r16 = r0
            r17 = r3
            r10.mo35956a(r11, r12, r13, r14, r15, r16, r17)
            okhttp3.d0.h.g r0 = r1.f31424c
            okhttp3.d0.h.h r0 = r0.f31453e
            okhttp3.z r3 = r8.mo35967f()
            r0.mo35976a(r3)
            okhttp3.d0.h.g r3 = r1.f31424c
            monitor-enter(r3)
            r1.f31429h = r5     // Catch:{ all -> 0x0134 }
            okhttp3.d0.h.g r0 = r1.f31424c     // Catch:{ all -> 0x0134 }
            okhttp3.e r4 = r1.f31423b     // Catch:{ all -> 0x0134 }
            okhttp3.d0.h.k r6 = r1.f31422a     // Catch:{ all -> 0x0134 }
            boolean r0 = r0.mo35974a(r4, r6, r2, r7)     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x011e
            r8.f31441k = r7     // Catch:{ all -> 0x0134 }
            java.net.Socket r5 = r8.mo35968g()     // Catch:{ all -> 0x0134 }
            okhttp3.d0.h.k r0 = r1.f31422a     // Catch:{ all -> 0x0134 }
            okhttp3.d0.h.f r8 = r0.f31476i     // Catch:{ all -> 0x0134 }
            goto L_0x0128
        L_0x011e:
            okhttp3.d0.h.g r0 = r1.f31424c     // Catch:{ all -> 0x0134 }
            r0.mo35975b(r8)     // Catch:{ all -> 0x0134 }
            okhttp3.d0.h.k r0 = r1.f31422a     // Catch:{ all -> 0x0134 }
            r0.mo35992a(r8)     // Catch:{ all -> 0x0134 }
        L_0x0128:
            monitor-exit(r3)     // Catch:{ all -> 0x0134 }
            okhttp3.p688d0.C14126e.m44832a(r5)
            okhttp3.r r0 = r1.f31426e
            okhttp3.Call r2 = r1.f31425d
            r0.mo36224a(r2, r8)
            return r8
        L_0x0134:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0134 }
            throw r0
        L_0x0137:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x013f }
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)     // Catch:{ all -> 0x013f }
            throw r0     // Catch:{ all -> 0x013f }
        L_0x013f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x013f }
            throw r0
        L_0x0142:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x014a }
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)     // Catch:{ all -> 0x014a }
            throw r0     // Catch:{ all -> 0x014a }
        L_0x014a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x014a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.p688d0.p690h.C14148e.m44927a(int, int, int, int, boolean):okhttp3.d0.h.f");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C14149f mo35949a() {
        return this.f31429h;
    }
}
