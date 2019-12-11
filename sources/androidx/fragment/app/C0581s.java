package androidx.fragment.app;

import androidx.lifecycle.C0715i;
import androidx.lifecycle.C0715i.C0716a;
import androidx.lifecycle.C0722m;
import androidx.lifecycle.C0723n;

/* renamed from: androidx.fragment.app.s */
/* compiled from: FragmentViewLifecycleOwner */
class C0581s implements C0722m {

    /* renamed from: c */
    private C0723n f2524c = null;

    C0581s() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3363a(C0716a aVar) {
        this.f2524c.mo4139a(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo3364c() {
        if (this.f2524c == null) {
            this.f2524c = new C0723n(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo3365d() {
        return this.f2524c != null;
    }

    public C0715i getLifecycle() {
        mo3364c();
        return this.f2524c;
    }
}
