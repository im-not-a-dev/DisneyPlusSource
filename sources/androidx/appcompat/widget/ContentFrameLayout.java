package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import p096e.p121h.p135s.C4187x;

public class ContentFrameLayout extends FrameLayout {

    /* renamed from: U */
    private TypedValue f767U;

    /* renamed from: V */
    private TypedValue f768V;

    /* renamed from: W */
    private TypedValue f769W;

    /* renamed from: a0 */
    private TypedValue f770a0;

    /* renamed from: b0 */
    private TypedValue f771b0;

    /* renamed from: c */
    private TypedValue f772c;

    /* renamed from: c0 */
    private final Rect f773c0;

    /* renamed from: d0 */
    private C0170a f774d0;

    /* renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    public interface C0170a {
        /* renamed from: a */
        void mo528a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo1211a(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f770a0 == null) {
            this.f770a0 = new TypedValue();
        }
        return this.f770a0;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f771b0 == null) {
            this.f771b0 = new TypedValue();
        }
        return this.f771b0;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f768V == null) {
            this.f768V = new TypedValue();
        }
        return this.f768V;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f769W == null) {
            this.f769W = new TypedValue();
        }
        return this.f769W;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f772c == null) {
            this.f772c = new TypedValue();
        }
        return this.f772c;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f767U == null) {
            this.f767U = new TypedValue();
        }
        return this.f767U;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0170a aVar = this.f774d0;
        if (aVar != null) {
            aVar.mo528a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0170a aVar = this.f774d0;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            android.content.Context r0 = r13.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = r0.widthPixels
            int r2 = r0.heightPixels
            r3 = 1
            r4 = 0
            if (r1 >= r2) goto L_0x0016
            r1 = 1
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            int r2 = android.view.View.MeasureSpec.getMode(r14)
            int r5 = android.view.View.MeasureSpec.getMode(r15)
            r6 = 6
            r7 = 5
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 1073741824(0x40000000, float:2.0)
            if (r2 != r8) goto L_0x0061
            if (r1 == 0) goto L_0x002c
            android.util.TypedValue r10 = r13.f769W
            goto L_0x002e
        L_0x002c:
            android.util.TypedValue r10 = r13.f768V
        L_0x002e:
            if (r10 == 0) goto L_0x0061
            int r11 = r10.type
            if (r11 == 0) goto L_0x0061
            if (r11 != r7) goto L_0x003c
            float r10 = r10.getDimension(r0)
        L_0x003a:
            int r10 = (int) r10
            goto L_0x0048
        L_0x003c:
            if (r11 != r6) goto L_0x0047
            int r11 = r0.widthPixels
            float r12 = (float) r11
            float r11 = (float) r11
            float r10 = r10.getFraction(r12, r11)
            goto L_0x003a
        L_0x0047:
            r10 = 0
        L_0x0048:
            if (r10 <= 0) goto L_0x0061
            android.graphics.Rect r11 = r13.f773c0
            int r12 = r11.left
            int r11 = r11.right
            int r12 = r12 + r11
            int r10 = r10 - r12
            int r14 = android.view.View.MeasureSpec.getSize(r14)
            int r14 = java.lang.Math.min(r10, r14)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r9)
            r10 = r14
            r14 = 1
            goto L_0x0063
        L_0x0061:
            r10 = r14
            r14 = 0
        L_0x0063:
            if (r5 != r8) goto L_0x009c
            if (r1 == 0) goto L_0x006a
            android.util.TypedValue r5 = r13.f770a0
            goto L_0x006c
        L_0x006a:
            android.util.TypedValue r5 = r13.f771b0
        L_0x006c:
            if (r5 == 0) goto L_0x009c
            int r11 = r5.type
            if (r11 == 0) goto L_0x009c
            if (r11 != r7) goto L_0x007a
            float r5 = r5.getDimension(r0)
        L_0x0078:
            int r5 = (int) r5
            goto L_0x0086
        L_0x007a:
            if (r11 != r6) goto L_0x0085
            int r11 = r0.heightPixels
            float r12 = (float) r11
            float r11 = (float) r11
            float r5 = r5.getFraction(r12, r11)
            goto L_0x0078
        L_0x0085:
            r5 = 0
        L_0x0086:
            if (r5 <= 0) goto L_0x009c
            android.graphics.Rect r11 = r13.f773c0
            int r12 = r11.top
            int r11 = r11.bottom
            int r12 = r12 + r11
            int r5 = r5 - r12
            int r15 = android.view.View.MeasureSpec.getSize(r15)
            int r15 = java.lang.Math.min(r5, r15)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r9)
        L_0x009c:
            super.onMeasure(r10, r15)
            int r5 = r13.getMeasuredWidth()
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r9)
            if (r14 != 0) goto L_0x00dd
            if (r2 != r8) goto L_0x00dd
            if (r1 == 0) goto L_0x00b0
            android.util.TypedValue r14 = r13.f767U
            goto L_0x00b2
        L_0x00b0:
            android.util.TypedValue r14 = r13.f772c
        L_0x00b2:
            if (r14 == 0) goto L_0x00dd
            int r1 = r14.type
            if (r1 == 0) goto L_0x00dd
            if (r1 != r7) goto L_0x00c0
            float r14 = r14.getDimension(r0)
        L_0x00be:
            int r14 = (int) r14
            goto L_0x00cc
        L_0x00c0:
            if (r1 != r6) goto L_0x00cb
            int r0 = r0.widthPixels
            float r1 = (float) r0
            float r0 = (float) r0
            float r14 = r14.getFraction(r1, r0)
            goto L_0x00be
        L_0x00cb:
            r14 = 0
        L_0x00cc:
            if (r14 <= 0) goto L_0x00d6
            android.graphics.Rect r0 = r13.f773c0
            int r1 = r0.left
            int r0 = r0.right
            int r1 = r1 + r0
            int r14 = r14 - r1
        L_0x00d6:
            if (r5 >= r14) goto L_0x00dd
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r9)
            goto L_0x00de
        L_0x00dd:
            r3 = 0
        L_0x00de:
            if (r3 == 0) goto L_0x00e3
            super.onMeasure(r10, r15)
        L_0x00e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(C0170a aVar) {
        this.f774d0 = aVar;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo1210a(int i, int i2, int i3, int i4) {
        this.f773c0.set(i, i2, i3, i4);
        if (C4187x.m14340E(this)) {
            requestLayout();
        }
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f773c0 = new Rect();
    }
}
