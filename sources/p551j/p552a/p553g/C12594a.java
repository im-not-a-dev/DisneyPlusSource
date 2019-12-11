package p551j.p552a.p553g;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/* renamed from: j.a.g.a */
/* compiled from: ANRWatchDog */
class C12594a extends Thread {

    /* renamed from: Z */
    private static final String f29220Z = C12594a.class.getName();

    /* renamed from: U */
    private final Handler f29221U = new Handler(Looper.getMainLooper());

    /* renamed from: V */
    private final int f29222V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public volatile long f29223W = 0;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public volatile boolean f29224X = false;

    /* renamed from: Y */
    private final Runnable f29225Y = new C12595a();

    /* renamed from: c */
    private C12596b f29226c = null;

    /* renamed from: j.a.g.a$a */
    /* compiled from: ANRWatchDog */
    class C12595a implements Runnable {
        C12595a() {
        }

        public void run() {
            C12594a.this.f29223W = 0;
            C12594a.this.f29224X = false;
        }
    }

    /* renamed from: j.a.g.a$b */
    /* compiled from: ANRWatchDog */
    public interface C12596b {
        /* renamed from: a */
        void mo30909a(C12599c cVar);
    }

    public C12594a(int i, C12596b bVar) {
        this.f29226c = bVar;
        this.f29222V = i;
    }

    public void run() {
        setName("|ANR-WatchDog|");
        long j = (long) this.f29222V;
        while (!isInterrupted()) {
            boolean z = this.f29223W == 0;
            this.f29223W += j;
            if (z) {
                this.f29221U.post(this.f29225Y);
            }
            try {
                Thread.sleep(j);
                if (this.f29223W != 0 && !this.f29224X) {
                    if (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) {
                        Log.d(f29220Z, "An ANR was detected but ignored because the debugger is connected.");
                        this.f29224X = true;
                    } else {
                        Log.d(f29220Z, "Raising ANR");
                        StringBuilder sb = new StringBuilder();
                        sb.append("Application Not Responding for at least ");
                        sb.append(this.f29222V);
                        sb.append(" ms.");
                        this.f29226c.mo30909a(new C12599c(sb.toString()));
                        j = (long) this.f29222V;
                        this.f29224X = true;
                    }
                }
            } catch (InterruptedException e) {
                String str = f29220Z;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Interrupted: ");
                sb2.append(e.getMessage());
                Log.w(str, sb2.toString());
                return;
            }
        }
    }
}
