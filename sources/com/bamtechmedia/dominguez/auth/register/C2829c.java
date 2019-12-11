package com.bamtechmedia.dominguez.auth.register;

import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.auth.p061o0.C2740b;
import com.bamtechmedia.dominguez.auth.p061o0.p062h.C2750c;
import com.bamtechmedia.dominguez.auth.p064p0.C2760a;
import com.bamtechmedia.dominguez.core.utils.C5856o0;
import com.google.common.base.Optional;
import javax.inject.Provider;
import p163g.p201e.p203b.p307o.p308p.C7626a;

/* renamed from: com.bamtechmedia.dominguez.auth.register.c */
/* compiled from: RegisterAccountBindingModule */
abstract class C2829c {
    /* renamed from: a */
    static C2842h m10513a(C2833f fVar, RegisterAccountAction registerAccountAction, C2740b bVar, String str, C2750c cVar, C7626a aVar, Optional<C2760a> optional, C2827b bVar2) {
        C2826a aVar2 = new C2826a(registerAccountAction, bVar, str, cVar, aVar, optional, bVar2);
        C2833f fVar2 = fVar;
        return (C2842h) C5856o0.m18893a((Fragment) fVar, C2842h.class, (Provider<T>) aVar2);
    }

    /* renamed from: a */
    static /* synthetic */ C2842h m10512a(RegisterAccountAction registerAccountAction, C2740b bVar, String str, C2750c cVar, C7626a aVar, Optional optional, C2827b bVar2) {
        C2842h hVar = new C2842h(registerAccountAction, bVar, str, cVar, aVar, (C2760a) optional.mo27107c(), bVar2);
        return hVar;
    }
}
