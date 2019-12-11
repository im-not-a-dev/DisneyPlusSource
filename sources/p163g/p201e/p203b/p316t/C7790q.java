package p163g.p201e.p203b.p316t;

import android.content.Context;
import android.widget.Toast;
import androidx.fragment.app.C0530c;
import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.about.C2258d;
import com.bamtechmedia.dominguez.auth.p066r0.C2797e;
import com.bamtechmedia.dominguez.core.p218n.C5792f;
import com.bamtechmedia.dominguez.legal.api.LegalRouter;
import com.bamtechmedia.dominguez.legal.api.LegalRouter.DefaultImpls;
import kotlin.jvm.internal.C12880j;
import p163g.p201e.p203b.p204d.C5393h;
import p163g.p201e.p203b.p407e0.C10597i;

/* renamed from: g.e.b.t.q */
/* compiled from: OptionsTvRouterImpl.kt */
public final class C7790q implements C7777f {

    /* renamed from: a */
    private final Context f16868a;

    /* renamed from: b */
    private final LegalRouter f16869b;

    /* renamed from: c */
    private final C5792f f16870c;

    /* renamed from: d */
    private final C7773b f16871d;

    public C7790q(Context context, LegalRouter legalRouter, C5792f fVar, C7773b bVar) {
        this.f16868a = context;
        this.f16869b = legalRouter;
        this.f16870c = fVar;
        this.f16871d = bVar;
    }

    /* renamed from: a */
    public void mo20689a(C7774c cVar) {
        switch (C7789p.$EnumSwitchMapping$0[cVar.ordinal()]) {
            case 1:
                m22875a((Fragment) new C5393h());
                return;
            case 2:
                this.f16871d.mo20684a();
                return;
            case 3:
                DefaultImpls.showLegalDocument$default(this.f16869b, null, null, 3, null);
                return;
            case 4:
                m22874a();
                return;
            case 5:
                m22875a((Fragment) new C10597i());
                return;
            case 6:
                m22875a((Fragment) new C2258d());
                return;
            default:
                Toast makeText = Toast.makeText(this.f16868a.getApplicationContext(), "Not implemented", 0);
                makeText.show();
                C12880j.m40222a((Object) makeText, "Toast.makeText(applicati…uration).apply { show() }");
                makeText.show();
                return;
        }
    }

    /* renamed from: a */
    private final void m22875a(Fragment fragment) {
        C5792f.m18757a(this.f16870c, fragment, false, null, null, null, 30, null);
    }

    /* renamed from: a */
    private final void m22874a() {
        C5792f fVar = this.f16870c;
        Object newInstance = C2797e.class.newInstance();
        C12880j.m40222a(newInstance, "T::class.java.newInstance()");
        fVar.mo17668a((C0530c) newInstance, "LogOutDialogFragment");
    }
}
