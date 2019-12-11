package p161f.p162a;

import com.appboy.p033s.C1557c;

/* renamed from: f.a.q2 */
public abstract class C4557q2<T> {

    /* renamed from: c */
    private static final String f11343c = C1557c.m7461a(C4557q2.class);

    /* renamed from: a */
    private final Object f11344a = new Object();

    /* renamed from: b */
    private boolean f11345b = false;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract T mo15591a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo15595a(T t, boolean z);

    /* renamed from: b */
    public T mo15793b() {
        synchronized (this.f11344a) {
            if (this.f11345b) {
                C1557c.m7460a(f11343c, "Received call to export dirty object, but the cache was already locked.", false);
                return null;
            }
            this.f11345b = true;
            T a = mo15591a();
            return a;
        }
    }

    /* renamed from: c */
    public boolean mo15795c() {
        boolean z;
        synchronized (this.f11344a) {
            z = this.f11345b;
        }
        return z;
    }

    /* renamed from: b */
    public boolean mo15794b(T t, boolean z) {
        synchronized (this.f11344a) {
            if (!this.f11345b) {
                String str = f11343c;
                StringBuilder sb = new StringBuilder();
                sb.append("Tried to confirm outboundObject [");
                sb.append(t);
                sb.append("] with success [");
                sb.append(z);
                sb.append("], but the cache wasn't locked, so not doing anything.");
                C1557c.m7473e(str, sb.toString());
                return false;
            }
            mo15595a(t, z);
            this.f11345b = false;
            synchronized (this) {
                C1557c.m7468b(f11343c, "Notifying confirmAndUnlock listeners", false);
                notifyAll();
            }
            return true;
        }
    }
}
