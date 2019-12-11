package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.dash.C9110j.C9113c;
import com.google.android.exoplayer2.source.dash.p376k.C9115b;
import com.google.android.exoplayer2.source.p379m0.C9220h;
import com.google.android.exoplayer2.trackselection.C9311j;
import com.google.android.exoplayer2.upstream.C9452b0;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.source.dash.c */
/* compiled from: DashChunkSource */
public interface C9098c extends C9220h {

    /* renamed from: com.google.android.exoplayer2.source.dash.c$a */
    /* compiled from: DashChunkSource */
    public interface C9099a {
        /* renamed from: a */
        C9098c mo23629a(C9452b0 b0Var, C9115b bVar, int i, int[] iArr, C9311j jVar, int i2, long j, boolean z, List<Format> list, C9113c cVar, TransferListener transferListener);
    }

    /* renamed from: a */
    void mo23627a(C9115b bVar, int i);

    /* renamed from: a */
    void mo23628a(C9311j jVar);
}
