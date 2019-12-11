package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import p096e.p121h.p135s.C4187x;
import p163g.p449j.p450a.p468b.C11462f;
import p163g.p449j.p450a.p468b.C11467k;

public class SnackbarContentLayout extends LinearLayout implements C10328e {

    /* renamed from: U */
    private Button f24453U;

    /* renamed from: V */
    private int f24454V;

    /* renamed from: W */
    private int f24455W;

    /* renamed from: c */
    private TextView f24456c;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private boolean m32566a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f24456c.getPaddingTop() == i2 && this.f24456c.getPaddingBottom() == i3) {
            return z;
        }
        m32565a((View) this.f24456c, i2, i3);
        return true;
    }

    public Button getActionView() {
        return this.f24453U;
    }

    public TextView getMessageView() {
        return this.f24456c;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f24456c = (TextView) findViewById(C11462f.snackbar_text);
        this.f24453U = (Button) findViewById(C11462f.snackbar_action);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (m32566a(1, r0, r0 - r1) != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (m32566a(0, r0, r0) != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f24454V
            if (r0 <= 0) goto L_0x0018
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f24454V
            if (r0 <= r1) goto L_0x0018
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L_0x0018:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = p163g.p449j.p450a.p468b.C11460d.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = p163g.p449j.p450a.p468b.C11460d.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f24456c
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x003c
            r2 = 1
            goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            if (r2 == 0) goto L_0x0056
            int r5 = r7.f24455W
            if (r5 <= 0) goto L_0x0056
            android.widget.Button r5 = r7.f24453U
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f24455W
            if (r5 <= r6) goto L_0x0056
            int r1 = r0 - r1
            boolean r0 = r7.m32566a(r4, r0, r1)
            if (r0 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0056:
            if (r2 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = r1
        L_0x005a:
            boolean r0 = r7.m32566a(r3, r0, r0)
            if (r0 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r4 = 0
        L_0x0062:
            if (r4 == 0) goto L_0x0067
            super.onMeasure(r8, r9)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11467k.SnackbarLayout);
        this.f24454V = obtainStyledAttributes.getDimensionPixelSize(C11467k.SnackbarLayout_android_maxWidth, -1);
        this.f24455W = obtainStyledAttributes.getDimensionPixelSize(C11467k.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private static void m32565a(View view, int i, int i2) {
        if (C4187x.m14342G(view)) {
            C4187x.m14354a(view, C4187x.m14403r(view), i, C4187x.m14402q(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }
}
