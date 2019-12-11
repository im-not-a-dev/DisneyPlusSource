package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.C0715i.C0716a;

/* renamed from: androidx.lifecycle.v */
/* compiled from: ProcessLifecycleOwner */
public class C0733v implements C0722m {

    /* renamed from: b0 */
    private static final C0733v f3015b0 = new C0733v();

    /* renamed from: U */
    private int f3016U = 0;

    /* renamed from: V */
    private boolean f3017V = true;

    /* renamed from: W */
    private boolean f3018W = true;

    /* renamed from: X */
    private Handler f3019X;

    /* renamed from: Y */
    private final C0723n f3020Y = new C0723n(this);

    /* renamed from: Z */
    private Runnable f3021Z = new C0734a();

    /* renamed from: a0 */
    C0738a f3022a0 = new C0735b();

    /* renamed from: c */
    private int f3023c = 0;

    /* renamed from: androidx.lifecycle.v$a */
    /* compiled from: ProcessLifecycleOwner */
    class C0734a implements Runnable {
        C0734a() {
        }

        public void run() {
            C0733v.this.mo4156g();
            C0733v.this.mo4157h();
        }
    }

    /* renamed from: androidx.lifecycle.v$b */
    /* compiled from: ProcessLifecycleOwner */
    class C0735b implements C0738a {
        C0735b() {
        }

        /* renamed from: a */
        public void mo4159a() {
            C0733v.this.mo4154e();
        }

        /* renamed from: b */
        public void mo4160b() {
        }

        /* renamed from: c */
        public void mo4161c() {
            C0733v.this.mo4153d();
        }
    }

    /* renamed from: androidx.lifecycle.v$c */
    /* compiled from: ProcessLifecycleOwner */
    class C0736c extends C0711e {
        C0736c() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C0737w.m3793a(activity).mo4164a(C0733v.this.f3022a0);
        }

        public void onActivityPaused(Activity activity) {
            C0733v.this.mo4152c();
        }

        public void onActivityStopped(Activity activity) {
            C0733v.this.mo4155f();
        }
    }

    private C0733v() {
    }

    /* renamed from: b */
    static void m3781b(Context context) {
        f3015b0.mo4151a(context);
    }

    /* renamed from: i */
    public static C0722m m3782i() {
        return f3015b0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4151a(Context context) {
        this.f3019X = new Handler();
        this.f3020Y.mo4139a(C0716a.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0736c());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo4152c() {
        this.f3016U--;
        if (this.f3016U == 0) {
            this.f3019X.postDelayed(this.f3021Z, 700);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo4153d() {
        this.f3016U++;
        if (this.f3016U != 1) {
            return;
        }
        if (this.f3017V) {
            this.f3020Y.mo4139a(C0716a.ON_RESUME);
            this.f3017V = false;
            return;
        }
        this.f3019X.removeCallbacks(this.f3021Z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo4154e() {
        this.f3023c++;
        if (this.f3023c == 1 && this.f3018W) {
            this.f3020Y.mo4139a(C0716a.ON_START);
            this.f3018W = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo4155f() {
        this.f3023c--;
        mo4157h();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo4156g() {
        if (this.f3016U == 0) {
            this.f3017V = true;
            this.f3020Y.mo4139a(C0716a.ON_PAUSE);
        }
    }

    public C0715i getLifecycle() {
        return this.f3020Y;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo4157h() {
        if (this.f3023c == 0 && this.f3017V) {
            this.f3020Y.mo4139a(C0716a.ON_STOP);
            this.f3018W = true;
        }
    }
}
