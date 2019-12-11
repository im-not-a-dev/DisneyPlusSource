package com.bamtechmedia.dominguez.profiles;

import android.content.Context;
import com.bamtechmedia.dominguez.profiles.p258db.ProfilesDatabase;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.profiles.x */
/* compiled from: FeatureProfilesModule_ProvideProfilesDatabaseFactory */
public final class C6904x implements C11895c<ProfilesDatabase> {

    /* renamed from: a */
    private final Provider<Context> f15372a;

    public C6904x(Provider<Context> provider) {
        this.f15372a = provider;
    }

    /* renamed from: a */
    public static C6904x m21110a(Provider<Context> provider) {
        return new C6904x(provider);
    }

    /* renamed from: a */
    public static ProfilesDatabase m21109a(Context context) {
        ProfilesDatabase a = C6855u.m21017a(context);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public ProfilesDatabase get() {
        return m21109a((Context) this.f15372a.get());
    }
}
