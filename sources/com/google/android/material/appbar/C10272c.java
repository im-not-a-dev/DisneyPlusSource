package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0443c;

/* renamed from: com.google.android.material.appbar.c */
/* compiled from: ViewOffsetBehavior */
class C10272c<V extends View> extends C0443c<V> {

    /* renamed from: a */
    private C10273d f24140a;

    /* renamed from: b */
    private int f24141b = 0;

    /* renamed from: c */
    private int f24142c = 0;

    public C10272c() {
    }

    /* renamed from: a */
    public boolean mo2526a(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo26373b(coordinatorLayout, v, i);
        if (this.f24140a == null) {
            this.f24140a = new C10273d(v);
        }
        this.f24140a.mo26380b();
        int i2 = this.f24141b;
        if (i2 != 0) {
            this.f24140a.mo26381b(i2);
            this.f24141b = 0;
        }
        int i3 = this.f24142c;
        if (i3 != 0) {
            this.f24140a.mo26379a(i3);
            this.f24142c = 0;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo26373b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.mo2480c((View) v, i);
    }

    /* renamed from: b */
    public int mo26377b() {
        C10273d dVar = this.f24140a;
        if (dVar != null) {
            return dVar.mo26378a();
        }
        return 0;
    }

    public C10272c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo26376a(int i) {
        C10273d dVar = this.f24140a;
        if (dVar != null) {
            return dVar.mo26381b(i);
        }
        this.f24141b = i;
        return false;
    }
}
