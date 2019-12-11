package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.C9698f;
import com.google.android.gms.common.api.C9706i;
import com.google.android.gms.common.api.C9810l;
import com.google.android.gms.common.api.C9811m;
import com.google.android.gms.common.api.C9812n;
import com.google.android.gms.common.api.C9813o;
import com.google.android.gms.common.api.C9814p;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C9908u;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.r1 */
public final class C9783r1<R extends C9810l> extends C9814p<R> implements C9811m<R> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C9813o<? super R, ? extends C9810l> f22947a;

    /* renamed from: b */
    private C9783r1<? extends C9810l> f22948b;

    /* renamed from: c */
    private volatile C9812n<? super R> f22949c;

    /* renamed from: d */
    private final Object f22950d;

    /* renamed from: e */
    private Status f22951e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final WeakReference<C9698f> f22952f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C9789t1 f22953g;

    /* renamed from: b */
    private final void m30471b(Status status) {
        synchronized (this.f22950d) {
            if (this.f22947a != null) {
                Status a = this.f22947a.mo25262a(status);
                C9908u.m30854a(a, (Object) "onFailure must not return null");
                this.f22948b.m30468a(a);
            } else if (m30473b()) {
                this.f22949c.mo25260a(status);
            }
        }
    }

    /* renamed from: a */
    public final void mo25229a(R r) {
        synchronized (this.f22950d) {
            if (!r.getStatus().mo25010f()) {
                m30468a(r.getStatus());
                m30472b((C9810l) r);
            } else if (this.f22947a != null) {
                C9764m1.m30393a().submit(new C9786s1(this, r));
            } else if (m30473b()) {
                this.f22949c.mo25261b(r);
            }
        }
    }

    /* renamed from: b */
    private final boolean m30473b() {
        return (this.f22949c == null || ((C9698f) this.f22952f.get()) == null) ? false : true;
    }

    /* renamed from: a */
    private final void m30468a(Status status) {
        synchronized (this.f22950d) {
            this.f22951e = status;
            m30471b(this.f22951e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m30472b(C9810l lVar) {
        if (lVar instanceof C9706i) {
            try {
                ((C9706i) lVar).mo25083a();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(lVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("TransformedResultImpl", sb.toString(), e);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo25236a() {
        this.f22949c = null;
    }
}
