package com.bamtech.sdk4.bookmarks;

import com.bamtech.sdk4.service.NetworkException;
import java.util.List;
import kotlin.Metadata;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/SingleSource;", "", "Lcom/bamtech/sdk4/bookmarks/Bookmark;", "kotlin.jvm.PlatformType", "error", "", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: BookmarksApi.kt */
final class DefaultBookmarkApi$fetchMissingBookmarks$2<T, R> implements Function<Throwable, SingleSource<? extends List<? extends Bookmark>>> {
    public static final DefaultBookmarkApi$fetchMissingBookmarks$2 INSTANCE = new DefaultBookmarkApi$fetchMissingBookmarks$2();

    DefaultBookmarkApi$fetchMissingBookmarks$2() {
    }

    public final SingleSource<? extends List<Bookmark>> apply(Throwable th) {
        if (th instanceof NetworkException) {
            return Single.m38399b(C13185o.m40513a());
        }
        return Single.m38395a(th);
    }
}
