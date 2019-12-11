package com.bamtechmedia.dominguez.auth.p067s0;

import com.bamtech.sdk4.identity.bam.OneTimePasscodeRequestReason;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.auth.s0.s */
/* compiled from: OtpLoginBindingModule_OtpLoginFragmentModule_ProvideOtpReasonFactory */
public final class C2924s implements C11895c<OneTimePasscodeRequestReason> {
    static {
        new C2924s();
    }

    /* renamed from: a */
    public static OneTimePasscodeRequestReason m10689a() {
        OneTimePasscodeRequestReason a = C2921q.m10686a();
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public OneTimePasscodeRequestReason get() {
        return m10689a();
    }
}
