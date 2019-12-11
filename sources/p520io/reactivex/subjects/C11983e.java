package p520io.reactivex.subjects;

import p520io.reactivex.C11968q;
import p520io.reactivex.Observable;

/* renamed from: io.reactivex.subjects.e */
/* compiled from: Subject */
public abstract class C11983e<T> extends Observable<T> implements C11968q<T> {
    /* renamed from: n */
    public final C11983e<T> mo30320n() {
        if (this instanceof C11980c) {
            return this;
        }
        return new C11980c(this);
    }
}
