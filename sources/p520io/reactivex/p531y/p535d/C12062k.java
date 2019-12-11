package p520io.reactivex.p531y.p535d;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11987u;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.d.k */
/* compiled from: ResumeSingleObserver */
public final class C12062k<T> implements C11987u<T> {

    /* renamed from: U */
    final C11987u<? super T> f27781U;

    /* renamed from: c */
    final AtomicReference<Disposable> f27782c;

    public C12062k(AtomicReference<Disposable> atomicReference, C11987u<? super T> uVar) {
        this.f27782c = atomicReference;
        this.f27781U = uVar;
    }

    public void onError(Throwable th) {
        this.f27781U.onError(th);
    }

    public void onSubscribe(Disposable disposable) {
        C12010c.m38622a(this.f27782c, disposable);
    }

    public void onSuccess(T t) {
        this.f27781U.onSuccess(t);
    }
}
