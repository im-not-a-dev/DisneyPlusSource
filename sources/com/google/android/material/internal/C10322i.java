package com.google.android.material.internal;

import android.widget.ImageButton;

/* renamed from: com.google.android.material.internal.i */
/* compiled from: VisibilityAwareImageButton */
public class C10322i extends ImageButton {

    /* renamed from: c */
    private int f24451c;

    /* renamed from: a */
    public final void mo26854a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f24451c = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f24451c;
    }

    public void setVisibility(int i) {
        mo26854a(i, true);
    }
}
