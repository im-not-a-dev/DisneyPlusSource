package kotlin;

import java.io.Serializable;

/* renamed from: kotlin.e */
/* compiled from: Lazy.kt */
public final class C12733e<T> implements Lazy<T>, Serializable {

    /* renamed from: c */
    private final T f29406c;

    public C12733e(T t) {
        this.f29406c = t;
    }

    public T getValue() {
        return this.f29406c;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
