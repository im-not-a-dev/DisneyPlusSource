package com.bamtechmedia.dominguez.core.p216l;

import android.widget.ImageView;
import com.bamtechmedia.dominguez.core.content.assets.Image;

/* renamed from: com.bamtechmedia.dominguez.core.l.b */
/* compiled from: ImageLoaderExt.kt */
public final class C5763b {
    /* renamed from: a */
    public static /* synthetic */ void m18702a(ImageView imageView, Image image, int i, Integer num, Integer num2, boolean z, boolean z2, boolean z3, int i2, Object obj) {
        boolean z4 = false;
        int i3 = (i2 & 2) != 0 ? 0 : i;
        Integer num3 = null;
        Integer num4 = (i2 & 4) != 0 ? null : num;
        if ((i2 & 8) == 0) {
            num3 = num2;
        }
        boolean z5 = (i2 & 16) != 0 ? image != null ? image.mo13091b0() : true : z;
        boolean z6 = (i2 & 32) != 0 ? false : z2;
        if ((i2 & 64) == 0) {
            z4 = z3;
        }
        m18701a(imageView, image, i3, num4, num3, z5, z6, z4);
    }

    /* renamed from: a */
    public static final void m18701a(ImageView imageView, Image image, int i, Integer num, Integer num2, boolean z, boolean z2, boolean z3) {
        C5760a.f13520b.mo17646a(imageView, image, i, num, num2, z, z2, z3);
    }
}
