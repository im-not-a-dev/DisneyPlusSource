package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import p096e.p121h.p135s.C4187x;
import p096e.p121h.p135s.p136i0.C4151c;
import p096e.p121h.p135s.p136i0.C4151c.C4152a;
import p163g.p449j.p450a.p468b.C11467k;

/* renamed from: com.google.android.material.snackbar.d */
/* compiled from: BaseTransientBottomBar */
public class C10326d extends FrameLayout {

    /* renamed from: U */
    private final C4152a f24458U;

    /* renamed from: V */
    private C10325c f24459V;

    /* renamed from: W */
    private C10324b f24460W;

    /* renamed from: c */
    private final AccessibilityManager f24461c;

    /* renamed from: com.google.android.material.snackbar.d$a */
    /* compiled from: BaseTransientBottomBar */
    class C10327a implements C4152a {
        C10327a() {
        }

        public void onTouchExplorationStateChanged(boolean z) {
            C10326d.this.setClickableOrFocusableBasedOnAccessibility(z);
        }
    }

    protected C10326d(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    public void setClickableOrFocusableBasedOnAccessibility(boolean z) {
        setClickable(!z);
        setFocusable(z);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10324b bVar = this.f24460W;
        if (bVar != null) {
            bVar.onViewAttachedToWindow(this);
        }
        C4187x.m14345J(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C10324b bVar = this.f24460W;
        if (bVar != null) {
            bVar.onViewDetachedFromWindow(this);
        }
        C4151c.m14211b(this.f24461c, this.f24458U);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C10325c cVar = this.f24459V;
        if (cVar != null) {
            cVar.mo26866a(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: 0000 */
    public void setOnAttachStateChangeListener(C10324b bVar) {
        this.f24460W = bVar;
    }

    /* access modifiers changed from: 0000 */
    public void setOnLayoutChangeListener(C10325c cVar) {
        this.f24459V = cVar;
    }

    protected C10326d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11467k.SnackbarLayout);
        if (obtainStyledAttributes.hasValue(C11467k.SnackbarLayout_elevation)) {
            C4187x.m14372b((View) this, (float) obtainStyledAttributes.getDimensionPixelSize(C11467k.SnackbarLayout_elevation, 0));
        }
        obtainStyledAttributes.recycle();
        this.f24461c = (AccessibilityManager) context.getSystemService("accessibility");
        this.f24458U = new C10327a();
        C4151c.m14210a(this.f24461c, this.f24458U);
        setClickableOrFocusableBasedOnAccessibility(this.f24461c.isTouchExplorationEnabled());
    }
}
