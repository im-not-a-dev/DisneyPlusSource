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
import com.google.android.gms.common.api.C9810l;
import com.google.android.gms.common.internal.C9864d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import p163g.p449j.p450a.p451a.p465e.C11406a;
import p163g.p449j.p450a.p451a.p465e.C11423f;

/* renamed from: com.google.android.gms.common.api.internal.t0 */
public final class C9788t0 implements C9743h1, C9744h2 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Lock f22958a;

    /* renamed from: b */
    private final Condition f22959b;

    /* renamed from: c */
    private final Context f22960c;

    /* renamed from: d */
    private final C9826e f22961d;

    /* renamed from: e */
    private final C9794v0 f22962e;

    /* renamed from: f */
    final Map<C9681c<?>, C9689f> f22963f;

    /* renamed from: g */
    final Map<C9681c<?>, C9820b> f22964g = new HashMap();

    /* renamed from: h */
    private final C9864d f22965h;

    /* renamed from: i */
    private final Map<C9678a<?>, Boolean> f22966i;

    /* renamed from: j */
    private final C9679a<? extends C11423f, C11406a> f22967j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public volatile C9785s0 f22968k;

    /* renamed from: l */
    private C9820b f22969l = null;

    /* renamed from: m */
    int f22970m;

    /* renamed from: n */
    final C9755k0 f22971n;

    /* renamed from: o */
    final C9748i1 f22972o;

    public C9788t0(Context context, C9755k0 k0Var, Lock lock, Looper looper, C9826e eVar, Map<C9681c<?>, C9689f> map, C9864d dVar, Map<C9678a<?>, Boolean> map2, C9679a<? extends C11423f, C11406a> aVar, ArrayList<C9740g2> arrayList, C9748i1 i1Var) {
        this.f22960c = context;
        this.f22958a = lock;
        this.f22961d = eVar;
        this.f22963f = map;
        this.f22965h = dVar;
        this.f22966i = map2;
        this.f22967j = aVar;
        this.f22971n = k0Var;
        this.f22972o = i1Var;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C9740g2) obj).mo25174a((C9744h2) this);
        }
        this.f22962e = new C9794v0(this, looper);
        this.f22959b = lock.newCondition();
        this.f22968k = new C9751j0(this);
    }

    /* renamed from: a */
    public final <A extends C9680b, T extends C9718c<? extends C9810l, A>> T mo25175a(T t) {
        t.mo25092f();
        return this.f22968k.mo25194a(t);
    }

    /* renamed from: a */
    public final boolean mo25178a(C9758l lVar) {
        return false;
    }

    /* renamed from: b */
    public final <A extends C9680b, R extends C9810l, T extends C9718c<R, A>> T mo25179b(T t) {
        t.mo25092f();
        return this.f22968k.mo25197b(t);
    }

    /* renamed from: c */
    public final boolean mo25181c() {
        return this.f22968k instanceof C9793v;
    }

    /* renamed from: d */
    public final void mo25182d() {
        if (mo25181c()) {
            ((C9793v) this.f22968k).mo25250d();
        }
    }

    /* renamed from: e */
    public final void mo25183e() {
    }

    /* renamed from: f */
    public final C9820b mo25184f() {
        mo25180b();
        while (mo25243g()) {
            try {
                this.f22959b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new C9820b(15, null);
            }
        }
        if (mo25181c()) {
            return C9820b.f23019X;
        }
        C9820b bVar = this.f22969l;
        if (bVar != null) {
            return bVar;
        }
        return new C9820b(13, null);
    }

    /* renamed from: g */
    public final boolean mo25243g() {
        return this.f22968k instanceof C9802y;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final void mo25244h() {
        this.f22958a.lock();
        try {
            C9802y yVar = new C9802y(this, this.f22965h, this.f22966i, this.f22961d, this.f22967j, this.f22958a, this.f22960c);
            this.f22968k = yVar;
            this.f22968k.mo25201c();
            this.f22959b.signalAll();
        } finally {
            this.f22958a.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final void mo25245i() {
        this.f22958a.lock();
        try {
            this.f22971n.mo25211l();
            this.f22968k = new C9793v(this);
            this.f22968k.mo25201c();
            this.f22959b.signalAll();
        } finally {
            this.f22958a.unlock();
        }
    }

    /* renamed from: a */
    public final void mo25176a() {
        if (this.f22968k.mo25196a()) {
            this.f22964g.clear();
        }
    }

    /* renamed from: b */
    public final void mo25180b() {
        this.f22968k.mo25198b();
    }

    /* renamed from: b */
    public final void mo25077b(Bundle bundle) {
        this.f22958a.lock();
        try {
            this.f22968k.mo25200b(bundle);
        } finally {
            this.f22958a.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo25241a(C9820b bVar) {
        this.f22958a.lock();
        try {
            this.f22969l = bVar;
            this.f22968k = new C9751j0(this);
            this.f22968k.mo25201c();
            this.f22959b.signalAll();
        } finally {
            this.f22958a.unlock();
        }
    }

    /* renamed from: b */
    public final void mo25076b(int i) {
        this.f22958a.lock();
        try {
            this.f22968k.mo25199b(i);
        } finally {
            this.f22958a.unlock();
        }
    }

    /* renamed from: a */
    public final void mo25147a(C9820b bVar, C9678a<?> aVar, boolean z) {
        this.f22958a.lock();
        try {
            this.f22968k.mo25195a(bVar, aVar, z);
        } finally {
            this.f22958a.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo25240a(C9791u0 u0Var) {
        this.f22962e.sendMessage(this.f22962e.obtainMessage(1, u0Var));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo25242a(RuntimeException runtimeException) {
        this.f22962e.sendMessage(this.f22962e.obtainMessage(2, runtimeException));
    }

    /* renamed from: a */
    public final void mo25177a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.f22968k);
        for (C9678a aVar : this.f22966i.keySet()) {
            printWriter.append(str).append(aVar.mo25017b()).println(":");
            ((C9689f) this.f22963f.get(aVar.mo25016a())).mo25029a(concat, fileDescriptor, printWriter, strArr);
        }
    }
}
