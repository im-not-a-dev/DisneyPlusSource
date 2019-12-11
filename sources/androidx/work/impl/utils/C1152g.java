package androidx.work.impl.utils;

import androidx.work.WorkInfo;
import androidx.work.impl.C1068h;
import androidx.work.impl.p011m.C1111j;
import androidx.work.impl.p011m.C1111j.C1114c;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.UUID;

/* renamed from: androidx.work.impl.utils.g */
/* compiled from: StatusRunnable */
public abstract class C1152g<T> implements Runnable {

    /* renamed from: c */
    private final SettableFuture<T> f4370c = SettableFuture.m5920d();

    /* renamed from: androidx.work.impl.utils.g$a */
    /* compiled from: StatusRunnable */
    static class C1153a extends C1152g<WorkInfo> {

        /* renamed from: U */
        final /* synthetic */ C1068h f4371U;

        /* renamed from: V */
        final /* synthetic */ UUID f4372V;

        C1153a(C1068h hVar, UUID uuid) {
            this.f4371U = hVar;
            this.f4372V = uuid;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public WorkInfo m5966b() {
            C1114c d = this.f4371U.mo5779g().mo5705d().mo5879d(this.f4372V.toString());
            if (d != null) {
                return d.mo5863a();
            }
            return null;
        }
    }

    /* renamed from: androidx.work.impl.utils.g$b */
    /* compiled from: StatusRunnable */
    static class C1154b extends C1152g<List<WorkInfo>> {

        /* renamed from: U */
        final /* synthetic */ C1068h f4373U;

        /* renamed from: V */
        final /* synthetic */ String f4374V;

        C1154b(C1068h hVar, String str) {
            this.f4373U = hVar;
            this.f4374V = str;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public List<WorkInfo> m5968b() {
            return (List) C1111j.f4279r.apply(this.f4373U.mo5779g().mo5705d().mo5883h(this.f4374V));
        }
    }

    /* renamed from: androidx.work.impl.utils.g$c */
    /* compiled from: StatusRunnable */
    static class C1155c extends C1152g<List<WorkInfo>> {

        /* renamed from: U */
        final /* synthetic */ C1068h f4375U;

        /* renamed from: V */
        final /* synthetic */ String f4376V;

        C1155c(C1068h hVar, String str) {
            this.f4375U = hVar;
            this.f4376V = str;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public List<WorkInfo> m5970b() {
            return (List) C1111j.f4279r.apply(this.f4375U.mo5779g().mo5705d().mo5886k(this.f4376V));
        }
    }

    /* renamed from: b */
    public static C1152g<List<WorkInfo>> m5962b(C1068h hVar, String str) {
        return new C1155c(hVar, str);
    }

    /* renamed from: a */
    public ListenableFuture<T> mo5933a() {
        return this.f4370c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract T mo5934b();

    public void run() {
        try {
            this.f4370c.mo5910a(mo5934b());
        } catch (Throwable th) {
            this.f4370c.mo5911a(th);
        }
    }

    /* renamed from: a */
    public static C1152g<WorkInfo> m5961a(C1068h hVar, UUID uuid) {
        return new C1153a(hVar, uuid);
    }

    /* renamed from: a */
    public static C1152g<List<WorkInfo>> m5960a(C1068h hVar, String str) {
        return new C1154b(hVar, str);
    }
}
