package com.facebook.stetho.inspector.elements.android;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import com.facebook.stetho.common.android.AccessibilityUtil;
import net.danlew.android.joda.DateUtils;
import p096e.p121h.p135s.C4187x;
import p096e.p121h.p135s.p136i0.C4154d;
import p096e.p121h.p135s.p136i0.C4154d.C4155a;

public final class AccessibilityNodeInfoWrapper {
    public static C4154d createNodeInfoFromView(View view) {
        C4154d z = C4154d.m14226z();
        C4187x.m14360a(view, z);
        return z;
    }

    public static String getActions(View view) {
        C4154d createNodeInfoFromView = createNodeInfoFromView(view);
        try {
            StringBuilder sb = new StringBuilder();
            for (C4155a aVar : createNodeInfoFromView.mo14733a()) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                int a = aVar.mo14792a();
                if (a == 1) {
                    sb.append("focus");
                } else if (a != 2) {
                    switch (a) {
                        case 4:
                            sb.append("select");
                            break;
                        case 8:
                            sb.append("clear-selection");
                            break;
                        case 16:
                            sb.append("click");
                            break;
                        case 32:
                            sb.append("long-click");
                            break;
                        case 64:
                            sb.append("accessibility-focus");
                            break;
                        case 128:
                            sb.append("clear-accessibility-focus");
                            break;
                        case 256:
                            sb.append("next-at-movement-granularity");
                            break;
                        case DateUtils.FORMAT_NO_NOON /*512*/:
                            sb.append("previous-at-movement-granularity");
                            break;
                        case 1024:
                            sb.append("next-html-element");
                            break;
                        case DateUtils.FORMAT_NO_MIDNIGHT /*2048*/:
                            sb.append("previous-html-element");
                            break;
                        case 4096:
                            sb.append("scroll-forward");
                            break;
                        case ContentServiceClientExtras.URL_SIZE_LIMIT /*8192*/:
                            sb.append("scroll-backward");
                            break;
                        case DateUtils.FORMAT_ABBREV_TIME /*16384*/:
                            sb.append("copy");
                            break;
                        case DateUtils.FORMAT_ABBREV_WEEKDAY /*32768*/:
                            sb.append("paste");
                            break;
                        case DateUtils.FORMAT_ABBREV_MONTH /*65536*/:
                            sb.append("cut");
                            break;
                        case DateUtils.FORMAT_NUMERIC_DATE /*131072*/:
                            sb.append("set-selection");
                            break;
                        default:
                            CharSequence b = aVar.mo14794b();
                            if (b == null) {
                                sb.append("unknown");
                                break;
                            } else {
                                sb.append(b);
                                break;
                            }
                    }
                } else {
                    sb.append("clear-focus");
                }
            }
            return sb.length() > 0 ? sb.toString() : null;
        } finally {
            createNodeInfoFromView.mo14790v();
        }
    }

    public static CharSequence getDescription(View view) {
        C4154d createNodeInfoFromView = createNodeInfoFromView(view);
        try {
            CharSequence e = createNodeInfoFromView.mo14759e();
            CharSequence h = createNodeInfoFromView.mo14769h();
            boolean z = !TextUtils.isEmpty(h);
            boolean z2 = view instanceof EditText;
            if (!TextUtils.isEmpty(e) && (!z2 || !z)) {
                return e;
            }
            if (z) {
                createNodeInfoFromView.mo14790v();
                return h;
            }
            String str = null;
            if (view instanceof ViewGroup) {
                StringBuilder sb = new StringBuilder();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    C4154d z3 = C4154d.m14226z();
                    C4187x.m14360a(childAt, z3);
                    CharSequence description = (!AccessibilityUtil.isSpeakingNode(z3, childAt) || AccessibilityUtil.isAccessibilityFocusable(z3, childAt)) ? null : getDescription(childAt);
                    if (!TextUtils.isEmpty(description)) {
                        if (sb.length() > 0) {
                            sb.append(", ");
                        }
                        sb.append(description);
                    }
                    z3.mo14790v();
                }
                if (sb.length() > 0) {
                    str = sb.toString();
                }
                createNodeInfoFromView.mo14790v();
                return str;
            }
            createNodeInfoFromView.mo14790v();
            return null;
        } finally {
            createNodeInfoFromView.mo14790v();
        }
    }

    public static String getFocusableReasons(View view) {
        C4154d createNodeInfoFromView = createNodeInfoFromView(view);
        try {
            boolean hasText = AccessibilityUtil.hasText(createNodeInfoFromView);
            boolean k = createNodeInfoFromView.mo14777k();
            boolean hasNonActionableSpeakingDescendants = AccessibilityUtil.hasNonActionableSpeakingDescendants(createNodeInfoFromView, view);
            if (AccessibilityUtil.isActionableForAccessibility(createNodeInfoFromView)) {
                if (createNodeInfoFromView.mo14750c() <= 0) {
                    return "View is actionable and has no children.";
                }
                if (hasText) {
                    String str = "View is actionable and has a description.";
                    createNodeInfoFromView.mo14790v();
                    return str;
                } else if (k) {
                    String str2 = "View is actionable and checkable.";
                    createNodeInfoFromView.mo14790v();
                    return str2;
                } else if (hasNonActionableSpeakingDescendants) {
                    String str3 = "View is actionable and has non-actionable descendants with descriptions.";
                    createNodeInfoFromView.mo14790v();
                    return str3;
                }
            }
            if (AccessibilityUtil.isTopLevelScrollItem(createNodeInfoFromView, view)) {
                if (hasText) {
                    String str4 = "View is a direct child of a scrollable container and has a description.";
                    createNodeInfoFromView.mo14790v();
                    return str4;
                } else if (k) {
                    String str5 = "View is a direct child of a scrollable container and is checkable.";
                    createNodeInfoFromView.mo14790v();
                    return str5;
                } else if (hasNonActionableSpeakingDescendants) {
                    String str6 = "View is a direct child of a scrollable container and has non-actionable descendants with descriptions.";
                    createNodeInfoFromView.mo14790v();
                    return str6;
                }
            }
            if (hasText) {
                String str7 = "View has a description and is not actionable, but has no actionable ancestor.";
                createNodeInfoFromView.mo14790v();
                return str7;
            }
            createNodeInfoFromView.mo14790v();
            return null;
        } finally {
            createNodeInfoFromView.mo14790v();
        }
    }

    public static boolean getIgnored(View view) {
        int l = C4187x.m14397l(view);
        if (l == 2 || l == 4) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (C4187x.m14397l((View) parent) == 4) {
                return true;
            }
        }
        C4154d createNodeInfoFromView = createNodeInfoFromView(view);
        try {
            if (!createNodeInfoFromView.mo14789u()) {
                return true;
            }
            if (AccessibilityUtil.isAccessibilityFocusable(createNodeInfoFromView, view)) {
                if (createNodeInfoFromView.mo14750c() <= 0) {
                    createNodeInfoFromView.mo14790v();
                    return false;
                } else if (AccessibilityUtil.isSpeakingNode(createNodeInfoFromView, view)) {
                    createNodeInfoFromView.mo14790v();
                    return false;
                } else {
                    createNodeInfoFromView.mo14790v();
                    return true;
                }
            } else if (AccessibilityUtil.hasFocusableAncestor(createNodeInfoFromView, view) || !AccessibilityUtil.hasText(createNodeInfoFromView)) {
                createNodeInfoFromView.mo14790v();
                return true;
            } else {
                createNodeInfoFromView.mo14790v();
                return false;
            }
        } finally {
            createNodeInfoFromView.mo14790v();
        }
    }

    public static String getIgnoredReasons(View view) {
        int l = C4187x.m14397l(view);
        if (l == 2) {
            return "View has importantForAccessibility set to 'NO'.";
        }
        if (l == 4) {
            return "View has importantForAccessibility set to 'NO_HIDE_DESCENDANTS'.";
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (C4187x.m14397l((View) parent) == 4) {
                return "An ancestor View has importantForAccessibility set to 'NO_HIDE_DESCENDANTS'.";
            }
        }
        C4154d createNodeInfoFromView = createNodeInfoFromView(view);
        try {
            if (!createNodeInfoFromView.mo14789u()) {
                return "View is not visible.";
            }
            if (AccessibilityUtil.isAccessibilityFocusable(createNodeInfoFromView, view)) {
                String str = "View is actionable, but has no description.";
                createNodeInfoFromView.mo14790v();
                return str;
            } else if (AccessibilityUtil.hasText(createNodeInfoFromView)) {
                String str2 = "View is not actionable, and an ancestor View has co-opted its description.";
                createNodeInfoFromView.mo14790v();
                return str2;
            } else {
                String str3 = "View is not actionable and has no description.";
                createNodeInfoFromView.mo14790v();
                return str3;
            }
        } finally {
            createNodeInfoFromView.mo14790v();
        }
    }

    public static boolean getIsAccessibilityFocused(View view) {
        C4154d createNodeInfoFromView = createNodeInfoFromView(view);
        boolean j = createNodeInfoFromView.mo14775j();
        createNodeInfoFromView.mo14790v();
        return j;
    }
}
