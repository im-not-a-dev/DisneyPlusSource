package kotlin.p583f0;

import kotlin.reflect.KProperty;

/* renamed from: kotlin.f0.b */
/* compiled from: ObservableProperty.kt */
public abstract class C12740b<T> implements C12742d<Object, T> {
    private T value;

    public C12740b(T t) {
        this.value = t;
    }

    /* access modifiers changed from: protected */
    public void afterChange(KProperty<?> kProperty, T t, T t2) {
    }

    /* access modifiers changed from: protected */
    public boolean beforeChange(KProperty<?> kProperty, T t, T t2) {
        return true;
    }

    public T getValue(Object obj, KProperty<?> kProperty) {
        return this.value;
    }

    public void setValue(Object obj, KProperty<?> kProperty, T t) {
        T t2 = this.value;
        if (beforeChange(kProperty, t2, t)) {
            this.value = t;
            afterChange(kProperty, t2, t);
        }
    }
}
