package com.bamtechmedia.dominguez.channels.p073tv.worker;

import androidx.work.WorkManager;
import com.bamtechmedia.dominguez.channels.p073tv.worker.SyncChannelWorker.C3243c;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.channels.tv.worker.b */
/* compiled from: SyncChannelWorker_Helper_Factory */
public final class C3250b implements C11895c<C3243c> {

    /* renamed from: a */
    private final Provider<WorkManager> f8258a;

    public C3250b(Provider<WorkManager> provider) {
        this.f8258a = provider;
    }

    /* renamed from: a */
    public static C3250b m11252a(Provider<WorkManager> provider) {
        return new C3250b(provider);
    }

    public C3243c get() {
        return new C3243c(this.f8258a);
    }
}
