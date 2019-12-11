package com.bamtechmedia.dominguez.profiles;

import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.core.utils.C5856o0;
import com.bamtechmedia.dominguez.profiles.p268x1.C6913e;
import com.bamtechmedia.dominguez.profiles.p268x1.p270h.C6947a;
import com.bamtechmedia.dominguez.profiles.p268x1.p270h.C6952c;
import com.bamtechmedia.dominguez.profiles.p268x1.p270h.C6959d;
import com.bamtechmedia.dominguez.profiles.p268x1.p270h.C6961f;
import com.bamtechmedia.dominguez.profiles.p268x1.p270h.C6964h;
import javax.inject.Provider;

/* renamed from: com.bamtechmedia.dominguez.profiles.m */
/* compiled from: ChooseLanguageBindingModule */
abstract class C6723m {
    /* renamed from: a */
    static /* synthetic */ C6952c m20783a(C6947a aVar, C6671h0 h0Var, C6913e eVar) {
        C6952c cVar = new C6952c(aVar.mo19698o(), h0Var, aVar.getTargetRequestCode(), eVar, new Handler());
        return cVar;
    }

    /* renamed from: b */
    static C6952c m20785b(C6947a aVar, C6671h0 h0Var, C6913e eVar) {
        return (C6952c) C5856o0.m18893a((Fragment) aVar, C6952c.class, (Provider<T>) new C6605a<T>(aVar, h0Var, eVar));
    }

    /* renamed from: a */
    static C6959d m20784a(boolean z) {
        if (z) {
            return new C6964h();
        }
        return new C6961f();
    }
}
