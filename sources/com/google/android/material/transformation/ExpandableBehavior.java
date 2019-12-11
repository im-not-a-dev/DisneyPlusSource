package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0443c;
import java.util.List;
import p096e.p121h.p135s.C4187x;
import p163g.p449j.p450a.p468b.p475q.C11496b;

public abstract class ExpandableBehavior extends C0443c<View> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f24646a = 0;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    class C10356a implements OnPreDrawListener {

        /* renamed from: U */
        final /* synthetic */ int f24647U;

        /* renamed from: V */
        final /* synthetic */ C11496b f24648V;

        /* renamed from: c */
        final /* synthetic */ View f24650c;

        C10356a(View view, int i, C11496b bVar) {
            this.f24650c = view;
            this.f24647U = i;
            this.f24648V = bVar;
        }

        public boolean onPreDraw() {
            this.f24650c.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f24646a == this.f24647U) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                C11496b bVar = this.f24648V;
                expandableBehavior.mo27090a((View) bVar, this.f24650c, bVar.mo26690a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo27090a(View view, View view2, boolean z, boolean z2);

    /* renamed from: b */
    public boolean mo2536b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        C11496b bVar = (C11496b) view2;
        if (!m32753a(bVar.mo26690a())) {
            return false;
        }
        this.f24646a = bVar.mo26690a() ? 1 : 2;
        return mo27090a((View) bVar, view, bVar.mo26690a(), true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C11496b mo27091e(CoordinatorLayout coordinatorLayout, View view) {
        List b = coordinatorLayout.mo2474b(view);
        int size = b.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) b.get(i);
            if (mo2531a(coordinatorLayout, view, view2)) {
                return (C11496b) view2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo2526a(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (!C4187x.m14340E(view)) {
            C11496b e = mo27091e(coordinatorLayout, view);
            if (e != null && m32753a(e.mo26690a())) {
                this.f24646a = e.mo26690a() ? 1 : 2;
                view.getViewTreeObserver().addOnPreDrawListener(new C10356a(view, this.f24646a, e));
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private boolean m32753a(boolean z) {
        boolean z2 = false;
        if (z) {
            int i = this.f24646a;
            if (i == 0 || i == 2) {
                z2 = true;
            }
            return z2;
        }
        if (this.f24646a == 1) {
            z2 = true;
        }
        return z2;
    }
}
