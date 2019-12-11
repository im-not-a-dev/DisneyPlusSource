package p598l.p599a.p600a.p601a;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;

/* renamed from: l.a.a.a.a */
/* compiled from: SystemUiHelper */
public final class C13421a {

    /* renamed from: a */
    private final C13425d f29915a;

    /* renamed from: b */
    private final Handler f29916b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final Runnable f29917c = new C13423b();

    /* renamed from: l.a.a.a.a$b */
    /* compiled from: SystemUiHelper */
    private class C13423b implements Runnable {
        private C13423b() {
        }

        public void run() {
            C13421a.this.mo34632a();
        }
    }

    /* renamed from: l.a.a.a.a$c */
    /* compiled from: SystemUiHelper */
    public interface C13424c {
        /* renamed from: a */
        void mo16564a(boolean z);
    }

    /* renamed from: l.a.a.a.a$d */
    /* compiled from: SystemUiHelper */
    static abstract class C13425d {

        /* renamed from: a */
        final Activity f29919a;

        /* renamed from: b */
        final int f29920b;

        /* renamed from: c */
        final int f29921c;

        /* renamed from: d */
        final C13424c f29922d;

        /* renamed from: e */
        boolean f29923e = true;

        C13425d(Activity activity, int i, int i2, C13424c cVar) {
            this.f29919a = activity;
            this.f29920b = i;
            this.f29921c = i2;
            this.f29922d = cVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo34635a();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo34636a(boolean z) {
            this.f29923e = z;
            C13424c cVar = this.f29922d;
            if (cVar != null) {
                cVar.mo16564a(this.f29923e);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract void mo34637b();
    }

    /* renamed from: l.a.a.a.a$e */
    /* compiled from: SystemUiHelper */
    static class C13426e extends C13425d {
        C13426e(Activity activity, int i, int i2, C13424c cVar) {
            super(activity, i, i2, cVar);
            if ((this.f29921c & 1) != 0) {
                this.f29919a.getWindow().addFlags(768);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo34635a() {
            if (this.f29920b > 0) {
                this.f29919a.getWindow().addFlags(1024);
                mo34636a(false);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo34637b() {
            if (this.f29920b > 0) {
                this.f29919a.getWindow().clearFlags(1024);
                mo34636a(true);
            }
        }
    }

    public C13421a(Activity activity, int i, int i2, C13424c cVar) {
        int i3 = VERSION.SDK_INT;
        if (i3 >= 19) {
            this.f29915a = new C13430e(activity, i, i2, cVar);
        } else if (i3 >= 16) {
            this.f29915a = new C13429d(activity, i, i2, cVar);
        } else if (i3 >= 14) {
            this.f29915a = new C13428c(activity, i, i2, cVar);
        } else if (i3 >= 11) {
            this.f29915a = new C13427b(activity, i, i2, cVar);
        } else {
            this.f29915a = new C13426e(activity, i, i2, cVar);
        }
    }

    /* renamed from: c */
    private void m41278c() {
        this.f29916b.removeCallbacks(this.f29917c);
    }

    /* renamed from: a */
    public void mo34632a() {
        m41278c();
        this.f29915a.mo34635a();
    }

    /* renamed from: b */
    public void mo34633b() {
        m41278c();
        this.f29915a.mo34637b();
    }
}
