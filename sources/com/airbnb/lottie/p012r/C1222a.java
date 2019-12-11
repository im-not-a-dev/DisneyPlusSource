package com.airbnb.lottie.p012r;

import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;

/* renamed from: com.airbnb.lottie.r.a */
/* compiled from: LPaint */
public class C1222a extends Paint {
    public C1222a() {
    }

    public void setTextLocales(LocaleList localeList) {
    }

    public C1222a(int i) {
        super(i);
    }

    public C1222a(Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public C1222a(int i, Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
