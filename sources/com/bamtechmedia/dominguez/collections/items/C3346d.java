package com.bamtechmedia.dominguez.collections.items;

import android.content.Context;
import android.widget.Toast;
import com.bamtechmedia.dominguez.collections.C3420l0;
import com.bamtechmedia.dominguez.collections.p080o0.C3433a;
import com.bamtechmedia.dominguez.collections.p080o0.C3439e;
import com.bamtechmedia.dominguez.core.content.C3653c;
import com.bamtechmedia.dominguez.core.content.C3653c.C3654a;
import com.bamtechmedia.dominguez.core.content.C3685g;
import com.bamtechmedia.dominguez.core.content.C3688j;
import com.bamtechmedia.dominguez.core.content.C3690l;
import com.bamtechmedia.dominguez.core.content.C3692n;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.content.C3791v;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.assets.CollectionAsset;
import com.bamtechmedia.dominguez.core.content.collections.C3676k;
import com.bamtechmedia.dominguez.core.content.collections.C3678l;
import com.bamtechmedia.dominguez.core.utils.C5884x;
import com.google.common.base.Optional;
import kotlin.jvm.internal.C12880j;
import p163g.p201e.p203b.p315s.C7769n;

/* renamed from: com.bamtechmedia.dominguez.collections.items.d */
/* compiled from: CollectionItemClickHandlerImpl.kt */
public final class C3346d implements C3345c {

    /* renamed from: U */
    private final C7769n f8417U;

    /* renamed from: V */
    private final Context f8418V;

    /* renamed from: W */
    private final C3678l f8419W;

    /* renamed from: X */
    private final C3439e f8420X;

    /* renamed from: Y */
    private final Optional<C3420l0> f8421Y;

    /* renamed from: c */
    private final C3653c f8422c;

    public C3346d(C3653c cVar, C7769n nVar, Context context, C3678l lVar, C3439e eVar, Optional<C3420l0> optional) {
        this.f8422c = cVar;
        this.f8417U = nVar;
        this.f8418V = context;
        this.f8419W = lVar;
        this.f8420X = eVar;
        this.f8421Y = optional;
    }

    /* renamed from: b */
    private final void m11505b(CollectionAsset collectionAsset) {
        String P = collectionAsset.mo12842P();
        if (P == null) {
            return;
        }
        if (m11504a(collectionAsset)) {
            m11511g(collectionAsset);
            return;
        }
        C3433a a = this.f8420X.mo12614a(P);
        if (m11506b(a)) {
            m11510f(collectionAsset);
        } else if (m11503a(a)) {
            m11508d(collectionAsset);
        } else {
            m11509e(collectionAsset);
        }
    }

    /* renamed from: c */
    private final C3676k m11507c(CollectionAsset collectionAsset) {
        C3676k a = this.f8419W.mo13386a(collectionAsset);
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("Invalid request. A slug is required.");
    }

    /* renamed from: d */
    private final void m11508d(CollectionAsset collectionAsset) {
        this.f8417U.mo20682c(m11507c(collectionAsset));
    }

    /* renamed from: e */
    private final void m11509e(CollectionAsset collectionAsset) {
        this.f8417U.mo20681b(m11507c(collectionAsset));
    }

    /* renamed from: f */
    private final void m11510f(CollectionAsset collectionAsset) {
        this.f8417U.mo20680a(m11507c(collectionAsset));
    }

    /* renamed from: g */
    private final void m11511g(CollectionAsset collectionAsset) {
        this.f8417U.mo20683d(m11507c(collectionAsset));
    }

    /* renamed from: a */
    public void mo12437a(C3626b bVar, int i) {
        if (bVar instanceof C3693o) {
            this.f8422c.mo13292a((C3693o) bVar, i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can not playback item of type: ");
        sb.append(bVar.getClass());
        mo12438a(sb.toString());
    }

    /* renamed from: a */
    public void mo12436a(C3626b bVar) {
        C3420l0 l0Var = (C3420l0) this.f8421Y.mo27107c();
        if (l0Var != null) {
            l0Var.mo12599b(bVar);
        }
        if (bVar instanceof C3692n) {
            C3654a.m12425a(this.f8422c, (C3692n) bVar, (C3690l) null, false, 6, (Object) null);
        } else if (bVar instanceof C3791v) {
            C3654a.m12427a(this.f8422c, (C3791v) bVar, (C3690l) null, false, 6, (Object) null);
        } else if (bVar instanceof C3685g) {
            C3653c cVar = this.f8422c;
            String C = ((C3685g) bVar).mo12873C();
            C5884x.m18951a((Object) C, (String) null, 1, (Object) null);
            C3654a.m12428a(cVar, C, (C3690l) null, false, 6, (Object) null);
        } else if (bVar instanceof CollectionAsset) {
            m11505b((CollectionAsset) bVar);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Can not open detail screen for item of type: ");
            sb.append(bVar.getClass());
            mo12438a(sb.toString());
        }
    }

    /* renamed from: b */
    private final boolean m11506b(C3433a aVar) {
        return C12880j.m40224a((Object) aVar.mo12608a(), (Object) "tabbed");
    }

    /* renamed from: a */
    private final boolean m11503a(C3433a aVar) {
        return C12880j.m40224a((Object) aVar.mo12608a(), (Object) "stacked") && C12880j.m40224a((Object) (String) aVar.mo12606a("title"), (Object) C3688j.LOGO_LAYER.mo13408a());
    }

    /* renamed from: a */
    private final boolean m11504a(CollectionAsset collectionAsset) {
        return C12880j.m40224a((Object) collectionAsset.mo12842P(), (Object) "originals");
    }

    /* renamed from: a */
    public final void mo12438a(String str) {
        Toast makeText = Toast.makeText(this.f8418V.getApplicationContext(), str, 0);
        makeText.show();
        C12880j.m40222a((Object) makeText, "Toast.makeText(applicati…uration).apply { show() }");
    }
}
