package p096e.p121h.p135s;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: e.h.s.t */
/* compiled from: OneShotPreDrawListener */
public final class C4183t implements OnPreDrawListener, OnAttachStateChangeListener {

    /* renamed from: U */
    private ViewTreeObserver f10477U;

    /* renamed from: V */
    private final Runnable f10478V;

    /* renamed from: c */
    private final View f10479c;

    private C4183t(View view, Runnable runnable) {
        this.f10479c = view;
        this.f10477U = view.getViewTreeObserver();
        this.f10478V = runnable;
    }

    /* renamed from: a */
    public static C4183t m14332a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            C4183t tVar = new C4183t(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(tVar);
            view.addOnAttachStateChangeListener(tVar);
            return tVar;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public boolean onPreDraw() {
        mo14827a();
        this.f10478V.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f10477U = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        mo14827a();
    }

    /* renamed from: a */
    public void mo14827a() {
        if (this.f10477U.isAlive()) {
            this.f10477U.removeOnPreDrawListener(this);
        } else {
            this.f10479c.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f10479c.removeOnAttachStateChangeListener(this);
    }
}
