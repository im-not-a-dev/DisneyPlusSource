package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C9820b;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.C9678a;
import com.google.android.gms.common.api.C9678a.C9679a;
import com.google.android.gms.common.api.C9678a.C9680b;
import com.google.android.gms.common.api.C9678a.C9681c;
import com.google.android.gms.common.api.C9678a.C9689f;
import com.google.android.gms.common.api.C9698f;
import com.google.android.gms.common.api.C9698f.C9699a;
import com.google.android.gms.common.api.C9698f.C9700b;
import com.google.android.gms.common.api.C9698f.C9701c;
import com.google.android.gms.common.api.C9702g;
import com.google.android.gms.common.api.C9810l;
import com.google.android.gms.common.api.C9811m;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C9864d;
import com.google.android.gms.common.internal.C9876i;
import com.google.android.gms.common.internal.C9876i.C9877a;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.internal.p396a0.C9834a;
import com.google.android.gms.common.util.C9940d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import p163g.p449j.p450a.p451a.p465e.C11406a;
import p163g.p449j.p450a.p451a.p465e.C11423f;

/* renamed from: com.google.android.gms.common.api.internal.k0 */
public final class C9755k0 extends C9698f implements C9748i1 {

    /* renamed from: b */
    private final Lock f22866b;

    /* renamed from: c */
    private boolean f22867c;

    /* renamed from: d */
    private final C9876i f22868d;

    /* renamed from: e */
    private C9743h1 f22869e = null;

    /* renamed from: f */
    private final int f22870f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Context f22871g;

    /* renamed from: h */
    private final Looper f22872h;

    /* renamed from: i */
    final Queue<C9718c<?, ?>> f22873i = new LinkedList();

    /* renamed from: j */
    private volatile boolean f22874j;

    /* renamed from: k */
    private long f22875k;

    /* renamed from: l */
    private long f22876l;

    /* renamed from: m */
    private final C9779q0 f22877m;

    /* renamed from: n */
    private final GoogleApiAvailability f22878n;

    /* renamed from: o */
    private C9735f1 f22879o;

    /* renamed from: p */
    final Map<C9681c<?>, C9689f> f22880p;

    /* renamed from: q */
    Set<Scope> f22881q;

    /* renamed from: r */
    private final C9864d f22882r;

    /* renamed from: s */
    private final Map<C9678a<?>, Boolean> f22883s;

    /* renamed from: t */
    private final C9679a<? extends C11423f, C11406a> f22884t;

    /* renamed from: u */
    private final C9750j f22885u;

    /* renamed from: v */
    private final ArrayList<C9740g2> f22886v;

    /* renamed from: w */
    private Integer f22887w;

    /* renamed from: x */
    Set<C9783r1> f22888x;

    /* renamed from: y */
    final C9792u1 f22889y;

    /* renamed from: z */
    private final C9877a f22890z;

    public C9755k0(Context context, Lock lock, Looper looper, C9864d dVar, GoogleApiAvailability googleApiAvailability, C9679a<? extends C11423f, C11406a> aVar, Map<C9678a<?>, Boolean> map, List<C9700b> list, List<C9701c> list2, Map<C9681c<?>, C9689f> map2, int i, int i2, ArrayList<C9740g2> arrayList, boolean z) {
        Looper looper2 = looper;
        this.f22875k = C9940d.m30967a() ? 10000 : 120000;
        this.f22876l = 5000;
        this.f22881q = new HashSet();
        this.f22885u = new C9750j();
        this.f22887w = null;
        this.f22888x = null;
        this.f22890z = new C9759l0(this);
        this.f22871g = context;
        this.f22866b = lock;
        this.f22867c = false;
        this.f22868d = new C9876i(looper, this.f22890z);
        this.f22872h = looper2;
        this.f22877m = new C9779q0(this, looper);
        this.f22878n = googleApiAvailability;
        this.f22870f = i;
        if (this.f22870f >= 0) {
            this.f22887w = Integer.valueOf(i2);
        }
        this.f22883s = map;
        this.f22880p = map2;
        this.f22886v = arrayList;
        this.f22889y = new C9792u1(this.f22880p);
        for (C9700b a : list) {
            this.f22868d.mo25380a(a);
        }
        for (C9701c a2 : list2) {
            this.f22868d.mo25381a(a2);
        }
        this.f22882r = dVar;
        this.f22884t = aVar;
    }

    /* renamed from: c */
    private static String m30356c(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m30357o() {
        this.f22866b.lock();
        try {
            if (this.f22874j) {
                m30358p();
            }
        } finally {
            this.f22866b.unlock();
        }
    }

    /* renamed from: p */
    private final void m30358p() {
        this.f22868d.mo25383b();
        this.f22869e.mo25180b();
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final void m30359q() {
        this.f22866b.lock();
        try {
            if (mo25211l()) {
                m30358p();
            }
        } finally {
            this.f22866b.unlock();
        }
    }

    /* renamed from: a */
    public final <A extends C9680b, R extends C9810l, T extends C9718c<R, A>> T mo25058a(T t) {
        C9908u.m30861a(t.mo25126h() != null, (Object) "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.f22880p.containsKey(t.mo25126h());
        String b = t.mo25125g() != null ? t.mo25125g().mo25017b() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(b);
        sb.append(" required for this call.");
        C9908u.m30861a(containsKey, (Object) sb.toString());
        this.f22866b.lock();
        try {
            if (this.f22869e == null) {
                this.f22873i.add(t);
                return t;
            }
            T b2 = this.f22869e.mo25179b(t);
            this.f22866b.unlock();
            return b2;
        } finally {
            this.f22866b.unlock();
        }
    }

    /* renamed from: b */
    public final <A extends C9680b, T extends C9718c<? extends C9810l, A>> T mo25063b(T t) {
        C9908u.m30861a(t.mo25126h() != null, (Object) "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.f22880p.containsKey(t.mo25126h());
        String b = t.mo25125g() != null ? t.mo25125g().mo25017b() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(b);
        sb.append(" required for this call.");
        C9908u.m30861a(containsKey, (Object) sb.toString());
        this.f22866b.lock();
        try {
            if (this.f22869e == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            } else if (this.f22874j) {
                this.f22873i.add(t);
                while (!this.f22873i.isEmpty()) {
                    C9718c cVar = (C9718c) this.f22873i.remove();
                    this.f22889y.mo25248a(cVar);
                    cVar.mo25124c(Status.f22697Z);
                }
                return t;
            } else {
                T a = this.f22869e.mo25175a(t);
                this.f22866b.unlock();
                return a;
            }
        } finally {
            this.f22866b.unlock();
        }
    }

    /* renamed from: c */
    public final void mo25064c() {
        this.f22866b.lock();
        try {
            boolean z = false;
            if (this.f22870f >= 0) {
                if (this.f22887w != null) {
                    z = true;
                }
                C9908u.m30865b(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f22887w == null) {
                this.f22887w = Integer.valueOf(m30349a((Iterable<C9689f>) this.f22880p.values(), false));
            } else if (this.f22887w.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            mo25207a(this.f22887w.intValue());
        } finally {
            this.f22866b.unlock();
        }
    }

    /* renamed from: d */
    public final void mo25065d() {
        this.f22866b.lock();
        try {
            this.f22889y.mo25247a();
            if (this.f22869e != null) {
                this.f22869e.mo25176a();
            }
            this.f22885u.mo25193a();
            for (C9718c cVar : this.f22873i) {
                cVar.mo25085a((C9801x1) null);
                cVar.mo25084a();
            }
            this.f22873i.clear();
            if (this.f22869e != null) {
                mo25211l();
                this.f22868d.mo25377a();
                this.f22866b.unlock();
            }
        } finally {
            this.f22866b.unlock();
        }
    }

    /* renamed from: e */
    public final Context mo25066e() {
        return this.f22871g;
    }

    /* renamed from: f */
    public final Looper mo25067f() {
        return this.f22872h;
    }

    /* renamed from: g */
    public final void mo25068g() {
        C9743h1 h1Var = this.f22869e;
        if (h1Var != null) {
            h1Var.mo25183e();
        }
    }

    /* renamed from: j */
    public final boolean mo25209j() {
        C9743h1 h1Var = this.f22869e;
        return h1Var != null && h1Var.mo25181c();
    }

    /* renamed from: k */
    public final void mo25210k() {
        mo25065d();
        mo25064c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final boolean mo25211l() {
        if (!this.f22874j) {
            return false;
        }
        this.f22874j = false;
        this.f22877m.removeMessages(2);
        this.f22877m.removeMessages(1);
        C9735f1 f1Var = this.f22879o;
        if (f1Var != null) {
            f1Var.mo25168a();
            this.f22879o = null;
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final boolean mo25212m() {
        this.f22866b.lock();
        try {
            if (this.f22888x == null) {
                this.f22866b.unlock();
                return false;
            }
            boolean z = !this.f22888x.isEmpty();
            this.f22866b.unlock();
            return z;
        } catch (Throwable th) {
            this.f22866b.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final String mo25213n() {
        StringWriter stringWriter = new StringWriter();
        mo25208a("", (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public final void mo25207a(int i) {
        this.f22866b.lock();
        boolean z = true;
        if (!(i == 3 || i == 1 || i == 2)) {
            z = false;
        }
        try {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(i);
            C9908u.m30861a(z, (Object) sb.toString());
            m30353b(i);
            m30358p();
        } finally {
            this.f22866b.unlock();
        }
    }

    /* renamed from: a */
    public final C9820b mo25059a() {
        boolean z = true;
        C9908u.m30865b(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.f22866b.lock();
        try {
            if (this.f22870f >= 0) {
                if (this.f22887w == null) {
                    z = false;
                }
                C9908u.m30865b(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f22887w == null) {
                this.f22887w = Integer.valueOf(m30349a((Iterable<C9689f>) this.f22880p.values(), false));
            } else if (this.f22887w.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            m30353b(this.f22887w.intValue());
            this.f22868d.mo25383b();
            return this.f22869e.mo25184f();
        } finally {
            this.f22866b.unlock();
        }
    }

    /* renamed from: b */
    public final C9702g<Status> mo25062b() {
        C9908u.m30865b(mo25209j(), "GoogleApiClient is not connected yet.");
        C9908u.m30865b(this.f22887w.intValue() != 2, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        C9766n nVar = new C9766n(this);
        if (this.f22880p.containsKey(C9834a.f23045a)) {
            m30350a(this, nVar, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            C9763m0 m0Var = new C9763m0(this, atomicReference, nVar);
            C9767n0 n0Var = new C9767n0(this, nVar);
            C9699a aVar = new C9699a(this.f22871g);
            aVar.mo25070a(C9834a.f23047c);
            aVar.mo25072a((C9700b) m0Var);
            aVar.mo25073a((C9701c) n0Var);
            aVar.mo25069a((Handler) this.f22877m);
            C9698f a = aVar.mo25074a();
            atomicReference.set(a);
            a.mo25064c();
        }
        return nVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m30350a(C9698f fVar, C9766n nVar, boolean z) {
        C9834a.f23048d.mo25299a(fVar).mo25081a((C9811m<? super R>) new C9775p0<Object>(this, nVar, z, fVar));
    }

    /* renamed from: a */
    public final void mo25190a(Bundle bundle) {
        while (!this.f22873i.isEmpty()) {
            mo25063b((T) (C9718c) this.f22873i.remove());
        }
        this.f22868d.mo25379a(bundle);
    }

    /* renamed from: b */
    private final void m30353b(int i) {
        Integer num = this.f22887w;
        if (num == null) {
            this.f22887w = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String c = m30356c(i);
            String c2 = m30356c(this.f22887w.intValue());
            StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 51 + String.valueOf(c2).length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(c);
            sb.append(". Mode was already set to ");
            sb.append(c2);
            throw new IllegalStateException(sb.toString());
        }
        if (this.f22869e == null) {
            boolean z = false;
            boolean z2 = false;
            for (C9689f fVar : this.f22880p.values()) {
                if (fVar.mo25035l()) {
                    z = true;
                }
                if (fVar.mo24961d()) {
                    z2 = true;
                }
            }
            int intValue = this.f22887w.intValue();
            if (intValue != 1) {
                if (intValue == 2) {
                    if (z) {
                        if (this.f22867c) {
                            C9769n2 n2Var = new C9769n2(this.f22871g, this.f22866b, this.f22872h, this.f22878n, this.f22880p, this.f22882r, this.f22883s, this.f22884t, this.f22886v, this, true);
                            this.f22869e = n2Var;
                            return;
                        }
                        this.f22869e = C9749i2.m30304a(this.f22871g, this, this.f22866b, this.f22872h, this.f22878n, this.f22880p, this.f22882r, this.f22883s, this.f22884t, this.f22886v);
                        return;
                    }
                }
            } else if (!z) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            } else if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            if (!this.f22867c || z2) {
                C9788t0 t0Var = new C9788t0(this.f22871g, this, this.f22866b, this.f22872h, this.f22878n, this.f22880p, this.f22882r, this.f22883s, this.f22884t, this.f22886v, this);
                this.f22869e = t0Var;
                return;
            }
            C9769n2 n2Var2 = new C9769n2(this.f22871g, this.f22866b, this.f22872h, this.f22878n, this.f22880p, this.f22882r, this.f22883s, this.f22884t, this.f22886v, this, false);
            this.f22869e = n2Var2;
        }
    }

    /* renamed from: a */
    public final void mo25191a(C9820b bVar) {
        if (!this.f22878n.mo25298b(this.f22871g, bVar.mo25270c())) {
            mo25211l();
        }
        if (!this.f22874j) {
            this.f22868d.mo25382a(bVar);
            this.f22868d.mo25377a();
        }
    }

    /* renamed from: a */
    public final void mo25189a(int i, boolean z) {
        if (i == 1 && !z && !this.f22874j) {
            this.f22874j = true;
            if (this.f22879o == null && !C9940d.m30967a()) {
                this.f22879o = this.f22878n.mo24982a(this.f22871g.getApplicationContext(), (C9739g1) new C9782r0(this));
            }
            C9779q0 q0Var = this.f22877m;
            q0Var.sendMessageDelayed(q0Var.obtainMessage(1), this.f22875k);
            C9779q0 q0Var2 = this.f22877m;
            q0Var2.sendMessageDelayed(q0Var2.obtainMessage(2), this.f22876l);
        }
        this.f22889y.mo25249b();
        this.f22868d.mo25378a(i);
        this.f22868d.mo25377a();
        if (i == 2) {
            m30358p();
        }
    }

    /* renamed from: a */
    public final boolean mo25061a(C9758l lVar) {
        C9743h1 h1Var = this.f22869e;
        return h1Var != null && h1Var.mo25178a(lVar);
    }

    /* renamed from: a */
    public final void mo25060a(C9783r1 r1Var) {
        this.f22866b.lock();
        try {
            String str = "GoogleApiClientImpl";
            if (this.f22888x == null) {
                Log.wtf(str, "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (!this.f22888x.remove(r1Var)) {
                Log.wtf(str, "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            } else if (!mo25212m()) {
                this.f22869e.mo25182d();
            }
        } finally {
            this.f22866b.unlock();
        }
    }

    /* renamed from: a */
    public final void mo25208a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.f22871g);
        printWriter.append(str).append("mResuming=").print(this.f22874j);
        printWriter.append(" mWorkQueue.size()=").print(this.f22873i.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f22889y.f22977a.size());
        C9743h1 h1Var = this.f22869e;
        if (h1Var != null) {
            h1Var.mo25177a(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: a */
    public static int m30349a(Iterable<C9689f> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (C9689f fVar : iterable) {
            if (fVar.mo25035l()) {
                z2 = true;
            }
            if (fVar.mo24961d()) {
                z3 = true;
            }
        }
        if (!z2) {
            return 3;
        }
        if (!z3 || !z) {
            return 1;
        }
        return 2;
    }
}
