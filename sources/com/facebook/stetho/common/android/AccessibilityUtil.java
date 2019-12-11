package com.facebook.stetho.common.android;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.Spinner;
import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import java.util.List;
import p096e.p121h.p135s.C4187x;
import p096e.p121h.p135s.p136i0.C4154d;

public final class AccessibilityUtil {
    private AccessibilityUtil() {
    }

    public static boolean hasFocusableAncestor(C4154d dVar, View view) {
        if (dVar == null || view == null) {
            return false;
        }
        ViewParent s = C4187x.m14404s(view);
        if (!(s instanceof View)) {
            return false;
        }
        C4154d z = C4154d.m14226z();
        try {
            C4187x.m14360a((View) s, z);
            if (z == null) {
                return false;
            }
            if (isAccessibilityFocusable(z, (View) s)) {
                z.mo14790v();
                return true;
            } else if (hasFocusableAncestor(z, (View) s)) {
                z.mo14790v();
                return true;
            } else {
                z.mo14790v();
                return false;
            }
        } finally {
            z.mo14790v();
        }
    }

    public static boolean hasNonActionableSpeakingDescendants(C4154d dVar, View view) {
        if (!(dVar == null || view == null || !(view instanceof ViewGroup))) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    C4154d z = C4154d.m14226z();
                    try {
                        C4187x.m14360a(childAt, z);
                        if (!isAccessibilityFocusable(z, childAt)) {
                            if (isSpeakingNode(z, childAt)) {
                                z.mo14790v();
                                return true;
                            }
                        }
                    } finally {
                        z.mo14790v();
                    }
                }
            }
        }
        return false;
    }

    public static boolean hasText(C4154d dVar) {
        boolean z = false;
        if (dVar == null) {
            return false;
        }
        if (!TextUtils.isEmpty(dVar.mo14769h()) || !TextUtils.isEmpty(dVar.mo14759e())) {
            z = true;
        }
        return z;
    }

    public static boolean isAccessibilityFocusable(C4154d dVar, View view) {
        boolean z = false;
        if (!(dVar == null || view == null)) {
            if (!dVar.mo14789u()) {
                return false;
            }
            if (isActionableForAccessibility(dVar)) {
                return true;
            }
            if (isTopLevelScrollItem(dVar, view) && isSpeakingNode(dVar, view)) {
                z = true;
            }
        }
        return z;
    }

    public static boolean isActionableForAccessibility(C4154d dVar) {
        boolean z = false;
        if (dVar == null) {
            return false;
        }
        if (dVar.mo14780m() || dVar.mo14784q() || dVar.mo14782o()) {
            return true;
        }
        List a = dVar.mo14733a();
        if (a.contains(Integer.valueOf(16)) || a.contains(Integer.valueOf(32)) || a.contains(Integer.valueOf(1))) {
            z = true;
        }
        return z;
    }

    public static boolean isSpeakingNode(C4154d dVar, View view) {
        boolean z = false;
        if (!(dVar == null || view == null)) {
            if (!dVar.mo14789u()) {
                return false;
            }
            int l = C4187x.m14397l(view);
            if (l != 4 && ((l != 2 || dVar.mo14750c() > 0) && (dVar.mo14777k() || hasText(dVar) || hasNonActionableSpeakingDescendants(dVar, view)))) {
                z = true;
            }
        }
        return z;
    }

    public static boolean isTopLevelScrollItem(C4154d dVar, View view) {
        boolean z = false;
        if (dVar == null || view == null) {
            return false;
        }
        View view2 = (View) C4187x.m14404s(view);
        if (view2 == null) {
            return false;
        }
        if (dVar.mo14786s()) {
            return true;
        }
        List a = dVar.mo14733a();
        if (a.contains(Integer.valueOf(4096)) || a.contains(Integer.valueOf(ContentServiceClientExtras.URL_SIZE_LIMIT))) {
            return true;
        }
        if (view2 instanceof Spinner) {
            return false;
        }
        if ((view2 instanceof AdapterView) || (view2 instanceof ScrollView) || (view2 instanceof HorizontalScrollView)) {
            z = true;
        }
        return z;
    }
}
