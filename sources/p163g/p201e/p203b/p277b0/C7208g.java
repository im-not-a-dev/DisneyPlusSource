package p163g.p201e.p203b.p277b0;

import android.content.Context;
import com.bamtech.sdk4.media.MediaCapabilitiesProvider;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: g.e.b.b0.g */
/* compiled from: FeatureSdkModule_MediaCapabilitiesProviderFactory */
public final class C7208g implements C11895c<MediaCapabilitiesProvider> {

    /* renamed from: a */
    private final Provider<Context> f15931a;

    /* renamed from: b */
    private final Provider<C7223r> f15932b;

    public C7208g(Provider<Context> provider, Provider<C7223r> provider2) {
        this.f15931a = provider;
        this.f15932b = provider2;
    }

    /* renamed from: a */
    public static C7208g m21808a(Provider<Context> provider, Provider<C7223r> provider2) {
        return new C7208g(provider, provider2);
    }

    /* renamed from: a */
    public static MediaCapabilitiesProvider m21807a(Context context, C7223r rVar) {
        MediaCapabilitiesProvider a = C7194c.m21774a(context, rVar);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public MediaCapabilitiesProvider get() {
        return m21807a((Context) this.f15931a.get(), (C7223r) this.f15932b.get());
    }
}
