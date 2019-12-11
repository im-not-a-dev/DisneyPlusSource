package com.bamtech.sdk4.bookmarks.storage;

import com.bamtech.sdk4.bookmarks.Bookmark;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\b\u0010\u0007\u001a\u00020\u0003H'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH'J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH'J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\nH'J$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H'¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtech/sdk4/bookmarks/storage/BookmarksDao;", "", "addBookmarks", "", "bookmarks", "", "Lcom/bamtech/sdk4/bookmarks/Bookmark;", "deleteAllBookmarks", "deleteBookmarksForProfile", "profileId", "", "getBookmark", "contentId", "getBookmarks", "contentIds", "plugin-bookmarks_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BookmarksDao.kt */
public interface BookmarksDao {
    void addBookmarks(List<Bookmark> list);

    void deleteAllBookmarks();

    void deleteBookmarksForProfile(String str);

    List<Bookmark> getBookmarks(String str);

    List<Bookmark> getBookmarks(String str, List<String> list);
}
