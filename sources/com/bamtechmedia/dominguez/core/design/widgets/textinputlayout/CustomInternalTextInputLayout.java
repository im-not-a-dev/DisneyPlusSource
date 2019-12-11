package com.bamtechmedia.dominguez.core.design.widgets.textinputlayout;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.C5714c.C5715a;
import com.bamtechmedia.dominguez.core.p088i.C3834d;
import com.google.android.material.textfield.C10349c;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import p096e.p121h.p122j.C4025a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0014J\u000e\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\rJ\u0006\u0010\u0018\u001a\u00020\rR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/textinputlayout/CustomInternalTextInputLayout;", "Lcom/google/android/material/textfield/TextInputLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "inputLayoutAnimation", "Lcom/bamtechmedia/dominguez/core/design/widgets/textinputlayout/InputLayoutBottomBar;", "transparent", "disableState", "", "draw", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "showError", "errorView", "Landroid/widget/TextView;", "showValidation", "unFocused", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: CustomInternalTextInputLayout.kt */
public final class CustomInternalTextInputLayout extends C10349c {

    /* renamed from: Z0 */
    private final int f13359Z0;

    /* renamed from: a1 */
    private final C5714c f13360a1;

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.CustomInternalTextInputLayout$a */
    /* compiled from: CustomInternalTextInputLayout.kt */
    static final class C5692a extends C12881k implements Function1<ValueAnimator, C13145v> {

        /* renamed from: c */
        final /* synthetic */ CustomInternalTextInputLayout f13361c;

        C5692a(CustomInternalTextInputLayout customInternalTextInputLayout) {
            this.f13361c = customInternalTextInputLayout;
            super(1);
        }

        /* renamed from: a */
        public final void mo17548a(ValueAnimator valueAnimator) {
            CustomInternalTextInputLayout customInternalTextInputLayout = this.f13361c;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                customInternalTextInputLayout.setBoxBackgroundColor(((Integer) animatedValue).intValue());
                return;
            }
            throw new C13142s("null cannot be cast to non-null type kotlin.Int");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17548a((ValueAnimator) obj);
            return C13145v.f29587a;
        }
    }

    public CustomInternalTextInputLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public CustomInternalTextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CustomInternalTextInputLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo17543a(TextView textView) {
        this.f13360a1.mo17594a(C5715a.ERROR);
        this.f13360a1.mo17593a(textView, (Function1<? super ValueAnimator, C13145v>) new C5692a<Object,C13145v>(this));
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.f13360a1.mo17592a(canvas);
    }

    /* renamed from: e */
    public final void mo17545e() {
        this.f13360a1.mo17594a(C5715a.NONE);
        invalidate();
    }

    /* renamed from: f */
    public final void mo17546f() {
        setBoxStrokeColor(this.f13359Z0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C5714c.m18624a(this.f13360a1, 0.0f, 1, null);
    }

    public CustomInternalTextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13359Z0 = C4025a.m13788a(context, C3834d.transparent);
        this.f13360a1 = new C5714c(this);
    }
}
