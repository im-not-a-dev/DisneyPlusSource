package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.util.EventDispatcher.Event;

/* renamed from: com.google.android.exoplayer2.drm.g */
/* compiled from: lambda */
public final /* synthetic */ class C8702g implements Event {

    /* renamed from: a */
    public static final /* synthetic */ C8702g f18482a = new C8702g();

    private /* synthetic */ C8702g() {
    }

    /* renamed from: a */
    public final void sendTo(Object obj) {
        ((DefaultDrmSessionEventListener) obj).onDrmKeysLoaded();
    }
}
