package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.media.DefaultQOSPlaybackEventListener;
import com.bamtech.sdk4.media.QOSNetworkHelper;
import com.bamtech.sdk4.plugin.PluginRegistry;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b!\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/MediaModule;", "", "()V", "Companion", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MediaModule.kt */
public abstract class MediaModule {
    public static final Companion Companion = new Companion(null);

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JH\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/MediaModule$Companion;", "", "()V", "providesMediaClient", "Lcom/bamtech/sdk4/internal/media/MediaClient;", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "converters", "Lcom/bamtech/sdk4/internal/networking/ConverterProvider;", "tokenProvider", "Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "pluginRegistry", "Lcom/bamtech/sdk4/plugin/PluginRegistry;", "pbsGenerator", "Lcom/bamtech/sdk4/internal/media/PbsGenerator;", "defaultQosPlaybackEventListener", "Lcom/bamtech/sdk4/media/DefaultQOSPlaybackEventListener;", "qosNetworkHelper", "Lcom/bamtech/sdk4/media/QOSNetworkHelper;", "widevineVerifier", "Lcom/bamtech/sdk4/internal/media/WidevineVerifier;", "providesMediaClients", "", "onlineMediaClient", "Lcom/bamtech/sdk4/internal/media/DefaultOnlineMediaClient;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: MediaModule.kt */
    public static final class Companion {
        private Companion() {
        }

        public final MediaClient providesMediaClient(ConfigurationProvider configurationProvider, ConverterProvider converterProvider, AccessTokenProvider accessTokenProvider, PluginRegistry pluginRegistry, PbsGenerator pbsGenerator, DefaultQOSPlaybackEventListener defaultQOSPlaybackEventListener, QOSNetworkHelper qOSNetworkHelper, WidevineVerifier widevineVerifier) {
            DefaultOnlineMediaClient defaultOnlineMediaClient = new DefaultOnlineMediaClient(configurationProvider, converterProvider, accessTokenProvider, pbsGenerator, defaultQOSPlaybackEventListener, qOSNetworkHelper, widevineVerifier);
            PluginRegistry pluginRegistry2 = pluginRegistry;
            pluginRegistry.registerExtension(defaultOnlineMediaClient);
            return defaultOnlineMediaClient;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final MediaClient providesMediaClient(ConfigurationProvider configurationProvider, ConverterProvider converterProvider, AccessTokenProvider accessTokenProvider, PluginRegistry pluginRegistry, PbsGenerator pbsGenerator, DefaultQOSPlaybackEventListener defaultQOSPlaybackEventListener, QOSNetworkHelper qOSNetworkHelper, WidevineVerifier widevineVerifier) {
        return Companion.providesMediaClient(configurationProvider, converterProvider, accessTokenProvider, pluginRegistry, pbsGenerator, defaultQOSPlaybackEventListener, qOSNetworkHelper, widevineVerifier);
    }
}
