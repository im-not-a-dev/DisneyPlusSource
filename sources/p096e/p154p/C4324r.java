package p096e.p154p;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

/* renamed from: e.p.r */
/* compiled from: TransitionUtils */
class C4324r {

    /* renamed from: a */
    private static final boolean f10766a = (VERSION.SDK_INT >= 19);

    /* renamed from: b */
    private static final boolean f10767b = (VERSION.SDK_INT >= 18);

    /* renamed from: c */
    private static final boolean f10768c;

    static {
        boolean z = true;
        if (VERSION.SDK_INT < 28) {
            z = false;
        }
        f10768c = z;
    }

    /* renamed from: a */
    static View m14890a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        C4283d0.m14706a(view, matrix);
        C4283d0.m14708b(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ScaleType.CENTER_CROP);
        Bitmap a = m14889a(view, matrix, rectF, viewGroup);
        if (a != null) {
            imageView.setImageBitmap(a);
        }
        imageView.measure(MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m14889a(android.view.View r9, android.graphics.Matrix r10, android.graphics.RectF r11, android.view.ViewGroup r12) {
        /*
            boolean r0 = f10766a
            r1 = 0
            if (r0 == 0) goto L_0x0013
            boolean r0 = r9.isAttachedToWindow()
            r0 = r0 ^ 1
            if (r12 != 0) goto L_0x000e
            goto L_0x0014
        L_0x000e:
            boolean r2 = r12.isAttachedToWindow()
            goto L_0x0015
        L_0x0013:
            r0 = 0
        L_0x0014:
            r2 = 0
        L_0x0015:
            boolean r3 = f10767b
            r4 = 0
            if (r3 == 0) goto L_0x0034
            if (r0 == 0) goto L_0x0034
            if (r2 != 0) goto L_0x001f
            return r4
        L_0x001f:
            android.view.ViewParent r1 = r9.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r2 = r1.indexOfChild(r9)
            android.view.ViewGroupOverlay r3 = r12.getOverlay()
            r3.add(r9)
            r8 = r2
            r2 = r1
            r1 = r8
            goto L_0x0035
        L_0x0034:
            r2 = r4
        L_0x0035:
            float r3 = r11.width()
            int r3 = java.lang.Math.round(r3)
            float r5 = r11.height()
            int r5 = java.lang.Math.round(r5)
            if (r3 <= 0) goto L_0x009b
            if (r5 <= 0) goto L_0x009b
            r4 = 1065353216(0x3f800000, float:1.0)
            r6 = 1233125376(0x49800000, float:1048576.0)
            int r7 = r3 * r5
            float r7 = (float) r7
            float r6 = r6 / r7
            float r4 = java.lang.Math.min(r4, r6)
            float r3 = (float) r3
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)
            float r5 = (float) r5
            float r5 = r5 * r4
            int r5 = java.lang.Math.round(r5)
            float r6 = r11.left
            float r6 = -r6
            float r11 = r11.top
            float r11 = -r11
            r10.postTranslate(r6, r11)
            r10.postScale(r4, r4)
            boolean r11 = f10768c
            if (r11 == 0) goto L_0x008a
            android.graphics.Picture r11 = new android.graphics.Picture
            r11.<init>()
            android.graphics.Canvas r3 = r11.beginRecording(r3, r5)
            r3.concat(r10)
            r9.draw(r3)
            r11.endRecording()
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r11)
            goto L_0x009b
        L_0x008a:
            android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r3, r5, r11)
            android.graphics.Canvas r11 = new android.graphics.Canvas
            r11.<init>(r4)
            r11.concat(r10)
            r9.draw(r11)
        L_0x009b:
            boolean r10 = f10767b
            if (r10 == 0) goto L_0x00ab
            if (r0 == 0) goto L_0x00ab
            android.view.ViewGroupOverlay r10 = r12.getOverlay()
            r10.remove(r9)
            r2.addView(r9, r1)
        L_0x00ab:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p154p.C4324r.m14889a(android.view.View, android.graphics.Matrix, android.graphics.RectF, android.view.ViewGroup):android.graphics.Bitmap");
    }

    /* renamed from: a */
    static Animator m14888a(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{animator, animator2});
        return animatorSet;
    }
}
