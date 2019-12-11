package com.bamtech.sdk4.internal.configuration;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/MediaExtras;", "Lcom/bamtech/sdk4/internal/configuration/ServiceExtras;", "()V", "playbackScenarioDefault", "", "multiCodecPlaybackScenario", "restrictedPlaybackScenario", "playlistTypeDefault", "Lcom/bamtech/sdk4/internal/configuration/PlaylistType;", "playbackSession", "Lcom/bamtech/sdk4/internal/configuration/PlaybackSessionConfiguration;", "isUhdAllowed", "", "securityCheckRequirements", "Lcom/bamtech/sdk4/internal/configuration/MediaSecurityRequirements;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bamtech/sdk4/internal/configuration/PlaylistType;Lcom/bamtech/sdk4/internal/configuration/PlaybackSessionConfiguration;ZLcom/bamtech/sdk4/internal/configuration/MediaSecurityRequirements;)V", "()Z", "getMultiCodecPlaybackScenario", "()Ljava/lang/String;", "getPlaybackScenarioDefault", "getPlaybackSession", "()Lcom/bamtech/sdk4/internal/configuration/PlaybackSessionConfiguration;", "getPlaylistTypeDefault", "()Lcom/bamtech/sdk4/internal/configuration/PlaylistType;", "getRestrictedPlaybackScenario", "getSecurityCheckRequirements", "()Lcom/bamtech/sdk4/internal/configuration/MediaSecurityRequirements;", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MediaServiceConfiguration.kt */
public final class MediaExtras implements ServiceExtras {
    private final boolean isUhdAllowed;
    private final String playbackScenarioDefault;
    private final PlaybackSessionConfiguration playbackSession;
    private final PlaylistType playlistTypeDefault;
    private final String restrictedPlaybackScenario;
    private final MediaSecurityRequirements securityCheckRequirements;

    public MediaExtras(String str, String str2, String str3, PlaylistType playlistType, PlaybackSessionConfiguration playbackSessionConfiguration, boolean z, MediaSecurityRequirements mediaSecurityRequirements) {
        this.playbackScenarioDefault = str;
        this.restrictedPlaybackScenario = str3;
        this.playlistTypeDefault = playlistType;
        this.playbackSession = playbackSessionConfiguration;
        this.isUhdAllowed = z;
        this.securityCheckRequirements = mediaSecurityRequirements;
    }

    public final String getPlaybackScenarioDefault() {
        return this.playbackScenarioDefault;
    }

    public final PlaybackSessionConfiguration getPlaybackSession() {
        return this.playbackSession;
    }

    public final PlaylistType getPlaylistTypeDefault() {
        return this.playlistTypeDefault;
    }

    public final String getRestrictedPlaybackScenario() {
        return this.restrictedPlaybackScenario;
    }

    public final MediaSecurityRequirements getSecurityCheckRequirements() {
        return this.securityCheckRequirements;
    }

    public final boolean isUhdAllowed() {
        return this.isUhdAllowed;
    }

    public MediaExtras() {
        this("handset-drm-ctr", "handset-drm-ctr", "handset-drm-ctr", PlaylistType.SLIDE, new PlaybackSessionConfiguration(), false, new MediaSecurityRequirements());
    }
}
