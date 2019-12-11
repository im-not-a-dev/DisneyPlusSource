package com.bamtechmedia.dominguez.channels.p073tv;

import android.content.Context;
import com.bamtechmedia.dominguez.channels.p073tv.worker.HideChannelsWorker.C3238b;
import com.bamtechmedia.dominguez.channels.p073tv.worker.SyncChannelWorker.C3243c;
import com.bamtechmedia.dominguez.channels.p073tv.worker.SyncPlayNextChannelWorker.C3247b;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.channels.tv.b */
/* compiled from: ChannelManager_Factory */
public final class C3206b implements C11895c<C3204a> {

    /* renamed from: a */
    private final Provider<Context> f8176a;

    /* renamed from: b */
    private final Provider<C3243c> f8177b;

    /* renamed from: c */
    private final Provider<C3247b> f8178c;

    /* renamed from: d */
    private final Provider<C3238b> f8179d;

    public C3206b(Provider<Context> provider, Provider<C3243c> provider2, Provider<C3247b> provider3, Provider<C3238b> provider4) {
        this.f8176a = provider;
        this.f8177b = provider2;
        this.f8178c = provider3;
        this.f8179d = provider4;
    }

    /* renamed from: a */
    public static C3206b m11156a(Provider<Context> provider, Provider<C3243c> provider2, Provider<C3247b> provider3, Provider<C3238b> provider4) {
        return new C3206b(provider, provider2, provider3, provider4);
    }

    public C3204a get() {
        return new C3204a((Context) this.f8176a.get(), (C3243c) this.f8177b.get(), (C3247b) this.f8178c.get(), (C3238b) this.f8179d.get());
    }
}
