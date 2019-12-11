package com.bamtechmedia.dominguez.core.design.widgets.vadergrid;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.bamtechmedia.dominguez.core.p088i.C3833c;
import com.bamtechmedia.dominguez.core.p088i.C3835e;
import com.bamtechmedia.dominguez.core.p088i.C3839i;
import com.bamtechmedia.dominguez.core.p088i.C3843m;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p096e.p121h.p135s.C4146h;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0017\u001a\u00020\bH\u0002J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/vadergrid/VaderViewHelper;", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "additionalColumns", "", "applyGridPadding", "", "columnMargin", "", "columns", "gridMargin", "isTablet", "landscapeColumns", "maxTabletWidthPixels", "portraitColumns", "resources", "Landroid/content/res/Resources;", "getResources", "()Landroid/content/res/Resources;", "getVaderGridWidth", "updateMargin", "", "view", "Landroid/view/View;", "updatePadding", "Companion", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.design.widgets.vadergrid.b */
/* compiled from: VaderViewHelper.kt */
public final class C5726b {

    /* renamed from: a */
    private final int f13482a;

    /* renamed from: b */
    private final int f13483b;

    /* renamed from: c */
    private final boolean f13484c;

    /* renamed from: d */
    private final int f13485d;

    /* renamed from: e */
    private final int f13486e = this.f13491j.getResources().getInteger(C3839i.vader_grid_column_count);

    /* renamed from: f */
    private final boolean f13487f = m18649a().getBoolean(C3833c.isTablet);

    /* renamed from: g */
    private final int f13488g = this.f13491j.getResources().getInteger(C3839i.vader_grid_additional_columns);

    /* renamed from: h */
    private final int f13489h = this.f13491j.getResources().getDimensionPixelOffset(C3835e.vader_grid_start_margin);

    /* renamed from: i */
    private final float f13490i = this.f13491j.getResources().getDimension(C3835e.vader_grid_item_margin);

    /* renamed from: j */
    private final Context f13491j;

    /* renamed from: com.bamtechmedia.dominguez.core.design.widgets.vadergrid.b$a */
    /* compiled from: VaderViewHelper.kt */
    public static final class C5727a {
        private C5727a() {
        }

        public /* synthetic */ C5727a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C5727a(null);
    }

    public C5726b(Context context, AttributeSet attributeSet) {
        this.f13491j = context;
        TypedArray obtainStyledAttributes = this.f13491j.getTheme().obtainStyledAttributes(attributeSet, C3843m.VaderViewGroup, 0, 0);
        this.f13482a = C12762h.m39917b(obtainStyledAttributes.getInteger(C3843m.VaderViewGroup_portraitColumns, 10), this.f13486e);
        this.f13483b = C12762h.m39917b(obtainStyledAttributes.getInteger(C3843m.VaderViewGroup_landscapeColumns, 12), this.f13486e);
        this.f13484c = obtainStyledAttributes.getBoolean(C3843m.VaderViewGroup_applyGridPadding, true);
        this.f13485d = obtainStyledAttributes.getDimensionPixelSize(C3843m.VaderViewGroup_maxTabletWidth, Integer.MAX_VALUE);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private final Resources m18649a() {
        Resources resources = this.f13491j.getResources();
        C12880j.m40222a((Object) resources, "context.resources");
        return resources;
    }

    /* renamed from: b */
    private final int m18650b() {
        int i;
        int i2 = this.f13484c ? this.f13489h * 2 : 0;
        if (!this.f13487f) {
            return m18649a().getDisplayMetrics().widthPixels - i2;
        }
        if (C5837i.m18841c(this.f13491j)) {
            i = C12762h.m39917b(this.f13482a + this.f13488g, this.f13486e);
        } else {
            i = this.f13483b;
        }
        float f = (float) (m18649a().getDisplayMetrics().widthPixels - i2);
        float f2 = this.f13490i;
        int i3 = this.f13486e;
        return Math.min(this.f13485d, (int) ((((float) i) * ((f - (((float) (i3 - 1)) * f2)) / ((float) i3))) + (((float) (i - 1)) * f2)));
    }

    /* renamed from: a */
    public final void mo17605a(View view) {
        int b = (m18649a().getDisplayMetrics().widthPixels - m18650b()) / 2;
        LayoutParams layoutParams = view.getLayoutParams();
        int i = 0;
        if ((layoutParams instanceof MarginLayoutParams ? C4146h.m14191b((MarginLayoutParams) layoutParams) : 0) == b) {
            LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof MarginLayoutParams) {
                i = C4146h.m14189a((MarginLayoutParams) layoutParams2);
            }
            if (i == b) {
                return;
            }
        }
        LayoutParams layoutParams3 = view.getLayoutParams();
        if (layoutParams3 != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams3;
            int i2 = marginLayoutParams.topMargin;
            int i3 = marginLayoutParams.bottomMargin;
            marginLayoutParams.setMarginStart(b);
            marginLayoutParams.topMargin = i2;
            marginLayoutParams.setMarginEnd(b);
            marginLayoutParams.bottomMargin = i3;
            view.setLayoutParams(marginLayoutParams);
            view.requestLayout();
            return;
        }
        throw new C13142s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: b */
    public final void mo17606b(View view) {
        int b = (m18649a().getDisplayMetrics().widthPixels - m18650b()) / 2;
        if (view.getPaddingStart() != b || view.getPaddingEnd() != b) {
            view.setPaddingRelative(b, view.getPaddingTop(), b, view.getPaddingBottom());
            view.requestLayout();
        }
    }
}
