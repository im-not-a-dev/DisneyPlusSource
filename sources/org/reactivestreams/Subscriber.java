package org.reactivestreams;

public interface Subscriber<T> {
    /* renamed from: a */
    void mo29945a(C14314c cVar);

    void onComplete();

    void onError(Throwable th);

    void onNext(T t);
}
