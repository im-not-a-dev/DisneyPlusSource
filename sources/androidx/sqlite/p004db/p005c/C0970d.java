package androidx.sqlite.p004db.p005c;

import android.database.sqlite.SQLiteProgram;
import androidx.sqlite.p004db.C0963b;

/* renamed from: androidx.sqlite.db.c.d */
/* compiled from: FrameworkSQLiteProgram */
class C0970d implements C0963b {

    /* renamed from: c */
    private final SQLiteProgram f3807c;

    C0970d(SQLiteProgram sQLiteProgram) {
        this.f3807c = sQLiteProgram;
    }

    /* renamed from: a */
    public void mo5235a(int i) {
        this.f3807c.bindNull(i);
    }

    public void close() {
        this.f3807c.close();
    }

    /* renamed from: a */
    public void mo5237a(int i, long j) {
        this.f3807c.bindLong(i, j);
    }

    /* renamed from: a */
    public void mo5236a(int i, double d) {
        this.f3807c.bindDouble(i, d);
    }

    /* renamed from: a */
    public void mo5238a(int i, String str) {
        this.f3807c.bindString(i, str);
    }

    /* renamed from: a */
    public void mo5239a(int i, byte[] bArr) {
        this.f3807c.bindBlob(i, bArr);
    }
}
