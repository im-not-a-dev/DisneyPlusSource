package kotlinx.coroutines.internal;

import kotlin.C13142s;

/* renamed from: kotlinx.coroutines.internal.a */
/* compiled from: ArrayQueue.kt */
public class C13253a<T> {

    /* renamed from: a */
    private Object[] f29677a = new Object[16];

    /* renamed from: b */
    private int f29678b;

    /* renamed from: c */
    private int f29679c;

    /* renamed from: c */
    private final void m40736c() {
        Object[] objArr = this.f29677a;
        int length = objArr.length;
        Object[] objArr2 = new Object[(length << 1)];
        Object[] objArr3 = objArr2;
        C13171j.m40343a(objArr, objArr3, 0, this.f29678b, 0, 10, null);
        Object[] objArr4 = this.f29677a;
        int length2 = objArr4.length;
        int i = this.f29678b;
        C13171j.m40343a(objArr4, objArr2, length2 - i, 0, i, 4, null);
        this.f29677a = objArr3;
        this.f29678b = 0;
        this.f29679c = length;
    }

    /* renamed from: a */
    public final boolean mo34404a() {
        return this.f29678b == this.f29679c;
    }

    /* renamed from: b */
    public final T mo34405b() {
        int i = this.f29678b;
        if (i == this.f29679c) {
            return null;
        }
        T[] tArr = this.f29677a;
        T t = tArr[i];
        tArr[i] = null;
        this.f29678b = (i + 1) & (tArr.length - 1);
        if (t != null) {
            return t;
        }
        throw new C13142s("null cannot be cast to non-null type T");
    }

    /* renamed from: a */
    public final void mo34403a(T t) {
        Object[] objArr = this.f29677a;
        int i = this.f29679c;
        objArr[i] = t;
        this.f29679c = (objArr.length - 1) & (i + 1);
        if (this.f29679c == this.f29678b) {
            m40736c();
        }
    }
}
