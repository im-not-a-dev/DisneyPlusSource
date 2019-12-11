package p520io.reactivex;

import p520io.reactivex.functions.C11950f;

/* renamed from: io.reactivex.CompletableEmitter */
public interface CompletableEmitter {
    /* renamed from: a */
    void mo30057a(C11950f fVar);

    boolean isDisposed();

    void onComplete();

    void onError(Throwable th);
}
