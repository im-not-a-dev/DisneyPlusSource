package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C9820b;
import com.google.android.gms.common.C9824d;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.C9678a;
import com.google.android.gms.common.api.C9678a.C9680b;
import com.google.android.gms.common.api.C9678a.C9682d;
import com.google.android.gms.common.api.C9678a.C9689f;
import com.google.android.gms.common.api.C9695e;
import com.google.android.gms.common.api.C9698f.C9700b;
import com.google.android.gms.common.api.C9698f.C9701c;
import com.google.android.gms.common.api.C9810l;
import com.google.android.gms.common.api.C9815q;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C9713b.C9714a;
import com.google.android.gms.common.api.internal.C9745i.C9746a;
import com.google.android.gms.common.internal.C9850c.C9853c;
import com.google.android.gms.common.internal.C9850c.C9855e;
import com.google.android.gms.common.internal.C9884l;
import com.google.android.gms.common.internal.C9886m;
import com.google.android.gms.common.internal.C9901s;
import com.google.android.gms.common.internal.C9901s.C9902a;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.internal.C9914x;
import com.google.android.gms.common.util.C9938b;
import com.google.android.gms.common.util.C9948l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p096e.p113e.C3926a;
import p096e.p113e.C3928b;
import p163g.p449j.p450a.p451a.p457d.p461d.C10997h;
import p163g.p449j.p450a.p451a.p465e.C11423f;
import p163g.p449j.p450a.p451a.p467f.C11435h;
import p163g.p449j.p450a.p451a.p467f.C11436i;

/* renamed from: com.google.android.gms.common.api.internal.e */
public class C9726e implements Callback {

    /* renamed from: g0 */
    public static final Status f22788g0 = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public static final Status f22789h0 = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public static final Object f22790i0 = new Object();

    /* renamed from: j0 */
    private static C9726e f22791j0;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public long f22792U = 120000;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public long f22793V = 10000;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public final Context f22794W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public final GoogleApiAvailability f22795X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public final C9884l f22796Y;

    /* renamed from: Z */
    private final AtomicInteger f22797Z = new AtomicInteger(1);

    /* renamed from: a0 */
    private final AtomicInteger f22798a0 = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public final Map<C9717b2<?>, C9727a<?>> f22799b0 = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f22800c = 5000;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public C9784s f22801c0 = null;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public final Set<C9717b2<?>> f22802d0 = new C3928b();

    /* renamed from: e0 */
    private final Set<C9717b2<?>> f22803e0 = new C3928b();
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public final Handler f22804f0;

    /* renamed from: com.google.android.gms.common.api.internal.e$a */
    public class C9727a<O extends C9682d> implements C9700b, C9701c, C9744h2 {

        /* renamed from: a */
        private final Queue<C9771o0> f22805a = new LinkedList();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C9689f f22806b;

        /* renamed from: c */
        private final C9680b f22807c;

        /* renamed from: d */
        private final C9717b2<O> f22808d;

        /* renamed from: e */
        private final C9778q f22809e;

        /* renamed from: f */
        private final Set<C9725d2> f22810f = new HashSet();

        /* renamed from: g */
        private final Map<C9746a<?>, C9756k1> f22811g = new HashMap();

        /* renamed from: h */
        private final int f22812h;

        /* renamed from: i */
        private final C9768n1 f22813i;

        /* renamed from: j */
        private boolean f22814j;

        /* renamed from: k */
        private final List<C9728b> f22815k = new ArrayList();

        /* renamed from: l */
        private C9820b f22816l = null;

        public C9727a(C9695e<O> eVar) {
            this.f22806b = eVar.mo25045a(C9726e.this.f22804f0.getLooper(), this);
            C9689f fVar = this.f22806b;
            if (fVar instanceof C9914x) {
                this.f22807c = ((C9914x) fVar).mo24959D();
            } else {
                this.f22807c = fVar;
            }
            this.f22808d = eVar.mo25055g();
            this.f22809e = new C9778q();
            this.f22812h = eVar.mo25053e();
            if (this.f22806b.mo25035l()) {
                this.f22813i = eVar.mo25048a(C9726e.this.f22794W, C9726e.this.f22804f0);
            } else {
                this.f22813i = null;
            }
        }

        /* renamed from: c */
        private final boolean m30225c(C9820b bVar) {
            synchronized (C9726e.f22790i0) {
                if (C9726e.this.f22801c0 == null || !C9726e.this.f22802d0.contains(this.f22808d)) {
                    return false;
                }
                C9726e.this.f22801c0.mo25166a(bVar, this.f22812h);
                return true;
            }
        }

        /* renamed from: d */
        private final void m30226d(C9820b bVar) {
            for (C9725d2 d2Var : this.f22810f) {
                String str = null;
                if (C9901s.m30841a(bVar, C9820b.f23019X)) {
                    str = this.f22806b.mo25032f();
                }
                d2Var.mo25131a(this.f22808d, bVar, str);
            }
            this.f22810f.clear();
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public final void m30227n() {
            mo25157j();
            m30226d(C9820b.f23019X);
            m30230q();
            Iterator it = this.f22811g.values().iterator();
            while (it.hasNext()) {
                C9756k1 k1Var = (C9756k1) it.next();
                if (m30213a(k1Var.f22891a.mo25205b()) != null) {
                    it.remove();
                } else {
                    try {
                        k1Var.f22891a.mo25204a(this.f22807c, new C11436i());
                    } catch (DeadObjectException unused) {
                        mo25076b(1);
                        this.f22806b.mo25025a();
                    } catch (RemoteException unused2) {
                        it.remove();
                    }
                }
            }
            m30229p();
            m30231r();
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public final void m30228o() {
            mo25157j();
            this.f22814j = true;
            this.f22809e.mo25234c();
            C9726e.this.f22804f0.sendMessageDelayed(Message.obtain(C9726e.this.f22804f0, 9, this.f22808d), C9726e.this.f22800c);
            C9726e.this.f22804f0.sendMessageDelayed(Message.obtain(C9726e.this.f22804f0, 11, this.f22808d), C9726e.this.f22792U);
            C9726e.this.f22796Y.mo25406a();
        }

        /* renamed from: p */
        private final void m30229p() {
            ArrayList arrayList = new ArrayList(this.f22805a);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                C9771o0 o0Var = (C9771o0) obj;
                if (!this.f22806b.mo25030c()) {
                    return;
                }
                if (m30222b(o0Var)) {
                    this.f22805a.remove(o0Var);
                }
            }
        }

        /* renamed from: q */
        private final void m30230q() {
            if (this.f22814j) {
                C9726e.this.f22804f0.removeMessages(11, this.f22808d);
                C9726e.this.f22804f0.removeMessages(9, this.f22808d);
                this.f22814j = false;
            }
        }

        /* renamed from: r */
        private final void m30231r() {
            C9726e.this.f22804f0.removeMessages(12, this.f22808d);
            C9726e.this.f22804f0.sendMessageDelayed(C9726e.this.f22804f0.obtainMessage(12, this.f22808d), C9726e.this.f22793V);
        }

        /* renamed from: a */
        public final void mo25147a(C9820b bVar, C9678a<?> aVar, boolean z) {
            if (Looper.myLooper() == C9726e.this.f22804f0.getLooper()) {
                mo25078a(bVar);
            } else {
                C9726e.this.f22804f0.post(new C9711a1(this, bVar));
            }
        }

        /* renamed from: b */
        public final void mo25077b(Bundle bundle) {
            if (Looper.myLooper() == C9726e.this.f22804f0.getLooper()) {
                m30227n();
            } else {
                C9726e.this.f22804f0.post(new C9803y0(this));
            }
        }

        /* renamed from: e */
        public final void mo25152e() {
            C9908u.m30857a(C9726e.this.f22804f0);
            if (this.f22814j) {
                mo25143a();
            }
        }

        /* renamed from: f */
        public final C9689f mo25153f() {
            return this.f22806b;
        }

        /* renamed from: g */
        public final void mo25154g() {
            Status status;
            C9908u.m30857a(C9726e.this.f22804f0);
            if (this.f22814j) {
                m30230q();
                if (C9726e.this.f22795X.mo24987c(C9726e.this.f22794W) == 18) {
                    status = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
                } else {
                    status = new Status(8, "API failed to connect while resuming due to an unknown error.");
                }
                mo25144a(status);
                this.f22806b.mo25025a();
            }
        }

        /* renamed from: h */
        public final void mo25155h() {
            C9908u.m30857a(C9726e.this.f22804f0);
            mo25144a(C9726e.f22788g0);
            this.f22809e.mo25233b();
            for (C9746a a2Var : (C9746a[]) this.f22811g.keySet().toArray(new C9746a[this.f22811g.size()])) {
                mo25146a((C9771o0) new C9712a2(a2Var, new C11436i()));
            }
            m30226d(new C9820b(4));
            if (this.f22806b.mo25030c()) {
                this.f22806b.mo25027a((C9855e) new C9716b1(this));
            }
        }

        /* renamed from: i */
        public final Map<C9746a<?>, C9756k1> mo25156i() {
            return this.f22811g;
        }

        /* renamed from: j */
        public final void mo25157j() {
            C9908u.m30857a(C9726e.this.f22804f0);
            this.f22816l = null;
        }

        /* renamed from: k */
        public final C9820b mo25158k() {
            C9908u.m30857a(C9726e.this.f22804f0);
            return this.f22816l;
        }

        /* renamed from: l */
        public final boolean mo25159l() {
            return m30218a(true);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public final C11423f mo25160m() {
            C9768n1 n1Var = this.f22813i;
            if (n1Var == null) {
                return null;
            }
            return n1Var.mo25218j();
        }

        /* renamed from: a */
        public final void mo25078a(C9820b bVar) {
            C9908u.m30857a(C9726e.this.f22804f0);
            C9768n1 n1Var = this.f22813i;
            if (n1Var != null) {
                n1Var.mo25219k();
            }
            mo25157j();
            C9726e.this.f22796Y.mo25406a();
            m30226d(bVar);
            if (bVar.mo25270c() == 4) {
                mo25144a(C9726e.f22789h0);
            } else if (this.f22805a.isEmpty()) {
                this.f22816l = bVar;
            } else {
                if (!m30225c(bVar) && !C9726e.this.mo25140b(bVar, this.f22812h)) {
                    if (bVar.mo25270c() == 18) {
                        this.f22814j = true;
                    }
                    if (this.f22814j) {
                        C9726e.this.f22804f0.sendMessageDelayed(Message.obtain(C9726e.this.f22804f0, 9, this.f22808d), C9726e.this.f22800c);
                        return;
                    }
                    String a = this.f22808d.mo25118a();
                    StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 38);
                    sb.append("API: ");
                    sb.append(a);
                    sb.append(" is not available on this device.");
                    mo25144a(new Status(17, sb.toString()));
                }
            }
        }

        /* renamed from: b */
        public final void mo25076b(int i) {
            if (Looper.myLooper() == C9726e.this.f22804f0.getLooper()) {
                m30228o();
            } else {
                C9726e.this.f22804f0.post(new C9806z0(this));
            }
        }

        /* renamed from: d */
        public final boolean mo25151d() {
            return this.f22806b.mo25035l();
        }

        /* renamed from: c */
        private final void m30224c(C9771o0 o0Var) {
            o0Var.mo25098a(this.f22809e, mo25151d());
            try {
                o0Var.mo25224a(this);
            } catch (DeadObjectException unused) {
                mo25076b(1);
                this.f22806b.mo25025a();
            }
        }

        /* renamed from: b */
        public final void mo25149b(C9820b bVar) {
            C9908u.m30857a(C9726e.this.f22804f0);
            this.f22806b.mo25025a();
            mo25078a(bVar);
        }

        /* renamed from: b */
        private final boolean m30222b(C9771o0 o0Var) {
            if (!(o0Var instanceof C9760l1)) {
                m30224c(o0Var);
                return true;
            }
            C9760l1 l1Var = (C9760l1) o0Var;
            C9824d a = m30213a(l1Var.mo25099b(this));
            if (a == null) {
                m30224c(o0Var);
                return true;
            }
            if (l1Var.mo25100c(this)) {
                C9728b bVar = new C9728b(this.f22808d, a, null);
                int indexOf = this.f22815k.indexOf(bVar);
                if (indexOf >= 0) {
                    C9728b bVar2 = (C9728b) this.f22815k.get(indexOf);
                    C9726e.this.f22804f0.removeMessages(15, bVar2);
                    C9726e.this.f22804f0.sendMessageDelayed(Message.obtain(C9726e.this.f22804f0, 15, bVar2), C9726e.this.f22800c);
                } else {
                    this.f22815k.add(bVar);
                    C9726e.this.f22804f0.sendMessageDelayed(Message.obtain(C9726e.this.f22804f0, 15, bVar), C9726e.this.f22800c);
                    C9726e.this.f22804f0.sendMessageDelayed(Message.obtain(C9726e.this.f22804f0, 16, bVar), C9726e.this.f22792U);
                    C9820b bVar3 = new C9820b(2, null);
                    if (!m30225c(bVar3)) {
                        C9726e.this.mo25140b(bVar3, this.f22812h);
                    }
                }
            } else {
                l1Var.mo25225a((RuntimeException) new C9815q(a));
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final boolean mo25150c() {
            return this.f22806b.mo25030c();
        }

        /* renamed from: a */
        public final void mo25146a(C9771o0 o0Var) {
            C9908u.m30857a(C9726e.this.f22804f0);
            if (!this.f22806b.mo25030c()) {
                this.f22805a.add(o0Var);
                C9820b bVar = this.f22816l;
                if (bVar == null || !bVar.mo25274f()) {
                    mo25143a();
                } else {
                    mo25078a(this.f22816l);
                }
            } else if (m30222b(o0Var)) {
                m30231r();
            } else {
                this.f22805a.add(o0Var);
            }
        }

        /* renamed from: a */
        public final void mo25144a(Status status) {
            C9908u.m30857a(C9726e.this.f22804f0);
            for (C9771o0 a : this.f22805a) {
                a.mo25223a(status);
            }
            this.f22805a.clear();
        }

        /* renamed from: b */
        public final int mo25148b() {
            return this.f22812h;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m30221b(C9728b bVar) {
            if (this.f22815k.remove(bVar)) {
                C9726e.this.f22804f0.removeMessages(15, bVar);
                C9726e.this.f22804f0.removeMessages(16, bVar);
                C9824d b = bVar.f22819b;
                ArrayList arrayList = new ArrayList(this.f22805a.size());
                for (C9771o0 o0Var : this.f22805a) {
                    if (o0Var instanceof C9760l1) {
                        C9824d[] b2 = ((C9760l1) o0Var).mo25099b(this);
                        if (b2 != null && C9938b.m30964a(b2, b)) {
                            arrayList.add(o0Var);
                        }
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    C9771o0 o0Var2 = (C9771o0) obj;
                    this.f22805a.remove(o0Var2);
                    o0Var2.mo25225a((RuntimeException) new C9815q(b));
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final boolean m30218a(boolean z) {
            C9908u.m30857a(C9726e.this.f22804f0);
            if (!this.f22806b.mo25030c() || this.f22811g.size() != 0) {
                return false;
            }
            if (this.f22809e.mo25232a()) {
                if (z) {
                    m30231r();
                }
                return false;
            }
            this.f22806b.mo25025a();
            return true;
        }

        /* renamed from: a */
        public final void mo25143a() {
            C9908u.m30857a(C9726e.this.f22804f0);
            if (!this.f22806b.mo25030c() && !this.f22806b.mo25031e()) {
                int a = C9726e.this.f22796Y.mo25405a(C9726e.this.f22794W, this.f22806b);
                if (a != 0) {
                    mo25078a(new C9820b(a, null));
                    return;
                }
                C9729c cVar = new C9729c(this.f22806b, this.f22808d);
                if (this.f22806b.mo25035l()) {
                    this.f22813i.mo25217a((C9780q1) cVar);
                }
                this.f22806b.mo25026a((C9853c) cVar);
            }
        }

        /* renamed from: a */
        public final void mo25145a(C9725d2 d2Var) {
            C9908u.m30857a(C9726e.this.f22804f0);
            this.f22810f.add(d2Var);
        }

        /* renamed from: a */
        private final C9824d m30213a(C9824d[] dVarArr) {
            if (!(dVarArr == null || dVarArr.length == 0)) {
                C9824d[] j = this.f22806b.mo25034j();
                if (j == null) {
                    j = new C9824d[0];
                }
                C3926a aVar = new C3926a(j.length);
                for (C9824d dVar : j) {
                    aVar.put(dVar.mo25285c(), Long.valueOf(dVar.mo25286d()));
                }
                for (C9824d dVar2 : dVarArr) {
                    if (!aVar.containsKey(dVar2.mo25285c()) || ((Long) aVar.get(dVar2.mo25285c())).longValue() < dVar2.mo25286d()) {
                        return dVar2;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m30216a(C9728b bVar) {
            if (this.f22815k.contains(bVar) && !this.f22814j) {
                if (!this.f22806b.mo25030c()) {
                    mo25143a();
                    return;
                }
                m30229p();
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.e$b */
    private static class C9728b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C9717b2<?> f22818a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C9824d f22819b;

        private C9728b(C9717b2<?> b2Var, C9824d dVar) {
            this.f22818a = b2Var;
            this.f22819b = dVar;
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof C9728b)) {
                C9728b bVar = (C9728b) obj;
                if (C9901s.m30841a(this.f22818a, bVar.f22818a) && C9901s.m30841a(this.f22819b, bVar.f22819b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return C9901s.m30839a(this.f22818a, this.f22819b);
        }

        public final String toString() {
            C9902a a = C9901s.m30840a((Object) this);
            a.mo25435a("key", this.f22818a);
            a.mo25435a("feature", this.f22819b);
            return a.toString();
        }

        /* synthetic */ C9728b(C9717b2 b2Var, C9824d dVar, C9800x0 x0Var) {
            this(b2Var, dVar);
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.e$c */
    private class C9729c implements C9780q1, C9853c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C9689f f22820a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C9717b2<?> f22821b;

        /* renamed from: c */
        private C9886m f22822c = null;

        /* renamed from: d */
        private Set<Scope> f22823d = null;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f22824e = false;

        public C9729c(C9689f fVar, C9717b2<?> b2Var) {
            this.f22820a = fVar;
            this.f22821b = b2Var;
        }

        /* renamed from: a */
        public final void mo25096a(C9820b bVar) {
            C9726e.this.f22804f0.post(new C9724d1(this, bVar));
        }

        /* renamed from: b */
        public final void mo25165b(C9820b bVar) {
            ((C9727a) C9726e.this.f22799b0.get(this.f22821b)).mo25149b(bVar);
        }

        /* renamed from: a */
        public final void mo25164a(C9886m mVar, Set<Scope> set) {
            if (mVar == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                mo25165b(new C9820b(4));
                return;
            }
            this.f22822c = mVar;
            this.f22823d = set;
            m30256a();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m30256a() {
            if (this.f22824e) {
                C9886m mVar = this.f22822c;
                if (mVar != null) {
                    this.f22820a.mo25028a(mVar, this.f22823d);
                }
            }
        }
    }

    private C9726e(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.f22794W = context;
        this.f22804f0 = new C10997h(looper, this);
        this.f22795X = googleApiAvailability;
        this.f22796Y = new C9884l(googleApiAvailability);
        Handler handler = this.f22804f0;
        handler.sendMessage(handler.obtainMessage(6));
    }

    /* renamed from: a */
    public static C9726e m30189a(Context context) {
        C9726e eVar;
        synchronized (f22790i0) {
            if (f22791j0 == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f22791j0 = new C9726e(context.getApplicationContext(), handlerThread.getLooper(), GoogleApiAvailability.m30032a());
            }
            eVar = f22791j0;
        }
        return eVar;
    }

    /* renamed from: d */
    public static void m30194d() {
        synchronized (f22790i0) {
            if (f22791j0 != null) {
                C9726e eVar = f22791j0;
                eVar.f22798a0.incrementAndGet();
                eVar.f22804f0.sendMessageAtFrontOfQueue(eVar.f22804f0.obtainMessage(10));
            }
        }
    }

    /* renamed from: e */
    public static C9726e m30195e() {
        C9726e eVar;
        synchronized (f22790i0) {
            C9908u.m30854a(f22791j0, (Object) "Must guarantee manager is non-null before using getInstance");
            eVar = f22791j0;
        }
        return eVar;
    }

    /* renamed from: b */
    public final int mo25139b() {
        return this.f22797Z.getAndIncrement();
    }

    /* renamed from: c */
    public final void mo25141c() {
        Handler handler = this.f22804f0;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public boolean handleMessage(Message message) {
        C9727a aVar;
        int i = message.what;
        long j = 300000;
        String str = "GoogleApiManager";
        switch (i) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f22793V = j;
                this.f22804f0.removeMessages(12);
                for (C9717b2 b2Var : this.f22799b0.keySet()) {
                    Handler handler = this.f22804f0;
                    handler.sendMessageDelayed(handler.obtainMessage(12, b2Var), this.f22793V);
                }
                break;
            case 2:
                C9725d2 d2Var = (C9725d2) message.obj;
                Iterator it = d2Var.mo25132b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C9717b2 b2Var2 = (C9717b2) it.next();
                        C9727a aVar2 = (C9727a) this.f22799b0.get(b2Var2);
                        if (aVar2 == null) {
                            d2Var.mo25131a(b2Var2, new C9820b(13), null);
                            break;
                        } else if (aVar2.mo25150c()) {
                            d2Var.mo25131a(b2Var2, C9820b.f23019X, aVar2.mo25153f().mo25032f());
                        } else if (aVar2.mo25158k() != null) {
                            d2Var.mo25131a(b2Var2, aVar2.mo25158k(), null);
                        } else {
                            aVar2.mo25145a(d2Var);
                            aVar2.mo25143a();
                        }
                    }
                }
            case 3:
                for (C9727a aVar3 : this.f22799b0.values()) {
                    aVar3.mo25157j();
                    aVar3.mo25143a();
                }
                break;
            case 4:
            case 8:
            case 13:
                C9752j1 j1Var = (C9752j1) message.obj;
                C9727a aVar4 = (C9727a) this.f22799b0.get(j1Var.f22864c.mo25055g());
                if (aVar4 == null) {
                    m30191b(j1Var.f22864c);
                    aVar4 = (C9727a) this.f22799b0.get(j1Var.f22864c.mo25055g());
                }
                if (aVar4.mo25151d() && this.f22798a0.get() != j1Var.f22863b) {
                    j1Var.f22862a.mo25223a(f22788g0);
                    aVar4.mo25155h();
                    break;
                } else {
                    aVar4.mo25146a(j1Var.f22862a);
                    break;
                }
                break;
            case 5:
                int i2 = message.arg1;
                C9820b bVar = (C9820b) message.obj;
                Iterator it2 = this.f22799b0.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        aVar = (C9727a) it2.next();
                        if (aVar.mo25148b() == i2) {
                        }
                    } else {
                        aVar = null;
                    }
                }
                if (aVar == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i2);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf(str, sb.toString(), new Exception());
                    break;
                } else {
                    String b = this.f22795X.mo24985b(bVar.mo25270c());
                    String d = bVar.mo25271d();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(b).length() + 69 + String.valueOf(d).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(b);
                    sb2.append(": ");
                    sb2.append(d);
                    aVar.mo25144a(new Status(17, sb2.toString()));
                    break;
                }
            case 6:
                if (C9948l.m30988a() && (this.f22794W.getApplicationContext() instanceof Application)) {
                    C9713b.m30161a((Application) this.f22794W.getApplicationContext());
                    C9713b.m30163c().mo25102a((C9714a) new C9800x0(this));
                    if (!C9713b.m30163c().mo25103a(true)) {
                        this.f22793V = 300000;
                        break;
                    }
                }
                break;
            case 7:
                m30191b((C9695e) message.obj);
                break;
            case 9:
                if (this.f22799b0.containsKey(message.obj)) {
                    ((C9727a) this.f22799b0.get(message.obj)).mo25152e();
                    break;
                }
                break;
            case 10:
                for (C9717b2 remove : this.f22803e0) {
                    ((C9727a) this.f22799b0.remove(remove)).mo25155h();
                }
                this.f22803e0.clear();
                break;
            case 11:
                if (this.f22799b0.containsKey(message.obj)) {
                    ((C9727a) this.f22799b0.get(message.obj)).mo25154g();
                    break;
                }
                break;
            case 12:
                if (this.f22799b0.containsKey(message.obj)) {
                    ((C9727a) this.f22799b0.get(message.obj)).mo25159l();
                    break;
                }
                break;
            case 14:
                C9787t tVar = (C9787t) message.obj;
                C9717b2 b2 = tVar.mo25239b();
                if (this.f22799b0.containsKey(b2)) {
                    tVar.mo25238a().mo29273a(Boolean.valueOf(((C9727a) this.f22799b0.get(b2)).m30218a(false)));
                    break;
                } else {
                    tVar.mo25238a().mo29273a(Boolean.valueOf(false));
                    break;
                }
            case 15:
                C9728b bVar2 = (C9728b) message.obj;
                if (this.f22799b0.containsKey(bVar2.f22818a)) {
                    ((C9727a) this.f22799b0.get(bVar2.f22818a)).m30216a(bVar2);
                    break;
                }
                break;
            case 16:
                C9728b bVar3 = (C9728b) message.obj;
                if (this.f22799b0.containsKey(bVar3.f22818a)) {
                    ((C9727a) this.f22799b0.get(bVar3.f22818a)).m30221b(bVar3);
                    break;
                }
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                Log.w(str, sb3.toString());
                return false;
        }
        return true;
    }

    /* renamed from: b */
    private final void m30191b(C9695e<?> eVar) {
        C9717b2 g = eVar.mo25055g();
        C9727a aVar = (C9727a) this.f22799b0.get(g);
        if (aVar == null) {
            aVar = new C9727a(eVar);
            this.f22799b0.put(g, aVar);
        }
        if (aVar.mo25151d()) {
            this.f22803e0.add(g);
        }
        aVar.mo25143a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo25140b(C9820b bVar, int i) {
        return this.f22795X.mo24984a(this.f22794W, bVar, i);
    }

    /* renamed from: a */
    public final void mo25136a(C9695e<?> eVar) {
        Handler handler = this.f22804f0;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    /* renamed from: a */
    public final C11435h<Map<C9717b2<?>, String>> mo25134a(Iterable<? extends C9695e<?>> iterable) {
        C9725d2 d2Var = new C9725d2(iterable);
        Handler handler = this.f22804f0;
        handler.sendMessage(handler.obtainMessage(2, d2Var));
        return d2Var.mo25130a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo25135a() {
        this.f22798a0.incrementAndGet();
        Handler handler = this.f22804f0;
        handler.sendMessage(handler.obtainMessage(10));
    }

    /* renamed from: a */
    public final <O extends C9682d> void mo25137a(C9695e<O> eVar, int i, C9718c<? extends C9810l, C9680b> cVar) {
        C9807z1 z1Var = new C9807z1(i, cVar);
        Handler handler = this.f22804f0;
        handler.sendMessage(handler.obtainMessage(4, new C9752j1(z1Var, this.f22798a0.get(), eVar)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final PendingIntent mo25133a(C9717b2<?> b2Var, int i) {
        C9727a aVar = (C9727a) this.f22799b0.get(b2Var);
        if (aVar == null) {
            return null;
        }
        C11423f m = aVar.mo25160m();
        if (m == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f22794W, i, m.mo24963k(), 134217728);
    }

    /* renamed from: a */
    public final void mo25138a(C9820b bVar, int i) {
        if (!mo25140b(bVar, i)) {
            Handler handler = this.f22804f0;
            handler.sendMessage(handler.obtainMessage(5, i, 0, bVar));
        }
    }
}
