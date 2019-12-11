package com.bamtechmedia.dominguez.core.utils;

import androidx.fragment.app.C0532d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0703a0;
import androidx.lifecycle.C0741y;
import androidx.lifecycle.C0742z.C0744b;
import javax.inject.Provider;

/* renamed from: com.bamtechmedia.dominguez.core.utils.o0 */
/* compiled from: ViewModelUtils */
public final class C5856o0 {

    /* renamed from: com.bamtechmedia.dominguez.core.utils.o0$a */
    /* compiled from: ViewModelUtils */
    static class C5857a implements C0744b {

        /* renamed from: a */
        final /* synthetic */ Provider f13641a;

        C5857a(Provider provider) {
            this.f13641a = provider;
        }

        /* renamed from: a */
        public <T extends C0741y> T mo3293a(Class<T> cls) {
            return (C0741y) this.f13641a.get();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.utils.o0$b */
    /* compiled from: ViewModelUtils */
    static class C5858b implements C0744b {

        /* renamed from: a */
        final /* synthetic */ Provider f13642a;

        C5858b(Provider provider) {
            this.f13642a = provider;
        }

        /* renamed from: a */
        public <T extends C0741y> T mo3293a(Class<T> cls) {
            return (C0741y) this.f13642a.get();
        }
    }

    /* renamed from: a */
    public static <T extends C0741y> T m18893a(Fragment fragment, Class<T> cls, Provider<T> provider) {
        return C0703a0.m3717a(fragment, (C0744b) new C5857a(provider)).mo4180a(cls);
    }

    /* renamed from: a */
    public static <T extends C0741y> T m18894a(C0532d dVar, Class<T> cls, Provider<T> provider) {
        return C0703a0.m3719a(dVar, (C0744b) new C5858b(provider)).mo4180a(cls);
    }
}
