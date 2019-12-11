package com.bamtech.sdk4.bookmarks;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Completable;", "list", "", "Lcom/bamtech/sdk4/bookmarks/Bookmark;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: BookmarksApi.kt */
final class DefaultBookmarkApi$importBookmarks$1<T, R> implements Function<List<? extends Bookmark>, CompletableSource> {
    final /* synthetic */ List $bookmarks;
    final /* synthetic */ DefaultBookmarkApi this$0;

    DefaultBookmarkApi$importBookmarks$1(DefaultBookmarkApi defaultBookmarkApi, List list) {
        this.this$0 = defaultBookmarkApi;
        this.$bookmarks = list;
    }

    public final Completable apply(final List<Bookmark> list) {
        return Completable.m38166c((C11945a) new C11945a(this) {
            final /* synthetic */ DefaultBookmarkApi$importBookmarks$1 this$0;

            {
                this.this$0 = r1;
            }

            public final void run() {
                DefaultBookmarkApi defaultBookmarkApi = this.this$0.this$0;
                List list = list;
                Intrinsics.checkReturnedValueIsNotNull((Object) list, "list");
                defaultBookmarkApi.processBookmarks$plugin_bookmarks_release(list, this.this$0.$bookmarks);
            }
        });
    }
}
