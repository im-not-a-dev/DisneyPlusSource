package com.bamtech.sdk4.internal.bookmarks;

import android.content.Context;
import androidx.room.C0934f;
import androidx.room.RoomDatabase.C0915a;
import androidx.room.migration.Migration;
import com.bamtech.sdk4.bookmarks.storage.BookmarksDao;
import com.bamtech.sdk4.bookmarks.storage.BookmarksDatabase;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¨\u0006\n"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/bookmarks/BookmarksRepositoryModule;", "", "()V", "bookmarkDao", "Lcom/bamtech/sdk4/bookmarks/storage/BookmarksDao;", "database", "Lcom/bamtech/sdk4/bookmarks/storage/BookmarksDatabase;", "bookmarksDatabase", "context", "Landroid/content/Context;", "plugin-bookmarks_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BookmarksRepositoryModule.kt */
public final class BookmarksRepositoryModule {
    static {
        new BookmarksRepositoryModule();
    }

    private BookmarksRepositoryModule() {
    }

    public static final BookmarksDao bookmarkDao(BookmarksDatabase bookmarksDatabase) {
        if (bookmarksDatabase != null) {
            return bookmarksDatabase.bookmarksDao();
        }
        return null;
    }

    public static final BookmarksDatabase bookmarksDatabase(Context context) {
        if (context == null) {
            return null;
        }
        C0915a a = C0934f.m5137a(context, BookmarksDatabase.class, "db_offline_bookmarks");
        Migration[] fetch = DatabaseMigrations.INSTANCE.fetch();
        a.mo5228a((Migration[]) Arrays.copyOf(fetch, fetch.length));
        return (BookmarksDatabase) a.mo5229b();
    }
}
