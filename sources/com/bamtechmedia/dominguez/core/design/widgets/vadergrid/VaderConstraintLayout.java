package com.bamtechmedia.dominguez.core.design.widgets.vadergrid;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bamtechmedia.dominguez.core.p088i.C3843m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/vadergrid/VaderConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "helper", "Lcom/bamtechmedia/dominguez/core/design/widgets/vadergrid/VaderViewHelper;", "isMarginUpdate", "", "onMeasure", "", "widthMeasureSpec", "", "heightMeasureSpec", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: VaderView.kt */
public final class VaderConstraintLayout extends ConstraintLayout {

    /* renamed from: r0 */
    private final C5726b f13461r0;

    /* renamed from: s0 */
    private boolean f13462s0;

    public VaderConstraintLayout(Context context) {
        this(context, null, 2, null);
    }

    public /* synthetic */ VaderConstraintLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f13462s0) {
            this.f13461r0.mo17605a(this);
        } else {
            this.f13461r0.mo17606b(this);
        }
        super.onMeasure(i, i2);
    }

    public VaderConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13461r0 = new C5726b(context, attributeSet);
        int[] iArr = C3843m.VaderConstraintLayout;
        Intrinsics.checkReturnedValueIsNotNull((Object) iArr, "R.styleable.VaderConstraintLayout");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f13462s0 = obtainStyledAttributes.getBoolean(C3843m.VaderConstraintLayout_vaderMargin, false);
        obtainStyledAttributes.recycle();
    }
}
