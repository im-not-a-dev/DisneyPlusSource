package androidx.sqlite.p004db.p005c;

import android.database.sqlite.SQLiteStatement;
import androidx.sqlite.p004db.SupportSQLiteStatement;

/* renamed from: androidx.sqlite.db.c.e */
/* compiled from: FrameworkSQLiteStatement */
class C0971e extends C0970d implements SupportSQLiteStatement {

    /* renamed from: U */
    private final SQLiteStatement f3808U;

    C0971e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f3808U = sQLiteStatement;
    }

    /* renamed from: k0 */
    public int mo5323k0() {
        return this.f3808U.executeUpdateDelete();
    }

    /* renamed from: l0 */
    public long mo5324l0() {
        return this.f3808U.executeInsert();
    }
}
