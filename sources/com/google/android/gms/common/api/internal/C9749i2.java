package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
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
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C9864d;
import com.google.android.gms.common.internal.C9908u;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import p096e.p113e.C3926a;
import p163g.p449j.p450a.p451a.p457d.p461d.C10997h;
import p163g.p449j.p450a.p451a.p465e.C11406a;
import p163g.p449j.p450a.p451a.p465e.C11423f;

/* renamed from: com.google.android.gms.common.api.internal.i2 */
final class C9749i2 implements C9743h1 {

    /* renamed from: a */
    private final Context f22846a;

    /* renamed from: b */
    private final C9755k0 f22847b;

    /* renamed from: c */
    private final Looper f22848c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C9788t0 f22849d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C9788t0 f22850e;

    /* renamed from: f */
    private final Map<C9681c<?>, C9788t0> f22851f;

    /* renamed from: g */
    private final Set<C9758l> f22852g = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: h */
    private final C9689f f22853h;

    /* renamed from: i */
    private Bundle f22854i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C9820b f22855j = null;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C9820b f22856k = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f22857l = false;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Lock f22858m;

    /* renamed from: n */
    private int f22859n = 0;

    private C9749i2(Context context, C9755k0 k0Var, Lock lock, Looper looper, C9826e eVar, Map<C9681c<?>, C9689f> map, Map<C9681c<?>, C9689f> map2, C9864d dVar, C9679a<? extends C11423f, C11406a> aVar, C9689f fVar, ArrayList<C9740g2> arrayList, ArrayList<C9740g2> arrayList2, Map<C9678a<?>, Boolean> map3, Map<C9678a<?>, Boolean> map4) {
        this.f22846a = context;
        this.f22847b = k0Var;
        this.f22858m = lock;
        this.f22848c = looper;
        this.f22853h = fVar;
        Context context2 = context;
        Lock lock2 = lock;
        Looper looper2 = looper;
        C9826e eVar2 = eVar;
        C9788t0 t0Var = r3;
        C9788t0 t0Var2 = new C9788t0(context2, this.f22847b, lock2, looper2, eVar2, map2, null, map4, null, arrayList2, new C9757k2(this, null));
        this.f22849d = t0Var;
        C9788t0 t0Var3 = new C9788t0(context2, this.f22847b, lock2, looper2, eVar2, map, dVar, map3, aVar, arrayList, new C9761l2(this, null));
        this.f22850e = t0Var3;
        C3926a aVar2 = new C3926a();
        for (C9681c put : map2.keySet()) {
            aVar2.put(put, this.f22849d);
        }
        for (C9681c put2 : map.keySet()) {
            aVar2.put(put2, this.f22850e);
        }
        this.f22851f = Collections.unmodifiableMap(aVar2);
    }

    /* renamed from: a */
    public static C9749i2 m30304a(Context context, C9755k0 k0Var, Lock lock, Looper looper, C9826e eVar, Map<C9681c<?>, C9689f> map, C9864d dVar, Map<C9678a<?>, Boolean> map2, C9679a<? extends C11423f, C11406a> aVar, ArrayList<C9740g2> arrayList) {
        Map<C9678a<?>, Boolean> map3 = map2;
        C3926a aVar2 = new C3926a();
        C3926a aVar3 = new C3926a();
        C9689f fVar = null;
        for (Entry entry : map.entrySet()) {
            C9689f fVar2 = (C9689f) entry.getValue();
            if (fVar2.mo24961d()) {
                fVar = fVar2;
            }
            if (fVar2.mo25035l()) {
                aVar2.put((C9681c) entry.getKey(), fVar2);
            } else {
                aVar3.put((C9681c) entry.getKey(), fVar2);
            }
        }
        C9908u.m30865b(!aVar2.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        C3926a aVar4 = new C3926a();
        C3926a aVar5 = new C3926a();
        for (C9678a aVar6 : map2.keySet()) {
            C9681c a = aVar6.mo25016a();
            if (aVar2.containsKey(a)) {
                aVar4.put(aVar6, (Boolean) map3.get(aVar6));
            } else if (aVar3.containsKey(a)) {
                aVar5.put(aVar6, (Boolean) map3.get(aVar6));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C9740g2 g2Var = (C9740g2) obj;
            if (aVar4.containsKey(g2Var.f22839a)) {
                arrayList2.add(g2Var);
            } else if (aVar5.containsKey(g2Var.f22839a)) {
                arrayList3.add(g2Var);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        C9749i2 i2Var = new C9749i2(context, k0Var, lock, looper, eVar, aVar2, aVar3, dVar, aVar, fVar, arrayList2, arrayList3, aVar4, aVar5);
        return i2Var;
    }

    /* renamed from: h */
    private final PendingIntent m30321h() {
        if (this.f22853h == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f22846a, System.identityHashCode(this.f22847b), this.f22853h.mo24963k(), 134217728);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void m30322i() {
        if (m30315b(this.f22855j)) {
            if (m30315b(this.f22856k) || m30324k()) {
                int i = this.f22859n;
                if (i != 1) {
                    if (i != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        this.f22859n = 0;
                        return;
                    }
                    this.f22847b.mo25190a(this.f22854i);
                }
                m30323j();
                this.f22859n = 0;
                return;
            }
            C9820b bVar = this.f22856k;
            if (bVar != null) {
                if (this.f22859n == 1) {
                    m30323j();
                    return;
                }
                m30311a(bVar);
                this.f22849d.mo25176a();
            }
        } else if (this.f22855j == null || !m30315b(this.f22856k)) {
            C9820b bVar2 = this.f22855j;
            if (bVar2 != null) {
                C9820b bVar3 = this.f22856k;
                if (bVar3 != null) {
                    if (this.f22850e.f22970m < this.f22849d.f22970m) {
                        bVar2 = bVar3;
                    }
                    m30311a(bVar2);
                }
            }
        } else {
            this.f22850e.mo25176a();
            m30311a(this.f22855j);
        }
    }

    /* renamed from: j */
    private final void m30323j() {
        for (C9758l onComplete : this.f22852g) {
            onComplete.onComplete();
        }
        this.f22852g.clear();
    }

    /* renamed from: k */
    private final boolean m30324k() {
        C9820b bVar = this.f22856k;
        return bVar != null && bVar.mo25270c() == 4;
    }

    /* renamed from: b */
    public final <A extends C9680b, R extends C9810l, T extends C9718c<R, A>> T mo25179b(T t) {
        if (!m30316c((C9718c<? extends C9810l, ? extends C9680b>) t)) {
            return this.f22849d.mo25179b(t);
        }
        if (!m30324k()) {
            return this.f22850e.mo25179b(t);
        }
        t.mo25124c(new Status(4, null, m30321h()));
        return t;
    }

    /* renamed from: c */
    public final boolean mo25181c() {
        this.f22858m.lock();
        try {
            boolean z = true;
            if (!this.f22849d.mo25181c() || (!this.f22850e.mo25181c() && !m30324k() && this.f22859n != 1)) {
                z = false;
            }
            return z;
        } finally {
            this.f22858m.unlock();
        }
    }

    /* renamed from: d */
    public final void mo25182d() {
        this.f22849d.mo25182d();
        this.f22850e.mo25182d();
    }

    /* renamed from: e */
    public final void mo25183e() {
        this.f22858m.lock();
        try {
            boolean g = mo25192g();
            this.f22850e.mo25176a();
            this.f22856k = new C9820b(4);
            if (g) {
                new C10997h(this.f22848c).post(new C9753j2(this));
            } else {
                m30323j();
            }
        } finally {
            this.f22858m.unlock();
        }
    }

    /* renamed from: f */
    public final C9820b mo25184f() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public final boolean mo25192g() {
        this.f22858m.lock();
        try {
            return this.f22859n == 2;
        } finally {
            this.f22858m.unlock();
        }
    }

    /* renamed from: c */
    private final boolean m30316c(C9718c<? extends C9810l, ? extends C9680b> cVar) {
        C9681c h = cVar.mo25126h();
        C9908u.m30861a(this.f22851f.containsKey(h), (Object) "GoogleApiClient is not configured to use the API required for this call.");
        return ((C9788t0) this.f22851f.get(h)).equals(this.f22850e);
    }

    /* renamed from: b */
    public final void mo25180b() {
        this.f22859n = 2;
        this.f22857l = false;
        this.f22856k = null;
        this.f22855j = null;
        this.f22849d.mo25180b();
        this.f22850e.mo25180b();
    }

    /* renamed from: b */
    private static boolean m30315b(C9820b bVar) {
        return bVar != null && bVar.mo25275g();
    }

    /* renamed from: a */
    public final <A extends C9680b, T extends C9718c<? extends C9810l, A>> T mo25175a(T t) {
        if (!m30316c((C9718c<? extends C9810l, ? extends C9680b>) t)) {
            return this.f22849d.mo25175a(t);
        }
        if (!m30324k()) {
            return this.f22850e.mo25175a(t);
        }
        t.mo25124c(new Status(4, null, m30321h()));
        return t;
    }

    /* renamed from: a */
    public final void mo25176a() {
        this.f22856k = null;
        this.f22855j = null;
        this.f22859n = 0;
        this.f22849d.mo25176a();
        this.f22850e.mo25176a();
        m30323j();
    }

    /* renamed from: a */
    public final boolean mo25178a(C9758l lVar) {
        this.f22858m.lock();
        try {
            if ((mo25192g() || mo25181c()) && !this.f22850e.mo25181c()) {
                this.f22852g.add(lVar);
                if (this.f22859n == 0) {
                    this.f22859n = 1;
                }
                this.f22856k = null;
                this.f22850e.mo25180b();
                return true;
            }
            this.f22858m.unlock();
            return false;
        } finally {
            this.f22858m.unlock();
        }
    }

    /* renamed from: a */
    private final void m30311a(C9820b bVar) {
        int i = this.f22859n;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f22859n = 0;
            }
            this.f22847b.mo25191a(bVar);
        }
        m30323j();
        this.f22859n = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m30307a(int i, boolean z) {
        this.f22847b.mo25189a(i, z);
        this.f22856k = null;
        this.f22855j = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m30308a(Bundle bundle) {
        Bundle bundle2 = this.f22854i;
        if (bundle2 == null) {
            this.f22854i = bundle;
            return;
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    /* renamed from: a */
    public final void mo25177a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = ":";
        printWriter.append(str).append("authClient").println(str2);
        String str3 = "  ";
        this.f22850e.mo25177a(String.valueOf(str).concat(str3), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(str2);
        this.f22849d.mo25177a(String.valueOf(str).concat(str3), fileDescriptor, printWriter, strArr);
    }
}
