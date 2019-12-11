package p551j.p552a.p560j;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import p551j.p552a.p568q.C12674a;
import p551j.p552a.p568q.C12675b;

/* renamed from: j.a.j.i */
/* compiled from: LockdownManager */
public class C12640i {

    /* renamed from: f */
    public static final long f29310f = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: g */
    public static final long f29311g = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a */
    private long f29312a;

    /* renamed from: b */
    private long f29313b;

    /* renamed from: c */
    private long f29314c;

    /* renamed from: d */
    private Date f29315d;

    /* renamed from: e */
    private final C12674a f29316e;

    public C12640i() {
        this(new C12675b());
    }

    /* renamed from: a */
    public synchronized boolean mo30948a() {
        return this.f29315d != null && this.f29316e.mo31001a() - this.f29315d.getTime() < this.f29314c;
    }

    /* renamed from: b */
    public synchronized void mo30950b() {
        this.f29314c = 0;
        this.f29315d = null;
    }

    public C12640i(C12674a aVar) {
        this.f29312a = f29310f;
        this.f29313b = f29311g;
        this.f29314c = 0;
        this.f29315d = null;
        this.f29316e = aVar;
    }

    /* renamed from: a */
    public synchronized boolean mo30949a(C12635e eVar) {
        if (mo30948a()) {
            return false;
        }
        if (eVar != null) {
            if (eVar.mo30936a() != null) {
                this.f29314c = eVar.mo30936a().longValue();
                this.f29314c = Math.min(this.f29312a, this.f29314c);
                this.f29315d = this.f29316e.mo31002b();
                return true;
            }
        }
        if (this.f29314c != 0) {
            this.f29314c *= 2;
        } else {
            this.f29314c = this.f29313b;
        }
        this.f29314c = Math.min(this.f29312a, this.f29314c);
        this.f29315d = this.f29316e.mo31002b();
        return true;
    }
}
