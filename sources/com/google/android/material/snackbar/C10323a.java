package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: com.google.android.material.snackbar.a */
/* compiled from: BaseTransientBottomBar */
public class C10323a {

    /* renamed from: a */
    private C10331b f24457a;

    public C10323a(SwipeDismissBehavior<?> swipeDismissBehavior) {
        swipeDismissBehavior.mo26388b(0.1f);
        swipeDismissBehavior.mo26385a(0.6f);
        swipeDismissBehavior.mo26386a(0);
    }

    /* renamed from: a */
    public boolean mo26863a(View view) {
        return view instanceof C10326d;
    }

    /* renamed from: a */
    public void mo26862a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                C10329f.m32571a().mo26874b(this.f24457a);
            }
        } else if (coordinatorLayout.mo2473a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            C10329f.m32571a().mo26872a(this.f24457a);
        }
    }
}
