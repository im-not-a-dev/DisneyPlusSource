package com.bamtech.sdk4.bookmarks;

import com.bamtech.sdk4.internal.bookmarks.DmcVideoResponse.BookmarkRuntime;
import com.bamtech.sdk4.session.SessionInfo;
import java.util.List;
import kotlin.Metadata;
import p520io.reactivex.functions.C11947c;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\t\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00012\u0006\u0010\u0004\u001a\u0002H\u00022\u0006\u0010\u0005\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo31007d2 = {"<anonymous>", "R", "T", "U", "t", "u", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "io/reactivex/rxkotlin/SinglesKt$zipWith$1"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: Singles.kt */
public final class DefaultBookmarkApi$fetchMissingBookmarks$$inlined$zipWith$1<T1, T2, R> implements C11947c<List<? extends BookmarkRuntime>, SessionInfo, R> {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r4 != null) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final R apply(java.util.List<? extends com.bamtech.sdk4.internal.bookmarks.DmcVideoResponse.BookmarkRuntime> r3, com.bamtech.sdk4.session.SessionInfo r4) {
        /*
            r2 = this;
            com.bamtech.sdk4.session.SessionInfo r4 = (com.bamtech.sdk4.session.SessionInfo) r4
            java.util.List r3 = (java.util.List) r3
            com.bamtech.sdk4.session.SessionProfileInfo r4 = r4.getProfile()
            if (r4 == 0) goto L_0x0011
            java.lang.String r4 = r4.getId()
            if (r4 == 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            java.lang.String r4 = ""
        L_0x0013:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.p590y.C13187p.m40525a(r3, r1)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L_0x0022:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0036
            java.lang.Object r1 = r3.next()
            com.bamtech.sdk4.internal.bookmarks.DmcVideoResponse$BookmarkRuntime r1 = (com.bamtech.sdk4.internal.bookmarks.DmcVideoResponse.BookmarkRuntime) r1
            com.bamtech.sdk4.bookmarks.Bookmark r1 = r1.toBookmark(r4)
            r0.add(r1)
            goto L_0x0022
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.bookmarks.DefaultBookmarkApi$fetchMissingBookmarks$$inlined$zipWith$1.apply(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
