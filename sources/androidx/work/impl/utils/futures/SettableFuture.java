package androidx.work.impl.utils.futures;

import com.google.common.util.concurrent.ListenableFuture;

public final class SettableFuture<V> extends C1140a<V> {
    private SettableFuture() {
    }

    /* renamed from: d */
    public static <V> SettableFuture<V> m5920d() {
        return new SettableFuture<>();
    }

    /* renamed from: a */
    public boolean mo5910a(V v) {
        return super.mo5910a(v);
    }

    /* renamed from: a */
    public boolean mo5911a(Throwable th) {
        return super.mo5911a(th);
    }

    /* renamed from: a */
    public boolean mo5909a(ListenableFuture<? extends V> listenableFuture) {
        return super.mo5909a(listenableFuture);
    }
}
