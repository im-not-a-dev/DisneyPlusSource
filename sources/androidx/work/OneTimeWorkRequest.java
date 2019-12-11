package androidx.work;

import android.os.Build.VERSION;
import androidx.work.C1166l.C1167a;

public final class OneTimeWorkRequest extends C1166l {

    /* renamed from: androidx.work.OneTimeWorkRequest$a */
    public static final class C1015a extends C1167a<C1015a, OneTimeWorkRequest> {
        public C1015a(Class<? extends ListenableWorker> cls) {
            super(cls);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C1015a mo5617c() {
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public OneTimeWorkRequest m5474b() {
            if (!this.f4402a || VERSION.SDK_INT < 23 || !this.f4404c.f4289j.mo5679h()) {
                return new OneTimeWorkRequest(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
    }

    OneTimeWorkRequest(C1015a aVar) {
        super(aVar.f4403b, aVar.f4404c, aVar.f4405d);
    }
}
