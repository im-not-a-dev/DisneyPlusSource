package p163g.p449j.p450a.p451a.p457d.p464g;

import java.io.IOException;

/* renamed from: g.j.a.a.d.g.w6 */
abstract class C11360w6<T, B> {
    C11360w6() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract B mo29098a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo29099a(Object obj);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo29100a(B b, int i, int i2);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo29101a(B b, int i, long j);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo29102a(B b, int i, C11342v2 v2Var);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo29103a(B b, int i, T t);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo29104a(T t, C11333u7 u7Var) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo29105a(Object obj, T t);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo29106a(C11097e6 e6Var);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo29107a(B b, C11097e6 e6Var) throws IOException {
        int a = e6Var.mo28449a();
        int i = a >>> 3;
        int i2 = a & 7;
        if (i2 == 0) {
            mo29101a(b, i, e6Var.mo28477m());
            return true;
        } else if (i2 == 1) {
            mo29109b(b, i, e6Var.mo28465g());
            return true;
        } else if (i2 == 2) {
            mo29102a(b, i, e6Var.mo28487r());
            return true;
        } else if (i2 == 3) {
            Object a2 = mo29098a();
            int i3 = 4 | (i << 3);
            while (e6Var.mo28483p() != Integer.MAX_VALUE) {
                if (!mo29107a((B) a2, e6Var)) {
                    break;
                }
            }
            if (i3 == e6Var.mo28449a()) {
                mo29103a(b, i, (T) mo29108b(a2));
                return true;
            }
            throw C11258p4.m35934e();
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                mo29100a(b, i, e6Var.mo28459d());
                return true;
            }
            throw C11258p4.m35935f();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract T mo29108b(B b);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo29109b(B b, int i, long j);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo29110b(T t, C11333u7 u7Var) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo29111b(Object obj, B b);

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract int mo29112c(T t);

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract T mo29113c(T t, T t2);

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public abstract T mo29114d(Object obj);

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public abstract B mo29115e(Object obj);

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public abstract int mo29116f(T t);
}
