package com.bamtech.sdk4.bookmarks;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.shadow.gson.p050r.C2246c;
import java.util.List;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\b\tB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, mo31007d2 = {"Lcom/bamtech/sdk4/bookmarks/BookmarksResponse;", "", "bookmarks", "", "Lcom/bamtech/sdk4/bookmarks/BookmarksResponse$BookmarkData;", "(Ljava/util/List;)V", "getBookmarks", "()Ljava/util/List;", "BookmarkData", "UserMeta", "plugin-bookmarks_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Bookmark.kt */
public final class BookmarksResponse {
    @C2246c("Bookmarks")
    private final List<BookmarkData> bookmarks;

    @DontObfuscate
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, mo31007d2 = {"Lcom/bamtech/sdk4/bookmarks/BookmarksResponse$BookmarkData;", "", "contentId", "", "userMeta", "Lcom/bamtech/sdk4/bookmarks/BookmarksResponse$UserMeta;", "(Ljava/lang/String;Lcom/bamtech/sdk4/bookmarks/BookmarksResponse$UserMeta;)V", "getContentId", "()Ljava/lang/String;", "getUserMeta", "()Lcom/bamtech/sdk4/bookmarks/BookmarksResponse$UserMeta;", "toBookmark", "Lcom/bamtech/sdk4/bookmarks/Bookmark;", "plugin-bookmarks_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: Bookmark.kt */
    public static final class BookmarkData {
        private final String contentId;
        private final UserMeta userMeta;

        public BookmarkData(String str, UserMeta userMeta2) {
            this.contentId = str;
            this.userMeta = userMeta2;
        }

        public final String getContentId() {
            return this.contentId;
        }

        public final UserMeta getUserMeta() {
            return this.userMeta;
        }

        public final Bookmark toBookmark() {
            Bookmark bookmark = new Bookmark(this.contentId, this.userMeta.getPlayhead(), this.userMeta.getRuntime(), this.userMeta.getUserId(), this.userMeta.getOccurredOn(), this.userMeta.getCcDefault(), this.userMeta.getCcMedia());
            return bookmark;
        }
    }

    @DontObfuscate
    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtech/sdk4/bookmarks/BookmarksResponse$UserMeta;", "", "userId", "", "playhead", "", "runtime", "occurredOn", "ccDefault", "ccMedia", "(Ljava/lang/String;JJJJLjava/lang/Long;)V", "getCcDefault", "()J", "getCcMedia", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOccurredOn", "getPlayhead", "getRuntime", "getUserId", "()Ljava/lang/String;", "plugin-bookmarks_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: Bookmark.kt */
    public static final class UserMeta {
        private final long ccDefault;
        private final Long ccMedia;
        private final long occurredOn;
        private final long playhead;
        private final long runtime;
        private final String userId;

        public UserMeta(String str, long j, long j2, long j3, long j4, Long l) {
            this.userId = str;
            this.playhead = j;
            this.runtime = j2;
            this.occurredOn = j3;
            this.ccDefault = j4;
            this.ccMedia = l;
        }

        public final long getCcDefault() {
            return this.ccDefault;
        }

        public final Long getCcMedia() {
            return this.ccMedia;
        }

        public final long getOccurredOn() {
            return this.occurredOn;
        }

        public final long getPlayhead() {
            return this.playhead;
        }

        public final long getRuntime() {
            return this.runtime;
        }

        public final String getUserId() {
            return this.userId;
        }
    }

    public BookmarksResponse(List<BookmarkData> list) {
        this.bookmarks = list;
    }

    public final List<BookmarkData> getBookmarks() {
        return this.bookmarks;
    }
}
