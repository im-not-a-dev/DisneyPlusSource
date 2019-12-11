package com.bamtechmedia.dominguez.config;

import com.bamtechmedia.dominguez.collections.p080o0.C3435b;
import com.bamtechmedia.dominguez.dictionaries.C6072g;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Completable;

/* renamed from: com.bamtechmedia.dominguez.config.k0 */
/* compiled from: LoadConfigsActionImpl.kt */
public final class C3557k0 implements C3555j0 {

    /* renamed from: a */
    private final C3435b f8884a;

    /* renamed from: b */
    private final C6072g f8885b;

    public C3557k0(C3435b bVar, C6072g gVar) {
        this.f8884a = bVar;
        this.f8885b = gVar;
    }

    /* renamed from: a */
    public Completable mo12762a() {
        Completable b = Completable.m38164b(this.f8884a.initialize(), this.f8885b.mo18349a());
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "Completable.mergeArrayDe…\"dictionaries\")\n        )");
        return b;
    }
}
