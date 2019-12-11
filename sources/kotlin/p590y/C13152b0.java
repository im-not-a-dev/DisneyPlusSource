package kotlin.p590y;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlin.y.b0 */
/* compiled from: IndexedValue.kt */
public final class C13152b0<T> {

    /* renamed from: a */
    private final int f29593a;

    /* renamed from: b */
    private final T f29594b;

    public C13152b0(int i, T t) {
        this.f29593a = i;
        this.f29594b = t;
    }

    /* renamed from: a */
    public final int mo34194a() {
        return this.f29593a;
    }

    /* renamed from: b */
    public final T mo34195b() {
        return this.f29594b;
    }

    /* renamed from: c */
    public final int mo34196c() {
        return this.f29593a;
    }

    /* renamed from: d */
    public final T mo34197d() {
        return this.f29594b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C13152b0) {
                C13152b0 b0Var = (C13152b0) obj;
                if (!(this.f29593a == b0Var.f29593a) || !Intrinsics.areEqual((Object) this.f29594b, (Object) b0Var.f29594b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.f29593a * 31;
        T t = this.f29594b;
        return i + (t != null ? t.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IndexedValue(index=");
        sb.append(this.f29593a);
        sb.append(", value=");
        sb.append(this.f29594b);
        sb.append(")");
        return sb.toString();
    }
}
