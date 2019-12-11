package com.google.firebase.iid;

import android.os.Bundle;

/* renamed from: com.google.firebase.iid.e */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
final class C10468e extends C10475h<Void> {
    C10468e(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27299a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            mo27311a(null);
        } else {
            mo27310a(new C10473g(4, "Invalid response to one way request"));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo27300a() {
        return true;
    }
}
