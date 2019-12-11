package androidx.sqlite.p004db.p005c;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteQuery;
import android.util.Pair;
import androidx.sqlite.p004db.C0962a;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import androidx.sqlite.p004db.SupportSQLiteQuery;
import androidx.sqlite.p004db.SupportSQLiteStatement;
import java.io.IOException;
import java.util.List;

/* renamed from: androidx.sqlite.db.c.a */
/* compiled from: FrameworkSQLiteDatabase */
class C0964a implements SupportSQLiteDatabase {

    /* renamed from: U */
    private static final String[] f3798U = new String[0];

    /* renamed from: c */
    private final SQLiteDatabase f3799c;

    /* renamed from: androidx.sqlite.db.c.a$a */
    /* compiled from: FrameworkSQLiteDatabase */
    class C0965a implements CursorFactory {

        /* renamed from: a */
        final /* synthetic */ SupportSQLiteQuery f3800a;

        C0965a(C0964a aVar, SupportSQLiteQuery supportSQLiteQuery) {
            this.f3800a = supportSQLiteQuery;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f3800a.mo5240a(new C0970d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    static {
        new String[]{"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    }

    C0964a(SQLiteDatabase sQLiteDatabase) {
        this.f3799c = sQLiteDatabase;
    }

    /* renamed from: a */
    public Cursor mo5305a(SupportSQLiteQuery supportSQLiteQuery) {
        return this.f3799c.rawQueryWithFactory(new C0965a(this, supportSQLiteQuery), supportSQLiteQuery.mo5234a(), f3798U, null);
    }

    /* renamed from: b */
    public void mo5306b(String str) throws SQLException {
        this.f3799c.execSQL(str);
    }

    /* renamed from: c */
    public SupportSQLiteStatement mo5307c(String str) {
        return new C0971e(this.f3799c.compileStatement(str));
    }

    public void close() throws IOException {
        this.f3799c.close();
    }

    /* renamed from: d */
    public Cursor mo5308d(String str) {
        return mo5305a((SupportSQLiteQuery) new C0962a(str));
    }

    public boolean isOpen() {
        return this.f3799c.isOpen();
    }

    /* renamed from: j0 */
    public String mo5310j0() {
        return this.f3799c.getPath();
    }

    /* renamed from: m0 */
    public void mo5311m0() {
        this.f3799c.beginTransaction();
    }

    /* renamed from: n0 */
    public List<Pair<String, String>> mo5312n0() {
        return this.f3799c.getAttachedDbs();
    }

    /* renamed from: o0 */
    public void mo5313o0() {
        this.f3799c.setTransactionSuccessful();
    }

    /* renamed from: p0 */
    public void mo5314p0() {
        this.f3799c.endTransaction();
    }

    /* renamed from: q0 */
    public boolean mo5315q0() {
        return this.f3799c.inTransaction();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5325a(SQLiteDatabase sQLiteDatabase) {
        return this.f3799c == sQLiteDatabase;
    }
}
