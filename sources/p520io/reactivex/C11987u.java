package p520io.reactivex;

import p520io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.u */
/* compiled from: SingleObserver */
public interface C11987u<T> {
    void onError(Throwable th);

    void onSubscribe(Disposable disposable);

    void onSuccess(T t);
}
