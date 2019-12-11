package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0284t0;
import p163g.p449j.p450a.p468b.C11458b;
import p163g.p449j.p450a.p468b.C11467k;

/* renamed from: com.google.android.material.internal.g */
/* compiled from: ThemeEnforcement */
public final class C10320g {

    /* renamed from: a */
    private static final int[] f24449a = {C11458b.colorPrimary};

    /* renamed from: b */
    private static final int[] f24450b = {C11458b.colorSecondary};

    /* renamed from: a */
    private static void m32552a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11467k.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C11467k.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            m32556b(context);
        }
        m32551a(context);
    }

    /* renamed from: b */
    private static boolean m32557b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int resourceId : iArr2) {
            if (obtainStyledAttributes.getResourceId(resourceId, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: c */
    public static TypedArray m32558c(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m32552a(context, attributeSet, i, i2);
        m32553a(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: d */
    public static C0284t0 m32559d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m32552a(context, attributeSet, i, i2);
        m32553a(context, attributeSet, iArr, i, i2, iArr2);
        return C0284t0.m1486a(context, attributeSet, iArr, i, i2);
    }

    /* renamed from: b */
    public static void m32556b(Context context) {
        m32554a(context, f24450b, "Theme.MaterialComponents");
    }

    /* renamed from: a */
    private static void m32553a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11467k.ThemeEnforcement, i, i2);
        if (!obtainStyledAttributes.getBoolean(C11467k.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        boolean z = (iArr2 == null || iArr2.length == 0) ? obtainStyledAttributes.getResourceId(C11467k.ThemeEnforcement_android_textAppearance, -1) != -1 : m32557b(context, attributeSet, iArr, i, i2, iArr2);
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: a */
    public static void m32551a(Context context) {
        m32554a(context, f24449a, "Theme.AppCompat");
    }

    /* renamed from: a */
    private static boolean m32555a(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean hasValue = obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        return hasValue;
    }

    /* renamed from: a */
    private static void m32554a(Context context, int[] iArr, String str) {
        if (!m32555a(context, iArr)) {
            StringBuilder sb = new StringBuilder();
            sb.append("The style on this component requires your app theme to be ");
            sb.append(str);
            sb.append(" (or a descendant).");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
