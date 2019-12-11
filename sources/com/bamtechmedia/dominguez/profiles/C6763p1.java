package com.bamtechmedia.dominguez.profiles;

import com.bamtech.sdk4.account.UserProfileApi;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.profiles.p1 */
/* compiled from: RemoteProfiles_Factory */
public final class C6763p1 implements C11895c<C6746n1> {

    /* renamed from: a */
    private final Provider<UserProfileApi> f15137a;

    public C6763p1(Provider<UserProfileApi> provider) {
        this.f15137a = provider;
    }

    /* renamed from: a */
    public static C6763p1 m20855a(Provider<UserProfileApi> provider) {
        return new C6763p1(provider);
    }

    public C6746n1 get() {
        return new C6746n1((UserProfileApi) this.f15137a.get());
    }
}
