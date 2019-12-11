package com.bamtechmedia.dominguez.channels.p073tv.worker;

import androidx.work.WorkManager;
import com.bamtechmedia.dominguez.channels.p073tv.worker.SyncPlayNextChannelWorker.C3247b;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.channels.tv.worker.d */
/* compiled from: SyncPlayNextChannelWorker_Helper_Factory */
public final class C3252d implements C11895c<C3247b> {

    /* renamed from: a */
    private final Provider<WorkManager> f8259a;

    public C3252d(Provider<WorkManager> provider) {
        this.f8259a = provider;
    }

    /* renamed from: a */
    public static C3252d m11253a(Provider<WorkManager> provider) {
        return new C3252d(provider);
    }

    public C3247b get() {
        return new C3247b(this.f8259a);
    }
}
