package com.bamtech.sdk4.bookmarks;

import android.annotation.SuppressLint;
import com.bamtech.sdk4.bookmarks.BookmarksResponse.BookmarkData;
import com.bamtech.sdk4.bookmarks.storage.LocalBookmarkStore;
import com.bamtech.sdk4.content.ContentExtension;
import com.bamtech.sdk4.content.GraphQlResponse;
import com.bamtech.sdk4.content.custom.GraphQlRequest;
import com.bamtech.sdk4.content.search.SearchQuery;
import com.bamtech.sdk4.internal.bookmarks.ContentVariables;
import com.bamtech.sdk4.internal.bookmarks.DmcVideoResponse;
import com.bamtech.sdk4.internal.bookmarks.DmcVideoResponse.BookmarkRuntime;
import com.bamtech.sdk4.internal.event.LogoutMode;
import com.bamtech.sdk4.internal.event.UserProfileEvent;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import com.bamtech.sdk4.internal.telemetry.dust.DustExtensionsKt;
import com.bamtech.sdk4.service.InvalidRequestException;
import com.bamtech.sdk4.session.SessionInfoExtension;
import com.bamtech.sdk4.session.SessionInfoExtension.DefaultImpls;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.C11947c;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;
import p520io.reactivex.subjects.PublishSubject;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003¢\u0006\u0002\u0010\u0010J4\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\u0006\u0010\u0015\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013H\u0002J=\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0000¢\u0006\u0002\b\u001dJ,\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\"\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013H\u0016J4\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00130\u00122\u0006\u0010\u0015\u001a\u00020\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u0016\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'H\u0002J/\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0000¢\u0006\u0002\b,J\r\u0010-\u001a\u00020.H\u0001¢\u0006\u0002\b/J\r\u00100\u001a\u00020#H\u0000¢\u0006\u0002\b1R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u00062"}, mo31007d2 = {"Lcom/bamtech/sdk4/bookmarks/DefaultBookmarkApi;", "Lcom/bamtech/sdk4/bookmarks/BookmarksApi;", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "extension", "Lcom/bamtech/sdk4/content/ContentExtension;", "localBookmarkStore", "Lcom/bamtech/sdk4/bookmarks/storage/LocalBookmarkStore;", "logoutNotifier", "Lio/reactivex/subjects/PublishSubject;", "Lcom/bamtech/sdk4/internal/event/LogoutMode;", "profileEventNotifier", "Lcom/bamtech/sdk4/internal/event/UserProfileEvent;", "sessionManager", "Lcom/bamtech/sdk4/session/SessionInfoExtension;", "(Ljavax/inject/Provider;Lcom/bamtech/sdk4/content/ContentExtension;Lcom/bamtech/sdk4/bookmarks/storage/LocalBookmarkStore;Lio/reactivex/subjects/PublishSubject;Lio/reactivex/subjects/PublishSubject;Ljavax/inject/Provider;)V", "fetchMissingBookmarks", "Lio/reactivex/Single;", "", "Lcom/bamtech/sdk4/bookmarks/Bookmark;", "transaction", "contentTransactionId", "", "missingIds", "findMissingIds", "contentIds", "cachedBookmarks", "remoteBookmarks", "findMissingIds$plugin_bookmarks_release", "getBookmarks", "getLocalBookmarks", "getRuntimes", "Lcom/bamtech/sdk4/internal/bookmarks/DmcVideoResponse$BookmarkRuntime;", "importBookmarks", "Lio/reactivex/Completable;", "bookmarks", "mapResponseToBookmarks", "response", "Lcom/bamtech/sdk4/content/GraphQlResponse;", "Lcom/bamtech/sdk4/bookmarks/BookmarksResponse;", "processBookmarks", "cachedValues", "remoteValues", "processBookmarks$plugin_bookmarks_release", "purgeOnProfileChangeOrLogout", "", "purgeOnProfileChangeOrLogout$plugin_bookmarks_release", "purgeOnProfileChangeOrLogoutInternal", "purgeOnProfileChangeOrLogoutInternal$plugin_bookmarks_release", "plugin-bookmarks_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BookmarksApi.kt */
public final class DefaultBookmarkApi implements BookmarksApi {
    /* access modifiers changed from: private */
    public final ContentExtension extension;
    /* access modifiers changed from: private */
    public final LocalBookmarkStore localBookmarkStore;
    private final PublishSubject<LogoutMode> logoutNotifier;
    private final PublishSubject<UserProfileEvent> profileEventNotifier;
    private final Provider<SessionInfoExtension> sessionManager;
    /* access modifiers changed from: private */
    public final Provider<ServiceTransaction> transactionProvider;

    public DefaultBookmarkApi(Provider<ServiceTransaction> provider, ContentExtension contentExtension, LocalBookmarkStore localBookmarkStore2, PublishSubject<LogoutMode> publishSubject, PublishSubject<UserProfileEvent> publishSubject2, Provider<SessionInfoExtension> provider2) {
        this.transactionProvider = provider;
        this.extension = contentExtension;
        this.localBookmarkStore = localBookmarkStore2;
        this.logoutNotifier = publishSubject;
        this.profileEventNotifier = publishSubject2;
        this.sessionManager = provider2;
    }

    /* access modifiers changed from: private */
    public final Single<List<Bookmark>> fetchMissingBookmarks(ServiceTransaction serviceTransaction, String str, List<String> list) {
        if (!list.isEmpty()) {
            Single a = getRuntimes(serviceTransaction, list, str).mo30205a((SingleSource<U>) DefaultImpls.getSessionInfo$default((SessionInfoExtension) this.sessionManager.get(), serviceTransaction, false, 2, null), (C11947c<? super T, ? super U, ? extends R>) new DefaultBookmarkApi$fetchMissingBookmarks$$inlined$zipWith$1<Object,Object,Object>());
            Intrinsics.checkReturnedValueIsNotNull((Object) a, "zipWith(other, BiFunctio…-> zipper.invoke(t, u) })");
            Single<List<Bookmark>> h = a.mo30235h(DefaultBookmarkApi$fetchMissingBookmarks$2.INSTANCE);
            Intrinsics.checkReturnedValueIsNotNull((Object) h, "getRuntimes(transaction,…  }\n                    }");
            return h;
        }
        Single<List<Bookmark>> b = Single.m38399b(C13185o.m40513a());
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "Single.just(listOf())");
        return b;
    }

    private final Single<List<BookmarkRuntime>> getRuntimes(ServiceTransaction serviceTransaction, List<String> list, String str) {
        SearchQuery searchQuery = new SearchQuery("core/DmcVideos", null, new ContentVariables(list), 2, null);
        Single<List<BookmarkRuntime>> g = DustExtensionsKt.withDust(this.extension.query(serviceTransaction, DmcVideoResponse.class, (GraphQlRequest) searchQuery, str), serviceTransaction, BookmarksApiKt.getCONTENT_API_QUERY(Dust$Events.INSTANCE), (Object) C13170i0.m40332a(C12907r.m40244a("context", searchQuery.getContext()))).mo30233g(DefaultBookmarkApi$getRuntimes$1.INSTANCE);
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "extension.query(transact…          }\n            }");
        return g;
    }

    /* access modifiers changed from: private */
    public final List<Bookmark> mapResponseToBookmarks(GraphQlResponse<BookmarksResponse> graphQlResponse) {
        List errors = graphQlResponse.getErrors();
        if (errors == null || errors.isEmpty()) {
            BookmarksResponse bookmarksResponse = (BookmarksResponse) graphQlResponse.getData();
            if (bookmarksResponse != null) {
                List<BookmarkData> bookmarks = bookmarksResponse.getBookmarks();
                if (bookmarks != null) {
                    ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) bookmarks, 10));
                    for (BookmarkData bookmark : bookmarks) {
                        arrayList.add(bookmark.toBookmark());
                    }
                    return arrayList;
                }
            }
            return C13185o.m40513a();
        }
        throw new GetBookmarksFailedException(graphQlResponse.getErrors());
    }

    public final List<String> findMissingIds$plugin_bookmarks_release(List<String> list, List<Bookmark> list2, List<Bookmark> list3) {
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list3, 10));
        for (Bookmark contentId : list3) {
            arrayList.add(contentId.getContentId());
        }
        Set c = C13199w.m40576c((Iterable) list, (Iterable) arrayList);
        ArrayList<Bookmark> arrayList2 = new ArrayList<>();
        for (Object next : list2) {
            if (((Bookmark) next).getRuntime() > 0) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(C13187p.m40525a((Iterable) arrayList2, 10));
        for (Bookmark contentId2 : arrayList2) {
            arrayList3.add(contentId2.getContentId());
        }
        return C13199w.m40606q(C13199w.m40576c((Iterable) c, (Iterable) arrayList3));
    }

    public Single<List<Bookmark>> getBookmarks(List<String> list, String str) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        if (list.isEmpty()) {
            InvalidRequestException invalidRequestException = new InvalidRequestException(serviceTransaction.getId(), C13183n.m40498a(new ContentIdsMissingError(null, null, 3, null)), null, 4, null);
            Single<List<Bookmark>> a = Single.m38395a((Throwable) invalidRequestException);
            Intrinsics.checkReturnedValueIsNotNull((Object) a, "Single.error(InvalidRequ…ntentIdsMissingError())))");
            return a;
        }
        BookmarksQuery bookmarksQuery = new BookmarksQuery(null, null, list, 3, null);
        LocalBookmarkStore localBookmarkStore2 = this.localBookmarkStore;
        Intrinsics.checkReturnedValueIsNotNull((Object) serviceTransaction, "transaction");
        Single fetchBookmarks = localBookmarkStore2.fetchBookmarks(serviceTransaction, list);
        DefaultBookmarkApi$getBookmarks$1 defaultBookmarkApi$getBookmarks$1 = new DefaultBookmarkApi$getBookmarks$1(this, serviceTransaction, bookmarksQuery, str, list);
        Single<List<Bookmark>> b = fetchBookmarks.mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) defaultBookmarkApi$getBookmarks$1).mo30220b(C11934b.m38500b());
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "localBookmarkStore.fetch…scribeOn(Schedulers.io())");
        return b;
    }

    public Single<List<Bookmark>> getLocalBookmarks(List<String> list) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        LocalBookmarkStore localBookmarkStore2 = this.localBookmarkStore;
        Intrinsics.checkReturnedValueIsNotNull((Object) serviceTransaction, "transaction");
        return localBookmarkStore2.fetchBookmarks(serviceTransaction, list);
    }

    public Completable importBookmarks(List<Bookmark> list) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.transactionProvider.get();
        LocalBookmarkStore localBookmarkStore2 = this.localBookmarkStore;
        Intrinsics.checkReturnedValueIsNotNull((Object) serviceTransaction, "transaction");
        Completable b = localBookmarkStore2.fetchBookmarks(serviceTransaction, null).mo30217b((Function<? super T, ? extends CompletableSource>) new DefaultBookmarkApi$importBookmarks$1<Object,Object>(this, list));
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "localBookmarkStore.fetch…      }\n                }");
        return b;
    }

    public final List<Bookmark> processBookmarks$plugin_bookmarks_release(List<Bookmark> list, List<Bookmark> list2) {
        if (list.isEmpty()) {
            this.localBookmarkStore.importBookmarks(list2);
            return list2;
        }
        List<Bookmark> mergeBookmarks = this.localBookmarkStore.mergeBookmarks(list2, list);
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) mergeBookmarks, 10));
        for (Bookmark contentId : mergeBookmarks) {
            arrayList.add(contentId.getContentId());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : list) {
            if (!arrayList.contains(((Bookmark) next).getContentId())) {
                arrayList2.add(next);
            }
        }
        return C13199w.m40583d((Collection) arrayList2, (Iterable) mergeBookmarks);
    }

    @SuppressLint({"CheckResult"})
    public final void purgeOnProfileChangeOrLogout$plugin_bookmarks_release() {
        purgeOnProfileChangeOrLogoutInternal$plugin_bookmarks_release().mo30051b(C11934b.m38500b()).mo30047a(DefaultBookmarkApi$purgeOnProfileChangeOrLogout$1.INSTANCE, new DefaultBookmarkApi$purgeOnProfileChangeOrLogout$2(this));
    }

    public final Completable purgeOnProfileChangeOrLogoutInternal$plugin_bookmarks_release() {
        Completable d = Observable.m38308b((ObservableSource<? extends T>) this.logoutNotifier, (ObservableSource<? extends T>) this.profileEventNotifier).mo30182d((Function<? super T, ? extends CompletableSource>) new DefaultBookmarkApi$purgeOnProfileChangeOrLogoutInternal$1<Object,Object>(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) d, "Observable.merge(logoutN…          }\n            }");
        return d;
    }
}
