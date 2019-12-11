package com.bamtechmedia.dominguez.auth.p067s0;

import com.bamtech.sdk4.identity.bam.OneTimePasscodeRequestReason;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.auth.s0.h */
/* compiled from: AccountOtpPasscodeBindingModule_AccountOtpPasscodeModule_ProvideOtpReasonFactory */
public final class C2867h implements C11895c<OneTimePasscodeRequestReason> {
    static {
        new C2867h();
    }

    /* renamed from: a */
    public static OneTimePasscodeRequestReason m10583a() {
        OneTimePasscodeRequestReason b = C2860e.m10569b();
        C11897e.m38130a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public OneTimePasscodeRequestReason get() {
        return m10583a();
    }
}
