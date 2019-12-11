package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.widget.TextView;
import androidx.core.widget.C0513i;
import p096e.p146l.C4223a;

public final class RowHeaderView extends TextView {
    public RowHeaderView(Context context) {
        this(context, null);
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0513i.m2764a((TextView) this, callback));
    }

    public RowHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4223a.rowHeaderStyle);
    }

    public RowHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
