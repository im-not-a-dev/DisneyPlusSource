package p163g.p164a.p165a;

import android.database.DatabaseUtils;
import android.database.SQLException;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: g.a.a.b */
/* compiled from: AbstractHitDatabase */
abstract class C4653b extends C4644a {

    /* renamed from: g */
    protected long f11616g;

    /* renamed from: h */
    protected long f11617h = 0;

    /* renamed from: i */
    protected String f11618i = "CREATE TABLE IF NOT EXISTS HITS (ID INTEGER PRIMARY KEY AUTOINCREMENT, URL TEXT, POSTBODY TEXT, POSTTYPE TEXT, TIMESTAMP INTEGER, TIMEOUT INTEGER)";

    /* renamed from: j */
    protected boolean f11619j = false;

    /* renamed from: k */
    protected final Object f11620k = new Object();

    /* renamed from: l */
    private final Object f11621l = new Object();

    /* renamed from: m */
    private Timer f11622m;

    /* renamed from: n */
    private TimerTask f11623n;

    /* renamed from: g.a.a.b$a */
    /* compiled from: AbstractHitDatabase */
    protected static class C4654a {

        /* renamed from: a */
        String f11624a;

        /* renamed from: b */
        String f11625b;

        /* renamed from: c */
        long f11626c;

        /* renamed from: d */
        String f11627d;

        /* renamed from: e */
        String f11628e;

        /* renamed from: f */
        int f11629f;

        protected C4654a() {
        }
    }

    /* renamed from: g.a.a.b$b */
    /* compiled from: AbstractHitDatabase */
    protected class C4655b extends TimerTask {

        /* renamed from: c */
        private boolean f11631c = false;

        C4655b(boolean z) {
            this.f11631c = z;
        }

        public void run() {
            C4768u0.m16553a(true);
            C4783y0.m16630a("%s - Referrer timeout has expired without referrer data", C4653b.this.f11598f);
            C4653b.this.mo15985a(this.f11631c);
        }
    }

    C4653b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15984a(String str) throws C4645a {
        if (str == null || str.trim().length() == 0) {
            C4783y0.m16630a("%s - Unable to delete hit due to an invalid parameter", this.f11598f);
            return;
        }
        synchronized (this.f11596d) {
            try {
                this.f11593a.delete("HITS", "ID = ?", new String[]{str});
                this.f11616g--;
            } catch (NullPointerException e) {
                C4783y0.m16636b("%s - Unable to delete hit due to an unopened database (%s)", this.f11598f, e.getLocalizedMessage());
            } catch (SQLException e2) {
                C4783y0.m16636b("%s - Unable to delete hit due to a sql error (%s)", this.f11598f, e2.getLocalizedMessage());
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to delete, database probably corrupted (");
                sb.append(e2.getLocalizedMessage());
                sb.append(")");
                throw new C4645a(sb.toString());
            } catch (Exception e3) {
                C4783y0.m16636b("%s - Unable to delete hit due to an unexpected error (%s)", this.f11598f, e3.getLocalizedMessage());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unexpected exception, database probably corrupted (");
                sb2.append(e3.getLocalizedMessage());
                sb2.append(")");
                throw new C4645a(sb2.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo15958b() {
        try {
            this.f11593a.execSQL(this.f11618i);
        } catch (NullPointerException e) {
            C4783y0.m16636b("%s - Unable to create database due to an invalid path (%s)", this.f11598f, e.getLocalizedMessage());
        } catch (SQLException e2) {
            C4783y0.m16636b("%s - Unable to create database due to a sql error (%s)", this.f11598f, e2.getLocalizedMessage());
        } catch (Exception e3) {
            C4783y0.m16636b("%s - Unable to create database due to an unexpected error (%s)", this.f11598f, e3.getLocalizedMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo15960d() {
        this.f11616g = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo15986g() {
        if (!this.f11619j) {
            this.f11619j = true;
            synchronized (this.f11620k) {
                new Thread(mo15989j(), "ADBMobileBackgroundThread").start();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo15987h() {
        synchronized (this.f11596d) {
            try {
                this.f11593a.delete("HITS", null, null);
                this.f11616g = 0;
            } catch (NullPointerException e) {
                C4783y0.m16636b("%s - Unable to clear tracking queue due to an unopened database (%s)", this.f11598f, e.getLocalizedMessage());
            } catch (SQLException e2) {
                C4783y0.m16636b("%s - Unable to clear tracking queue due to a sql error (%s)", this.f11598f, e2.getLocalizedMessage());
            } catch (Exception e3) {
                C4783y0.m16636b("%s - Unable to clear tracking queue due to an unexpected error (%s)", this.f11598f, e3.getLocalizedMessage());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public long mo15988i() {
        long j;
        synchronized (this.f11596d) {
            try {
                j = DatabaseUtils.queryNumEntries(this.f11593a, "HITS");
            } catch (NullPointerException e) {
                C4783y0.m16636b("%s - Unable to get tracking queue size due to an unopened database (%s)", this.f11598f, e.getLocalizedMessage());
                j = 0;
                return j;
            } catch (SQLException e2) {
                C4783y0.m16636b("%s - Unable to get tracking queue size due to a sql error (%s)", this.f11598f, e2.getLocalizedMessage());
                j = 0;
                return j;
            } catch (Exception e3) {
                C4783y0.m16636b("%s - Unable to get tracking queue size due to an unexpected error (%s)", this.f11598f, e3.getLocalizedMessage());
                j = 0;
                return j;
            }
        }
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract Runnable mo15989j() throws UnsupportedOperationException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15985a(boolean z) {
        C4728p0 H = C4728p0.m16448H();
        boolean z2 = false;
        if (C4768u0.m16554a() || H.mo16102u() <= 0) {
            if (this.f11622m != null) {
                synchronized (this.f11621l) {
                    try {
                        this.f11622m.cancel();
                    } catch (Exception e) {
                        C4783y0.m16636b("%s - Error cancelling referrer timer (%s)", this.f11598f, e.getMessage());
                    }
                    this.f11623n = null;
                }
            }
            if (H.mo16101t() == C4758r0.MOBILE_PRIVACY_STATUS_OPT_IN) {
                if (!H.mo16100s() || this.f11616g > ((long) H.mo16090i())) {
                    z2 = true;
                }
                if (z2 || z) {
                    mo15986g();
                }
                return;
            }
            return;
        }
        synchronized (this.f11621l) {
            if (this.f11623n == null) {
                try {
                    this.f11623n = new C4655b(z);
                    this.f11622m = new Timer();
                    this.f11622m.schedule(this.f11623n, (long) C4728p0.m16448H().mo16102u());
                } catch (Exception e2) {
                    C4783y0.m16636b("%s - Error creating referrer timer (%s)", this.f11598f, e2.getMessage());
                }
            }
        }
    }
}
