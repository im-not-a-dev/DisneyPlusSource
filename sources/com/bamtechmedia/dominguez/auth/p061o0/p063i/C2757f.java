package com.bamtechmedia.dominguez.auth.p061o0.p063i;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H&¨\u0006\b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/api/router/WelcomeRouter;", "", "startAccountValidation", "", "forRegister", "", "canSignUp", "popCurrentFromStack", "authApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.o0.i.f */
/* compiled from: WelcomeRouter.kt */
public interface C2757f {

    /* renamed from: com.bamtechmedia.dominguez.auth.o0.i.f$a */
    /* compiled from: WelcomeRouter.kt */
    public static final class C2758a {
        /* renamed from: a */
        public static /* synthetic */ void m10407a(C2757f fVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z2 = true;
                }
                if ((i & 4) != 0) {
                    z3 = false;
                }
                fVar.mo11774a(z, z2, z3);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startAccountValidation");
        }
    }

    /* renamed from: a */
    void mo11774a(boolean z, boolean z2, boolean z3);
}
