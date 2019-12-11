package com.bamtech.sdk4.bookmarks.storage;

import com.bamtech.sdk4.session.SessionInfo;
import com.bamtech.sdk4.session.SessionProfileInfo;
import kotlin.Metadata;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "", "sessionInfo", "Lcom/bamtech/sdk4/session/SessionInfo;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultLocalBookmarkStore.kt */
final class DefaultLocalBookmarkStore$fetchBookmarks$1<T, R> implements Function<T, R> {
    public static final DefaultLocalBookmarkStore$fetchBookmarks$1 INSTANCE = new DefaultLocalBookmarkStore$fetchBookmarks$1();

    DefaultLocalBookmarkStore$fetchBookmarks$1() {
    }

    public final String apply(SessionInfo sessionInfo) {
        SessionProfileInfo profile = sessionInfo.getProfile();
        if (profile != null) {
            String id = profile.getId();
            if (id != null) {
                return id;
            }
        }
        return "";
    }
}
