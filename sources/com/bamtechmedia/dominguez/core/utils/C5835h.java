package com.bamtechmedia.dominguez.core.utils;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bamtechmedia.dominguez.core.utils.h */
/* compiled from: CenteredImageSpan.kt */
public final class C5835h extends ImageSpan {

    /* renamed from: U */
    private Rect f13620U;

    /* renamed from: c */
    private WeakReference<Drawable> f13621c;

    public C5835h(Drawable drawable, int i) {
        super(drawable, i);
    }

    /* renamed from: a */
    private final Drawable m18830a() {
        WeakReference<Drawable> weakReference = this.f13621c;
        Drawable drawable = weakReference != null ? (Drawable) weakReference.get() : null;
        if (drawable == null) {
            drawable = getDrawable();
            if (drawable != null) {
                this.f13621c = new WeakReference<>(drawable);
            } else {
                Intrinsics.throwNpe();
                throw null;
            }
        }
        return drawable;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.save();
        Rect rect = this.f13620U;
        canvas.translate(f, (float) (i5 - (rect != null ? rect.bottom : 0)));
        m18830a().draw(canvas);
        canvas.restore();
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        Rect rect;
        Rect bounds = m18830a().getBounds();
        int i3 = (int) (paint.getFontMetrics().bottom - paint.getFontMetrics().top);
        if (bounds.right == bounds.bottom) {
            rect = new Rect(0, 0, i3, i3);
        } else {
            Intrinsics.checkReturnedValueIsNotNull((Object) bounds, "originalBounds");
            rect = mo17738a(bounds, i3);
        }
        this.f13620U = rect;
        m18830a().setBounds(rect);
        return rect.right;
    }

    /* renamed from: a */
    public final Rect mo17738a(Rect rect, int i) {
        double d;
        double d2 = (double) rect.right;
        double d3 = (double) rect.bottom;
        double d4 = (double) i;
        if (d4 > d3) {
            double d5 = (double) 1;
            d = d2 * ((d5 - (d3 / d4)) + d5);
        } else {
            double d6 = (double) 1;
            d = d2 / (((d3 / d4) + d6) - d6);
        }
        return new Rect(0, 0, (int) d, i);
    }
}
