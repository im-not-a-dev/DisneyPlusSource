package kotlin;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;

/* renamed from: kotlin.q */
/* compiled from: LazyJVM.kt */
final class C12906q<T> implements Lazy<T>, Serializable {

    /* renamed from: U */
    private volatile Object f29545U;

    /* renamed from: V */
    private final Object f29546V;

    /* renamed from: c */
    private Function0<? extends T> f29547c;

    public C12906q(Function0<? extends T> function0, Object obj) {
        this.f29547c = function0;
        this.f29545U = C13143t.f29586a;
        if (obj == 0) {
            obj = this;
        }
        this.f29546V = obj;
    }

    /* renamed from: a */
    public boolean mo31245a() {
        return this.f29545U != C13143t.f29586a;
    }

    public T getValue() {
        T t;
        T t2 = this.f29545U;
        if (t2 != C13143t.f29586a) {
            return t2;
        }
        synchronized (this.f29546V) {
            t = this.f29545U;
            if (t == C13143t.f29586a) {
                Function0<? extends T> function0 = this.f29547c;
                if (function0 != null) {
                    t = function0.invoke();
                    this.f29545U = t;
                    this.f29547c = null;
                } else {
                    C12880j.m40220a();
                    throw null;
                }
            }
        }
        return t;
    }

    public String toString() {
        return mo31245a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ C12906q(Function0 function0, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            obj = null;
        }
        this(function0, obj);
    }
}
