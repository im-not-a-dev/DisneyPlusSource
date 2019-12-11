package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.offline.C8808b;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.upstream.ParsingLoadable.Parser;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.source.hls.playlist.d */
/* compiled from: FilteringHlsPlaylistParserFactory */
public final class C9181d implements HlsPlaylistParserFactory {

    /* renamed from: a */
    private final HlsPlaylistParserFactory f20746a;

    /* renamed from: b */
    private final List<StreamKey> f20747b;

    public C9181d(HlsPlaylistParserFactory gVar, List<StreamKey> list) {
        this.f20746a = gVar;
        this.f20747b = list;
    }

    /* renamed from: a */
    public Parser<HlsPlaylist> mo23869a() {
        return new C8808b(this.f20746a.mo23869a(), this.f20747b);
    }

    /* renamed from: a */
    public Parser<HlsPlaylist> mo23870a(C9182e eVar) {
        return new C8808b(this.f20746a.mo23870a(eVar), this.f20747b);
    }
}
