package p163g.p164a.p165a;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* renamed from: g.a.a.a */
/* compiled from: AbstractDatabaseBacking */
abstract class C4644a {

    /* renamed from: a */
    protected SQLiteDatabase f11593a;

    /* renamed from: b */
    private File f11594b = null;

    /* renamed from: c */
    protected C4646b f11595c;

    /* renamed from: d */
    protected final Object f11596d = new Object();

    /* renamed from: e */
    protected String f11597e;

    /* renamed from: f */
    protected String f11598f;

    /* renamed from: g.a.a.a$a */
    /* compiled from: AbstractDatabaseBacking */
    protected static class C4645a extends Exception {
        public C4645a(String str) {
            super(str);
        }
    }

    /* renamed from: g.a.a.a$b */
    /* compiled from: AbstractDatabaseBacking */
    enum C4646b {
        OK(0),
        FATALERROR(1);

        private C4646b(int i) {
        }
    }

    C4644a() {
    }

    /* renamed from: g */
    private void mo15986g() {
        try {
            mo15955a();
            this.f11593a = SQLiteDatabase.openDatabase(this.f11594b.getPath(), null, 268435472);
            this.f11595c = C4646b.OK;
        } catch (SQLException e) {
            this.f11595c = C4646b.FATALERROR;
            C4783y0.m16636b("%s - Unable to open database (%s).", this.f11598f, e.getLocalizedMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15955a() {
        SQLiteDatabase sQLiteDatabase = this.f11593a;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo15958b() throws UnsupportedOperationException;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo15959c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo15960d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo15961e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo15962f() throws UnsupportedOperationException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15956a(File file) {
        this.f11594b = file;
        synchronized (this.f11596d) {
            mo15961e();
            mo15986g();
            if (this.f11593a != null) {
                mo15959c();
                mo15958b();
                mo15962f();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15957a(Exception exc) {
        C4783y0.m16636b("%s - Database in unrecoverable state (%s), resetting.", this.f11598f, exc.getLocalizedMessage());
        synchronized (this.f11596d) {
            if (!this.f11594b.exists() || this.f11594b.delete()) {
                C4783y0.m16630a("%s - Database file(%s) was corrupt and had to be deleted.", this.f11598f, this.f11594b.getAbsolutePath());
                mo15986g();
                mo15958b();
                mo15962f();
                mo15960d();
                return;
            }
            C4783y0.m16636b("%s - Failed to delete database file(%s).", this.f11598f, this.f11594b.getAbsolutePath());
            this.f11595c = C4646b.FATALERROR;
        }
    }
}
