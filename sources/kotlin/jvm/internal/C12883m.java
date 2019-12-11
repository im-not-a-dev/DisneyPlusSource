package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KMutableProperty1.Setter;
import kotlin.reflect.KProperty1.Getter;

/* renamed from: kotlin.jvm.internal.m */
/* compiled from: MutablePropertyReference1 */
public abstract class C12883m extends C12886p implements KMutableProperty1 {
    /* access modifiers changed from: protected */
    public KCallable computeReflected() {
        return C12895y.m40233a(this);
    }

    public Object getDelegate(Object obj) {
        return ((KMutableProperty1) getReflected()).getDelegate(obj);
    }

    public Object invoke(Object obj) {
        return get(obj);
    }

    public Getter getGetter() {
        return ((KMutableProperty1) getReflected()).getGetter();
    }

    public Setter getSetter() {
        return ((KMutableProperty1) getReflected()).getSetter();
    }
}
