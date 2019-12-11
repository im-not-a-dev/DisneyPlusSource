package p520io.reactivex.p531y.p532a;

import p520io.reactivex.C11958l;
import p520io.reactivex.C11968q;
import p520io.reactivex.C11987u;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.p531y.p534c.C12046i;

/* renamed from: io.reactivex.y.a.d */
/* compiled from: EmptyDisposable */
public enum C12011d implements C12046i<Object> {
    INSTANCE,
    NEVER;

    /* renamed from: a */
    public static void m38628a(C11968q<?> qVar) {
        qVar.onSubscribe(INSTANCE);
        qVar.onComplete();
    }

    /* renamed from: a */
    public int mo30285a(int i) {
        return i & 2;
    }

    public void clear() {
    }

    public void dispose() {
    }

    public boolean isDisposed() {
        return this == INSTANCE;
    }

    public boolean isEmpty() {
        return true;
    }

    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public Object poll() throws Exception {
        return null;
    }

    /* renamed from: a */
    public static void m38627a(C11958l<?> lVar) {
        lVar.onSubscribe(INSTANCE);
        lVar.onComplete();
    }

    /* renamed from: a */
    public static void m38631a(Throwable th, C11968q<?> qVar) {
        qVar.onSubscribe(INSTANCE);
        qVar.onError(th);
    }

    /* renamed from: a */
    public static void m38626a(CompletableObserver completableObserver) {
        completableObserver.onSubscribe(INSTANCE);
        completableObserver.onComplete();
    }

    /* renamed from: a */
    public static void m38629a(Throwable th, CompletableObserver completableObserver) {
        completableObserver.onSubscribe(INSTANCE);
        completableObserver.onError(th);
    }

    /* renamed from: a */
    public static void m38632a(Throwable th, C11987u<?> uVar) {
        uVar.onSubscribe(INSTANCE);
        uVar.onError(th);
    }

    /* renamed from: a */
    public static void m38630a(Throwable th, C11958l<?> lVar) {
        lVar.onSubscribe(INSTANCE);
        lVar.onError(th);
    }
}
