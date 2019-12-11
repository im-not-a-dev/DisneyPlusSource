package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C9068a;
import com.google.android.exoplayer2.source.hls.HlsDataSourceFactory;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.source.hls.playlist.h */
/* compiled from: HlsPlaylistTracker */
public interface C9188h {

    /* renamed from: com.google.android.exoplayer2.source.hls.playlist.h$a */
    /* compiled from: HlsPlaylistTracker */
    public interface C9189a {
        /* renamed from: a */
        C9188h mo23868a(HlsDataSourceFactory hVar, LoadErrorHandlingPolicy zVar, HlsPlaylistParserFactory gVar);
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.playlist.h$b */
    /* compiled from: HlsPlaylistTracker */
    public interface C9190b {
        /* renamed from: a */
        boolean mo23822a(Uri uri, long j);

        /* renamed from: b */
        void mo23823b();
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.playlist.h$c */
    /* compiled from: HlsPlaylistTracker */
    public static final class C9191c extends IOException {
        public C9191c(Uri uri) {
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.playlist.h$d */
    /* compiled from: HlsPlaylistTracker */
    public static final class C9192d extends IOException {
        public C9192d(Uri uri) {
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.playlist.h$e */
    /* compiled from: HlsPlaylistTracker */
    public interface C9193e {
        /* renamed from: a */
        void mo23783a(HlsMediaPlaylist hlsMediaPlaylist);
    }

    /* renamed from: a */
    long mo23871a();

    /* renamed from: a */
    HlsMediaPlaylist mo23872a(Uri uri, boolean z);

    /* renamed from: a */
    void mo23874a(Uri uri, C9068a aVar, C9193e eVar);

    /* renamed from: a */
    void mo23875a(C9190b bVar);

    /* renamed from: a */
    boolean mo23878a(Uri uri);

    /* renamed from: b */
    C9182e mo23879b();

    /* renamed from: b */
    void mo23880b(Uri uri) throws IOException;

    /* renamed from: b */
    void mo23881b(C9190b bVar);

    /* renamed from: c */
    void mo23882c(Uri uri);

    /* renamed from: c */
    boolean mo23883c();

    /* renamed from: d */
    void mo23884d() throws IOException;

    void stop();
}
