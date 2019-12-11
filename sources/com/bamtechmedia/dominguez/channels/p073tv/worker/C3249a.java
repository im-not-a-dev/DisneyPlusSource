package com.bamtechmedia.dominguez.channels.p073tv.worker;

import androidx.work.WorkManager;
import com.bamtechmedia.dominguez.channels.p073tv.worker.HideChannelsWorker.C3238b;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.channels.tv.worker.a */
/* compiled from: HideChannelsWorker_Helper_Factory */
public final class C3249a implements C11895c<C3238b> {

    /* renamed from: a */
    private final Provider<WorkManager> f8257a;

    public C3249a(Provider<WorkManager> provider) {
        this.f8257a = provider;
    }

    /* renamed from: a */
    public static C3249a m11251a(Provider<WorkManager> provider) {
        return new C3249a(provider);
    }

    public C3238b get() {
        return new C3238b(this.f8257a);
    }
}
