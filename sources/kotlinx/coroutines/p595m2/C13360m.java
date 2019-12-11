package kotlinx.coroutines.p595m2;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.C13280r;

/* renamed from: kotlinx.coroutines.m2.m */
/* compiled from: Tasks.kt */
public final class C13360m {

    /* renamed from: a */
    public static final long f29840a = C13282t.m40833a("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);

    /* renamed from: b */
    public static final int f29841b = C13282t.m40831a("kotlinx.coroutines.scheduler.offload.threshold", 96, 0, 128, 4, (Object) null);

    /* renamed from: c */
    public static final int f29842c = C13282t.m40831a("kotlinx.coroutines.scheduler.core.pool.size", C12762h.m39913a(C13280r.m40821a(), 2), 1, 0, 8, (Object) null);

    /* renamed from: d */
    public static final int f29843d = C13282t.m40831a("kotlinx.coroutines.scheduler.max.pool.size", C12762h.m39914a(C13280r.m40821a() * 128, f29842c, 2097150), 0, 2097150, 4, (Object) null);

    /* renamed from: e */
    public static final long f29844e = TimeUnit.SECONDS.toNanos(C13282t.m40833a("kotlinx.coroutines.scheduler.keep.alive.sec", 5, 0, 0, 12, (Object) null));

    /* renamed from: f */
    public static C13361n f29845f = C13354g.f29831a;

    static {
        C13282t.m40831a("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, (Object) null);
    }
}
