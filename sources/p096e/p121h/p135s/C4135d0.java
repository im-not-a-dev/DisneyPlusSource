package p096e.p121h.p135s;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: e.h.s.d0 */
/* compiled from: ViewPropertyAnimatorCompat */
public final class C4135d0 {

    /* renamed from: a */
    private WeakReference<View> f10431a;

    /* renamed from: b */
    Runnable f10432b = null;

    /* renamed from: c */
    Runnable f10433c = null;

    /* renamed from: d */
    int f10434d = -1;

    /* renamed from: e.h.s.d0$a */
    /* compiled from: ViewPropertyAnimatorCompat */
    class C4136a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C4140e0 f10435a;

        /* renamed from: b */
        final /* synthetic */ View f10436b;

        C4136a(C4135d0 d0Var, C4140e0 e0Var, View view) {
            this.f10435a = e0Var;
            this.f10436b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f10435a.mo1483a(this.f10436b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f10435a.mo531b(this.f10436b);
        }

        public void onAnimationStart(Animator animator) {
            this.f10435a.mo532c(this.f10436b);
        }
    }

    /* renamed from: e.h.s.d0$b */
    /* compiled from: ViewPropertyAnimatorCompat */
    class C4137b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C4145g0 f10437a;

        /* renamed from: b */
        final /* synthetic */ View f10438b;

        C4137b(C4135d0 d0Var, C4145g0 g0Var, View view) {
            this.f10437a = g0Var;
            this.f10438b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f10437a.mo596a(this.f10438b);
        }
    }

    /* renamed from: e.h.s.d0$c */
    /* compiled from: ViewPropertyAnimatorCompat */
    static class C4138c implements C4140e0 {

        /* renamed from: a */
        C4135d0 f10439a;

        /* renamed from: b */
        boolean f10440b;

        C4138c(C4135d0 d0Var) {
            this.f10439a = d0Var;
        }

        /* renamed from: a */
        public void mo1483a(View view) {
            Object tag = view.getTag(2113929216);
            C4140e0 e0Var = tag instanceof C4140e0 ? (C4140e0) tag : null;
            if (e0Var != null) {
                e0Var.mo1483a(view);
            }
        }

        /* renamed from: b */
        public void mo531b(View view) {
            int i = this.f10439a.f10434d;
            C4140e0 e0Var = null;
            if (i > -1) {
                view.setLayerType(i, null);
                this.f10439a.f10434d = -1;
            }
            if (VERSION.SDK_INT >= 16 || !this.f10440b) {
                C4135d0 d0Var = this.f10439a;
                Runnable runnable = d0Var.f10433c;
                if (runnable != null) {
                    d0Var.f10433c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                if (tag instanceof C4140e0) {
                    e0Var = (C4140e0) tag;
                }
                if (e0Var != null) {
                    e0Var.mo531b(view);
                }
                this.f10440b = true;
            }
        }

        /* renamed from: c */
        public void mo532c(View view) {
            this.f10440b = false;
            C4140e0 e0Var = null;
            if (this.f10439a.f10434d > -1) {
                view.setLayerType(2, null);
            }
            C4135d0 d0Var = this.f10439a;
            Runnable runnable = d0Var.f10432b;
            if (runnable != null) {
                d0Var.f10432b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if (tag instanceof C4140e0) {
                e0Var = (C4140e0) tag;
            }
            if (e0Var != null) {
                e0Var.mo532c(view);
            }
        }
    }

    C4135d0(View view) {
        this.f10431a = new WeakReference<>(view);
    }

    /* renamed from: a */
    public C4135d0 mo14705a(long j) {
        View view = (View) this.f10431a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: b */
    public C4135d0 mo14711b(float f) {
        View view = (View) this.f10431a.get();
        if (view != null) {
            view.animate().translationX(f);
        }
        return this;
    }

    /* renamed from: c */
    public C4135d0 mo14713c(float f) {
        View view = (View) this.f10431a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    /* renamed from: a */
    public C4135d0 mo14704a(float f) {
        View view = (View) this.f10431a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: b */
    public long mo14710b() {
        View view = (View) this.f10431a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    /* renamed from: c */
    public void mo14714c() {
        View view = (View) this.f10431a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: a */
    public C4135d0 mo14706a(Interpolator interpolator) {
        View view = (View) this.f10431a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: b */
    public C4135d0 mo14712b(long j) {
        View view = (View) this.f10431a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: a */
    public void mo14709a() {
        View view = (View) this.f10431a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: a */
    public C4135d0 mo14707a(C4140e0 e0Var) {
        View view = (View) this.f10431a.get();
        if (view != null) {
            if (VERSION.SDK_INT >= 16) {
                m14158a(view, e0Var);
            } else {
                view.setTag(2113929216, e0Var);
                m14158a(view, new C4138c(this));
            }
        }
        return this;
    }

    /* renamed from: a */
    private void m14158a(View view, C4140e0 e0Var) {
        if (e0Var != null) {
            view.animate().setListener(new C4136a(this, e0Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: a */
    public C4135d0 mo14708a(C4145g0 g0Var) {
        View view = (View) this.f10431a.get();
        if (view != null && VERSION.SDK_INT >= 19) {
            C4137b bVar = null;
            if (g0Var != null) {
                bVar = new C4137b(this, g0Var, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }
}
