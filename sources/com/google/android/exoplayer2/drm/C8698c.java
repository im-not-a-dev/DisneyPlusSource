package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DefaultDrmSessionManager.C8690d;
import com.google.android.exoplayer2.util.EventDispatcher.Event;

/* renamed from: com.google.android.exoplayer2.drm.c */
/* compiled from: lambda */
public final /* synthetic */ class C8698c implements Event {

    /* renamed from: a */
    private final /* synthetic */ C8690d f18477a;

    public /* synthetic */ C8698c(C8690d dVar) {
        this.f18477a = dVar;
    }

    /* renamed from: a */
    public final void sendTo(Object obj) {
        ((DefaultDrmSessionEventListener) obj).onDrmSessionManagerError(this.f18477a);
    }
}
