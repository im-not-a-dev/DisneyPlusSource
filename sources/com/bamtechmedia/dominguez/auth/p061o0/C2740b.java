package com.bamtechmedia.dominguez.auth.p061o0;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/api/AuthListener;", "Lcom/bamtechmedia/dominguez/auth/api/LogOutListener;", "onLoggedIn", "", "firstTimeUser", "", "authApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.o0.b */
/* compiled from: AuthListener.kt */
public interface C2740b extends C2743d {

    /* renamed from: com.bamtechmedia.dominguez.auth.o0.b$a */
    /* compiled from: AuthListener.kt */
    public static final class C2741a {
        /* renamed from: a */
        public static /* synthetic */ void m10380a(C2740b bVar, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                bVar.mo11752a(z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onLoggedIn");
        }
    }

    /* renamed from: a */
    void mo11752a(boolean z);
}
