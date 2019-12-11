package com.bamtech.sdk4.internal.media;

import com.bamtech.core.networking.C1681c;
import com.bamtech.core.networking.C1691e;
import com.bamtech.core.networking.Link;
import com.bamtech.core.networking.Link.Builder;
import com.bamtech.core.networking.QueryParams;
import com.bamtech.core.networking.Request;
import com.bamtech.core.networking.handlers.DefaultResponseTransformer;
import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.BifThumbnailSet;
import com.bamtech.sdk4.MediaThumbnailLink;
import com.bamtech.sdk4.ThumbnailResolution;
import com.bamtech.sdk4.internal.configuration.Configuration;
import com.bamtech.sdk4.internal.configuration.ConfigurationKt;
import com.bamtech.sdk4.internal.configuration.MediaServiceConfigurationKt;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Maybe;", "", "Lcom/bamtech/sdk4/BifThumbnailSet;", "kotlin.jvm.PlatformType", "call"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultOnlineMediaClient.kt */
final class DefaultOnlineMediaClient$getBifThumbnails$1<V> implements Callable<MaybeSource<? extends T>> {
    final /* synthetic */ ThumbnailResolution $resolution;
    final /* synthetic */ MediaThumbnailLink $thumbnailLink;
    final /* synthetic */ Map $tokenMap;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultOnlineMediaClient this$0;

    DefaultOnlineMediaClient$getBifThumbnails$1(DefaultOnlineMediaClient defaultOnlineMediaClient, ServiceTransaction serviceTransaction, MediaThumbnailLink mediaThumbnailLink, ThumbnailResolution thumbnailResolution, Map map) {
        this.this$0 = defaultOnlineMediaClient;
        this.$transaction = serviceTransaction;
        this.$thumbnailLink = mediaThumbnailLink;
        this.$resolution = thumbnailResolution;
        this.$tokenMap = map;
    }

    public final Maybe<List<BifThumbnailSet>> call() {
        return this.this$0.configurationProvider.getServiceLink(this.$transaction, C19211.INSTANCE).mo30221c((Function<? super T, ? extends MaybeSource<? extends R>>) new Function<T, MaybeSource<? extends R>>(this) {
            final /* synthetic */ DefaultOnlineMediaClient$getBifThumbnails$1 this$0;

            {
                this.this$0 = r1;
            }

            public final Maybe<List<BifThumbnailSet>> apply(Pair<Link, Configuration> pair) {
                Link link = (Link) pair.mo31013a();
                Configuration configuration = (Configuration) pair.mo31014b();
                if (this.this$0.$thumbnailLink.getHref() == null) {
                    return Maybe.m38259h();
                }
                Builder linkBuilder = link.toLinkBuilder();
                String href = this.this$0.$thumbnailLink.getHref();
                if (href != null) {
                    Link a = linkBuilder.mo7434b(href).mo7438c(this.this$0.$thumbnailLink.getMethod()).mo7435b((Function1<? super QueryParams.Builder, C13145v>) new Function1<QueryParams.Builder, C13145v>(this) {
                        final /* synthetic */ C19222 this$0;

                        {
                            this.this$0 = r1;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((QueryParams.Builder) obj);
                            return C13145v.f29587a;
                        }

                        public final void invoke(QueryParams.Builder builder) {
                            ThumbnailResolution thumbnailResolution = this.this$0.this$0.$resolution;
                            if (thumbnailResolution != ThumbnailResolution.ALL) {
                                builder.mo7475a(C13170i0.m40332a(new Pair("resolution", thumbnailResolution.name())));
                            }
                        }
                    }).mo7432a();
                    Map headers = this.this$0.$thumbnailLink.getHeaders();
                    if (headers == null) {
                        headers = C13173j0.m40350a();
                    }
                    Link updateTemplates$default = Link.updateTemplates$default(a.withHeaders(headers), this.this$0.$tokenMap, null, 2, null);
                    OkHttpClient client = this.this$0.$transaction.getClient();
                    DefaultOnlineMediaClient$getBifThumbnails$1 defaultOnlineMediaClient$getBifThumbnails$1 = this.this$0;
                    ServiceTransaction serviceTransaction = defaultOnlineMediaClient$getBifThumbnails$1.$transaction;
                    DefaultOnlineMediaClient$getBifThumbnails$1 defaultOnlineMediaClient$getBifThumbnails$12 = this.this$0;
                    Request a2 = C1691e.m7798a(updateTemplates$default, client, new DefaultResponseTransformer(new C1895x65df2007(new ResponseHandler[]{new C1893x986ada78(defaultOnlineMediaClient$getBifThumbnails$1.this$0.getConverters$sdk_core_api_release().getIdentity()), defaultOnlineMediaClient$getBifThumbnails$12.this$0.thumbnailErrorResponseHandler(defaultOnlineMediaClient$getBifThumbnails$12.$transaction)}, serviceTransaction), new C1896x65df2008(serviceTransaction)), null, ConfigurationKt.toDustConfigSettings(configuration), 4, null);
                    ServiceTransaction serviceTransaction2 = this.this$0.$transaction;
                    String bif_thumbnails = MediaServiceConfigurationKt.getBIF_THUMBNAILS(Dust$Events.INSTANCE);
                    Call a3 = C1691e.m7799a(a2);
                    Maybe b = C1681c.m7780a(a2, a3).mo30234h().mo30124c((C11945a) new C1897x2456365c(a3)).mo30119b(C11934b.m38500b());
                    Intrinsics.checkReturnedValueIsNotNull((Object) b, "call(this, call)\n       …scribeOn(Schedulers.io())");
                    Maybe a4 = b.mo30116b((Consumer<? super Disposable>) new C1898x2456365d<Object>(serviceTransaction2, bif_thumbnails)).mo30102a((Consumer<? super Throwable>) new C1899x2456365e<Object>(a2, serviceTransaction2, bif_thumbnails)).mo30103a((Function<? super T, ? extends MaybeSource<? extends R>>) new C1900x2456365f<Object,Object>(serviceTransaction2, bif_thumbnails));
                    Intrinsics.checkReturnedValueIsNotNull((Object) a4, "this.asMaybe()\n        .…)\n            }\n        }");
                    return a4.mo30119b(C11934b.m38500b()).mo30131f(C19242.INSTANCE);
                }
                Intrinsics.throwNpe();
                throw null;
            }
        });
    }
}
