package com.google.android.exoplayer2.source.smoothstreaming;

import com.google.android.exoplayer2.source.p379m0.C9220h;
import com.google.android.exoplayer2.source.smoothstreaming.p380e.C9245a;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.TransferListener;

/* renamed from: com.google.android.exoplayer2.source.smoothstreaming.c */
/* compiled from: SsChunkSource */
public interface C9242c extends C9220h {

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.c$a */
    /* compiled from: SsChunkSource */
    public interface C9243a {
        /* renamed from: a */
        C9242c mo23979a(LoaderErrorThrower b0Var, C9245a aVar, int i, TrackSelection jVar, TransferListener transferListener);
    }

    /* renamed from: a */
    void mo23977a(C9245a aVar);

    /* renamed from: a */
    void mo23978a(TrackSelection jVar);
}
