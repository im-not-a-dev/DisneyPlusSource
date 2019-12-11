package com.bamtechmedia.dominguez.core.p088i.p091p;

import com.bamtechmedia.dominguez.core.p088i.C3836f;

/* renamed from: com.bamtechmedia.dominguez.core.i.p.b */
/* compiled from: FallbackImage.kt */
public final class C3849b {

    /* renamed from: a */
    public static final C3849b f9526a = new C3849b();

    private C3849b() {
    }

    /* renamed from: a */
    public static /* synthetic */ int m12935a(C3849b bVar, float f, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = C3836f.image_placeholder;
        }
        return bVar.mo13767a(f, i);
    }

    /* renamed from: a */
    public final int mo13767a(float f, int i) {
        if (f == 0.71f) {
            return C3836f.fallback_0_71_tile;
        }
        if (f == 1.78f) {
            return C3836f.fallback_1_78_tile;
        }
        if (f == 1.0f) {
            return C3836f.fallback_1_00_tile;
        }
        if (f == 3.91f) {
            return C3836f.fallback_3_76;
        }
        return f == 3.0f ? C3836f.fallback_3_76 : i;
    }
}
