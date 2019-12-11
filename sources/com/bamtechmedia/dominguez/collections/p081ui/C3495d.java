package com.bamtechmedia.dominguez.collections.p081ui;

import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.collections.ui.d */
/* compiled from: ShelfListItemScaleHelper_Factory */
public final class C3495d implements C11895c<C3493c> {

    /* renamed from: a */
    private final Provider<C3490a> f8771a;

    public C3495d(Provider<C3490a> provider) {
        this.f8771a = provider;
    }

    /* renamed from: a */
    public static C3495d m11868a(Provider<C3490a> provider) {
        return new C3495d(provider);
    }

    public C3493c get() {
        return new C3493c((C3490a) this.f8771a.get());
    }
}
