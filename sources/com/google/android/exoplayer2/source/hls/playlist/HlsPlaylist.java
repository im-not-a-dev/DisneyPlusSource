package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.offline.C8807a;
import java.util.Collections;
import java.util.List;

public abstract class HlsPlaylist implements C8807a<HlsPlaylist> {

    /* renamed from: a */
    public final String f20714a;

    /* renamed from: b */
    public final List<String> f20715b;

    /* renamed from: c */
    public final boolean f20716c;

    protected HlsPlaylist(String str, List<String> list, boolean z) {
        this.f20714a = str;
        this.f20715b = Collections.unmodifiableList(list);
        this.f20716c = z;
    }
}
