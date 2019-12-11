package com.bamtechmedia.dominguez.search;

import com.bamtechmedia.dominguez.analytics.C2366i0;
import com.bamtechmedia.dominguez.core.content.collections.C3667h;
import com.bamtechmedia.dominguez.core.content.collections.C3678l;
import com.bamtechmedia.dominguez.core.content.sets.C3765c;
import com.bamtechmedia.dominguez.keyboard.KeyboardStateListener;
import com.google.common.base.Optional;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.search.g0 */
/* compiled from: TvSearchFragmentModule_ProvideSearchViewModelFactory */
public final class C8031g0 implements C11895c<C7975b0> {
    /* renamed from: a */
    public static C7975b0 m23344a(C8068y yVar, C3667h hVar, C3678l lVar, SearchRepository searchRepository, C8052r rVar, C3765c cVar, C8060t tVar, C2366i0 i0Var, Optional<KeyboardStateListener> optional) {
        C7975b0 a = C8024e0.m23336a(yVar, hVar, lVar, searchRepository, rVar, cVar, tVar, i0Var, optional);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
