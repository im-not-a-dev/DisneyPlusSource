package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty0.Getter;

/* renamed from: kotlin.jvm.internal.r */
/* compiled from: PropertyReference0 */
public abstract class C12888r extends C12893w implements KProperty0 {
    /* access modifiers changed from: protected */
    public KCallable computeReflected() {
        return C12895y.m40234a(this);
    }

    public Object getDelegate() {
        return ((KProperty0) getReflected()).getDelegate();
    }

    public Object invoke() {
        return get();
    }

    public Getter getGetter() {
        return ((KProperty0) getReflected()).getGetter();
    }
}
