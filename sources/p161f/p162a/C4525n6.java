package p161f.p162a;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import com.appboy.p027p.C1518c;
import com.appboy.p033s.C1557c;
import com.appboy.receivers.AppboyActionReceiver;
import java.util.concurrent.TimeUnit;

/* renamed from: f.a.n6 */
public class C4525n6 {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final String f11233l = C1557c.m7461a(C4525n6.class);

    /* renamed from: a */
    private final Context f11234a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4553p6 f11235b;

    /* renamed from: c */
    private final AlarmManager f11236c;

    /* renamed from: d */
    private final C4514m6 f11237d;

    /* renamed from: e */
    private final BroadcastReceiver f11238e;

    /* renamed from: f */
    private final PendingIntent f11239f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C4617w6 f11240g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f11241h;

    /* renamed from: i */
    private boolean f11242i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C4549p2 f11243j;

    /* renamed from: k */
    private volatile boolean f11244k = false;

    /* renamed from: f.a.n6$a */
    class C4526a extends BroadcastReceiver {

        /* renamed from: a */
        final /* synthetic */ C4419d f11245a;

        /* renamed from: f.a.n6$a$a */
        class C4527a implements Runnable {

            /* renamed from: U */
            final /* synthetic */ Intent f11247U;

            /* renamed from: V */
            final /* synthetic */ PendingResult f11248V;

            /* renamed from: c */
            final /* synthetic */ Context f11250c;

            C4527a(Context context, Intent intent, PendingResult pendingResult) {
                this.f11250c = context;
                this.f11247U = intent;
                this.f11248V = pendingResult;
            }

            public void run() {
                try {
                    C4525n6.this.f11235b.mo15673a(this.f11247U, (ConnectivityManager) this.f11250c.getSystemService("connectivity"));
                    C4525n6.this.mo15730c();
                } catch (Exception e) {
                    C1557c.m7470c(C4525n6.f11233l, "Failed to process connectivity event.", e);
                    C4526a aVar = C4526a.this;
                    C4525n6.this.m15671a(aVar.f11245a, (Throwable) e);
                }
                this.f11248V.finish();
            }
        }

        C4526a(C4419d dVar) {
            this.f11245a = dVar;
        }

        public void onReceive(Context context, Intent intent) {
            new Thread(new C4527a(context, intent, goAsync())).start();
        }
    }

    /* renamed from: f.a.n6$b */
    class C4528b implements C1518c<C4533o> {
        C4528b() {
        }

        /* renamed from: a */
        public void trigger(C4533o oVar) {
            C4525n6.this.f11240g = C4617w6.OPEN_SESSION;
            C4525n6.this.mo15730c();
        }
    }

    /* renamed from: f.a.n6$c */
    class C4529c implements C1518c<C4545p> {
        C4529c() {
        }

        /* renamed from: a */
        public void trigger(C4545p pVar) {
            C4525n6.this.f11240g = C4617w6.NO_SESSION;
            C4525n6.this.mo15730c();
        }
    }

    /* renamed from: f.a.n6$d */
    class C4530d implements C1518c<C4451g> {
        C4530d() {
        }

        /* renamed from: a */
        public void trigger(C4451g gVar) {
            C4525n6 n6Var = C4525n6.this;
            n6Var.mo15725a(n6Var.f11241h + ((long) C4525n6.this.f11243j.mo15785a((int) C4525n6.this.f11241h)));
        }
    }

    /* renamed from: f.a.n6$e */
    class C4531e implements C1518c<C4459h> {
        C4531e() {
        }

        /* renamed from: a */
        public void trigger(C4459h hVar) {
            if (C4525n6.this.f11243j.mo15787b()) {
                C4525n6.this.f11243j.mo15786a();
                String f = C4525n6.f11233l;
                StringBuilder sb = new StringBuilder();
                sb.append("Received successful request flush. Default flush interval reset to ");
                sb.append(C4525n6.this.f11241h);
                C1557c.m7458a(f, sb.toString());
                C4525n6 n6Var = C4525n6.this;
                n6Var.mo15725a(n6Var.f11241h);
            }
        }
    }

    /* renamed from: f.a.n6$f */
    static /* synthetic */ class C4532f {

        /* renamed from: a */
        static final /* synthetic */ int[] f11255a = new int[C4609v6.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                f.a.v6[] r0 = p161f.p162a.C4609v6.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11255a = r0
                int[] r0 = f11255a     // Catch:{ NoSuchFieldError -> 0x0014 }
                f.a.v6 r1 = p161f.p162a.C4609v6.NONE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f11255a     // Catch:{ NoSuchFieldError -> 0x001f }
                f.a.v6 r1 = p161f.p162a.C4609v6.TWO_G     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f11255a     // Catch:{ NoSuchFieldError -> 0x002a }
                f.a.v6 r1 = p161f.p162a.C4609v6.FOUR_G     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f11255a     // Catch:{ NoSuchFieldError -> 0x0035 }
                f.a.v6 r1 = p161f.p162a.C4609v6.WIFI     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f11255a     // Catch:{ NoSuchFieldError -> 0x0040 }
                f.a.v6 r1 = p161f.p162a.C4609v6.THREE_G     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p161f.p162a.C4525n6.C4532f.<clinit>():void");
        }
    }

    public C4525n6(Context context, C4419d dVar, C4553p6 p6Var, AlarmManager alarmManager, C4514m6 m6Var, String str) {
        this.f11234a = context;
        this.f11235b = p6Var;
        this.f11236c = alarmManager;
        this.f11237d = m6Var;
        this.f11240g = C4617w6.NO_SESSION;
        this.f11241h = -1;
        this.f11243j = new C4549p2((int) TimeUnit.MINUTES.toMillis(5));
        this.f11239f = PendingIntent.getBroadcast(this.f11234a, str.hashCode(), new Intent("com.appboy.action.receiver.DATA_SYNC").setClass(context, AppboyActionReceiver.class), 134217728);
        this.f11238e = new C4526a(dVar);
        C1557c.m7458a(f11233l, "Registered broadcast filters");
    }

    /* renamed from: g */
    private void m15676g() {
        PendingIntent pendingIntent = this.f11239f;
        if (pendingIntent != null) {
            this.f11236c.cancel(pendingIntent);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo15731d() {
        this.f11234a.registerReceiver(this.f11238e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo15732e() {
        this.f11234a.unregisterReceiver(this.f11238e);
    }

    /* renamed from: b */
    public synchronized boolean mo15729b() {
        if (!this.f11244k) {
            C1557c.m7458a(f11233l, "The data sync policy is not running. Ignoring request.");
            return false;
        }
        C1557c.m7458a(f11233l, "Data sync stopped");
        m15676g();
        mo15732e();
        this.f11244k = false;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo15730c() {
        long j = this.f11241h;
        if (this.f11240g == C4617w6.NO_SESSION || this.f11242i) {
            this.f11241h = -1;
        } else {
            int i = C4532f.f11255a[this.f11235b.mo15672a().ordinal()];
            if (i == 1) {
                this.f11241h = -1;
            } else if (i == 2) {
                this.f11241h = this.f11237d.mo15696a();
            } else if (i == 3 || i == 4) {
                this.f11241h = this.f11237d.mo15698c();
            } else {
                this.f11241h = this.f11237d.mo15697b();
            }
        }
        long j2 = this.f11241h;
        if (j != j2) {
            mo15725a(j2);
            String str = f11233l;
            StringBuilder sb = new StringBuilder();
            sb.append("Dispatch state has changed from ");
            sb.append(j);
            sb.append(" to ");
            sb.append(this.f11241h);
            sb.append(".");
            C1557c.m7458a(str, sb.toString());
        }
    }

    /* renamed from: a */
    public void mo15726a(C4410c cVar) {
        cVar.mo15487b(new C4528b(), C4533o.class);
        cVar.mo15487b(new C4529c(), C4545p.class);
        cVar.mo15487b(new C4530d(), C4451g.class);
        cVar.mo15487b(new C4531e(), C4459h.class);
    }

    /* renamed from: a */
    public synchronized void mo15727a(boolean z) {
        this.f11242i = z;
        mo15730c();
        if (z) {
            mo15729b();
        } else {
            mo15728a();
        }
    }

    /* renamed from: a */
    public synchronized boolean mo15728a() {
        if (this.f11244k) {
            C1557c.m7458a(f11233l, "The data sync policy is already running. Ignoring request.");
            return false;
        }
        C1557c.m7458a(f11233l, "Data sync started");
        mo15731d();
        mo15725a(3000);
        this.f11244k = true;
        return true;
    }

    /* renamed from: a */
    private void m15670a(long j, long j2) {
        this.f11236c.setInexactRepeating(1, j, j2, this.f11239f);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15671a(C4419d dVar, Throwable th) {
        try {
            dVar.mo15485a(th, Throwable.class);
        } catch (Exception e) {
            C1557c.m7470c(f11233l, "Failed to log throwable.", e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo15725a(long j) {
        if (this.f11236c == null) {
            C1557c.m7458a(f11233l, "Alarm manager was null. Ignoring request to reset it.");
            return;
        }
        if (this.f11241h <= 0) {
            C1557c.m7458a(f11233l, "Cancelling alarm because delay value was not positive.");
            m15676g();
        } else {
            m15670a(C4472i3.m15487c() + j, this.f11241h);
        }
    }
}
