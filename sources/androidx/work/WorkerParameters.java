package androidx.work;

import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {

    /* renamed from: a */
    private UUID f4023a;

    /* renamed from: b */
    private Data f4024b;

    /* renamed from: c */
    private Executor f4025c;

    /* renamed from: d */
    private TaskExecutor f4026d;

    /* renamed from: e */
    private WorkerFactory f4027e;

    /* renamed from: androidx.work.WorkerParameters$a */
    public static class C1023a {
        public C1023a() {
            Collections.emptyList();
            Collections.emptyList();
        }
    }

    public WorkerParameters(UUID uuid, Data data, Collection<String> collection, C1023a aVar, int i, Executor executor, TaskExecutor taskExecutor, WorkerFactory workerFactory) {
        this.f4023a = uuid;
        this.f4024b = data;
        new HashSet(collection);
        this.f4025c = executor;
        this.f4026d = taskExecutor;
        this.f4027e = workerFactory;
    }

    /* renamed from: a */
    public Executor mo5650a() {
        return this.f4025c;
    }

    /* renamed from: b */
    public UUID mo5651b() {
        return this.f4023a;
    }

    /* renamed from: c */
    public Data mo5652c() {
        return this.f4024b;
    }

    /* renamed from: d */
    public TaskExecutor mo5653d() {
        return this.f4026d;
    }

    /* renamed from: e */
    public WorkerFactory mo5654e() {
        return this.f4027e;
    }
}
