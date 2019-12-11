package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.C0715i;
import androidx.lifecycle.C0715i.C0717b;

/* renamed from: androidx.savedstate.a */
/* compiled from: SavedStateRegistryController */
public final class C0956a {

    /* renamed from: a */
    private final C0957b f3787a;

    /* renamed from: b */
    private final SavedStateRegistry f3788b = new SavedStateRegistry();

    private C0956a(C0957b bVar) {
        this.f3787a = bVar;
    }

    /* renamed from: a */
    public SavedStateRegistry mo5302a() {
        return this.f3788b;
    }

    /* renamed from: b */
    public void mo5304b(Bundle bundle) {
        this.f3788b.mo5296a(bundle);
    }

    /* renamed from: a */
    public void mo5303a(Bundle bundle) {
        C0715i lifecycle = this.f3787a.getLifecycle();
        if (lifecycle.mo4133a() == C0717b.INITIALIZED) {
            lifecycle.mo4134a(new Recreator(this.f3787a));
            this.f3788b.mo5297a(lifecycle, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    /* renamed from: a */
    public static C0956a m5180a(C0957b bVar) {
        return new C0956a(bVar);
    }
}
