package com.bamtech.sdk4.internal.media;

import com.bamtech.core.networking.C1681c;
import com.bamtech.core.networking.C1691e;
import com.bamtech.core.networking.Link;
import com.bamtech.core.networking.Request;
import com.bamtech.core.networking.handlers.DefaultResponseTransformer;
import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.internal.configuration.Configuration;
import com.bamtech.sdk4.internal.configuration.ConfigurationKt;
import com.bamtech.sdk4.internal.configuration.DrmServiceConfiguration;
import com.bamtech.sdk4.internal.configuration.MediaServiceConfiguration;
import com.bamtech.sdk4.internal.configuration.MediaServiceConfigurationKt;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import com.bamtech.sdk4.media.MediaDescriptor;
import com.bamtech.sdk4.media.MediaItem;
import com.bamtech.sdk4.media.PlaybackContext;
import com.bamtech.sdk4.media.drm.DrmType;
import java.util.Map;
import java.util.UUID;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/media/MediaItem;", "kotlin.jvm.PlatformType", "accessToken", "", "Lcom/bamtech/sdk4/core/types/JWT;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultOnlineMediaClient.kt */
final class DefaultOnlineMediaClient$getVerifiedMediaItem$1<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ boolean $allowL1;
    final /* synthetic */ MediaDescriptor $descriptor;
    final /* synthetic */ PlaybackContext $playbackContext;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultOnlineMediaClient this$0;

    DefaultOnlineMediaClient$getVerifiedMediaItem$1(DefaultOnlineMediaClient defaultOnlineMediaClient, ServiceTransaction serviceTransaction, PlaybackContext playbackContext, MediaDescriptor mediaDescriptor, boolean z) {
        this.this$0 = defaultOnlineMediaClient;
        this.$transaction = serviceTransaction;
        this.$playbackContext = playbackContext;
        this.$descriptor = mediaDescriptor;
        this.$allowL1 = z;
    }

    public final Single<MediaItem> apply(final String str) {
        return this.this$0.configurationProvider.getServiceConfigurations(this.$transaction, C19251.INSTANCE, C19262.INSTANCE).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new Function<T, SingleSource<? extends R>>(this) {
            final /* synthetic */ DefaultOnlineMediaClient$getVerifiedMediaItem$1 this$0;

            {
                this.this$0 = r1;
            }

            public final Single<MediaItem> apply(Pair<MediaServiceConfiguration, DrmServiceConfiguration> pair) {
                final UUID uuid;
                final DefaultOnlineMediaClient$getVerifiedMediaItem$1$3$qosCallback$1 defaultOnlineMediaClient$getVerifiedMediaItem$1$3$qosCallback$1 = new DefaultOnlineMediaClient$getVerifiedMediaItem$1$3$qosCallback$1(this);
                final MediaServiceConfiguration mediaServiceConfiguration = (MediaServiceConfiguration) pair.mo31015c();
                DrmServiceConfiguration drmServiceConfiguration = (DrmServiceConfiguration) pair.mo31016d();
                if (Intrinsics.areEqual((Object) this.this$0.$descriptor.getDrmType(), (Object) DrmType.WIDEVINE)) {
                    uuid = UUID.fromString("edef8ba9-79d6-4ace-a3c8-27dcd51d21ed");
                } else if (Intrinsics.areEqual((Object) this.this$0.$descriptor.getDrmType(), (Object) DrmType.PLAYREADY) || drmServiceConfiguration.getExtras().getPlayReadyPreferred()) {
                    uuid = UUID.fromString("9a04f079-9840-4286-ab92-e65be0885f95");
                } else {
                    uuid = null;
                }
                PbsGenerator pbsGenerator = this.this$0.this$0.getPbsGenerator();
                DefaultOnlineMediaClient$getVerifiedMediaItem$1 defaultOnlineMediaClient$getVerifiedMediaItem$1 = this.this$0;
                MediaDescriptor mediaDescriptor = defaultOnlineMediaClient$getVerifiedMediaItem$1.$descriptor;
                final Map a = C13173j0.m40356a(C12907r.m40244a("{accessToken}", str), C12907r.m40244a("{scenario}", pbsGenerator.generateScenario$sdk_core_api_release(mediaDescriptor, mediaServiceConfiguration, defaultOnlineMediaClient$getVerifiedMediaItem$1.$allowL1 || Intrinsics.areEqual((Object) mediaDescriptor.getDrmType(), (Object) DrmType.PLAYREADY))));
                return this.this$0.this$0.configurationProvider.getServiceLink(this.this$0.$transaction, C19281.INSTANCE).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new Function<T, SingleSource<? extends R>>(this) {
                    final /* synthetic */ C19273 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final Single<Stream> apply(Pair<Link, Configuration> pair) {
                        Link link = (Link) pair.mo31013a();
                        Configuration configuration = (Configuration) pair.mo31014b();
                        Link updateTemplates = link.updateTemplates(a, this.this$0.this$0.$descriptor.getPlaybackUrl());
                        OkHttpClient client = this.this$0.this$0.$transaction.getClient();
                        DefaultOnlineMediaClient$getVerifiedMediaItem$1 defaultOnlineMediaClient$getVerifiedMediaItem$1 = this.this$0.this$0;
                        ServiceTransaction serviceTransaction = defaultOnlineMediaClient$getVerifiedMediaItem$1.$transaction;
                        Function4 function4 = defaultOnlineMediaClient$getVerifiedMediaItem$1$3$qosCallback$1;
                        Request a = C1691e.m7798a(updateTemplates, client, new DefaultResponseTransformer(new C1913x384910d7(new ResponseHandler[]{new C1915x3a15c950(defaultOnlineMediaClient$getVerifiedMediaItem$1.this$0.getConverters$sdk_core_api_release().getIdentity())}, serviceTransaction, function4), new C1914x384910d8(serviceTransaction, function4)), null, ConfigurationKt.toDustConfigSettings(configuration), 4, null);
                        ServiceTransaction serviceTransaction2 = this.this$0.this$0.$transaction;
                        String media_payload = MediaServiceConfigurationKt.getMEDIA_PAYLOAD(Dust$Events.INSTANCE);
                        Call a2 = C1691e.m7799a(a);
                        Single b = C1681c.m7780a(a, a2).mo30223c((C11945a) new C1917xe8445876(a2)).mo30220b(C11934b.m38500b());
                        Intrinsics.checkReturnedValueIsNotNull((Object) b, "call(this, call)\n       …scribeOn(Schedulers.io())");
                        Single<Stream> g = b.mo30222c((Consumer<? super Disposable>) new C1918xe8445877<Object>(serviceTransaction2, media_payload)).mo30218b((Consumer<? super Throwable>) new C1919xe8445878<Object>(a, serviceTransaction2, media_payload)).mo30233g(new C1920xe8445879(serviceTransaction2, media_payload));
                        Intrinsics.checkReturnedValueIsNotNull((Object) g, "this.asSingle()\n        …        it.body\n        }");
                        return g;
                    }
                }).mo30233g(new Function<T, R>(this) {
                    final /* synthetic */ C19273 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final MediaItem apply(Stream stream) {
                        OnlineMediaItem onlineMediaItem = new OnlineMediaItem(stream, this.this$0.this$0.$descriptor, mediaServiceConfiguration.getDefaultPlaylistType(), uuid, this.this$0.this$0.$playbackContext);
                        return onlineMediaItem;
                    }
                });
            }
        });
    }
}
