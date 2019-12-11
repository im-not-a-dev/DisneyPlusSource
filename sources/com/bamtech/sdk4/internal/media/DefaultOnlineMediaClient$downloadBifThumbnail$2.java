package com.bamtech.sdk4.internal.media;

import com.bamtech.core.networking.C1691e;
import com.bamtech.core.networking.Link;
import com.bamtech.core.networking.handlers.DefaultResponseTransformer;
import com.bamtech.core.networking.handlers.ResponseHandler;
import com.bamtech.sdk4.Presentation;
import com.bamtech.sdk4.internal.configuration.Configuration;
import com.bamtech.sdk4.internal.configuration.ConfigurationKt;
import com.bamtech.sdk4.internal.configuration.MediaServiceConfigurationKt;
import com.bamtech.sdk4.internal.service.ResponseHandlersKt;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import okhttp3.OkHttpClient;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Completable;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/bamtech/core/networking/Link;", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultOnlineMediaClient.kt */
final class DefaultOnlineMediaClient$downloadBifThumbnail$2<T, R> implements Function<Pair<? extends Link, ? extends Configuration>, CompletableSource> {
    final /* synthetic */ File $filePath;
    final /* synthetic */ Presentation $presentation;
    final /* synthetic */ Map $tokenMap;
    final /* synthetic */ ServiceTransaction $transaction;

    DefaultOnlineMediaClient$downloadBifThumbnail$2(Presentation presentation, Map map, ServiceTransaction serviceTransaction, File file) {
        this.$presentation = presentation;
        this.$tokenMap = map;
        this.$transaction = serviceTransaction;
        this.$filePath = file;
    }

    public final Completable apply(Pair<Link, Configuration> pair) {
        Link link = (Link) pair.mo31013a();
        Configuration configuration = (Configuration) pair.mo31014b();
        Link updateTemplates$default = Link.updateTemplates$default(link.toLinkBuilder().mo7434b((String) C13199w.m40589f(this.$presentation.getPaths())).mo7432a(), this.$tokenMap, null, 2, null);
        OkHttpClient client = this.$transaction.getClient();
        ServiceTransaction serviceTransaction = this.$transaction;
        return C1169c.m6002a(C1691e.m7798a(updateTemplates$default, client, new DefaultResponseTransformer(new C1891xb43466df(new ResponseHandler[]{ResponseHandlersKt.fileResponseHandler(serviceTransaction, this.$filePath)}, serviceTransaction), new C1892xb43466e0(serviceTransaction)), null, ConfigurationKt.toDustConfigSettings(configuration), 4, null), this.$transaction, MediaServiceConfigurationKt.getBIF_THUMBNAIL(Dust$Events.INSTANCE));
    }
}
