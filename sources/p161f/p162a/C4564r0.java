package p161f.p162a;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.appboy.C1440a;
import com.appboy.p033s.C1557c;
import java.util.concurrent.TimeUnit;

/* renamed from: f.a.r0 */
public class C4564r0 {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final String f11352m = C1557c.m7461a(C4564r0.class);

    /* renamed from: n */
    private static final long f11353n = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: o */
    static final long f11354o = TimeUnit.SECONDS.toMillis(10);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f11355a = new Object();

    /* renamed from: b */
    private final C4384a3 f11356b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C4419d f11357c;

    /* renamed from: d */
    private final Context f11358d;

    /* renamed from: e */
    private final AlarmManager f11359e;

    /* renamed from: f */
    private final int f11360f;

    /* renamed from: g */
    private final String f11361g;

    /* renamed from: h */
    private final C4424d3 f11362h;

    /* renamed from: i */
    private volatile C4462h1 f11363i;

    /* renamed from: j */
    private final Handler f11364j;

    /* renamed from: k */
    private final Runnable f11365k;

    /* renamed from: l */
    private final boolean f11366l;

    /* renamed from: f.a.r0$a */
    class C4565a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ Context f11367c;

        C4565a(C4564r0 r0Var, Context context) {
            this.f11367c = context;
        }

        public void run() {
            C1557c.m7458a(C4564r0.f11352m, "Requesting data flush on internal session close flush timer.");
            C1440a.m6921c(this.f11367c).mo6588j();
        }
    }

    /* renamed from: f.a.r0$b */
    class C4566b extends BroadcastReceiver {
        C4566b() {
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (C4564r0.this.f11355a) {
                try {
                    C4564r0.this.m15853k();
                } catch (Exception e) {
                    try {
                        C4564r0.this.f11357c.mo15485a(e, Throwable.class);
                    } catch (Exception e2) {
                        C1557c.m7470c(C4564r0.f11352m, "Failed to log throwable.", e2);
                    }
                }
            }
        }
    }

    public C4564r0(Context context, C4384a3 a3Var, C4419d dVar, AlarmManager alarmManager, C4424d3 d3Var, int i, boolean z) {
        this.f11356b = a3Var;
        this.f11357c = dVar;
        this.f11358d = context;
        this.f11359e = alarmManager;
        this.f11360f = i;
        this.f11362h = d3Var;
        this.f11364j = C4537o3.m15702a();
        this.f11365k = new C4565a(this, context);
        this.f11366l = z;
        C4566b bVar = new C4566b();
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".intent.APPBOY_SESSION_SHOULD_SEAL");
        this.f11361g = sb.toString();
        context.registerReceiver(bVar, new IntentFilter(this.f11361g));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        return true;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m15851i() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f11355a
            monitor-enter(r0)
            r6.m15853k()     // Catch:{ all -> 0x0058 }
            f.a.h1 r1 = r6.f11363i     // Catch:{ all -> 0x0058 }
            r2 = 1
            if (r1 == 0) goto L_0x0027
            f.a.h1 r1 = r6.f11363i     // Catch:{ all -> 0x0058 }
            boolean r1 = r1.mo15576g()     // Catch:{ all -> 0x0058 }
            if (r1 == 0) goto L_0x0014
            goto L_0x0027
        L_0x0014:
            f.a.h1 r1 = r6.f11363i     // Catch:{ all -> 0x0058 }
            java.lang.Double r1 = r1.mo15572c()     // Catch:{ all -> 0x0058 }
            if (r1 == 0) goto L_0x0024
            f.a.h1 r1 = r6.f11363i     // Catch:{ all -> 0x0058 }
            r3 = 0
            r1.mo15571a(r3)     // Catch:{ all -> 0x0058 }
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            return r2
        L_0x0024:
            r1 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            return r1
        L_0x0027:
            f.a.h1 r1 = r6.f11363i     // Catch:{ all -> 0x0058 }
            f.a.h1 r3 = r6.m15852j()     // Catch:{ all -> 0x0058 }
            r6.f11363i = r3     // Catch:{ all -> 0x0058 }
            if (r1 == 0) goto L_0x0056
            boolean r3 = r1.mo15576g()     // Catch:{ all -> 0x0058 }
            if (r3 == 0) goto L_0x0056
            java.lang.String r3 = f11352m     // Catch:{ all -> 0x0058 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0058 }
            r4.<init>()     // Catch:{ all -> 0x0058 }
            java.lang.String r5 = "Clearing completely dispatched sealed session "
            r4.append(r5)     // Catch:{ all -> 0x0058 }
            f.a.i1 r5 = r1.mo15570a()     // Catch:{ all -> 0x0058 }
            r4.append(r5)     // Catch:{ all -> 0x0058 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0058 }
            com.appboy.p033s.C1557c.m7458a(r3, r4)     // Catch:{ all -> 0x0058 }
            f.a.a3 r3 = r6.f11356b     // Catch:{ all -> 0x0058 }
            r3.mo15406a(r1)     // Catch:{ all -> 0x0058 }
        L_0x0056:
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            return r2
        L_0x0058:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p161f.p162a.C4564r0.m15851i():boolean");
    }

    /* renamed from: j */
    private C4462h1 m15852j() {
        C4462h1 h1Var = new C4462h1(C4470i1.m15470a(), C4472i3.m15486b());
        this.f11362h.mo15496a(true);
        this.f11357c.mo15485a(C4505m.f11170a, C4505m.class);
        String str = f11352m;
        StringBuilder sb = new StringBuilder();
        sb.append("New session created with ID: ");
        sb.append(h1Var.mo15570a());
        C1557c.m7469c(str, sb.toString());
        return h1Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m15853k() {
        synchronized (this.f11355a) {
            if (this.f11363i == null) {
                this.f11363i = this.f11356b.mo15405a();
                if (this.f11363i != null) {
                    String str = f11352m;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Restored session from offline storage: ");
                    sb.append(this.f11363i.mo15570a().toString());
                    C1557c.m7458a(str, sb.toString());
                }
            }
            if (this.f11363i != null && this.f11363i.mo15572c() != null && !this.f11363i.mo15576g() && m15846a(this.f11363i, this.f11360f, this.f11366l)) {
                String str2 = f11352m;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Session [");
                sb2.append(this.f11363i.mo15570a());
                sb2.append("] being sealed because its end time is over the grace period.");
                C1557c.m7469c(str2, sb2.toString());
                mo15803e();
                this.f11356b.mo15406a(this.f11363i);
                this.f11363i = null;
            }
        }
    }

    /* renamed from: l */
    private void m15854l() {
        Intent intent = new Intent(this.f11361g);
        intent.putExtra("session_id", this.f11363i.toString());
        this.f11359e.cancel(PendingIntent.getBroadcast(this.f11358d, 0, intent, 1073741824));
    }

    /* renamed from: d */
    public boolean mo15802d() {
        boolean z;
        synchronized (this.f11355a) {
            z = this.f11363i != null && this.f11363i.mo15576g();
        }
        return z;
    }

    /* renamed from: e */
    public void mo15803e() {
        synchronized (this.f11355a) {
            if (this.f11363i != null) {
                this.f11363i.mo15574e();
                this.f11356b.mo15407b(this.f11363i);
                this.f11357c.mo15485a(new C4515n(this.f11363i), C4515n.class);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo15804f() {
        mo15805g();
        this.f11364j.postDelayed(this.f11365k, f11353n);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo15805g() {
        this.f11364j.removeCallbacks(this.f11365k);
    }

    /* renamed from: a */
    public C4462h1 mo15799a() {
        C4462h1 h1Var;
        synchronized (this.f11355a) {
            if (m15851i()) {
                this.f11356b.mo15407b(this.f11363i);
            }
            mo15805g();
            m15854l();
            this.f11357c.mo15485a(C4533o.f11256a, C4533o.class);
            h1Var = this.f11363i;
        }
        return h1Var;
    }

    /* renamed from: b */
    public C4462h1 mo15800b() {
        C4462h1 h1Var;
        synchronized (this.f11355a) {
            m15851i();
            this.f11363i.mo15571a(Double.valueOf(C4472i3.m15486b()));
            this.f11356b.mo15407b(this.f11363i);
            mo15804f();
            m15845a(m15847b(this.f11363i, this.f11360f, this.f11366l));
            this.f11357c.mo15485a(C4545p.f11301a, C4545p.class);
            h1Var = this.f11363i;
        }
        return h1Var;
    }

    /* renamed from: c */
    public C4470i1 mo15801c() {
        synchronized (this.f11355a) {
            m15853k();
            if (this.f11363i == null) {
                return null;
            }
            C4470i1 a = this.f11363i.mo15570a();
            return a;
        }
    }

    /* renamed from: a */
    private void m15845a(long j) {
        String str = f11352m;
        StringBuilder sb = new StringBuilder();
        sb.append("Creating a session seal alarm with a delay of ");
        sb.append(j);
        sb.append(" ms");
        C1557c.m7458a(str, sb.toString());
        Intent intent = new Intent(this.f11361g);
        intent.putExtra("session_id", this.f11363i.toString());
        this.f11359e.set(1, C4472i3.m15487c() + j, PendingIntent.getBroadcast(this.f11358d, 0, intent, 1073741824));
    }

    /* renamed from: b */
    static long m15847b(C4462h1 h1Var, int i, boolean z) {
        long millis = TimeUnit.SECONDS.toMillis((long) i);
        if (!z) {
            return millis;
        }
        long millis2 = TimeUnit.SECONDS.toMillis((long) h1Var.mo15573d());
        return Math.max(f11354o, (millis2 + millis) - C4472i3.m15487c());
    }

    /* renamed from: a */
    static boolean m15846a(C4462h1 h1Var, int i, boolean z) {
        long c = C4472i3.m15487c();
        long millis = TimeUnit.SECONDS.toMillis((long) i);
        long millis2 = TimeUnit.SECONDS.toMillis(h1Var.mo15572c().longValue());
        long millis3 = TimeUnit.SECONDS.toMillis((long) h1Var.mo15573d());
        boolean z2 = true;
        if (z) {
            if (millis3 + millis + f11354o > c) {
                z2 = false;
            }
            return z2;
        }
        if (millis2 + millis > c) {
            z2 = false;
        }
        return z2;
    }
}
