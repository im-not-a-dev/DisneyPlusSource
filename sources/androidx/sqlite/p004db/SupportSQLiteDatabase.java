package androidx.sqlite.p004db;

import android.database.Cursor;
import android.database.SQLException;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* renamed from: androidx.sqlite.db.SupportSQLiteDatabase */
public interface SupportSQLiteDatabase extends Closeable {
    /* renamed from: a */
    Cursor mo5305a(SupportSQLiteQuery supportSQLiteQuery);

    /* renamed from: b */
    void mo5306b(String str) throws SQLException;

    /* renamed from: c */
    SupportSQLiteStatement mo5307c(String str);

    /* renamed from: d */
    Cursor mo5308d(String str);

    boolean isOpen();

    /* renamed from: j0 */
    String mo5310j0();

    /* renamed from: m0 */
    void mo5311m0();

    /* renamed from: n0 */
    List<Pair<String, String>> mo5312n0();

    /* renamed from: o0 */
    void mo5313o0();

    /* renamed from: p0 */
    void mo5314p0();

    /* renamed from: q0 */
    boolean mo5315q0();
}
