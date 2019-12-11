package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C9820b;
import com.google.android.gms.common.C9826e;
import com.google.android.gms.common.api.C9678a;
import com.google.android.gms.common.api.C9678a.C9679a;
import com.google.android.gms.common.api.C9678a.C9680b;
import com.google.android.gms.common.api.C9678a.C9681c;
import com.google.android.gms.common.api.C9678a.C9689f;
import com.google.android.gms.common.api.C9810l;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C9864d;
import com.google.android.gms.common.internal.C9864d.C9866b;
import com.google.android.gms.common.internal.C9886m;
import com.google.android.gms.common.internal.C9912w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import p163g.p449j.p450a.p451a.p465e.C11406a;
import p163g.p449j.p450a.p451a.p465e.C11423f;
import p163g.p449j.p450a.p451a.p465e.p466b.C11418k;

/* renamed from: com.google.android.gms.common.api.internal.y */
public final class C9802y implements C9785s0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C9788t0 f22991a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Lock f22992b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f22993c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C9826e f22994d;

    /* renamed from: e */
    private C9820b f22995e;

    /* renamed from: f */
    private int f22996f;

    /* renamed from: g */
    private int f22997g = 0;

    /* renamed from: h */
    private int f22998h;

    /* renamed from: i */
    private final Bundle f22999i = new Bundle();

    /* renamed from: j */
    private final Set<C9681c> f23000j = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C11423f f23001k;

    /* renamed from: l */
    private boolean f23002l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f23003m;

    /* renamed from: n */
    private boolean f23004n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C9886m f23005o;

    /* renamed from: p */
    private boolean f23006p;

    /* renamed from: q */
    private boolean f23007q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C9864d f23008r;

    /* renamed from: s */
    private final Map<C9678a<?>, Boolean> f23009s;

    /* renamed from: t */
    private final C9679a<? extends C11423f, C11406a> f23010t;

    /* renamed from: u */
    private ArrayList<Future<?>> f23011u = new ArrayList<>();

    public C9802y(C9788t0 t0Var, C9864d dVar, Map<C9678a<?>, Boolean> map, C9826e eVar, C9679a<? extends C11423f, C11406a> aVar, Lock lock, Context context) {
        this.f22991a = t0Var;
        this.f23008r = dVar;
        this.f23009s = map;
        this.f22994d = eVar;
        this.f23010t = aVar;
        this.f22992b = lock;
        this.f22993c = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m30539a(C11418k kVar) {
        if (m30541a(0)) {
            C9820b c = kVar.mo29239c();
            if (c.mo25275g()) {
                C9912w d = kVar.mo29240d();
                C9820b d2 = d.mo25443d();
                if (!d2.mo25275g()) {
                    String valueOf = String.valueOf(d2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                    sb.append("Sign-in succeeded with resolve account failure: ");
                    sb.append(valueOf);
                    Log.wtf("GoogleApiClientConnecting", sb.toString(), new Exception());
                    m30545b(d2);
                    return;
                }
                this.f23004n = true;
                this.f23005o = d.mo25442c();
                this.f23006p = d.mo25444e();
                this.f23007q = d.mo25446f();
                m30552e();
            } else if (m30543a(c)) {
                m30557g();
                m30552e();
            } else {
                m30545b(c);
            }
        }
    }

    /* renamed from: c */
    private static String m30548c(int i) {
        return i != 0 ? i != 1 ? "UNKNOWN" : "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final boolean m30551d() {
        this.f22998h--;
        int i = this.f22998h;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            String str = "GoogleApiClientConnecting";
            Log.w(str, this.f22991a.f22971n.mo25213n());
            Log.wtf(str, "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            m30545b(new C9820b(8, null));
            return false;
        }
        C9820b bVar = this.f22995e;
        if (bVar == null) {
            return true;
        }
        this.f22991a.f22970m = this.f22996f;
        m30545b(bVar);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m30552e() {
        if (this.f22998h == 0) {
            if (!this.f23003m || this.f23004n) {
                ArrayList arrayList = new ArrayList();
                this.f22997g = 1;
                this.f22998h = this.f22991a.f22963f.size();
                for (C9681c cVar : this.f22991a.f22963f.keySet()) {
                    if (!this.f22991a.f22964g.containsKey(cVar)) {
                        arrayList.add((C9689f) this.f22991a.f22963f.get(cVar));
                    } else if (m30551d()) {
                        m30555f();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f23011u.add(C9797w0.m30529a().submit(new C9730e0(this, arrayList)));
                }
            }
        }
    }

    /* renamed from: f */
    private final void m30555f() {
        this.f22991a.mo25245i();
        C9797w0.m30529a().execute(new C9805z(this));
        C11423f fVar = this.f23001k;
        if (fVar != null) {
            if (this.f23006p) {
                fVar.mo29222a(this.f23005o, this.f23007q);
            }
            m30540a(false);
        }
        for (C9681c cVar : this.f22991a.f22964g.keySet()) {
            ((C9689f) this.f22991a.f22963f.get(cVar)).mo25025a();
        }
        this.f22991a.f22972o.mo25190a(this.f22999i.isEmpty() ? null : this.f22999i);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m30557g() {
        this.f23003m = false;
        this.f22991a.f22971n.f22881q = Collections.emptySet();
        for (C9681c cVar : this.f23000j) {
            if (!this.f22991a.f22964g.containsKey(cVar)) {
                this.f22991a.f22964g.put(cVar, new C9820b(17, null));
            }
        }
    }

    /* renamed from: h */
    private final void m30559h() {
        ArrayList<Future<?>> arrayList = this.f23011u;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Future) obj).cancel(true);
        }
        this.f23011u.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final Set<Scope> m30561i() {
        C9864d dVar = this.f23008r;
        if (dVar == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(dVar.mo25363i());
        Map f = this.f23008r.mo25360f();
        for (C9678a aVar : f.keySet()) {
            if (!this.f22991a.f22964g.containsKey(aVar.mo25016a())) {
                hashSet.addAll(((C9866b) f.get(aVar)).f23114a);
            }
        }
        return hashSet;
    }

    /* renamed from: b */
    public final void mo25198b() {
    }

    /* renamed from: b */
    public final void mo25200b(Bundle bundle) {
        if (m30541a(1)) {
            if (bundle != null) {
                this.f22999i.putAll(bundle);
            }
            if (m30551d()) {
                m30555f();
            }
        }
    }

    /* renamed from: c */
    public final void mo25201c() {
        this.f22991a.f22964g.clear();
        this.f23003m = false;
        this.f22995e = null;
        this.f22997g = 0;
        this.f23002l = true;
        this.f23004n = false;
        this.f23006p = false;
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (C9678a aVar : this.f23009s.keySet()) {
            C9689f fVar = (C9689f) this.f22991a.f22963f.get(aVar.mo25016a());
            z |= aVar.mo25018c().mo25023a() == 1;
            boolean booleanValue = ((Boolean) this.f23009s.get(aVar)).booleanValue();
            if (fVar.mo25035l()) {
                this.f23003m = true;
                if (booleanValue) {
                    this.f23000j.add(aVar.mo25016a());
                } else {
                    this.f23002l = false;
                }
            }
            hashMap.put(fVar, new C9710a0(this, aVar, booleanValue));
        }
        if (z) {
            this.f23003m = false;
        }
        if (this.f23003m) {
            this.f23008r.mo25355a(Integer.valueOf(System.identityHashCode(this.f22991a.f22971n)));
            C9742h0 h0Var = new C9742h0(this, null);
            C9679a<? extends C11423f, C11406a> aVar2 = this.f23010t;
            Context context = this.f22993c;
            Looper f = this.f22991a.f22971n.mo25067f();
            C9864d dVar = this.f23008r;
            this.f23001k = (C11423f) aVar2.mo25020a(context, f, dVar, dVar.mo25364j(), h0Var, h0Var);
        }
        this.f22998h = this.f22991a.f22963f.size();
        this.f23011u.add(C9797w0.m30529a().submit(new C9715b0(this, hashMap)));
    }

    /* renamed from: b */
    public final <A extends C9680b, R extends C9810l, T extends C9718c<R, A>> T mo25197b(T t) {
        this.f22991a.f22971n.f22873i.add(t);
        return t;
    }

    /* renamed from: b */
    public final void mo25199b(int i) {
        m30545b(new C9820b(8, null));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r7 != false) goto L_0x0024;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m30546b(com.google.android.gms.common.C9820b r5, com.google.android.gms.common.api.C9678a<?> r6, boolean r7) {
        /*
            r4 = this;
            com.google.android.gms.common.api.a$e r0 = r6.mo25018c()
            int r0 = r0.mo25023a()
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L_0x0024
            boolean r7 = r5.mo25274f()
            if (r7 == 0) goto L_0x0014
        L_0x0012:
            r7 = 1
            goto L_0x0022
        L_0x0014:
            com.google.android.gms.common.e r7 = r4.f22994d
            int r3 = r5.mo25270c()
            android.content.Intent r7 = r7.mo25294a(r3)
            if (r7 == 0) goto L_0x0021
            goto L_0x0012
        L_0x0021:
            r7 = 0
        L_0x0022:
            if (r7 == 0) goto L_0x002d
        L_0x0024:
            com.google.android.gms.common.b r7 = r4.f22995e
            if (r7 == 0) goto L_0x002c
            int r7 = r4.f22996f
            if (r0 >= r7) goto L_0x002d
        L_0x002c:
            r1 = 1
        L_0x002d:
            if (r1 == 0) goto L_0x0033
            r4.f22995e = r5
            r4.f22996f = r0
        L_0x0033:
            com.google.android.gms.common.api.internal.t0 r7 = r4.f22991a
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.b> r7 = r7.f22964g
            com.google.android.gms.common.api.a$c r6 = r6.mo25016a()
            r7.put(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C9802y.m30546b(com.google.android.gms.common.b, com.google.android.gms.common.api.a, boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m30545b(C9820b bVar) {
        m30559h();
        m30540a(!bVar.mo25274f());
        this.f22991a.mo25241a(bVar);
        this.f22991a.f22972o.mo25191a(bVar);
    }

    /* renamed from: a */
    public final void mo25195a(C9820b bVar, C9678a<?> aVar, boolean z) {
        if (m30541a(1)) {
            m30546b(bVar, aVar, z);
            if (m30551d()) {
                m30555f();
            }
        }
    }

    /* renamed from: a */
    public final <A extends C9680b, T extends C9718c<? extends C9810l, A>> T mo25194a(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: a */
    public final boolean mo25196a() {
        m30559h();
        m30540a(true);
        this.f22991a.mo25241a((C9820b) null);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m30543a(C9820b bVar) {
        return this.f23002l && !bVar.mo25274f();
    }

    /* renamed from: a */
    private final void m30540a(boolean z) {
        C11423f fVar = this.f23001k;
        if (fVar != null) {
            if (fVar.mo25030c() && z) {
                this.f23001k.mo29225g();
            }
            this.f23001k.mo25025a();
            if (this.f23008r.mo25365k()) {
                this.f23001k = null;
            }
            this.f23005o = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m30541a(int i) {
        if (this.f22997g == i) {
            return true;
        }
        String str = "GoogleApiClientConnecting";
        Log.w(str, this.f22991a.f22971n.mo25213n());
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("Unexpected callback in ");
        sb.append(valueOf);
        Log.w(str, sb.toString());
        int i2 = this.f22998h;
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("mRemainingConnections=");
        sb2.append(i2);
        Log.w(str, sb2.toString());
        String c = m30548c(this.f22997g);
        String c2 = m30548c(i);
        StringBuilder sb3 = new StringBuilder(String.valueOf(c).length() + 70 + String.valueOf(c2).length());
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(c);
        sb3.append(" but received callback for step ");
        sb3.append(c2);
        Log.wtf(str, sb3.toString(), new Exception());
        m30545b(new C9820b(8, null));
        return false;
    }
}
