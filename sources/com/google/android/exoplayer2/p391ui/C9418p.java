package com.google.android.exoplayer2.p391ui;

/* renamed from: com.google.android.exoplayer2.ui.p */
/* compiled from: TimeBar */
public interface C9418p {

    /* renamed from: com.google.android.exoplayer2.ui.p$a */
    /* compiled from: TimeBar */
    public interface C9419a {
        /* renamed from: a */
        void mo24404a(C9418p pVar, long j);

        /* renamed from: a */
        void mo24405a(C9418p pVar, long j, boolean z);

        /* renamed from: b */
        void mo24406b(C9418p pVar, long j);
    }

    /* renamed from: a */
    void mo24349a(C9419a aVar);

    /* renamed from: a */
    void mo24350a(long[] jArr, boolean[] zArr, int i);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j);

    void setDuration(long j);

    void setEnabled(boolean z);

    void setPosition(long j);
}
