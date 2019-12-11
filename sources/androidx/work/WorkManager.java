package androidx.work;

import android.content.Context;
import androidx.work.impl.C1068h;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public abstract class WorkManager {
    protected WorkManager() {
    }

    /* renamed from: a */
    public static WorkManager m5490a() {
        C1068h a = C1068h.m5674a();
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
    }

    /* renamed from: a */
    public abstract Operation mo5637a(String str);

    /* renamed from: a */
    public abstract Operation mo5638a(String str, C1031e eVar, PeriodicWorkRequest periodicWorkRequest);

    /* renamed from: a */
    public abstract Operation mo5639a(List<? extends C1166l> list);

    /* renamed from: a */
    public abstract Operation mo5640a(UUID uuid);

    /* renamed from: a */
    public abstract C1165k mo5642a(String str, C1032f fVar, List<OneTimeWorkRequest> list);

    /* renamed from: b */
    public abstract ListenableFuture<List<WorkInfo>> mo5643b(String str);

    /* renamed from: b */
    public abstract ListenableFuture<WorkInfo> mo5644b(UUID uuid);

    /* renamed from: c */
    public abstract ListenableFuture<List<WorkInfo>> mo5645c(String str);

    /* renamed from: a */
    public static void m5491a(Context context, C1025b bVar) {
        C1068h.m5675a(context, bVar);
    }

    /* renamed from: a */
    public final Operation mo5636a(C1166l lVar) {
        return mo5639a(Collections.singletonList(lVar));
    }

    /* renamed from: a */
    public final C1165k mo5641a(String str, C1032f fVar, OneTimeWorkRequest oneTimeWorkRequest) {
        return mo5642a(str, fVar, Collections.singletonList(oneTimeWorkRequest));
    }
}
