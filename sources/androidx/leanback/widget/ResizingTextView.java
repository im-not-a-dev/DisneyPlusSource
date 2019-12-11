package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.widget.TextView;
import androidx.core.widget.C0513i;
import p096e.p146l.C4234l;

class ResizingTextView extends TextView {

    /* renamed from: U */
    private int f2652U;

    /* renamed from: V */
    private boolean f2653V;

    /* renamed from: W */
    private int f2654W;

    /* renamed from: a0 */
    private int f2655a0;

    /* renamed from: b0 */
    private boolean f2656b0;

    /* renamed from: c */
    private int f2657c;

    /* renamed from: c0 */
    private int f2658c0;

    /* renamed from: d0 */
    private float f2659d0;

    /* renamed from: e0 */
    private int f2660e0;

    /* renamed from: f0 */
    private int f2661f0;

    public ResizingTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f2656b0 = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4234l.lbResizingTextView, i, i2);
        try {
            this.f2657c = obtainStyledAttributes.getInt(C4234l.lbResizingTextView_resizeTrigger, 1);
            this.f2652U = obtainStyledAttributes.getDimensionPixelSize(C4234l.lbResizingTextView_resizedTextSize, -1);
            this.f2653V = obtainStyledAttributes.getBoolean(C4234l.lbResizingTextView_maintainLineSpacing, false);
            this.f2654W = obtainStyledAttributes.getDimensionPixelOffset(C4234l.lbResizingTextView_resizedPaddingAdjustmentTop, 0);
            this.f2655a0 = obtainStyledAttributes.getDimensionPixelOffset(C4234l.lbResizingTextView_resizedPaddingAdjustmentBottom, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private void m3237a(int i, int i2) {
        if (isPaddingRelative()) {
            setPaddingRelative(getPaddingStart(), i, getPaddingEnd(), i2);
        } else {
            setPadding(getPaddingLeft(), i, getPaddingRight(), i2);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            boolean r0 = r5.f2656b0
            r1 = 1
            if (r0 != 0) goto L_0x0020
            float r0 = r5.getTextSize()
            int r0 = (int) r0
            r5.f2658c0 = r0
            float r0 = r5.getLineSpacingExtra()
            r5.f2659d0 = r0
            int r0 = r5.getPaddingTop()
            r5.f2660e0 = r0
            int r0 = r5.getPaddingBottom()
            r5.f2661f0 = r0
            r5.f2656b0 = r1
        L_0x0020:
            int r0 = r5.f2658c0
            float r0 = (float) r0
            r2 = 0
            r5.setTextSize(r2, r0)
            float r0 = r5.f2659d0
            float r3 = r5.getLineSpacingMultiplier()
            r5.setLineSpacing(r0, r3)
            int r0 = r5.f2660e0
            int r3 = r5.f2661f0
            r5.m3237a(r0, r3)
            super.onMeasure(r6, r7)
            android.text.Layout r0 = r5.getLayout()
            if (r0 == 0) goto L_0x0053
            int r3 = r5.f2657c
            r3 = r3 & r1
            if (r3 <= 0) goto L_0x0053
            int r0 = r0.getLineCount()
            int r3 = r5.getMaxLines()
            if (r3 <= r1) goto L_0x0053
            if (r0 != r3) goto L_0x0053
            r0 = 1
            goto L_0x0054
        L_0x0053:
            r0 = 0
        L_0x0054:
            float r3 = r5.getTextSize()
            int r3 = (int) r3
            r4 = -1
            if (r0 == 0) goto L_0x009f
            int r0 = r5.f2652U
            if (r0 == r4) goto L_0x0067
            if (r3 == r0) goto L_0x0067
            float r0 = (float) r0
            r5.setTextSize(r2, r0)
            r2 = 1
        L_0x0067:
            float r0 = r5.f2659d0
            int r3 = r5.f2658c0
            float r3 = (float) r3
            float r0 = r0 + r3
            int r3 = r5.f2652U
            float r3 = (float) r3
            float r0 = r0 - r3
            boolean r3 = r5.f2653V
            if (r3 == 0) goto L_0x0085
            float r3 = r5.getLineSpacingExtra()
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x0085
            float r2 = r5.getLineSpacingMultiplier()
            r5.setLineSpacing(r0, r2)
            r2 = 1
        L_0x0085:
            int r0 = r5.f2660e0
            int r3 = r5.f2654W
            int r0 = r0 + r3
            int r3 = r5.f2661f0
            int r4 = r5.f2655a0
            int r3 = r3 + r4
            int r4 = r5.getPaddingTop()
            if (r4 != r0) goto L_0x009b
            int r4 = r5.getPaddingBottom()
            if (r4 == r3) goto L_0x00d3
        L_0x009b:
            r5.m3237a(r0, r3)
            goto L_0x00dc
        L_0x009f:
            int r0 = r5.f2652U
            if (r0 == r4) goto L_0x00ac
            int r0 = r5.f2658c0
            if (r3 == r0) goto L_0x00ac
            float r0 = (float) r0
            r5.setTextSize(r2, r0)
            r2 = 1
        L_0x00ac:
            boolean r0 = r5.f2653V
            if (r0 == 0) goto L_0x00c2
            float r0 = r5.getLineSpacingExtra()
            float r3 = r5.f2659d0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00c2
            float r0 = r5.getLineSpacingMultiplier()
            r5.setLineSpacing(r3, r0)
            r2 = 1
        L_0x00c2:
            int r0 = r5.getPaddingTop()
            int r3 = r5.f2660e0
            if (r0 != r3) goto L_0x00d5
            int r0 = r5.getPaddingBottom()
            int r3 = r5.f2661f0
            if (r0 == r3) goto L_0x00d3
            goto L_0x00d5
        L_0x00d3:
            r1 = r2
            goto L_0x00dc
        L_0x00d5:
            int r0 = r5.f2660e0
            int r2 = r5.f2661f0
            r5.m3237a(r0, r2)
        L_0x00dc:
            if (r1 == 0) goto L_0x00e1
            super.onMeasure(r6, r7)
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.ResizingTextView.onMeasure(int, int):void");
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0513i.m2764a((TextView) this, callback));
    }

    public ResizingTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ResizingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public ResizingTextView(Context context) {
        this(context, null);
    }
}
