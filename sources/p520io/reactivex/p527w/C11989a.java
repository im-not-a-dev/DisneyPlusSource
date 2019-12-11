package p520io.reactivex.p527w;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p527w.p529c.C11992a;

/* renamed from: io.reactivex.w.a */
/* compiled from: MainThreadDisposable */
public abstract class C11989a implements Disposable {

    /* renamed from: c */
    private final AtomicBoolean f27716c = new AtomicBoolean();

    /* renamed from: io.reactivex.w.a$a */
    /* compiled from: MainThreadDisposable */
    class C11990a implements Runnable {
        C11990a() {
        }

        public void run() {
            C11989a.this.mo29706a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo29706a();

    public final void dispose() {
        if (!this.f27716c.compareAndSet(false, true)) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            mo29706a();
        } else {
            C11992a.m38600a().mo30289a(new C11990a());
        }
    }

    public final boolean isDisposed() {
        return this.f27716c.get();
    }
}
