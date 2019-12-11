package p163g.p201e.p203b.p278h;

import com.bamtechmedia.dominguez.config.C3524e;
import com.bamtechmedia.dominguez.core.BuildInfo;
import p163g.p201e.p203b.p278h.p280l.C7252a;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;
import p520io.reactivex.Single;

/* renamed from: g.e.b.h.d */
/* compiled from: FeatureTvCtvActivationModule_CtvActivationConfigImplOnceFactory */
public final class C7238d implements C11895c<Single<C7252a>> {
    /* renamed from: a */
    public static Single<C7252a> m21849a(Single<C3524e> single, BuildInfo buildInfo) {
        Single<C7252a> a = C7237c.m21848a(single, buildInfo);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
