package com.bamtech.sdk4.content.custom;

import com.bamtech.sdk4.content.ContentApiKt;
import com.bamtech.sdk4.content.ContentExtension;
import com.bamtech.sdk4.content.SearchOverrides;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import com.bamtech.sdk4.internal.telemetry.dust.DustExtensionsKt;
import javax.inject.Provider;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001d\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016JD\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u00100\t\"\u0004\b\u0000\u0010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00132\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016J:\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u00100\t\"\u0004\b\u0000\u0010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00132\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016JW\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u00100\t\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0012\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0016\"\u00020\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u0017J>\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u00100\t\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0012\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016JM\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u00100\t\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0012\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0016\"\u00020\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u0018J4\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u00100\t\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0012\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/custom/DefaultCustomContentApi;", "Lcom/bamtech/sdk4/content/custom/CustomContentApi;", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "extension", "Lcom/bamtech/sdk4/content/ContentExtension;", "(Ljavax/inject/Provider;Lcom/bamtech/sdk4/content/ContentExtension;)V", "query", "Lio/reactivex/Single;", "", "request", "Lcom/bamtech/sdk4/content/custom/GraphQlRequest;", "overrides", "Lcom/bamtech/sdk4/content/SearchOverrides;", "contentTransactionId", "Lcom/bamtech/sdk4/content/GraphQlResponse;", "T", "type", "Ljava/lang/Class;", "Ljava/lang/reflect/Type;", "parameters", "", "(Ljava/lang/reflect/Type;Lcom/bamtech/sdk4/content/custom/GraphQlRequest;Lcom/bamtech/sdk4/content/SearchOverrides;[Ljava/lang/reflect/Type;Ljava/lang/String;)Lio/reactivex/Single;", "(Ljava/lang/reflect/Type;Lcom/bamtech/sdk4/content/custom/GraphQlRequest;[Ljava/lang/reflect/Type;Ljava/lang/String;)Lio/reactivex/Single;", "Companion", "plugin-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: CustomContentApi.kt */
public final class DefaultCustomContentApi implements CustomContentApi {
    private final ContentExtension extension;
    private final Provider<ServiceTransaction> transactionProvider;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/custom/DefaultCustomContentApi$Companion;", "", "()V", "DUST_CONTENT_TRANSACTION_ID", "", "DUST_CONTEXT", "plugin-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: CustomContentApi.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new Companion(null);
    }

    public DefaultCustomContentApi(Provider<ServiceTransaction> provider, ContentExtension contentExtension) {
        this.transactionProvider = provider;
        this.extension = contentExtension;
    }

    public Single<String> query(GraphQlRequest graphQlRequest, String str) {
        return query(graphQlRequest, null, str);
    }

    public Single<String> query(GraphQlRequest graphQlRequest, SearchOverrides searchOverrides, String str) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        ContentExtension contentExtension = this.extension;
        Intrinsics.checkReturnedValueIsNotNull((Object) serviceTransaction, "transaction");
        return DustExtensionsKt.withDust(contentExtension.query(serviceTransaction, graphQlRequest, searchOverrides, str), serviceTransaction, ContentApiKt.getCONTENT_API_QUERY(Dust$Events.INSTANCE), (Object) C13173j0.m40356a(C12907r.m40244a("context", graphQlRequest.getContext()), C12907r.m40244a("contentTransactionId", str)));
    }
}
