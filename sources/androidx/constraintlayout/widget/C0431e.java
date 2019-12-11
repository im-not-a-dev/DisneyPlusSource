package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout.C0415c;

/* renamed from: androidx.constraintlayout.widget.e */
/* compiled from: Constraints */
public class C0431e extends ViewGroup {

    /* renamed from: c */
    C0425d f1972c;

    /* renamed from: androidx.constraintlayout.widget.e$a */
    /* compiled from: Constraints */
    public static class C0432a extends C0415c {

        /* renamed from: A0 */
        public float f1973A0;

        /* renamed from: o0 */
        public float f1974o0;

        /* renamed from: p0 */
        public boolean f1975p0;

        /* renamed from: q0 */
        public float f1976q0;

        /* renamed from: r0 */
        public float f1977r0;

        /* renamed from: s0 */
        public float f1978s0;

        /* renamed from: t0 */
        public float f1979t0;

        /* renamed from: u0 */
        public float f1980u0;

        /* renamed from: v0 */
        public float f1981v0;

        /* renamed from: w0 */
        public float f1982w0;

        /* renamed from: x0 */
        public float f1983x0;

        /* renamed from: y0 */
        public float f1984y0;

        /* renamed from: z0 */
        public float f1985z0;

        public C0432a(int i, int i2) {
            super(i, i2);
            this.f1974o0 = 1.0f;
            this.f1975p0 = false;
            this.f1976q0 = 0.0f;
            this.f1977r0 = 0.0f;
            this.f1978s0 = 0.0f;
            this.f1979t0 = 0.0f;
            this.f1980u0 = 1.0f;
            this.f1981v0 = 1.0f;
            this.f1982w0 = 0.0f;
            this.f1983x0 = 0.0f;
            this.f1984y0 = 0.0f;
            this.f1985z0 = 0.0f;
            this.f1973A0 = 0.0f;
        }

        public C0432a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1974o0 = 1.0f;
            this.f1975p0 = false;
            this.f1976q0 = 0.0f;
            this.f1977r0 = 0.0f;
            this.f1978s0 = 0.0f;
            this.f1979t0 = 0.0f;
            this.f1980u0 = 1.0f;
            this.f1981v0 = 1.0f;
            this.f1982w0 = 0.0f;
            this.f1983x0 = 0.0f;
            this.f1984y0 = 0.0f;
            this.f1985z0 = 0.0f;
            this.f1973A0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0436i.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0436i.ConstraintSet_android_alpha) {
                    this.f1974o0 = obtainStyledAttributes.getFloat(index, this.f1974o0);
                } else if (index == C0436i.ConstraintSet_android_elevation) {
                    if (VERSION.SDK_INT >= 21) {
                        this.f1976q0 = obtainStyledAttributes.getFloat(index, this.f1976q0);
                        this.f1975p0 = true;
                    }
                } else if (index == C0436i.ConstraintSet_android_rotationX) {
                    this.f1978s0 = obtainStyledAttributes.getFloat(index, this.f1978s0);
                } else if (index == C0436i.ConstraintSet_android_rotationY) {
                    this.f1979t0 = obtainStyledAttributes.getFloat(index, this.f1979t0);
                } else if (index == C0436i.ConstraintSet_android_rotation) {
                    this.f1977r0 = obtainStyledAttributes.getFloat(index, this.f1977r0);
                } else if (index == C0436i.ConstraintSet_android_scaleX) {
                    this.f1980u0 = obtainStyledAttributes.getFloat(index, this.f1980u0);
                } else if (index == C0436i.ConstraintSet_android_scaleY) {
                    this.f1981v0 = obtainStyledAttributes.getFloat(index, this.f1981v0);
                } else if (index == C0436i.ConstraintSet_android_transformPivotX) {
                    this.f1982w0 = obtainStyledAttributes.getFloat(index, this.f1982w0);
                } else if (index == C0436i.ConstraintSet_android_transformPivotY) {
                    this.f1983x0 = obtainStyledAttributes.getFloat(index, this.f1983x0);
                } else if (index == C0436i.ConstraintSet_android_translationX) {
                    this.f1984y0 = obtainStyledAttributes.getFloat(index, this.f1984y0);
                } else if (index == C0436i.ConstraintSet_android_translationY) {
                    this.f1985z0 = obtainStyledAttributes.getFloat(index, this.f1985z0);
                } else if (index == C0436i.ConstraintSet_android_translationZ && VERSION.SDK_INT >= 21) {
                    this.f1973A0 = obtainStyledAttributes.getFloat(index, this.f1973A0);
                }
            }
        }
    }

    public C0425d getConstraintSet() {
        if (this.f1972c == null) {
            this.f1972c = new C0425d();
        }
        this.f1972c.mo2422a(this);
        return this.f1972c;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: protected */
    public C0432a generateDefaultLayoutParams() {
        return new C0432a(-2, -2);
    }

    public C0432a generateLayoutParams(AttributeSet attributeSet) {
        return new C0432a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0415c(layoutParams);
    }
}
