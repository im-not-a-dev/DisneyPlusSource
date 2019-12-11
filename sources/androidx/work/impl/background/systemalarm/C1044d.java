package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager.WakeLock;
import androidx.work.C1034h;
import androidx.work.impl.C1039a;
import androidx.work.impl.p008l.C1077c;
import androidx.work.impl.p008l.C1078d;
import androidx.work.impl.p011m.C1111j;
import androidx.work.impl.utils.C1158j;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.work.impl.background.systemalarm.d */
/* compiled from: DelayMetCommandHandler */
public class C1044d implements C1077c, C1039a, C1053b {

    /* renamed from: c0 */
    private static final String f4104c0 = C1034h.m5551a("DelayMetCommandHandler");

    /* renamed from: U */
    private final int f4105U;

    /* renamed from: V */
    private final String f4106V;

    /* renamed from: W */
    private final C1045e f4107W;

    /* renamed from: X */
    private final C1078d f4108X = new C1078d(this.f4113c, this);

    /* renamed from: Y */
    private final Object f4109Y = new Object();

    /* renamed from: Z */
    private boolean f4110Z = false;

    /* renamed from: a0 */
    private WakeLock f4111a0;

    /* renamed from: b0 */
    private boolean f4112b0 = false;

    /* renamed from: c */
    private final Context f4113c;

    C1044d(Context context, int i, String str, C1045e eVar) {
        this.f4113c = context;
        this.f4105U = i;
        this.f4107W = eVar;
        this.f4106V = str;
    }

    /* renamed from: c */
    private void m5613c() {
        synchronized (this.f4109Y) {
            if (!this.f4110Z) {
                C1034h.m5550a().mo5697a(f4104c0, String.format("Stopping work for workspec %s", new Object[]{this.f4106V}), new Throwable[0]);
                this.f4107W.mo5728a((Runnable) new C1047b(this.f4107W, C1042b.m5602c(this.f4113c, this.f4106V), this.f4105U));
                if (this.f4107W.mo5730b().mo5754b(this.f4106V)) {
                    C1034h.m5550a().mo5697a(f4104c0, String.format("WorkSpec %s needs to be rescheduled", new Object[]{this.f4106V}), new Throwable[0]);
                    this.f4107W.mo5728a((Runnable) new C1047b(this.f4107W, C1042b.m5600b(this.f4113c, this.f4106V), this.f4105U));
                } else {
                    C1034h.m5550a().mo5697a(f4104c0, String.format("Processor does not have WorkSpec %s. No need to reschedule ", new Object[]{this.f4106V}), new Throwable[0]);
                }
                this.f4110Z = true;
            } else {
                C1034h.m5550a().mo5697a(f4104c0, String.format("Already stopped work for %s", new Object[]{this.f4106V}), new Throwable[0]);
            }
        }
    }

    /* renamed from: a */
    public void mo5713a(String str, boolean z) {
        C1034h.m5550a().mo5697a(f4104c0, String.format("onExecuted %s, %s", new Object[]{str, Boolean.valueOf(z)}), new Throwable[0]);
        m5612b();
        if (z) {
            Intent b = C1042b.m5600b(this.f4113c, this.f4106V);
            C1045e eVar = this.f4107W;
            eVar.mo5728a((Runnable) new C1047b(eVar, b, this.f4105U));
        }
        if (this.f4112b0) {
            Intent a = C1042b.m5595a(this.f4113c);
            C1045e eVar2 = this.f4107W;
            eVar2.mo5728a((Runnable) new C1047b(eVar2, a, this.f4105U));
        }
    }

    /* renamed from: b */
    public void mo5725b(List<String> list) {
        if (list.contains(this.f4106V)) {
            C1034h.m5550a().mo5697a(f4104c0, String.format("onAllConstraintsMet for %s", new Object[]{this.f4106V}), new Throwable[0]);
            if (this.f4107W.mo5730b().mo5755c(this.f4106V)) {
                this.f4107W.mo5732d().mo5741a(this.f4106V, 600000, this);
            } else {
                m5612b();
            }
        }
    }

    /* renamed from: b */
    private void m5612b() {
        synchronized (this.f4109Y) {
            this.f4108X.mo5801a();
            this.f4107W.mo5732d().mo5740a(this.f4106V);
            if (this.f4111a0 != null && this.f4111a0.isHeld()) {
                C1034h.m5550a().mo5697a(f4104c0, String.format("Releasing wakelock %s for WorkSpec %s", new Object[]{this.f4111a0, this.f4106V}), new Throwable[0]);
                this.f4111a0.release();
            }
        }
    }

    /* renamed from: a */
    public void mo5723a(String str) {
        C1034h.m5550a().mo5697a(f4104c0, String.format("Exceeded time limits on execution for %s", new Object[]{str}), new Throwable[0]);
        m5613c();
    }

    /* renamed from: a */
    public void mo5724a(List<String> list) {
        m5613c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5722a() {
        this.f4111a0 = C1158j.m5971a(this.f4113c, String.format("%s (%s)", new Object[]{this.f4106V, Integer.valueOf(this.f4105U)}));
        C1034h.m5550a().mo5697a(f4104c0, String.format("Acquiring wakelock %s for WorkSpec %s", new Object[]{this.f4111a0, this.f4106V}), new Throwable[0]);
        this.f4111a0.acquire();
        C1111j f = this.f4107W.mo5731c().mo5779g().mo5705d().mo5881f(this.f4106V);
        if (f == null) {
            m5613c();
            return;
        }
        this.f4112b0 = f.mo5853b();
        if (!this.f4112b0) {
            C1034h.m5550a().mo5697a(f4104c0, String.format("No constraints for %s", new Object[]{this.f4106V}), new Throwable[0]);
            mo5725b(Collections.singletonList(this.f4106V));
        } else {
            this.f4108X.mo5805c(Collections.singletonList(f));
        }
    }
}
