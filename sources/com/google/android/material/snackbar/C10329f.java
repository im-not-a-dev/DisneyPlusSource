package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.snackbar.f */
/* compiled from: SnackbarManager */
class C10329f {

    /* renamed from: e */
    private static C10329f f24463e;

    /* renamed from: a */
    private final Object f24464a = new Object();

    /* renamed from: b */
    private final Handler f24465b = new Handler(Looper.getMainLooper(), new C10330a());

    /* renamed from: c */
    private C10332c f24466c;

    /* renamed from: d */
    private C10332c f24467d;

    /* renamed from: com.google.android.material.snackbar.f$a */
    /* compiled from: SnackbarManager */
    class C10330a implements Callback {
        C10330a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C10329f.this.mo26873a((C10332c) message.obj);
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.f$b */
    /* compiled from: SnackbarManager */
    interface C10331b {
        /* renamed from: a */
        void mo26876a(int i);
    }

    /* renamed from: com.google.android.material.snackbar.f$c */
    /* compiled from: SnackbarManager */
    private static class C10332c {

        /* renamed from: a */
        final WeakReference<C10331b> f24469a;

        /* renamed from: b */
        int f24470b;

        /* renamed from: c */
        boolean f24471c;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo26877a(C10331b bVar) {
            return bVar != null && this.f24469a.get() == bVar;
        }
    }

    private C10329f() {
    }

    /* renamed from: a */
    static C10329f m32571a() {
        if (f24463e == null) {
            f24463e = new C10329f();
        }
        return f24463e;
    }

    /* renamed from: c */
    private boolean m32574c(C10331b bVar) {
        C10332c cVar = this.f24466c;
        return cVar != null && cVar.mo26877a(bVar);
    }

    /* renamed from: b */
    public void mo26874b(C10331b bVar) {
        synchronized (this.f24464a) {
            if (m32574c(bVar) && this.f24466c.f24471c) {
                this.f24466c.f24471c = false;
                m32573b(this.f24466c);
            }
        }
    }

    /* renamed from: a */
    public void mo26872a(C10331b bVar) {
        synchronized (this.f24464a) {
            if (m32574c(bVar) && !this.f24466c.f24471c) {
                this.f24466c.f24471c = true;
                this.f24465b.removeCallbacksAndMessages(this.f24466c);
            }
        }
    }

    /* renamed from: b */
    private void m32573b(C10332c cVar) {
        int i = cVar.f24470b;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? 1500 : 2750;
            }
            this.f24465b.removeCallbacksAndMessages(cVar);
            Handler handler = this.f24465b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i);
        }
    }

    /* renamed from: a */
    private boolean m32572a(C10332c cVar, int i) {
        C10331b bVar = (C10331b) cVar.f24469a.get();
        if (bVar == null) {
            return false;
        }
        this.f24465b.removeCallbacksAndMessages(cVar);
        bVar.mo26876a(i);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26873a(C10332c cVar) {
        synchronized (this.f24464a) {
            if (this.f24466c == cVar || this.f24467d == cVar) {
                m32572a(cVar, 2);
            }
        }
    }
}
