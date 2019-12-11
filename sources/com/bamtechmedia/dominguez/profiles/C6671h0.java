package com.bamtechmedia.dominguez.profiles;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&JH\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0003H&J*\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H&J\u001c\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J&\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH&¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/ProfileNavRouter;", "", "returnUpdatedProfile", "", "profile", "Lcom/bamtechmedia/dominguez/profiles/TempProfile;", "startAddProfile", "tempProfile", "startChooseAvatar", "isEditMode", "", "isDefaultProfile", "replaceBackstack", "targetFragment", "Landroidx/fragment/app/Fragment;", "targetRequestCode", "", "startChooseAvatarDefaultProfile", "startChooseLanguage", "startDeleteProfile", "profileId", "", "profileName", "startEditAllProfiles", "popCurrentFromStack", "startEditProfile", "startProfilePicker", "isAddProfiles", "profilesApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.h0 */
/* compiled from: ProfileNavRouter.kt */
public interface C6671h0 {

    /* renamed from: com.bamtechmedia.dominguez.profiles.h0$a */
    /* compiled from: ProfileNavRouter.kt */
    public static final class C6672a {
        /* renamed from: a */
        public static /* synthetic */ void m20687a(C6671h0 h0Var, boolean z, boolean z2, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = false;
                }
                h0Var.mo19397a(z, z2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startEditAllProfiles");
        }

        /* renamed from: a */
        public static /* synthetic */ void m20689a(C6671h0 h0Var, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = false;
                }
                if ((i & 4) != 0) {
                    z3 = false;
                }
                h0Var.mo19399a(z, z2, z3);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startProfilePicker");
        }

        /* renamed from: a */
        public static /* synthetic */ void m20688a(C6671h0 h0Var, boolean z, boolean z2, C6780r1 r1Var, boolean z3, Fragment fragment, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    z = false;
                }
                if ((i2 & 2) != 0) {
                    z2 = false;
                }
                if ((i2 & 4) != 0) {
                    r1Var = null;
                }
                if ((i2 & 8) != 0) {
                    z3 = false;
                }
                if ((i2 & 16) != 0) {
                    fragment = null;
                }
                if ((i2 & 32) != 0) {
                    i = 0;
                }
                h0Var.mo19398a(z, z2, r1Var, z3, fragment, i);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startChooseAvatar");
        }
    }

    /* renamed from: a */
    void mo19393a();

    /* renamed from: a */
    void mo19394a(C6780r1 r1Var);

    /* renamed from: a */
    void mo19395a(C6780r1 r1Var, Fragment fragment, int i);

    /* renamed from: a */
    void mo19396a(String str, String str2);

    /* renamed from: a */
    void mo19397a(boolean z, boolean z2);

    /* renamed from: a */
    void mo19398a(boolean z, boolean z2, C6780r1 r1Var, boolean z3, Fragment fragment, int i);

    /* renamed from: a */
    void mo19399a(boolean z, boolean z2, boolean z3);

    /* renamed from: b */
    void mo19400b(C6780r1 r1Var);

    /* renamed from: c */
    void mo19401c(C6780r1 r1Var);
}
