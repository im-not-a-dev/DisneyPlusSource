package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import androidx.work.C1034h;
import androidx.work.impl.C1039a;
import androidx.work.impl.C1058c;
import androidx.work.impl.C1068h;
import androidx.work.impl.utils.C1158j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.background.systemalarm.e */
/* compiled from: SystemAlarmDispatcher */
public class C1045e implements C1039a {

    /* renamed from: c0 */
    static final String f4114c0 = C1034h.m5551a("SystemAlarmDispatcher");

    /* renamed from: U */
    private final C1051g f4115U;

    /* renamed from: V */
    private final C1058c f4116V;

    /* renamed from: W */
    private final C1068h f4117W;

    /* renamed from: X */
    final C1042b f4118X;

    /* renamed from: Y */
    private final Handler f4119Y;

    /* renamed from: Z */
    final List<Intent> f4120Z;

    /* renamed from: a0 */
    Intent f4121a0;

    /* renamed from: b0 */
    private C1048c f4122b0;

    /* renamed from: c */
    final Context f4123c;

    /* renamed from: androidx.work.impl.background.systemalarm.e$a */
    /* compiled from: SystemAlarmDispatcher */
    class C1046a implements Runnable {
        C1046a() {
        }

        public void run() {
            C1049d dVar;
            C1045e eVar;
            synchronized (C1045e.this.f4120Z) {
                C1045e.this.f4121a0 = (Intent) C1045e.this.f4120Z.get(0);
            }
            Intent intent = C1045e.this.f4121a0;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = C1045e.this.f4121a0.getIntExtra("KEY_START_ID", 0);
                C1034h.m5550a().mo5697a(C1045e.f4114c0, String.format("Processing command %s, %s", new Object[]{C1045e.this.f4121a0, Integer.valueOf(intExtra)}), new Throwable[0]);
                WakeLock a = C1158j.m5971a(C1045e.this.f4123c, String.format("%s (%s)", new Object[]{action, Integer.valueOf(intExtra)}));
                try {
                    C1034h.m5550a().mo5697a(C1045e.f4114c0, String.format("Acquiring operation wake lock (%s) %s", new Object[]{action, a}), new Throwable[0]);
                    a.acquire();
                    C1045e.this.f4118X.mo5719a(C1045e.this.f4121a0, intExtra, C1045e.this);
                    C1034h.m5550a().mo5697a(C1045e.f4114c0, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, a}), new Throwable[0]);
                    a.release();
                    eVar = C1045e.this;
                    dVar = new C1049d(eVar);
                } catch (Throwable th) {
                    C1034h.m5550a().mo5697a(C1045e.f4114c0, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, a}), new Throwable[0]);
                    a.release();
                    C1045e eVar2 = C1045e.this;
                    eVar2.mo5728a((Runnable) new C1049d(eVar2));
                    throw th;
                }
                eVar.mo5728a((Runnable) dVar);
            }
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.e$b */
    /* compiled from: SystemAlarmDispatcher */
    static class C1047b implements Runnable {

        /* renamed from: U */
        private final Intent f4125U;

        /* renamed from: V */
        private final int f4126V;

        /* renamed from: c */
        private final C1045e f4127c;

        C1047b(C1045e eVar, Intent intent, int i) {
            this.f4127c = eVar;
            this.f4125U = intent;
            this.f4126V = i;
        }

        public void run() {
            this.f4127c.mo5729a(this.f4125U, this.f4126V);
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.e$c */
    /* compiled from: SystemAlarmDispatcher */
    interface C1048c {
        /* renamed from: c */
        void mo5718c();
    }

    /* renamed from: androidx.work.impl.background.systemalarm.e$d */
    /* compiled from: SystemAlarmDispatcher */
    static class C1049d implements Runnable {

        /* renamed from: c */
        private final C1045e f4128c;

        C1049d(C1045e eVar) {
            this.f4128c = eVar;
        }

        public void run() {
            this.f4128c.mo5726a();
        }
    }

    C1045e(Context context) {
        this(context, null, null);
    }

    /* renamed from: f */
    private void m5620f() {
        if (this.f4119Y.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    /* renamed from: g */
    private void m5621g() {
        m5620f();
        WakeLock a = C1158j.m5971a(this.f4123c, "ProcessCommand");
        try {
            a.acquire();
            this.f4117W.mo5780h().mo5939a(new C1046a());
        } finally {
            a.release();
        }
    }

    /* renamed from: a */
    public void mo5713a(String str, boolean z) {
        mo5728a((Runnable) new C1047b(this, C1042b.m5597a(this.f4123c, str, z), 0));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C1058c mo5730b() {
        return this.f4116V;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C1068h mo5731c() {
        return this.f4117W;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C1051g mo5732d() {
        return this.f4115U;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo5733e() {
        this.f4116V.mo5753b((C1039a) this);
        this.f4115U.mo5739a();
        this.f4122b0 = null;
    }

    C1045e(Context context, C1058c cVar, C1068h hVar) {
        this.f4123c = context.getApplicationContext();
        this.f4118X = new C1042b(this.f4123c);
        this.f4115U = new C1051g();
        if (hVar == null) {
            hVar = C1068h.m5674a();
        }
        this.f4117W = hVar;
        if (cVar == null) {
            cVar = this.f4117W.mo5776e();
        }
        this.f4116V = cVar;
        this.f4116V.mo5750a((C1039a) this);
        this.f4120Z = new ArrayList();
        this.f4121a0 = null;
        this.f4119Y = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public boolean mo5729a(Intent intent, int i) {
        boolean z = false;
        C1034h.m5550a().mo5697a(f4114c0, String.format("Adding command %s (%s)", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        m5620f();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            C1034h.m5550a().mo5701e(f4114c0, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && m5619a("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i);
            synchronized (this.f4120Z) {
                if (!this.f4120Z.isEmpty()) {
                    z = true;
                }
                this.f4120Z.add(intent);
                if (!z) {
                    m5621g();
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5727a(C1048c cVar) {
        if (this.f4122b0 != null) {
            C1034h.m5550a().mo5698b(f4114c0, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            return;
        }
        this.f4122b0 = cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5728a(Runnable runnable) {
        this.f4119Y.post(runnable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5726a() {
        C1034h.m5550a().mo5697a(f4114c0, "Checking if commands are complete.", new Throwable[0]);
        m5620f();
        synchronized (this.f4120Z) {
            if (this.f4121a0 != null) {
                C1034h.m5550a().mo5697a(f4114c0, String.format("Removing command %s", new Object[]{this.f4121a0}), new Throwable[0]);
                if (((Intent) this.f4120Z.remove(0)).equals(this.f4121a0)) {
                    this.f4121a0 = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            if (!this.f4118X.mo5720a() && this.f4120Z.isEmpty()) {
                C1034h.m5550a().mo5697a(f4114c0, "No more commands & intents.", new Throwable[0]);
                if (this.f4122b0 != null) {
                    this.f4122b0.mo5718c();
                }
            } else if (!this.f4120Z.isEmpty()) {
                m5621g();
            }
        }
    }

    /* renamed from: a */
    private boolean m5619a(String str) {
        m5620f();
        synchronized (this.f4120Z) {
            for (Intent action : this.f4120Z) {
                if (str.equals(action.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }
}
