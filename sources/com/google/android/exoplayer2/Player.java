package com.google.android.exoplayer2;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.p382u0.C9332k;
import com.google.android.exoplayer2.p394w0.C9597n;
import com.google.android.exoplayer2.p394w0.C9602q;
import com.google.android.exoplayer2.p394w0.p395s.C9605a;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;

public interface Player {

    public interface AudioComponent {
    }

    public interface EventListener {
        /* renamed from: a */
        void mo7578a(boolean z);

        void onLoadingChanged(boolean z);

        void onPlaybackParametersChanged(PlaybackParameters playbackParameters);

        void onPlayerError(ExoPlaybackException exoPlaybackException);

        void onPlayerStateChanged(boolean z, int i);

        void onPositionDiscontinuity(int i);

        void onRepeatModeChanged(int i);

        void onSeekProcessed();

        void onShuffleModeEnabledChanged(boolean z);

        void onTimelineChanged(Timeline timeline, Object obj, int i);

        void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray);
    }

    public interface MetadataComponent {
    }

    public interface TextComponent {
        /* renamed from: a */
        void mo22620a(C9332k kVar);

        /* renamed from: b */
        void mo22621b(C9332k kVar);
    }

    public interface VideoComponent {
        /* renamed from: a */
        void mo22622a(Surface surface);

        /* renamed from: a */
        void mo22623a(SurfaceView surfaceView);

        /* renamed from: a */
        void mo22624a(TextureView textureView);

        /* renamed from: a */
        void mo22625a(C9597n nVar);

        /* renamed from: a */
        void mo22626a(C9602q qVar);

        /* renamed from: a */
        void mo22627a(C9605a aVar);

        /* renamed from: b */
        void mo22628b(Surface surface);

        /* renamed from: b */
        void mo22629b(SurfaceView surfaceView);

        /* renamed from: b */
        void mo22630b(TextureView textureView);

        /* renamed from: b */
        void mo22631b(C9597n nVar);

        /* renamed from: b */
        void mo22632b(C9602q qVar);

        /* renamed from: b */
        void mo22633b(C9605a aVar);
    }

    /* renamed from: a */
    boolean mo22618a();

    void addListener(EventListener eventListener);

    /* renamed from: b */
    int mo22619b();

    Looper getApplicationLooper();

    long getBufferedPosition();

    long getContentBufferedPosition();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    long getCurrentPosition();

    Timeline getCurrentTimeline();

    TrackGroupArray getCurrentTrackGroups();

    TrackSelectionArray getCurrentTrackSelections();

    int getCurrentWindowIndex();

    long getDuration();

    int getNextWindowIndex();

    boolean getPlayWhenReady();

    ExoPlaybackException getPlaybackError();

    PlaybackParameters getPlaybackParameters();

    int getPlaybackState();

    int getPreviousWindowIndex();

    int getRendererType(int i);

    int getRepeatMode();

    boolean getShuffleModeEnabled();

    TextComponent getTextComponent();

    long getTotalBufferedDuration();

    VideoComponent getVideoComponent();

    boolean hasNext();

    boolean hasPrevious();

    boolean isCurrentWindowDynamic();

    boolean isCurrentWindowSeekable();

    boolean isPlayingAd();

    void removeListener(EventListener eventListener);

    void seekTo(int i, long j);

    void setPlayWhenReady(boolean z);

    void setRepeatMode(int i);

    void setShuffleModeEnabled(boolean z);

    void stop();

    void stop(boolean z);
}
