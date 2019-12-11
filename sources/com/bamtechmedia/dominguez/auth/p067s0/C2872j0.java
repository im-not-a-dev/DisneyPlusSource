package com.bamtechmedia.dominguez.auth.p067s0;

import com.bamtech.sdk4.identity.bam.OneTimePasscodeRequestReason;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.auth.s0.j0 */
/* compiled from: OtpVerifyBindingModule_OtpVerifyModule_ProvideOtpReasonFactory */
public final class C2872j0 implements C11895c<OneTimePasscodeRequestReason> {
    static {
        new C2872j0();
    }

    /* renamed from: a */
    public static OneTimePasscodeRequestReason m10588a() {
        OneTimePasscodeRequestReason b = C2863f0.m10581b();
        C11897e.m38130a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public OneTimePasscodeRequestReason get() {
        return m10588a();
    }
}
