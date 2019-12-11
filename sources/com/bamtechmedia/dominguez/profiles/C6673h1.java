package com.bamtechmedia.dominguez.profiles;

import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001*\u00020\u0004\u001a3\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0001*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¨\u0006\r"}, mo31007d2 = {"kidsModeOnce", "Lio/reactivex/Single;", "", "kotlin.jvm.PlatformType", "Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;", "update", "Lcom/bamtechmedia/dominguez/profiles/Profile;", "profile", "updateBuilder", "Lkotlin/Function1;", "Lcom/bamtechmedia/dominguez/profiles/ProfileUpdateBuilder;", "", "Lkotlin/ExtensionFunctionType;", "profilesApi_release"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.h1 */
/* compiled from: ProfilesRepositoryExt.kt */
public final class C6673h1 {

    /* renamed from: com.bamtechmedia.dominguez.profiles.h1$a */
    /* compiled from: ProfilesRepositoryExt.kt */
    static final class C6674a<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C6674a f15025c = new C6674a();

        C6674a() {
        }

        /* renamed from: a */
        public final boolean mo19402a(C6626c0 c0Var) {
            return c0Var.mo19354R();
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo19402a((C6626c0) obj));
        }
    }

    /* renamed from: a */
    public static final Single<? extends C6626c0> m20691a(C6667g1 g1Var, C6626c0 c0Var, Function1<? super C6714j0, C13145v> function1) {
        C6714j0 j0Var = new C6714j0(c0Var);
        function1.invoke(j0Var);
        String d = j0Var.mo19438d();
        C6654e0 e0Var = new C6654e0(j0Var.mo19440f(), j0Var.mo19439e(), c0Var.isDefault(), j0Var.mo19434a(), j0Var.mo19436b(), false, j0Var.mo19437c(), 32, null);
        return g1Var.mo19379a(c0Var, d, e0Var);
    }

    /* renamed from: a */
    public static final Single<Boolean> m20690a(C6667g1 g1Var) {
        Single<Boolean> a = g1Var.mo19381b().mo30233g(C6674a.f15025c).mo30213a(Boolean.valueOf(false));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "activeProfileOnce().map ….onErrorReturnItem(false)");
        return a;
    }
}
