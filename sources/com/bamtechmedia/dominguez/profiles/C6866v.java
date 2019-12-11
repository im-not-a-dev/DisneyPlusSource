package com.bamtechmedia.dominguez.profiles;

import com.bamtechmedia.dominguez.profiles.p258db.C6632a;
import com.bamtechmedia.dominguez.profiles.p258db.ProfilesDatabase;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.profiles.v */
/* compiled from: FeatureProfilesModule_ProvideAvatarsDaoFactory */
public final class C6866v implements C11895c<C6632a> {

    /* renamed from: a */
    private final Provider<ProfilesDatabase> f15306a;

    public C6866v(Provider<ProfilesDatabase> provider) {
        this.f15306a = provider;
    }

    /* renamed from: a */
    public static C6866v m21044a(Provider<ProfilesDatabase> provider) {
        return new C6866v(provider);
    }

    /* renamed from: a */
    public static C6632a m21043a(ProfilesDatabase profilesDatabase) {
        C6632a a = C6855u.m21018a(profilesDatabase);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public C6632a get() {
        return m21043a((ProfilesDatabase) this.f15306a.get());
    }
}
