package com.bamtechmedia.dominguez.auth.p070v0.p072h;

import com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b;
import com.bamtechmedia.dominguez.auth.p070v0.p071g.C3048b.C3049a;
import com.bamtechmedia.dominguez.legal.api.LegalApi;
import com.bamtechmedia.dominguez.legal.api.MarketingInput;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;

/* renamed from: com.bamtechmedia.dominguez.auth.v0.h.f */
/* compiled from: SignupEmailAction.kt */
public final class C3107f {

    /* renamed from: a */
    private final C3048b f8012a;

    /* renamed from: b */
    private final LegalApi f8013b;

    public C3107f(C3048b bVar, LegalApi legalApi) {
        this.f8012a = bVar;
        this.f8013b = legalApi;
    }

    /* renamed from: a */
    public final Observable<C3049a> mo12144a(String str, List<String> list, List<MarketingInput> list2) {
        Observable<C3049a> a = this.f8013b.createNrtAccount(str, list, list2).mo30055f().mo30043a((ObservableSource<T>) this.f8012a.mo12063a(str));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "legalApi.createNrtAccoun…EmailAction.login(input))");
        return a;
    }
}
