package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.util.EventDispatcher.Event;

/* renamed from: com.google.android.exoplayer2.drm.b */
/* compiled from: lambda */
public final /* synthetic */ class C8697b implements Event {

    /* renamed from: a */
    private final /* synthetic */ Exception f18476a;

    public /* synthetic */ C8697b(Exception exc) {
        this.f18476a = exc;
    }

    /* renamed from: a */
    public final void sendTo(Object obj) {
        ((DefaultDrmSessionEventListener) obj).onDrmSessionManagerError(this.f18476a);
    }
}
