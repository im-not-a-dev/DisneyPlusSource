package androidx.sqlite.p004db.p005c;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper.C0958a;

/* renamed from: androidx.sqlite.db.c.b */
/* compiled from: FrameworkSQLiteOpenHelper */
class C0966b implements SupportSQLiteOpenHelper {

    /* renamed from: a */
    private final C0967a f3801a;

    /* renamed from: androidx.sqlite.db.c.b$a */
    /* compiled from: FrameworkSQLiteOpenHelper */
    static class C0967a extends SQLiteOpenHelper {

        /* renamed from: a */
        final C0964a[] f3802a;

        /* renamed from: b */
        final C0958a f3803b;

        /* renamed from: c */
        private boolean f3804c;

        /* renamed from: androidx.sqlite.db.c.b$a$a */
        /* compiled from: FrameworkSQLiteOpenHelper */
        class C0968a implements DatabaseErrorHandler {

            /* renamed from: a */
            final /* synthetic */ C0958a f3805a;

            /* renamed from: b */
            final /* synthetic */ C0964a[] f3806b;

            C0968a(C0958a aVar, C0964a[] aVarArr) {
                this.f3805a = aVar;
                this.f3806b = aVarArr;
            }

            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f3805a.mo5318b(C0967a.m5233a(this.f3806b, sQLiteDatabase));
            }
        }

        C0967a(Context context, String str, C0964a[] aVarArr, C0958a aVar) {
            super(context, str, null, aVar.f3789a, new C0968a(aVar, aVarArr));
            this.f3803b = aVar;
            this.f3802a = aVarArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public synchronized SupportSQLiteDatabase mo5328a() {
            this.f3804c = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.f3804c) {
                close();
                return mo5328a();
            }
            return mo5329a(writableDatabase);
        }

        public synchronized void close() {
            super.close();
            this.f3802a[0] = null;
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f3803b.mo5261a((SupportSQLiteDatabase) mo5329a(sQLiteDatabase));
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f3803b.mo5264c(mo5329a(sQLiteDatabase));
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f3804c = true;
            this.f3803b.mo5262a(mo5329a(sQLiteDatabase), i, i2);
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f3804c) {
                this.f3803b.mo5265d(mo5329a(sQLiteDatabase));
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f3804c = true;
            this.f3803b.mo5263b(mo5329a(sQLiteDatabase), i, i2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C0964a mo5329a(SQLiteDatabase sQLiteDatabase) {
            return m5233a(this.f3802a, sQLiteDatabase);
        }

        /* renamed from: a */
        static C0964a m5233a(C0964a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            C0964a aVar = aVarArr[0];
            if (aVar == null || !aVar.mo5325a(sQLiteDatabase)) {
                aVarArr[0] = new C0964a(sQLiteDatabase);
            }
            return aVarArr[0];
        }
    }

    C0966b(Context context, String str, C0958a aVar) {
        this.f3801a = m5231a(context, str, aVar);
    }

    /* renamed from: a */
    private C0967a m5231a(Context context, String str, C0958a aVar) {
        return new C0967a(context, str, new C0964a[1], aVar);
    }

    public SupportSQLiteDatabase getWritableDatabase() {
        return this.f3801a.mo5328a();
    }

    /* renamed from: a */
    public void mo5316a(boolean z) {
        this.f3801a.setWriteAheadLoggingEnabled(z);
    }
}
