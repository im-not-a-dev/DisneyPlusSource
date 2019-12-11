package com.bamtechmedia.dominguez.core.utils;

import android.widget.TextView;

/* renamed from: com.bamtechmedia.dominguez.core.utils.l0 */
/* compiled from: TextViewExt.kt */
public final class C5844l0 {
    /* renamed from: a */
    public static /* synthetic */ void m18865a(TextView textView, CharSequence charSequence, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        m18864a(textView, charSequence, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if ((r3 == null || r3.length() == 0) != false) goto L_0x001d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m18864a(android.widget.TextView r2, java.lang.CharSequence r3, boolean r4) {
        /*
            r2.setText(r3)
            r0 = 1
            r1 = 0
            if (r3 == 0) goto L_0x001d
            if (r4 == 0) goto L_0x001c
            java.lang.CharSequence r3 = r2.getText()
            if (r3 == 0) goto L_0x0018
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r3 = 0
            goto L_0x0019
        L_0x0018:
            r3 = 1
        L_0x0019:
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            if (r0 == 0) goto L_0x0021
            r1 = 8
        L_0x0021:
            r2.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.utils.C5844l0.m18864a(android.widget.TextView, java.lang.CharSequence, boolean):void");
    }

    /* renamed from: a */
    public static /* synthetic */ void m18863a(TextView textView, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        m18862a(textView, i, i2, i3, i4);
    }

    /* renamed from: a */
    public static final void m18862a(TextView textView, int i, int i2, int i3, int i4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }
}
