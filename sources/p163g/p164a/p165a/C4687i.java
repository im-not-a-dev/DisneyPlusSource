package p163g.p164a.p165a;

import android.database.SQLException;
import android.database.sqlite.SQLiteStatement;
import java.io.File;

/* renamed from: g.a.a.i */
/* compiled from: AnalyticsTrackTimedAction */
final class C4687i extends C4644a {

    /* renamed from: i */
    private static C4687i f11687i;

    /* renamed from: j */
    private static final Object f11688j = new Object();

    /* renamed from: g */
    private SQLiteStatement f11689g;

    /* renamed from: h */
    private SQLiteStatement f11690h;

    private C4687i() {
        mo15956a(new File(C4783y0.m16651k(), this.f11597e));
    }

    /* renamed from: h */
    public static C4687i m16319h() {
        C4687i iVar;
        synchronized (f11688j) {
            if (f11687i == null) {
                f11687i = new C4687i();
            }
            iVar = f11687i;
        }
        return iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16026a(long j) {
        synchronized (this.f11596d) {
            try {
                this.f11689g.bindLong(1, j);
                this.f11689g.execute();
                this.f11689g.clearBindings();
            } catch (SQLException e) {
                C4783y0.m16636b("%s - Unable to bind prepared statement values for updating the adjusted start time for timed action (%s)", this.f11598f, e.getLocalizedMessage());
                mo15957a((Exception) e);
            } catch (Exception e2) {
                C4783y0.m16636b("%s - Unable to adjust start times for timed actions (%s)", this.f11598f, e2.getMessage());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo15958b() {
        try {
            this.f11593a.execSQL("CREATE TABLE IF NOT EXISTS TIMEDACTIONS (ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, STARTTIME INTEGER, ADJSTARTTIME INTEGER)");
            this.f11593a.execSQL("CREATE TABLE IF NOT EXISTS CONTEXTDATA (ID INTEGER PRIMARY KEY AUTOINCREMENT, ACTIONID INTEGER, KEY TEXT, VALUE TEXT, FOREIGN KEY(ACTIONID) REFERENCES TIMEDACTIONS(ID))");
        } catch (SQLException e) {
            C4783y0.m16636b("%s - Unable to open or create timed actions database (%s)", this.f11598f, e.getMessage());
        } catch (Exception e2) {
            C4783y0.m16636b("%s - Uknown error creating timed actions database (%s)", this.f11598f, e2.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo15959c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo15960d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo15961e() {
        StringBuilder sb = new StringBuilder();
        sb.append(C4783y0.m16651k());
        sb.append("ADBMobileDataCache.sqlite");
        sb.append(this.f11597e);
        File file = new File(sb.toString());
        File file2 = new File(C4783y0.m16651k(), this.f11597e);
        if (file.exists() && !file2.exists()) {
            try {
                if (!file.renameTo(file2)) {
                    C4783y0.m16640c("%s - Unable to migrate old Timed Actions db, creating new Timed Actions db (move file returned false)", this.f11598f);
                }
            } catch (Exception e) {
                C4783y0.m16640c("%s - Unable to migrate old Timed Actions db, creating new Timed Actions db (%s)", this.f11598f, e.getLocalizedMessage());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo15962f() {
        try {
            this.f11593a.compileStatement("INSERT INTO TIMEDACTIONS (NAME, STARTTIME, ADJSTARTTIME) VALUES (@NAME, @START, @START)");
            this.f11689g = this.f11593a.compileStatement("UPDATE TIMEDACTIONS SET ADJSTARTTIME=ADJSTARTTIME+@DELTA WHERE ADJSTARTTIME!=-1");
            this.f11690h = this.f11593a.compileStatement("UPDATE TIMEDACTIONS SET ADJSTARTTIME=-1");
            this.f11593a.compileStatement("DELETE FROM TIMEDACTIONS WHERE ID=@ID");
            this.f11593a.compileStatement("INSERT INTO CONTEXTDATA(ACTIONID, KEY, VALUE) VALUES (@ACTIONID, @KEY, @VALUE)");
            this.f11593a.compileStatement("UPDATE CONTEXTDATA SET VALUE=@VALUE WHERE ACTIONID=@ACTIONID AND KEY=@KEY");
            this.f11593a.compileStatement("DELETE FROM CONTEXTDATA WHERE ACTIONID=@ACTIONID");
        } catch (SQLException e) {
            C4783y0.m16636b("Analytics - unable to prepare the needed SQL statements for interacting with the timed actions database (%s)", e.getMessage());
        } catch (Exception e2) {
            C4783y0.m16636b("Analytics - Unknown error preparing sql statements (%s)", e2.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo15986g() {
        synchronized (this.f11596d) {
            try {
                this.f11690h.execute();
                this.f11690h.clearBindings();
            } catch (SQLException e) {
                C4783y0.m16636b("%s - Unable to update adjusted time for timed actions after crash (%s)", this.f11598f, e.getMessage());
                mo15957a((Exception) e);
            } catch (Exception e2) {
                C4783y0.m16636b("%s - Unknown error clearing adjusted start times for timed actions (%s)", this.f11598f, e2.getMessage());
                mo15957a(e2);
            }
        }
    }
}
