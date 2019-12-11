package p096e.p150n.p152b;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import p096e.p121h.p130o.C4069f;
import p096e.p121h.p134r.C4118j;

/* renamed from: e.n.b.a */
/* compiled from: AsyncTaskLoader */
public abstract class C4244a<D> extends C4246b<D> {

    /* renamed from: i */
    private final Executor f10580i;

    /* renamed from: j */
    volatile C4245a f10581j;

    /* renamed from: k */
    volatile C4245a f10582k;

    /* renamed from: l */
    long f10583l;

    /* renamed from: m */
    long f10584m;

    /* renamed from: n */
    Handler f10585n;

    /* renamed from: e.n.b.a$a */
    /* compiled from: AsyncTaskLoader */
    final class C4245a extends C4249c<Void, Void, D> implements Runnable {

        /* renamed from: c0 */
        private final CountDownLatch f10586c0 = new CountDownLatch(1);

        /* renamed from: d0 */
        boolean f10587d0;

        C4245a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo14954b(D d) {
            try {
                C4244a.this.mo14942a(this, d);
            } finally {
                this.f10586c0.countDown();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo14955c(D d) {
            try {
                C4244a.this.mo14944b(this, d);
            } finally {
                this.f10586c0.countDown();
            }
        }

        public void run() {
            this.f10587d0 = false;
            C4244a.this.mo14949s();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public D mo14952a(Void... voidArr) {
            try {
                return C4244a.this.mo14951u();
            } catch (C4069f e) {
                if (mo14980a()) {
                    return null;
                }
                throw e;
            }
        }
    }

    public C4244a(Context context) {
        this(context, C4249c.f10599a0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo14942a(C4245a aVar, D d) {
        mo14945c(d);
        if (this.f10582k == aVar) {
            mo14973o();
            this.f10584m = SystemClock.uptimeMillis();
            this.f10582k = null;
            mo14964d();
            mo14949s();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo14944b(C4245a aVar, D d) {
        if (this.f10581j != aVar) {
            mo14942a(aVar, d);
        } else if (mo14966f()) {
            mo14945c(d);
        } else {
            mo14963c();
            this.f10584m = SystemClock.uptimeMillis();
            this.f10581j = null;
            mo14961b(d);
        }
    }

    /* renamed from: c */
    public void mo14945c(D d) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo14946h() {
        if (this.f10581j == null) {
            return false;
        }
        if (!this.f10592d) {
            this.f10595g = true;
        }
        if (this.f10582k != null) {
            if (this.f10581j.f10587d0) {
                this.f10581j.f10587d0 = false;
                this.f10585n.removeCallbacks(this.f10581j);
            }
            this.f10581j = null;
            return false;
        } else if (this.f10581j.f10587d0) {
            this.f10581j.f10587d0 = false;
            this.f10585n.removeCallbacks(this.f10581j);
            this.f10581j = null;
            return false;
        } else {
            boolean a = this.f10581j.mo14981a(false);
            if (a) {
                this.f10582k = this.f10581j;
                mo14948r();
            }
            this.f10581j = null;
            return a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo14947j() {
        super.mo14947j();
        mo14962b();
        this.f10581j = new C4245a<>();
        mo14949s();
    }

    /* renamed from: r */
    public void mo14948r() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public void mo14949s() {
        if (this.f10582k == null && this.f10581j != null) {
            if (this.f10581j.f10587d0) {
                this.f10581j.f10587d0 = false;
                this.f10585n.removeCallbacks(this.f10581j);
            }
            if (this.f10583l <= 0 || SystemClock.uptimeMillis() >= this.f10584m + this.f10583l) {
                this.f10581j.mo14978a(this.f10580i, null);
            } else {
                this.f10581j.f10587d0 = true;
                this.f10585n.postAtTime(this.f10581j, this.f10584m + this.f10583l);
            }
        }
    }

    /* renamed from: t */
    public abstract D mo14950t();

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public D mo14951u() {
        return mo14950t();
    }

    private C4244a(Context context, Executor executor) {
        super(context);
        this.f10584m = -10000;
        this.f10580i = executor;
    }

    @Deprecated
    /* renamed from: a */
    public void mo14943a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo14943a(str, fileDescriptor, printWriter, strArr);
        String str2 = " waiting=";
        if (this.f10581j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f10581j);
            printWriter.print(str2);
            printWriter.println(this.f10581j.f10587d0);
        }
        if (this.f10582k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f10582k);
            printWriter.print(str2);
            printWriter.println(this.f10582k.f10587d0);
        }
        if (this.f10583l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C4118j.m14101a(this.f10583l, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C4118j.m14100a(this.f10584m, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }
}
