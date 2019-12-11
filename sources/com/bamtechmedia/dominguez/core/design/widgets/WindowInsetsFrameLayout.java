package com.bamtechmedia.dominguez.core.design.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.Iterator;
import kotlin.TypeCastException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p590y.C13162e0;
import p096e.p121h.p134r.C4111c;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0014R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/WindowInsetsFrameLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mLastInsets", "", "onApplyWindowInsets", "Landroid/view/WindowInsets;", "insets", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: WindowInsetsFrameLayout.kt */
public final class WindowInsetsFrameLayout extends FrameLayout {

    /* renamed from: c */
    private Object f13294c;

    public WindowInsetsFrameLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public WindowInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ WindowInsetsFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (!C4111c.m14086a(this.f13294c, windowInsets)) {
            this.f13294c = windowInsets;
            requestLayout();
        }
        WindowInsets consumeSystemWindowInsets = windowInsets.consumeSystemWindowInsets();
        Intrinsics.checkReturnedValueIsNotNull((Object) consumeSystemWindowInsets, "it.consumeSystemWindowInsets()");
        Intrinsics.checkReturnedValueIsNotNull((Object) consumeSystemWindowInsets, "insets.let {\n        if …ystemWindowInsets()\n    }");
        return consumeSystemWindowInsets;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        Object obj = this.f13294c;
        if (obj != null) {
            if (obj != null) {
                WindowInsets windowInsets = (WindowInsets) obj;
                Iterator it = C12762h.m39920d(0, getChildCount()).iterator();
                while (it.hasNext()) {
                    View childAt = getChildAt(((C13162e0) it).mo31079b());
                    Intrinsics.checkReturnedValueIsNotNull((Object) childAt, "child");
                    if (childAt.getVisibility() != 8) {
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    }
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.WindowInsets");
            }
        }
        super.onMeasure(i, i2);
    }

    public WindowInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
