package com.bamtechmedia.dominguez.core.content.assets;

import com.bamtechmedia.dominguez.core.content.C3688j;
import com.bamtechmedia.dominguez.core.content.C3693o;

/* renamed from: com.bamtechmedia.dominguez.core.content.assets.q */
/* compiled from: PlayableExt.kt */
public final class C3646q {
    /* renamed from: a */
    public static final Image m12401a(C3693o oVar) {
        Image a = oVar.mo12845a(C3688j.THUMBNAIL_NO_FALLBACK, C3623a.f9125b0.mo13248a());
        if (a == null) {
            a = oVar.mo12845a(C3688j.THUMBNAIL_NO_FALLBACK, C3623a.f9125b0.mo13253e());
        }
        return a != null ? a : oVar.mo12845a(C3688j.THUMBNAIL, C3623a.f9125b0.mo13248a());
    }
}
