package p520io.reactivex.p531y.p545h;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11955i;
import p520io.reactivex.p531y.p546i.C12539g;
import p520io.reactivex.p531y.p547j.C12543c;
import p520io.reactivex.p531y.p547j.C12550i;

/* renamed from: io.reactivex.y.h.d */
/* compiled from: StrictSubscriber */
public class C12532d<T> extends AtomicInteger implements C11955i<T>, C14314c {

    /* renamed from: U */
    final C12543c f29049U = new C12543c();

    /* renamed from: V */
    final AtomicLong f29050V = new AtomicLong();

    /* renamed from: W */
    final AtomicReference<C14314c> f29051W = new AtomicReference<>();

    /* renamed from: X */
    final AtomicBoolean f29052X = new AtomicBoolean();

    /* renamed from: Y */
    volatile boolean f29053Y;

    /* renamed from: c */
    final Subscriber<? super T> f29054c;

    public C12532d(Subscriber<? super T> subscriber) {
        this.f29054c = subscriber;
    }

    /* renamed from: a */
    public void mo29945a(C14314c cVar) {
        if (this.f29052X.compareAndSet(false, true)) {
            this.f29054c.mo29945a(this);
            C12539g.m39327a(this.f29051W, this.f29050V, cVar);
            return;
        }
        cVar.cancel();
        cancel();
        onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    /* renamed from: b */
    public void mo29946b(long j) {
        if (j <= 0) {
            cancel();
            StringBuilder sb = new StringBuilder();
            sb.append("§3.9 violated: positive request amount required but it was ");
            sb.append(j);
            onError(new IllegalArgumentException(sb.toString()));
            return;
        }
        C12539g.m39325a(this.f29051W, this.f29050V, j);
    }

    public void cancel() {
        if (!this.f29053Y) {
            C12539g.m39326a(this.f29051W);
        }
    }

    public void onComplete() {
        this.f29053Y = true;
        C12550i.m39356a(this.f29054c, this, this.f29049U);
    }

    public void onError(Throwable th) {
        this.f29053Y = true;
        C12550i.m39355a(this.f29054c, th, (AtomicInteger) this, this.f29049U);
    }

    public void onNext(T t) {
        C12550i.m39354a(this.f29054c, t, (AtomicInteger) this, this.f29049U);
    }
}
