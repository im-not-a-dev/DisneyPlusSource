package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.C0715i.C0716a;

/* renamed from: androidx.lifecycle.x */
/* compiled from: ServiceLifecycleDispatcher */
public class C0739x {

    /* renamed from: a */
    private final C0723n f3028a;

    /* renamed from: b */
    private final Handler f3029b = new Handler();

    /* renamed from: c */
    private C0740a f3030c;

    /* renamed from: androidx.lifecycle.x$a */
    /* compiled from: ServiceLifecycleDispatcher */
    static class C0740a implements Runnable {

        /* renamed from: U */
        final C0716a f3031U;

        /* renamed from: V */
        private boolean f3032V = false;

        /* renamed from: c */
        private final C0723n f3033c;

        C0740a(C0723n nVar, C0716a aVar) {
            this.f3033c = nVar;
            this.f3031U = aVar;
        }

        public void run() {
            if (!this.f3032V) {
                this.f3033c.mo4139a(this.f3031U);
                this.f3032V = true;
            }
        }
    }

    public C0739x(C0722m mVar) {
        this.f3028a = new C0723n(mVar);
    }

    /* renamed from: a */
    private void m3803a(C0716a aVar) {
        C0740a aVar2 = this.f3030c;
        if (aVar2 != null) {
            aVar2.run();
        }
        this.f3030c = new C0740a(this.f3028a, aVar);
        this.f3029b.postAtFrontOfQueue(this.f3030c);
    }

    /* renamed from: b */
    public void mo4172b() {
        m3803a(C0716a.ON_START);
    }

    /* renamed from: c */
    public void mo4173c() {
        m3803a(C0716a.ON_CREATE);
    }

    /* renamed from: d */
    public void mo4174d() {
        m3803a(C0716a.ON_STOP);
        m3803a(C0716a.ON_DESTROY);
    }

    /* renamed from: e */
    public void mo4175e() {
        m3803a(C0716a.ON_START);
    }

    /* renamed from: a */
    public C0715i mo4171a() {
        return this.f3028a;
    }
}
