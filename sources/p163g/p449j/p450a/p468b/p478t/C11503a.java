package p163g.p449j.p450a.p468b.p478t;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.util.StateSet;
import p096e.p121h.p125k.C4045a;

/* renamed from: g.j.a.b.t.a */
/* compiled from: RippleUtils */
public class C11503a {

    /* renamed from: a */
    public static final boolean f26895a = (VERSION.SDK_INT >= 21);

    /* renamed from: b */
    private static final int[] f26896b = {16842919};

    /* renamed from: c */
    private static final int[] f26897c = {16843623, 16842908};

    /* renamed from: d */
    private static final int[] f26898d = {16842908};

    /* renamed from: e */
    private static final int[] f26899e = {16843623};

    /* renamed from: f */
    private static final int[] f26900f = {16842913, 16842919};

    /* renamed from: g */
    private static final int[] f26901g = {16842913, 16843623, 16842908};

    /* renamed from: h */
    private static final int[] f26902h = {16842913, 16842908};

    /* renamed from: i */
    private static final int[] f26903i = {16842913, 16843623};

    /* renamed from: j */
    private static final int[] f26904j = {16842913};

    /* renamed from: a */
    public static ColorStateList m37104a(ColorStateList colorStateList) {
        if (f26895a) {
            return new ColorStateList(new int[][]{f26904j, StateSet.NOTHING}, new int[]{m37103a(colorStateList, f26900f), m37103a(colorStateList, f26896b)});
        }
        int[] iArr = f26900f;
        int[] iArr2 = f26901g;
        int[] iArr3 = f26902h;
        int[] iArr4 = f26903i;
        int[] iArr5 = f26896b;
        int[] iArr6 = f26897c;
        int[] iArr7 = f26898d;
        int[] iArr8 = f26899e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f26904j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{m37103a(colorStateList, iArr), m37103a(colorStateList, iArr2), m37103a(colorStateList, iArr3), m37103a(colorStateList, iArr4), 0, m37103a(colorStateList, iArr5), m37103a(colorStateList, iArr6), m37103a(colorStateList, iArr7), m37103a(colorStateList, iArr8), 0});
    }

    /* renamed from: a */
    private static int m37103a(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f26895a ? m37102a(colorForState) : colorForState;
    }

    @TargetApi(21)
    /* renamed from: a */
    private static int m37102a(int i) {
        return C4045a.m13882c(i, Math.min(Color.alpha(i) * 2, 255));
    }
}
