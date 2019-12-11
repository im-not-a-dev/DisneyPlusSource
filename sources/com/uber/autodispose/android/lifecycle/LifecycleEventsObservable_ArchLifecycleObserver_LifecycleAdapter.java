package com.uber.autodispose.android.lifecycle;

import androidx.lifecycle.C0713g;
import androidx.lifecycle.C0715i.C0716a;
import androidx.lifecycle.C0722m;
import androidx.lifecycle.C0729r;

public class LifecycleEventsObservable_ArchLifecycleObserver_LifecycleAdapter implements C0713g {

    /* renamed from: a */
    final ArchLifecycleObserver f24979a;

    LifecycleEventsObservable_ArchLifecycleObserver_LifecycleAdapter(ArchLifecycleObserver archLifecycleObserver) {
        this.f24979a = archLifecycleObserver;
    }

    /* renamed from: a */
    public void mo4132a(C0722m mVar, C0716a aVar, boolean z, C0729r rVar) {
        boolean z2 = rVar != null;
        if (!z) {
            return;
        }
        if (!z2 || rVar.mo4148a("onStateChange", 4)) {
            this.f24979a.onStateChange(mVar, aVar);
        }
    }
}
