package com.bamtech.sdk4.bookmarks;

import com.bamtech.sdk4.content.ContentExtension;
import com.bamtech.sdk4.content.GraphQlResponse;
import com.bamtech.sdk4.content.custom.GraphQlRequest;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import com.bamtech.sdk4.internal.telemetry.dust.DustExtensionsKt;
import com.bamtech.sdk4.service.NetworkException;
import java.util.List;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "Lcom/bamtech/sdk4/bookmarks/Bookmark;", "kotlin.jvm.PlatformType", "cachedValues", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: BookmarksApi.kt */
final class DefaultBookmarkApi$getBookmarks$1<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ List $contentIds;
    final /* synthetic */ String $contentTransactionId;
    final /* synthetic */ BookmarksQuery $request;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultBookmarkApi this$0;

    DefaultBookmarkApi$getBookmarks$1(DefaultBookmarkApi defaultBookmarkApi, ServiceTransaction serviceTransaction, BookmarksQuery bookmarksQuery, String str, List list) {
        this.this$0 = defaultBookmarkApi;
        this.$transaction = serviceTransaction;
        this.$request = bookmarksQuery;
        this.$contentTransactionId = str;
        this.$contentIds = list;
    }

    public final Single<List<Bookmark>> apply(final List<Bookmark> list) {
        ContentExtension access$getExtension$p = this.this$0.extension;
        ServiceTransaction serviceTransaction = this.$transaction;
        String str = "transaction";
        Intrinsics.checkReturnedValueIsNotNull((Object) serviceTransaction, str);
        Single query = access$getExtension$p.query(serviceTransaction, BookmarksResponse.class, (GraphQlRequest) this.$request, this.$contentTransactionId);
        ServiceTransaction serviceTransaction2 = this.$transaction;
        Intrinsics.checkReturnedValueIsNotNull((Object) serviceTransaction2, str);
        return DustExtensionsKt.withDust(query, serviceTransaction2, BookmarksApiKt.getCONTENT_API_QUERY(Dust$Events.INSTANCE), (Object) C13170i0.m40332a(C12907r.m40244a("context", this.$request.getContext()))).mo30233g(new Function<T, R>(this) {
            final /* synthetic */ DefaultBookmarkApi$getBookmarks$1 this$0;

            {
                this.this$0 = r1;
            }

            public final List<Bookmark> apply(GraphQlResponse<BookmarksResponse> graphQlResponse) {
                return this.this$0.this$0.mapResponseToBookmarks(graphQlResponse);
            }
        }).mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new Function<T, SingleSource<? extends R>>(this) {
            final /* synthetic */ DefaultBookmarkApi$getBookmarks$1 this$0;

            {
                this.this$0 = r1;
            }

            public final Single<List<List<Bookmark>>> apply(List<Bookmark> list) {
                DefaultBookmarkApi$getBookmarks$1 defaultBookmarkApi$getBookmarks$1 = this.this$0;
                DefaultBookmarkApi defaultBookmarkApi = defaultBookmarkApi$getBookmarks$1.this$0;
                List list2 = defaultBookmarkApi$getBookmarks$1.$contentIds;
                List list3 = list;
                Intrinsics.checkReturnedValueIsNotNull((Object) list3, "cachedValues");
                List findMissingIds$plugin_bookmarks_release = defaultBookmarkApi.findMissingIds$plugin_bookmarks_release(list2, list3, list);
                DefaultBookmarkApi$getBookmarks$1 defaultBookmarkApi$getBookmarks$12 = this.this$0;
                DefaultBookmarkApi defaultBookmarkApi2 = defaultBookmarkApi$getBookmarks$12.this$0;
                ServiceTransaction serviceTransaction = defaultBookmarkApi$getBookmarks$12.$transaction;
                Intrinsics.checkReturnedValueIsNotNull((Object) serviceTransaction, "transaction");
                return Single.m38384a((SingleSource<? extends T>) Single.m38399b(list), (SingleSource<? extends T>) defaultBookmarkApi2.fetchMissingBookmarks(serviceTransaction, this.this$0.$contentTransactionId, findMissingIds$plugin_bookmarks_release)).mo30100g();
            }
        }).mo30233g(new Function<T, R>(this) {
            final /* synthetic */ DefaultBookmarkApi$getBookmarks$1 this$0;

            {
                this.this$0 = r1;
            }

            public final List<Bookmark> apply(List<List<Bookmark>> list) {
                DefaultBookmarkApi defaultBookmarkApi = this.this$0.this$0;
                List list2 = list;
                Intrinsics.checkReturnedValueIsNotNull((Object) list2, "cachedValues");
                return defaultBookmarkApi.processBookmarks$plugin_bookmarks_release(list2, C13187p.m40528b((Iterable) list));
            }
        }).mo30235h(new Function<Throwable, SingleSource<? extends List<? extends Bookmark>>>() {
            public final SingleSource<? extends List<Bookmark>> apply(Throwable th) {
                if (th instanceof NetworkException) {
                    return Single.m38399b(list);
                }
                return Single.m38395a(th);
            }
        });
    }
}
