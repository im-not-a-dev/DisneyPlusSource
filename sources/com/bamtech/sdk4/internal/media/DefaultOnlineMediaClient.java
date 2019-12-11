package com.bamtech.sdk4.internal.media;

import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.BifThumbnailSet;
import com.bamtech.sdk4.MediaThumbnailLink;
import com.bamtech.sdk4.Presentation;
import com.bamtech.sdk4.ThumbnailManifest;
import com.bamtech.sdk4.ThumbnailResolution;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.media.DefaultQOSPlaybackEventListener;
import com.bamtech.sdk4.media.MediaDescriptor;
import com.bamtech.sdk4.media.MediaItem;
import com.bamtech.sdk4.media.PlaybackContext;
import com.bamtech.sdk4.media.Playhead;
import com.bamtech.sdk4.media.PlayheadBookmarkBuilder;
import com.bamtech.sdk4.media.QOSNetworkHelper;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B?\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J8\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0#j\u0002`%H\u0016JD\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0'2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0#j\u0002`%H\u0016J(\u0010.\u001a\b\u0012\u0004\u0012\u00020/0'2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0016J2\u00104\u001a\b\u0012\u0004\u0012\u000206052\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0#2\u0006\u00107\u001a\u00020$H\u0016J6\u00108\u001a\b\u0012\u0004\u0012\u0002090'2\u0006\u0010\u001c\u001a\u00020\u001d2\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0#j\u0002`%2\u0006\u0010:\u001a\u00020$H\u0016J0\u0010;\u001a\b\u0012\u0004\u0012\u00020/0'2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\u0006\u0010<\u001a\u00020=H\u0002J\u000e\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?H\u0002J\u000e\u0010A\u001a\b\u0012\u0004\u0012\u0002060?H\u0002J\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00020C0?2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0016\u0010D\u001a\b\u0012\u0004\u0012\u00020\u0017052\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006E"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/DefaultOnlineMediaClient;", "Lcom/bamtech/sdk4/internal/media/MediaClient;", "Lcom/bamtech/sdk4/internal/media/SilkDrmClient;", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "converters", "Lcom/bamtech/sdk4/internal/networking/ConverterProvider;", "tokenProvider", "Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "pbsGenerator", "Lcom/bamtech/sdk4/internal/media/PbsGenerator;", "defaultQosPlaybackEventListener", "Lcom/bamtech/sdk4/media/DefaultQOSPlaybackEventListener;", "qosNetworkHelper", "Lcom/bamtech/sdk4/media/QOSNetworkHelper;", "widevineVerifier", "Lcom/bamtech/sdk4/internal/media/WidevineVerifier;", "(Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;Lcom/bamtech/sdk4/internal/networking/ConverterProvider;Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;Lcom/bamtech/sdk4/internal/media/PbsGenerator;Lcom/bamtech/sdk4/media/DefaultQOSPlaybackEventListener;Lcom/bamtech/sdk4/media/QOSNetworkHelper;Lcom/bamtech/sdk4/internal/media/WidevineVerifier;)V", "getConverters$sdk_core_api_release", "()Lcom/bamtech/sdk4/internal/networking/ConverterProvider;", "getPbsGenerator", "()Lcom/bamtech/sdk4/internal/media/PbsGenerator;", "thumbnailHttpClient", "Lokhttp3/OkHttpClient;", "thumbnailHttpTimeout", "", "downloadBifThumbnail", "Lio/reactivex/Completable;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "presentation", "Lcom/bamtech/sdk4/Presentation;", "filePath", "Ljava/io/File;", "tokenMap", "", "", "Lcom/bamtech/sdk4/internal/service/TokenMap;", "getBifThumbnails", "Lio/reactivex/Maybe;", "", "Lcom/bamtech/sdk4/BifThumbnailSet;", "thumbnailLink", "Lcom/bamtech/sdk4/MediaThumbnailLink;", "resolution", "Lcom/bamtech/sdk4/ThumbnailResolution;", "getMediaItem", "Lcom/bamtech/sdk4/media/MediaItem;", "descriptor", "Lcom/bamtech/sdk4/media/MediaDescriptor;", "playbackContext", "Lcom/bamtech/sdk4/media/PlaybackContext;", "getMediaKey", "Lio/reactivex/Single;", "", "url", "getPlayhead", "Lcom/bamtech/sdk4/media/Playhead;", "profileId", "getVerifiedMediaItem", "allowL1", "", "playheadResponseHandler", "Lcom/bamtech/core/networking/handlers/ResponseHandler;", "Lcom/bamtech/sdk4/media/PlayheadBookmarkBuilder;", "responseHandler", "thumbnailErrorResponseHandler", "Lcom/bamtech/sdk4/ThumbnailManifest;", "updateOkHttpClient", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultOnlineMediaClient.kt */
public final class DefaultOnlineMediaClient implements MediaClient, SilkDrmClient {
    /* access modifiers changed from: private */
    public final ConfigurationProvider configurationProvider;
    private final ConverterProvider converters;
    /* access modifiers changed from: private */
    public final DefaultQOSPlaybackEventListener defaultQosPlaybackEventListener;
    private final PbsGenerator pbsGenerator;
    /* access modifiers changed from: private */
    public final QOSNetworkHelper qosNetworkHelper;
    private final AccessTokenProvider tokenProvider;
    private final WidevineVerifier widevineVerifier;

    public DefaultOnlineMediaClient(ConfigurationProvider configurationProvider2, ConverterProvider converterProvider, AccessTokenProvider accessTokenProvider, PbsGenerator pbsGenerator2, DefaultQOSPlaybackEventListener defaultQOSPlaybackEventListener, QOSNetworkHelper qOSNetworkHelper, WidevineVerifier widevineVerifier2) {
        this.configurationProvider = configurationProvider2;
        this.converters = converterProvider;
        this.tokenProvider = accessTokenProvider;
        this.pbsGenerator = pbsGenerator2;
        this.defaultQosPlaybackEventListener = defaultQOSPlaybackEventListener;
        this.qosNetworkHelper = qOSNetworkHelper;
        this.widevineVerifier = widevineVerifier2;
    }

    /* access modifiers changed from: private */
    public final Maybe<MediaItem> getVerifiedMediaItem(ServiceTransaction serviceTransaction, MediaDescriptor mediaDescriptor, PlaybackContext playbackContext, boolean z) {
        Single accessToken = this.tokenProvider.getAccessToken(serviceTransaction);
        DefaultOnlineMediaClient$getVerifiedMediaItem$1 defaultOnlineMediaClient$getVerifiedMediaItem$1 = new DefaultOnlineMediaClient$getVerifiedMediaItem$1(this, serviceTransaction, playbackContext, mediaDescriptor, z);
        Maybe<MediaItem> h = accessToken.mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) defaultOnlineMediaClient$getVerifiedMediaItem$1).mo30234h();
        C12880j.m40222a((Object) h, "tokenProvider.getAccessT…               .toMaybe()");
        return h;
    }

    /* access modifiers changed from: private */
    public final ResponseHandler<PlayheadBookmarkBuilder> playheadResponseHandler() {
        return new DefaultOnlineMediaClient$playheadResponseHandler$1(this);
    }

    /* access modifiers changed from: private */
    public final ResponseHandler<byte[]> responseHandler() {
        return new DefaultOnlineMediaClient$responseHandler$1(this);
    }

    /* access modifiers changed from: private */
    public final ResponseHandler<ThumbnailManifest> thumbnailErrorResponseHandler(ServiceTransaction serviceTransaction) {
        return new DefaultOnlineMediaClient$thumbnailErrorResponseHandler$1(serviceTransaction);
    }

    public Completable downloadBifThumbnail(ServiceTransaction serviceTransaction, Presentation presentation, File file, Map<String, String> map) {
        Completable b = this.configurationProvider.getServiceLink(serviceTransaction, DefaultOnlineMediaClient$downloadBifThumbnail$1.INSTANCE).mo30217b((Function<? super T, ? extends CompletableSource>) new DefaultOnlineMediaClient$downloadBifThumbnail$2<Object,Object>(presentation, map, serviceTransaction, file)).mo30051b(C11934b.m38500b());
        C12880j.m40222a((Object) b, "configurationProvider.ge…scribeOn(Schedulers.io())");
        return b;
    }

    public Maybe<List<BifThumbnailSet>> getBifThumbnails(ServiceTransaction serviceTransaction, MediaThumbnailLink mediaThumbnailLink, ThumbnailResolution thumbnailResolution, Map<String, String> map) {
        DefaultOnlineMediaClient$getBifThumbnails$1 defaultOnlineMediaClient$getBifThumbnails$1 = new DefaultOnlineMediaClient$getBifThumbnails$1(this, serviceTransaction, mediaThumbnailLink, thumbnailResolution, map);
        Maybe<List<BifThumbnailSet>> a = Maybe.m38256a((Callable<? extends MaybeSource<? extends T>>) defaultOnlineMediaClient$getBifThumbnails$1);
        C12880j.m40222a((Object) a, "Maybe.defer {\n          …              }\n        }");
        return a;
    }

    public final ConverterProvider getConverters$sdk_core_api_release() {
        return this.converters;
    }

    public Maybe<MediaItem> getMediaItem(ServiceTransaction serviceTransaction, MediaDescriptor mediaDescriptor, PlaybackContext playbackContext) {
        Maybe<MediaItem> c = this.widevineVerifier.supportsV1(serviceTransaction).mo30221c((Function<? super T, ? extends MaybeSource<? extends R>>) new DefaultOnlineMediaClient$getMediaItem$1<Object,Object>(this, serviceTransaction, mediaDescriptor, playbackContext));
        C12880j.m40222a((Object) c, "widevineVerifier.support…ntext, allowL1)\n        }");
        return c;
    }

    public Single<byte[]> getMediaKey(ServiceTransaction serviceTransaction, Map<String, String> map, String str) {
        Single<byte[]> a = this.configurationProvider.getServiceLink(serviceTransaction, DefaultOnlineMediaClient$getMediaKey$1$1.INSTANCE).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultOnlineMediaClient$getMediaKey$$inlined$with$lambda$1<Object,Object>(this, serviceTransaction, map, str));
        C12880j.m40222a((Object) a, "configurationProvider.ge…EY)\n                    }");
        return a;
    }

    public final PbsGenerator getPbsGenerator() {
        return this.pbsGenerator;
    }

    public Maybe<Playhead> getPlayhead(ServiceTransaction serviceTransaction, Map<String, String> map, String str) {
        Maybe<Playhead> c = this.configurationProvider.getServiceLink(serviceTransaction, DefaultOnlineMediaClient$getPlayhead$1.INSTANCE).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new DefaultOnlineMediaClient$getPlayhead$2<Object,Object>(this, map, serviceTransaction)).mo30221c((Function<? super T, ? extends MaybeSource<? extends R>>) new DefaultOnlineMediaClient$getPlayhead$3<Object,Object>(str));
        C12880j.m40222a((Object) c, "configurationProvider.ge…      }\n                }");
        return c;
    }
}
