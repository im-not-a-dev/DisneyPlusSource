package androidx.work.impl;

import android.content.Context;
import androidx.work.C1025b;
import androidx.work.C1034h;
import androidx.work.WorkerParameters.C1023a;
import androidx.work.impl.C1070j.C1073c;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* renamed from: androidx.work.impl.c */
/* compiled from: Processor */
public class C1058c implements C1039a {

    /* renamed from: c0 */
    private static final String f4151c0 = C1034h.m5551a("Processor");

    /* renamed from: U */
    private C1025b f4152U;

    /* renamed from: V */
    private TaskExecutor f4153V;

    /* renamed from: W */
    private WorkDatabase f4154W;

    /* renamed from: X */
    private Map<String, C1070j> f4155X = new HashMap();

    /* renamed from: Y */
    private List<C1060d> f4156Y;

    /* renamed from: Z */
    private Set<String> f4157Z;

    /* renamed from: a0 */
    private final List<C1039a> f4158a0;

    /* renamed from: b0 */
    private final Object f4159b0;

    /* renamed from: c */
    private Context f4160c;

    /* renamed from: androidx.work.impl.c$a */
    /* compiled from: Processor */
    private static class C1059a implements Runnable {

        /* renamed from: U */
        private String f4161U;

        /* renamed from: V */
        private ListenableFuture<Boolean> f4162V;

        /* renamed from: c */
        private C1039a f4163c;

        C1059a(C1039a aVar, String str, ListenableFuture<Boolean> listenableFuture) {
            this.f4163c = aVar;
            this.f4161U = str;
            this.f4162V = listenableFuture;
        }

        public void run() {
            boolean z;
            try {
                z = ((Boolean) this.f4162V.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.f4163c.mo5713a(this.f4161U, z);
        }
    }

    public C1058c(Context context, C1025b bVar, TaskExecutor taskExecutor, WorkDatabase workDatabase, List<C1060d> list) {
        this.f4160c = context;
        this.f4152U = bVar;
        this.f4153V = taskExecutor;
        this.f4154W = workDatabase;
        this.f4156Y = list;
        this.f4157Z = new HashSet();
        this.f4158a0 = new ArrayList();
        this.f4159b0 = new Object();
    }

    /* renamed from: a */
    public boolean mo5752a(String str, C1023a aVar) {
        synchronized (this.f4159b0) {
            if (this.f4155X.containsKey(str)) {
                C1034h.m5550a().mo5697a(f4151c0, String.format("Work %s is already enqueued for processing", new Object[]{str}), new Throwable[0]);
                return false;
            }
            C1073c cVar = new C1073c(this.f4160c, this.f4152U, this.f4153V, this.f4154W, str);
            cVar.mo5791a(this.f4156Y);
            cVar.mo5790a(aVar);
            C1070j a = cVar.mo5792a();
            ListenableFuture a2 = a.mo5783a();
            a2.mo5913a(new C1059a(this, str, a2), this.f4153V.mo5940b());
            this.f4155X.put(str, a);
            this.f4153V.mo5941c().execute(a);
            C1034h.m5550a().mo5697a(f4151c0, String.format("%s: processing %s", new Object[]{C1058c.class.getSimpleName(), str}), new Throwable[0]);
            return true;
        }
    }

    /* renamed from: b */
    public boolean mo5754b(String str) {
        boolean containsKey;
        synchronized (this.f4159b0) {
            containsKey = this.f4155X.containsKey(str);
        }
        return containsKey;
    }

    /* renamed from: c */
    public boolean mo5755c(String str) {
        return mo5752a(str, (C1023a) null);
    }

    /* renamed from: d */
    public boolean mo5756d(String str) {
        synchronized (this.f4159b0) {
            C1034h.m5550a().mo5697a(f4151c0, String.format("Processor cancelling %s", new Object[]{str}), new Throwable[0]);
            this.f4157Z.add(str);
            C1070j jVar = (C1070j) this.f4155X.remove(str);
            if (jVar != null) {
                jVar.mo5784a(true);
                C1034h.m5550a().mo5697a(f4151c0, String.format("WorkerWrapper cancelled for %s", new Object[]{str}), new Throwable[0]);
                return true;
            }
            C1034h.m5550a().mo5697a(f4151c0, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
            return false;
        }
    }

    /* renamed from: e */
    public boolean mo5757e(String str) {
        synchronized (this.f4159b0) {
            C1034h.m5550a().mo5697a(f4151c0, String.format("Processor stopping %s", new Object[]{str}), new Throwable[0]);
            C1070j jVar = (C1070j) this.f4155X.remove(str);
            if (jVar != null) {
                jVar.mo5784a(false);
                C1034h.m5550a().mo5697a(f4151c0, String.format("WorkerWrapper stopped for %s", new Object[]{str}), new Throwable[0]);
                return true;
            }
            C1034h.m5550a().mo5697a(f4151c0, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
            return false;
        }
    }

    /* renamed from: b */
    public void mo5753b(C1039a aVar) {
        synchronized (this.f4159b0) {
            this.f4158a0.remove(aVar);
        }
    }

    /* renamed from: a */
    public boolean mo5751a(String str) {
        boolean contains;
        synchronized (this.f4159b0) {
            contains = this.f4157Z.contains(str);
        }
        return contains;
    }

    /* renamed from: a */
    public void mo5750a(C1039a aVar) {
        synchronized (this.f4159b0) {
            this.f4158a0.add(aVar);
        }
    }

    /* renamed from: a */
    public void mo5713a(String str, boolean z) {
        synchronized (this.f4159b0) {
            this.f4155X.remove(str);
            C1034h.m5550a().mo5697a(f4151c0, String.format("%s %s executed; reschedule = %s", new Object[]{getClass().getSimpleName(), str, Boolean.valueOf(z)}), new Throwable[0]);
            for (C1039a a : this.f4158a0) {
                a.mo5713a(str, z);
            }
        }
    }
}
