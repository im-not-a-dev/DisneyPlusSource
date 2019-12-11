package androidx.work.impl.utils;

import androidx.work.C1034h;
import androidx.work.WorkInfo.State;
import androidx.work.impl.C1068h;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p011m.C1115k;

/* renamed from: androidx.work.impl.utils.h */
/* compiled from: StopWorkRunnable */
public class C1156h implements Runnable {

    /* renamed from: V */
    private static final String f4377V = C1034h.m5551a("StopWorkRunnable");

    /* renamed from: U */
    private String f4378U;

    /* renamed from: c */
    private C1068h f4379c;

    public C1156h(C1068h hVar, String str) {
        this.f4379c = hVar;
        this.f4378U = str;
    }

    public void run() {
        WorkDatabase g = this.f4379c.mo5779g();
        C1115k d = g.mo5705d();
        g.beginTransaction();
        try {
            if (d.mo5880e(this.f4378U) == State.RUNNING) {
                d.mo5866a(State.ENQUEUED, this.f4378U);
            }
            boolean e = this.f4379c.mo5776e().mo5757e(this.f4378U);
            C1034h.m5550a().mo5697a(f4377V, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[]{this.f4378U, Boolean.valueOf(e)}), new Throwable[0]);
            g.setTransactionSuccessful();
        } finally {
            g.endTransaction();
        }
    }
}
