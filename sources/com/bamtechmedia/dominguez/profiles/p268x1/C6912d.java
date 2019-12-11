package com.bamtechmedia.dominguez.profiles.p268x1;

import com.bamtechmedia.dominguez.profiles.p263u1.p265e.C6865a;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.profiles.x1.d */
/* compiled from: DefaultLanguageProviderImpl_Factory */
public final class C6912d implements C11895c<C6911c> {

    /* renamed from: a */
    private final Provider<C6865a> f15388a;

    public C6912d(Provider<C6865a> provider) {
        this.f15388a = provider;
    }

    /* renamed from: a */
    public static C6912d m21124a(Provider<C6865a> provider) {
        return new C6912d(provider);
    }

    public C6911c get() {
        return new C6911c((C6865a) this.f15388a.get());
    }
}
