package com.bamtech.sdk4.content.search;

import com.bamtech.sdk4.content.ContentApiKt;
import com.bamtech.sdk4.content.ContentExtension;
import com.bamtech.sdk4.content.GraphQlResponse;
import com.bamtech.sdk4.content.SearchOverrides;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import com.bamtech.sdk4.internal.telemetry.dust.DustExtensionsKt;
import java.lang.reflect.Type;
import javax.inject.Provider;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007JF\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\t\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0016J<\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\t\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0016J2\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0016J(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0016J>\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\t\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0016JF\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\t\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0016J<\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\t\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0016J4\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\t\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0016J2\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0016J(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0016J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/search/DefaultSearchApi;", "Lcom/bamtech/sdk4/content/search/SearchApi;", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "extension", "Lcom/bamtech/sdk4/content/ContentExtension;", "(Ljavax/inject/Provider;Lcom/bamtech/sdk4/content/ContentExtension;)V", "customSearch", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/content/GraphQlResponse;", "T", "type", "Ljava/lang/reflect/Type;", "query", "", "variables", "", "overrides", "Lcom/bamtech/sdk4/content/SearchOverrides;", "contentTransactionId", "search", "queryId", "Companion", "plugin-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SearchApi.kt */
public final class DefaultSearchApi implements SearchApi {
    private final ContentExtension extension;
    private final Provider<ServiceTransaction> transactionProvider;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/content/search/DefaultSearchApi$Companion;", "", "()V", "DUST_CONTENT_TRANSACTION_ID", "", "DUST_CONTEXT", "DUST_QUERY_ID", "plugin-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: SearchApi.kt */
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

    public DefaultSearchApi(Provider<ServiceTransaction> provider, ContentExtension contentExtension) {
        this.transactionProvider = provider;
        this.extension = contentExtension;
    }

    public <T> Single<GraphQlResponse<T>> search(Type type, String str, Object obj, SearchOverrides searchOverrides, String str2) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        SearchQuery searchQuery = new SearchQuery(str, null, obj, 2, null);
        ContentExtension contentExtension = this.extension;
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        return DustExtensionsKt.withDust(contentExtension.query(serviceTransaction, type, searchQuery, searchOverrides, str2), serviceTransaction, ContentApiKt.getCONTENT_API_QUERY(Dust$Events.INSTANCE), (Object) C13173j0.m40356a(C12907r.m40244a("context", searchQuery.getContext()), C12907r.m40244a("queryId", str), C12907r.m40244a("contentTransactionId", str2)));
    }
}
