package kotlinx.coroutines.p592j2;

import kotlinx.coroutines.C13292j0;

/* renamed from: kotlinx.coroutines.j2.g */
/* compiled from: AbstractChannel.kt */
public final class C13307g<E> extends C13320p implements C13319o<E> {

    /* renamed from: W */
    public final Throwable f29752W;

    public C13307g(Throwable th) {
        this.f29752W = th;
    }

    /* renamed from: a */
    public Object mo34481a(E e, Object obj) {
        return C13300b.f29745d;
    }

    /* renamed from: b */
    public void mo34495b(Object obj) {
        if (C13292j0.m40863a()) {
            if (!(obj == C13300b.f29745d)) {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: c */
    public C13307g<E> m40911c() {
        return this;
    }

    /* renamed from: m */
    public C13307g<E> m40913m() {
        return this;
    }

    /* renamed from: n */
    public final Throwable mo34499n() {
        Throwable th = this.f29752W;
        return th != null ? th : new C13308h("Channel was closed");
    }

    /* renamed from: o */
    public final Throwable mo34500o() {
        Throwable th = this.f29752W;
        return th != null ? th : new C13309i("Channel was closed");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Closed[");
        sb.append(this.f29752W);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: a */
    public void mo34482a(Object obj) {
        if (C13292j0.m40863a()) {
            if (!(obj == C13300b.f29745d)) {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: c */
    public Object mo34496c(Object obj) {
        return C13300b.f29745d;
    }
}
