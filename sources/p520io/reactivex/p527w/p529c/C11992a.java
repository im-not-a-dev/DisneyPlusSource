package p520io.reactivex.p527w.p529c;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.Callable;
import p520io.reactivex.C11969r;
import p520io.reactivex.p527w.p528b.C11991a;

/* renamed from: io.reactivex.w.c.a */
/* compiled from: AndroidSchedulers */
public final class C11992a {

    /* renamed from: a */
    private static final C11969r f27720a = C11991a.m38599b(new C11993a());

    /* renamed from: io.reactivex.w.c.a$a */
    /* compiled from: AndroidSchedulers */
    static class C11993a implements Callable<C11969r> {
        C11993a() {
        }

        public C11969r call() throws Exception {
            return C11994b.f27721a;
        }
    }

    /* renamed from: io.reactivex.w.c.a$b */
    /* compiled from: AndroidSchedulers */
    private static final class C11994b {

        /* renamed from: a */
        static final C11969r f27721a = new C11995b(new Handler(Looper.getMainLooper()), false);
    }

    /* renamed from: a */
    public static C11969r m38600a() {
        return C11991a.m38596a(f27720a);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static C11969r m38601a(Looper looper, boolean z) {
        if (looper != null) {
            int i = VERSION.SDK_INT;
            if (i < 16) {
                z = false;
            } else if (z && i < 22) {
                Message obtain = Message.obtain();
                try {
                    obtain.setAsynchronous(true);
                } catch (NoSuchMethodError unused) {
                    z = false;
                }
                obtain.recycle();
            }
            return new C11995b(new Handler(looper), z);
        }
        throw new NullPointerException("looper == null");
    }
}
