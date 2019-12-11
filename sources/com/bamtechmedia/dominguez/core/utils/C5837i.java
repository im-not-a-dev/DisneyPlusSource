package com.bamtechmedia.dominguez.core.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.accessibility.AccessibilityManager;
import kotlin.C13142s;
import kotlin.jvm.internal.C12880j;

/* renamed from: com.bamtechmedia.dominguez.core.utils.i */
/* compiled from: ContextExt.kt */
public final class C5837i {
    /* renamed from: a */
    public static /* synthetic */ int m18835a(Context context, int i, TypedValue typedValue, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        return m18834a(context, i, typedValue, z);
    }

    /* renamed from: b */
    public static final boolean m18840b(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    /* renamed from: c */
    public static final boolean m18841c(Context context) {
        Resources resources = context.getResources();
        C12880j.m40222a((Object) resources, "resources");
        return resources.getConfiguration().orientation == 1;
    }

    /* renamed from: d */
    public static final boolean m18842d(Context context) {
        return context.getResources().getBoolean(C5885y.isTablet);
    }

    /* renamed from: e */
    public static final boolean m18843e(Context context) {
        return context.getResources().getBoolean(C5885y.isTelevision);
    }

    /* renamed from: b */
    public static /* synthetic */ int m18839b(Context context, int i, TypedValue typedValue, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        return m18838b(context, i, typedValue, z);
    }

    /* renamed from: a */
    public static final int m18834a(Context context, int i, TypedValue typedValue, boolean z) {
        context.getTheme().resolveAttribute(i, typedValue, z);
        return typedValue.data;
    }

    /* renamed from: b */
    public static final int m18838b(Context context, int i, TypedValue typedValue, boolean z) {
        context.getTheme().resolveAttribute(i, typedValue, z);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public static final float m18833a(Context context, int i) {
        return (float) context.getResources().getDimensionPixelSize(i);
    }

    /* renamed from: a */
    public static final boolean m18836a(Context context) {
        Object systemService = context.getSystemService("accessibility");
        if (systemService != null) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
            return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
        }
        throw new C13142s("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
    }

    /* renamed from: b */
    public static final float m18837b(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        Resources resources = context.getResources();
        C12880j.m40222a((Object) resources, "resources");
        return typedValue.getDimension(resources.getDisplayMetrics());
    }
}
