package com.bamtechmedia.dominguez.core.design.widgets.textinputlayout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;
import androidx.appcompat.widget.C0238i;
import androidx.core.graphics.drawable.C0492a;
import com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.C5714c.C5715a;
import com.bamtechmedia.dominguez.core.p088i.C3835e;
import com.bamtechmedia.dominguez.core.p088i.C3836f;
import com.bamtechmedia.dominguez.core.p088i.C3837g;
import com.bamtechmedia.dominguez.core.p088i.C3843m;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.p586h0.C12754b;
import kotlin.p590y.C13162e0;
import kotlin.p590y.C13180m;
import p096e.p097a.p098k.p099a.C3868a;
import p096e.p121h.p122j.p124d.C4039f;
import p096e.p121h.p135s.C4187x;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 N2\u00020\u0001:\u0003NOPB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010/\u001a\u000200H\u0002J\u0010\u00101\u001a\u0002002\u0006\u00102\u001a\u000203H\u0016J\u0010\u00104\u001a\u0002002\u0006\u00102\u001a\u000203H\u0014J\u0018\u00105\u001a\u0002002\u0006\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0007H\u0014J(\u00108\u001a\u0002002\u0006\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u0007H\u0014J(\u0010=\u001a\u0002002\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u00072\u0006\u0010A\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\u0007H\u0014J\u0016\u0010C\u001a\u0002002\u0006\u0010\"\u001a\u00020#2\u0006\u0010D\u001a\u00020\u0014J\u0010\u0010E\u001a\u0002002\u0006\u0010F\u001a\u00020GH\u0016J\u0018\u0010H\u001a\u0002002\u0006\u0010I\u001a\u00020\n2\b\u0010J\u001a\u0004\u0018\u00010KJ\u0010\u0010L\u001a\u0002002\u0006\u0010M\u001a\u00020\nH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%XD¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010-\u001a\n .*\u0004\u0018\u00010,0,X\u0004¢\u0006\u0002\n\u0000¨\u0006Q"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/textinputlayout/CustomPinEntryEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animate", "", "charBottom", "", "", "charPaint", "Landroid/graphics/Paint;", "charSize", "colorStates", "Landroid/content/res/ColorStateList;", "errorView", "Landroid/widget/TextView;", "hintWidths", "", "inputLayoutBottomBar", "Lcom/bamtechmedia/dominguez/core/design/widgets/textinputlayout/InputLayoutBottomBar;", "lastCharPaint", "lineCoords", "Landroid/graphics/RectF;", "lineStroke", "lineStrokeSelected", "lineStyle", "Lcom/bamtechmedia/dominguez/core/design/widgets/textinputlayout/CustomPinEntryEditText$LineStyle;", "linesPaint", "maxLength", "onPinEnteredListener", "Lcom/bamtechmedia/dominguez/core/design/widgets/textinputlayout/CustomPinEntryEditText$OnPinEnteredListener;", "singleCharHint", "", "singleCharPaint", "space", "textBottomPadding", "textHeight", "Landroid/graphics/Rect;", "unwrappedDrawable", "Landroid/graphics/drawable/Drawable;", "wrappedDrawable", "kotlin.jvm.PlatformType", "animatePopIn", "", "draw", "canvas", "Landroid/graphics/Canvas;", "onDraw", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onSizeChanged", "width", "height", "oldWidth", "oldHeight", "onTextChanged", "text", "", "start", "before", "after", "setCustomPinEntryEditTextInfo", "errorTextView", "setCustomSelectionActionModeCallback", "actionModeCallback", "Landroid/view/ActionMode$Callback;", "setError", "hasError", "pinBackground", "Landroid/view/View;", "updateColorForLines", "isNext", "Companion", "LineStyle", "OnPinEnteredListener", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: CustomPinEntryEditText.kt */
public final class CustomPinEntryEditText extends C0238i {

    /* renamed from: W */
    private final C5714c f13362W;

    /* renamed from: a0 */
    private final float f13363a0;

    /* renamed from: b0 */
    private float f13364b0;

    /* renamed from: c0 */
    private final String f13365c0;

    /* renamed from: d0 */
    private final float f13366d0;

    /* renamed from: e0 */
    private final int f13367e0;

    /* renamed from: f0 */
    private final List<RectF> f13368f0;

    /* renamed from: g0 */
    private final List<Float> f13369g0;

    /* renamed from: h0 */
    private final Paint f13370h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public final Paint f13371i0;

    /* renamed from: j0 */
    private final Paint f13372j0;

    /* renamed from: k0 */
    private final Paint f13373k0;

    /* renamed from: l0 */
    private final Rect f13374l0;

    /* renamed from: m0 */
    private final Drawable f13375m0;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public final Drawable f13376n0;

    /* renamed from: o0 */
    private final C5696d f13377o0;

    /* renamed from: p0 */
    private final float f13378p0;

    /* renamed from: q0 */
    private final float f13379q0;

    /* renamed from: r0 */
    private final boolean f13380r0;

    /* renamed from: s0 */
    private final ColorStateList f13381s0;

    /* renamed from: t0 */
    private final float[] f13382t0;

    /* renamed from: u0 */
    private TextView f13383u0;
    /* access modifiers changed from: private */

    /* renamed from: v0 */
    public C5697e f13384v0;

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.CustomPinEntryEditText$a */
    /* compiled from: CustomPinEntryEditText.kt */
    public static final class C5693a implements Callback {
        C5693a() {
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        public void onDestroyActionMode(ActionMode actionMode) {
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.CustomPinEntryEditText$b */
    /* compiled from: CustomPinEntryEditText.kt */
    static final class C5694b implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ CustomPinEntryEditText f13385c;

        C5694b(CustomPinEntryEditText customPinEntryEditText) {
            this.f13385c = customPinEntryEditText;
        }

        public final void onClick(View view) {
            Editable text = this.f13385c.getText();
            if (text != null) {
                this.f13385c.setSelection(text.length());
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.CustomPinEntryEditText$c */
    /* compiled from: CustomPinEntryEditText.kt */
    public static final class C5695c {
        private C5695c() {
        }

        public /* synthetic */ C5695c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.CustomPinEntryEditText$d */
    /* compiled from: CustomPinEntryEditText.kt */
    private enum C5696d {
        SEPARATE,
        FULL
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.CustomPinEntryEditText$e */
    /* compiled from: CustomPinEntryEditText.kt */
    public interface C5697e {
        /* renamed from: a */
        void mo11886a(CharSequence charSequence);
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.CustomPinEntryEditText$f */
    /* compiled from: CustomPinEntryEditText.kt */
    static final class C5698f implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ CustomPinEntryEditText f13389a;

        C5698f(CustomPinEntryEditText customPinEntryEditText) {
            this.f13389a = customPinEntryEditText;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Paint a = this.f13389a.f13371i0;
            Intrinsics.checkReturnedValueIsNotNull((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                a.setTextSize(((Float) animatedValue).floatValue());
                this.f13389a.invalidate();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.CustomPinEntryEditText$g */
    /* compiled from: CustomPinEntryEditText.kt */
    public static final class C5699g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ CustomPinEntryEditText f13390a;

        C5699g(CustomPinEntryEditText customPinEntryEditText) {
            this.f13390a = customPinEntryEditText;
        }

        public void onAnimationEnd(Animator animator) {
            C5697e b = this.f13390a.f13384v0;
            if (b != null) {
                b.mo11886a(this.f13390a.getText());
            }
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.CustomPinEntryEditText$h */
    /* compiled from: CustomPinEntryEditText.kt */
    static final class C5700h extends C12881k implements Function1<ValueAnimator, C13145v> {

        /* renamed from: U */
        final /* synthetic */ View f13391U;

        /* renamed from: c */
        final /* synthetic */ CustomPinEntryEditText f13392c;

        C5700h(CustomPinEntryEditText customPinEntryEditText, boolean z, View view) {
            this.f13392c = customPinEntryEditText;
            this.f13391U = view;
            super(1);
        }

        /* renamed from: a */
        public final void mo17563a(ValueAnimator valueAnimator) {
            Drawable c = this.f13392c.f13376n0;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                C0492a.m2645b(c, ((Integer) animatedValue).intValue());
                this.f13391U.setBackground(this.f13392c.f13376n0);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17563a((ValueAnimator) obj);
            return C13145v.f29587a;
        }
    }

    static {
        new C5695c(null);
    }

    public CustomPinEntryEditText(Context context) {
        this(context, null, 0, 6, null);
    }

    public CustomPinEntryEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CustomPinEntryEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.f13362W.mo17592a(canvas);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Editable text = getText();
        int length = text != null ? text.length() : 0;
        float[] fArr = new float[length];
        getPaint().getTextWidths(getText(), 0, length, fArr);
        getPaint().getTextWidths(this.f13365c0, this.f13382t0);
        float a = C13174k.m40367a(this.f13382t0);
        Iterator it = C12762h.m39920d(0, this.f13367e0).iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            int b = ((C13162e0) it).mo31079b();
            float f = (float) 2;
            float f2 = ((RectF) this.f13368f0.get(b)).left + (this.f13364b0 / f);
            if (length > b) {
                canvas.drawText(String.valueOf(getText()), b, b + 1, f2 - (fArr[b] / f), ((Number) this.f13369g0.get(b)).floatValue(), (!this.f13380r0 || b != length + -1) ? this.f13370h0 : this.f13371i0);
            } else {
                canvas.drawText(this.f13365c0, f2 - (a / f), ((Number) this.f13369g0.get(b)).floatValue(), this.f13372j0);
            }
            if (b != length) {
                z = false;
            }
            m18579a(z);
            if (this.f13377o0 == C5696d.SEPARATE) {
                RectF rectF = (RectF) this.f13368f0.get(b);
                canvas.drawLine(rectF.left, rectF.top, rectF.right, rectF.bottom, this.f13373k0);
            }
        }
        if (this.f13377o0 == C5696d.FULL) {
            m18579a(true);
            canvas.drawLine((float) getPaddingStart(), (float) (getHeight() - getPaddingBottom()), (float) (getWidth() - getPaddingEnd()), (float) getBottom(), this.f13373k0);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C5714c.m18624a(this.f13362W, 0.0f, 1, null);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        super.onSizeChanged(i, i2, i3, i4);
        float paddingEnd = (float) ((i - getPaddingEnd()) - getPaddingStart());
        float f = this.f13363a0;
        int i6 = this.f13367e0;
        this.f13364b0 = (paddingEnd - (f * ((float) (i6 - 1)))) / ((float) i6);
        this.f13368f0.clear();
        this.f13369g0.clear();
        float height = (float) (getHeight() - getPaddingBottom());
        int i7 = 0;
        int i8 = 1;
        boolean z = C4187x.m14399n(this) == 1;
        if (z) {
            i5 = (int) (((float) (i - C4187x.m14403r(this))) - this.f13364b0);
        } else {
            i5 = C4187x.m14403r(this);
        }
        if (z) {
            i8 = -1;
        }
        int i9 = (int) (((float) i8) * (this.f13364b0 + this.f13363a0));
        Iterator it = C12762h.m39916a((C12754b) C12762h.m39920d(i5, this.f13367e0 * i9), i9).iterator();
        while (it.hasNext()) {
            int b = ((C13162e0) it).mo31079b();
            int i10 = i7 + 1;
            if (i7 >= 0) {
                float f2 = (float) b;
                this.f13368f0.add(i7, new RectF(f2, height, this.f13364b0 + f2, height));
                this.f13369g0.add(i7, Float.valueOf(((RectF) this.f13368f0.get(i7)).bottom - this.f13366d0));
                i7 = i10;
            } else {
                C13180m.m40455c();
                throw null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        mo17550a(false, (View) null);
        if (!this.f13380r0 && charSequence.length() == this.f13367e0) {
            C5697e eVar = this.f13384v0;
            if (eVar != null) {
                eVar.mo11886a(charSequence);
            }
        } else if (this.f13380r0 && i3 > i2) {
            m18578a();
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        throw new IllegalAccessException("setCustomSelectionActionModeCallback() not supported.");
    }

    public CustomPinEntryEditText(Context context, AttributeSet attributeSet, int i) {
        C5696d dVar;
        super(context, attributeSet, i);
        this.f13362W = new C5714c(this);
        this.f13363a0 = (float) getResources().getDimensionPixelSize(C3835e.padding_large);
        this.f13365c0 = "0";
        this.f13368f0 = new ArrayList();
        this.f13369g0 = new ArrayList();
        this.f13374l0 = new Rect();
        this.f13375m0 = C3868a.m12946c(context, C3836f.pincode_background);
        Drawable drawable = this.f13375m0;
        if (drawable != null) {
            this.f13376n0 = C0492a.m2652i(drawable);
            Resources resources = context.getResources();
            String str = "resources";
            Intrinsics.checkReturnedValueIsNotNull((Object) resources, str);
            this.f13378p0 = TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
            Resources resources2 = context.getResources();
            Intrinsics.checkReturnedValueIsNotNull((Object) resources2, str);
            this.f13379q0 = TypedValue.applyDimension(1, 2.0f, resources2.getDisplayMetrics());
            this.f13382t0 = new float[1];
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C3843m.CustomPinEntryEditText, 0, 0);
            this.f13380r0 = obtainStyledAttributes.getBoolean(C3843m.CustomPinEntryEditText_pinAnimation, true);
            if (obtainStyledAttributes.getInt(C3843m.CustomPinEntryEditText_pinLineStyle, 0) != 0) {
                dVar = C5696d.FULL;
            } else {
                dVar = C5696d.SEPARATE;
            }
            this.f13377o0 = dVar;
            this.f13366d0 = obtainStyledAttributes.getDimension(C3843m.CustomPinEntryEditText_pinTextBottomPadding, (float) getResources().getDimensionPixelSize(C3835e.padding_small));
            this.f13381s0 = obtainStyledAttributes.getColorStateList(C3843m.CustomPinEntryEditText_pinLineColors);
            obtainStyledAttributes.recycle();
            this.f13370h0 = new Paint(getPaint());
            this.f13371i0 = new Paint(getPaint());
            this.f13372j0 = new Paint(getPaint());
            this.f13372j0.setTypeface(C4039f.m13847a(context, C3837g.avenir55_roman));
            this.f13373k0 = new Paint(getPaint());
            this.f13373k0.setStrokeWidth(this.f13378p0);
            setBackgroundResource(0);
            int i2 = 4;
            if (attributeSet != null) {
                i2 = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLength", 4);
            }
            this.f13367e0 = i2;
            super.setCustomSelectionActionModeCallback(new C5693a());
            if (!C5837i.m18843e(context)) {
                setOnClickListener(new C5694b(this));
            }
            getPaint().getTextBounds("|", 0, 1, this.f13374l0);
            if (getTextColors() != null) {
                Paint paint = this.f13371i0;
                ColorStateList textColors = getTextColors();
                String str2 = "textColors";
                Intrinsics.checkReturnedValueIsNotNull((Object) textColors, str2);
                paint.setColor(textColors.getDefaultColor());
                Paint paint2 = this.f13370h0;
                ColorStateList textColors2 = getTextColors();
                Intrinsics.checkReturnedValueIsNotNull((Object) textColors2, str2);
                paint2.setColor(textColors2.getDefaultColor());
                this.f13372j0.setColor(getCurrentHintTextColor());
                return;
            }
            return;
        }
        Intrinsics.throwNpe();
        throw null;
    }

    /* renamed from: a */
    public final void mo17549a(C5697e eVar, TextView textView) {
        this.f13384v0 = eVar;
        this.f13383u0 = textView;
    }

    /* renamed from: a */
    public final void mo17550a(boolean z, View view) {
        TextView textView = this.f13383u0;
        if (textView != null) {
            this.f13362W.mo17594a(z ? C5715a.ERROR : C5715a.NONE);
            textView.setVisibility(z ? 0 : 8);
            if (z && view != null) {
                this.f13362W.mo17593a(textView, (Function1<? super ValueAnimator, C13145v>) new C5700h<Object,C13145v>(this, z, view));
            }
        }
    }

    /* renamed from: a */
    private final void m18579a(boolean z) {
        this.f13373k0.setStrokeWidth(isFocused() ? this.f13379q0 : this.f13378p0);
        Paint paint = this.f13373k0;
        ColorStateList colorStateList = this.f13381s0;
        int i = -7829368;
        if (colorStateList != null) {
            Integer[] numArr = new Integer[1];
            int i2 = (!isFocused() || !z) ? isFocused() ? 16842908 : -16842908 : 16842913;
            numArr[0] = Integer.valueOf(i2);
            i = colorStateList.getColorForState(C13174k.m40381a(numArr), -7829368);
        }
        paint.setColor(i);
    }

    /* renamed from: a */
    private final void m18578a() {
        TextPaint paint = getPaint();
        Intrinsics.checkReturnedValueIsNotNull((Object) paint, "paint");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, paint.getTextSize()});
        Intrinsics.checkReturnedValueIsNotNull((Object) ofFloat, "valueAnimator");
        ofFloat.setDuration(200);
        ofFloat.setInterpolator(new OvershootInterpolator());
        ofFloat.addUpdateListener(new C5698f(this));
        Editable text = getText();
        if (text != null && text.length() == this.f13367e0) {
            ofFloat.addListener(new C5699g(this));
        }
        ofFloat.start();
    }
}
