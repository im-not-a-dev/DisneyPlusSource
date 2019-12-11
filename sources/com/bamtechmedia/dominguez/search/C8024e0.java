package com.bamtechmedia.dominguez.search;

import android.content.SharedPreferences;
import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.analytics.C2366i0;
import com.bamtechmedia.dominguez.core.content.collections.C3667h;
import com.bamtechmedia.dominguez.core.content.collections.C3678l;
import com.bamtechmedia.dominguez.core.content.sets.C3765c;
import com.bamtechmedia.dominguez.core.utils.C5856o0;
import com.bamtechmedia.dominguez.keyboard.KeyboardStateListener;
import com.google.common.base.Optional;
import javax.inject.Provider;

/* renamed from: com.bamtechmedia.dominguez.search.e0 */
/* compiled from: TvSearchFragmentModule */
abstract class C8024e0 {
    /* renamed from: a */
    static SharedPreferences m23333a() {
        return null;
    }

    /* renamed from: a */
    static C7975b0 m23336a(C8068y yVar, C3667h hVar, C3678l lVar, SearchRepository searchRepository, C8052r rVar, C3765c cVar, C8060t tVar, C2366i0 i0Var, Optional<KeyboardStateListener> optional) {
        C7964a aVar = new C7964a(hVar, lVar, searchRepository, rVar, cVar, tVar, i0Var, optional);
        C8068y yVar2 = yVar;
        return (C7975b0) C5856o0.m18893a((Fragment) yVar, C7975b0.class, (Provider<T>) aVar);
    }

    /* renamed from: b */
    static C7965a0 m23337b(C8068y yVar) {
        return new C7965a0(yVar);
    }

    /* renamed from: a */
    static /* synthetic */ C7975b0 m23335a(C3667h hVar, C3678l lVar, SearchRepository searchRepository, C8052r rVar, C3765c cVar, C8060t tVar, C2366i0 i0Var, Optional optional) {
        C7975b0 b0Var = new C7975b0(hVar, lVar, searchRepository, rVar, cVar, tVar, i0Var, optional);
        return b0Var;
    }

    /* renamed from: a */
    static SpeechRecognizerHelper m23334a(C8068y yVar) {
        return new SpeechRecognizerHelper(yVar);
    }
}
