package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p096e.p146l.C4234l;

public class VerticalGridView extends C0638a {
    public VerticalGridView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3654b(Context context, AttributeSet attributeSet) {
        mo3659a(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4234l.lbVerticalGridView);
        setColumnWidth(obtainStyledAttributes);
        setNumColumns(obtainStyledAttributes.getInt(C4234l.lbVerticalGridView_numberOfColumns, 1));
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: 0000 */
    public void setColumnWidth(TypedArray typedArray) {
        if (typedArray.peekValue(C4234l.lbVerticalGridView_columnWidth) != null) {
            setColumnWidth(typedArray.getLayoutDimension(C4234l.lbVerticalGridView_columnWidth, 0));
        }
    }

    public void setNumColumns(int i) {
        this.f2765C1.mo3924v(i);
        requestLayout();
    }

    public VerticalGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerticalGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2765C1.mo3926w(1);
        mo3654b(context, attributeSet);
    }

    public void setColumnWidth(int i) {
        this.f2765C1.mo3927x(i);
        requestLayout();
    }
}
