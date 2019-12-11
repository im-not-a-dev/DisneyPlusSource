package com.bamtech.sdk4.internal.content;

import com.bamtech.sdk4.content.GraphQlResponse;
import com.bamtech.sdk4.content.SearchOverrides;
import com.bamtech.sdk4.content.custom.GraphQlRequest;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.lang.reflect.Type;
import kotlin.C12907r;
import kotlin.Metadata;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/content/GraphQlResponse;", "T", "accessToken", "", "Lcom/bamtech/sdk4/core/types/JWT;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultContentExtension.kt */
final class DefaultContentExtension$query$2<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ String $contentTransactionId;
    final /* synthetic */ SearchOverrides $overrides;
    final /* synthetic */ GraphQlRequest $request;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ Type $type;
    final /* synthetic */ DefaultContentExtension this$0;

    DefaultContentExtension$query$2(DefaultContentExtension defaultContentExtension, ServiceTransaction serviceTransaction, GraphQlRequest graphQlRequest, Type type, SearchOverrides searchOverrides, String str) {
        this.this$0 = defaultContentExtension;
        this.$transaction = serviceTransaction;
        this.$request = graphQlRequest;
        this.$type = type;
        this.$overrides = searchOverrides;
        this.$contentTransactionId = str;
    }

    public final Single<GraphQlResponse<T>> apply(String str) {
        return this.this$0.client.typedQuery(this.$transaction, C13170i0.m40332a(C12907r.m40244a("{accessToken}", str)), this.$request, this.$type, this.this$0.composeOptionalheaders(this.$overrides, this.$contentTransactionId), C13173j0.m40350a());
    }
}
