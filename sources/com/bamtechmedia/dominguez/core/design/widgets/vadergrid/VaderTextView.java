package com.bamtechmedia.dominguez.core.design.widgets.vadergrid;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0293w;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0014R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/vadergrid/VaderTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "helper", "Lcom/bamtechmedia/dominguez/core/design/widgets/vadergrid/VaderViewHelper;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: VaderView.kt */
public final class VaderTextView extends C0293w {

    /* renamed from: a0 */
    private final C5726b f13470a0;

    public VaderTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public VaderTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ VaderTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f13470a0.mo17606b(this);
        super.onMeasure(i, i2);
    }

    public VaderTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13470a0 = new C5726b(context, attributeSet);
    }
}
