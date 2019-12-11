package p520io.reactivex.processors;

import org.reactivestreams.C14312a;
import p520io.reactivex.C11955i;
import p520io.reactivex.Flowable;

/* renamed from: io.reactivex.processors.a */
/* compiled from: FlowableProcessor */
public abstract class C11964a<T> extends Flowable<T> implements C14312a<T, T>, C11955i<T> {
    /* renamed from: j */
    public final C11964a<T> mo30278j() {
        if (this instanceof C11965b) {
            return this;
        }
        return new C11965b(this);
    }
}
