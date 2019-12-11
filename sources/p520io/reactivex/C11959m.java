package p520io.reactivex;

import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p547j.C12551j;

/* renamed from: io.reactivex.m */
/* compiled from: Notification */
public final class C11959m<T> {

    /* renamed from: b */
    static final C11959m<Object> f27627b = new C11959m<>(null);

    /* renamed from: a */
    final Object f27628a;

    private C11959m(Object obj) {
        this.f27628a = obj;
    }

    /* renamed from: b */
    public static <T> C11959m<T> m38516b() {
        return f27627b;
    }

    /* renamed from: a */
    public Throwable mo30266a() {
        Object obj = this.f27628a;
        if (C12551j.m39367d(obj)) {
            return C12551j.m39361a(obj);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11959m)) {
            return false;
        }
        return C12036b.m38664a(this.f27628a, ((C11959m) obj).f27628a);
    }

    public int hashCode() {
        Object obj = this.f27628a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        Object obj = this.f27628a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        String str = "]";
        if (C12551j.m39367d(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("OnErrorNotification[");
            sb.append(C12551j.m39361a(obj));
            sb.append(str);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("OnNextNotification[");
        sb2.append(this.f27628a);
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: a */
    public static <T> C11959m<T> m38514a(T t) {
        C12036b.m38663a(t, "value is null");
        return new C11959m<>(t);
    }

    /* renamed from: a */
    public static <T> C11959m<T> m38515a(Throwable th) {
        C12036b.m38663a(th, "error is null");
        return new C11959m<>(C12551j.m39359a(th));
    }
}
