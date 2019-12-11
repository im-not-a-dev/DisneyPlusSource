package androidx.work;

import android.os.Build.VERSION;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: androidx.work.b */
/* compiled from: Configuration */
public final class C1025b {

    /* renamed from: a */
    private final Executor f4031a;

    /* renamed from: b */
    private final WorkerFactory f4032b;

    /* renamed from: c */
    private final int f4033c;

    /* renamed from: d */
    private final int f4034d;

    /* renamed from: e */
    private final int f4035e;

    /* renamed from: f */
    private final int f4036f;

    /* renamed from: androidx.work.b$a */
    /* compiled from: Configuration */
    public static final class C1026a {

        /* renamed from: a */
        Executor f4037a;

        /* renamed from: b */
        WorkerFactory f4038b;

        /* renamed from: c */
        int f4039c = 4;

        /* renamed from: d */
        int f4040d = 0;

        /* renamed from: e */
        int f4041e = Integer.MAX_VALUE;

        /* renamed from: f */
        int f4042f = 20;

        /* renamed from: a */
        public C1026a mo5661a(WorkerFactory workerFactory) {
            this.f4038b = workerFactory;
            return this;
        }

        /* renamed from: a */
        public C1025b mo5662a() {
            return new C1025b(this);
        }
    }

    C1025b(C1026a aVar) {
        Executor executor = aVar.f4037a;
        if (executor == null) {
            this.f4031a = m5511g();
        } else {
            this.f4031a = executor;
        }
        WorkerFactory workerFactory = aVar.f4038b;
        if (workerFactory == null) {
            this.f4032b = WorkerFactory.m5502a();
        } else {
            this.f4032b = workerFactory;
        }
        this.f4033c = aVar.f4039c;
        this.f4034d = aVar.f4040d;
        this.f4035e = aVar.f4041e;
        this.f4036f = aVar.f4042f;
    }

    /* renamed from: g */
    private Executor m5511g() {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
    }

    /* renamed from: a */
    public Executor mo5655a() {
        return this.f4031a;
    }

    /* renamed from: b */
    public int mo5656b() {
        return this.f4035e;
    }

    /* renamed from: c */
    public int mo5657c() {
        if (VERSION.SDK_INT == 23) {
            return this.f4036f / 2;
        }
        return this.f4036f;
    }

    /* renamed from: d */
    public int mo5658d() {
        return this.f4034d;
    }

    /* renamed from: e */
    public int mo5659e() {
        return this.f4033c;
    }

    /* renamed from: f */
    public WorkerFactory mo5660f() {
        return this.f4032b;
    }
}
