package com.bamtech.sdk4.internal.configuration;

import com.bamtech.core.networking.Link;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000bR\u0011\u0010\u001c\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000bR\u0011\u0010\u001e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000bR\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b \u0010\"R\u0011\u0010#\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b$\u0010\u0013R\u0011\u0010%\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b*\u0010\u0013R\u0011\u0010+\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u0006/"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/MediaServiceConfiguration;", "Lcom/bamtech/sdk4/internal/configuration/ServiceConfiguration;", "()V", "client", "Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;", "extras", "Lcom/bamtech/sdk4/internal/configuration/MediaExtras;", "(Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;Lcom/bamtech/sdk4/internal/configuration/MediaExtras;)V", "bifThumbnailLink", "Lcom/bamtech/core/networking/Link;", "getBifThumbnailLink", "()Lcom/bamtech/core/networking/Link;", "bifThumbnailsLink", "getBifThumbnailsLink", "getClient", "()Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;", "defaultPlaybackScenario", "", "getDefaultPlaybackScenario", "()Ljava/lang/String;", "defaultPlaylistType", "Lcom/bamtech/sdk4/internal/configuration/PlaylistType;", "getDefaultPlaylistType", "()Lcom/bamtech/sdk4/internal/configuration/PlaylistType;", "getExtras", "()Lcom/bamtech/sdk4/internal/configuration/MediaExtras;", "getBookmarkLink", "getGetBookmarkLink", "getKeyLink", "getGetKeyLink", "getMediaLink", "getGetMediaLink", "isUhdAllowed", "", "()Z", "multiCodecPlaybackScenario", "getMultiCodecPlaybackScenario", "playbackSession", "Lcom/bamtech/sdk4/internal/configuration/PlaybackSessionConfiguration;", "getPlaybackSession", "()Lcom/bamtech/sdk4/internal/configuration/PlaybackSessionConfiguration;", "restrictedPlaybackScenario", "getRestrictedPlaybackScenario", "securityCheckRequirements", "Lcom/bamtech/sdk4/internal/configuration/MediaSecurityRequirements;", "getSecurityCheckRequirements", "()Lcom/bamtech/sdk4/internal/configuration/MediaSecurityRequirements;", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MediaServiceConfiguration.kt */
public final class MediaServiceConfiguration implements ServiceConfiguration {
    private final ServiceClientDefinition client;
    private final MediaExtras extras;

    public MediaServiceConfiguration(ServiceClientDefinition serviceClientDefinition, MediaExtras mediaExtras) {
        this.client = serviceClientDefinition;
        this.extras = mediaExtras;
    }

    public final Link getBifThumbnailLink() {
        return getClient().getLink("bifThumbnail");
    }

    public final Link getBifThumbnailsLink() {
        return getClient().getLink("bifThumbnails");
    }

    public ServiceClientDefinition getClient() {
        return this.client;
    }

    public final String getDefaultPlaybackScenario() {
        return getExtras().getPlaybackScenarioDefault();
    }

    public final PlaylistType getDefaultPlaylistType() {
        return getExtras().getPlaylistTypeDefault();
    }

    public final Link getGetBookmarkLink() {
        return getClient().getLink("bookmarks");
    }

    public final Link getGetKeyLink() {
        return getClient().getLink("key");
    }

    public final Link getGetMediaLink() {
        return getClient().getLink("mediaPayload");
    }

    public final String getRestrictedPlaybackScenario() {
        return getExtras().getRestrictedPlaybackScenario();
    }

    public final MediaSecurityRequirements getSecurityCheckRequirements() {
        return getExtras().getSecurityCheckRequirements();
    }

    public final boolean isUhdAllowed() {
        return getExtras().isUhdAllowed();
    }

    public MediaServiceConfiguration() {
        this(new ServiceClientDefinition(), new MediaExtras());
    }

    public MediaExtras getExtras() {
        return this.extras;
    }
}
