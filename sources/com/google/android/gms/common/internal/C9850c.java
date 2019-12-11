package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C9820b;
import com.google.android.gms.common.C9824d;
import com.google.android.gms.common.C9826e;
import com.google.android.gms.common.api.C9694d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C9892o.C9893a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p163g.p449j.p450a.p451a.p457d.p462e.C11001d;

/* renamed from: com.google.android.gms.common.internal.c */
public abstract class C9850c<T extends IInterface> {

    /* renamed from: A */
    private static final C9824d[] f23053A = new C9824d[0];

    /* renamed from: a */
    private int f23054a;

    /* renamed from: b */
    private long f23055b;

    /* renamed from: c */
    private long f23056c;

    /* renamed from: d */
    private int f23057d;

    /* renamed from: e */
    private long f23058e;

    /* renamed from: f */
    private C9898q0 f23059f;

    /* renamed from: g */
    private final Context f23060g;

    /* renamed from: h */
    private final C9879j f23061h;

    /* renamed from: i */
    private final C9826e f23062i;

    /* renamed from: j */
    final Handler f23063j;

    /* renamed from: k */
    private final Object f23064k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Object f23065l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C9897q f23066m;

    /* renamed from: n */
    protected C9853c f23067n;

    /* renamed from: o */
    private T f23068o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final ArrayList<C9858h<?>> f23069p;

    /* renamed from: q */
    private C9860j f23070q;

    /* renamed from: r */
    private int f23071r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C9851a f23072s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final C9852b f23073t;

    /* renamed from: u */
    private final int f23074u;

    /* renamed from: v */
    private final String f23075v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C9820b f23076w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f23077x;

    /* renamed from: y */
    private volatile C9883k0 f23078y;

    /* renamed from: z */
    protected AtomicInteger f23079z;

    /* renamed from: com.google.android.gms.common.internal.c$a */
    public interface C9851a {
        /* renamed from: b */
        void mo25337b(int i);

        /* renamed from: b */
        void mo25338b(Bundle bundle);
    }

    /* renamed from: com.google.android.gms.common.internal.c$b */
    public interface C9852b {
        /* renamed from: a */
        void mo25339a(C9820b bVar);
    }

    /* renamed from: com.google.android.gms.common.internal.c$c */
    public interface C9853c {
        /* renamed from: a */
        void mo25096a(C9820b bVar);
    }

    /* renamed from: com.google.android.gms.common.internal.c$d */
    protected class C9854d implements C9853c {
        public C9854d() {
        }

        /* renamed from: a */
        public void mo25096a(C9820b bVar) {
            if (bVar.mo25275g()) {
                C9850c cVar = C9850c.this;
                cVar.mo25316a((C9886m) null, cVar.mo25335w());
                return;
            }
            if (C9850c.this.f23073t != null) {
                C9850c.this.f23073t.mo25339a(bVar);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$e */
    public interface C9855e {
        /* renamed from: a */
        void mo25117a();
    }

    /* renamed from: com.google.android.gms.common.internal.c$f */
    private abstract class C9856f extends C9858h<Boolean> {

        /* renamed from: d */
        private final int f23081d;

        /* renamed from: e */
        private final Bundle f23082e;

        protected C9856f(int i, Bundle bundle) {
            super(Boolean.valueOf(true));
            this.f23081d = i;
            this.f23082e = bundle;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo25340a(C9820b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ void mo25341a(Object obj) {
            PendingIntent pendingIntent = null;
            if (((Boolean) obj) == null) {
                C9850c.this.m30665b(1, null);
                return;
            }
            int i = this.f23081d;
            if (i != 0) {
                if (i != 10) {
                    C9850c.this.m30665b(1, null);
                    Bundle bundle = this.f23082e;
                    if (bundle != null) {
                        pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                    }
                    mo25340a(new C9820b(this.f23081d, pendingIntent));
                } else {
                    C9850c.this.m30665b(1, null);
                    throw new IllegalStateException(String.format("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", new Object[]{getClass().getSimpleName(), C9850c.this.mo24965z(), C9850c.this.mo24964y()}));
                }
            } else if (!mo25343e()) {
                C9850c.this.m30665b(1, null);
                mo25340a(new C9820b(8, null));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final void mo25342c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public abstract boolean mo25343e();
    }

    /* renamed from: com.google.android.gms.common.internal.c$g */
    final class C9857g extends C11001d {
        public C9857g(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        private static void m30722a(Message message) {
            C9858h hVar = (C9858h) message.obj;
            hVar.mo25342c();
            hVar.mo25346b();
        }

        /* renamed from: b */
        private static boolean m30723b(Message message) {
            int i = message.what;
            return i == 2 || i == 1 || i == 7;
        }

        public final void handleMessage(Message message) {
            C9820b bVar;
            C9820b bVar2;
            if (C9850c.this.f23079z.get() != message.arg1) {
                if (m30723b(message)) {
                    m30722a(message);
                }
                return;
            }
            int i = message.what;
            if ((i == 1 || i == 7 || ((i == 4 && !C9850c.this.mo25329q()) || message.what == 5)) && !C9850c.this.mo25320e()) {
                m30722a(message);
                return;
            }
            int i2 = message.what;
            PendingIntent pendingIntent = null;
            if (i2 == 4) {
                C9850c.this.f23076w = new C9820b(message.arg2);
                if (!C9850c.this.m30655E() || C9850c.this.f23077x) {
                    if (C9850c.this.f23076w != null) {
                        bVar2 = C9850c.this.f23076w;
                    } else {
                        bVar2 = new C9820b(8);
                    }
                    C9850c.this.f23067n.mo25096a(bVar2);
                    C9850c.this.mo25312a(bVar2);
                    return;
                }
                C9850c.this.m30665b(3, null);
            } else if (i2 == 5) {
                if (C9850c.this.f23076w != null) {
                    bVar = C9850c.this.f23076w;
                } else {
                    bVar = new C9820b(8);
                }
                C9850c.this.f23067n.mo25096a(bVar);
                C9850c.this.mo25312a(bVar);
            } else if (i2 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) obj;
                }
                C9820b bVar3 = new C9820b(message.arg2, pendingIntent);
                C9850c.this.f23067n.mo25096a(bVar3);
                C9850c.this.mo25312a(bVar3);
            } else if (i2 == 6) {
                C9850c.this.m30665b(5, null);
                if (C9850c.this.f23072s != null) {
                    C9850c.this.f23072s.mo25337b(message.arg2);
                }
                C9850c.this.mo25307a(message.arg2);
                C9850c.this.m30663a(5, 1, null);
            } else if (i2 == 2 && !C9850c.this.mo25319c()) {
                m30722a(message);
            } else if (m30723b(message)) {
                ((C9858h) message.obj).mo25347d();
            } else {
                int i3 = message.what;
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i3);
                Log.wtf("GmsClient", sb.toString(), new Exception());
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$h */
    protected abstract class C9858h<TListener> {

        /* renamed from: a */
        private TListener f23085a;

        /* renamed from: b */
        private boolean f23086b = false;

        public C9858h(TListener tlistener) {
            this.f23085a = tlistener;
        }

        /* renamed from: a */
        public final void mo25345a() {
            synchronized (this) {
                this.f23085a = null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo25341a(TListener tlistener);

        /* renamed from: b */
        public final void mo25346b() {
            mo25345a();
            synchronized (C9850c.this.f23069p) {
                C9850c.this.f23069p.remove(this);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract void mo25342c();

        /* renamed from: d */
        public final void mo25347d() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f23085a;
                if (this.f23086b) {
                    String valueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(valueOf);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            }
            if (tlistener != null) {
                try {
                    mo25341a(tlistener);
                } catch (RuntimeException e) {
                    mo25342c();
                    throw e;
                }
            } else {
                mo25342c();
            }
            synchronized (this) {
                this.f23086b = true;
            }
            mo25346b();
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$i */
    public static final class C9859i extends C9893a {

        /* renamed from: a */
        private C9850c f23088a;

        /* renamed from: b */
        private final int f23089b;

        public C9859i(C9850c cVar, int i) {
            this.f23088a = cVar;
            this.f23089b = i;
        }

        /* renamed from: a */
        public final void mo25348a(int i, IBinder iBinder, Bundle bundle) {
            C9908u.m30854a(this.f23088a, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
            this.f23088a.mo25309a(i, iBinder, bundle, this.f23089b);
            this.f23088a = null;
        }

        /* renamed from: b */
        public final void mo25350b(int i, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        /* renamed from: a */
        public final void mo25349a(int i, IBinder iBinder, C9883k0 k0Var) {
            C9908u.m30854a(this.f23088a, (Object) "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            C9908u.m30853a(k0Var);
            this.f23088a.m30662a(k0Var);
            mo25348a(i, iBinder, k0Var.f23154c);
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$j */
    public final class C9860j implements ServiceConnection {

        /* renamed from: c */
        private final int f23091c;

        public C9860j(int i) {
            this.f23091c = i;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C9897q qVar;
            if (iBinder == null) {
                C9850c.this.m30667c(16);
                return;
            }
            synchronized (C9850c.this.f23065l) {
                C9850c cVar = C9850c.this;
                if (iBinder == null) {
                    qVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof C9897q)) {
                        qVar = new C9895p(iBinder);
                    } else {
                        qVar = (C9897q) queryLocalInterface;
                    }
                }
                cVar.f23066m = qVar;
            }
            C9850c.this.mo25308a(0, (Bundle) null, this.f23091c);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (C9850c.this.f23065l) {
                C9850c.this.f23066m = null;
            }
            Handler handler = C9850c.this.f23063j;
            handler.sendMessage(handler.obtainMessage(6, this.f23091c, 1));
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$k */
    protected final class C9861k extends C9856f {

        /* renamed from: g */
        private final IBinder f23092g;

        public C9861k(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.f23092g = iBinder;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo25340a(C9820b bVar) {
            if (C9850c.this.f23073t != null) {
                C9850c.this.f23073t.mo25339a(bVar);
            }
            C9850c.this.mo25312a(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public final boolean mo25343e() {
            String str = "GmsClient";
            try {
                String interfaceDescriptor = this.f23092g.getInterfaceDescriptor();
                if (!C9850c.this.mo24964y().equals(interfaceDescriptor)) {
                    String y = C9850c.this.mo24964y();
                    StringBuilder sb = new StringBuilder(String.valueOf(y).length() + 34 + String.valueOf(interfaceDescriptor).length());
                    sb.append("service descriptor mismatch: ");
                    sb.append(y);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e(str, sb.toString());
                    return false;
                }
                IInterface a = C9850c.this.mo24960a(this.f23092g);
                if (a == null || (!C9850c.this.m30663a(2, 4, a) && !C9850c.this.m30663a(3, 4, a))) {
                    return false;
                }
                C9850c.this.f23076w = null;
                Bundle n = C9850c.this.mo25326n();
                if (C9850c.this.f23072s != null) {
                    C9850c.this.f23072s.mo25338b(n);
                }
                return true;
            } catch (RemoteException unused) {
                Log.w(str, "service probably died");
                return false;
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$l */
    protected final class C9862l extends C9856f {
        public C9862l(int i, Bundle bundle) {
            super(i, null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo25340a(C9820b bVar) {
            if (!C9850c.this.mo25329q() || !C9850c.this.m30655E()) {
                C9850c.this.f23067n.mo25096a(bVar);
                C9850c.this.mo25312a(bVar);
                return;
            }
            C9850c.this.m30667c(16);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public final boolean mo25343e() {
            C9850c.this.f23067n.mo25096a(C9820b.f23019X);
            return true;
        }
    }

    static {
        new String[]{"service_esmobile", "service_googleme"};
    }

    protected C9850c(Context context, Looper looper, int i, C9851a aVar, C9852b bVar, String str) {
        C9879j a = C9879j.m30789a(context);
        C9826e a2 = C9826e.m30607a();
        C9908u.m30853a(aVar);
        C9851a aVar2 = aVar;
        C9908u.m30853a(bVar);
        this(context, looper, a, a2, i, aVar2, bVar, str);
    }

    /* renamed from: C */
    private final String mo25375C() {
        String str = this.f23075v;
        return str == null ? this.f23060g.getClass().getName() : str;
    }

    /* renamed from: D */
    private final boolean mo24959D() {
        boolean z;
        synchronized (this.f23064k) {
            z = this.f23071r == 3;
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final boolean m30655E() {
        if (this.f23077x || TextUtils.isEmpty(mo24964y()) || TextUtils.isEmpty(mo25334v())) {
            return false;
        }
        try {
            Class.forName(mo24964y());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m30662a(C9883k0 k0Var) {
        this.f23078y = k0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m30665b(int i, T t) {
        C9898q0 q0Var;
        C9908u.m30860a((i == 4) == (t != null));
        synchronized (this.f23064k) {
            this.f23071r = i;
            this.f23068o = t;
            mo25310a(i, t);
            if (i != 1) {
                if (i == 2 || i == 3) {
                    if (!(this.f23070q == null || this.f23059f == null)) {
                        String c = this.f23059f.mo25431c();
                        String a = this.f23059f.mo25429a();
                        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 70 + String.valueOf(a).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(c);
                        sb.append(" on ");
                        sb.append(a);
                        Log.e("GmsClient", sb.toString());
                        this.f23061h.mo25387a(this.f23059f.mo25431c(), this.f23059f.mo25429a(), this.f23059f.mo25430b(), this.f23070q, mo25375C());
                        this.f23079z.incrementAndGet();
                    }
                    this.f23070q = new C9860j(this.f23079z.get());
                    if (this.f23071r != 3 || mo25334v() == null) {
                        q0Var = new C9898q0(mo25304A(), mo24965z(), false, 129);
                    } else {
                        q0Var = new C9898q0(mo25332t().getPackageName(), mo25334v(), true, 129);
                    }
                    this.f23059f = q0Var;
                    if (!this.f23061h.mo25388a(new C9880a(this.f23059f.mo25431c(), this.f23059f.mo25429a(), this.f23059f.mo25430b()), this.f23070q, mo25375C())) {
                        String c2 = this.f23059f.mo25431c();
                        String a2 = this.f23059f.mo25429a();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(c2).length() + 34 + String.valueOf(a2).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(c2);
                        sb2.append(" on ");
                        sb2.append(a2);
                        Log.e("GmsClient", sb2.toString());
                        mo25308a(16, (Bundle) null, this.f23079z.get());
                    }
                } else if (i == 4) {
                    mo25311a(t);
                }
            } else if (this.f23070q != null) {
                this.f23061h.mo25387a(this.f23059f.mo25431c(), this.f23059f.mo25429a(), this.f23059f.mo25430b(), this.f23070q, mo25375C());
                this.f23070q = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public String mo25304A() {
        return "com.google.android.gms";
    }

    /* renamed from: B */
    public boolean mo25305B() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo24960a(IBinder iBinder);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo25310a(int i, T t) {
    }

    /* renamed from: c */
    public boolean mo25319c() {
        boolean z;
        synchronized (this.f23064k) {
            z = this.f23071r == 4;
        }
        return z;
    }

    /* renamed from: d */
    public boolean mo24961d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo25320e() {
        boolean z;
        synchronized (this.f23064k) {
            if (this.f23071r != 2) {
                if (this.f23071r != 3) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: f */
    public String mo25321f() {
        if (mo25319c()) {
            C9898q0 q0Var = this.f23059f;
            if (q0Var != null) {
                return q0Var.mo25429a();
            }
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    /* renamed from: h */
    public boolean mo25322h() {
        return true;
    }

    /* renamed from: i */
    public int mo24962i() {
        return C9826e.f23037a;
    }

    /* renamed from: j */
    public final C9824d[] mo25323j() {
        C9883k0 k0Var = this.f23078y;
        if (k0Var == null) {
            return null;
        }
        return k0Var.f23153U;
    }

    /* renamed from: k */
    public Intent mo24963k() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* renamed from: l */
    public boolean mo25324l() {
        return false;
    }

    /* renamed from: m */
    public IBinder mo25325m() {
        synchronized (this.f23065l) {
            if (this.f23066m == null) {
                return null;
            }
            IBinder asBinder = this.f23066m.asBinder();
            return asBinder;
        }
    }

    /* renamed from: n */
    public Bundle mo25326n() {
        return null;
    }

    /* renamed from: o */
    public void mo25327o() {
        int a = this.f23062i.mo24977a(this.f23060g, mo24962i());
        if (a != 0) {
            m30665b(1, null);
            mo25314a((C9853c) new C9854d(), a, (PendingIntent) null);
            return;
        }
        mo25313a((C9853c) new C9854d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo25328p() {
        if (!mo25319c()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo25329q() {
        return false;
    }

    /* renamed from: r */
    public Account mo25330r() {
        return null;
    }

    /* renamed from: s */
    public C9824d[] mo25331s() {
        return f23053A;
    }

    /* renamed from: t */
    public final Context mo25332t() {
        return this.f23060g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public Bundle mo25333u() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public String mo25334v() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public Set<Scope> mo25335w() {
        return Collections.EMPTY_SET;
    }

    /* renamed from: x */
    public final T mo25336x() throws DeadObjectException {
        T t;
        synchronized (this.f23064k) {
            if (this.f23071r != 5) {
                mo25328p();
                C9908u.m30865b(this.f23068o != null, "Client is connected but service is null");
                t = this.f23068o;
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract String mo24964y();

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract String mo24965z();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25311a(T t) {
        this.f23056c = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25307a(int i) {
        this.f23054a = i;
        this.f23055b = System.currentTimeMillis();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m30667c(int i) {
        int i2;
        if (mo24959D()) {
            i2 = 5;
            this.f23077x = true;
        } else {
            i2 = 4;
        }
        Handler handler = this.f23063j;
        handler.sendMessage(handler.obtainMessage(i2, this.f23079z.get(), 16));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25312a(C9820b bVar) {
        this.f23057d = bVar.mo25270c();
        this.f23058e = System.currentTimeMillis();
    }

    protected C9850c(Context context, Looper looper, C9879j jVar, C9826e eVar, int i, C9851a aVar, C9852b bVar, String str) {
        this.f23064k = new Object();
        this.f23065l = new Object();
        this.f23069p = new ArrayList<>();
        this.f23071r = 1;
        this.f23076w = null;
        this.f23077x = false;
        this.f23078y = null;
        this.f23079z = new AtomicInteger(0);
        C9908u.m30854a(context, (Object) "Context must not be null");
        this.f23060g = context;
        C9908u.m30854a(looper, (Object) "Looper must not be null");
        Looper looper2 = looper;
        C9908u.m30854a(jVar, (Object) "Supervisor must not be null");
        this.f23061h = jVar;
        C9908u.m30854a(eVar, (Object) "API availability must not be null");
        this.f23062i = eVar;
        this.f23063j = new C9857g(looper);
        this.f23074u = i;
        this.f23072s = aVar;
        this.f23073t = bVar;
        this.f23075v = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m30663a(int i, int i2, T t) {
        synchronized (this.f23064k) {
            if (this.f23071r != i) {
                return false;
            }
            m30665b(i2, t);
            return true;
        }
    }

    /* renamed from: a */
    public void mo25313a(C9853c cVar) {
        C9908u.m30854a(cVar, (Object) "Connection progress callbacks cannot be null.");
        this.f23067n = cVar;
        m30665b(2, null);
    }

    /* renamed from: a */
    public void mo25306a() {
        this.f23079z.incrementAndGet();
        synchronized (this.f23069p) {
            int size = this.f23069p.size();
            for (int i = 0; i < size; i++) {
                ((C9858h) this.f23069p.get(i)).mo25345a();
            }
            this.f23069p.clear();
        }
        synchronized (this.f23065l) {
            this.f23066m = null;
        }
        m30665b(1, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25314a(C9853c cVar, int i, PendingIntent pendingIntent) {
        C9908u.m30854a(cVar, (Object) "Connection progress callbacks cannot be null.");
        this.f23067n = cVar;
        Handler handler = this.f23063j;
        handler.sendMessage(handler.obtainMessage(3, this.f23079z.get(), i, pendingIntent));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25309a(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.f23063j;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new C9861k(i, iBinder, bundle)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25308a(int i, Bundle bundle, int i2) {
        Handler handler = this.f23063j;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new C9862l(i, null)));
    }

    /* renamed from: a */
    public void mo25316a(C9886m mVar, Set<Scope> set) {
        Bundle u = mo25333u();
        C9872g gVar = new C9872g(this.f23074u);
        gVar.f23123W = this.f23060g.getPackageName();
        gVar.f23126Z = u;
        if (set != null) {
            gVar.f23125Y = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (mo25324l()) {
            gVar.f23127a0 = mo25330r() != null ? mo25330r() : new Account("<<default account>>", "com.google");
            if (mVar != null) {
                gVar.f23124X = mVar.asBinder();
            }
        } else if (mo25305B()) {
            gVar.f23127a0 = mo25330r();
        }
        gVar.f23128b0 = f23053A;
        gVar.f23130c0 = mo25331s();
        try {
            synchronized (this.f23065l) {
                if (this.f23066m != null) {
                    this.f23066m.mo25427a(new C9859i(this, this.f23079z.get()), gVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            mo25318b(1);
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            mo25309a(8, (IBinder) null, (Bundle) null, this.f23079z.get());
        }
    }

    /* renamed from: b */
    public void mo25318b(int i) {
        Handler handler = this.f23063j;
        handler.sendMessage(handler.obtainMessage(6, this.f23079z.get(), i));
    }

    /* renamed from: a */
    public void mo25315a(C9855e eVar) {
        eVar.mo25117a();
    }

    /* renamed from: a */
    public void mo25317a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        T t;
        C9897q qVar;
        synchronized (this.f23064k) {
            i = this.f23071r;
            t = this.f23068o;
        }
        synchronized (this.f23065l) {
            qVar = this.f23066m;
        }
        printWriter.append(str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append("null");
        } else {
            printWriter.append(mo24964y()).append("@").append(Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (qVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(qVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f23056c > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.f23056c;
            String format = simpleDateFormat.format(new Date(j));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.f23055b > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            int i2 = this.f23054a;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 != 2) {
                printWriter.append(String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_NETWORK_LOST");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.f23055b;
            String format2 = simpleDateFormat.format(new Date(j2));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j2);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.f23058e > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(C9694d.m30091a(this.f23057d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.f23058e;
            String format3 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb3.append(j3);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }
}
