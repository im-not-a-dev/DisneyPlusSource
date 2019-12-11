package com.google.android.material.internal;

import android.graphics.PorterDuff.Mode;
import android.view.View;
import p096e.p121h.p135s.C4187x;

/* renamed from: com.google.android.material.internal.h */
/* compiled from: ViewUtils */
public class C10321h {
    /* renamed from: a */
    public static Mode m32560a(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: a */
    public static boolean m32561a(View view) {
        return C4187x.m14399n(view) == 1;
    }
}
