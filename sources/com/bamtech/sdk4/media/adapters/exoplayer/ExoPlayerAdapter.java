package com.bamtech.sdk4.media.adapters.exoplayer;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.bamtech.sdk4.internal.configuration.NetworkConfigurationProvider;
import com.bamtech.sdk4.internal.configuration.PlaylistType;
import com.bamtech.sdk4.internal.media.CachedMediaItemPlaylist;
import com.bamtech.sdk4.internal.media.adapters.exoplayer.BamHttpDataSourceFactory;
import com.bamtech.sdk4.internal.media.adapters.exoplayer.ExoPlayerAnalyticsListener;
import com.bamtech.sdk4.internal.media.adapters.exoplayer.ExoPlayerListener;
import com.bamtech.sdk4.internal.media.adapters.exoplayer.HlsSourceEventListener;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.MediaItem;
import com.bamtech.sdk4.media.MediaItemPlaylist;
import com.bamtech.sdk4.media.PlaybackContext;
import com.bamtech.sdk4.media.QOSNetworkHelper;
import com.bamtech.sdk4.media.adapters.AbstractPlayerAdapter;
import com.bamtech.sdk4.media.adapters.AbstractPlayerAdapter.QosMetadata;
import com.bamtech.sdk4.media.adapters.PlaybackMetrics;
import com.bamtech.sdk4.media.drm.DrmProvider;
import com.bamtech.sdk4.media.drm.PlayReadyDrmProvider;
import com.bamtech.sdk4.media.drm.SilkDrmProvider;
import com.bamtech.sdk4.media.drm.WidevineDrmProvider;
import com.google.android.exoplayer2.C8802o0;
import com.google.android.exoplayer2.C8883r;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player.EventListener;
import com.google.android.exoplayer2.Player.TextComponent;
import com.google.android.exoplayer2.Player.VideoComponent;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.p363r0.p365b.C8897b;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.hls.C9162h;
import com.google.android.exoplayer2.source.hls.HlsExtractorFactory;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.hls.playlist.C9178b;
import com.google.android.exoplayer2.source.hls.playlist.C9187g;
import com.google.android.exoplayer2.trackselection.C9311j;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.C9517t;
import com.google.android.exoplayer2.upstream.C9524z;
import com.google.android.exoplayer2.upstream.DataSource.C9435a;
import com.google.android.exoplayer2.upstream.HttpDataSource.Factory;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.upstream.cache.C9465e;
import java.util.Iterator;
import java.util.UUID;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import okhttp3.CacheControl;
import okhttp3.OkHttpClient;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000¸\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 ©\u00012\u00020\u00012\u00020\u0002:\u0006¨\u0001©\u0001ª\u0001B=\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0002\u0010\rB\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0011J\u0019\u00104\u001a\u0002052\u000e\u00106\u001a\n 8*\u0004\u0018\u00010707H\u0001J\r\u00109\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010:J\b\u0010;\u001a\u0004\u0018\u00010#JH\u0010<\u001a\u00020528\u00106\u001a(\u0012\f\u0012\n 8*\u0004\u0018\u00010>0> 8*\u0014\u0012\u000e\b\u0001\u0012\n 8*\u0004\u0018\u00010>0>\u0018\u00010=0=\"\n 8*\u0004\u0018\u00010>0>H\u0001¢\u0006\u0002\u0010?J\b\u0010@\u001a\u000205H\u0016J>\u0010A\u001a\u0002052\n\b\u0002\u0010B\u001a\u0004\u0018\u00010C2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010E2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010E2\b\u0010G\u001a\u0004\u0018\u00010#2\u0006\u0010H\u001a\u00020\tH\u0002J!\u0010I\u001a\n 8*\u0004\u0018\u00010J0J2\u000e\u00106\u001a\n 8*\u0004\u0018\u00010K0KH\u0001J\u0011\u0010L\u001a\n 8*\u0004\u0018\u00010M0MH\u0001J\u000b\u0010N\u001a\u0004\u0018\u00010OH\u0001J\t\u0010P\u001a\u00020\u000bH\u0001J\t\u0010Q\u001a\u00020RH\u0001J\u0010\u0010S\u001a\u00020\u001e2\u0006\u0010T\u001a\u00020UH\u0002J\t\u0010V\u001a\u00020RH\u0001J\t\u0010W\u001a\u00020RH\u0001J\t\u0010X\u001a\u00020RH\u0001J\t\u0010Y\u001a\u00020\u000bH\u0001J\t\u0010Z\u001a\u00020\u000bH\u0001J\u000b\u0010[\u001a\u0004\u0018\u00010\\H\u0001J\t\u0010]\u001a\u00020\u000bH\u0001J\t\u0010^\u001a\u00020RH\u0001J\u000b\u0010_\u001a\u0004\u0018\u00010\\H\u0001J\u0011\u0010`\u001a\n 8*\u0004\u0018\u00010a0aH\u0001J\u0011\u0010b\u001a\n 8*\u0004\u0018\u00010c0cH\u0001J\u0011\u0010d\u001a\n 8*\u0004\u0018\u00010e0eH\u0001J\t\u0010f\u001a\u00020\u000bH\u0001J\t\u0010g\u001a\u00020RH\u0001J\u000b\u0010h\u001a\u0004\u0018\u00010iH\u0001J\t\u0010j\u001a\u00020\u000bH\u0001J$\u0010k\u001a\u00020l2\u0006\u0010T\u001a\u00020m2\b\u0010B\u001a\u0004\u0018\u00010C2\b\u0010G\u001a\u0004\u0018\u00010#H\u0002J\t\u0010n\u001a\u00020\tH\u0001J\u000b\u0010o\u001a\u0004\u0018\u00010pH\u0001J\u0011\u0010q\u001a\n 8*\u0004\u0018\u00010M0MH\u0001J\b\u0010r\u001a\u00020sH\u0016J\u0011\u0010t\u001a\n 8*\u0004\u0018\u00010u0uH\u0001J\t\u0010v\u001a\u00020\u000bH\u0001J\t\u0010w\u001a\u00020\u000bH\u0001J\b\u0010x\u001a\u00020yH\u0016J\t\u0010z\u001a\u00020\u000bH\u0001J\u0011\u0010{\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u000bH\u0001J\t\u0010|\u001a\u00020\u000bH\u0001J\u0011\u0010}\u001a\n 8*\u0004\u0018\u00010~0~H\u0001J\t\u0010\u001a\u00020\tH\u0001J\r\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0001J\n\u0010\u0001\u001a\u00020RH\u0001J\r\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0001J\n\u0010\u0001\u001a\u00020\tH\u0003J\n\u0010\u0001\u001a\u00020\tH\u0001J\n\u0010\u0001\u001a\u00020\tH\u0001J\n\u0010\u0001\u001a\u00020\tH\u0001J\n\u0010\u0001\u001a\u00020\tH\u0001J\n\u0010\u0001\u001a\u00020\tH\u0001J\n\u0010\u0001\u001a\u000205H\u0003J/\u0010\u0001\u001a\u0002052\b\u0010\u0001\u001a\u00030\u00012\u0006\u0010T\u001a\u00020m2\b\u0010\u0001\u001a\u00030\u00012\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\u001a\u0010\u0001\u001a\u0002052\u000e\u00106\u001a\n 8*\u0004\u0018\u00010\u001e0\u001eH\u0001J,\u0010\u0001\u001a\u0002052\u000e\u00106\u001a\n 8*\u0004\u0018\u00010\u001e0\u001e2\u0007\u0010\u0001\u001a\u00020\t2\u0007\u0010\u0001\u001a\u00020\tH\u0001J\u0013\u0010\u0001\u001a\u00020\u00052\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0013\u0010\u0001\u001a\u00020\u00052\b\u0010\u0001\u001a\u00030\u0001H\u0002J\n\u0010\u0001\u001a\u000205H\u0001J\n\u0010\u0001\u001a\u000205H\u0001J\u001a\u0010\u0001\u001a\u0002052\u000e\u00106\u001a\n 8*\u0004\u0018\u00010707H\u0001J\n\u0010\u0001\u001a\u000205H\u0001J\u001b\u0010\u0001\u001a\u0002052\u0006\u00106\u001a\u00020\u000b2\u0007\u0010\u0001\u001a\u00020RH\u0001J\u0012\u0010\u0001\u001a\u0002052\u0006\u00106\u001a\u00020RH\u0001J\n\u0010\u0001\u001a\u000205H\u0001J\u0012\u0010\u0001\u001a\u0002052\u0006\u00106\u001a\u00020\u000bH\u0001JI\u0010\u0001\u001a\u00020528\u00106\u001a(\u0012\f\u0012\n 8*\u0004\u0018\u00010>0> 8*\u0014\u0012\u000e\b\u0001\u0012\n 8*\u0004\u0018\u00010>0>\u0018\u00010=0=\"\n 8*\u0004\u0018\u00010>0>H\u0001¢\u0006\u0002\u0010?J\u0012\u0010\u0001\u001a\u0002052\u0006\u00106\u001a\u00020\tH\u0001J\u0012\u0010 \u0001\u001a\u0002052\u0006\u00106\u001a\u00020\tH\u0001J\u0016\u0010¡\u0001\u001a\u0002052\n\b\u0001\u00106\u001a\u0004\u0018\u00010uH\u0001J\u0015\u0010¢\u0001\u001a\u0002052\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"J\u0012\u0010£\u0001\u001a\u0002052\u0006\u00106\u001a\u00020\u000bH\u0001J\u0016\u0010¤\u0001\u001a\u0002052\n\b\u0001\u00106\u001a\u0004\u0018\u00010~H\u0001J\u0012\u0010¥\u0001\u001a\u0002052\u0006\u00106\u001a\u00020\tH\u0001J\n\u0010¦\u0001\u001a\u000205H\u0001J\u0012\u0010¦\u0001\u001a\u0002052\u0006\u00106\u001a\u00020\tH\u0001J\u001b\u0010§\u0001\u001a\u0002052\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0\u001dR\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020+X.¢\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u00020#X.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u00020#X.¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010.\"\u0004\b3\u00100¨\u0006«\u0001"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/adapters/exoplayer/ExoPlayerAdapter;", "Lcom/bamtech/sdk4/media/adapters/AbstractPlayerAdapter;", "Lcom/google/android/exoplayer2/ExoPlayer;", "player", "dataSourceFactory", "Lcom/google/android/exoplayer2/upstream/HttpDataSource$Factory;", "bandwidthMeter", "Lcom/google/android/exoplayer2/upstream/BandwidthMeter;", "allowChunklessPreparation", "", "minLoadableRetryCount", "", "isDrmMultiSession", "(Lcom/google/android/exoplayer2/ExoPlayer;Lcom/google/android/exoplayer2/upstream/HttpDataSource$Factory;Lcom/google/android/exoplayer2/upstream/BandwidthMeter;ZIZ)V", "options", "Lcom/bamtech/sdk4/media/adapters/exoplayer/ExoPlayerAdapter$Options;", "(Lcom/google/android/exoplayer2/ExoPlayer;Lcom/bamtech/sdk4/media/adapters/exoplayer/ExoPlayerAdapter$Options;)V", "(Lcom/google/android/exoplayer2/ExoPlayer;Lcom/bamtech/sdk4/media/adapters/exoplayer/ExoPlayerAdapter$Options;Lcom/google/android/exoplayer2/upstream/HttpDataSource$Factory;)V", "QOSListener", "Lcom/bamtech/sdk4/internal/media/adapters/exoplayer/ExoPlayerListener;", "getQOSListener", "()Lcom/bamtech/sdk4/internal/media/adapters/exoplayer/ExoPlayerListener;", "setQOSListener", "(Lcom/bamtech/sdk4/internal/media/adapters/exoplayer/ExoPlayerListener;)V", "analyticsListener", "Lcom/bamtech/sdk4/internal/media/adapters/exoplayer/ExoPlayerAnalyticsListener;", "handler", "Landroid/os/Handler;", "mediaSourceWrapper", "Lio/reactivex/functions/Function;", "Lcom/google/android/exoplayer2/source/MediaSource;", "getPlayer", "()Lcom/google/android/exoplayer2/ExoPlayer;", "playerPreparedListener", "Lio/reactivex/functions/Consumer;", "", "qosNetworkHelper", "Lcom/bamtech/sdk4/media/QOSNetworkHelper;", "getQosNetworkHelper", "()Lcom/bamtech/sdk4/media/QOSNetworkHelper;", "setQosNetworkHelper", "(Lcom/bamtech/sdk4/media/QOSNetworkHelper;)V", "sourceEventListener", "Lcom/bamtech/sdk4/internal/media/adapters/exoplayer/HlsSourceEventListener;", "videoPlayerName", "getVideoPlayerName", "()Ljava/lang/String;", "setVideoPlayerName", "(Ljava/lang/String;)V", "videoPlayerVersion", "getVideoPlayerVersion", "setVideoPlayerVersion", "addListener", "", "p0", "Lcom/google/android/exoplayer2/Player$EventListener;", "kotlin.jvm.PlatformType", "audioChannelCount", "()Ljava/lang/Integer;", "audioLanguage", "blockingSendMessages", "", "Lcom/google/android/exoplayer2/ExoPlayer$ExoPlayerMessage;", "([Lcom/google/android/exoplayer2/ExoPlayer$ExoPlayerMessage;)V", "clean", "configureDrm", "preferredDrmScheme", "Ljava/util/UUID;", "offlineKeys", "", "audioKeys", "playbackSessionId", "isOffline", "createMessage", "Lcom/google/android/exoplayer2/PlayerMessage;", "Lcom/google/android/exoplayer2/PlayerMessage$Target;", "getApplicationLooper", "Landroid/os/Looper;", "getAudioComponent", "Lcom/google/android/exoplayer2/Player$AudioComponent;", "getBufferedPercentage", "getBufferedPosition", "", "getCachedMediaSource", "playlist", "Lcom/bamtech/sdk4/internal/media/CachedMediaItemPlaylist;", "getContentBufferedPosition", "getContentDuration", "getContentPosition", "getCurrentAdGroupIndex", "getCurrentAdIndexInAdGroup", "getCurrentManifest", "", "getCurrentPeriodIndex", "getCurrentPosition", "getCurrentTag", "getCurrentTimeline", "Lcom/google/android/exoplayer2/Timeline;", "getCurrentTrackGroups", "Lcom/google/android/exoplayer2/source/TrackGroupArray;", "getCurrentTrackSelections", "Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;", "getCurrentWindowIndex", "getDuration", "getMetadataComponent", "Lcom/google/android/exoplayer2/Player$MetadataComponent;", "getNextWindowIndex", "getOnlineMediaSource", "Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;", "Lcom/bamtech/sdk4/media/MediaItemPlaylist;", "getPlayWhenReady", "getPlaybackError", "Lcom/google/android/exoplayer2/ExoPlaybackException;", "getPlaybackLooper", "getPlaybackMetrics", "Lcom/bamtech/sdk4/media/adapters/PlaybackMetrics;", "getPlaybackParameters", "Lcom/google/android/exoplayer2/PlaybackParameters;", "getPlaybackState", "getPreviousWindowIndex", "getQosMetaData", "Lcom/bamtech/sdk4/media/adapters/AbstractPlayerAdapter$QosMetadata;", "getRendererCount", "getRendererType", "getRepeatMode", "getSeekParameters", "Lcom/google/android/exoplayer2/SeekParameters;", "getShuffleModeEnabled", "getTextComponent", "Lcom/google/android/exoplayer2/Player$TextComponent;", "getTotalBufferedDuration", "getVideoComponent", "Lcom/google/android/exoplayer2/Player$VideoComponent;", "hasNext", "hasPrevious", "isCurrentWindowDynamic", "isCurrentWindowSeekable", "isLoading", "isPlayingAd", "next", "onPrepared", "mediaItem", "Lcom/bamtech/sdk4/media/MediaItem;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "prepare", "p1", "p2", "prepareManifestDataSourceFactory", "networkConfigurationProvider", "Lcom/bamtech/sdk4/internal/configuration/NetworkConfigurationProvider;", "prepareSegmentDataSourceFactory", "previous", "release", "removeListener", "retry", "seekTo", "seekToDefaultPosition", "sendMessages", "setForegroundMode", "setPlayWhenReady", "setPlaybackParameters", "setPlayerPreparedListener", "setRepeatMode", "setSeekParameters", "setShuffleModeEnabled", "stop", "wrapMediaSource", "Builder", "Companion", "Options", "playeradapter-exoplayer-2.10.1_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ExoPlayerAdapter.kt */
public final class ExoPlayerAdapter extends AbstractPlayerAdapter implements ExoPlayer {
    public static final Companion Companion = new Companion(null);
    private ExoPlayerListener QOSListener = new ExoPlayerListener(getPlaybackEventBroadcaster(), this, getQosEventBroadcaster());
    private final ExoPlayerAnalyticsListener analyticsListener = new ExoPlayerAnalyticsListener(getQosEventBroadcaster(), getQOSListener());
    private final Factory dataSourceFactory;
    private final Handler handler;
    private Function<MediaSource, MediaSource> mediaSourceWrapper;
    private Options options;
    private final ExoPlayer player;
    private Consumer<String> playerPreparedListener;
    private QOSNetworkHelper qosNetworkHelper;
    private HlsSourceEventListener sourceEventListener;
    public String videoPlayerName;
    public String videoPlayerVersion;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0000J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010 \u001a\u00020!J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u0012\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0006J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001fJ\u001c\u0010%\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/adapters/exoplayer/ExoPlayerAdapter$Builder;", "", "player", "Lcom/google/android/exoplayer2/ExoPlayer;", "(Lcom/google/android/exoplayer2/ExoPlayer;)V", "allowChunklessPreparation", "", "bandwidthMeter", "Lcom/google/android/exoplayer2/upstream/BandwidthMeter;", "cacheControl", "Lokhttp3/CacheControl;", "client", "Lokhttp3/OkHttpClient;", "dataSourceFactory", "Lcom/google/android/exoplayer2/upstream/HttpDataSource$Factory;", "drmSessionManager", "Lcom/bamtech/sdk4/media/adapters/exoplayer/WidevineDrmSessionManager;", "eventHandler", "Landroid/os/Handler;", "eventListener", "Lcom/google/android/exoplayer2/source/MediaSourceEventListener;", "hlsExtractorFactory", "Lcom/google/android/exoplayer2/source/hls/HlsExtractorFactory;", "isDrmMultiSession", "isOffline", "mediaSourceWrapper", "Lio/reactivex/functions/Function;", "Lcom/google/android/exoplayer2/source/MediaSource;", "minLoadableRetryCount", "", "transferListener", "Lcom/google/android/exoplayer2/upstream/TransferListener;", "build", "Lcom/bamtech/sdk4/media/adapters/exoplayer/ExoPlayerAdapter;", "drmMultiSession", "offlinePlayback", "overrideHttpClient", "wrapMediaSource", "playeradapter-exoplayer-2.10.1_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ExoPlayerAdapter.kt */
    public static final class Builder {
        private boolean allowChunklessPreparation;
        private BandwidthMeter bandwidthMeter;
        private CacheControl cacheControl;
        private OkHttpClient client;
        private Factory dataSourceFactory;
        private WidevineDrmSessionManager drmSessionManager;
        private Handler eventHandler;
        private MediaSourceEventListener eventListener;
        private HlsExtractorFactory hlsExtractorFactory;
        private boolean isDrmMultiSession;
        private Function<MediaSource, MediaSource> mediaSourceWrapper;
        private int minLoadableRetryCount = 3;
        private ExoPlayer player;
        private TransferListener transferListener;

        public Builder(ExoPlayer exoPlayer) {
            this.player = exoPlayer;
        }

        public final Builder allowChunklessPreparation() {
            this.allowChunklessPreparation = true;
            return this;
        }

        public final Builder bandwidthMeter(BandwidthMeter bandwidthMeter2) {
            this.bandwidthMeter = bandwidthMeter2;
            return this;
        }

        public final ExoPlayerAdapter build() {
            OkHttpClient okHttpClient = this.client;
            BandwidthMeter bandwidthMeter2 = this.bandwidthMeter;
            if (bandwidthMeter2 != null) {
                Options options = new Options(okHttpClient, bandwidthMeter2, this.eventHandler, this.eventListener, this.transferListener, this.cacheControl, this.allowChunklessPreparation, this.minLoadableRetryCount, this.hlsExtractorFactory, this.drmSessionManager, this.isDrmMultiSession);
                ExoPlayerAdapter exoPlayerAdapter = new ExoPlayerAdapter(this.player, options, this.dataSourceFactory);
                Function<MediaSource, MediaSource> function = this.mediaSourceWrapper;
                if (function != null) {
                    exoPlayerAdapter.wrapMediaSource(function);
                }
                return exoPlayerAdapter;
            }
            throw new IllegalArgumentException("A BandwidthMeter must be specified.");
        }

        public final Builder dataSourceFactory(Factory factory) {
            this.dataSourceFactory = factory;
            return this;
        }

        public final Builder drmMultiSession(boolean z) {
            this.isDrmMultiSession = z;
            return this;
        }

        public final Builder drmSessionManager(WidevineDrmSessionManager widevineDrmSessionManager) {
            this.drmSessionManager = widevineDrmSessionManager;
            return this;
        }

        public final Builder eventListener(MediaSourceEventListener mediaSourceEventListener) {
            this.eventListener = mediaSourceEventListener;
            return this;
        }

        public final Builder wrapMediaSource(Function<MediaSource, MediaSource> function) {
            this.mediaSourceWrapper = function;
            return this;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/adapters/exoplayer/ExoPlayerAdapter$Companion;", "", "()V", "builder", "Lcom/bamtech/sdk4/media/adapters/exoplayer/ExoPlayerAdapter$Builder;", "player", "Lcom/google/android/exoplayer2/ExoPlayer;", "playeradapter-exoplayer-2.10.1_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ExoPlayerAdapter.kt */
    public static final class Companion {
        private Companion() {
        }

        public final Builder builder(ExoPlayer exoPlayer) {
            return new Builder(exoPlayer);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000f¢\u0006\u0002\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0016\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006,"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/adapters/exoplayer/ExoPlayerAdapter$Options;", "", "client", "Lokhttp3/OkHttpClient;", "bandwidthMeter", "Lcom/google/android/exoplayer2/upstream/BandwidthMeter;", "eventHandler", "Landroid/os/Handler;", "eventListener", "Lcom/google/android/exoplayer2/source/MediaSourceEventListener;", "transferListener", "Lcom/google/android/exoplayer2/upstream/TransferListener;", "cacheControl", "Lokhttp3/CacheControl;", "allowChunklessPreparation", "", "minLoadableRetryCount", "", "hlsExtractorFactory", "Lcom/google/android/exoplayer2/source/hls/HlsExtractorFactory;", "drmSessionManager", "Lcom/bamtech/sdk4/media/adapters/exoplayer/WidevineDrmSessionManager;", "isDrmMultiSession", "(Lokhttp3/OkHttpClient;Lcom/google/android/exoplayer2/upstream/BandwidthMeter;Landroid/os/Handler;Lcom/google/android/exoplayer2/source/MediaSourceEventListener;Lcom/google/android/exoplayer2/upstream/TransferListener;Lokhttp3/CacheControl;ZILcom/google/android/exoplayer2/source/hls/HlsExtractorFactory;Lcom/bamtech/sdk4/media/adapters/exoplayer/WidevineDrmSessionManager;Z)V", "getAllowChunklessPreparation", "()Z", "getBandwidthMeter", "()Lcom/google/android/exoplayer2/upstream/BandwidthMeter;", "getCacheControl", "()Lokhttp3/CacheControl;", "getClient", "()Lokhttp3/OkHttpClient;", "getDrmSessionManager", "()Lcom/bamtech/sdk4/media/adapters/exoplayer/WidevineDrmSessionManager;", "getEventHandler", "()Landroid/os/Handler;", "getEventListener", "()Lcom/google/android/exoplayer2/source/MediaSourceEventListener;", "getHlsExtractorFactory", "()Lcom/google/android/exoplayer2/source/hls/HlsExtractorFactory;", "getMinLoadableRetryCount", "()I", "getTransferListener", "()Lcom/google/android/exoplayer2/upstream/TransferListener;", "playeradapter-exoplayer-2.10.1_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ExoPlayerAdapter.kt */
    public static final class Options {
        private final boolean allowChunklessPreparation;
        private final BandwidthMeter bandwidthMeter;
        private final CacheControl cacheControl;
        private final OkHttpClient client;
        private final WidevineDrmSessionManager drmSessionManager;
        private final Handler eventHandler;
        private final MediaSourceEventListener eventListener;
        private final HlsExtractorFactory hlsExtractorFactory;
        private final boolean isDrmMultiSession;
        private final int minLoadableRetryCount;
        private final TransferListener transferListener;

        public Options(OkHttpClient okHttpClient, BandwidthMeter bandwidthMeter2, Handler handler, MediaSourceEventListener mediaSourceEventListener, TransferListener transferListener2, CacheControl cacheControl2, boolean z, int i, HlsExtractorFactory hlsExtractorFactory2, WidevineDrmSessionManager widevineDrmSessionManager, boolean z2) {
            this.client = okHttpClient;
            this.bandwidthMeter = bandwidthMeter2;
            this.eventHandler = handler;
            this.eventListener = mediaSourceEventListener;
            this.transferListener = transferListener2;
            this.cacheControl = cacheControl2;
            this.allowChunklessPreparation = z;
            this.minLoadableRetryCount = i;
            this.hlsExtractorFactory = hlsExtractorFactory2;
            this.drmSessionManager = widevineDrmSessionManager;
            this.isDrmMultiSession = z2;
        }

        public final boolean getAllowChunklessPreparation() {
            return this.allowChunklessPreparation;
        }

        public final BandwidthMeter getBandwidthMeter() {
            return this.bandwidthMeter;
        }

        public final CacheControl getCacheControl() {
            return this.cacheControl;
        }

        public final OkHttpClient getClient() {
            return this.client;
        }

        public final WidevineDrmSessionManager getDrmSessionManager() {
            return this.drmSessionManager;
        }

        public final Handler getEventHandler() {
            return this.eventHandler;
        }

        public final MediaSourceEventListener getEventListener() {
            return this.eventListener;
        }

        public final HlsExtractorFactory getHlsExtractorFactory() {
            return this.hlsExtractorFactory;
        }

        public final int getMinLoadableRetryCount() {
            return this.minLoadableRetryCount;
        }

        public final TransferListener getTransferListener() {
            return this.transferListener;
        }

        public final boolean isDrmMultiSession() {
            return this.isDrmMultiSession;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[PlaylistType.values().length];

        static {
            $EnumSwitchMapping$0[PlaylistType.OFFLINE.ordinal()] = 1;
        }
    }

    public ExoPlayerAdapter(ExoPlayer exoPlayer, Options options2, Factory factory) {
        this.player = exoPlayer;
        this.options = options2;
        this.dataSourceFactory = factory;
        Handler eventHandler = this.options.getEventHandler();
        if (eventHandler == null) {
            eventHandler = new Handler(Looper.getMainLooper());
        }
        this.handler = eventHandler;
        setVideoPlayerName("ExoPlayerLib/2.10.1");
        setVideoPlayerVersion("4.7.4");
        this.player.addListener(getQOSListener());
        ExoPlayer exoPlayer2 = this.player;
        if (!(exoPlayer2 instanceof C8802o0)) {
            exoPlayer2 = null;
        }
        C8802o0 o0Var = (C8802o0) exoPlayer2;
        if (o0Var != null) {
            o0Var.mo22996a((AnalyticsListener) this.analyticsListener);
        }
    }

    public static final Builder builder(ExoPlayer exoPlayer) {
        return Companion.builder(exoPlayer);
    }

    private final void configureDrm(UUID uuid, byte[] bArr, byte[] bArr2, String str, boolean z) {
        Object obj;
        Object obj2;
        UUID uuid2 = uuid;
        Iterator it = getDrmProviders().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((DrmProvider) obj) instanceof WidevineDrmProvider) {
                break;
            }
        }
        if (!(obj instanceof WidevineDrmProvider)) {
            obj = null;
        }
        WidevineDrmProvider widevineDrmProvider = (WidevineDrmProvider) obj;
        Iterator it2 = getDrmProviders().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (((DrmProvider) obj2) instanceof PlayReadyDrmProvider) {
                break;
            }
        }
        if (!(obj2 instanceof PlayReadyDrmProvider)) {
            obj2 = null;
        }
        PlayReadyDrmProvider playReadyDrmProvider = (PlayReadyDrmProvider) obj2;
        boolean z2 = true;
        boolean z3 = widevineDrmProvider == null && playReadyDrmProvider == null;
        boolean z4 = C12880j.m40224a((Object) C8883r.f19046e, (Object) uuid2) && playReadyDrmProvider != null && bArr == null;
        if ((!C12880j.m40224a((Object) C8883r.f19045d, (Object) uuid2) && uuid2 != null) || widevineDrmProvider == null) {
            z2 = false;
        }
        if (!z3) {
            if (z4) {
                WidevineDrmSessionManager drmSessionManager = this.options.getDrmSessionManager();
                if (drmSessionManager == null) {
                    return;
                }
                if (playReadyDrmProvider != null) {
                    drmSessionManager.create(playReadyDrmProvider, getPlaybackEventBroadcaster(), getQosEventBroadcaster(), null, bArr2, this.options.isDrmMultiSession(), str, z);
                    return;
                }
                throw new C13142s("null cannot be cast to non-null type com.bamtech.sdk4.media.drm.DrmProvider");
            } else if (z2) {
                WidevineDrmSessionManager drmSessionManager2 = this.options.getDrmSessionManager();
                if (drmSessionManager2 == null) {
                    return;
                }
                if (widevineDrmProvider != null) {
                    drmSessionManager2.create(widevineDrmProvider, getPlaybackEventBroadcaster(), getQosEventBroadcaster(), bArr, bArr2, this.options.isDrmMultiSession(), str, z);
                } else {
                    C12880j.m40220a();
                    throw null;
                }
            }
        }
    }

    static /* synthetic */ void configureDrm$default(ExoPlayerAdapter exoPlayerAdapter, UUID uuid, byte[] bArr, byte[] bArr2, String str, boolean z, int i, Object obj) {
        exoPlayerAdapter.configureDrm((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? null : bArr2, str, z);
    }

    private final MediaSource getCachedMediaSource(CachedMediaItemPlaylist cachedMediaItemPlaylist) {
        C9517t tVar = new C9517t("ExoPlayerAdapter", null);
        configureDrm(C8883r.f19045d, cachedMediaItemPlaylist.getLicense(), cachedMediaItemPlaylist.getAudioLicense(), null, true);
        HlsMediaSource.Factory streamKeys = new HlsMediaSource.Factory((C9435a) new C9465e(cachedMediaItemPlaylist.getCache(), tVar, 2)).mo23785a((C9187g) new C9178b()).setStreamKeys(cachedMediaItemPlaylist.getRenditionKeys());
        streamKeys.mo23787a(this.options.getAllowChunklessPreparation());
        HlsExtractorFactory hlsExtractorFactory = this.options.getHlsExtractorFactory();
        if (hlsExtractorFactory != null) {
            streamKeys.mo23784a(hlsExtractorFactory);
        }
        HlsMediaSource createMediaSource = streamKeys.createMediaSource(Uri.parse(cachedMediaItemPlaylist.getStreamUri()));
        C12880j.m40222a((Object) createMediaSource, "createMediaSource(Uri.parse(playlist.streamUri))");
        C12880j.m40222a((Object) createMediaSource, "with(mediaSourceFactory)…ist.streamUri))\n        }");
        return createMediaSource;
    }

    private final HlsMediaSource getOnlineMediaSource(MediaItemPlaylist mediaItemPlaylist, UUID uuid, String str) {
        Object obj;
        Iterator it = getDrmProviders().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((DrmProvider) obj) instanceof SilkDrmProvider) {
                break;
            }
        }
        if (obj != null) {
            SilkDrmProvider silkDrmProvider = (SilkDrmProvider) obj;
            configureDrm$default(this, uuid, null, null, str, false, 6, null);
            HlsMediaSource.Factory factory = new HlsMediaSource.Factory((C9162h) new BamHttpDataSourceFactory(silkDrmProvider, prepareSegmentDataSourceFactory(silkDrmProvider), prepareManifestDataSourceFactory(silkDrmProvider)));
            factory.mo23786a((C9524z) new ExoPlayerAdapter$getOnlineMediaSource$$inlined$with$lambda$1(this.options.getMinLoadableRetryCount(), this, mediaItemPlaylist));
            factory.mo23787a(this.options.getAllowChunklessPreparation());
            HlsExtractorFactory hlsExtractorFactory = this.options.getHlsExtractorFactory();
            if (hlsExtractorFactory != null) {
                factory.mo23784a(hlsExtractorFactory);
            }
            factory.mo23788b(this.options.isDrmMultiSession());
            HlsMediaSource createMediaSource = factory.createMediaSource(Uri.parse(mediaItemPlaylist.getStreamUri()));
            Handler handler2 = this.handler;
            HlsSourceEventListener hlsSourceEventListener = this.sourceEventListener;
            if (hlsSourceEventListener != null) {
                createMediaSource.mo23488a(handler2, (MediaSourceEventListener) hlsSourceEventListener);
                C12880j.m40222a((Object) createMediaSource, "createMediaSource(Uri.pa…ntListener)\n            }");
                C12880j.m40222a((Object) createMediaSource, "with(HlsMediaSource.Fact…)\n            }\n        }");
                return createMediaSource;
            }
            C12880j.m40227c("sourceEventListener");
            throw null;
        }
        throw new C13142s("null cannot be cast to non-null type com.bamtech.sdk4.media.drm.SilkDrmProvider");
    }

    private final Factory prepareManifestDataSourceFactory(NetworkConfigurationProvider networkConfigurationProvider) {
        Factory factory = this.dataSourceFactory;
        if (factory != null) {
            return factory;
        }
        OkHttpClient client = this.options.getClient();
        if (client == null) {
            client = networkConfigurationProvider.getOkHttpClientBuilder().mo35820a();
        }
        return new C8897b(client, networkConfigurationProvider.getUserAgent(), null, this.options.getCacheControl());
    }

    private final Factory prepareSegmentDataSourceFactory(NetworkConfigurationProvider networkConfigurationProvider) {
        Factory factory = this.dataSourceFactory;
        if (factory != null) {
            return factory;
        }
        OkHttpClient client = this.options.getClient();
        if (client == null) {
            client = networkConfigurationProvider.getMediaOkHttpBuilder().mo35820a();
        }
        TransferListener transferListener = this.options.getTransferListener();
        if (transferListener == null) {
            transferListener = null;
            try {
                BandwidthMeter bandwidthMeter = this.options.getBandwidthMeter();
                if (!(bandwidthMeter instanceof TransferListener)) {
                    bandwidthMeter = null;
                }
                transferListener = (TransferListener) bandwidthMeter;
            } catch (Throwable unused) {
            }
        }
        return new C8897b(client, networkConfigurationProvider.getUserAgent(), transferListener, this.options.getCacheControl());
    }

    public void addListener(EventListener eventListener) {
        this.player.addListener(eventListener);
    }

    public void clean() {
        this.player.removeListener(getQOSListener());
        ExoPlayer exoPlayer = this.player;
        if (!(exoPlayer instanceof C8802o0)) {
            exoPlayer = null;
        }
        C8802o0 o0Var = (C8802o0) exoPlayer;
        if (o0Var != null) {
            o0Var.mo23001b((AnalyticsListener) this.analyticsListener);
        }
        WidevineDrmSessionManager drmSessionManager = this.options.getDrmSessionManager();
        if (drmSessionManager != null) {
            drmSessionManager.clearCallbackAndEventListeners();
        }
    }

    public Looper getApplicationLooper() {
        return this.player.getApplicationLooper();
    }

    public long getBufferedPosition() {
        return this.player.getBufferedPosition();
    }

    public long getContentBufferedPosition() {
        return this.player.getContentBufferedPosition();
    }

    public long getContentPosition() {
        return this.player.getContentPosition();
    }

    public int getCurrentAdGroupIndex() {
        return this.player.getCurrentAdGroupIndex();
    }

    public int getCurrentAdIndexInAdGroup() {
        return this.player.getCurrentAdIndexInAdGroup();
    }

    public long getCurrentPosition() {
        return this.player.getCurrentPosition();
    }

    public Timeline getCurrentTimeline() {
        return this.player.getCurrentTimeline();
    }

    public TrackGroupArray getCurrentTrackGroups() {
        return this.player.getCurrentTrackGroups();
    }

    public TrackSelectionArray getCurrentTrackSelections() {
        return this.player.getCurrentTrackSelections();
    }

    public int getCurrentWindowIndex() {
        return this.player.getCurrentWindowIndex();
    }

    public long getDuration() {
        return this.player.getDuration();
    }

    public int getNextWindowIndex() {
        return this.player.getNextWindowIndex();
    }

    public boolean getPlayWhenReady() {
        return this.player.getPlayWhenReady();
    }

    public ExoPlaybackException getPlaybackError() {
        return this.player.getPlaybackError();
    }

    public PlaybackMetrics getPlaybackMetrics() {
        PlaybackMetrics playbackMetrics = new PlaybackMetrics(Long.valueOf(this.options.getBandwidthMeter().mo24447b()), this.player.getCurrentPosition(), null, 4, null);
        return playbackMetrics;
    }

    public PlaybackParameters getPlaybackParameters() {
        return this.player.getPlaybackParameters();
    }

    public int getPlaybackState() {
        return this.player.getPlaybackState();
    }

    public int getPreviousWindowIndex() {
        return this.player.getPreviousWindowIndex();
    }

    public ExoPlayerListener getQOSListener() {
        return this.QOSListener;
    }

    public QosMetadata getQosMetaData() {
        String str;
        QosMetadata qosMetadata = new QosMetadata(null, null, null, null, null, null, null, null, 0, 511, null);
        int i = getCurrentTrackSelections().f21167a - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                C9311j a = getCurrentTrackSelections().mo24040a(i2);
                if (a != null) {
                    Format f = a.mo24076f();
                    if (f != null) {
                        String str2 = f.f18349b0;
                        String str3 = "format.id!!";
                        String str4 = null;
                        if (str2 != null && C12833x.m40154a((CharSequence) str2, (CharSequence) "audio", false, 2, (Object) null)) {
                            qosMetadata.setAudioLanguage(f.f18368t0);
                            qosMetadata.setAudioChannels(Integer.valueOf(f.f18363o0));
                            String str5 = f.f18350c;
                            if (str5 == null || !C12833x.m40151a((CharSequence) str5, ':', false, 2, (Object) null)) {
                                str = null;
                            } else {
                                String str6 = f.f18350c;
                                if (str6 != null) {
                                    C12880j.m40222a((Object) str6, str3);
                                    str = C12833x.m40136a(str6, ':', (String) null, 2, (Object) null);
                                } else {
                                    C12880j.m40220a();
                                    throw null;
                                }
                            }
                            qosMetadata.setAudioName(str);
                            qosMetadata.setAudioCodec(f.f18346Y);
                        }
                        String str7 = f.f18349b0;
                        if (str7 != null && C12833x.m40154a((CharSequence) str7, (CharSequence) "video", false, 2, (Object) null)) {
                            qosMetadata.setVideoCodec(f.f18346Y);
                        }
                        String str8 = f.f18349b0;
                        if (str8 != null && C12833x.m40154a((CharSequence) str8, (CharSequence) "text", false, 2, (Object) null)) {
                            qosMetadata.setSubtitleLanguage(f.f18368t0);
                            String str9 = f.f18350c;
                            if (str9 != null && C12833x.m40151a((CharSequence) str9, ':', false, 2, (Object) null)) {
                                String str10 = f.f18350c;
                                if (str10 != null) {
                                    C12880j.m40222a((Object) str10, str3);
                                    str4 = C12833x.m40136a(str10, ':', (String) null, 2, (Object) null);
                                } else {
                                    C12880j.m40220a();
                                    throw null;
                                }
                            }
                            qosMetadata.setSubtitleName(str4);
                        }
                    }
                }
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        qosMetadata.setPlayhead(getCurrentPosition());
        return qosMetadata;
    }

    public QOSNetworkHelper getQosNetworkHelper() {
        return this.qosNetworkHelper;
    }

    public int getRendererType(int i) {
        return this.player.getRendererType(i);
    }

    public int getRepeatMode() {
        return this.player.getRepeatMode();
    }

    public boolean getShuffleModeEnabled() {
        return this.player.getShuffleModeEnabled();
    }

    public TextComponent getTextComponent() {
        return this.player.getTextComponent();
    }

    public long getTotalBufferedDuration() {
        return this.player.getTotalBufferedDuration();
    }

    public VideoComponent getVideoComponent() {
        return this.player.getVideoComponent();
    }

    public String getVideoPlayerName() {
        String str = this.videoPlayerName;
        if (str != null) {
            return str;
        }
        C12880j.m40227c("videoPlayerName");
        throw null;
    }

    public String getVideoPlayerVersion() {
        String str = this.videoPlayerVersion;
        if (str != null) {
            return str;
        }
        C12880j.m40227c("videoPlayerVersion");
        throw null;
    }

    public boolean hasNext() {
        return this.player.hasNext();
    }

    public boolean hasPrevious() {
        return this.player.hasPrevious();
    }

    public boolean isCurrentWindowDynamic() {
        return this.player.isCurrentWindowDynamic();
    }

    public boolean isCurrentWindowSeekable() {
        return this.player.isCurrentWindowSeekable();
    }

    public boolean isPlayingAd() {
        return this.player.isPlayingAd();
    }

    public void onPrepared(MediaItem mediaItem, MediaItemPlaylist mediaItemPlaylist, ServiceTransaction serviceTransaction, UUID uuid) {
        MediaSource mediaSource;
        this.sourceEventListener = new HlsSourceEventListener(this, getQosEventBroadcaster(), getQOSListener(), getQosNetworkHelper());
        if (WhenMappings.$EnumSwitchMapping$0[mediaItemPlaylist.getPlaylistType().ordinal()] != 1) {
            getQOSListener().setOffline(false);
            ExoPlayerListener qOSListener = getQOSListener();
            PlaybackContext playbackContext = mediaItem.getPlaybackContext();
            qOSListener.setPlaybackSessionId(playbackContext != null ? playbackContext.getPlaybackSessionId() : null);
            PlaybackContext playbackContext2 = mediaItem.getPlaybackContext();
            mediaSource = getOnlineMediaSource(mediaItemPlaylist, uuid, playbackContext2 != null ? playbackContext2.getPlaybackSessionId() : null);
        } else {
            getQOSListener().setOffline(true);
            mediaSource = getCachedMediaSource((CachedMediaItemPlaylist) mediaItemPlaylist);
        }
        MediaSourceEventListener eventListener = this.options.getEventListener();
        if (eventListener != null) {
            mediaSource.mo23488a(this.handler, eventListener);
        }
        HlsSourceEventListener hlsSourceEventListener = this.sourceEventListener;
        if (hlsSourceEventListener != null) {
            hlsSourceEventListener.setExpectMasterPlaylist(true);
            Function<MediaSource, MediaSource> function = this.mediaSourceWrapper;
            if (function != null) {
                this.player.prepare((MediaSource) function.apply(mediaSource));
            } else {
                this.player.prepare(mediaSource);
            }
            Consumer<String> consumer = this.playerPreparedListener;
            if (consumer != null) {
                consumer.accept(mediaItemPlaylist.getStreamUri());
                return;
            }
            return;
        }
        C12880j.m40227c("sourceEventListener");
        throw null;
    }

    public void prepare(MediaSource mediaSource) {
        this.player.prepare(mediaSource);
    }

    public void removeListener(EventListener eventListener) {
        this.player.removeListener(eventListener);
    }

    public void seekTo(int i, long j) {
        this.player.seekTo(i, j);
    }

    public void setPlayWhenReady(boolean z) {
        this.player.setPlayWhenReady(z);
    }

    public final void setPlayerPreparedListener(Consumer<String> consumer) {
        this.playerPreparedListener = consumer;
    }

    public void setQosNetworkHelper(QOSNetworkHelper qOSNetworkHelper) {
        this.qosNetworkHelper = qOSNetworkHelper;
    }

    public void setRepeatMode(int i) {
        this.player.setRepeatMode(i);
    }

    public void setShuffleModeEnabled(boolean z) {
        this.player.setShuffleModeEnabled(z);
    }

    public void setVideoPlayerName(String str) {
        this.videoPlayerName = str;
    }

    public void setVideoPlayerVersion(String str) {
        this.videoPlayerVersion = str;
    }

    public void stop() {
        this.player.stop();
    }

    public void stop(boolean z) {
        this.player.stop(z);
    }

    public final void wrapMediaSource(Function<MediaSource, MediaSource> function) {
        this.mediaSourceWrapper = function;
    }
}
