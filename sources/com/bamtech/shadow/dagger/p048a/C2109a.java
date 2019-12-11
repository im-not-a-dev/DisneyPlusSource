package com.bamtech.shadow.dagger.p048a;

import javax.inject.Provider;

/* renamed from: com.bamtech.shadow.dagger.a.a */
/* compiled from: DelegateFactory */
public final class C2109a<T> implements C2111c<T> {

    /* renamed from: a */
    private Provider<T> f6089a;

    /* renamed from: a */
    public void mo11034a(Provider<T> provider) {
        if (provider == null) {
            throw new IllegalArgumentException();
        } else if (this.f6089a == null) {
            this.f6089a = provider;
        } else {
            throw new IllegalStateException();
        }
    }

    public T get() {
        Provider<T> provider = this.f6089a;
        if (provider != null) {
            return provider.get();
        }
        throw new IllegalStateException();
    }
}
