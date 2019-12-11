package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.C9820b;
import com.google.android.gms.common.C9826e;
import com.google.android.gms.common.api.C9678a;
import com.google.android.gms.common.api.C9678a.C9679a;
import com.google.android.gms.common.api.C9678a.C9680b;
import com.google.android.gms.common.api.C9678a.C9681c;
import com.google.android.gms.common.api.C9678a.C9689f;
import com.google.android.gms.common.api.C9695e;
import com.google.android.gms.common.api.C9810l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C9864d;
import com.google.android.gms.common.internal.C9864d.C9866b;
import com.google.android.gms.common.util.p401p.C9952a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import p096e.p113e.C3926a;
import p163g.p449j.p450a.p451a.p465e.C11406a;
import p163g.p449j.p450a.p451a.p465e.C11423f;
import p163g.p449j.p450a.p451a.p467f.C11428c;

/* renamed from: com.google.android.gms.common.api.internal.n2 */
public final class C9769n2 implements C9743h1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<C9681c<?>, C9765m2<?>> f22913a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<C9681c<?>, C9765m2<?>> f22914b = new HashMap();

    /* renamed from: c */
    private final Map<C9678a<?>, Boolean> f22915c;

    /* renamed from: d */
    private final C9726e f22916d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C9755k0 f22917e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Lock f22918f;

    /* renamed from: g */
    private final Looper f22919g;

    /* renamed from: h */
    private final C9826e f22920h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Condition f22921i;

    /* renamed from: j */
    private final C9864d f22922j;

    /* renamed from: k */
    private final boolean f22923k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final boolean f22924l;

    /* renamed from: m */
    private final Queue<C9718c<?, ?>> f22925m = new LinkedList();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f22926n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Map<C9717b2<?>, C9820b> f22927o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public Map<C9717b2<?>, C9820b> f22928p;

    /* renamed from: q */
    private C9774p f22929q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C9820b f22930r;

    public C9769n2(Context context, Lock lock, Looper looper, C9826e eVar, Map<C9681c<?>, C9689f> map, C9864d dVar, Map<C9678a<?>, Boolean> map2, C9679a<? extends C11423f, C11406a> aVar, ArrayList<C9740g2> arrayList, C9755k0 k0Var, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        this.f22918f = lock;
        this.f22919g = looper;
        this.f22921i = lock.newCondition();
        this.f22920h = eVar;
        this.f22917e = k0Var;
        this.f22915c = map2;
        this.f22922j = dVar;
        this.f22923k = z;
        HashMap hashMap = new HashMap();
        for (C9678a aVar2 : map2.keySet()) {
            hashMap.put(aVar2.mo25016a(), aVar2);
        }
        HashMap hashMap2 = new HashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C9740g2 g2Var = (C9740g2) obj;
            hashMap2.put(g2Var.f22839a, g2Var);
        }
        boolean z5 = true;
        boolean z6 = false;
        boolean z7 = true;
        boolean z8 = false;
        for (Entry entry : map.entrySet()) {
            C9678a aVar3 = (C9678a) hashMap.get(entry.getKey());
            C9689f fVar = (C9689f) entry.getValue();
            if (fVar.mo25033h()) {
                z3 = z7;
                z4 = !((Boolean) this.f22915c.get(aVar3)).booleanValue() ? true : z8;
                z2 = true;
            } else {
                z2 = z6;
                z4 = z8;
                z3 = false;
            }
            C9765m2 m2Var = r1;
            C9765m2 m2Var2 = new C9765m2(context, aVar3, looper, fVar, (C9740g2) hashMap2.get(aVar3), dVar, aVar);
            this.f22913a.put((C9681c) entry.getKey(), m2Var);
            if (fVar.mo25035l()) {
                this.f22914b.put((C9681c) entry.getKey(), m2Var);
            }
            z8 = z4;
            z7 = z3;
            z6 = z2;
        }
        if (!z6 || z7 || z8) {
            z5 = false;
        }
        this.f22924l = z5;
        this.f22916d = C9726e.m30195e();
    }

    /* renamed from: c */
    private final <T extends C9718c<? extends C9810l, ? extends C9680b>> boolean m30419c(T t) {
        C9681c h = t.mo25126h();
        C9820b a = m30409a(h);
        if (a == null || a.mo25270c() != 4) {
            return false;
        }
        t.mo25124c(new Status(4, null, this.f22916d.mo25133a(((C9765m2) this.f22913a.get(h)).mo25055g(), System.identityHashCode(this.f22917e))));
        return true;
    }

    /* renamed from: h */
    private final boolean m30425h() {
        this.f22918f.lock();
        try {
            if (this.f22926n) {
                if (this.f22923k) {
                    for (C9681c a : this.f22914b.keySet()) {
                        C9820b a2 = m30409a(a);
                        if (a2 != null) {
                            if (!a2.mo25275g()) {
                            }
                        }
                        this.f22918f.unlock();
                        return false;
                    }
                    this.f22918f.unlock();
                    return true;
                }
            }
            return false;
        } finally {
            this.f22918f.unlock();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void m30426i() {
        C9864d dVar = this.f22922j;
        if (dVar == null) {
            this.f22917e.f22881q = Collections.emptySet();
            return;
        }
        HashSet hashSet = new HashSet(dVar.mo25363i());
        Map f = this.f22922j.mo25360f();
        for (C9678a aVar : f.keySet()) {
            C9820b a = mo25220a(aVar);
            if (a != null && a.mo25275g()) {
                hashSet.addAll(((C9866b) f.get(aVar)).f23114a);
            }
        }
        this.f22917e.f22881q = hashSet;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void m30428j() {
        while (!this.f22925m.isEmpty()) {
            mo25175a((T) (C9718c) this.f22925m.remove());
        }
        this.f22917e.mo25190a((Bundle) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final C9820b m30431k() {
        C9820b bVar = null;
        C9820b bVar2 = null;
        int i = 0;
        int i2 = 0;
        for (C9765m2 m2Var : this.f22913a.values()) {
            C9678a c = m2Var.mo25051c();
            C9820b bVar3 = (C9820b) this.f22927o.get(m2Var.mo25055g());
            if (!bVar3.mo25275g() && (!((Boolean) this.f22915c.get(c)).booleanValue() || bVar3.mo25274f() || this.f22920h.mo24989c(bVar3.mo25270c()))) {
                if (bVar3.mo25270c() != 4 || !this.f22923k) {
                    int a = c.mo25018c().mo25023a();
                    if (bVar == null || i > a) {
                        bVar = bVar3;
                        i = a;
                    }
                } else {
                    int a2 = c.mo25018c().mo25023a();
                    if (bVar2 == null || i2 > a2) {
                        bVar2 = bVar3;
                        i2 = a2;
                    }
                }
            }
        }
        return (bVar == null || bVar2 == null || i <= i2) ? bVar : bVar2;
    }

    /* renamed from: a */
    public final <A extends C9680b, T extends C9718c<? extends C9810l, A>> T mo25175a(T t) {
        C9681c h = t.mo25126h();
        if (this.f22923k && m30419c(t)) {
            return t;
        }
        this.f22917e.f22889y.mo25248a(t);
        ((C9765m2) this.f22913a.get(h)).mo25049b(t);
        return t;
    }

    /* renamed from: a */
    public final void mo25177a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: b */
    public final <A extends C9680b, R extends C9810l, T extends C9718c<R, A>> T mo25179b(T t) {
        if (this.f22923k && m30419c(t)) {
            return t;
        }
        if (!mo25181c()) {
            this.f22925m.add(t);
            return t;
        }
        this.f22917e.f22889y.mo25248a(t);
        ((C9765m2) this.f22913a.get(t.mo25126h())).mo25047a(t);
        return t;
    }

    /* renamed from: d */
    public final void mo25182d() {
    }

    /* renamed from: e */
    public final void mo25183e() {
        this.f22918f.lock();
        try {
            this.f22916d.mo25135a();
            if (this.f22929q != null) {
                this.f22929q.mo25227a();
                this.f22929q = null;
            }
            if (this.f22928p == null) {
                this.f22928p = new C3926a(this.f22914b.size());
            }
            C9820b bVar = new C9820b(4);
            for (C9765m2 g : this.f22914b.values()) {
                this.f22928p.put(g.mo25055g(), bVar);
            }
            if (this.f22927o != null) {
                this.f22927o.putAll(this.f22928p);
            }
        } finally {
            this.f22918f.unlock();
        }
    }

    /* renamed from: f */
    public final C9820b mo25184f() {
        mo25180b();
        while (mo25221g()) {
            try {
                this.f22921i.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new C9820b(15, null);
            }
        }
        if (mo25181c()) {
            return C9820b.f23019X;
        }
        C9820b bVar = this.f22930r;
        if (bVar != null) {
            return bVar;
        }
        return new C9820b(13, null);
    }

    /* renamed from: g */
    public final boolean mo25221g() {
        this.f22918f.lock();
        try {
            return this.f22927o == null && this.f22926n;
        } finally {
            this.f22918f.unlock();
        }
    }

    /* renamed from: a */
    public final void mo25176a() {
        this.f22918f.lock();
        try {
            this.f22926n = false;
            this.f22927o = null;
            this.f22928p = null;
            if (this.f22929q != null) {
                this.f22929q.mo25227a();
                this.f22929q = null;
            }
            this.f22930r = null;
            while (!this.f22925m.isEmpty()) {
                C9718c cVar = (C9718c) this.f22925m.remove();
                cVar.mo25085a((C9801x1) null);
                cVar.mo25084a();
            }
            this.f22921i.signalAll();
        } finally {
            this.f22918f.unlock();
        }
    }

    /* renamed from: b */
    public final void mo25180b() {
        this.f22918f.lock();
        try {
            if (!this.f22926n) {
                this.f22926n = true;
                this.f22927o = null;
                this.f22928p = null;
                this.f22929q = null;
                this.f22930r = null;
                this.f22916d.mo25141c();
                this.f22916d.mo25134a((Iterable<? extends C9695e<?>>) this.f22913a.values()).mo29254a((Executor) new C9952a(this.f22919g), (C11428c<TResult>) new C9777p2<TResult>(this));
                this.f22918f.unlock();
            }
        } finally {
            this.f22918f.unlock();
        }
    }

    /* renamed from: c */
    public final boolean mo25181c() {
        this.f22918f.lock();
        try {
            return this.f22927o != null && this.f22930r == null;
        } finally {
            this.f22918f.unlock();
        }
    }

    /* renamed from: a */
    public final C9820b mo25220a(C9678a<?> aVar) {
        return m30409a(aVar.mo25016a());
    }

    /* renamed from: a */
    private final C9820b m30409a(C9681c<?> cVar) {
        this.f22918f.lock();
        try {
            C9765m2 m2Var = (C9765m2) this.f22913a.get(cVar);
            if (this.f22927o != null && m2Var != null) {
                return (C9820b) this.f22927o.get(m2Var.mo25055g());
            }
            this.f22918f.unlock();
            return null;
        } finally {
            this.f22918f.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final boolean mo25178a(C9758l lVar) {
        this.f22918f.lock();
        try {
            if (!this.f22926n || m30425h()) {
                this.f22918f.unlock();
                return false;
            }
            this.f22916d.mo25141c();
            this.f22929q = new C9774p(this, lVar);
            this.f22916d.mo25134a((Iterable<? extends C9695e<?>>) this.f22914b.values()).mo29254a((Executor) new C9952a(this.f22919g), (C11428c<TResult>) this.f22929q);
            this.f22918f.unlock();
            return true;
        } catch (Throwable th) {
            this.f22918f.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m30413a(C9765m2<?> m2Var, C9820b bVar) {
        return !bVar.mo25275g() && !bVar.mo25274f() && ((Boolean) this.f22915c.get(m2Var.mo25051c())).booleanValue() && m2Var.mo25216h().mo25033h() && this.f22920h.mo24989c(bVar.mo25270c());
    }
}
