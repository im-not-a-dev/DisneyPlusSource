package com.bamtechmedia.dominguez.profiles;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tH&¨\u0006\n"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/ProfilesGlobalNavRouter;", "", "close", "", "startAddProfile", "startCreateProfiles", "startEditProfiles", "startProfilePicker", "replaceBackStack", "", "profilesApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.p0 */
/* compiled from: ProfilesGlobalNavRouter.kt */
public interface C6761p0 {

    /* renamed from: com.bamtechmedia.dominguez.profiles.p0$a */
    /* compiled from: ProfilesGlobalNavRouter.kt */
    public static final class C6762a {
        /* renamed from: a */
        public static /* synthetic */ void m20854a(C6761p0 p0Var, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = true;
                }
                p0Var.mo19487a(z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startProfilePicker");
        }
    }

    /* renamed from: a */
    void mo19486a();

    /* renamed from: a */
    void mo19487a(boolean z);

    void close();
}
