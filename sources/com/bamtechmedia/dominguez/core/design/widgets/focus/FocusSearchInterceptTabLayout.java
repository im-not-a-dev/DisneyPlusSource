package com.bamtechmedia.dominguez.core.design.widgets.focus;

import android.content.Context;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.google.android.material.tabs.TabLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u0007H\u0016J\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u0007H\u0002R\"\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/focus/FocusSearchInterceptTabLayout;", "Lcom/google/android/material/tabs/TabLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "focusSearchInterceptor", "Lcom/bamtechmedia/dominguez/core/design/widgets/focus/FocusSearchInterceptor;", "focusSearchInterceptor$annotations", "()V", "getFocusSearchInterceptor", "()Lcom/bamtechmedia/dominguez/core/design/widgets/focus/FocusSearchInterceptor;", "setFocusSearchInterceptor", "(Lcom/bamtechmedia/dominguez/core/design/widgets/focus/FocusSearchInterceptor;)V", "focusSearch", "Landroid/view/View;", "focused", "direction", "internalInterceptFocusSearch", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: FocusSearchInterceptTabLayout.kt */
public final class FocusSearchInterceptTabLayout extends TabLayout {

    /* renamed from: L0 */
    private C5691a f13358L0;

    public FocusSearchInterceptTabLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public FocusSearchInterceptTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ FocusSearchInterceptTabLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: a */
    private final View m18571a(View view, int i) {
        boolean z = i == 66 || i == 17;
        Context context = getContext();
        C12880j.m40222a((Object) context, "context");
        if (C5837i.m18836a(context) && z) {
            ViewGroup viewGroup = (ViewGroup) getChildAt(0);
            if (viewGroup != null) {
                return FocusFinder.getInstance().findNextFocus(viewGroup, view, i);
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View focusSearch(android.view.View r3, int r4) {
        /*
            r2 = this;
            android.view.View r0 = super.focusSearch(r3, r4)
            com.bamtechmedia.dominguez.core.design.widgets.focus.a r1 = r2.f13358L0
            if (r1 == 0) goto L_0x0010
            android.view.View r1 = r1.mo17542a(r3, r4, r0)
            if (r1 == 0) goto L_0x0010
            r3 = r1
            goto L_0x0014
        L_0x0010:
            android.view.View r3 = r2.m18571a(r3, r4)
        L_0x0014:
            if (r3 == 0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r3 = r0
        L_0x0018:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.design.widgets.focus.FocusSearchInterceptTabLayout.focusSearch(android.view.View, int):android.view.View");
    }

    public final C5691a getFocusSearchInterceptor() {
        return this.f13358L0;
    }

    public final void setFocusSearchInterceptor(C5691a aVar) {
        this.f13358L0 = aVar;
    }

    public FocusSearchInterceptTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
