package kotlin;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlin.w */
/* compiled from: Lazy.kt */
public final class C13146w<T> implements Lazy<T>, Serializable {

    /* renamed from: U */
    private Object f29588U = C13143t.f29586a;

    /* renamed from: c */
    private Function0<? extends T> f29589c;

    public C13146w(Function0<? extends T> function0) {
        this.f29589c = function0;
    }

    /* renamed from: a */
    public boolean mo34163a() {
        return this.f29588U != C13143t.f29586a;
    }

    public T getValue() {
        if (this.f29588U == C13143t.f29586a) {
            Function0<? extends T> function0 = this.f29589c;
            if (function0 != null) {
                this.f29588U = function0.invoke();
                this.f29589c = null;
            } else {
                Intrinsics.throwNpe();
                throw null;
            }
        }
        return this.f29588U;
    }

    public String toString() {
        return mo34163a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
