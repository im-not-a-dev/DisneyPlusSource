package com.bamtechmedia.dominguez.main;

import androidx.fragment.app.C0532d;
import androidx.lifecycle.C0721l;
import com.bamtechmedia.dominguez.analytics.C2366i0;
import com.bamtechmedia.dominguez.collections.C3330h;
import com.bamtechmedia.dominguez.collections.C3419l;
import com.bamtechmedia.dominguez.collections.caching.C3296f;
import com.bamtechmedia.dominguez.core.p218n.C5773a;
import com.bamtechmedia.dominguez.core.utils.C5856o0;
import com.bamtechmedia.dominguez.profiles.C6667g1;
import java.util.Set;
import javax.inject.Provider;
import p163g.p201e.p202a.C5363f;

/* renamed from: com.bamtechmedia.dominguez.main.d */
/* compiled from: MainActivityCommonModule */
public abstract class C6128d {
    /* renamed from: a */
    static C6127c m19543a(Set<C0721l> set) {
        return new C6127c(set);
    }

    /* renamed from: a */
    static C5773a m19542a(MainActivity mainActivity) {
        return C5773a.m18719a((C0532d) mainActivity, C5363f.mainActivityContent);
    }

    /* renamed from: a */
    static C3330h m19541a(MainActivity mainActivity, C6667g1 g1Var, C3419l lVar, C2366i0 i0Var) {
        return (C3330h) C5856o0.m18894a((C0532d) mainActivity, C3296f.class, (Provider<T>) new C6125a<T>(g1Var, lVar, i0Var));
    }

    /* renamed from: a */
    static /* synthetic */ C3296f m19540a(C6667g1 g1Var, C3419l lVar, C2366i0 i0Var) {
        return new C3296f(g1Var, lVar, i0Var);
    }
}
