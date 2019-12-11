package com.bamtechmedia.dominguez.core.p221p;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.bamtechmedia.dominguez.core.p.a */
/* compiled from: RoundRectOutlineProvider.kt */
public final class C5801a extends ViewOutlineProvider {

    /* renamed from: a */
    private final float f13583a;

    public C5801a(float f) {
        this.f13583a = f;
    }

    public void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f13583a);
    }
}
