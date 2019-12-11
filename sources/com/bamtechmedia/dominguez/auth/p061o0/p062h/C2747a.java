package com.bamtechmedia.dominguez.auth.p061o0.p062h;

import kotlin.Metadata;
import p163g.p503n.p504a.C11790c0;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/api/helper/LogOutHelper;", "", "confirmOrLogOut", "", "scope", "Lcom/uber/autodispose/ScopeProvider;", "forceShowConfirm", "", "authApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.o0.h.a */
/* compiled from: LogOutHelper.kt */
public interface C2747a {

    /* renamed from: com.bamtechmedia.dominguez.auth.o0.h.a$a */
    /* compiled from: LogOutHelper.kt */
    public static final class C2748a {
        /* renamed from: a */
        public static /* synthetic */ void m10387a(C2747a aVar, C11790c0 c0Var, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = false;
                }
                aVar.mo11755a(c0Var, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: confirmOrLogOut");
        }
    }

    /* renamed from: a */
    void mo11755a(C11790c0 c0Var, boolean z);
}
