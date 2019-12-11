package p163g.p201e.p203b.p277b0;

import android.app.Application;
import android.content.SharedPreferences;
import com.bamtech.sdk4.media.MediaCapabilitiesProvider;
import com.bamtechmedia.dominguez.config.C3558l;
import com.bamtechmedia.dominguez.core.BuildInfo;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p520io.reactivex.C11969r;

/* renamed from: g.e.b.b0.d0 */
/* compiled from: SdkSessionProvider_Factory */
public final class C7205d0 implements C11895c<C7195c0> {

    /* renamed from: a */
    private final Provider<Application> f15922a;

    /* renamed from: b */
    private final Provider<BuildInfo> f15923b;

    /* renamed from: c */
    private final Provider<C3558l> f15924c;

    /* renamed from: d */
    private final Provider<C7226t> f15925d;

    /* renamed from: e */
    private final Provider<MediaCapabilitiesProvider> f15926e;

    /* renamed from: f */
    private final Provider<C11969r> f15927f;

    /* renamed from: g */
    private final Provider<SharedPreferences> f15928g;

    public C7205d0(Provider<Application> provider, Provider<BuildInfo> provider2, Provider<C3558l> provider3, Provider<C7226t> provider4, Provider<MediaCapabilitiesProvider> provider5, Provider<C11969r> provider6, Provider<SharedPreferences> provider7) {
        this.f15922a = provider;
        this.f15923b = provider2;
        this.f15924c = provider3;
        this.f15925d = provider4;
        this.f15926e = provider5;
        this.f15927f = provider6;
        this.f15928g = provider7;
    }

    /* renamed from: a */
    public static C7205d0 m21802a(Provider<Application> provider, Provider<BuildInfo> provider2, Provider<C3558l> provider3, Provider<C7226t> provider4, Provider<MediaCapabilitiesProvider> provider5, Provider<C11969r> provider6, Provider<SharedPreferences> provider7) {
        C7205d0 d0Var = new C7205d0(provider, provider2, provider3, provider4, provider5, provider6, provider7);
        return d0Var;
    }

    public C7195c0 get() {
        C7195c0 c0Var = new C7195c0((Application) this.f15922a.get(), (BuildInfo) this.f15923b.get(), (C3558l) this.f15924c.get(), this.f15925d, this.f15926e, (C11969r) this.f15927f.get(), (SharedPreferences) this.f15928g.get());
        return c0Var;
    }
}
