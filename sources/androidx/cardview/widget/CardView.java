package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import p096e.p112d.C3921a;
import p096e.p112d.C3922b;
import p096e.p112d.C3924d;
import p096e.p112d.C3925e;

public class CardView extends FrameLayout {

    /* renamed from: d0 */
    private static final int[] f1327d0 = {16842801};

    /* renamed from: e0 */
    private static final C0310e f1328e0;

    /* renamed from: U */
    private boolean f1329U;

    /* renamed from: V */
    int f1330V;

    /* renamed from: W */
    int f1331W;

    /* renamed from: a0 */
    final Rect f1332a0;

    /* renamed from: b0 */
    final Rect f1333b0;

    /* renamed from: c */
    private boolean f1334c;

    /* renamed from: c0 */
    private final C0309d f1335c0;

    /* renamed from: androidx.cardview.widget.CardView$a */
    class C0303a implements C0309d {

        /* renamed from: a */
        private Drawable f1336a;

        C0303a() {
        }

        /* renamed from: a */
        public void mo2051a(Drawable drawable) {
            this.f1336a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        /* renamed from: b */
        public boolean mo2053b() {
            return CardView.this.getUseCompatPadding();
        }

        /* renamed from: c */
        public Drawable mo2054c() {
            return this.f1336a;
        }

        /* renamed from: d */
        public View mo2055d() {
            return CardView.this;
        }

        /* renamed from: a */
        public boolean mo2052a() {
            return CardView.this.getPreventCornerOverlap();
        }

        /* renamed from: a */
        public void mo2050a(int i, int i2, int i3, int i4) {
            CardView.this.f1333b0.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1332a0;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        /* renamed from: a */
        public void mo2049a(int i, int i2) {
            CardView cardView = CardView.this;
            if (i > cardView.f1330V) {
                CardView.super.setMinimumWidth(i);
            }
            CardView cardView2 = CardView.this;
            if (i2 > cardView2.f1331W) {
                CardView.super.setMinimumHeight(i2);
            }
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            f1328e0 = new C0306b();
        } else if (i >= 17) {
            f1328e0 = new C0304a();
        } else {
            f1328e0 = new C0307c();
        }
        f1328e0.mo2056a();
    }

    public CardView(Context context) {
        this(context, null);
    }

    public ColorStateList getCardBackgroundColor() {
        return f1328e0.mo2067e(this.f1335c0);
    }

    public float getCardElevation() {
        return f1328e0.mo2058a(this.f1335c0);
    }

    public int getContentPaddingBottom() {
        return this.f1332a0.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1332a0.left;
    }

    public int getContentPaddingRight() {
        return this.f1332a0.right;
    }

    public int getContentPaddingTop() {
        return this.f1332a0.top;
    }

    public float getMaxCardElevation() {
        return f1328e0.mo2066d(this.f1335c0);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1329U;
    }

    public float getRadius() {
        return f1328e0.mo2062b(this.f1335c0);
    }

    public boolean getUseCompatPadding() {
        return this.f1334c;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!(f1328e0 instanceof C0306b)) {
            int mode = MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f1328e0.mo2069g(this.f1335c0)), MeasureSpec.getSize(i)), mode);
            }
            int mode2 = MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f1328e0.mo2068f(this.f1335c0)), MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f1328e0.mo2061a(this.f1335c0, ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        f1328e0.mo2063b(this.f1335c0, f);
    }

    public void setMaxCardElevation(float f) {
        f1328e0.mo2065c(this.f1335c0, f);
    }

    public void setMinimumHeight(int i) {
        this.f1331W = i;
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        this.f1330V = i;
        super.setMinimumWidth(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f1329U) {
            this.f1329U = z;
            f1328e0.mo2070h(this.f1335c0);
        }
    }

    public void setRadius(float f) {
        f1328e0.mo2059a(this.f1335c0, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f1334c != z) {
            this.f1334c = z;
            f1328e0.mo2064c(this.f1335c0);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3921a.cardViewStyle);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f1328e0.mo2061a(this.f1335c0, colorStateList);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        ColorStateList valueOf;
        super(context, attributeSet, i);
        this.f1332a0 = new Rect();
        this.f1333b0 = new Rect();
        this.f1335c0 = new C0303a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3925e.CardView, i, C3924d.CardView);
        if (obtainStyledAttributes.hasValue(C3925e.CardView_cardBackgroundColor)) {
            valueOf = obtainStyledAttributes.getColorStateList(C3925e.CardView_cardBackgroundColor);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1327d0);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i2 = getResources().getColor(C3922b.cardview_light_background);
            } else {
                i2 = getResources().getColor(C3922b.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(i2);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(C3925e.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(C3925e.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(C3925e.CardView_cardMaxElevation, 0.0f);
        this.f1334c = obtainStyledAttributes.getBoolean(C3925e.CardView_cardUseCompatPadding, false);
        this.f1329U = obtainStyledAttributes.getBoolean(C3925e.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C3925e.CardView_contentPadding, 0);
        this.f1332a0.left = obtainStyledAttributes.getDimensionPixelSize(C3925e.CardView_contentPaddingLeft, dimensionPixelSize);
        this.f1332a0.top = obtainStyledAttributes.getDimensionPixelSize(C3925e.CardView_contentPaddingTop, dimensionPixelSize);
        this.f1332a0.right = obtainStyledAttributes.getDimensionPixelSize(C3925e.CardView_contentPaddingRight, dimensionPixelSize);
        this.f1332a0.bottom = obtainStyledAttributes.getDimensionPixelSize(C3925e.CardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1330V = obtainStyledAttributes.getDimensionPixelSize(C3925e.CardView_android_minWidth, 0);
        this.f1331W = obtainStyledAttributes.getDimensionPixelSize(C3925e.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        f1328e0.mo2060a(this.f1335c0, context, colorStateList, dimension, dimension2, f);
    }
}
