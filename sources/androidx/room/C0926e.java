package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.C0919b.C0920a;
import androidx.room.C0922c.C0923a;
import androidx.room.InvalidationTracker.C0911c;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.room.e */
/* compiled from: MultiInstanceInvalidationClient */
class C0926e {

    /* renamed from: a */
    Context f3724a;

    /* renamed from: b */
    final String f3725b;

    /* renamed from: c */
    int f3726c;

    /* renamed from: d */
    final InvalidationTracker f3727d;

    /* renamed from: e */
    final C0911c f3728e;

    /* renamed from: f */
    C0922c f3729f;

    /* renamed from: g */
    final Executor f3730g;

    /* renamed from: h */
    final C0919b f3731h = new C0927a();

    /* renamed from: i */
    final AtomicBoolean f3732i = new AtomicBoolean(false);

    /* renamed from: j */
    final ServiceConnection f3733j = new C0929b();

    /* renamed from: k */
    final Runnable f3734k = new C0930c();

    /* renamed from: l */
    final Runnable f3735l = new C0931d();

    /* renamed from: androidx.room.e$a */
    /* compiled from: MultiInstanceInvalidationClient */
    class C0927a extends C0920a {

        /* renamed from: androidx.room.e$a$a */
        /* compiled from: MultiInstanceInvalidationClient */
        class C0928a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ String[] f3738c;

            C0928a(String[] strArr) {
                this.f3738c = strArr;
            }

            public void run() {
                C0926e.this.f3727d.mo5184a(this.f3738c);
            }
        }

        C0927a() {
        }

        /* renamed from: a */
        public void mo5248a(String[] strArr) {
            C0926e.this.f3730g.execute(new C0928a(strArr));
        }
    }

    /* renamed from: androidx.room.e$b */
    /* compiled from: MultiInstanceInvalidationClient */
    class C0929b implements ServiceConnection {
        C0929b() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C0926e.this.f3729f = C0923a.m5129a(iBinder);
            C0926e eVar = C0926e.this;
            eVar.f3730g.execute(eVar.f3734k);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C0926e eVar = C0926e.this;
            eVar.f3730g.execute(eVar.f3735l);
            C0926e eVar2 = C0926e.this;
            eVar2.f3729f = null;
            eVar2.f3724a = null;
        }
    }

    /* renamed from: androidx.room.e$c */
    /* compiled from: MultiInstanceInvalidationClient */
    class C0930c implements Runnable {
        C0930c() {
        }

        public void run() {
            try {
                C0922c cVar = C0926e.this.f3729f;
                if (cVar != null) {
                    C0926e.this.f3726c = cVar.mo5202a(C0926e.this.f3731h, C0926e.this.f3725b);
                    C0926e.this.f3727d.mo5182a(C0926e.this.f3728e);
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
            }
        }
    }

    /* renamed from: androidx.room.e$d */
    /* compiled from: MultiInstanceInvalidationClient */
    class C0931d implements Runnable {
        C0931d() {
        }

        public void run() {
            C0926e eVar = C0926e.this;
            eVar.f3727d.mo5187b(eVar.f3728e);
        }
    }

    /* renamed from: androidx.room.e$e */
    /* compiled from: MultiInstanceInvalidationClient */
    class C0932e implements Runnable {
        C0932e() {
        }

        public void run() {
            C0926e eVar = C0926e.this;
            eVar.f3727d.mo5187b(eVar.f3728e);
            try {
                C0922c cVar = C0926e.this.f3729f;
                if (cVar != null) {
                    cVar.mo5204a(C0926e.this.f3731h, C0926e.this.f3726c);
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e);
            }
            C0926e eVar2 = C0926e.this;
            Context context = eVar2.f3724a;
            if (context != null) {
                context.unbindService(eVar2.f3733j);
                C0926e.this.f3724a = null;
            }
        }
    }

    /* renamed from: androidx.room.e$f */
    /* compiled from: MultiInstanceInvalidationClient */
    class C0933f extends C0911c {
        C0933f(String[] strArr) {
            super(strArr);
        }

        /* renamed from: a */
        public void mo5195a(Set<String> set) {
            if (!C0926e.this.f3732i.get()) {
                try {
                    C0926e.this.f3729f.mo5203a(C0926e.this.f3726c, (String[]) set.toArray(new String[0]));
                } catch (RemoteException e) {
                    Log.w("ROOM", "Cannot broadcast invalidation", e);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo5196a() {
            return true;
        }
    }

    C0926e(Context context, String str, InvalidationTracker invalidationTracker, Executor executor) {
        new C0932e();
        this.f3724a = context.getApplicationContext();
        this.f3725b = str;
        this.f3727d = invalidationTracker;
        this.f3730g = executor;
        this.f3728e = new C0933f(invalidationTracker.f3667b);
        this.f3724a.bindService(new Intent(this.f3724a, MultiInstanceInvalidationService.class), this.f3733j, 1);
    }
}
