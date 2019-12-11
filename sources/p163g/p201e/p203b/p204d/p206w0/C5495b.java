package p163g.p201e.p203b.p204d.p206w0;

import com.bamtech.sdk4.account.DefaultAccount;
import com.bamtech.sdk4.subscription.Subscription;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2755d;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.core.design.widgets.C5666c;
import java.util.List;
import p163g.p201e.p203b.p204d.C5386f;
import p163g.p201e.p203b.p204d.C5402j;
import p163g.p509o.p510a.C11847b;

/* renamed from: g.e.b.d.w0.b */
/* compiled from: AccountSettingsItemsFactoryTvImpl.kt */
public final class C5495b extends C5490a {

    /* renamed from: e */
    private final C3572r0 f13030e;

    public C5495b(C5402j jVar, C2755d dVar, C3572r0 r0Var, C5386f fVar) {
        super(r0Var, jVar, dVar, fVar);
        this.f13030e = r0Var;
    }

    /* renamed from: a */
    public List<C11847b> mo17239a(DefaultAccount defaultAccount, List<Subscription> list) {
        return C13185o.m40520c(mo17241b(defaultAccount), mo17238a(defaultAccount), C5666c.f13300c, new C5500f(list, this.f13030e));
    }
}
