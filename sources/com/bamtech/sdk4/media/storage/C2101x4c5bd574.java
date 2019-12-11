package com.bamtech.sdk4.media.storage;

import com.bamtech.sdk4.bookmarks.Bookmark;
import kotlin.Metadata;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "", "it", "Lcom/bamtech/sdk4/bookmarks/Bookmark;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.media.storage.DefaultPlayheadRecorder$recordPlayheadAndBookmark$bookmarkMaybe$3 */
/* compiled from: PlayheadRecorder.kt */
final class C2101x4c5bd574<T, R> implements Function<T, R> {
    public static final C2101x4c5bd574 INSTANCE = new C2101x4c5bd574();

    C2101x4c5bd574() {
    }

    public final String apply(Bookmark bookmark) {
        return bookmark.getProfileId();
    }
}
