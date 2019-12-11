package kotlin.p590y;

import java.util.List;

/* renamed from: kotlin.y.l0 */
/* compiled from: ReversedViews.kt */
final class C13179l0<T> extends C13161e<T> {

    /* renamed from: c */
    private final List<T> f29612c;

    public C13179l0(List<T> list) {
        this.f29612c = list;
    }

    public void add(int i, T t) {
        this.f29612c.add(C13197u.m40552d(this, i), t);
    }

    /* renamed from: b */
    public int mo34237b() {
        return this.f29612c.size();
    }

    public void clear() {
        this.f29612c.clear();
    }

    /* renamed from: f */
    public T mo34238f(int i) {
        return this.f29612c.remove(C13197u.m40551c(this, i));
    }

    public T get(int i) {
        return this.f29612c.get(C13197u.m40551c(this, i));
    }

    public T set(int i, T t) {
        return this.f29612c.set(C13197u.m40551c(this, i), t);
    }
}
