package p163g.p164a.p165a;

import java.util.HashMap;

/* renamed from: g.a.a.n */
/* compiled from: ContextData */
final class C4713n {

    /* renamed from: a */
    protected Object f11719a = null;

    /* renamed from: b */
    protected HashMap<String, Object> f11720b = new HashMap<>();

    C4713n() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo16052a(String str) {
        return this.f11720b.containsKey(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C4713n mo16053b(String str) {
        return (C4713n) this.f11720b.get(str);
    }

    public synchronized String toString() {
        StringBuilder sb;
        String str = "";
        if (this.f11719a != null) {
            str = this.f11719a.toString();
        }
        sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16051a(String str, C4713n nVar) {
        this.f11720b.put(str, nVar);
    }
}
