package com.bamtech.sdk4.media.storage;

import com.bamtech.sdk4.bookmarks.Bookmark;
import kotlin.Metadata;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "bookmark", "Lcom/bamtech/sdk4/bookmarks/Bookmark;", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.media.storage.DefaultPlayheadRecorder$recordPlayheadAndBookmark$bookmarkMaybe$2 */
/* compiled from: PlayheadRecorder.kt */
final class C2100x4c5bd573<T> implements Consumer<Bookmark> {
    final /* synthetic */ DefaultPlayheadRecorder this$0;

    C2100x4c5bd573(DefaultPlayheadRecorder defaultPlayheadRecorder) {
        this.this$0 = defaultPlayheadRecorder;
    }

    public final void accept(Bookmark bookmark) {
        this.this$0.getLocalBookmarkStore().importBookmarks(C13183n.m40498a(bookmark));
    }
}
