package p520io.reactivex;

import p520io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.l */
/* compiled from: MaybeObserver */
public interface C11958l<T> {
    void onComplete();

    void onError(Throwable th);

    void onSubscribe(Disposable disposable);

    void onSuccess(T t);
}
