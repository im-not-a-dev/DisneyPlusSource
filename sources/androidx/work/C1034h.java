package androidx.work;

import android.util.Log;

/* renamed from: androidx.work.h */
/* compiled from: Logger */
public abstract class C1034h {

    /* renamed from: a */
    private static C1034h f4071a = null;

    /* renamed from: b */
    private static final int f4072b = 20;

    /* renamed from: androidx.work.h$a */
    /* compiled from: Logger */
    public static class C1035a extends C1034h {

        /* renamed from: c */
        private int f4073c;

        public C1035a(int i) {
            super(i);
            this.f4073c = i;
        }

        /* renamed from: a */
        public void mo5697a(String str, String str2, Throwable... thArr) {
            if (this.f4073c > 3) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.d(str, str2);
            } else {
                Log.d(str, str2, thArr[0]);
            }
        }

        /* renamed from: b */
        public void mo5698b(String str, String str2, Throwable... thArr) {
            if (this.f4073c > 6) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.e(str, str2);
            } else {
                Log.e(str, str2, thArr[0]);
            }
        }

        /* renamed from: c */
        public void mo5699c(String str, String str2, Throwable... thArr) {
            if (this.f4073c > 4) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.i(str, str2);
            } else {
                Log.i(str, str2, thArr[0]);
            }
        }

        /* renamed from: d */
        public void mo5700d(String str, String str2, Throwable... thArr) {
            if (this.f4073c > 2) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.v(str, str2);
            } else {
                Log.v(str, str2, thArr[0]);
            }
        }

        /* renamed from: e */
        public void mo5701e(String str, String str2, Throwable... thArr) {
            if (this.f4073c > 5) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.w(str, str2);
            } else {
                Log.w(str, str2, thArr[0]);
            }
        }
    }

    public C1034h(int i) {
    }

    /* renamed from: a */
    public static synchronized void m5552a(C1034h hVar) {
        synchronized (C1034h.class) {
            f4071a = hVar;
        }
    }

    /* renamed from: a */
    public abstract void mo5697a(String str, String str2, Throwable... thArr);

    /* renamed from: b */
    public abstract void mo5698b(String str, String str2, Throwable... thArr);

    /* renamed from: c */
    public abstract void mo5699c(String str, String str2, Throwable... thArr);

    /* renamed from: d */
    public abstract void mo5700d(String str, String str2, Throwable... thArr);

    /* renamed from: e */
    public abstract void mo5701e(String str, String str2, Throwable... thArr);

    /* renamed from: a */
    public static String m5551a(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i = f4072b;
        if (length >= i) {
            sb.append(str.substring(0, i));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static synchronized C1034h m5550a() {
        C1034h hVar;
        synchronized (C1034h.class) {
            if (f4071a == null) {
                f4071a = new C1035a(3);
            }
            hVar = f4071a;
        }
        return hVar;
    }
}
