package p520io.reactivex;

import p520io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.q */
/* compiled from: Observer */
public interface C11968q<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(Disposable disposable);
}
