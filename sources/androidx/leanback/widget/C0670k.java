package androidx.leanback.widget;

import android.graphics.Rect;

/* renamed from: androidx.leanback.widget.k */
/* compiled from: ItemAlignmentFacetHelper */
class C0670k {

    /* renamed from: a */
    private static Rect f2880a = new Rect();

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r1 == null) goto L_0x0010;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m3579a(android.view.View r7, androidx.leanback.widget.C0668j.C0669a r8, int r9) {
        /*
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            androidx.leanback.widget.f$e r0 = (androidx.leanback.widget.C0652f.C0657e) r0
            int r1 = r8.f2874a
            if (r1 == 0) goto L_0x0010
            android.view.View r1 = r7.findViewById(r1)
            if (r1 != 0) goto L_0x0011
        L_0x0010:
            r1 = r7
        L_0x0011:
            int r2 = r8.f2876c
            r3 = 0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 1120403456(0x42c80000, float:100.0)
            if (r9 != 0) goto L_0x00bf
            int r9 = r7.getLayoutDirection()
            r6 = 1
            if (r9 != r6) goto L_0x0076
            if (r1 != r7) goto L_0x0028
            int r9 = r0.mo3947e(r1)
            goto L_0x002c
        L_0x0028:
            int r9 = r1.getWidth()
        L_0x002c:
            int r9 = r9 - r2
            boolean r2 = r8.f2878e
            if (r2 == 0) goto L_0x0046
            float r2 = r8.f2877d
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x003d
            int r2 = r1.getPaddingRight()
            int r9 = r9 - r2
            goto L_0x0046
        L_0x003d:
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0046
            int r2 = r1.getPaddingLeft()
            int r9 = r9 + r2
        L_0x0046:
            float r2 = r8.f2877d
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x005f
            if (r1 != r7) goto L_0x0053
            int r2 = r0.mo3947e(r1)
            goto L_0x0057
        L_0x0053:
            int r2 = r1.getWidth()
        L_0x0057:
            float r2 = (float) r2
            float r8 = r8.f2877d
            float r2 = r2 * r8
            float r2 = r2 / r5
            int r8 = (int) r2
            int r9 = r9 - r8
        L_0x005f:
            if (r7 == r1) goto L_0x0113
            android.graphics.Rect r8 = f2880a
            r8.right = r9
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r7.offsetDescendantRectToMyCoords(r1, r8)
            android.graphics.Rect r7 = f2880a
            int r7 = r7.right
            int r8 = r0.mo3953l()
            int r9 = r7 + r8
            goto L_0x0113
        L_0x0076:
            boolean r9 = r8.f2878e
            if (r9 == 0) goto L_0x008f
            float r9 = r8.f2877d
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0086
            int r9 = r1.getPaddingLeft()
            int r2 = r2 + r9
            goto L_0x008f
        L_0x0086:
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x008f
            int r9 = r1.getPaddingRight()
            int r2 = r2 - r9
        L_0x008f:
            float r9 = r8.f2877d
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x00a8
            if (r1 != r7) goto L_0x009c
            int r9 = r0.mo3947e(r1)
            goto L_0x00a0
        L_0x009c:
            int r9 = r1.getWidth()
        L_0x00a0:
            float r9 = (float) r9
            float r8 = r8.f2877d
            float r9 = r9 * r8
            float r9 = r9 / r5
            int r8 = (int) r9
            int r2 = r2 + r8
        L_0x00a8:
            r9 = r2
            if (r7 == r1) goto L_0x0113
            android.graphics.Rect r8 = f2880a
            r8.left = r9
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r7.offsetDescendantRectToMyCoords(r1, r8)
            android.graphics.Rect r7 = f2880a
            int r7 = r7.left
            int r8 = r0.mo3952k()
            int r9 = r7 - r8
            goto L_0x0113
        L_0x00bf:
            boolean r9 = r8.f2878e
            if (r9 == 0) goto L_0x00d8
            float r9 = r8.f2877d
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x00cf
            int r9 = r1.getPaddingTop()
            int r2 = r2 + r9
            goto L_0x00d8
        L_0x00cf:
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x00d8
            int r9 = r1.getPaddingBottom()
            int r2 = r2 - r9
        L_0x00d8:
            float r9 = r8.f2877d
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x00f1
            if (r1 != r7) goto L_0x00e5
            int r9 = r0.mo3938a(r1)
            goto L_0x00e9
        L_0x00e5:
            int r9 = r1.getHeight()
        L_0x00e9:
            float r9 = (float) r9
            float r3 = r8.f2877d
            float r9 = r9 * r3
            float r9 = r9 / r5
            int r9 = (int) r9
            int r2 = r2 + r9
        L_0x00f1:
            if (r7 == r1) goto L_0x0107
            android.graphics.Rect r9 = f2880a
            r9.top = r2
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r7.offsetDescendantRectToMyCoords(r1, r9)
            android.graphics.Rect r7 = f2880a
            int r7 = r7.top
            int r9 = r0.mo3954m()
            int r7 = r7 - r9
            r9 = r7
            goto L_0x0108
        L_0x0107:
            r9 = r2
        L_0x0108:
            boolean r7 = r8.mo3979e()
            if (r7 == 0) goto L_0x0113
            int r7 = r1.getBaseline()
            int r9 = r9 + r7
        L_0x0113:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0670k.m3579a(android.view.View, androidx.leanback.widget.j$a, int):int");
    }
}
