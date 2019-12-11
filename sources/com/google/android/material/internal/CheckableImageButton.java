package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.C0249k;
import net.danlew.android.joda.DateUtils;
import p096e.p097a.C3858a;
import p096e.p121h.p135s.C4119a;
import p096e.p121h.p135s.C4187x;
import p096e.p121h.p135s.p136i0.C4154d;

public class CheckableImageButton extends C0249k implements Checkable {

    /* renamed from: W */
    private static final int[] f24370W = {16842912};

    /* renamed from: V */
    private boolean f24371V;

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    class C10310a extends C4119a {
        C10310a() {
        }

        /* renamed from: a */
        public void mo2816a(View view, C4154d dVar) {
            super.mo2816a(view, dVar);
            dVar.mo14749b(true);
            dVar.mo14754c(CheckableImageButton.this.isChecked());
        }

        /* renamed from: b */
        public void mo2818b(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2818b(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public boolean isChecked() {
        return this.f24371V;
    }

    public int[] onCreateDrawableState(int i) {
        if (this.f24371V) {
            return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + f24370W.length), f24370W);
        }
        return super.onCreateDrawableState(i);
    }

    public void setChecked(boolean z) {
        if (this.f24371V != z) {
            this.f24371V = z;
            refreshDrawableState();
            sendAccessibilityEvent(DateUtils.FORMAT_NO_MIDNIGHT);
        }
    }

    public void toggle() {
        setChecked(!this.f24371V);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3858a.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C4187x.m14359a((View) this, (C4119a) new C10310a());
    }
}
