package com.google.android.material.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: com.google.android.material.internal.c */
/* compiled from: DescendantOffsetUtils */
public class C10314c {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f24432a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f24433b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m32541a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m32543b(viewGroup, view, rect);
    }

    /* renamed from: b */
    public static void m32543b(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = (Matrix) f24432a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f24432a.set(matrix);
        } else {
            matrix.reset();
        }
        m32542a((ViewParent) viewGroup, view, matrix);
        RectF rectF = (RectF) f24433b.get();
        if (rectF == null) {
            rectF = new RectF();
            f24433b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: a */
    private static void m32542a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m32542a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
