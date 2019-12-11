package com.bamtechmedia.dominguez.auth.p067s0;

import com.bamtech.sdk4.identity.bam.OneTimePasscodeRequestReason;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.auth.s0.a0 */
/* compiled from: OtpResetPasswordBindingModule_OtpResetPasswordFragmentModule_ProvideOtpReasonFactory */
public final class C2853a0 implements C11895c<OneTimePasscodeRequestReason> {
    static {
        new C2853a0();
    }

    /* renamed from: a */
    public static OneTimePasscodeRequestReason m10555a() {
        OneTimePasscodeRequestReason a = C2946y.m10713a();
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public OneTimePasscodeRequestReason get() {
        return m10555a();
    }
}
