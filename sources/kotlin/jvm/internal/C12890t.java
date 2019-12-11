package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty1.Getter;

/* renamed from: kotlin.jvm.internal.t */
/* compiled from: PropertyReference1 */
public abstract class C12890t extends C12893w implements KProperty1 {
    public C12890t() {
    }

    /* access modifiers changed from: protected */
    public KCallable computeReflected() {
        return C12895y.m40235a(this);
    }

    public Object getDelegate(Object obj) {
        return ((KProperty1) getReflected()).getDelegate(obj);
    }

    public Object invoke(Object obj) {
        return get(obj);
    }

    public C12890t(Object obj) {
        super(obj);
    }

    public Getter getGetter() {
        return ((KProperty1) getReflected()).getGetter();
    }
}
