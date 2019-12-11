package androidx.work.impl;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.C1025b;
import androidx.work.C1031e;
import androidx.work.C1032f;
import androidx.work.C1034h;
import androidx.work.C1034h.C1035a;
import androidx.work.C1164j;
import androidx.work.C1165k;
import androidx.work.C1166l;
import androidx.work.OneTimeWorkRequest;
import androidx.work.Operation;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters.C1023a;
import androidx.work.impl.background.systemjob.C1057b;
import androidx.work.impl.p006k.p007a.C1074a;
import androidx.work.impl.utils.C1132a;
import androidx.work.impl.utils.C1138e;
import androidx.work.impl.utils.C1139f;
import androidx.work.impl.utils.C1152g;
import androidx.work.impl.utils.C1156h;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.taskexecutor.C1159a;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: androidx.work.impl.h */
/* compiled from: WorkManagerImpl */
public class C1068h extends WorkManager {

    /* renamed from: j */
    private static C1068h f4179j;

    /* renamed from: k */
    private static C1068h f4180k;

    /* renamed from: l */
    private static final Object f4181l = new Object();

    /* renamed from: a */
    private Context f4182a;

    /* renamed from: b */
    private C1025b f4183b;

    /* renamed from: c */
    private WorkDatabase f4184c;

    /* renamed from: d */
    private TaskExecutor f4185d;

    /* renamed from: e */
    private List<C1060d> f4186e;

    /* renamed from: f */
    private C1058c f4187f;

    /* renamed from: g */
    private C1138e f4188g;

    /* renamed from: h */
    private boolean f4189h;

    /* renamed from: i */
    private PendingResult f4190i;

    public C1068h(Context context, C1025b bVar, TaskExecutor taskExecutor) {
        this(context, bVar, taskExecutor, context.getResources().getBoolean(C1164j.workmanager_test_configuration));
    }

    /* renamed from: a */
    public static C1068h m5674a() {
        synchronized (f4181l) {
            if (f4179j != null) {
                C1068h hVar = f4179j;
                return hVar;
            }
            C1068h hVar2 = f4180k;
            return hVar2;
        }
    }

    /* renamed from: b */
    public Context mo5772b() {
        return this.f4182a;
    }

    /* renamed from: c */
    public C1025b mo5773c() {
        return this.f4183b;
    }

    /* renamed from: d */
    public C1138e mo5774d() {
        return this.f4188g;
    }

    /* renamed from: e */
    public C1058c mo5776e() {
        return this.f4187f;
    }

    /* renamed from: f */
    public List<C1060d> mo5778f() {
        return this.f4186e;
    }

    /* renamed from: g */
    public WorkDatabase mo5779g() {
        return this.f4184c;
    }

    /* renamed from: h */
    public TaskExecutor mo5780h() {
        return this.f4185d;
    }

    /* renamed from: i */
    public void mo5781i() {
        synchronized (f4181l) {
            this.f4189h = true;
            if (this.f4190i != null) {
                this.f4190i.finish();
                this.f4190i = null;
            }
        }
    }

    /* renamed from: j */
    public void mo5782j() {
        if (VERSION.SDK_INT >= 23) {
            C1057b.m5644a(mo5772b());
        }
        mo5779g().mo5705d().mo5878d();
        C1061e.m5661a(mo5773c(), mo5779g(), mo5778f());
    }

    /* renamed from: b */
    private C1062f m5677b(String str, C1031e eVar, PeriodicWorkRequest periodicWorkRequest) {
        C1032f fVar;
        if (eVar == C1031e.KEEP) {
            fVar = C1032f.KEEP;
        } else {
            fVar = C1032f.REPLACE;
        }
        return new C1062f(this, str, fVar, Collections.singletonList(periodicWorkRequest));
    }

    /* renamed from: c */
    public ListenableFuture<List<WorkInfo>> mo5645c(String str) {
        C1152g b = C1152g.m5962b(this, str);
        this.f4185d.mo5941c().execute(b);
        return b.mo5933a();
    }

    /* renamed from: d */
    public void mo5775d(String str) {
        mo5771a(str, (C1023a) null);
    }

    /* renamed from: e */
    public void mo5777e(String str) {
        this.f4185d.mo5939a(new C1156h(this, str));
    }

    public C1068h(Context context, C1025b bVar, TaskExecutor taskExecutor, boolean z) {
        new C1069i();
        Context applicationContext = context.getApplicationContext();
        WorkDatabase a = WorkDatabase.m5563a(applicationContext, z);
        C1034h.m5552a((C1034h) new C1035a(bVar.mo5659e()));
        Context context2 = context;
        C1025b bVar2 = bVar;
        TaskExecutor taskExecutor2 = taskExecutor;
        WorkDatabase workDatabase = a;
        List a2 = mo5769a(applicationContext);
        C1058c cVar = new C1058c(context2, bVar2, taskExecutor2, workDatabase, a2);
        m5676a(context2, bVar2, taskExecutor2, workDatabase, a2, cVar);
    }

    /* renamed from: a */
    public static void m5675a(Context context, C1025b bVar) {
        synchronized (f4181l) {
            if (f4179j != null) {
                if (f4180k != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class levelJavadoc for more information.");
                }
            }
            if (f4179j == null) {
                Context applicationContext = context.getApplicationContext();
                if (f4180k == null) {
                    f4180k = new C1068h(applicationContext, bVar, new C1159a());
                }
                f4179j = f4180k;
            }
        }
    }

    /* renamed from: b */
    public ListenableFuture<WorkInfo> mo5644b(UUID uuid) {
        C1152g a = C1152g.m5961a(this, uuid);
        this.f4185d.mo5941c().execute(a);
        return a.mo5933a();
    }

    /* renamed from: b */
    public ListenableFuture<List<WorkInfo>> mo5643b(String str) {
        C1152g a = C1152g.m5960a(this, str);
        this.f4185d.mo5941c().execute(a);
        return a.mo5933a();
    }

    /* renamed from: a */
    public Operation mo5639a(List<? extends C1166l> list) {
        if (!list.isEmpty()) {
            return new C1062f(this, list).mo5759a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    /* renamed from: a */
    public C1165k mo5642a(String str, C1032f fVar, List<OneTimeWorkRequest> list) {
        if (!list.isEmpty()) {
            return new C1062f(this, str, fVar, list);
        }
        throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
    }

    /* renamed from: a */
    public Operation mo5638a(String str, C1031e eVar, PeriodicWorkRequest periodicWorkRequest) {
        return m5677b(str, eVar, periodicWorkRequest).mo5759a();
    }

    /* renamed from: a */
    public Operation mo5640a(UUID uuid) {
        C1132a a = C1132a.m5895a(uuid, this);
        this.f4185d.mo5939a(a);
        return a.mo5895a();
    }

    /* renamed from: a */
    public Operation mo5637a(String str) {
        C1132a a = C1132a.m5894a(str, this, true);
        this.f4185d.mo5939a(a);
        return a.mo5895a();
    }

    /* renamed from: a */
    public void mo5771a(String str, C1023a aVar) {
        this.f4185d.mo5939a(new C1139f(this, str, aVar));
    }

    /* renamed from: a */
    public void mo5770a(PendingResult pendingResult) {
        synchronized (f4181l) {
            this.f4190i = pendingResult;
            if (this.f4189h) {
                this.f4190i.finish();
                this.f4190i = null;
            }
        }
    }

    /* renamed from: a */
    private void m5676a(Context context, C1025b bVar, TaskExecutor taskExecutor, WorkDatabase workDatabase, List<C1060d> list, C1058c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f4182a = applicationContext;
        this.f4183b = bVar;
        this.f4185d = taskExecutor;
        this.f4184c = workDatabase;
        this.f4186e = list;
        this.f4187f = cVar;
        this.f4188g = new C1138e(this.f4182a);
        this.f4189h = false;
        this.f4185d.mo5939a(new ForceStopRunnable(applicationContext, this));
    }

    /* renamed from: a */
    public List<C1060d> mo5769a(Context context) {
        return Arrays.asList(new C1060d[]{C1061e.m5660a(context, this), new C1074a(context, this)});
    }
}
