package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Timeline.C8669b;
import com.google.android.exoplayer2.Timeline.C8670c;

/* renamed from: com.google.android.exoplayer2.source.x */
/* compiled from: ForwardingTimeline */
public abstract class C9263x extends Timeline {

    /* renamed from: b */
    protected final Timeline f21068b;

    public C9263x(Timeline timeline) {
        this.f21068b = timeline;
    }

    /* renamed from: a */
    public int mo22657a(boolean z) {
        return this.f21068b.mo22657a(z);
    }

    /* renamed from: b */
    public int mo22667b() {
        return this.f21068b.mo22667b();
    }

    /* renamed from: a */
    public C8670c mo22665a(int i, C8670c cVar, boolean z, long j) {
        return this.f21068b.mo22665a(i, cVar, z, j);
    }

    /* renamed from: b */
    public int mo22669b(boolean z) {
        return this.f21068b.mo22669b(z);
    }

    /* renamed from: a */
    public int mo22653a() {
        return this.f21068b.mo22653a();
    }

    /* renamed from: a */
    public C8669b mo22661a(int i, C8669b bVar, boolean z) {
        return this.f21068b.mo22661a(i, bVar, z);
    }

    /* renamed from: a */
    public int mo22656a(Object obj) {
        return this.f21068b.mo22656a(obj);
    }

    /* renamed from: a */
    public Object mo22666a(int i) {
        return this.f21068b.mo22666a(i);
    }
}
