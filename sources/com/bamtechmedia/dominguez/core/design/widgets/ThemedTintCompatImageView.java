package com.bamtechmedia.dominguez.core.design.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bamtechmedia.dominguez.core.p088i.C3843m;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p096e.p097a.p098k.p099a.C3868a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/ThemedTintCompatImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ThemedTintCompatImageView.kt */
public final class ThemedTintCompatImageView extends AppCompatImageView {
    public ThemedTintCompatImageView(Context context) {
        this(context, null, 0, 6, null);
    }

    public ThemedTintCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ThemedTintCompatImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public ThemedTintCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int[] iArr = C3843m.ThemedTintCompatImageView;
        C12880j.m40222a((Object) iArr, "R.styleable.ThemedTintCompatImageView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(C3843m.ThemedTintCompatImageView_themedTintColorStateList, -1);
        if (resourceId != -1) {
            setImageTintList(C3868a.m12945b(context, resourceId));
        }
        obtainStyledAttributes.recycle();
    }
}
