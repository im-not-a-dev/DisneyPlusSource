package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.appcompat.widget.C0204b0;
import androidx.appcompat.widget.C0235h;
import androidx.appcompat.widget.C0284t0;
import androidx.appcompat.widget.C0293w;
import androidx.core.graphics.drawable.C0492a;
import androidx.core.widget.C0513i;
import com.google.android.material.internal.C10313b;
import com.google.android.material.internal.C10314c;
import com.google.android.material.internal.C10315d;
import com.google.android.material.internal.C10320g;
import com.google.android.material.internal.C10321h;
import com.google.android.material.internal.CheckableImageButton;
import net.danlew.android.joda.DateUtils;
import p096e.p097a.p098k.p099a.C3868a;
import p096e.p121h.p122j.C4025a;
import p096e.p121h.p135s.C4119a;
import p096e.p121h.p135s.C4187x;
import p096e.p121h.p135s.p136i0.C4154d;
import p096e.p140j.p141a.C4204a;
import p163g.p449j.p450a.p468b.C11458b;
import p163g.p449j.p450a.p468b.C11459c;
import p163g.p449j.p450a.p468b.C11460d;
import p163g.p449j.p450a.p468b.C11462f;
import p163g.p449j.p450a.p468b.C11464h;
import p163g.p449j.p450a.p468b.C11465i;
import p163g.p449j.p450a.p468b.C11466j;
import p163g.p449j.p450a.p468b.C11467k;
import p163g.p449j.p450a.p468b.p469l.C11468a;

/* renamed from: com.google.android.material.textfield.c */
/* compiled from: TextInputLayout */
public class C10349c extends LinearLayout {

    /* renamed from: A0 */
    private Typeface f24585A0;

    /* renamed from: B0 */
    private boolean f24586B0;

    /* renamed from: C0 */
    private Drawable f24587C0;

    /* renamed from: D0 */
    private CharSequence f24588D0;

    /* renamed from: E0 */
    private CheckableImageButton f24589E0;

    /* renamed from: F0 */
    private boolean f24590F0;

    /* renamed from: G0 */
    private Drawable f24591G0;

    /* renamed from: H0 */
    private Drawable f24592H0;

    /* renamed from: I0 */
    private ColorStateList f24593I0;

    /* renamed from: J0 */
    private boolean f24594J0;

    /* renamed from: K0 */
    private Mode f24595K0;

    /* renamed from: L0 */
    private boolean f24596L0;

    /* renamed from: M0 */
    private ColorStateList f24597M0;

    /* renamed from: N0 */
    private ColorStateList f24598N0;

    /* renamed from: O0 */
    private final int f24599O0;

    /* renamed from: P0 */
    private final int f24600P0;

    /* renamed from: Q0 */
    private int f24601Q0;

    /* renamed from: R0 */
    private final int f24602R0;

    /* renamed from: S0 */
    private boolean f24603S0;

    /* renamed from: T0 */
    final C10313b f24604T0;

    /* renamed from: U */
    EditText f24605U;

    /* renamed from: U0 */
    private boolean f24606U0;

    /* renamed from: V */
    private CharSequence f24607V;

    /* renamed from: V0 */
    private ValueAnimator f24608V0;

    /* renamed from: W */
    private final C10347b f24609W;

    /* renamed from: W0 */
    private boolean f24610W0;

    /* renamed from: X0 */
    private boolean f24611X0;
    /* access modifiers changed from: private */

    /* renamed from: Y0 */
    public boolean f24612Y0;

    /* renamed from: a0 */
    boolean f24613a0;

    /* renamed from: b0 */
    private int f24614b0;

    /* renamed from: c */
    private final FrameLayout f24615c;

    /* renamed from: c0 */
    private boolean f24616c0;

    /* renamed from: d0 */
    private TextView f24617d0;

    /* renamed from: e0 */
    private final int f24618e0;

    /* renamed from: f0 */
    private final int f24619f0;

    /* renamed from: g0 */
    private boolean f24620g0;

    /* renamed from: h0 */
    private CharSequence f24621h0;

    /* renamed from: i0 */
    private boolean f24622i0;

    /* renamed from: j0 */
    private GradientDrawable f24623j0;

    /* renamed from: k0 */
    private final int f24624k0;

    /* renamed from: l0 */
    private final int f24625l0;

    /* renamed from: m0 */
    private int f24626m0;

    /* renamed from: n0 */
    private final int f24627n0;

    /* renamed from: o0 */
    private float f24628o0;

    /* renamed from: p0 */
    private float f24629p0;

    /* renamed from: q0 */
    private float f24630q0;

    /* renamed from: r0 */
    private float f24631r0;

    /* renamed from: s0 */
    private int f24632s0;

    /* renamed from: t0 */
    private final int f24633t0;

    /* renamed from: u0 */
    private final int f24634u0;

    /* renamed from: v0 */
    private int f24635v0;

    /* renamed from: w0 */
    private int f24636w0;

    /* renamed from: x0 */
    private Drawable f24637x0;

    /* renamed from: y0 */
    private final Rect f24638y0;

    /* renamed from: z0 */
    private final RectF f24639z0;

    /* renamed from: com.google.android.material.textfield.c$a */
    /* compiled from: TextInputLayout */
    class C10350a implements TextWatcher {
        C10350a() {
        }

        public void afterTextChanged(Editable editable) {
            C10349c cVar = C10349c.this;
            cVar.mo27021b(!cVar.f24612Y0);
            C10349c cVar2 = C10349c.this;
            if (cVar2.f24613a0) {
                cVar2.mo27016a(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.c$b */
    /* compiled from: TextInputLayout */
    class C10351b implements OnClickListener {
        C10351b() {
        }

        public void onClick(View view) {
            C10349c.this.mo27018a(false);
        }
    }

    /* renamed from: com.google.android.material.textfield.c$c */
    /* compiled from: TextInputLayout */
    class C10352c implements AnimatorUpdateListener {
        C10352c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C10349c.this.f24604T0.mo26828b(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.c$d */
    /* compiled from: TextInputLayout */
    public static class C10353d extends C4119a {

        /* renamed from: d */
        private final C10349c f24643d;

        public C10353d(C10349c cVar) {
            this.f24643d = cVar;
        }

        /* renamed from: a */
        public void mo2816a(View view, C4154d dVar) {
            super.mo2816a(view, dVar);
            EditText editText = this.f24643d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f24643d.getHint();
            CharSequence error = this.f24643d.getError();
            CharSequence counterOverflowDescription = this.f24643d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(error);
            boolean z4 = false;
            boolean z5 = z3 || !TextUtils.isEmpty(counterOverflowDescription);
            if (z) {
                dVar.mo14767g((CharSequence) text);
            } else if (z2) {
                dVar.mo14767g(hint);
            }
            if (z2) {
                dVar.mo14757d(hint);
                if (!z && z2) {
                    z4 = true;
                }
                dVar.mo14776k(z4);
            }
            if (z5) {
                if (!z3) {
                    error = counterOverflowDescription;
                }
                dVar.mo14753c(error);
                dVar.mo14758d(true);
            }
        }

        /* renamed from: c */
        public void mo14673c(View view, AccessibilityEvent accessibilityEvent) {
            super.mo14673c(view, accessibilityEvent);
            EditText editText = this.f24643d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            if (TextUtils.isEmpty(text)) {
                text = this.f24643d.getHint();
            }
            if (!TextUtils.isEmpty(text)) {
                accessibilityEvent.getText().add(text);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.c$e */
    /* compiled from: TextInputLayout */
    static class C10354e extends C4204a {
        public static final Creator<C10354e> CREATOR = new C10355a();

        /* renamed from: V */
        CharSequence f24644V;

        /* renamed from: W */
        boolean f24645W;

        /* renamed from: com.google.android.material.textfield.c$e$a */
        /* compiled from: TextInputLayout */
        static class C10355a implements ClassLoaderCreator<C10354e> {
            C10355a() {
            }

            public C10354e[] newArray(int i) {
                return new C10354e[i];
            }

            public C10354e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C10354e(parcel, classLoader);
            }

            public C10354e createFromParcel(Parcel parcel) {
                return new C10354e(parcel, null);
            }
        }

        C10354e(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TextInputLayout.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" error=");
            sb.append(this.f24644V);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f24644V, parcel, i);
            parcel.writeInt(this.f24645W ? 1 : 0);
        }

        C10354e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f24644V = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f24645W = z;
        }
    }

    public C10349c(Context context) {
        this(context, null);
    }

    /* renamed from: e */
    private void mo17545e() {
        if (this.f24623j0 != null) {
            m32735q();
            EditText editText = this.f24605U;
            if (editText != null && this.f24626m0 == 2) {
                if (editText.getBackground() != null) {
                    this.f24637x0 = this.f24605U.getBackground();
                }
                C4187x.m14358a((View) this.f24605U, (Drawable) null);
            }
            EditText editText2 = this.f24605U;
            if (editText2 != null && this.f24626m0 == 1) {
                Drawable drawable = this.f24637x0;
                if (drawable != null) {
                    C4187x.m14358a((View) editText2, drawable);
                }
            }
            int i = this.f24632s0;
            if (i > -1) {
                int i2 = this.f24635v0;
                if (i2 != 0) {
                    this.f24623j0.setStroke(i, i2);
                }
            }
            this.f24623j0.setCornerRadii(getCornerRadiiAsArray());
            this.f24623j0.setColor(this.f24636w0);
            invalidate();
        }
    }

    /* renamed from: f */
    private void mo17546f() {
        if (this.f24587C0 == null) {
            return;
        }
        if (this.f24594J0 || this.f24596L0) {
            this.f24587C0 = C0492a.m2652i(this.f24587C0).mutate();
            if (this.f24594J0) {
                C0492a.m2637a(this.f24587C0, this.f24593I0);
            }
            if (this.f24596L0) {
                C0492a.m2640a(this.f24587C0, this.f24595K0);
            }
            CheckableImageButton checkableImageButton = this.f24589E0;
            if (checkableImageButton != null) {
                Drawable drawable = checkableImageButton.getDrawable();
                Drawable drawable2 = this.f24587C0;
                if (drawable != drawable2) {
                    this.f24589E0.setImageDrawable(drawable2);
                }
            }
        }
    }

    /* renamed from: g */
    private void m32725g() {
        int i = this.f24626m0;
        if (i == 0) {
            this.f24623j0 = null;
        } else if (i == 2 && this.f24620g0 && !(this.f24623j0 instanceof C10346a)) {
            this.f24623j0 = new C10346a();
        } else if (!(this.f24623j0 instanceof GradientDrawable)) {
            this.f24623j0 = new GradientDrawable();
        }
    }

    private Drawable getBoxBackground() {
        int i = this.f24626m0;
        if (i == 1 || i == 2) {
            return this.f24623j0;
        }
        throw new IllegalStateException();
    }

    private float[] getCornerRadiiAsArray() {
        if (!C10321h.m32561a(this)) {
            float f = this.f24628o0;
            float f2 = this.f24629p0;
            float f3 = this.f24630q0;
            float f4 = this.f24631r0;
            return new float[]{f, f, f2, f2, f3, f3, f4, f4};
        }
        float f5 = this.f24629p0;
        float f6 = this.f24628o0;
        float f7 = this.f24631r0;
        float f8 = this.f24630q0;
        return new float[]{f5, f5, f6, f6, f7, f7, f8, f8};
    }

    /* renamed from: h */
    private int m32726h() {
        EditText editText = this.f24605U;
        if (editText == null) {
            return 0;
        }
        int i = this.f24626m0;
        if (i == 1) {
            return editText.getTop();
        }
        if (i != 2) {
            return 0;
        }
        return editText.getTop() + m32728j();
    }

    /* renamed from: i */
    private int m32727i() {
        int i = this.f24626m0;
        if (i == 1) {
            return getBoxBackground().getBounds().top + this.f24627n0;
        }
        if (i != 2) {
            return getPaddingTop();
        }
        return getBoxBackground().getBounds().top - m32728j();
    }

    /* renamed from: j */
    private int m32728j() {
        float c;
        if (!this.f24620g0) {
            return 0;
        }
        int i = this.f24626m0;
        if (i == 0 || i == 1) {
            c = this.f24604T0.mo26833c();
        } else if (i != 2) {
            return 0;
        } else {
            c = this.f24604T0.mo26833c() / 2.0f;
        }
        return (int) c;
    }

    /* renamed from: k */
    private void m32729k() {
        if (m32730l()) {
            ((C10346a) this.f24623j0).mo26987b();
        }
    }

    /* renamed from: l */
    private boolean m32730l() {
        return this.f24620g0 && !TextUtils.isEmpty(this.f24621h0) && (this.f24623j0 instanceof C10346a);
    }

    /* renamed from: m */
    private void m32731m() {
        int i = VERSION.SDK_INT;
        if (i == 21 || i == 22) {
            Drawable background = this.f24605U.getBackground();
            if (background != null && !this.f24610W0) {
                Drawable newDrawable = background.getConstantState().newDrawable();
                if (background instanceof DrawableContainer) {
                    this.f24610W0 = C10315d.m32544a((DrawableContainer) background, newDrawable.getConstantState());
                }
                if (!this.f24610W0) {
                    C4187x.m14358a((View) this.f24605U, newDrawable);
                    this.f24610W0 = true;
                    m32733o();
                }
            }
        }
    }

    /* renamed from: n */
    private boolean m32732n() {
        EditText editText = this.f24605U;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* renamed from: o */
    private void m32733o() {
        m32725g();
        if (this.f24626m0 != 0) {
            m32738t();
        }
        m32740v();
    }

    /* renamed from: p */
    private void m32734p() {
        if (m32730l()) {
            RectF rectF = this.f24639z0;
            this.f24604T0.mo26823a(rectF);
            m32717a(rectF);
            ((C10346a) this.f24623j0).mo26985a(rectF);
        }
    }

    /* renamed from: q */
    private void m32735q() {
        int i = this.f24626m0;
        if (i == 1) {
            this.f24632s0 = 0;
        } else if (i == 2 && this.f24601Q0 == 0) {
            this.f24601Q0 = this.f24598N0.getColorForState(getDrawableState(), this.f24598N0.getDefaultColor());
        }
    }

    /* renamed from: r */
    private boolean m32736r() {
        return this.f24586B0 && (m32732n() || this.f24590F0);
    }

    /* renamed from: s */
    private void m32737s() {
        EditText editText = this.f24605U;
        if (editText != null) {
            Drawable background = editText.getBackground();
            if (background != null) {
                if (C0204b0.m1172a(background)) {
                    background = background.mutate();
                }
                C10314c.m32541a((ViewGroup) this, (View) this.f24605U, new Rect());
                Rect bounds = background.getBounds();
                if (bounds.left != bounds.right) {
                    Rect rect = new Rect();
                    background.getPadding(rect);
                    background.setBounds(bounds.left - rect.left, bounds.top, bounds.right + (rect.right * 2), this.f24605U.getBottom());
                }
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f24605U == null) {
            if (!(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f24605U = editText;
            m32733o();
            setTextInputAccessibilityDelegate(new C10353d(this));
            if (!m32732n()) {
                this.f24604T0.mo26824a(this.f24605U.getTypeface());
            }
            this.f24604T0.mo26817a(this.f24605U.getTextSize());
            int gravity = this.f24605U.getGravity();
            this.f24604T0.mo26829b((gravity & -113) | 48);
            this.f24604T0.mo26834c(gravity);
            this.f24605U.addTextChangedListener(new C10350a());
            if (this.f24597M0 == null) {
                this.f24597M0 = this.f24605U.getHintTextColors();
            }
            if (this.f24620g0) {
                if (TextUtils.isEmpty(this.f24621h0)) {
                    this.f24607V = this.f24605U.getHint();
                    setHint(this.f24607V);
                    this.f24605U.setHint(null);
                }
                this.f24622i0 = true;
            }
            if (this.f24617d0 != null) {
                mo27016a(this.f24605U.getText().length());
            }
            this.f24609W.mo26989a();
            m32739u();
            m32719a(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f24621h0)) {
            this.f24621h0 = charSequence;
            this.f24604T0.mo26825a(charSequence);
            if (!this.f24603S0) {
                m32734p();
            }
        }
    }

    /* renamed from: t */
    private void m32738t() {
        LayoutParams layoutParams = (LayoutParams) this.f24615c.getLayoutParams();
        int j = m32728j();
        if (j != layoutParams.topMargin) {
            layoutParams.topMargin = j;
            this.f24615c.requestLayout();
        }
    }

    /* renamed from: u */
    private void m32739u() {
        if (this.f24605U != null) {
            if (m32736r()) {
                if (this.f24589E0 == null) {
                    this.f24589E0 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C11464h.design_text_input_password_icon, this.f24615c, false);
                    this.f24589E0.setImageDrawable(this.f24587C0);
                    this.f24589E0.setContentDescription(this.f24588D0);
                    this.f24615c.addView(this.f24589E0);
                    this.f24589E0.setOnClickListener(new C10351b());
                }
                EditText editText = this.f24605U;
                if (editText != null && C4187x.m14400o(editText) <= 0) {
                    this.f24605U.setMinimumHeight(C4187x.m14400o(this.f24589E0));
                }
                this.f24589E0.setVisibility(0);
                this.f24589E0.setChecked(this.f24590F0);
                if (this.f24591G0 == null) {
                    this.f24591G0 = new ColorDrawable();
                }
                this.f24591G0.setBounds(0, 0, this.f24589E0.getMeasuredWidth(), 1);
                Drawable[] a = C0513i.m2772a((TextView) this.f24605U);
                if (a[2] != this.f24591G0) {
                    this.f24592H0 = a[2];
                }
                C0513i.m2769a(this.f24605U, a[0], a[1], this.f24591G0, a[3]);
                this.f24589E0.setPadding(this.f24605U.getPaddingLeft(), this.f24605U.getPaddingTop(), this.f24605U.getPaddingRight(), this.f24605U.getPaddingBottom());
            } else {
                CheckableImageButton checkableImageButton = this.f24589E0;
                if (checkableImageButton != null && checkableImageButton.getVisibility() == 0) {
                    this.f24589E0.setVisibility(8);
                }
                if (this.f24591G0 != null) {
                    Drawable[] a2 = C0513i.m2772a((TextView) this.f24605U);
                    if (a2[2] == this.f24591G0) {
                        C0513i.m2769a(this.f24605U, a2[0], a2[1], this.f24592H0, a2[3]);
                        this.f24591G0 = null;
                    }
                }
            }
        }
    }

    /* renamed from: v */
    private void m32740v() {
        if (this.f24626m0 != 0 && this.f24623j0 != null && this.f24605U != null && getRight() != 0) {
            int left = this.f24605U.getLeft();
            int h = m32726h();
            int right = this.f24605U.getRight();
            int bottom = this.f24605U.getBottom() + this.f24624k0;
            if (this.f24626m0 == 2) {
                int i = this.f24634u0;
                left += i / 2;
                h -= i / 2;
                right -= i / 2;
                bottom += i / 2;
            }
            this.f24623j0.setBounds(left, h, right, bottom);
            mo17545e();
            m32737s();
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f24615c.addView(view, layoutParams2);
            this.f24615c.setLayoutParams(layoutParams);
            m32738t();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo27021b(boolean z) {
        m32719a(z, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo27023c() {
        EditText editText = this.f24605U;
        if (editText != null) {
            Drawable background = editText.getBackground();
            if (background != null) {
                m32731m();
                if (C0204b0.m1172a(background)) {
                    background = background.mutate();
                }
                if (this.f24609W.mo27003c()) {
                    background.setColorFilter(C0235h.m1311a(this.f24609W.mo27005e(), Mode.SRC_IN));
                } else {
                    if (this.f24616c0) {
                        TextView textView = this.f24617d0;
                        if (textView != null) {
                            background.setColorFilter(C0235h.m1311a(textView.getCurrentTextColor(), Mode.SRC_IN));
                        }
                    }
                    C0492a.m2644b(background);
                    this.f24605U.refreshDrawableState();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo27024d() {
        if (this.f24623j0 != null && this.f24626m0 != 0) {
            EditText editText = this.f24605U;
            boolean z = true;
            boolean z2 = editText != null && editText.hasFocus();
            EditText editText2 = this.f24605U;
            if (editText2 == null || !editText2.isHovered()) {
                z = false;
            }
            if (this.f24626m0 == 2) {
                if (!isEnabled()) {
                    this.f24635v0 = this.f24602R0;
                } else if (this.f24609W.mo27003c()) {
                    this.f24635v0 = this.f24609W.mo27005e();
                } else {
                    if (this.f24616c0) {
                        TextView textView = this.f24617d0;
                        if (textView != null) {
                            this.f24635v0 = textView.getCurrentTextColor();
                        }
                    }
                    if (z2) {
                        this.f24635v0 = this.f24601Q0;
                    } else if (z) {
                        this.f24635v0 = this.f24600P0;
                    } else {
                        this.f24635v0 = this.f24599O0;
                    }
                }
                if ((z || z2) && isEnabled()) {
                    this.f24632s0 = this.f24634u0;
                } else {
                    this.f24632s0 = this.f24633t0;
                }
                mo17545e();
            }
        }
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        if (this.f24607V != null) {
            EditText editText = this.f24605U;
            if (editText != null) {
                boolean z = this.f24622i0;
                this.f24622i0 = false;
                CharSequence hint = editText.getHint();
                this.f24605U.setHint(this.f24607V);
                try {
                    super.dispatchProvideAutofillStructure(viewStructure, i);
                    return;
                } finally {
                    this.f24605U.setHint(hint);
                    this.f24622i0 = z;
                }
            }
        }
        super.dispatchProvideAutofillStructure(viewStructure, i);
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f24612Y0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f24612Y0 = false;
    }

    public void draw(Canvas canvas) {
        GradientDrawable gradientDrawable = this.f24623j0;
        if (gradientDrawable != null) {
            gradientDrawable.draw(canvas);
        }
        super.draw(canvas);
        if (this.f24620g0) {
            this.f24604T0.mo26822a(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (!this.f24611X0) {
            boolean z = true;
            this.f24611X0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            if (!C4187x.m14340E(this) || !isEnabled()) {
                z = false;
            }
            mo27021b(z);
            mo27023c();
            m32740v();
            mo27024d();
            C10313b bVar = this.f24604T0;
            if (bVar != null ? bVar.mo26826a(drawableState) | false : false) {
                invalidate();
            }
            this.f24611X0 = false;
        }
    }

    public int getBoxBackgroundColor() {
        return this.f24636w0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f24630q0;
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f24631r0;
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f24629p0;
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f24628o0;
    }

    public int getBoxStrokeColor() {
        return this.f24601Q0;
    }

    public int getCounterMaxLength() {
        return this.f24614b0;
    }

    /* access modifiers changed from: 0000 */
    public CharSequence getCounterOverflowDescription() {
        if (this.f24613a0 && this.f24616c0) {
            TextView textView = this.f24617d0;
            if (textView != null) {
                return textView.getContentDescription();
            }
        }
        return null;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f24597M0;
    }

    public EditText getEditText() {
        return this.f24605U;
    }

    public CharSequence getError() {
        if (this.f24609W.mo27011k()) {
            return this.f24609W.mo27004d();
        }
        return null;
    }

    public int getErrorCurrentTextColors() {
        return this.f24609W.mo27005e();
    }

    /* access modifiers changed from: 0000 */
    public final int getErrorTextCurrentColor() {
        return this.f24609W.mo27005e();
    }

    public CharSequence getHelperText() {
        if (this.f24609W.mo27012l()) {
            return this.f24609W.mo27007g();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f24609W.mo27008h();
    }

    public CharSequence getHint() {
        if (this.f24620g0) {
            return this.f24621h0;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final float getHintCollapsedTextHeight() {
        return this.f24604T0.mo26833c();
    }

    /* access modifiers changed from: 0000 */
    public final int getHintCurrentCollapsedTextColor() {
        return this.f24604T0.mo26835d();
    }

    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f24588D0;
    }

    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f24587C0;
    }

    public Typeface getTypeface() {
        return this.f24585A0;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f24623j0 != null) {
            m32740v();
        }
        if (this.f24620g0) {
            EditText editText = this.f24605U;
            if (editText != null) {
                Rect rect = this.f24638y0;
                C10314c.m32541a((ViewGroup) this, (View) editText, rect);
                int compoundPaddingLeft = rect.left + this.f24605U.getCompoundPaddingLeft();
                int compoundPaddingRight = rect.right - this.f24605U.getCompoundPaddingRight();
                int i5 = m32727i();
                this.f24604T0.mo26830b(compoundPaddingLeft, rect.top + this.f24605U.getCompoundPaddingTop(), compoundPaddingRight, rect.bottom - this.f24605U.getCompoundPaddingBottom());
                this.f24604T0.mo26819a(compoundPaddingLeft, i5, compoundPaddingRight, (i4 - i2) - getPaddingBottom());
                this.f24604T0.mo26839h();
                if (m32730l() && !this.f24603S0) {
                    m32734p();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        m32739u();
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C10354e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C10354e eVar = (C10354e) parcelable;
        super.onRestoreInstanceState(eVar.mo14857X());
        setError(eVar.f24644V);
        if (eVar.f24645W) {
            mo27018a(true);
        }
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        C10354e eVar = new C10354e(super.onSaveInstanceState());
        if (this.f24609W.mo27003c()) {
            eVar.f24644V = getError();
        }
        eVar.f24645W = this.f24590F0;
        return eVar;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f24636w0 != i) {
            this.f24636w0 = i;
            mo17545e();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C4025a.m13788a(getContext(), i));
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.f24626m0) {
            this.f24626m0 = i;
            m32733o();
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.f24601Q0 != i) {
            this.f24601Q0 = i;
            mo27024d();
        }
    }

    public void setCounterEnabled(boolean z) {
        if (this.f24613a0 != z) {
            if (z) {
                this.f24617d0 = new C0293w(getContext());
                this.f24617d0.setId(C11462f.textinput_counter);
                Typeface typeface = this.f24585A0;
                if (typeface != null) {
                    this.f24617d0.setTypeface(typeface);
                }
                this.f24617d0.setMaxLines(1);
                mo27017a(this.f24617d0, this.f24619f0);
                this.f24609W.mo26992a(this.f24617d0, 2);
                EditText editText = this.f24605U;
                if (editText == null) {
                    mo27016a(0);
                } else {
                    mo27016a(editText.getText().length());
                }
            } else {
                this.f24609W.mo26999b(this.f24617d0, 2);
                this.f24617d0 = null;
            }
            this.f24613a0 = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f24614b0 != i) {
            if (i > 0) {
                this.f24614b0 = i;
            } else {
                this.f24614b0 = -1;
            }
            if (this.f24613a0) {
                EditText editText = this.f24605U;
                mo27016a(editText == null ? 0 : editText.getText().length());
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f24597M0 = colorStateList;
        this.f24598N0 = colorStateList;
        if (this.f24605U != null) {
            mo27021b(false);
        }
    }

    public void setEnabled(boolean z) {
        m32718a((ViewGroup) this, z);
        super.setEnabled(z);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f24609W.mo27011k()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f24609W.mo26993a(charSequence);
        } else {
            this.f24609W.mo27009i();
        }
    }

    public void setErrorEnabled(boolean z) {
        this.f24609W.mo26994a(z);
    }

    public void setErrorTextAppearance(int i) {
        this.f24609W.mo26997b(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f24609W.mo26990a(colorStateList);
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!mo27019a()) {
                setHelperTextEnabled(true);
            }
            this.f24609W.mo27000b(charSequence);
        } else if (mo27019a()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f24609W.mo26998b(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f24609W.mo27001b(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.f24609W.mo27002c(i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f24620g0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(DateUtils.FORMAT_NO_MIDNIGHT);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f24606U0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f24620g0) {
            this.f24620g0 = z;
            if (!this.f24620g0) {
                this.f24622i0 = false;
                if (!TextUtils.isEmpty(this.f24621h0) && TextUtils.isEmpty(this.f24605U.getHint())) {
                    this.f24605U.setHint(this.f24621h0);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f24605U.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f24621h0)) {
                        setHint(hint);
                    }
                    this.f24605U.setHint(null);
                }
                this.f24622i0 = true;
            }
            if (this.f24605U != null) {
                m32738t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f24604T0.mo26818a(i);
        this.f24598N0 = this.f24604T0.mo26827b();
        if (this.f24605U != null) {
            mo27021b(false);
            m32738t();
        }
    }

    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C3868a.m12946c(getContext(), i) : null);
    }

    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (this.f24586B0 != z) {
            this.f24586B0 = z;
            if (!z && this.f24590F0) {
                EditText editText = this.f24605U;
                if (editText != null) {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
            this.f24590F0 = false;
            m32739u();
        }
    }

    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f24593I0 = colorStateList;
        this.f24594J0 = true;
        mo17546f();
    }

    public void setPasswordVisibilityToggleTintMode(Mode mode) {
        this.f24595K0 = mode;
        this.f24596L0 = true;
        mo17546f();
    }

    public void setTextInputAccessibilityDelegate(C10353d dVar) {
        EditText editText = this.f24605U;
        if (editText != null) {
            C4187x.m14359a((View) editText, (C4119a) dVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f24585A0) {
            this.f24585A0 = typeface;
            this.f24604T0.mo26824a(typeface);
            this.f24609W.mo26991a(typeface);
            TextView textView = this.f24617d0;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public C10349c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C11458b.textInputStyle);
    }

    /* renamed from: a */
    private void m32719a(boolean z, boolean z2) {
        boolean isEnabled = isEnabled();
        EditText editText = this.f24605U;
        boolean z3 = true;
        boolean z4 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f24605U;
        if (editText2 == null || !editText2.hasFocus()) {
            z3 = false;
        }
        boolean c = this.f24609W.mo27003c();
        ColorStateList colorStateList = this.f24597M0;
        if (colorStateList != null) {
            this.f24604T0.mo26821a(colorStateList);
            this.f24604T0.mo26832b(this.f24597M0);
        }
        if (!isEnabled) {
            this.f24604T0.mo26821a(ColorStateList.valueOf(this.f24602R0));
            this.f24604T0.mo26832b(ColorStateList.valueOf(this.f24602R0));
        } else if (c) {
            this.f24604T0.mo26821a(this.f24609W.mo27006f());
        } else {
            if (this.f24616c0) {
                TextView textView = this.f24617d0;
                if (textView != null) {
                    this.f24604T0.mo26821a(textView.getTextColors());
                }
            }
            if (z3) {
                ColorStateList colorStateList2 = this.f24598N0;
                if (colorStateList2 != null) {
                    this.f24604T0.mo26821a(colorStateList2);
                }
            }
        }
        if (z4 || (isEnabled() && (z3 || c))) {
            if (z2 || this.f24603S0) {
                m32721c(z);
            }
        } else if (z2 || !this.f24603S0) {
            m32722d(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo27022b() {
        return this.f24622i0;
    }

    public C10349c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24609W = new C10347b(this);
        this.f24638y0 = new Rect();
        this.f24639z0 = new RectF();
        this.f24604T0 = new C10313b(this);
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        this.f24615c = new FrameLayout(context);
        this.f24615c.setAddStatesFromChildren(true);
        addView(this.f24615c);
        this.f24604T0.mo26831b(C11468a.f26815a);
        this.f24604T0.mo26820a(C11468a.f26815a);
        this.f24604T0.mo26829b(8388659);
        C0284t0 d = C10320g.m32559d(context, attributeSet, C11467k.TextInputLayout, i, C11466j.Widget_Design_TextInputLayout, new int[0]);
        this.f24620g0 = d.mo1909a(C11467k.TextInputLayout_hintEnabled, true);
        setHint(d.mo1918e(C11467k.TextInputLayout_android_hint));
        this.f24606U0 = d.mo1909a(C11467k.TextInputLayout_hintAnimationEnabled, true);
        this.f24624k0 = context.getResources().getDimensionPixelOffset(C11460d.mtrl_textinput_box_bottom_offset);
        this.f24625l0 = context.getResources().getDimensionPixelOffset(C11460d.mtrl_textinput_box_label_cutout_padding);
        this.f24627n0 = d.mo1911b(C11467k.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.f24628o0 = d.mo1904a(C11467k.TextInputLayout_boxCornerRadiusTopStart, 0.0f);
        this.f24629p0 = d.mo1904a(C11467k.TextInputLayout_boxCornerRadiusTopEnd, 0.0f);
        this.f24630q0 = d.mo1904a(C11467k.TextInputLayout_boxCornerRadiusBottomEnd, 0.0f);
        this.f24631r0 = d.mo1904a(C11467k.TextInputLayout_boxCornerRadiusBottomStart, 0.0f);
        this.f24636w0 = d.mo1905a(C11467k.TextInputLayout_boxBackgroundColor, 0);
        this.f24601Q0 = d.mo1905a(C11467k.TextInputLayout_boxStrokeColor, 0);
        this.f24633t0 = context.getResources().getDimensionPixelSize(C11460d.mtrl_textinput_box_stroke_width_default);
        this.f24634u0 = context.getResources().getDimensionPixelSize(C11460d.mtrl_textinput_box_stroke_width_focused);
        this.f24632s0 = this.f24633t0;
        setBoxBackgroundMode(d.mo1915d(C11467k.TextInputLayout_boxBackgroundMode, 0));
        if (d.mo1922g(C11467k.TextInputLayout_android_textColorHint)) {
            ColorStateList a = d.mo1906a(C11467k.TextInputLayout_android_textColorHint);
            this.f24598N0 = a;
            this.f24597M0 = a;
        }
        this.f24599O0 = C4025a.m13788a(context, C11459c.mtrl_textinput_default_box_stroke_color);
        this.f24602R0 = C4025a.m13788a(context, C11459c.mtrl_textinput_disabled_color);
        this.f24600P0 = C4025a.m13788a(context, C11459c.mtrl_textinput_hovered_box_stroke_color);
        if (d.mo1921g(C11467k.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(d.mo1921g(C11467k.TextInputLayout_hintTextAppearance, 0));
        }
        int g = d.mo1921g(C11467k.TextInputLayout_errorTextAppearance, 0);
        boolean a2 = d.mo1909a(C11467k.TextInputLayout_errorEnabled, false);
        int g2 = d.mo1921g(C11467k.TextInputLayout_helperTextTextAppearance, 0);
        boolean a3 = d.mo1909a(C11467k.TextInputLayout_helperTextEnabled, false);
        CharSequence e = d.mo1918e(C11467k.TextInputLayout_helperText);
        boolean a4 = d.mo1909a(C11467k.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(d.mo1915d(C11467k.TextInputLayout_counterMaxLength, -1));
        this.f24619f0 = d.mo1921g(C11467k.TextInputLayout_counterTextAppearance, 0);
        this.f24618e0 = d.mo1921g(C11467k.TextInputLayout_counterOverflowTextAppearance, 0);
        this.f24586B0 = d.mo1909a(C11467k.TextInputLayout_passwordToggleEnabled, false);
        this.f24587C0 = d.mo1912b(C11467k.TextInputLayout_passwordToggleDrawable);
        this.f24588D0 = d.mo1918e(C11467k.TextInputLayout_passwordToggleContentDescription);
        if (d.mo1922g(C11467k.TextInputLayout_passwordToggleTint)) {
            this.f24594J0 = true;
            this.f24593I0 = d.mo1906a(C11467k.TextInputLayout_passwordToggleTint);
        }
        if (d.mo1922g(C11467k.TextInputLayout_passwordToggleTintMode)) {
            this.f24596L0 = true;
            this.f24595K0 = C10321h.m32560a(d.mo1915d(C11467k.TextInputLayout_passwordToggleTintMode, -1), null);
        }
        d.mo1908a();
        setHelperTextEnabled(a3);
        setHelperText(e);
        setHelperTextTextAppearance(g2);
        setErrorEnabled(a2);
        setErrorTextAppearance(g);
        setCounterEnabled(a4);
        mo17546f();
        C4187x.m14390g(this, 2);
    }

    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f24588D0 = charSequence;
        CheckableImageButton checkableImageButton = this.f24589E0;
        if (checkableImageButton != null) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f24587C0 = drawable;
        CheckableImageButton checkableImageButton = this.f24589E0;
        if (checkableImageButton != null) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: c */
    private void m32721c(boolean z) {
        ValueAnimator valueAnimator = this.f24608V0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f24608V0.cancel();
        }
        if (!z || !this.f24606U0) {
            this.f24604T0.mo26828b(1.0f);
        } else {
            mo27015a(1.0f);
        }
        this.f24603S0 = false;
        if (m32730l()) {
            m32734p();
        }
    }

    /* renamed from: d */
    private void m32722d(boolean z) {
        ValueAnimator valueAnimator = this.f24608V0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f24608V0.cancel();
        }
        if (!z || !this.f24606U0) {
            this.f24604T0.mo26828b(0.0f);
        } else {
            mo27015a(0.0f);
        }
        if (m32730l() && ((C10346a) this.f24623j0).mo26986a()) {
            m32729k();
        }
        this.f24603S0 = true;
    }

    /* renamed from: a */
    public boolean mo27019a() {
        return this.f24609W.mo27012l();
    }

    /* renamed from: a */
    private static void m32718a(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m32718a((ViewGroup) childAt, z);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27016a(int i) {
        boolean z = this.f24616c0;
        if (this.f24614b0 == -1) {
            this.f24617d0.setText(String.valueOf(i));
            this.f24617d0.setContentDescription(null);
            this.f24616c0 = false;
        } else {
            if (C4187x.m14376c(this.f24617d0) == 1) {
                C4187x.m14388f(this.f24617d0, 0);
            }
            this.f24616c0 = i > this.f24614b0;
            boolean z2 = this.f24616c0;
            if (z != z2) {
                mo27017a(this.f24617d0, z2 ? this.f24618e0 : this.f24619f0);
                if (this.f24616c0) {
                    C4187x.m14388f(this.f24617d0, 1);
                }
            }
            this.f24617d0.setText(getContext().getString(C11465i.character_counter_pattern, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f24614b0)}));
            this.f24617d0.setContentDescription(getContext().getString(C11465i.character_counter_content_description, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f24614b0)}));
        }
        if (this.f24605U != null && z != this.f24616c0) {
            mo27021b(false);
            mo27024d();
            mo27023c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27017a(TextView textView, int i) {
        boolean z = true;
        try {
            C0513i.m2778d(textView, i);
            if (VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            C0513i.m2778d(textView, C11466j.TextAppearance_AppCompat_Caption);
            textView.setTextColor(C4025a.m13788a(getContext(), C11459c.design_error));
        }
    }

    /* renamed from: a */
    public void mo27018a(boolean z) {
        if (this.f24586B0) {
            int selectionEnd = this.f24605U.getSelectionEnd();
            if (m32732n()) {
                this.f24605U.setTransformationMethod(null);
                this.f24590F0 = true;
            } else {
                this.f24605U.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f24590F0 = false;
            }
            this.f24589E0.setChecked(this.f24590F0);
            if (z) {
                this.f24589E0.jumpDrawablesToCurrentState();
            }
            this.f24605U.setSelection(selectionEnd);
        }
    }

    /* renamed from: a */
    private void m32717a(RectF rectF) {
        float f = rectF.left;
        int i = this.f24625l0;
        rectF.left = f - ((float) i);
        rectF.top -= (float) i;
        rectF.right += (float) i;
        rectF.bottom += (float) i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27015a(float f) {
        if (this.f24604T0.mo26836e() != f) {
            if (this.f24608V0 == null) {
                this.f24608V0 = new ValueAnimator();
                this.f24608V0.setInterpolator(C11468a.f26816b);
                this.f24608V0.setDuration(167);
                this.f24608V0.addUpdateListener(new C10352c());
            }
            this.f24608V0.setFloatValues(new float[]{this.f24604T0.mo26836e(), f});
            this.f24608V0.start();
        }
    }
}
