package com.bamtechmedia.dominguez.auth.p066r0;

import com.bamtechmedia.dominguez.auth.p061o0.C2745f;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/logout/LogOutRouter;", "", "showLogOutConfirmDialog", "", "messageOverride", "", "requestIdRes", "(Ljava/lang/Integer;I)V", "startLogOutDialog", "isSoftLogout", "", "authApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.r0.j */
/* compiled from: LogOutRouter.kt */
public interface C2809j {

    /* renamed from: com.bamtechmedia.dominguez.auth.r0.j$a */
    /* compiled from: LogOutRouter.kt */
    public static final class C2810a {
        /* renamed from: a */
        public static /* synthetic */ void m10486a(C2809j jVar, Integer num, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    num = null;
                }
                if ((i2 & 2) != 0) {
                    i = C2745f.log_out;
                }
                jVar.mo11813a(num, i);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showLogOutConfirmDialog");
        }

        /* renamed from: a */
        public static /* synthetic */ void m10485a(C2809j jVar, int i, boolean z, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    z = false;
                }
                jVar.mo11812a(i, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startLogOutDialog");
        }
    }

    /* renamed from: a */
    void mo11812a(int i, boolean z);

    /* renamed from: a */
    void mo11813a(Integer num, int i);
}
