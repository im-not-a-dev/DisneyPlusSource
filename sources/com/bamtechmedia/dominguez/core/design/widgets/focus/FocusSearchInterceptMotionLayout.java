package com.bamtechmedia.dominguez.core.design.widgets.focus;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0007H\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/focus/FocusSearchInterceptMotionLayout;", "Landroidx/constraintlayout/motion/widget/MotionLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "focusSearchInterceptor", "Lcom/bamtechmedia/dominguez/core/design/widgets/focus/FocusSearchInterceptor;", "getFocusSearchInterceptor", "()Lcom/bamtechmedia/dominguez/core/design/widgets/focus/FocusSearchInterceptor;", "setFocusSearchInterceptor", "(Lcom/bamtechmedia/dominguez/core/design/widgets/focus/FocusSearchInterceptor;)V", "focusSearch", "Landroid/view/View;", "focused", "direction", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: FocusSearchInterceptMotionLayout.kt */
public final class FocusSearchInterceptMotionLayout extends MotionLayout {

    /* renamed from: i1 */
    private C5691a f13357i1;

    public FocusSearchInterceptMotionLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public FocusSearchInterceptMotionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ FocusSearchInterceptMotionLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public View focusSearch(View view, int i) {
        View focusSearch = super.focusSearch(view, i);
        C5691a aVar = this.f13357i1;
        if (aVar != null) {
            View a = aVar.mo17542a(view, i, focusSearch);
            if (a != null) {
                return a;
            }
        }
        return focusSearch;
    }

    public final C5691a getFocusSearchInterceptor() {
        return this.f13357i1;
    }

    public final void setFocusSearchInterceptor(C5691a aVar) {
        this.f13357i1 = aVar;
    }

    public FocusSearchInterceptMotionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
