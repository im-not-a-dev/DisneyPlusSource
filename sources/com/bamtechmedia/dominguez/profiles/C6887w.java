package com.bamtechmedia.dominguez.profiles;

import com.bamtechmedia.dominguez.profiles.p258db.C6639c;
import com.bamtechmedia.dominguez.profiles.p258db.ProfilesDatabase;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.profiles.w */
/* compiled from: FeatureProfilesModule_ProvideProfilesDaoFactory */
public final class C6887w implements C11895c<C6639c> {

    /* renamed from: a */
    private final Provider<ProfilesDatabase> f15347a;

    public C6887w(Provider<ProfilesDatabase> provider) {
        this.f15347a = provider;
    }

    /* renamed from: a */
    public static C6887w m21089a(Provider<ProfilesDatabase> provider) {
        return new C6887w(provider);
    }

    /* renamed from: a */
    public static C6639c m21088a(ProfilesDatabase profilesDatabase) {
        C6639c b = C6855u.m21020b(profilesDatabase);
        C11897e.m38130a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public C6639c get() {
        return m21088a((ProfilesDatabase) this.f15347a.get());
    }
}
