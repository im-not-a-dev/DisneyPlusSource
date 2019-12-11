package p163g.p201e.p203b.p326x;

import android.content.Context;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: g.e.b.x.c */
/* compiled from: FeaturePlatformModule_IsGooglePlayAvailableFactory */
public final class C7918c implements C11895c<Boolean> {

    /* renamed from: a */
    private final Provider<Context> f17053a;

    public C7918c(Provider<Context> provider) {
        this.f17053a = provider;
    }

    /* renamed from: a */
    public static C7918c m23136a(Provider<Context> provider) {
        return new C7918c(provider);
    }

    /* renamed from: a */
    public static boolean m23137a(Context context) {
        return C7917b.m23135a(context);
    }

    public Boolean get() {
        return Boolean.valueOf(m23137a((Context) this.f17053a.get()));
    }
}
