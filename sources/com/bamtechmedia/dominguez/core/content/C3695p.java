package com.bamtechmedia.dominguez.core.content;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bamtechmedia.dominguez.core.content.p */
/* compiled from: PromoLabelExt.kt */
public final class C3695p {
    /* renamed from: a */
    public static final boolean m12563a(PromoLabel promoLabel) {
        return Intrinsics.areEqual((Object) promoLabel.mo12814b0(), (Object) "ComingSoon");
    }

    /* renamed from: b */
    public static final boolean m12564b(PromoLabel promoLabel) {
        return m12563a(promoLabel) && Intrinsics.areEqual((Object) promoLabel.mo12810Y(), (Object) "movie");
    }

    /* renamed from: c */
    public static final boolean m12565c(PromoLabel promoLabel) {
        if (m12563a(promoLabel) && Intrinsics.areEqual((Object) promoLabel.mo12810Y(), (Object) "season")) {
            Integer F = promoLabel.mo12808F();
            if (F != null && F.intValue() == 1) {
                return true;
            }
        }
        return false;
    }
}
