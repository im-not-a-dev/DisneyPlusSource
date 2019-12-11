package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: k */
    private final C10323a f24452k = new C10323a(this);

    /* renamed from: a */
    public boolean mo26387a(View view) {
        return this.f24452k.mo26863a(view);
    }

    /* renamed from: a */
    public boolean mo2530a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f24452k.mo26862a(coordinatorLayout, view, motionEvent);
        return super.mo2530a(coordinatorLayout, view, motionEvent);
    }
}
