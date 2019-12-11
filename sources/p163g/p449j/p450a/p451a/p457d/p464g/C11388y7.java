package p163g.p449j.p450a.p451a.p457d.p464g;

import java.io.IOException;
import p163g.p449j.p450a.p451a.p457d.p464g.C11388y7;

/* renamed from: g.j.a.a.d.g.y7 */
public abstract class C11388y7<M extends C11388y7<M>> extends C11099e8 {

    /* renamed from: b */
    protected C11029a8 f26656b = null;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo28250a() {
        if (this.f26656b == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f26656b.mo28284b(); i2++) {
            i += this.f26656b.mo28285b(i2).mo29208a();
        }
        return i;
    }

    /* renamed from: c */
    public final /* synthetic */ C11099e8 mo28492c() throws CloneNotSupportedException {
        return (C11388y7) clone();
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        C11388y7 y7Var = (C11388y7) super.clone();
        C11063c8.m34932a(this, y7Var);
        return y7Var;
    }

    /* renamed from: a */
    public void mo28252a(C11361w7 w7Var) throws IOException {
        if (this.f26656b != null) {
            for (int i = 0; i < this.f26656b.mo28284b(); i++) {
                this.f26656b.mo28285b(i).mo29210a(w7Var);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo29192a(C11318t7 t7Var, int i) throws IOException {
        int a = t7Var.mo29023a();
        if (!t7Var.mo29026a(i)) {
            return false;
        }
        int i2 = i >>> 3;
        C11129g8 g8Var = new C11129g8(i, t7Var.mo29027a(a, t7Var.mo29023a() - a));
        C11401z7 z7Var = null;
        C11029a8 a8Var = this.f26656b;
        if (a8Var == null) {
            this.f26656b = new C11029a8();
        } else {
            z7Var = a8Var.mo28281a(i2);
        }
        if (z7Var == null) {
            z7Var = new C11401z7();
            this.f26656b.mo28282a(i2, z7Var);
        }
        z7Var.mo29209a(g8Var);
        return true;
    }
}
