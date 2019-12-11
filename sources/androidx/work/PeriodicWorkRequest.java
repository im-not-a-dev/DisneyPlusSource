package androidx.work;

import android.os.Build.VERSION;
import androidx.work.C1166l.C1167a;
import java.util.concurrent.TimeUnit;

public final class PeriodicWorkRequest extends C1166l {

    /* renamed from: androidx.work.PeriodicWorkRequest$a */
    public static final class C1019a extends C1167a<C1019a, PeriodicWorkRequest> {
        public C1019a(Class<? extends ListenableWorker> cls, long j, TimeUnit timeUnit) {
            super(cls);
            this.f4404c.mo5852b(timeUnit.toMillis(j));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C1019a mo5617c() {
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public PeriodicWorkRequest m5481b() {
            if (!this.f4402a || VERSION.SDK_INT < 23 || !this.f4404c.f4289j.mo5679h()) {
                return new PeriodicWorkRequest(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }

        public C1019a(Class<? extends ListenableWorker> cls, long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2) {
            super(cls);
            this.f4404c.mo5851a(timeUnit.toMillis(j), timeUnit2.toMillis(j2));
        }
    }

    PeriodicWorkRequest(C1019a aVar) {
        super(aVar.f4403b, aVar.f4404c, aVar.f4405d);
    }
}
