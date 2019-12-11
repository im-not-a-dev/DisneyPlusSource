package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.util.EventDispatcher.Event;

/* renamed from: com.google.android.exoplayer2.v0.a */
/* compiled from: lambda */
public final /* synthetic */ class C9527a implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ Event f22229U;

    /* renamed from: c */
    private final /* synthetic */ HandlerAndListener f22230c;

    public /* synthetic */ C9527a(HandlerAndListener bVar, Event aVar) {
        this.f22230c = bVar;
        this.f22229U = aVar;
    }

    public final void run() {
        this.f22230c.mo24652b(this.f22229U);
    }
}
