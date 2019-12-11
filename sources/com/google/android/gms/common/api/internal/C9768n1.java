package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C9820b;
import com.google.android.gms.common.api.C9678a.C9679a;
import com.google.android.gms.common.api.C9698f.C9700b;
import com.google.android.gms.common.api.C9698f.C9701c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C9864d;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.internal.C9912w;
import java.util.Set;
import p163g.p449j.p450a.p451a.p465e.C11406a;
import p163g.p449j.p450a.p451a.p465e.C11420c;
import p163g.p449j.p450a.p451a.p465e.C11423f;
import p163g.p449j.p450a.p451a.p465e.p466b.C11411d;
import p163g.p449j.p450a.p451a.p465e.p466b.C11418k;

/* renamed from: com.google.android.gms.common.api.internal.n1 */
public final class C9768n1 extends C11411d implements C9700b, C9701c {

    /* renamed from: h */
    private static C9679a<? extends C11423f, C11406a> f22905h = C11420c.f26759c;

    /* renamed from: a */
    private final Context f22906a;

    /* renamed from: b */
    private final Handler f22907b;

    /* renamed from: c */
    private final C9679a<? extends C11423f, C11406a> f22908c;

    /* renamed from: d */
    private Set<Scope> f22909d;

    /* renamed from: e */
    private C9864d f22910e;

    /* renamed from: f */
    private C11423f f22911f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C9780q1 f22912g;

    public C9768n1(Context context, Handler handler, C9864d dVar) {
        this(context, handler, dVar, f22905h);
    }

    /* renamed from: a */
    public final void mo25217a(C9780q1 q1Var) {
        C11423f fVar = this.f22911f;
        if (fVar != null) {
            fVar.mo25025a();
        }
        this.f22910e.mo25355a(Integer.valueOf(System.identityHashCode(this)));
        C9679a<? extends C11423f, C11406a> aVar = this.f22908c;
        Context context = this.f22906a;
        Looper looper = this.f22907b.getLooper();
        C9864d dVar = this.f22910e;
        this.f22911f = (C11423f) aVar.mo25020a(context, looper, dVar, dVar.mo25364j(), this, this);
        this.f22912g = q1Var;
        Set<Scope> set = this.f22909d;
        if (set == null || set.isEmpty()) {
            this.f22907b.post(new C9772o1(this));
        } else {
            this.f22911f.mo29224b();
        }
    }

    /* renamed from: b */
    public final void mo25077b(Bundle bundle) {
        this.f22911f.mo29223a(this);
    }

    /* renamed from: j */
    public final C11423f mo25218j() {
        return this.f22911f;
    }

    /* renamed from: k */
    public final void mo25219k() {
        C11423f fVar = this.f22911f;
        if (fVar != null) {
            fVar.mo25025a();
        }
    }

    public C9768n1(Context context, Handler handler, C9864d dVar, C9679a<? extends C11423f, C11406a> aVar) {
        this.f22906a = context;
        this.f22907b = handler;
        C9908u.m30854a(dVar, (Object) "ClientSettings must not be null");
        this.f22910e = dVar;
        this.f22909d = dVar.mo25363i();
        this.f22908c = aVar;
    }

    /* renamed from: b */
    public final void mo25076b(int i) {
        this.f22911f.mo25025a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m30401b(C11418k kVar) {
        C9820b c = kVar.mo29239c();
        if (c.mo25275g()) {
            C9912w d = kVar.mo29240d();
            C9820b d2 = d.mo25443d();
            if (!d2.mo25275g()) {
                String valueOf = String.valueOf(d2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                this.f22912g.mo25165b(d2);
                this.f22911f.mo25025a();
                return;
            }
            this.f22912g.mo25164a(d.mo25442c(), this.f22909d);
        } else {
            this.f22912g.mo25165b(c);
        }
        this.f22911f.mo25025a();
    }

    /* renamed from: a */
    public final void mo25078a(C9820b bVar) {
        this.f22912g.mo25165b(bVar);
    }

    /* renamed from: a */
    public final void mo25167a(C11418k kVar) {
        this.f22907b.post(new C9776p1(this, kVar));
    }
}
