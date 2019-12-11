package p096e.p121h.p134r;

/* renamed from: e.h.r.h */
/* compiled from: Pools */
public class C4116h<T> extends C4115g<T> {

    /* renamed from: c */
    private final Object f10391c = new Object();

    public C4116h(int i) {
        super(i);
    }

    /* renamed from: a */
    public T mo14666a() {
        T a;
        synchronized (this.f10391c) {
            a = super.mo14666a();
        }
        return a;
    }

    /* renamed from: a */
    public boolean mo14667a(T t) {
        boolean a;
        synchronized (this.f10391c) {
            a = super.mo14667a(t);
        }
        return a;
    }
}
