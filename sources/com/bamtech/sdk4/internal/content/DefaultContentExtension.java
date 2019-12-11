package com.bamtech.sdk4.internal.content;

import com.bamtech.sdk4.content.ContentExtension;
import com.bamtech.sdk4.content.GraphQlResponse;
import com.bamtech.sdk4.content.SearchOverrides;
import com.bamtech.sdk4.content.custom.GraphQlRequest;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.session.RenewSessionTransformers;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J2\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016JL\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u00160\u0011\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u00192\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016JB\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u00160\u0011\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u00192\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J_\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u00160\u0011\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u001c\"\u00020\u001a2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0002\u0010\u001dJF\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u00160\u0011\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016JU\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u00160\u0011\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u001c\"\u00020\u001a2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0002\u0010\u001eJ<\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u00160\u0011\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/content/DefaultContentExtension;", "Lcom/bamtech/sdk4/content/ContentExtension;", "tokenProvider", "Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "client", "Lcom/bamtech/sdk4/internal/content/ContentClient;", "sessionTransformers", "Lcom/bamtech/sdk4/session/RenewSessionTransformers;", "(Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;Lcom/bamtech/sdk4/internal/content/ContentClient;Lcom/bamtech/sdk4/session/RenewSessionTransformers;)V", "composeOptionalheaders", "", "Lcom/bamtech/sdk4/internal/content/OptionalHeaderTemplate;", "overrides", "Lcom/bamtech/sdk4/content/SearchOverrides;", "contentTransactionId", "", "query", "Lio/reactivex/Single;", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "request", "Lcom/bamtech/sdk4/content/custom/GraphQlRequest;", "Lcom/bamtech/sdk4/content/GraphQlResponse;", "T", "type", "Ljava/lang/Class;", "Ljava/lang/reflect/Type;", "parameters", "", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Ljava/lang/reflect/Type;Lcom/bamtech/sdk4/content/custom/GraphQlRequest;Lcom/bamtech/sdk4/content/SearchOverrides;[Ljava/lang/reflect/Type;Ljava/lang/String;)Lio/reactivex/Single;", "(Lcom/bamtech/sdk4/internal/service/ServiceTransaction;Ljava/lang/reflect/Type;Lcom/bamtech/sdk4/content/custom/GraphQlRequest;[Ljava/lang/reflect/Type;Ljava/lang/String;)Lio/reactivex/Single;", "extension-content"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultContentExtension.kt */
public final class DefaultContentExtension implements ContentExtension {
    /* access modifiers changed from: private */
    public final ContentClient client;
    private final RenewSessionTransformers sessionTransformers;
    private final AccessTokenProvider tokenProvider;

    public DefaultContentExtension(AccessTokenProvider accessTokenProvider, ContentClient contentClient, RenewSessionTransformers renewSessionTransformers) {
        this.tokenProvider = accessTokenProvider;
        this.client = contentClient;
        this.sessionTransformers = renewSessionTransformers;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        if (r4 != null) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.bamtech.sdk4.internal.content.OptionalHeaderTemplate> composeOptionalheaders(com.bamtech.sdk4.content.SearchOverrides r4, java.lang.String r5) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0009
            java.util.List r4 = com.bamtech.sdk4.internal.content.ContentClientKt.toTemplates(r4)
            if (r4 == 0) goto L_0x0009
            goto L_0x000d
        L_0x0009:
            java.util.List r4 = kotlin.p590y.C13185o.m40513a()
        L_0x000d:
            if (r5 == 0) goto L_0x001c
            com.bamtech.sdk4.internal.content.OptionalHeaderTemplate r0 = new com.bamtech.sdk4.internal.content.OptionalHeaderTemplate
            java.lang.String r1 = "X-Content-Transaction-ID"
            java.lang.String r2 = "{contentTransactionId}"
            r0.<init>(r1, r2, r5)
            java.util.List r4 = kotlin.p590y.C13199w.m40563a(r4, r0)
        L_0x001c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.content.DefaultContentExtension.composeOptionalheaders(com.bamtech.sdk4.content.SearchOverrides, java.lang.String):java.util.List");
    }

    public Single<String> query(ServiceTransaction serviceTransaction, GraphQlRequest graphQlRequest, SearchOverrides searchOverrides, String str) {
        Single b = this.tokenProvider.getAccessToken(serviceTransaction).mo30220b(C11934b.m38500b());
        DefaultContentExtension$query$1 defaultContentExtension$query$1 = new DefaultContentExtension$query$1(this, serviceTransaction, graphQlRequest, searchOverrides, str);
        Single<String> a = b.mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) defaultContentExtension$query$1).mo30206a(this.sessionTransformers.singleRenewSession(serviceTransaction));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "tokenProvider.getAccessT…enewSession(transaction))");
        return a;
    }

    public <T> Single<GraphQlResponse<T>> query(ServiceTransaction serviceTransaction, Type type, GraphQlRequest graphQlRequest, SearchOverrides searchOverrides, String str) {
        Single b = this.tokenProvider.getAccessToken(serviceTransaction).mo30220b(C11934b.m38500b());
        DefaultContentExtension$query$2 defaultContentExtension$query$2 = new DefaultContentExtension$query$2(this, serviceTransaction, graphQlRequest, type, searchOverrides, str);
        Single<GraphQlResponse<T>> a = b.mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) defaultContentExtension$query$2).mo30206a(this.sessionTransformers.singleRenewSession(serviceTransaction));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "tokenProvider.getAccessT…enewSession(transaction))");
        return a;
    }

    public <T> Single<GraphQlResponse<T>> query(ServiceTransaction serviceTransaction, Class<T> cls, GraphQlRequest graphQlRequest, String str) {
        return query(serviceTransaction, cls, graphQlRequest, (SearchOverrides) null, str);
    }

    public <T> Single<GraphQlResponse<T>> query(ServiceTransaction serviceTransaction, Class<T> cls, GraphQlRequest graphQlRequest, SearchOverrides searchOverrides, String str) {
        Single b = this.tokenProvider.getAccessToken(serviceTransaction).mo30220b(C11934b.m38500b());
        DefaultContentExtension$query$3 defaultContentExtension$query$3 = new DefaultContentExtension$query$3(this, serviceTransaction, graphQlRequest, cls, searchOverrides, str);
        Single<GraphQlResponse<T>> a = b.mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) defaultContentExtension$query$3).mo30206a(this.sessionTransformers.singleRenewSession(serviceTransaction));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "tokenProvider.getAccessT…enewSession(transaction))");
        return a;
    }
}
