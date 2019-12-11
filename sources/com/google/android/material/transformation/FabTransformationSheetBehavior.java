package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0446f;
import java.util.HashMap;
import java.util.Map;
import p096e.p121h.p135s.C4187x;
import p163g.p449j.p450a.p468b.C11457a;
import p163g.p449j.p450a.p468b.p469l.C11475h;
import p163g.p449j.p450a.p468b.p469l.C11477j;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: g */
    private Map<View, Integer> f24670g;

    public FabTransformationSheetBehavior() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10362e mo27095a(Context context, boolean z) {
        int i;
        if (z) {
            i = C11457a.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i = C11457a.mtrl_fab_transformation_sheet_collapse_spec;
        }
        C10362e eVar = new C10362e();
        eVar.f24664a = C11475h.m37006a(context, i);
        eVar.f24665b = new C11477j(17, 0.0f, 0.0f);
        return eVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo27090a(View view, View view2, boolean z, boolean z2) {
        m32787a(view2, z);
        return super.mo27090a(view, view2, z, z2);
    }

    /* renamed from: a */
    private void m32787a(View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (VERSION.SDK_INT >= 16 && z) {
                this.f24670g = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z2 = (childAt.getLayoutParams() instanceof C0446f) && (((C0446f) childAt.getLayoutParams()).mo2558d() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (!z) {
                        Map<View, Integer> map = this.f24670g;
                        if (map != null && map.containsKey(childAt)) {
                            C4187x.m14390g(childAt, ((Integer) this.f24670g.get(childAt)).intValue());
                        }
                    } else {
                        if (VERSION.SDK_INT >= 16) {
                            this.f24670g.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        C4187x.m14390g(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.f24670g = null;
            }
        }
    }
}
