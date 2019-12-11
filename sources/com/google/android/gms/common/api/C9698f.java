package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.C9820b;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.C9678a.C9679a;
import com.google.android.gms.common.api.C9678a.C9680b;
import com.google.android.gms.common.api.C9678a.C9682d;
import com.google.android.gms.common.api.C9678a.C9682d.C9685c;
import com.google.android.gms.common.api.C9678a.C9682d.C9686d;
import com.google.android.gms.common.api.C9678a.C9689f;
import com.google.android.gms.common.api.internal.C9718c;
import com.google.android.gms.common.api.internal.C9721c2;
import com.google.android.gms.common.api.internal.C9737g;
import com.google.android.gms.common.api.internal.C9740g2;
import com.google.android.gms.common.api.internal.C9755k0;
import com.google.android.gms.common.api.internal.C9758l;
import com.google.android.gms.common.api.internal.C9783r1;
import com.google.android.gms.common.internal.C9864d;
import com.google.android.gms.common.internal.C9864d.C9866b;
import com.google.android.gms.common.internal.C9908u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import p096e.p113e.C3926a;
import p163g.p449j.p450a.p451a.p465e.C11406a;
import p163g.p449j.p450a.p451a.p465e.C11420c;
import p163g.p449j.p450a.p451a.p465e.C11423f;

/* renamed from: com.google.android.gms.common.api.f */
public abstract class C9698f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Set<C9698f> f22721a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: com.google.android.gms.common.api.f$a */
    public static final class C9699a {

        /* renamed from: a */
        private Account f22722a;

        /* renamed from: b */
        private final Set<Scope> f22723b = new HashSet();

        /* renamed from: c */
        private final Set<Scope> f22724c = new HashSet();

        /* renamed from: d */
        private int f22725d;

        /* renamed from: e */
        private View f22726e;

        /* renamed from: f */
        private String f22727f;

        /* renamed from: g */
        private String f22728g;

        /* renamed from: h */
        private final Map<C9678a<?>, C9866b> f22729h = new C3926a();

        /* renamed from: i */
        private final Context f22730i;

        /* renamed from: j */
        private final Map<C9678a<?>, C9682d> f22731j = new C3926a();

        /* renamed from: k */
        private C9737g f22732k;

        /* renamed from: l */
        private int f22733l = -1;

        /* renamed from: m */
        private Looper f22734m;

        /* renamed from: n */
        private GoogleApiAvailability f22735n = GoogleApiAvailability.m30032a();

        /* renamed from: o */
        private C9679a<? extends C11423f, C11406a> f22736o = C11420c.f26759c;

        /* renamed from: p */
        private final ArrayList<C9700b> f22737p = new ArrayList<>();

        /* renamed from: q */
        private final ArrayList<C9701c> f22738q = new ArrayList<>();

        public C9699a(Context context) {
            this.f22730i = context;
            this.f22734m = context.getMainLooper();
            this.f22727f = context.getPackageName();
            this.f22728g = context.getClass().getName();
        }

        /* renamed from: a */
        public final C9699a mo25069a(Handler handler) {
            C9908u.m30854a(handler, (Object) "Handler must not be null");
            this.f22734m = handler.getLooper();
            return this;
        }

        /* renamed from: b */
        public final C9864d mo25075b() {
            C11406a aVar = C11406a.f26736b0;
            if (this.f22731j.containsKey(C11420c.f26761e)) {
                aVar = (C11406a) this.f22731j.get(C11420c.f26761e);
            }
            C9864d dVar = new C9864d(this.f22722a, this.f22723b, this.f22729h, this.f22725d, this.f22726e, this.f22727f, this.f22728g, aVar, false);
            return dVar;
        }

        /* renamed from: a */
        public final C9699a mo25072a(C9700b bVar) {
            C9908u.m30854a(bVar, (Object) "Listener must not be null");
            this.f22737p.add(bVar);
            return this;
        }

        /* renamed from: a */
        public final C9699a mo25073a(C9701c cVar) {
            C9908u.m30854a(cVar, (Object) "Listener must not be null");
            this.f22738q.add(cVar);
            return this;
        }

        /* renamed from: a */
        public final C9699a mo25070a(C9678a<? extends C9686d> aVar) {
            C9908u.m30854a(aVar, (Object) "Api must not be null");
            this.f22731j.put(aVar, null);
            List a = aVar.mo25018c().mo25024a(null);
            this.f22724c.addAll(a);
            this.f22723b.addAll(a);
            return this;
        }

        /* renamed from: a */
        public final <O extends C9685c> C9699a mo25071a(C9678a<O> aVar, O o) {
            C9908u.m30854a(aVar, (Object) "Api must not be null");
            C9908u.m30854a(o, (Object) "Null options are not permitted for this Api");
            this.f22731j.put(aVar, o);
            List a = aVar.mo25018c().mo25024a(o);
            this.f22724c.addAll(a);
            this.f22723b.addAll(a);
            return this;
        }

        /* renamed from: a */
        public final C9698f mo25074a() {
            C9908u.m30861a(!this.f22731j.isEmpty(), (Object) "must call addApi() to add at least one API");
            C9864d b = mo25075b();
            Map f = b.mo25360f();
            C3926a aVar = new C3926a();
            C3926a aVar2 = new C3926a();
            ArrayList arrayList = new ArrayList();
            C9678a aVar3 = null;
            boolean z = false;
            for (C9678a aVar4 : this.f22731j.keySet()) {
                Object obj = this.f22731j.get(aVar4);
                boolean z2 = f.get(aVar4) != null;
                aVar.put(aVar4, Boolean.valueOf(z2));
                C9740g2 g2Var = new C9740g2(aVar4, z2);
                arrayList.add(g2Var);
                C9679a d = aVar4.mo25019d();
                C9678a aVar5 = aVar4;
                C9689f a = d.mo25020a(this.f22730i, this.f22734m, b, obj, g2Var, g2Var);
                aVar2.put(aVar5.mo25016a(), a);
                if (d.mo25023a() == 1) {
                    z = obj != null;
                }
                if (a.mo24961d()) {
                    if (aVar3 == null) {
                        aVar3 = aVar5;
                    } else {
                        String b2 = aVar5.mo25017b();
                        String b3 = aVar3.mo25017b();
                        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 21 + String.valueOf(b3).length());
                        sb.append(b2);
                        sb.append(" cannot be used with ");
                        sb.append(b3);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
            if (aVar3 != null) {
                if (!z) {
                    C9908u.m30866b(this.f22722a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", aVar3.mo25017b());
                    C9908u.m30866b(this.f22723b.equals(this.f22724c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", aVar3.mo25017b());
                } else {
                    String b4 = aVar3.mo25017b();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(b4).length() + 82);
                    sb2.append("With using ");
                    sb2.append(b4);
                    sb2.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            C9755k0 k0Var = new C9755k0(this.f22730i, new ReentrantLock(), this.f22734m, b, this.f22735n, this.f22736o, aVar, this.f22737p, this.f22738q, aVar2, this.f22733l, C9755k0.m30349a((Iterable<C9689f>) aVar2.values(), true), arrayList, false);
            synchronized (C9698f.f22721a) {
                C9698f.f22721a.add(k0Var);
            }
            if (this.f22733l < 0) {
                return k0Var;
            }
            C9721c2.m30182b(this.f22732k);
            throw null;
        }
    }

    /* renamed from: com.google.android.gms.common.api.f$b */
    public interface C9700b {
        /* renamed from: b */
        void mo25076b(int i);

        /* renamed from: b */
        void mo25077b(Bundle bundle);
    }

    /* renamed from: com.google.android.gms.common.api.f$c */
    public interface C9701c {
        /* renamed from: a */
        void mo25078a(C9820b bVar);
    }

    /* renamed from: h */
    public static Set<C9698f> m30106h() {
        Set<C9698f> set;
        synchronized (f22721a) {
            set = f22721a;
        }
        return set;
    }

    /* renamed from: a */
    public <A extends C9680b, R extends C9810l, T extends C9718c<R, A>> T mo25058a(T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public abstract C9820b mo25059a();

    /* renamed from: b */
    public abstract C9702g<Status> mo25062b();

    /* renamed from: b */
    public <A extends C9680b, T extends C9718c<? extends C9810l, A>> T mo25063b(T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public abstract void mo25064c();

    /* renamed from: d */
    public abstract void mo25065d();

    /* renamed from: e */
    public Context mo25066e() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public Looper mo25067f() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public void mo25068g() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public boolean mo25061a(C9758l lVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo25060a(C9783r1 r1Var) {
        throw new UnsupportedOperationException();
    }
}
